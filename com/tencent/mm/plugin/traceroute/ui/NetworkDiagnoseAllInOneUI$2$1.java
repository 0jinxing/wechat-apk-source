package com.tencent.mm.plugin.traceroute.ui;

import android.widget.Button;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.p;

final class NetworkDiagnoseAllInOneUI$2$1
  implements Runnable
{
  NetworkDiagnoseAllInOneUI$2$1(NetworkDiagnoseAllInOneUI.2 param2)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(25995);
    NetworkDiagnoseAllInOneUI.h(this.sJc.sIZ).setEnabled(true);
    if ((NetworkDiagnoseAllInOneUI.i(this.sJc.sIZ) != null) && (NetworkDiagnoseAllInOneUI.i(this.sJc.sIZ).isShowing()))
      NetworkDiagnoseAllInOneUI.i(this.sJc.sIZ).dismiss();
    NetworkDiagnoseAllInOneUI.b(this.sJc.sIZ, 6);
    NetworkDiagnoseAllInOneUI.b(this.sJc.sIZ);
    AppMethodBeat.o(25995);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.traceroute.ui.NetworkDiagnoseAllInOneUI.2.1
 * JD-Core Version:    0.6.2
 */