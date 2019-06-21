package android.support.v7.widget.a;

import android.support.v4.view.c;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.l;
import android.support.v7.widget.RecyclerView.v;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import java.util.List;

final class a$2
  implements RecyclerView.l
{
  a$2(a parama)
  {
  }

  public final void ab(boolean paramBoolean)
  {
    if (!paramBoolean);
    while (true)
    {
      return;
      this.avH.e(null, 0);
    }
  }

  public final boolean h(MotionEvent paramMotionEvent)
  {
    this.avH.avD.onTouchEvent(paramMotionEvent);
    int i = paramMotionEvent.getActionMasked();
    Object localObject1;
    if (i == 0)
    {
      this.avH.mActivePointerId = paramMotionEvent.getPointerId(0);
      this.avH.avm = paramMotionEvent.getX();
      this.avH.avn = paramMotionEvent.getY();
      localObject1 = this.avH;
      if (((a)localObject1).mVelocityTracker != null)
        ((a)localObject1).mVelocityTracker.recycle();
      ((a)localObject1).mVelocityTracker = VelocityTracker.obtain();
      if (this.avH.avl == null)
      {
        a locala = this.avH;
        if (locala.avx.isEmpty())
          break label338;
        Object localObject2 = locala.k(paramMotionEvent);
        i = locala.avx.size() - 1;
        if (i < 0)
          break label338;
        localObject1 = (a.c)locala.avx.get(i);
        if (((a.c)localObject1).aoM.apJ != localObject2)
          break label332;
        label162: if (localObject1 != null)
        {
          localObject2 = this.avH;
          ((a)localObject2).avm -= ((a.c)localObject1).avX;
          localObject2 = this.avH;
          ((a)localObject2).avn -= ((a.c)localObject1).avY;
          this.avH.b(((a.c)localObject1).aoM, true);
          if (this.avH.avj.remove(((a.c)localObject1).aoM.apJ))
            this.avH.avu.a(this.avH.aiB, ((a.c)localObject1).aoM);
          this.avH.e(((a.c)localObject1).aoM, ((a.c)localObject1).avv);
          this.avH.a(paramMotionEvent, this.avH.avw, 0);
        }
      }
      label295: if (this.avH.mVelocityTracker != null)
        this.avH.mVelocityTracker.addMovement(paramMotionEvent);
      if (this.avH.avl == null)
        break label417;
    }
    label417: for (boolean bool = true; ; bool = false)
    {
      return bool;
      label332: i--;
      break;
      label338: localObject1 = null;
      break label162;
      if ((i == 3) || (i == 1))
      {
        this.avH.mActivePointerId = -1;
        this.avH.e(null, 0);
        break label295;
      }
      if (this.avH.mActivePointerId == -1)
        break label295;
      int j = paramMotionEvent.findPointerIndex(this.avH.mActivePointerId);
      if (j < 0)
        break label295;
      this.avH.a(i, paramMotionEvent, j);
      break label295;
    }
  }

  public final void i(MotionEvent paramMotionEvent)
  {
    int i = 0;
    this.avH.avD.onTouchEvent(paramMotionEvent);
    if (this.avH.mVelocityTracker != null)
      this.avH.mVelocityTracker.addMovement(paramMotionEvent);
    if (this.avH.mActivePointerId == -1);
    while (true)
    {
      return;
      int j = paramMotionEvent.getActionMasked();
      int k = paramMotionEvent.findPointerIndex(this.avH.mActivePointerId);
      if (k >= 0)
        this.avH.a(j, paramMotionEvent, k);
      RecyclerView.v localv = this.avH.avl;
      if (localv != null)
        switch (j)
        {
        case 4:
        case 5:
        default:
          break;
        case 1:
        case 2:
        case 3:
          while (true)
          {
            this.avH.e(null, 0);
            this.avH.mActivePointerId = -1;
            break;
            if (k < 0)
              break;
            this.avH.a(paramMotionEvent, this.avH.avw, k);
            this.avH.M(localv);
            this.avH.aiB.removeCallbacks(this.avH.avy);
            this.avH.avy.run();
            this.avH.aiB.invalidate();
            break;
            if (this.avH.mVelocityTracker != null)
              this.avH.mVelocityTracker.clear();
          }
        case 6:
          j = paramMotionEvent.getActionIndex();
          if (paramMotionEvent.getPointerId(j) == this.avH.mActivePointerId)
          {
            if (j == 0)
              i = 1;
            this.avH.mActivePointerId = paramMotionEvent.getPointerId(i);
            this.avH.a(paramMotionEvent, this.avH.avw, j);
          }
          break;
        }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.a.a.2
 * JD-Core Version:    0.6.2
 */