package com.tencent.mm.modelvoice;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.e.a;
import com.tencent.mm.audio.b.i;
import com.tencent.mm.compatible.util.g.a;
import com.tencent.mm.g.a.jf;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.l.a.a;
import com.tencent.mm.model.bf;
import com.tencent.mm.model.bf.b;
import com.tencent.mm.model.r;
import com.tencent.mm.protocal.protobuf.cm;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bi;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class q
{
  private static final HashMap<String, WeakReference<com.tencent.mm.ai.j>> gaj;
  public static volatile HashMap<String, Integer> gak;
  public static volatile HashMap<String, Integer> gal;
  public static volatile HashMap<String, Integer> gam;

  static
  {
    AppMethodBeat.i(116651);
    gaj = new HashMap();
    gak = new HashMap();
    gal = new HashMap();
    gam = new HashMap();
    AppMethodBeat.o(116651);
  }

  public static boolean K(bi parambi)
  {
    AppMethodBeat.i(116645);
    boolean bool;
    if ((parambi == null) || (!parambi.drD()))
    {
      bool = false;
      AppMethodBeat.o(116645);
    }
    while (true)
    {
      return bool;
      bool = new n(parambi.field_content).fWX;
      AppMethodBeat.o(116645);
    }
  }

  public static boolean L(bi parambi)
  {
    boolean bool = true;
    AppMethodBeat.i(116646);
    if ((parambi == null) || (!parambi.drD()) || (parambi.field_isSend == 1))
    {
      AppMethodBeat.o(116646);
      bool = false;
    }
    while (true)
    {
      return bool;
      if (new n(parambi.field_content).time == 0L)
      {
        AppMethodBeat.o(116646);
      }
      else
      {
        AppMethodBeat.o(116646);
        bool = false;
      }
    }
  }

  public static void M(bi parambi)
  {
    AppMethodBeat.i(116647);
    if ((parambi == null) || (!parambi.drD()))
      AppMethodBeat.o(116647);
    n localn;
    while (true)
    {
      return;
      localObject = ((com.tencent.mm.plugin.messenger.foundation.a.j)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).bOr().jf(parambi.field_msgId);
      if (((cy)localObject).field_msgId != parambi.field_msgId)
      {
        AppMethodBeat.o(116647);
      }
      else
      {
        localn = new n(((cy)localObject).field_content);
        if (!localn.fWX)
          break;
        AppMethodBeat.o(116647);
      }
    }
    localn.fWX = true;
    Object localObject = new StringBuilder().append(localn.fWW).append(":").append(localn.time).append(":");
    if (localn.fWX);
    for (int i = 1; ; i = 0)
    {
      parambi.setContent(i + "\n");
      ((com.tencent.mm.plugin.messenger.foundation.a.j)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).bOr().a(parambi.field_msgId, parambi);
      AppMethodBeat.o(116647);
      break;
    }
  }

  public static String U(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(116619);
    g.a locala = new g.a();
    String str = com.tencent.mm.sdk.platformtools.j.b(XY(), "msg_", paramString, ".amr", 2);
    ab.i("MicroMsg.VoiceLogic", "getAmrFullPath cost: " + locala.Mr() + " " + str);
    if (bo.isNullOrNil(str))
    {
      paramString = null;
      AppMethodBeat.o(116619);
    }
    while (true)
    {
      return paramString;
      if (paramBoolean)
      {
        AppMethodBeat.o(116619);
        paramString = str;
      }
      else
      {
        if (!new com.tencent.mm.vfs.b(str).exists())
          break;
        AppMethodBeat.o(116619);
        paramString = str;
      }
    }
    paramString = amg() + paramString;
    if (new com.tencent.mm.vfs.b(paramString + ".amr").exists())
      com.tencent.mm.vfs.e.aQ(paramString + ".amr", str);
    while (true)
    {
      AppMethodBeat.o(116619);
      paramString = str;
      break;
      if (new com.tencent.mm.vfs.b(paramString).exists())
        com.tencent.mm.vfs.e.aQ(paramString, str);
    }
  }

  public static String XY()
  {
    AppMethodBeat.i(116650);
    Object localObject = new StringBuilder();
    com.tencent.mm.kernel.g.RQ();
    localObject = com.tencent.mm.kernel.g.RP().eJM + "voice2/";
    AppMethodBeat.o(116650);
    return localObject;
  }

  public static int a(p paramp, byte[] paramArrayOfByte, int paramInt, String paramString1, String paramString2, e.a parama)
  {
    AppMethodBeat.i(116632);
    g.a locala = new g.a();
    p localp = m.ama().fZ(paramp.cKK);
    if ((localp != null) && (localp.status == 99))
    {
      paramInt = 0;
      AppMethodBeat.o(116632);
    }
    while (true)
    {
      return paramInt;
      if ((((com.tencent.mm.plugin.messenger.foundation.a.j)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).bOr().Q(paramp.cIS, paramp.cKK).field_msgSvrId == paramp.cKK) && (localp == null))
      {
        paramInt = 0;
        AppMethodBeat.o(116632);
      }
      else
      {
        label116: boolean bool2;
        String str1;
        String str2;
        int i;
        if (localp != null)
        {
          paramp.fileName = localp.fileName;
          paramp.bJt |= 1;
          ab.d("MicroMsg.VoiceLogic", com.tencent.mm.compatible.util.g.Mq() + "checktime :" + locala.Mr());
          boolean bool1 = false;
          bool2 = bool1;
          if (paramArrayOfByte != null)
          {
            bool2 = bool1;
            if (paramArrayOfByte.length > 1)
            {
              if (localp != null)
                ab.e("MicroMsg.VoiceLogic", "Sync Voice Buf , But VoiceInfo is not new!");
              str1 = paramp.fYX;
              str2 = paramp.fileName;
              i = aY(str1, str2).write(paramArrayOfByte, paramArrayOfByte.length, 0);
              if (i >= 0)
                break label644;
              ab.e("MicroMsg.VoiceLogic", "Write Failed File:" + str2 + " newOffset:" + i + " voiceFormat:" + str1);
              bool2 = false;
              label276: paramp.gai = c(paramp.gai, paramArrayOfByte, paramArrayOfByte.length);
              paramp.bJt |= 524288;
            }
          }
          ab.d("MicroMsg.VoiceLogic", com.tencent.mm.compatible.util.g.Mq() + "checktime :" + locala.Mr());
          paramp.fXb = (System.currentTimeMillis() / 1000L);
          paramp.bJt |= 256;
          if (!bool2)
            break label769;
          paramp.status = 99;
        }
        while (true)
        {
          paramp.bJt |= 64;
          if (localp != null)
            break label842;
          if (bool2)
            paramp.fXe = ((int)a(paramp, bool2, paramInt, paramString1, paramString2, parama));
          if (parama != null)
          {
            paramp.dqI = bf.d(parama);
            if (parama.eAB != null)
              paramp.gag = parama.eAB.vEI;
          }
          ab.d("MicroMsg.VoiceLogic", com.tencent.mm.compatible.util.g.Mq() + "checktime :" + locala.Mr());
          paramp.bJt = -1;
          ab.d("MicroMsg.VoiceLogic", "Insert fileName:" + paramp.fileName + " stat:" + paramp.status + " net:" + paramp.fVG + " total:" + paramp.frO);
          if (m.ama().b(paramp))
            break label793;
          ab.d("MicroMsg.VoiceLogic", "Insert Error fileName:" + paramp.fileName + " stat:" + paramp.status + " net:" + paramp.fVG + " total:" + paramp.frO);
          paramInt = -2;
          AppMethodBeat.o(116632);
          break;
          paramp.fileName = u.uY(paramp.fWW);
          break label116;
          label644: if (paramArrayOfByte.length != i)
          {
            ab.e("MicroMsg.VoiceLogic", "Write File:" + str2 + " fileOff:" + i + " bufLen:" + paramArrayOfByte.length + " voiceFormat:" + str1);
            bool2 = false;
            break label276;
          }
          ab.i("MicroMsg.VoiceLogic", "writeVoiceFile file:[" + str2 + "] + buf:" + paramArrayOfByte.length + " voiceFormat:" + str1);
          uO(str2);
          bool2 = true;
          break label276;
          label769: if (paramp.frO == 0)
            paramp.status = 5;
          else
            paramp.status = 6;
        }
        label793: ab.d("MicroMsg.VoiceLogic", com.tencent.mm.compatible.util.g.Mq() + "checktime :" + locala.Mr());
        if (bool2)
        {
          paramInt = 1;
          AppMethodBeat.o(116632);
          continue;
          label842: ab.d("MicroMsg.VoiceLogic", "Sync Update file:" + paramp.fileName + " stat:" + paramp.status);
          if (!a(paramp))
          {
            paramInt = -44;
            AppMethodBeat.o(116632);
          }
          else if (bool2)
          {
            a(paramp, parama);
            paramInt = 1;
            AppMethodBeat.o(116632);
          }
        }
        else
        {
          if ((localp != null) && (localp.fWY == paramp.frO))
          {
            a(localp.fileName, localp.fWY, parama);
            ab.w("MicroMsg.VoiceLogic", "Sync TotalLen not Change (send endflag but TotoalLen == FileLen) :" + localp.fileName);
          }
          ab.i("MicroMsg.VoiceLogic", "summerbadcr setRecvSync end ret 0 and start run addMsgInfo[%s], syncWithBufSucc[%b], stack[%s]", new Object[] { parama, Boolean.valueOf(bool2), bo.dpG() });
          m.amc().run();
          paramInt = 0;
          AppMethodBeat.o(116632);
        }
      }
    }
  }

  public static int a(String paramString1, int paramInt1, long paramLong, String paramString2, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(116628);
    if (paramString1 == null)
    {
      paramInt1 = -1;
      AppMethodBeat.o(116628);
    }
    while (true)
    {
      return paramInt1;
      ab.d("MicroMsg.VoiceLogic", "dkmsgid UpdateAfterSend file:[" + paramString1 + "] newOff:" + paramInt1 + " SvrID:" + paramLong + " clientID:" + paramString2 + " hasSendEndFlag " + paramInt2);
      p localp = m.ama().uZ(paramString1);
      if (localp == null)
      {
        paramInt1 = -1;
        AppMethodBeat.o(116628);
      }
      else
      {
        localp.fVG = paramInt1;
        localp.fXb = (System.currentTimeMillis() / 1000L);
        localp.bJt = 264;
        if ((bo.isNullOrNil(localp.clientId)) && (paramString2 != null))
        {
          localp.clientId = paramString2;
          localp.bJt |= 512;
        }
        if ((localp.cKK == 0L) && (paramLong != 0L))
        {
          localp.cKK = paramLong;
          localp.bJt |= 4;
        }
        int i = 0;
        int j = i;
        if (localp.frO <= paramInt1)
        {
          j = i;
          if (localp.status == 3)
          {
            j = i;
            if (paramInt2 == 1)
            {
              localp.status = 99;
              localp.bJt |= 64;
              paramString2 = ((com.tencent.mm.plugin.messenger.foundation.a.j)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).bOr().jf(localp.fXe);
              paramString2.ju(localp.cIS);
              paramString2.eI(localp.cKK);
              paramString2.setStatus(2);
              paramString2.setContent(n.d(localp.fWW, localp.gaf, false));
              paramString2.Mr(paramInt3);
              Integer localInteger = (Integer)gak.get(getFullPath(paramString1));
              if (localInteger != null)
              {
                localp.gai = localInteger.intValue();
                localp.bJt |= 524288;
              }
              ((com.tencent.mm.plugin.messenger.foundation.a.j)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).bOr().a(localp.fXe, paramString2);
              ab.d("MicroMsg.VoiceLogic", "END!!! updateSend  file:" + paramString1 + " total:" + localp.frO + " status:" + localp.status + " netTimes:" + localp.fXf + " msgId:" + paramString2.field_msgId);
              j = 1;
              uO(paramString1);
            }
          }
        }
        if (!a(localp))
        {
          paramInt1 = -4;
          AppMethodBeat.o(116628);
        }
        else
        {
          AppMethodBeat.o(116628);
          paramInt1 = j;
        }
      }
    }
  }

  public static int a(String paramString, int paramInt, e.a parama)
  {
    int i = -1;
    AppMethodBeat.i(116635);
    if (paramString == null)
      AppMethodBeat.o(116635);
    while (true)
    {
      return i;
      p localp = m.ama().uZ(paramString);
      if (localp == null)
      {
        AppMethodBeat.o(116635);
      }
      else
      {
        localp.fWY = paramInt;
        localp.fXb = (System.currentTimeMillis() / 1000L);
        localp.bJt = 272;
        int j = 0;
        i = j;
        if (localp.frO > 0)
        {
          i = j;
          if (paramInt >= localp.frO)
          {
            a(localp, parama);
            localp.status = 99;
            localp.bJt |= 64;
            ab.d("MicroMsg.VoiceLogic", "END!!! updateRecv  file:" + paramString + " newsize:" + paramInt + " total:" + localp.frO + " status:" + localp.status + " netTimes:" + localp.fXf);
            i = 1;
            uO(paramString);
          }
        }
        ab.d("MicroMsg.VoiceLogic", "updateRecv file:" + paramString + " newsize:" + paramInt + " total:" + localp.frO + " status:" + localp.status);
        if (!a(localp))
        {
          i = -3;
          AppMethodBeat.o(116635);
        }
        else
        {
          AppMethodBeat.o(116635);
        }
      }
    }
  }

  private static long a(p paramp, boolean paramBoolean, int paramInt, String paramString1, String paramString2, e.a parama)
  {
    AppMethodBeat.i(116634);
    long l;
    if (((com.tencent.mm.plugin.messenger.foundation.a.j)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).bOr().jh(paramp.cKK))
    {
      ab.i("MicroMsg.VoiceLogic", "[oneliang] msg svrid:%s,it is in delete msg list,may be revoke msg come first,msg info insert last,so no need to add msg info and delete voice info", new Object[] { Long.valueOf(paramp.cKK) });
      if (bo.nullAsNil(paramp.fileName).length() > 0)
        m.ama().pI(paramp.fileName);
      while (true)
      {
        l = -1L;
        AppMethodBeat.o(116634);
        return l;
        ab.i("MicroMsg.VoiceLogic", "[oneliang] the length of voice info file name is zero");
      }
    }
    bi localbi = new bi();
    localbi.eI(paramp.cKK);
    localbi.jv(paramp.fileName);
    localbi.eJ(bf.q(paramp.cIS, paramp.createTime));
    localbi.ju(paramp.cIS);
    int i;
    if (r.mG(paramp.fWW))
    {
      i = 1;
      label167: localbi.hO(i);
      localbi.setType(34);
      localbi.jz(paramString1);
      localbi.Mr(paramp.fZe);
      localbi.setStatus(paramInt);
      if (parama != null)
        break label561;
      paramInt = paramp.dqI;
      if (paramInt != 0)
      {
        ab.i("MicroMsg.VoiceLogic", "summerbadcr createMsgInfo flag has set[%d]", new Object[] { Integer.valueOf(paramInt) });
        localbi.hY(paramInt);
        if ((localbi.field_msgId == 0L) && (localbi.field_isSend == 0) && ((paramInt & 0x2) != 0))
          localbi.eJ(bf.g(localbi.field_talker, paramp.createTime, localbi.field_msgSeq));
      }
      if (paramp.gag != 0)
        localbi.eL(paramp.gag);
      ab.i("MicroMsg.VoiceLogic", "summerbadcr insert voice addMsgInfo is null but flag[%d], msgSeq[%d]", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(paramp.gag) });
      label333: ab.i("MicroMsg.VoiceLogic", "summerbadcr create voice msg info, msgSource : %s", new Object[] { paramString2 });
      if (!bo.isNullOrNil(paramString2))
      {
        localbi.ix(paramString2);
        localbi.jA(bf.oF(paramString2));
      }
      if (paramBoolean)
        break label571;
      localbi.setContent(n.d(paramp.fWW, 0L, false));
    }
    while (true)
    {
      if (!bo.isNullOrNil(paramString2))
      {
        localbi.ix(paramString2);
        localbi.jA(bf.oF(paramString2));
        paramp = bf.oE(paramString2);
        if (paramp != null)
        {
          localbi.jA(paramp.fmu);
          localbi.jy(paramp.fmt);
          ab.i("MicroMsg.VoiceLogic", "bizClientMsgId = %s", new Object[] { paramp.fmt });
          if (paramp.fmx != null)
          {
            paramString1 = new jf();
            paramString1.cEs.csG = localbi;
            paramString1.cEs.cEt = paramp;
            com.tencent.mm.sdk.b.a.xxA.m(paramString1);
          }
        }
      }
      ab.i("MicroMsg.VoiceLogic", "summerbadcr parseVoiceMsg svrId[%d], msgseq[%d]", new Object[] { Long.valueOf(localbi.field_msgSvrId), Long.valueOf(localbi.field_msgSeq) });
      l = bf.l(localbi);
      AppMethodBeat.o(116634);
      break;
      i = 0;
      break label167;
      label561: bf.a(localbi, parama);
      break label333;
      label571: localbi.setContent(n.d(paramp.fWW, paramp.gaf, false));
    }
  }

  private static boolean a(p paramp)
  {
    boolean bool = false;
    AppMethodBeat.i(116643);
    if (paramp == null)
      AppMethodBeat.o(116643);
    while (true)
    {
      return bool;
      if (paramp.bJt == -1)
      {
        AppMethodBeat.o(116643);
      }
      else
      {
        bool = m.ama().a(paramp.fileName, paramp);
        AppMethodBeat.o(116643);
      }
    }
  }

  private static boolean a(p paramp, e.a parama)
  {
    AppMethodBeat.i(116633);
    try
    {
      paramp.fXe = ((int)a(paramp, true, 3, "", paramp.dqJ, parama));
      paramp.bJt |= 2048;
      bool = a(paramp);
      AppMethodBeat.o(116633);
      return bool;
    }
    catch (Exception paramp)
    {
      while (true)
      {
        ab.e("MicroMsg.VoiceLogic", "exception:%s", new Object[] { bo.l(paramp) });
        AppMethodBeat.o(116633);
        boolean bool = false;
      }
    }
  }

  public static boolean a(String paramString, com.tencent.mm.ai.j paramj)
  {
    boolean bool = false;
    AppMethodBeat.i(116621);
    if (paramString == null)
      AppMethodBeat.o(116621);
    while (true)
    {
      return bool;
      p localp = m.ama().uZ(paramString);
      if (localp == null)
      {
        ab.d("MicroMsg.VoiceLogic", "startSend null record : ".concat(String.valueOf(paramString)));
        AppMethodBeat.o(116621);
        continue;
      }
      if (localp.status != 1)
      {
        AppMethodBeat.o(116621);
        continue;
      }
      localp.status = 2;
      localp.bJt = 64;
      synchronized (gaj)
      {
        HashMap localHashMap2 = gaj;
        WeakReference localWeakReference = new java/lang/ref/WeakReference;
        localWeakReference.<init>(paramj);
        localHashMap2.put(paramString, localWeakReference);
        bool = a(localp);
        AppMethodBeat.o(116621);
      }
    }
  }

  public static b aY(String paramString1, String paramString2)
  {
    AppMethodBeat.i(116615);
    u localu = m.ama();
    paramString2 = getFullPath(paramString2);
    switch (bo.getInt(paramString1, -1))
    {
    case 2:
    case 3:
    default:
      if (localu.gav.get(paramString2) == null)
        localu.gav.put(paramString2, new a(paramString2));
      paramString1 = (b)localu.gav.get(paramString2);
      AppMethodBeat.o(116615);
    case 4:
    case 1:
    }
    while (true)
    {
      return paramString1;
      if (localu.gax.get(paramString2) == null)
        localu.gax.put(paramString2, new h(paramString2));
      paramString1 = (b)localu.gax.get(paramString2);
      AppMethodBeat.o(116615);
      continue;
      if (localu.gaw.get(paramString2) == null)
        localu.gaw.put(paramString2, new l(paramString2));
      paramString1 = (b)localu.gaw.get(paramString2);
      AppMethodBeat.o(116615);
    }
  }

  public static boolean ah(String paramString, int paramInt)
  {
    AppMethodBeat.i(116626);
    boolean bool = o(paramString, paramInt, 0);
    AppMethodBeat.o(116626);
    return bool;
  }

  public static List<p> amf()
  {
    ArrayList localArrayList = null;
    AppMethodBeat.i(116642);
    Object localObject1 = m.ama();
    Object localObject2 = "SELECT FileName, User, MsgId, NetOffset, FileNowSize, TotalLen, Status, CreateTime, LastModifyTime, ClientId, VoiceLength, MsgLocalId, Human, reserved1, reserved2, MsgSource, MsgFlag, MsgSeq, MasterBufId, checksum" + " FROM voiceinfo";
    localObject2 = (String)localObject2 + " WHERE Status<97 and User!=\"_USER_FOR_THROWBOTTLE_\"   order by CreateTime";
    localObject1 = ((u)localObject1).fni.a((String)localObject2, null, 2);
    int i = 0;
    int j = 0;
    if (((Cursor)localObject1).moveToFirst())
    {
      localArrayList = new ArrayList();
      do
      {
        localObject2 = new p();
        ((p)localObject2).d((Cursor)localObject1);
        localArrayList.add(localObject2);
        i = j + 1;
        j = i;
      }
      while (((Cursor)localObject1).moveToNext());
    }
    ab.d("MicroMsg.VoiceStorage", "getUnfinishInfo resCount:".concat(String.valueOf(i)));
    ((Cursor)localObject1).close();
    AppMethodBeat.o(116642);
    return localArrayList;
  }

  public static String amg()
  {
    AppMethodBeat.i(116649);
    Object localObject = new StringBuilder();
    com.tencent.mm.kernel.g.RQ();
    localObject = com.tencent.mm.kernel.g.RP().eJM + "voice/";
    AppMethodBeat.o(116649);
    return localObject;
  }

  public static int b(int paramInt1, byte[] paramArrayOfByte, int paramInt2)
  {
    int i = 0;
    if (paramArrayOfByte != null);
    try
    {
      int j = paramArrayOfByte.length;
      if (j == 0)
        j = 0;
      do
      {
        return j;
        j = paramInt1;
      }
      while (i >= paramInt2);
      j = paramArrayOfByte[(i + 0)];
      paramInt1 += j;
      i++;
    }
    finally
    {
    }
  }

  public static int c(int paramInt1, byte[] paramArrayOfByte, int paramInt2)
  {
    AppMethodBeat.i(116629);
    if ((paramArrayOfByte == null) || (paramArrayOfByte.length == 0))
      AppMethodBeat.o(116629);
    while (true)
    {
      return paramInt1;
      if (paramInt1 == 0)
        paramInt1 = paramArrayOfByte.hashCode() & 0xFF;
      for (int i = paramInt1; ; i = paramInt1 & 0xFF)
        for (int j = 0; j < paramInt2; j++)
          paramInt1 += (paramArrayOfByte[(j + 0)] & i) * 256;
      AppMethodBeat.o(116629);
    }
  }

  public static int c(String paramString, byte[] paramArrayOfByte, int paramInt)
  {
    AppMethodBeat.i(116630);
    paramString = m.ama().uZ(paramString);
    if (paramString == null)
    {
      paramInt = -1;
      AppMethodBeat.o(116630);
    }
    while (true)
    {
      return paramInt;
      paramString.gai = c(paramString.gai, paramArrayOfByte, paramInt);
      paramString.bJt |= 524288;
      if (a(paramString))
      {
        paramInt = paramString.gai;
        AppMethodBeat.o(116630);
      }
      else
      {
        paramInt = 0;
        AppMethodBeat.o(116630);
      }
    }
  }

  public static String f(String paramString1, String paramString2, int paramInt)
  {
    Object localObject = null;
    AppMethodBeat.i(116638);
    if (bo.isNullOrNil(paramString1))
    {
      AppMethodBeat.o(116638);
      paramString1 = localObject;
    }
    while (true)
    {
      return paramString1;
      if ((!bo.isNullOrNil(paramString2)) && (!paramString2.startsWith("amr_")) && (!paramString2.startsWith("spx_")))
        paramString2.startsWith("silk_");
      paramString1 = uP(paramString1);
      if (bo.isNullOrNil(paramString1))
      {
        AppMethodBeat.o(116638);
        paramString1 = localObject;
      }
      else if (com.tencent.mm.vfs.e.y(getFullPath(paramString2), getFullPath(paramString1)) < 0L)
      {
        AppMethodBeat.o(116638);
        paramString1 = localObject;
      }
      else
      {
        o(paramString1, paramInt, 1);
        AppMethodBeat.o(116638);
      }
    }
  }

  public static float fY(long paramLong)
  {
    float f1 = 60.0F;
    float f2 = 1.0F;
    AppMethodBeat.i(116644);
    float f3 = (float)paramLong / 1000.0F;
    if (f3 < 1.0F)
      f3 = f2;
    while (true)
    {
      if (f3 > 60.0F)
        f3 = f1;
      while (true)
      {
        f3 = Math.round(f3);
        AppMethodBeat.o(116644);
        return f3;
      }
    }
  }

  public static String getFullPath(String paramString)
  {
    AppMethodBeat.i(116618);
    if (bo.isNullOrNil(paramString))
    {
      paramString = null;
      AppMethodBeat.o(116618);
    }
    while (true)
    {
      return paramString;
      paramString = U(paramString, false);
      AppMethodBeat.o(116618);
    }
  }

  public static int mt(int paramInt)
  {
    return (paramInt - 6) / 32 * 20;
  }

  public static boolean mu(int paramInt)
  {
    AppMethodBeat.i(116637);
    bi localbi = ((com.tencent.mm.plugin.messenger.foundation.a.j)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).bOr().jf(paramInt);
    boolean bool;
    if ((localbi.field_msgId == 0L) || (localbi.field_imgPath == null))
    {
      AppMethodBeat.o(116637);
      bool = false;
    }
    while (true)
    {
      return bool;
      if (bo.isNullOrNil(localbi.field_imgPath))
      {
        AppMethodBeat.o(116637);
        bool = false;
      }
      else
      {
        Object localObject = localbi.field_imgPath;
        localObject = m.ama().uZ((String)localObject);
        if ((localObject == null) || (bo.isNullOrNil(((p)localObject).fileName)))
        {
          AppMethodBeat.o(116637);
          bool = false;
        }
        else
        {
          ((p)localObject).status = 3;
          ((p)localObject).fVG = 0;
          ((p)localObject).createTime = (System.currentTimeMillis() / 1000L);
          ((p)localObject).fXb = (System.currentTimeMillis() / 1000L);
          ((p)localObject).bJt = 8648;
          bool = a((p)localObject);
          ab.d("MicroMsg.VoiceLogic", " file:" + ((p)localObject).fileName + " msgid:" + ((p)localObject).fXe + "  stat:" + ((p)localObject).status);
          if ((((p)localObject).fXe == 0) || (bo.isNullOrNil(((p)localObject).cIS)))
          {
            ab.e("MicroMsg.VoiceLogic", " failed msg id:" + ((p)localObject).fXe + " user:" + ((p)localObject).cIS);
            AppMethodBeat.o(116637);
          }
          else
          {
            localbi.setStatus(1);
            ((com.tencent.mm.plugin.messenger.foundation.a.j)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).bOr().a(localbi.field_msgId, localbi);
            m.amc().run();
            AppMethodBeat.o(116637);
            bool = true;
          }
        }
      }
    }
  }

  private static boolean o(String paramString, int paramInt1, int paramInt2)
  {
    boolean bool = false;
    AppMethodBeat.i(116627);
    if (paramString == null)
      AppMethodBeat.o(116627);
    while (true)
    {
      return bool;
      ab.d("MicroMsg.VoiceLogic", "StopRecord fileName[" + paramString + "], fullPath[" + getFullPath(paramString) + "]");
      ??? = m.ama().uZ(paramString);
      if (??? == null)
      {
        AppMethodBeat.o(116627);
        continue;
      }
      if ((((p)???).status != 97) && (((p)???).status != 98))
        ((p)???).status = 3;
      ((p)???).frO = o.uj(paramString);
      if (((p)???).frO <= 0)
      {
        um(paramString);
        AppMethodBeat.o(116627);
        continue;
      }
      ((p)???).fXb = (System.currentTimeMillis() / 1000L);
      ((p)???).gaf = paramInt1;
      ((p)???).bJt = 3424;
      bi localbi = new bi();
      localbi.ju(((p)???).cIS);
      localbi.setType(34);
      localbi.hO(1);
      localbi.jv(paramString);
      if (((p)???).status == 97)
      {
        localbi.setStatus(2);
        localbi.setContent(n.d(((p)???).fWW, ((p)???).gaf, false));
        label241: localbi.eJ(bf.oC(((p)???).cIS));
        localbi.Mr(paramInt2);
        a.a.KG().g(localbi);
        ((p)???).fXe = ((int)bf.l(localbi));
        bool = a((p)???);
      }
      synchronized (gaj)
      {
        gaj.remove(paramString);
        AppMethodBeat.o(116627);
        continue;
        if (((p)???).status == 98)
        {
          localbi.setStatus(5);
          localbi.setContent(n.d(((p)???).fWW, -1L, true));
          break label241;
        }
        localbi.setStatus(1);
        localbi.setContent(n.d(((p)???).fWW, ((p)???).gaf, false));
      }
    }
  }

  public static boolean uM(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(116614);
    if (paramString == null)
      AppMethodBeat.o(116614);
    while (true)
    {
      return bool;
      paramString = m.ama().uZ(paramString);
      if (paramString == null)
      {
        AppMethodBeat.o(116614);
      }
      else if (paramString.fXf >= 250)
      {
        AppMethodBeat.o(116614);
      }
      else
      {
        paramString.fXf += 1;
        paramString.bJt = 8192;
        bool = a(paramString);
        AppMethodBeat.o(116614);
      }
    }
  }

  public static b uN(String paramString)
  {
    AppMethodBeat.i(116616);
    u localu = m.ama();
    String str = getFullPath(paramString);
    switch (o.uK(paramString))
    {
    default:
      if (localu.gav.get(str) == null)
        localu.gav.put(str, new a(str));
      paramString = (b)localu.gav.get(str);
      AppMethodBeat.o(116616);
    case 0:
    case 1:
    case 2:
    }
    while (true)
    {
      return paramString;
      if (localu.gav.get(str) == null)
        localu.gav.put(str, new a(str));
      paramString = (b)localu.gav.get(str);
      AppMethodBeat.o(116616);
      continue;
      if (localu.gaw.get(str) == null)
        localu.gaw.put(str, new l(str));
      paramString = (b)localu.gaw.get(str);
      AppMethodBeat.o(116616);
      continue;
      if (localu.gax.get(str) == null)
        localu.gax.put(str, new h(str));
      paramString = (b)localu.gax.get(str);
      AppMethodBeat.o(116616);
    }
  }

  private static void uO(String paramString)
  {
    AppMethodBeat.i(116617);
    u localu = m.ama();
    String str = getFullPath(paramString);
    switch (o.uK(paramString))
    {
    default:
      paramString = (a)localu.gav.get(str);
      if (paramString != null)
      {
        paramString.alO();
        localu.gav.remove(str);
      }
      AppMethodBeat.o(116617);
    case 0:
    case 1:
    case 2:
    }
    while (true)
    {
      return;
      paramString = (a)localu.gav.get(str);
      if (paramString != null)
      {
        paramString.alO();
        localu.gav.remove(str);
      }
      AppMethodBeat.o(116617);
      continue;
      paramString = (l)localu.gaw.get(str);
      if (paramString != null)
      {
        paramString.alO();
        localu.gaw.remove(str);
      }
      AppMethodBeat.o(116617);
      continue;
      paramString = (h)localu.gax.get(str);
      if (paramString != null)
      {
        paramString.alO();
        localu.gax.remove(str);
      }
      AppMethodBeat.o(116617);
    }
  }

  public static String uP(String paramString)
  {
    AppMethodBeat.i(116620);
    String str = u.uY(r.Yz());
    p localp = new p();
    localp.fileName = str;
    localp.cIS = paramString;
    localp.createTime = (System.currentTimeMillis() / 1000L);
    localp.clientId = str;
    localp.fXb = (System.currentTimeMillis() / 1000L);
    localp.status = 1;
    localp.fWW = r.Yz();
    localp.bJt = -1;
    if (!m.ama().b(localp))
    {
      paramString = null;
      AppMethodBeat.o(116620);
    }
    while (true)
    {
      return paramString;
      ab.i("MicroMsg.VoiceLogic", "startRecord insert voicestg success");
      AppMethodBeat.o(116620);
      paramString = str;
    }
  }

  public static boolean uQ(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(116622);
    if (paramString == null)
      AppMethodBeat.o(116622);
    while (true)
    {
      return bool;
      ab.d("MicroMsg.VoiceLogic", "Mark Canceled fileName[" + paramString + "]");
      p localp = m.ama().uZ(paramString);
      if (localp == null)
      {
        AppMethodBeat.o(116622);
      }
      else
      {
        localp.status = 8;
        localp.frO = o.uj(paramString);
        localp.bJt = 96;
        bool = a(localp);
        AppMethodBeat.o(116622);
      }
    }
  }

  public static boolean uR(String paramString)
  {
    AppMethodBeat.i(116623);
    boolean bool;
    if (paramString == null)
    {
      bool = false;
      AppMethodBeat.o(116623);
    }
    while (true)
    {
      return bool;
      p localp = m.ama().uZ(paramString);
      if (localp == null)
      {
        ab.d("MicroMsg.VoiceLogic", "cancel null download : ".concat(String.valueOf(paramString)));
        bool = true;
        AppMethodBeat.o(116623);
      }
      else
      {
        ab.d("MicroMsg.VoiceLogic", "cancel download : " + paramString + " SvrlId:" + localp.cKK);
        if (localp.cKK != 0L)
          ((com.tencent.mm.plugin.messenger.foundation.a.j)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).bOr().aa(localp.cIS, localp.cKK);
        bool = uT(paramString);
        AppMethodBeat.o(116623);
      }
    }
  }

  public static boolean uS(String paramString)
  {
    AppMethodBeat.i(116624);
    boolean bool;
    if (paramString == null)
    {
      bool = false;
      AppMethodBeat.o(116624);
    }
    while (true)
    {
      return bool;
      p localp = m.ama().uZ(paramString);
      if (localp == null)
      {
        ab.i("MicroMsg.VoiceLogic", "cancel null record : ".concat(String.valueOf(paramString)));
        bool = true;
        AppMethodBeat.o(116624);
      }
      else
      {
        ab.i("MicroMsg.VoiceLogic", "cancel record : " + paramString + " LocalId:" + localp.fXe);
        if (localp.fXe != 0)
          ((com.tencent.mm.plugin.messenger.foundation.a.j)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).bOr().jg(localp.fXe);
        bool = uT(paramString);
        AppMethodBeat.o(116624);
      }
    }
  }

  public static boolean uT(String paramString)
  {
    AppMethodBeat.i(116625);
    boolean bool;
    if (bo.isNullOrNil(paramString))
    {
      bool = false;
      AppMethodBeat.o(116625);
    }
    while (true)
    {
      return bool;
      m.ama().pI(paramString);
      uO(paramString);
      bool = new com.tencent.mm.vfs.b(getFullPath(paramString)).delete();
      AppMethodBeat.o(116625);
    }
  }

  public static boolean uU(String paramString)
  {
    boolean bool = true;
    AppMethodBeat.i(116631);
    p localp = m.ama().uZ(paramString);
    if (localp == null)
      AppMethodBeat.o(116631);
    while (true)
    {
      return bool;
      com.tencent.mm.vfs.b localb = new com.tencent.mm.vfs.b(getFullPath(paramString));
      paramString = uN(paramString);
      if ((paramString != null) && ((paramString instanceof a)) && (Math.abs(localb.length() - localp.frO) == 6L))
      {
        ab.i("MicroMsg.VoiceLogic", "maybe amr, ignore for the moment. %d %d", new Object[] { Long.valueOf(localb.length()), Integer.valueOf(localp.frO) });
        AppMethodBeat.o(116631);
      }
      else if (localb.length() != localp.frO)
      {
        ab.e("MicroMsg.VoiceLogic", "checkChecksum fail. %d, %d", new Object[] { Long.valueOf(localb.length()), Integer.valueOf(localp.frO) });
        AppMethodBeat.o(116631);
        bool = false;
      }
      else
      {
        paramString = paramString.cF(0, localp.frO);
        if ((paramString.ret == 0) && (localp.gai != 0) && (localp.gai != c(localp.gai & 0xFF, paramString.buf, paramString.cqs)))
        {
          ab.e("MicroMsg.VoiceLogic", "checkChecksum fail2. %d", new Object[] { Integer.valueOf(localp.gai) });
          AppMethodBeat.o(116631);
          bool = false;
        }
        else
        {
          AppMethodBeat.o(116631);
        }
      }
    }
  }

  public static bi uV(String paramString)
  {
    Object localObject = null;
    AppMethodBeat.i(116640);
    if (paramString == null)
    {
      AppMethodBeat.o(116640);
      paramString = localObject;
    }
    while (true)
    {
      return paramString;
      paramString = m.ama().uZ(paramString);
      if (paramString == null)
      {
        AppMethodBeat.o(116640);
        paramString = localObject;
      }
      else
      {
        paramString = ((com.tencent.mm.plugin.messenger.foundation.a.j)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).bOr().jf(paramString.fXe);
        AppMethodBeat.o(116640);
      }
    }
  }

  public static p uW(String paramString)
  {
    AppMethodBeat.i(138574);
    paramString = m.ama().uZ(paramString);
    AppMethodBeat.o(138574);
    return paramString;
  }

  public static int uX(String paramString)
  {
    AppMethodBeat.i(116648);
    synchronized (gaj)
    {
      if (gaj.get(paramString) != null)
      {
        paramString = (com.tencent.mm.ai.j)((WeakReference)gaj.get(paramString)).get();
        if (paramString != null)
        {
          i = (int)paramString.EV();
          AppMethodBeat.o(116648);
          return i;
        }
      }
      int i = -1;
      AppMethodBeat.o(116648);
    }
  }

  public static boolean um(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(116639);
    com.tencent.mm.plugin.report.service.h.pYm.a(111L, 234L, 1L, false);
    if (paramString == null)
      AppMethodBeat.o(116639);
    while (true)
    {
      return bool;
      p localp = m.ama().uZ(paramString);
      if (localp == null)
      {
        ab.e("MicroMsg.VoiceLogic", "Set error failed file:".concat(String.valueOf(paramString)));
        AppMethodBeat.o(116639);
      }
      else
      {
        localp.status = 98;
        localp.fXb = (System.currentTimeMillis() / 1000L);
        localp.bJt = 320;
        bool = a(localp);
        ab.d("MicroMsg.VoiceLogic", "setError file:" + paramString + " msgid:" + localp.fXe + " old stat:" + localp.status);
        if ((localp.fXe == 0) || (bo.isNullOrNil(localp.cIS)))
        {
          ab.e("MicroMsg.VoiceLogic", "setError failed msg id:" + localp.fXe + " user:" + localp.cIS);
          AppMethodBeat.o(116639);
        }
        else
        {
          paramString = ((com.tencent.mm.plugin.messenger.foundation.a.j)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).bOr().jf(localp.fXe);
          com.tencent.mm.plugin.report.e.pXa.a(111L, 33L, 1L, true);
          paramString.setMsgId(localp.fXe);
          paramString.setStatus(5);
          paramString.ju(localp.cIS);
          paramString.setContent(n.d(localp.fWW, -1L, true));
          ((com.tencent.mm.plugin.messenger.foundation.a.j)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).bOr().a(paramString.field_msgId, paramString);
          AppMethodBeat.o(116639);
        }
      }
    }
  }

  public static boolean un(String paramString)
  {
    AppMethodBeat.i(116636);
    p localp = m.ama().uZ(paramString);
    boolean bool;
    if (localp == null)
    {
      AppMethodBeat.o(116636);
      bool = false;
    }
    while (true)
    {
      return bool;
      if (localp.status == 3)
      {
        paramString = ((com.tencent.mm.plugin.messenger.foundation.a.j)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).bOr().jf(localp.fXe);
        paramString.setContent(n.d(localp.fWW, localp.gaf, false));
        paramString.setStatus(2);
        ((com.tencent.mm.plugin.messenger.foundation.a.j)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).bOr().a(localp.fXe, paramString);
      }
      localp.status = 97;
      localp.fXb = (System.currentTimeMillis() / 1000L);
      localp.bJt = 320;
      bool = a(localp);
      AppMethodBeat.o(116636);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelvoice.q
 * JD-Core Version:    0.6.2
 */