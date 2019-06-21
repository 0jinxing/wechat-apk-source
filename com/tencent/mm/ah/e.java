package com.tencent.mm.ah;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.az;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import junit.framework.Assert;

public final class e
  implements f
{
  e.c frD;
  k frE;
  boolean frF;
  az frG;
  h fro;

  public e()
  {
    AppMethodBeat.i(77910);
    this.fro = null;
    this.frD = null;
    this.frE = null;
    this.frF = false;
    this.frG = null;
    g.Rg().a(158, this);
    AppMethodBeat.o(77910);
  }

  private int a(h paramh)
  {
    AppMethodBeat.i(77914);
    if ((this.frG == null) || (this.frG.dpg()))
      this.frG = new az(1, "get-hd-headimg", 1);
    int i = this.frG.e(new e.b(this, paramh));
    AppMethodBeat.o(77914);
    return i;
  }

  public final int a(String paramString, e.c paramc)
  {
    AppMethodBeat.i(77912);
    Assert.assertTrue("GetHDHeadImg must set callback", true);
    int i;
    if (bo.isNullOrNil(paramString))
    {
      paramc.cr(3, -101);
      i = -101;
      AppMethodBeat.o(77912);
      return i;
    }
    this.frD = paramc;
    if (ad.mR(paramString));
    for (String str = ad.aoC(paramString); ; str = paramString)
    {
      this.fro = o.act().qo(str);
      ab.d("MicroMsg.GetHDHeadImgHelper", "GetHDHeadImg: %s", new Object[] { str });
      if ((this.fro == null) || (!this.fro.getUsername().equals(str)))
      {
        this.fro = new h();
        this.fro.username = str;
      }
      if (bo.isNullOrNil(this.fro.ack()))
      {
        ab.w("MicroMsg.GetHDHeadImgHelper", "dkhurl [%s] has NO URL flag:%d !", new Object[] { paramString, Integer.valueOf(this.fro.dtR) });
        this.frE = new k(str);
        if (!g.Rg().a(this.frE, 0))
        {
          paramc.cr(3, -102);
          i = -102;
          AppMethodBeat.o(77912);
          break;
        }
        AppMethodBeat.o(77912);
        i = 0;
        break;
      }
      if (a(this.fro) == 0)
      {
        AppMethodBeat.o(77912);
        i = 0;
        break;
      }
      paramc.cr(3, -103);
      AppMethodBeat.o(77912);
      i = -103;
      break;
    }
  }

  public final void ach()
  {
    AppMethodBeat.i(77911);
    g.Rg().b(158, this);
    AppMethodBeat.o(77911);
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(77913);
    this.frD.cr(paramInt1, paramInt2);
    AppMethodBeat.o(77913);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ah.e
 * JD-Core Version:    0.6.2
 */