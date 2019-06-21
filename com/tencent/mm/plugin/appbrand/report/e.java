package com.tencent.mm.plugin.appbrand.report;

import a.f.b.j;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.p;
import com.tencent.mm.kernel.a;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/appbrand/report/AppBrandStarOperationReporter;", "", "()V", "TAG", "", "value", "pullDownOpenSceneId", "getPullDownOpenSceneId", "()Ljava/lang/String;", "setPullDownOpenSceneId", "(Ljava/lang/String;)V", "generateSceneId", "report", "", "info", "Lcom/tencent/mm/plugin/appbrand/appusage/LocalUsageInfo;", "eventId", "", "scene", "sceneId", "appId", "appVersion", "appState", "plugin-appbrand-integration_release"})
public final class e
{
  private static String iAm;
  public static final e iAn;

  static
  {
    AppMethodBeat.i(134940);
    iAn = new e();
    AppMethodBeat.o(134940);
  }

  public static final void Dz(String paramString)
  {
    iAm = paramString;
  }

  public static final void a(LocalUsageInfo paramLocalUsageInfo, int paramInt1, int paramInt2, String paramString)
  {
    AppMethodBeat.i(134938);
    if (paramLocalUsageInfo != null)
    {
      String str = paramLocalUsageInfo.appId;
      int i = paramLocalUsageInfo.axy;
      int j = paramLocalUsageInfo.har + 1;
      if (str != null)
      {
        int k = c.Dw(str);
        ab.d("MicroMsg.AppBrandStarOperationReporter", "report, appId: " + str + ", appVersion: " + i + ", appState: : " + j + ", eventId: " + paramInt1 + ',' + "scene: " + paramInt2 + ", sceneId: " + paramString + ", serviceType: " + k);
        h.pYm.e(13801, new Object[] { str, Integer.valueOf(i), Integer.valueOf(j), Long.valueOf(bo.anT()), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString, Integer.valueOf(k) });
      }
    }
    AppMethodBeat.o(134938);
  }

  public static final String aLc()
  {
    AppMethodBeat.i(134939);
    Object localObject = new StringBuilder("SceneId@").append(iAn.hashCode()).append('#');
    j.o(g.RN(), "MMKernel.account()");
    localObject = p.getString(a.QF()) + '#' + bo.anU();
    AppMethodBeat.o(134939);
    return localObject;
  }

  public static final String aLd()
  {
    return iAm;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.report.e
 * JD-Core Version:    0.6.2
 */