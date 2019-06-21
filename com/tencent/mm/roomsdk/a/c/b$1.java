package com.tencent.mm.roomsdk.a.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.kernel.g;

final class b$1
  implements f
{
  b$1(b paramb)
  {
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(80257);
    g.RQ();
    g.RO().eJo.b(paramm.getType(), this.xvb.fur);
    if (this.xvb.tipDialog != null)
      this.xvb.tipDialog.dismiss();
    if (this.xvb.tRR.equals(paramm))
    {
      if ((paramm instanceof com.tencent.mm.roomsdk.a.a))
        ((com.tencent.mm.roomsdk.a.a)paramm).a(this.xvb.xva);
      if (this.xvb.xva != null)
        this.xvb.xva.a(paramInt1, paramInt2, paramString, this.xvb.xva);
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        if (this.xvb.xuY == null)
          break label199;
        this.xvb.xuY.a(paramInt1, paramInt2, paramString, this.xvb.xuY);
        AppMethodBeat.o(80257);
      }
    }
    while (true)
    {
      return;
      if (this.xvb.xuZ != null)
        this.xvb.xuZ.a(paramInt1, paramInt2, paramString, this.xvb.xuZ);
      label199: AppMethodBeat.o(80257);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.roomsdk.a.c.b.1
 * JD-Core Version:    0.6.2
 */