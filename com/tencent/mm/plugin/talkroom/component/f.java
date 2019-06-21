package com.tencent.mm.plugin.talkroom.component;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.audio.b.c;
import com.tencent.mm.audio.b.c.a;
import com.tencent.mm.plugin.talkroom.model.a;

public final class f extends d.a
{
  private c coZ;
  private c.a cqd;
  private v2engine sxg;
  private short sxh;
  private short sxi;

  public f(v2engine paramv2engine)
  {
    AppMethodBeat.i(25714);
    this.cqd = new f.1(this);
    this.sxg = paramv2engine;
    AppMethodBeat.o(25714);
  }

  public final void akw()
  {
    AppMethodBeat.i(25716);
    this.coZ = new c(a.sxv, 1, 2);
    this.coZ.v(8, false);
    this.coZ.cpM = this.cqd;
    this.coZ.gG(20);
    this.coZ.EL();
    this.sxi = ((short)0);
    this.sxh = ((short)0);
    AppMethodBeat.o(25716);
  }

  public final void cEd()
  {
    AppMethodBeat.i(25715);
    if (this.coZ != null)
    {
      this.coZ.EB();
      this.coZ = null;
    }
    AppMethodBeat.o(25715);
  }

  public final int cEe()
  {
    int i = 0;
    if (this.sxi < this.sxh)
      this.sxi = ((short)this.sxh);
    if (this.sxi == 0);
    while (true)
    {
      return i;
      i = (short)(this.sxh * 100 / this.sxi);
      this.sxh = ((short)0);
    }
  }

  public final void release()
  {
    AppMethodBeat.i(25717);
    cEd();
    AppMethodBeat.o(25717);
  }

  public final void start()
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.talkroom.component.f
 * JD-Core Version:    0.6.2
 */