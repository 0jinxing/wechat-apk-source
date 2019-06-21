package com.tencent.mm.ui.chatting;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class TextPreviewUI$15
  implements View.OnTouchListener
{
  TextPreviewUI$15(TextPreviewUI paramTextPreviewUI)
  {
  }

  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(31059);
    switch (paramMotionEvent.getAction())
    {
    default:
    case 0:
    case 2:
    case 1:
    }
    while (true)
    {
      AppMethodBeat.o(31059);
      return false;
      TextPreviewUI.a(this.yMF, true);
      continue;
      if (!TextPreviewUI.e(this.yMF))
      {
        TextPreviewUI.b(this.yMF, true);
        TextPreviewUI.a(this.yMF, true);
        continue;
        TextPreviewUI.a(this.yMF, false);
        TextPreviewUI.b(this.yMF, false);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.TextPreviewUI.15
 * JD-Core Version:    0.6.2
 */