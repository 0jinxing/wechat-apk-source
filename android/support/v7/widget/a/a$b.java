package android.support.v7.widget.a;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.v;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.View;

final class a$b extends GestureDetector.SimpleOnGestureListener
{
  boolean avP = true;

  a$b(a parama)
  {
  }

  public final boolean onDown(MotionEvent paramMotionEvent)
  {
    return true;
  }

  public final void onLongPress(MotionEvent paramMotionEvent)
  {
    if (!this.avP);
    while (true)
    {
      return;
      Object localObject = this.avH.k(paramMotionEvent);
      if (localObject != null)
      {
        localObject = this.avH.aiB.aZ((View)localObject);
        if (localObject != null)
        {
          a.a.j(this.avH.aiB);
          if (paramMotionEvent.getPointerId(0) == this.avH.mActivePointerId)
          {
            int i = paramMotionEvent.findPointerIndex(this.avH.mActivePointerId);
            float f1 = paramMotionEvent.getX(i);
            float f2 = paramMotionEvent.getY(i);
            this.avH.avm = f1;
            this.avH.avn = f2;
            paramMotionEvent = this.avH;
            this.avH.avr = 0.0F;
            paramMotionEvent.avq = 0.0F;
            this.avH.e((RecyclerView.v)localObject, 2);
          }
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.a.a.b
 * JD-Core Version:    0.6.2
 */