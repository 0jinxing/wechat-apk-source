package com.tencent.mm.plugin.fingerprint.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.b;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.fingerprint.c.a;
import com.tencent.mm.sdk.platformtools.ab;

final class SoterPayTestUI$1
  implements View.OnClickListener
{
  SoterPayTestUI$1(SoterPayTestUI paramSoterPayTestUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(41662);
    ab.i("MicroMsg.SoterPayTestUI", "hy: start get challenge");
    g.RQ();
    g.RO().eJo.a(1586, this.msN);
    g.RQ();
    g.RO().eJo.a(new a(0), 0);
    AppMethodBeat.o(41662);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fingerprint.ui.SoterPayTestUI.1
 * JD-Core Version:    0.6.2
 */