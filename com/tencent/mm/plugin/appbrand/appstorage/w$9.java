package com.tencent.mm.plugin.appbrand.appstorage;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.File;
import java.util.LinkedList;
import java.util.regex.Pattern;

final class w$9
  implements w.a
{
  w$9(w paramw)
  {
  }

  public final j a(File paramFile, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(105448);
    if (!paramFile.isDirectory())
    {
      paramFile = j.gXI;
      AppMethodBeat.o(105448);
    }
    while (true)
    {
      return paramFile;
      if (l.F(paramFile))
      {
        paramFile = j.gXK;
        AppMethodBeat.o(105448);
      }
      else
      {
        LinkedList localLinkedList = new LinkedList();
        paramFile.listFiles(new w.9.1(this, Pattern.quote(paramFile.getAbsolutePath()), localLinkedList));
        ((com.tencent.mm.plugin.appbrand.r.j)paramArrayOfObject[0]).value = localLinkedList;
        paramFile = j.gXA;
        AppMethodBeat.o(105448);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appstorage.w.9
 * JD-Core Version:    0.6.2
 */