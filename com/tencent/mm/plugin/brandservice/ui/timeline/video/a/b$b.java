package com.tencent.mm.plugin.brandservice.ui.timeline.video.a;

import a.l;
import a.v;
import android.content.Context;
import android.view.OrientationEventListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.brandservice.ui.widget.MPVideoView;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import java.lang.ref.WeakReference;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"com/tencent/mm/plugin/brandservice/ui/timeline/video/util/BizVideoOrientationHelper$orientationChangeListener$1", "Landroid/view/OrientationEventListener;", "onOrientationChanged", "", "orientation", "", "plugin-brandservice_release"})
public final class b$b extends OrientationEventListener
{
  b$b(Context paramContext, int paramInt)
  {
    super(paramInt, 3);
  }

  public final void onOrientationChanged(int paramInt)
  {
    AppMethodBeat.i(15312);
    if ((!b.a(this.jYt)) || (this.jYt.jYq.get() == null))
      AppMethodBeat.o(15312);
    while (true)
    {
      return;
      if (80 > paramInt)
      {
        label42: if (260 <= paramInt)
          break label103;
        label49: if (170 <= paramInt)
          break label116;
        label56: if ((paramInt >= 10) && (paramInt <= 350))
          break label130;
        paramInt = 0;
      }
      while (true)
        if (b.b(this.jYt) == paramInt)
        {
          AppMethodBeat.o(15312);
          break;
          if (100 < paramInt)
            break label42;
          paramInt = -90;
          continue;
          label103: if (280 < paramInt)
            break label49;
          paramInt = 90;
          continue;
          label116: if (190 < paramInt)
            break label56;
          paramInt = 180;
          continue;
          label130: AppMethodBeat.o(15312);
          break;
        }
      ab.v("MicroMsg.BizVideoOrientationHelper", "last rotation :" + b.b(this.jYt) + " ,current rotation:" + paramInt);
      b.a(this.jYt, paramInt);
      Object localObject = this.jYt.jYq.get();
      if (localObject == null)
      {
        localObject = new v("null cannot be cast to non-null type com.tencent.mm.plugin.brandservice.ui.widget.MPVideoView");
        AppMethodBeat.o(15312);
        throw ((Throwable)localObject);
      }
      if (bo.isNullOrNil(((MPVideoView)localObject).getVideoPath()))
      {
        AppMethodBeat.o(15312);
      }
      else
      {
        localObject = this.jYt.jYq.get();
        if (localObject == null)
        {
          localObject = new v("null cannot be cast to non-null type com.tencent.mm.plugin.brandservice.ui.widget.MPVideoView");
          AppMethodBeat.o(15312);
          throw ((Throwable)localObject);
        }
        if (((MPVideoView)localObject).aFb())
        {
          if (paramInt == 0)
          {
            localObject = (MPVideoView)this.jYt.jYq.get();
            if (localObject != null)
            {
              ((MPVideoView)localObject).j(false, 0);
              AppMethodBeat.o(15312);
            }
            else
            {
              AppMethodBeat.o(15312);
            }
          }
          else if (paramInt == 90)
          {
            localObject = (MPVideoView)this.jYt.jYq.get();
            if (localObject != null)
              ((MPVideoView)localObject).setFullScreenDirection(90);
            localObject = this.jYt.hxY.get();
            if (localObject == null)
            {
              localObject = new v("null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
              AppMethodBeat.o(15312);
              throw ((Throwable)localObject);
            }
            ((MMActivity)localObject).setRequestedOrientation(0);
            AppMethodBeat.o(15312);
          }
          else
          {
            if (paramInt == -90)
            {
              localObject = (MPVideoView)this.jYt.jYq.get();
              if (localObject != null)
                ((MPVideoView)localObject).setFullScreenDirection(-90);
              localObject = this.jYt.hxY.get();
              if (localObject == null)
              {
                localObject = new v("null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                AppMethodBeat.o(15312);
                throw ((Throwable)localObject);
              }
              ((MMActivity)localObject).setRequestedOrientation(8);
            }
            AppMethodBeat.o(15312);
          }
        }
        else if ((paramInt == 90) || (paramInt == -90))
        {
          localObject = (MPVideoView)this.jYt.jYq.get();
          if (localObject != null)
            ((MPVideoView)localObject).setFullScreenDirection(paramInt);
          localObject = (MPVideoView)this.jYt.jYq.get();
          if (localObject != null)
          {
            ((MPVideoView)localObject).j(true, paramInt);
            AppMethodBeat.o(15312);
          }
        }
        else
        {
          AppMethodBeat.o(15312);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.timeline.video.a.b.b
 * JD-Core Version:    0.6.2
 */