package com.tencent.mm.ui.chatting;

import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class TextPreviewUI$1
  implements ViewTreeObserver.OnPreDrawListener
{
  TextPreviewUI$1(TextPreviewUI paramTextPreviewUI)
  {
  }

  public final boolean onPreDraw()
  {
    AppMethodBeat.i(31043);
    TextPreviewUI.a(this.yMF).getViewTreeObserver().removeOnPreDrawListener(this);
    if (TextPreviewUI.a(this.yMF).getLineCount() == 1)
      TextPreviewUI.a(this.yMF).setGravity(1);
    AppMethodBeat.o(31043);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.TextPreviewUI.1
 * JD-Core Version:    0.6.2
 */