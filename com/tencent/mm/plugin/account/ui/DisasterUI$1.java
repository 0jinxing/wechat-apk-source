package com.tencent.mm.plugin.account.ui;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;

final class DisasterUI$1
  implements View.OnClickListener
{
  DisasterUI$1(DisasterUI paramDisasterUI, String paramString)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(124754);
    ab.i("MicroMsg.DisasterUI", "summerdiz jump link");
    h.pYm.e(13939, new Object[] { Integer.valueOf(1) });
    paramView = new Intent("android.intent.action.VIEW");
    paramView.setData(Uri.parse(this.val$url));
    this.gAE.startActivity(paramView);
    AppMethodBeat.o(124754);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.DisasterUI.1
 * JD-Core Version:    0.6.2
 */