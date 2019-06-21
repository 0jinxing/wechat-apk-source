package com.tencent.mm.plugin.shake.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.e.a;
import com.tencent.mm.model.bz.a;
import com.tencent.mm.platformtools.aa;
import com.tencent.mm.protocal.protobuf.cm;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;

final class m$4
  implements bz.a
{
  m$4(m paramm)
  {
  }

  public final void a(e.a parama)
  {
    AppMethodBeat.i(24480);
    String str = aa.a(parama.eAB.vED);
    if ((str == null) || (str.length() == 0))
    {
      ab.e("MicroMsg.SubCoreShake", "onReceiveMsg, ShakeCardEntranceMsg msgContent is null");
      AppMethodBeat.o(24480);
    }
    while (true)
    {
      return;
      m.a(this.qsj).post(new m.4.1(this, str, parama));
      AppMethodBeat.o(24480);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.shake.b.m.4
 * JD-Core Version:    0.6.2
 */