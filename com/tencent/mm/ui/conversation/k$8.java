package com.tencent.mm.ui.conversation;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.widget.a.c;

final class k$8
  implements DialogInterface.OnClickListener
{
  k$8(k paramk)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(34476);
    g.RS().aa(new k.8.1(this));
    k.e(this.zuQ).dismiss();
    h.a(k.a(this.zuQ), 2131298829, 2131297061, false, new k.8.2(this));
    AppMethodBeat.o(34476);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.k.8
 * JD-Core Version:    0.6.2
 */