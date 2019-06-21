package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import android.os.TransactionTooLargeException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.util.PlatformVersion;

public abstract class zzb
{
  private final int type;

  public zzb(int paramInt)
  {
    this.type = paramInt;
  }

  private static Status zza(RemoteException paramRemoteException)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    if ((PlatformVersion.isAtLeastIceCreamSandwichMR1()) && ((paramRemoteException instanceof TransactionTooLargeException)))
      localStringBuilder.append("TransactionTooLargeException: ");
    localStringBuilder.append(paramRemoteException.getLocalizedMessage());
    return new Status(8, localStringBuilder.toString());
  }

  public abstract void zza(Status paramStatus);

  public abstract void zza(GoogleApiManager.zza<?> paramzza);

  public abstract void zza(zzaa paramzzaa, boolean paramBoolean);

  public abstract void zza(RuntimeException paramRuntimeException);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.api.internal.zzb
 * JD-Core Version:    0.6.2
 */