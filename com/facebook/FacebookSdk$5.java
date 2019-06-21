package com.facebook;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class FacebookSdk$5
  implements Runnable
{
  FacebookSdk$5(Context paramContext, String paramString)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(71604);
    FacebookSdk.publishInstallAndWaitForResponse(this.val$applicationContext, this.val$applicationId);
    AppMethodBeat.o(71604);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.facebook.FacebookSdk.5
 * JD-Core Version:    0.6.2
 */