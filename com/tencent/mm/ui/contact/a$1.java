package com.tencent.mm.ui.contact;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.MMSlideDelView.c;
import com.tencent.mm.ui.base.MMSlideDelView.g;

final class a$1
  implements View.OnClickListener
{
  a$1(a parama)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(33456);
    ab.d("MicroMsg.AddressAdapter", "click avatarIv");
    if (paramView == null)
      AppMethodBeat.o(33456);
    while (true)
    {
      return;
      this.zjS.jJO.q(paramView, this.zjS.jJP.cZ(paramView), 2131821088);
      AppMethodBeat.o(33456);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.a.1
 * JD-Core Version:    0.6.2
 */