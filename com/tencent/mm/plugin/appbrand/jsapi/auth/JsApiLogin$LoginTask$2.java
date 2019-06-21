package com.tencent.mm.plugin.appbrand.jsapi.auth;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.h;
import com.tencent.mm.plugin.appbrand.widget.b.c;
import com.tencent.mm.plugin.appbrand.widget.b.k;
import java.util.LinkedList;

final class JsApiLogin$LoginTask$2
  implements Runnable
{
  JsApiLogin$LoginTask$2(JsApiLogin.LoginTask paramLoginTask, LinkedList paramLinkedList)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(130858);
    JsApiLogin.LoginTask.2.1 local1 = new JsApiLogin.LoginTask.2.1(this);
    this.hCl.hBR.asF().b(new c(f.a(this.hCl.hBR), f.x(this.hCi), this.hCl.mAppName, this.hCl.hBX, local1));
    AppMethodBeat.o(130858);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiLogin.LoginTask.2
 * JD-Core Version:    0.6.2
 */