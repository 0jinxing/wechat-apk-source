package android.support.v7.c.a;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v7.widget.i;
import android.util.SparseArray;
import android.util.TypedValue;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;

public final class b
{
  private static final ThreadLocal<TypedValue> Xk = new ThreadLocal();
  private static final WeakHashMap<Context, SparseArray<a>> Xl = new WeakHashMap(0);
  private static final Object Xm = new Object();

  public static Drawable g(Context paramContext, int paramInt)
  {
    return i.hE().a(paramContext, paramInt, false);
  }

  public static ColorStateList h(Context paramContext, int paramInt)
  {
    Object localObject1;
    if (Build.VERSION.SDK_INT >= 23)
      localObject1 = paramContext.getColorStateList(paramInt);
    while (true)
    {
      return localObject1;
      ColorStateList localColorStateList = l(paramContext, paramInt);
      localObject1 = localColorStateList;
      if (localColorStateList == null)
      {
        localColorStateList = k(paramContext, paramInt);
        if (localColorStateList != null)
          synchronized (Xm)
          {
            Object localObject3 = (SparseArray)Xl.get(paramContext);
            localObject1 = localObject3;
            if (localObject3 == null)
            {
              localObject1 = new android/util/SparseArray;
              ((SparseArray)localObject1).<init>();
              Xl.put(paramContext, localObject1);
            }
            localObject3 = new android/support/v7/c/a/b$a;
            ((a)localObject3).<init>(localColorStateList, paramContext.getResources().getConfiguration());
            ((SparseArray)localObject1).append(paramInt, localObject3);
            localObject1 = localColorStateList;
          }
        localObject1 = android.support.v4.content.b.h(paramContext, paramInt);
      }
    }
  }

  private static ColorStateList k(Context paramContext, int paramInt)
  {
    Resources localResources = paramContext.getResources();
    Object localObject1 = (TypedValue)Xk.get();
    Object localObject2 = localObject1;
    if (localObject1 == null)
    {
      localObject2 = new TypedValue();
      Xk.set(localObject2);
    }
    localResources.getValue(paramInt, (TypedValue)localObject2, true);
    int i;
    if ((((TypedValue)localObject2).type >= 28) && (((TypedValue)localObject2).type <= 31))
    {
      i = 1;
      if (i == 0)
        break label85;
      paramContext = null;
    }
    while (true)
    {
      return paramContext;
      i = 0;
      break;
      label85: localObject2 = paramContext.getResources();
      localObject1 = ((Resources)localObject2).getXml(paramInt);
      try
      {
        paramContext = a.createFromXml((Resources)localObject2, (XmlPullParser)localObject1, paramContext.getTheme());
      }
      catch (Exception paramContext)
      {
        paramContext = null;
      }
    }
  }

  private static ColorStateList l(Context paramContext, int paramInt)
  {
    synchronized (Xm)
    {
      SparseArray localSparseArray = (SparseArray)Xl.get(paramContext);
      if ((localSparseArray != null) && (localSparseArray.size() > 0))
      {
        a locala = (a)localSparseArray.get(paramInt);
        if (locala != null)
        {
          if (locala.Xo.equals(paramContext.getResources().getConfiguration()))
          {
            paramContext = locala.Xn;
            return paramContext;
          }
          localSparseArray.remove(paramInt);
        }
      }
      paramContext = null;
    }
  }

  static final class a
  {
    final ColorStateList Xn;
    final Configuration Xo;

    a(ColorStateList paramColorStateList, Configuration paramConfiguration)
    {
      this.Xn = paramColorStateList;
      this.Xo = paramConfiguration;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.v7.c.a.b
 * JD-Core Version:    0.6.2
 */