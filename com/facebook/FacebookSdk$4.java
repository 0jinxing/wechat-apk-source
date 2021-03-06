package com.facebook;

import android.content.Context;
import com.facebook.appevents.AppEventsLogger;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.concurrent.Callable;

final class FacebookSdk$4
  implements Callable<Void>
{
  FacebookSdk$4(FacebookSdk.InitializeCallback paramInitializeCallback, Context paramContext)
  {
  }

  public final Void call()
  {
    AppMethodBeat.i(71602);
    AccessTokenManager.getInstance().loadCurrentAccessToken();
    ProfileManager.getInstance().loadCurrentProfile();
    if ((AccessToken.isCurrentAccessTokenActive()) && (Profile.getCurrentProfile() == null))
      Profile.fetchProfileForCurrentAccessToken();
    if (this.val$callback != null)
      this.val$callback.onInitialized();
    AppEventsLogger.initializeLib(FacebookSdk.access$000(), FacebookSdk.access$100());
    AppEventsLogger.newLogger(this.val$applicationContext.getApplicationContext()).flush();
    AppMethodBeat.o(71602);
    return null;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.facebook.FacebookSdk.4
 * JD-Core Version:    0.6.2
 */