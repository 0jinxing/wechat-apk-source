package com.tencent.mm.plugin.story.ui.sns;

import a.f.a.m;
import a.f.b.j;
import a.l;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"})
final class c$c$c$1
  implements View.OnClickListener
{
  c$c$c$1(c.c.c paramc)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(110272);
    int i = this.shS.kj();
    paramView = this.shS.shN.shw.get(i);
    j.o(paramView, "userList[position]");
    c.b localb = (c.b)paramView;
    paramView = this.shS.shN.seN;
    if (paramView != null)
    {
      paramView.m(Integer.valueOf(i), localb);
      AppMethodBeat.o(110272);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(110272);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.sns.c.c.c.1
 * JD-Core Version:    0.6.2
 */