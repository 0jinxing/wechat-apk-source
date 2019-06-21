package com.tencent.mm.plugin.scanner.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.eb;
import com.tencent.mm.plugin.scanner.a.p;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.j;

public final class b extends j
{
  public static final String[] fnj;
  private e bSd;

  static
  {
    AppMethodBeat.i(80897);
    fnj = new String[] { j.a(p.ccO, "ScanTranslationResult") };
    AppMethodBeat.o(80897);
  }

  public b(e parame)
  {
    super(parame, p.ccO, "ScanTranslationResult", null);
    this.bSd = parame;
  }

  public final eb Wf(String paramString)
  {
    AppMethodBeat.i(80896);
    p localp = new p();
    localp.field_originMD5 = paramString;
    if (b(localp, new String[0]))
    {
      AppMethodBeat.o(80896);
      paramString = localp;
    }
    while (true)
    {
      return paramString;
      paramString = null;
      AppMethodBeat.o(80896);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.scanner.b.b
 * JD-Core Version:    0.6.2
 */