package com.tencent.mm.ui.tools;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aj.d;
import com.tencent.mm.aj.e;
import com.tencent.mm.aj.o;
import com.tencent.mm.aj.z;
import com.tencent.mm.g.a.ah;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.bf.a;
import com.tencent.mm.sdk.b.a;

final class b$3
  implements bf.a
{
  b$3(d paramd, String paramString)
  {
  }

  public final boolean JU()
  {
    AppMethodBeat.i(34787);
    boolean bool = b.access$000();
    AppMethodBeat.o(34787);
    return bool;
  }

  public final void JV()
  {
    AppMethodBeat.i(34788);
    if (this.zAH.adN())
    {
      g.K(o.class);
      com.tencent.mm.storage.p.aok(this.pkF);
      ah localah = new ah();
      localah.ctf.userName = this.pkF;
      a.xxA.m(localah);
    }
    z.aeR().delete(this.pkF);
    if (b.dJz() != null)
    {
      b.dJz().dismiss();
      b.dJA();
    }
    AppMethodBeat.o(34788);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.b.3
 * JD-Core Version:    0.6.2
 */