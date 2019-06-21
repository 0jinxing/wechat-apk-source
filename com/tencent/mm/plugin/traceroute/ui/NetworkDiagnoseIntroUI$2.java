package com.tencent.mm.plugin.traceroute.ui;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.traceroute.a.a;
import com.tencent.mm.pluginsdk.n;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

final class NetworkDiagnoseIntroUI$2
  implements View.OnClickListener
{
  NetworkDiagnoseIntroUI$2(NetworkDiagnoseIntroUI paramNetworkDiagnoseIntroUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(26012);
    paramView = new Intent();
    paramView.putExtra("title", this.sJf.getString(2131302023));
    paramView.putExtra("rawUrl", this.sJf.getString(2131304189));
    paramView.putExtra("showShare", false);
    a.gkE.i(paramView, this.sJf.mController.ylL);
    AppMethodBeat.o(26012);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.traceroute.ui.NetworkDiagnoseIntroUI.2
 * JD-Core Version:    0.6.2
 */