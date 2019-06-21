package com.tencent.mm.plugin.brandservice.ui.timeline.video.a;

import a.l;
import a.v;
import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.brandservice.ui.widget.MPVideoView;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;
import java.lang.ref.WeakReference;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/brandservice/ui/timeline/video/util/BizVideoOrientationHelper;", "", "ctx", "Landroid/content/Context;", "video", "Lcom/tencent/mm/plugin/brandservice/ui/widget/MPVideoView;", "(Landroid/content/Context;Lcom/tencent/mm/plugin/brandservice/ui/widget/MPVideoView;)V", "context", "Ljava/lang/ref/WeakReference;", "kotlin.jvm.PlatformType", "getContext", "()Ljava/lang/ref/WeakReference;", "setContext", "(Ljava/lang/ref/WeakReference;)V", "currentDisplayRotation", "", "orientationChangeListener", "com/tencent/mm/plugin/brandservice/ui/timeline/video/util/BizVideoOrientationHelper$orientationChangeListener$1", "Lcom/tencent/mm/plugin/brandservice/ui/timeline/video/util/BizVideoOrientationHelper$orientationChangeListener$1;", "videoView", "getVideoView", "setVideoView", "checkContext", "", "enable", "", "release", "Companion", "plugin-brandservice_release"})
public final class b
{
  public static final b.a jYs;
  private int fbY;
  WeakReference<Context> hxY;
  WeakReference<MPVideoView> jYq;
  public b.b jYr;

  static
  {
    AppMethodBeat.i(15316);
    jYs = new b.a((byte)0);
    AppMethodBeat.o(15316);
  }

  public b(Context paramContext, MPVideoView paramMPVideoView)
  {
    AppMethodBeat.i(15315);
    this.hxY = new WeakReference(paramContext);
    this.jYq = new WeakReference(paramMPVideoView);
    paramContext = (Context)this.hxY.get();
    if (paramContext != null);
    for (paramContext = paramContext.getApplicationContext(); ; paramContext = null)
    {
      this.jYr = new b.b(this, paramContext);
      AppMethodBeat.o(15315);
      return;
    }
  }

  private final boolean Wz()
  {
    AppMethodBeat.i(15314);
    boolean bool;
    if (this.hxY.get() == null)
    {
      bool = false;
      AppMethodBeat.o(15314);
    }
    while (true)
    {
      return bool;
      bool = true;
      AppMethodBeat.o(15314);
    }
  }

  public final void fB(boolean paramBoolean)
  {
    AppMethodBeat.i(15313);
    ab.i("MicroMsg.BizVideoOrientationHelper", "enable :".concat(String.valueOf(paramBoolean)));
    if (!Wz())
      AppMethodBeat.o(15313);
    while (true)
    {
      return;
      if (paramBoolean)
      {
        this.jYr.enable();
        AppMethodBeat.o(15313);
      }
      else
      {
        this.jYr.disable();
        Object localObject = this.hxY.get();
        if (localObject == null)
        {
          localObject = new v("null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
          AppMethodBeat.o(15313);
          throw ((Throwable)localObject);
        }
        ((MMActivity)localObject).setRequestedOrientation(1);
        this.fbY = 0;
        AppMethodBeat.o(15313);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.timeline.video.a.b
 * JD-Core Version:    0.6.2
 */