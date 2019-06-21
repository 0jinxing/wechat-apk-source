package com.tencent.mm.plugin.ipcall.a.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.audio.b.c.a;
import com.tencent.mm.plugin.ipcall.a.f;
import com.tencent.mm.plugin.ipcall.a.i;
import com.tencent.mm.plugin.voip.model.v2protocal;
import com.tencent.mm.sdk.platformtools.ab;

final class c$1
  implements c.a
{
  c$1(c paramc)
  {
  }

  public final void bN(int paramInt1, int paramInt2)
  {
  }

  public final void u(byte[] paramArrayOfByte, int paramInt)
  {
    int i = 0;
    AppMethodBeat.i(21812);
    synchronized (this.nxs.nxn)
    {
      c localc = this.nxs;
      if (localc.nxo <= 10)
        localc.nxo = 92;
      a locala = i.bHt().nxf;
      if (locala.kzq != null);
      for (int j = locala.kzq.cIq(); ; j = 0)
      {
        localc.nxo = ((j + 24 + localc.nxo * 3) / 4);
        if (!localc.nxp)
          break;
        ab.i("MicroMsg.IPCallRecorder", "preprocessForEcho FirstRefEcho");
        locala = i.bHt().nxf;
        j = i;
        if (locala.kzq != null)
          j = locala.kzq.cIn();
        localc.nxq = j;
        if (localc.nxq >= localc.nxo)
          localc.nxq -= localc.nxo;
        localc.nxo = localc.nxq;
        localc.nxp = false;
        if (i.bHu().mCurrentState == 5)
        {
          if (this.nxs.nxr)
          {
            ab.i("MicroMsg.IPCallRecorder", "isFirstRecordCallback");
            this.nxs.nxr = false;
          }
          i.bHr().nxx.recordCallback(paramArrayOfByte, paramInt, this.nxs.nxo);
        }
        AppMethodBeat.o(21812);
        return;
      }
      localc.nxo = 0;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.a.b.c.1
 * JD-Core Version:    0.6.2
 */