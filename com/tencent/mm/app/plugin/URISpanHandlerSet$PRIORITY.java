package com.tencent.mm.app.plugin;

import com.tencent.matrix.trace.core.AppMethodBeat;

 enum URISpanHandlerSet$PRIORITY
{
  static
  {
    AppMethodBeat.i(15680);
    LOW = new PRIORITY("LOW", 0);
    NORMAL = new PRIORITY("NORMAL", 1);
    HIGH = new PRIORITY("HIGH", 2);
    $VALUES = new PRIORITY[] { LOW, NORMAL, HIGH };
    AppMethodBeat.o(15680);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.app.plugin.URISpanHandlerSet.PRIORITY
 * JD-Core Version:    0.6.2
 */