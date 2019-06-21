package com.google.android.gms.internal.auth;

import android.os.IInterface;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.api.Status;

public abstract interface zzba extends IInterface
{
  public abstract void zzd(Status paramStatus, Credential paramCredential);

  public abstract void zzd(Status paramStatus, String paramString);

  public abstract void zze(Status paramStatus);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.auth.zzba
 * JD-Core Version:    0.6.2
 */