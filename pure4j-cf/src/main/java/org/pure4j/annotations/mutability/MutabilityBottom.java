package org.pure4j.annotations.mutability;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

import org.checkerframework.framework.qual.SubtypeOf;
import org.checkerframework.framework.qual.TypeQualifier;

@TypeQualifier
@Target({ElementType.TYPE, ElementType.TYPE_USE, ElementType.TYPE_PARAMETER})
@SubtypeOf({Mutable.class, MutableUnshared.class, UnknownMutability.class, ImmutableValue.class})
public @interface MutabilityBottom {

}
