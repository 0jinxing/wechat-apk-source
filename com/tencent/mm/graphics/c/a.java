package com.tencent.mm.graphics.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.graphics.b.b;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;

public enum a
{
  static
  {
    AppMethodBeat.i(57098);
    eCU = new a("INSTANCE");
    eCV = new a[] { eCU };
    AppMethodBeat.o(57098);
  }

  private static void a(long paramLong, a.a parama)
  {
    AppMethodBeat.i(57096);
    if (parama == null)
      AppMethodBeat.o(57096);
    while (true)
    {
      return;
      ab.i("MicroMsg.ImageReporter", "alvinluo reportImageDecodeInfo sessionId: %d, from: %s, imageType: %d, w: %d, h: %d, fileSize: %d, orientation: %d, decodeResult: %d, decodeTime: %d, fullSampleSzie: %d, onlyDecodeTime: %d", new Object[] { Long.valueOf(paramLong), parama.cKf, Integer.valueOf(parama.eCW), Integer.valueOf(parama.width), Integer.valueOf(parama.height), Integer.valueOf(parama.fileSize), Integer.valueOf(parama.orientation), Integer.valueOf(parama.eCX), Integer.valueOf(parama.eCY), Integer.valueOf(parama.aIY), Integer.valueOf(parama.eCZ) });
      h.pYm.e(15467, new Object[] { Long.valueOf(paramLong), parama.cKf, Integer.valueOf(parama.eCW), Integer.valueOf(parama.width), Integer.valueOf(parama.height), Integer.valueOf(parama.fileSize), Integer.valueOf(parama.orientation), Integer.valueOf(parama.eCX), Integer.valueOf(parama.eCY), Integer.valueOf(parama.aIY), Integer.valueOf(parama.eCZ) });
      AppMethodBeat.o(57096);
    }
  }

  public static void a(b paramb)
  {
    AppMethodBeat.i(57097);
    long l = System.currentTimeMillis();
    if (paramb != null)
    {
      ab.i("MicroMsg.ImageReporter", "alvinluo reportPerformance sessionId: %d, fps.maxFps: %f, fps.minFps: %f, fps.averageFps: %f, memory.memoryUsedWhenInit: %f, memory.currentMaxUsedMemory: %f, memory.currentMinUsedMemory: %f, memory.averUsed: %f, memory.currentVarianceSum: %f", new Object[] { Long.valueOf(l), Double.valueOf(0.0D), Double.valueOf(0.0D), Double.valueOf(0.0D), Double.valueOf(paramb.eCD), Double.valueOf(paramb.eCE), Double.valueOf(paramb.eCF), Double.valueOf(paramb.eCH), Double.valueOf(paramb.eCG) });
      h.pYm.e(15471, new Object[] { Long.valueOf(l), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf((int)paramb.eCD), Integer.valueOf((int)paramb.eCE), Integer.valueOf((int)paramb.eCH), Integer.valueOf((int)paramb.eCG), Integer.valueOf(1) });
    }
    AppMethodBeat.o(57097);
  }

  public static void a(a.a parama1, a.a parama2)
  {
    AppMethodBeat.i(57095);
    long l = System.currentTimeMillis();
    if (parama1 != null)
      a(l, parama1);
    if (parama2 != null)
      a(l, parama2);
    AppMethodBeat.o(57095);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.graphics.c.a
 * JD-Core Version:    0.6.2
 */