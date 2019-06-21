package com.tencent.mrs.b;

import com.tencent.mm.plugin.expt.d.b;
import com.tencent.mm.sdk.platformtools.bo;

public final class c
  implements a
{
  public final int get(String paramString, int paramInt)
  {
    paramString = get(paramString, "");
    if (bo.isNullOrNil(paramString));
    while (true)
    {
      return paramInt;
      paramInt = bo.getInt(paramString, paramInt);
    }
  }

  public final long get(String paramString, long paramLong)
  {
    paramString = get(paramString, "");
    if (bo.isNullOrNil(paramString));
    while (true)
    {
      return paramLong;
      paramLong = bo.getLong(paramString, paramLong);
    }
  }

  public final String get(String paramString1, String paramString2)
  {
    return b.brr().b(paramString1, paramString2, false, false);
  }

  public final boolean get(String paramString, boolean paramBoolean)
  {
    paramString = get(paramString, "");
    if (bo.isNullOrNil(paramString));
    while (true)
    {
      return paramBoolean;
      if (paramBoolean);
      for (int i = 1; ; i = 0)
      {
        if (bo.getInt(paramString, i) == 0)
          break label41;
        paramBoolean = true;
        break;
      }
      label41: paramBoolean = false;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mrs.b.c
 * JD-Core Version:    0.6.2
 */