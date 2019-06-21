package android.support.v7.widget;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.Iterator;

final class y$3
  implements Runnable
{
  y$3(y paramy, ArrayList paramArrayList)
  {
  }

  public final void run()
  {
    Iterator localIterator = this.ahC.iterator();
    while (localIterator.hasNext())
    {
      RecyclerView.v localv = (RecyclerView.v)localIterator.next();
      y localy = this.ahA;
      View localView = localv.apJ;
      ViewPropertyAnimator localViewPropertyAnimator = localView.animate();
      localy.ahv.add(localv);
      localViewPropertyAnimator.alpha(1.0F).setDuration(localy.aot).setListener(new y.5(localy, localv, localView, localViewPropertyAnimator)).start();
    }
    this.ahC.clear();
    this.ahA.ahs.remove(this.ahC);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.y.3
 * JD-Core Version:    0.6.2
 */