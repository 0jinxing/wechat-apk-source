package android.support.v4.view;

import android.os.Build.VERSION;
import android.view.LayoutInflater;
import android.view.LayoutInflater.Factory;
import android.view.LayoutInflater.Factory2;
import java.lang.reflect.Field;

public final class e
{
  private static Field Mi;
  private static boolean Mj;
  static final b Mk;

  static
  {
    if (Build.VERSION.SDK_INT >= 21);
    for (Mk = new a(); ; Mk = new b())
      return;
  }

  static void a(LayoutInflater paramLayoutInflater, LayoutInflater.Factory2 paramFactory2)
  {
    if (!Mj);
    try
    {
      Field localField = LayoutInflater.class.getDeclaredField("mFactory2");
      Mi = localField;
      localField.setAccessible(true);
      Mj = true;
      if (Mi == null);
    }
    catch (NoSuchFieldException localNoSuchFieldException)
    {
      try
      {
        Mi.set(paramLayoutInflater, paramFactory2);
        return;
        localNoSuchFieldException = localNoSuchFieldException;
        new StringBuilder("forceSetFactory2 Could not find field 'mFactory2' on class ").append(LayoutInflater.class.getName()).append("; inflation may have unexpected results.");
      }
      catch (IllegalAccessException paramFactory2)
      {
        while (true)
          new StringBuilder("forceSetFactory2 could not set the Factory2 on LayoutInflater ").append(paramLayoutInflater).append("; inflation may have unexpected results.");
      }
    }
  }

  public static void b(LayoutInflater paramLayoutInflater, LayoutInflater.Factory2 paramFactory2)
  {
    Mk.b(paramLayoutInflater, paramFactory2);
  }

  static final class a extends e.b
  {
    public final void b(LayoutInflater paramLayoutInflater, LayoutInflater.Factory2 paramFactory2)
    {
      paramLayoutInflater.setFactory2(paramFactory2);
    }
  }

  static class b
  {
    public void b(LayoutInflater paramLayoutInflater, LayoutInflater.Factory2 paramFactory2)
    {
      paramLayoutInflater.setFactory2(paramFactory2);
      LayoutInflater.Factory localFactory = paramLayoutInflater.getFactory();
      if ((localFactory instanceof LayoutInflater.Factory2))
        e.a(paramLayoutInflater, (LayoutInflater.Factory2)localFactory);
      while (true)
      {
        return;
        e.a(paramLayoutInflater, paramFactory2);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.v4.view.e
 * JD-Core Version:    0.6.2
 */