package com.tencent.mm.plugin.favorite;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.at;
import com.tencent.mm.pluginsdk.b.c;
import com.tencent.mm.pluginsdk.o;

public class Plugin
  implements c
{
  public o createApplication()
  {
    AppMethodBeat.i(20533);
    b localb = new b();
    AppMethodBeat.o(20533);
    return localb;
  }

  public at createSubCore()
  {
    AppMethodBeat.i(20534);
    f localf = new f();
    AppMethodBeat.o(20534);
    return localf;
  }

  public com.tencent.mm.pluginsdk.b.b getContactWidgetFactory()
  {
    return null;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.favorite.Plugin
 * JD-Core Version:    0.6.2
 */