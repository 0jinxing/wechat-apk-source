package com.tencent.mm.plugin.notification;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.at;
import com.tencent.mm.plugin.notification.d.f;
import com.tencent.mm.pluginsdk.b.b;
import com.tencent.mm.pluginsdk.b.c;
import com.tencent.mm.pluginsdk.o;

public class Plugin
  implements c
{
  a oVv;

  public Plugin()
  {
    AppMethodBeat.i(23097);
    this.oVv = new a();
    AppMethodBeat.o(23097);
  }

  public o createApplication()
  {
    return this.oVv;
  }

  public at createSubCore()
  {
    AppMethodBeat.i(23098);
    f localf = f.bWP();
    AppMethodBeat.o(23098);
    return localf;
  }

  public b getContactWidgetFactory()
  {
    return null;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.notification.Plugin
 * JD-Core Version:    0.6.2
 */