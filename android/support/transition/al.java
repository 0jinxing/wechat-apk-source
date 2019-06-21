package android.support.transition;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;

final class al
  implements am
{
  private final ViewGroupOverlay AR;

  al(ViewGroup paramViewGroup)
  {
    this.AR = paramViewGroup.getOverlay();
  }

  public final void add(Drawable paramDrawable)
  {
    this.AR.add(paramDrawable);
  }

  public final void add(View paramView)
  {
    this.AR.add(paramView);
  }

  public final void remove(Drawable paramDrawable)
  {
    this.AR.remove(paramDrawable);
  }

  public final void remove(View paramView)
  {
    this.AR.remove(paramView);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     android.support.transition.al
 * JD-Core Version:    0.6.2
 */