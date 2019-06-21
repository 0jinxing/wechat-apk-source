package android.support.transition;

import android.view.View;
import java.util.ArrayList;

final class g$2
  implements Transition.c
{
  g$2(g paramg, View paramView, ArrayList paramArrayList)
  {
  }

  public final void a(Transition paramTransition)
  {
    paramTransition.b(this);
    this.yx.setVisibility(8);
    int i = this.yy.size();
    for (int j = 0; j < i; j++)
      ((View)this.yy.get(j)).setVisibility(0);
  }

  public final void cO()
  {
  }

  public final void cP()
  {
  }

  public final void cT()
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     android.support.transition.g.2
 * JD-Core Version:    0.6.2
 */