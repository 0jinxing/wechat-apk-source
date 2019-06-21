package com.tencent.mm.plugin.brandservice.ui.timeline.video.a;

import a.f.b.j;
import a.l;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.ui.tools.e.b;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"com/tencent/mm/plugin/brandservice/ui/timeline/video/util/MPVideoImageAnimationHelper$handleAnimation$1$onPreDraw$1", "Lcom/tencent/mm/ui/tools/ImagePreviewAnimation$ICallback;", "onAnimationEnd", "", "onAnimationStart", "plugin-brandservice_release"})
public final class f$a$a
  implements e.b
{
  public final void onAnimationEnd()
  {
    AppMethodBeat.i(15331);
    View localView = f.a(this.jYL.jYJ).findViewById(2131821891);
    j.o(localView, "animationView.findViewBy…View>(R.id.video_loading)");
    localView.setVisibility(0);
    al.n((Runnable)new f.a.a.a(this), 150L);
    localView = this.jYL.jYJ.jYG;
    if (localView != null)
      localView.setVisibility(8);
    if (this.jYL.jYK != null)
      this.jYL.jYK.onAnimationEnd();
    AppMethodBeat.o(15331);
  }

  public final void onAnimationStart()
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.timeline.video.a.f.a.a
 * JD-Core Version:    0.6.2
 */