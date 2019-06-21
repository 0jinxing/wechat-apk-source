package com.tencent.mm.plugin.subapp.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;

public final class b
{
  public static void b(String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(25326);
    ab.i("MicroMsg.VoiceTransformTextReporter", "alvinluo reportTransformTextResult voiceId: %s, wordCount: %d, waitTime: %d, animationTime: %d, result: %d", new Object[] { paramString, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Integer.valueOf(paramInt4) });
    h.pYm.e(14220, new Object[] { Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Integer.valueOf(paramInt2 + paramInt3), Integer.valueOf(paramInt4), paramString });
    AppMethodBeat.o(25326);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.subapp.d.b
 * JD-Core Version:    0.6.2
 */