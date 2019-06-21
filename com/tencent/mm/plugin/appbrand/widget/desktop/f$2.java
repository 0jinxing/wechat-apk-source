package com.tencent.mm.plugin.appbrand.widget.desktop;

import android.support.v7.widget.RecyclerView.f;
import android.support.v7.widget.RecyclerView.v;
import android.view.View;
import android.view.ViewPropertyAnimator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Iterator;

final class f$2
  implements Runnable
{
  f$2(f paramf, ArrayList paramArrayList)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(133903);
    Iterator localIterator = this.ahB.iterator();
    if (localIterator.hasNext())
    {
      f.a locala = (f.a)localIterator.next();
      f localf = this.iYC;
      Object localObject1 = locala.ahL;
      if (localObject1 == null)
      {
        localObject1 = null;
        label51: localObject2 = locala.ahM;
        if (localObject2 == null)
          break label234;
      }
      label234: for (Object localObject2 = ((RecyclerView.v)localObject2).apJ; ; localObject2 = null)
      {
        if (localObject1 != null)
        {
          ViewPropertyAnimator localViewPropertyAnimator = ((View)localObject1).animate().setDuration(localf.aow);
          localf.ahy.add(locala.ahL);
          localViewPropertyAnimator.translationX(locala.ahP - locala.ahN);
          localViewPropertyAnimator.translationY(locala.ahQ - locala.ahO);
          localViewPropertyAnimator.alpha(0.0F).setListener(new f.7(localf, locala, localViewPropertyAnimator, (View)localObject1)).start();
        }
        if (localObject2 == null)
          break;
        localObject1 = ((View)localObject2).animate();
        localf.ahy.add(locala.ahM);
        ((ViewPropertyAnimator)localObject1).translationX(0.0F).translationY(0.0F).setDuration(localf.aow).alpha(1.0F).setListener(new f.8(localf, locala, (ViewPropertyAnimator)localObject1, (View)localObject2)).start();
        break;
        localObject1 = ((RecyclerView.v)localObject1).apJ;
        break label51;
      }
    }
    this.ahB.clear();
    this.iYC.ahu.remove(this.ahB);
    AppMethodBeat.o(133903);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.desktop.f.2
 * JD-Core Version:    0.6.2
 */