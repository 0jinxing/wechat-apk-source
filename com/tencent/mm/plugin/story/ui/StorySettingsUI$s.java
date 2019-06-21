package com.tencent.mm.plugin.story.ui;

import a.f.b.k;
import a.l;
import a.y;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ab.b;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"com/tencent/mm/plugin/story/ui/StorySettingsUI$initOnCreate$5", "Landroid/view/View$OnClickListener;", "onClick", "", "v", "Landroid/view/View;", "plugin-story_release"})
public final class StorySettingsUI$s
  implements View.OnClickListener
{
  public final void onClick(View paramView)
  {
    AppMethodBeat.i(110069);
    paramView = com.tencent.mm.plugin.story.model.f.a.rWL;
    com.tencent.mm.plugin.story.model.f.a.czg();
    b.a(5000L, (a.f.a.a)a.sfl);
    AppMethodBeat.o(110069);
  }

  @l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "invoke"})
  static final class a extends k
    implements a.f.a.a<y>
  {
    public static final a sfl;

    static
    {
      AppMethodBeat.i(110068);
      sfl = new a();
      AppMethodBeat.o(110068);
    }

    a()
    {
      super();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.StorySettingsUI.s
 * JD-Core Version:    0.6.2
 */