package com.tencent.mm.plugin.emoji.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.emoji.a.c.b;

final class EmojiAddCustomDialogUI$3
  implements c.b
{
  EmojiAddCustomDialogUI$3(EmojiAddCustomDialogUI paramEmojiAddCustomDialogUI)
  {
  }

  public final void b(int paramInt1, int paramInt2, String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(53272);
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      EmojiAddCustomDialogUI.b(this.kZj, paramString);
      EmojiAddCustomDialogUI.c(this.kZj, paramString);
      AppMethodBeat.o(53272);
    }
    while (true)
    {
      return;
      if (paramBoolean)
      {
        EmojiAddCustomDialogUI.e(this.kZj);
        AppMethodBeat.o(53272);
      }
      else if (paramInt2 == 4)
      {
        EmojiAddCustomDialogUI.f(this.kZj);
        AppMethodBeat.o(53272);
      }
      else
      {
        EmojiAddCustomDialogUI.g(this.kZj);
        AppMethodBeat.o(53272);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.ui.EmojiAddCustomDialogUI.3
 * JD-Core Version:    0.6.2
 */