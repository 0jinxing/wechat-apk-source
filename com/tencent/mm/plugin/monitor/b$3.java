package com.tencent.mm.plugin.monitor;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.protocal.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import java.text.SimpleDateFormat;
import java.util.Date;

final class b$3
  implements Runnable
{
  b$3(b paramb)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(84519);
    try
    {
      g.RQ();
      int i = ((Integer)g.RP().Ry().get(ac.a.xPx, Integer.valueOf(0))).intValue();
      g.RQ();
      long l1 = ((Long)g.RP().Ry().get(ac.a.xPw, Long.valueOf(0L))).longValue();
      long l2 = b.r(this.oEL);
      Object localObject;
      if ((i > 0) && (d.vxo != i))
      {
        j = 0;
        localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>();
        localObject = ((StringBuilder)localObject).append(i).append(";").append(d.vxo).append(";");
        if (j == 0)
          break label260;
      }
      label260: for (int j = 1; ; j = 0)
      {
        localObject = ((StringBuilder)localObject).append(j).append(";");
        SimpleDateFormat localSimpleDateFormat = new java/text/SimpleDateFormat;
        localSimpleDateFormat.<init>("yyyyMMdd");
        Date localDate = new java/util/Date;
        localDate.<init>(l1);
        localObject = localSimpleDateFormat.format(localDate) + ";" + l2;
        h.pYm.a(418L, 1L, 1L, true);
        h.pYm.e(13778, new Object[] { Integer.valueOf(3), Integer.valueOf(1), localObject });
        ab.i("MicroMsg.SubCoreBaseMonitor", "summerreportVersion install result[%s]", new Object[] { localObject });
        AppMethodBeat.o(84519);
        return;
        j = 1;
        break;
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.SubCoreBaseMonitor", localException, "reportVersion err!", new Object[0]);
        h.pYm.a(418L, 2L, 1L, true);
        AppMethodBeat.o(84519);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.monitor.b.3
 * JD-Core Version:    0.6.2
 */