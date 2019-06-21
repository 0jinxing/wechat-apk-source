package com.tencent.mm.plugin.appbrand.jsapi.video;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.t.b;
import com.tencent.mm.t.d;
import java.util.Map;

public final class n
  implements e
{
  public final String BR(String paramString)
  {
    AppMethodBeat.i(131630);
    AppBrandVideoDownLoadMgr localAppBrandVideoDownLoadMgr = AppBrandVideoDownLoadMgr.hYI;
    a locala = new a();
    locala.url = paramString;
    locala.hYE = null;
    paramString = localAppBrandVideoDownLoadMgr.genAdFileExist("gamead", locala);
    if (!bo.isNullOrNil(paramString))
      if (!paramString.equalsIgnoreCase("downloading"))
        AppMethodBeat.o(131630);
    while (true)
    {
      return paramString;
      AppMethodBeat.o(131630);
      paramString = null;
      continue;
      AppMethodBeat.o(131630);
      paramString = null;
    }
  }

  public final int a(String paramString, c paramc)
  {
    int i = -1;
    AppMethodBeat.i(131628);
    Object localObject = AppBrandVideoDownLoadMgr.hYI;
    if ((paramString == null) || (bo.isNullOrNil(paramString)))
    {
      ab.i("MicroMsg.AppBrand.AppBrandVideoDownLoadMgr", "leonlad genPreLoad illegal url or preLoadCallback");
      AppMethodBeat.o(131628);
    }
    while (true)
    {
      return i;
      a locala = new a();
      locala.url = paramString;
      locala.hYE = paramc;
      ab.i("MicroMsg.AppBrand.AppBrandVideoDownLoadMgr", "leonlad genPreLoad  videoUrl = %s", new Object[] { paramString });
      paramString = ((AppBrandVideoDownLoadMgr)localObject).genAdFileExist("gamead", locala);
      if (!bo.isNullOrNil(paramString))
        if (!paramString.equalsIgnoreCase("downloading"))
        {
          AppBrandVideoDownLoadMgr.hYH.put(locala.url, locala);
          AppBrandVideoDownLoadMgr.ak(locala.url, true);
          locala.hYE.cv(locala.url, paramString);
        }
      while (true)
      {
        AppMethodBeat.o(131628);
        i = 0;
        break;
        i = -2;
        AppMethodBeat.o(131628);
        break;
        paramc = ((AppBrandVideoDownLoadMgr)localObject).genAdFilePath("gamead", locala);
        if (bo.isNullOrNil(paramc))
          break label264;
        localObject = AppBrandVideoDownLoadMgr.hYJ;
        paramString = locala.url;
        if (d.ewX != null)
          i = d.ewX.a(paramString, paramc, (b)localObject);
        ab.i("MicroMsg.AppBrand.AppBrandVideoDownLoadMgr", "leonlad downloadVideo path=%s, ret=%d", new Object[] { paramc, Integer.valueOf(i) });
        if (i != 0)
        {
          i = -3;
          AppMethodBeat.o(131628);
          break;
        }
        AppBrandVideoDownLoadMgr.hYH.put(locala.url, locala);
      }
      label264: i = -4;
      AppMethodBeat.o(131628);
    }
  }

  public final void report(String paramString)
  {
    AppMethodBeat.i(131629);
    AppBrandVideoDownLoadMgr.hYI.report(paramString);
    AppMethodBeat.o(131629);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.video.n
 * JD-Core Version:    0.6.2
 */