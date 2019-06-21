package com.tencent.mm.ui.chatting.viewitems;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d.a;
import com.tencent.mm.g.a.cl;
import com.tencent.mm.pluginsdk.model.e;
import com.tencent.mm.sdk.platformtools.ab;

final class ae$c$1
  implements d.a
{
  ae$c$1(ae.c paramc)
  {
  }

  public final void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(33259);
    switch (paramInt1)
    {
    default:
    case 2002:
    }
    while (true)
    {
      AppMethodBeat.o(33259);
      while (true)
      {
        return;
        if (paramIntent != null)
          break;
        ab.e("MicroMsg.LocationClickListener", "[onActivityResult] null == data, requestCode:%s resultCode:%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
        AppMethodBeat.o(33259);
      }
      if (paramIntent.getBooleanExtra("kfavorite", false))
      {
        cl localcl = new cl();
        e.a(localcl, paramIntent);
        localcl.cvA.fragment = ae.c.a(this.zgb).yTx;
        localcl.cvA.cvH = 42;
        com.tencent.mm.sdk.b.a.xxA.m(localcl);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.ae.c.1
 * JD-Core Version:    0.6.2
 */