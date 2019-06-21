package com.tencent.mm.plugin.appbrand.launching;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.app.f;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgLoadProgress;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.mm.plugin.appbrand.appcache.a.a.a;
import com.tencent.mm.plugin.appbrand.appcache.as.a;
import com.tencent.mm.plugin.appbrand.appcache.at;
import com.tencent.mm.plugin.appbrand.appcache.ax;
import com.tencent.mm.plugin.appbrand.appcache.az;
import com.tencent.mm.plugin.appbrand.appcache.j.a;
import com.tencent.mm.plugin.appbrand.config.WxaAttributes.e;
import com.tencent.mm.plugin.appbrand.r.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;

final class ah$b
  implements Callable<WxaPkgWrappingInfo>
{
  private final int iix;

  private ah$b(ah paramah, int paramInt)
  {
    this.iix = paramInt;
  }

  public final WxaPkgWrappingInfo azZ()
  {
    AppMethodBeat.i(131965);
    final CountDownLatch localCountDownLatch = new CountDownLatch(1);
    Object localObject = new j();
    t local1 = new t(this.iiv.har)
    {
      final String aHr()
      {
        AppMethodBeat.i(131961);
        String str = String.format(Locale.US, "NonIncremental %d", new Object[] { Integer.valueOf(ah.b.a(ah.b.this)) });
        AppMethodBeat.o(131961);
        return str;
      }

      protected final void b(WxaPkgLoadProgress paramAnonymousWxaPkgLoadProgress)
      {
        AppMethodBeat.i(131963);
        ab.d("MicroMsg.AppBrand.PrepareStepCheckAppPkg", "hy: onPkgUpdateProgress %s", new Object[] { paramAnonymousWxaPkgLoadProgress.toString() });
        if (paramAnonymousWxaPkgLoadProgress.progress >= 100)
          AppMethodBeat.o(131963);
        while (true)
        {
          return;
          ah.b.this.iiv.onDownloadProgress(paramAnonymousWxaPkgLoadProgress.progress);
          AppMethodBeat.o(131963);
        }
      }

      final void d(WxaPkgWrappingInfo paramAnonymousWxaPkgWrappingInfo)
      {
        AppMethodBeat.i(131962);
        this.hom.value = paramAnonymousWxaPkgWrappingInfo;
        localCountDownLatch.countDown();
        AppMethodBeat.o(131962);
      }
    };
    ab.i("MicroMsg.AppBrand.PrepareStepCheckAppPkg", "tryDownload, not incremental before start appId(%s), type(%d), pkgVersion(%d)", new Object[] { this.iiv.appId, Integer.valueOf(this.iiv.har), Integer.valueOf(this.iix) });
    final at localat;
    if (j.a.kR(this.iiv.har))
    {
      localat = f.auV().a(this.iiv.appId, this.iiv.har, new String[] { "versionMd5", "downloadURL" });
      if ((localat == null) || (bo.isNullOrNil(localat.field_downloadURL)))
      {
        ab.e("MicroMsg.AppBrand.PrepareStepCheckAppPkg", "tryDownload, get EMPTY url appId(%s), type(%d), record(%s)", new Object[] { this.iiv.appId, Integer.valueOf(this.iiv.har), localat });
        this.iiv.a(as.a.gUJ);
        localObject = null;
        AppMethodBeat.o(131965);
      }
    }
    while (true)
    {
      return localObject;
      this.iiv.hok = localat.field_downloadURL;
      if (!az.a(this.iiv.appId, this.iiv.har, this.iiv.hok, local1, new a.a()
      {
        public final String avJ()
        {
          AppMethodBeat.i(131964);
          String str = "_" + localat.field_versionMd5;
          AppMethodBeat.o(131964);
          return str;
        }
      }))
      {
        ab.e("MicroMsg.AppBrand.PrepareStepCheckAppPkg", "tryDownload, not incremental FATAL ERROR appId(%s), type(%d), pkgVersion(%d)", new Object[] { this.iiv.appId, Integer.valueOf(this.iiv.har), Integer.valueOf(this.iix) });
        this.iiv.a(as.a.gUN);
        localObject = null;
        AppMethodBeat.o(131965);
        continue;
        if (!az.a(this.iiv.appId, this.iiv.har, this.iix, this.iiv.hhO.him, this.iiv.hok, local1))
        {
          ab.e("MicroMsg.AppBrand.PrepareStepCheckAppPkg", "tryDownload, not incremental FATAL ERROR appId(%s), type(%d), pkgVersion(%d)", new Object[] { this.iiv.appId, Integer.valueOf(this.iiv.har), Integer.valueOf(this.iix) });
          this.iiv.a(as.a.gUN);
          localObject = null;
          AppMethodBeat.o(131965);
          continue;
        }
      }
      try
      {
        localCountDownLatch.await();
        localObject = (WxaPkgWrappingInfo)((j)localObject).value;
        AppMethodBeat.o(131965);
      }
      catch (Exception localException)
      {
        while (true)
          ab.printErrStackTrace("MicroMsg.AppBrand.PrepareStepCheckAppPkg", localException, "downloadNonIncremental semaphore exp ", new Object[0]);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.launching.ah.b
 * JD-Core Version:    0.6.2
 */