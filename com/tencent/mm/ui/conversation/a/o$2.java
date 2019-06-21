package com.tencent.mm.ui.conversation.a;

import android.content.Context;
import android.content.res.Resources;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap.a;
import java.lang.ref.WeakReference;

final class o$2
  implements ap.a
{
  o$2(o paramo)
  {
  }

  public final boolean BI()
  {
    AppMethodBeat.i(34711);
    this.zxg.zwY += 1;
    ab.v("MicroMsg.NetWarnView", "timer fired, percent:%d", new Object[] { Integer.valueOf(this.zxg.zwY) });
    if (this.zxg.zwY > 99)
      AppMethodBeat.o(34711);
    for (boolean bool = false; ; bool = true)
    {
      return bool;
      if (this.zxg.sIN == 1)
        this.zxg.gnB.setText(((Context)this.zxg.vlu.get()).getResources().getString(2131301653, new Object[] { Integer.valueOf(this.zxg.zwY) }));
      AppMethodBeat.o(34711);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.a.o.2
 * JD-Core Version:    0.6.2
 */