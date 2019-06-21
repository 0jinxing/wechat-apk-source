package com.tencent.mm.plugin.appbrand.report;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.debugger.n;
import com.tencent.mm.plugin.appbrand.h.c;
import com.tencent.mm.plugin.appbrand.h.u;
import com.tencent.mm.plugin.appbrand.h.v;
import com.tencent.mm.plugin.appbrand.h.w;
import com.tencent.mm.sdk.platformtools.f;
import com.tencent.xweb.i.a;

public enum a
{
  static
  {
    AppMethodBeat.i(132542);
    izP = new a("X5", 0);
    izQ = new a("MMV8", 1);
    izR = new a("WebViewBased", 2);
    izS = new a("NativeScript", 3);
    izT = new a("NodeJS", 4);
    izU = new a("J2V8", 5);
    izV = new a("Invalid", 6);
    izW = new a[] { izP, izQ, izR, izS, izT, izU, izV };
    AppMethodBeat.o(132542);
  }

  public static a d(com.tencent.mm.plugin.appbrand.h.i parami)
  {
    AppMethodBeat.i(132540);
    if ((parami instanceof c))
    {
      parami = izU;
      AppMethodBeat.o(132540);
    }
    while (true)
    {
      return parami;
      if ((parami instanceof w))
      {
        parami = izR;
        AppMethodBeat.o(132540);
      }
      else if ((parami instanceof v))
      {
        parami = izT;
        AppMethodBeat.o(132540);
      }
      else
      {
        i.a locala;
        if ((parami instanceof u))
          locala = com.tencent.xweb.i.dTU();
        switch (a.1.izX[locala.ordinal()])
        {
        default:
          if ((parami instanceof n))
          {
            parami = izV;
            AppMethodBeat.o(132540);
          }
          break;
        case 1:
          parami = izP;
          AppMethodBeat.o(132540);
          break;
        case 2:
          parami = izR;
          AppMethodBeat.o(132540);
          break;
        case 3:
          parami = izQ;
          AppMethodBeat.o(132540);
          break;
        case 4:
          parami = izQ;
          AppMethodBeat.o(132540);
          break;
        case 5:
          parami = izQ;
          AppMethodBeat.o(132540);
          break;
        case 6:
          parami = izP;
          AppMethodBeat.o(132540);
          break;
        case 7:
          parami = izS;
          AppMethodBeat.o(132540);
          continue;
          if (f.DEBUG)
          {
            if (parami == null);
            for (parami = "null"; ; parami = parami.getClass().getSimpleName())
            {
              parami = new IllegalStateException(String.format("Unrecognized JsRuntime %s", new Object[] { parami }));
              AppMethodBeat.o(132540);
              throw parami;
            }
          }
          parami = izV;
          AppMethodBeat.o(132540);
        }
      }
    }
  }

  public static String e(com.tencent.mm.plugin.appbrand.h.i parami)
  {
    AppMethodBeat.i(132541);
    String str1 = d(parami).name();
    String str2 = str1;
    if ((parami instanceof n))
      str2 = str1 + "(remote_debug)";
    AppMethodBeat.o(132541);
    return str2;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.report.a
 * JD-Core Version:    0.6.2
 */