package com.tencent.mm.plugin.appbrand.game.preload;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.b.a.bp;
import com.tencent.mm.g.b.a.bp.a;
import com.tencent.mm.g.b.a.bp.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public class e
{
  private static volatile e htA;
  public int gOW = -1;
  public String htB;
  public int htC;
  public int htD;
  public int htE;
  public String htF;
  public int htG;
  boolean htH = false;
  public int htI;

  public static e aBD()
  {
    AppMethodBeat.i(130307);
    if (htA == null);
    try
    {
      if (htA == null)
      {
        locale = new com/tencent/mm/plugin/appbrand/game/preload/e;
        locale.<init>();
        htA = locale;
      }
      e locale = htA;
      AppMethodBeat.o(130307);
      return locale;
    }
    finally
    {
      AppMethodBeat.o(130307);
    }
  }

  public final void cY(int paramInt1, int paramInt2)
  {
    int i = 1;
    AppMethodBeat.i(130308);
    Object localObject;
    if ((!bo.isNullOrNil(this.htF)) && (!bo.isNullOrNil(this.htB)))
    {
      localObject = this.htF;
      String str = this.htB;
      int j = this.htC;
      int k = this.htD;
      int m = this.htE;
      int n = this.gOW;
      if (!this.htH)
        break label284;
      ab.v("MicroMsg.WAGamePreloadStatisManager", "instanceId:%s,appId:%s,appVersion:%d,appState:%d,appType:%d,key:%d,value:%d,scene:%d,misDownloadedCode:%d", new Object[] { localObject, str, Integer.valueOf(j), Integer.valueOf(k), Integer.valueOf(m), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(n), Integer.valueOf(i) });
      localObject = new bp();
      ((bp)localObject).gl(this.htF);
      ((bp)localObject).gm(this.htB);
      ((bp)localObject).ddd = this.htC;
      ((bp)localObject).dde = bp.a.gP(this.htD);
      ((bp)localObject).ddf = bp.b.gQ(this.htE);
      ((bp)localObject).ddg = this.htG;
      ((bp)localObject).ddh = paramInt1;
      ((bp)localObject).ddi = paramInt2;
      if (!this.htH)
        break label289;
    }
    label284: label289: for (long l = 1L; ; l = 0L)
    {
      ((bp)localObject).ddj = l;
      ((bp)localObject).cVR = this.gOW;
      ((bp)localObject).ddk = this.htI;
      ((bp)localObject).ajK();
      AppMethodBeat.o(130308);
      return;
      i = 0;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.game.preload.e
 * JD-Core Version:    0.6.2
 */