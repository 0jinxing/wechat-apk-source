package com.tencent.mm.ui.chatting.viewitems;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class az$2 extends al.a
{
  public final boolean aH(int paramInt, boolean paramBoolean)
  {
    boolean bool = true;
    AppMethodBeat.i(33447);
    ab.w("MicroMsg.Chatting.ItemFactory", "unfound msgType:%d, isSender:%b", new Object[] { Integer.valueOf(paramInt), Boolean.valueOf(paramBoolean) });
    if (!paramBoolean)
      AppMethodBeat.o(33447);
    for (paramBoolean = bool; ; paramBoolean = false)
    {
      return paramBoolean;
      AppMethodBeat.o(33447);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.az.2
 * JD-Core Version:    0.6.2
 */