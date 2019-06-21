package com.tencent.mm.plugin.appbrand.launching;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.app.f;
import com.tencent.mm.plugin.appbrand.appcache.ai;
import com.tencent.mm.plugin.appbrand.appcache.at;
import com.tencent.mm.plugin.appbrand.appcache.ax;
import com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer;
import com.tencent.mm.plugin.appbrand.report.quality.QualitySession;

class aj extends af<aa>
{
  final String appId;
  final int axy;
  final int cDB;
  final int cOq;
  final int hCY;
  final int har;
  final String hgC;
  final AppBrandLaunchReferrer hgF;
  final QualitySession hgN;
  final String igH;

  aj(String paramString1, int paramInt1, int paramInt2, int paramInt3, String paramString2, AppBrandLaunchReferrer paramAppBrandLaunchReferrer, String paramString3, int paramInt4, QualitySession paramQualitySession)
  {
    AppMethodBeat.i(131985);
    this.appId = paramString1;
    this.har = paramInt1;
    this.cOq = paramInt2;
    this.cDB = paramInt3;
    this.hgC = paramString2;
    this.hgF = paramAppBrandLaunchReferrer;
    this.igH = paramString3;
    paramString1 = f.auV().a(paramString1, paramInt1, new String[] { "version" });
    if (paramString1 == null)
    {
      paramInt1 = i;
      this.axy = paramInt1;
      if (paramInt4 < 0)
        break label112;
    }
    while (true)
    {
      this.hCY = paramInt4;
      this.hgN = paramQualitySession;
      AppMethodBeat.o(131985);
      return;
      paramInt1 = paramString1.field_version;
      break;
      label112: paramInt4 = ai.avM();
    }
  }

  void atT()
  {
  }

  final String getTag()
  {
    return "MicroMsg.AppBrand.PrepareStepCheckLaunchInfo";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.launching.aj
 * JD-Core Version:    0.6.2
 */