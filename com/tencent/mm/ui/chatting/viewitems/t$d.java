package com.tencent.mm.ui.chatting.viewitems;

import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class t$d extends t.b
{
  ImageView jOX;
  ImageView jOY;
  TextView jPN;
  ImageView jPO;

  public final void fc(View paramView)
  {
    AppMethodBeat.i(33073);
    if (this.jOR != null)
      AppMethodBeat.o(33073);
    while (true)
    {
      return;
      ViewStub localViewStub = (ViewStub)paramView.findViewById(2131821834);
      if (localViewStub == null)
      {
        AppMethodBeat.o(33073);
      }
      else
      {
        localViewStub.inflate();
        this.jOR = paramView.findViewById(2131821856);
        this.jOX = ((ImageView)this.jOR.findViewById(2131821404));
        this.gsf = ((TextView)this.jOR.findViewById(2131820678));
        this.jPN = ((TextView)this.jOR.findViewById(2131821858));
        this.jOY = ((ImageView)this.jOR.findViewById(2131821843));
        this.jPO = ((ImageView)this.jOR.findViewById(2131821859));
        this.jPd = ((ImageView)this.jOR.findViewById(2131821860));
        AppMethodBeat.o(33073);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.t.d
 * JD-Core Version:    0.6.2
 */