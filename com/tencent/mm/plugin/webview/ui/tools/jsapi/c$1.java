package com.tencent.mm.plugin.webview.ui.tools.jsapi;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.model.q;
import com.tencent.mm.protocal.protobuf.avf;
import com.tencent.mm.sdk.platformtools.ab;

final class c$1
  implements DialogInterface.OnClickListener
{
  c$1(c paramc, q paramq, int paramInt, avf paramavf)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(8852);
    ab.i("MicroMsg.webview.JSVerifyHelper", "showDlgForJSVerify click ok");
    this.uFf.a(this.uFd, this.crd, this.uFe);
    AppMethodBeat.o(8852);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.jsapi.c.1
 * JD-Core Version:    0.6.2
 */