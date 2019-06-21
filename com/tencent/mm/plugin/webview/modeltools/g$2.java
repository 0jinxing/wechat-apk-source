package com.tencent.mm.plugin.webview.modeltools;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.vt;
import com.tencent.mm.g.a.vt.a;
import com.tencent.mm.model.r;
import com.tencent.mm.model.u;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.sns.b.i;
import com.tencent.mm.pointers.PString;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.ab;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

final class g$2 extends c<vt>
{
  g$2(g paramg)
  {
    AppMethodBeat.i(6961);
    this.xxI = vt.class.getName().hashCode();
    AppMethodBeat.o(6961);
  }

  private static boolean a(vt paramvt)
  {
    AppMethodBeat.i(6962);
    String str1;
    ArrayList localArrayList;
    PString localPString;
    String str2;
    int i;
    int j;
    Object localObject;
    if ((paramvt instanceof vt))
    {
      str1 = r.Yz();
      localArrayList = new ArrayList();
      localArrayList.add(paramvt.cSG.cSH);
      localArrayList.add(paramvt.cSG.cSI);
      localArrayList.add(paramvt.cSG.cSJ);
      localArrayList.add(paramvt.cSG.cSK);
      localArrayList.add(paramvt.cSG.url);
      localArrayList.add(paramvt.cSG.cSL);
      localArrayList.add(paramvt.cSG.cSM);
      localArrayList.add(paramvt.cSG.cSN);
      localArrayList.add(paramvt.cSG.cSO);
      localArrayList.add(paramvt.cSG.cSP);
      localArrayList.add(str1);
      localArrayList.add(paramvt.cSG.cSQ);
      localArrayList.add(paramvt.cSG.cSR);
      localPString = new PString();
      str2 = ((i)com.tencent.mm.kernel.g.K(i.class)).a(paramvt.cSG.cSS, localPString);
      localArrayList.add(str2);
      localArrayList.add("");
      localArrayList.add("");
      localArrayList.add("");
      i = u.ad(paramvt.cSG.cSJ, paramvt.cSG.cSK);
      j = u.ad(str1, paramvt.cSG.cSM);
      localArrayList.add(String.valueOf(i));
      localArrayList.add(String.valueOf(j));
      localObject = paramvt.cSG.cST;
    }
    while (true)
    {
      try
      {
        String str3 = URLEncoder.encode((String)localObject, "UTF-8");
        localObject = str3;
        localArrayList.add(localObject);
        localArrayList.add(localPString.value);
        String str5 = paramvt.cSG.cSH;
        String str6 = paramvt.cSG.cSI;
        String str7 = paramvt.cSG.cSJ;
        String str8 = paramvt.cSG.cSK;
        if (paramvt.cSG.url == null)
        {
          localObject = paramvt.cSG.url;
          int k = paramvt.cSG.cSL;
          String str9 = paramvt.cSG.cSM;
          String str10 = paramvt.cSG.cSN;
          int m = paramvt.cSG.cSO;
          int n = paramvt.cSG.cSP;
          int i1 = paramvt.cSG.cSQ;
          if (paramvt.cSG.cSR != null)
            continue;
          str3 = paramvt.cSG.cSR;
          ab.d("MicroMsg.SubCoreTools", "report(11954) : prePublishId : %s, curPublishId : %s, preUsername : %s, preChatName : %s, url : %s, preMsgIndex : %s, curChatName : %s, curChatTitle : %s, curChatMemberCount : %s, sendAppMsgScene : %s, curUserName : %s, getA8KeyScene : %s, referUrl : %s. : statExtStr:%s(%s), preChatType:%d, curChatType:%d, webViewTitle:%s, sourceAppId:%s", new Object[] { str5, str6, str7, str8, localObject, Integer.valueOf(k), str9, str10, Integer.valueOf(m), Integer.valueOf(n), str1, Integer.valueOf(i1), str3, paramvt.cSG.cSS, str2, Integer.valueOf(i), Integer.valueOf(j), paramvt.cSG.cST, localPString.value });
          if (paramvt.cSG.cSU != 2)
          {
            paramvt = h.pYm;
            h.g(11954, localArrayList);
          }
          bool = true;
          AppMethodBeat.o(6962);
          return bool;
        }
      }
      catch (Exception localException)
      {
        ab.printErrStackTrace("MicroMsg.SubCoreTools", localException, "", new Object[0]);
        continue;
        localObject = paramvt.cSG.url.replace(",", "!");
        continue;
        String str4 = paramvt.cSG.cSR.replace(",", "!");
        continue;
      }
      boolean bool = false;
      AppMethodBeat.o(6962);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.modeltools.g.2
 * JD-Core Version:    0.6.2
 */