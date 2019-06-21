package com.tencent.mm.ui;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.g.a.z;
import com.tencent.mm.platformtools.w;
import com.tencent.mm.protocal.GeneralControlWrapper;
import com.tencent.mm.protocal.JsapiPermissionWrapper;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.b;

final class u$7
  implements DialogInterface.OnClickListener
{
  u$7(Intent paramIntent, Activity paramActivity, com.tencent.mm.h.a parama)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(29601);
    if (this.ymY != null)
    {
      if (!(this.ghG instanceof LauncherUI))
        this.ghG.finish();
      if (bo.isNullOrNil(this.ghJ.url))
        break label203;
      paramDialogInterface = new Intent();
      StringBuilder localStringBuilder = new StringBuilder(this.ghJ.url);
      localStringBuilder.append("&wechat_real_lang=" + aa.dor());
      paramDialogInterface.putExtra("rawUrl", localStringBuilder.toString());
      paramDialogInterface.putExtra("showShare", false);
      paramDialogInterface.putExtra("show_bottom", false);
      paramDialogInterface.putExtra("needRedirect", false);
      paramDialogInterface.putExtra("neverGetA8Key", true);
      paramDialogInterface.putExtra("hardcode_jspermission", JsapiPermissionWrapper.vxI);
      paramDialogInterface.putExtra("hardcode_general_ctrl", GeneralControlWrapper.vxE);
      d.b(this.ghG, "webview", ".ui.tools.WebViewUI", paramDialogInterface);
    }
    while (true)
    {
      w.cn(this.ghG);
      paramDialogInterface = new z();
      paramDialogInterface.csU.csV = true;
      com.tencent.mm.sdk.b.a.xxA.m(paramDialogInterface);
      AppMethodBeat.o(29601);
      return;
      label203: this.ghG.startActivity(this.ymY);
      b.K(this.ghG, this.ymY);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.u.7
 * JD-Core Version:    0.6.2
 */