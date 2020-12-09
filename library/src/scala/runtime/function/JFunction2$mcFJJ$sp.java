
/*
 * Copyright (C) 2012-2014 Typesafe Inc. <http://www.typesafe.com>
 */

package scala.runtime.function;

@FunctionalInterface
public interface JFunction2$mcFJJ$sp extends JFunction2<Object, Object, Object> {
    abstract float apply$mcFJJ$sp(long v1, long v2);

    default Object apply(Object v1, Object v2) { return (Float) apply$mcFJJ$sp(scala.runtime.BoxesRunTime.unboxToLong(v1), scala.runtime.BoxesRunTime.unboxToLong(v2)); }
}