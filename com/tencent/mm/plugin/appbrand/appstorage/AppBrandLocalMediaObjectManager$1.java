package com.tencent.mm.plugin.appbrand.appstorage;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.File;
import java.io.FileFilter;

final class AppBrandLocalMediaObjectManager$1
  implements FileFilter
{
  public final boolean accept(File paramFile)
  {
    AppMethodBeat.i(105342);
    boolean bool;
    if ((paramFile.exists()) && (!paramFile.isDirectory()) && (!bo.isNullOrNil(paramFile.getName())) && (paramFile.getName().startsWith("store_")))
    {
      bool = true;
      AppMethodBeat.o(105342);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(105342);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalMediaObjectManager.1
 * JD-Core Version:    0.6.2
 */