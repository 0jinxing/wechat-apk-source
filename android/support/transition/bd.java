package android.support.transition;

import android.view.View;
import android.view.WindowId;

final class bd
  implements be
{
  private final WindowId BO;

  bd(View paramView)
  {
    this.BO = paramView.getWindowId();
  }

  public final boolean equals(Object paramObject)
  {
    if (((paramObject instanceof bd)) && (((bd)paramObject).BO.equals(this.BO)));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final int hashCode()
  {
    return this.BO.hashCode();
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.transition.bd
 * JD-Core Version:    0.6.2
 */