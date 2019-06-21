package com.tencent.mm.plugin.webview.modelcache;

import com.tencent.matrix.trace.core.AppMethodBeat;

public enum b$a
{
  final int bJt;

  static
  {
    AppMethodBeat.i(6828);
    unH = new a("HTTP", 0, 1);
    unI = new a("HTTPS", 1, 2);
    unJ = new a[] { unH, unI };
    AppMethodBeat.o(6828);
  }

  private b$a(int paramInt)
  {
    this.bJt = paramInt;
  }

  public static boolean IJ(int paramInt)
  {
    if ((unH.bJt & paramInt) > 0);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public static boolean IK(int paramInt)
  {
    if ((unI.bJt & paramInt) > 0);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public static int IL(int paramInt)
  {
    return unI.bJt | paramInt;
  }

  public static int cYk()
  {
    return unH.bJt | 0x0;
  }

  public static String toString(int paramInt)
  {
    AppMethodBeat.i(6827);
    String str1;
    if (IJ(paramInt))
    {
      str1 = "http";
      if (!IK(paramInt))
        break label58;
    }
    label58: for (String str2 = "https"; ; str2 = "-")
    {
      str1 = String.format("[ %s | %s ]", new Object[] { str1, str2 });
      AppMethodBeat.o(6827);
      return str1;
      str1 = "-";
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.modelcache.b.a
 * JD-Core Version:    0.6.2
 */