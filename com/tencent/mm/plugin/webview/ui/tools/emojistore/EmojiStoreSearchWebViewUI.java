package com.tencent.mm.plugin.webview.ui.tools.emojistore;

import android.app.Activity;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

public class EmojiStoreSearchWebViewUI extends BaseEmojiStoreSearchWebViewUI
{
  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }

  public final void t(int paramInt, Bundle paramBundle)
  {
    AppMethodBeat.i(8302);
    ab.i("MicroMsg.emoji.EmojiStoreSearchWebViewUI", "handleEmojiStoreAction action:%d", new Object[] { Integer.valueOf(paramInt) });
    super.t(paramInt, paramBundle);
    AppMethodBeat.o(8302);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.emojistore.EmojiStoreSearchWebViewUI
 * JD-Core Version:    0.6.2
 */