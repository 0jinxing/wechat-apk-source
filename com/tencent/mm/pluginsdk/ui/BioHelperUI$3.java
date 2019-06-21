package com.tencent.mm.pluginsdk.ui;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.protocal.GeneralControlWrapper;
import com.tencent.mm.protocal.JsapiPermissionWrapper;

final class BioHelperUI$3
  implements View.OnClickListener
{
  BioHelperUI$3(BioHelperUI paramBioHelperUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(125669);
    paramView = new Intent();
    paramView.putExtra("rawUrl", BioHelperUI.b(this.vgV));
    paramView.putExtra("showShare", false);
    paramView.putExtra("show_bottom", false);
    paramView.putExtra("needRedirect", false);
    paramView.putExtra("neverGetA8Key", true);
    paramView.putExtra("hardcode_jspermission", JsapiPermissionWrapper.vxI);
    paramView.putExtra("hardcode_general_ctrl", GeneralControlWrapper.vxE);
    d.b(this.vgV, "webview", ".ui.tools.WebViewUI", paramView);
    this.vgV.finish();
    AppMethodBeat.o(125669);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.BioHelperUI.3
 * JD-Core Version:    0.6.2
 */