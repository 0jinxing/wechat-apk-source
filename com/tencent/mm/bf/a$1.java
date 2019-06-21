package com.tencent.mm.bf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.compatible.util.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap.a;
import com.tencent.mm.vfs.e;

final class a$1
  implements ap.a
{
  a$1(a parama)
  {
  }

  public final boolean BI()
  {
    AppMethodBeat.i(116534);
    long l = e.asZ(this.fQz.filename);
    ab.d("MicroMsg.NetSceneUploadMedia", g.Mq() + " onTimerExpired: file:" + this.fQz.filename + " nowlen:" + l + " oldoff:" + this.fQz.fQx);
    if (this.fQz.a(this.fQz.ftf, this.fQz.ehi) == -1)
      this.fQz.ehi.onSceneEnd(3, -1, "doScene failed", this.fQz);
    AppMethodBeat.o(116534);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.bf.a.1
 * JD-Core Version:    0.6.2
 */