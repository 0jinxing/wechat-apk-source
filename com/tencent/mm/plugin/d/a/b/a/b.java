package com.tencent.mm.plugin.d.a.b.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.d.a.b.h;
import com.tencent.mm.sdk.platformtools.ab;

public class b extends a
{
  static final String TAG;
  public static String jHe;
  public static String jHf;
  public static String jHg;
  private final int jHh = 1;
  private final int jHi = 2;
  private final int jHj = 4;
  private final int jHk = 8;
  private final int jHl = 16;
  b.b jHm = null;
  b.a jHn;
  int jHo;

  static
  {
    AppMethodBeat.i(18461);
    TAG = b.class.getName();
    jHe = h.jGY;
    jHf = h.jGZ;
    jHg = h.jHa;
    AppMethodBeat.o(18461);
  }

  public b()
  {
    this.jHc = null;
    this.jHd = 2;
    this.jGw = 8L;
  }

  static double L(byte[] paramArrayOfByte, int paramInt)
  {
    AppMethodBeat.i(18460);
    int i = paramArrayOfByte[(paramInt + 1)] << 8 & 0xFF00;
    int j = (i >> 12) - 16;
    int k = i & 0xF00;
    paramInt = (paramArrayOfByte[paramInt] & 0xFF) + (0xFF00 & k);
    double d1 = paramInt;
    double d2 = Math.pow(10.0D, j);
    ab.d(TAG, "hbyte=" + i + " hvalue=" + k + " value=" + paramInt + " exp=" + j);
    AppMethodBeat.o(18460);
    return d1 * d2;
  }

  public final byte[] aVE()
  {
    return null;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.d.a.b.a.b
 * JD-Core Version:    0.6.2
 */