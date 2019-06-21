package com.tencent.mm.plugin.wear.model.e;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bt.b;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.modelvoice.o;
import com.tencent.mm.modelvoice.q;
import com.tencent.mm.protocal.protobuf.cud;
import com.tencent.mm.protocal.protobuf.cue;
import com.tencent.mm.protocal.protobuf.cui;
import com.tencent.mm.protocal.protobuf.cuj;
import com.tencent.mm.protocal.protobuf.cul;
import com.tencent.mm.protocal.protobuf.cum;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.bi;
import com.tencent.mm.vfs.e;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public final class j extends a
{
  public String tYA = "";

  protected final boolean HI(int paramInt)
  {
    switch (paramInt)
    {
    default:
    case 11021:
    case 11031:
    }
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  protected final boolean HJ(int paramInt)
  {
    switch (paramInt)
    {
    default:
    case 11021:
    case 11031:
    }
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final List<Integer> cUA()
  {
    AppMethodBeat.i(26405);
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(Integer.valueOf(11019));
    localArrayList.add(Integer.valueOf(11020));
    localArrayList.add(Integer.valueOf(11021));
    localArrayList.add(Integer.valueOf(11031));
    AppMethodBeat.o(26405);
    return localArrayList;
  }

  protected final byte[] p(int paramInt, byte[] paramArrayOfByte)
  {
    boolean bool = true;
    AppMethodBeat.i(26406);
    switch (paramInt)
    {
    default:
    case 11019:
    case 11021:
    case 11020:
    case 11031:
    }
    while (true)
    {
      AppMethodBeat.o(26406);
      paramArrayOfByte = null;
      label60: return paramArrayOfByte;
      Object localObject1 = new cud();
      try
      {
        while (true)
        {
          while (true)
          {
            ((cud)localObject1).parseFrom(paramArrayOfByte);
            localObject2 = new cue();
            ((cue)localObject2).xqF = ((cud)localObject1).xqF;
            if (((cue)localObject2).xqF)
              aw.ZK();
            for (paramArrayOfByte = c.XO().U(((cud)localObject1).vHl, ((cud)localObject1).wOP); ; paramArrayOfByte = c.XO().T(((cud)localObject1).vHl, ((cud)localObject1).wOP))
            {
              for (paramInt = 0; (paramInt < 10) && (paramInt < paramArrayOfByte.size()); paramInt++)
              {
                localObject1 = (bi)paramArrayOfByte.get(paramInt);
                ((cue)localObject2).wtc.add(com.tencent.mm.plugin.wear.model.h.aj((bi)localObject1));
              }
              aw.ZK();
            }
            if (paramArrayOfByte.size() > 10)
            {
              bool = true;
              ((cue)localObject2).xqq = bool;
            }
            try
            {
              paramArrayOfByte = ((cue)localObject2).toByteArray();
              AppMethodBeat.o(26406);
              break;
              bool = false;
            }
            catch (IOException paramArrayOfByte)
            {
              ab.printErrStackTrace("MicroMsg.Wear.HttpMessageServer", paramArrayOfByte, "", new Object[0]);
            }
          }
          break;
          this.tYA = "";
          break;
          com.tencent.mm.plugin.wear.model.c.a.gn(9, 0);
          com.tencent.mm.plugin.wear.model.c.a.HH(8);
          localObject2 = new cui();
          try
          {
            ((cui)localObject2).parseFrom(paramArrayOfByte);
            this.tYA = ((cui)localObject2).vHl;
            paramArrayOfByte = new cuj();
            aw.ZK();
            localObject1 = c.XO().T(((cui)localObject2).vHl, ((cui)localObject2).wOP);
            for (paramInt = 0; (paramInt < 10) && (paramInt < ((List)localObject1).size()); paramInt++)
            {
              localObject2 = (bi)((List)localObject1).get(paramInt);
              paramArrayOfByte.wtc.add(com.tencent.mm.plugin.wear.model.h.aj((bi)localObject2));
            }
          }
          catch (IOException paramArrayOfByte)
          {
            AppMethodBeat.o(26406);
            paramArrayOfByte = null;
          }
          break label60;
          if (((List)localObject1).size() > 10)
            paramArrayOfByte.xqq = bool;
          try
          {
            paramArrayOfByte = paramArrayOfByte.toByteArray();
            AppMethodBeat.o(26406);
            break label60;
            bool = false;
          }
          catch (IOException paramArrayOfByte)
          {
            ab.printErrStackTrace("MicroMsg.Wear.HttpMessageServer", paramArrayOfByte, "", new Object[0]);
          }
        }
        continue;
        com.tencent.mm.plugin.wear.model.c.a.gn(12, 0);
        com.tencent.mm.plugin.wear.model.c.a.HH(14);
        localObject2 = new cul();
      }
      catch (IOException paramArrayOfByte)
      {
        try
        {
          while (true)
          {
            Object localObject2;
            ((cul)localObject2).parseFrom(paramArrayOfByte);
            label478: aw.ZK();
            localObject1 = c.XO().jf(((cul)localObject2).vIs);
            paramArrayOfByte = new cum();
            String str = q.getFullPath(((cy)localObject1).field_imgPath);
            paramArrayOfByte.xqP = o.g(str, 0, true);
            paramArrayOfByte.vIs = ((cul)localObject2).vIs;
            paramArrayOfByte.vHn = new b(e.e(str, 0, -1));
            q.M((bi)localObject1);
            try
            {
              paramArrayOfByte = paramArrayOfByte.toByteArray();
              AppMethodBeat.o(26406);
            }
            catch (IOException paramArrayOfByte)
            {
              AppMethodBeat.o(26406);
              paramArrayOfByte = null;
            }
          }
          break label60;
          paramArrayOfByte = paramArrayOfByte;
        }
        catch (IOException paramArrayOfByte)
        {
          break label478;
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wear.model.e.j
 * JD-Core Version:    0.6.2
 */