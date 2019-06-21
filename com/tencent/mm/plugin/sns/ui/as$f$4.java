package com.tencent.mm.plugin.sns.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class as$f$4
  implements View.OnClickListener
{
  as$f$4(as.f paramf)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(39214);
    if (paramView.getTag() == null)
      AppMethodBeat.o(39214);
    while (true)
    {
      return;
      ab.d("MicroMsg.SnsphotoAdapter", "sign click");
      this.rwn.rwm = ((as.f.a)paramView.getTag());
      int i = this.rwn.rwm.cNE;
      int j = this.rwn.rwm.position;
      this.rwn.fx(i, j + 2);
      AppMethodBeat.o(39214);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.as.f.4
 * JD-Core Version:    0.6.2
 */