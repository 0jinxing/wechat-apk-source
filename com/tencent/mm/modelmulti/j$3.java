package com.tencent.mm.modelmulti;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.report.e;
import com.tencent.mm.plugin.zero.c;
import com.tencent.mm.protocal.protobuf.SKBuiltinBuffer_t;
import com.tencent.mm.protocal.protobuf.bek;
import com.tencent.mm.protocal.protobuf.tb;
import com.tencent.mm.protocal.protobuf.tc;
import com.tencent.mm.protocal.t.b;
import com.tencent.mm.sdk.a.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap.a;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.LinkedList;

final class j$3
  implements ap.a
{
  private int fIJ = 0;
  private long fIK = 0L;
  private int fIL = 0;

  j$3(j paramj)
  {
  }

  public final boolean BI()
  {
    AppMethodBeat.i(58381);
    Object localObject1 = new c();
    boolean bool;
    if (!g.RK())
    {
      ab.e(j.b(this.fIH), "syncRespHandler acc is not ready STOP :%s", new Object[] { j.c(this.fIH) });
      j.d(this.fIH);
      bool = false;
      AppMethodBeat.o(58381);
    }
    while (true)
    {
      return bool;
      if (j.e(this.fIH))
      {
        ((c)localObject1).cd(this.fIH);
        j.d(this.fIH);
        bool = false;
        AppMethodBeat.o(58381);
      }
      else if ((j.c(this.fIH) == null) || (j.c(this.fIH).vyH.vTR == null) || (j.c(this.fIH).vyH.vTR.jBw == null))
      {
        ab.e(j.b(this.fIH), "syncRespHandler CmdList is null! Stop Processing :%s", new Object[] { j.c(this.fIH) });
        ((c)localObject1).cd(this.fIH);
        j.d(this.fIH);
        bool = false;
        AppMethodBeat.o(58381);
      }
      else
      {
        Object localObject2 = j.c(this.fIH).vyH.vTR.jBw;
        ((c)localObject1).ca(this.fIH);
        this.fIL += 1;
        long l1 = bo.anU();
        for (int i = 0; ; i++)
        {
          if (i >= 5)
            break label1092;
          if (this.fIJ < ((LinkedList)localObject2).size())
          {
            ab.v(j.b(this.fIH), "syncRespHandler i:%d curidx:%d size:%d cmdid:%d cmdbuf:%d", new Object[] { Integer.valueOf(i), Integer.valueOf(this.fIJ), Integer.valueOf(((LinkedList)localObject2).size()), Integer.valueOf(((tb)((LinkedList)localObject2).get(this.fIJ)).wat), Integer.valueOf(((tb)((LinkedList)localObject2).get(this.fIJ)).wau.getILen()) });
            ((LinkedList)localObject2).size();
            if (!((c)localObject1).a((tb)((LinkedList)localObject2).get(this.fIJ), false))
              ab.w(j.b(this.fIH), "DoCmd Failed index:%d", new Object[] { Integer.valueOf(this.fIJ) });
            this.fIJ += 1;
          }
          if (this.fIJ >= ((LinkedList)localObject2).size())
          {
            this.fIK += bo.gb(l1);
            l2 = bo.gb(j.f(this.fIH));
            ab.i(j.b(this.fIH), "syncRespHandler process DONE idx:%d size:%d time[%d,%d] count:%d %s", new Object[] { Integer.valueOf(this.fIJ), Integer.valueOf(((LinkedList)localObject2).size()), Long.valueOf(l2), Long.valueOf(this.fIK), Integer.valueOf(this.fIL), j.c(this.fIH) });
            this.fIH.a(j.c(this.fIH));
            ((c)localObject1).cc(this.fIH);
            i = bo.h((Integer)e.a((int)this.fIK, new int[] { 100, 300, 1000, 3000 }, new Integer[] { Integer.valueOf(240), Integer.valueOf(239), Integer.valueOf(238), Integer.valueOf(237), Integer.valueOf(236) }));
            e.pXa.a(99L, i, 1L, false);
            i = bo.h((Integer)e.a(((LinkedList)localObject2).size(), new int[] { 0, 1, 2, 3, 5, 10 }, new Integer[] { Integer.valueOf(249), Integer.valueOf(248), Integer.valueOf(247), Integer.valueOf(246), Integer.valueOf(245), Integer.valueOf(244), Integer.valueOf(243) }));
            e.pXa.a(99L, i, 1L, false);
            localObject1 = e.pXa;
            label783: int j;
            int k;
            int m;
            int n;
            if (b.foreground)
            {
              l1 = 241L;
              ((e)localObject1).a(99L, l1, 1L, false);
              e.pXa.a(99L, j.g(this.fIH), 1L, false);
              e.pXa.a(99L, 0L, 1L, false);
              localObject1 = e.pXa;
              j = ((LinkedList)localObject2).size();
              k = j.g(this.fIH);
              m = j.c(this.fIH).vyH.vQe;
              l1 = this.fIK;
              n = this.fIL;
              localObject2 = j.h(this.fIH);
              if (!b.foreground)
                break label988;
            }
            label988: for (i = 1; ; i = 2)
            {
              ((e)localObject1).e(12063, new Object[] { Integer.valueOf(j), Long.valueOf(l2), Integer.valueOf(k), Integer.valueOf(m), Long.valueOf(l1), Integer.valueOf(n), localObject2, Integer.valueOf(i) });
              j.d(this.fIH);
              bool = false;
              AppMethodBeat.o(58381);
              break;
              l1 = 242L;
              break label783;
            }
          }
          long l2 = bo.gb(l1);
          if (l2 > 500L)
          {
            ab.d(j.b(this.fIH), "syncRespHandler PAUSE by 500ms  time:%d  processcount:%d sum:%d ,%s", new Object[] { Long.valueOf(l2), Integer.valueOf(i), Integer.valueOf(this.fIJ), j.c(this.fIH) });
            this.fIK += bo.gb(l1);
            bool = true;
            AppMethodBeat.o(58381);
            break;
          }
        }
        label1092: this.fIK += bo.gb(l1);
        bool = true;
        AppMethodBeat.o(58381);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelmulti.j.3
 * JD-Core Version:    0.6.2
 */