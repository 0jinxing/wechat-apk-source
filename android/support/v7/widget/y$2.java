package android.support.v7.widget;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.Iterator;

final class y$2
  implements Runnable
{
  y$2(y paramy, ArrayList paramArrayList)
  {
  }

  public final void run()
  {
    Iterator localIterator = this.ahB.iterator();
    if (localIterator.hasNext())
    {
      y.a locala = (y.a)localIterator.next();
      y localy = this.ahA;
      Object localObject1 = locala.ahL;
      if (localObject1 == null)
      {
        localObject1 = null;
        label46: localObject2 = locala.ahM;
        if (localObject2 == null)
          break label229;
      }
      label229: for (Object localObject2 = ((RecyclerView.v)localObject2).apJ; ; localObject2 = null)
      {
        if (localObject1 != null)
        {
          ViewPropertyAnimator localViewPropertyAnimator = ((View)localObject1).animate().setDuration(localy.aow);
          localy.ahy.add(locala.ahL);
          localViewPropertyAnimator.translationX(locala.ahP - locala.ahN);
          localViewPropertyAnimator.translationY(locala.ahQ - locala.ahO);
          localViewPropertyAnimator.alpha(0.0F).setListener(new y.7(localy, locala, localViewPropertyAnimator, (View)localObject1)).start();
        }
        if (localObject2 == null)
          break;
        localObject1 = ((View)localObject2).animate();
        localy.ahy.add(locala.ahM);
        ((ViewPropertyAnimator)localObject1).translationX(0.0F).translationY(0.0F).setDuration(localy.aow).alpha(1.0F).setListener(new y.8(localy, locala, (ViewPropertyAnimator)localObject1, (View)localObject2)).start();
        break;
        localObject1 = ((RecyclerView.v)localObject1).apJ;
        break label46;
      }
    }
    this.ahB.clear();
    this.ahA.ahu.remove(this.ahB);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.y.2
 * JD-Core Version:    0.6.2
 */