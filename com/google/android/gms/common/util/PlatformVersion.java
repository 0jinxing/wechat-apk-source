package com.google.android.gms.common.util;

import android.os.Build.VERSION;
import com.tencent.matrix.trace.core.AppMethodBeat;

@VisibleForTesting
public final class PlatformVersion
{
  public static boolean isAtLeastFroyo()
  {
    return true;
  }

  public static boolean isAtLeastGingerbread()
  {
    return true;
  }

  public static boolean isAtLeastGingerbreadMR1()
  {
    return true;
  }

  public static boolean isAtLeastHoneycomb()
  {
    return true;
  }

  public static boolean isAtLeastHoneycombMR1()
  {
    return true;
  }

  public static boolean isAtLeastHoneycombMR2()
  {
    return true;
  }

  public static boolean isAtLeastIceCreamSandwich()
  {
    return true;
  }

  public static boolean isAtLeastIceCreamSandwichMR1()
  {
    if (Build.VERSION.SDK_INT >= 15);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public static boolean isAtLeastJellyBean()
  {
    if (Build.VERSION.SDK_INT >= 16);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public static boolean isAtLeastJellyBeanMR1()
  {
    if (Build.VERSION.SDK_INT >= 17);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public static boolean isAtLeastJellyBeanMR2()
  {
    if (Build.VERSION.SDK_INT >= 18);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  @Deprecated
  public static boolean isAtLeastKeyLimePie()
  {
    AppMethodBeat.i(90253);
    boolean bool = isAtLeastKitKat();
    AppMethodBeat.o(90253);
    return bool;
  }

  public static boolean isAtLeastKitKat()
  {
    if (Build.VERSION.SDK_INT >= 19);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public static boolean isAtLeastKitKatWatch()
  {
    if (Build.VERSION.SDK_INT >= 20);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  @Deprecated
  public static boolean isAtLeastL()
  {
    AppMethodBeat.i(90254);
    boolean bool = isAtLeastLollipop();
    AppMethodBeat.o(90254);
    return bool;
  }

  public static boolean isAtLeastLollipop()
  {
    if (Build.VERSION.SDK_INT >= 21);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public static boolean isAtLeastLollipopMR1()
  {
    if (Build.VERSION.SDK_INT >= 22);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public static boolean isAtLeastM()
  {
    if (Build.VERSION.SDK_INT >= 23);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public static boolean isAtLeastN()
  {
    if (Build.VERSION.SDK_INT >= 24);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public static boolean isAtLeastNMR1()
  {
    if (Build.VERSION.SDK_INT >= 25);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public static boolean isAtLeastO()
  {
    if (Build.VERSION.SDK_INT >= 26);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public static boolean isAtLeastOMR1()
  {
    if (Build.VERSION.SDK_INT >= 27);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public static boolean isAtLeastP()
  {
    AppMethodBeat.i(90255);
    boolean bool = Build.VERSION.CODENAME.equals("P");
    AppMethodBeat.o(90255);
    return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.util.PlatformVersion
 * JD-Core Version:    0.6.2
 */