package com.tencent.mm.plugin.setting.ui.setting;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.widget.EditText;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.bp.d;
import com.tencent.mm.compatible.e.n;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.setting.model.j;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.storage.bs;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;

final class SendFeedBackUI$3
  implements MenuItem.OnMenuItemClickListener
{
  SendFeedBackUI$3(SendFeedBackUI paramSendFeedBackUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(127046);
    paramMenuItem = SendFeedBackUI.a(this.qlF).getText().toString().trim();
    if (paramMenuItem.length() > 0)
      if (paramMenuItem.startsWith("//traceroute"))
      {
        SendFeedBackUI.a(this.qlF).setText("");
        d.H(this.qlF.mController.ylL, "traceroute", ".ui.NetworkDiagnoseIntroUI");
        AppMethodBeat.o(127046);
      }
    while (true)
    {
      return false;
      j localj = new j(com.tencent.mm.compatible.e.q.Mc(), paramMenuItem + " key " + bs.dut() + " local key " + bs.dus() + "NetType:" + at.getNetTypeString(this.qlF.getApplicationContext()) + " hasNeon: " + n.LC() + " isArmv6: " + n.LE() + " isArmv7: " + n.LD());
      g.Rg().a(153, this.qlF);
      g.Rg().a(localj, 0);
      this.qlF.aqX();
      paramMenuItem = this.qlF;
      SendFeedBackUI localSendFeedBackUI = this.qlF;
      this.qlF.getString(2131297061);
      SendFeedBackUI.a(paramMenuItem, h.b(localSendFeedBackUI, this.qlF.getString(2131297043), true, new SendFeedBackUI.3.1(this, localj)));
      AppMethodBeat.o(127046);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.SendFeedBackUI.3
 * JD-Core Version:    0.6.2
 */