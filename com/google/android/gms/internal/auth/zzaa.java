package com.google.android.gms.internal.auth;

import android.os.IInterface;
import com.google.android.gms.auth.api.accounttransfer.DeviceMetaData;
import com.google.android.gms.auth.api.accounttransfer.zzo;
import com.google.android.gms.auth.api.accounttransfer.zzw;
import com.google.android.gms.common.api.Status;

public abstract interface zzaa extends IInterface
{
  public abstract void onFailure(Status paramStatus);

  public abstract void zzd(DeviceMetaData paramDeviceMetaData);

  public abstract void zzd(Status paramStatus, zzo paramzzo);

  public abstract void zzd(Status paramStatus, zzw paramzzw);

  public abstract void zzd(byte[] paramArrayOfByte);

  public abstract void zze(Status paramStatus);

  public abstract void zzi();
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.auth.zzaa
 * JD-Core Version:    0.6.2
 */