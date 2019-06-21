package com.tencent.mm.plugin.appbrand.widget.picker;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;

public final class f
{
  public static int[] EO(String paramString)
  {
    Object localObject = null;
    AppMethodBeat.i(126755);
    if (bo.isNullOrNil(paramString))
    {
      AppMethodBeat.o(126755);
      paramString = localObject;
    }
    while (true)
    {
      return paramString;
      paramString = paramString.split(":");
      if ((paramString == null) || (paramString.length != 2))
      {
        AppMethodBeat.o(126755);
        paramString = localObject;
      }
      else
      {
        int i = EP(paramString[0]);
        int j = EP(paramString[1]);
        if ((!qS(i)) || (!qR(j)))
        {
          AppMethodBeat.o(126755);
          paramString = localObject;
        }
        else
        {
          paramString = new int[2];
          paramString[0] = i;
          paramString[1] = j;
          AppMethodBeat.o(126755);
        }
      }
    }
  }

  private static int EP(String paramString)
  {
    AppMethodBeat.i(126756);
    try
    {
      i = Integer.parseInt(paramString, 10);
      AppMethodBeat.o(126756);
      return i;
    }
    catch (Exception paramString)
    {
      while (true)
      {
        int i = -1;
        AppMethodBeat.o(126756);
      }
    }
  }

  public static boolean qR(int paramInt)
  {
    if ((paramInt >= 0) && (paramInt <= 59));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public static boolean qS(int paramInt)
  {
    if ((paramInt >= 0) && (paramInt <= 23));
    for (boolean bool = true; ; bool = false)
      return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.picker.f
 * JD-Core Version:    0.6.2
 */