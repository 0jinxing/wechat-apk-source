package com.tencent.mm.plugin.qqmail;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.at;
import com.tencent.mm.plugin.qqmail.b.ac;
import com.tencent.mm.pluginsdk.b.b;
import com.tencent.mm.pluginsdk.b.c;
import com.tencent.mm.pluginsdk.o;

public final class Plugin
  implements c
{
  private a ptm;

  public Plugin()
  {
    AppMethodBeat.i(67898);
    this.ptm = new a();
    AppMethodBeat.o(67898);
  }

  public final o createApplication()
  {
    AppMethodBeat.i(67899);
    com.tencent.mm.plugin.qqmail.a.a locala = new com.tencent.mm.plugin.qqmail.a.a();
    AppMethodBeat.o(67899);
    return locala;
  }

  public final at createSubCore()
  {
    AppMethodBeat.i(67900);
    ac localac = new ac();
    AppMethodBeat.o(67900);
    return localac;
  }

  public final b getContactWidgetFactory()
  {
    return this.ptm;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.qqmail.Plugin
 * JD-Core Version:    0.6.2
 */