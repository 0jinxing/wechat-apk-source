package com.tencent.mm.plugin.wear.model.e;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.model.aw;
import com.tencent.mm.protocal.protobuf.ctk;
import com.tencent.mm.protocal.protobuf.ctq;
import com.tencent.mm.protocal.protobuf.ctr;
import com.tencent.mm.protocal.protobuf.cun;
import com.tencent.mm.protocal.protobuf.cuo;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.be;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public final class c extends a
{
  protected final boolean HI(int paramInt)
  {
    boolean bool = true;
    AppMethodBeat.i(26392);
    if (paramInt == 11008)
      AppMethodBeat.o(26392);
    while (true)
    {
      return bool;
      if (paramInt == 11009)
      {
        AppMethodBeat.o(26392);
      }
      else
      {
        bool = super.HI(paramInt);
        AppMethodBeat.o(26392);
      }
    }
  }

  protected final boolean HJ(int paramInt)
  {
    boolean bool = true;
    AppMethodBeat.i(26391);
    if (paramInt == 11008)
      AppMethodBeat.o(26391);
    while (true)
    {
      return bool;
      if (paramInt == 11009)
      {
        AppMethodBeat.o(26391);
      }
      else
      {
        bool = super.HJ(paramInt);
        AppMethodBeat.o(26391);
      }
    }
  }

  public final List<Integer> cUA()
  {
    AppMethodBeat.i(26389);
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(Integer.valueOf(11008));
    localArrayList.add(Integer.valueOf(11009));
    AppMethodBeat.o(26389);
    return localArrayList;
  }

  protected final byte[] p(int paramInt, byte[] paramArrayOfByte)
  {
    int i = 5;
    AppMethodBeat.i(26390);
    Object localObject1;
    if (paramInt == 11008)
    {
      com.tencent.mm.plugin.wear.model.c.a.HH(6);
      localObject1 = new cun();
    }
    while (true)
    {
      Object localObject2;
      Object localObject3;
      Object localObject4;
      try
      {
        ((cun)localObject1).parseFrom(paramArrayOfByte);
        paramArrayOfByte = new LinkedList();
        paramArrayOfByte.addAll(com.tencent.mm.ui.contact.s.dIf());
        paramArrayOfByte.addAll(com.tencent.mm.ui.contact.s.dIg());
        aw.ZK();
        paramArrayOfByte = com.tencent.mm.model.c.XR().t(paramArrayOfByte, ((cun)localObject1).vOq);
        if (((cun)localObject1).vOq == 0)
        {
          paramInt = i;
          localObject2 = new cuo();
          ((cuo)localObject2).vOq = ((cun)localObject1).vOq;
          if ((paramArrayOfByte != null) && (paramArrayOfByte.moveToNext()))
          {
            localObject3 = paramArrayOfByte.getString(paramArrayOfByte.getColumnIndex("username"));
            aw.ZK();
            localObject3 = com.tencent.mm.model.c.XM().aoO((String)localObject3);
            ((cuo)localObject2).vOq += 1;
            if ((((ad)localObject3).dsf()) || (((ad)localObject3).Oa()))
              continue;
            localObject4 = new ctk();
            ((ctk)localObject4).jCH = com.tencent.mm.model.s.c((ad)localObject3);
            ((ctk)localObject4).jBB = ((ap)localObject3).field_username;
            ((cuo)localObject2).woe.add(localObject4);
            if (((cuo)localObject2).woe.size() < paramInt)
              continue;
            ((cuo)localObject2).xqq = paramArrayOfByte.moveToNext();
          }
          ab.d("MicroMsg.Wear.HttpContactServer", "request offset: %d | return offset: %d | return size: %d", new Object[] { Integer.valueOf(((cun)localObject1).vOq), Integer.valueOf(((cuo)localObject2).vOq), Integer.valueOf(((cuo)localObject2).woe.size()) });
          if (paramArrayOfByte != null)
            paramArrayOfByte.close();
        }
      }
      catch (IOException paramArrayOfByte)
      {
        try
        {
          paramArrayOfByte = ((cuo)localObject2).toByteArray();
          AppMethodBeat.o(26390);
          return paramArrayOfByte;
          paramArrayOfByte = paramArrayOfByte;
          ab.printErrStackTrace("MicroMsg.Wear.HttpContactServer", paramArrayOfByte, "", new Object[0]);
          AppMethodBeat.o(26390);
          paramArrayOfByte = null;
          continue;
          paramInt = 20;
        }
        catch (IOException paramArrayOfByte)
        {
          AppMethodBeat.o(26390);
          paramArrayOfByte = null;
          continue;
        }
      }
      if (paramInt == 11009)
      {
        com.tencent.mm.plugin.wear.model.c.a.HH(7);
        localObject1 = new ctq();
        do
        {
          try
          {
            ((ctq)localObject1).parseFrom(paramArrayOfByte);
            localObject2 = new ctr();
            aw.ZK();
            paramArrayOfByte = com.tencent.mm.model.c.XM().eC(null);
            for (paramInt = ((ctq)localObject1).vOq; ; paramInt--)
            {
              if ((paramArrayOfByte == null) || (!paramArrayOfByte.moveToNext()))
                break label549;
              if (paramInt <= 0)
                break;
            }
          }
          catch (IOException paramArrayOfByte)
          {
            ab.printErrStackTrace("MicroMsg.Wear.HttpContactServer", paramArrayOfByte, "", new Object[0]);
            AppMethodBeat.o(26390);
            paramArrayOfByte = null;
          }
          break;
          localObject3 = paramArrayOfByte.getString(0);
          aw.ZK();
          localObject4 = com.tencent.mm.model.c.XM().aoO((String)localObject3);
          localObject3 = new ctk();
          ((ctk)localObject3).jCH = com.tencent.mm.model.s.c((ad)localObject4);
          ((ctk)localObject3).jBB = ((ap)localObject4).field_username;
          ((ctr)localObject2).woe.add(localObject3);
        }
        while (((ctr)localObject2).woe.size() < 5);
        ((ctr)localObject2).xqq = paramArrayOfByte.moveToNext();
        label549: if (paramArrayOfByte != null)
          paramArrayOfByte.close();
        ((ctr)localObject2).vOq = (((ctq)localObject1).vOq + ((ctr)localObject2).woe.size());
        try
        {
          paramArrayOfByte = ((ctr)localObject2).toByteArray();
          AppMethodBeat.o(26390);
        }
        catch (IOException paramArrayOfByte)
        {
          ab.printErrStackTrace("MicroMsg.Wear.HttpContactServer", paramArrayOfByte, "", new Object[0]);
          AppMethodBeat.o(26390);
          paramArrayOfByte = null;
        }
      }
      else
      {
        AppMethodBeat.o(26390);
        paramArrayOfByte = null;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wear.model.e.c
 * JD-Core Version:    0.6.2
 */