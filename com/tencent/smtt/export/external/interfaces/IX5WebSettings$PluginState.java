package com.tencent.smtt.export.external.interfaces;

import com.tencent.matrix.trace.core.AppMethodBeat;

public enum IX5WebSettings$PluginState
{
  static
  {
    AppMethodBeat.i(63806);
    ON = new PluginState("ON", 0);
    ON_DEMAND = new PluginState("ON_DEMAND", 1);
    OFF = new PluginState("OFF", 2);
    $VALUES = new PluginState[] { ON, ON_DEMAND, OFF };
    AppMethodBeat.o(63806);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.smtt.export.external.interfaces.IX5WebSettings.PluginState
 * JD-Core Version:    0.6.2
 */