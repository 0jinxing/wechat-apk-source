package com.tencent.mm.plugin.voip.model.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.voip.a.a;
import com.tencent.mm.plugin.voip.model.k;
import com.tencent.mm.plugin.voip.model.r;
import com.tencent.mm.protocal.protobuf.SKBuiltinBuffer_t;
import com.tencent.mm.protocal.protobuf.cpr;
import com.tencent.mm.protocal.protobuf.cpx;
import com.tencent.mm.sdk.platformtools.ab;

final class b$1$1
  implements Runnable
{
  b$1$1(b.1 param1, cpr paramcpr)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(4697);
    com.tencent.mm.plugin.voip.b.cIj().cKd();
    a.Logi(this.sTI.sTH.TAG, "steve:doublelink timer started!");
    this.sTI.sTH.sPK.a(this.sTF.xnd, this.sTF.xne, this.sTF.xnl, this.sTF.xnE);
    if (this.sTF.xlM.vJd.getBuffer() != null)
    {
      this.sTI.sTH.sPK.bo(this.sTF.xlM.vJd.getBuffer().toByteArray());
      if ((this.sTF.xnj != null) && (this.sTF.xnj.getBuffer() != null) && (this.sTF.xnv != null) && (this.sTF.xnv.getBuffer() != null))
        this.sTI.sTH.sPK.a(this.sTF.xnj.getBuffer().toByteArray(), this.sTF.xni, this.sTF.nwQ, this.sTF.xnv.getBuffer().toByteArray());
      this.sTI.sTH.sPK.i(this.sTF.xnm, this.sTF.xnn, this.sTF.xno, this.sTF.xnp, this.sTF.xnq);
      this.sTI.sTH.sPK.Gl(this.sTF.xnu);
      if ((this.sTF.xns != null) && (this.sTF.xnt != null) && (this.sTF.xns.getBuffer() != null) && (this.sTF.xnt.getBuffer() != null))
        this.sTI.sTH.sPK.b(this.sTF.xnr, this.sTF.xns.getBuffer().toByteArray(), this.sTF.xnt.getBuffer().toByteArray());
      if (this.sTF.xlN.vJd.getBuffer() == null)
        break label638;
      this.sTI.sTH.sPK.bp(this.sTF.xlN.vJd.getBuffer().toByteArray());
      label417: this.sTI.sTH.sPK.Gk(this.sTF.xnx);
      this.sTI.sTH.sPK.sPp.sVb = this.sTF.xny;
      if ((this.sTF.xnA != null) && (this.sTF.xnA.getBuffer() != null))
        this.sTI.sTH.sPK.sPp.sUj = this.sTF.xnA.getBuffer().toByteArray();
      if (!this.sTI.sTH.sPK.sOR)
        break label734;
      this.sTI.sTH.sPK.sOR = false;
      if (this.sTI.sTH.sPK.sON != true)
        break label656;
      a.Logi(this.sTI.sTH.TAG, "channel pre-connect already success, start talk");
      this.sTI.sTH.sPK.cIO();
    }
    while (true)
    {
      this.sTI.sTH.sPK.cIV();
      this.sTI.sTH.sPK.cIT();
      AppMethodBeat.o(4697);
      while (true)
      {
        return;
        ab.e(this.sTI.sTH.TAG, "multiRelayData.PeerId.Buffer.getBuffer() is null");
        break;
        label638: ab.e(this.sTI.sTH.TAG, "multiRelayData.CapInfo.Buffer.getBuffer() is null");
        break label417;
        label656: if (this.sTI.sTH.sPK.sOQ != true)
          break label716;
        a.Logi(this.sTI.sTH.TAG, "channel pre-connect already failed");
        this.sTI.sTH.sPK.v(1, -9000, "");
        AppMethodBeat.o(4697);
      }
      label716: a.Logi(this.sTI.sTH.TAG, "channel pre-connect still connecting...");
      continue;
      label734: ab.i(this.sTI.sTH.TAG, "isPreConnect is false");
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip.model.a.b.1.1
 * JD-Core Version:    0.6.2
 */