package com.tencent.mm.plugin.appbrand.jsapi;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ce.a;
import com.tencent.mm.ipcinvoker.wx_extension.b.a;
import com.tencent.mm.plugin.appbrand.q;
import com.tencent.mm.sdk.platformtools.ab;

final class JsApiLaunchApplicationDirectly$1
  implements b.a
{
  JsApiLaunchApplicationDirectly$1(JsApiLaunchApplicationDirectly paramJsApiLaunchApplicationDirectly, q paramq, int paramInt, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, Bundle paramBundle, String paramString7, String paramString8)
  {
  }

  public final void a(int paramInt1, int paramInt2, String paramString, b paramb)
  {
    AppMethodBeat.i(130456);
    ab.i("MicroMsg.JsApiLaunchApplicationDirectly", "on RunCgi callback errType:%d errCode:%d msg:%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    a.post(new JsApiLaunchApplicationDirectly.1.1(this, paramInt1, paramInt2, paramb));
    AppMethodBeat.o(130456);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.JsApiLaunchApplicationDirectly.1
 * JD-Core Version:    0.6.2
 */