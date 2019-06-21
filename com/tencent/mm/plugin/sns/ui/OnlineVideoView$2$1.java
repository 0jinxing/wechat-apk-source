package com.tencent.mm.plugin.sns.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.model.aq;
import com.tencent.mm.protocal.protobuf.bau;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

final class OnlineVideoView$2$1
  implements Runnable
{
  OnlineVideoView$2$1(OnlineVideoView.2 param2, boolean paramBoolean, String paramString)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(38385);
    ab.i("MicroMsg.OnlineVideoView", "%d weixin download finish[%b], go to prepare video", new Object[] { Integer.valueOf(this.rlz.rly.hashCode()), Boolean.valueOf(this.fBW) });
    if ((OnlineVideoView.e(this.rlz.rly) != null) && (this.fBW) && (bo.isEqual(OnlineVideoView.e(this.rlz.rly).Id, this.IN)))
    {
      aq.gb(OnlineVideoView.a(this.rlz.rly), "");
      String str = aq.a(OnlineVideoView.a(this.rlz.rly), OnlineVideoView.e(this.rlz.rly));
      if (!bo.isNullOrNil(str))
        this.rlz.rly.bq(str, false);
    }
    AppMethodBeat.o(38385);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.OnlineVideoView.2.1
 * JD-Core Version:    0.6.2
 */