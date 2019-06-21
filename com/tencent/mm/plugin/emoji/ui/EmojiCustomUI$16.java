package com.tencent.mm.plugin.emoji.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.at.a.c.d;
import com.tencent.mm.plugin.emoji.e.f;
import com.tencent.mm.storage.emotion.EmojiInfo;

final class EmojiCustomUI$16
  implements d
{
  public final byte[] i(Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(53315);
    if ((paramArrayOfObject != null) && (paramArrayOfObject.length > 0))
    {
      paramArrayOfObject = paramArrayOfObject[0];
      if ((paramArrayOfObject != null) && ((paramArrayOfObject instanceof EmojiInfo)))
      {
        paramArrayOfObject = f.bjK().l((EmojiInfo)paramArrayOfObject);
        AppMethodBeat.o(53315);
      }
    }
    while (true)
    {
      return paramArrayOfObject;
      paramArrayOfObject = null;
      AppMethodBeat.o(53315);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.ui.EmojiCustomUI.16
 * JD-Core Version:    0.6.2
 */