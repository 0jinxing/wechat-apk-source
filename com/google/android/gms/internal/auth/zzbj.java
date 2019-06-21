package com.google.android.gms.internal.auth;

import android.os.Parcel;
import com.google.android.gms.auth.api.proxy.ProxyResponse;

public abstract class zzbj extends zze
  implements zzbi
{
  public zzbj()
  {
    super("com.google.android.gms.auth.api.internal.IAuthCallbacks");
  }

  protected final boolean dispatchTransaction(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    boolean bool;
    switch (paramInt1)
    {
    default:
      bool = false;
      return bool;
    case 1:
      zzd((ProxyResponse)zzf.zzd(paramParcel1, ProxyResponse.CREATOR));
    case 2:
    }
    while (true)
    {
      paramParcel2.writeNoException();
      bool = true;
      break;
      zzf(paramParcel1.readString());
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.auth.zzbj
 * JD-Core Version:    0.6.2
 */