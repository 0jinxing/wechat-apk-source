package com.tencent.mm.plugin.emojicapture.ui;

import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "run"})
final class EmojiCaptureUI$e
  implements Runnable
{
  EmojiCaptureUI$e(EmojiCaptureUI paramEmojiCaptureUI, long paramLong)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(2868);
    ab.i(EmojiCaptureUI.a(this.llk), "connect cost " + bo.az(this.eYz));
    EmojiCaptureUI.b(this.llk);
    AppMethodBeat.o(2868);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emojicapture.ui.EmojiCaptureUI.e
 * JD-Core Version:    0.6.2
 */