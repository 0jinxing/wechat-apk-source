package com.tencent.mm.plugin.webview.ui.tools;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pointers.PBool;
import com.tencent.xweb.h;

final class WebViewUI$g$2
  implements DialogInterface.OnClickListener
{
  WebViewUI$g$2(WebViewUI.g paramg, PBool paramPBool, h paramh)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(7902);
    this.uxG.value = true;
    this.uxH.confirm();
    AppMethodBeat.o(7902);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.WebViewUI.g.2
 * JD-Core Version:    0.6.2
 */