package com.tencent.mm.plugin.setting.ui.setting;

import android.graphics.Bitmap;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ah.b;
import com.tencent.mm.ah.d;
import com.tencent.mm.ah.o;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.av;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;

final class SettingsPersonalInfoUI$5
  implements Runnable
{
  SettingsPersonalInfoUI$5(SettingsPersonalInfoUI paramSettingsPersonalInfoUI, Bitmap paramBitmap)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(127369);
    ab.d("MicroMsg.SettingsPersonalInfoUI", "updateHeadImg hasUin:%b user:%s", new Object[] { Boolean.valueOf(g.RK()), r.Yz() });
    if (g.RK())
    {
      if (this.val$bitmap != null)
      {
        o.acd();
        str = d.D(r.Yz() + ".last", true);
        PreviewHdHeadImg.e(this.val$bitmap, str);
      }
      String str = b.pX(r.Yz());
      av.fly.ou(str);
    }
    SettingsPersonalInfoUI.a(this.qoh);
    if (SettingsPersonalInfoUI.b(this.qoh))
      h.pYm.e(11002, new Object[] { Integer.valueOf(4), Integer.valueOf(4) });
    AppMethodBeat.o(127369);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.SettingsPersonalInfoUI.5
 * JD-Core Version:    0.6.2
 */