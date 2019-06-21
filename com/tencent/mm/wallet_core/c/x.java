package com.tencent.mm.wallet_core.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.UUID;

public final class x
{
  private static boolean AfR = false;
  private static int AfS = -1;
  private static String AfT = "";

  public static void QN(int paramInt)
  {
    AppMethodBeat.i(49086);
    if (!AfR)
    {
      AfR = true;
      AfS = paramInt;
      AfT = UUID.randomUUID().toString();
    }
    AppMethodBeat.o(49086);
  }

  public static boolean dNS()
  {
    return AfR;
  }

  public static int dNT()
  {
    return AfS;
  }

  public static String dNU()
  {
    return AfT;
  }

  public static void dNV()
  {
    AfR = false;
    AfS = -1;
    AfT = "";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.wallet_core.c.x
 * JD-Core Version:    0.6.2
 */