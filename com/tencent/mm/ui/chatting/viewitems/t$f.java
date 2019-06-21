package com.tencent.mm.ui.chatting.viewitems;

import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.widget.MMNeat7extView;

final class t$f extends t.b
{
  View gCY;
  ImageView jOX;
  View jPQ;
  ImageView jPe;
  TextView pFH;
  MMNeat7extView pFv;
  ImageView pFw;

  public final void fc(View paramView)
  {
    AppMethodBeat.i(33075);
    if (this.jOR != null)
      AppMethodBeat.o(33075);
    while (true)
    {
      return;
      ViewStub localViewStub = (ViewStub)paramView.findViewById(2131821830);
      if (localViewStub == null)
      {
        AppMethodBeat.o(33075);
      }
      else
      {
        localViewStub.inflate();
        this.jOR = paramView.findViewById(2131821852);
        this.gsf = ((TextView)this.jOR.findViewById(2131820678));
        this.jOX = ((ImageView)this.jOR.findViewById(2131821404));
        this.jPQ = this.jOR.findViewById(2131822455);
        this.gCY = this.jOR.findViewById(2131822458);
        this.pFv = ((MMNeat7extView)this.jOR.findViewById(2131822457));
        this.pFH = ((TextView)this.jOR.findViewById(2131822459));
        this.jPe = ((ImageView)this.jOR.findViewById(2131821855));
        this.pFw = ((ImageView)this.jOR.findViewById(2131822456));
        AppMethodBeat.o(33075);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.t.f
 * JD-Core Version:    0.6.2
 */