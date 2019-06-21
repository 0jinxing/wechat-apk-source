package com.tencent.view.raw;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.InputStream;

public class FilterRawGet
{
  private static GetInputStream mGetInputStream;

  public static void setGetInputStream(GetInputStream paramGetInputStream)
  {
    mGetInputStream = paramGetInputStream;
  }

  public InputStream getInpuStream(String paramString)
  {
    AppMethodBeat.i(86638);
    try
    {
      if (mGetInputStream != null);
      for (paramString = mGetInputStream.getInputStream(paramString); ; paramString = getClass().getResourceAsStream(paramString))
      {
        AppMethodBeat.o(86638);
        return paramString;
      }
    }
    catch (Exception paramString)
    {
      while (true)
      {
        paramString = null;
        AppMethodBeat.o(86638);
      }
    }
  }

  public static abstract interface GetInputStream
  {
    public abstract InputStream getInputStream(String paramString);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.view.raw.FilterRawGet
 * JD-Core Version:    0.6.2
 */