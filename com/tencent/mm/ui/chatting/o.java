package com.tencent.mm.ui.chatting;

import android.content.res.Resources;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMFragment;
import com.tencent.mm.ui.chatting.c.b.h;
import com.tencent.mm.ui.chatting.d.a;
import com.tencent.mm.ui.q.b;

public final class o
{
  public a cgL;
  public long[] yJa;

  public o(a parama, long[] paramArrayOfLong)
  {
    AppMethodBeat.i(30622);
    this.yJa = null;
    this.cgL = parama;
    this.yJa = paramArrayOfLong;
    this.cgL.yTx.removeAllOptionMenu();
    this.cgL.yTx.addTextOptionMenu(2, this.cgL.yTx.getMMResources().getString(2131297644), new o.1(this), null, q.b.ymu);
    parama = (h)this.cgL.aF(h.class);
    parama.c(new o.2(this, parama));
    AppMethodBeat.o(30622);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.o
 * JD-Core Version:    0.6.2
 */