package com.tencent.mm.ui.tools;

import android.content.Context;
import android.view.GestureDetector;
import android.view.GestureDetector.OnGestureListener;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.ab;

public final class i
  implements GestureDetector.OnGestureListener
{
  private final int LL;
  private final int LM;
  public final GestureDetector aJM;
  private final Context context;
  private final float zFA;
  public i.a zFy;
  private final float zFz;

  public i(Context paramContext)
  {
    AppMethodBeat.i(107656);
    this.context = paramContext;
    this.aJM = new GestureDetector(this.context, this);
    ViewConfiguration localViewConfiguration = ViewConfiguration.get(paramContext);
    this.LL = localViewConfiguration.getScaledMinimumFlingVelocity();
    this.LM = localViewConfiguration.getScaledMaximumFlingVelocity();
    this.zFz = BackwardSupportUtil.b.b(paramContext, 70.0F);
    this.zFA = BackwardSupportUtil.b.b(paramContext, 50.0F);
    AppMethodBeat.o(107656);
  }

  public final boolean onDown(MotionEvent paramMotionEvent)
  {
    return false;
  }

  public final boolean onFling(MotionEvent paramMotionEvent1, MotionEvent paramMotionEvent2, float paramFloat1, float paramFloat2)
  {
    boolean bool = true;
    AppMethodBeat.i(107657);
    if (this.zFy == null)
      AppMethodBeat.o(107657);
    while (true)
    {
      return bool;
      ab.v("MicroMsg.MMGestureDetector", "lastX:%f, curX:%f, lastY:%f, curY:%f, vX:%f, vY:%f", new Object[] { Float.valueOf(paramMotionEvent1.getX()), Float.valueOf(paramMotionEvent2.getX()), Float.valueOf(paramMotionEvent1.getY()), Float.valueOf(paramMotionEvent2.getY()), Float.valueOf(paramFloat1), Float.valueOf(paramFloat2) });
      float f1 = Math.abs(paramMotionEvent2.getY() - paramMotionEvent1.getY());
      float f2 = Math.abs(paramMotionEvent2.getX() - paramMotionEvent1.getX());
      if ((f1 < this.zFA) && (paramFloat1 > 800.0F) && (f2 > this.zFz))
      {
        AppMethodBeat.o(107657);
      }
      else if ((f1 < this.zFA) && (paramFloat1 < -800.0F) && (f2 < -this.zFz))
      {
        AppMethodBeat.o(107657);
      }
      else if ((f2 < this.zFA) && (paramFloat2 > 800.0F))
      {
        AppMethodBeat.o(107657);
      }
      else if ((f2 < this.zFA) && (paramFloat2 < -800.0F))
      {
        AppMethodBeat.o(107657);
      }
      else
      {
        AppMethodBeat.o(107657);
        bool = false;
      }
    }
  }

  public final void onLongPress(MotionEvent paramMotionEvent)
  {
  }

  public final boolean onScroll(MotionEvent paramMotionEvent1, MotionEvent paramMotionEvent2, float paramFloat1, float paramFloat2)
  {
    return false;
  }

  public final void onShowPress(MotionEvent paramMotionEvent)
  {
  }

  public final boolean onSingleTapUp(MotionEvent paramMotionEvent)
  {
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.i
 * JD-Core Version:    0.6.2
 */