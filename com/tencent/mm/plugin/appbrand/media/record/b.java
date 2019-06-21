package com.tencent.mm.plugin.appbrand.media.record;

import com.tencent.matrix.trace.core.AppMethodBeat;

public enum b
{
  public int ilf;

  static
  {
    AppMethodBeat.i(117483);
    ikZ = new b("AUTO", 0, 0);
    ila = new b("MIC", 1, 1);
    ilb = new b("CAMCORDER", 2, 5);
    ilc = new b("VOICE_RECOGNITION", 3, 6);
    ild = new b("VOICE_COMMUNICATION", 4, 7);
    ile = new b("UNPROCESSED", 5, 9);
    ilg = new b[] { ikZ, ila, ilb, ilc, ild, ile };
    AppMethodBeat.o(117483);
  }

  private b(int paramInt)
  {
    this.ilf = paramInt;
  }

  public static b a(String paramString, b paramb)
  {
    AppMethodBeat.i(117482);
    if ((paramString == null) || (paramString.length() <= 0))
      AppMethodBeat.o(117482);
    while (true)
    {
      return paramb;
      paramString = valueOf(paramString);
      if (paramString != null)
      {
        AppMethodBeat.o(117482);
        paramb = paramString;
      }
      else
      {
        AppMethodBeat.o(117482);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.media.record.b
 * JD-Core Version:    0.6.2
 */