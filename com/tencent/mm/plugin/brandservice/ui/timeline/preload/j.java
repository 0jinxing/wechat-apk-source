package com.tencent.mm.plugin.brandservice.ui.timeline.preload;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bp;

public final class j
{
  public static void FQ(String paramString)
  {
    AppMethodBeat.i(14391);
    de("MicroMsg.PreloadUtil", paramString);
    AppMethodBeat.o(14391);
  }

  public static void de(String paramString1, String paramString2)
  {
    AppMethodBeat.i(14392);
    if ((ab.getLogLevel() == 0) && (bp.dpL()))
      al.d(new j.1(paramString2));
    ab.i(paramString1, paramString2);
    AppMethodBeat.o(14392);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.timeline.preload.j
 * JD-Core Version:    0.6.2
 */