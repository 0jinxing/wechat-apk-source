package com.tencent.mm.plugin.story.ui;

import a.l;
import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.h;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"})
final class StorySettingsUI$m
  implements View.OnClickListener
{
  StorySettingsUI$m(StorySettingsUI paramStorySettingsUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(110061);
    com.tencent.mm.plugin.sns.ui.aq.ruz = 1;
    h.J((Context)this.sfc.dxU(), "已调整到套图下载，即刻生效！", "");
    AppMethodBeat.o(110061);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.StorySettingsUI.m
 * JD-Core Version:    0.6.2
 */