package com.tencent.mm.plugin.webview.ui.tools.emojistore;

import android.graphics.Bitmap;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.ui.tools.WebViewUI.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.tools.o;
import com.tencent.xweb.WebView;

final class BaseEmojiStoreSearchWebViewUI$a extends WebViewUI.h
{
  private BaseEmojiStoreSearchWebViewUI$a(BaseEmojiStoreSearchWebViewUI paramBaseEmojiStoreSearchWebViewUI)
  {
    super(paramBaseEmojiStoreSearchWebViewUI);
  }

  public final void b(WebView paramWebView, String paramString)
  {
    AppMethodBeat.i(8291);
    ab.i("MicroMsg.emoji.BaseEmojiStoreSearchWebViewUI", "onPageFinished url:%s", new Object[] { paramString });
    super.b(paramWebView, paramString);
    this.uzX.showOptionMenu(false);
    BaseEmojiStoreSearchWebViewUI.a(this.uzX).setSearchContent(this.uzX.query);
    AppMethodBeat.o(8291);
  }

  public final void b(WebView paramWebView, String paramString, Bitmap paramBitmap)
  {
    AppMethodBeat.i(8292);
    super.b(paramWebView, paramString, paramBitmap);
    this.uzX.showOptionMenu(false);
    AppMethodBeat.o(8292);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.emojistore.BaseEmojiStoreSearchWebViewUI.a
 * JD-Core Version:    0.6.2
 */