package com.tencent.mm.plugin.webview.model;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ce.a;
import com.tencent.mm.model.gdpr.b;
import com.tencent.mm.sdk.platformtools.ab;

final class af$c$4$1
  implements b
{
  af$c$4$1(af.c.4 param4, Bundle paramBundle)
  {
  }

  public final void kL(int paramInt)
  {
    AppMethodBeat.i(6665);
    ab.i("MicroMsg.OauthAuthorizeLogic", " MPGdprPolicyUtil.checkPolicy onPermissionReturn:%d", new Object[] { Integer.valueOf(paramInt) });
    a.q(new af.c.4.1.1(this, paramInt));
    AppMethodBeat.o(6665);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.model.af.c.4.1
 * JD-Core Version:    0.6.2
 */