package com.tencent.mm.plugin.webview.ui.tools.jsapi;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.modelsimple.v;

final class ShareToQQWeiboUI$2$1
  implements DialogInterface.OnCancelListener
{
  ShareToQQWeiboUI$2$1(ShareToQQWeiboUI.2 param2, v paramv)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(9841);
    g.Rg().c(this.qkC);
    AppMethodBeat.o(9841);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.jsapi.ShareToQQWeiboUI.2.1
 * JD-Core Version:    0.6.2
 */