package com.tencent.mm.plugin.appbrand.dynamic.j;

import android.os.Bundle;
import android.util.Pair;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.x;
import com.tencent.mm.ipcinvoker.i;
import com.tencent.mm.kernel.g;
import com.tencent.mm.modelappbrand.u;
import com.tencent.mm.plugin.appbrand.a.d;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.mm.plugin.appbrand.appcache.as;
import com.tencent.mm.plugin.appbrand.appcache.at;
import com.tencent.mm.plugin.appbrand.appcache.ax;
import com.tencent.mm.plugin.appbrand.dynamic.launching.b;
import com.tencent.mm.plugin.appbrand.dynamic.launching.c;
import com.tencent.mm.plugin.appbrand.dynamic.launching.c.a;
import com.tencent.mm.protocal.protobuf.aqz;
import com.tencent.mm.protocal.protobuf.ara;
import com.tencent.mm.protocal.protobuf.cvw;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.LinkedList;

class a$a
  implements i<Bundle, WxaPkgWrappingInfo>
{
  private static WxaPkgWrappingInfo r(Bundle paramBundle)
  {
    AppMethodBeat.i(10982);
    Object localObject1 = paramBundle.getString("id");
    String str = paramBundle.getString("appId");
    int i = paramBundle.getInt("pkgType");
    int j = paramBundle.getInt("pkgVersion");
    paramBundle.getInt("scene");
    Object localObject2 = paramBundle.getString("searchId");
    Object localObject3 = paramBundle.getString("preload_download_data");
    switch (i)
    {
    default:
      paramBundle = "";
    case 10102:
    case 10001:
    case 10000:
    case 10100:
    case 10101:
    }
    try
    {
      localObject3 = ((d)g.K(d.class)).xF().a(str, i, new String[] { "downloadURL", "version" });
      if (localObject3 != null)
      {
        paramBundle = ((at)localObject3).field_downloadURL;
        j = ((at)localObject3).field_version;
      }
      localObject3 = new com/tencent/mm/plugin/appbrand/dynamic/launching/b;
      ((b)localObject3).<init>((String)localObject1, str, (String)localObject2, i, j, b.hoi, paramBundle);
      paramBundle = ((b)localObject3).azZ();
      AppMethodBeat.o(10982);
      while (true)
      {
        return paramBundle;
        paramBundle = "";
        try
        {
          Object localObject4 = ((d)g.K(d.class)).xF().a(str, i, new String[] { "downloadURL", "version" });
          if (localObject4 != null)
          {
            paramBundle = ((at)localObject4).field_downloadURL;
            j = ((at)localObject4).field_version;
          }
          localObject4 = new com/tencent/mm/plugin/appbrand/dynamic/launching/b;
          ((b)localObject4).<init>((String)localObject1, str, (String)localObject2, i, j, b.hoj, paramBundle, (String)localObject3);
          paramBundle = ((b)localObject4).azZ();
          AppMethodBeat.o(10982);
        }
        catch (Exception paramBundle)
        {
          ab.e("MicroMsg.DynamicPkgUpdater", "CheckWidgetPkg error : %s", new Object[] { paramBundle });
        }
        do
        {
          paramBundle = null;
          AppMethodBeat.o(10982);
          break;
        }
        while (new c(str, "", "", (byte)0).aAa() != c.a.hoq.ordinal());
        paramBundle = ((d)g.K(d.class)).xF().a(str, i, new String[] { "downloadURL" });
        if (paramBundle == null)
        {
          ab.e("MicroMsg.DynamicPkgUpdater", "WxaPkgManifestRecord(%s, %d) is null.", new Object[] { str, Integer.valueOf(i) });
          paramBundle = null;
          AppMethodBeat.o(10982);
        }
        else
        {
          try
          {
            localObject3 = new com/tencent/mm/plugin/appbrand/dynamic/launching/b;
            ((b)localObject3).<init>((String)localObject1, str, (String)localObject2, i, j, b.hoi, paramBundle.field_downloadURL);
            paramBundle = ((b)localObject3).azZ();
            AppMethodBeat.o(10982);
          }
          catch (Exception paramBundle)
          {
            ab.e("MicroMsg.DynamicPkgUpdater", "getWxaPkgInfo(%s, %d) error : %s", new Object[] { str, Integer.valueOf(i), paramBundle });
            paramBundle = null;
            AppMethodBeat.o(10982);
          }
          continue;
          paramBundle = (WxaPkgWrappingInfo)as.v(str, i, j).second;
          AppMethodBeat.o(10982);
        }
      }
      localObject2 = ((d)g.K(d.class)).xF().a(str, i, new String[] { "downloadURL" });
      g.RN();
      int k = com.tencent.mm.kernel.a.QF();
      localObject1 = new b.a();
      localObject3 = new aqz();
      ((aqz)localObject3).csB = str;
      ((aqz)localObject3).wuJ = k;
      paramBundle = new cvw();
      switch (i)
      {
      default:
        paramBundle.vOO = 0;
        paramBundle.xrP = 0;
        label618: if (localObject2 != null)
        {
          paramBundle.cvZ = ((at)localObject2).field_versionMd5;
          label632: ((aqz)localObject3).wuK = new LinkedList();
          ((aqz)localObject3).wuK.add(paramBundle);
          ((b.a)localObject1).fsJ = ((com.tencent.mm.bt.a)localObject3);
          ((b.a)localObject1).fsK = new ara();
          ((b.a)localObject1).uri = "/cgi-bin/mmbiz-bin/wxaapp/getwidgetinfo";
          ((b.a)localObject1).fsI = 1186;
          paramBundle = x.c(((b.a)localObject1).acD());
          if ((paramBundle.errType != 0) || (paramBundle.errCode != 0))
            break label930;
          paramBundle = (ara)paramBundle.fsy;
          if ((paramBundle != null) && (paramBundle.wuK != null) && (paramBundle.wuK.size() > 0))
          {
            paramBundle = (cvw)paramBundle.wuK.getFirst();
            u.i("MicroMsg.DynamicPkgUpdater", "getWidgetInfo debugType %d, md5 %s, url %s", new Object[] { Integer.valueOf(i), paramBundle.cvZ, paramBundle.url });
            if ((paramBundle.url != null) && (paramBundle.url.length() > 0))
              switch (i)
              {
              default:
              case 10000:
              case 10001:
              case 10100:
              case 10101:
              }
          }
        }
        break;
      case 10100:
      case 10101:
      }
      while (true)
      {
        paramBundle = (WxaPkgWrappingInfo)as.v(str, i, j).second;
        AppMethodBeat.o(10982);
        break;
        paramBundle.vOO = 1;
        paramBundle.xrP = 1;
        break label618;
        paramBundle.vOO = 2;
        paramBundle.xrP = 1;
        break label618;
        paramBundle.cvZ = "";
        break label632;
        ((d)g.K(d.class)).xF().a(str, i, paramBundle.url, paramBundle.cvZ, 0L, 0L);
        continue;
        label930: ab.i("MicroMsg.DynamicPkgUpdater", "cgi fail errType %d, errCode %d,errMsg %s, appid %s , pkgType %d", new Object[] { Integer.valueOf(paramBundle.errType), Integer.valueOf(paramBundle.errCode), paramBundle.aIm, str, Integer.valueOf(i) });
        u.i("MicroMsg.DynamicPkgUpdater", "cgi fail errType %d, errCode %d,errMsg %s, appid %s , pkgType %d", new Object[] { Integer.valueOf(paramBundle.errType), Integer.valueOf(paramBundle.errCode), paramBundle.aIm, str, Integer.valueOf(i) });
      }
    }
    catch (Exception paramBundle)
    {
      while (true)
        ab.e("MicroMsg.DynamicPkgUpdater", "CheckWidgetPkg error : %s", new Object[] { paramBundle });
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.dynamic.j.a.a
 * JD-Core Version:    0.6.2
 */