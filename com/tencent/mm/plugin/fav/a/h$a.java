package com.tencent.mm.plugin.fav.a;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class h$a
{
  public int cvd;
  public int index;
  public int jSW;
  public long meT;
  public String meU;
  public long meV;
  public long meW;
  public boolean meX;
  public int meY;
  public int meZ;
  public int mfa;
  public int mfb;
  public int mfc;
  public boolean mfd;
  public boolean mfe;
  public int mff;
  public String mfg;
  public String query;
  public int scene;
  public String sid;
  public long timestamp;
  public int type;

  public final String toString()
  {
    int i = 1;
    AppMethodBeat.i(102648);
    int j = this.scene;
    int k = this.index;
    long l1 = this.meT;
    int m = this.type;
    String str = this.meU;
    int n = this.cvd;
    long l2 = this.timestamp;
    long l3 = this.meV;
    long l4 = this.meW;
    int i1;
    int i2;
    int i3;
    int i4;
    int i5;
    int i6;
    int i7;
    if (this.meX)
    {
      i1 = 1;
      i2 = this.meY;
      i3 = this.meZ;
      i4 = this.mfa;
      i5 = this.mfb;
      i6 = this.mfc;
      if (!this.mfd)
        break label329;
      i7 = 1;
      label109: if (!this.mfe)
        break label335;
    }
    while (true)
    {
      str = String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s", new Object[] { Integer.valueOf(j), Integer.valueOf(k), Long.valueOf(l1), Integer.valueOf(m), str, Integer.valueOf(n), Long.valueOf(l2), Long.valueOf(l3), Long.valueOf(l4), Integer.valueOf(i1), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i), Integer.valueOf(this.jSW), this.sid, Integer.valueOf(this.mff), this.query, this.mfg });
      AppMethodBeat.o(102648);
      return str;
      i1 = 0;
      break;
      label329: i7 = 0;
      break label109;
      label335: i = 0;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.a.h.a
 * JD-Core Version:    0.6.2
 */