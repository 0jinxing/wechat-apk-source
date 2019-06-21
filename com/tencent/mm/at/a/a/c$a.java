package com.tencent.mm.at.a.a;

import android.graphics.drawable.Drawable;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.at.a.c.b;
import com.tencent.mm.at.a.c.o;
import com.tencent.mm.modelsfs.SFSContext;
import com.tencent.mm.sdk.platformtools.ak;

public final class c$a
{
  float alpha = 0.0F;
  public String cvZ = "";
  int density = 0;
  public boolean ePF = true;
  public boolean ePG = false;
  public boolean ePH = false;
  public boolean ePI = true;
  public String ePJ = "";
  public String ePK = "";
  String ePL = "";
  public int ePN = 0;
  public int ePO = 0;
  public boolean ePP = false;
  public boolean ePQ = false;
  boolean ePR = false;
  boolean ePS = false;
  public int ePT = 0;
  public Drawable ePU = null;
  public int ePV = 0;
  public Drawable ePW = null;
  public String ePX = null;
  public SFSContext ePY = null;
  public boolean ePZ = true;
  public boolean eQa = false;
  public boolean eQb = true;
  public Object[] eQd = null;
  public boolean eQf = false;
  public float eQg = 0.0F;
  boolean eQh = false;
  public b fGV = null;
  public int fHe = 5;
  public boolean fHf;
  public int fHg;
  boolean fHh;
  int fHi = 0;
  Drawable fHj = null;
  o fHk = null;
  ak handler = null;
  String thumbPath;

  public final a a(b paramb)
  {
    this.fGV = paramb;
    return this;
  }

  public final a a(SFSContext paramSFSContext)
  {
    this.ePY = paramSFSContext;
    return this;
  }

  public final a ahC()
  {
    this.ePF = true;
    return this;
  }

  public final a ahD()
  {
    this.ePH = true;
    return this;
  }

  public final a ahE()
  {
    this.ePV = 2131689876;
    return this;
  }

  public final a ahF()
  {
    this.eQa = true;
    return this;
  }

  public final c ahG()
  {
    AppMethodBeat.i(116072);
    c localc = new c(this, (byte)0);
    AppMethodBeat.o(116072);
    return localc;
  }

  public final a ct(int paramInt1, int paramInt2)
  {
    this.ePN = paramInt1;
    this.ePO = paramInt2;
    return this;
  }

  public final a lI(int paramInt)
  {
    this.ePN = paramInt;
    return this;
  }

  public final a lJ(int paramInt)
  {
    this.ePO = paramInt;
    return this;
  }

  public final a lK(int paramInt)
  {
    this.ePT = 2130838087;
    return this;
  }

  public final a sC(String paramString)
  {
    this.ePJ = paramString;
    return this;
  }

  public final a sD(String paramString)
  {
    this.ePK = paramString;
    return this;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.at.a.a.c.a
 * JD-Core Version:    0.6.2
 */