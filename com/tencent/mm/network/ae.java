package com.tencent.mm.network;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.HashMap;

public final class ae
{
  private static ae gep = null;
  private HashMap<Integer, ae.a> geq;

  public ae()
  {
    AppMethodBeat.i(58693);
    this.geq = new HashMap();
    AppMethodBeat.o(58693);
  }

  public static ae anu()
  {
    try
    {
      AppMethodBeat.i(58694);
      if (gep == null)
      {
        localae = new com/tencent/mm/network/ae;
        localae.<init>();
        gep = localae;
      }
      ae localae = gep;
      AppMethodBeat.o(58694);
      return localae;
    }
    finally
    {
    }
  }

  public final int h(int paramInt, byte[] paramArrayOfByte)
  {
    try
    {
      AppMethodBeat.i(58695);
      ae.a locala = (ae.a)this.geq.get(Integer.valueOf(paramInt));
      int i;
      if (paramArrayOfByte == null)
      {
        i = -1;
        ab.i("MicroMsg.PostPushEventHandler", "postEvent event:%s cb:%s data:%s [%s]", new Object[] { Integer.valueOf(paramInt), locala, Integer.valueOf(i), bo.dpG() });
        if (locala != null)
          break label138;
        if (paramArrayOfByte != null)
          break label131;
        i = -1;
        label76: ab.e("MicroMsg.PostPushEventHandler", "postEvent cb == null  event:%s cb:%s data:%s [%s]", new Object[] { Integer.valueOf(paramInt), locala, Integer.valueOf(i), bo.dpG() });
        paramInt = -3;
        AppMethodBeat.o(58695);
      }
      while (true)
      {
        return paramInt;
        i = paramArrayOfByte.length;
        break;
        label131: i = paramArrayOfByte.length;
        break label76;
        label138: paramInt = locala.anv();
        AppMethodBeat.o(58695);
      }
    }
    finally
    {
    }
    throw paramArrayOfByte;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.network.ae
 * JD-Core Version:    0.6.2
 */