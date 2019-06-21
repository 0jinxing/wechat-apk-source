package com.tencent.mm.roomsdk.a.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.messenger.foundation.a.a.i;
import com.tencent.mm.plugin.messenger.foundation.a.a.i.a;
import com.tencent.mm.plugin.messenger.foundation.a.a.j.b;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.roomsdk.a.b.a;
import com.tencent.mm.roomsdk.a.b.e;
import com.tencent.mm.ui.base.p;

final class c$2
  implements i.a
{
  c$2(c paramc)
  {
  }

  public final void x(int paramInt, String paramString1, String paramString2)
  {
    AppMethodBeat.i(80265);
    ((j)g.K(j.class)).XL().b(this.xvf.xvc.getCmdId(), this.xvf.xve);
    if (this.xvf.xvd)
      AppMethodBeat.o(80265);
    while (true)
    {
      return;
      this.xvf.xvd = true;
      if (this.xvf.xva != null)
      {
        if ((this.xvf.xva instanceof e))
        {
          e locale = (e)this.xvf.xva;
          locale.ret = paramInt;
          locale.title = paramString1;
          locale.content = paramString2;
        }
        this.xvf.xva.a(0, paramInt, "", this.xvf.xva);
      }
      if (this.xvf.tipDialog != null)
        this.xvf.tipDialog.dismiss();
      AppMethodBeat.o(80265);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.roomsdk.a.c.c.2
 * JD-Core Version:    0.6.2
 */