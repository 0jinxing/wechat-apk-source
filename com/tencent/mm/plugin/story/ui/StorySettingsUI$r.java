package com.tencent.mm.plugin.story.ui;

import a.l;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.story.h.k;
import com.tencent.mm.plugin.story.h.m;
import com.tencent.mm.plugin.story.h.o;
import com.tencent.mm.plugin.story.model.j;
import com.tencent.mm.plugin.story.model.j.a;
import com.tencent.mm.vfs.e;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"com/tencent/mm/plugin/story/ui/StorySettingsUI$initOnCreate$4", "Landroid/view/View$OnClickListener;", "onClick", "", "v", "Landroid/view/View;", "plugin-story_release"})
public final class StorySettingsUI$r
  implements View.OnClickListener
{
  public final void onClick(View paramView)
  {
    AppMethodBeat.i(110066);
    paramView = j.rST;
    j.a.cxX().cqH();
    paramView = j.rST;
    j.a.cxV().cqH();
    paramView = j.rST;
    j.a.cxT().cqH();
    paramView = j.rST;
    e.cu(j.a.getAccStoryCachePath());
    AppMethodBeat.o(110066);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.StorySettingsUI.r
 * JD-Core Version:    0.6.2
 */