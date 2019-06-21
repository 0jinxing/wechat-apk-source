package com.tencent.mm.plugin.appbrand.jsapi.version;

import com.tencent.luggage.sdk.config.AppBrandInitConfigLU;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ipcinvoker.c;
import com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC;
import com.tencent.mm.plugin.appbrand.launching.d.a;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.sdk.platformtools.ab;

final class JsApiUpdateApp$a$1
  implements d.a
{
  JsApiUpdateApp$a$1(JsApiUpdateApp.a parama, JsApiUpdateApp.SyncRequest paramSyncRequest, c paramc)
  {
  }

  public final void a(AppBrandInitConfigLU paramAppBrandInitConfigLU, AppBrandStatObject paramAppBrandStatObject, int paramInt)
  {
    AppMethodBeat.i(138129);
    switch (paramInt)
    {
    default:
      ab.e("MicroMsg.AppBrand.JsApiUpdateApp", "IpcSyncAttr appId[%s] scene[%d] invalid result[%d]", new Object[] { JsApiUpdateApp.SyncRequest.a(this.hXZ).appId, Integer.valueOf(JsApiUpdateApp.SyncRequest.b(this.hXZ).scene), Integer.valueOf(paramInt) });
      this.eFW.ao(new JsApiUpdateApp.SyncResult(false, null));
      AppMethodBeat.o(138129);
    case 2:
    case 1:
    }
    while (true)
    {
      return;
      ab.e("MicroMsg.AppBrand.JsApiUpdateApp", "IpcSyncAttr appId[%s] scene[%d] failed", new Object[] { JsApiUpdateApp.SyncRequest.a(this.hXZ).appId, Integer.valueOf(JsApiUpdateApp.SyncRequest.b(this.hXZ).scene) });
      this.eFW.ao(new JsApiUpdateApp.SyncResult(false, null));
      AppMethodBeat.o(138129);
      continue;
      ab.i("MicroMsg.AppBrand.JsApiUpdateApp", "IpcSyncAttr appId[%s] scene[%d] succeed", new Object[] { JsApiUpdateApp.SyncRequest.a(this.hXZ).appId, Integer.valueOf(JsApiUpdateApp.SyncRequest.b(this.hXZ).scene) });
      this.eFW.ao(new JsApiUpdateApp.SyncResult(true, (AppBrandInitConfigWC)paramAppBrandInitConfigLU));
      AppMethodBeat.o(138129);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.version.JsApiUpdateApp.a.1
 * JD-Core Version:    0.6.2
 */