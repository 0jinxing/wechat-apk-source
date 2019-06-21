package com.tencent.mm.plugin.monitor;

import android.os.StatFs;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.e;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bd;
import com.tencent.mm.storage.ac;
import java.io.File;

final class b$5
  implements Runnable
{
  b$5(b paramb)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(84521);
    try
    {
      Object localObject1 = new com/tencent/mm/vfs/b;
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      ((com.tencent.mm.vfs.b)localObject1).<init>(ac.eSj + "SdcardInfo.cfg");
      localObject2 = com.tencent.mm.plugin.report.service.h.pYm;
      int m;
      label343: long l16;
      label591: label618: int n;
      label648: label656: int i1;
      if (((com.tencent.mm.vfs.b)localObject1).exists())
      {
        l1 = 10L;
        ((com.tencent.mm.plugin.report.service.h)localObject2).a(340L, l1, 1L, true);
        boolean bool1 = bd.dpr();
        localObject2 = com.tencent.mm.compatible.util.h.getDataDirectory().getPath();
        Object localObject3 = com.tencent.mm.compatible.util.h.getExternalStorageDirectory().getPath();
        Object localObject4 = new android/os/StatFs;
        ((StatFs)localObject4).<init>((String)localObject2);
        long l2 = ((StatFs)localObject4).getBlockSize();
        long l3 = ((StatFs)localObject4).getBlockCount();
        long l4 = ((StatFs)localObject4).getAvailableBlocks();
        long l5 = l2 * l3;
        long l6 = l2 * l4;
        if (l3 <= 0L)
          break label1255;
        i = Math.round((float)l4 * 100.0F / (float)l3);
        localObject4 = new android/os/StatFs;
        ((StatFs)localObject4).<init>((String)localObject3);
        l7 = ((StatFs)localObject4).getBlockSize();
        l8 = ((StatFs)localObject4).getBlockCount();
        l9 = ((StatFs)localObject4).getAvailableBlocks();
        l10 = l7 * l8;
        l11 = l7 * l9;
        j = -1;
        if (l8 > 0L)
          j = Math.round((float)l9 * 100.0F / (float)l8);
        boolean bool2 = e.eSl.equals(localObject3);
        if (bool2)
          break label1229;
        localObject4 = new android/os/StatFs;
        ((StatFs)localObject4).<init>(e.eSl);
        l12 = ((StatFs)localObject4).getBlockSize();
        l13 = ((StatFs)localObject4).getBlockCount();
        l14 = ((StatFs)localObject4).getAvailableBlocks();
        l15 = l12 * l13;
        l1 = l12 * l14;
        if (l13 <= 0L)
          break label1222;
        k = Math.round((float)l14 * 100.0F / (float)l13);
        localObject4 = bd.amQ(e.eSl);
        String str1 = bd.amQ((String)localObject2);
        Object localObject5 = e.eSl;
        if (!((com.tencent.mm.vfs.b)localObject1).exists())
          break label1135;
        m = 1;
        ab.i("MicroMsg.SubCoreBaseMonitor", "summerStorage [%s, %s, %s] [%s] [%b] [%d,%d,%d,%d,%d,%d] [%d,%d,%d,%d,%d,%d] [%b] [%d,%d,%d,%d,%d,%d], [%d][%s]", new Object[] { localObject2, localObject3, localObject5, localObject4, Boolean.valueOf(bool1), Long.valueOf(l2), Long.valueOf(l3), Long.valueOf(l4), Long.valueOf(l5), Long.valueOf(l6), Integer.valueOf(i), Long.valueOf(l7), Long.valueOf(l8), Long.valueOf(l9), Long.valueOf(l10), Long.valueOf(l11), Integer.valueOf(j), Boolean.valueOf(bool2), Long.valueOf(l12), Long.valueOf(l13), Long.valueOf(l14), Long.valueOf(l15), Long.valueOf(l1), Integer.valueOf(k), Integer.valueOf(m), str1 });
        com.tencent.mm.plugin.report.service.h.pYm.a(340L, 0L, 1L, true);
        localObject5 = com.tencent.mm.plugin.report.service.h.pYm;
        if (!bool1)
          break label1141;
        l16 = 1L;
        ((com.tencent.mm.plugin.report.service.h)localObject5).a(340L, l16, 1L, true);
        localObject5 = com.tencent.mm.plugin.report.service.h.pYm;
        if (!bool2)
          break label1149;
        l16 = 3L;
        ((com.tencent.mm.plugin.report.service.h)localObject5).a(340L, l16, 1L, true);
        localObject5 = com.tencent.mm.plugin.report.service.h.pYm;
        String str2 = e.eSl;
        if (!bool1)
          break label1157;
        m = 1;
        if (!bool2)
          break label1163;
        n = 1;
        if (!((com.tencent.mm.vfs.b)localObject1).exists())
          break label1169;
        i1 = 1;
        label666: ((com.tencent.mm.plugin.report.service.h)localObject5).e(11098, new Object[] { Integer.valueOf(5000), String.format("%s;%s;%s;%s;%d;%d;%d;%d;%d;%d;%d;%d;%d;%d;%d;%d;%d;%d;%d;%d;%d;%d;%d;%d;%d;%s", new Object[] { localObject2, localObject3, str2, localObject4, Integer.valueOf(m), Long.valueOf(l2), Long.valueOf(l3), Long.valueOf(l4), Long.valueOf(l5), Long.valueOf(l6), Integer.valueOf(i), Long.valueOf(l7), Long.valueOf(l8), Long.valueOf(l9), Long.valueOf(l10), Long.valueOf(l11), Integer.valueOf(j), Integer.valueOf(n), Long.valueOf(l12), Long.valueOf(l13), Long.valueOf(l14), Long.valueOf(l15), Long.valueOf(l1), Integer.valueOf(k), Integer.valueOf(i1), str1 }) });
        localObject3 = com.tencent.mm.plugin.report.service.h.pYm;
        localObject5 = new java/lang/StringBuilder;
        ((StringBuilder)localObject5).<init>();
        ((com.tencent.mm.plugin.report.service.h)localObject3).e(11098, new Object[] { Integer.valueOf(5001), (String)localObject2 + ";" + str1 });
        localObject3 = com.tencent.mm.plugin.report.service.h.pYm;
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        ((com.tencent.mm.plugin.report.service.h)localObject3).e(11098, new Object[] { Integer.valueOf(5002), e.eSl + ";" + (String)localObject4 });
        localObject2 = com.tencent.mm.plugin.report.service.h.pYm;
        if (!((com.tencent.mm.vfs.b)localObject1).exists())
          break label1175;
        j = 1;
        label1040: ((com.tencent.mm.plugin.report.service.h)localObject2).e(11098, new Object[] { Integer.valueOf(5003), Integer.valueOf(j) });
        localObject1 = com.tencent.mm.plugin.report.service.h.pYm;
        if (!bool1)
          break label1181;
      }
      label1157: label1163: label1169: label1175: label1181: for (j = 1; ; j = 0)
      {
        ((com.tencent.mm.plugin.report.service.h)localObject1).e(11098, new Object[] { Integer.valueOf(5004), Integer.valueOf(j) });
        com.tencent.mm.plugin.report.service.h.pYm.a(340L, 7L, 1L, true);
        AppMethodBeat.o(84521);
        return;
        l1 = 11L;
        break;
        label1135: m = 0;
        break label343;
        label1141: l16 = 2L;
        break label591;
        label1149: l16 = 4L;
        break label618;
        m = 0;
        break label648;
        n = 0;
        break label656;
        i1 = 0;
        break label666;
        j = 0;
        break label1040;
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        long l7;
        long l8;
        long l9;
        long l10;
        long l11;
        int j;
        ab.printErrStackTrace("MicroMsg.SubCoreBaseMonitor", localException, "reportSDStatus err!", new Object[0]);
        com.tencent.mm.plugin.report.service.h.pYm.a(340L, 8L, 1L, true);
        AppMethodBeat.o(84521);
        continue;
        label1222: int k = j;
        continue;
        label1229: k = j;
        long l1 = l11;
        long l15 = l10;
        long l14 = l9;
        long l13 = l8;
        long l12 = l7;
        continue;
        label1255: int i = -1;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.monitor.b.5
 * JD-Core Version:    0.6.2
 */