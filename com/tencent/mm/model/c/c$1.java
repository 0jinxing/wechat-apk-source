package com.tencent.mm.model.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.e.a;
import com.tencent.mm.model.bz.a;
import com.tencent.mm.platformtools.aa;
import com.tencent.mm.protocal.protobuf.cm;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.b;
import com.tencent.mm.storage.d;

final class c$1
  implements bz.a
{
  c$1(c paramc)
  {
  }

  public final void a(e.a parama)
  {
    AppMethodBeat.i(118175);
    parama = aa.a(parama.eAB.vED);
    ab.d("MicroMsg.SubCoreNewABTest", "Message content(abtest): %s".concat(String.valueOf(parama)));
    parama = a.pb(parama);
    if (parama == null)
      AppMethodBeat.o(118175);
    while (true)
    {
      return;
      c.abi().s(parama.items, 1);
      c.abj().s(parama.foD, 2);
      AppMethodBeat.o(118175);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.model.c.c.1
 * JD-Core Version:    0.6.2
 */