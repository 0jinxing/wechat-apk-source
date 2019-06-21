package com.tencent.mm.plugin.emoji.ui;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.ab;

final class EmojiStoreDetailUI$16
  implements View.OnClickListener
{
  EmojiStoreDetailUI$16(EmojiStoreDetailUI paramEmojiStoreDetailUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(53433);
    ab.d("MicroMsg.emoji.EmojiStoreDetailUI", "ApplicationLanguage" + aa.dor());
    String str = this.lbG.getString(2131299040) + aa.dor();
    paramView = new Intent();
    paramView.putExtra("title", this.lbG.getString(2131299097));
    paramView.putExtra("rawUrl", str);
    paramView.putExtra("showShare", false);
    paramView.putExtra("neverGetA8Key", true);
    d.b(this.lbG, "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", paramView);
    AppMethodBeat.o(53433);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.ui.EmojiStoreDetailUI.16
 * JD-Core Version:    0.6.2
 */