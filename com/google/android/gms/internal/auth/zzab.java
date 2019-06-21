package com.google.android.gms.internal.auth;

import android.os.Parcel;
import com.google.android.gms.auth.api.accounttransfer.DeviceMetaData;
import com.google.android.gms.auth.api.accounttransfer.zzo;
import com.google.android.gms.auth.api.accounttransfer.zzw;
import com.google.android.gms.common.api.Status;

public abstract class zzab extends zze
  implements zzaa
{
  public zzab()
  {
    super("com.google.android.gms.auth.api.accounttransfer.internal.IAccountTransferCallbacks");
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
      zze((Status)zzf.zzd(paramParcel1, Status.CREATOR));
    case 2:
    case 3:
    case 4:
    case 5:
    case 6:
    case 7:
    }
    while (true)
    {
      bool = true;
      break;
      zzd((Status)zzf.zzd(paramParcel1, Status.CREATOR), (zzw)zzf.zzd(paramParcel1, zzw.CREATOR));
      continue;
      zzd((Status)zzf.zzd(paramParcel1, Status.CREATOR), (zzo)zzf.zzd(paramParcel1, zzo.CREATOR));
      continue;
      zzi();
      continue;
      onFailure((Status)zzf.zzd(paramParcel1, Status.CREATOR));
      continue;
      zzd(paramParcel1.createByteArray());
      continue;
      zzd((DeviceMetaData)zzf.zzd(paramParcel1, DeviceMetaData.CREATOR));
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.auth.zzab
 * JD-Core Version:    0.6.2
 */