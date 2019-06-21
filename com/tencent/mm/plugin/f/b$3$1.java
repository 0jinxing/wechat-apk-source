package com.tencent.mm.plugin.f;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.ch;
import com.tencent.mm.g.a.ch.a;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

final class b$3$1
  implements Runnable
{
  b$3$1(b.3 param3, ch paramch)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(18576);
    if (this.kab == null)
      AppMethodBeat.o(18576);
    while (true)
    {
      return;
      if (bo.isNullOrNil(this.kab.cvw.talker))
        AppMethodBeat.o(18576);
      else
        try
        {
          com.tencent.mm.plugin.f.b.b localb = b.aZc().aZd();
          long l = this.kab.cvw.cvx;
          String str = this.kab.cvw.talker;
          int i = this.kab.cvw.msgType;
          ab.i("MicroMsg.WxFileIndexStorage", "delete by msg [%d %d %s] result[%d]", new Object[] { Long.valueOf(l), Integer.valueOf(i), str, Integer.valueOf(localb.bSd.delete("WxFileIndex2", "msgId=? AND msgType=? AND username=? ", new String[] { String.valueOf(l), String.valueOf(i), str })) });
          AppMethodBeat.o(18576);
        }
        catch (Exception localException)
        {
          ab.printErrStackTrace("MicroMsg.CalcWxService", localException, "", new Object[0]);
          h.pYm.a(664L, 6L, 1L, false);
          AppMethodBeat.o(18576);
        }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.f.b.3.1
 * JD-Core Version:    0.6.2
 */