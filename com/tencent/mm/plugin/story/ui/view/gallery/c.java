package com.tencent.mm.plugin.story.ui.view.gallery;

import a.f.b.j;
import a.l;
import android.content.Context;
import android.os.Vibrator;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.ui.aj;
import com.tencent.mm.ui.widget.listview.PullDownListView;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/ui/view/gallery/GalleryDragCloseConsumer;", "Lcom/tencent/mm/plugin/story/ui/view/gallery/GalleryScrollConsumer;", "()V", "downX", "", "downY", "lastScrollType", "", "mStoryView", "Landroid/view/View;", "getMStoryView", "()Landroid/view/View;", "setMStoryView", "(Landroid/view/View;)V", "mWrapperView", "Lcom/tencent/mm/ui/widget/listview/PullDownListView;", "getMWrapperView", "()Lcom/tencent/mm/ui/widget/listview/PullDownListView;", "setMWrapperView", "(Lcom/tencent/mm/ui/widget/listview/PullDownListView;)V", "moveUpLimit", "pointerId", "touchConsumed", "", "touchX", "touchY", "velocityTracker", "Landroid/view/VelocityTracker;", "dispatchTouchEvent", "event", "Landroid/view/MotionEvent;", "isTouchMoved", "scrollType", "getScrollDirection", "releaseVelocityTracker", "", "scaleBackOverScroll", "offset", "plugin-story_release"})
public final class c extends e
{
  private float faK;
  private float faL;
  private float hke;
  private float hkf;
  private VelocityTracker oaQ;
  private int ozo;
  PullDownListView snD;
  View snE;
  private int snF;
  private boolean snG;
  private int snH;

  public c()
  {
    AppMethodBeat.i(110709);
    this.snF = aj.fromDPToPix(ah.getContext(), 30);
    AppMethodBeat.o(110709);
  }

  public final boolean a(MotionEvent paramMotionEvent, boolean paramBoolean, int paramInt)
  {
    float f1 = 0.0F;
    AppMethodBeat.i(110708);
    j.p(paramMotionEvent, "event");
    if (this.oaQ == null)
      this.oaQ = VelocityTracker.obtain();
    Object localObject = this.oaQ;
    if (localObject != null)
      ((VelocityTracker)localObject).addMovement(paramMotionEvent);
    switch (paramMotionEvent.getActionMasked())
    {
    default:
    case 0:
    case 2:
    case 1:
    case 3:
    }
    while (true)
    {
      paramBoolean = this.snG;
      AppMethodBeat.o(110708);
      return paramBoolean;
      this.ozo = paramMotionEvent.getPointerId(0);
      this.hke = paramMotionEvent.getRawX();
      this.hkf = paramMotionEvent.getRawY();
      this.snG = false;
      this.snH = 0;
      continue;
      if (paramBoolean)
      {
        this.snH = paramInt;
        this.faK = paramMotionEvent.getRawX();
        this.faL = paramMotionEvent.getRawY();
        float f2 = this.faL - this.hkf;
        localObject = this.oaQ;
        if (localObject != null)
          ((VelocityTracker)localObject).computeCurrentVelocity(1000);
        localObject = this.oaQ;
        if (localObject != null);
        for (float f3 = ((VelocityTracker)localObject).getXVelocity(this.ozo); ; f3 = 0.0F)
        {
          localObject = this.oaQ;
          if (localObject != null)
            f1 = ((VelocityTracker)localObject).getYVelocity(this.ozo);
          if (paramInt != 1)
            break label294;
          this.snG = true;
          if ((Math.abs(f2) <= this.snF) || (Math.abs(f1) <= Math.abs(f3)))
            break;
          localObject = this.snD;
          if (localObject == null)
            break;
          ((PullDownListView)localObject).dispatchTouchEvent(paramMotionEvent);
          break;
        }
        label294: if (paramInt == 2)
        {
          this.snG = true;
          paramMotionEvent = this.snE;
          if (paramMotionEvent != null);
          for (paramMotionEvent = paramMotionEvent.getLayoutParams(); ; paramMotionEvent = null)
          {
            paramMotionEvent = (ViewGroup.MarginLayoutParams)paramMotionEvent;
            if ((this.snD == null) || (paramMotionEvent == null))
              break;
            paramMotionEvent.topMargin = ((int)(f2 / 15.0F));
            localObject = this.snE;
            if (localObject == null)
              break;
            ((View)localObject).setLayoutParams((ViewGroup.LayoutParams)paramMotionEvent);
            break;
          }
          localObject = this.oaQ;
          if (localObject != null)
            ((VelocityTracker)localObject).clear();
          localObject = this.oaQ;
          if (localObject != null)
            ((VelocityTracker)localObject).recycle();
          this.oaQ = null;
          if (this.snH == 1)
          {
            localObject = this.snD;
            if (localObject != null)
              ((PullDownListView)localObject).dispatchTouchEvent(paramMotionEvent);
          }
          else if (this.snH == 2)
          {
            paramMotionEvent = this.snD;
            if (paramMotionEvent != null)
              paramMotionEvent.dLf();
            localObject = ah.getContext().getSystemService("vibrator");
            paramMotionEvent = (MotionEvent)localObject;
            if (!(localObject instanceof Vibrator))
              paramMotionEvent = null;
            paramMotionEvent = (Vibrator)paramMotionEvent;
            if (paramMotionEvent != null)
              paramMotionEvent.vibrate(10L);
          }
        }
      }
    }
  }

  public final int cCD()
  {
    return 3;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.view.gallery.c
 * JD-Core Version:    0.6.2
 */