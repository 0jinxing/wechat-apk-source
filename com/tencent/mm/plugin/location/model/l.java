package com.tencent.mm.plugin.location.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.e.d;
import com.tencent.mm.ai.f;
import com.tencent.mm.cd.h.d;
import com.tencent.mm.g.a.pc;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.at;
import com.tencent.mm.model.bz;
import com.tencent.mm.model.bz.a;
import com.tencent.mm.model.q;
import com.tencent.mm.modelsimple.u;
import com.tencent.mm.plugin.location.ui.impl.d;
import com.tencent.mm.plugin.messenger.foundation.a.a.h;
import com.tencent.mm.protocal.protobuf.bug;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.storage.bi;
import com.tencent.mm.storage.bi.b;
import java.util.HashMap;
import java.util.HashSet;

public class l
  implements at
{
  private bz.a nKA;
  private l.c nKh;
  private l.a nKi;
  private l.b nKj;
  private a.a nKk;
  private int nKl;
  private com.tencent.mm.model.e nKm;
  private com.tencent.mm.model.e nKn;
  private o nKo;
  private p nKp;
  private i nKq;
  private m nKr;
  private d nKs;
  private k nKt;
  private j nKu;
  private f nKv;
  private c nKw;
  private c nKx;
  private c nKy;
  private c nKz;

  public l()
  {
    AppMethodBeat.i(113362);
    this.nKh = new l.c((byte)0);
    this.nKi = new l.a((byte)0);
    this.nKj = new l.b((byte)0);
    this.nKl = 0;
    this.nKm = new b();
    this.nKn = new n();
    this.nKo = null;
    this.nKp = null;
    this.nKq = null;
    this.nKr = null;
    this.nKs = new d();
    this.nKt = null;
    this.nKu = null;
    this.nKv = new f()
    {
      public final void onSceneEnd(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, com.tencent.mm.ai.m paramAnonymousm)
      {
        AppMethodBeat.i(113343);
        if ((paramAnonymousInt1 == 0) && (paramAnonymousInt2 == 0))
        {
          paramAnonymousString = (u)paramAnonymousm;
          paramAnonymousm = paramAnonymousString.ajC();
          if (paramAnonymousm.jCt == 0)
            l.o(paramAnonymousString.cvx, u.tu(paramAnonymousm.vOt));
        }
        AppMethodBeat.o(113343);
      }
    };
    this.nKw = new l.2(this);
    this.nKx = new c()
    {
    };
    this.nKy = new l.4(this);
    this.nKz = new l.5(this);
    this.nKA = new l.6(this);
    AppMethodBeat.o(113362);
  }

  public static void X(bi parambi)
  {
    AppMethodBeat.i(113370);
    if ((parambi != null) && (parambi.field_msgId != 0L))
    {
      bi.b localb = bi.b.apD(parambi.field_content);
      parambi = new u((float)localb.nJv, (float)localb.nJu, parambi.field_msgId);
      g.Rg().a(parambi, 0);
    }
    AppMethodBeat.o(113370);
  }

  public static i bJA()
  {
    AppMethodBeat.i(113369);
    if (bJu().nKq == null)
      bJu().nKq = new i();
    i locali = bJu().nKq;
    AppMethodBeat.o(113369);
    return locali;
  }

  public static String bJB()
  {
    AppMethodBeat.i(113371);
    String str = g.RP().cachePath + "trackroom/";
    AppMethodBeat.o(113371);
    return str;
  }

  private static l bJu()
  {
    AppMethodBeat.i(113363);
    l locall = (l)q.Y(l.class);
    AppMethodBeat.o(113363);
    return locall;
  }

  public static a.a bJv()
  {
    AppMethodBeat.i(113364);
    g.RN().QU();
    if (bJu().nKk == null)
      bJu().nKk = new a.a();
    a.a locala = bJu().nKk;
    AppMethodBeat.o(113364);
    return locala;
  }

  public static k bJw()
  {
    AppMethodBeat.i(113365);
    g.RN().QU();
    if (bJu().nKt == null)
      bJu().nKt = new k();
    k localk = bJu().nKt;
    AppMethodBeat.o(113365);
    return localk;
  }

  public static j bJx()
  {
    AppMethodBeat.i(113366);
    g.RN().QU();
    if (bJu().nKu == null)
      bJu().nKu = new j();
    j localj = bJu().nKu;
    AppMethodBeat.o(113366);
    return localj;
  }

  public static o bJy()
  {
    AppMethodBeat.i(113367);
    if (bJu().nKo == null)
      bJu().nKo = new o();
    o localo = bJu().nKo;
    AppMethodBeat.o(113367);
    return localo;
  }

  public static p bJz()
  {
    AppMethodBeat.i(113368);
    if (bJu().nKp == null)
      bJu().nKp = new p();
    p localp = bJu().nKp;
    AppMethodBeat.o(113368);
    return localp;
  }

  public static void o(long paramLong, String paramString)
  {
    AppMethodBeat.i(113374);
    bi localbi = ((com.tencent.mm.plugin.messenger.foundation.a.j)g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).bOr().jf(paramLong);
    if (localbi.bAC())
    {
      localbi.jw(paramString);
      ((com.tencent.mm.plugin.messenger.foundation.a.j)g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).bOr().a(paramLong, localbi);
    }
    AppMethodBeat.o(113374);
  }

  public final HashMap<Integer, h.d> Jx()
  {
    return null;
  }

  public final void bA(boolean paramBoolean)
  {
  }

  public final void bz(boolean paramBoolean)
  {
    AppMethodBeat.i(113372);
    e.d.a(Integer.valueOf(48), this.nKm);
    e.d.a(Integer.valueOf(61), this.nKn);
    ((com.tencent.mm.plugin.messenger.foundation.a.p)g.M(com.tencent.mm.plugin.messenger.foundation.a.p.class)).getSysCmdMsgExtension().a("trackmsg", this.nKA, true);
    g.Rg().a(424, this.nKv);
    com.tencent.mm.sdk.b.a.xxA.c(this.nKh);
    com.tencent.mm.sdk.b.a.xxA.c(this.nKi);
    com.tencent.mm.sdk.b.a.xxA.c(this.nKw);
    com.tencent.mm.sdk.b.a.xxA.c(this.nKx);
    com.tencent.mm.sdk.b.a.xxA.c(this.nKy);
    com.tencent.mm.sdk.b.a.xxA.c(this.nKz);
    com.tencent.mm.sdk.b.a.xxA.c(this.nKj);
    com.tencent.mm.bh.d.fUv = bJy();
    com.tencent.mm.bh.d.fUu = bJz();
    if (bJu().nKr == null)
      bJu().nKr = new m();
    com.tencent.mm.bv.a.a.a.xtT = bJu().nKr;
    g.RN().QU();
    if (bJu().nKs == null)
      bJu().nKs = new d();
    com.tencent.mm.plugin.k.c.a.nRw = bJu().nKs;
    AppMethodBeat.o(113372);
  }

  public final void iy(int paramInt)
  {
  }

  public final void onAccountRelease()
  {
    AppMethodBeat.i(113373);
    if (this.nKo != null)
    {
      this.nKo.nKP = null;
      this.nKo.stop();
      this.nKo.xC(1);
    }
    e.d.b(Integer.valueOf(48), this.nKm);
    e.d.b(Integer.valueOf(61), this.nKn);
    ((com.tencent.mm.plugin.messenger.foundation.a.p)g.M(com.tencent.mm.plugin.messenger.foundation.a.p.class)).getSysCmdMsgExtension().b("trackmsg", this.nKA, true);
    g.Rg().b(424, this.nKv);
    com.tencent.mm.sdk.b.a.xxA.d(this.nKh);
    com.tencent.mm.sdk.b.a.xxA.d(this.nKi);
    com.tencent.mm.sdk.b.a.xxA.d(this.nKw);
    com.tencent.mm.sdk.b.a.xxA.d(this.nKx);
    com.tencent.mm.sdk.b.a.xxA.d(this.nKy);
    com.tencent.mm.sdk.b.a.xxA.d(this.nKz);
    com.tencent.mm.sdk.b.a.xxA.d(this.nKj);
    Object localObject;
    if (this.nKq != null)
    {
      localObject = this.nKq;
      ((i)localObject).bJt();
      ((i)localObject).nJM.clear();
    }
    if (this.nKt != null)
      this.nKt.stop();
    if (this.nKu != null)
    {
      localObject = this.nKu;
      bJw().b((com.tencent.mm.pluginsdk.location.a)localObject);
    }
    AppMethodBeat.o(113373);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.location.model.l
 * JD-Core Version:    0.6.2
 */