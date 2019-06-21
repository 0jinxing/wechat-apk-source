package com.tencent.mm.plugin.webview.luggage.jsapi;

import android.content.Context;
import com.tencent.luggage.bridge.k;
import com.tencent.luggage.d.a;
import com.tencent.luggage.d.a.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ipcinvoker.wx_extension.b;
import com.tencent.mm.plugin.webview.luggage.d;
import com.tencent.mm.plugin.webview.luggage.q;
import com.tencent.mm.protocal.protobuf.avw;
import com.tencent.mm.protocal.protobuf.avx;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.LinkedList;
import org.json.JSONArray;
import org.json.JSONObject;

public class c extends bd<d>
{
  public final void a(Context paramContext, String paramString, bc.a parama)
  {
  }

  public final void b(a<d>.a parama)
  {
    AppMethodBeat.i(6281);
    ab.i("MicroMsg.JsApiAuthorize", "invokeInOwn");
    Object localObject = parama.bPa.bOf.optJSONArray("scope");
    if (localObject == null)
    {
      ab.e("MicroMsg.JsApiAuthorize", "scope is null!");
      parama.a("fail", null);
      AppMethodBeat.o(6281);
    }
    while (true)
    {
      return;
      String str = ((d)parama.bOZ).uij.getAppId();
      if (bo.isNullOrNil(str))
      {
        ab.e("MicroMsg.JsApiAuthorize", "appId is null!");
        parama.a("fail", null);
        AppMethodBeat.o(6281);
      }
      else
      {
        LinkedList localLinkedList = new LinkedList();
        for (int i = 0; i < ((JSONArray)localObject).length(); i++)
          localLinkedList.add(((JSONArray)localObject).optString(i));
        localObject = new b.a();
        avw localavw = new avw();
        ((b.a)localObject).fsJ = localavw;
        ((b.a)localObject).fsK = new avx();
        ((b.a)localObject).uri = "/cgi-bin/mmbiz-bin/js-authorize";
        ((b.a)localObject).fsI = 1157;
        ((b.a)localObject).fsL = 0;
        ((b.a)localObject).fsM = 0;
        localavw.fKh = str;
        localavw.wzD = localLinkedList;
        localavw.wzF = 0;
        b.a(((b.a)localObject).acD(), new c.1(this, parama, str));
        AppMethodBeat.o(6281);
      }
    }
  }

  public final int biG()
  {
    return 0;
  }

  public final String name()
  {
    return "authorize";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.luggage.jsapi.c
 * JD-Core Version:    0.6.2
 */