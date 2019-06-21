package com.tencent.mm.at.a.a;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.at.a.c.b;
import com.tencent.mm.at.a.c.o;
import com.tencent.mm.modelsfs.SFSContext;
import com.tencent.mm.sdk.platformtools.ak;

public final class c
{
  public final float alpha;
  public final String cvZ;
  public final int density;
  public final boolean ePF;
  public final boolean ePG;
  public final boolean ePH;
  public final boolean ePI;
  public final String ePJ;
  public final String ePK;
  public final String ePL;
  public final int ePN;
  public final int ePO;
  public final boolean ePP;
  public final boolean ePQ;
  private final boolean ePR;
  public final boolean ePS;
  public final int ePT;
  private final Drawable ePU;
  public final int ePV;
  private final Drawable ePW;
  public final String ePX;
  public final SFSContext ePY;
  public final boolean ePZ;
  public final boolean eQa;
  public final boolean eQb;
  public final Object[] eQd;
  public final boolean eQf;
  public final float eQg;
  public final boolean eQh;
  public final b fGV;
  public final int fHe;
  public final boolean fHf;
  public final int fHg;
  public final boolean fHh;
  private final int fHi;
  private final Drawable fHj;
  public final o fHk;
  public final ak handler;
  public final String thumbPath;

  private c(c.a parama)
  {
    this.ePF = parama.ePF;
    this.ePH = parama.ePH;
    this.ePG = parama.ePG;
    this.ePI = parama.ePI;
    this.ePJ = parama.ePJ;
    this.ePK = parama.ePK;
    this.ePL = parama.ePL;
    this.fHe = parama.fHe;
    this.ePN = parama.ePN;
    this.ePO = parama.ePO;
    this.ePP = parama.ePP;
    this.cvZ = parama.cvZ;
    this.density = parama.density;
    this.alpha = parama.alpha;
    this.ePQ = parama.ePQ;
    this.fHf = parama.fHf;
    this.fHg = parama.fHg;
    this.thumbPath = parama.thumbPath;
    this.fHh = parama.fHh;
    this.ePR = parama.ePR;
    this.ePS = parama.ePS;
    this.ePT = parama.ePT;
    this.ePU = parama.ePU;
    this.fHi = parama.fHi;
    this.fHj = parama.fHj;
    this.ePV = parama.ePV;
    this.ePW = parama.ePW;
    this.ePZ = parama.ePZ;
    this.eQf = parama.eQf;
    this.eQg = parama.eQg;
    this.eQa = parama.eQa;
    this.eQb = parama.eQb;
    this.eQh = parama.eQh;
    this.ePY = parama.ePY;
    this.handler = parama.handler;
    this.eQd = parama.eQd;
    this.fGV = parama.fGV;
    this.fHk = parama.fHk;
    this.ePX = parama.ePX;
  }

  public static c ahz()
  {
    AppMethodBeat.i(116073);
    c localc = new c.a().ahG();
    AppMethodBeat.o(116073);
    return localc;
  }

  public final boolean ahA()
  {
    if ((this.ePT > 0) || (this.ePU != null));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final boolean ahB()
  {
    if ((this.ePV > 0) || (this.ePW != null));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final Drawable d(Resources paramResources)
  {
    AppMethodBeat.i(116074);
    if (this.ePT != 0)
    {
      paramResources = paramResources.getDrawable(this.ePT);
      AppMethodBeat.o(116074);
    }
    while (true)
    {
      return paramResources;
      paramResources = this.ePU;
      AppMethodBeat.o(116074);
    }
  }

  public final Drawable e(Resources paramResources)
  {
    AppMethodBeat.i(116075);
    if (this.ePV != 0)
    {
      paramResources = paramResources.getDrawable(this.ePV);
      AppMethodBeat.o(116075);
    }
    while (true)
    {
      return paramResources;
      paramResources = this.ePW;
      AppMethodBeat.o(116075);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.at.a.a.c
 * JD-Core Version:    0.6.2
 */