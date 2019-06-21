package com.tencent.mm.plugin.appbrand.i;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.e.a;
import com.tencent.mm.ai.e.b;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.bf;
import com.tencent.mm.model.r;
import com.tencent.mm.modelappbrand.k;
import com.tencent.mm.platformtools.aa;
import com.tencent.mm.plugin.messenger.foundation.a.a.h;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.plugin.messenger.foundation.a.n;
import com.tencent.mm.protocal.protobuf.cm;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ak;
import com.tencent.mm.storage.be;
import com.tencent.mm.storage.bi;
import java.util.Map;

public enum b
  implements n
{
  static
  {
    AppMethodBeat.i(132273);
    int = new b("INSTANCE");
    inu = new b[] { int };
    AppMethodBeat.o(132273);
  }

  public final e.b a(String paramString, Map<String, String> paramMap, e.a parama)
  {
    AppMethodBeat.i(132272);
    if ((paramString == null) || (!paramString.equals("subscribesysmsg")))
    {
      ab.e("MicroMsg.WxaSubscribeSysmsgHandler", "subType is err, return");
      AppMethodBeat.o(132272);
    }
    while (true)
    {
      return null;
      paramMap = (String)paramMap.get(".sysmsg.subscribesysmsg.content_template.link_list.link.share_key");
      if (bo.isNullOrNil(paramMap))
      {
        ab.e("MicroMsg.WxaSubscribeSysmsgHandler", "shareKey is null, return");
        AppMethodBeat.o(132272);
      }
      else
      {
        ab.i("MicroMsg.WxaSubscribeSysmsgHandler", "consumeNewXml subType:%s", new Object[] { paramString });
        paramString = ((k)g.K(k.class)).pn(paramMap);
        if (paramString == null)
        {
          ab.e("MicroMsg.WxaSubscribeSysmsgHandler", "shareKey:%s wxaUpdateableMsg is null, ingore", new Object[] { paramMap });
          AppMethodBeat.o(132272);
        }
        else if ((paramString.field_btnState != 2) || (paramString.field_msgState != 0))
        {
          ab.e("MicroMsg.WxaSubscribeSysmsgHandler", "shareKey:%s btnState:%d msgState:%d ingore", new Object[] { paramMap, Integer.valueOf(paramString.field_btnState), Integer.valueOf(paramString.field_msgState) });
          AppMethodBeat.o(132272);
        }
        else
        {
          if ((parama != null) && (parama.eAB != null))
            break;
          ab.e("MicroMsg.WxaSubscribeSysmsgHandler", "addMsgInfo or addMsgInfo.addMsg is null! should not happen");
          AppMethodBeat.o(132272);
        }
      }
    }
    paramMap = parama.eAB;
    String str1 = aa.a(paramMap.vED);
    String str2 = aa.a(paramMap.vEB);
    String str3 = aa.a(paramMap.vEC);
    paramString = ((j)g.K(j.class)).bOr().Q(str2, paramMap.ptF);
    int i = 0;
    if (paramString.field_msgId > 0L)
      i = 1;
    paramString.eI(paramMap.ptF);
    if ((!parama.fsU) || (!parama.fsW))
      paramString.eJ(bf.q(str2, paramMap.pcX));
    paramString.setType(603979825);
    paramString.setContent(str1);
    paramString.hO(0);
    paramString.setStatus(3);
    if (str2.equals(r.Yz()))
    {
      paramString.ju(str3);
      label354: paramString.ix(paramMap.vEG);
      bf.a(paramString, parama);
      if (i != 0)
        break label479;
      bf.l(paramString);
      label377: paramMap = ((j)g.K(j.class)).XR().aoZ(paramString.field_talker);
      if (paramMap == null)
        break label505;
      paramMap.jj(33554432);
      i = ((j)g.K(j.class)).XR().a(paramMap, paramString.field_talker);
      ab.d("MicroMsg.WxaSubscribeSysmsgHandler", "username:%s ok:%b", new Object[] { paramString.field_talker, Integer.valueOf(i) });
    }
    while (true)
    {
      AppMethodBeat.o(132272);
      break;
      paramString.ju(str2);
      break label354;
      label479: ((j)g.K(j.class)).bOr().b(paramMap.ptF, paramString);
      break label377;
      label505: ab.d("MicroMsg.WxaSubscribeSysmsgHandler", "conv is null");
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.i.b
 * JD-Core Version:    0.6.2
 */