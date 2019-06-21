package com.tencent.mm.plugin.webview.modeltools;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.protocal.protobuf.yu;
import com.tencent.mm.protocal.protobuf.yv;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import org.json.JSONObject;

final class k$1$2
  implements Runnable
{
  k$1$2(k.1 param1, String paramString)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(7027);
    try
    {
      localObject1 = this.upB.substring(1, this.upB.length() - 1).replace("\\\"", "\"");
      Object localObject2 = new org/json/JSONObject;
      ((JSONObject)localObject2).<init>((String)localObject1);
      localObject2 = ((JSONObject)localObject2).optString("data");
      if (bo.isNullOrNil((String)localObject2))
      {
        ab.i("MicroMsg.WebViewReportOnLeaveHelper", "invalid reportData");
        AppMethodBeat.o(7027);
        return;
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.w("MicroMsg.WebViewReportOnLeaveHelper", "reportOnLeave, ex = %s", new Object[] { localException.getMessage() });
        Object localObject3 = null;
        continue;
        ab.i("MicroMsg.WebViewReportOnLeaveHelper", "reportOnLeave reportData size=%d", new Object[] { Integer.valueOf(localObject3.length()) });
        Object localObject1 = new b.a();
        ((b.a)localObject1).fsJ = new yu();
        ((b.a)localObject1).fsK = new yv();
        ((b.a)localObject1).uri = "/cgi-bin/mmbiz-bin/exitreport";
        ((b.a)localObject1).fsI = 1642;
        localObject1 = ((b.a)localObject1).acD();
        ((yu)((com.tencent.mm.ai.b)localObject1).fsG.fsP).wet = localObject3;
        com.tencent.mm.ipcinvoker.wx_extension.b.a((com.tencent.mm.ai.b)localObject1, new k.2());
        AppMethodBeat.o(7027);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.modeltools.k.1.2
 * JD-Core Version:    0.6.2
 */