package com.tencent.mm.plugin.ipcall.a.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.ipcall.a.i;
import com.tencent.mm.plugin.voip.model.b;
import com.tencent.mm.plugin.voip.model.v2protocal;
import com.tencent.mm.sdk.platformtools.ab;

public final class a$1
  implements b
{
  public a$1(a parama)
  {
  }

  public final int N(byte[] paramArrayOfByte, int paramInt)
  {
    int i = -1;
    AppMethodBeat.i(21798);
    if (!this.nxd.cFy)
    {
      AppMethodBeat.o(21798);
      paramInt = i;
    }
    while (true)
    {
      return paramInt;
      paramInt = i.bHr().nxx.playCallback(paramArrayOfByte, paramInt);
      if (paramInt < 0)
      {
        ab.e("MicroMsg.IPCallAudioPlayer", "playCallback, error: %d", new Object[] { Integer.valueOf(paramInt) });
        AppMethodBeat.o(21798);
        paramInt = i;
      }
      else
      {
        AppMethodBeat.o(21798);
        paramInt = 0;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.a.b.a.1
 * JD-Core Version:    0.6.2
 */