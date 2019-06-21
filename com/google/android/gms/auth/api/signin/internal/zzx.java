package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.os.Binder;
import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInApi;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.api.Api.ApiOptions.HasOptions;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.GoogleApiClient.Builder;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class zzx extends zzs
{
  private final Context mContext;

  public zzx(Context paramContext)
  {
    this.mContext = paramContext;
  }

  private final void zzs()
  {
    AppMethodBeat.i(50461);
    if (!GooglePlayServicesUtil.isGooglePlayServicesUid(this.mContext, Binder.getCallingUid()))
    {
      int i = Binder.getCallingUid();
      SecurityException localSecurityException = new SecurityException(52 + "Calling UID " + i + " is not Google Play services.");
      AppMethodBeat.o(50461);
      throw localSecurityException;
    }
    AppMethodBeat.o(50461);
  }

  public final void zzq()
  {
    AppMethodBeat.i(50459);
    zzs();
    Storage localStorage = Storage.getInstance(this.mContext);
    GoogleSignInAccount localGoogleSignInAccount = localStorage.getSavedDefaultGoogleSignInAccount();
    Object localObject2 = GoogleSignInOptions.DEFAULT_SIGN_IN;
    if (localGoogleSignInAccount != null)
      localObject2 = localStorage.getSavedDefaultGoogleSignInOptions();
    localObject2 = new GoogleApiClient.Builder(this.mContext).addApi(Auth.GOOGLE_SIGN_IN_API, (Api.ApiOptions.HasOptions)localObject2).build();
    try
    {
      if (((GoogleApiClient)localObject2).blockingConnect().isSuccess())
      {
        if (localGoogleSignInAccount == null)
          break label91;
        Auth.GoogleSignInApi.revokeAccess((GoogleApiClient)localObject2);
      }
      while (true)
      {
        return;
        label91: ((GoogleApiClient)localObject2).clearDefaultAccountAndReconnect();
      }
    }
    finally
    {
      ((GoogleApiClient)localObject2).disconnect();
      AppMethodBeat.o(50459);
    }
  }

  public final void zzr()
  {
    AppMethodBeat.i(50460);
    zzs();
    zzq.zze(this.mContext).clear();
    AppMethodBeat.o(50460);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.auth.api.signin.internal.zzx
 * JD-Core Version:    0.6.2
 */