package com.tencent.mm.ui;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.model.aw;
import com.tencent.mm.platformtools.w;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.protocal.GeneralControlWrapper;
import com.tencent.mm.protocal.JsapiPermissionWrapper;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.b;

final class u$1
  implements DialogInterface.OnClickListener
{
  u$1(String paramString, Activity paramActivity, Intent paramIntent)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(29594);
    h.pYm.a(322L, 23L, 1L, true);
    h.pYm.e(11098, new Object[] { Integer.valueOf(4023), String.format("%b|%s", new Object[] { Boolean.valueOf(bo.isNullOrNil(this.val$url)), this.val$url }) });
    aw.hold();
    if (bo.isNullOrNil(this.val$url))
    {
      this.val$activity.startActivity(this.ymY);
      b.K(this.val$activity, this.ymY);
    }
    while (true)
    {
      w.cn(this.val$activity);
      AppMethodBeat.o(29594);
      return;
      paramDialogInterface = new Intent();
      paramDialogInterface.putExtra("rawUrl", this.val$url);
      paramDialogInterface.putExtra("showShare", false);
      paramDialogInterface.putExtra("show_bottom", false);
      paramDialogInterface.putExtra("needRedirect", false);
      paramDialogInterface.putExtra("neverGetA8Key", true);
      paramDialogInterface.putExtra("hardcode_jspermission", JsapiPermissionWrapper.vxI);
      paramDialogInterface.putExtra("hardcode_general_ctrl", GeneralControlWrapper.vxE);
      d.b(this.val$activity, "webview", ".ui.tools.WebViewUI", paramDialogInterface);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.u.1
 * JD-Core Version:    0.6.2
 */