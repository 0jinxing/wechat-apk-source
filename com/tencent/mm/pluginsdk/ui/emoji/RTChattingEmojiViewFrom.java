package com.tencent.mm.pluginsdk.ui.emoji;

import android.content.Context;
import android.util.AttributeSet;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class RTChattingEmojiViewFrom extends RTChattingEmojiView
{
  public RTChattingEmojiViewFrom(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(62502);
    initView();
    AppMethodBeat.o(62502);
  }

  public RTChattingEmojiViewFrom(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(62503);
    initView();
    AppMethodBeat.o(62503);
  }

  public final void initView()
  {
    AppMethodBeat.i(62504);
    super.initView();
    dkQ();
    AppMethodBeat.o(62504);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.emoji.RTChattingEmojiViewFrom
 * JD-Core Version:    0.6.2
 */