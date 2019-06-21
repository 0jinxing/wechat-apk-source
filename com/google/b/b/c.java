package com.google.b.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.HashMap;
import java.util.Map;

public enum c
{
  private static final Map<Integer, c> bzh;
  private static final Map<String, c> bzi;
  public final int[] bzj;
  private final String[] bzk;

  static
  {
    AppMethodBeat.i(57145);
    byG = new c("Cp437", 0, new int[] { 0, 2 }, new String[0]);
    byH = new c("ISO8859_1", 1, new int[] { 1, 3 }, new String[] { "ISO-8859-1" });
    byI = new c("ISO8859_2", 2, 4, new String[] { "ISO-8859-2" });
    byJ = new c("ISO8859_3", 3, 5, new String[] { "ISO-8859-3" });
    byK = new c("ISO8859_4", 4, 6, new String[] { "ISO-8859-4" });
    byL = new c("ISO8859_5", 5, 7, new String[] { "ISO-8859-5" });
    byM = new c("ISO8859_6", 6, 8, new String[] { "ISO-8859-6" });
    byN = new c("ISO8859_7", 7, 9, new String[] { "ISO-8859-7" });
    byO = new c("ISO8859_8", 8, 10, new String[] { "ISO-8859-8" });
    byP = new c("ISO8859_9", 9, 11, new String[] { "ISO-8859-9" });
    byQ = new c("ISO8859_10", 10, 12, new String[] { "ISO-8859-10" });
    byR = new c("ISO8859_11", 11, 13, new String[] { "ISO-8859-11" });
    byS = new c("ISO8859_13", 12, 15, new String[] { "ISO-8859-13" });
    byT = new c("ISO8859_14", 13, 16, new String[] { "ISO-8859-14" });
    byU = new c("ISO8859_15", 14, 17, new String[] { "ISO-8859-15" });
    byV = new c("ISO8859_16", 15, 18, new String[] { "ISO-8859-16" });
    byW = new c("SJIS", 16, 20, new String[] { "Shift_JIS" });
    byX = new c("Cp1250", 17, 21, new String[] { "windows-1250" });
    byY = new c("Cp1251", 18, 22, new String[] { "windows-1251" });
    byZ = new c("Cp1252", 19, 23, new String[] { "windows-1252" });
    bza = new c("Cp1256", 20, 24, new String[] { "windows-1256" });
    bzb = new c("UnicodeBigUnmarked", 21, 25, new String[] { "UTF-16BE", "UnicodeBig" });
    bzc = new c("UTF8", 22, 26, new String[] { "UTF-8" });
    bzd = new c("ASCII", 23, new int[] { 27, 170 }, new String[] { "US-ASCII" });
    bze = new c("Big5");
    bzf = new c("GB18030", 25, 29, new String[] { "GB2312", "EUC_CN", "GBK" });
    bzg = new c("EUC_KR", 26, 30, new String[] { "EUC-KR" });
    bzl = new c[] { byG, byH, byI, byJ, byK, byL, byM, byN, byO, byP, byQ, byR, byS, byT, byU, byV, byW, byX, byY, byZ, bza, bzb, bzc, bzd, bze, bzf, bzg };
    bzh = new HashMap();
    bzi = new HashMap();
    for (c localc : values())
    {
      for (int n : localc.bzj)
        bzh.put(Integer.valueOf(n), localc);
      bzi.put(localc.name(), localc);
      for (??? : localc.bzk)
        bzi.put(???, localc);
    }
    AppMethodBeat.o(57145);
  }

  private c(int paramInt)
  {
    this(new int[] { 28 }, new String[0]);
    AppMethodBeat.i(57142);
    AppMethodBeat.o(57142);
  }

  private c(int paramInt, String[] paramArrayOfString)
  {
    AppMethodBeat.i(57143);
    this.bzj = new int[] { paramInt };
    this.bzk = paramArrayOfString;
    AppMethodBeat.o(57143);
  }

  private c(int[] paramArrayOfInt, String[] paramArrayOfString)
  {
    this.bzj = paramArrayOfInt;
    this.bzk = paramArrayOfString;
  }

  public static c bh(String paramString)
  {
    AppMethodBeat.i(57144);
    paramString = (c)bzi.get(paramString);
    AppMethodBeat.o(57144);
    return paramString;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.google.b.b.c
 * JD-Core Version:    0.6.2
 */