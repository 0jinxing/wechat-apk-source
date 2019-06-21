package com.tencent.mm.ui.chatting.gallery;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.eb;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.d;

final class TranslationResultUI$2
  implements Runnable
{
  TranslationResultUI$2(TranslationResultUI paramTranslationResultUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(138646);
    TranslationResultUI.a(this.yYi, d.decodeFile(TranslationResultUI.b(this.yYi).field_resultFile, null));
    if (TranslationResultUI.c(this.yYi) != null)
      al.d(new TranslationResultUI.2.1(this));
    AppMethodBeat.o(138646);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.gallery.TranslationResultUI.2
 * JD-Core Version:    0.6.2
 */