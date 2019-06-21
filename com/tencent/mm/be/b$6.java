package com.tencent.mm.be;

import com.tencent.map.swlocation.api.ServerMessageListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class b$6
  implements ServerMessageListener
{
  b$6(b paramb)
  {
  }

  public final void onMessage(int paramInt, String paramString)
  {
    AppMethodBeat.i(78533);
    ab.d("MicroMsg.SenseWhereHelper", "onMessage code[%d] message[%s]", new Object[] { Integer.valueOf(paramInt), paramString });
    if ((paramInt != 0) && (b.o(this.fNG) > 3))
    {
      ab.i("MicroMsg.SenseWhereHelper", "sense where error time more than %d, stop now.", new Object[] { Integer.valueOf(3) });
      b.aiM();
      this.fNG.aiF();
    }
    AppMethodBeat.o(78533);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.be.b.6
 * JD-Core Version:    0.6.2
 */