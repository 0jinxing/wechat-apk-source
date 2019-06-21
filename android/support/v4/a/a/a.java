package android.support.v4.a.a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.DrawableContainer.DrawableContainerState;
import android.graphics.drawable.InsetDrawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;

public final class a
{
  private static Method Hp;
  private static boolean Hq;
  private static Method Hr;
  private static boolean Hs;

  public static void a(Drawable paramDrawable, float paramFloat1, float paramFloat2)
  {
    if (Build.VERSION.SDK_INT >= 21)
      paramDrawable.setHotspot(paramFloat1, paramFloat2);
  }

  public static void a(Drawable paramDrawable, int paramInt)
  {
    if (Build.VERSION.SDK_INT >= 21)
      paramDrawable.setTint(paramInt);
    while (true)
    {
      return;
      if ((paramDrawable instanceof e))
        ((e)paramDrawable).setTint(paramInt);
    }
  }

  public static void a(Drawable paramDrawable, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (Build.VERSION.SDK_INT >= 21)
      paramDrawable.setHotspotBounds(paramInt1, paramInt2, paramInt3, paramInt4);
  }

  public static void a(Drawable paramDrawable, ColorStateList paramColorStateList)
  {
    if (Build.VERSION.SDK_INT >= 21)
      paramDrawable.setTintList(paramColorStateList);
    while (true)
    {
      return;
      if ((paramDrawable instanceof e))
        ((e)paramDrawable).setTintList(paramColorStateList);
    }
  }

  public static void a(Drawable paramDrawable, Resources.Theme paramTheme)
  {
    if (Build.VERSION.SDK_INT >= 21)
      paramDrawable.applyTheme(paramTheme);
  }

  public static void a(Drawable paramDrawable, Resources paramResources, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Resources.Theme paramTheme)
  {
    if (Build.VERSION.SDK_INT >= 21)
      paramDrawable.inflate(paramResources, paramXmlPullParser, paramAttributeSet, paramTheme);
    while (true)
    {
      return;
      paramDrawable.inflate(paramResources, paramXmlPullParser, paramAttributeSet);
    }
  }

  public static void a(Drawable paramDrawable, PorterDuff.Mode paramMode)
  {
    if (Build.VERSION.SDK_INT >= 21)
      paramDrawable.setTintMode(paramMode);
    while (true)
    {
      return;
      if ((paramDrawable instanceof e))
        ((e)paramDrawable).setTintMode(paramMode);
    }
  }

  public static void a(Drawable paramDrawable, boolean paramBoolean)
  {
    if (Build.VERSION.SDK_INT >= 19)
      paramDrawable.setAutoMirrored(paramBoolean);
  }

  public static boolean b(Drawable paramDrawable)
  {
    if (Build.VERSION.SDK_INT >= 19);
    for (boolean bool = paramDrawable.isAutoMirrored(); ; bool = false)
      return bool;
  }

  public static boolean b(Drawable paramDrawable, int paramInt)
  {
    boolean bool = true;
    if (Build.VERSION.SDK_INT >= 23)
      bool = paramDrawable.setLayoutDirection(paramInt);
    while (true)
    {
      return bool;
      if ((Build.VERSION.SDK_INT < 17) || (!Hq));
      try
      {
        Method localMethod = Drawable.class.getDeclaredMethod("setLayoutDirection", new Class[] { Integer.TYPE });
        Hp = localMethod;
        localMethod.setAccessible(true);
        label59: Hq = true;
        if (Hp != null)
          try
          {
            Hp.invoke(paramDrawable, new Object[] { Integer.valueOf(paramInt) });
          }
          catch (Exception paramDrawable)
          {
            Hp = null;
          }
        bool = false;
        continue;
        bool = false;
      }
      catch (NoSuchMethodException localNoSuchMethodException)
      {
        break label59;
      }
    }
  }

  public static int c(Drawable paramDrawable)
  {
    if (Build.VERSION.SDK_INT >= 19);
    for (int i = paramDrawable.getAlpha(); ; i = 0)
      return i;
  }

  public static boolean d(Drawable paramDrawable)
  {
    if (Build.VERSION.SDK_INT >= 21);
    for (boolean bool = paramDrawable.canApplyTheme(); ; bool = false)
      return bool;
  }

  public static void e(Drawable paramDrawable)
  {
    DrawableContainer.DrawableContainerState localDrawableContainerState;
    int i;
    int j;
    while ((Build.VERSION.SDK_INT < 23) && (Build.VERSION.SDK_INT >= 21))
    {
      paramDrawable.clearColorFilter();
      if ((paramDrawable instanceof InsetDrawable))
      {
        paramDrawable = ((InsetDrawable)paramDrawable).getDrawable();
      }
      else if ((paramDrawable instanceof f))
      {
        paramDrawable = ((f)paramDrawable).dC();
      }
      else
      {
        if (!(paramDrawable instanceof DrawableContainer))
          return;
        localDrawableContainerState = (DrawableContainer.DrawableContainerState)((DrawableContainer)paramDrawable).getConstantState();
        if (localDrawableContainerState == null)
          return;
        i = 0;
        j = localDrawableContainerState.getChildCount();
      }
    }
    while (i < j)
    {
      paramDrawable = localDrawableContainerState.getChild(i);
      if (paramDrawable != null)
        e(paramDrawable);
      i++;
      continue;
      paramDrawable.clearColorFilter();
    }
  }

  public static Drawable f(Drawable paramDrawable)
  {
    Object localObject;
    if (Build.VERSION.SDK_INT >= 23)
      localObject = paramDrawable;
    while (true)
    {
      return localObject;
      if (Build.VERSION.SDK_INT >= 21)
      {
        localObject = paramDrawable;
        if (!(paramDrawable instanceof e))
          localObject = new i(paramDrawable);
      }
      else if (Build.VERSION.SDK_INT >= 19)
      {
        localObject = paramDrawable;
        if (!(paramDrawable instanceof e))
          localObject = new h(paramDrawable);
      }
      else
      {
        localObject = paramDrawable;
        if (!(paramDrawable instanceof e))
          localObject = new g(paramDrawable);
      }
    }
  }

  public static int g(Drawable paramDrawable)
  {
    int i;
    if (Build.VERSION.SDK_INT >= 23)
      i = paramDrawable.getLayoutDirection();
    while (true)
    {
      return i;
      if ((Build.VERSION.SDK_INT < 17) || (!Hs));
      try
      {
        Method localMethod = Drawable.class.getDeclaredMethod("getLayoutDirection", new Class[0]);
        Hr = localMethod;
        localMethod.setAccessible(true);
        label50: Hs = true;
        if (Hr != null)
          try
          {
            i = ((Integer)Hr.invoke(paramDrawable, new Object[0])).intValue();
          }
          catch (Exception paramDrawable)
          {
            Hr = null;
          }
        i = 0;
        continue;
        i = 0;
      }
      catch (NoSuchMethodException localNoSuchMethodException)
      {
        break label50;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.v4.a.a.a
 * JD-Core Version:    0.6.2
 */