package com.tencent.mm.plugin.story.ui;

import a.f.a.m;
import a.f.b.j;
import a.l;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.story.model.b.a;
import java.util.ArrayList;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"})
final class StoryCommentsUI$a$a$1
  implements View.OnClickListener
{
  StoryCommentsUI$a$a$1(StoryCommentsUI.a.a parama)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(110023);
    int i = this.seT.kj();
    paramView = this.seT.seS.seM.get(i);
    j.o(paramView, "comments[position]");
    paramView = (a)paramView;
    m localm = this.seT.seS.seN;
    if (localm != null)
    {
      localm.m(Integer.valueOf(i), paramView);
      AppMethodBeat.o(110023);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(110023);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.StoryCommentsUI.a.a.1
 * JD-Core Version:    0.6.2
 */