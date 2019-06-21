package com.tencent.mm.plugin.translate;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.tj;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.plugin.messenger.foundation.a.a.h;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.plugin.translate.a.c.c;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.az.a;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bi;

final class a$1$1
  implements az.a
{
  a$1$1(a.1 param1, int paramInt, c.c paramc)
  {
  }

  public final boolean acf()
  {
    AppMethodBeat.i(26048);
    ab.d("MicroMsg.SubCoreTranslate", "finish translated, id: %s", new Object[] { this.sKr.id });
    if (this.crd != 0)
    {
      ab.e("MicroMsg.SubCoreTranslate", "translate error");
      AppMethodBeat.o(26048);
    }
    while (true)
    {
      return true;
      if (this.sKr.ret != 0)
      {
        ab.e("MicroMsg.SubCoreTranslate", "translate ret not ok : %s", new Object[] { Integer.valueOf(this.sKr.ret) });
        AppMethodBeat.o(26048);
      }
      else
      {
        if (!bo.isNullOrNil(this.sKr.cPG))
          break;
        ab.e("MicroMsg.SubCoreTranslate", "translate return null");
        AppMethodBeat.o(26048);
      }
    }
    bi localbi;
    if ((this.sKr.type == 0) || (this.sKr.type == 1))
    {
      ab.d("MicroMsg.SubCoreTranslate", "we recieved one translated message");
      c.c localc = this.sKr;
      aw.ZK();
      localbi = c.XO().jf(bo.anl(localc.id));
      localbi.jx(bo.vA(localc.cPG));
      localbi.field_transBrandWording = bo.vA(bo.nullAsNil(localc.cNS));
      localbi.dJm = true;
      localbi.dJG = localc.dJG;
      localbi.dqp = true;
      if (localc.sKA != 1)
        break label276;
      if (localbi.dtF())
        localbi.ht(localbi.dqI | 0x400);
    }
    while (true)
    {
      ((j)g.K(j.class)).bOr().a(localbi.field_msgId, localbi);
      AppMethodBeat.o(26048);
      break;
      label276: if (localbi.dtF())
        localbi.ht(localbi.dqI & 0xFFFFFBFF);
    }
  }

  public final boolean acg()
  {
    AppMethodBeat.i(26047);
    if (this.crd != 0);
    for (int i = this.crd; ; i = this.sKr.ret)
    {
      tj localtj = new tj();
      localtj.cPF.ret = i;
      localtj.cPF.cPz = this.sKr.cPz;
      localtj.cPF.id = this.sKr.id;
      localtj.cPF.cPG = this.sKr.cPG;
      localtj.cPF.type = this.sKr.type;
      localtj.cPF.source = this.sKr.source;
      localtj.cPF.cNS = this.sKr.cNS;
      a.xxA.m(localtj);
      AppMethodBeat.o(26047);
      return false;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.translate.a.1.1
 * JD-Core Version:    0.6.2
 */