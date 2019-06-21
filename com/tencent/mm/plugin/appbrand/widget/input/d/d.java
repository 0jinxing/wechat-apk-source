package com.tencent.mm.plugin.appbrand.widget.input.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;

public final class d
{
  private static int am(Class paramClass)
  {
    int i = 0;
    AppMethodBeat.i(77453);
    if (!paramClass.isEnum())
      AppMethodBeat.o(77453);
    while (true)
    {
      return i;
      paramClass = paramClass.getEnumConstants();
      int j = paramClass.length;
      int k = 0;
      i = 0;
      while (k < j)
      {
        i = Math.max(((Enum)paramClass[k]).name().length(), i);
        k++;
      }
      AppMethodBeat.o(77453);
    }
  }

  public static Integer bv(Object paramObject)
  {
    AppMethodBeat.i(77455);
    if (paramObject == null)
    {
      AppMethodBeat.o(77455);
      paramObject = null;
    }
    while (true)
    {
      return paramObject;
      if ((paramObject instanceof Integer))
      {
        paramObject = (Integer)paramObject;
        AppMethodBeat.o(77455);
      }
      else if ((paramObject instanceof Number))
      {
        paramObject = Integer.valueOf(((Number)paramObject).intValue());
        AppMethodBeat.o(77455);
      }
      else if ((paramObject instanceof String))
      {
        try
        {
          int i = (int)Double.parseDouble((String)paramObject);
          paramObject = Integer.valueOf(i);
          AppMethodBeat.o(77455);
        }
        catch (NumberFormatException paramObject)
        {
        }
      }
      else
      {
        AppMethodBeat.o(77455);
        paramObject = null;
      }
    }
  }

  static <T extends Enum> T f(String paramString, Class<T> paramClass)
  {
    AppMethodBeat.i(77454);
    int i = am(paramClass);
    if ((bo.isNullOrNil(paramString)) || (paramString.length() > i))
    {
      AppMethodBeat.o(77454);
      paramString = null;
    }
    while (true)
    {
      return paramString;
      paramString = paramString.toUpperCase();
      Enum[] arrayOfEnum = (Enum[])paramClass.getEnumConstants();
      int j = arrayOfEnum.length;
      for (i = 0; ; i++)
      {
        if (i >= j)
          break label96;
        paramClass = arrayOfEnum[i];
        if (paramString.equals(((Enum)paramClass).name()))
        {
          paramString = (Enum)paramClass;
          AppMethodBeat.o(77454);
          break;
        }
      }
      label96: AppMethodBeat.o(77454);
      paramString = null;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.input.d.d
 * JD-Core Version:    0.6.2
 */