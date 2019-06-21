package com.google.android.gms.internal.auth;

import android.os.Parcel;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.api.Status;

public abstract class zzbb extends zze
  implements zzba
{
  public zzbb()
  {
    super("com.google.android.gms.auth.api.credentials.internal.ICredentialsCallbacks");
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
      zzd((Status)zzf.zzd(paramParcel1, Status.CREATOR), (Credential)zzf.zzd(paramParcel1, Credential.CREATOR));
    case 2:
    case 3:
    }
    while (true)
    {
      paramParcel2.writeNoException();
      bool = true;
      break;
      zze((Status)zzf.zzd(paramParcel1, Status.CREATOR));
      continue;
      zzd((Status)zzf.zzd(paramParcel1, Status.CREATOR), paramParcel1.readString());
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.auth.zzbb
 * JD-Core Version:    0.6.2
 */