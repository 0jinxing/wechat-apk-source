package com.tencent.mm.plugin.sns.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class as$f$5
  implements View.OnClickListener
{
  as$f$5(as.f paramf)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(39215);
    if (paramView.getTag() == null)
      AppMethodBeat.o(39215);
    while (true)
    {
      return;
      ab.d("MicroMsg.SnsphotoAdapter", "sign click");
      this.rwn.rwm = ((as.f.a)paramView.getTag());
      int i = this.rwn.rwm.cNE;
      this.rwn.Ed(i);
      AppMethodBeat.o(39215);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.as.f.5
 * JD-Core Version:    0.6.2
 */