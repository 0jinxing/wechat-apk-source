package com.tencent.mm.plugin.story.ui;

import a.l;
import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.platformtools.ae;
import com.tencent.mm.ui.base.h;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"com/tencent/mm/plugin/story/ui/StorySettingsUI$initOnCreate$10", "Landroid/view/View$OnClickListener;", "onClick", "", "v", "Landroid/view/View;", "plugin-story_release"})
public final class StorySettingsUI$g
  implements View.OnClickListener
{
  public final void onClick(View paramView)
  {
    AppMethodBeat.i(110052);
    if (!ae.gjA);
    for (boolean bool = true; ; bool = false)
    {
      ae.gjA = bool;
      h.J((Context)this.sfc.dxU(), "ok value Test Fail:" + ae.gjA, "嗯");
      AppMethodBeat.o(110052);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.StorySettingsUI.g
 * JD-Core Version:    0.6.2
 */