package com.tencent.mm.plugin.webview.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ce.a;
import com.tencent.mm.model.gdpr.b;
import com.tencent.mm.sdk.platformtools.ab;

public final class af$c$3
  implements b
{
  public af$c$3(af.d paramd, String paramString1, long paramLong, int paramInt, String paramString2)
  {
  }

  public final void kL(int paramInt)
  {
    AppMethodBeat.i(6663);
    ab.i("MicroMsg.OauthAuthorizeLogic", " MPGdprPolicyUtil.checkPolicy onPermissionReturn:%d", new Object[] { Integer.valueOf(paramInt) });
    a.q(new af.c.3.1(this, paramInt));
    AppMethodBeat.o(6663);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.model.af.c.3
 * JD-Core Version:    0.6.2
 */