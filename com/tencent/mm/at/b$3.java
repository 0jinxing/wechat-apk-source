package com.tencent.mm.at;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.v;
import com.tencent.mm.g.a.v.a;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.Stack;

final class b$3 extends com.tencent.mm.sdk.b.c<v>
{
  b$3(b paramb)
  {
    AppMethodBeat.i(78154);
    this.xxI = v.class.getName().hashCode();
    AppMethodBeat.o(78154);
  }

  private boolean a(v paramv)
  {
    AppMethodBeat.i(78155);
    this.fDj.fDf = paramv.csQ.mode;
    ab.d("MicroMsg.AutoGetBigImgLogic", "mode = " + this.fDj.fDf);
    com.tencent.mm.modelcontrol.c.afC();
    if (!com.tencent.mm.modelcontrol.c.afD());
    synchronized (this.fDj.fCV)
    {
      this.fDj.fCV.clear();
      AppMethodBeat.o(78155);
      return false;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.at.b.3
 * JD-Core Version:    0.6.2
 */