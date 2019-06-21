package com.tencent.mm.plugin.appbrand.appstorage;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.File;
import java.io.FileFilter;

final class LuggageLocalFileObjectManager$2
  implements FileFilter
{
  LuggageLocalFileObjectManager$2(LuggageLocalFileObjectManager paramLuggageLocalFileObjectManager)
  {
  }

  public final boolean accept(File paramFile)
  {
    AppMethodBeat.i(105418);
    boolean bool;
    if ((paramFile.exists()) && (!paramFile.isDirectory()) && (!bo.isNullOrNil(paramFile.getName())) && (paramFile.getName().startsWith("tmp_")))
    {
      bool = true;
      AppMethodBeat.o(105418);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(105418);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appstorage.LuggageLocalFileObjectManager.2
 * JD-Core Version:    0.6.2
 */