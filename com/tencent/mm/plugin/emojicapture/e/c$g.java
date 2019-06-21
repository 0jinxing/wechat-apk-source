package com.tencent.mm.plugin.emojicapture.e;

import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.emojicapture.c.b.b;
import com.tencent.mm.plugin.emojicapture.ui.EmojiCaptureUI.b;
import com.tencent.mm.plugin.emojicapture.ui.EmojiVideoPlayTextureView;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "run"})
final class c$g
  implements Runnable
{
  c$g(c paramc)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(2772);
    if ((c.e(this.lkA)) && (c.c(this.lkA)))
    {
      EmojiVideoPlayTextureView localEmojiVideoPlayTextureView = c.a(this.lkA).getVideoPlayView();
      if (localEmojiVideoPlayTextureView != null)
        EmojiVideoPlayTextureView.a(localEmojiVideoPlayTextureView, c.b(this.lkA));
      c.a(this.lkA).bmA();
      c.h(this.lkA).bnO();
      c.a(this.lkA, c.g(this.lkA), c.i(this.lkA), true);
      c.a(this.lkA, false);
      c.b(this.lkA, false);
    }
    AppMethodBeat.o(2772);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emojicapture.e.c.g
 * JD-Core Version:    0.6.2
 */