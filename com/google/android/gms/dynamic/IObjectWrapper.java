package com.google.android.gms.dynamic;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.stable.zza;
import com.google.android.gms.internal.stable.zzb;
import com.tencent.matrix.trace.core.AppMethodBeat;

public abstract interface IObjectWrapper extends IInterface
{
  public static class Stub extends zzb
    implements IObjectWrapper
  {
    public Stub()
    {
      super();
    }

    public static IObjectWrapper asInterface(IBinder paramIBinder)
    {
      AppMethodBeat.i(90395);
      if (paramIBinder == null)
      {
        paramIBinder = null;
        AppMethodBeat.o(90395);
      }
      while (true)
      {
        return paramIBinder;
        IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
        if ((localIInterface instanceof IObjectWrapper))
        {
          paramIBinder = (IObjectWrapper)localIInterface;
          AppMethodBeat.o(90395);
        }
        else
        {
          paramIBinder = new Proxy(paramIBinder);
          AppMethodBeat.o(90395);
        }
      }
    }

    public static class Proxy extends zza
      implements IObjectWrapper
    {
      Proxy(IBinder paramIBinder)
      {
        super("com.google.android.gms.dynamic.IObjectWrapper");
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.dynamic.IObjectWrapper
 * JD-Core Version:    0.6.2
 */