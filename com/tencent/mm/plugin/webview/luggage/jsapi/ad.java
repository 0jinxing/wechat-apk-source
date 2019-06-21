package com.tencent.mm.plugin.webview.luggage.jsapi;

import android.content.Context;
import com.tencent.luggage.d.a;
import com.tencent.luggage.d.a.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ipcinvoker.wx_extension.b;
import com.tencent.mm.plugin.webview.luggage.d;
import com.tencent.mm.plugin.webview.luggage.q;
import com.tencent.mm.protocal.protobuf.awa;
import com.tencent.mm.protocal.protobuf.awb;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.LinkedList;

public class ad extends bd<d>
{
  public final void a(Context paramContext, String paramString, bc.a parama)
  {
  }

  public final void b(a<d>.a parama)
  {
    AppMethodBeat.i(6336);
    ab.i("MicroMsg.JsApiLogin", "invoke");
    LinkedList localLinkedList = new LinkedList();
    String str = ((d)parama.bOZ).uij.getAppId();
    if (bo.isNullOrNil(str))
    {
      ab.e("MicroMsg.JsApiLogin", "appId is null!");
      parama.a("fail", null);
      AppMethodBeat.o(6336);
    }
    while (true)
    {
      return;
      b.a locala = new b.a();
      awa localawa = new awa();
      locala.fsJ = localawa;
      locala.fsK = new awb();
      locala.uri = "/cgi-bin/mmbiz-bin/js-login";
      locala.fsI = 1029;
      locala.fsL = 0;
      locala.fsM = 0;
      localawa.fKh = str;
      localawa.wzD = localLinkedList;
      localawa.wzM = 0;
      localawa.Url = "";
      localawa.wzN = "";
      localawa.wzF = 0;
      b.a(locala.acD(), new ad.1(this, parama, str));
      AppMethodBeat.o(6336);
    }
  }

  public final int biG()
  {
    return 0;
  }

  public final String name()
  {
    return "login";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.luggage.jsapi.ad
 * JD-Core Version:    0.6.2
 */