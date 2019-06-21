package com.tencent.mm.plugin.webview.luggage.jsapi;

import android.content.Context;
import com.tencent.luggage.bridge.k;
import com.tencent.luggage.d.a;
import com.tencent.luggage.d.a.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.plugin.webview.luggage.d;
import com.tencent.mm.plugin.webview.ui.tools.game.g;
import com.tencent.mm.protocal.protobuf.avo;
import com.tencent.mm.protocal.protobuf.avp;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.LinkedList;
import org.json.JSONArray;
import org.json.JSONObject;

public class ai extends bd<d>
{
  public final void a(Context paramContext, String paramString, bc.a parama)
  {
  }

  public final void b(a<d>.a parama)
  {
    AppMethodBeat.i(6346);
    ab.i("MicroMsg.JsApiPreVerify", "invokeInOwn");
    g.aF(((d)parama.bOZ).cWL(), System.currentTimeMillis());
    Object localObject1 = parama.bPa.bOf;
    String str1 = ((JSONObject)localObject1).optString("verifyAppId");
    String str2 = ((JSONObject)localObject1).optString("verifySignature");
    String str3 = ((JSONObject)localObject1).optString("verifyNonceStr");
    String str4 = ((JSONObject)localObject1).optString("verifyTimestamp");
    String str5 = ((JSONObject)localObject1).optString("verifySignType");
    Object localObject2 = ((JSONObject)localObject1).optJSONArray("verifyJsApiList");
    ab.i("MicroMsg.JsApiPreVerify", "appid : %s, %s, %s, %s, %s", new Object[] { str1, str2, str3, str4, str5 });
    localObject1 = ((d)parama.bOZ).getUrl();
    LinkedList localLinkedList = new LinkedList();
    try
    {
      ab.i("MicroMsg.JsApiPreVerify", "jsItem length %s", new Object[] { Integer.valueOf(((JSONArray)localObject2).length()) });
      if (((JSONArray)localObject2).length() == 0)
      {
        parama.a("checkJsApi:param is empty", null);
        AppMethodBeat.o(6346);
        return;
      }
      for (int i = 0; i < ((JSONArray)localObject2).length(); i++)
      {
        localObject3 = ((JSONArray)localObject2).getString(i);
        if (!bo.isNullOrNil((String)localObject3))
          localLinkedList.add(localObject3);
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        Object localObject3;
        ab.w("MicroMsg.JsApiPreVerify", "exception occur " + localException.getMessage());
        parama.a("", null);
        AppMethodBeat.o(6346);
        continue;
        if ((bo.isNullOrNil(str1)) || (localLinkedList.size() <= 0) || (bo.isNullOrNil((String)localObject1)))
        {
          ab.e("MicroMsg.JsApiPreVerify", "handlePreVerify wrong args, %s", new Object[] { str1 });
          parama.a("pre_verify_jsapi:fail_invalid_args", null);
          AppMethodBeat.o(6346);
        }
        else
        {
          localObject3 = new b.a();
          ((b.a)localObject3).fsJ = new avo();
          ((b.a)localObject3).fsK = new avp();
          ((b.a)localObject3).uri = "/cgi-bin/mmbiz-bin/jsapi-preverify";
          ((b.a)localObject3).fsI = 1093;
          ((b.a)localObject3).fsL = 0;
          ((b.a)localObject3).fsM = 0;
          localObject2 = ((b.a)localObject3).acD();
          localObject3 = (avo)((com.tencent.mm.ai.b)localObject2).fsG.fsP;
          ((avo)localObject3).url = ((String)localObject1);
          ((avo)localObject3).csB = str1;
          ((avo)localObject3).wzx = localLinkedList;
          ((avo)localObject3).cvO = str4;
          ((avo)localObject3).wzf = localException;
          ((avo)localObject3).signature = str2;
          ((avo)localObject3).wzg = str5;
          com.tencent.mm.ipcinvoker.wx_extension.b.a((com.tencent.mm.ai.b)localObject2, new ai.a(parama, str1));
          AppMethodBeat.o(6346);
        }
      }
    }
  }

  public final int biG()
  {
    return 0;
  }

  public final String name()
  {
    return "preVerifyJSAPI";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.luggage.jsapi.ai
 * JD-Core Version:    0.6.2
 */