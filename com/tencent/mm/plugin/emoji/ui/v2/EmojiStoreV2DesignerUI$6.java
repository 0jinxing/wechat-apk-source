package com.tencent.mm.plugin.emoji.ui.v2;

import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.emoji.e.l;
import com.tencent.mm.plugin.emoji.model.EmojiLogic;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.protocal.protobuf.aml;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.n.d;
import com.tencent.mm.ui.q;

final class EmojiStoreV2DesignerUI$6
  implements n.d
{
  EmojiStoreV2DesignerUI$6(EmojiStoreV2DesignerUI paramEmojiStoreV2DesignerUI)
  {
  }

  public final void onMMMenuItemSelected(MenuItem paramMenuItem, int paramInt)
  {
    AppMethodBeat.i(53584);
    switch (paramMenuItem.getItemId())
    {
    default:
    case 1001:
    case 1000:
    }
    while (true)
    {
      AppMethodBeat.o(53584);
      while (true)
      {
        return;
        l.dE(this.ldL.mController.ylL);
        this.ldL.mController.ylL.overridePendingTransition(2131034229, 2131034181);
        h.pYm.e(13224, new Object[] { Integer.valueOf(3), Integer.valueOf(2), "", Integer.valueOf(EmojiStoreV2DesignerUI.l(this.ldL)) });
        AppMethodBeat.o(53584);
      }
      if (EmojiStoreV2DesignerUI.m(this.ldL) != null)
      {
        paramMenuItem = EmojiStoreV2DesignerUI.m(this.ldL).Name + this.ldL.getString(2131299101);
        l.a(this.ldL.mController.ylL, paramMenuItem, EmojiStoreV2DesignerUI.m(this.ldL).Desc, EmojiStoreV2DesignerUI.m(this.ldL).HeadUrl, EmojiStoreV2DesignerUI.n(this.ldL), EmojiLogic.r(EmojiStoreV2DesignerUI.l(this.ldL), EmojiStoreV2DesignerUI.o(this.ldL), EmojiStoreV2DesignerUI.n(this.ldL)), 10);
        h.pYm.e(13224, new Object[] { Integer.valueOf(3), Integer.valueOf(1), "", Integer.valueOf(EmojiStoreV2DesignerUI.l(this.ldL)) });
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2DesignerUI.6
 * JD-Core Version:    0.6.2
 */