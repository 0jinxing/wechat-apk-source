package com.tencent.mm.plugin.brandservice.ui.timeline.a;

import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.brandservice.ui.timeline.a;
import com.tencent.mm.ui.widget.MMNeat7extView;

public final class n extends c
{
  public ImageView jOY;
  public TextView jPY;
  public MMNeat7extView jPi;

  public final void a(View paramView, a parama)
  {
    AppMethodBeat.i(14277);
    super.a(paramView, parama);
    if (this.jOR != null)
      AppMethodBeat.o(14277);
    while (true)
    {
      return;
      parama = (ViewStub)paramView.findViewById(2131821833);
      if (parama == null)
      {
        AppMethodBeat.o(14277);
      }
      else
      {
        parama.inflate();
        this.jOR = paramView.findViewById(2131821874);
        this.jPn = paramView.findViewById(2131821875);
        aWI();
        this.jPi = ((MMNeat7extView)this.jOR.findViewById(2131821185));
        this.jPY = ((TextView)this.jOR.findViewById(2131821873));
        this.jOY = ((ImageView)this.jOR.findViewById(2131821876));
        AppMethodBeat.o(14277);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.timeline.a.n
 * JD-Core Version:    0.6.2
 */