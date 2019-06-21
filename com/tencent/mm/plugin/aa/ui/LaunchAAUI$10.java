package com.tencent.mm.plugin.aa.ui;

import android.app.Dialog;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.y;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import com.tencent.mm.vending.g.d.a;

final class LaunchAAUI$10
  implements d.a
{
  LaunchAAUI$10(LaunchAAUI paramLaunchAAUI)
  {
  }

  public final void bi(Object paramObject)
  {
    AppMethodBeat.i(40832);
    ab.i("MicroMsg.LaunchAAUI", "onInterrupt: %s", new Object[] { paramObject });
    if (LaunchAAUI.k(this.gpj) != null)
      LaunchAAUI.k(this.gpj).dismiss();
    if ((paramObject != null) && ((paramObject instanceof String)) && (!paramObject.toString().equalsIgnoreCase("ok")))
      Toast.makeText(this.gpj, paramObject.toString(), 1).show();
    while (true)
    {
      com.tencent.mm.plugin.report.service.h.pYm.e(13722, new Object[] { Integer.valueOf(10) });
      AppMethodBeat.o(40832);
      return;
      if ((paramObject != null) && ((paramObject instanceof y)))
        com.tencent.mm.plugin.aa.a.h.a(this.gpj.mController.ylL, (y)paramObject);
      else
        Toast.makeText(this.gpj, 2131300926, 1).show();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.aa.ui.LaunchAAUI.10
 * JD-Core Version:    0.6.2
 */