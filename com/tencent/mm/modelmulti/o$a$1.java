package com.tencent.mm.modelmulti;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.a;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.zero.c;
import com.tencent.mm.protocal.protobuf.bek;
import com.tencent.mm.protocal.protobuf.tb;
import com.tencent.mm.protocal.protobuf.tc;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap.a;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.LinkedList;

final class o$a$1
  implements ap.a
{
  o$a$1(o.a parama)
  {
  }

  public final boolean BI()
  {
    AppMethodBeat.i(58399);
    if ((g.RK()) && (!a.QT()))
    {
      g.RQ();
      if (g.RP() != null)
      {
        g.RQ();
        if (g.RP().Ry() != null)
          break label118;
      }
    }
    Object localObject = this.fJt.fJr;
    boolean bool1 = g.RK();
    boolean bool2 = a.QT();
    g.RQ();
    ab.e("MicroMsg.SyncService", "processResp %s accready:%s hold:%s accstg:%s ", new Object[] { localObject, Boolean.valueOf(bool1), Boolean.valueOf(bool2), g.RP() });
    this.fJt.fJq.lO(0);
    bool2 = false;
    AppMethodBeat.o(58399);
    while (true)
    {
      return bool2;
      label118: localObject = this.fJt.fJp.vTR.jBw;
      c localc = new c();
      localc.ca(this.fJt.fJr);
      long l1 = bo.anU();
      long l2;
      do
      {
        if (this.fJt.fHZ >= ((LinkedList)localObject).size())
          break;
        ((LinkedList)localObject).size();
        if (!localc.a((tb)((LinkedList)localObject).get(this.fJt.fHZ), false))
          com.tencent.mm.plugin.report.e.pXa.a(99L, 46L, 1L, false);
        o.a locala = this.fJt;
        locala.fHZ += 1;
        l2 = bo.gb(l1);
        ab.i("MicroMsg.SyncService", "processResp %s time:%s size:%s index:%s", new Object[] { this.fJt.fJr, Long.valueOf(l2), Integer.valueOf(((LinkedList)localObject).size()), Integer.valueOf(this.fJt.fHZ - 1) });
      }
      while (l2 < 500L);
      localc.cc(this.fJt.fJr);
      if (this.fJt.fHZ < ((LinkedList)localObject).size())
      {
        ab.i("MicroMsg.SyncService", "processResp %s time:%s size:%s index:%s Shold Continue.", new Object[] { this.fJt.fJr, Long.valueOf(bo.gb(l1)), Integer.valueOf(((LinkedList)localObject).size()), Integer.valueOf(this.fJt.fHZ - 1) });
        bool2 = true;
        AppMethodBeat.o(58399);
      }
      else
      {
        o.a(this.fJt.fJo, this.fJt.fJp, this.fJt.fJr);
        this.fJt.fJq.lO(((LinkedList)localObject).size());
        bool2 = false;
        AppMethodBeat.o(58399);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelmulti.o.a.1
 * JD-Core Version:    0.6.2
 */