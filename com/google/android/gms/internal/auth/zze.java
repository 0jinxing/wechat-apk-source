package com.google.android.gms.internal.auth;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class zze extends Binder
  implements IInterface
{
  private static zzg zzf = null;

  protected zze(String paramString)
  {
    AppMethodBeat.i(77117);
    attachInterface(this, paramString);
    AppMethodBeat.o(77117);
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
    AppMethodBeat.i(77118);
    boolean bool;
    if (paramInt1 > 16777215)
    {
      bool = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
      if (!bool)
        break label52;
      bool = true;
      AppMethodBeat.o(77118);
    }
    while (true)
    {
      return bool;
      paramParcel1.enforceInterface(getInterfaceDescriptor());
      bool = false;
      break;
      label52: bool = dispatchTransaction(paramInt1, paramParcel1, paramParcel2, paramInt2);
      AppMethodBeat.o(77118);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.auth.zze
 * JD-Core Version:    0.6.2
 */