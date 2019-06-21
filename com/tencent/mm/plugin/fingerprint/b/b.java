package com.tencent.mm.plugin.fingerprint.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.g.a.bt;
import com.tencent.mm.g.a.bt.a;
import com.tencent.mm.g.a.bt.b;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.fingerprint.c.d;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.ab;

public final class b extends c<bt>
  implements f
{
  private bt mrt;
  private boolean mru;

  public b()
  {
    AppMethodBeat.i(41425);
    this.mru = false;
    this.xxI = bt.class.getName().hashCode();
    AppMethodBeat.o(41425);
  }

  private boolean a(bt parambt)
  {
    boolean bool = false;
    AppMethodBeat.i(41426);
    if (!g.RK())
    {
      ab.e("MicroMsg.CloseFingerPrintEventListener", "CloseFingerPrintEvent account is not ready");
      AppMethodBeat.o(41426);
    }
    while (true)
    {
      return bool;
      this.mru = false;
      if ((parambt instanceof bt))
      {
        this.mrt = parambt;
        ab.i("MicroMsg.CloseFingerPrintEventListener", "handle CloseFingerPrintEvent");
        g.RQ();
        g.RO().eJo.a(385, this);
        parambt = new d(parambt.cuS.cuU);
        g.RQ();
        g.RO().eJo.a(parambt, 0);
        bool = true;
        AppMethodBeat.o(41426);
      }
      else
      {
        AppMethodBeat.o(41426);
      }
    }
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(41427);
    if ((paramm instanceof d))
    {
      paramm = new bt.b();
      ab.i("MicroMsg.CloseFingerPrintEventListener", "NetSceneTenpayCloseTouchPay doscene return errcode " + paramInt2 + " errmsg" + paramString);
      if ((paramInt1 != 0) || (paramInt2 != 0))
        break label144;
      ab.i("MicroMsg.CloseFingerPrintEventListener", "NetSceneTenpayCloseTouchPay doscene is success");
    }
    for (paramm.retCode = 0; ; paramm.retCode = paramInt2)
    {
      g.RQ();
      g.RO().eJo.b(385, this);
      this.mrt.cuT = paramm;
      this.mru = true;
      if (this.mrt.callback != null)
        this.mrt.callback.run();
      if (this.mru)
        this.mrt = null;
      AppMethodBeat.o(41427);
      return;
      label144: ab.i("MicroMsg.CloseFingerPrintEventListener", "NetSceneTenpayCloseTouchPay doscene is fail");
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fingerprint.b.b
 * JD-Core Version:    0.6.2
 */