package com.tencent.mm.plugin.mmsight.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelcontrol.VideoTransPara;
import com.tencent.mm.sdk.platformtools.al;

final class b$7
  implements View.OnClickListener
{
  b$7(b paramb)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(55152);
    if ((!b.k(this.oBV)) && (b.d(this.oBV) <= b.l(this.oBV).duration))
    {
      b.a(this.oBV, b.b(this.oBV, -1));
      b.m(this.oBV).bQM();
      b.a(this.oBV, b.m(this.oBV).oDA);
      b.n(this.oBV);
    }
    if (!b.o(this.oBV))
    {
      if (b.a(this.oBV) == null)
        break label172;
      al.d(new b.7.1(this));
      AppMethodBeat.o(55152);
    }
    while (true)
    {
      return;
      b.p(this.oBV);
      if ((!b.k(this.oBV)) && (b.q(this.oBV)) && (b.a(this.oBV) != null))
        al.d(new Runnable()
        {
          public final void run()
          {
            AppMethodBeat.i(55151);
            b.a(b.7.this.oBV).bQg();
            AppMethodBeat.o(55151);
          }
        });
      label172: AppMethodBeat.o(55152);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.ui.b.7
 * JD-Core Version:    0.6.2
 */