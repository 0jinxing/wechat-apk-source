package com.tencent.mm.plugin.story.ui;

import a.f.b.j;
import a.l;
import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.base.h;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"})
final class StorySettingsUI$i
  implements View.OnClickListener
{
  StorySettingsUI$i(StorySettingsUI paramStorySettingsUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(110054);
    paramView = g.RP();
    j.o(paramView, "MMKernel.storage()");
    paramView.Ry().set(ac.a.xWC, Boolean.FALSE);
    h.J((Context)this.sfc.dxU(), "在群视频，不要上滑，静候5秒", "");
    AppMethodBeat.o(110054);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.StorySettingsUI.i
 * JD-Core Version:    0.6.2
 */