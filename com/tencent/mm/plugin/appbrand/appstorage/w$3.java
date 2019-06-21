package com.tencent.mm.plugin.appbrand.appstorage;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.m;
import java.io.File;

final class w$3
  implements w.a
{
  w$3(w paramw)
  {
  }

  public final j a(File paramFile, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(105442);
    File localFile = (File)paramArrayOfObject[0];
    boolean bool = ((Boolean)paramArrayOfObject[1]).booleanValue();
    if (paramFile.isDirectory())
    {
      paramFile = j.gXF;
      AppMethodBeat.o(105442);
    }
    while (true)
    {
      return paramFile;
      if (l.F(paramFile))
      {
        paramFile = j.gXK;
        AppMethodBeat.o(105442);
      }
      else if ((this.gYy.gYk > 0L) && (w.a(this.gYy) + localFile.length() > this.gYy.gYk))
      {
        paramFile = j.gXN;
        AppMethodBeat.o(105442);
      }
      else if (bool)
      {
        if (i.bx(localFile.getAbsolutePath(), paramFile.getAbsolutePath()))
        {
          paramFile = j.gXA;
          AppMethodBeat.o(105442);
        }
        else
        {
          paramFile = j.gXB;
          AppMethodBeat.o(105442);
        }
      }
      else if (m.C(localFile.getAbsolutePath(), paramFile.getAbsolutePath(), false))
      {
        paramFile = j.gXA;
        AppMethodBeat.o(105442);
      }
      else
      {
        paramFile = j.gXB;
        AppMethodBeat.o(105442);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appstorage.w.3
 * JD-Core Version:    0.6.2
 */