package com.tencent.mm.plugin.clean;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.at;
import com.tencent.mm.plugin.clean.a.a;
import com.tencent.mm.plugin.clean.c.j;
import com.tencent.mm.pluginsdk.b.b;
import com.tencent.mm.pluginsdk.b.c;
import com.tencent.mm.pluginsdk.o;

public class Plugin
  implements c
{
  public o createApplication()
  {
    AppMethodBeat.i(18650);
    a locala = new a();
    AppMethodBeat.o(18650);
    return locala;
  }

  public at createSubCore()
  {
    AppMethodBeat.i(18651);
    j localj = j.bgd();
    AppMethodBeat.o(18651);
    return localj;
  }

  public b getContactWidgetFactory()
  {
    return null;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.clean.Plugin
 * JD-Core Version:    0.6.2
 */