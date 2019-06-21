package com.tencent.mm.plugin.traceroute.ui;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.k;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import java.io.File;

final class NetworkDiagnoseReportUI$3
  implements View.OnClickListener
{
  NetworkDiagnoseReportUI$3(NetworkDiagnoseReportUI paramNetworkDiagnoseReportUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(26018);
    paramView = new Intent("android.intent.action.SEND");
    paramView.addFlags(268435456);
    paramView.putExtra("android.intent.extra.EMAIL", new String[] { "WeChat_Log@qq.com" });
    paramView.putExtra("android.intent.extra.SUBJECT", NetworkDiagnoseReportUI.a(this.sJn));
    paramView.putExtra("android.intent.extra.STREAM", k.d(this.sJn.mController.ylL, new File(NetworkDiagnoseReportUI.access$100())));
    paramView.setType("text/plain");
    this.sJn.startActivity(paramView);
    AppMethodBeat.o(26018);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.traceroute.ui.NetworkDiagnoseReportUI.3
 * JD-Core Version:    0.6.2
 */