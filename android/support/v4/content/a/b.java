package android.support.v4.content.a;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.content.res.Resources.Theme;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.a.d;
import android.util.TypedValue;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

public final class b
{
  public static Typeface a(Context paramContext, int paramInt1, TypedValue paramTypedValue, int paramInt2, a parama)
  {
    if (paramContext.isRestricted())
      paramContext = null;
    do
    {
      do
      {
        return paramContext;
        Resources localResources = paramContext.getResources();
        localResources.getValue(paramInt1, paramTypedValue, true);
        paramTypedValue = a(paramContext, localResources, paramTypedValue, paramInt1, paramInt2, parama);
        paramContext = paramTypedValue;
      }
      while (paramTypedValue != null);
      paramContext = paramTypedValue;
    }
    while (parama != null);
    throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(paramInt1) + " could not be retrieved.");
  }

  private static Typeface a(Context paramContext, Resources paramResources, TypedValue paramTypedValue, int paramInt1, int paramInt2, a parama)
  {
    if (paramTypedValue.string == null)
      throw new Resources.NotFoundException("Resource \"" + paramResources.getResourceName(paramInt1) + "\" (" + Integer.toHexString(paramInt1) + ") is not a Font: " + paramTypedValue);
    String str = paramTypedValue.string.toString();
    if (!str.startsWith("res/"))
    {
      if (parama != null)
        parama.a(-3, null);
      paramContext = null;
    }
    while (true)
    {
      return paramContext;
      paramTypedValue = d.a(paramResources, paramInt1, paramInt2);
      if (paramTypedValue != null)
      {
        paramContext = paramTypedValue;
        if (parama == null)
          continue;
        parama.a(paramTypedValue, null);
        paramContext = paramTypedValue;
        continue;
      }
      try
      {
        if (str.toLowerCase().endsWith(".xml"))
        {
          paramTypedValue = a.a(paramResources.getXml(paramInt1), paramResources);
          if (paramTypedValue == null)
          {
            if (parama != null)
              parama.a(-3, null);
            paramContext = null;
            continue;
          }
          paramContext = d.a(paramContext, paramTypedValue, paramResources, paramInt1, paramInt2, parama);
          continue;
        }
        paramResources = d.a(paramContext, paramResources, paramInt1, str, paramInt2);
        paramContext = paramResources;
        if (parama == null)
          continue;
        if (paramResources != null)
        {
          parama.a(paramResources, null);
          paramContext = paramResources;
        }
      }
      catch (XmlPullParserException paramContext)
      {
        if (parama != null)
          parama.a(-3, null);
        paramContext = null;
        continue;
        parama.a(-3, null);
        paramContext = paramResources;
      }
      catch (IOException paramContext)
      {
        label220: break label220;
      }
    }
  }

  public static Drawable b(Resources paramResources, int paramInt, Resources.Theme paramTheme)
  {
    if (Build.VERSION.SDK_INT >= 21);
    for (paramResources = paramResources.getDrawable(paramInt, paramTheme); ; paramResources = paramResources.getDrawable(paramInt))
      return paramResources;
  }

  public static abstract class a
  {
    public final void a(final int paramInt, Handler paramHandler)
    {
      Handler localHandler = paramHandler;
      if (paramHandler == null)
        localHandler = new Handler(Looper.getMainLooper());
      localHandler.post(new Runnable()
      {
        public final void run()
        {
        }
      });
    }

    public final void a(final Typeface paramTypeface, Handler paramHandler)
    {
      Handler localHandler = paramHandler;
      if (paramHandler == null)
        localHandler = new Handler(Looper.getMainLooper());
      localHandler.post(new Runnable()
      {
        public final void run()
        {
          b.a.this.b(paramTypeface);
        }
      });
    }

    public abstract void b(Typeface paramTypeface);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.v4.content.a.b
 * JD-Core Version:    0.6.2
 */