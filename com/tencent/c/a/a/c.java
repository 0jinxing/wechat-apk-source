package com.tencent.c.a.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

final class c
{
  static File cl(String paramString)
  {
    AppMethodBeat.i(125743);
    paramString = new File(paramString);
    if (paramString.exists())
      AppMethodBeat.o(125743);
    while (true)
    {
      return paramString;
      if (!paramString.getParentFile().exists())
        cl(paramString.getParentFile().getAbsolutePath());
      paramString.mkdir();
      AppMethodBeat.o(125743);
    }
  }

  static List<String> s(File paramFile)
  {
    AppMethodBeat.i(125742);
    paramFile = new FileReader(paramFile);
    BufferedReader localBufferedReader = new BufferedReader(paramFile);
    ArrayList localArrayList = new ArrayList();
    while (true)
    {
      String str = localBufferedReader.readLine();
      if (str == null)
        break;
      localArrayList.add(str.trim());
    }
    paramFile.close();
    localBufferedReader.close();
    AppMethodBeat.o(125742);
    return localArrayList;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.c.a.a.c
 * JD-Core Version:    0.6.2
 */