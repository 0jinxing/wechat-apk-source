package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import com.google.android.gms.internal.auth.zze;

public abstract class zzs extends zze
  implements zzr
{
  public zzs()
  {
    super("com.google.android.gms.auth.api.signin.internal.IRevocationService");
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
      zzq();
    case 2:
    }
    while (true)
    {
      bool = true;
      break;
      zzr();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.google.android.gms.auth.api.signin.internal.zzs
 * JD-Core Version:    0.6.2
 */