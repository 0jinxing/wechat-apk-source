package com.tencent.mm.plugin.appbrand;

import android.webkit.JavascriptInterface;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.mm.plugin.appbrand.appcache.aw;
import com.tencent.mm.plugin.appbrand.config.h;
import com.tencent.mm.plugin.appbrand.h.g;
import com.tencent.mm.plugin.appbrand.s.n;
import com.tencent.mm.plugin.appbrand.s.n.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Locale;
import org.json.JSONObject;

public abstract class e
{
  public final q gMN;
  private final com.tencent.mm.plugin.appbrand.h.q gMO;
  private final g gMP;

  protected e(q paramq, com.tencent.mm.plugin.appbrand.h.q paramq1)
  {
    this.gMN = paramq;
    this.gMO = paramq1;
    this.gMP = paramq1.aGV();
  }

  protected void a(g paramg)
  {
  }

  protected void a(g paramg, String paramString1, String paramString2)
  {
    n.a(paramg, this.gMN.auf() + paramString1, paramString1, "v" + asL(), paramString2, "", new e.2(this, paramString1));
  }

  protected void a(g paramg, String paramString1, String paramString2, n.a parama)
  {
    n.a(paramg, this.gMN.aug() + paramString1, paramString1.replace('/', '_') + "_" + this.gMN.getAppId(), this.gMN.getRuntime().ye().hhd.cvZ, paramString2, this.gMN.xc(paramString1), parama);
  }

  @JavascriptInterface
  public int alloc()
  {
    g localg = asI();
    int i;
    if (localg == null)
    {
      ab.e("MicroMsg.AppBrandJSContextInterface[multicontext]", "alloc with appID(%s), allocJsContext failed", new Object[] { this.gMN.getAppId() });
      i = -2;
    }
    while (true)
    {
      return i;
      ab.i("MicroMsg.AppBrandJSContextInterface[multicontext]", "hy: created context id is %d", new Object[] { Integer.valueOf(localg.aGT()) });
      this.gMP.a(localg, "WeixinJSContext");
      if (this.gMN.getRuntime() == null);
      String str;
      for (Object localObject = this.gMN.aue(); ; localObject = this.gMN.xW())
      {
        localg.evaluateJavascript(String.format(Locale.US, "var __wxConfig = %s;", new Object[] { ((JSONObject)localObject).toString() }), null);
        a(localg);
        str = asJ();
        localObject = asK();
        if (!bo.isNullOrNil((String)localObject))
          break label178;
        ab.e("MicroMsg.AppBrandJSContextInterface[multicontext]", "alloc with appID(%s), sdkScript 404", new Object[] { this.gMN.getAppId() });
        asM();
        i = 0;
        break;
      }
      label178: a(localg, str, (String)localObject);
      i = localg.aGT();
    }
  }

  protected void asH()
  {
    this.gMO.aGU().a(this.gMP, "WeixinJSContext");
  }

  protected g asI()
  {
    return this.gMO.aGV();
  }

  protected abstract String asJ();

  protected abstract String asK();

  protected abstract int asL();

  protected void asM()
  {
  }

  protected void asN()
  {
  }

  @JavascriptInterface
  public int create(String paramString)
  {
    int i = -1;
    ab.i("MicroMsg.AppBrandJSContextInterface[multicontext]", "create with appID(%s) appScriptPath(%s)", new Object[] { this.gMN.getAppId(), paramString });
    if (bo.isNullOrNil(paramString))
      ab.e("MicroMsg.AppBrandJSContextInterface[multicontext]", "create with appID(%s), nil appScriptPath", new Object[] { this.gMN.getAppId() });
    while (true)
    {
      return i;
      int j = alloc();
      if (j <= 0)
      {
        i = j;
      }
      else
      {
        g localg = this.gMO.oO(j);
        j = evaluateScriptFile(j, paramString);
        if (j != 1)
        {
          ab.e("MicroMsg.AppBrandJSContextInterface[multicontext]", "create with appID(%s), appScriptPath(%s), eval ret = %d", new Object[] { this.gMN.getAppId(), paramString, Integer.valueOf(j) });
        }
        else
        {
          ab.i("MicroMsg.AppBrandJSContextInterface[multicontext]", "create with appID(%s) appScriptPath(%s), success with contextId(%d)", new Object[] { this.gMN.getAppId(), paramString, Integer.valueOf(localg.aGT()) });
          i = localg.aGT();
        }
      }
    }
  }

  @JavascriptInterface
  public final void destroy(int paramInt)
  {
    this.gMO.oP(paramInt);
  }

  protected void ds(boolean paramBoolean)
  {
  }

  protected void dt(boolean paramBoolean)
  {
  }

  @JavascriptInterface
  public int evaluateScriptFile(int paramInt, String paramString)
  {
    int i = -1;
    ab.i("MicroMsg.AppBrandJSContextInterface[multicontext]", "evaluateScriptFile with appID(%s) contextId(%d) appScriptPath(%s)", new Object[] { this.gMN.getAppId(), Integer.valueOf(paramInt), paramString });
    g localg = this.gMO.oO(paramInt);
    if (localg == null)
    {
      ab.e("MicroMsg.AppBrandJSContextInterface[multicontext]", "evaluateScriptFile with appID(%s) contextId(%d), appScriptPath(%s), get null context", new Object[] { this.gMN.getAppId(), Integer.valueOf(paramInt), paramString });
      paramInt = i;
    }
    while (true)
    {
      return paramInt;
      if (localg.aGS())
      {
        ab.e("MicroMsg.AppBrandJSContextInterface[multicontext]", "evaluateScriptFile with appID(%s) scriptPath(%s), but want to inject main-context", new Object[] { this.gMN.getAppId(), paramString });
        paramInt = i;
      }
      else
      {
        String str = aw.a(this.gMN.getRuntime(), paramString);
        if (bo.isNullOrNil(str))
        {
          ab.e("MicroMsg.AppBrandJSContextInterface[multicontext]", "evaluateScriptFile with appID(%s) contextId(%d), appScriptPath(%s), script 404", new Object[] { this.gMN.getAppId(), Integer.valueOf(paramInt), paramString });
          asN();
          paramInt = 0;
        }
        else
        {
          wL(paramString);
          a(localg, paramString, str, new e.1(this, localg, paramString));
          paramInt = 1;
        }
      }
    }
  }

  protected void wL(String paramString)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.e
 * JD-Core Version:    0.6.2
 */