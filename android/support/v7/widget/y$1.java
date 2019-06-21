package android.support.v7.widget;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.Iterator;

final class y$1
  implements Runnable
{
  y$1(y paramy, ArrayList paramArrayList)
  {
  }

  public final void run()
  {
    Iterator localIterator = this.ahz.iterator();
    while (localIterator.hasNext())
    {
      Object localObject = (y.b)localIterator.next();
      y localy = this.ahA;
      RecyclerView.v localv = ((y.b)localObject).ahR;
      int i = ((y.b)localObject).ahN;
      int j = ((y.b)localObject).ahO;
      int k = ((y.b)localObject).ahP;
      int m = ((y.b)localObject).ahQ;
      localObject = localv.apJ;
      k -= i;
      j = m - j;
      if (k != 0)
        ((View)localObject).animate().translationX(0.0F);
      if (j != 0)
        ((View)localObject).animate().translationY(0.0F);
      ViewPropertyAnimator localViewPropertyAnimator = ((View)localObject).animate();
      localy.ahw.add(localv);
      localViewPropertyAnimator.setDuration(localy.aov).setListener(new y.6(localy, localv, k, (View)localObject, j, localViewPropertyAnimator)).start();
    }
    this.ahz.clear();
    this.ahA.aht.remove(this.ahz);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.y.1
 * JD-Core Version:    0.6.2
 */