package com.google.android.gms.internal.auth_api_phone;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.auth-api-phone.zzg;

public abstract class zzh extends zzb
  implements zzg
{
  public zzh()
  {
    super("com.google.android.gms.auth.api.phone.internal.ISmsRetrieverResultCallback");
  }

  protected final boolean dispatchTransaction(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    if (paramInt1 == 1)
      zza((Status)zzc.zza(paramParcel1, Status.CREATOR));
    for (boolean bool = true; ; bool = false)
      return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.auth_api_phone.zzh
 * JD-Core Version:    0.6.2
 */