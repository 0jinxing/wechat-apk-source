package android.support.design.widget;

import android.support.v4.view.s;
import android.widget.OverScroller;

final class HeaderBehavior$a
  implements Runnable
{
  private final CoordinatorLayout qP;
  private final V qQ;

  HeaderBehavior$a(CoordinatorLayout paramCoordinatorLayout, V paramV)
  {
    this.qP = paramV;
    Object localObject;
    this.qQ = localObject;
  }

  public final void run()
  {
    if ((this.qQ != null) && (this.qR.qN != null))
    {
      if (!this.qR.qN.computeScrollOffset())
        break label65;
      this.qR.c(this.qP, this.qQ, this.qR.qN.getCurrY());
      s.b(this.qQ, this);
    }
    while (true)
    {
      return;
      label65: this.qR.a(this.qP, this.qQ);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     android.support.design.widget.HeaderBehavior.a
 * JD-Core Version:    0.6.2
 */