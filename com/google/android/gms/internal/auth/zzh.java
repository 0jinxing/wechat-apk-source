package com.google.android.gms.internal.auth;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IInterface;
import com.google.android.gms.auth.AccountChangeEventsRequest;
import com.google.android.gms.auth.AccountChangeEventsResponse;

public abstract interface zzh extends IInterface
{
  public abstract Bundle zzd(Account paramAccount);

  public abstract Bundle zzd(Account paramAccount, String paramString, Bundle paramBundle);

  public abstract Bundle zzd(String paramString);

  public abstract Bundle zzd(String paramString, Bundle paramBundle);

  public abstract AccountChangeEventsResponse zzd(AccountChangeEventsRequest paramAccountChangeEventsRequest);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.auth.zzh
 * JD-Core Version:    0.6.2
 */