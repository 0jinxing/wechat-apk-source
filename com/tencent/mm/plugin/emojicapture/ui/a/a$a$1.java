package com.tencent.mm.plugin.emojicapture.ui.a;

import a.f.a.m;
import a.l;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.emojicapture.model.a.b;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"})
final class a$a$1
  implements View.OnClickListener
{
  a$a$1(a.a parama, View paramView)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(2933);
    int i = this.lma.kj();
    b localb = this.lma.llZ.uE(i);
    if (localb != null)
    {
      paramView = this.lma.llZ.llV;
      if (paramView != null)
        paramView.m(Integer.valueOf(i), localb);
    }
    this.lmb.requestFocus();
    AppMethodBeat.o(2933);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emojicapture.ui.a.a.a.1
 * JD-Core Version:    0.6.2
 */