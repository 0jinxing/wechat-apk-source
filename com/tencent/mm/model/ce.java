package com.tencent.mm.model;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class ce
{
  public static boolean bc(Object paramObject)
  {
    AppMethodBeat.i(77828);
    if ((paramObject instanceof Boolean));
    while (true)
    {
      try
      {
        bool = ((Boolean)paramObject).booleanValue();
        AppMethodBeat.o(77828);
        return bool;
      }
      catch (Exception paramObject)
      {
      }
      boolean bool = false;
      AppMethodBeat.o(77828);
    }
  }

  public static String e(Object paramObject, String paramString)
  {
    if ((paramObject instanceof String));
    while (true)
      try
      {
        paramObject = (String)paramObject;
        paramString = paramObject;
        return paramString;
      }
      catch (Exception paramObject)
      {
      }
  }

  public static int getInt(Object paramObject, int paramInt)
  {
    AppMethodBeat.i(77827);
    if ((paramObject instanceof Integer));
    while (true)
    {
      try
      {
        int i = ((Integer)paramObject).intValue();
        paramInt = i;
        AppMethodBeat.o(77827);
        return paramInt;
      }
      catch (Exception paramObject)
      {
      }
      AppMethodBeat.o(77827);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.model.ce
 * JD-Core Version:    0.6.2
 */