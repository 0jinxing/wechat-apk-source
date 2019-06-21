package com.tencent.mm.plugin.brandservice.ui.timeline.a;

import android.view.View;
import android.view.ViewStub;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.brandservice.ui.timeline.a;
import com.tencent.mm.ui.widget.MMNeat7extView;

public final class l extends c
{
  public View jPU;
  public MMNeat7extView jPi;

  public final void a(View paramView, a parama)
  {
    AppMethodBeat.i(14274);
    super.a(paramView, parama);
    if (this.jOR != null)
      AppMethodBeat.o(14274);
    while (true)
    {
      return;
      parama = (ViewStub)paramView.findViewById(2131821835);
      if (parama == null)
      {
        AppMethodBeat.o(14274);
      }
      else
      {
        parama.inflate();
        this.jOR = paramView.findViewById(2131821865);
        this.jPn = paramView.findViewById(2131821866);
        aWI();
        this.jPU = paramView.findViewById(2131820695);
        this.jPi = ((MMNeat7extView)this.jOR.findViewById(2131821185));
        AppMethodBeat.o(14274);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.timeline.a.l
 * JD-Core Version:    0.6.2
 */