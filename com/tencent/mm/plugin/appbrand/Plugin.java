package com.tencent.mm.plugin.appbrand;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.at;
import com.tencent.mm.plugin.appbrand.app.f;
import com.tencent.mm.pluginsdk.b.b;
import com.tencent.mm.pluginsdk.b.c;
import com.tencent.mm.pluginsdk.o;

@Deprecated
public final class Plugin
  implements c
{
  public final o createApplication()
  {
    return null;
  }

  public final at createSubCore()
  {
    AppMethodBeat.i(129143);
    f localf = new f();
    AppMethodBeat.o(129143);
    return localf;
  }

  public final b getContactWidgetFactory()
  {
    return null;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.Plugin
 * JD-Core Version:    0.6.2
 */