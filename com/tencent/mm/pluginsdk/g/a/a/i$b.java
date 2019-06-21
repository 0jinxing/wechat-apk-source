package com.tencent.mm.pluginsdk.g.a.a;

import com.tencent.matrix.trace.core.AppMethodBeat;

 enum i$b
{
  final int bJt;

  static
  {
    AppMethodBeat.i(79530);
    veu = new b("DoNothing", 0, 0);
    vev = new b("DoCache", 1, 1);
    vew = new b("DoDecrypt", 2, 2);
    vex = new b("DoDelete", 3, 4);
    vey = new b[] { veu, vev, vew, vex };
    AppMethodBeat.o(79530);
  }

  private i$b(int paramInt)
  {
    this.bJt = paramInt;
  }

  static boolean KC(int paramInt)
  {
    if (paramInt == veu.bJt);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  static boolean KD(int paramInt)
  {
    if ((vev.bJt & paramInt) > 0);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  static boolean KE(int paramInt)
  {
    if ((vew.bJt & paramInt) > 0);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  static boolean KF(int paramInt)
  {
    if ((vex.bJt & paramInt) > 0);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  static int aiZ(String paramString)
  {
    AppMethodBeat.i(79529);
    int i;
    if ("cache".equals(paramString))
    {
      i = vev.bJt;
      AppMethodBeat.o(79529);
    }
    while (true)
    {
      return i;
      if ("delete".equals(paramString))
      {
        i = vex.bJt;
        AppMethodBeat.o(79529);
      }
      else if ("decrypt".equals(paramString))
      {
        i = vew.bJt;
        AppMethodBeat.o(79529);
      }
      else
      {
        i = veu.bJt;
        AppMethodBeat.o(79529);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.g.a.a.i.b
 * JD-Core Version:    0.6.2
 */