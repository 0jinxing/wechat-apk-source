package com.tencent.mm.plugin.webwx.ui;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;

final class WebWeiXinIntroductionUI$1
  implements View.OnClickListener
{
  WebWeiXinIntroductionUI$1(WebWeiXinIntroductionUI paramWebWeiXinIntroductionUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(26571);
    paramView = new Intent();
    paramView.putExtra("BaseScanUI_select_scan_mode", 1);
    paramView.putExtra("BaseScanUI_only_scan_qrcode_with_zbar", true);
    paramView.putExtra("GetFriendQRCodeUI.INTENT_FROM_ACTIVITY", 2);
    paramView.putExtra("from_album", false);
    paramView.putExtra("show_intro", false);
    paramView.setFlags(65536);
    d.b(this.uLL, "scanner", ".ui.BaseScanUI", paramView);
    AppMethodBeat.o(26571);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webwx.ui.WebWeiXinIntroductionUI.1
 * JD-Core Version:    0.6.2
 */