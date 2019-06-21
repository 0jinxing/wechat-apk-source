package com.tencent.mm.plugin.choosemsgfile.b.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.choosemsgfile.compat.b.a;
import com.tencent.mm.plugin.choosemsgfile.b.b.b;
import com.tencent.mm.sdk.platformtools.ab;

final class f$1
  implements b.a
{
  f$1(f paramf)
  {
  }

  public final void bQ(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(54270);
    this.kug.dL(paramInt1, paramInt2);
    AppMethodBeat.o(54270);
  }

  public final void m(int paramInt, String paramString)
  {
    AppMethodBeat.i(54269);
    ab.i("MicroMsg.MsgFileWorker_Image", "DownloadCallback errCode:%d, errMsg:%s", new Object[] { Integer.valueOf(paramInt), paramString });
    if (paramInt == 0)
      if ((this.kug.ktT instanceof b))
      {
        ab.e("MicroMsg.MsgFileWorker_Image", "mMsgItem isn't AppMsgImageMsgItem, err");
        f.a(this.kug, (b)this.kug.ktT);
        AppMethodBeat.o(54269);
      }
    while (true)
    {
      return;
      this.kug.bfk();
      AppMethodBeat.o(54269);
      continue;
      ab.e("MicroMsg.MsgFileWorker_Image", "download fail");
      this.kug.bfk();
      AppMethodBeat.o(54269);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.choosemsgfile.b.a.f.1
 * JD-Core Version:    0.6.2
 */