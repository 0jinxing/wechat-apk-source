package com.tencent.mm.plugin.sns.ui;

import android.view.View;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;

final class as$e extends as.a
{
  TextView qZb;
  MaskImageView rvS;
  View rwa;
  TextView rwb;
  MaskLinearLayout rwh;

  as$e(as paramas)
  {
    super(paramas);
  }

  public final void init()
  {
    AppMethodBeat.i(39210);
    super.init();
    this.rvS.setVisibility(8);
    this.qZb.setVisibility(8);
    this.rwb.setVisibility(8);
    this.rwa.setVisibility(8);
    if (a.dm(as.a(this.rvF)) > 1.0F)
      this.qZb.setMaxLines(2);
    AppMethodBeat.o(39210);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.as.e
 * JD-Core Version:    0.6.2
 */