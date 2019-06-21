package com.tencent.mm.plugin.topstory;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.px;
import com.tencent.mm.plugin.messenger.foundation.a.o;
import com.tencent.mm.plugin.websearch.api.an;
import com.tencent.mm.protocal.protobuf.cht;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.LinkedList;
import java.util.Map;

final class b$1
  implements o
{
  b$1(b paramb)
  {
  }

  public final void onNewXmlReceived(String paramString, Map<String, String> paramMap, com.tencent.mm.ai.e.a parama)
  {
    AppMethodBeat.i(65453);
    int i;
    if ((paramMap != null) && (paramString != null) && (paramString.equals("mmsearch_reddot_new")))
    {
      i = bo.ank((String)paramMap.get(".sysmsg.mmsearch_reddot_new.entry"));
      if (i == 2)
      {
        paramString = new cht();
        b.c(paramString);
        ab.i("MicroMsg.TopStory.TopStoryRedDotImpl", "recv %s, %s", new Object[] { "mmsearch_reddot_new", paramMap.toString() });
        paramString.xgA = bo.ank((String)paramMap.get(".sysmsg.mmsearch_reddot_new.clear"));
        paramString.uaU = i;
        paramString.cJb = bo.t((String)paramMap.get(".sysmsg.mmsearch_reddot_new.msgid"), new Object[0]);
        paramString.uaW = bo.ank((String)paramMap.get(".sysmsg.mmsearch_reddot_new.discovery"));
        paramString.uaV = bo.ank((String)paramMap.get(".sysmsg.mmsearch_reddot_new.android_cli_version"));
        paramString.fRS = bo.anl((String)paramMap.get(".sysmsg.mmsearch_reddot_new.expire_time"));
        paramString.tZU = bo.ank((String)paramMap.get(".sysmsg.mmsearch_reddot_new.h5_version"));
        paramString.type = bo.ank((String)paramMap.get(".sysmsg.mmsearch_reddot_new.reddot_type"));
        paramString.text = ((String)paramMap.get(".sysmsg.mmsearch_reddot_new.reddot_text"));
        paramString.cIY = ((String)paramMap.get(".sysmsg.mmsearch_reddot_new.reddot_icon"));
        paramString.xgz = bo.anl((String)paramMap.get(".sysmsg.mmsearch_reddot_new.timestamp"));
        paramString.xgB = System.currentTimeMillis();
        paramString.fQi = bo.ank((String)paramMap.get(".sysmsg.mmsearch_reddot_new.seq"));
        paramString.extInfo = bo.t((String)paramMap.get(".sysmsg.mmsearch_reddot_new.ext_info"), new Object[0]);
        if (paramString.xgA == 1)
        {
          paramMap = this.sAu;
          switch (paramString.type)
          {
          case 5:
          case 6:
          case 9:
          default:
            switch (paramString.type)
            {
            default:
              i = 1;
              label415: an.a(paramString, 100, i, 0, 0L, "");
              AppMethodBeat.o(65453);
            case 7:
            case 8:
            case 9:
            }
            break;
          case 8:
          case 7:
          case 1:
          case 2:
          case 3:
          case 4:
          case 10:
          }
        }
      }
    }
    while (true)
    {
      return;
      b.abx("");
      break;
      paramMap.a(paramString.xgz, true, paramString.fQi, false);
      paramMap = new px();
      a.xxA.m(paramMap);
      break;
      paramMap.A(paramString.xgz, false);
      paramMap = new px();
      a.xxA.m(paramMap);
      break;
      paramMap.m("", "", 0L);
      break;
      i = 2;
      break label415;
      i = 3;
      break label415;
      i = 4;
      break label415;
      switch (paramString.type)
      {
      case 5:
      case 6:
      default:
        an.a(paramString, 109, 0, 0, 0L, "r12|" + paramString.type);
      case 9:
        do
        {
          AppMethodBeat.o(65453);
          break;
        }
        while (this.sAu.sAo == null);
        this.sAu.sAo.aby(paramString.extInfo);
        an.a(paramString, 100, 4, 0, 0L, "");
        AppMethodBeat.o(65453);
        break;
      case 8:
        an.a(paramString, 100, 3, 0, 0L, "");
        b.abx(paramString.cJb);
        AppMethodBeat.o(65453);
        break;
      case 7:
        an.a(paramString, 100, 2, this.sAu.sAn.size(), 0L, "");
        this.sAu.b(paramString);
        AppMethodBeat.o(65453);
        break;
      case 1:
      case 2:
      case 3:
      case 4:
        an.a(paramString, 100, 1, 0, 0L, "");
        this.sAu.a(paramString);
        AppMethodBeat.o(65453);
        break;
      case 10:
        an.a(paramString, 100, 5, 0, 0L, "");
        this.sAu.m(paramString.cJb, paramString.extInfo, paramString.xgz);
        AppMethodBeat.o(65453);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.b.1
 * JD-Core Version:    0.6.2
 */