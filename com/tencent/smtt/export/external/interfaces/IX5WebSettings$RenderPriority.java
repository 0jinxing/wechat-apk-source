package com.tencent.smtt.export.external.interfaces;

import com.tencent.matrix.trace.core.AppMethodBeat;

public enum IX5WebSettings$RenderPriority
{
  static
  {
    AppMethodBeat.i(63809);
    NORMAL = new RenderPriority("NORMAL", 0);
    HIGH = new RenderPriority("HIGH", 1);
    LOW = new RenderPriority("LOW", 2);
    $VALUES = new RenderPriority[] { NORMAL, HIGH, LOW };
    AppMethodBeat.o(63809);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.smtt.export.external.interfaces.IX5WebSettings.RenderPriority
 * JD-Core Version:    0.6.2
 */