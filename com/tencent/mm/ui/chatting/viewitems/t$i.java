package com.tencent.mm.ui.chatting.viewitems;

import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class t$i extends t.b
{
  ImageView jOY;
  TextView ngD;

  public final void fc(View paramView)
  {
    AppMethodBeat.i(33078);
    if (this.jOR != null)
      AppMethodBeat.o(33078);
    while (true)
    {
      return;
      ViewStub localViewStub = (ViewStub)paramView.findViewById(2131821833);
      if (localViewStub == null)
      {
        AppMethodBeat.o(33078);
      }
      else
      {
        localViewStub.inflate();
        this.jOR = paramView.findViewById(2131821874);
        this.gsf = ((TextView)this.jOR.findViewById(2131820678));
        this.ngD = ((TextView)this.jOR.findViewById(2131820988));
        this.jOY = ((ImageView)this.jOR.findViewById(2131821843));
        AppMethodBeat.o(33078);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.t.i
 * JD-Core Version:    0.6.2
 */