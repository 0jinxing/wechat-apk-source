package com.tencent.mm.plugin.aa.ui;

import android.content.DialogInterface.OnClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.widget.a.c;
import com.tencent.mm.ui.widget.a.c.a;
import java.util.Map;

final class LaunchAAByPersonAmountSelectUI$6
  implements View.OnClickListener
{
  LaunchAAByPersonAmountSelectUI$6(LaunchAAByPersonAmountSelectUI paramLaunchAAByPersonAmountSelectUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(40795);
    if ((LaunchAAByPersonAmountSelectUI.c(this.gou) != null) && (LaunchAAByPersonAmountSelectUI.c(this.gou).size() > 0));
    try
    {
      paramView = new com/tencent/mm/ui/widget/a/c$a;
      paramView.<init>(this.gou);
      paramView.PZ(2131296332);
      Object localObject1 = paramView.Qc(2131296994);
      Object localObject2 = new com/tencent/mm/plugin/aa/ui/LaunchAAByPersonAmountSelectUI$6$1;
      ((LaunchAAByPersonAmountSelectUI.6.1)localObject2).<init>(this);
      ((c.a)localObject1).a((DialogInterface.OnClickListener)localObject2);
      localObject2 = paramView.Qd(2131296868);
      localObject1 = new com/tencent/mm/plugin/aa/ui/LaunchAAByPersonAmountSelectUI$6$2;
      ((LaunchAAByPersonAmountSelectUI.6.2)localObject1).<init>(this);
      ((c.a)localObject2).b((DialogInterface.OnClickListener)localObject1);
      paramView.aMb().show();
      h.pYm.e(13721, new Object[] { Integer.valueOf(3), Integer.valueOf(8) });
      AppMethodBeat.o(40795);
      return;
    }
    catch (Exception paramView)
    {
      while (true)
        ab.e("MicroMsg.LaunchAAByPersonAmountSelectUI", "clear amount error");
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.aa.ui.LaunchAAByPersonAmountSelectUI.6
 * JD-Core Version:    0.6.2
 */