package com.tencent.mm.plugin.soter;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.lm;
import com.tencent.mm.plugin.soter.d.g;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ab;

final class PluginSoter$1$1
  implements g
{
  PluginSoter$1$1(PluginSoter.1 param1)
  {
  }

  public final void aC(int paramInt, String paramString)
  {
    AppMethodBeat.i(59286);
    ab.i("MicroMsg.PluginSoter", "init finish: %s, %s", new Object[] { Integer.valueOf(paramInt), paramString });
    lm locallm = new lm();
    locallm.cHn.errCode = paramInt;
    locallm.cHn.aIm = paramString;
    a.xxA.m(locallm);
    AppMethodBeat.o(59286);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.soter.PluginSoter.1.1
 * JD-Core Version:    0.6.2
 */