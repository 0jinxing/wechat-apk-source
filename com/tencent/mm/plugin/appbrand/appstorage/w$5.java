package com.tencent.mm.plugin.appbrand.appstorage;

import com.tencent.luggage.g.d;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.File;

final class w$5
  implements w.a
{
  w$5(w paramw)
  {
  }

  public final j a(File paramFile, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(105443);
    if (l.F(paramFile))
    {
      paramFile = j.gXK;
      AppMethodBeat.o(105443);
    }
    while (true)
    {
      return paramFile;
      if ((paramFile.isFile()) && (paramFile.exists()))
      {
        paramFile = j.gXF;
        AppMethodBeat.o(105443);
      }
      else
      {
        paramArrayOfObject = (File)paramArrayOfObject[0];
        int i = ZipJNI.unzip(paramArrayOfObject.getAbsolutePath(), paramFile.getAbsolutePath(), null);
        d.i("MicroMsg.LuggageNonFlattenedFileSystem", "unzip zipFile(%s) iRet(%d)", new Object[] { paramArrayOfObject.getAbsolutePath(), Integer.valueOf(i) });
        if (i == 0)
        {
          if ((this.gYy.gYk > 0L) && (w.a(this.gYy) > this.gYy.gYk))
          {
            l.E(paramFile);
            paramFile = j.gXN;
            AppMethodBeat.o(105443);
          }
          else
          {
            paramFile = j.gXA;
            AppMethodBeat.o(105443);
          }
        }
        else
          switch (i)
          {
          default:
            paramFile = j.gXB;
            AppMethodBeat.o(105443);
            break;
          case 1:
            paramFile = j.gXE;
            AppMethodBeat.o(105443);
            break;
          case -106:
            paramFile = j.gXM;
            AppMethodBeat.o(105443);
            break;
          case -105:
          case -104:
          case -103:
          case -102:
          case -1:
          case 2:
            paramFile = j.gXL;
            AppMethodBeat.o(105443);
          }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appstorage.w.5
 * JD-Core Version:    0.6.2
 */