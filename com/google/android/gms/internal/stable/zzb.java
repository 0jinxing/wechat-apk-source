package com.google.android.gms.internal.stable;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class zzb extends Binder
  implements IInterface
{
  private static zzd zzc = null;

  protected zzb(String paramString)
  {
    AppMethodBeat.i(90461);
    attachInterface(this, paramString);
    AppMethodBeat.o(90461);
  }

  public IBinder asBinder()
  {
    return this;
  }

  protected boolean dispatchTransaction(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    return false;
  }

  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    AppMethodBeat.i(90463);
    boolean bool;
    if (routeToSuperOrEnforceInterface(paramInt1, paramParcel1, paramParcel2, paramInt2))
    {
      bool = true;
      AppMethodBeat.o(90463);
    }
    while (true)
    {
      return bool;
      bool = dispatchTransaction(paramInt1, paramParcel1, paramParcel2, paramInt2);
      AppMethodBeat.o(90463);
    }
  }

  protected boolean routeToSuperOrEnforceInterface(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    AppMethodBeat.i(90462);
    boolean bool;
    if (paramInt1 > 16777215)
    {
      bool = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
      AppMethodBeat.o(90462);
    }
    while (true)
    {
      return bool;
      paramParcel1.enforceInterface(getInterfaceDescriptor());
      bool = false;
      AppMethodBeat.o(90462);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.stable.zzb
 * JD-Core Version:    0.6.2
 */