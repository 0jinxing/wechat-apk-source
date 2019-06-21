package com.tencent.mm.plugin.emoji.ui;

import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.emoji.e.l;
import com.tencent.mm.plugin.emoji.model.EmojiLogic;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.protocal.protobuf.EmotionDetail;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.n.d;
import com.tencent.mm.ui.q;

final class EmojiStoreDetailUI$14
  implements n.d
{
  EmojiStoreDetailUI$14(EmojiStoreDetailUI paramEmojiStoreDetailUI)
  {
  }

  public final void onMMMenuItemSelected(MenuItem paramMenuItem, int paramInt)
  {
    AppMethodBeat.i(53431);
    switch (paramMenuItem.getItemId())
    {
    default:
    case 1001:
    case 1000:
    }
    while (true)
    {
      AppMethodBeat.o(53431);
      while (true)
      {
        return;
        l.dE(this.lbG.mController.ylL);
        this.lbG.mController.ylL.overridePendingTransition(2131034229, 2131034181);
        h.pYm.e(13224, new Object[] { Integer.valueOf(0), Integer.valueOf(2), EmojiStoreDetailUI.a(this.lbG), "" });
        AppMethodBeat.o(53431);
      }
      paramMenuItem = EmojiStoreDetailUI.b(this.lbG).PackName + this.lbG.getString(2131299159);
      l.a(this.lbG.mController.ylL, paramMenuItem, EmojiStoreDetailUI.b(this.lbG).PackDesc, EmojiStoreDetailUI.b(this.lbG).IconUrl, EmojiStoreDetailUI.b(this.lbG).OldRedirectUrl, EmojiLogic.Jt(EmojiStoreDetailUI.a(this.lbG)), 4);
      h.pYm.e(13224, new Object[] { Integer.valueOf(0), Integer.valueOf(1), EmojiStoreDetailUI.a(this.lbG), "" });
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.ui.EmojiStoreDetailUI.14
 * JD-Core Version:    0.6.2
 */