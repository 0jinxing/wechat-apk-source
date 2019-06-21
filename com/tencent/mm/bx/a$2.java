package com.tencent.mm.bx;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.protocal.protobuf.bsb;
import com.tencent.mm.sdk.platformtools.ab;

final class a$2
  implements f
{
  a$2(a parama, bsb parambsb)
  {
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(116346);
    paramm.ftk = true;
    if ((paramInt1 != 0) || (paramInt2 != 0))
    {
      ab.e("MicroMsg.MediaSecurityReport", "report error![%s:%s] %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), a.a(this.xue) });
      AppMethodBeat.o(116346);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.MediaSecurityReport", "report successfully! %s", new Object[] { a.a(this.xue) });
      AppMethodBeat.o(116346);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.bx.a.2
 * JD-Core Version:    0.6.2
 */