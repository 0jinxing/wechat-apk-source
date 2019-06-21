package com.tencent.mm.ui.chatting.viewitems;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.chatting.c.b.g;
import com.tencent.mm.ui.l;

final class w$14
  implements l
{
  w$14(w paramw)
  {
  }

  public final void dxA()
  {
  }

  public final void dxB()
  {
  }

  public final void dxC()
  {
    AppMethodBeat.i(33143);
    ab.i("MicroMsg.ChattingItemDyeingTemplate", "onChattingExitAnimStart, then remove AppBrandTmplMsgReceivingSwitchListener.");
    com.tencent.mm.sdk.b.a.xxA.d(w.e(this.zeW));
    if (w.b(this.zeW) != null)
      ((g)w.b(this.zeW).aF(g.class)).b(this);
    AppMethodBeat.o(33143);
  }

  public final void dxD()
  {
  }

  public final void dxx()
  {
  }

  public final void dxy()
  {
  }

  public final void dxz()
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.w.14
 * JD-Core Version:    0.6.2
 */