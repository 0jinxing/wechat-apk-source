package com.tencent.mm.plugin.story.ui.view.gallery;

import a.f.b.j;
import a.l;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewPropertyAnimator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;
import com.tencent.mm.sdk.platformtools.ah;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/ui/view/gallery/GallerySwipeBackConsumer;", "Lcom/tencent/mm/plugin/story/ui/view/gallery/GalleryScrollConsumer;", "galleryView", "Landroid/view/View;", "galleryScaleListener", "Lcom/tencent/mm/plugin/story/ui/view/gallery/StoryGalleryView$IOnGalleryScale;", "(Landroid/view/View;Lcom/tencent/mm/plugin/story/ui/view/gallery/StoryGalleryView$IOnGalleryScale;)V", "consumed", "", "currScrollType", "", "downX", "", "downY", "getGalleryScaleListener", "()Lcom/tencent/mm/plugin/story/ui/view/gallery/StoryGalleryView$IOnGalleryScale;", "getGalleryView", "()Landroid/view/View;", "maxDownX", "moveExitY", "totalMovedX", "totalMovedY", "velocityTracker", "Landroid/view/VelocityTracker;", "dispatchTouchEvent", "event", "Landroid/view/MotionEvent;", "isTouchMoved", "scrollType", "getScrollDirection", "releaseVelocityTracker", "", "touchRelease", "touchTranslate", "Companion", "plugin-story_release"})
public final class h extends e
{
  private static final String TAG = "MicroMsg.GallerySwipeBackConsumer";
  public static final h.a soA;
  private float hke;
  private float hkf;
  private VelocityTracker oaQ;
  private int snR;
  private int sot;
  private final int sou;
  private float sov;
  private float sow;
  private boolean sox;
  private final View soy;
  private final l.b soz;

  static
  {
    AppMethodBeat.i(110749);
    soA = new h.a((byte)0);
    TAG = "MicroMsg.GallerySwipeBackConsumer";
    AppMethodBeat.o(110749);
  }

  public h(View paramView, l.b paramb)
  {
    AppMethodBeat.i(110748);
    this.soy = paramView;
    this.soz = paramb;
    this.sot = a.fromDPToPix(ah.getContext(), 32);
    this.sou = a.fromDPToPix(ah.getContext(), 96);
    AppMethodBeat.o(110748);
  }

  private final void lA()
  {
    AppMethodBeat.i(110747);
    VelocityTracker localVelocityTracker = this.oaQ;
    if (localVelocityTracker != null)
      localVelocityTracker.clear();
    localVelocityTracker = this.oaQ;
    if (localVelocityTracker != null)
      localVelocityTracker.recycle();
    this.oaQ = null;
    AppMethodBeat.o(110747);
  }

  public final boolean a(MotionEvent paramMotionEvent, boolean paramBoolean, int paramInt)
  {
    int i = 1;
    boolean bool = true;
    AppMethodBeat.i(110746);
    j.p(paramMotionEvent, "event");
    if (this.oaQ == null)
      this.oaQ = VelocityTracker.obtain();
    VelocityTracker localVelocityTracker = this.oaQ;
    if (localVelocityTracker != null)
      localVelocityTracker.addMovement(paramMotionEvent);
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
      paramBoolean = this.sox;
      AppMethodBeat.o(110746);
      return paramBoolean;
      this.hke = paramMotionEvent.getRawX();
      this.hkf = paramMotionEvent.getRawY();
      continue;
      if (paramBoolean)
      {
        this.snR = paramInt;
        if (paramInt == 8)
        {
          paramBoolean = bool;
          if (this.hke < this.sot);
        }
        else
        {
          if (paramInt != 2)
            break label277;
          paramBoolean = bool;
        }
        label154: this.sox = paramBoolean;
        float f1 = paramMotionEvent.getRawX();
        float f2 = paramMotionEvent.getRawY();
        this.sov = (f1 - this.hke);
        this.sow = (f2 - this.hkf);
        if (this.sox)
        {
          this.soy.animate().cancel();
          if (this.snR == 2);
          for (f2 = this.sow; ; f2 = this.sov * this.soy.getHeight() / this.soy.getWidth())
          {
            f1 = f2;
            if (f2 < 0.0F)
              f1 = 0.0F;
            this.soy.setTranslationY(f1);
            f2 = f1 / this.soy.getHeight();
            this.soz.bc(0.8F - f2);
            break;
            label277: paramBoolean = false;
            break label154;
          }
          if (this.sox)
          {
            paramMotionEvent = this.oaQ;
            if (paramMotionEvent != null)
              paramMotionEvent.computeCurrentVelocity(1000);
            paramMotionEvent = this.oaQ;
            if (paramMotionEvent == null)
              break label445;
            f2 = paramMotionEvent.getXVelocity();
            label347: paramMotionEvent = this.oaQ;
            if (paramMotionEvent == null)
              break label451;
            f1 = paramMotionEvent.getYVelocity();
            label362: if (this.snR != 2)
              break label462;
            paramInt = i;
            if (this.sow <= this.sou)
            {
              if (f1 <= 0.0F)
                break label457;
              paramInt = i;
            }
            label396: if (paramInt == 0)
              break label499;
            paramMotionEvent = com.tencent.mm.plugin.story.g.h.scu;
            com.tencent.mm.plugin.story.g.h.EX(13);
            this.soz.cCg();
          }
          while (true)
          {
            this.snR = 0;
            this.sov = 0.0F;
            this.sow = 0.0F;
            this.sox = false;
            lA();
            break;
            label445: f2 = 0.0F;
            break label347;
            label451: f1 = 0.0F;
            break label362;
            label457: paramInt = 0;
            break label396;
            label462: paramInt = i;
            if (this.sov > this.soy.getWidth() / 2)
              break label396;
            paramInt = i;
            if (f2 > 50.0F)
              break label396;
            paramInt = 0;
            break label396;
            label499: this.soy.animate().translationY(0.0F).start();
          }
          this.snR = 0;
          this.soy.setTranslationY(0.0F);
          this.sov = 0.0F;
          this.sow = 0.0F;
          this.sox = false;
          lA();
        }
      }
    }
  }

  public final int cCD()
  {
    return 10;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.view.gallery.h
 * JD-Core Version:    0.6.2
 */