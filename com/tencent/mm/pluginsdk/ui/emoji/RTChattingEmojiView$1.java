package com.tencent.mm.pluginsdk.ui.emoji;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.emoji.view.EmojiStatusView.b;

final class RTChattingEmojiView$1
  implements EmojiStatusView.b
{
  RTChattingEmojiView$1(RTChattingEmojiView paramRTChattingEmojiView)
  {
  }

  public final void jm(int paramInt)
  {
    AppMethodBeat.i(62489);
    if (paramInt == 0)
    {
      RTChattingEmojiView localRTChattingEmojiView = this.vpU;
      if (RTChattingEmojiView.a(this.vpU))
      {
        paramInt = 0;
        RTChattingEmojiView.a(localRTChattingEmojiView, paramInt);
        AppMethodBeat.o(62489);
      }
    }
    while (true)
    {
      return;
      paramInt = 1;
      break;
      if (paramInt == -1)
      {
        RTChattingEmojiView.a(this.vpU, 3);
        AppMethodBeat.o(62489);
      }
      else
      {
        RTChattingEmojiView.a(this.vpU, 2);
        AppMethodBeat.o(62489);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.emoji.RTChattingEmojiView.1
 * JD-Core Version:    0.6.2
 */