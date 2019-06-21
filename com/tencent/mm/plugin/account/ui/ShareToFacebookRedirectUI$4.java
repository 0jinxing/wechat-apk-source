package com.tencent.mm.plugin.account.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.account.model.f;
import com.tencent.mm.protocal.protobuf.bwp;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.widget.a.c;
import com.tencent.mm.ui.widget.a.e.a;
import com.tencent.mm.ui.widget.a.e.c;

final class ShareToFacebookRedirectUI$4
  implements e.c
{
  ShareToFacebookRedirectUI$4(ShareToFacebookRedirectUI paramShareToFacebookRedirectUI, e.a parama)
  {
  }

  public final void d(boolean paramBoolean, String paramString)
  {
    AppMethodBeat.i(125574);
    this.gIh.aqX();
    this.gIi.gud.dismiss();
    if (paramBoolean)
    {
      bwp localbwp = new bwp();
      String str = paramString;
      if (bo.isNullOrNil(paramString))
        str = " ";
      localbwp.mZR = str;
      localbwp.Name = ShareToFacebookRedirectUI.b(this.gIh);
      localbwp.vEA = ShareToFacebookRedirectUI.c(this.gIh);
      localbwp.oRb = ShareToFacebookRedirectUI.d(this.gIh);
      localbwp.wXa = ShareToFacebookRedirectUI.e(this.gIh);
      paramString = new f(localbwp);
      g.Rg().a(paramString, 0);
      ShareToFacebookRedirectUI.a(this.gIh, h.b(this.gIh, "", false, new ShareToFacebookRedirectUI.4.1(this)));
      AppMethodBeat.o(125574);
    }
    while (true)
    {
      return;
      this.gIh.finish();
      AppMethodBeat.o(125574);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.ShareToFacebookRedirectUI.4
 * JD-Core Version:    0.6.2
 */