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
final class StorySettingsUI$k
  implements View.OnClickListener
{
  public static final k sfj;

  static
  {
    AppMethodBeat.i(110058);
    sfj = new k();
    AppMethodBeat.o(110058);
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(110057);
    paramView = g.RP();
    j.o(paramView, "MMKernel.storage()");
    paramView.Ry().set(ac.a.xWD, Boolean.FALSE);
    AppMethodBeat.o(110057);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.StorySettingsUI.k
 * JD-Core Version:    0.6.2
 */