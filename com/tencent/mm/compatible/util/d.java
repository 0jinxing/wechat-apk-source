package com.tencent.mm.compatible.util;

import android.os.Build.VERSION;

public final class d
{
  public static boolean fP(int paramInt)
  {
    if (Build.VERSION.SDK_INT < paramInt);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public static boolean iW(int paramInt)
  {
    if (Build.VERSION.SDK_INT >= paramInt);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public static boolean iX(int paramInt)
  {
    if (Build.VERSION.SDK_INT > paramInt);
    for (boolean bool = true; ; bool = false)
      return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.compatible.util.d
 * JD-Core Version:    0.6.2
 */