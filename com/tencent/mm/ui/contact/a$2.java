package com.tencent.mm.ui.contact;

import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewStub;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.MMSlideDelView.d;
import com.tencent.mm.ui.base.MMSlideDelView.f;
import java.util.HashMap;

final class a$2
  implements View.OnClickListener
{
  a$2(a parama)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(33457);
    ab.v("MicroMsg.AddressAdapter", "on delView clicked");
    this.zjS.jJR.bIq();
    if (this.zjS.oQS != null)
      this.zjS.oQS.bN(((ViewStub)a.a(this.zjS).get(paramView)).getTag());
    AppMethodBeat.o(33457);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.a.2
 * JD-Core Version:    0.6.2
 */