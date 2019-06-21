package com.tencent.mm.plugin.appbrand.launching;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.fakenative.OpenBusinessViewUtil;
import com.tencent.mm.sdk.platformtools.ab;

final class an$1
  implements DialogInterface.OnCancelListener
{
  an$1(an paraman, String paramString)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(132000);
    ab.w("MicroMsg.WeAppLauncher", "openBusinessViewByWebView, user canceled");
    an.a(this.iiS);
    OpenBusinessViewUtil.p(this.iiR, null, -3);
    AppMethodBeat.o(132000);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.launching.an.1
 * JD-Core Version:    0.6.2
 */