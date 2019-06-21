package com.tencent.mm.pluginsdk.ui.chat;

import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.ui.emoji.PreViewEmojiView;

final class m$c
{
  PreViewEmojiView voQ;

  public m$c(m paramm, View paramView)
  {
    AppMethodBeat.i(62464);
    this.voQ = ((PreViewEmojiView)paramView.findViewById(2131822406));
    this.voQ.setSize(paramm.voC);
    AppMethodBeat.o(62464);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.chat.m.c
 * JD-Core Version:    0.6.2
 */