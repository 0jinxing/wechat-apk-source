package android.support.v4.a.a;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

class h extends g
{
  h(Drawable paramDrawable)
  {
    super(paramDrawable);
  }

  h(g.a parama, Resources paramResources)
  {
    super(parama, paramResources);
  }

  g.a dD()
  {
    return new a(this.HG);
  }

  public boolean isAutoMirrored()
  {
    return this.mDrawable.isAutoMirrored();
  }

  public void setAutoMirrored(boolean paramBoolean)
  {
    this.mDrawable.setAutoMirrored(paramBoolean);
  }

  static final class a extends g.a
  {
    a(g.a parama)
    {
      super();
    }

    public final Drawable newDrawable(Resources paramResources)
    {
      return new h(this, paramResources);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.v4.a.a.h
 * JD-Core Version:    0.6.2
 */