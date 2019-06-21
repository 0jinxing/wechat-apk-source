package com.tencent.mm.plugin.wear.model.e;

import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.vg;
import com.tencent.mm.g.a.vi;
import com.tencent.mm.m.e;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.model.t;
import com.tencent.mm.plugin.wear.model.j;
import com.tencent.mm.pluginsdk.f.h;
import com.tencent.mm.protocal.protobuf.cdn;
import com.tencent.mm.protocal.protobuf.ctv;
import com.tencent.mm.protocal.protobuf.cup;
import com.tencent.mm.protocal.protobuf.cuq;
import com.tencent.mm.protocal.protobuf.cur;
import com.tencent.mm.protocal.protobuf.cus;
import com.tencent.mm.protocal.protobuf.cuw;
import com.tencent.mm.protocal.protobuf.cwb;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.storage.be;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.LinkedList;
import java.util.List;

public final class m extends a
{
  protected final boolean HJ(int paramInt)
  {
    switch (paramInt)
    {
    case 11024:
    default:
    case 11023:
    case 11025:
    }
    for (boolean bool = false; ; bool = true)
      return bool;
  }

  public final List<Integer> cUA()
  {
    AppMethodBeat.i(26412);
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(Integer.valueOf(11022));
    localArrayList.add(Integer.valueOf(11023));
    localArrayList.add(Integer.valueOf(11025));
    localArrayList.add(Integer.valueOf(11024));
    localArrayList.add(Integer.valueOf(11026));
    localArrayList.add(Integer.valueOf(11029));
    AppMethodBeat.o(26412);
    return localArrayList;
  }

  protected final byte[] p(int paramInt, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(26413);
    switch (paramInt)
    {
    case 11027:
    case 11028:
    default:
    case 11022:
    case 11023:
    case 11025:
    case 11024:
    case 11026:
    case 11029:
    }
    while (true)
    {
      AppMethodBeat.o(26413);
      label58: return null;
      Object localObject = new cus();
      try
      {
        ((cus)localObject).parseFrom(paramArrayOfByte);
        label74: com.tencent.mm.plugin.wear.model.a.cUn().tXz.a(new m.a((cus)localObject));
        com.tencent.mm.plugin.wear.model.a.cUn().tXv.adt(((cus)localObject).wyw);
        com.tencent.mm.plugin.wear.model.c.a.gn(2, ((cus)localObject).Scene);
        com.tencent.mm.plugin.wear.model.c.a.HH(2);
        continue;
        localObject = new cur();
      }
      catch (IOException paramArrayOfByte)
      {
        try
        {
          ((cur)localObject).parseFrom(paramArrayOfByte);
          label133: com.tencent.mm.plugin.messenger.a.g.bOk().F(((cur)localObject).wyw, ((cur)localObject).wdK, t.nK(((cur)localObject).wyw));
          aw.ZK();
          c.XR().apb(((cur)localObject).wyw);
          com.tencent.mm.plugin.wear.model.c.a.gn(3, ((cur)localObject).Scene);
          com.tencent.mm.plugin.wear.model.c.a.HH(5);
          continue;
          localObject = new cuq();
        }
        catch (IOException paramArrayOfByte)
        {
          try
          {
            ((cuq)localObject).parseFrom(paramArrayOfByte);
            label202: com.tencent.mm.plugin.messenger.a.g.bOk().F(((cuq)localObject).wyw, ((cuq)localObject).wdK, t.nK(((cuq)localObject).wyw));
            ((com.tencent.mm.plugin.emoji.b.d)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.emoji.b.d.class)).getEmojiMgr().r(ah.getContext(), ((cuq)localObject).wyw, ((cuq)localObject).wdO);
            aw.ZK();
            c.XR().apb(((cuq)localObject).wyw);
            com.tencent.mm.plugin.wear.model.c.a.gn(8, ((cuq)localObject).Scene);
            com.tencent.mm.plugin.wear.model.c.a.HH(4);
            continue;
            localObject = new cup();
          }
          catch (IOException paramArrayOfByte)
          {
            try
            {
              ((cup)localObject).parseFrom(paramArrayOfByte);
              label302: ((com.tencent.mm.plugin.emoji.b.d)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.emoji.b.d.class)).getEmojiMgr().r(ah.getContext(), ((cup)localObject).wyw, ((cup)localObject).wdO);
              aw.ZK();
              c.XR().apb(((cup)localObject).wyw);
              com.tencent.mm.plugin.wear.model.c.a.gn(7, ((cup)localObject).Scene);
              com.tencent.mm.plugin.wear.model.c.a.HH(3);
              continue;
              localObject = new cuw();
            }
            catch (IOException paramArrayOfByte)
            {
              try
              {
                ((cuw)localObject).parseFrom(paramArrayOfByte);
                com.tencent.mm.plugin.wear.model.a.cUn();
                paramArrayOfByte = com.tencent.mm.plugin.wear.model.a.cUn().tXt.tXK.tYz;
                if (paramArrayOfByte == null)
                {
                  ab.e("MicroMsg.Wear.WearBizLogic", "logicRequest is null");
                  continue;
                }
                ab.i("MicroMsg.Wear.WearBizLogic", "receive step count %d | time %s", new Object[] { Integer.valueOf(((cuw)localObject).xqV), h.formatTime("yyyy-MM-dd HH:mm:ss", ((cuw)localObject).xqW / 1000L) });
                localcwb = new cwb();
                cdn localcdn = new cdn();
                if (((cuw)localObject).xqV > 0)
                {
                  paramInt = ((cuw)localObject).xqV;
                  localcdn.jCs = paramInt;
                  localcdn.Timestamp = ((int)(((cuw)localObject).xqW / 1000L));
                  Calendar localCalendar = Calendar.getInstance();
                  localCalendar.setTimeInMillis(((cuw)localObject).xqW);
                  localcdn.xdi = localCalendar.get(1);
                  localcdn.xdj = (localCalendar.get(2) + 1);
                  localcdn.xdk = localCalendar.get(5);
                  localcdn.xdl = localCalendar.get(11);
                  localcdn.xdm = localCalendar.get(12);
                  localcdn.xdn = localCalendar.get(13);
                  localcwb.xrV.add(localcdn);
                  localObject = new vi();
                }
              }
              catch (IOException paramArrayOfByte)
              {
                try
                {
                  while (true)
                  {
                    cwb localcwb;
                    ((vi)localObject).cSq.data = localcwb.toByteArray();
                    label613: ((vi)localObject).cSq.cuy = 4;
                    ((vi)localObject).cSq.ceI = paramArrayOfByte.xqs;
                    ((vi)localObject).cSq.cws = "gh_43f2581f6fd6";
                    com.tencent.mm.sdk.b.a.xxA.m((b)localObject);
                    break;
                    paramInt = 0;
                  }
                  if ((!com.tencent.mm.plugin.wear.model.a.cUn().tXt.cUs()) || (com.tencent.mm.m.g.Nu().getInt("WearLuckyBlock", 0) != 0))
                  {
                    AppMethodBeat.o(26413);
                    break label58;
                  }
                  long l1 = 0L;
                  try
                  {
                    localObject = new java/lang/String;
                    ((String)localObject).<init>(paramArrayOfByte);
                    l2 = Long.valueOf((String)localObject).longValue();
                    paramArrayOfByte = new vg();
                    paramArrayOfByte.cSe.action = 1;
                    paramArrayOfByte.cSe.cuQ = l2;
                    com.tencent.mm.sdk.b.a.xxA.a(paramArrayOfByte, Looper.getMainLooper());
                    com.tencent.mm.plugin.wear.model.c.a.gn(11, 0);
                    com.tencent.mm.plugin.wear.model.c.a.HH(11);
                    continue;
                    paramArrayOfByte = paramArrayOfByte;
                    break label74;
                    paramArrayOfByte = paramArrayOfByte;
                    break label133;
                    paramArrayOfByte = paramArrayOfByte;
                    break label202;
                    paramArrayOfByte = paramArrayOfByte;
                    break label302;
                    paramArrayOfByte = paramArrayOfByte;
                  }
                  catch (Exception paramArrayOfByte)
                  {
                    while (true)
                      long l2 = l1;
                  }
                }
                catch (IOException localIOException)
                {
                  break label613;
                }
              }
            }
          }
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wear.model.e.m
 * JD-Core Version:    0.6.2
 */