package com.tencent.mm.plugin.backup.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public final class e
{
  public static int jsI;
  public static int jsJ;
  public static int jsK;
  public static int jsL;
  public static int jsM;
  public static int jsN;
  public static int jsO;
  public static long jsP;
  public static long jsQ;
  public static long jsR;

  public static void aSS()
  {
    AppMethodBeat.i(17218);
    ab.d("MicroMsg.TestInfo", getInfo());
    AppMethodBeat.o(17218);
  }

  public static void aST()
  {
    AppMethodBeat.i(17219);
    ab.d("MicroMsg.TestInfo", "netTime" + (bo.anU() - jsQ));
    AppMethodBeat.o(17219);
  }

  private static String getInfo()
  {
    AppMethodBeat.i(17220);
    String str = "total_count: " + jsO + "text_count: " + jsK + "normal_count : " + jsJ + " image_count: " + jsI + " voice_count : " + jsM + " video_count " + jsL + " app_count : " + jsN + " time: " + (bo.anU() - jsP) + " net: " + jsR;
    AppMethodBeat.o(17220);
    return str;
  }

  public static void reset()
  {
    AppMethodBeat.i(17217);
    jsI = 0;
    jsJ = 0;
    jsK = 0;
    jsL = 0;
    jsM = 0;
    jsN = 0;
    jsO = 0;
    long l = bo.anU();
    jsP = l;
    jsR = l - jsQ;
    AppMethodBeat.o(17217);
  }

  public static void rm(int paramInt)
  {
    switch (paramInt)
    {
    default:
    case 1:
    case 49:
    case 34:
    case 43:
    case 3:
    case 37:
    case 40:
    case 42:
    case 48:
    case 66:
    case 10000:
    }
    while (true)
    {
      jsO += 1;
      return;
      jsK += 1;
      continue;
      jsN += 1;
      continue;
      jsM += 1;
      continue;
      jsL += 1;
      continue;
      jsI += 1;
      continue;
      jsJ += 1;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.c.e
 * JD-Core Version:    0.6.2
 */