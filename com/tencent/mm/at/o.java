package com.tencent.mm.at;

import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.e.d;
import com.tencent.mm.cache.e.a;
import com.tencent.mm.cd.h.d;
import com.tencent.mm.kernel.e;
import com.tencent.mm.model.at;
import com.tencent.mm.model.q;
import com.tencent.mm.modelsfs.SFSContext;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;

public class o
  implements at
{
  private static HashMap<Integer, h.d> eaA;
  private g fGm;
  private i fGn;
  private c fGo;
  private j fGp;
  private d fGq;
  private h fGr;
  private b fGs;
  private p fGt;
  private com.tencent.mm.sdk.b.c fGu;
  private com.tencent.mm.at.a.a fGv;
  private SFSContext fGw;
  private SFSContext fGx;

  static
  {
    AppMethodBeat.i(78394);
    HashMap localHashMap = new HashMap();
    eaA = localHashMap;
    localHashMap.put(Integer.valueOf("IMGINFO_TABLE".hashCode()), new o.2());
    AppMethodBeat.o(78394);
  }

  public o()
  {
    AppMethodBeat.i(78383);
    this.fGp = new j();
    this.fGq = null;
    this.fGr = new h();
    this.fGs = null;
    this.fGt = null;
    this.fGu = new o.1(this);
    this.fGv = null;
    this.fGw = null;
    this.fGx = null;
    AppMethodBeat.o(78383);
  }

  private static o ahi()
  {
    try
    {
      AppMethodBeat.i(78384);
      o localo = (o)q.Y(o.class);
      AppMethodBeat.o(78384);
      return localo;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public static i ahj()
  {
    AppMethodBeat.i(78385);
    if (ahi().fGn == null)
      ahi().fGn = new i();
    i locali = ahi().fGn;
    AppMethodBeat.o(78385);
    return locali;
  }

  public static c ahk()
  {
    AppMethodBeat.i(78386);
    com.tencent.mm.kernel.g.RN().QU();
    if (ahi().fGo == null)
      ahi().fGo = new c();
    c localc = ahi().fGo;
    AppMethodBeat.o(78386);
    return localc;
  }

  public static g ahl()
  {
    AppMethodBeat.i(78387);
    com.tencent.mm.kernel.g.RN().QU();
    if (ahi().fGm == null)
      ahi().fGm = new g(com.tencent.mm.kernel.g.RP().eJN);
    g localg = ahi().fGm;
    AppMethodBeat.o(78387);
    return localg;
  }

  public static d ahm()
  {
    AppMethodBeat.i(78388);
    com.tencent.mm.kernel.g.RN().QU();
    if (ahi().fGq == null)
      ahi().fGq = new d();
    d locald = ahi().fGq;
    AppMethodBeat.o(78388);
    return locald;
  }

  public static b ahn()
  {
    AppMethodBeat.i(78389);
    com.tencent.mm.kernel.g.RN().QU();
    if (ahi().fGs == null)
      ahi().fGs = new b(Looper.getMainLooper());
    b localb = ahi().fGs;
    AppMethodBeat.o(78389);
    return localb;
  }

  public static p aho()
  {
    AppMethodBeat.i(78390);
    com.tencent.mm.kernel.g.RN().QU();
    if (ahi().fGt == null)
      ahi().fGt = new p();
    p localp = ahi().fGt;
    AppMethodBeat.o(78390);
    return localp;
  }

  public static com.tencent.mm.at.a.a ahp()
  {
    AppMethodBeat.i(78391);
    com.tencent.mm.kernel.g.RN().QU();
    if (ahi().fGv == null)
      ahi().fGv = com.tencent.mm.at.a.a.ahv();
    com.tencent.mm.at.a.a locala = ahi().fGv;
    AppMethodBeat.o(78391);
    return locala;
  }

  public static SFSContext ahq()
  {
    return null;
  }

  public final HashMap<Integer, h.d> Jx()
  {
    return eaA;
  }

  public final void bA(boolean paramBoolean)
  {
  }

  public final void bz(boolean paramBoolean)
  {
    AppMethodBeat.i(78393);
    e.d.a(Integer.valueOf(3), this.fGr);
    e.d.a(Integer.valueOf(23), this.fGr);
    e.a.a("local_cdn_img_cache", this.fGp);
    com.tencent.mm.sdk.b.a.xxA.c(this.fGu);
    AppMethodBeat.o(78393);
  }

  public final void iy(int paramInt)
  {
  }

  public final void onAccountRelease()
  {
    AppMethodBeat.i(78392);
    o localo = ahi();
    if (localo.fGn != null)
    {
      ??? = localo.fGn;
      ((i)???).cqV = 0;
      com.tencent.mm.kernel.g.RO().eJo.b(110, (com.tencent.mm.ai.f)???);
    }
    b localb;
    if (localo.fGs != null)
      localb = localo.fGs;
    synchronized (localb.fCV)
    {
      localb.fCV.clear();
      localb.fCW = 0L;
      ahm().a(localb);
      com.tencent.mm.sdk.b.a.xxA.d(localb.fDh);
      com.tencent.mm.sdk.b.a.xxA.d(localb.fDi);
      if (localo.fGq == null)
        break label203;
      ??? = localo.fGq;
      ab.i("ModelImage.DownloadImgService", "on detach");
      ab.i("ModelImage.DownloadImgService", "cancel all net scene");
      ((d)???).fDr = true;
      ((d)???).b(((d)???).fDp);
      if (((d)???).fDn.size() > 0)
        ((d)???).b((d.b)((d)???).fDn.get(0));
    }
    ((d)???).agN();
    com.tencent.mm.kernel.g.RO().eJo.b(109, (com.tencent.mm.ai.f)???);
    label203: if (localObject1.fGt != null)
    {
      ??? = localObject1.fGt;
      ab.i("MicroMsg.UrlImageCacheService", "detach");
      ((p)???).fGz.clear();
      ((p)???).fGB = true;
    }
    ??? = ahi().fGm;
    if (??? != null)
    {
      ab.i("MicroMsg.ImgInfoStorage", "clearCacheMap stack:%s", new Object[] { bo.dpG() });
      ((g)???).fEh.clear();
    }
    ??? = ahi().fGv;
    if (??? != null)
      ((com.tencent.mm.at.a.a)???).detach();
    e.d.b(Integer.valueOf(3), this.fGr);
    e.d.b(Integer.valueOf(23), this.fGr);
    e.a.a("local_cdn_img_cache", null);
    com.tencent.mm.sdk.b.a.xxA.d(this.fGu);
    if (localObject1.fGv != null)
    {
      localObject1.fGv.detach();
      localObject1.fGv = null;
    }
    if (localObject1.fGw != null)
    {
      localObject1.fGw.release();
      localObject1.fGw = null;
    }
    if (localObject1.fGx != null)
    {
      localObject1.fGx.release();
      localObject1.fGx = null;
    }
    AppMethodBeat.o(78392);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.at.o
 * JD-Core Version:    0.6.2
 */