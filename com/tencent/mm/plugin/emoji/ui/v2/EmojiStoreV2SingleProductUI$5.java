package com.tencent.mm.plugin.emoji.ui.v2;

import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.emoji.e.l;
import com.tencent.mm.plugin.emoji.model.EmojiLogic;
import com.tencent.mm.plugin.emoji.model.j;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.n.d;
import com.tencent.mm.ui.q;

final class EmojiStoreV2SingleProductUI$5
  implements n.d
{
  EmojiStoreV2SingleProductUI$5(EmojiStoreV2SingleProductUI paramEmojiStoreV2SingleProductUI)
  {
  }

  public final void onMMMenuItemSelected(MenuItem paramMenuItem, int paramInt)
  {
    AppMethodBeat.i(53748);
    switch (paramMenuItem.getItemId())
    {
    default:
    case 1001:
    case 1000:
    }
    while (true)
    {
      AppMethodBeat.o(53748);
      while (true)
      {
        return;
        l.dE(this.lfC.mController.ylL);
        this.lfC.mController.ylL.overridePendingTransition(2131034229, 2131034181);
        h.pYm.e(13224, new Object[] { Integer.valueOf(2), Integer.valueOf(2), "", Integer.valueOf(EmojiStoreV2SingleProductUI.q(this.lfC)) });
        AppMethodBeat.o(53748);
      }
      paramMenuItem = this.lfC.mController.ylL;
      String str1 = EmojiStoreV2SingleProductUI.r(this.lfC);
      String str2 = EmojiStoreV2SingleProductUI.s(this.lfC);
      String str3 = EmojiStoreV2SingleProductUI.t(this.lfC);
      j.bki();
      l.a(paramMenuItem, str1, str2, str3, "https://support.weixin.qq.com/cgi-bin/readtemplate?t=page/common_page__upgrade&text=text000&btn_text=btn_text_0&title=title_0", EmojiLogic.a(EmojiStoreV2SingleProductUI.q(this.lfC), EmojiStoreV2SingleProductUI.r(this.lfC), EmojiStoreV2SingleProductUI.s(this.lfC), EmojiStoreV2SingleProductUI.t(this.lfC), EmojiStoreV2SingleProductUI.u(this.lfC), EmojiStoreV2SingleProductUI.v(this.lfC)), 12);
      h.pYm.e(13224, new Object[] { Integer.valueOf(2), Integer.valueOf(1), "", Integer.valueOf(EmojiStoreV2SingleProductUI.q(this.lfC)) });
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2SingleProductUI.5
 * JD-Core Version:    0.6.2
 */