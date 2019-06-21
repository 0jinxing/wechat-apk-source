package com.google.b.b.a;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class a
{
  public static final a bzm;
  public static final a bzn;
  public static final a bzo;
  public static final a bzp;
  public static final a bzq;
  public static final a bzr;
  public static final a bzs;
  public static final a bzt;
  final int[] bzu;
  final int[] bzv;
  final b bzw;
  private final b bzx;
  private final int bzy;
  final int bzz;
  final int size;

  static
  {
    AppMethodBeat.i(57273);
    bzm = new a(4201, 4096, 1);
    bzn = new a(1033, 1024, 1);
    bzo = new a(67, 64, 1);
    bzp = new a(19, 16, 1);
    bzq = new a(285, 256, 0);
    a locala = new a(301, 256, 1);
    bzr = locala;
    bzs = locala;
    bzt = bzo;
    AppMethodBeat.o(57273);
  }

  private a(int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(57271);
    this.bzy = paramInt1;
    this.size = paramInt2;
    this.bzz = paramInt3;
    this.bzu = new int[paramInt2];
    this.bzv = new int[paramInt2];
    int i = 0;
    paramInt3 = 1;
    while (i < paramInt2)
    {
      this.bzu[i] = paramInt3;
      int j = paramInt3 << 1;
      paramInt3 = j;
      if (j >= paramInt2)
        paramInt3 = (j ^ paramInt1) & paramInt2 - 1;
      i++;
    }
    for (paramInt1 = 0; paramInt1 < paramInt2 - 1; paramInt1++)
      this.bzv[this.bzu[paramInt1]] = paramInt1;
    this.bzw = new b(this, new int[] { 0 });
    this.bzx = new b(this, new int[] { 1 });
    AppMethodBeat.o(57271);
  }

  static int bC(int paramInt1, int paramInt2)
  {
    return paramInt1 ^ paramInt2;
  }

  final int bD(int paramInt1, int paramInt2)
  {
    if ((paramInt1 == 0) || (paramInt2 == 0));
    for (paramInt1 = 0; ; paramInt1 = this.bzu[((this.bzv[paramInt1] + this.bzv[paramInt2]) % (this.size - 1))])
      return paramInt1;
  }

  public final String toString()
  {
    AppMethodBeat.i(57272);
    String str = "GF(0x" + Integer.toHexString(this.bzy) + ',' + this.size + ')';
    AppMethodBeat.o(57272);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.google.b.b.a.a
 * JD-Core Version:    0.6.2
 */