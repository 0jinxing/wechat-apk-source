package com.tencent.mm.pluginsdk.ui.emoji;

import android.content.Context;
import android.util.AttributeSet;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class RTChattingEmojiViewTo extends RTChattingEmojiView
{
  public RTChattingEmojiViewTo(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(62505);
    initView();
    AppMethodBeat.o(62505);
  }

  public RTChattingEmojiViewTo(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(62506);
    initView();
    AppMethodBeat.o(62506);
  }

  public final void initView()
  {
    AppMethodBeat.i(62507);
    super.initView();
    dkR();
    AppMethodBeat.o(62507);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.emoji.RTChattingEmojiViewTo
 * JD-Core Version:    0.6.2
 */