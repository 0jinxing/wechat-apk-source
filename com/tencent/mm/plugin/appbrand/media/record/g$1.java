package com.tencent.mm.plugin.appbrand.media.record;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.media.record.record_imp.RecordParam;
import com.tencent.mm.plugin.appbrand.media.record.record_imp.a;
import com.tencent.mm.plugin.appbrand.media.record.record_imp.a.a;
import com.tencent.mm.sdk.platformtools.ab;

final class g$1
  implements a.a
{
  g$1(g paramg)
  {
  }

  public final void bN(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(105602);
    ab.i("MicroMsg.Record.AudioRecordMgr", "onRecError state:%d, detailState:%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    this.ilC.onError(1);
    AppMethodBeat.o(105602);
  }

  public final void u(byte[] paramArrayOfByte, int paramInt)
  {
    AppMethodBeat.i(105601);
    int j;
    if ((g.a(this.ilC) != null) && (g.b(this.ilC) != null))
    {
      g localg = this.ilC;
      int i = g.c(this.ilC);
      a locala = g.b(this.ilC);
      if (locala.coZ != null)
      {
        j = locala.coZ.cpw;
        g.a(localg, j + i);
      }
    }
    while (true)
    {
      try
      {
        if (!g.a(this.ilC).a(g.d(this.ilC), paramArrayOfByte, paramInt))
          ab.e("MicroMsg.Record.AudioRecordMgr", "encode pcm fail!");
        AppMethodBeat.o(105601);
        return;
        j = 20;
      }
      catch (Exception paramArrayOfByte)
      {
        ab.printErrStackTrace("MicroMsg.Record.AudioRecordMgr", paramArrayOfByte, "onRecPcmDataReady", new Object[0]);
        if ((g.e(this.ilC) != null) && ("mp3".equalsIgnoreCase(g.e(this.ilC).hAQ)))
        {
          j.pk(19);
          AppMethodBeat.o(105601);
          continue;
        }
        if ((g.e(this.ilC) != null) && ("aac".equalsIgnoreCase(g.e(this.ilC).hAQ)))
          j.pk(23);
      }
      AppMethodBeat.o(105601);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.media.record.g.1
 * JD-Core Version:    0.6.2
 */