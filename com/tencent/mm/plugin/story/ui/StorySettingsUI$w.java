package com.tencent.mm.plugin.story.ui;

import a.f.a.a;
import a.l;
import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ab.b;
import com.tencent.mm.ui.base.h;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"com/tencent/mm/plugin/story/ui/StorySettingsUI$initOnCreate$9", "Landroid/view/View$OnClickListener;", "onClick", "", "v", "Landroid/view/View;", "plugin-story_release"})
public final class StorySettingsUI$w
  implements View.OnClickListener
{
  public final void onClick(View paramView)
  {
    AppMethodBeat.i(110076);
    StorySettingsUI localStorySettingsUI = this.sfc;
    paramView = (Context)this.sfc.dxU();
    this.sfc.getString(2131297061);
    StorySettingsUI.a(localStorySettingsUI, h.b(paramView, this.sfc.getString(2131297086), true, (DialogInterface.OnCancelListener)new StorySettingsUI.w.a(this)));
    b.a("cpfiles", (a)new StorySettingsUI.w.b(this));
    AppMethodBeat.o(110076);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.StorySettingsUI.w
 * JD-Core Version:    0.6.2
 */