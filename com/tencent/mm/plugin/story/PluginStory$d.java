package com.tencent.mm.plugin.story;

import a.l;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.story.ui.sns.b;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"})
final class PluginStory$d
  implements View.OnClickListener
{
  PluginStory$d(b paramb)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(108911);
    this.rQt.cancel();
    AppMethodBeat.o(108911);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.PluginStory.d
 * JD-Core Version:    0.6.2
 */