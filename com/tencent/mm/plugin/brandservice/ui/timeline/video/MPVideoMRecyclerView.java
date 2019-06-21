package com.tencent.mm.plugin.brandservice.ui.timeline.video;

import a.f.b.j;
import a.l;
import a.v;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.widget.recyclerview.MRecyclerView;
import com.tencent.mm.plugin.brandservice.ui.widget.MPVideoView;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/brandservice/ui/timeline/video/MPVideoMRecyclerView;", "Lcom/tencent/mm/plugin/appbrand/widget/recyclerview/MRecyclerView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "TAG", "", "animationContainerContainer", "Landroid/view/View;", "canScroll", "", "downY", "", "hasDown", "maxVideoHeight", "", "minVideoHeight", "moveY", "videoView", "Lcom/tencent/mm/plugin/brandservice/ui/widget/MPVideoView;", "videoViewContainer", "Landroid/widget/FrameLayout;", "deltaY", "inScrollRange", "curHeight", "onTouchEvent", "event", "Landroid/view/MotionEvent;", "setParam", "", "animationView", "maxHeight", "minHeight", "setVideoHeight", "videoHeight", "plugin-brandservice_release"})
public final class MPVideoMRecyclerView extends MRecyclerView
{
  private final String TAG = "MicroMsg.MPVideoMRecyclerView";
  private int bpm;
  private boolean canScroll = true;
  private float hkf;
  private float hkh;
  private int jWw;
  private MPVideoView jXP;
  private FrameLayout jXQ;
  private View jXR;
  private boolean jXS;

  public MPVideoMRecyclerView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  private final void setVideoHeight(int paramInt)
  {
    AppMethodBeat.i(15271);
    Object localObject = this.jXQ;
    if (localObject == null)
      j.avw("videoViewContainer");
    ViewGroup.LayoutParams localLayoutParams = ((FrameLayout)localObject).getLayoutParams();
    if (localLayoutParams == null)
    {
      localObject = new v("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
      AppMethodBeat.o(15271);
      throw ((Throwable)localObject);
    }
    localLayoutParams.height = paramInt;
    localObject = this.jXQ;
    if (localObject == null)
      j.avw("videoViewContainer");
    ((FrameLayout)localObject).setLayoutParams(localLayoutParams);
    localObject = this.jXR;
    if (localObject == null)
      j.avw("animationContainerContainer");
    if (((View)localObject).getVisibility() == 0)
    {
      localObject = this.jXR;
      if (localObject == null)
        j.avw("animationContainerContainer");
      localLayoutParams = ((View)localObject).getLayoutParams();
      if (localLayoutParams == null)
      {
        localObject = new v("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        AppMethodBeat.o(15271);
        throw ((Throwable)localObject);
      }
      localLayoutParams.height = paramInt;
      localObject = this.jXR;
      if (localObject == null)
        j.avw("animationContainerContainer");
      ((View)localObject).setLayoutParams(localLayoutParams);
    }
    AppMethodBeat.o(15271);
  }

  public final void a(MPVideoView paramMPVideoView, FrameLayout paramFrameLayout, View paramView, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(15269);
    j.p(paramMPVideoView, "videoView");
    j.p(paramFrameLayout, "videoViewContainer");
    j.p(paramView, "animationView");
    this.bpm = paramInt1;
    this.jWw = paramInt2;
    this.jXP = paramMPVideoView;
    this.jXQ = paramFrameLayout;
    this.jXR = paramView;
    AppMethodBeat.o(15269);
  }

  public final boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    int i = 1;
    AppMethodBeat.i(15270);
    Object localObject = this.jXQ;
    if (localObject == null)
      j.avw("videoViewContainer");
    int j = ((FrameLayout)localObject).getHeight();
    if (paramMotionEvent != null)
    {
      localObject = Integer.valueOf(paramMotionEvent.getAction());
      if (localObject != null)
        break label73;
      label44: if (localObject != null)
        break label96;
      label48: if (localObject != null)
        break label373;
    }
    while (true)
    {
      boolean bool = super.onTouchEvent(paramMotionEvent);
      AppMethodBeat.o(15270);
      return bool;
      localObject = null;
      break;
      label73: if (((Integer)localObject).intValue() != 0)
        break label44;
      this.hkf = paramMotionEvent.getRawY();
      this.jXS = true;
      continue;
      label96: if (((Integer)localObject).intValue() != 2)
        break label48;
      if (!this.jXS)
      {
        this.hkf = paramMotionEvent.getRawY();
        this.jXS = true;
      }
      this.hkh = paramMotionEvent.getRawY();
      float f = (this.hkh - this.hkf) * 1.2F;
      j = (int)(j + f);
      label165: int m;
      if (f == 0.0F)
      {
        bool = false;
        this.canScroll = bool;
        if (this.canScroll)
        {
          int k = this.jWw;
          m = this.bpm;
          if (k <= j)
            break label323;
          label197: i = 0;
          label199: if (i == 0)
            break label333;
          setVideoHeight(j);
        }
      }
      while (true)
      {
        this.hkf = this.hkh;
        break;
        if (f > 0.0F)
        {
          localObject = this.jXQ;
          if (localObject == null)
            j.avw("videoViewContainer");
          if (((FrameLayout)localObject).getHeight() >= this.bpm)
          {
            bool = false;
            break label165;
          }
        }
        if (f < 0.0F)
        {
          localObject = this.jXQ;
          if (localObject == null)
            j.avw("videoViewContainer");
          if (((FrameLayout)localObject).getHeight() <= this.jWw)
          {
            bool = false;
            break label165;
          }
        }
        if ((f > 0.0F) && (canScrollVertically(-1)))
        {
          bool = false;
          break label165;
        }
        bool = true;
        break label165;
        label323: if (m < j)
          break label197;
        break label199;
        label333: if (j <= this.jWw)
          setVideoHeight(this.jWw);
        else if (j >= this.bpm)
          setVideoHeight(this.bpm);
      }
      label373: if (((Integer)localObject).intValue() == 1)
        this.jXS = false;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.timeline.video.MPVideoMRecyclerView
 * JD-Core Version:    0.6.2
 */