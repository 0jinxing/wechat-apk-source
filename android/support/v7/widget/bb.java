package android.support.v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

final class bb extends ap
{
  private final WeakReference<Context> atF;

  public bb(Context paramContext, Resources paramResources)
  {
    super(paramResources);
    this.atF = new WeakReference(paramContext);
  }

  public final Drawable getDrawable(int paramInt)
  {
    Drawable localDrawable = super.getDrawable(paramInt);
    Context localContext = (Context)this.atF.get();
    if ((localDrawable != null) && (localContext != null))
    {
      i.hE();
      i.a(localContext, paramInt, localDrawable);
    }
    return localDrawable;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.bb
 * JD-Core Version:    0.6.2
 */