package com.tencent.mm.plugin.brandservice.ui.timeline.a;

import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.brandservice.ui.timeline.a;
import com.tencent.mm.ui.widget.MMNeat7extView;

public final class k extends c
{
  public ImageView jOX;
  public View jPS;
  public MMNeat7extView jPi;

  public final void a(View paramView, a parama)
  {
    AppMethodBeat.i(14273);
    super.a(paramView, parama);
    if (this.jOR != null)
      AppMethodBeat.o(14273);
    while (true)
    {
      return;
      parama = (ViewStub)paramView.findViewById(2131821830);
      if (parama == null)
      {
        AppMethodBeat.o(14273);
      }
      else
      {
        parama.inflate();
        this.jOR = paramView.findViewById(2131821852);
        this.jPn = paramView.findViewById(2131821853);
        aWI();
        this.jOX = ((ImageView)this.jOR.findViewById(2131821842));
        this.jPi = ((MMNeat7extView)this.jOR.findViewById(2131821185));
        this.jPd = ((ImageView)this.jOR.findViewById(2131821860));
        this.jPe = ((ImageView)this.jOR.findViewById(2131821855));
        this.jPS = this.jOR.findViewById(2131821854);
        AppMethodBeat.o(14273);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.timeline.a.k
 * JD-Core Version:    0.6.2
 */