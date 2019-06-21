package android.support.v4.a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build.VERSION;
import android.support.v4.content.a.a.a;
import android.support.v4.content.a.a.b;
import android.support.v4.content.a.a.d;
import android.support.v4.content.a.b.a;
import android.support.v4.d.b;
import android.support.v4.d.b.b;

public final class d
{
  private static final a He;
  private static final android.support.v4.f.g<String, Typeface> Hf;

  static
  {
    if (Build.VERSION.SDK_INT >= 26)
      He = new g();
    while (true)
    {
      Hf = new android.support.v4.f.g(16);
      return;
      if ((Build.VERSION.SDK_INT >= 24) && (f.dw()))
        He = new f();
      else if (Build.VERSION.SDK_INT >= 21)
        He = new e();
      else
        He = new h();
    }
  }

  public static Typeface a(Context paramContext, Resources paramResources, int paramInt1, String paramString, int paramInt2)
  {
    paramContext = He.a(paramContext, paramResources, paramInt1, paramString, paramInt2);
    if (paramContext != null)
    {
      paramResources = b(paramResources, paramInt1, paramInt2);
      Hf.put(paramResources, paramContext);
    }
    return paramContext;
  }

  public static Typeface a(Context paramContext, a.a parama, Resources paramResources, int paramInt1, int paramInt2, b.a parama1)
  {
    boolean bool;
    if ((parama instanceof a.d))
    {
      parama = (a.d)parama;
      if (parama.GU == 0)
      {
        bool = true;
        int i = parama.GS;
        paramContext = b.a(paramContext, parama.GR, parama1, bool, i, paramInt2);
      }
    }
    while (true)
    {
      if (paramContext != null)
        Hf.put(b(paramResources, paramInt1, paramInt2), paramContext);
      return paramContext;
      bool = false;
      break;
      parama = He.a(paramContext, (a.b)parama, paramResources, paramInt2);
      paramContext = parama;
      if (parama1 != null)
        if (parama != null)
        {
          parama1.a(parama, null);
          paramContext = parama;
        }
        else
        {
          parama1.a(-3, null);
          paramContext = parama;
        }
    }
  }

  public static Typeface a(Context paramContext, b.b[] paramArrayOfb, int paramInt)
  {
    return He.a(paramContext, paramArrayOfb, paramInt);
  }

  public static Typeface a(Resources paramResources, int paramInt1, int paramInt2)
  {
    return (Typeface)Hf.get(b(paramResources, paramInt1, paramInt2));
  }

  private static String b(Resources paramResources, int paramInt1, int paramInt2)
  {
    return paramResources.getResourcePackageName(paramInt1) + "-" + paramInt1 + "-" + paramInt2;
  }

  static abstract interface a
  {
    public abstract Typeface a(Context paramContext, Resources paramResources, int paramInt1, String paramString, int paramInt2);

    public abstract Typeface a(Context paramContext, a.b paramb, Resources paramResources, int paramInt);

    public abstract Typeface a(Context paramContext, b.b[] paramArrayOfb, int paramInt);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.v4.a.d
 * JD-Core Version:    0.6.2
 */