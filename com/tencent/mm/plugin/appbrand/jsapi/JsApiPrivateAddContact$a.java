package com.tencent.mm.plugin.appbrand.jsapi;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask.ProcessRequest;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask.ProcessResult;
import com.tencent.mm.pluginsdk.ui.applet.n;
import com.tencent.mm.pluginsdk.ui.applet.o;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;

final class JsApiPrivateAddContact$a extends AppBrandProxyUIProcessTask
{
  public final void a(AppBrandProxyUIProcessTask.ProcessRequest paramProcessRequest)
  {
    boolean bool = true;
    AppMethodBeat.i(73167);
    Object localObject = new JsApiPrivateAddContact.AddContactResult();
    if (!(paramProcessRequest instanceof JsApiPrivateAddContact.AddContactRequest))
    {
      ab.w("MicroMsg.JsApiPrivateAddContact", "handleRequest !(request instanceof AddContactRequest)");
      JsApiPrivateAddContact.AddContactResult.a((JsApiPrivateAddContact.AddContactResult)localObject, -1);
      a((AppBrandProxyUIProcessTask.ProcessResult)localObject);
      AppMethodBeat.o(73167);
      return;
    }
    JsApiPrivateAddContact.AddContactRequest localAddContactRequest = (JsApiPrivateAddContact.AddContactRequest)paramProcessRequest;
    paramProcessRequest = (com.tencent.mm.pluginsdk.g)com.tencent.mm.kernel.g.K(com.tencent.mm.pluginsdk.g.class);
    MMActivity localMMActivity = aBQ();
    String str = localAddContactRequest.userName;
    int i = localAddContactRequest.scene;
    localObject = new JsApiPrivateAddContact.a.1(this, (JsApiPrivateAddContact.AddContactResult)localObject);
    if (localAddContactRequest.hyy == 1);
    while (true)
    {
      paramProcessRequest.a(localMMActivity, str, i, (n)localObject, bool, "").show();
      AppMethodBeat.o(73167);
      break;
      bool = false;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.JsApiPrivateAddContact.a
 * JD-Core Version:    0.6.2
 */