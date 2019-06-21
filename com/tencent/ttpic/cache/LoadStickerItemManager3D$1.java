package com.tencent.ttpic.cache;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.File;
import java.io.FilenameFilter;

class LoadStickerItemManager3D$1
  implements FilenameFilter
{
  LoadStickerItemManager3D$1(LoadStickerItemManager3D paramLoadStickerItemManager3D)
  {
  }

  public boolean accept(File paramFile, String paramString)
  {
    AppMethodBeat.i(81819);
    boolean bool;
    if ((paramString.endsWith(".png")) || (paramString.endsWith(".jpg")))
    {
      bool = true;
      AppMethodBeat.o(81819);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(81819);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.cache.LoadStickerItemManager3D.1
 * JD-Core Version:    0.6.2
 */