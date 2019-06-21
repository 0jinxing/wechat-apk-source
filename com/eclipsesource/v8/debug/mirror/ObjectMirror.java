package com.eclipsesource.v8.debug.mirror;

import com.eclipsesource.v8.V8Array;
import com.eclipsesource.v8.V8Object;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class ObjectMirror extends ValueMirror
{
  private static final String PROPERTIES = "properties";
  private static final String PROPERTY_NAMES = "propertyNames";

  ObjectMirror(V8Object paramV8Object)
  {
    super(paramV8Object);
  }

  public PropertiesArray getProperties(ObjectMirror.PropertyKind paramPropertyKind, int paramInt)
  {
    AppMethodBeat.i(74892);
    V8Array localV8Array1 = new V8Array(this.v8Object.getRuntime());
    localV8Array1.push(paramPropertyKind.index);
    localV8Array1.push(paramInt);
    paramPropertyKind = null;
    try
    {
      V8Array localV8Array2 = this.v8Object.executeArrayFunction("properties", localV8Array1);
      paramPropertyKind = localV8Array2;
      PropertiesArray localPropertiesArray = new PropertiesArray(localV8Array2);
      return localPropertiesArray;
    }
    finally
    {
      localV8Array1.release();
      if ((paramPropertyKind != null) && (!paramPropertyKind.isReleased()))
        paramPropertyKind.release();
      AppMethodBeat.o(74892);
    }
  }

  public String[] getPropertyNames(ObjectMirror.PropertyKind paramPropertyKind, int paramInt)
  {
    AppMethodBeat.i(74891);
    V8Array localV8Array1 = new V8Array(this.v8Object.getRuntime());
    localV8Array1.push(paramPropertyKind.index);
    localV8Array1.push(paramInt);
    paramPropertyKind = null;
    try
    {
      V8Array localV8Array2 = this.v8Object.executeArrayFunction("propertyNames", localV8Array1);
      paramPropertyKind = localV8Array2;
      String[] arrayOfString = new String[localV8Array2.length()];
      for (paramInt = 0; ; paramInt++)
      {
        paramPropertyKind = localV8Array2;
        if (paramInt >= arrayOfString.length)
          break;
        paramPropertyKind = localV8Array2;
        arrayOfString[paramInt] = localV8Array2.getString(paramInt);
      }
      return arrayOfString;
    }
    finally
    {
      localV8Array1.release();
      if (paramPropertyKind != null)
        paramPropertyKind.release();
      AppMethodBeat.o(74891);
    }
  }

  public boolean isObject()
  {
    return true;
  }

  public String toString()
  {
    AppMethodBeat.i(74890);
    String str = this.v8Object.toString();
    AppMethodBeat.o(74890);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.eclipsesource.v8.debug.mirror.ObjectMirror
 * JD-Core Version:    0.6.2
 */