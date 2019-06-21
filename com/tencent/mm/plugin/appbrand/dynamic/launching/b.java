package com.tencent.mm.plugin.appbrand.dynamic.launching;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.a.a;
import com.tencent.mm.ai.x;
import com.tencent.mm.g.b.a.ad;
import com.tencent.mm.ipcinvoker.f;
import com.tencent.mm.kernel.g;
import com.tencent.mm.modelappbrand.u;
import com.tencent.mm.modelappbrand.v;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.mm.plugin.appbrand.appcache.as;
import com.tencent.mm.plugin.appbrand.appcache.as.a;
import com.tencent.mm.plugin.appbrand.appcache.ax;
import com.tencent.mm.plugin.appbrand.appcache.az;
import com.tencent.mm.plugin.appbrand.appcache.az.a;
import com.tencent.mm.plugin.appbrand.appcache.bd;
import com.tencent.mm.plugin.appbrand.dynamic.f.a;
import com.tencent.mm.plugin.appbrand.dynamic.i;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.protocal.protobuf.arc;
import com.tencent.mm.protocal.protobuf.cwv;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;

public final class b
  implements Callable<WxaPkgWrappingInfo>
{
  public static int hoi = 0;
  public static int hoj = 1;
  final String appId;
  final int cBc;
  volatile int gVu;
  String hlm;
  int hog;
  volatile String hok;
  String hol;
  final String id;

  public b(String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2, int paramInt3, String paramString4)
  {
    this(paramString1, paramString2, paramString3, paramInt1, paramInt2, paramInt3, paramString4, "");
  }

  public b(String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2, int paramInt3, String paramString4, String paramString5)
  {
    this.id = paramString1;
    this.appId = paramString2;
    this.cBc = paramInt1;
    this.gVu = paramInt2;
    this.hok = paramString4;
    this.hog = paramInt3;
    this.hlm = paramString3;
    this.hol = paramString5;
  }

  private WxaPkgWrappingInfo Aj(String paramString)
  {
    AppMethodBeat.i(10921);
    final CountDownLatch localCountDownLatch = new CountDownLatch(1);
    final com.tencent.mm.plugin.appbrand.r.j localj = new com.tencent.mm.plugin.appbrand.r.j();
    az.a local1 = new az.a()
    {
    };
    v.kT(7);
    boolean bool;
    if ((this.cBc == 10002) || (this.cBc == 10102))
    {
      u.i("MicroMsg.AppBrand.PrepareStepCheckWidgetPkg", "triggerDownloading, debug type is release, start download appId(%s), pkgVersion(%d)", new Object[] { this.appId, Integer.valueOf(this.gVu) });
      if (!bo.isNullOrNil(paramString))
      {
        bool = bd.a(paramString, this.appId, this.gVu, this.cBc, local1);
        if (bool)
          break label384;
        v.kT(9);
        paramString = new ad().eZ(u.pr(this.id));
        paramString.cYw = u.pq(this.id);
        paramString.cYs = 4L;
        paramString = paramString.eY(this.id);
        paramString.cYt = System.currentTimeMillis();
        paramString.cYu = 2L;
        paramString.fa(com.tencent.mm.sdk.platformtools.at.gB(ah.getContext())).ajK();
        a(as.a.gUN);
        AppMethodBeat.o(10921);
        paramString = null;
      }
    }
    while (true)
    {
      return paramString;
      bool = az.b(this.appId, this.cBc, this.gVu, this.hok, local1);
      break;
      u.i("MicroMsg.AppBrand.PrepareStepCheckWidgetPkg", "triggerDownloading, appId = %s, debug type is %d", new Object[] { this.appId, Integer.valueOf(this.cBc) });
      if (((com.tencent.mm.plugin.appbrand.a.d)g.K(com.tencent.mm.plugin.appbrand.a.d.class)).xF() == null)
      {
        ab.e("MicroMsg.AppBrand.PrepareStepCheckWidgetPkg", "triggerDownloading, null storage");
        a(as.a.gUN);
        AppMethodBeat.o(10921);
        paramString = null;
        continue;
      }
      paramString = ((com.tencent.mm.plugin.appbrand.a.d)g.K(com.tencent.mm.plugin.appbrand.a.d.class)).xF().at(this.appId, this.cBc);
      if (bo.isNullOrNil(paramString))
      {
        u.e("MicroMsg.AppBrand.PrepareStepCheckWidgetPkg", "triggerDownloading, url is null or nil", new Object[0]);
        a(as.a.gUJ);
        AppMethodBeat.o(10921);
        paramString = null;
        continue;
      }
      az.a(this.appId, this.cBc, paramString, local1);
      try
      {
        label384: localCountDownLatch.await();
        paramString = (WxaPkgWrappingInfo)localj.value;
        AppMethodBeat.o(10921);
      }
      catch (Exception paramString)
      {
        while (true)
          ab.printErrStackTrace("MicroMsg.AppBrand.PrepareStepCheckWidgetPkg", paramString, "tryDownload semaphore exp ", new Object[0]);
      }
    }
  }

  private static void a(as.a parama)
  {
    AppMethodBeat.i(10922);
    u.i("MicroMsg.AppBrand.PrepareStepCheckWidgetPkg", "pkgRecordError %s", new Object[] { parama.toString() });
    if (as.a.gUJ.equals(parama))
      AppMethodBeat.o(10922);
    while (true)
    {
      return;
      if ((as.a.gUL.equals(parama)) || (as.a.gUK.equals(parama)))
        AppMethodBeat.o(10922);
      else
        AppMethodBeat.o(10922);
    }
  }

  public final WxaPkgWrappingInfo azZ()
  {
    Object localObject1 = null;
    int i = 1;
    AppMethodBeat.i(10920);
    Pair localPair = as.v(this.appId, this.cBc, this.gVu);
    if (localPair.second != null)
    {
      com.tencent.mm.plugin.appbrand.dynamic.j.azE().ba(this.appId, 29);
      localObject2 = (WxaPkgWrappingInfo)localPair.second;
      AppMethodBeat.o(10920);
    }
    com.tencent.mm.plugin.appbrand.appcache.at localat;
    label246: label376: label636: Object localObject3;
    while (true)
    {
      return localObject2;
      com.tencent.mm.plugin.appbrand.dynamic.j.azE().ba(this.appId, 3);
      if (!as.a.gUM.equals(localPair.first))
        break label1196;
      u.i("MicroMsg.AppBrand.PrepareStepCheckWidgetPkg", "pkg broken appid %s, pkgType %d, pkgVersion %d", new Object[] { this.appId, Integer.valueOf(this.cBc), Integer.valueOf(this.gVu) });
      if ((this.cBc != 10002) && (this.cBc != 10102))
        break label1311;
      localat = ((com.tencent.mm.plugin.appbrand.a.d)g.K(com.tencent.mm.plugin.appbrand.a.d.class)).xF().a(this.appId, this.cBc, new String[] { "version", "versionMd5", "versionState" });
      if (localat == null)
      {
        u.i("MicroMsg.AppBrand.PrepareStepCheckWidgetPkg", "pkgRecord is null", new Object[0]);
        a((as.a)localPair.first);
        AppMethodBeat.o(10920);
        localObject2 = localObject1;
      }
      else
      {
        if (this.cBc == 10102)
        {
          j = 2;
          v.kT(4);
          localObject2 = new ad().eZ(this.appId);
          ((ad)localObject2).cYw = u.pq(this.id);
          ((ad)localObject2).cYs = 13L;
          localObject2 = ((ad)localObject2).eY(this.id);
          ((ad)localObject2).cYt = System.currentTimeMillis();
          ((ad)localObject2).cYu = 2L;
          ((ad)localObject2).fa(com.tencent.mm.sdk.platformtools.at.gB(ah.getContext())).ajK();
          if (TextUtils.isEmpty(this.hol))
            break label1305;
          localObject2 = new arc();
          ((arc)localObject2).parseFrom(Base64.decode(this.hol, 0));
          if (!TextUtils.isEmpty(((arc)localObject2).url))
            break label621;
          localObject2 = null;
        }
        while (true)
        {
          if (localObject2 != null)
            break label1302;
          localObject2 = x.a(new com.tencent.mm.plugin.appbrand.appcache.d(this.appId, localat.field_version, localat.field_versionMd5, j));
          if ((localObject2 != null) && (((a.a)localObject2).errType == 0) && (((a.a)localObject2).errCode == 0))
            break label636;
          v.kT(6);
          localObject2 = new ad().eZ(this.appId);
          ((ad)localObject2).cYw = u.pq(this.id);
          ((ad)localObject2).cYs = 3L;
          localObject2 = ((ad)localObject2).eY(this.id);
          ((ad)localObject2).cYt = System.currentTimeMillis();
          ((ad)localObject2).cYu = 2L;
          ((ad)localObject2).fa(com.tencent.mm.sdk.platformtools.at.gB(ah.getContext())).ajK();
          if ((this.hog == 1) && (this.id != null) && (this.id.length() > 0))
          {
            localObject2 = new Bundle();
            ((Bundle)localObject2).putString("id", this.id);
            ((Bundle)localObject2).putInt("widgetState", 2105);
            f.a(i.azC().zV(this.id), (Parcelable)localObject2, f.a.class, null);
          }
          u.i("MicroMsg.AppBrand.PrepareStepCheckWidgetPkg", "get widget download url fail", new Object[0]);
          AppMethodBeat.o(10920);
          localObject2 = localObject1;
          break;
          j = 1;
          break label246;
          label621: u.i("MicroMsg.AppBrand.PrepareStepCheckWidgetPkg", "use preload download data", new Object[0]);
        }
        localObject2 = (arc)((a.a)localObject2).fsy;
        label646: if (localObject2 == null)
        {
          AppMethodBeat.o(10920);
          localObject2 = localObject1;
        }
        else
        {
          localObject3 = new ad().eZ(u.pr(this.id));
          ((ad)localObject3).cYw = u.pq(this.id);
          ((ad)localObject3).cYs = 3L;
          localObject3 = ((ad)localObject3).eY(this.id);
          ((ad)localObject3).cYt = System.currentTimeMillis();
          ((ad)localObject3).cYu = 1L;
          ((ad)localObject3).fa(com.tencent.mm.sdk.platformtools.at.gB(ah.getContext())).ajK();
          localObject3 = ((arc)localObject2).wuP;
          v.kT(5);
          u.i("MicroMsg.AppBrand.PrepareStepCheckWidgetPkg", "get widget downlonad info succ", new Object[0]);
          if (!bo.isNullOrNil(((arc)localObject2).url))
            break;
          u.i("MicroMsg.AppBrand.PrepareStepCheckWidgetPkg", "get widget download url fail, reason url empty", new Object[0]);
          AppMethodBeat.o(10920);
          localObject2 = localObject1;
        }
      }
    }
    cwv localcwv = new cwv();
    Object localObject2 = ((arc)localObject2).url;
    this.hok = ((String)localObject2);
    localcwv.xsy = ((String)localObject2);
    int j = localat.field_version;
    this.gVu = j;
    localcwv.vMG = j;
    localcwv.xsw = localat.field_versionState;
    localcwv.xsx = localat.field_versionMd5;
    ((com.tencent.mm.plugin.appbrand.a.d)g.K(com.tencent.mm.plugin.appbrand.a.d.class)).xF().a(this.appId, localcwv, this.cBc);
    label1302: label1305: label1311: for (localObject2 = localObject3; ; localObject2 = null)
    {
      localObject2 = Aj((String)localObject2);
      if (localObject2 != null)
      {
        if (this.hog == 1)
          h.pYm.e(14452, new Object[] { this.hlm + "-" + this.appId, Integer.valueOf(7), Long.valueOf(System.currentTimeMillis()) });
        AppMethodBeat.o(10920);
        break;
      }
      if (this.hog == 1)
        h.pYm.e(14452, new Object[] { this.hlm + "-" + this.appId, Integer.valueOf(8), Long.valueOf(System.currentTimeMillis()) });
      label1065: if ((this.cBc == 10002) || (this.cBc == 10102))
      {
        localObject2 = ((com.tencent.mm.plugin.appbrand.a.d)g.K(com.tencent.mm.plugin.appbrand.a.d.class)).xF().xF(this.appId);
        if ((localObject2 == null) || (localObject2.length <= 1));
      }
      for (j = i; ; j = i)
      {
        localObject3 = this.appId;
        int k = this.cBc;
        i = j + 1;
        localObject3 = as.v((String)localObject3, k, localObject2[j]);
        if ((localObject3 != null) && (((Pair)localObject3).first == as.a.gUI) && (((Pair)localObject3).second != null))
        {
          localObject2 = (WxaPkgWrappingInfo)((Pair)localObject3).second;
          AppMethodBeat.o(10920);
          break;
          label1196: if (as.a.gUI.equals(localPair.first))
            break label1065;
          ab.e("MicroMsg.AppBrand.PrepareStepCheckWidgetPkg", "WxaPkgIntegrityChecker.checkPkg  appid %s, pkgType %d,pkgVersion %d return %d", new Object[] { this.appId, Integer.valueOf(this.cBc), Integer.valueOf(this.gVu), Integer.valueOf(((as.a)localPair.first).awj()) });
          break label1065;
        }
        if (i >= localObject2.length)
        {
          a((as.a)localPair.first);
          AppMethodBeat.o(10920);
          localObject2 = localObject1;
          break;
        }
      }
      break label646;
      localObject2 = null;
      break label376;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.dynamic.launching.b
 * JD-Core Version:    0.6.2
 */