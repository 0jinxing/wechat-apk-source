package com.tencent.mm.media.widget.camerarecordview.b;

import a.f.b.j;
import a.l;
import a.v;
import android.app.Activity;
import android.content.Context;
import android.view.Display;
import android.view.OrientationEventListener;
import android.view.WindowManager;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.media.widget.camerarecordview.preview.c;
import com.tencent.mm.sdk.platformtools.ab;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"com/tencent/mm/media/widget/camerarecordview/orientationfit/PreviewOrientationFit$orientationChangeListener$1", "Landroid/view/OrientationEventListener;", "onOrientationChanged", "", "orientation", "", "plugin-mediaeditor_release"})
public final class a$b extends OrientationEventListener
{
  a$b(com.tencent.mm.media.widget.camerarecordview.c.a parama, Context paramContext, int paramInt)
  {
    super(paramInt, 3);
  }

  public final void onOrientationChanged(int paramInt)
  {
    AppMethodBeat.i(13262);
    if (!a.a(this.fcb))
      AppMethodBeat.o(13262);
    while (true)
    {
      return;
      Object localObject = this.fcb.context;
      if (localObject == null)
      {
        localObject = new v("null cannot be cast to non-null type android.app.Activity");
        AppMethodBeat.o(13262);
        throw ((Throwable)localObject);
      }
      localObject = ((Activity)localObject).getWindowManager();
      j.o(localObject, "(context as Activity).windowManager");
      localObject = ((WindowManager)localObject).getDefaultDisplay();
      j.o(localObject, "(context as Activity).windowManager.defaultDisplay");
      paramInt = ((Display)localObject).getRotation();
      if (paramInt == a.b(this.fcb))
      {
        AppMethodBeat.o(13262);
      }
      else
      {
        ab.i("MicroMsg.PreviewOrientationFit", "last rotation :" + a.b(this.fcb) + " ,current rotation:" + paramInt);
        a.a(this.fcb, paramInt);
        switch (paramInt)
        {
        default:
          paramInt = 0;
        case 0:
        case 1:
        case 2:
        case 3:
        }
        while (true)
          if (paramInt == 0)
          {
            localObject = this.fcb.faw;
            if (localObject != null)
            {
              com.tencent.mm.media.widget.a.b.kf(270);
              this.fcc.getCameraPreviewView().a((com.tencent.mm.media.widget.a.b)localObject);
              localObject = com.tencent.mm.media.widget.camerarecordview.b.fbR;
              localObject = com.tencent.mm.media.widget.camerarecordview.b.getRenderer();
              if (localObject != null)
              {
                ((com.tencent.mm.media.h.a)localObject).ka(com.tencent.mm.media.widget.a.b.Wi());
                AppMethodBeat.o(13262);
                break;
                paramInt = 0;
                continue;
                paramInt = 90;
                continue;
                paramInt = 180;
                continue;
                paramInt = 270;
                continue;
              }
              AppMethodBeat.o(13262);
              break;
            }
            AppMethodBeat.o(13262);
            break;
          }
        if (paramInt == 180)
        {
          localObject = this.fcb.faw;
          if (localObject != null)
          {
            com.tencent.mm.media.widget.a.b.kf(90);
            this.fcc.getCameraPreviewView().a((com.tencent.mm.media.widget.a.b)localObject);
            localObject = com.tencent.mm.media.widget.camerarecordview.b.fbR;
            localObject = com.tencent.mm.media.widget.camerarecordview.b.getRenderer();
            if (localObject != null)
            {
              ((com.tencent.mm.media.h.a)localObject).ka(com.tencent.mm.media.widget.a.b.Wi());
              AppMethodBeat.o(13262);
              continue;
            }
            AppMethodBeat.o(13262);
          }
        }
        else
        {
          AppMethodBeat.o(13262);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.media.widget.camerarecordview.b.a.b
 * JD-Core Version:    0.6.2
 */