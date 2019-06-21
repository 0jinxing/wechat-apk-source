package com.tencent.mm.plugin.webview.luggage.jsapi;

import android.os.Bundle;
import com.tencent.luggage.d.a.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.bt.a;
import com.tencent.mm.ipcinvoker.wx_extension.b;
import com.tencent.mm.plugin.webview.ui.tools.widget.n.a;
import com.tencent.mm.protocal.protobuf.avu;
import com.tencent.mm.protocal.protobuf.avv;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

final class c$1$1$1
  implements n.a
{
  c$1$1$1(c.1.1 param1)
  {
  }

  public final void f(int paramInt, Bundle paramBundle)
  {
    AppMethodBeat.i(6277);
    ab.i("MicroMsg.JsApiAuthorize", "stev onRevMsg resultCode %d", new Object[] { Integer.valueOf(paramInt) });
    switch (paramInt)
    {
    default:
      ab.d("MicroMsg.JsApiAuthorize", "press back button!");
      this.ujV.ujU.mUf.a("auth_cancel", null);
      AppMethodBeat.o(6277);
    case 1:
    case 2:
    }
    while (true)
    {
      return;
      c localc = this.ujV.ujU.ujR;
      String str = this.ujV.ujU.val$appId;
      a.a locala = this.ujV.ujU.mUf;
      Object localObject = (ArrayList)paramBundle.getSerializable("key_scope");
      paramBundle = new LinkedList();
      localObject = ((ArrayList)localObject).iterator();
      while (((Iterator)localObject).hasNext())
        paramBundle.add((String)((Iterator)localObject).next());
      b.a locala1 = new b.a();
      localObject = new avu();
      locala1.fsJ = ((a)localObject);
      locala1.fsK = new avv();
      locala1.uri = "/cgi-bin/mmbiz-bin/js-authorize-confirm";
      locala1.fsI = 1158;
      locala1.fsL = 0;
      locala1.fsM = 0;
      ((avu)localObject).fKh = str;
      ((avu)localObject).wzD = paramBundle;
      ((avu)localObject).wzF = 0;
      ((avu)localObject).wzE = paramInt;
      b.a(locala1.acD(), new c.2(localc, locala, paramInt));
      if (paramInt != 2)
        break;
      this.ujV.ujU.mUf.a("auth_deny", null);
      AppMethodBeat.o(6277);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.luggage.jsapi.c.1.1.1
 * JD-Core Version:    0.6.2
 */