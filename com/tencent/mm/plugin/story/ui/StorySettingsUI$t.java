package com.tencent.mm.plugin.story.ui;

import a.l;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.story.model.f.a;
import com.tencent.mm.plugin.story.model.h;
import com.tencent.mm.plugin.story.model.j;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"com/tencent/mm/plugin/story/ui/StorySettingsUI$initOnCreate$6", "Landroid/view/View$OnClickListener;", "onClick", "", "v", "Landroid/view/View;", "plugin-story_release"})
public final class StorySettingsUI$t
  implements View.OnClickListener
{
  public final void onClick(View paramView)
  {
    AppMethodBeat.i(110070);
    paramView = j.rST;
    j.kZ(0L);
    new h();
    h.cxH();
    a.rWL.init();
    AppMethodBeat.o(110070);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.StorySettingsUI.t
 * JD-Core Version:    0.6.2
 */