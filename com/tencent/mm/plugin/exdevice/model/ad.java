package com.tencent.mm.plugin.exdevice.model;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.at.a.a.c.a;
import com.tencent.mm.at.o;
import com.tencent.mm.cd.h.d;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.at;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.bw;
import com.tencent.mm.model.bz;
import com.tencent.mm.model.bz.a;
import com.tencent.mm.plugin.exdevice.b.k;
import com.tencent.mm.plugin.exdevice.service.f.a;
import com.tencent.mm.plugin.exdevice.service.u;
import com.tencent.mm.sdk.e.n.b;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bd;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public final class ad
  implements at
{
  private static HashMap<Integer, h.d> eaA;
  private ab lui;
  private b luj;
  private com.tencent.mm.plugin.exdevice.h.c luk;
  private com.tencent.mm.plugin.exdevice.f.b.b.d lul;
  private com.tencent.mm.plugin.exdevice.f.b.b.a lum;
  private com.tencent.mm.plugin.exdevice.f.b.b.b lun;
  private com.tencent.mm.plugin.exdevice.f.b.b.e luo;
  private e lup;
  private d luq;
  private com.tencent.mm.plugin.exdevice.f.b.c lur;
  private com.tencent.mm.plugin.exdevice.f.b.a lus;
  private com.tencent.mm.plugin.exdevice.f.a.c lut;
  private com.tencent.mm.at.a.a luu;
  private com.tencent.mm.at.a.a.c luv;
  private af luw;
  private h lux;
  private bz.a luy;
  n.b luz;

  static
  {
    AppMethodBeat.i(19405);
    HashMap localHashMap = new HashMap();
    eaA = localHashMap;
    localHashMap.put(Integer.valueOf("HARDDEVICEINFO_TABLE".hashCode()), new ad.1());
    eaA.put(Integer.valueOf("HARDDEVICERANKINFO_TABLE".hashCode()), new ad.3());
    eaA.put(Integer.valueOf("HARDDEVICERANKFOLLOWINFO_TABLE".hashCode()), new ad.4());
    eaA.put(Integer.valueOf("HARDDEVICELIKEINFO_TABLE".hashCode()), new ad.5());
    eaA.put(Integer.valueOf("HARDDEVICECHAMPIONINFO_TABLE".hashCode()), new ad.6());
    eaA.put(Integer.valueOf("HARDDEVICERANKDETAILINFO_TABLE".hashCode()), new ad.7());
    AppMethodBeat.o(19405);
  }

  public ad()
  {
    AppMethodBeat.i(19386);
    this.lui = new ab();
    this.luu = null;
    this.luv = null;
    this.luy = new ad.8(this);
    this.luz = new ad.9(this);
    if (this.luq == null)
      this.luq = new d();
    if (this.lup == null)
      this.lup = new e();
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.exdevice.SubCoreExDevice", "create SubCoreExDevice.");
    com.tencent.mm.sdk.b.a.xxA.c(this.lup.lrZ);
    AppMethodBeat.o(19386);
  }

  public static com.tencent.mm.at.a.a.c Kk(String paramString)
  {
    AppMethodBeat.i(19392);
    if (bo.isNullOrNil(paramString))
    {
      com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.exdevice.SubCoreExDevice", "newImageOptions failed, url is null or nil, return default.");
      paramString = boV();
      if (paramString.luv == null)
      {
        c.a locala = new c.a();
        o.ahq();
        locala.ePY = null;
        locala.ePO = 640;
        locala.ePN = 640;
        locala.ePF = false;
        locala.ePH = true;
        paramString.luv = locala.ahG();
      }
      paramString = boV().luv;
      AppMethodBeat.o(19392);
    }
    while (true)
    {
      return paramString;
      paramString = new c.a();
      paramString.ePO = 640;
      paramString.ePN = 640;
      paramString.ePF = false;
      paramString.ePG = true;
      aw.ZK();
      paramString.ePK = com.tencent.mm.model.c.XW();
      paramString = paramString.ahG();
      AppMethodBeat.o(19392);
    }
  }

  private static ad boV()
  {
    AppMethodBeat.i(19387);
    aw.ZE();
    ad localad1 = (ad)bw.oJ("plugin.exdevice");
    ad localad2 = localad1;
    if (localad1 == null)
    {
      com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.exdevice.SubCoreExDevice", "not found in MMCore, new one");
      localad2 = new ad();
      aw.ZE().a("plugin.exdevice", localad2);
    }
    AppMethodBeat.o(19387);
    return localad2;
  }

  public static com.tencent.mm.plugin.exdevice.h.c boW()
  {
    AppMethodBeat.i(19388);
    g.RN().QU();
    if (boV().luk == null)
    {
      localObject = boV();
      aw.ZK();
      ((ad)localObject).luk = new com.tencent.mm.plugin.exdevice.h.c(com.tencent.mm.model.c.Ru());
    }
    Object localObject = boV().luk;
    AppMethodBeat.o(19388);
    return localObject;
  }

  public static com.tencent.mm.plugin.exdevice.f.b.b.d boX()
  {
    AppMethodBeat.i(19389);
    g.RN().QU();
    if (boV().lul == null)
    {
      localObject = boV();
      aw.ZK();
      ((ad)localObject).lul = new com.tencent.mm.plugin.exdevice.f.b.b.d(com.tencent.mm.model.c.Ru());
    }
    Object localObject = boV().lul;
    AppMethodBeat.o(19389);
    return localObject;
  }

  public static com.tencent.mm.plugin.exdevice.f.b.b.a boY()
  {
    AppMethodBeat.i(19390);
    g.RN().QU();
    if (boV().lum == null)
    {
      localObject = boV();
      aw.ZK();
      ((ad)localObject).lum = new com.tencent.mm.plugin.exdevice.f.b.b.a(com.tencent.mm.model.c.Ru());
    }
    Object localObject = boV().lum;
    AppMethodBeat.o(19390);
    return localObject;
  }

  public static com.tencent.mm.at.a.a boZ()
  {
    AppMethodBeat.i(19391);
    if (boV().luu == null)
      boV().luu = o.ahp();
    com.tencent.mm.at.a.a locala = boV().luu;
    AppMethodBeat.o(19391);
    return locala;
  }

  public static com.tencent.mm.plugin.exdevice.f.b.b.b bpa()
  {
    AppMethodBeat.i(19393);
    g.RN().QU();
    if (boV().lun == null)
    {
      localObject = boV();
      aw.ZK();
      ((ad)localObject).lun = new com.tencent.mm.plugin.exdevice.f.b.b.b(com.tencent.mm.model.c.Ru());
    }
    Object localObject = boV().lun;
    AppMethodBeat.o(19393);
    return localObject;
  }

  public static com.tencent.mm.plugin.exdevice.f.b.b.e bpb()
  {
    AppMethodBeat.i(19394);
    g.RN().QU();
    if (boV().luo == null)
    {
      localObject = boV();
      aw.ZK();
      ((ad)localObject).luo = new com.tencent.mm.plugin.exdevice.f.b.b.e(com.tencent.mm.model.c.Ru());
    }
    Object localObject = boV().luo;
    AppMethodBeat.o(19394);
    return localObject;
  }

  public static b bpc()
  {
    AppMethodBeat.i(19395);
    g.RN().QU();
    if (boV().luj == null)
      boV().luj = new b();
    b localb = boV().luj;
    AppMethodBeat.o(19395);
    return localb;
  }

  public static d bpd()
  {
    AppMethodBeat.i(19396);
    if (boV().luq == null)
      boV().luq = new d();
    d locald = boV().luq;
    AppMethodBeat.o(19396);
    return locald;
  }

  public static com.tencent.mm.plugin.exdevice.f.b.c bpe()
  {
    AppMethodBeat.i(19397);
    if (boV().lur == null)
      boV().lur = new com.tencent.mm.plugin.exdevice.f.b.c();
    com.tencent.mm.plugin.exdevice.f.b.c localc = boV().lur;
    AppMethodBeat.o(19397);
    return localc;
  }

  public static com.tencent.mm.plugin.exdevice.f.b.a bpf()
  {
    AppMethodBeat.i(19398);
    if (boV().lus == null)
      boV().lus = new com.tencent.mm.plugin.exdevice.f.b.a();
    com.tencent.mm.plugin.exdevice.f.b.a locala = boV().lus;
    AppMethodBeat.o(19398);
    return locala;
  }

  public static com.tencent.mm.plugin.exdevice.f.a.c bpg()
  {
    AppMethodBeat.i(19399);
    if (boV().lut == null)
      boV().lut = new com.tencent.mm.plugin.exdevice.f.a.c();
    com.tencent.mm.plugin.exdevice.f.a.c localc = boV().lut;
    AppMethodBeat.o(19399);
    return localc;
  }

  public static e bph()
  {
    AppMethodBeat.i(19400);
    if (boV().lup == null)
      boV().lup = new e();
    e locale = boV().lup;
    AppMethodBeat.o(19400);
    return locale;
  }

  public static h bpi()
  {
    AppMethodBeat.i(19403);
    if (boV().lux == null)
      boV().lux = new h();
    h localh = boV().lux;
    AppMethodBeat.o(19403);
    return localh;
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
    AppMethodBeat.i(19401);
    aw.ZK();
    com.tencent.mm.model.c.XM().a(this.luz);
    Object localObject = k.bow();
    aw.Rg().a(538, (com.tencent.mm.ai.f)localObject);
    this.luw = new af();
    com.tencent.mm.sdk.b.a.xxA.c(this.lui);
    aw.getSysCmdMsgExtension().a("wcdevicemsg", this.luy, true);
    com.tencent.mm.sdk.b.a.xxA.c(bph().lrA);
    com.tencent.mm.sdk.b.a.xxA.c(bph().lrB);
    com.tencent.mm.sdk.b.a.xxA.c(bph().lrC);
    com.tencent.mm.sdk.b.a.xxA.c(bph().lrV);
    com.tencent.mm.sdk.b.a.xxA.c(bph().lrz);
    com.tencent.mm.sdk.b.a.xxA.c(bph().lry);
    com.tencent.mm.sdk.b.a.xxA.c(bph().lrD);
    com.tencent.mm.sdk.b.a.xxA.c(bph().lrE);
    com.tencent.mm.sdk.b.a.xxA.c(bph().lrF);
    com.tencent.mm.sdk.b.a.xxA.c(bph().lrW);
    com.tencent.mm.sdk.b.a.xxA.c(bph().lrG);
    com.tencent.mm.sdk.b.a.xxA.c(bph().lrH);
    com.tencent.mm.sdk.b.a.xxA.c(bph().lrI);
    com.tencent.mm.sdk.b.a.xxA.c(bph().lrK);
    com.tencent.mm.sdk.b.a.xxA.c(bph().lrJ);
    com.tencent.mm.sdk.b.a.xxA.c(bph().lrO);
    com.tencent.mm.sdk.b.a.xxA.c(bph().lrM);
    com.tencent.mm.sdk.b.a.xxA.c(bph().lrN);
    com.tencent.mm.sdk.b.a.xxA.c(bph().lrP);
    com.tencent.mm.sdk.b.a.xxA.c(bph().lrX);
    com.tencent.mm.sdk.b.a.xxA.c(bph().jDf);
    com.tencent.mm.sdk.b.a.xxA.c(bph().lrL);
    com.tencent.mm.sdk.b.a.xxA.c(bph().lrQ);
    com.tencent.mm.sdk.b.a.xxA.c(bph().lrR);
    com.tencent.mm.sdk.b.a.xxA.c(bph().lrS);
    com.tencent.mm.sdk.b.a.xxA.c(bph().lrT);
    com.tencent.mm.sdk.b.a.xxA.c(bph().lsh);
    com.tencent.mm.sdk.b.a.xxA.c(bph().lsi);
    com.tencent.mm.sdk.b.a.xxA.c(bph().lsj);
    com.tencent.mm.sdk.b.a.xxA.c(bph().lsl);
    com.tencent.mm.sdk.b.a.xxA.c(bph().lsk);
    com.tencent.mm.sdk.b.a.xxA.c(bph().lsa);
    com.tencent.mm.sdk.b.a.xxA.c(bph().lsb);
    com.tencent.mm.sdk.b.a.xxA.c(bph().lsc);
    com.tencent.mm.sdk.b.a.xxA.c(bph().lsd);
    com.tencent.mm.sdk.b.a.xxA.c(bph().lse);
    com.tencent.mm.sdk.b.a.xxA.c(bph().lsg);
    com.tencent.mm.sdk.b.a.xxA.c(bph().lrY);
    com.tencent.mm.sdk.b.a.xxA.c(bph().lrZ);
    localObject = i.lto;
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.exdevice.GetBoundDeviceLogic", "addSceneEndListener");
    aw.Rg().a(539, (com.tencent.mm.ai.f)localObject);
    com.tencent.mm.compatible.a.a.a(19, new ad.10(this));
    AppMethodBeat.o(19401);
  }

  public final void iy(int paramInt)
  {
  }

  public final void onAccountRelease()
  {
    AppMethodBeat.i(19402);
    aw.ZK();
    com.tencent.mm.model.c.XM().b(this.luz);
    com.tencent.mm.sdk.b.a.xxA.d(bph().lrA);
    com.tencent.mm.sdk.b.a.xxA.d(bph().lrB);
    com.tencent.mm.sdk.b.a.xxA.d(bph().lrC);
    com.tencent.mm.sdk.b.a.xxA.d(bph().lrV);
    com.tencent.mm.sdk.b.a.xxA.d(bph().lrX);
    com.tencent.mm.sdk.b.a.xxA.d(bph().lrz);
    com.tencent.mm.sdk.b.a.xxA.d(bph().lry);
    com.tencent.mm.sdk.b.a.xxA.d(bph().lrD);
    com.tencent.mm.sdk.b.a.xxA.d(bph().lrE);
    com.tencent.mm.sdk.b.a.xxA.d(bph().lrF);
    com.tencent.mm.sdk.b.a.xxA.d(bph().lrW);
    com.tencent.mm.sdk.b.a.xxA.d(bph().lsh);
    com.tencent.mm.sdk.b.a.xxA.d(bph().lsi);
    com.tencent.mm.sdk.b.a.xxA.d(bph().lsj);
    com.tencent.mm.sdk.b.a.xxA.d(bph().lsl);
    com.tencent.mm.sdk.b.a.xxA.d(bph().lsk);
    com.tencent.mm.sdk.b.a.xxA.d(bph().lsa);
    com.tencent.mm.sdk.b.a.xxA.d(bph().lsb);
    com.tencent.mm.sdk.b.a.xxA.d(bph().lsc);
    com.tencent.mm.sdk.b.a.xxA.d(bph().lsd);
    com.tencent.mm.sdk.b.a.xxA.d(bph().lse);
    com.tencent.mm.sdk.b.a.xxA.d(bph().lsg);
    com.tencent.mm.sdk.b.a.xxA.d(bph().lrH);
    com.tencent.mm.sdk.b.a.xxA.d(bph().lrY);
    com.tencent.mm.sdk.b.a.xxA.d(bph().lrZ);
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.exdevice.ExdeviceSharePreferencesManager", "releaseAllSharePreferences");
    Object localObject = ah.getContext().getSharedPreferences("exdevice_pref", 0);
    if (localObject == null)
    {
      com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.exdevice.ExdeviceSharePreferencesManager", "null == sp");
      localObject = u.bpx();
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.exdevice.ExdeviceInfoManager", "delAllDeviceAuthFlag");
      if (((com.tencent.mm.plugin.exdevice.service.f)localObject).lwJ != null)
        break label601;
      com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.exdevice.ExdeviceInfoManager", "null == exdeviceInfoList");
    }
    while (true)
    {
      localObject = k.bow();
      aw.Rg().b(538, (com.tencent.mm.ai.f)localObject);
      k.lqI = null;
      com.tencent.mm.sdk.b.a.xxA.d(this.lui);
      aw.getSysCmdMsgExtension().b("wcdevicemsg", this.luy, true);
      com.tencent.mm.sdk.b.a.xxA.d(bph().lrG);
      if (boV().luj != null)
        boV();
      localObject = i.lto;
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.exdevice.GetBoundDeviceLogic", "removeSceneEndListener");
      aw.Rg().b(539, (com.tencent.mm.ai.f)localObject);
      localObject = boV().luq;
      if ((((d)localObject).lre == null) || (((d)localObject).lre.isEmpty()))
        break label666;
      Iterator localIterator = ((d)localObject).lre.entrySet().iterator();
      while (localIterator.hasNext())
        ((ap)((Map.Entry)localIterator.next()).getValue()).stopTimer();
      if (((SharedPreferences)localObject).edit().clear().commit())
        break;
      com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.exdevice.ExdeviceSharePreferencesManager", "sp.edit().clear().commit() Failed!!!");
      break;
      label601: localIterator = ((com.tencent.mm.plugin.exdevice.service.f)localObject).lwJ.entrySet().iterator();
      while (localIterator.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        localObject = (f.a)localEntry.getValue();
        ((f.a)localObject).lwN = false;
        localEntry.setValue(localObject);
      }
    }
    ((d)localObject).lre.clear();
    label666: if (boV().lur != null)
    {
      localObject = boV().lur;
      aw.Rg().b(1042, (com.tencent.mm.ai.f)localObject);
      aw.Rg().b(1041, (com.tencent.mm.ai.f)localObject);
      aw.Rg().b(1043, (com.tencent.mm.ai.f)localObject);
      aw.Rg().b(1040, (com.tencent.mm.ai.f)localObject);
    }
    if (boV().luu != null)
      boV().luu.detach();
    localObject = this.luw;
    com.tencent.mm.sdk.b.a.xxA.d(((af)localObject).ecA);
    AppMethodBeat.o(19402);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.model.ad
 * JD-Core Version:    0.6.2
 */