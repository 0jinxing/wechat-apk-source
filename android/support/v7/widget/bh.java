package android.support.v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v7.app.d;
import java.lang.ref.WeakReference;

public final class bh extends Resources
{
  private final WeakReference<Context> atF;

  public bh(Context paramContext, Resources paramResources)
  {
    super(paramResources.getAssets(), paramResources.getDisplayMetrics(), paramResources.getConfiguration());
    this.atF = new WeakReference(paramContext);
  }

  public static boolean lw()
  {
    if ((d.fm()) && (Build.VERSION.SDK_INT <= 20));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final Drawable getDrawable(int paramInt)
  {
    Context localContext = (Context)this.atF.get();
    Drawable localDrawable2;
    if (localContext != null)
    {
      i locali = i.hE();
      Drawable localDrawable1 = locali.n(localContext, paramInt);
      localDrawable2 = localDrawable1;
      if (localDrawable1 == null)
        localDrawable2 = super.getDrawable(paramInt);
      if (localDrawable2 != null)
        localDrawable2 = locali.a(localContext, paramInt, false, localDrawable2);
    }
    while (true)
    {
      return localDrawable2;
      localDrawable2 = null;
      continue;
      localDrawable2 = super.getDrawable(paramInt);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.bh
 * JD-Core Version:    0.6.2
 */