package com.tencent.map.lib;

import com.tencent.matrix.trace.core.AppMethodBeat;

public enum MapLanguage
{
  static
  {
    AppMethodBeat.i(97840);
    LAN_CHINESE = new MapLanguage("LAN_CHINESE", 0);
    LAN_ENGLISH = new MapLanguage("LAN_ENGLISH", 1);
    $VALUES = new MapLanguage[] { LAN_CHINESE, LAN_ENGLISH };
    AppMethodBeat.o(97840);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.map.lib.MapLanguage
 * JD-Core Version:    0.6.2
 */