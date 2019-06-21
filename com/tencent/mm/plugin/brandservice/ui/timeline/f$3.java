package com.tencent.mm.plugin.brandservice.ui.timeline;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aj.z;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.r;
import com.tencent.mm.storage.t;

final class f$3
  implements Runnable
{
  f$3(f paramf, long paramLong, int paramInt)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(14172);
    Object localObject1 = z.aeX();
    Object localObject2 = "SELECT count(*) FROM BizTimeLineInfo where orderFlag >= ".concat(String.valueOf(this.jOi & 0x0));
    localObject1 = ((r)localObject1).fni.a((String)localObject2, null, 0);
    if (((Cursor)localObject1).moveToFirst());
    for (int i = ((Cursor)localObject1).getInt(0); ; i = 0)
    {
      ((Cursor)localObject1).close();
      int j = z.aeX().mG(this.jOi);
      localObject2 = z.aeX();
      long l = this.jOi;
      localObject1 = "SELECT count(*) FROM BizTimeLineInfo where orderFlag >= " + (l & 0x0) + " and placeTop = 1 ";
      localObject1 = ((r)localObject2).fni.a((String)localObject1, null, 0);
      if (((Cursor)localObject1).moveToFirst());
      for (int k = ((Cursor)localObject1).getInt(0); ; k = 0)
      {
        ((Cursor)localObject1).close();
        int m = z.aeY().baS();
        com.tencent.mm.plugin.report.service.h.pYm.e(11404, new Object[] { Integer.valueOf(1), Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k), Integer.valueOf(m), Integer.valueOf(this.jOh.ctE), Integer.valueOf(this.jOh.ctE), Integer.valueOf(this.jOj) });
        ab.i("MicroMsg.BizTimeLineReport", "reportEnterBiz %d|%d|%d|%d|%d|%d|%d", new Object[] { Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k), Integer.valueOf(m), Integer.valueOf(this.jOh.ctE), Integer.valueOf(this.jOh.ctE), Integer.valueOf(this.jOj) });
        AppMethodBeat.o(14172);
        return;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.timeline.f.3
 * JD-Core Version:    0.6.2
 */