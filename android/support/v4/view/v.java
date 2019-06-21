package android.support.v4.view;

import android.os.Build.VERSION;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;

public final class v
{
  static final c Nv;

  static
  {
    if (Build.VERSION.SDK_INT >= 21)
      Nv = new b();
    while (true)
    {
      return;
      if (Build.VERSION.SDK_INT >= 19)
        Nv = new a();
      else
        Nv = new c();
    }
  }

  public static void a(ViewParent paramViewParent, View paramView, int paramInt)
  {
    if ((paramViewParent instanceof m))
      ((m)paramViewParent).j(paramView, paramInt);
    while (true)
    {
      return;
      if (paramInt == 0)
        Nv.a(paramViewParent, paramView);
    }
  }

  public static void a(ViewParent paramViewParent, View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    if ((paramViewParent instanceof m))
      ((m)paramViewParent).m(paramInt4, paramInt5);
    while (true)
    {
      return;
      if (paramInt5 == 0)
        Nv.a(paramViewParent, paramView, paramInt1, paramInt2, paramInt3, paramInt4);
    }
  }

  public static void a(ViewParent paramViewParent, View paramView, int paramInt1, int paramInt2, int[] paramArrayOfInt, int paramInt3)
  {
    if ((paramViewParent instanceof m))
      ((m)paramViewParent).a(paramView, paramInt1, paramInt2, paramArrayOfInt, paramInt3);
    while (true)
    {
      return;
      if (paramInt3 == 0)
        Nv.a(paramViewParent, paramView, paramInt1, paramInt2, paramArrayOfInt);
    }
  }

  public static boolean a(ViewParent paramViewParent, View paramView, float paramFloat1, float paramFloat2)
  {
    return Nv.a(paramViewParent, paramView, paramFloat1, paramFloat2);
  }

  public static boolean a(ViewParent paramViewParent, View paramView, float paramFloat1, float paramFloat2, boolean paramBoolean)
  {
    return Nv.a(paramViewParent, paramView, paramFloat1, paramFloat2, paramBoolean);
  }

  public static boolean a(ViewParent paramViewParent, View paramView1, View paramView2, int paramInt1, int paramInt2)
  {
    boolean bool;
    if ((paramViewParent instanceof m))
      bool = ((m)paramViewParent).e(paramView1, paramInt1, paramInt2);
    while (true)
    {
      return bool;
      if (paramInt2 == 0)
        bool = Nv.a(paramViewParent, paramView1, paramView2, paramInt1);
      else
        bool = false;
    }
  }

  @Deprecated
  public static boolean a(ViewParent paramViewParent, View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    return paramViewParent.requestSendAccessibilityEvent(paramView, paramAccessibilityEvent);
  }

  public static void b(ViewParent paramViewParent, View paramView1, View paramView2, int paramInt1, int paramInt2)
  {
    if ((paramViewParent instanceof m))
      ((m)paramViewParent).i(paramView2, paramInt1);
    while (true)
    {
      return;
      if (paramInt2 == 0)
        Nv.b(paramViewParent, paramView1, paramView2, paramInt1);
    }
  }

  static class a extends v.c
  {
  }

  static final class b extends v.a
  {
    public final void a(ViewParent paramViewParent, View paramView)
    {
      try
      {
        paramViewParent.onStopNestedScroll(paramView);
        return;
      }
      catch (AbstractMethodError paramView)
      {
        while (true)
          new StringBuilder("ViewParent ").append(paramViewParent).append(" does not implement interface method onStopNestedScroll");
      }
    }

    public final void a(ViewParent paramViewParent, View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      try
      {
        paramViewParent.onNestedScroll(paramView, paramInt1, paramInt2, paramInt3, paramInt4);
        return;
      }
      catch (AbstractMethodError paramView)
      {
        while (true)
          new StringBuilder("ViewParent ").append(paramViewParent).append(" does not implement interface method onNestedScroll");
      }
    }

    public final void a(ViewParent paramViewParent, View paramView, int paramInt1, int paramInt2, int[] paramArrayOfInt)
    {
      try
      {
        paramViewParent.onNestedPreScroll(paramView, paramInt1, paramInt2, paramArrayOfInt);
        return;
      }
      catch (AbstractMethodError paramView)
      {
        while (true)
          new StringBuilder("ViewParent ").append(paramViewParent).append(" does not implement interface method onNestedPreScroll");
      }
    }

    public final boolean a(ViewParent paramViewParent, View paramView, float paramFloat1, float paramFloat2)
    {
      try
      {
        bool = paramViewParent.onNestedPreFling(paramView, paramFloat1, paramFloat2);
        return bool;
      }
      catch (AbstractMethodError paramView)
      {
        while (true)
        {
          new StringBuilder("ViewParent ").append(paramViewParent).append(" does not implement interface method onNestedPreFling");
          boolean bool = false;
        }
      }
    }

    public final boolean a(ViewParent paramViewParent, View paramView, float paramFloat1, float paramFloat2, boolean paramBoolean)
    {
      try
      {
        paramBoolean = paramViewParent.onNestedFling(paramView, paramFloat1, paramFloat2, paramBoolean);
        return paramBoolean;
      }
      catch (AbstractMethodError paramView)
      {
        while (true)
        {
          new StringBuilder("ViewParent ").append(paramViewParent).append(" does not implement interface method onNestedFling");
          paramBoolean = false;
        }
      }
    }

    public final boolean a(ViewParent paramViewParent, View paramView1, View paramView2, int paramInt)
    {
      try
      {
        bool = paramViewParent.onStartNestedScroll(paramView1, paramView2, paramInt);
        return bool;
      }
      catch (AbstractMethodError paramView1)
      {
        while (true)
        {
          new StringBuilder("ViewParent ").append(paramViewParent).append(" does not implement interface method onStartNestedScroll");
          boolean bool = false;
        }
      }
    }

    public final void b(ViewParent paramViewParent, View paramView1, View paramView2, int paramInt)
    {
      try
      {
        paramViewParent.onNestedScrollAccepted(paramView1, paramView2, paramInt);
        return;
      }
      catch (AbstractMethodError paramView1)
      {
        while (true)
          new StringBuilder("ViewParent ").append(paramViewParent).append(" does not implement interface method onNestedScrollAccepted");
      }
    }
  }

  static class c
  {
    public void a(ViewParent paramViewParent, View paramView)
    {
      if ((paramViewParent instanceof l))
        ((l)paramViewParent).onStopNestedScroll(paramView);
    }

    public void a(ViewParent paramViewParent, View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      if ((paramViewParent instanceof l))
        ((l)paramViewParent).onNestedScroll(paramView, paramInt1, paramInt2, paramInt3, paramInt4);
    }

    public void a(ViewParent paramViewParent, View paramView, int paramInt1, int paramInt2, int[] paramArrayOfInt)
    {
      if ((paramViewParent instanceof l))
        ((l)paramViewParent).onNestedPreScroll(paramView, paramInt1, paramInt2, paramArrayOfInt);
    }

    public boolean a(ViewParent paramViewParent, View paramView, float paramFloat1, float paramFloat2)
    {
      if ((paramViewParent instanceof l));
      for (boolean bool = ((l)paramViewParent).onNestedPreFling(paramView, paramFloat1, paramFloat2); ; bool = false)
        return bool;
    }

    public boolean a(ViewParent paramViewParent, View paramView, float paramFloat1, float paramFloat2, boolean paramBoolean)
    {
      if ((paramViewParent instanceof l));
      for (paramBoolean = ((l)paramViewParent).onNestedFling(paramView, paramFloat1, paramFloat2, paramBoolean); ; paramBoolean = false)
        return paramBoolean;
    }

    public boolean a(ViewParent paramViewParent, View paramView1, View paramView2, int paramInt)
    {
      if ((paramViewParent instanceof l));
      for (boolean bool = ((l)paramViewParent).onStartNestedScroll(paramView1, paramView2, paramInt); ; bool = false)
        return bool;
    }

    public void b(ViewParent paramViewParent, View paramView1, View paramView2, int paramInt)
    {
      if ((paramViewParent instanceof l))
        ((l)paramViewParent).onNestedScrollAccepted(paramView1, paramView2, paramInt);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.v4.view.v
 * JD-Core Version:    0.6.2
 */