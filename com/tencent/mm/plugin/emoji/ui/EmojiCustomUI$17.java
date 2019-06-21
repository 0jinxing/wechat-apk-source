package com.tencent.mm.plugin.emoji.ui;

import android.graphics.Bitmap;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.at.a.c.l;
import com.tencent.mm.plugin.gif.i;
import com.tencent.mm.vfs.e;

final class EmojiCustomUI$17
  implements l
{
  public final Bitmap X(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(53316);
    paramArrayOfByte = i.aW(paramArrayOfByte);
    AppMethodBeat.o(53316);
    return paramArrayOfByte;
  }

  public final Bitmap sI(String paramString)
  {
    AppMethodBeat.i(53317);
    paramString = i.aW(e.e(paramString, 0, -1));
    AppMethodBeat.o(53317);
    return paramString;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.ui.EmojiCustomUI.17
 * JD-Core Version:    0.6.2
 */