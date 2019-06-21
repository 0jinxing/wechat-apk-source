package com.tencent.mm.plugin.wear.model.e;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.chatroom.e.b;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.model.t;
import com.tencent.mm.plugin.messenger.foundation.a.a.i;
import com.tencent.mm.plugin.wear.model.g;
import com.tencent.mm.protocal.protobuf.cuh;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

public final class k extends a
{
  public final List<Integer> cUA()
  {
    AppMethodBeat.i(26407);
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(Integer.valueOf(11011));
    localArrayList.add(Integer.valueOf(11010));
    AppMethodBeat.o(26407);
    return localArrayList;
  }

  protected final byte[] p(int paramInt, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(26408);
    switch (paramInt)
    {
    default:
    case 11010:
    case 11011:
    }
    while (true)
    {
      AppMethodBeat.o(26408);
      label34: return null;
      Object localObject = new cuh();
      try
      {
        ((cuh)localObject).parseFrom(paramArrayOfByte);
        label50: com.tencent.mm.plugin.wear.model.a.cUn().tXv.dv(((cuh)localObject).wyw, ((cuh)localObject).wXt);
        AppMethodBeat.o(26408);
        break label34;
        try
        {
          localObject = new java/lang/String;
          ((String)localObject).<init>(paramArrayOfByte, "utf8");
          paramArrayOfByte = (byte[])localObject;
          aw.ZK();
          localObject = c.XM().aoO(paramArrayOfByte);
          if (t.kH(paramArrayOfByte))
          {
            aw.ZK();
            localObject = c.XM().aoO(paramArrayOfByte);
            ((ad)localObject).hE(0);
            aw.ZK();
            c.XM().b(paramArrayOfByte, (ad)localObject);
            aw.ZK();
            c.XL().c(new b(paramArrayOfByte, 0));
            com.tencent.mm.plugin.wear.model.c.a.gn(4, 0);
          }
        }
        catch (UnsupportedEncodingException paramArrayOfByte)
        {
          while (true)
          {
            paramArrayOfByte = "";
            continue;
            t.o((ad)localObject);
          }
        }
      }
      catch (IOException paramArrayOfByte)
      {
        break label50;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wear.model.e.k
 * JD-Core Version:    0.6.2
 */