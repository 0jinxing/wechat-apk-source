package com.tencent.mm.ui.chatting.viewitems;

import android.view.View;
import android.view.ViewStub;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.widget.MMNeat7extView;

final class t$g extends t.b
{
  View jPU;
  MMNeat7extView jPi;

  public final void fc(View paramView)
  {
    AppMethodBeat.i(33076);
    if (this.jOR != null)
      AppMethodBeat.o(33076);
    while (true)
    {
      return;
      ViewStub localViewStub = (ViewStub)paramView.findViewById(2131821835);
      if (localViewStub == null)
      {
        AppMethodBeat.o(33076);
      }
      else
      {
        localViewStub.inflate();
        this.jOR = paramView.findViewById(2131821865);
        this.jPU = paramView.findViewById(2131820695);
        this.jPi = ((MMNeat7extView)this.jOR.findViewById(2131820678));
        AppMethodBeat.o(33076);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.t.g
 * JD-Core Version:    0.6.2
 */