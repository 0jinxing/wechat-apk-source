package com.tencent.mm.plugin.sns.storage;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.model.af;

public final class h
{
  public static n YS(String paramString)
  {
    AppMethodBeat.i(37835);
    if (v.WT(paramString))
    {
      paramString = af.cnF().kD(v.Zm(paramString));
      AppMethodBeat.o(37835);
    }
    while (true)
    {
      return paramString;
      paramString = af.cnI().ku(v.Zm(paramString));
      if (paramString != null)
      {
        paramString = paramString.cqB();
        AppMethodBeat.o(37835);
      }
      else
      {
        paramString = null;
        AppMethodBeat.o(37835);
      }
    }
  }

  public static n YT(String paramString)
  {
    AppMethodBeat.i(37837);
    if (v.WT(paramString))
    {
      paramString = af.cnF().DK(v.Zn(paramString));
      AppMethodBeat.o(37837);
    }
    while (true)
    {
      return paramString;
      paramString = af.cnI().DG(v.Zn(paramString));
      if (paramString != null)
      {
        paramString = paramString.cqB();
        AppMethodBeat.o(37837);
      }
      else
      {
        paramString = null;
        AppMethodBeat.o(37837);
      }
    }
  }

  public static boolean a(String paramString, n paramn)
  {
    AppMethodBeat.i(37836);
    boolean bool;
    if (v.WT(paramString))
    {
      bool = af.cnF().b(v.Zm(paramString), paramn);
      AppMethodBeat.o(37836);
    }
    while (true)
    {
      return bool;
      bool = af.cnI().b(v.Zm(paramString), paramn.crd());
      AppMethodBeat.o(37836);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.storage.h
 * JD-Core Version:    0.6.2
 */