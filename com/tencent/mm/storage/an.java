package com.tencent.mm.storage;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.LinkedList;
import java.util.List;

final class an
{
  protected final long xXI;
  private am xXJ;

  public an()
  {
    AppMethodBeat.i(1266);
    this.xXI = 86400L;
    this.xXJ = new am();
    Object localObject = new StringBuilder();
    g.RQ();
    localObject = com.tencent.mm.vfs.e.e(g.RP().cachePath + "checkmsgid.ini", 0, -1);
    if (!bo.cb((byte[])localObject));
    while (true)
    {
      try
      {
        this.xXJ.parseFrom((byte[])localObject);
        if (dsW())
          dsV();
        AppMethodBeat.o(1266);
        return;
      }
      catch (Exception localException)
      {
        ab.w("MicroMsg.DelSvrIdMgr", "DelSvrIDs parse Error");
        ab.e("MicroMsg.DelSvrIdMgr", "exception:%s", new Object[] { bo.l(localException) });
      }
      AppMethodBeat.o(1266);
    }
  }

  private void dsV()
  {
    AppMethodBeat.i(1267);
    ab.i("MicroMsg.DelSvrIdMgr", "summerdel toFile tid[%d] [%d, %d ,%d] stack[%s]", new Object[] { Long.valueOf(Thread.currentThread().getId()), Integer.valueOf(this.xXJ.xXF.size()), Integer.valueOf(this.xXJ.xXG.size()), Integer.valueOf(this.xXJ.xXH.size()), bo.dpG() });
    try
    {
      this.xXJ.xXE.clear();
      this.xXJ.xXD.clear();
      this.xXJ.xXC.clear();
      am localam = new com/tencent/mm/storage/am;
      localam.<init>();
      localam.xXF.addAll(this.xXJ.xXF);
      localam.xXG.addAll(this.xXJ.xXG);
      localam.xXH.addAll(this.xXJ.xXH);
      byte[] arrayOfByte = localam.toByteArray();
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      g.RQ();
      com.tencent.mm.vfs.e.b(g.RP().cachePath + "checkmsgid.ini", arrayOfByte, arrayOfByte.length);
      int i = localam.xXF.size();
      int j = localam.xXG.size();
      int k = localam.xXH.size();
      if (arrayOfByte == null);
      for (int m = -1; ; m = arrayOfByte.length)
      {
        ab.i("MicroMsg.DelSvrIdMgr", "summerdel toFile done [%d, %d, %d] data len[%d]", new Object[] { Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k), Integer.valueOf(m) });
        AppMethodBeat.o(1267);
        return;
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        com.tencent.mm.plugin.report.e.pXa.a(111L, 168L, 1L, false);
        ab.printErrStackTrace("MicroMsg.DelSvrIdMgr", localException, "summerdel ", new Object[0]);
        AppMethodBeat.o(1267);
      }
    }
  }

  private boolean dsW()
  {
    boolean bool = false;
    AppMethodBeat.i(1272);
    ab.v("MicroMsg.DelSvrIdMgr", "checkOldData todayIndex:%d, t0Size:%d, t1Size:%d, t2Size:%d", new Object[] { Integer.valueOf(this.xXJ.xXB), Integer.valueOf(this.xXJ.xXF.size()), Integer.valueOf(this.xXJ.xXG.size()), Integer.valueOf(this.xXJ.xXH.size()) });
    int i = (int)(bo.anT() / 86400L);
    int j = this.xXJ.xXB;
    this.xXJ.xXB = i;
    switch (i - j)
    {
    default:
      this.xXJ.xXH.clear();
      this.xXJ.xXG.clear();
      this.xXJ.xXF.clear();
      AppMethodBeat.o(1272);
      bool = true;
    case 0:
    case 1:
    case 2:
    }
    while (true)
    {
      return bool;
      AppMethodBeat.o(1272);
      continue;
      this.xXJ.xXH = this.xXJ.xXG;
      this.xXJ.xXG = this.xXJ.xXF;
      this.xXJ.xXF.clear();
      AppMethodBeat.o(1272);
      bool = true;
      continue;
      this.xXJ.xXH = this.xXJ.xXF;
      this.xXJ.xXG.clear();
      this.xXJ.xXF.clear();
      AppMethodBeat.o(1272);
      bool = true;
    }
  }

  protected final void b(int paramInt, long paramLong1, long paramLong2, boolean paramBoolean)
  {
    AppMethodBeat.i(1270);
    if (paramLong1 == 0L)
    {
      AppMethodBeat.o(1270);
      return;
    }
    if (paramBoolean)
      dsW();
    paramInt -= (int)(paramLong2 / 86400L);
    switch (paramInt)
    {
    default:
      ab.e("MicroMsg.DelSvrIdMgr", "should not add to thease lists, dayIndex:%d", new Object[] { Integer.valueOf(paramInt) });
    case 0:
    case 1:
    case 2:
    }
    while (true)
    {
      if (paramBoolean)
        dsV();
      AppMethodBeat.o(1270);
      break;
      this.xXJ.xXF.add(Long.valueOf(paramLong1));
      continue;
      this.xXJ.xXG.add(Long.valueOf(paramLong1));
      continue;
      this.xXJ.xXH.add(Long.valueOf(paramLong1));
    }
  }

  protected final void m(int paramInt, long paramLong1, long paramLong2)
  {
    AppMethodBeat.i(1269);
    b(paramInt, paramLong1, paramLong2, true);
    AppMethodBeat.o(1269);
  }

  protected final boolean mR(long paramLong)
  {
    AppMethodBeat.i(1268);
    if (dsW())
      dsV();
    boolean bool;
    if ((this.xXJ.xXF.contains(Long.valueOf(paramLong))) || (this.xXJ.xXG.contains(Long.valueOf(paramLong))) || (this.xXJ.xXH.contains(Long.valueOf(paramLong))))
    {
      bool = true;
      AppMethodBeat.o(1268);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(1268);
    }
  }

  protected final void p(List<Integer> paramList, List<Long> paramList1)
  {
    AppMethodBeat.i(1271);
    ab.i("MicroMsg.DelSvrIdMgr", "add size:%d", new Object[] { Integer.valueOf(paramList.size()) });
    dsW();
    int i = (int)(bo.anT() / 86400L);
    for (int j = 0; j < paramList.size(); j++)
      b(i, ((Integer)paramList.get(j)).intValue(), ((Long)paramList1.get(j)).longValue(), false);
    dsV();
    AppMethodBeat.o(1271);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.storage.an
 * JD-Core Version:    0.6.2
 */