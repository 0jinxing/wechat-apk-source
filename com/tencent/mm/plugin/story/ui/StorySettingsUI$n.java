package com.tencent.mm.plugin.story.ui;

import a.l;
import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.h;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"})
final class StorySettingsUI$n
  implements View.OnClickListener
{
  StorySettingsUI$n(StorySettingsUI paramStorySettingsUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(110062);
    com.tencent.mm.plugin.sns.ui.aq.ruz = 2;
    h.J((Context)this.sfc.dxU(), "已调整到单图下载，即刻生效！", "");
    AppMethodBeat.o(110062);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.StorySettingsUI.n
 * JD-Core Version:    0.6.2
 */