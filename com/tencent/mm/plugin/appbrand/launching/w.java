package com.tencent.mm.plugin.appbrand.launching;

import android.text.TextUtils;
import android.util.Pair;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.a.a;
import com.tencent.mm.ai.x;
import com.tencent.mm.compatible.loader.a;
import com.tencent.mm.plugin.appbrand.app.f;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.mm.plugin.appbrand.appcache.as;
import com.tencent.mm.plugin.appbrand.appcache.at;
import com.tencent.mm.plugin.appbrand.appcache.ax;
import com.tencent.mm.plugin.appbrand.appcache.az;
import com.tencent.mm.plugin.appbrand.appcache.az.a;
import com.tencent.mm.plugin.appbrand.appcache.y;
import com.tencent.mm.plugin.appbrand.debugger.DebuggerShell;
import com.tencent.mm.plugin.appbrand.report.c;
import com.tencent.mm.plugin.appbrand.ui.AppBrand404PageUI;
import com.tencent.mm.protocal.protobuf.aoz;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Locale;

final class w extends u
{
  final String appId;
  int cBc;
  final int cvn;
  final String gTy;
  private final int[] ihE;

  w(String paramString1, String paramString2, int paramInt)
  {
    this(paramString1, paramString2, paramInt, 0);
  }

  w(String paramString1, String paramString2, int paramInt1, int paramInt2)
  {
    super(new y(paramString1, paramString2, paramInt2));
    AppMethodBeat.i(131900);
    this.cBc = 4;
    this.ihE = new int[] { 14, 12, 13 };
    this.appId = paramString1;
    this.gTy = paramString2;
    this.cvn = paramInt1;
    if (a.contains(this.ihE, paramInt2))
      this.cBc = paramInt2;
    AppMethodBeat.o(131900);
  }

  public final String aHu()
  {
    AppMethodBeat.i(131901);
    String str = String.format(Locale.US, "appId %s, module %s, codeType %d, pkgType %d,queryKey:%s", new Object[] { this.appId, this.gTy, Integer.valueOf(this.cvn), Integer.valueOf(this.cBc), this.ihz });
    AppMethodBeat.o(131901);
    return str;
  }

  public final void prepare()
  {
    int i = -1;
    AppMethodBeat.i(131902);
    Object localObject1 = as.v(this.ihz.toString(), this.cvn, 1);
    if (((Pair)localObject1).second != null)
    {
      ((WxaPkgWrappingInfo)((Pair)localObject1).second).name = this.gTy;
      e((WxaPkgWrappingInfo)((Pair)localObject1).second);
      ab.i("MicroMsg.AppBrand.LaunchPkgPrepareJobTestCode", "%s prepare ok", new Object[] { aHu() });
      aHs();
      AppMethodBeat.o(131902);
    }
    while (true)
    {
      return;
      if (bo.isNullOrNil(this.gTy))
        localObject1 = f.auV().at(this.appId, this.cvn);
      Object localObject2;
      while (true)
      {
        localObject2 = new w.1(this, this.cvn);
        ab.i("MicroMsg.AppBrand.LaunchPkgPrepareJobTestCode", "%s before download, url(%s)", new Object[] { aHu(), localObject1 });
        if (!bo.isNullOrNil((String)localObject1))
          break label641;
        e(null);
        AppMethodBeat.o(131902);
        break;
        localObject1 = f.auV().a(this.ihz.toString(), this.cvn, new String[] { "versionMd5", "downloadURL" });
        if (localObject1 == null)
        {
          ab.e("MicroMsg.AppBrand.LaunchPkgPrepareJobTestCode", "%s, NULL record", new Object[] { aHu() });
          localObject1 = null;
        }
        else
        {
          if ((!DebuggerShell.ayT()) || (TextUtils.isEmpty(((at)localObject1).field_downloadURL)))
            break label278;
          ab.i("MicroMsg.AppBrand.LaunchPkgPrepareJobTestCode", "getDownloadURL, with appId[%s], module[%s] hit monkey pushed url[%s]", new Object[] { this.appId, this.gTy, ((at)localObject1).field_downloadURL });
          localObject1 = ((at)localObject1).field_downloadURL;
        }
      }
      label278: ab.i("MicroMsg.AppBrand.LaunchPkgPrepareJobTestCode", "%s, record md5:%s", new Object[] { aHu(), ((at)localObject1).field_versionMd5 });
      localObject1 = x.a(new com.tencent.mm.plugin.appbrand.appcache.e(this.appId, this.gTy, ((at)localObject1).field_versionMd5, this.cvn, this.cBc));
      if ((localObject1 == null) || (((a.a)localObject1).errType != 0) || (((a.a)localObject1).errCode != 0))
      {
        localObject2 = aHu();
        int j;
        if (localObject1 == null)
        {
          j = -1;
          label364: if (localObject1 != null)
            break label458;
          k = -1;
          label371: ab.e("MicroMsg.AppBrand.LaunchPkgPrepareJobTestCode", "%s, cgi failed, %d %d", new Object[] { localObject2, Integer.valueOf(j), Integer.valueOf(k) });
          if (localObject1 != null)
            break label467;
          j = -1;
          label409: if (localObject1 != null)
            break label476;
        }
        label458: label467: label476: for (int k = i; ; k = ((a.a)localObject1).errCode)
        {
          ag.Ck(ag.getMMString(2131296769, new Object[] { Integer.valueOf(j), Integer.valueOf(k) }));
          localObject1 = null;
          break;
          j = ((a.a)localObject1).errType;
          break label364;
          k = ((a.a)localObject1).errCode;
          break label371;
          j = ((a.a)localObject1).errType;
          break label409;
        }
      }
      ab.i("MicroMsg.AppBrand.LaunchPkgPrepareJobTestCode", "resp.errcode %d, resp.errmsg %s, resp.url %s", new Object[] { Integer.valueOf(((aoz)((a.a)localObject1).fsy).error_code), ((aoz)((a.a)localObject1).fsy).error_msg, ((aoz)((a.a)localObject1).fsy).egm });
      if (bo.isNullOrNil(((aoz)((a.a)localObject1).fsy).egm))
      {
        if (((aoz)((a.a)localObject1).fsy).error_code != -1001)
          break label603;
        AppBrand404PageUI.show(2131296795);
        c.K(this.appId, 4, this.cvn + 1);
      }
      while (true)
      {
        localObject1 = ((aoz)((a.a)localObject1).fsy).egm;
        break;
        label603: ag.Ck(com.tencent.mm.plugin.appbrand.s.e.getMMString(2131296772, new Object[] { Integer.valueOf(5), Integer.valueOf(((aoz)((a.a)localObject1).fsy).error_code) }));
      }
      label641: if (!az.a(this.ihz.toString(), this.cvn, (String)localObject1, (az.a)localObject2, new w.2(this)))
      {
        ab.e("MicroMsg.AppBrand.LaunchPkgPrepareJobTestCode", "%s start downloadPkg failed", new Object[] { aHu() });
        e(null);
        AppMethodBeat.o(131902);
      }
      else
      {
        aHt();
        AppMethodBeat.o(131902);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.launching.w
 * JD-Core Version:    0.6.2
 */