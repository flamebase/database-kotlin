package com.flamebase.database.interfaces;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

/**
 * Created by efraespada on 29/06/2017.
 */

public interface Blower<T> {

    void onCreate();

    @Nullable
    T onUpdate();

    void onChanged(@NonNull T ref);

    void progress(int value);

}