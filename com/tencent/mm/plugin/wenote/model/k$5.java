package com.tencent.mm.plugin.wenote.model;

import android.content.Context;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wenote.model.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ap.a;
import com.tencent.mm.sdk.platformtools.bo;

final class k$5
  implements ap.a
{
  k$5(k paramk)
  {
  }

  public final boolean BI()
  {
    AppMethodBeat.i(26668);
    if (k.f(this.uNS) == -1L)
      k.a(this.uNS, bo.yz());
    long l = bo.az(k.f(this.uNS));
    boolean bool;
    if ((l >= 3590000L) && (l <= 3600000L))
    {
      if (k.g(this.uNS) == null)
      {
        k.a(this.uNS, Toast.makeText(ah.getContext(), ah.getContext().getString(2131299586, new Object[] { Integer.valueOf((int)((3600000L - l) / 1000L)) }), 0));
        k.g(this.uNS).show();
      }
    }
    else
    {
      if (l < 3600000L)
        break label224;
      ab.v("MicroMsg.WNNoteVoiceLogic", "record stop on countdown");
      k.h(this.uNS);
      k.i(this.uNS);
      if (k.d(this.uNS) != null)
        k.d(this.uNS).ddS();
      bool = false;
      AppMethodBeat.o(26668);
    }
    while (true)
    {
      return bool;
      k.g(this.uNS).setText(ah.getContext().getString(2131299586, new Object[] { Integer.valueOf((int)((3600000L - l) / 1000L)) }));
      break;
      label224: bool = true;
      AppMethodBeat.o(26668);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wenote.model.k.5
 * JD-Core Version:    0.6.2
 */