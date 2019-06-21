package android.support.design.widget;

import android.support.v4.view.s;
import android.support.v4.widget.t;
import android.view.View;

final class n$b
  implements Runnable
{
  private final View mView;
  private final boolean rO;

  n$b(n paramn, View paramView, boolean paramBoolean)
  {
    this.mView = paramView;
    this.rO = paramBoolean;
  }

  public final void run()
  {
    if ((this.rN.nl != null) && (this.rN.nl.eX()))
      s.b(this.mView, this);
    while (true)
    {
      return;
      if ((this.rO) && (this.rN.rE != null))
        this.rN.rE.onDismiss(this.mView);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     android.support.design.widget.n.b
 * JD-Core Version:    0.6.2
 */