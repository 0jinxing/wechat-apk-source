package com.tencent.mm.plugin.emoji.ui;

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

final class EmojiStoreTopicUI$4
  implements n.d
{
  EmojiStoreTopicUI$4(EmojiStoreTopicUI paramEmojiStoreTopicUI)
  {
  }

  public final void onMMMenuItemSelected(MenuItem paramMenuItem, int paramInt)
  {
    AppMethodBeat.i(53494);
    switch (paramMenuItem.getItemId())
    {
    default:
    case 1001:
    case 1000:
    }
    while (true)
    {
      AppMethodBeat.o(53494);
      while (true)
      {
        return;
        l.dE(this.lbP.mController.ylL);
        this.lbP.mController.ylL.overridePendingTransition(2131034229, 2131034181);
        h.pYm.e(13224, new Object[] { Integer.valueOf(1), Integer.valueOf(2), "", Integer.valueOf(EmojiStoreTopicUI.d(this.lbP)) });
        AppMethodBeat.o(53494);
      }
      AppCompatActivity localAppCompatActivity = this.lbP.mController.ylL;
      String str1 = EmojiStoreTopicUI.a(this.lbP);
      String str2 = EmojiStoreTopicUI.e(this.lbP);
      paramMenuItem = EmojiStoreTopicUI.b(this.lbP);
      j.bki();
      l.a(localAppCompatActivity, str1, str2, paramMenuItem, "https://support.weixin.qq.com/cgi-bin/readtemplate?t=page/common_page__upgrade&text=text000&btn_text=btn_text_0&title=title_0", EmojiLogic.a(EmojiStoreTopicUI.d(this.lbP), EmojiStoreTopicUI.a(this.lbP), EmojiStoreTopicUI.e(this.lbP), EmojiStoreTopicUI.b(this.lbP), EmojiStoreTopicUI.f(this.lbP), 0), 13);
      h.pYm.e(13224, new Object[] { Integer.valueOf(1), Integer.valueOf(1), "", Integer.valueOf(EmojiStoreTopicUI.d(this.lbP)) });
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.ui.EmojiStoreTopicUI.4
 * JD-Core Version:    0.6.2
 */