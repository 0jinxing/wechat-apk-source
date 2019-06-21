package com.tencent.mm.plugin.webview.model;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class af$c$1
  implements DialogInterface.OnCancelListener
{
  af$c$1(af.d paramd, af.b paramb)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(6660);
    ab.i("MicroMsg.OauthAuthorizeLogic", "doOauthAuthorize user cancel");
    this.ume.blb();
    this.umf.remove(1254);
    AppMethodBeat.o(6660);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.model.af.c.1
 * JD-Core Version:    0.6.2
 */