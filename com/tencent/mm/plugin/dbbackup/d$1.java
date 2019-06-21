package com.tencent.mm.plugin.dbbackup;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.e.q;
import com.tencent.mm.model.c;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.wcdb.database.SQLiteDatabase;
import com.tencent.wcdb.repair.BackupKit;
import com.tencent.wcdb.repair.RepairKit.MasterInfo;
import java.text.SimpleDateFormat;
import java.util.Date;

final class d$1
  implements Runnable
{
  d$1(d paramd, b paramb, c paramc, String paramString1, boolean paramBoolean, SQLiteDatabase paramSQLiteDatabase, String paramString2, String paramString3, String paramString4, long[] paramArrayOfLong1, long[] paramArrayOfLong2, int paramInt, String[] paramArrayOfString, String paramString5)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(18969);
    if (!d.a(this.kIO))
    {
      if (this.kIC != null)
        this.kIC.tL(1);
      AppMethodBeat.o(18969);
    }
    while (true)
    {
      return;
      d.a(this.kIO, null);
      try
      {
        long l1 = System.nanoTime();
        Object localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
        Object localObject3 = com.tencent.mm.a.g.y((q.LK() + c.QF()).getBytes());
        localObject1 = new com/tencent/mm/vfs/b;
        ((com.tencent.mm.vfs.b)localObject1).<init>(this.kIE);
        Object localObject4;
        label158: label171: label214: long l3;
        long l4;
        label271: label286: int i;
        label333: int j;
        int k;
        if ((!this.kIF) || (!((com.tencent.mm.vfs.b)localObject1).exists()))
        {
          boolean bool = RepairKit.MasterInfo.save(this.kIG, this.kIH, (byte[])localObject3);
          localObject4 = new com/tencent/mm/vfs/b;
          ((com.tencent.mm.vfs.b)localObject4).<init>(this.kIH);
          if (bool)
          {
            ((com.tencent.mm.vfs.b)localObject1).delete();
            bool = ((com.tencent.mm.vfs.b)localObject4).o((com.tencent.mm.vfs.b)localObject1);
            l2 = System.nanoTime();
            if (!bool)
              break label905;
            localObject1 = "SUCCEEDED";
            ab.i("MicroMsg.SubCoreDBBackup", "Master table backup %s, elapsed %.3f", new Object[] { localObject1, Float.valueOf((float)(l2 - l1) / 1.0E+009F) });
            localObject1 = h.pYm;
            if (!bool)
              break label912;
            l2 = 24L;
            ((h)localObject1).a(181L, l2, 1L, false);
          }
        }
        else
        {
          localObject1 = new com/tencent/mm/vfs/b;
          ((com.tencent.mm.vfs.b)localObject1).<init>(this.kHX);
          l3 = ((com.tencent.mm.vfs.b)localObject1).length();
          localObject1 = new com/tencent/mm/vfs/b;
          ((com.tencent.mm.vfs.b)localObject1).<init>(this.kII);
          l4 = ((com.tencent.mm.vfs.b)localObject1).length();
          if (!this.kIF)
            break label920;
          localObject1 = "incremental";
          if (this.kIJ == null)
            break label927;
          l2 = this.kIJ[0];
          ab.i("MicroMsg.SubCoreDBBackup", "Backup started [%s, cursor: %d ~ %d]", new Object[] { localObject1, Long.valueOf(l2), Long.valueOf(this.kIK[0]) });
          if (!this.kIF)
            break label933;
          i = 10011;
          h localh2 = h.pYm;
          localObject1 = this.kIO.kIy;
          localObject4 = new java/util/Date;
          ((Date)localObject4).<init>();
          localh2.e(11098, new Object[] { Integer.valueOf(i), String.format("%d|%d|%s", new Object[] { Long.valueOf(l3), Long.valueOf(l4), ((SimpleDateFormat)localObject1).format((Date)localObject4) }) });
          localObject4 = this.kIO;
          localObject1 = new com/tencent/wcdb/repair/BackupKit;
          ((BackupKit)localObject1).<init>(this.kIG, this.kII, (byte[])localObject3, this.kIL, this.kIM);
          d.a((d)localObject4, (BackupKit)localObject1);
          j = d.b(this.kIO).run();
          l1 = System.nanoTime() - l1;
          localObject3 = new com/tencent/mm/vfs/b;
          ((com.tencent.mm.vfs.b)localObject3).<init>(this.kII);
          l2 = ((com.tencent.mm.vfs.b)localObject3).length();
          if (j != 0)
            break label953;
          d.b(this.kHX, this.kIK);
          localObject1 = new com/tencent/mm/vfs/b;
          ((com.tencent.mm.vfs.b)localObject1).<init>(this.kIN);
          ((com.tencent.mm.vfs.b)localObject1).delete();
          ((com.tencent.mm.vfs.b)localObject3).o((com.tencent.mm.vfs.b)localObject1);
          if (!this.kIF)
            break label941;
          i = 19;
          k = 10012;
          label548: if (!this.kIF)
            break label1027;
          localObject3 = "incremental";
          label559: if (j != 0)
            break label1035;
          localObject1 = "succeeded";
        }
        while (true)
        {
          ab.i("MicroMsg.SubCoreDBBackup", "Database %s backup %s, elapsed %.2f seconds.", new Object[] { localObject3, localObject1, Float.valueOf((float)l1 / 1.0E+009F) });
          h.pYm.a(181L, i, 1L, false);
          localObject4 = h.pYm;
          i = d.b(this.kIO).statementCount();
          l1 /= 1000000L;
          localObject1 = this.kIO.kIy;
          localObject3 = new java/util/Date;
          ((Date)localObject3).<init>();
          ((h)localObject4).e(11098, new Object[] { Integer.valueOf(k), String.format("%d|%d|%d|%d|%d|%s", new Object[] { Long.valueOf(l3), Long.valueOf(l4), Long.valueOf(l2), Integer.valueOf(i), Long.valueOf(l1), ((SimpleDateFormat)localObject1).format((Date)localObject3) }) });
          if (this.kIC != null)
            this.kIC.tL(j);
          d.b(this.kIO).release();
          d.a(this.kIO, null);
          localObject1 = new java/lang/StringBuilder;
          ((StringBuilder)localObject1).<init>();
          com.tencent.mm.kernel.g.RQ();
          com.tencent.mm.vfs.e.tf(com.tencent.mm.kernel.g.RP().eJM + "dbback");
          localObject1 = this.kIE;
          localObject3 = new java/lang/StringBuilder;
          ((StringBuilder)localObject3).<init>();
          com.tencent.mm.kernel.g.RQ();
          com.tencent.mm.vfs.e.y((String)localObject1, com.tencent.mm.kernel.g.RP().eJM + "dbback/EnMicroMsg.db.sm");
          if (d.b(this.kIO) != null)
          {
            d.b(this.kIO).release();
            d.a(this.kIO, null);
          }
          d.c(this.kIO);
          AppMethodBeat.o(18969);
          break;
          ((com.tencent.mm.vfs.b)localObject4).delete();
          break label158;
          label905: localObject1 = "FAILED";
          break label171;
          label912: l2 = 25L;
          break label214;
          label920: localObject1 = "new";
          break label271;
          label927: l2 = 0L;
          break label286;
          label933: i = 10000;
          break label333;
          label941: i = 16;
          k = 10001;
          break label548;
          label953: ((com.tencent.mm.vfs.b)localObject3).delete();
          if (j == 1)
          {
            if (this.kIF)
            {
              i = 20;
              k = 10013;
              break label548;
            }
            i = 17;
            k = 10002;
            break label548;
          }
          if (this.kIF)
          {
            i = 21;
            k = 10014;
            break label548;
          }
          i = 18;
          k = 10003;
          break label548;
          label1027: localObject3 = "new";
          break label559;
          label1035: if (j == 1)
            localObject1 = "canceled";
          else
            localObject1 = "failed";
        }
      }
      catch (Exception localException)
      {
        ab.printErrStackTrace("MicroMsg.SubCoreDBBackup", localException, "Failed to start database backup, path: %s", new Object[] { this.kHX });
        if (this.kIC != null)
          this.kIC.tL(-1);
        h localh1 = h.pYm;
        if (this.kIF);
        for (long l2 = 18L; ; l2 = 21L)
        {
          localh1.a(181L, l2, 1L, false);
          if (d.b(this.kIO) != null)
          {
            d.b(this.kIO).release();
            d.a(this.kIO, null);
          }
          d.c(this.kIO);
          AppMethodBeat.o(18969);
          break;
        }
      }
      finally
      {
        if (d.b(this.kIO) != null)
        {
          d.b(this.kIO).release();
          d.a(this.kIO, null);
        }
        d.c(this.kIO);
        AppMethodBeat.o(18969);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.dbbackup.d.1
 * JD-Core Version:    0.6.2
 */