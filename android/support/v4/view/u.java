package android.support.v4.view;

import android.os.Build.VERSION;
import android.view.ViewGroup;

public final class u
{
  static final c No;

  static
  {
    if (Build.VERSION.SDK_INT >= 21)
      No = new b();
    while (true)
    {
      return;
      if (Build.VERSION.SDK_INT >= 18)
        No = new a();
      else
        No = new c();
    }
  }

  public static int d(ViewGroup paramViewGroup)
  {
    return No.d(paramViewGroup);
  }

  public static boolean e(ViewGroup paramViewGroup)
  {
    return No.e(paramViewGroup);
  }

  static class a extends u.c
  {
    public final int d(ViewGroup paramViewGroup)
    {
      return paramViewGroup.getLayoutMode();
    }
  }

  static final class b extends u.a
  {
    public final boolean e(ViewGroup paramViewGroup)
    {
      return paramViewGroup.isTransitionGroup();
    }
  }

  static class c
  {
    public int d(ViewGroup paramViewGroup)
    {
      return 0;
    }

    public boolean e(ViewGroup paramViewGroup)
    {
      Boolean localBoolean = (Boolean)paramViewGroup.getTag(2131820673);
      if (((localBoolean != null) && (localBoolean.booleanValue())) || (paramViewGroup.getBackground() != null) || (s.ai(paramViewGroup) != null));
      for (boolean bool = true; ; bool = false)
        return bool;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.v4.view.u
 * JD-Core Version:    0.6.2
 */