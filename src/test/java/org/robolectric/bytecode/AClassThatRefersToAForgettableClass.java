package org.robolectric.bytecode;

import org.robolectric.internal.Instrument;

@SuppressWarnings("UnusedDeclaration")
@Instrument
public class AClassThatRefersToAForgettableClass {
    public AClassToForget someField;
    public AClassToForget[] someFields;

    public String interactWithForgettableClass() {
        AClassToForget aClassToForget = new AClassToForget();
        return aClassToForget.forgettableMethod() + ", " + aClassToForget.memorableMethod();
    }

    public String interactWithForgettableStaticMethod() {
        return AClassToForget.memorableStaticMethod() + " forget this: " + AClassToForget.forgettableStaticMethod();
    }

}
