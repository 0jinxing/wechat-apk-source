package com.tencent.mm.view.popview;

import android.widget.ProgressBar;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.emoji.view.EmojiStatusView;
import com.tencent.mm.emoji.view.EmojiStatusView.b;

final class EmojiPopView$1
  implements EmojiStatusView.b
{
  EmojiPopView$1(EmojiPopView paramEmojiPopView)
  {
  }

  public final void jm(int paramInt)
  {
    AppMethodBeat.i(63063);
    if (paramInt == 1)
    {
      EmojiPopView.a(this.AdU).setVisibility(8);
      EmojiPopView.b(this.AdU).setVisibility(0);
      AppMethodBeat.o(63063);
    }
    while (true)
    {
      return;
      EmojiPopView.b(this.AdU).setVisibility(4);
      EmojiPopView.a(this.AdU).setVisibility(0);
      AppMethodBeat.o(63063);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.view.popview.EmojiPopView.1
 * JD-Core Version:    0.6.2
 */