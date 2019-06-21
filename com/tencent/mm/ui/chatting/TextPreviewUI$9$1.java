package com.tencent.mm.ui.chatting;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.widget.textview.a;

final class TextPreviewUI$9$1
  implements Runnable
{
  TextPreviewUI$9$1(TextPreviewUI.9 param9)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(31052);
    if (TextPreviewUI.d(this.yMH.yMF) != null)
      TextPreviewUI.d(this.yMH.yMF).dLS();
    AppMethodBeat.o(31052);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.TextPreviewUI.9.1
 * JD-Core Version:    0.6.2
 */