package com.tencent.mm.protocal;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.iz;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.IOException;

public final class m$a extends l.d
  implements l.b
{
  public int netType;
  public int vyo = 0;

  public final byte[] ZT()
  {
    AppMethodBeat.i(28280);
    Object localObject1 = new iz();
    ((iz)localObject1).vKd = d.vxo;
    ((iz)localObject1).vKR = 2;
    ((iz)localObject1).vKS = this.netType;
    ((iz)localObject1).vKT = this.vyo;
    ab.i("MicroMsg.MMBgFg", "somr online:%d nettype:%d ver:%d devid:%d", new Object[] { Integer.valueOf(((iz)localObject1).vKT), Integer.valueOf(((iz)localObject1).vKS), Integer.valueOf(((iz)localObject1).vKd), Integer.valueOf(((iz)localObject1).vKR) });
    Object localObject2 = null;
    try
    {
      localObject1 = ((iz)localObject1).toByteArray();
      localObject2 = localObject1;
      AppMethodBeat.o(28280);
      return localObject2;
    }
    catch (IOException localIOException)
    {
      while (true)
        ab.e("MicroMsg.MMBgFg", "MMBgfg toProtoBuf exception:%s", new Object[] { bo.l(localIOException) });
    }
  }

  public final int ZU()
  {
    return 0;
  }

  public final boolean adr()
  {
    return false;
  }

  public final boolean dms()
  {
    return true;
  }

  public final int getCmdId()
  {
    return 312;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.m.a
 * JD-Core Version:    0.6.2
 */