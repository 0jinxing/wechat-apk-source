package android.support.v4.widget;

import android.os.Build.VERSION;
import android.support.v4.view.d;
import android.support.v4.view.s;
import android.view.View;
import android.widget.PopupWindow;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public final class n
{
  static final d Rp;

  static
  {
    if (Build.VERSION.SDK_INT >= 23)
      Rp = new c();
    while (true)
    {
      return;
      if (Build.VERSION.SDK_INT >= 21)
        Rp = new b();
      else if (Build.VERSION.SDK_INT >= 19)
        Rp = new a();
      else
        Rp = new d();
    }
  }

  public static void a(PopupWindow paramPopupWindow, int paramInt)
  {
    Rp.a(paramPopupWindow, paramInt);
  }

  public static void a(PopupWindow paramPopupWindow, View paramView, int paramInt1, int paramInt2, int paramInt3)
  {
    Rp.a(paramPopupWindow, paramView, paramInt1, paramInt2, paramInt3);
  }

  public static void a(PopupWindow paramPopupWindow, boolean paramBoolean)
  {
    Rp.a(paramPopupWindow, paramBoolean);
  }

  static class a extends n.d
  {
    public final void a(PopupWindow paramPopupWindow, View paramView, int paramInt1, int paramInt2, int paramInt3)
    {
      paramPopupWindow.showAsDropDown(paramView, paramInt1, paramInt2, paramInt3);
    }
  }

  static class b extends n.a
  {
    private static Field Rq;

    static
    {
      try
      {
        Field localField = PopupWindow.class.getDeclaredField("mOverlapAnchor");
        Rq = localField;
        localField.setAccessible(true);
        label17: return;
      }
      catch (NoSuchFieldException localNoSuchFieldException)
      {
        break label17;
      }
    }

    public void a(PopupWindow paramPopupWindow, boolean paramBoolean)
    {
      if (Rq != null);
      try
      {
        Rq.set(paramPopupWindow, Boolean.valueOf(paramBoolean));
        label17: return;
      }
      catch (IllegalAccessException paramPopupWindow)
      {
        break label17;
      }
    }
  }

  static final class c extends n.b
  {
    public final void a(PopupWindow paramPopupWindow, int paramInt)
    {
      paramPopupWindow.setWindowLayoutType(paramInt);
    }

    public final void a(PopupWindow paramPopupWindow, boolean paramBoolean)
    {
      paramPopupWindow.setOverlapAnchor(paramBoolean);
    }
  }

  static class d
  {
    private static Method Rr;
    private static boolean Rs;

    public void a(PopupWindow paramPopupWindow, int paramInt)
    {
      if (!Rs);
      try
      {
        Method localMethod = PopupWindow.class.getDeclaredMethod("setWindowLayoutType", new Class[] { Integer.TYPE });
        Rr = localMethod;
        localMethod.setAccessible(true);
        label33: Rs = true;
        if (Rr != null);
        try
        {
          Rr.invoke(paramPopupWindow, new Object[] { Integer.valueOf(paramInt) });
          label62: return;
        }
        catch (Exception paramPopupWindow)
        {
          break label62;
        }
      }
      catch (Exception localException)
      {
        break label33;
      }
    }

    public void a(PopupWindow paramPopupWindow, View paramView, int paramInt1, int paramInt2, int paramInt3)
    {
      int i = paramInt1;
      if ((d.getAbsoluteGravity(paramInt3, s.T(paramView)) & 0x7) == 5)
        i = paramInt1 - (paramPopupWindow.getWidth() - paramView.getWidth());
      paramPopupWindow.showAsDropDown(paramView, i, paramInt2);
    }

    public void a(PopupWindow paramPopupWindow, boolean paramBoolean)
    {
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.v4.widget.n
 * JD-Core Version:    0.6.2
 */