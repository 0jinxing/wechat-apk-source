package com.tencent.mm.plugin.appbrand.debugger;

import a.l;
import a.v;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.appcache.av.c;
import com.tencent.mm.plugin.appbrand.appusage.al;
import com.tencent.mm.plugin.appbrand.config.p;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Map;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/appbrand/debugger/MonkeyUpdateWxaUsageListNotify;", "Lcom/tencent/mm/plugin/appbrand/appcache/WxaPkgPushingXmlHandler$IMessageHandler;", "()V", "SAMPLE", "", "handleMessage", "", "parsedKV", "", "nilAs", "as", "Lkotlin/Function0;", "plugin-appbrand-integration_release"})
public final class h
  implements av.c
{
  private final String hjm = "<sysmsg type=\"AppBrandTestUpdateWxaUsageListNotify\">\n\n<AppBrandTestUpdateWxaUsageListNotify>\n\n    <DeleteCount></DeleteCount>\n\n    <DeleteList>\n\n        <DeleteAppInfo>\n\n            <UserName>%s</UserName>\n\n            <AppID>%s</AppID>\n\n            <AppType>%d</AppType>\n\n        </DeleteAppInfo>\n\n    </DeleteList>\n\n</AppBrandTestUpdateWxaUsageListNotify></sysmsg>";

  public final void u(Map<String, String> paramMap)
  {
    AppMethodBeat.i(134601);
    if (paramMap == null)
      AppMethodBeat.o(134601);
    while (true)
    {
      return;
      int i = bo.getInt((String)paramMap.get(".sysmsg.AppBrandTestUpdateWxaUsageListNotify" + ".DeleteCount"), 0);
      if (i <= 0)
      {
        AppMethodBeat.o(134601);
      }
      else
      {
        if (i >= 0)
          for (int j = 0; ; j++)
          {
            Object localObject1 = new StringBuilder().append(".sysmsg.AppBrandTestUpdateWxaUsageListNotify").append(".DeleteList.DeleteAppInfo");
            Object localObject2;
            int k;
            if (j == 0)
            {
              localObject2 = "";
              Object localObject3 = localObject2;
              localObject2 = (String)paramMap.get((String)localObject3 + ".UserName");
              localObject1 = (String)paramMap.get((String)localObject3 + ".AppID");
              k = bo.getInt((String)paramMap.get((String)localObject3 + ".AppType"), 0);
              localObject3 = (CharSequence)localObject2;
              if ((localObject3 != null) && (((CharSequence)localObject3).length() != 0))
                break label331;
              m = 1;
              label228: if (m != 0)
              {
                localObject3 = (CharSequence)localObject1;
                if ((localObject3 != null) && (((CharSequence)localObject3).length() != 0))
                  break label337;
                m = 1;
                if (m != 0)
                  break label358;
              }
              label258: localObject3 = (CharSequence)localObject2;
              if ((localObject3 != null) && (((CharSequence)localObject3).length() != 0))
                break label343;
            }
            label331: label337: label343: for (int m = 1; ; m = 0)
            {
              if (m != 0)
                localObject2 = p.zo((String)localObject1);
              if (localObject1 != null)
                break label349;
              paramMap = new v("null cannot be cast to non-null type kotlin.String");
              AppMethodBeat.o(134601);
              throw paramMap;
              localObject2 = Integer.valueOf(j);
              break;
              m = 0;
              break label228;
              m = 0;
              break label258;
            }
            label349: al.k((String)localObject2, (String)localObject1, k);
            label358: if (j == i)
              break;
          }
        AppMethodBeat.o(134601);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.debugger.h
 * JD-Core Version:    0.6.2
 */