package com.tencent.mm.ui.f.a;

import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.login.LoginResult;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class d$1
  implements FacebookCallback<LoginResult>
{
  d$1(d paramd)
  {
  }

  public final void onCancel()
  {
    AppMethodBeat.i(80310);
    ab.i("MicroMsg.FacebookAndroid", "facebook auth cancel!");
    if (this.zxN.zxL != null)
      this.zxN.zxL.onCancel();
    AppMethodBeat.o(80310);
  }

  public final void onError(FacebookException paramFacebookException)
  {
    AppMethodBeat.i(80311);
    ab.e("MicroMsg.FacebookAndroid", "facebook auth error! %s", new Object[] { paramFacebookException.getMessage() });
    if (this.zxN.zxL != null)
      this.zxN.zxL.onError(paramFacebookException.getMessage());
    AppMethodBeat.o(80311);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.f.a.d.1
 * JD-Core Version:    0.6.2
 */