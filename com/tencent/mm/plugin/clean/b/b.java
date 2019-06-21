package com.tencent.mm.plugin.clean.b;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.plugin.clean.c.i;
import com.tencent.mm.pointers.PLong;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bi;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public final class b
  implements Runnable
{
  private long kvY = 0L;
  private List<String> kwc;
  private List<i> kwd;
  private com.tencent.mm.plugin.clean.c.h kwe;

  public b(List<String> paramList, List<i> paramList1, com.tencent.mm.plugin.clean.c.h paramh)
  {
    this.kwc = paramList;
    this.kwd = paramList1;
    this.kwe = paramh;
  }

  private String aZk()
  {
    AppMethodBeat.i(18662);
    String str = hashCode();
    AppMethodBeat.o(18662);
    return str;
  }

  private void bm(List<com.tencent.mm.plugin.f.b.a> paramList)
  {
    AppMethodBeat.i(18660);
    int i = paramList.size();
    HashSet localHashSet = new HashSet();
    aw.ZK();
    long l1 = c.Ru().iV(Thread.currentThread().getId());
    for (int j = 0; j < i; j++)
    {
      com.tencent.mm.plugin.f.b.a locala = (com.tencent.mm.plugin.f.b.a)paramList.get(j);
      long l2 = bo.yz();
      if (!localHashSet.contains(Long.valueOf(locala.field_msgId)))
      {
        aw.ZK();
        bi localbi = c.XO().jf(locala.field_msgId);
        if ((localbi.field_msgId != 0L) && (!localbi.dtH()))
        {
          com.tencent.mm.plugin.f.b localb = com.tencent.mm.plugin.f.b.aZc();
          long l3 = locala.field_msgId;
          localb.jZK = true;
          localb.jZJ.add(Long.valueOf(l3));
          ab.d("MicroMsg.CalcWxService", "%d lock msg change [%d] [%s]", new Object[] { Integer.valueOf(localb.hashCode()), Long.valueOf(l3), bo.dpG() });
          localbi.dtI();
          aw.ZK();
          c.XO().a(locala.field_msgId, localbi);
        }
        localHashSet.add(Long.valueOf(locala.field_msgId));
        ab.d("MicroMsg.DeleteFileByWxIndex", "%s deleteByIndex handle msg[%d]", new Object[] { aZk(), Long.valueOf(bo.az(l2)) });
      }
      if ((locala != null) && (!com.tencent.mm.plugin.f.a.sJ(locala.field_msgSubType)) && (locala.field_size > 0L))
      {
        this.kvY += locala.field_size;
        com.tencent.mm.vfs.e.deleteFile(g.RP().eJL + locala.field_path);
        locala.field_path = "";
        locala.field_size = 0L;
        com.tencent.mm.plugin.f.b.aZc().aZd().a(locala.xDa, locala, false);
      }
      ab.d("MicroMsg.DeleteFileByWxIndex", "%s deleteByIndex[%d]", new Object[] { aZk(), Long.valueOf(bo.az(l2)) });
    }
    aw.ZK();
    c.Ru().mB(l1);
    AppMethodBeat.o(18660);
  }

  public final void run()
  {
    AppMethodBeat.i(18661);
    int i;
    int j;
    long l3;
    Object localObject2;
    if (this.kwc != null)
    {
      long l1 = bo.yz();
      i = this.kwc.size();
      Iterator localIterator = this.kwc.iterator();
      j = 0;
      while (localIterator.hasNext())
      {
        String str1 = (String)localIterator.next();
        if (!bo.isNullOrNil(str1))
        {
          long l2 = bo.yz();
          PLong localPLong1 = new PLong();
          PLong localPLong2 = new PLong();
          Object localObject1 = com.tencent.mm.plugin.f.b.aZc().aZd();
          l3 = bo.yz();
          String str2 = "select max(msgtime), min(msgtime) from WxFileIndex2 where username='" + str1 + "' and msgSubType in (1,20,23,30,32,34 ) and size > 0 ";
          localObject2 = null;
          Object localObject3 = null;
          long l5;
          try
          {
            localObject1 = ((com.tencent.mm.plugin.f.b.b)localObject1).bSd.rawQuery(str2, null);
            if (localObject1 != null)
            {
              localObject3 = localObject1;
              localObject2 = localObject1;
              if (((Cursor)localObject1).moveToFirst())
              {
                localObject3 = localObject1;
                localObject2 = localObject1;
                localPLong1.value = ((Cursor)localObject1).getLong(0);
                localObject3 = localObject1;
                localObject2 = localObject1;
                localPLong2.value = ((Cursor)localObject1).getLong(1);
              }
            }
            if (localObject1 != null)
              ((Cursor)localObject1).close();
            ab.i("MicroMsg.WxFileIndexStorage", "getNoThumbMediaMsgTimeByUsername [%s] cost[%d]", new Object[] { str1, Long.valueOf(bo.az(l3)) });
            localPLong2.value -= 1L;
            long l4 = localPLong1.value;
            l5 = Math.max(l4 - 2592000000L, localPLong2.value);
            l3 = l5;
            if (l5 == l4)
              l3 = l5 - 1L;
            localObject2 = com.tencent.mm.plugin.f.b.aZc().aZd().j(str1, l4, l3);
            l5 = ((List)localObject2).size() + 0L;
            bm((List)localObject2);
            for (l4 = l3; l4 > localPLong2.value; l4 = l3)
            {
              long l6 = Math.max(l4 - 2592000000L, localPLong2.value);
              l3 = l6;
              if (l6 == l4)
                l3 = l6 - 1L;
              localObject2 = com.tencent.mm.plugin.f.b.aZc().aZd().j(str1, l4, l3);
              l5 += ((List)localObject2).size();
              bm((List)localObject2);
            }
          }
          catch (Exception localException)
          {
            while (true)
            {
              localObject2 = localObject3;
              ab.printErrStackTrace("MicroMsg.WxFileIndexStorage", localException, " sql [%s]", new Object[] { str2 });
              if (localObject3 != null)
                localObject3.close();
            }
          }
          finally
          {
            if (localObject2 != null)
              ((Cursor)localObject2).close();
            AppMethodBeat.o(18661);
          }
          ab.i("MicroMsg.DeleteFileByWxIndex", "%s deleteByName [%s] [%d] [%d %d] cost[%d]", new Object[] { aZk(), str1, Long.valueOf(l5), Long.valueOf(localPLong2.value), Long.valueOf(localPLong1.value), Long.valueOf(bo.az(l2)) });
        }
        j++;
        if (this.kwe != null)
          this.kwe.dP(j, i);
      }
      if (this.kwe != null)
        this.kwe.hi(this.kvY);
      com.tencent.mm.plugin.f.b.aZc().aZh();
      ab.i("MicroMsg.DeleteFileByWxIndex", "%s deleteByUsername cost[%d]", new Object[] { aZk(), Long.valueOf(bo.az(l1)) });
      AppMethodBeat.o(18661);
    }
    while (true)
    {
      return;
      if (this.kwd != null)
      {
        l3 = bo.yz();
        i = this.kwd.size();
        localObject2 = this.kwd.iterator();
        j = 0;
        while (((Iterator)localObject2).hasNext())
        {
          bm(((i)((Iterator)localObject2).next()).kwH);
          j++;
          if (this.kwe != null)
            this.kwe.dP(j, i);
        }
        if (this.kwe != null)
          this.kwe.hi(this.kvY);
        com.tencent.mm.plugin.f.b.aZc().aZh();
        ab.i("MicroMsg.DeleteFileByWxIndex", "%s deleteByNewAnalyseItem cost[%d]", new Object[] { aZk(), Long.valueOf(bo.az(l3)) });
        AppMethodBeat.o(18661);
      }
      else
      {
        AppMethodBeat.o(18661);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.clean.b.b
 * JD-Core Version:    0.6.2
 */