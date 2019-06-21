package com.tencent.mm.plugin.music.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ag;

public final class e
{
  public static String bSy()
  {
    AppMethodBeat.i(137265);
    String str = "audio" + ag.ck(new StringBuilder().append(System.nanoTime()).toString());
    AppMethodBeat.o(137265);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.music.b.e
 * JD-Core Version:    0.6.2
 */