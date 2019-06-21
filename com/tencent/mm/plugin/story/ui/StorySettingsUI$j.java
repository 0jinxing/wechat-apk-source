package com.tencent.mm.plugin.story.ui;

import a.f.b.j;
import a.l;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"})
final class StorySettingsUI$j
  implements View.OnClickListener
{
  public static final j sfi;

  static
  {
    AppMethodBeat.i(110056);
    sfi = new j();
    AppMethodBeat.o(110056);
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(110055);
    paramView = g.RP();
    j.o(paramView, "MMKernel.storage()");
    paramView.Ry().set(ac.a.xWB, Integer.valueOf(0));
    AppMethodBeat.o(110055);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.StorySettingsUI.j
 * JD-Core Version:    0.6.2
 */