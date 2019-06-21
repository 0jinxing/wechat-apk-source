package com.tencent.mm.plugin.story.ui;

import a.f.b.j;
import a.l;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.base.t;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"com/tencent/mm/plugin/story/ui/StorySettingsUI$initOnCreate$2", "Landroid/view/View$OnClickListener;", "onClick", "", "v", "Landroid/view/View;", "plugin-story_release"})
public final class StorySettingsUI$p
  implements View.OnClickListener
{
  public final void onClick(View paramView)
  {
    AppMethodBeat.i(110064);
    paramView = g.RP();
    j.o(paramView, "MMKernel.storage()");
    paramView.Ry().set(ac.a.xWL, Boolean.TRUE);
    paramView = g.RP();
    j.o(paramView, "MMKernel.storage()");
    paramView.Ry().set(ac.a.xWN, Boolean.TRUE);
    paramView = g.RP();
    j.o(paramView, "MMKernel.storage()");
    paramView.Ry().set(ac.a.xWM, Boolean.TRUE);
    paramView = g.RP();
    j.o(paramView, "MMKernel.storage()");
    paramView.Ry().set(ac.a.xWC, Boolean.FALSE);
    paramView = g.RP();
    j.o(paramView, "MMKernel.storage()");
    paramView.Ry().set(ac.a.xWB, Integer.valueOf(0));
    paramView = g.RP();
    j.o(paramView, "MMKernel.storage()");
    paramView.Ry().set(ac.a.xWD, Boolean.FALSE);
    paramView = g.RP();
    j.o(paramView, "MMKernel.storage()");
    paramView.Ry().set(ac.a.xWE, Boolean.FALSE);
    paramView = g.RP();
    j.o(paramView, "MMKernel.storage()");
    paramView.Ry().set(ac.a.xWF, Boolean.FALSE);
    paramView = g.RP();
    j.o(paramView, "MMKernel.storage()");
    paramView.Ry().set(ac.a.xWO, Boolean.TRUE);
    paramView = g.RP();
    j.o(paramView, "MMKernel.storage()");
    paramView.Ry().set(ac.a.xWP, Integer.valueOf(0));
    paramView = g.RP();
    j.o(paramView, "MMKernel.storage()");
    paramView.Ry().set(ac.a.xWV, Boolean.TRUE);
    paramView = g.RP();
    j.o(paramView, "MMKernel.storage()");
    paramView.Ry().set(ac.a.xWG, Boolean.TRUE);
    paramView = g.RP();
    j.o(paramView, "MMKernel.storage()");
    paramView.Ry().set(ac.a.xWH, Boolean.TRUE);
    t.makeText(ah.getContext(), (CharSequence)"好了", 1).show();
    AppMethodBeat.o(110064);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.StorySettingsUI.p
 * JD-Core Version:    0.6.2
 */