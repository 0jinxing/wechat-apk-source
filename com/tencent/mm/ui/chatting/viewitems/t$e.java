package com.tencent.mm.ui.chatting.viewitems;

import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class t$e extends t.b
{
  ImageView iNr;
  ImageView jOX;
  View jPQ;
  ImageView jPe;
  ImageView pFw;

  public final void fc(View paramView)
  {
    AppMethodBeat.i(33074);
    if (this.jOR != null)
      AppMethodBeat.o(33074);
    while (true)
    {
      return;
      ViewStub localViewStub = (ViewStub)paramView.findViewById(2131821832);
      if (localViewStub == null)
      {
        AppMethodBeat.o(33074);
      }
      else
      {
        localViewStub.inflate();
        this.jOR = paramView.findViewById(2131821861);
        this.jOX = ((ImageView)this.jOR.findViewById(2131821404));
        this.jPd = ((ImageView)this.jOR.findViewById(2131821860));
        this.jPe = ((ImageView)this.jOR.findViewById(2131821855));
        this.pFw = ((ImageView)this.jOR.findViewById(2131822456));
        this.iNr = ((ImageView)this.jOR.findViewById(2131821864));
        this.jPQ = this.jOR.findViewById(2131821863);
        AppMethodBeat.o(33074);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.t.e
 * JD-Core Version:    0.6.2
 */