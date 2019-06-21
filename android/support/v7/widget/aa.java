package android.support.v7.widget;

import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.DrawableContainer.DrawableContainerState;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ScaleDrawable;
import android.os.Build.VERSION;
import android.support.v4.a.a.f;
import android.support.v7.d.a.a;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public final class aa
{
  public static final Rect ahT = new Rect();
  private static Class<?> ahU;

  static
  {
    if (Build.VERSION.SDK_INT >= 18);
    try
    {
      ahU = Class.forName("android.graphics.Insets");
      label26: return;
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      break label26;
    }
  }

  public static PorterDuff.Mode d(int paramInt, PorterDuff.Mode paramMode)
  {
    PorterDuff.Mode localMode = paramMode;
    switch (paramInt)
    {
    default:
      localMode = paramMode;
    case 4:
    case 6:
    case 7:
    case 8:
    case 10:
    case 11:
    case 12:
    case 13:
    case 3:
    case 5:
    case 9:
    case 14:
    case 15:
    case 16:
    }
    while (true)
    {
      return localMode;
      localMode = PorterDuff.Mode.SRC_OVER;
      continue;
      localMode = PorterDuff.Mode.SRC_IN;
      continue;
      localMode = PorterDuff.Mode.SRC_ATOP;
      continue;
      localMode = PorterDuff.Mode.MULTIPLY;
      continue;
      localMode = PorterDuff.Mode.SCREEN;
      continue;
      localMode = PorterDuff.Mode.ADD;
    }
  }

  public static Rect m(Drawable paramDrawable)
  {
    Object localObject1;
    if (ahU != null)
      localObject1 = paramDrawable;
    while (true)
    {
      Object localObject2;
      try
      {
        if ((paramDrawable instanceof f))
          localObject1 = ((f)paramDrawable).dC();
        localObject2 = localObject1.getClass().getMethod("getOpticalInsets", new Class[0]).invoke(localObject1, new Object[0]);
        if (localObject2 != null)
        {
          localObject1 = new android/graphics/Rect;
          ((Rect)localObject1).<init>();
          Field[] arrayOfField = ahU.getFields();
          int i = arrayOfField.length;
          int j = 0;
          paramDrawable = (Drawable)localObject1;
          if (j >= i)
            break label263;
          paramDrawable = arrayOfField[j];
          String str = paramDrawable.getName();
          int k = -1;
          switch (str.hashCode())
          {
          default:
            switch (k)
            {
            default:
              j++;
            case 0:
            case 1:
            case 2:
            case 3:
            }
            break;
          case 3317767:
            if (!str.equals("left"))
              continue;
            k = 0;
            break;
          case 115029:
            if (!str.equals("top"))
              continue;
            k = 1;
            break;
          case 108511772:
            if (!str.equals("right"))
              continue;
            k = 2;
            break;
          case -1383228885:
            if (!str.equals("bottom"))
              continue;
            k = 3;
            continue;
            ((Rect)localObject1).left = paramDrawable.getInt(localObject2);
            continue;
          }
        }
      }
      catch (Exception paramDrawable)
      {
      }
      paramDrawable = ahT;
      label263: return paramDrawable;
      ((Rect)localObject1).top = paramDrawable.getInt(localObject2);
      continue;
      ((Rect)localObject1).right = paramDrawable.getInt(localObject2);
      continue;
      ((Rect)localObject1).bottom = paramDrawable.getInt(localObject2);
    }
  }

  static void n(Drawable paramDrawable)
  {
    int[] arrayOfInt;
    if ((Build.VERSION.SDK_INT == 21) && ("android.graphics.drawable.VectorDrawable".equals(paramDrawable.getClass().getName())))
    {
      arrayOfInt = paramDrawable.getState();
      if ((arrayOfInt != null) && (arrayOfInt.length != 0))
        break label52;
      paramDrawable.setState(ay.kO);
    }
    while (true)
    {
      paramDrawable.setState(arrayOfInt);
      return;
      label52: paramDrawable.setState(ay.EMPTY_STATE_SET);
    }
  }

  public static boolean o(Drawable paramDrawable)
  {
    boolean bool;
    if ((Build.VERSION.SDK_INT < 15) && ((paramDrawable instanceof InsetDrawable)))
      bool = false;
    while (true)
    {
      return bool;
      if ((Build.VERSION.SDK_INT < 15) && ((paramDrawable instanceof GradientDrawable)))
      {
        bool = false;
      }
      else if ((Build.VERSION.SDK_INT < 17) && ((paramDrawable instanceof LayerDrawable)))
      {
        bool = false;
      }
      else
      {
        if ((paramDrawable instanceof DrawableContainer))
        {
          paramDrawable = paramDrawable.getConstantState();
          if ((paramDrawable instanceof DrawableContainer.DrawableContainerState))
          {
            paramDrawable = ((DrawableContainer.DrawableContainerState)paramDrawable).getChildren();
            int i = paramDrawable.length;
            for (int j = 0; ; j++)
            {
              if (j >= i)
                break label172;
              if (!o(paramDrawable[j]))
              {
                bool = false;
                break;
              }
            }
          }
        }
        else
        {
          if ((paramDrawable instanceof f))
          {
            paramDrawable = ((f)paramDrawable).dC();
            break;
          }
          if ((paramDrawable instanceof a))
          {
            paramDrawable = ((a)paramDrawable).mDrawable;
            break;
          }
          if ((paramDrawable instanceof ScaleDrawable))
          {
            paramDrawable = ((ScaleDrawable)paramDrawable).getDrawable();
            break;
          }
        }
        label172: bool = true;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.aa
 * JD-Core Version:    0.6.2
 */