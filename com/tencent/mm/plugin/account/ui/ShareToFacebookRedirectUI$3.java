package com.tencent.mm.plugin.account.ui;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.account.model.i;
import com.tencent.mm.sdk.platformtools.ab;

final class ShareToFacebookRedirectUI$3 extends i
{
  ShareToFacebookRedirectUI$3(ShareToFacebookRedirectUI paramShareToFacebookRedirectUI)
  {
  }

  public final void onError(int paramInt, String paramString)
  {
    AppMethodBeat.i(125572);
    ab.e(ShareToFacebookRedirectUI.access$000(), "refresh token error. errType:%d, errMsg:%s", new Object[] { Integer.valueOf(paramInt), paramString });
    super.onError(paramInt, paramString);
    if (paramInt == 3)
      ShareToFacebookRedirectUI.a(this.gIh);
    AppMethodBeat.o(125572);
  }

  public final void p(Bundle paramBundle)
  {
    AppMethodBeat.i(125571);
    super.p(paramBundle);
    AppMethodBeat.o(125571);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.ShareToFacebookRedirectUI.3
 * JD-Core Version:    0.6.2
 */