package com.tencent.smtt.sdk;

import com.tencent.matrix.trace.core.AppMethodBeat;

public enum WebSettings$PluginState
{
  static
  {
    AppMethodBeat.i(64714);
    ON = new PluginState("ON", 0);
    ON_DEMAND = new PluginState("ON_DEMAND", 1);
    OFF = new PluginState("OFF", 2);
    $VALUES = new PluginState[] { ON, ON_DEMAND, OFF };
    AppMethodBeat.o(64714);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.smtt.sdk.WebSettings.PluginState
 * JD-Core Version:    0.6.2
 */