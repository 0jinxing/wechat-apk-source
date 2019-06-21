package com.google.android.gms.internal.auth_api_phone;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;

public final class zzi extends GmsClient<zze>
{
  public zzi(Context paramContext, Looper paramLooper, ClientSettings paramClientSettings, GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    super(paramContext, paramLooper, 126, paramClientSettings, paramConnectionCallbacks, paramOnConnectionFailedListener);
  }

  public final int getMinApkVersion()
  {
    return 12451000;
  }

  public final String getServiceDescriptor()
  {
    return "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService";
  }

  public final String getStartServiceAction()
  {
    return "com.google.android.gms.auth.api.phone.service.SmsRetrieverApiService.START";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.auth_api_phone.zzi
 * JD-Core Version:    0.6.2
 */