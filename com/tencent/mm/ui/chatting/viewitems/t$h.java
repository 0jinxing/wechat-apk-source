package com.tencent.mm.ui.chatting.viewitems;

import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.widget.MMNeat7extView;

final class t$h extends t.b
{
  ImageView iNr;
  ImageView jOX;
  View jPQ;
  ImageView jPe;
  MMNeat7extView jPi;
  TextView timeTv;

  public final void fc(View paramView)
  {
    AppMethodBeat.i(33077);
    if (this.jOR != null)
      AppMethodBeat.o(33077);
    while (true)
    {
      return;
      ViewStub localViewStub = (ViewStub)paramView.findViewById(2131821831);
      if (localViewStub == null)
      {
        AppMethodBeat.o(33077);
      }
      else
      {
        localViewStub.inflate();
        this.jOR = paramView.findViewById(2131821868);
        this.jOX = ((ImageView)this.jOR.findViewById(2131821404));
        this.jPd = ((ImageView)this.jOR.findViewById(2131821860));
        this.jPe = ((ImageView)this.jOR.findViewById(2131821855));
        this.iNr = ((ImageView)this.jOR.findViewById(2131821872));
        this.jPi = ((MMNeat7extView)this.jOR.findViewById(2131821185));
        this.timeTv = ((TextView)this.jOR.findViewById(2131820988));
        this.jPQ = this.jOR.findViewById(2131821870);
        AppMethodBeat.o(33077);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.t.h
 * JD-Core Version:    0.6.2
 */