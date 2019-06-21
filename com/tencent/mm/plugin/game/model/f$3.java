package com.tencent.mm.plugin.game.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.at.a.c.c;
import com.tencent.mm.protocal.protobuf.bbb;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.List;

final class f$3
  implements c
{
  f$3(bbb parambbb, List paramList, f.a parama)
  {
  }

  public final void a(boolean paramBoolean, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(111238);
    if (paramBoolean)
    {
      ab.i("MicroMsg.GameCommOpertionProcessor", "menu icon download success! thumburl:%s", new Object[] { this.mVO.ThumbUrl });
      f.b(this.mVP, this.mVQ);
    }
    AppMethodBeat.o(111238);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.model.f.3
 * JD-Core Version:    0.6.2
 */