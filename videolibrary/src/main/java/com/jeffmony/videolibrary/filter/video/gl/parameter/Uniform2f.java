/*
 * Copyright 2019 LinkedIn Corporation
 * All Rights Reserved.
 *
 * Licensed under the BSD 2-Clause License (the "License").  See License in the project root for
 * license information.
 */
package com.jeffmony.videolibrary.filter.video.gl.parameter;

import android.opengl.GLES20;

import androidx.annotation.NonNull;

/**
 * @author : jeffli
 * @Email  : jeffmony@163.com
 * @Date   : 2021-08-26
 */

/**
 * Two float value shader parameter
 */
public class Uniform2f extends ShaderParameter {

    private float mValue1;
    private float mValue2;

    /**
     * Create shader parameter
     * @param name parameter name, as defined in shader code
     * @param value1 first parameter value
     * @param value2 second parameter value
     */
    public Uniform2f(@NonNull String name, float value1, float value2) {
        super(TYPE_UNIFORM, name);

        mValue1 = value1;
        mValue2 = value2;
    }

    @Override
    public void apply(int glProgram) {
        GLES20.glUniform2f(getLocation(glProgram), mValue1, mValue2);
    }
}
