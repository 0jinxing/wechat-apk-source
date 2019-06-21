package com.tencent.mm.media.widget.camerarecordview.b;

import a.l;
import a.v;
import android.app.Activity;
import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.media.widget.a.b;
import com.tencent.mm.sdk.platformtools.ab;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/media/widget/camerarecordview/orientationfit/PreviewOrientationFit;", "", "ctx", "Landroid/content/Context;", "process", "Lcom/tencent/mm/media/widget/camerarecordview/process/ICameraContainerProcess;", "(Landroid/content/Context;Lcom/tencent/mm/media/widget/camerarecordview/process/ICameraContainerProcess;)V", "cameraConfig", "Lcom/tencent/mm/media/widget/camera/CameraConfig;", "getCameraConfig", "()Lcom/tencent/mm/media/widget/camera/CameraConfig;", "setCameraConfig", "(Lcom/tencent/mm/media/widget/camera/CameraConfig;)V", "context", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "currentDisplayRotation", "", "orientationChangeListener", "com/tencent/mm/media/widget/camerarecordview/orientationfit/PreviewOrientationFit$orientationChangeListener$1", "Lcom/tencent/mm/media/widget/camerarecordview/orientationfit/PreviewOrientationFit$orientationChangeListener$1;", "checkContext", "", "enableFit", "", "enable", "release", "Companion", "plugin-mediaeditor_release"})
public final class a
{
  public static final a.a fca;
  public Context context;
  b faw;
  private int fbY;
  public a.b fbZ;

  static
  {
    AppMethodBeat.i(13265);
    fca = new a.a((byte)0);
    AppMethodBeat.o(13265);
  }

  public a(Context paramContext, com.tencent.mm.media.widget.camerarecordview.c.a parama)
  {
    AppMethodBeat.i(13264);
    this.context = paramContext;
    this.fbZ = new a.b(this, parama, this.context);
    AppMethodBeat.o(13264);
  }

  private final boolean Wz()
  {
    if (this.context == null);
    for (boolean bool = false; ; bool = true)
      return bool;
  }

  public final void a(boolean paramBoolean, b paramb)
  {
    AppMethodBeat.i(13263);
    ab.i("MicroMsg.PreviewOrientationFit", "enable :" + paramBoolean + " ,cameraConfig " + paramb);
    if (!Wz())
      AppMethodBeat.o(13263);
    while (true)
    {
      return;
      if (paramBoolean)
      {
        this.faw = paramb;
        paramb = this.context;
        if (paramb == null)
        {
          paramb = new v("null cannot be cast to non-null type android.app.Activity");
          AppMethodBeat.o(13263);
          throw paramb;
        }
        ((Activity)paramb).setRequestedOrientation(7);
        this.fbZ.enable();
        AppMethodBeat.o(13263);
      }
      else
      {
        paramb = this.context;
        if (paramb == null)
        {
          paramb = new v("null cannot be cast to non-null type android.app.Activity");
          AppMethodBeat.o(13263);
          throw paramb;
        }
        ((Activity)paramb).setRequestedOrientation(1);
        this.fbZ.disable();
        this.fbY = 0;
        AppMethodBeat.o(13263);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.media.widget.camerarecordview.b.a
 * JD-Core Version:    0.6.2
 */