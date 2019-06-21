package com.tencent.mapsdk.raster.model;

import com.tencent.matrix.trace.core.AppMethodBeat;

public enum Language
{
  static
  {
    AppMethodBeat.i(101190);
    zh = new Language("zh", 0);
    en = new Language("en", 1);
    $VALUES = new Language[] { zh, en };
    AppMethodBeat.o(101190);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mapsdk.raster.model.Language
 * JD-Core Version:    0.6.2
 */