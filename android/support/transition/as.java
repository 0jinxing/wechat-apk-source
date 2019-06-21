package android.support.transition;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOverlay;

final class as
  implements at
{
  private final ViewOverlay Bh;

  as(View paramView)
  {
    this.Bh = paramView.getOverlay();
  }

  public final void add(Drawable paramDrawable)
  {
    this.Bh.add(paramDrawable);
  }

  public final void remove(Drawable paramDrawable)
  {
    this.Bh.remove(paramDrawable);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     android.support.transition.as
 * JD-Core Version:    0.6.2
 */