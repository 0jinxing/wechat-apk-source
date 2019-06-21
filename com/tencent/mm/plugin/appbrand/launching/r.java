package com.tencent.mm.plugin.appbrand.launching;

import android.util.Pair;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.a.a;
import com.tencent.mm.plugin.appbrand.app.f;
import com.tencent.mm.plugin.appbrand.appcache.PartialFile;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.mm.plugin.appbrand.appcache.as;
import com.tencent.mm.plugin.appbrand.config.WxaAttributes.c;
import com.tencent.mm.plugin.appbrand.r.j;
import com.tencent.mm.protocal.protobuf.arc;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;

public class r
  implements m
{
  final String appId;
  final int har;
  final List<WxaAttributes.c> hil;
  final int ihg;
  private final AtomicInteger ihi;
  private volatile boolean ihj;
  LinkedHashMap<String, j<WxaPkgWrappingInfo>> ihp;
  private com.tencent.mm.plugin.appbrand.launching.c.a ihq;

  r(String paramString, int paramInt1, int paramInt2, List<WxaAttributes.c> paramList)
  {
    AppMethodBeat.i(131854);
    this.ihp = new LinkedHashMap();
    this.ihi = new AtomicInteger(0);
    this.ihj = false;
    ab.i("MicroMsg.AppBrand.LaunchCheckPkgSplitCodeLibHandler", "appId:%s,versionType:%s,desirePkgVersion:%s", new Object[] { paramString, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    this.appId = paramString;
    this.har = paramInt1;
    this.hil = paramList;
    this.ihg = paramInt2;
    this.ihq = new com.tencent.mm.plugin.appbrand.launching.c.a(paramString, paramInt2, paramInt1, paramList);
    AppMethodBeat.o(131854);
  }

  private WxaPkgWrappingInfo azZ()
  {
    AppMethodBeat.i(131855);
    Object localObject1 = as.v(this.appId, this.har, this.ihg);
    if (((Pair)localObject1).second != null)
      ab.i("MicroMsg.AppBrand.LaunchCheckPkgSplitCodeLibHandler", "using existing pkg with appId(%s) versionType(%d) pkgVersion(%d)", new Object[] { this.appId, Integer.valueOf(this.har), Integer.valueOf(this.ihg) });
    while (true)
    {
      try
      {
        ((com.tencent.mm.plugin.appbrand.appcache.b.d.a)f.E(com.tencent.mm.plugin.appbrand.appcache.b.d.a.class)).ay(this.appId, this.ihg);
        WxaPkgWrappingInfo localWxaPkgWrappingInfo = (WxaPkgWrappingInfo)((Pair)localObject1).second;
        AppMethodBeat.o(131855);
        return localWxaPkgWrappingInfo;
      }
      catch (Throwable localThrowable)
      {
        ab.printErrStackTrace("MicroMsg.AppBrand.LaunchCheckPkgSplitCodeLibHandler", localThrowable, "checkReportOnLocalPkgFound, appId[%s], version[%d]", new Object[] { this.appId, Integer.valueOf(this.ihg) });
        continue;
      }
      int i = this.hil.size();
      ab.i("MicroMsg.AppBrand.LaunchCheckPkgSplitCodeLibHandler", "codeLibList size:%d", new Object[] { Integer.valueOf(i) });
      Object localObject2 = new CountDownLatch(i + 1);
      int j = 0;
      if (j < i)
      {
        localObject3 = (WxaAttributes.c)this.hil.get(j);
        if (localObject3 == null)
          ab.e("MicroMsg.AppBrand.LaunchCheckPkgSplitCodeLibHandler", "codelibInfo:%d null!", new Object[] { Integer.valueOf(j) });
        while (true)
        {
          j++;
          break;
          localObject1 = ((WxaAttributes.c)localObject3).bIy;
          int k = ((WxaAttributes.c)localObject3).version;
          if ((bo.isNullOrNil((String)localObject1)) || (bo.isNullOrNil(((WxaAttributes.c)localObject3).cvZ)))
          {
            ab.e("MicroMsg.AppBrand.LaunchCheckPkgSplitCodeLibHandler", "codeLib null or codeLib md5 null!");
            com.tencent.mm.plugin.appbrand.launching.c.a.pc(6);
            ((CountDownLatch)localObject2).countDown();
          }
          else
          {
            this.ihp.put(((WxaAttributes.c)localObject3).cvZ, new j());
            localObject3 = n.d.b((String)localObject1, "__CODELIB__", 0, k, 14);
            ((n)localObject3).a(new r.1(this, (CountDownLatch)localObject2, (String)localObject1, k));
            ((n)localObject3).a(new r.2(this, (CountDownLatch)localObject2, (String)localObject1));
            ((n)localObject3).prepareAsync();
          }
        }
      }
      localObject1 = new j();
      Object localObject3 = n.d.b(this.appId, "__WITHOUT_CODELIB__", this.har, this.ihg, 12);
      ((n)localObject3).a(new n.c()
      {
        public final void a(a.a<arc> paramAnonymousa)
        {
          AppMethodBeat.i(131849);
          ab.i("MicroMsg.AppBrand.LaunchCheckPkgSplitCodeLibHandler", "mainModule without lib url result errCode:%s,errMsg:%s", new Object[] { Integer.valueOf(paramAnonymousa.errCode), paramAnonymousa.aIm });
          AppMethodBeat.o(131849);
        }

        public final void b(WxaPkgWrappingInfo paramAnonymousWxaPkgWrappingInfo)
        {
          AppMethodBeat.i(131850);
          if (paramAnonymousWxaPkgWrappingInfo != null)
            this.ihk.value = paramAnonymousWxaPkgWrappingInfo;
          this.val$latch.countDown();
          if (paramAnonymousWxaPkgWrappingInfo != null);
          for (paramAnonymousWxaPkgWrappingInfo = paramAnonymousWxaPkgWrappingInfo.toString(); ; paramAnonymousWxaPkgWrappingInfo = "null")
          {
            ab.i("MicroMsg.AppBrand.LaunchCheckPkgSplitCodeLibHandler", "mainModule without codeLib pkgInfo :%s", new Object[] { paramAnonymousWxaPkgWrappingInfo });
            AppMethodBeat.o(131850);
            return;
          }
        }

        public final void c(WxaPkgWrappingInfo paramAnonymousWxaPkgWrappingInfo)
        {
          AppMethodBeat.i(131851);
          if (paramAnonymousWxaPkgWrappingInfo != null)
          {
            r.oX(2);
            AppMethodBeat.o(131851);
          }
          while (true)
          {
            return;
            r.oX(3);
            AppMethodBeat.o(131851);
          }
        }
      });
      ((n)localObject3).a(new r.4(this, (CountDownLatch)localObject2));
      ((n)localObject3).prepareAsync();
      ((CountDownLatch)localObject2).await();
      ab.i("MicroMsg.AppBrand.LaunchCheckPkgSplitCodeLibHandler", "both downloaded");
      if (this.ihj)
        aHj();
      if ((((j)localObject1).value == null) || (this.ihp.size() <= 0))
      {
        ab.i("MicroMsg.AppBrand.LaunchCheckPkgSplitCodeLibHandler", "mainModule value or codeLibList result null!!");
        localObject2 = null;
        AppMethodBeat.o(131855);
      }
      else
      {
        this.ihq.IF();
        localObject2 = (WxaPkgWrappingInfo)((j)localObject1).value;
        ((WxaPkgWrappingInfo)localObject2).gSR = new PartialFile[i];
        for (j = 0; j < this.hil.size(); j++)
        {
          localObject1 = (WxaAttributes.c)this.hil.get(j);
          ((WxaPkgWrappingInfo)localObject2).gSR[j] = new PartialFile();
          if (!bo.isNullOrNil(((WxaAttributes.c)this.hil.get(j)).cvZ))
          {
            localObject3 = (WxaPkgWrappingInfo)((j)this.ihp.get(((WxaAttributes.c)this.hil.get(j)).cvZ)).value;
            if (localObject3 != null)
            {
              localObject2.gSR[j].cvZ = ((WxaAttributes.c)this.hil.get(j)).cvZ;
              localObject2.gSR[j].bIy = ((WxaAttributes.c)localObject1).bIy;
              localObject2.gSR[j].version = ((WxaAttributes.c)localObject1).version;
              localObject2.gSR[j].filePath = ((WxaPkgWrappingInfo)localObject3).gSP;
            }
          }
        }
        AppMethodBeat.o(131855);
      }
    }
  }

  private void oW(int paramInt)
  {
    AppMethodBeat.i(131856);
    this.ihq.pd(paramInt);
    AppMethodBeat.o(131856);
  }

  public void aHe()
  {
  }

  public void aHj()
  {
  }

  public void onDownloadProgress(int paramInt)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.launching.r
 * JD-Core Version:    0.6.2
 */