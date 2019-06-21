package com.tencent.mm.plugin.luggage.natives.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Objects;

public final class a
{
  public int iUG;
  public int mColor;
  public a.a[] oiC;
  public a.g[] oiD;
  public int[] oiE;
  public a.g[] oiF;
  public int ojA;
  public int ojB;
  public int ojC;
  public int ojD;
  public a.g ojE;
  public int ojF;
  public int ojG;
  public a.g ojH;
  public a.g ojI;
  public boolean ojJ;
  public a.c ojK;
  public a.d ojL;
  public String[] ojM;
  public a.e ojN;
  public boolean ojO;
  public a.b ojP;
  public int ojQ;
  public a.g ojR;
  public a.g ojS;
  public String[] ojT;
  public a.c ojU;
  public a.d ojV;
  public int ojW;
  public a.g ojd;
  public a.g oje;
  public a.g ojf;
  public a.g ojg;
  public a.g ojh;
  public a.g oji;
  public a.g ojj;
  public a.g ojk;
  public a.g ojl;
  public a.g ojm;
  public a.g ojn;
  public a.g ojo;
  public a.g ojp;
  public a.g ojq;
  public a.g ojr;
  public a.g ojs;
  public a.g ojt;
  public a.g oju;
  public int ojv;
  public int ojw;
  public int ojx;
  public int ojy;
  public int ojz;

  public a()
  {
    this((byte)0);
  }

  private a(byte paramByte)
  {
    AppMethodBeat.i(116923);
    this.ojd = null;
    this.oje = null;
    this.ojf = null;
    this.ojg = null;
    this.ojh = null;
    this.oji = null;
    this.ojj = null;
    this.ojk = null;
    this.ojl = null;
    this.ojm = null;
    this.ojn = null;
    this.ojo = null;
    this.ojp = null;
    this.ojq = null;
    this.ojr = null;
    this.ojs = null;
    this.ojt = null;
    this.oju = null;
    this.oiC = new a.a[4];
    this.oiD = new a.g[4];
    this.oiE = new int[] { -2147483648, -2147483648, -2147483648, -2147483648 };
    this.oiF = new a.g[4];
    this.ojv = 0;
    this.ojw = -2147483648;
    this.ojx = -2147483648;
    this.ojy = -2147483648;
    this.ojz = -2147483648;
    this.ojA = -2147483648;
    this.ojB = -2147483648;
    this.ojC = -2147483648;
    this.ojD = -2147483648;
    this.ojE = null;
    this.ojF = -2147483648;
    this.mColor = -2147483648;
    this.iUG = -2147483648;
    this.ojG = -2147483648;
    this.ojH = null;
    this.ojI = null;
    this.ojJ = true;
    this.ojK = a.c.okg;
    this.ojL = a.d.okl;
    this.ojM = null;
    this.ojN = a.e.okx;
    this.ojO = false;
    this.ojP = a.b.okd;
    this.ojQ = -2147483648;
    this.ojR = null;
    this.ojS = null;
    this.ojT = null;
    this.ojU = a.c.okg;
    this.ojV = a.d.okl;
    this.ojW = -2147483648;
    AppMethodBeat.o(116923);
  }

  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    AppMethodBeat.i(116924);
    if (this == paramObject)
      AppMethodBeat.o(116924);
    while (true)
    {
      return bool;
      if (!(paramObject instanceof a))
      {
        AppMethodBeat.o(116924);
        bool = false;
      }
      else
      {
        paramObject = (a)paramObject;
        if ((this.ojv == paramObject.ojv) && (this.ojw == paramObject.ojw) && (this.ojx == paramObject.ojx) && (this.ojy == paramObject.ojy) && (this.ojz == paramObject.ojz) && (this.ojA == paramObject.ojA) && (this.ojB == paramObject.ojB) && (this.ojC == paramObject.ojC) && (this.ojD == paramObject.ojD) && (this.ojF == paramObject.ojF) && (this.mColor == paramObject.mColor) && (this.iUG == paramObject.iUG) && (this.ojG == paramObject.ojG) && (this.ojN == paramObject.ojN) && (Objects.equals(this.ojd, paramObject.ojd)) && (Objects.equals(this.oje, paramObject.oje)) && (Objects.equals(this.ojf, paramObject.ojf)) && (Objects.equals(this.ojg, paramObject.ojg)) && (Objects.equals(this.ojh, paramObject.ojh)) && (Objects.equals(this.oji, paramObject.oji)) && (Objects.equals(this.ojj, paramObject.ojj)) && (Objects.equals(this.ojk, paramObject.ojk)) && (Objects.equals(this.ojl, paramObject.ojl)) && (Objects.equals(this.ojm, paramObject.ojm)) && (Objects.equals(this.ojn, paramObject.ojn)) && (Objects.equals(this.ojo, paramObject.ojo)) && (Objects.equals(this.ojp, paramObject.ojp)) && (Objects.equals(this.ojq, paramObject.ojq)) && (Objects.equals(this.ojE, paramObject.ojE)) && (Objects.equals(this.ojI, paramObject.ojI)) && (Objects.equals(this.ojt, paramObject.ojt)) && (Objects.equals(this.oju, paramObject.oju)) && (Objects.equals(this.ojr, paramObject.ojr)) && (Objects.equals(this.ojs, paramObject.ojs)))
        {
          AppMethodBeat.o(116924);
        }
        else
        {
          AppMethodBeat.o(116924);
          bool = false;
        }
      }
    }
  }

  public final int hashCode()
  {
    AppMethodBeat.i(116925);
    int i = Objects.hash(new Object[] { this.ojd, this.oje, this.ojf, this.ojg, this.ojh, this.oji, this.ojj, this.ojk, this.ojl, this.ojm, this.ojn, this.ojo, this.ojp, this.ojq, Integer.valueOf(this.ojv), Integer.valueOf(this.ojw), Integer.valueOf(this.ojx), Integer.valueOf(this.ojy), Integer.valueOf(this.ojz), Integer.valueOf(this.ojA), Integer.valueOf(this.ojB), Integer.valueOf(this.ojC), Integer.valueOf(this.ojD), this.ojE, Integer.valueOf(this.ojF), Integer.valueOf(this.mColor), Integer.valueOf(this.iUG), Integer.valueOf(this.ojG) });
    AppMethodBeat.o(116925);
    return i;
  }

  public final String toString()
  {
    AppMethodBeat.i(116926);
    new StringBuilder("{displaytype:").append(this.ojv).append(", flexalignitems:").append(this.ojx);
    String str = super.toString();
    AppMethodBeat.o(116926);
    return str;
  }

  public static enum f
  {
    static
    {
      AppMethodBeat.i(116919);
      okB = new f("UNDEFINED", 0);
      okC = new f("POINT", 1);
      okD = new f("PERCENT", 2);
      okE = new f("AUTO", 3);
      okF = new f("WRAP_CONTENT", 4);
      okG = new f("MULTIPLIER", 5);
      okH = new f[] { okB, okC, okD, okE, okF, okG };
      AppMethodBeat.o(116919);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luggage.natives.a.a
 * JD-Core Version:    0.6.2
 */