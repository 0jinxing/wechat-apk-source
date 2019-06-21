package com.tencent.mm.plugin.expt.b;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Build;
import android.os.Build.VERSION;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.fa;
import com.tencent.mm.g.a.jt;
import com.tencent.mm.g.b.a.ct;
import com.tencent.mm.g.b.a.cu;
import com.tencent.mm.kernel.e.c;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.bz;
import com.tencent.mm.plugin.expt.a.a.a;
import com.tencent.mm.plugin.expt.ui.ExptDebugUI;
import com.tencent.mm.plugin.messenger.foundation.a.n;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.pointers.PBool;
import com.tencent.mm.protocal.protobuf.dq;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.br;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class a
  implements com.tencent.mm.kernel.api.c, com.tencent.mm.plugin.expt.a.a
{
  private static a lNE;
  private int eCL;
  private int frU;
  public com.tencent.mm.plugin.expt.e.d lNF;
  public com.tencent.mm.plugin.expt.e.b lNG;
  private com.tencent.mm.a.f<Integer, com.tencent.mm.plugin.expt.d.a> lNH;
  private com.tencent.mm.a.f<String, Integer> lNI;
  private int lNJ;
  private com.tencent.mm.sdk.b.c lNK;
  private n lNL;
  private com.tencent.mm.ai.f lNM;
  private com.tencent.mm.sdk.b.c<jt> lNN;

  private a()
  {
    AppMethodBeat.i(73494);
    this.frU = 0;
    this.eCL = 0;
    this.lNH = new com.tencent.mm.memory.a.c(100);
    this.lNI = new com.tencent.mm.memory.a.c(100);
    this.lNJ = 0;
    this.lNK = new a.1(this);
    this.lNL = new a.2(this);
    this.lNM = new a.3(this);
    this.lNN = new a.4(this);
    AppMethodBeat.o(73494);
  }

  private int KX(String paramString)
  {
    AppMethodBeat.i(73502);
    Integer localInteger = (Integer)this.lNI.get(paramString);
    int i;
    if (localInteger != null)
    {
      i = localInteger.intValue();
      AppMethodBeat.o(73502);
    }
    while (true)
    {
      return i;
      i = this.lNG.KX(paramString);
      if (i > 0)
        this.lNI.put(paramString, Integer.valueOf(i));
      AppMethodBeat.o(73502);
    }
  }

  private static void a(SharedPreferences paramSharedPreferences, boolean paramBoolean)
  {
    AppMethodBeat.i(73510);
    paramSharedPreferences = paramSharedPreferences.edit();
    if (paramBoolean);
    for (int i = 1; ; i = 0)
    {
      paramSharedPreferences.putInt("special_scene_enable", i).commit();
      ab.i("MicroMsg.ExptService", "setSpecialSceneEnable() enable: %s", new Object[] { Boolean.valueOf(paramBoolean) });
      AppMethodBeat.o(73510);
      return;
    }
  }

  public static void a(List<com.tencent.mm.plugin.expt.d.a> paramList, List<dq> paramList1, List<Integer> paramList2)
  {
    AppMethodBeat.i(73514);
    LinkedList localLinkedList = new LinkedList();
    Object localObject1;
    Object localObject2;
    if (paramList != null)
    {
      paramList = paramList.iterator();
      while (paramList.hasNext())
      {
        localObject1 = (com.tencent.mm.plugin.expt.d.a)paramList.next();
        if ((localObject1 != null) && (((com.tencent.mm.plugin.expt.d.a)localObject1).bro()))
        {
          localObject2 = new com.tencent.mm.plugin.welab.b.c();
          ((com.tencent.mm.plugin.welab.b.c)localObject2).uMa = ((com.tencent.mm.plugin.expt.d.a)localObject1).field_exptId;
          ((com.tencent.mm.plugin.welab.b.c)localObject2).Zb = ((com.tencent.mm.plugin.expt.d.a)localObject1).field_groupId;
          ((com.tencent.mm.plugin.welab.b.c)localObject2).startTime = ((com.tencent.mm.plugin.expt.d.a)localObject1).field_startTime;
          ((com.tencent.mm.plugin.welab.b.c)localObject2).endTime = ((com.tencent.mm.plugin.expt.d.a)localObject1).field_endTime;
          ((com.tencent.mm.plugin.welab.b.c)localObject2).uMc = ((com.tencent.mm.plugin.expt.d.a)localObject1).field_exptContent;
          ((com.tencent.mm.plugin.welab.b.c)localObject2).uMb = ((com.tencent.mm.plugin.expt.d.a)localObject1).field_exptSeq;
          ((com.tencent.mm.plugin.welab.b.c)localObject2).cag = ((com.tencent.mm.plugin.expt.d.a)localObject1).brq();
          localLinkedList.add(localObject2);
        }
      }
    }
    paramList = new LinkedList();
    if (paramList1 != null)
    {
      localObject1 = paramList1.iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (dq)((Iterator)localObject1).next();
        paramList1 = new com.tencent.mm.plugin.welab.b.d();
        paramList1.appId = ((dq)localObject2).csB;
        paramList1.status = ((dq)localObject2).status;
        paramList.add(paramList1);
      }
    }
    ((com.tencent.mm.plugin.welab.b.a)g.K(com.tencent.mm.plugin.welab.b.a.class)).e(localLinkedList, paramList, paramList2);
    AppMethodBeat.o(73514);
  }

  public static a bqR()
  {
    AppMethodBeat.i(73493);
    if (lNE == null)
      lNE = new a();
    a locala = lNE;
    AppMethodBeat.o(73493);
    return locala;
  }

  private void bqT()
  {
    AppMethodBeat.i(73508);
    int i = a(a.a.lIY, -1);
    Object localObject1;
    Object localObject2;
    if (!bo.gW(i, 0))
      if (bo.gW(i, 2))
      {
        localObject1 = a(a.a.lJb, "");
        ab.i("MicroMsg.ExptService", "manufacturers:%s", new Object[] { bo.bc((String)localObject1, "null") });
        if (bo.isNullOrNil((String)localObject1))
        {
          com.tencent.mm.booter.c.bu(true);
          i = a(a.a.lJc, 0);
          if ((!com.tencent.mm.compatible.util.d.iW(26)) || (!bo.gW(i, 0)) || (!com.tencent.mm.sdk.h.a.dqu()))
            break label432;
          localObject2 = a(a.a.lJd, "");
          localObject1 = Build.MODEL.toLowerCase();
          ab.i("MicroMsg.ExptService", "model:%s startServiceHuaweiInfo:%s", new Object[] { localObject1, bo.bc((String)localObject2, "null") });
        }
      }
    while (true)
    {
      try
      {
        if (!bo.isNullOrNil((String)localObject2))
        {
          localObject2 = ((String)localObject2).split(",");
          i = 0;
          if (i >= localObject2.length)
            break label445;
          if (((String)localObject1).startsWith(localObject2[i].toLowerCase()))
          {
            com.tencent.mm.booter.c.ii(1);
            i = 1;
            if (i == 0)
              com.tencent.mm.booter.c.ii(0);
            AppMethodBeat.o(73508);
            return;
            localObject1 = ((String)localObject1).split(",");
            i = 0;
            if (i >= localObject1.length)
              break label455;
            if (String.valueOf(localObject1[i]).equalsIgnoreCase(Build.MANUFACTURER))
            {
              com.tencent.mm.booter.c.bu(false);
              i = 1;
              if (i != 0)
                break;
              com.tencent.mm.booter.c.bu(true);
              break;
            }
            i++;
            continue;
            if (!bo.gW(i, 1))
              break;
            localObject1 = a(a.a.lIZ, "");
            ab.i("MicroMsg.ExptService", "manufacturers:%s", new Object[] { bo.bc((String)localObject1, "null") });
            if (!bo.isNullOrNil((String)localObject1))
            {
              localObject1 = ((String)localObject1).split(",");
              i = 0;
              if (i >= localObject1.length)
                break label450;
              if (String.valueOf(localObject1[i]).equalsIgnoreCase(Build.MANUFACTURER))
              {
                com.tencent.mm.booter.c.bu(true);
                i = 1;
                if (i != 0)
                  break;
                com.tencent.mm.booter.c.bu(false);
                break;
              }
              i++;
              continue;
            }
            com.tencent.mm.booter.c.bu(false);
            break;
          }
          i++;
          continue;
        }
        com.tencent.mm.booter.c.ii(0);
        AppMethodBeat.o(73508);
        continue;
      }
      catch (Exception localException)
      {
        ab.i("MicroMsg.ExptService", "startServiceHuaweiInfo Exception:%s %s", new Object[] { localException.getClass().getSimpleName(), localException.getMessage() });
        com.tencent.mm.booter.c.ii(0);
        AppMethodBeat.o(73508);
        continue;
      }
      label432: com.tencent.mm.booter.c.ii(1);
      AppMethodBeat.o(73508);
      continue;
      label445: i = 0;
      continue;
      label450: i = 0;
      continue;
      label455: i = 0;
    }
  }

  private boolean bqU()
  {
    if ((this.lNF == null) || (this.lNG == null));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  private void bqV()
  {
    AppMethodBeat.i(73515);
    int i = a(a.a.lGh, -1);
    if (i != -1)
    {
      h.pYm.k(1006L, 200L, 1L);
      ab.i("MicroMsg.ExptService", "snsStoryReport config[%d]", new Object[] { Integer.valueOf(i) });
    }
    AppMethodBeat.o(73515);
  }

  private static void d(SharedPreferences paramSharedPreferences)
  {
    boolean bool1 = false;
    AppMethodBeat.i(73509);
    int i = ((com.tencent.mm.plugin.expt.a.a)g.K(com.tencent.mm.plugin.expt.a.a.class)).a(a.a.lHq, -1);
    ab.i("MicroMsg.ExptService", "iniNotificationSpecialSceneSwitchEnable() enable:%s", new Object[] { Integer.valueOf(i) });
    Object localObject;
    boolean bool2;
    if (bo.gW(i, 1))
    {
      localObject = ((com.tencent.mm.plugin.expt.a.a)g.K(com.tencent.mm.plugin.expt.a.a.class)).a(a.a.lHr, "");
      ab.i("MicroMsg.ExptService", "specialSceneDetail %s", new Object[] { localObject });
      bool2 = bool1;
      if (!bo.isNullOrNil((String)localObject))
      {
        localObject = br.z((String)localObject, "manufacturerlist");
        bool2 = bool1;
        if (localObject != null)
          if (!((Map)localObject).containsKey(".manufacturerlist.size"))
            break label473;
      }
    }
    label423: label473: for (i = bo.getInt((String)((Map)localObject).get(".manufacturerlist.size"), 0); ; i = 0)
    {
      int j = Build.VERSION.SDK_INT;
      int k = 0;
      bool2 = bool1;
      if (k < i)
      {
        if (k == 0)
        {
          if (!String.valueOf(bo.nullAsNil((String)((Map)localObject).get(".manufacturerlist.manufacturer.name"))).equalsIgnoreCase(Build.MANUFACTURER))
            break label423;
          bool2 = com.tencent.mm.sdk.h.b.g(j, bo.nullAsNil((String)((Map)localObject).get(".manufacturerlist.manufacturer.sdkversionmin")), bo.nullAsNil((String)((Map)localObject).get(".manufacturerlist.manufacturer.sdkversionmax")), bo.nullAsNil((String)((Map)localObject).get(".manufacturerlist.manufacturer.versintime")));
        }
      }
      else
      {
        label244: a(paramSharedPreferences, bool2);
        AppMethodBeat.o(73509);
      }
      while (true)
      {
        return;
        if (String.valueOf(bo.nullAsNil((String)((Map)localObject).get(".manufacturerlist.manufacturer" + k + ".name"))).equalsIgnoreCase(Build.MANUFACTURER))
        {
          bool2 = com.tencent.mm.sdk.h.b.g(j, bo.nullAsNil((String)((Map)localObject).get(".manufacturerlist.manufacturer" + k + ".sdkversionmin")), bo.nullAsNil((String)((Map)localObject).get(".manufacturerlist.manufacturer" + k + ".sdkversionmax")), bo.nullAsNil((String)((Map)localObject).get(".manufacturerlist.manufacturer" + k + ".versintime")));
          break label244;
        }
        k++;
        break;
        if (bo.gW(i, 0))
        {
          a(paramSharedPreferences, false);
          AppMethodBeat.o(73509);
        }
        else
        {
          if (bo.gW(i, 2))
            a(paramSharedPreferences, true);
          AppMethodBeat.o(73509);
        }
      }
    }
  }

  public static void va(int paramInt)
  {
    AppMethodBeat.i(73513);
    g.Rg().a(new b(paramInt), 0);
    AppMethodBeat.o(73513);
  }

  public final void KY(String paramString)
  {
    AppMethodBeat.i(73506);
    if (bo.isNullOrNil(paramString))
    {
      ab.w("MicroMsg.ExptService", "receive expt xml but content is null");
      AppMethodBeat.o(73506);
      return;
    }
    LinkedList localLinkedList1 = new LinkedList();
    LinkedList localLinkedList2 = new LinkedList();
    com.tencent.mm.plugin.expt.d.a locala = new com.tencent.mm.plugin.expt.d.a();
    Object localObject;
    boolean bool;
    if (locala.La(paramString))
      if (locala.field_exptSeq < 0)
      {
        h.pYm.a(863L, 3L, 1L, false);
        localObject = uZ(locala.field_exptId);
        if ((localObject != null) && (((com.tencent.mm.plugin.expt.d.a)localObject).bro()))
          localLinkedList1.add(Integer.valueOf(locala.field_exptId));
        localObject = new ArrayList();
        ((List)localObject).add(Integer.valueOf(locala.field_exptId));
        if (bB((List)localObject) > 0)
        {
          bool = true;
          label160: bqS();
        }
      }
    while (true)
    {
      if ((localLinkedList2.size() > 0) || (localLinkedList1.size() > 0))
        a(localLinkedList2, null, localLinkedList1);
      ab.i("MicroMsg.ExptService", "received expt xml dbFlag[%b] [%s] ", new Object[] { Boolean.valueOf(bool), paramString });
      AppMethodBeat.o(73506);
      break;
      bool = false;
      break label160;
      h.pYm.a(863L, 4L, 1L, false);
      localObject = new ArrayList();
      ((List)localObject).add(locala);
      if (bA((List)localObject) > 0);
      for (bool = true; ; bool = false)
      {
        if (locala.bro())
          localLinkedList2.add(locala);
        localObject = new ct();
        ((ct)localObject).dig = locala.field_exptId;
        ((ct)localObject).dih = locala.field_groupId;
        ((ct)localObject).dii = locala.field_exptSeq;
        ((ct)localObject).ajK();
        break;
      }
      bool = false;
    }
  }

  public final float a(a.a parama, float paramFloat)
  {
    AppMethodBeat.i(73497);
    parama = a(parama, "");
    if (bo.isNullOrNil(parama))
      AppMethodBeat.o(73497);
    while (true)
    {
      return paramFloat;
      paramFloat = bo.getFloat(parama, paramFloat);
      AppMethodBeat.o(73497);
    }
  }

  public final int a(a.a parama, int paramInt)
  {
    AppMethodBeat.i(73498);
    parama = a(parama, "");
    if (bo.isNullOrNil(parama))
      AppMethodBeat.o(73498);
    while (true)
    {
      return paramInt;
      paramInt = bo.getInt(parama, paramInt);
      AppMethodBeat.o(73498);
    }
  }

  public final long a(a.a parama, long paramLong)
  {
    AppMethodBeat.i(73499);
    parama = a(parama, "");
    if (bo.isNullOrNil(parama))
      AppMethodBeat.o(73499);
    while (true)
    {
      return paramLong;
      paramLong = bo.getLong(parama, paramLong);
      AppMethodBeat.o(73499);
    }
  }

  public final String a(a.a parama, String paramString)
  {
    AppMethodBeat.i(73500);
    if (parama == null)
      AppMethodBeat.o(73500);
    while (true)
    {
      return paramString;
      Object localObject;
      if (bqU())
      {
        com.tencent.mm.plugin.expt.e.c.bru();
        localObject = com.tencent.mm.plugin.expt.e.c.a(parama, paramString, true);
        ab.i("MicroMsg.ExptService", "API check Expt from mmkv result[%s] key[%s] def[%s]", new Object[] { localObject, parama, paramString });
        AppMethodBeat.o(73500);
        paramString = (String)localObject;
      }
      else
      {
        long l = bo.yz();
        String str = parama.name();
        int i = KX(str);
        cu localcu = new cu();
        PBool localPBool = new PBool();
        localObject = a(i, true, localcu, localPBool);
        if ((localObject == null) || (((HashMap)localObject).size() <= 0))
        {
          AppMethodBeat.o(73500);
        }
        else
        {
          localObject = (String)((HashMap)localObject).get(str);
          if ((!bo.isNullOrNil((String)localObject)) && (localPBool.value))
            localcu.hJ(str).hK((String)localObject).ajK();
          ab.i("MicroMsg.ExptService", "API Got Expt result[%s] exptId[%d] key[%s %s] defStr[%s] cost[%d]", new Object[] { localObject, Integer.valueOf(i), parama, str, paramString, Long.valueOf(bo.az(l)) });
          if (!bo.isNullOrNil((String)localObject))
          {
            AppMethodBeat.o(73500);
            paramString = (String)localObject;
          }
          else
          {
            AppMethodBeat.o(73500);
          }
        }
      }
    }
  }

  public final HashMap<String, String> a(int paramInt, boolean paramBoolean, cu paramcu, PBool paramPBool)
  {
    AppMethodBeat.i(73503);
    if (this.lNF == null)
    {
      ab.e("MicroMsg.ExptService", "Expt service is not init here! exptId[%d]", new Object[] { Integer.valueOf(paramInt) });
      localObject1 = null;
      AppMethodBeat.o(73503);
    }
    while (true)
    {
      return localObject1;
      if (paramInt > 0)
        break;
      localObject1 = null;
      AppMethodBeat.o(73503);
    }
    long l = bo.yz();
    Object localObject1 = null;
    Object localObject2 = null;
    com.tencent.mm.plugin.expt.d.a locala = uZ(paramInt);
    if ((locala == null) || (bo.isNullOrNil(locala.field_exptContent)))
    {
      ab.w("MicroMsg.ExptService", "expt item is null or expt content is null.");
      label102: if (localObject1 == null)
        break label329;
    }
    label329: for (paramcu = (cu)localObject1; ; paramcu = Integer.valueOf(0))
    {
      ab.i("MicroMsg.ExptService", "get expt [%d] map[%s] expt[%s] cost[%d]", new Object[] { Integer.valueOf(paramInt), paramcu, localObject2, Long.valueOf(bo.az(l)) });
      AppMethodBeat.o(73503);
      break;
      String str = locala.field_exptContent;
      if ((paramBoolean) && (!locala.isReady()))
      {
        ab.w("MicroMsg.ExptService", "expt time is invalid time[%d %d] seq[%d]", new Object[] { Long.valueOf(locala.field_startTime), Long.valueOf(locala.field_endTime), Integer.valueOf(locala.field_exptSeq) });
        localObject2 = str;
        break label102;
      }
      HashMap localHashMap = locala.brq();
      localObject2 = str;
      localObject1 = localHashMap;
      if (!locala.brp())
        break label102;
      paramPBool.value = true;
      localObject2 = str;
      localObject1 = localHashMap;
      if (paramcu == null)
        break label102;
      paramcu.dig = locala.field_exptId;
      paramcu.dih = locala.field_groupId;
      paramcu.dii = locala.field_exptSeq;
      paramcu.cYo = locala.field_startTime;
      paramcu.dij = locala.field_endTime;
      localObject2 = str;
      localObject1 = localHashMap;
      break label102;
    }
  }

  public final boolean a(a.a parama, boolean paramBoolean)
  {
    AppMethodBeat.i(73496);
    parama = a(parama, "");
    if (bo.isNullOrNil(parama))
      AppMethodBeat.o(73496);
    while (true)
    {
      return paramBoolean;
      if (paramBoolean);
      for (int i = 1; ; i = 0)
      {
        if (bo.getInt(parama, i) == 0)
          break label60;
        AppMethodBeat.o(73496);
        paramBoolean = true;
        break;
      }
      label60: AppMethodBeat.o(73496);
      paramBoolean = false;
    }
  }

  public final int bA(List<com.tencent.mm.plugin.expt.d.a> paramList)
  {
    int i = 0;
    AppMethodBeat.i(73511);
    if (paramList.size() <= 0)
    {
      AppMethodBeat.o(73511);
      return i;
    }
    List localList = this.lNF.bH(paramList);
    LinkedList localLinkedList1 = new LinkedList();
    LinkedList localLinkedList2 = new LinkedList();
    label137: label208: label234: int j;
    int k;
    if (localList != null)
    {
      i = localList.size();
      Iterator localIterator1 = localList.iterator();
      while (localIterator1.hasNext())
      {
        com.tencent.mm.plugin.expt.d.a locala = (com.tencent.mm.plugin.expt.d.a)localIterator1.next();
        this.lNH.put(Integer.valueOf(locala.field_exptId), locala);
        Object localObject = locala.brq();
        if (localObject != null)
        {
          Iterator localIterator2 = ((HashMap)localObject).keySet().iterator();
          String str;
          if (localIterator2.hasNext())
          {
            str = (String)localIterator2.next();
            localObject = this.lNG.Lc(str);
            if (localObject == null)
              break label234;
            if (((com.tencent.mm.plugin.expt.e.a)localObject).field_exptId == locala.field_exptId)
              break label385;
            ((com.tencent.mm.plugin.expt.e.a)localObject).field_exptId = locala.field_exptId;
            localLinkedList1.add(localObject);
          }
          while (true)
          {
            this.lNI.put(((com.tencent.mm.plugin.expt.e.a)localObject).field_exptKey, Integer.valueOf(((com.tencent.mm.plugin.expt.e.a)localObject).field_exptId));
            break label137;
            break;
            localObject = new com.tencent.mm.plugin.expt.e.a();
            ((com.tencent.mm.plugin.expt.e.a)localObject).field_exptId = locala.field_exptId;
            ((com.tencent.mm.plugin.expt.e.a)localObject).field_exptKey = str;
            localLinkedList2.add(localObject);
          }
        }
      }
      j = this.lNG.bC(localLinkedList2);
      k = this.lNG.bD(localLinkedList1);
      com.tencent.mm.plugin.expt.e.c.bru().bF(localList);
    }
    while (true)
    {
      ab.i("MicroMsg.ExptService", "replace ExptIds args[%d] db[%d] exptMap insert[list:%d  db:%d], update[list:%d db:%d]", new Object[] { Integer.valueOf(paramList.size()), Integer.valueOf(i), Integer.valueOf(localLinkedList2.size()), Integer.valueOf(j), Integer.valueOf(localLinkedList1.size()), Integer.valueOf(k) });
      AppMethodBeat.o(73511);
      break;
      label385: break label208;
      k = 0;
      j = 0;
      i = 0;
    }
  }

  public final int bB(List<Integer> paramList)
  {
    AppMethodBeat.i(73512);
    int i = this.lNF.bB(paramList);
    ab.i("MicroMsg.ExptService", "delete expt ids deleteCount[%d] deleteMapCount[%d]", new Object[] { Integer.valueOf(i), Integer.valueOf(this.lNG.bE(paramList)) });
    bqQ();
    com.tencent.mm.plugin.expt.e.c.bru().bG(paramList);
    AppMethodBeat.o(73512);
    return i;
  }

  final void bqQ()
  {
    try
    {
      AppMethodBeat.i(73492);
      this.lNH.clear();
      this.lNI.clear();
      AppMethodBeat.o(73492);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  protected final void bqS()
  {
    AppMethodBeat.i(73507);
    com.tencent.mm.sdk.b.a.xxA.m(new fa());
    SharedPreferences localSharedPreferences = com.tencent.mm.kernel.a.Mz();
    localSharedPreferences.edit().putBoolean("keepaliveserviceswitch", a(a.a.lHs, false)).commit();
    d(localSharedPreferences);
    bqV();
    bqT();
    AppMethodBeat.o(73507);
  }

  public final void onAccountInitialized(e.c paramc)
  {
    AppMethodBeat.i(73504);
    ab.i("MicroMsg.ExptService", "onAccountInitialized, %d", new Object[] { Integer.valueOf(hashCode()) });
    ab.v("MicroMsg.ExptService", "add listener ");
    if (ah.bqo())
    {
      com.tencent.mm.sdk.b.a.xxA.b(this.lNK);
      com.tencent.mm.sdk.b.a.xxA.b(this.lNN);
      g.Rg().a(2738, this.lNM);
      ((com.tencent.mm.plugin.messenger.foundation.a.p)g.M(com.tencent.mm.plugin.messenger.foundation.a.p.class)).getSysCmdMsgExtension().a("expt", this.lNL);
    }
    if (paramc != null);
    try
    {
      if (paramc.eKe)
      {
        ab.i("MicroMsg.ExptService", "client upgrade now, reset last update time. previous version [%d]", new Object[] { Integer.valueOf(paramc.eKf) });
        this.frU = 0;
        g.RP().Ry().set(ac.a.xVj, Integer.valueOf(0));
      }
      AppMethodBeat.o(73504);
      return;
    }
    catch (Exception paramc)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.ExptService", paramc, "onAccountInitialized error[%s]", new Object[] { paramc.toString() });
        AppMethodBeat.o(73504);
      }
    }
  }

  public final void onAccountRelease()
  {
    AppMethodBeat.i(73505);
    ab.i("MicroMsg.ExptService", "onAccountRelease");
    bqQ();
    com.tencent.mm.sdk.b.a.xxA.d(this.lNK);
    com.tencent.mm.sdk.b.a.xxA.d(this.lNN);
    g.Rg().b(2738, this.lNM);
    ((com.tencent.mm.plugin.messenger.foundation.a.p)g.M(com.tencent.mm.plugin.messenger.foundation.a.p.class)).getSysCmdMsgExtension().b("expt", this.lNL);
    com.tencent.mm.sdk.g.d.xDG.remove("manual_get_expt");
    AppMethodBeat.o(73505);
  }

  public final void t(Context paramContext, Intent paramIntent)
  {
    AppMethodBeat.i(73495);
    paramIntent.setClass(paramContext, ExptDebugUI.class);
    paramContext.startActivity(paramIntent);
    AppMethodBeat.o(73495);
  }

  public final com.tencent.mm.plugin.expt.d.a uZ(int paramInt)
  {
    AppMethodBeat.i(73501);
    com.tencent.mm.plugin.expt.d.a locala = (com.tencent.mm.plugin.expt.d.a)this.lNH.get(Integer.valueOf(paramInt));
    if (locala != null)
      AppMethodBeat.o(73501);
    while (true)
    {
      return locala;
      locala = this.lNF.vd(paramInt);
      if (locala != null)
        this.lNH.put(Integer.valueOf(paramInt), locala);
      AppMethodBeat.o(73501);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.expt.b.a
 * JD-Core Version:    0.6.2
 */