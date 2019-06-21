package com.tencent.mm.plugin.sns.model;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.tencent.mars.cdn.CdnLogic;
import com.tencent.mars.cdn.CdnLogic.C2CDownloadRequest;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.cl;
import com.tencent.mm.g.a.cl.a;
import com.tencent.mm.g.a.gh;
import com.tencent.mm.g.a.tc;
import com.tencent.mm.g.a.td;
import com.tencent.mm.i.h.a;
import com.tencent.mm.model.r;
import com.tencent.mm.model.t;
import com.tencent.mm.plugin.downloader.model.FileDownloadTaskInfo;
import com.tencent.mm.plugin.downloader.model.e.a;
import com.tencent.mm.plugin.expt.a.a.a;
import com.tencent.mm.plugin.fav.a.ad;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.a.b;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.a.d;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.a.e;
import com.tencent.mm.plugin.sns.storage.n;
import com.tencent.mm.plugin.sns.ui.SnsTransparentUI;
import com.tencent.mm.pluginsdk.model.app.q;
import com.tencent.mm.protocal.protobuf.aar;
import com.tencent.mm.protocal.protobuf.abf;
import com.tencent.mm.protocal.protobuf.axc;
import com.tencent.mm.protocal.protobuf.bau;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.az;
import com.tencent.mm.storage.z;
import java.io.File;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class AdLandingPagesProxy extends com.tencent.mm.remoteservice.a
{
  private static AdLandingPagesProxy qHk;
  public static AdLandingPagesProxy.f qHn;
  private Map<Long, AdLandingPagesProxy.e> callbacks;
  private com.tencent.mm.ai.f fur;
  private Map<com.tencent.mm.ai.m, Long> qHl;
  private com.tencent.mm.remoteservice.d qHm;
  private Map<Long, AdLandingPagesProxy.a> qHo;
  private a.b qHp;
  private Map<String, AdLandingPagesProxy.g> qHq;
  private Map<String, h.a> qHr;

  static
  {
    AppMethodBeat.i(36061);
    qHn = new AdLandingPagesProxy.f();
    AppMethodBeat.o(36061);
  }

  public AdLandingPagesProxy(com.tencent.mm.remoteservice.d paramd)
  {
    super(paramd);
    AppMethodBeat.i(35927);
    this.callbacks = new HashMap();
    this.qHl = new HashMap();
    this.fur = new AdLandingPagesProxy.1(this);
    this.qHo = new HashMap();
    this.qHp = new AdLandingPagesProxy.2(this);
    this.qHq = new HashMap();
    this.qHr = new HashMap();
    this.qHm = paramd;
    AppMethodBeat.o(35927);
  }

  private static SharedPreferences Ii()
  {
    AppMethodBeat.i(36018);
    SharedPreferences localSharedPreferences = ah.getContext().getSharedPreferences(ah.getPackageName() + "_comm_preferences", 0);
    AppMethodBeat.o(36018);
    return localSharedPreferences;
  }

  public static AdLandingPagesProxy getInstance()
  {
    AppMethodBeat.i(35928);
    if (qHk == null)
      qHk = new AdLandingPagesProxy(new com.tencent.mm.remoteservice.d(ah.getContext()));
    AdLandingPagesProxy localAdLandingPagesProxy = qHk;
    AppMethodBeat.o(35928);
    return localAdLandingPagesProxy;
  }

  @com.tencent.mm.remoteservice.e
  public void addCanvasCache(long paramLong, String paramString)
  {
    AppMethodBeat.i(36019);
    REMOTE_CALL("addCanvasCacheMM", new Object[] { Long.valueOf(paramLong), paramString });
    AppMethodBeat.o(36019);
  }

  @com.tencent.mm.remoteservice.f
  public void addCanvasCacheMM(long paramLong, String paramString)
  {
    AppMethodBeat.i(36020);
    com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.m.cqn().u(paramLong, paramString);
    AppMethodBeat.o(36020);
  }

  public void addReportInfo(String paramString1, String paramString2, String paramString3)
  {
    AppMethodBeat.i(36013);
    REMOTE_CALL("addReportInfoMM", new Object[] { paramString1, paramString2, paramString3 });
    AppMethodBeat.o(36013);
  }

  @com.tencent.mm.remoteservice.f
  public void addReportInfoMM(String paramString1, String paramString2, String paramString3)
  {
    AppMethodBeat.i(36012);
    com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.a locala = a.e.qVH;
    if ((paramString1 == null) || (paramString1.length() == 0))
      AppMethodBeat.o(36012);
    while (true)
    {
      return;
      paramString2 = new a.d(paramString2, paramString3);
      locala.qVD.put(paramString1, paramString2);
      AppMethodBeat.o(36012);
    }
  }

  @com.tencent.mm.remoteservice.e
  public void asyncCacheXml(String paramString)
  {
    AppMethodBeat.i(36021);
    REMOTE_CALL("asyncCacheXmlMM", new Object[] { paramString });
    AppMethodBeat.o(36021);
  }

  @com.tencent.mm.remoteservice.f
  public void asyncCacheXmlMM(String paramString)
  {
    AppMethodBeat.i(36022);
    com.tencent.mm.kernel.g.RQ();
    com.tencent.mm.kernel.g.RS().m(new AdLandingPagesProxy.3(this, paramString), 5000L);
    AppMethodBeat.o(36022);
  }

  @com.tencent.mm.remoteservice.e
  public void clearCallback()
  {
    AppMethodBeat.i(36039);
    REMOTE_CALL("clearCallbackMM", new Object[0]);
    this.qHq.clear();
    this.callbacks.clear();
    this.qHo.clear();
    AppMethodBeat.o(36039);
  }

  @com.tencent.mm.remoteservice.f
  public void clearCallbackMM()
  {
    AppMethodBeat.i(36038);
    this.qHl.clear();
    this.qHp = null;
    com.tencent.mm.kernel.g.RQ();
    com.tencent.mm.kernel.g.RO().eJo.b(1337, this.fur);
    com.tencent.mm.kernel.g.RQ();
    com.tencent.mm.kernel.g.RO().eJo.b(1210, this.fur);
    com.tencent.mm.kernel.g.RQ();
    com.tencent.mm.kernel.g.RO().eJo.b(2874, this.fur);
    com.tencent.mm.kernel.g.RQ();
    com.tencent.mm.kernel.g.RO().eJo.b(2721, this.fur);
    com.tencent.mm.kernel.g.RQ();
    com.tencent.mm.kernel.g.RO().eJo.b(1802, this.fur);
    AppMethodBeat.o(36038);
  }

  public void confirmDialPhoneNum(Activity paramActivity, String paramString)
  {
    AppMethodBeat.i(35942);
    if ((paramString == null) || (paramString.length() <= 0))
      AppMethodBeat.o(35942);
    while (true)
    {
      return;
      Intent localIntent = new Intent(ah.getContext(), SnsTransparentUI.class);
      localIntent.putExtra("phoneNum", paramString);
      localIntent.putExtra("op", 4);
      paramActivity.startActivity(localIntent);
      AppMethodBeat.o(35942);
    }
  }

  public void connect(Runnable paramRunnable)
  {
    AppMethodBeat.i(35926);
    this.qHm.connect(paramRunnable);
    AppMethodBeat.o(35926);
  }

  public int contactGetTypeTextFromUserName(String paramString)
  {
    AppMethodBeat.i(35932);
    paramString = REMOTE_CALL("contactGetTypeTextFromUserNameMM", new Object[] { paramString });
    int i;
    if (paramString == null)
    {
      AppMethodBeat.o(35932);
      i = 0;
    }
    while (true)
    {
      return i;
      i = ((Integer)paramString).intValue();
      AppMethodBeat.o(35932);
    }
  }

  @com.tencent.mm.remoteservice.f
  public int contactGetTypeTextFromUserNameMM(String paramString)
  {
    AppMethodBeat.i(35933);
    int i = t.nK(paramString);
    AppMethodBeat.o(35933);
    return i;
  }

  public void deleteDeferredDeepLink(String paramString)
  {
    AppMethodBeat.i(36016);
    REMOTE_CALL("deleteDeferredDeepLinkMM", new Object[] { paramString });
    AppMethodBeat.o(36016);
  }

  @com.tencent.mm.remoteservice.f
  public void deleteDeferredDeepLinkMM(String paramString)
  {
    AppMethodBeat.i(36017);
    Ii().edit().remove(paramString).commit();
    AppMethodBeat.o(36017);
  }

  public void doAdChannelScene(String paramString1, String paramString2, AdLandingPagesProxy.e parame)
  {
    AppMethodBeat.i(35974);
    long l = System.currentTimeMillis();
    this.callbacks.put(Long.valueOf(l), parame);
    REMOTE_CALL("doAdChannelSceneMM", new Object[] { Long.valueOf(l), paramString1, paramString2 });
    AppMethodBeat.o(35974);
  }

  @com.tencent.mm.remoteservice.f
  public void doAdChannelSceneMM(long paramLong, String paramString1, String paramString2)
  {
    AppMethodBeat.i(35975);
    paramString1 = new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.a.a(paramString1, paramString2);
    this.qHl.put(paramString1, Long.valueOf(paramLong));
    com.tencent.mm.kernel.g.RQ();
    com.tencent.mm.kernel.g.RO().eJo.a(paramString1, 0);
    com.tencent.mm.kernel.g.RQ();
    com.tencent.mm.kernel.g.RO().eJo.a(1210, this.fur);
    AppMethodBeat.o(35975);
  }

  public void doCgiReportCanvasBrowseInfo(int paramInt, String paramString)
  {
    AppMethodBeat.i(36034);
    REMOTE_CALL("doCgiReportCanvasBrowseInfoMM", new Object[] { Integer.valueOf(paramInt), paramString });
    AppMethodBeat.o(36034);
  }

  @com.tencent.mm.remoteservice.f
  public void doCgiReportCanvasBrowseInfoMM(int paramInt, String paramString)
  {
    AppMethodBeat.i(36035);
    axc localaxc = new axc();
    localaxc.wBd = paramInt;
    localaxc.wBl = ((int)(System.currentTimeMillis() / 1000L));
    localaxc.jBv = 1;
    localaxc.wBe = new com.tencent.mm.bt.b(paramString.getBytes());
    paramString = new ArrayList();
    paramString.add(localaxc);
    paramString = new com.tencent.mm.plugin.sns.a.b.e(paramString);
    com.tencent.mm.kernel.g.RQ();
    com.tencent.mm.kernel.g.RO().eJo.a(paramString, 0);
    com.tencent.mm.kernel.g.RQ();
    com.tencent.mm.kernel.g.RO().eJo.a(1802, this.fur);
    AppMethodBeat.o(36035);
  }

  public void doDynamicUpdateScene(String paramString1, String paramString2, String paramString3, AdLandingPagesProxy.e parame)
  {
    AppMethodBeat.i(35968);
    long l = System.currentTimeMillis();
    this.callbacks.put(Long.valueOf(l), parame);
    REMOTE_CALL("doDynamicUpdateSceneMM", new Object[] { Long.valueOf(l), paramString1, paramString2, paramString3 });
    AppMethodBeat.o(35968);
  }

  @com.tencent.mm.remoteservice.f
  public void doDynamicUpdateSceneMM(long paramLong, String paramString1, String paramString2, String paramString3)
  {
    AppMethodBeat.i(35969);
    paramString1 = new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.a.c(paramString1, paramString2, paramString3);
    this.qHl.put(paramString1, Long.valueOf(paramLong));
    com.tencent.mm.kernel.g.RQ();
    com.tencent.mm.kernel.g.RO().eJo.a(paramString1, 0);
    com.tencent.mm.kernel.g.RQ();
    com.tencent.mm.kernel.g.RO().eJo.a(1337, this.fur);
    com.tencent.mm.kernel.g.RQ();
    com.tencent.mm.kernel.g.RO().eJo.a(2721, this.fur);
    AppMethodBeat.o(35969);
  }

  public int doFav(Intent paramIntent, int paramInt)
  {
    AppMethodBeat.i(35965);
    paramIntent = REMOTE_CALL("doFavMM", new Object[] { paramIntent, Integer.valueOf(paramInt) });
    if (paramIntent == null)
    {
      AppMethodBeat.o(35965);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      paramInt = ((Integer)paramIntent).intValue();
      AppMethodBeat.o(35965);
    }
  }

  public int doFavAdlanding(long paramLong, String paramString1, int paramInt1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, int paramInt2, String paramString7, String paramString8)
  {
    AppMethodBeat.i(35963);
    paramString1 = REMOTE_CALL("doFavAdlandingMM", new Object[] { Long.valueOf(paramLong), paramString1, Integer.valueOf(paramInt1), paramString2, paramString3, paramString4, paramString5, paramString6, Integer.valueOf(paramInt2), paramString7, paramString8 });
    if (paramString1 == null)
    {
      paramInt1 = 0;
      AppMethodBeat.o(35963);
    }
    while (true)
    {
      return paramInt1;
      paramInt1 = ((Integer)paramString1).intValue();
      AppMethodBeat.o(35963);
    }
  }

  @com.tencent.mm.remoteservice.f
  public int doFavAdlandingMM(long paramLong, String paramString1, int paramInt1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, int paramInt2, String paramString7, String paramString8)
  {
    AppMethodBeat.i(35964);
    cl localcl = new cl();
    if ((paramInt1 == 1) || (paramInt1 == 2) || (paramInt1 == 3) || (paramInt1 == 4) || (paramInt1 == 9) || (paramInt1 == 10) || (paramInt1 == 11))
      bo.isNullOrNil(paramString1);
    ((ad)com.tencent.mm.kernel.g.K(ad.class)).a(localcl, paramString6.hashCode(), r.Yz(), paramString4, paramString5, paramString6, paramString7, paramString2);
    paramString1 = com.tencent.mm.model.v.nW(paramString3);
    localcl.cvA.cvF = paramString1;
    localcl.cvA.title = paramString4;
    localcl.cvA.desc = paramString5;
    paramString1 = localcl.cvA.cvC;
    if ((paramString1 != null) && (paramString1.wiv != null) && (paramString1.wiv.size() > 0) && (paramString1.wiv.get(0) != null))
    {
      ((aar)paramString1.wiv.get(0)).alg(paramString6);
      ((aar)paramString1.wiv.get(0)).akH(paramString4);
      ((aar)paramString1.wiv.get(0)).akI(paramString5);
      ((aar)paramString1.wiv.get(0)).alf(paramString8);
    }
    if (paramString1 != null)
    {
      paramString1.alB(paramString4);
      paramString1.alC(paramString5);
    }
    localcl.cvA.cvH = paramInt2;
    com.tencent.mm.sdk.b.a.xxA.m(localcl);
    paramInt1 = localcl.cvA.cvG;
    AppMethodBeat.o(35964);
    return paramInt1;
  }

  @com.tencent.mm.remoteservice.f
  public int doFavMM(Intent paramIntent, int paramInt)
  {
    AppMethodBeat.i(35966);
    cl localcl = new cl();
    ((ad)com.tencent.mm.kernel.g.K(ad.class)).a(localcl, paramIntent);
    localcl.cvA.cvH = paramInt;
    com.tencent.mm.sdk.b.a.xxA.m(localcl);
    paramInt = localcl.cvA.cvG;
    AppMethodBeat.o(35966);
    return paramInt;
  }

  public void doFavOfficialItemScene(String paramString, AdLandingPagesProxy.e parame)
  {
    AppMethodBeat.i(36029);
    if (bo.isNullOrNil(paramString))
    {
      ab.e("AdLandingPagesProxy", "doFavOfficialItemScene with empty itemBuff, interrupted!");
      AppMethodBeat.o(36029);
    }
    while (true)
    {
      return;
      long l = System.currentTimeMillis();
      this.callbacks.put(Long.valueOf(l), parame);
      REMOTE_CALL("doFavOfficialItemSceneMM", new Object[] { Long.valueOf(l), paramString });
      AppMethodBeat.o(36029);
    }
  }

  @com.tencent.mm.remoteservice.f
  public void doFavOfficialItemSceneMM(long paramLong, String paramString)
  {
    AppMethodBeat.i(36030);
    paramString = new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.a.b(paramString);
    this.qHl.put(paramString, Long.valueOf(paramLong));
    com.tencent.mm.kernel.g.RQ();
    com.tencent.mm.kernel.g.RO().eJo.a(paramString, 0);
    com.tencent.mm.kernel.g.RQ();
    com.tencent.mm.kernel.g.RO().eJo.a(2874, this.fur);
    AppMethodBeat.o(36030);
  }

  public void doSearchDynamicUpdateScene(String paramString, AdLandingPagesProxy.e parame)
  {
    AppMethodBeat.i(35971);
    long l = System.currentTimeMillis();
    this.callbacks.put(Long.valueOf(l), parame);
    REMOTE_CALL("doSearchDynamicUpdateSceneMM", new Object[] { Long.valueOf(l), paramString });
    AppMethodBeat.o(35971);
  }

  @com.tencent.mm.remoteservice.f
  public void doSearchDynamicUpdateSceneMM(long paramLong, String paramString)
  {
    AppMethodBeat.i(35972);
    paramString = new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.a.c(paramString);
    this.qHl.put(paramString, Long.valueOf(paramLong));
    com.tencent.mm.kernel.g.RQ();
    com.tencent.mm.kernel.g.RO().eJo.a(paramString, 0);
    com.tencent.mm.kernel.g.RQ();
    com.tencent.mm.kernel.g.RO().eJo.a(1337, this.fur);
    com.tencent.mm.kernel.g.RQ();
    com.tencent.mm.kernel.g.RO().eJo.a(2721, this.fur);
    AppMethodBeat.o(35972);
  }

  public void doTransimt(Activity paramActivity, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6)
  {
    AppMethodBeat.i(35967);
    Intent localIntent = new Intent(ah.getContext(), SnsTransparentUI.class);
    localIntent.putExtra("adlandingXml", paramString1);
    localIntent.putExtra("shareTitle", paramString2);
    localIntent.putExtra("shareThumbUrl", paramString3);
    localIntent.putExtra("shareDesc", paramString4);
    localIntent.putExtra("shareUrl", paramString5);
    localIntent.putExtra("statExtStr", paramString6);
    localIntent.putExtra("op", 2);
    paramActivity.startActivity(localIntent);
    AppMethodBeat.o(35967);
  }

  @com.tencent.mm.remoteservice.f
  public void doTransimtMM(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5)
  {
  }

  public void downloadLandingPageVideo(String paramString1, String paramString2, String paramString3, h.a parama)
  {
    AppMethodBeat.i(36044);
    if (bo.Q(new String[] { paramString1, paramString2, paramString3 }))
    {
      if (parama != null)
        parama.a(paramString1, -1, null);
      AppMethodBeat.o(36044);
    }
    while (true)
    {
      return;
      com.tencent.mm.plugin.report.service.h.pYm.k(955L, 20L, 1L);
      SharedPreferences localSharedPreferences = ah.getContext().getSharedPreferences("sns_ad_download_resource_preferences", 0);
      boolean bool = localSharedPreferences.getBoolean(paramString1, false);
      if (com.tencent.mm.vfs.e.ct(paramString3))
      {
        ab.i("AdLandingPagesProxy", "is already download %s", new Object[] { Boolean.valueOf(bool) });
        if (bool)
        {
          com.tencent.mm.plugin.report.service.h.pYm.k(955L, 21L, 1L);
          parama.a(paramString1, 0, null);
          AppMethodBeat.o(36044);
        }
        else
        {
          com.tencent.mm.plugin.report.service.h.pYm.k(955L, 22L, 1L);
        }
      }
      else
      {
        while (true)
        {
          if (!this.qHr.containsKey(paramString1))
            break label257;
          ab.i("%s is already in downloading", paramString2);
          AppMethodBeat.o(36044);
          break;
          if (bool)
          {
            ab.i("AdLandingPagesProxy", "last download file was deleted");
            com.tencent.mm.plugin.report.service.h.pYm.k(955L, 23L, 1L);
            localSharedPreferences.edit().putBoolean(paramString1, false).commit();
          }
          else
          {
            com.tencent.mm.plugin.report.service.h.pYm.k(955L, 24L, 1L);
          }
        }
        label257: if (parama != null)
          this.qHr.put(paramString1, parama);
        REMOTE_CALL("downloadLandingPageVideoMM", new Object[] { paramString1, paramString2, paramString3 });
        AppMethodBeat.o(36044);
      }
    }
  }

  @com.tencent.mm.remoteservice.f
  public void downloadLandingPageVideoMM(String paramString1, String paramString2, String paramString3)
  {
    AppMethodBeat.i(36049);
    ab.i("AdLandingPagesProxy", "add online video task [%s] url[%s] path[%s]", new Object[] { paramString1, paramString2, paramString3 });
    com.tencent.mm.plugin.report.service.h.pYm.k(955L, 25L, 1L);
    b localb = af.cnA();
    AdLandingPagesProxy.d locald = new AdLandingPagesProxy.d(this, paramString1);
    com.tencent.mm.i.h localh = new com.tencent.mm.i.h();
    localh.field_mediaId = paramString1;
    localh.url = paramString2;
    localh.egD = 1;
    localh.field_fileType = 100;
    localh.egy = 5;
    localh.concurrentCount = 3;
    localh.field_fullpath = paramString3;
    localh.egK = locald;
    localb.qHI.put(paramString1, paramString3);
    com.tencent.mm.modelvideo.o.alm().a(localh, false);
    AppMethodBeat.o(36049);
  }

  public void downloadLandingPagesImage(String paramString1, String paramString2, String paramString3, AdLandingPagesProxy.g paramg)
  {
    AppMethodBeat.i(36040);
    if ((bo.isNullOrNil(paramString1)) || (bo.isNullOrNil(paramString2)) || (bo.isNullOrNil(paramString3)))
    {
      if (paramg != null)
        paramg.cmD();
      AppMethodBeat.o(36040);
    }
    while (true)
    {
      return;
      if (paramg != null)
        this.qHq.put(paramString2, paramg);
      REMOTE_CALL("downloadLandingPagesImageMM", new Object[] { paramString1, paramString2, paramString3 });
      AppMethodBeat.o(36040);
    }
  }

  @com.tencent.mm.remoteservice.f
  public void downloadLandingPagesImageMM(String paramString1, String paramString2, String paramString3)
  {
    AppMethodBeat.i(36041);
    downloadLandingPagesImageMMImpl(paramString1, paramString2, paramString3);
    AppMethodBeat.o(36041);
  }

  public void downloadLandingPagesImageMMImpl(String paramString1, String paramString2, String paramString3)
  {
    AppMethodBeat.i(36042);
    ab.i("AdLandingPagesProxy", "downloadLandingPagesImageMMImpl");
    bau localbau = com.tencent.mm.modelsns.e.a(paramString2, 2, paramString3, paramString3, 1, 1, "");
    com.tencent.mm.plugin.sns.data.e locale = new com.tencent.mm.plugin.sns.data.e(localbau);
    locale.qFQ = 3;
    locale.nQB = localbau.Id;
    af.cnA().a(new AdLandingPagesProxy.c(this, localbau.Id));
    b localb = af.cnA();
    paramString3 = az.dtg();
    paramString3.oyB = ((int)(System.currentTimeMillis() / 1000L));
    localb.a(localbau, locale, paramString3, paramString1, paramString2);
    AppMethodBeat.o(36042);
  }

  @com.tencent.mm.remoteservice.e
  public void failed(long paramLong)
  {
    AppMethodBeat.i(35994);
    AdLandingPagesProxy.a locala = (AdLandingPagesProxy.a)this.qHo.get(Long.valueOf(paramLong));
    if (locala != null)
    {
      locala.cmC();
      this.qHo.remove(Long.valueOf(paramLong));
    }
    AppMethodBeat.o(35994);
  }

  public void favEditTag()
  {
    AppMethodBeat.i(35960);
    REMOTE_CALL("favEditTagMM", new Object[0]);
    AppMethodBeat.o(35960);
  }

  @com.tencent.mm.remoteservice.f
  public void favEditTagMM()
  {
    AppMethodBeat.i(35961);
    gh localgh = new gh();
    localgh.cAH.type = 35;
    com.tencent.mm.sdk.b.a.xxA.m(localgh);
    AppMethodBeat.o(35961);
  }

  public String getAccSnsPath()
  {
    AppMethodBeat.i(35936);
    String str = (String)REMOTE_CALL("getAccSnsPathMM", new Object[0]);
    AppMethodBeat.o(35936);
    return str;
  }

  @com.tencent.mm.remoteservice.f
  public String getAccSnsPathMM()
  {
    AppMethodBeat.i(35937);
    String str = af.getAccSnsPath();
    AppMethodBeat.o(35937);
    return str;
  }

  public int getAdVoteIndex(String paramString1, String paramString2, String paramString3)
  {
    AppMethodBeat.i(36023);
    int i = ((Integer)REMOTE_CALL("getAdVoteIndexMM", new Object[] { paramString1, paramString2, paramString3 })).intValue();
    AppMethodBeat.o(36023);
    return i;
  }

  @com.tencent.mm.remoteservice.f
  public int getAdVoteIndexMM(String paramString1, String paramString2, String paramString3)
  {
    AppMethodBeat.i(36024);
    int i = com.tencent.mm.plugin.sns.storage.v.ak(paramString1, paramString2, paramString3);
    AppMethodBeat.o(36024);
    return i;
  }

  public String getAdVoteInfo(String paramString1, String paramString2, String paramString3)
  {
    AppMethodBeat.i(36025);
    paramString1 = (String)REMOTE_CALL("getAdVoteInfoMM", new Object[] { paramString1, paramString2, paramString3 });
    AppMethodBeat.o(36025);
    return paramString1;
  }

  @com.tencent.mm.remoteservice.f
  public String getAdVoteInfoMM(String paramString1, String paramString2, String paramString3)
  {
    AppMethodBeat.i(36026);
    paramString1 = com.tencent.mm.plugin.sns.storage.v.al(paramString1, paramString2, paramString3);
    AppMethodBeat.o(36026);
    return paramString1;
  }

  public Object getCfg(int paramInt, Object paramObject)
  {
    AppMethodBeat.i(35930);
    Object localObject = REMOTE_CALL("getCfgMM", new Object[] { Integer.valueOf(paramInt), paramObject });
    if (localObject == null)
      AppMethodBeat.o(35930);
    while (true)
    {
      return paramObject;
      AppMethodBeat.o(35930);
      paramObject = localObject;
    }
  }

  @com.tencent.mm.remoteservice.f
  public Object getCfgMM(int paramInt, Object paramObject)
  {
    AppMethodBeat.i(35931);
    com.tencent.mm.kernel.g.RQ();
    paramObject = com.tencent.mm.kernel.g.RP().Ry().get(paramInt, paramObject);
    AppMethodBeat.o(35931);
    return paramObject;
  }

  public String getExpIdByKey(String paramString)
  {
    AppMethodBeat.i(35958);
    paramString = (String)REMOTE_CALL("getExpIdByKeyMM", new Object[] { paramString });
    AppMethodBeat.o(35958);
    return paramString;
  }

  @com.tencent.mm.remoteservice.f
  public String getExpIdByKeyMM(String paramString)
  {
    AppMethodBeat.i(35957);
    paramString = com.tencent.mm.model.c.c.abj().getExpIdByKey(paramString);
    AppMethodBeat.o(35957);
    return paramString;
  }

  public int getExpValueByKey(String paramString, int paramInt)
  {
    AppMethodBeat.i(35956);
    paramString = REMOTE_CALL("getExpValueByKeyMM", new Object[] { paramString, Integer.valueOf(paramInt) });
    if (paramString == null)
    {
      paramInt = -1;
      AppMethodBeat.o(35956);
    }
    while (true)
    {
      return paramInt;
      paramInt = ((Integer)paramString).intValue();
      AppMethodBeat.o(35956);
    }
  }

  @com.tencent.mm.remoteservice.f
  public int getExpValueByKeyMM(String paramString, int paramInt)
  {
    AppMethodBeat.i(35955);
    paramInt = com.tencent.mm.model.c.c.abj().en(paramString, paramInt);
    AppMethodBeat.o(35955);
    return paramInt;
  }

  public String getSnsAdCanvasExtXml(String paramString)
  {
    AppMethodBeat.i(36032);
    paramString = (String)REMOTE_CALL("getSnsAdCanvasExtXmlMM", new Object[] { paramString });
    AppMethodBeat.o(36032);
    return paramString;
  }

  @com.tencent.mm.remoteservice.f
  public String getSnsAdCanvasExtXmlMM(String paramString)
  {
    AppMethodBeat.i(36033);
    paramString = af.cnF().YS(paramString);
    if (paramString != null)
    {
      paramString = paramString.cqq().qTM;
      AppMethodBeat.o(36033);
    }
    while (true)
    {
      return paramString;
      paramString = "";
      AppMethodBeat.o(36033);
    }
  }

  public int getSnsAdType(String paramString)
  {
    AppMethodBeat.i(35940);
    int i = ((Integer)REMOTE_CALL("getSnsAdTypeMM", new Object[] { paramString })).intValue();
    AppMethodBeat.o(35940);
    return i;
  }

  @com.tencent.mm.remoteservice.f
  public int getSnsAdTypeMM(String paramString)
  {
    AppMethodBeat.i(35941);
    paramString = af.cnF().YS(paramString);
    int i;
    if (paramString != null)
    {
      i = paramString.crf();
      AppMethodBeat.o(35941);
    }
    while (true)
    {
      return i;
      i = 0;
      AppMethodBeat.o(35941);
    }
  }

  public String getSnsAid(String paramString)
  {
    AppMethodBeat.i(35938);
    paramString = (String)REMOTE_CALL("getSnsAidMM", new Object[] { paramString });
    AppMethodBeat.o(35938);
    return paramString;
  }

  @com.tencent.mm.remoteservice.f
  public String getSnsAidMM(String paramString)
  {
    AppMethodBeat.i(35939);
    paramString = af.cnF().YS(paramString);
    if (paramString != null)
    {
      paramString = paramString.cqZ();
      AppMethodBeat.o(35939);
    }
    while (true)
    {
      return paramString;
      paramString = "";
      AppMethodBeat.o(35939);
    }
  }

  public n getSnsInfo(String paramString)
  {
    n localn = null;
    Object localObject = null;
    AppMethodBeat.i(35949);
    try
    {
      paramString = (Bundle)REMOTE_CALL("getSnsInfoMM", new Object[] { paramString });
      if (paramString == null)
        AppMethodBeat.o(35949);
      for (paramString = (String)localObject; ; paramString = localn)
      {
        return paramString;
        localn = new n();
        if (paramString != null)
        {
          localObject = (ContentValues)paramString.getParcelable("values");
          localn.field_snsId = ((ContentValues)localObject).getAsLong("snsId").longValue();
          localn.field_userName = ((ContentValues)localObject).getAsString("userName");
          localn.field_localFlag = ((ContentValues)localObject).getAsInteger("localFlag").intValue();
          localn.field_createTime = ((ContentValues)localObject).getAsInteger("createTime").intValue();
          localn.field_head = ((ContentValues)localObject).getAsInteger("head").intValue();
          localn.field_localPrivate = ((ContentValues)localObject).getAsInteger("localPrivate").intValue();
          localn.field_type = ((ContentValues)localObject).getAsInteger("type").intValue();
          localn.field_sourceType = ((ContentValues)localObject).getAsInteger("sourceType").intValue();
          localn.field_likeFlag = ((ContentValues)localObject).getAsInteger("likeFlag").intValue();
          localn.field_pravited = ((ContentValues)localObject).getAsInteger("pravited").intValue();
          localn.field_stringSeq = ((ContentValues)localObject).getAsString("stringSeq");
          localn.field_content = ((ContentValues)localObject).getAsByteArray("content");
          localn.field_attrBuf = ((ContentValues)localObject).getAsByteArray("attrBuf");
          localn.field_postBuf = ((ContentValues)localObject).getAsByteArray("postBuf");
          localn.field_subType = ((ContentValues)localObject).getAsInteger("subType").intValue();
          if (((ContentValues)localObject).containsKey("rowid"))
            localn.xDa = ((ContentValues)localObject).getAsLong("rowid").longValue();
          localn.reX = paramString.getInt("localid");
          localObject = paramString.getBundle("adValues");
          if (localObject != null)
          {
            paramString = new com.tencent.mm.plugin.sns.storage.e();
            paramString.L((Bundle)localObject);
            localn.rfh = paramString;
          }
        }
        AppMethodBeat.o(35949);
      }
    }
    catch (Exception paramString)
    {
      while (true)
      {
        ab.printErrStackTrace("AdLandingPagesProxy", paramString, "", new Object[0]);
        paramString = localn;
      }
    }
  }

  @com.tencent.mm.remoteservice.f
  public Bundle getSnsInfoMM(String paramString)
  {
    AppMethodBeat.i(35950);
    paramString = af.cnF().YS(paramString);
    if (paramString == null)
    {
      paramString = null;
      AppMethodBeat.o(35950);
    }
    while (true)
    {
      return paramString;
      paramString = paramString.cqC();
      AppMethodBeat.o(35950);
    }
  }

  public String getSnsStatExtBySnsId(long paramLong)
  {
    AppMethodBeat.i(35934);
    String str = (String)REMOTE_CALL("getSnsStatExtBySnsIdMM", new Object[] { Long.valueOf(paramLong) });
    AppMethodBeat.o(35934);
    return str;
  }

  @com.tencent.mm.remoteservice.f
  public String getSnsStatExtBySnsIdMM(long paramLong)
  {
    AppMethodBeat.i(35935);
    Object localObject = af.cnI().ku(paramLong);
    if (localObject != null)
    {
      localObject = com.tencent.mm.plugin.sns.a.b.f.a(((com.tencent.mm.plugin.sns.storage.e)localObject).cqu());
      AppMethodBeat.o(35935);
    }
    while (true)
    {
      return localObject;
      ab.v("SnsAdExtUtil", "getSnsStatExtBySnsId snsInfo null, snsId %s", new Object[] { Long.valueOf(paramLong) });
      localObject = "";
      AppMethodBeat.o(35935);
    }
  }

  public String getSnsTraceid(String paramString)
  {
    AppMethodBeat.i(35943);
    paramString = (String)REMOTE_CALL("getSnsTraceidMM", new Object[] { paramString });
    AppMethodBeat.o(35943);
    return paramString;
  }

  @com.tencent.mm.remoteservice.f
  public String getSnsTraceidMM(String paramString)
  {
    AppMethodBeat.i(35944);
    paramString = af.cnF().YS(paramString);
    if (paramString != null)
    {
      paramString = paramString.cra();
      AppMethodBeat.o(35944);
    }
    while (true)
    {
      return paramString;
      paramString = "";
      AppMethodBeat.o(35944);
    }
  }

  public String getSnsUxInfo(String paramString)
  {
    AppMethodBeat.i(35945);
    paramString = (String)REMOTE_CALL("getSnsUxInfoMM", new Object[] { paramString });
    AppMethodBeat.o(35945);
    return paramString;
  }

  @com.tencent.mm.remoteservice.f
  public String getSnsUxInfoMM(String paramString)
  {
    AppMethodBeat.i(35946);
    paramString = af.cnF().YS(paramString);
    if (paramString != null)
    {
      paramString = paramString.crc();
      AppMethodBeat.o(35946);
    }
    while (true)
    {
      return paramString;
      paramString = "";
      AppMethodBeat.o(35946);
    }
  }

  public int getStreamVideoPlayerConfig()
  {
    AppMethodBeat.i(36036);
    int i = ((Integer)REMOTE_CALL("getStreamVideoPlayerConfigMM", new Object[0])).intValue();
    AppMethodBeat.o(36036);
    return i;
  }

  @com.tencent.mm.remoteservice.f
  public int getStreamVideoPlayerConfigMM()
  {
    AppMethodBeat.i(36037);
    int i = ((com.tencent.mm.plugin.expt.a.a)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.expt.a.a.class)).a(a.a.lFW, 0);
    AppMethodBeat.o(36037);
    return i;
  }

  public int getTaskProgress(String paramString)
  {
    AppMethodBeat.i(36005);
    paramString = REMOTE_CALL("getTaskProgressMM", new Object[] { paramString });
    int i;
    if (paramString == null)
    {
      i = -1;
      AppMethodBeat.o(36005);
    }
    while (true)
    {
      return i;
      i = ((Integer)paramString).intValue();
      AppMethodBeat.o(36005);
    }
  }

  @com.tencent.mm.remoteservice.f
  public int getTaskProgressMM(String paramString)
  {
    AppMethodBeat.i(36004);
    com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.a locala = a.e.qVH;
    paramString = com.tencent.mm.plugin.downloader.model.d.bij().Ir(paramString);
    int i;
    if (paramString.jrb != 0L)
    {
      i = (int)(paramString.kNr * 100L / paramString.jrb);
      AppMethodBeat.o(36004);
    }
    while (true)
    {
      return i;
      i = 0;
      AppMethodBeat.o(36004);
    }
  }

  public String getUin()
  {
    AppMethodBeat.i(35951);
    Object localObject = REMOTE_CALL("getUinMM", new Object[0]);
    if (localObject == null)
    {
      localObject = "";
      AppMethodBeat.o(35951);
    }
    while (true)
    {
      return localObject;
      localObject = (String)localObject;
      AppMethodBeat.o(35951);
    }
  }

  @com.tencent.mm.remoteservice.f
  public String getUinMM()
  {
    AppMethodBeat.i(35952);
    com.tencent.mm.kernel.g.RN();
    String str = com.tencent.mm.kernel.a.QG();
    AppMethodBeat.o(35952);
    return str;
  }

  public boolean installApp(Context paramContext, String paramString1, String paramString2, String paramString3, String paramString4)
  {
    AppMethodBeat.i(36009);
    paramContext = REMOTE_CALL("installAppMM", new Object[] { paramString1, paramString2, paramString3, paramString4 });
    boolean bool;
    if (paramContext == null)
    {
      AppMethodBeat.o(36009);
      bool = false;
    }
    while (true)
    {
      return bool;
      bool = ((Boolean)paramContext).booleanValue();
      AppMethodBeat.o(36009);
    }
  }

  @com.tencent.mm.remoteservice.f
  public boolean installAppMM(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    boolean bool = false;
    AppMethodBeat.i(36008);
    com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.a locala = a.e.qVH;
    paramString3 = ah.getContext();
    paramString4 = new AdLandingPagesProxy.b(this, paramString1, paramString2, false);
    if ((paramString3 == null) || (TextUtils.isEmpty(paramString1)))
      AppMethodBeat.o(36008);
    while (true)
    {
      return bool;
      paramString1 = com.tencent.mm.plugin.downloader.model.d.bij().Ir(paramString1);
      if ((paramString1 != null) && (paramString1.status == 3) && (!TextUtils.isEmpty(paramString1.path)))
      {
        Uri localUri = Uri.fromFile(new File(paramString1.path));
        locala.Z(4, paramString1.id);
        q.a(paramString3, localUri, null);
        locala.a(paramString2, paramString4);
        bool = true;
        AppMethodBeat.o(36008);
      }
      else
      {
        AppMethodBeat.o(36008);
      }
    }
  }

  @com.tencent.mm.remoteservice.e
  public boolean isApkExist(String paramString)
  {
    AppMethodBeat.i(35981);
    paramString = REMOTE_CALL("isApkExistMM", new Object[] { paramString });
    boolean bool;
    if (paramString == null)
    {
      AppMethodBeat.o(35981);
      bool = false;
    }
    while (true)
    {
      return bool;
      bool = ((Boolean)paramString).booleanValue();
      AppMethodBeat.o(35981);
    }
  }

  @com.tencent.mm.remoteservice.f
  public boolean isApkExistMM(String paramString)
  {
    AppMethodBeat.i(35982);
    com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.a locala = a.e.qVH;
    paramString = com.tencent.mm.plugin.downloader.model.d.bij().Ir(paramString);
    boolean bool;
    if ((paramString != null) && (!TextUtils.isEmpty(paramString.path)) && (com.tencent.mm.vfs.e.ct(paramString.path)))
    {
      bool = true;
      AppMethodBeat.o(35982);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(35982);
    }
  }

  public int isAutoAdDownload()
  {
    AppMethodBeat.i(35959);
    Object localObject = REMOTE_CALL("isAutoAdDownloadMM", new Object[0]);
    int i;
    if (localObject == null)
    {
      AppMethodBeat.o(35959);
      i = 0;
    }
    while (true)
    {
      return i;
      i = ((Integer)localObject).intValue();
      AppMethodBeat.o(35959);
    }
  }

  @com.tencent.mm.remoteservice.f
  public int isAutoAdDownloadMM()
  {
    AppMethodBeat.i(35962);
    int i = af.cnC().b(null, null);
    AppMethodBeat.o(35962);
    return i;
  }

  public boolean isConnected()
  {
    AppMethodBeat.i(35929);
    boolean bool;
    if (this.qHm == null)
    {
      bool = false;
      AppMethodBeat.o(35929);
    }
    while (true)
    {
      return bool;
      bool = this.qHm.isConnected();
      AppMethodBeat.o(35929);
    }
  }

  public boolean isDownloading(String paramString)
  {
    AppMethodBeat.i(35984);
    paramString = REMOTE_CALL("isDownloadingMM", new Object[] { paramString });
    boolean bool;
    if (paramString == null)
    {
      AppMethodBeat.o(35984);
      bool = false;
    }
    while (true)
    {
      return bool;
      bool = ((Boolean)paramString).booleanValue();
      AppMethodBeat.o(35984);
    }
  }

  @com.tencent.mm.remoteservice.f
  public boolean isDownloadingMM(String paramString)
  {
    boolean bool = true;
    AppMethodBeat.i(35983);
    com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.a locala = a.e.qVH;
    paramString = com.tencent.mm.plugin.downloader.model.d.bij().Ir(paramString);
    if ((paramString != null) && (paramString.status == 1))
      AppMethodBeat.o(35983);
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(35983);
    }
  }

  public boolean isPaused(String paramString)
  {
    AppMethodBeat.i(35988);
    paramString = REMOTE_CALL("isPausedMM", new Object[] { paramString });
    boolean bool;
    if (paramString == null)
    {
      AppMethodBeat.o(35988);
      bool = false;
    }
    while (true)
    {
      return bool;
      bool = ((Boolean)paramString).booleanValue();
      AppMethodBeat.o(35988);
    }
  }

  @com.tencent.mm.remoteservice.f
  public boolean isPausedMM(String paramString)
  {
    AppMethodBeat.i(35987);
    com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.a locala = a.e.qVH;
    paramString = com.tencent.mm.plugin.downloader.model.d.bij().Ir(paramString);
    boolean bool;
    if ((paramString != null) && (paramString.status == 2))
    {
      bool = true;
      AppMethodBeat.o(35987);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(35987);
    }
  }

  public boolean isPkgInstalled(String paramString)
  {
    AppMethodBeat.i(35986);
    paramString = REMOTE_CALL("isPkgInstalledMM", new Object[] { paramString });
    boolean bool;
    if (paramString == null)
    {
      AppMethodBeat.o(35986);
      bool = false;
    }
    while (true)
    {
      return bool;
      bool = ((Boolean)paramString).booleanValue();
      AppMethodBeat.o(35986);
    }
  }

  @com.tencent.mm.remoteservice.f
  public boolean isPkgInstalledMM(String paramString)
  {
    AppMethodBeat.i(35985);
    Object localObject = a.e.qVH;
    localObject = ah.getContext();
    boolean bool;
    if ((localObject == null) || (TextUtils.isEmpty(paramString)))
    {
      bool = false;
      AppMethodBeat.o(35985);
    }
    while (true)
    {
      return bool;
      bool = com.tencent.mm.pluginsdk.model.app.p.u((Context)localObject, paramString);
      AppMethodBeat.o(35985);
    }
  }

  public boolean isRecExpAd(String paramString)
  {
    AppMethodBeat.i(35947);
    paramString = REMOTE_CALL("isRecExpAdMM", new Object[] { paramString });
    boolean bool;
    if (paramString == null)
    {
      AppMethodBeat.o(35947);
      bool = false;
    }
    while (true)
    {
      return bool;
      bool = ((Boolean)paramString).booleanValue();
      AppMethodBeat.o(35947);
    }
  }

  @com.tencent.mm.remoteservice.f
  public boolean isRecExpAdMM(String paramString)
  {
    AppMethodBeat.i(35948);
    paramString = af.cnF().YS(paramString);
    boolean bool;
    if (paramString == null)
    {
      bool = false;
      AppMethodBeat.o(35948);
    }
    while (true)
    {
      return bool;
      bool = paramString.coX();
      AppMethodBeat.o(35948);
    }
  }

  public boolean isUseSnsDownloadImage()
  {
    AppMethodBeat.i(36058);
    Object localObject = REMOTE_CALL("isUseSnsDownloadImageMM", new Object[0]);
    boolean bool;
    if (localObject == null)
    {
      AppMethodBeat.o(36058);
      bool = false;
    }
    while (true)
    {
      return bool;
      bool = ((Boolean)localObject).booleanValue();
      AppMethodBeat.o(36058);
    }
  }

  @com.tencent.mm.remoteservice.f
  public boolean isUseSnsDownloadImageMM()
  {
    AppMethodBeat.i(36059);
    AdLandingPagesProxy.f localf = qHn;
    int i;
    if (bo.yz() - localf.lastUpdateTime > 3600L)
      i = 1;
    while (true)
    {
      if (i != 0)
        localf.qHu = false;
      try
      {
        if (com.tencent.mm.kernel.g.RK())
        {
          com.tencent.mm.storage.c localc = com.tencent.mm.model.c.c.abi().ll("100348");
          if (localc.isValid())
            if (bo.getInt((String)localc.dru().get("downloadMode"), 0) != 1)
              break label120;
        }
        label120: for (boolean bool = true; ; bool = false)
        {
          localf.qHu = bool;
          localf.lastUpdateTime = bo.yz();
          bool = qHn.qHu;
          AppMethodBeat.o(36059);
          return bool;
          i = 0;
          break;
        }
      }
      catch (Exception localException)
      {
        while (true)
          ab.printErrStackTrace("AdLandingPagesProxy", localException, "get abtest failed!", new Object[0]);
      }
    }
  }

  public boolean isVideoDataAvailable(String paramString, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(36052);
    paramString = REMOTE_CALL("isVideoDataAvailableMM", new Object[] { paramString, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    boolean bool;
    if (paramString == null)
    {
      AppMethodBeat.o(36052);
      bool = false;
    }
    while (true)
    {
      return bool;
      bool = ((Boolean)paramString).booleanValue();
      AppMethodBeat.o(36052);
    }
  }

  @com.tencent.mm.remoteservice.f
  public boolean isVideoDataAvailableMM(String paramString, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(36053);
    boolean bool = com.tencent.mm.modelvideo.o.alm().isVideoDataAvailable(paramString, paramInt1, paramInt2);
    ab.i("AdLandingPagesProxy", "is video data avaiable %s %d %d %s", new Object[] { paramString, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Boolean.valueOf(bool) });
    AppMethodBeat.o(36053);
    return bool;
  }

  @com.tencent.mm.remoteservice.e
  public void onAdChannelEnd(long paramLong, int paramInt1, int paramInt2, Object paramObject)
  {
    AppMethodBeat.i(35973);
    AdLandingPagesProxy.e locale = (AdLandingPagesProxy.e)this.callbacks.remove(Long.valueOf(paramLong));
    if (locale != null)
      locale.f(paramInt1, paramInt2, paramObject);
    AppMethodBeat.o(35973);
  }

  public void onCallback(String paramString, Bundle paramBundle, boolean paramBoolean)
  {
    AppMethodBeat.i(35980);
    ab.d("AdLandingPagesProxy", "class:%s, method:%s, clientCall:%B", new Object[] { getClass().getName(), paramString, Boolean.valueOf(paramBoolean) });
    Object localObject1 = null;
    try
    {
      Method[] arrayOfMethod = getClass().getMethods();
      int i = arrayOfMethod.length;
      int j = 0;
      Object localObject2 = localObject1;
      if (j < i)
      {
        localObject2 = arrayOfMethod[j];
        if (!((Method)localObject2).getName().equalsIgnoreCase(paramString));
      }
      else
      {
        if (localObject2 == null)
          break label183;
        if (!paramBoolean)
          break label165;
        paramString = com.tencent.mm.remoteservice.e.class;
        label102: if (!((Method)localObject2).isAnnotationPresent(paramString))
          break label183;
        paramString = ((Method)localObject2).invoke(this, getArgs(paramBundle));
        if (((Method)localObject2).getReturnType() == Void.TYPE)
          break label183;
        if (!(paramString instanceof Parcelable))
          break label172;
        paramBundle.putParcelable("result_key", (Parcelable)paramString);
        AppMethodBeat.o(35980);
      }
      while (true)
      {
        return;
        j++;
        break;
        label165: paramString = com.tencent.mm.remoteservice.f.class;
        break label102;
        label172: paramBundle.putSerializable("result_key", (Serializable)paramString);
        label183: AppMethodBeat.o(35980);
      }
    }
    catch (Exception paramString)
    {
      while (true)
      {
        ab.e("AdLandingPagesProxy", "exception:%s", new Object[] { bo.l(paramString) });
        AppMethodBeat.o(35980);
      }
    }
  }

  @com.tencent.mm.remoteservice.e
  public void onCdnVideoDataAvailable(String paramString, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(36055);
    ab.i("AdLandingPagesProxy", "cdn video data available %s %d %d", new Object[] { paramString, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if (this.qHr.containsKey(paramString))
      ((h.a)this.qHr.get(paramString)).onDataAvailable(paramString, paramInt1, paramInt2);
    AppMethodBeat.o(36055);
  }

  @com.tencent.mm.remoteservice.e
  public void onCdnVideoFinish(String paramString, int paramInt)
  {
    AppMethodBeat.i(36057);
    ab.i("AdLandingPagesProxy", "cdn video finish %s, %d", new Object[] { paramString, Integer.valueOf(paramInt) });
    if (paramInt == 0)
      ah.getContext().getSharedPreferences("sns_ad_download_resource_preferences", 0).edit().putBoolean(paramString, true).commit();
    if (this.qHr.containsKey(paramString))
      ((h.a)this.qHr.remove(paramString)).a(paramString, paramInt, null);
    AppMethodBeat.o(36057);
  }

  @com.tencent.mm.remoteservice.e
  public void onCdnVideoMoovReady(String paramString, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(36054);
    ab.i("AdLandingPagesProxy", "cdn video moov ready %s %d %d", new Object[] { paramString, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if (this.qHr.containsKey(paramString))
      ((h.a)this.qHr.get(paramString)).onMoovReady(paramString, paramInt1, paramInt2);
    AppMethodBeat.o(36054);
  }

  @com.tencent.mm.remoteservice.e
  public void onCdnVideoProgress(String paramString, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(36056);
    ab.i("AdLandingPagesProxy", "cdn video progress %s %d %d", new Object[] { paramString, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if (this.qHr.containsKey(paramString))
      ((h.a)this.qHr.get(paramString)).h(paramString, paramInt1, paramInt2);
    AppMethodBeat.o(36056);
  }

  @com.tencent.mm.remoteservice.e
  public void onDynamicUpdateEnd(long paramLong, String paramString)
  {
    AppMethodBeat.i(35970);
    AdLandingPagesProxy.e locale = (AdLandingPagesProxy.e)this.callbacks.remove(Long.valueOf(paramLong));
    if ((locale != null) && (!bo.isNullOrNil(paramString)))
      locale.ao(paramString);
    AppMethodBeat.o(35970);
  }

  @com.tencent.mm.remoteservice.e
  public void onFavOfficialItemEnd(long paramLong, String paramString, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(36031);
    AdLandingPagesProxy.e locale = (AdLandingPagesProxy.e)this.callbacks.remove(Long.valueOf(paramLong));
    if ((paramInt1 != 0) || (paramInt2 != 0))
      ab.e("AdLandingPagesProxy", "FavOfficialItem fail, errrType[%d], errCode[%d], item_buff[%s]", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    while (true)
    {
      if (locale != null)
        locale.f(paramInt1, paramInt2, null);
      AppMethodBeat.o(36031);
      return;
      ab.i("AdLandingPagesProxy", "FavOfficialItem succeed, item_buff[%s]", new Object[] { paramString });
    }
  }

  @com.tencent.mm.remoteservice.e
  public void onImgDownloadCallback(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(36043);
    ab.i("AdLandingPagesProxy", "onImgDownloadCallback");
    if (bo.isNullOrNil(paramString))
      AppMethodBeat.o(36043);
    while (true)
    {
      return;
      paramString = (AdLandingPagesProxy.g)this.qHq.remove(paramString);
      if (paramString != null)
      {
        if (paramBoolean)
        {
          paramString.cmE();
          AppMethodBeat.o(36043);
        }
        else
        {
          paramString.cmD();
        }
      }
      else
        AppMethodBeat.o(36043);
    }
  }

  public boolean pauseTask(String paramString)
  {
    AppMethodBeat.i(36003);
    paramString = REMOTE_CALL("pauseTaskMM", new Object[] { paramString });
    boolean bool;
    if (paramString == null)
    {
      AppMethodBeat.o(36003);
      bool = false;
    }
    while (true)
    {
      return bool;
      bool = ((Boolean)paramString).booleanValue();
      AppMethodBeat.o(36003);
    }
  }

  @com.tencent.mm.remoteservice.f
  public boolean pauseTaskMM(String paramString)
  {
    AppMethodBeat.i(36002);
    com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.a locala = a.e.qVH;
    long l = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.a.queryIdByAppid(paramString);
    boolean bool = com.tencent.mm.plugin.downloader.model.d.bij().hn(l);
    AppMethodBeat.o(36002);
    return bool;
  }

  @com.tencent.mm.remoteservice.e
  public void paused(long paramLong)
  {
    AppMethodBeat.i(35991);
    AdLandingPagesProxy.a locala = (AdLandingPagesProxy.a)this.qHo.get(Long.valueOf(paramLong));
    if (locala != null)
      locala.cmA();
    AppMethodBeat.o(35991);
  }

  public void playTimelineBackAnimation(long paramLong)
  {
    AppMethodBeat.i(35978);
    long l = System.currentTimeMillis();
    this.callbacks.put(Long.valueOf(l), null);
    REMOTE_CALL("playTimelineBackAnimationMM", new Object[] { Long.valueOf(l), Long.valueOf(paramLong) });
    AppMethodBeat.o(35978);
  }

  @com.tencent.mm.remoteservice.f
  public void playTimelineBackAnimationMM(long paramLong1, long paramLong2)
  {
    AppMethodBeat.i(35979);
    tc localtc = new tc();
    localtc.cPp.cvc = paramLong2;
    com.tencent.mm.sdk.b.a.xxA.m(localtc);
    AppMethodBeat.o(35979);
  }

  public void playTimelineClickAnimation(long paramLong)
  {
    AppMethodBeat.i(35976);
    long l = System.currentTimeMillis();
    this.callbacks.put(Long.valueOf(l), null);
    REMOTE_CALL("playTimelineClickAnimationMM", new Object[] { Long.valueOf(l), Long.valueOf(paramLong) });
    AppMethodBeat.o(35976);
  }

  @com.tencent.mm.remoteservice.f
  public void playTimelineClickAnimationMM(long paramLong1, long paramLong2)
  {
    AppMethodBeat.i(35977);
    td localtd = new td();
    localtd.cPq.cvc = paramLong2;
    com.tencent.mm.sdk.b.a.xxA.m(localtd);
    AppMethodBeat.o(35977);
  }

  @com.tencent.mm.remoteservice.e
  public void progress(long paramLong, int paramInt)
  {
    AppMethodBeat.i(35990);
    ab.v("AdLandingPagesProxy", "progress client id %d , progress %d", new Object[] { Long.valueOf(paramLong), Integer.valueOf(paramInt) });
    AdLandingPagesProxy.a locala = (AdLandingPagesProxy.a)this.qHo.get(Long.valueOf(paramLong));
    if (locala != null)
      locala.CP(paramInt);
    AppMethodBeat.o(35990);
  }

  public long queryIdByAppid(String paramString)
  {
    AppMethodBeat.i(36001);
    paramString = REMOTE_CALL("queryIdByAppidMM", new Object[] { paramString });
    long l;
    if (paramString == null)
    {
      l = -1L;
      AppMethodBeat.o(36001);
    }
    while (true)
    {
      return l;
      l = ((Long)paramString).longValue();
      AppMethodBeat.o(36001);
    }
  }

  @com.tencent.mm.remoteservice.f
  public long queryIdByAppidMM(String paramString)
  {
    AppMethodBeat.i(36000);
    com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.a locala = a.e.qVH;
    long l = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.a.queryIdByAppid(paramString);
    AppMethodBeat.o(36000);
    return l;
  }

  public long[] queryVideoMoov(String paramString1, String paramString2, String paramString3)
  {
    AppMethodBeat.i(36047);
    ab.i("AdLandingPagesProxy", "mediaId %s, path %s, url %s", new Object[] { paramString1, paramString2, paramString3 });
    if (bo.Q(new String[] { paramString1, paramString2, paramString3 }))
    {
      paramString1 = null;
      AppMethodBeat.o(36047);
    }
    while (true)
    {
      return paramString1;
      paramString1 = (long[])REMOTE_CALL("queryVideoMoovMM", new Object[] { paramString1, paramString2, paramString3 });
      AppMethodBeat.o(36047);
    }
  }

  @com.tencent.mm.remoteservice.f
  public long[] queryVideoMoovMM(String paramString1, String paramString2, String paramString3)
  {
    AppMethodBeat.i(36048);
    CdnLogic.C2CDownloadRequest localC2CDownloadRequest = new CdnLogic.C2CDownloadRequest();
    localC2CDownloadRequest.fileKey = paramString1;
    localC2CDownloadRequest.fileType = 100;
    localC2CDownloadRequest.url = paramString3;
    localC2CDownloadRequest.savePath = paramString2;
    paramString1 = new long[2];
    if (CdnLogic.queryVideoMoovInfo(localC2CDownloadRequest, paramString1))
      AppMethodBeat.o(36048);
    while (true)
    {
      return paramString1;
      paramString1 = null;
      AppMethodBeat.o(36048);
    }
  }

  public void reportDownloadInfo(int paramInt, String paramString)
  {
    AppMethodBeat.i(36011);
    REMOTE_CALL("reportDownloadInfoMM", new Object[] { Integer.valueOf(paramInt), paramString });
    AppMethodBeat.o(36011);
  }

  @com.tencent.mm.remoteservice.f
  public void reportDownloadInfoMM(int paramInt, String paramString)
  {
    AppMethodBeat.i(36010);
    a.e.qVH.reportDownloadInfo(paramInt, paramString);
    AppMethodBeat.o(36010);
  }

  public void requestVideoData(String paramString, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(36050);
    com.tencent.mm.plugin.report.service.h.pYm.k(955L, 32L, 1L);
    REMOTE_CALL("requestVideoDataMM", new Object[] { paramString, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    AppMethodBeat.o(36050);
  }

  @com.tencent.mm.remoteservice.f
  public void requestVideoDataMM(String paramString, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(36051);
    com.tencent.mm.plugin.report.service.h.pYm.k(955L, 33L, 1L);
    com.tencent.mm.modelvideo.o.alm();
    com.tencent.mm.al.e.k(paramString, paramInt1, paramInt2);
    AppMethodBeat.o(36051);
  }

  public boolean resumeTask(String paramString1, AdLandingPagesProxy.a parama, String paramString2, String paramString3)
  {
    AppMethodBeat.i(36007);
    paramString2 = REMOTE_CALL("resumeTaskMM", new Object[] { paramString1, paramString2, paramString3 });
    if (paramString2 == null);
    for (boolean bool = false; ; bool = ((Boolean)paramString2).booleanValue())
    {
      if (bool)
        this.qHo.put(Long.valueOf(queryIdByAppid(paramString1)), parama);
      AppMethodBeat.o(36007);
      return bool;
    }
  }

  @com.tencent.mm.remoteservice.f
  public boolean resumeTaskMM(String paramString1, String paramString2, String paramString3)
  {
    AppMethodBeat.i(36006);
    com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.a locala = a.e.qVH;
    a.b localb = this.qHp;
    FileDownloadTaskInfo localFileDownloadTaskInfo = com.tencent.mm.plugin.downloader.model.d.bij().Ir(paramString1);
    boolean bool;
    if (localFileDownloadTaskInfo != null)
    {
      if (localb != null)
        locala.qHp = localb;
      locala.qVD.put(paramString1, new a.d(paramString2, paramString3));
      bool = com.tencent.mm.plugin.downloader.model.d.bij().ho(localFileDownloadTaskInfo.id);
      AppMethodBeat.o(36006);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(36006);
    }
  }

  @com.tencent.mm.remoteservice.e
  public void resumed(long paramLong)
  {
    AppMethodBeat.i(35995);
    this.qHo.get(Long.valueOf(paramLong));
    AppMethodBeat.o(35995);
  }

  public void saveAdVoteInfo(String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(36027);
    REMOTE_CALL("saveAdVoteInfoMM", new Object[] { paramString1, paramString2, paramString3, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    AppMethodBeat.o(36027);
  }

  @com.tencent.mm.remoteservice.f
  public void saveAdVoteInfoMM(String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(36028);
    com.tencent.mm.plugin.sns.storage.v.h(paramString1, paramString2, paramString3, paramInt1, paramInt2);
    AppMethodBeat.o(36028);
  }

  @com.tencent.mm.remoteservice.e
  public void start(long paramLong)
  {
    AppMethodBeat.i(35989);
    this.qHo.get(Long.valueOf(paramLong));
    AppMethodBeat.o(35989);
  }

  public long startDownload(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, boolean paramBoolean, AdLandingPagesProxy.a parama, String paramString6, String paramString7)
  {
    AppMethodBeat.i(35997);
    ab.v("AdLandingPagesProxy", "startDownload");
    paramString1 = REMOTE_CALL("startDownloadMM", new Object[] { paramString1, paramString2, paramString3, paramString4, paramString5, Boolean.valueOf(paramBoolean), paramString6, paramString7 });
    if (paramString1 == null);
    for (long l = -1L; ; l = ((Long)paramString1).longValue())
    {
      this.qHo.put(Long.valueOf(l), parama);
      AppMethodBeat.o(35997);
      return l;
    }
  }

  @com.tencent.mm.remoteservice.f
  public long startDownloadMM(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, boolean paramBoolean, String paramString6, String paramString7)
  {
    AppMethodBeat.i(35996);
    com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.a locala = a.e.qVH;
    AdLandingPagesProxy.b localb = new AdLandingPagesProxy.b(this, paramString1, paramString2, paramBoolean);
    a.b localb1 = this.qHp;
    e.a locala1 = new e.a();
    locala1.setAppId(paramString1);
    locala1.cY(paramString2);
    locala1.Iw(paramString3);
    locala1.It(paramString4);
    locala1.Iv(paramString5);
    locala1.ga(paramBoolean);
    paramString3 = locala1.kNl;
    long l = com.tencent.mm.plugin.downloader.model.d.bij().a(paramString3);
    if (localb1 != null)
      locala.qHp = localb1;
    if (paramBoolean)
      locala.a(paramString2, localb);
    locala.qVD.put(paramString1, new a.d(paramString6, paramString7));
    com.tencent.mm.plugin.downloader.model.d.bij();
    com.tencent.mm.plugin.downloader.model.b.a(locala.qVE);
    ab.i("AdLandingPagesProxy", "startDownloadMM, id %d", new Object[] { Long.valueOf(l) });
    AppMethodBeat.o(35996);
    return l;
  }

  public void stopDownloadLandingPageVideo(String paramString)
  {
    AppMethodBeat.i(36045);
    if (this.qHr.containsKey(paramString))
    {
      this.qHr.remove(paramString);
      ab.i("AdLandingPagesProxy", "stop download video %s", new Object[] { paramString });
      com.tencent.mm.plugin.report.service.h.pYm.k(955L, 34L, 1L);
      ah.getContext().getSharedPreferences("sns_ad_download_resource_preferences", 0).edit().putBoolean(paramString, false).commit();
    }
    REMOTE_CALL("stopDownloadLandingPageVideoMM", new Object[] { paramString });
    AppMethodBeat.o(36045);
  }

  @com.tencent.mm.remoteservice.f
  public void stopDownloadLandingPageVideoMM(String paramString)
  {
    AppMethodBeat.i(36046);
    af.cnA();
    b.XC(paramString);
    AppMethodBeat.o(36046);
  }

  public void stopTask(String paramString)
  {
    AppMethodBeat.i(35999);
    REMOTE_CALL("stopTaskMM", new Object[] { paramString });
    AppMethodBeat.o(35999);
  }

  @com.tencent.mm.remoteservice.f
  public void stopTaskMM(String paramString)
  {
    AppMethodBeat.i(35998);
    com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.a locala = a.e.qVH;
    paramString = com.tencent.mm.plugin.downloader.model.d.bij().Ir(paramString);
    if (paramString != null)
    {
      long l = paramString.id;
      com.tencent.mm.plugin.downloader.model.d.bij().hl(l);
    }
    AppMethodBeat.o(35998);
  }

  @com.tencent.mm.remoteservice.e
  public void stopped(long paramLong)
  {
    AppMethodBeat.i(35992);
    if ((AdLandingPagesProxy.a)this.qHo.get(Long.valueOf(paramLong)) != null)
      this.qHo.remove(Long.valueOf(paramLong));
    AppMethodBeat.o(35992);
  }

  @com.tencent.mm.remoteservice.e
  public void succeed(long paramLong)
  {
    AppMethodBeat.i(35993);
    AdLandingPagesProxy.a locala = (AdLandingPagesProxy.a)this.qHo.get(Long.valueOf(paramLong));
    if (locala != null)
    {
      locala.cmB();
      this.qHo.remove(Long.valueOf(paramLong));
    }
    AppMethodBeat.o(35993);
  }

  public boolean useOnlineStreamPlayer()
  {
    AppMethodBeat.i(35953);
    Object localObject = REMOTE_CALL("useOnlineStreamPlayerMM", new Object[0]);
    boolean bool;
    if (localObject == null)
    {
      AppMethodBeat.o(35953);
      bool = false;
    }
    while (true)
    {
      return bool;
      bool = ((Boolean)localObject).booleanValue();
      AppMethodBeat.o(35953);
    }
  }

  @com.tencent.mm.remoteservice.f
  public boolean useOnlineStreamPlayerMM()
  {
    AppMethodBeat.i(35954);
    com.tencent.mm.storage.c localc = com.tencent.mm.model.c.c.abi().ll("100208");
    boolean bool;
    if (localc.isValid())
    {
      int i = bo.getInt((String)localc.dru().get("useOnlineVideoPlayer"), 0);
      ab.i("AdLandingPagesProxy", "useOnlineVideoPlayer abtest=".concat(String.valueOf(i)));
      if (i == 1)
      {
        AppMethodBeat.o(35954);
        bool = true;
      }
    }
    while (true)
    {
      return bool;
      AppMethodBeat.o(35954);
      bool = false;
      continue;
      AppMethodBeat.o(35954);
      bool = false;
    }
  }

  public void writeDeferredDeepLink(String paramString1, String paramString2)
  {
    AppMethodBeat.i(36014);
    REMOTE_CALL("writeDeferredDeepLinkMM", new Object[] { paramString1, paramString2 });
    AppMethodBeat.o(36014);
  }

  @com.tencent.mm.remoteservice.f
  public void writeDeferredDeepLinkMM(String paramString1, String paramString2)
  {
    AppMethodBeat.i(36015);
    Ii().edit().putString(paramString1, paramString2).commit();
    AppMethodBeat.o(36015);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.model.AdLandingPagesProxy
 * JD-Core Version:    0.6.2
 */