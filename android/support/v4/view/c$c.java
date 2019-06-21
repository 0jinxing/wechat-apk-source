package android.support.v4.view;

import android.content.Context;
import android.view.GestureDetector;
import android.view.GestureDetector.OnGestureListener;
import android.view.MotionEvent;

final class c$c
  implements c.a
{
  private final GestureDetector Mh;

  c$c(Context paramContext, GestureDetector.OnGestureListener paramOnGestureListener)
  {
    this.Mh = new GestureDetector(paramContext, paramOnGestureListener, null);
  }

  public final boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    return this.Mh.onTouchEvent(paramMotionEvent);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     android.support.v4.view.c.c
 * JD-Core Version:    0.6.2
 */