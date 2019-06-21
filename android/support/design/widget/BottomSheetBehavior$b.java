package android.support.design.widget;

import android.support.v4.view.s;
import android.support.v4.widget.t;
import android.view.View;

final class BottomSheetBehavior$b
  implements Runnable
{
  private final View mView;
  private final int nz;

  BottomSheetBehavior$b(BottomSheetBehavior paramBottomSheetBehavior, View paramView, int paramInt)
  {
    this.mView = paramView;
    this.nz = paramInt;
  }

  public final void run()
  {
    if ((this.ny.nl != null) && (this.ny.nl.eX()))
      s.b(this.mView, this);
    while (true)
    {
      return;
      this.ny.L(this.nz);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     android.support.design.widget.BottomSheetBehavior.b
 * JD-Core Version:    0.6.2
 */