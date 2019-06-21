package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.auth.zze;
import com.google.android.gms.internal.auth.zzf;

public abstract class zzu extends zze
  implements zzt
{
  public zzu()
  {
    super("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks");
  }

  public final boolean dispatchTransaction(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    boolean bool;
    switch (paramInt1)
    {
    default:
      bool = false;
      return bool;
    case 101:
      zzd((GoogleSignInAccount)zzf.zzd(paramParcel1, GoogleSignInAccount.CREATOR), (Status)zzf.zzd(paramParcel1, Status.CREATOR));
    case 102:
    case 103:
    }
    while (true)
    {
      paramParcel2.writeNoException();
      bool = true;
      break;
      zzg((Status)zzf.zzd(paramParcel1, Status.CREATOR));
      continue;
      zzh((Status)zzf.zzd(paramParcel1, Status.CREATOR));
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.auth.api.signin.internal.zzu
 * JD-Core Version:    0.6.2
 */