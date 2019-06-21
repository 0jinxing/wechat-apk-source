package com.tencent.mm.plugin.brandservice.ui.timeline.a;

import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.brandservice.ui.timeline.a;
import com.tencent.mm.ui.widget.MMNeat7extView;

public final class m extends c
{
  public ImageView iNr;
  public ImageView jOX;
  public View jPQ;
  public TextView jPV;
  public View jPW;
  public MMNeat7extView jPi;

  public final void a(View paramView, a parama)
  {
    AppMethodBeat.i(14276);
    super.a(paramView, parama);
    if (this.jOR != null)
      AppMethodBeat.o(14276);
    while (true)
    {
      return;
      parama = (ViewStub)paramView.findViewById(2131821831);
      if (parama == null)
      {
        AppMethodBeat.o(14276);
      }
      else
      {
        parama.inflate();
        this.jOR = paramView.findViewById(2131821868);
        this.jPn = paramView.findViewById(2131821869);
        aWI();
        this.jOX = ((ImageView)this.jOR.findViewById(2131821404));
        this.jPd = ((ImageView)this.jOR.findViewById(2131821860));
        this.iNr = ((ImageView)this.jOR.findViewById(2131821872));
        this.jPi = ((MMNeat7extView)this.jOR.findViewById(2131821185));
        this.jPV = ((TextView)this.jOR.findViewById(2131821873));
        this.jPQ = this.jOR.findViewById(2131821870);
        this.jPe = ((ImageView)this.jOR.findViewById(2131821855));
        this.jPW = this.jOR.findViewById(2131821871);
        AppMethodBeat.o(14276);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.timeline.a.m
 * JD-Core Version:    0.6.2
 */