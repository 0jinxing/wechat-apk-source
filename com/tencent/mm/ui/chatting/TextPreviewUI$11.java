package com.tencent.mm.ui.chatting;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.widget.textview.a;

final class TextPreviewUI$11
  implements View.OnClickListener
{
  TextPreviewUI$11(TextPreviewUI paramTextPreviewUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(31055);
    if ((TextPreviewUI.d(this.yMF) != null) && ((!TextPreviewUI.d(this.yMF).zWC) || (!TextPreviewUI.d(this.yMF).zWD)))
    {
      TextPreviewUI.d(this.yMF).dLM();
      TextPreviewUI.d(this.yMF).zWC = true;
      TextPreviewUI.d(this.yMF).zWD = true;
      TextPreviewUI.d(this.yMF).dLL();
      AppMethodBeat.o(31055);
    }
    while (true)
    {
      return;
      this.yMF.finish();
      AppMethodBeat.o(31055);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.TextPreviewUI.11
 * JD-Core Version:    0.6.2
 */