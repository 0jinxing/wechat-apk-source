package com.tencent.mm.plugin.setting.ui.setting;

import android.content.Intent;
import android.view.MenuItem;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ah.d;
import com.tencent.mm.ah.o;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.account.a.a;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.n.d;
import com.tencent.mm.ui.q;

final class PreviewHdHeadImg$1$2
  implements n.d
{
  PreviewHdHeadImg$1$2(PreviewHdHeadImg.1 param1)
  {
  }

  public final void onMMMenuItemSelected(MenuItem paramMenuItem, int paramInt)
  {
    AppMethodBeat.i(126988);
    switch (paramMenuItem.getItemId())
    {
    default:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      AppMethodBeat.o(126988);
      while (true)
      {
        return;
        a.gkF.o(this.qlp.qlo);
        AppMethodBeat.o(126988);
        continue;
        PreviewHdHeadImg.b(this.qlp.qlo);
        AppMethodBeat.o(126988);
      }
      paramMenuItem = new Intent();
      paramMenuItem.setClass(this.qlp.qlo.mController.ylL, PreviewLastHdHeadImg.class);
      o.acd();
      paramMenuItem.putExtra("CropImage_OutputPath", d.D(r.Yz() + ".crop", true));
      o.acd();
      paramMenuItem.putExtra("last_avatar_path", d.D(r.Yz() + ".last", true));
      this.qlp.qlo.startActivityForResult(paramMenuItem, 4);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.PreviewHdHeadImg.1.2
 * JD-Core Version:    0.6.2
 */