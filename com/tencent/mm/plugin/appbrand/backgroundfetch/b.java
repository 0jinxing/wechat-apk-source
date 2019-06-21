package com.tencent.mm.plugin.appbrand.backgroundfetch;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.plugin.appbrand.appusage.af;
import com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC;
import com.tencent.mm.plugin.appbrand.config.p;
import com.tencent.mm.plugin.appbrand.task.h;
import com.tencent.mm.protocal.protobuf.ble;
import com.tencent.mm.protocal.protobuf.cxb;
import com.tencent.mm.protocal.protobuf.cxc;
import com.tencent.mm.protocal.protobuf.gk;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.vending.j.c;
import java.util.LinkedList;
import java.util.List;

public final class b
{
  private static void a(int paramInt, List<gk> paramList, i parami)
  {
    AppMethodBeat.i(129762);
    if ((paramList.isEmpty()) || (parami == null))
    {
      ab.i("MicroMsg.AppBrand.AppBrandBackgroundFetchDataHandler", "batchFetchDataInternal, requestList or callback is null");
      AppMethodBeat.o(129762);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.AppBrand.AppBrandBackgroundFetchDataHandler", "batchFetchDataInternal, size:%d", new Object[] { Integer.valueOf(paramList.size()) });
      cxb localcxb = new cxb();
      localcxb.xsC.addAll(paramList);
      paramList = new b.a();
      paramList.fsI = 1733;
      paramList.uri = "/cgi-bin/mmbiz-bin/wxabusiness/fetchdata";
      paramList.fsJ = localcxb;
      paramList.fsK = new cxc();
      com.tencent.mm.ipcinvoker.wx_extension.b.a(paramList.acD(), new b.2(parami, localcxb, paramInt));
      AppMethodBeat.o(129762);
    }
  }

  public static void a(String paramString1, String paramString2, int paramInt1, String paramString3, int paramInt2, g paramg)
  {
    AppMethodBeat.i(129761);
    if (bo.isNullOrNil(paramString2))
    {
      ab.i("MicroMsg.AppBrand.AppBrandBackgroundFetchDataHandler", "preFetchData, username is null");
      AppMethodBeat.o(129761);
    }
    Object localObject;
    while (true)
    {
      return;
      localObject = p.zi(paramString2);
      if ((localObject == null) || (((a)localObject).hbV))
        break;
      ab.i("MicroMsg.AppBrand.AppBrandBackgroundFetchDataHandler", "preFetchData, app(%s_v%d) can not pre fetch data", new Object[] { paramString2, Integer.valueOf(paramInt1) });
      AppMethodBeat.o(129761);
    }
    String str;
    if (aO(paramString2, paramInt1))
    {
      if (bo.isNullOrNil(paramString3))
        break label351;
      paramInt1 = paramString3.lastIndexOf('?');
      if (paramInt1 > 0)
      {
        localObject = paramString3.substring(0, paramInt1);
        if (paramInt1 >= paramString3.length() - 1)
          break label338;
        str = paramString3.substring(paramInt1 + 1);
        paramString3 = (String)localObject;
        localObject = str;
      }
    }
    while (true)
    {
      paramString3 = com.tencent.mm.vending.j.a.F(paramString3, localObject);
      localObject = (String)paramString3.get(0);
      str = (String)paramString3.get(1);
      ab.i("MicroMsg.AppBrand.AppBrandBackgroundFetchDataHandler", "preFetchDataInternal, app(%s) pre fetch data start, path:%s, query:%s, scene:%d", new Object[] { paramString2, localObject, str, Integer.valueOf(paramInt2) });
      paramString3 = new gk();
      paramString3.csB = paramString1;
      paramString3.username = paramString2;
      paramString3.vIG = 0;
      paramString3.vIH = new ble();
      paramString3.vIH.scene = paramInt2;
      if (!bo.isNullOrNil((String)localObject))
        paramString3.vIH.path = ((String)localObject);
      if (!bo.isNullOrNil(str))
        paramString3.vIH.query = str;
      paramString1 = new LinkedList();
      paramString1.add(paramString3);
      a(0, paramString1, paramg);
      AppMethodBeat.o(129761);
      break;
      localObject = null;
      continue;
      ab.i("MicroMsg.AppBrand.AppBrandBackgroundFetchDataHandler", "preFetchData, app(%s_v%d) is not star app", new Object[] { paramString2, Integer.valueOf(paramInt1) });
      AppMethodBeat.o(129761);
      break;
      label338: str = null;
      paramString3 = (String)localObject;
      localObject = str;
      continue;
      label351: localObject = null;
      paramString3 = null;
    }
  }

  public static boolean a(AppBrandInitConfigWC paramAppBrandInitConfigWC)
  {
    AppMethodBeat.i(129764);
    boolean bool;
    if ((paramAppBrandInitConfigWC != null) && (!bo.isNullOrNil(paramAppBrandInitConfigWC.appId)) && (!h.DS(paramAppBrandInitConfigWC.appId)))
    {
      bool = true;
      AppMethodBeat.o(129764);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(129764);
    }
  }

  static boolean aO(String paramString, int paramInt)
  {
    AppMethodBeat.i(129763);
    boolean bool;
    if (bo.isNullOrNil(paramString))
    {
      bool = false;
      AppMethodBeat.o(129763);
    }
    while (true)
    {
      return bool;
      bool = ((af)com.tencent.mm.kernel.g.K(af.class)).aB(paramString, paramInt);
      AppMethodBeat.o(129763);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.backgroundfetch.b
 * JD-Core Version:    0.6.2
 */