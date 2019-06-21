package com.tencent.mm.plugin.brandservice.ui.timeline.a;

import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.brandservice.ui.timeline.a;
import com.tencent.mm.ui.widget.MMNeat7extView;

public final class i extends c
{
  public ImageView jOX;
  public ImageView jOY;
  public TextView jPN;
  public ImageView jPO;
  public MMNeat7extView jPi;

  public final void a(View paramView, a parama)
  {
    AppMethodBeat.i(14269);
    super.a(paramView, parama);
    if (this.jOR != null)
      AppMethodBeat.o(14269);
    while (true)
    {
      return;
      parama = (ViewStub)paramView.findViewById(2131821834);
      if (parama == null)
      {
        AppMethodBeat.o(14269);
      }
      else
      {
        parama.inflate();
        this.jOR = paramView.findViewById(2131821856);
        this.jPn = paramView.findViewById(2131821857);
        aWI();
        this.jOX = ((ImageView)this.jOR.findViewById(2131821404));
        this.jPi = ((MMNeat7extView)this.jOR.findViewById(2131821185));
        this.jPN = ((TextView)this.jOR.findViewById(2131821858));
        this.jOY = ((ImageView)this.jOR.findViewById(2131821843));
        this.jPO = ((ImageView)this.jOR.findViewById(2131821859));
        this.jPd = ((ImageView)this.jOR.findViewById(2131821860));
        AppMethodBeat.o(14269);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.timeline.a.i
 * JD-Core Version:    0.6.2
 */