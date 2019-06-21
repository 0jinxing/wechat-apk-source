package com.tencent.mm.plugin.remittance;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.at;
import com.tencent.mm.pluginsdk.b.b;
import com.tencent.mm.pluginsdk.o;

public final class Plugin
  implements com.tencent.mm.pluginsdk.b.c
{
  public final o createApplication()
  {
    return null;
  }

  public final at createSubCore()
  {
    AppMethodBeat.i(44421);
    com.tencent.mm.plugin.remittance.a.c localc = new com.tencent.mm.plugin.remittance.a.c();
    AppMethodBeat.o(44421);
    return localc;
  }

  public final b getContactWidgetFactory()
  {
    return null;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.Plugin
 * JD-Core Version:    0.6.2
 */