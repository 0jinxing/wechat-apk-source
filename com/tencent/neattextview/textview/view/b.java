package com.tencent.neattextview.textview.view;

import android.content.Context;
import android.text.style.ClickableSpan;
import android.view.GestureDetector;
import android.view.GestureDetector.OnDoubleTapListener;
import android.view.GestureDetector.OnGestureListener;
import android.view.MotionEvent;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.neattextview.textview.b.c;
import java.util.Iterator;
import java.util.List;

public class b
  implements GestureDetector.OnDoubleTapListener, GestureDetector.OnGestureListener, NeatTextView.c
{
  private a Aln;
  private com.tencent.neattextview.textview.layout.a Alo;
  protected c Alp;
  private GestureDetector iay;
  protected View mView;

  public b(Context paramContext, a parama)
  {
    AppMethodBeat.i(3320);
    this.Aln = parama;
    this.iay = new GestureDetector(paramContext, this);
    this.iay.setOnDoubleTapListener(this);
    AppMethodBeat.o(3320);
  }

  protected void cancel(int paramInt)
  {
    AppMethodBeat.i(3326);
    if (this.Alp != null)
    {
      this.Alp.ozq = false;
      this.mView.invalidate();
      this.Alp = null;
    }
    AppMethodBeat.o(3326);
  }

  public boolean onDoubleTap(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(3327);
    boolean bool;
    if (this.Aln.getOnDoubleClickListener() != null)
    {
      this.Aln.getOnDoubleClickListener().fi(this.mView);
      bool = true;
      AppMethodBeat.o(3327);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(3327);
    }
  }

  public boolean onDoubleTapEvent(MotionEvent paramMotionEvent)
  {
    return false;
  }

  public boolean onDown(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(3322);
    boolean bool;
    if (this.Aln.dPq())
    {
      AppMethodBeat.o(3322);
      bool = false;
    }
    while (true)
    {
      return bool;
      Iterator localIterator = this.Alo.dPf().iterator();
      while (true)
        if (localIterator.hasNext())
        {
          c localc = (c)localIterator.next();
          if (localc.ak(paramMotionEvent.getX() - this.Aln.getHorizontalOffset(), paramMotionEvent.getY() - this.Aln.getVerticalOffset()))
          {
            this.Alp = localc;
            localc.ozq = true;
            this.mView.postInvalidate();
            AppMethodBeat.o(3322);
            bool = true;
            break;
          }
        }
      AppMethodBeat.o(3322);
      bool = false;
    }
  }

  public boolean onFling(MotionEvent paramMotionEvent1, MotionEvent paramMotionEvent2, float paramFloat1, float paramFloat2)
  {
    AppMethodBeat.i(3325);
    cancel(3);
    AppMethodBeat.o(3325);
    return false;
  }

  public void onLongPress(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(3324);
    cancel(1);
    AppMethodBeat.o(3324);
  }

  public boolean onScroll(MotionEvent paramMotionEvent1, MotionEvent paramMotionEvent2, float paramFloat1, float paramFloat2)
  {
    return false;
  }

  public void onShowPress(MotionEvent paramMotionEvent)
  {
  }

  public boolean onSingleTapConfirmed(MotionEvent paramMotionEvent)
  {
    return false;
  }

  public boolean onSingleTapUp(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(3323);
    if (this.Aln.dPq())
      AppMethodBeat.o(3323);
    while (true)
    {
      return false;
      if (this.Alp != null)
      {
        paramMotionEvent = this.Alp;
        View localView = this.mView;
        if (paramMotionEvent.AjW != null)
          ((ClickableSpan)paramMotionEvent.AjW).onClick(localView);
      }
      AppMethodBeat.o(3323);
    }
  }

  public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(3321);
    boolean bool;
    if (this.Aln.getLayout() == null)
    {
      bool = false;
      AppMethodBeat.o(3321);
    }
    while (true)
    {
      return bool;
      this.Alo = this.Aln.getLayout();
      this.mView = paramView;
      bool = this.iay.onTouchEvent(paramMotionEvent);
      if ((paramMotionEvent.getAction() == 3) || (paramMotionEvent.getAction() == 1))
        cancel(2);
      AppMethodBeat.o(3321);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.neattextview.textview.view.b
 * JD-Core Version:    0.6.2
 */