package com.tencent.mm.plugin.mall;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.at;
import com.tencent.mm.plugin.mall.a.j;
import com.tencent.mm.pluginsdk.b.b;
import com.tencent.mm.pluginsdk.b.c;
import com.tencent.mm.pluginsdk.o;

public class Plugin
  implements c
{
  public o createApplication()
  {
    return null;
  }

  public at createSubCore()
  {
    AppMethodBeat.i(43091);
    j localj = new j();
    AppMethodBeat.o(43091);
    return localj;
  }

  public b getContactWidgetFactory()
  {
    return null;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mall.Plugin
 * JD-Core Version:    0.6.2
 */