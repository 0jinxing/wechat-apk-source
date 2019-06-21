package com.facebook.login;

import android.os.Bundle;
import com.facebook.FacebookException;
import com.facebook.internal.WebDialog.OnCompleteListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

class WebViewLoginMethodHandler$1
  implements WebDialog.OnCompleteListener
{
  WebViewLoginMethodHandler$1(WebViewLoginMethodHandler paramWebViewLoginMethodHandler, LoginClient.Request paramRequest)
  {
  }

  public void onComplete(Bundle paramBundle, FacebookException paramFacebookException)
  {
    AppMethodBeat.i(96930);
    this.this$0.onWebDialogComplete(this.val$request, paramBundle, paramFacebookException);
    AppMethodBeat.o(96930);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.facebook.login.WebViewLoginMethodHandler.1
 * JD-Core Version:    0.6.2
 */