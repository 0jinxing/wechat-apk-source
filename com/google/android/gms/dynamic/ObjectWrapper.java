package com.google.android.gms.dynamic;

import android.os.IBinder;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.reflect.Field;

public final class ObjectWrapper<T> extends IObjectWrapper.Stub
{
  private final T zzabn;

  private ObjectWrapper(T paramT)
  {
    this.zzabn = paramT;
  }

  public static <T> T unwrap(IObjectWrapper paramIObjectWrapper)
  {
    AppMethodBeat.i(90397);
    if ((paramIObjectWrapper instanceof ObjectWrapper))
    {
      paramIObjectWrapper = ((ObjectWrapper)paramIObjectWrapper).zzabn;
      AppMethodBeat.o(90397);
      return paramIObjectWrapper;
    }
    IBinder localIBinder = paramIObjectWrapper.asBinder();
    Field[] arrayOfField = localIBinder.getClass().getDeclaredFields();
    paramIObjectWrapper = null;
    int i = arrayOfField.length;
    int j = 0;
    int k = 0;
    if (j < i)
    {
      Field localField = arrayOfField[j];
      if (localField.isSynthetic())
        break label213;
      k++;
      paramIObjectWrapper = localField;
    }
    label172: label213: 
    while (true)
    {
      while (true)
      {
        j++;
        break;
        if (k != 1)
          break label172;
        if (!paramIObjectWrapper.isAccessible())
        {
          paramIObjectWrapper.setAccessible(true);
          try
          {
            paramIObjectWrapper = paramIObjectWrapper.get(localIBinder);
            AppMethodBeat.o(90397);
          }
          catch (NullPointerException paramIObjectWrapper)
          {
            paramIObjectWrapper = new IllegalArgumentException("Binder object is null.", paramIObjectWrapper);
            AppMethodBeat.o(90397);
            throw paramIObjectWrapper;
          }
          catch (IllegalAccessException paramIObjectWrapper)
          {
            paramIObjectWrapper = new IllegalArgumentException("Could not access the field in remoteBinder.", paramIObjectWrapper);
            AppMethodBeat.o(90397);
            throw paramIObjectWrapper;
          }
        }
      }
      paramIObjectWrapper = new IllegalArgumentException("IObjectWrapper declared field not private!");
      AppMethodBeat.o(90397);
      throw paramIObjectWrapper;
      j = arrayOfField.length;
      paramIObjectWrapper = new IllegalArgumentException(64 + "Unexpected number of IObjectWrapper declared fields: " + j);
      AppMethodBeat.o(90397);
      throw paramIObjectWrapper;
    }
  }

  public static <T> IObjectWrapper wrap(T paramT)
  {
    AppMethodBeat.i(90396);
    paramT = new ObjectWrapper(paramT);
    AppMethodBeat.o(90396);
    return paramT;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.dynamic.ObjectWrapper
 * JD-Core Version:    0.6.2
 */