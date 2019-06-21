package com.facebook;

import com.tencent.matrix.trace.core.AppMethodBeat;

class AccessTokenManager$1
  implements Runnable
{
  AccessTokenManager$1(AccessTokenManager paramAccessTokenManager, AccessToken.AccessTokenRefreshCallback paramAccessTokenRefreshCallback)
  {
  }

  public void run()
  {
    AppMethodBeat.i(71550);
    AccessTokenManager.access$000(this.this$0, this.val$callback);
    AppMethodBeat.o(71550);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.facebook.AccessTokenManager.1
 * JD-Core Version:    0.6.2
 */