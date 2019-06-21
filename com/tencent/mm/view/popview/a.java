package com.tencent.mm.view.popview;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.emoji.a.f;
import com.tencent.mm.storage.emotion.EmojiInfo;

public final class a
{
  public static void a(AbstractPopView paramAbstractPopView, Object paramObject)
  {
    AppMethodBeat.i(63069);
    if ((paramAbstractPopView instanceof EmojiPopView))
    {
      ((EmojiPopView)paramAbstractPopView).setEmojiInfo((EmojiInfo)paramObject);
      AppMethodBeat.o(63069);
    }
    while (true)
    {
      return;
      if ((paramAbstractPopView instanceof SmileyPopView))
        ((SmileyPopView)paramAbstractPopView).setSmileyItem((f)paramObject);
      AppMethodBeat.o(63069);
    }
  }

  public static AbstractPopView b(Context paramContext, Object paramObject)
  {
    AppMethodBeat.i(63068);
    if ((paramObject instanceof f))
    {
      paramContext = new SmileyPopView(paramContext);
      AppMethodBeat.o(63068);
    }
    while (true)
    {
      return paramContext;
      paramContext = new EmojiPopView(paramContext);
      AppMethodBeat.o(63068);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.view.popview.a
 * JD-Core Version:    0.6.2
 */