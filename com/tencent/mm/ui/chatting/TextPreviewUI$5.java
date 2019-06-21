package com.tencent.mm.ui.chatting;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

final class TextPreviewUI$5
  implements View.OnClickListener
{
  TextPreviewUI$5(TextPreviewUI paramTextPreviewUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(31048);
    if (TextPreviewUI.b(this.yMF) != null)
      TextPreviewUI.e(this.yMF.mController.ylL, TextPreviewUI.k(this.yMF).toString());
    AppMethodBeat.o(31048);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.TextPreviewUI.5
 * JD-Core Version:    0.6.2
 */