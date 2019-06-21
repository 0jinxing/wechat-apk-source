package com.tencent.mm.plugin.traceroute.ui;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.k;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import java.io.File;

final class NetworkDiagnoseReportUI$4
  implements View.OnClickListener
{
  NetworkDiagnoseReportUI$4(NetworkDiagnoseReportUI paramNetworkDiagnoseReportUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(26019);
    if (!bo.isNullOrNil(NetworkDiagnoseReportUI.access$100()))
    {
      File localFile = new File(NetworkDiagnoseReportUI.access$100());
      if (localFile.exists())
      {
        paramView = new Intent("android.intent.action.VIEW");
        k.a(this.sJn.mController.ylL, paramView, localFile, "text/plain");
        paramView.addFlags(268435456);
        this.sJn.startActivity(paramView);
      }
    }
    AppMethodBeat.o(26019);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.traceroute.ui.NetworkDiagnoseReportUI.4
 * JD-Core Version:    0.6.2
 */