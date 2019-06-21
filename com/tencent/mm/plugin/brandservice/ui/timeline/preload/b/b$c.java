package com.tencent.mm.plugin.brandservice.ui.timeline.preload.b;

import a.f.a.m;
import a.f.b.j;
import a.f.b.k;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.File;
import java.util.ArrayList;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"isIncludeFile", "", "Ljava/util/ArrayList;", "", "file", "Ljava/io/File;", "invoke"})
final class b$c extends k
  implements m<ArrayList<String>, File, Boolean>
{
  public static final c jTK;

  static
  {
    AppMethodBeat.i(14985);
    jTK = new c();
    AppMethodBeat.o(14985);
  }

  b$c()
  {
    super(2);
  }

  public static boolean a(ArrayList<String> paramArrayList, File paramFile)
  {
    AppMethodBeat.i(14984);
    j.p(paramArrayList, "receiver$0");
    j.p(paramFile, "file");
    StringBuilder localStringBuilder = new StringBuilder().append(paramFile.getAbsolutePath());
    if (paramFile.isDirectory());
    for (paramFile = "/"; ; paramFile = "")
    {
      boolean bool = paramArrayList.contains(paramFile);
      AppMethodBeat.o(14984);
      return bool;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.timeline.preload.b.b.c
 * JD-Core Version:    0.6.2
 */