package com.tencent.mm.plugin.brandservice.ui.timeline.video;

import a.l;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "view", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"})
final class MPPreviewBar$1
  implements View.OnClickListener
{
  MPPreviewBar$1(MPPreviewBar paramMPPreviewBar)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(15224);
    MPPreviewBar.a(this.jWI).setVisibility(8);
    AppMethodBeat.o(15224);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.timeline.video.MPPreviewBar.1
 * JD-Core Version:    0.6.2
 */