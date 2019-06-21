package com.tencent.mm.ui.chatting.viewitems;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class az$1 extends al.b
{
  public final boolean aH(int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(33446);
    ab.w("MicroMsg.Chatting.ItemFactory", "unfound msgType:%d, isSender:%b", new Object[] { Integer.valueOf(paramInt), Boolean.valueOf(paramBoolean) });
    AppMethodBeat.o(33446);
    return paramBoolean;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.az.1
 * JD-Core Version:    0.6.2
 */