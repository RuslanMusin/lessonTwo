package com.itis.android.lessontwo.repository.cache;

import android.support.annotation.NonNull;
import android.util.Log;

import java.util.List;

import io.reactivex.Single;
import io.reactivex.functions.Function;
import io.realm.Realm;
import io.realm.RealmObject;
import io.realm.RealmResults;

/**
 * Created by Nail Shaykhraziev on 05.03.2018.
 */
public class ErrorReadFromCache<T extends RealmObject> implements Function<Throwable, Single<List<T>>> {

    private final Class<T> mClass;

    public ErrorReadFromCache(@NonNull Class<T> tClass) {
        mClass = tClass;
    }

    @Override
    public Single<List<T>> apply(@io.reactivex.annotations.NonNull Throwable throwable) {
        Log.d("TAG","error cache");
        Realm realm = Realm.getDefaultInstance();
        RealmResults<T> results = realm.where(mClass).findAll();
        return Single.just(realm.copyFromRealm(results));
    }
}
