package com.tencent.mm.plugin.traceroute.ui;

import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.MMProgressBar.a;

final class NetworkDiagnoseUI$3
  implements MMProgressBar.a
{
  NetworkDiagnoseUI$3(NetworkDiagnoseUI paramNetworkDiagnoseUI)
  {
  }

  public final void FO(int paramInt)
  {
    AppMethodBeat.i(26025);
    if (paramInt < 5)
    {
      NetworkDiagnoseUI.f(this.sJt).setText(this.sJt.getString(2131298436));
      AppMethodBeat.o(26025);
    }
    while (true)
    {
      return;
      if ((paramInt >= 5) && (paramInt < 95))
      {
        NetworkDiagnoseUI.f(this.sJt).setText(this.sJt.getString(2131300416));
        AppMethodBeat.o(26025);
      }
      else
      {
        NetworkDiagnoseUI.f(this.sJt).setText(this.sJt.getString(2131304183));
        AppMethodBeat.o(26025);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.traceroute.ui.NetworkDiagnoseUI.3
 * JD-Core Version:    0.6.2
 */