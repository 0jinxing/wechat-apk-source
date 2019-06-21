package com.google.android.gms.internal.auth;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.auth.api.zzf;
import com.google.android.gms.auth.api.zzh;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Set;

public final class zzbh extends GmsClient<zzbk>
{
  private final Bundle zzcf;

  public zzbh(Context paramContext, Looper paramLooper, ClientSettings paramClientSettings, zzh paramzzh, GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    super(paramContext, paramLooper, 16, paramClientSettings, paramConnectionCallbacks, paramOnConnectionFailedListener);
    AppMethodBeat.i(77103);
    if (paramzzh == null)
    {
      this.zzcf = new Bundle();
      AppMethodBeat.o(77103);
      return;
    }
    paramContext = new NoSuchMethodError();
    AppMethodBeat.o(77103);
    throw paramContext;
  }

  public final Bundle getGetServiceRequestExtraArgs()
  {
    return this.zzcf;
  }

  public final int getMinApkVersion()
  {
    return 12451000;
  }

  public final String getServiceDescriptor()
  {
    return "com.google.android.gms.auth.api.internal.IAuthService";
  }

  public final String getStartServiceAction()
  {
    return "com.google.android.gms.auth.service.START";
  }

  public final boolean requiresSignIn()
  {
    AppMethodBeat.i(77104);
    ClientSettings localClientSettings = getClientSettings();
    boolean bool;
    if ((!TextUtils.isEmpty(localClientSettings.getAccountName())) && (!localClientSettings.getApplicableScopes(zzf.API).isEmpty()))
    {
      bool = true;
      AppMethodBeat.o(77104);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(77104);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.auth.zzbh
 * JD-Core Version:    0.6.2
 */