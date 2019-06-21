package android.support.v7.widget.a;

import android.graphics.Rect;
import android.support.v4.view.s;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.i;
import android.support.v7.widget.RecyclerView.v;
import android.view.View;

final class a$1
  implements Runnable
{
  a$1(a parama)
  {
  }

  public final void run()
  {
    int i = 0;
    a locala;
    long l1;
    long l2;
    Object localObject;
    int j;
    int k;
    label139: int m;
    label193: a.a locala1;
    if (this.avH.avl != null)
    {
      locala = this.avH;
      if (locala.avl == null)
        break label533;
      l1 = System.currentTimeMillis();
      if (locala.avG != -9223372036854775808L)
        break label396;
      l2 = 0L;
      localObject = locala.aiB.getLayoutManager();
      if (locala.oT == null)
        locala.oT = new Rect();
      ((RecyclerView.i)localObject).g(locala.avl.apJ, locala.oT);
      if (!((RecyclerView.i)localObject).iG())
        break label464;
      j = (int)(locala.avs + locala.avq);
      k = j - locala.oT.left - locala.aiB.getPaddingLeft();
      if ((locala.avq >= 0.0F) || (k >= 0))
        break label407;
      if (!((RecyclerView.i)localObject).iH())
        break label527;
      m = (int)(locala.avt + locala.avr);
      j = m - locala.oT.top - locala.aiB.getPaddingTop();
      if ((locala.avr >= 0.0F) || (j >= 0))
        break label470;
      if (k == 0)
        break label549;
      locala1 = locala.avu;
      localObject = locala.aiB;
      m = locala.avl.apJ.getWidth();
      locala.aiB.getWidth();
      k = locala1.a((RecyclerView)localObject, m, k, l2);
    }
    label396: label407: label549: 
    while (true)
    {
      if (j != 0)
      {
        locala1 = locala.avu;
        localObject = locala.aiB;
        m = locala.avl.apJ.getHeight();
        locala.aiB.getHeight();
        j = locala1.a((RecyclerView)localObject, m, j, l2);
      }
      while (true)
      {
        if ((k != 0) || (j != 0))
        {
          if (locala.avG == -9223372036854775808L)
            locala.avG = l1;
          locala.aiB.scrollBy(k, j);
        }
        for (k = 1; ; k = i)
        {
          if (k != 0)
          {
            if (this.avH.avl != null)
              this.avH.M(this.avH.avl);
            this.avH.aiB.removeCallbacks(this.avH.avy);
            s.b(this.avH.aiB, this);
          }
          return;
          l2 = l1 - locala.avG;
          break;
          if (locala.avq > 0.0F)
          {
            j = j + locala.avl.apJ.getWidth() + locala.oT.right - (locala.aiB.getWidth() - locala.aiB.getPaddingRight());
            k = j;
            if (j > 0)
              break label139;
          }
          label464: k = 0;
          break label139;
          label470: if (locala.avr > 0.0F)
          {
            m = m + locala.avl.apJ.getHeight() + locala.oT.bottom - (locala.aiB.getHeight() - locala.aiB.getPaddingBottom());
            j = m;
            if (m > 0)
              break label193;
          }
          j = 0;
          break label193;
          locala.avG = -9223372036854775808L;
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.a.a.1
 * JD-Core Version:    0.6.2
 */