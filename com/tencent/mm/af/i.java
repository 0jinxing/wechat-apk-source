package com.tencent.mm.af;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.i.d;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.Map;

public class i extends f
{
  public int fgg = 0;

  public final f Xz()
  {
    AppMethodBeat.i(16196);
    i locali = new i();
    AppMethodBeat.o(16196);
    return locali;
  }

  public final void a(StringBuilder paramStringBuilder, j.b paramb, String paramString, d paramd, int paramInt1, int paramInt2)
  {
  }

  public final void a(Map<String, String> paramMap, j.b paramb)
  {
    AppMethodBeat.i(16197);
    if (paramb.type == 2000)
    {
      this.fgg = 0;
      ab.i("MicroMsg.AppContentTransferMsgPiece", "hasTransferAddress: %s", new Object[] { Integer.valueOf(this.fgg) });
    }
    AppMethodBeat.o(16197);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.af.i
 * JD-Core Version:    0.6.2
 */