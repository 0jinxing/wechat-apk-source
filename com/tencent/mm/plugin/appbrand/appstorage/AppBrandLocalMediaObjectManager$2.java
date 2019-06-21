package com.tencent.mm.plugin.appbrand.appstorage;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.File;
import java.io.FileFilter;

final class AppBrandLocalMediaObjectManager$2
  implements FileFilter
{
  public final boolean accept(File paramFile)
  {
    AppMethodBeat.i(105343);
    boolean bool;
    if ((paramFile.exists()) && (!paramFile.isDirectory()) && (!bo.isNullOrNil(paramFile.getName())) && (paramFile.getName().startsWith("tmp_")))
    {
      bool = true;
      AppMethodBeat.o(105343);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(105343);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalMediaObjectManager.2
 * JD-Core Version:    0.6.2
 */