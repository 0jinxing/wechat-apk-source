package com.tencent.mm.plugin.webview.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.al;

public final class b
{
  public volatile al ulH;
  aq ulI;

  public b(aq paramaq)
  {
    AppMethodBeat.i(6569);
    this.ulH = new al("WebviewWorkerThread");
    this.ulI = paramaq;
    AppMethodBeat.o(6569);
  }

  public final al aNS()
  {
    AppMethodBeat.i(6570);
    if (this.ulH == null)
      this.ulH = new al("WebviewWorkerThread");
    al localal = this.ulH;
    AppMethodBeat.o(6570);
    return localal;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.model.b
 * JD-Core Version:    0.6.2
 */