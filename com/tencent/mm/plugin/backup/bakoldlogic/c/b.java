package com.tencent.mm.plugin.backup.bakoldlogic.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bt.a;
import com.tencent.mm.plugin.backup.i.ac;

public final class b extends com.tencent.mm.plugin.backup.g.b
{
  private com.tencent.mm.plugin.backup.i.ab jAg;
  private ac jAh;

  public b(int paramInt)
  {
    AppMethodBeat.i(17881);
    this.jAg = new com.tencent.mm.plugin.backup.i.ab();
    this.jAh = new ac();
    this.jAg.jBh = paramInt;
    AppMethodBeat.o(17881);
  }

  public final a aTS()
  {
    return this.jAh;
  }

  public final a aTT()
  {
    return this.jAg;
  }

  public final int getType()
  {
    return 3;
  }

  public final void rw(int paramInt)
  {
    AppMethodBeat.i(17882);
    if (this.jAh.jBT == 0)
    {
      l(0, 0, "ok");
      AppMethodBeat.o(17882);
    }
    while (true)
    {
      return;
      com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.BakSceneCommand", " type:%d  errCode:%d", new Object[] { Integer.valueOf(this.jAg.jBh), Integer.valueOf(this.jAh.jBT) });
      l(4, this.jAh.jBT, "fail");
      AppMethodBeat.o(17882);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.bakoldlogic.c.b
 * JD-Core Version:    0.6.2
 */