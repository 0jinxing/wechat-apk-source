package com.tencent.mm.plugin.choosemsgfile.b.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.choosemsgfile.compat.b;
import com.tencent.mm.choosemsgfile.compat.b.b;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.ab;

final class e$1
  implements b.b
{
  e$1(e parame)
  {
  }

  public final void n(int paramInt, String paramString)
  {
    AppMethodBeat.i(54264);
    ab.i("MicroMsg.MsgFileWorker_File", "InitAttachInfoCallback errCode:%d, errMsg:%s", new Object[] { Integer.valueOf(paramInt), paramString });
    if (paramInt == 0)
    {
      paramString = ((b)g.K(b.class)).i(e.a(this.kuc), e.b(this.kuc));
      ((b)g.K(b.class)).a(paramString);
      e.a(this.kuc, ((b)g.K(b.class)).a(e.b(this.kuc), e.a(this.kuc), new e.1.1(this, paramString)));
      AppMethodBeat.o(54264);
    }
    while (true)
    {
      return;
      ab.e("MicroMsg.MsgFileWorker_File", "init %s fail", new Object[] { this.kuc.ktT });
      this.kuc.bfk();
      AppMethodBeat.o(54264);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.choosemsgfile.b.a.e.1
 * JD-Core Version:    0.6.2
 */