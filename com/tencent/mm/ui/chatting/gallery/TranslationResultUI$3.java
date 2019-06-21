package com.tencent.mm.ui.chatting.gallery;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.b.a.k;
import com.tencent.mm.g.c.eb;

final class TranslationResultUI$3
  implements View.OnClickListener
{
  TranslationResultUI$3(TranslationResultUI paramTranslationResultUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(138647);
    paramView = new k();
    paramView.cVS = 7L;
    paramView.ajK();
    TranslationResultUI.a(this.yYi, TranslationResultUI.b(this.yYi).field_resultFile);
    AppMethodBeat.o(138647);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.gallery.TranslationResultUI.3
 * JD-Core Version:    0.6.2
 */