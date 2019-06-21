package com.tencent.mm.ui.chatting.gallery;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class TranslationResultUI$2$1
  implements Runnable
{
  TranslationResultUI$2$1(TranslationResultUI.2 param2)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(138645);
    TranslationResultUI.d(this.yYj.yYi).bitmap = TranslationResultUI.c(this.yYj.yYi);
    TranslationResultUI.d(this.yYj.yYi).notifyDataSetChanged();
    AppMethodBeat.o(138645);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.gallery.TranslationResultUI.2.1
 * JD-Core Version:    0.6.2
 */