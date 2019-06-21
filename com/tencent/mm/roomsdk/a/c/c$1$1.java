package com.tencent.mm.roomsdk.a.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.mc;
import com.tencent.mm.g.a.mc.a;
import com.tencent.mm.roomsdk.a.b.a;
import com.tencent.mm.roomsdk.a.b.e;
import com.tencent.mm.ui.base.p;

final class c$1$1
  implements Runnable
{
  c$1$1(c.1 param1, mc parammc)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(80262);
    if (this.xvh.xvf.xvd)
      AppMethodBeat.o(80262);
    while (true)
    {
      return;
      this.xvh.xvf.xvd = true;
      String str1 = this.xvg.cHU.cHV;
      String str2 = this.xvg.cHU.cHW;
      int i = this.xvg.cHU.ret;
      if (this.xvh.xvf.xva != null)
      {
        if ((this.xvh.xvf.xva instanceof e))
        {
          e locale = (e)this.xvh.xvf.xva;
          locale.title = str1;
          locale.ret = i;
          locale.content = str2;
        }
        this.xvh.xvf.xva.a(0, i, "", this.xvh.xvf.xva);
      }
      if (this.xvh.xvf.tipDialog != null)
        this.xvh.xvf.tipDialog.dismiss();
      AppMethodBeat.o(80262);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.roomsdk.a.c.c.1.1
 * JD-Core Version:    0.6.2
 */