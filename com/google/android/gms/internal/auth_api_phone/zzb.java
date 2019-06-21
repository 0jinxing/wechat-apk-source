package com.google.android.gms.internal.auth_api_phone;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.auth-api-phone.zzd;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class zzb extends Binder
  implements IInterface
{
  private static zzd zzc = null;

  protected zzb(String paramString)
  {
    AppMethodBeat.i(80426);
    attachInterface(this, paramString);
    AppMethodBeat.o(80426);
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
    AppMethodBeat.i(80427);
    boolean bool;
    if (paramInt1 > 16777215)
    {
      bool = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
      if (!bool)
        break label52;
      bool = true;
      AppMethodBeat.o(80427);
    }
    while (true)
    {
      return bool;
      paramParcel1.enforceInterface(getInterfaceDescriptor());
      bool = false;
      break;
      label52: bool = dispatchTransaction(paramInt1, paramParcel1, paramParcel2, paramInt2);
      AppMethodBeat.o(80427);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.auth_api_phone.zzb
 * JD-Core Version:    0.6.2
 */