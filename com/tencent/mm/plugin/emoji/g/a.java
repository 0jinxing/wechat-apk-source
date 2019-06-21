package com.tencent.mm.plugin.emoji.g;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.e.a;
import com.tencent.mm.compatible.e.q;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.bz.a;
import com.tencent.mm.platformtools.aa;
import com.tencent.mm.plugin.emoji.model.j;
import com.tencent.mm.plugin.emoji.sync.BKGLoaderManager;
import com.tencent.mm.protocal.protobuf.cm;
import com.tencent.mm.protocal.protobuf.xx;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.br;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.at;
import com.tencent.mm.storage.emotion.EmojiInfo;
import com.tencent.mm.storage.emotion.d;
import com.tencent.mm.storage.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

public final class a
  implements bz.a
{
  private static void c(int paramInt, ArrayList<xx> paramArrayList)
  {
    AppMethodBeat.i(53157);
    paramArrayList = paramArrayList.iterator();
    if (paramArrayList.hasNext())
    {
      xx localxx = (xx)paramArrayList.next();
      EmojiInfo localEmojiInfo = at.dsZ().xYn.aqi(localxx.Md5);
      if (localEmojiInfo == null)
      {
        localEmojiInfo = new EmojiInfo();
        com.tencent.mm.plugin.emoji.h.b.a(localxx, localEmojiInfo);
        if (paramInt == 1)
          localEmojiInfo.field_groupId = "capture";
        while (true)
        {
          at.dsZ().xYn.F(localEmojiInfo);
          break;
          localEmojiInfo.field_catalog = EmojiInfo.yal;
        }
      }
      if (paramInt == 1)
        localEmojiInfo.field_groupId = "capture";
      while (true)
      {
        at.dsZ().xYn.G(localEmojiInfo);
        break;
        localEmojiInfo.field_catalog = EmojiInfo.yal;
      }
    }
    AppMethodBeat.o(53157);
  }

  public final void a(e.a parama)
  {
    int i = 0;
    AppMethodBeat.i(53156);
    parama = parama.eAB;
    Object localObject1;
    if (parama.nao == 10002)
    {
      localObject1 = aa.a(parama.vED);
      if (bo.isNullOrNil((String)localObject1))
      {
        ab.w("MicroMsg.emoji.EmojiBackupSysCmdMsgListener", "msg content is null");
        AppMethodBeat.o(53156);
      }
    }
    while (true)
    {
      return;
      Object localObject2 = br.z((String)localObject1, "sysmsg");
      if ((localObject2 != null) && (((Map)localObject2).size() > 0))
      {
        String str = (String)((Map)localObject2).get(".sysmsg.$type");
        if (bo.isNullOrNil(str))
        {
          ab.w("MicroMsg.emoji.EmojiBackupSysCmdMsgListener", "empty type");
          AppMethodBeat.o(53156);
        }
        else
        {
          parama = bo.cd(com.tencent.mm.bt.b.bI(q.LM().getBytes()).Lv(16).wR);
          if (str.equalsIgnoreCase("EmojiBackup"))
          {
            i = bo.ank((String)((Map)localObject2).get(".sysmsg.EmojiBackup.OpCode"));
            localObject2 = (String)((Map)localObject2).get(".sysmsg.EmojiBackup.DeviceID");
            ab.i("MicroMsg.emoji.EmojiBackupSysCmdMsgListener", "client devicesID:%s server devicesID:%s", new Object[] { parama, localObject2 });
            if ((!bo.isNullOrNil((String)localObject2)) && (((String)localObject2).equalsIgnoreCase(parama)))
            {
              ab.i("MicroMsg.emoji.EmojiBackupSysCmdMsgListener", "same devices operate ignore.");
              AppMethodBeat.o(53156);
            }
            else
            {
              localObject1 = b.JE((String)localObject1);
              if (i == 1)
              {
                if ((localObject1 == null) || (((ArrayList)localObject1).size() <= 0))
                {
                  ab.i("MicroMsg.emoji.EmojiBackupSysCmdMsgListener", "xml syn list is null.");
                  AppMethodBeat.o(53156);
                }
                else
                {
                  ab.i("MicroMsg.emoji.EmojiBackupSysCmdMsgListener", "try to sync emoji from newxml. buckupList:%d", new Object[] { Integer.valueOf(((ArrayList)localObject1).size()) });
                  c(0, (ArrayList)localObject1);
                  AppMethodBeat.o(53156);
                }
              }
              else if (i == 2)
              {
                if ((localObject1 == null) || (((ArrayList)localObject1).size() <= 0))
                {
                  ab.i("MicroMsg.emoji.EmojiBackupSysCmdMsgListener", "xml syn list is null.");
                  AppMethodBeat.o(53156);
                }
                else
                {
                  parama = new ArrayList();
                  if ((localObject1 != null) && (((ArrayList)localObject1).size() > 0))
                  {
                    localObject2 = ((ArrayList)localObject1).iterator();
                    while (((Iterator)localObject2).hasNext())
                    {
                      localObject1 = (xx)((Iterator)localObject2).next();
                      if (localObject1 != null)
                        parama.add(((xx)localObject1).Md5);
                    }
                  }
                  j.getEmojiStorageMgr().xYn.eJ(parama);
                  g.RP().Ry().set(ac.a.xJc, Boolean.FALSE);
                  AppMethodBeat.o(53156);
                }
              }
              else
              {
                if (i == 3)
                {
                  ab.i("MicroMsg.emoji.EmojiBackupSysCmdMsgListener", "set batch emoji download time to 0. ");
                  g.RP().Ry().set(ac.a.xJk, Boolean.TRUE);
                }
                AppMethodBeat.o(53156);
              }
            }
          }
          else if (str.equalsIgnoreCase("EmotionBackup"))
          {
            int j = Integer.valueOf((String)((Map)localObject2).get(".sysmsg.EmotionBackup.OpCode")).intValue();
            localObject2 = (String)((Map)localObject2).get(".sysmsg.EmotionBackup.DeviceID");
            if ((!bo.isNullOrNil((String)localObject2)) && (((String)localObject2).equalsIgnoreCase(parama)))
            {
              ab.i("MicroMsg.emoji.EmojiBackupSysCmdMsgListener", "same devices operate ignore.");
              AppMethodBeat.o(53156);
            }
            else
            {
              localObject1 = b.JF((String)localObject1);
              if ((localObject1 == null) || (((ArrayList)localObject1).size() <= 0))
              {
                ab.i("MicroMsg.emoji.EmojiBackupSysCmdMsgListener", "xml syn list is null.");
                AppMethodBeat.o(53156);
              }
              else if (j == 1)
              {
                ab.i("MicroMsg.emoji.EmojiBackupSysCmdMsgListener", "try to sync emoji from newxml. add buckupList:%d", new Object[] { Integer.valueOf(((ArrayList)localObject1).size()) });
                parama = new ArrayList();
                j = ((ArrayList)localObject1).size();
                while (i < j)
                {
                  parama.add(new com.tencent.mm.plugin.emoji.sync.a.b((String)((ArrayList)localObject1).get(i)));
                  i++;
                }
                j.bkj().z(parama);
                j.bkj().kXj.bkG();
                AppMethodBeat.o(53156);
              }
              else
              {
                if (j == 2)
                {
                  ab.i("MicroMsg.emoji.EmojiBackupSysCmdMsgListener", "try to sync emoji from newxml. delete buckupList:%d", new Object[] { Integer.valueOf(((ArrayList)localObject1).size()) });
                  j.getEmojiStorageMgr().xYo.aj((ArrayList)localObject1);
                }
                AppMethodBeat.o(53156);
              }
            }
          }
          else if (str.equalsIgnoreCase("SelfieEmojiBackup"))
          {
            str = (String)((Map)localObject2).get(".sysmsg.SelfieEmojiBackup.DeviceID");
            ab.i("MicroMsg.emoji.EmojiBackupSysCmdMsgListener", "back up capture client devicesID:%s server devicesID:%s", new Object[] { parama, str });
            if ((!bo.isNullOrNil(str)) && (str.equalsIgnoreCase(parama)))
            {
              ab.i("MicroMsg.emoji.EmojiBackupSysCmdMsgListener", "same devices operate ignore.");
              AppMethodBeat.o(53156);
            }
            else
            {
              i = bo.ank((String)((Map)localObject2).get(".sysmsg.SelfieEmojiBackup.OpCode"));
              localObject1 = b.JE((String)localObject1);
              if ((localObject1 == null) || (((ArrayList)localObject1).size() <= 0))
              {
                ab.i("MicroMsg.emoji.EmojiBackupSysCmdMsgListener", "back up capture: empty list opCode %s", new Object[] { Integer.valueOf(i) });
                AppMethodBeat.o(53156);
              }
              else
              {
                ab.i("MicroMsg.emoji.EmojiBackupSysCmdMsgListener", "back up capture: opCode %s, size %s", new Object[] { Integer.valueOf(i), Integer.valueOf(((ArrayList)localObject1).size()) });
                if (i == 1)
                {
                  ab.i("MicroMsg.emoji.EmojiBackupSysCmdMsgListener", "back up capture: add capture %s", new Object[] { Integer.valueOf(((ArrayList)localObject1).size()) });
                  c(1, (ArrayList)localObject1);
                  AppMethodBeat.o(53156);
                }
                else if (i == 2)
                {
                  ab.i("MicroMsg.emoji.EmojiBackupSysCmdMsgListener", "back up capture: delete capture %s", new Object[] { Integer.valueOf(((ArrayList)localObject1).size()) });
                  parama = new ArrayList();
                  localObject1 = ((ArrayList)localObject1).iterator();
                  while (((Iterator)localObject1).hasNext())
                  {
                    localObject2 = (xx)((Iterator)localObject1).next();
                    if (localObject2 != null)
                      parama.add(((xx)localObject2).Md5);
                  }
                  j.getEmojiStorageMgr().xYn.eK(parama);
                  g.RP().Ry().set(ac.a.xJc, Boolean.FALSE);
                  AppMethodBeat.o(53156);
                }
                else
                {
                  if (i == 3)
                  {
                    ab.i("MicroMsg.emoji.EmojiBackupSysCmdMsgListener", "back up capture: move to top %s ", new Object[] { Integer.valueOf(((ArrayList)localObject1).size()) });
                    g.RP().Ry().set(ac.a.xJl, Boolean.TRUE);
                  }
                  AppMethodBeat.o(53156);
                }
              }
            }
          }
          else
          {
            ab.e("MicroMsg.emoji.EmojiBackupSysCmdMsgListener", "not emoji message type :".concat(String.valueOf(str)));
          }
        }
      }
      else
      {
        AppMethodBeat.o(53156);
        continue;
        ab.i("MicroMsg.emoji.EmojiBackupSysCmdMsgListener", "not new xml type:%d ", new Object[] { Integer.valueOf(parama.nao) });
        AppMethodBeat.o(53156);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.g.a
 * JD-Core Version:    0.6.2
 */