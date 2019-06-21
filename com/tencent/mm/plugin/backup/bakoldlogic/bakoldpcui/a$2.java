package com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.e;
import com.tencent.mm.sdk.platformtools.ab;

final class a$2
  implements View.OnClickListener
{
  a$2(a parama)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(17901);
    a.a(this.jAr, com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.a.aUB().aUC().jzK);
    if ((2 == a.b(this.jAr)) || (3 == a.b(this.jAr)) || (5 == a.b(this.jAr)) || (6 == a.b(this.jAr)))
    {
      ab.d(a.access$200(), "OnClickListener goToBakOperatingUI PCBannerStatus:%d, percent:%d", new Object[] { Integer.valueOf(com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.a.aUB().aUC().jzK), Integer.valueOf(a.c(this.jAr)) });
      a.d(this.jAr);
      AppMethodBeat.o(17901);
    }
    while (true)
    {
      return;
      if (4 == a.b(this.jAr))
      {
        ab.d(a.access$200(), "OnClickListener goToBakFinishUI PCBannerStatus:%d, percent:%d", new Object[] { Integer.valueOf(com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.a.aUB().aUC().jzK), Integer.valueOf(a.c(this.jAr)) });
        a.e(this.jAr);
        AppMethodBeat.o(17901);
      }
      else
      {
        AppMethodBeat.o(17901);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcui.a.2
 * JD-Core Version:    0.6.2
 */