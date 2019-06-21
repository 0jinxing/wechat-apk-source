package com.tencent.mm.plugin.websearch.widget.view;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.websearch.api.WidgetData;
import com.tencent.mm.plugin.websearch.api.WidgetData.Info;
import com.tencent.mm.plugin.websearch.api.WidgetData.MoreFooter;

final class b$2
  implements View.OnClickListener
{
  b$2(b paramb)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(91518);
    if (this.uef.udY.ubr != null)
    {
      this.uef.K(this.uef.udY.ubr.ubG, this.uef.udY.ubr.ubF, this.uef.udY.ubs.ubz);
      this.uef.iv(true);
    }
    AppMethodBeat.o(91518);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.websearch.widget.view.b.2
 * JD-Core Version:    0.6.2
 */