package com.google.android.gms.auth.account;

import android.accounts.Account;
import android.os.Parcel;
import com.google.android.gms.internal.auth.zzf;

public abstract class zze extends com.google.android.gms.internal.auth.zze
  implements zzd
{
  public zze()
  {
    super("com.google.android.gms.auth.account.IWorkAccountCallback");
  }

  public final boolean dispatchTransaction(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    boolean bool;
    switch (paramInt1)
    {
    default:
      bool = false;
      return bool;
    case 1:
      zzf((Account)zzf.zzd(paramParcel1, Account.CREATOR));
    case 2:
    }
    while (true)
    {
      bool = true;
      break;
      zzd(zzf.zzd(paramParcel1));
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.auth.account.zze
 * JD-Core Version:    0.6.2
 */