package com.tencent.mm.plugin.mmsight.model.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bj.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

final class r$1
  implements a.a
{
  r$1(r paramr)
  {
  }

  public final void output(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(76670);
    long l = bo.yz();
    boolean bool1 = this.owZ.owW.bPL();
    r localr = this.owZ;
    if ((bool1) && (this.owZ.cpc));
    for (boolean bool2 = true; ; bool2 = false)
    {
      localr.d(paramArrayOfByte, bool2);
      b.fXS.g(paramArrayOfByte);
      ab.i("MicroMsg.MMSightYUVMediaCodecRecorder", "markStop: %s isEnd %s costTime %d", new Object[] { Boolean.valueOf(this.owZ.cpc), Boolean.valueOf(bool1), Long.valueOf(bo.az(l)) });
      if ((bool1) && (this.owZ.cpc))
        this.owZ.bPX();
      AppMethodBeat.o(76670);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.model.a.r.1
 * JD-Core Version:    0.6.2
 */