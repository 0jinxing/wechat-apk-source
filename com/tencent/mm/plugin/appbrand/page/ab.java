package com.tencent.mm.plugin.appbrand.page;

import android.net.http.SslCertificate;
import android.net.http.SslCertificate.DName;
import android.os.Build.VERSION;
import android.webkit.URLUtil;
import android.webkit.WebResourceResponse;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.appcache.aw;
import com.tencent.mm.plugin.appbrand.appstorage.p;
import com.tencent.mm.plugin.appbrand.i;
import com.tencent.mm.plugin.appbrand.l.n;
import java.io.ByteArrayInputStream;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.security.cert.X509Certificate;

public final class ab
{
  u hTn;
  private n iur;

  public ab(u paramu)
  {
    this.hTn = paramu;
  }

  public final WebResourceResponse Dj(String paramString)
  {
    Object localObject1 = null;
    Object localObject2 = null;
    AppMethodBeat.i(87313);
    if (!this.hTn.isRunning())
    {
      AppMethodBeat.o(87313);
      localObject1 = localObject2;
      return localObject1;
    }
    if (paramString.startsWith(this.hTn.aJA()))
    {
      localObject2 = aw.c(this.hTn.getRuntime(), paramString.replaceFirst(this.hTn.aJA(), ""));
      localObject1 = localObject2;
      if (localObject2 == null)
      {
        com.tencent.mm.sdk.platformtools.ab.e("AppBrandWebViewClient", "getAppResourceResponse %s not found", new Object[] { paramString });
        localObject2 = new WebResourceResponse("image/*", "utf-8", new ByteArrayInputStream(new byte[0]));
        localObject1 = localObject2;
        if (Build.VERSION.SDK_INT >= 21)
        {
          ((WebResourceResponse)localObject2).setStatusCodeAndReasonPhrase(404, "NotFound");
          localObject1 = localObject2;
        }
      }
    }
    while (true)
    {
      com.tencent.mm.sdk.platformtools.ab.i("AppBrandWebViewClient", "tryInterceptWebViewRequest, reqURL = %s", new Object[] { paramString });
      AppMethodBeat.o(87313);
      break;
      if ((URLUtil.isAboutUrl(paramString)) || (URLUtil.isHttpUrl(paramString)) || (URLUtil.isHttpsUrl(paramString)))
      {
        AppMethodBeat.o(87313);
        localObject1 = localObject2;
        break;
      }
      localObject2 = new com.tencent.mm.plugin.appbrand.r.j();
      this.hTn.getRuntime().asE().b(paramString, (com.tencent.mm.plugin.appbrand.r.j)localObject2);
      if (((com.tencent.mm.plugin.appbrand.r.j)localObject2).value != null)
        localObject1 = new WebResourceResponse("", "", new com.tencent.luggage.g.a((ByteBuffer)((com.tencent.mm.plugin.appbrand.r.j)localObject2).value));
    }
  }

  public final boolean a(SslCertificate paramSslCertificate)
  {
    boolean bool = false;
    AppMethodBeat.i(87312);
    if (this.hTn.getRuntime() == null)
      AppMethodBeat.o(87312);
    while (true)
    {
      return bool;
      if (this.iur == null)
        this.iur = com.tencent.mm.plugin.appbrand.l.j.b((com.tencent.mm.plugin.appbrand.l.a)this.hTn.getRuntime().aa(com.tencent.mm.plugin.appbrand.l.a.class));
      com.tencent.mm.sdk.platformtools.ab.d("AppBrandWebViewClient", "subjectDN: ".concat(String.valueOf(paramSslCertificate.getIssuedTo().getDName())));
      try
      {
        Field localField = paramSslCertificate.getClass().getDeclaredField("mX509Certificate");
        localField.setAccessible(true);
        paramSslCertificate = (X509Certificate)localField.get(paramSslCertificate);
        try
        {
          this.iur.checkServerTrusted(new X509Certificate[] { paramSslCertificate }, "generic");
          bool = true;
          AppMethodBeat.o(87312);
        }
        catch (Exception paramSslCertificate)
        {
          while (true)
          {
            com.tencent.mm.sdk.platformtools.ab.e("AppBrandWebViewClient", "Certificate check failed: ".concat(String.valueOf(paramSslCertificate)));
            bool = false;
          }
        }
      }
      catch (Exception paramSslCertificate)
      {
        while (true)
        {
          com.tencent.mm.sdk.platformtools.ab.e("AppBrandWebViewClient", "Certificate check failed: ", new Object[] { paramSslCertificate });
          bool = false;
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.page.ab
 * JD-Core Version:    0.6.2
 */