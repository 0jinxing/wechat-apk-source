package com.tencent.mm.plugin.game.luggage.c.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.ui.tools.game.menu.d;

public final class c
{
  com.tencent.mm.plugin.game.luggage.d.e mUm;
  b mUn;
  public d mUo;

  public c(com.tencent.mm.plugin.game.luggage.d.e parame, b paramb)
  {
    AppMethodBeat.i(135896);
    this.mUm = parame;
    this.mUn = paramb;
    this.mUo = new d(this.mUm.mContext);
    this.mUo.uEJ = new c.1(this);
    this.mUo.a(new c.2(this));
    this.mUo.cpD();
    AppMethodBeat.o(135896);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.luggage.c.a.c
 * JD-Core Version:    0.6.2
 */