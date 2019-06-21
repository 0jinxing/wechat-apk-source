package com.tencent.mm.plugin.webview.model;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.e.a;
import com.tencent.mm.plugin.webview.stub.d;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.ArrayList;

final class af$c$4$1$1
  implements Runnable
{
  af$c$4$1$1(af.c.4.1 param1, int paramInt)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(6664);
    Object localObject1;
    if (this.rcK == 1)
    {
      this.umo.umn.umg.goBack();
      localObject1 = a.uKJ;
      if (this.umo.umn.umh == null)
      {
        localObject1 = "";
        a.a((String)localObject1, this.umo.umn.fEG, 0, 1, 0, 1, this.umo.umn.crd);
        AppMethodBeat.o(6664);
      }
    }
    while (true)
    {
      return;
      localObject1 = this.umo.umn.umh;
      break;
      localObject1 = a.uKJ;
      if (this.umo.umn.umh == null);
      Bundle localBundle;
      for (localObject1 = ""; ; localObject1 = this.umo.umn.umh)
      {
        a.a((String)localObject1, this.umo.umn.fEG, 1, 1, 0, 1, this.umo.umn.crd);
        localBundle = this.umo.umn.umk;
        localObject2 = this.umo.umm;
        localObject1 = this.umo.umn.umg;
        d locald = this.umo.umn.ulK;
        af.b localb = this.umo.umn.umf;
        int i = this.umo.umn.uml;
        ab.i("MicroMsg.OauthAuthorizeLogic", "doAcceptLogic");
        if (!localBundle.getBoolean("is_call_server_when_confirm"))
          break label277;
        af.c.a(locald, localBundle.getString("oauth_url"), 1, (ArrayList)((Bundle)localObject2).getSerializable("key_scope"), localb, true, i);
        AppMethodBeat.o(6664);
        break;
      }
      label277: Object localObject2 = localBundle.getString("redirect_url");
      ((af.d)localObject1).aeq((String)localObject2);
      ab.i("MicroMsg.OauthAuthorizeLogic", "doAcceptLogic redirectUrl: %s", new Object[] { localObject2 });
      AppMethodBeat.o(6664);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.model.af.c.4.1.1
 * JD-Core Version:    0.6.2
 */