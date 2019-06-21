package com.tencent.mm.plugin.appbrand.appstorage;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.File;
import java.io.FileFilter;

final class LuggageLocalFileObjectManager$1
  implements FileFilter
{
  LuggageLocalFileObjectManager$1(LuggageLocalFileObjectManager paramLuggageLocalFileObjectManager)
  {
  }

  public final boolean accept(File paramFile)
  {
    AppMethodBeat.i(105417);
    boolean bool;
    if ((paramFile.exists()) && (!paramFile.isDirectory()) && (!bo.isNullOrNil(paramFile.getName())) && (paramFile.getName().startsWith("store_")))
    {
      bool = true;
      AppMethodBeat.o(105417);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(105417);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appstorage.LuggageLocalFileObjectManager.1
 * JD-Core Version:    0.6.2
 */