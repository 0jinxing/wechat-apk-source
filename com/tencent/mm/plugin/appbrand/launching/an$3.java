package com.tencent.mm.plugin.appbrand.launching;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.fakenative.OpenBusinessViewUtil;
import com.tencent.mm.sdk.platformtools.ab;

final class an$3
  implements DialogInterface.OnCancelListener
{
  an$3(an paraman, String paramString1, String paramString2)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(132003);
    ab.w("MicroMsg.WeAppLauncher", "openBusinessViewByOpenSdk, user canceled");
    an.a(this.iiS);
    OpenBusinessViewUtil.o(this.iiU, this.iiR, -2);
    AppMethodBeat.o(132003);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.launching.an.3
 * JD-Core Version:    0.6.2
 */