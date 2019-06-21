package android.support.v4.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.widget.CompoundButton;
import java.lang.reflect.Field;

public final class e
{
  private static final c Py;

  static
  {
    if (Build.VERSION.SDK_INT >= 23)
      Py = new b();
    while (true)
    {
      return;
      if (Build.VERSION.SDK_INT >= 21)
        Py = new a();
      else
        Py = new c();
    }
  }

  public static Drawable a(CompoundButton paramCompoundButton)
  {
    return Py.a(paramCompoundButton);
  }

  public static void a(CompoundButton paramCompoundButton, ColorStateList paramColorStateList)
  {
    Py.a(paramCompoundButton, paramColorStateList);
  }

  public static void a(CompoundButton paramCompoundButton, PorterDuff.Mode paramMode)
  {
    Py.a(paramCompoundButton, paramMode);
  }

  static class a extends e.c
  {
    public final void a(CompoundButton paramCompoundButton, ColorStateList paramColorStateList)
    {
      paramCompoundButton.setButtonTintList(paramColorStateList);
    }

    public final void a(CompoundButton paramCompoundButton, PorterDuff.Mode paramMode)
    {
      paramCompoundButton.setButtonTintMode(paramMode);
    }
  }

  static final class b extends e.a
  {
    public final Drawable a(CompoundButton paramCompoundButton)
    {
      return paramCompoundButton.getButtonDrawable();
    }
  }

  static class c
  {
    private static boolean PA;
    private static Field Pz;

    public Drawable a(CompoundButton paramCompoundButton)
    {
      if (!PA);
      try
      {
        Field localField = CompoundButton.class.getDeclaredField("mButtonDrawable");
        Pz = localField;
        localField.setAccessible(true);
        label23: PA = true;
        if (Pz != null);
        while (true)
        {
          try
          {
            paramCompoundButton = (Drawable)Pz.get(paramCompoundButton);
            return paramCompoundButton;
          }
          catch (IllegalAccessException paramCompoundButton)
          {
            Pz = null;
          }
          paramCompoundButton = null;
        }
      }
      catch (NoSuchFieldException localNoSuchFieldException)
      {
        break label23;
      }
    }

    public void a(CompoundButton paramCompoundButton, ColorStateList paramColorStateList)
    {
      if ((paramCompoundButton instanceof r))
        ((r)paramCompoundButton).setSupportButtonTintList(paramColorStateList);
    }

    public void a(CompoundButton paramCompoundButton, PorterDuff.Mode paramMode)
    {
      if ((paramCompoundButton instanceof r))
        ((r)paramCompoundButton).setSupportButtonTintMode(paramMode);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.v4.widget.e
 * JD-Core Version:    0.6.2
 */