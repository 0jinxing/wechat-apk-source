package com.tencent.mm.plugin.appbrand.launching;

import android.util.Pair;
import com.tencent.mm.ai.a.a;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.mm.plugin.appbrand.appcache.ae;
import com.tencent.mm.plugin.appbrand.appcache.as;
import com.tencent.mm.plugin.appbrand.appcache.as.a;
import com.tencent.mm.plugin.appbrand.appcache.at;
import com.tencent.mm.plugin.appbrand.appcache.ax;
import com.tencent.mm.plugin.appbrand.appcache.b.b.f.a;
import com.tencent.mm.plugin.appbrand.appcache.d;
import com.tencent.mm.plugin.appbrand.appcache.j.a;
import com.tencent.mm.plugin.appbrand.appcache.x.b;
import com.tencent.mm.plugin.appbrand.config.WxaAttributes.e;
import com.tencent.mm.plugin.appbrand.s.e;
import com.tencent.mm.pointers.PLong;
import com.tencent.mm.protocal.protobuf.arc;
import com.tencent.mm.protocal.protobuf.cwv;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Locale;
import java.util.concurrent.Callable;
import junit.framework.Assert;

abstract class ah extends af<WxaPkgWrappingInfo>
  implements m
{
  final String appId;
  final int cDB;
  private final int gVu;
  final int har;
  final WxaAttributes.e hhO;
  String hok;
  private WxaPkgWrappingInfo iir;

  ah(String paramString, int paramInt1, int paramInt2, int paramInt3, WxaAttributes.e parame)
  {
    this.appId = paramString;
    this.har = paramInt1;
    this.gVu = paramInt2;
    this.cDB = paramInt3;
    this.hok = null;
    this.hhO = parame;
  }

  private WxaPkgWrappingInfo azZ()
  {
    Object localObject1 = as.v(this.appId, this.har, this.gVu);
    if (((Pair)localObject1).second != null)
      ab.i("MicroMsg.AppBrand.PrepareStepCheckAppPkg", "call, using existing pkg with appId(%s) versionType(%d) pkgVersion(%d)", new Object[] { this.appId, Integer.valueOf(this.har), Integer.valueOf(this.gVu) });
    Object localObject4;
    int i;
    while (true)
    {
      try
      {
        ((com.tencent.mm.plugin.appbrand.appcache.b.d.a)com.tencent.mm.plugin.appbrand.app.f.E(com.tencent.mm.plugin.appbrand.appcache.b.d.a.class)).ay(this.appId, this.gVu);
        localObject1 = (WxaPkgWrappingInfo)((Pair)localObject1).second;
        return localObject1;
      }
      catch (Throwable localThrowable1)
      {
        ab.printErrStackTrace("MicroMsg.AppBrand.PrepareStepCheckAppPkg", localThrowable1, "checkReportOnLocalPkgFound, appId[%s], version[%d]", new Object[] { this.appId, Integer.valueOf(this.gVu) });
        continue;
      }
      try
      {
        localObject4 = (com.tencent.mm.plugin.appbrand.appcache.b.d.a)com.tencent.mm.plugin.appbrand.app.f.E(com.tencent.mm.plugin.appbrand.appcache.b.d.a.class);
        Object localObject2 = this.appId;
        i = this.gVu;
        localObject5 = new com/tencent/mm/plugin/appbrand/appcache/b/d/b;
        ((com.tencent.mm.plugin.appbrand.appcache.b.d.b)localObject5).<init>();
        ((com.tencent.mm.plugin.appbrand.appcache.b.d.b)localObject5).field_appId = ((String)localObject2);
        ((com.tencent.mm.plugin.appbrand.appcache.b.d.b)localObject5).field_version = i;
        boolean bool = ((com.tencent.mm.plugin.appbrand.appcache.b.d.a)localObject4).b((com.tencent.mm.sdk.e.c)localObject5, new String[0]);
        ((com.tencent.mm.plugin.appbrand.appcache.b.d.b)localObject5).field_hitCount += 1;
        if (bool)
          ((com.tencent.mm.plugin.appbrand.appcache.b.d.a)localObject4).c((com.tencent.mm.sdk.e.c)localObject5, new String[0]);
        while (true)
        {
          if (!j.a.np(this.har))
            break label1327;
          localObject5 = ((com.tencent.mm.plugin.appbrand.appcache.af)com.tencent.mm.plugin.appbrand.app.f.E(com.tencent.mm.plugin.appbrand.appcache.af.class)).s(this.appId, 1, this.gVu);
          if (localObject5 == null)
            break label1327;
          localObject2 = new PLong();
          bool = com.tencent.mm.plugin.appbrand.appcache.b.b.f.a((ae)localObject5, f.a.gVZ, (PLong)localObject2);
          ab.i("MicroMsg.AppBrand.PrepareStepCheckAppPkg", "decrypt ret %b, with appId(%s) version(%d)", new Object[] { Boolean.valueOf(bool), this.appId, Integer.valueOf(this.gVu) });
          if (!bool)
            break label1327;
          localObject1 = as.v(this.appId, this.har, this.gVu);
          if (((Pair)localObject1).second == null)
            break label404;
          localObject5 = com.tencent.mm.plugin.appbrand.appcache.b.c.a.gWl;
          com.tencent.mm.plugin.appbrand.appcache.b.c.a.z(((PLong)localObject2).value, 180L);
          localObject1 = (WxaPkgWrappingInfo)((Pair)localObject1).second;
          break;
          ((com.tencent.mm.plugin.appbrand.appcache.b.d.a)localObject4).b((com.tencent.mm.sdk.e.c)localObject5);
        }
      }
      catch (Throwable localThrowable2)
      {
        while (true)
          ab.printErrStackTrace("MicroMsg.AppBrand.PrepareStepCheckAppPkg", localThrowable2, "increaseHitCount, appId[%s], version[%d]", new Object[] { this.appId, Integer.valueOf(this.gVu) });
        label404: Object localObject5 = com.tencent.mm.plugin.appbrand.appcache.b.c.a.gWl;
        com.tencent.mm.plugin.appbrand.appcache.b.c.a.z(localThrowable2.value, 181L);
      }
    }
    label901: label908: label1311: label1327: 
    while (true)
    {
      Object localObject3 = localObject1;
      if (as.a.gUJ.equals(((Pair)localObject1).first))
      {
        ab.e("MicroMsg.AppBrand.PrepareStepCheckAppPkg", "call, manifest NULL, appId(%s) type(%d) version(%d)", new Object[] { this.appId, Integer.valueOf(this.har), Integer.valueOf(this.gVu) });
        com.tencent.mm.plugin.appbrand.app.f.auV().a(this.appId, this.hhO);
        if (com.tencent.mm.plugin.appbrand.app.f.auV().a(this.appId, this.gVu, this.har, new String[0]) != null)
          break label742;
        ab.e("MicroMsg.AppBrand.PrepareStepCheckAppPkg", "call, insert manifest fail again!!! appId(%s) type(%d) version(%d)", new Object[] { this.appId, Integer.valueOf(this.har), Integer.valueOf(this.gVu) });
        localObject3 = localObject1;
      }
      while (true)
      {
        while (true)
        {
          if (!as.a.gUM.equals(((Pair)localObject3).first))
            break label1311;
          if (this.har != 0)
            break label1289;
          this.iir = h.bm(this.appId, 1);
          try
          {
            localObject1 = com.tencent.mm.plugin.appbrand.app.f.auV().a(this.appId, 0, new String[] { "version", "versionMd5", "versionState" });
            if (localObject1 != null)
              break label753;
            localObject1 = new com/tencent/mm/plugin/appbrand/launching/m$a$a;
            ((m.a.a)localObject1).<init>();
            throw ((m.a.a)localObject1).n(e.getMMString(2131296775, new Object[] { com.tencent.mm.plugin.appbrand.appcache.b.no(this.har) }), new Object[0]).o("get NULL record with md5", new Object[0]).aHl();
          }
          catch (m.a locala)
          {
            ab.e("MicroMsg.AppBrand.PrepareStepCheckAppPkg", "release_pkg APP_BROKEN obtain appId %s, message %s", new Object[] { this.appId, locala.getMessage() });
            if (this.gVu <= 0)
            {
              localObject3 = h.bm(this.appId, 1);
              localObject1 = localObject3;
              if (localObject3 != null)
                break;
            }
            if (!bo.isNullOrNil(locala.ihb))
              ag.Ck(locala.ihb);
            localObject1 = null;
          }
        }
        break;
        label742: localObject3 = Pair.create(as.a.gUM, null);
        continue;
        label753: long l1 = bo.anU();
        int j = ((at)localObject1).field_version;
        if (this.iir == null)
        {
          i = 0;
          localObject3 = new com/tencent/mm/plugin/appbrand/appcache/d;
          ((d)localObject3).<init>(this.appId, ((at)localObject1).field_version, ((at)localObject1).field_versionMd5, 0, i);
          localObject3 = com.tencent.mm.ai.x.a((com.tencent.mm.ai.a)localObject3);
          if ((localObject3 != null) && (((a.a)localObject3).errType == 0) && (((a.a)localObject3).errCode == 0))
            break label1000;
          if ((localObject3 == null) || (((a.a)localObject3).errCode != -1001))
            break label901;
          localObject1 = ag.getMMString(2131296771, new Object[0]);
          localObject6 = new com/tencent/mm/plugin/appbrand/launching/m$a$a;
          ((m.a.a)localObject6).<init>();
          if (localObject3 != null)
            break label963;
        }
        label954: label963: for (localObject3 = null; ; localObject3 = String.format(Locale.US, "(%d, %d)", new Object[] { Integer.valueOf(((a.a)localObject3).errType), Integer.valueOf(((a.a)localObject3).errCode) }))
        {
          throw ((m.a.a)localObject6).o("fail get download url, resp %s", new Object[] { localObject3 }).n((String)localObject1, new Object[0]).aHl();
          i = this.iir.gVu;
          break;
          if (localObject3 == null)
          {
            i = -1;
            if (localObject3 != null)
              break label954;
          }
          for (j = -1; ; j = ((a.a)localObject3).errCode)
          {
            localObject1 = ag.getMMString(2131296769, new Object[] { Integer.valueOf(i), Integer.valueOf(j) });
            break;
            i = ((a.a)localObject3).errType;
            break label908;
          }
        }
        label1000: long l2 = bo.anU();
        y.a(y.b.ihV, this.appId, j, this.har, this.cDB, l2 - l1);
        if (bo.isNullOrNil(((arc)((a.a)localObject3).fsy).url))
        {
          localObject1 = new com/tencent/mm/plugin/appbrand/launching/m$a$a;
          ((m.a.a)localObject1).<init>();
          throw ((m.a.a)localObject1).o("CgiGetDownloadURL return EMPTY url, ret = %d", new Object[] { Integer.valueOf(((arc)((a.a)localObject3).fsy).ret) }).aHl();
        }
        Object localObject6 = new com/tencent/mm/protocal/protobuf/cwv;
        ((cwv)localObject6).<init>();
        localObject4 = ((arc)((a.a)localObject3).fsy).url;
        this.hok = ((String)localObject4);
        ((cwv)localObject6).xsy = ((String)localObject4);
        ((cwv)localObject6).vMG = ((at)localObject1).field_version;
        ((cwv)localObject6).xsw = ((at)localObject1).field_versionState;
        ((cwv)localObject6).xsx = ((at)localObject1).field_versionMd5;
        com.tencent.mm.plugin.appbrand.app.f.auV().a(this.appId, (cwv)localObject6, 0);
        if (this.hhO.him > 0)
        {
          l2 = bo.anU();
          localObject1 = com.tencent.mm.plugin.appbrand.appcache.x.gg(this.hhO.him);
          l1 = bo.anU();
          ab.d("MicroMsg.AppBrand.PrepareStepCheckAppPkg", "trimOff %d, cost %d, result %s", new Object[] { Integer.valueOf(this.hhO.him), Long.valueOf(l1 - l2), ((x.b)localObject1).name() });
        }
        localObject1 = new com/tencent/mm/plugin/appbrand/launching/ah$a;
        ((ah.a)localObject1).<init>(this, i, j, (arc)((a.a)localObject3).fsy, (byte)0);
        localObject3 = c((Callable)localObject1);
        localObject1 = localObject3;
        if (localObject3 != null)
          break;
        localObject1 = new com/tencent/mm/plugin/appbrand/launching/m$a$a;
        ((m.a.a)localObject1).<init>();
        throw ((m.a.a)localObject1).o("Download Fail", new Object[0]).aHl();
        localObject1 = c(new ah.b(this, 0, (byte)0));
        if (localObject1 != null)
          break;
      }
      a((as.a)((Pair)localObject3).first);
      localObject1 = null;
      break;
    }
  }

  private WxaPkgWrappingInfo c(Callable<WxaPkgWrappingInfo> paramCallable)
  {
    Object localObject = null;
    if (paramCallable == this)
    {
      Assert.assertTrue("Why the hell you pass 'this' to this method", false);
      paramCallable = localObject;
    }
    while (true)
    {
      return paramCallable;
      aHe();
      try
      {
        paramCallable = (WxaPkgWrappingInfo)paramCallable.call();
        aHj();
      }
      catch (Exception paramCallable)
      {
        while (true)
          paramCallable = null;
      }
    }
  }

  final void a(as.a parama)
  {
    int i = 2131296707;
    if (as.a.gUJ.equals(parama))
      if (this.har == 1)
      {
        parama = e.getMMString(2131296707, new Object[0]);
        if (this.har == 1)
        {
          com.tencent.mm.plugin.appbrand.task.h.bt(this.appId, this.har);
          com.tencent.mm.plugin.appbrand.report.c.K(this.appId, 10, this.har + 1);
        }
        ag.Ck(parama);
      }
    while (true)
    {
      return;
      parama = e.getMMString(2131296775, new Object[] { com.tencent.mm.plugin.appbrand.appcache.b.no(this.har) });
      break;
      if ((as.a.gUL.equals(parama)) || (as.a.gUK.equals(parama)))
      {
        if (this.har != 0);
        while (true)
        {
          ag.oZ(i);
          if (this.har == 1)
            com.tencent.mm.plugin.appbrand.report.c.K(this.appId, 10, this.har + 1);
          com.tencent.mm.plugin.appbrand.task.h.bt(this.appId, this.har);
          break;
          i = 2131296710;
        }
      }
      ag.Ck(e.getMMString(2131296772, new Object[] { Integer.valueOf(1), Integer.valueOf(parama.awj()) }));
    }
  }

  public void aHe()
  {
  }

  public void aHj()
  {
  }

  final String getTag()
  {
    return "MicroMsg.AppBrand.PrepareStepCheckAppPkg";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.launching.ah
 * JD-Core Version:    0.6.2
 */