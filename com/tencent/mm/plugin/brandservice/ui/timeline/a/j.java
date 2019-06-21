package com.tencent.mm.plugin.brandservice.ui.timeline.a;

import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.brandservice.ui.timeline.a;

public final class j extends c
{
  public ImageView iNr;
  public ImageView jOX;
  public View jPQ;

  public final void a(View paramView, a parama)
  {
    AppMethodBeat.i(14271);
    super.a(paramView, parama);
    if (this.jOR != null)
      AppMethodBeat.o(14271);
    while (true)
    {
      return;
      parama = (ViewStub)paramView.findViewById(2131821832);
      if (parama == null)
      {
        AppMethodBeat.o(14271);
      }
      else
      {
        parama.inflate();
        this.jOR = paramView.findViewById(2131821861);
        this.jPn = paramView.findViewById(2131821862);
        aWI();
        this.jOX = ((ImageView)this.jOR.findViewById(2131821404));
        this.jPd = ((ImageView)this.jOR.findViewById(2131821860));
        this.iNr = ((ImageView)this.jOR.findViewById(2131821864));
        this.jPQ = this.jOR.findViewById(2131821863);
        this.jPe = ((ImageView)this.jOR.findViewById(2131821855));
        AppMethodBeat.o(14271);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.timeline.a.j
 * JD-Core Version:    0.6.2
 */