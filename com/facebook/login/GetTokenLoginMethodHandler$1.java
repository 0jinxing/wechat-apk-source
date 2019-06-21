package com.facebook.login;

import android.os.Bundle;
import com.facebook.internal.PlatformServiceClient.CompletedListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

class GetTokenLoginMethodHandler$1
  implements PlatformServiceClient.CompletedListener
{
  GetTokenLoginMethodHandler$1(GetTokenLoginMethodHandler paramGetTokenLoginMethodHandler, LoginClient.Request paramRequest)
  {
  }

  public void completed(Bundle paramBundle)
  {
    AppMethodBeat.i(96767);
    this.this$0.getTokenCompleted(this.val$request, paramBundle);
    AppMethodBeat.o(96767);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.facebook.login.GetTokenLoginMethodHandler.1
 * JD-Core Version:    0.6.2
 */