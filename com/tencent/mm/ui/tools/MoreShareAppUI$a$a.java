package com.tencent.mm.ui.tools;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.widget.MMSwitchBtn;

final class MoreShareAppUI$a$a
{
  TextView gnB;
  ImageView iqT;
  MMSwitchBtn ixT;
  View kSh;
  ImageView kSi;

  public MoreShareAppUI$a$a(View paramView)
  {
    AppMethodBeat.i(34886);
    this.kSi = ((ImageView)paramView.findViewById(2131826143));
    this.iqT = ((ImageView)paramView.findViewById(2131823624));
    this.gnB = ((TextView)paramView.findViewById(2131823623));
    this.ixT = ((MMSwitchBtn)paramView.findViewById(2131826144));
    this.kSh = paramView.findViewById(2131821064);
    AppMethodBeat.o(34886);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.MoreShareAppUI.a.a
 * JD-Core Version:    0.6.2
 */