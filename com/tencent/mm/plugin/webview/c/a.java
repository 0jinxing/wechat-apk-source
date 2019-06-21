package com.tencent.mm.plugin.webview.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.platformtools.aa;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.h;
import com.tencent.mm.protocal.protobuf.buz;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Map;

public final class a
  implements f
{
  a.a ueQ;
  private c ueR;

  public a()
  {
    AppMethodBeat.i(5653);
    this.ueQ = new a.a(this, (byte)0);
    this.ueR = new a.1(this);
    com.tencent.mm.sdk.b.a.xxA.c(this.ueR);
    AppMethodBeat.o(5653);
  }

  public static String t(Map<String, Object> paramMap, String paramString)
  {
    AppMethodBeat.i(5656);
    if (paramMap.containsKey(paramString))
      if (paramMap.get(paramString) != null)
      {
        paramMap = paramMap.get(paramString).toString();
        AppMethodBeat.o(5656);
      }
    while (true)
    {
      return paramMap;
      paramMap = "";
      AppMethodBeat.o(5656);
      continue;
      paramMap = "";
      AppMethodBeat.o(5656);
    }
  }

  public static int v(Map<String, Object> paramMap, String paramString)
  {
    AppMethodBeat.i(5657);
    paramMap = t(paramMap, paramString);
    int i;
    if (bo.isNullOrNil(paramMap))
    {
      i = 0;
      AppMethodBeat.o(5657);
    }
    while (true)
    {
      return i;
      i = Integer.valueOf(paramMap).intValue();
      AppMethodBeat.o(5657);
    }
  }

  public final boolean ar(Map<String, Object> paramMap)
  {
    AppMethodBeat.i(5654);
    ab.i("MicroMsg.emoji.EmojiStoreWebViewLogic", "getSearchEmotionData: %s", new Object[] { paramMap.toString() });
    String str1 = t(paramMap, "keyword");
    String str2 = t(paramMap, "nextPageBuffer");
    int i = v(paramMap, "type");
    int j = v(paramMap, "webview_instance_id");
    paramMap = t(paramMap, "searchID");
    if (bo.isNullOrNil(paramMap));
    for (long l = 0L; ; l = Long.valueOf(paramMap).longValue())
    {
      this.ueQ.a(i, str1, str2, j, l);
      AppMethodBeat.o(5654);
      return false;
    }
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(5655);
    if ((paramm instanceof b))
    {
      com.tencent.mm.kernel.g.Rg().b(234, this);
      this.ueQ.isRunning = false;
      paramm = (b)paramm;
      if ((paramInt1 == 0) && (paramInt2 == 0))
        break label136;
      this.ueQ.cxT = false;
      h.JR(paramm.ueW).a("{}", paramm.ueX, "", 0L);
    }
    while (true)
    {
      String str = paramm.cWk().wWr;
      paramString = aa.b(paramm.cWk().wok);
      long l = paramm.cWk().won;
      h.JR(paramm.ueW).a(str, paramm.ueX, paramString, l);
      AppMethodBeat.o(5655);
      return;
      label136: this.ueQ.cxT = true;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.c.a
 * JD-Core Version:    0.6.2
 */