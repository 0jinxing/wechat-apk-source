package com.tencent.mm.plugin.sns.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.protocal.protobuf.bau;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.az;
import java.util.List;

final class g$7
  implements Runnable
{
  g$7(g paramg, List paramList, az paramaz)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(36142);
    long l = bo.yz();
    com.tencent.mm.plugin.sns.data.e locale = new com.tencent.mm.plugin.sns.data.e(this.qIA);
    locale.nQB = i.dc(this.qIA);
    locale.qFQ = this.qIt;
    int i = 0;
    int j = 1;
    if ((i < this.qIA.size()) && (i < 4))
    {
      bau localbau = (bau)this.qIA.get(i);
      if (af.cnA().XD(localbau.Id))
        k = 0;
      do
      {
        do
        {
          do
          {
            i++;
            j = k;
            break;
            k = j;
          }
          while (com.tencent.mm.vfs.e.ct(an.fZ(af.getAccSnsPath(), localbau.Id) + i.e(localbau)));
          k = j;
        }
        while (com.tencent.mm.vfs.e.ct(an.fZ(af.getAccSnsPath(), localbau.Id) + i.l(localbau)));
        k = j;
      }
      while (com.tencent.mm.vfs.e.ct(an.fZ(af.getAccSnsPath(), localbau.Id) + i.m(localbau)));
      localObject = af.cnA();
      if (localbau.jCt == 6);
      for (int k = 5; ; k = 1)
      {
        ((b)localObject).a(localbau, k, locale, this.qIB);
        k = 0;
        break;
      }
    }
    l = bo.az(l);
    if (l > 100L)
      ab.i("MicroMsg.LazyerImageLoader2", "fileexist check2  endtime " + l + " " + Thread.currentThread().getName() + " " + com.tencent.mm.compatible.util.e.eSl + " " + af.cnR() + " " + locale.nQB);
    if (bo.az(g.c(this.qIr)) > 60000L)
    {
      h.pYm.e(11696, new Object[] { Integer.valueOf(1), Long.valueOf(l), Integer.valueOf(0), Thread.currentThread().getName(), af.cnR(), com.tencent.mm.compatible.util.e.eSl });
      g.a(this.qIr, bo.yz());
    }
    Object localObject = i.dc(this.qIA);
    if (j != 0)
      af.bCo().post(new g.7.1(this, (String)localObject));
    AppMethodBeat.o(36142);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.model.g.7
 * JD-Core Version:    0.6.2
 */