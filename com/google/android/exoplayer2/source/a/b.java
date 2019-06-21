package com.google.android.exoplayer2.source.a;

import com.google.android.exoplayer2.h.r.e;

public final class b
{
  public static boolean c(Exception paramException)
  {
    boolean bool1 = false;
    boolean bool2 = bool1;
    if ((paramException instanceof r.e))
    {
      int i = ((r.e)paramException).responseCode;
      if (i != 404)
      {
        bool2 = bool1;
        if (i != 410);
      }
      else
      {
        bool2 = true;
      }
    }
    return bool2;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.source.a.b
 * JD-Core Version:    0.6.2
 */