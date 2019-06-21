package com.tencent.mm.plugin.webview.preload;

import android.os.Bundle;
import android.os.RemoteException;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.modelsimple.h;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.i;
import com.tencent.mm.protocal.protobuf.atp;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

final class e$2
  implements f
{
  e$2(String paramString, h paramh, e.a parama, i parami, com.tencent.mm.plugin.webview.stub.e parame)
  {
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(7048);
    g.Rg().b(233, this);
    e.cnb().remove(this.uiF);
    ab.i("MicroMsg.TmplWebViewJsAPi", "[updatePageAuth]errType:%d, errCode:%d errMsg:%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    paramString = this.jTX.aiT();
    if (bo.isNullOrNil(paramString))
    {
      ab.e("MicroMsg.TmplWebViewJsAPi", "[updatePageAuth] fail fullurl is null");
      a.kT(82);
      this.uqe.a(this.uqf, this.uqf.uIJ + ":fail", null);
      AppMethodBeat.o(7048);
      return;
    }
    if ((paramInt1 == 0) && (paramInt2 == 0));
    while (true)
    {
      try
      {
        paramm = new android/os/Bundle;
        paramm.<init>();
        paramm.putString("geta8key_result_req_url", this.jTX.aiU());
        paramm.putString("geta8key_result_full_url", paramString);
        List localList = this.jTX.aja();
        if (!bo.ek(localList))
        {
          Object localObject1 = localList.iterator();
          if (!((Iterator)localObject1).hasNext())
            break label562;
          Object localObject2 = (atp)((Iterator)localObject1).next();
          if ((localObject2 != null) && (!bo.isNullOrNil(((atp)localObject2).vMU)) && (!bo.isNullOrNil(((atp)localObject2).pXM)))
            continue;
          ab.e("MicroMsg.TmplWebViewJsAPi", "http header has null value");
          paramInt1 = 1;
          if (paramInt1 == 0)
          {
            String[] arrayOfString = new String[localList.size()];
            localObject2 = new String[localList.size()];
            paramInt1 = 0;
            if (paramInt1 < localList.size())
            {
              Object localObject3 = (atp)localList.get(paramInt1);
              localObject1 = ((atp)localObject3).vMU;
              localObject3 = ((atp)localObject3).pXM;
              ab.i("MicroMsg.TmplWebViewJsAPi", "http header index = %d, key = %s, value = %s", new Object[] { Integer.valueOf(paramInt1), localObject1, localObject3 });
              arrayOfString[paramInt1] = localObject1;
              localObject2[paramInt1] = localObject3;
              paramInt1++;
              continue;
            }
            paramm.putStringArray("geta8key_result_http_header_key_list", arrayOfString);
            paramm.putStringArray("geta8key_result_http_header_value_list", (String[])localObject2);
          }
        }
        this.uqg.g(90004, paramm);
        paramm = new HashMap();
        paramm.put("fullUrl", paramString);
        ab.i("MicroMsg.TmplWebViewJsAPi", "[updatePageAuth]values:%s", new Object[] { paramm });
        a.kT(81);
        this.uqe.a(this.uqf, this.uqf.uIJ + ":ok", paramm);
        AppMethodBeat.o(7048);
      }
      catch (RemoteException paramm)
      {
        ab.printErrStackTrace("MicroMsg.TmplWebViewJsAPi", paramm, "", new Object[0]);
        continue;
      }
      a.kT(82);
      this.uqe.a(this.uqf, this.uqf.uIJ + ":fail", null);
      AppMethodBeat.o(7048);
      break;
      label562: paramInt1 = 0;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.preload.e.2
 * JD-Core Version:    0.6.2
 */