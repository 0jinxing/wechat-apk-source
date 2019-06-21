package com.tencent.mm.plugin.monitor;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.report.kvdata.BDStatusInfo;
import com.tencent.mm.plugin.report.kvdata.TableInfo;
import com.tencent.mm.plugin.report.kvdata.log_14375;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

final class b$2
  implements Runnable
{
  b$2(b paramb, long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(84518);
    try
    {
      log_14375 locallog_14375 = new com/tencent/mm/plugin/report/kvdata/log_14375;
      locallog_14375.<init>();
      locallog_14375.type_ = 1;
      localObject1 = new com/tencent/mm/plugin/report/kvdata/BDStatusInfo;
      ((BDStatusInfo)localObject1).<init>();
      locallog_14375.dbStatusInfo_ = ((BDStatusInfo)localObject1);
      Object localObject2 = new com/tencent/mm/vfs/b;
      g.RQ();
      ((com.tencent.mm.vfs.b)localObject2).<init>(g.RP().Rw());
      l1 = ((com.tencent.mm.vfs.b)localObject2).length();
      ((BDStatusInfo)localObject1).mmDBSize_ = l1;
      localObject3 = new com/tencent/mm/vfs/b;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      g.RQ();
      ((com.tencent.mm.vfs.b)localObject3).<init>(g.RP().cachePath + "SnsMicroMsg.db");
      l2 = ((com.tencent.mm.vfs.b)localObject3).length();
      ((BDStatusInfo)localObject1).snsDBSize_ = l2;
      localObject2 = new com/tencent/mm/vfs/b;
      localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>();
      g.RQ();
      ((com.tencent.mm.vfs.b)localObject2).<init>(g.RP().cachePath + "enFavorite.db");
      l3 = ((com.tencent.mm.vfs.b)localObject2).length();
      ((BDStatusInfo)localObject1).favDBSize_ = l3;
      b.a(this.oEL, 4, l1, this.oEM);
      b.a(this.oEL, 128, l3, this.oEN);
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = l1 + ";" + l2 + ";" + l3;
      g.RQ();
      localh = g.RP().eJO;
      if ((localh == null) || (!localh.isOpen()))
      {
        ab.i("MicroMsg.SubCoreBaseMonitor", "summerreportDBInfo db is not open!");
        com.tencent.mm.plugin.report.service.h.pYm.e(13778, new Object[] { Integer.valueOf(1), Integer.valueOf(1), localObject2 });
        com.tencent.mm.plugin.report.service.h.pYm.c(14375, locallog_14375);
        com.tencent.mm.plugin.report.service.h.pYm.a(418L, 3L, 1L, true);
        ab.i("MicroMsg.SubCoreBaseMonitor", "summerreportDBInfo result[%s]", new Object[] { localObject2 });
        AppMethodBeat.o(84518);
        return;
      }
      l1 = System.currentTimeMillis();
      localObject3 = new java/util/ArrayList;
      ((ArrayList)localObject3).<init>();
      localObject4 = localh.a("SELECT name FROM sqlite_master WHERE type='table'", null, 2);
      if (localObject4 != null)
      {
        int i = ((Cursor)localObject4).getColumnIndex("name");
        while (((Cursor)localObject4).moveToNext())
          ((ArrayList)localObject3).add(((Cursor)localObject4).getString(i));
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        long l1;
        Object localObject3;
        long l2;
        long l3;
        com.tencent.mm.cd.h localh;
        ab.printErrStackTrace("MicroMsg.SubCoreBaseMonitor", localException, "reportDBInfo err!", new Object[0]);
        com.tencent.mm.plugin.report.service.h.pYm.a(418L, 4L, 1L, true);
        AppMethodBeat.o(84518);
        continue;
        ((Cursor)localObject4).close();
        Object localObject4 = new java/lang/StringBuilder;
        ((StringBuilder)localObject4).<init>();
        String str1 = localException + ";" + ((ArrayList)localObject3).size();
        ((BDStatusInfo)localObject1).mmDBTableCount_ = ((ArrayList)localObject3).size();
        localObject4 = new java/util/LinkedList;
        ((LinkedList)localObject4).<init>();
        ((BDStatusInfo)localObject1).tableList_ = ((LinkedList)localObject4);
        Object localObject1 = ((ArrayList)localObject3).iterator();
        while (((Iterator)localObject1).hasNext())
        {
          String str2 = (String)((Iterator)localObject1).next();
          Object localObject5 = localh.a("select count(*) from ".concat(String.valueOf(str2)), null, 2);
          l2 = 0L;
          l3 = l2;
          if (localObject5 != null)
          {
            if (((Cursor)localObject5).moveToFirst())
              l2 = ((Cursor)localObject5).getLong(0);
            ((Cursor)localObject5).close();
            l3 = l2;
          }
          localObject5 = new java/lang/StringBuilder;
          ((StringBuilder)localObject5).<init>();
          str1 = str1 + ";" + str2 + ":" + l3;
          localObject5 = new com/tencent/mm/plugin/report/kvdata/TableInfo;
          ((TableInfo)localObject5).<init>();
          ((TableInfo)localObject5).name_ = str2;
          ((TableInfo)localObject5).count_ = l3;
          ((LinkedList)localObject4).add(localObject5);
          if ("message".equals(str2))
            b.a(this.oEL, 8, l3, this.oEO);
          else if ("rconversation".equals(str2))
            b.a(this.oEL, 16, l3, this.oEP);
          else if ("rcontact".equals(str2))
            b.a(this.oEL, 32, l3, this.oEQ);
          else if ("chatroom".equals(str2))
            b.a(this.oEL, 64, l3, this.oER);
        }
        ab.i("MicroMsg.SubCoreBaseMonitor", "summerreportDBInfo dump all table count %d last %d", new Object[] { Integer.valueOf(((ArrayList)localObject3).size()), Long.valueOf(System.currentTimeMillis() - l1) });
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.monitor.b.2
 * JD-Core Version:    0.6.2
 */