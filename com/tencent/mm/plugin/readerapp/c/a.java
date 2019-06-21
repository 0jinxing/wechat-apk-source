package com.tencent.mm.plugin.readerapp.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.az.k;
import com.tencent.mm.g.a.ag;
import com.tencent.mm.g.a.ag.a;
import com.tencent.mm.kernel.e;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.messenger.foundation.a.a.i;
import com.tencent.mm.plugin.messenger.foundation.a.a.j.a;
import com.tencent.mm.plugin.messenger.foundation.a.a.j.b;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.protocal.protobuf.bko;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.z;

final class a extends c<ag>
{
  a()
  {
    AppMethodBeat.i(76752);
    this.xxI = ag.class.getName().hashCode();
    AppMethodBeat.o(76752);
  }

  private boolean a(ag paramag)
  {
    AppMethodBeat.i(76753);
    if (!(paramag instanceof ag))
    {
      ab.f("MicroMsg.ReaderAppBindQQ.EventListener", "not bind qq event");
      AppMethodBeat.o(76753);
    }
    while (true)
    {
      return false;
      if (paramag.ctc.cte == 0);
      try
      {
        int i = r.YK() | 0x40000;
        com.tencent.mm.kernel.g.RP().Ry().set(34, Integer.valueOf(i));
        Object localObject = new com/tencent/mm/protocal/protobuf/bko;
        ((bko)localObject).<init>();
        ((bko)localObject).vCi = 262144;
        ((bko)localObject).wNJ = 1;
        paramag = ((j)com.tencent.mm.kernel.g.K(j.class)).XL();
        j.a locala = new com/tencent/mm/plugin/messenger/foundation/a/a/j$a;
        locala.<init>(39, (com.tencent.mm.bt.a)localObject);
        paramag.c(locala);
        paramag = ((j)com.tencent.mm.kernel.g.K(j.class)).XL();
        localObject = new com/tencent/mm/az/k;
        ((k)localObject).<init>("", "", "", "", "", "", "", "", i, "", "");
        paramag.c((j.b)localObject);
        paramag = new com/tencent/mm/plugin/readerapp/c/a$1;
        paramag.<init>(this);
        g.b(paramag);
        i = r.YF();
        com.tencent.mm.kernel.g.RP().Ry().set(40, Integer.valueOf(i & 0xFFFFFFDF));
        localObject = ((j)com.tencent.mm.kernel.g.K(j.class)).XL();
        paramag = new com/tencent/mm/az/g;
        paramag.<init>(21, 2);
        ((i)localObject).c(paramag);
        ab.d("MicroMsg.ReaderAppBindQQ.EventListener", "doClearReaderAppWeiboHelper succ ");
        AppMethodBeat.o(76753);
      }
      catch (Exception paramag)
      {
        while (true)
          ab.printErrStackTrace("MicroMsg.ReaderAppBindQQ.EventListener", paramag, "", new Object[0]);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.readerapp.c.a
 * JD-Core Version:    0.6.2
 */