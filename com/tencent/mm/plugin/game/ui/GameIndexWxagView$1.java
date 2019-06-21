package com.tencent.mm.plugin.game.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.plugin.appbrand.service.e;
import com.tencent.mm.plugin.game.d.dr;
import com.tencent.mm.plugin.game.e.b;

final class GameIndexWxagView$1
  implements View.OnClickListener
{
  GameIndexWxagView$1(GameIndexWxagView paramGameIndexWxagView, int paramInt)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(111988);
    if ((paramView.getTag() == null) || (!(paramView.getTag() instanceof dr)))
      AppMethodBeat.o(111988);
    while (true)
    {
      return;
      dr localdr = (dr)paramView.getTag();
      paramView = new AppBrandStatObject();
      paramView.scene = 1079;
      ((e)g.K(e.class)).a(this.njo.getContext(), localdr.jBB, localdr.fKh, localdr.ndQ, 0, localdr.ndP, paramView);
      b.a(this.njo.getContext(), 10, 1025, 999, 30, localdr.fKh, this.nfb, null);
      AppMethodBeat.o(111988);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.ui.GameIndexWxagView.1
 * JD-Core Version:    0.6.2
 */