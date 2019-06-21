package com.tencent.mm.plugin.appbrand.dynamic.e;

import android.webkit.ValueCallback;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.h.c;
import com.tencent.mm.plugin.appbrand.h.r;
import com.tencent.mm.z.b.d;

public final class a
  implements d
{
  public c hoa;

  public a(Object paramObject)
  {
    AppMethodBeat.i(10902);
    this.hoa = new c();
    this.hoa.addJavascriptInterface(paramObject, "WeixinJSCore");
    AppMethodBeat.o(10902);
  }

  public final void cleanup()
  {
    AppMethodBeat.i(10904);
    if (this.hoa != null)
      this.hoa.destroy();
    AppMethodBeat.o(10904);
  }

  public final void evaluateJavascript(String paramString, ValueCallback<String> paramValueCallback)
  {
    AppMethodBeat.i(10903);
    if (this.hoa != null)
      this.hoa.evaluateJavascript(paramString, paramValueCallback);
    AppMethodBeat.o(10903);
  }

  public final void pause()
  {
    AppMethodBeat.i(10905);
    if (this.hoa != null)
      ((r)this.hoa.af(r.class)).pause();
    AppMethodBeat.o(10905);
  }

  public final void resume()
  {
    AppMethodBeat.i(10906);
    if (this.hoa != null)
      ((r)this.hoa.af(r.class)).resume();
    AppMethodBeat.o(10906);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.dynamic.e.a
 * JD-Core Version:    0.6.2
 */