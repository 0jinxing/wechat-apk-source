package android.support.transition;

import android.view.ViewGroup;

final class ChangeBounds$10 extends ad
{
  boolean xH = false;

  ChangeBounds$10(ChangeBounds paramChangeBounds, ViewGroup paramViewGroup)
  {
  }

  public final void a(Transition paramTransition)
  {
    if (!this.xH)
      an.c(this.xI, false);
    paramTransition.b(this);
  }

  public final void cO()
  {
    an.c(this.xI, false);
  }

  public final void cP()
  {
    an.c(this.xI, true);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     android.support.transition.ChangeBounds.10
 * JD-Core Version:    0.6.2
 */