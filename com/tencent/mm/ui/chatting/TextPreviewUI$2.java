package com.tencent.mm.ui.chatting;

import android.view.View;
import android.widget.ScrollView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.CustomScrollView.a;

final class TextPreviewUI$2
  implements CustomScrollView.a
{
  TextPreviewUI$2(TextPreviewUI paramTextPreviewUI)
  {
  }

  public final void a(ScrollView paramScrollView, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(31044);
    TextPreviewUI.f(this.yMF);
    int i;
    if (paramScrollView.getChildAt(0).getMeasuredHeight() == paramScrollView.getHeight() + paramScrollView.getScrollY())
    {
      i = 1;
      if (i != 0)
        TextPreviewUI.a(this.yMF, paramScrollView.getScrollY());
      if ((paramScrollView.getScrollY() > 0) && ((paramScrollView.getScrollY() < TextPreviewUI.g(this.yMF) - 10) || (TextPreviewUI.g(this.yMF) <= 0)))
        break label119;
      TextPreviewUI.h(this.yMF);
    }
    label119: 
    while (!TextPreviewUI.i(this.yMF))
    {
      TextPreviewUI.b(this.yMF, paramInt1 - paramInt2);
      AppMethodBeat.o(31044);
      return;
      i = 0;
      break;
    }
    if (paramInt2 > paramInt1)
      TextPreviewUI.h(this.yMF);
    while (true)
    {
      TextPreviewUI.a(this.yMF, false);
      break;
      if (paramInt2 < paramInt1)
        TextPreviewUI.j(this.yMF);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.TextPreviewUI.2
 * JD-Core Version:    0.6.2
 */