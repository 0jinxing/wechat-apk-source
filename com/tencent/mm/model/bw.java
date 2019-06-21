package com.tencent.mm.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.k;

@Deprecated
public class bw
{
  static
  {
    AppMethodBeat.i(16350);
    k.a("txmapengine", bw.class.getClassLoader());
    AppMethodBeat.o(16350);
  }

  public static at oJ(String paramString)
  {
    AppMethodBeat.i(16349);
    paramString = q.mF(paramString);
    if (paramString == null)
    {
      paramString = null;
      AppMethodBeat.o(16349);
    }
    while (true)
    {
      return paramString;
      paramString = paramString.Yw();
      AppMethodBeat.o(16349);
    }
  }

  public final boolean a(String paramString, at paramat)
  {
    try
    {
      AppMethodBeat.i(16348);
      q localq1 = q.mF(paramString);
      q localq2 = localq1;
      if (localq1 == null)
      {
        localq2 = new com/tencent/mm/model/q;
        localq2.<init>(paramat.getClass());
        localq2 = q.a(paramString, localq2);
      }
      localq2.a(paramat);
      AppMethodBeat.o(16348);
      return true;
    }
    finally
    {
    }
    throw paramString;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.model.bw
 * JD-Core Version:    0.6.2
 */