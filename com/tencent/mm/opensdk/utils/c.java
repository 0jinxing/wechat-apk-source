package com.tencent.mm.opensdk.utils;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class c
{
  public static final class a
  {
    public static Object a(int paramInt, String paramString)
    {
      AppMethodBeat.i(128070);
      switch (paramInt)
      {
      default:
      case 1:
      case 2:
      case 3:
      case 4:
      case 5:
      case 6:
      }
      try
      {
        Log.e("MicroMsg.SDK.PluginProvider.Resolver", "unknown type");
        paramString = null;
        AppMethodBeat.o(128070);
        while (true)
        {
          return paramString;
          paramString = Integer.valueOf(paramString);
          AppMethodBeat.o(128070);
          continue;
          paramString = Long.valueOf(paramString);
          AppMethodBeat.o(128070);
          continue;
          AppMethodBeat.o(128070);
          continue;
          paramString = Boolean.valueOf(paramString);
          AppMethodBeat.o(128070);
          continue;
          paramString = Float.valueOf(paramString);
          AppMethodBeat.o(128070);
          continue;
          paramString = Double.valueOf(paramString);
          AppMethodBeat.o(128070);
        }
      }
      catch (Exception paramString)
      {
        while (true)
          Log.e("MicroMsg.SDK.PluginProvider.Resolver", "resolveObj exception:" + paramString.getMessage());
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.opensdk.utils.c
 * JD-Core Version:    0.6.2
 */