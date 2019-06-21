package com.tencent.mm.h;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.compatible.util.h;
import com.tencent.mm.g.a.ak;
import com.tencent.mm.g.a.ak.a;
import com.tencent.mm.g.a.tm;
import com.tencent.mm.g.a.tm.a;
import com.tencent.mm.model.aw;
import com.tencent.mm.platformtools.ae;
import com.tencent.mm.plugin.account.ui.DisasterUI;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.br;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class b
{
  public a eeU;
  public Map<Integer, Long> eeV;
  public Map<Long, a> eeW;
  public c eeX;

  public b()
  {
    AppMethodBeat.i(16066);
    this.eeV = new HashMap();
    this.eeW = new HashMap();
    this.eeX = new b.1(this);
    AppMethodBeat.o(16066);
  }

  final void Jb()
  {
    AppMethodBeat.i(16069);
    if ((this.eeU == null) || (this.eeU.efe.get(Integer.valueOf(0)) == null) || (bo.isNullOrNil(this.eeU.efd)))
      AppMethodBeat.o(16069);
    while (true)
    {
      return;
      ab.i("MicroMsg.BroadcastController", "summerdize checkShowDisasterContent showDisasterContent[%s]", new Object[] { this.eeU.efd });
      Intent localIntent = new Intent();
      localIntent.putExtra("key_disaster_content", this.eeU.efd);
      localIntent.putExtra("key_disaster_url", ((tm)this.eeU.efe.get(Integer.valueOf(0))).cPH.url);
      localIntent.setClass(ah.getContext(), DisasterUI.class).addFlags(268435456);
      ah.getContext().startActivity(localIntent);
      this.eeU.efd = null;
      AppMethodBeat.o(16069);
    }
  }

  final boolean a(ak paramak)
  {
    AppMethodBeat.i(16067);
    String str = paramak.cto.ctq;
    int i;
    Map localMap;
    boolean bool;
    if (str == null)
    {
      i = -1;
      ab.i("MicroMsg.BroadcastController", "summerdiz handleNewDisaster xml len[%d]", new Object[] { Integer.valueOf(i) });
      localMap = br.z(str, "e");
      if (localMap != null)
        break label78;
      ab.e("MicroMsg.BroadcastController", "summerdiz handleNewDisaster this is not errmsg");
      bool = false;
      AppMethodBeat.o(16067);
    }
    label78: long l1;
    Object localObject3;
    label434: Object localObject4;
    while (true)
    {
      return bool;
      i = str.length();
      break;
      ab.i("MicroMsg.BroadcastController", "summerdiz handleNewDisaster values[%s]", new Object[] { localMap });
      l1 = bo.getLong((String)localMap.get(".e.NoticeId"), 0L);
      if (l1 <= 0L)
        ab.e("MicroMsg.BroadcastController", "summerdiz handleNewDisaster noticeID null");
      if (!ae.gjE)
      {
        try
        {
          long l2 = bo.getLong((String)localMap.get(".e.ExpiredTime"), 0L);
          if (bo.fp(l2) > 0L)
          {
            ab.i("MicroMsg.BroadcastController", "summerdiz handleNewDisaster expiredTime is too small, drop id:%d", new Object[] { Long.valueOf(l2) });
            bool = false;
            AppMethodBeat.o(16067);
          }
        }
        catch (Exception localException)
        {
          ab.i("MicroMsg.BroadcastController", "parseLong expiredTime error:%s", new Object[] { localException });
        }
      }
      else
      {
        localObject1 = new a();
        ((a)localObject1).efb = String.valueOf(l1);
        localObject2 = ah.getContext().getSharedPreferences("disaster_pref", h.Mu()).getString("disaster_noticeid_list_key", "");
        if ((!ae.gjF) && (((String)localObject2).contains(((a)localObject1).efb)))
        {
          ab.i("MicroMsg.BroadcastController", "summerdiz handleNewDisaster noticeIdList %s contain notifyID:%s, drop id", new Object[] { localObject2, ((a)localObject1).efb });
          bool = false;
          AppMethodBeat.o(16067);
        }
        else
        {
          if (this.eeW.size() > 0)
          {
            localObject3 = (a)this.eeW.get(Long.valueOf(l1));
            if (localObject3 != null)
              ab.i("MicroMsg.BroadcastController", "summerdiz  handleNewDisaster found info in map[%s]", new Object[] { localObject3 });
          }
          while (true)
          {
            localObject1 = (String)localMap.get(".e.Position");
            if (!bo.isNullOrNil((String)localObject1))
              break label434;
            ab.e("MicroMsg.BroadcastController", "summerdiz handleNewDisaster positionStr is null!");
            bool = false;
            AppMethodBeat.o(16067);
            break;
            this.eeW.put(Long.valueOf(l1), localObject1);
            localObject3 = localObject1;
            continue;
            this.eeW.put(Long.valueOf(l1), localObject1);
            localObject3 = localObject1;
          }
          localObject4 = new ArrayList();
          localObject1 = ((String)localObject1).split(",");
          if ((localObject1 == null) || (localObject1.length <= 0))
          {
            ab.e("MicroMsg.BroadcastController", "summerdiz handleNewDisaster positionStr id invaild!");
            bool = false;
            AppMethodBeat.o(16067);
          }
          else
          {
            i = 0;
            int j = localObject1.length;
            k = 0;
            if (k < j)
            {
              int m = bo.getInt(localObject1[k], 0);
              if (m > 0)
                if (m == 1)
                {
                  i = 1;
                  ab.i("MicroMsg.BroadcastController", "summerdiz handleNewDisaster found tonyTips[%d]", new Object[] { Integer.valueOf(m) });
                }
              while (true)
              {
                k++;
                break;
                ((ArrayList)localObject4).add(Integer.valueOf(m));
              }
            }
            if ((i != 0) || (((ArrayList)localObject4).size() != 0))
              break label589;
            ab.e("MicroMsg.BroadcastController", "summerdiz handleNewDisaster positions size is 0!");
            bool = false;
            AppMethodBeat.o(16067);
          }
        }
      }
    }
    label589: Object localObject5 = aa.gw(ah.getContext());
    ab.i("MicroMsg.BroadcastController", "summerdiz handleNewDisaster curLang[%s]", new Object[] { localObject5 });
    Object localObject6 = null;
    Object localObject2 = null;
    Object localObject1 = null;
    int k = 0;
    label625: Object localObject7 = new StringBuilder(".e.Item");
    if (k == 0)
    {
      localObject8 = "";
      label646: localObject8 = localObject8;
      localObject7 = (String)localMap.get((String)localObject8 + ".Language");
      if ((localObject7 == null) && (k > 3))
        break label1752;
      if (!((String)localObject5).equalsIgnoreCase((String)localObject7))
        break label1054;
      localObject7 = (String)localMap.get((String)localObject8 + ".Content");
      localObject5 = (String)localMap.get((String)localObject8 + ".Url");
    }
    for (Object localObject8 = (String)localMap.get((String)localObject8 + ".Tips"); ; localObject8 = null)
    {
      ab.i("MicroMsg.BroadcastController", "summerdiz handleNewDisaster content[%s] tips[%s]", new Object[] { localObject7, localObject8 });
      if (bo.isNullOrNil((String)localObject7))
      {
        ab.i("MicroMsg.BroadcastController", "summerdiz handleNewDisaster cann't hit curLang");
        label849: localObject5 = localObject2;
        if (bo.isNullOrNil((String)localObject2))
          localObject5 = ah.getContext().getString(2131298909);
        localObject8 = localObject1;
        localObject2 = localObject6;
        if (i != 0)
        {
          localObject2 = localObject6;
          if (bo.isNullOrNil((String)localObject6))
            localObject2 = ah.getContext().getString(2131298903);
          localObject8 = localObject1;
          if (bo.isNullOrNil((String)localObject1))
            localObject8 = ah.getContext().getString(2131298907);
          paramak.ctp.desc = ((String)localObject2);
          paramak.ctp.ctr = 30;
          paramak.ctp.showType = 0;
          paramak.ctp.url = ((String)localObject5);
          paramak.ctp.aIB = true;
          paramak.ctp.ctt = 0;
          paramak.ctp.cts = 6;
          paramak.ctp.Title = "";
          paramak.ctp.ctu = String.valueOf(l1);
          paramak.ctp.position = 1;
        }
        if (((ArrayList)localObject4).size() == 0)
        {
          ab.i("MicroMsg.BroadcastController", "summerdiz handleNewDisaster no other position need to tip");
          bool = false;
          AppMethodBeat.o(16067);
          break;
          localObject8 = Integer.valueOf(k);
          break label646;
          label1054: if (!"en".equalsIgnoreCase((String)localObject7))
            break label1739;
          localObject1 = (String)localMap.get((String)localObject8 + ".Content");
          localObject2 = (String)localMap.get((String)localObject8 + ".Url");
        }
      }
      for (localObject6 = (String)localMap.get((String)localObject8 + ".Tips"); ; localObject6 = localObject8)
      {
        k++;
        localObject8 = localObject6;
        localObject6 = localObject1;
        localObject1 = localObject8;
        break label625;
        if ((((a)localObject3).efc != 0L) && (bo.az(((a)localObject3).efc) < 1800000L))
        {
          ab.i("MicroMsg.BroadcastController", "summerdiz handleNewDisaster disasterTick within half an hour, drop it");
          bool = false;
          AppMethodBeat.o(16067);
          break;
        }
        ((a)localObject3).efc = bo.yz();
        localObject7 = ((ArrayList)localObject4).iterator();
        localObject1 = localObject8;
        while (((Iterator)localObject7).hasNext())
        {
          localObject4 = (Integer)((Iterator)localObject7).next();
          localObject6 = Long.valueOf(bo.a((Long)this.eeV.get(localObject4), 0L));
          if ((((Long)localObject6).longValue() > 0L) && (((Long)localObject6).longValue() >= l1))
          {
            ab.i("MicroMsg.BroadcastController", "summerdiz p[%d] has bigger oldPositionNoticeId[%d, %d]", new Object[] { localObject4, localObject6, Long.valueOf(l1) });
          }
          else
          {
            localObject8 = (tm)((a)localObject3).efe.get(localObject4);
            if (localObject8 != null)
              break label1722;
            localObject8 = new tm();
            ((tm)localObject8).cPH.showType = 0;
            ((tm)localObject8).cPH.ctr = 30;
            ((tm)localObject8).cPH.Title = "";
            ((tm)localObject8).cPH.ctt = 2130970230;
            ((tm)localObject8).cPH.position = ((Integer)localObject4).intValue();
            ((a)localObject3).efe.put(localObject4, localObject8);
          }
        }
        label1722: 
        while (true)
        {
          if (bo.isNullOrNil((String)localObject1))
            localObject1 = localObject2;
          while (true)
          {
            localObject6 = localObject1;
            if (bo.isNullOrNil((String)localObject1))
            {
              k = 2131298906;
              switch (((Integer)localObject4).intValue())
              {
              default:
              case 2:
              case 3:
              case 4:
              }
            }
            while (true)
            {
              localObject6 = ah.getContext().getString(k);
              ((tm)localObject8).cPH.desc = ((String)localObject6);
              ((tm)localObject8).cPH.url = ((String)localObject5);
              ((tm)localObject8).cPH.aIB = true;
              ((tm)localObject8).cPH.cts = 2;
              ((tm)localObject8).cPH.ctu = ((a)localObject3).efb;
              this.eeV.put(localObject4, Long.valueOf(l1));
              if (i == 0)
              {
                paramak.ctp.desc = ((String)localObject6);
                paramak.ctp.ctr = 30;
                paramak.ctp.showType = 0;
                paramak.ctp.url = ((String)localObject5);
                paramak.ctp.aIB = true;
                paramak.ctp.ctt = 2130970230;
                paramak.ctp.cts = 2;
                paramak.ctp.Title = "";
                paramak.ctp.ctu = String.valueOf(l1);
                paramak.ctp.position = ((Integer)localObject4).intValue();
              }
              al.d(new b.2(this, (tm)localObject8));
              localObject1 = localObject6;
              break;
              k = 2131298908;
              continue;
              k = 2131298905;
            }
            bool = true;
            AppMethodBeat.o(16067);
            break;
          }
        }
        localObject6 = localObject7;
        localObject2 = localObject5;
        localObject1 = localObject8;
        break label849;
        label1739: localObject8 = localObject1;
        localObject1 = localObject6;
      }
      label1752: localObject7 = null;
      localObject5 = null;
    }
  }

  final boolean jZ(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(16068);
    ab.i("MicroMsg.BroadcastController", "summerdiz handleEventOOB oldNoticeInfo[%s], event[%s]", new Object[] { this.eeU, paramString });
    if (bo.isNullOrNil(paramString))
      AppMethodBeat.o(16068);
    Map localMap;
    while (true)
    {
      return bool;
      if (paramString.indexOf("<") < 0)
      {
        AppMethodBeat.o(16068);
      }
      else
      {
        localMap = br.z(paramString, "e");
        if (localMap == null)
        {
          ab.e("MicroMsg.BroadcastController", "this is not errmsg");
          AppMethodBeat.o(16068);
        }
        else
        {
          if (this.eeU == null)
          {
            this.eeU = new a();
            paramString = new tm();
            this.eeU.efe.put(Integer.valueOf(0), paramString);
            paramString.cPH.desc = "";
            paramString.cPH.url = "";
            paramString.cPH.showType = 0;
            paramString.cPH.ctr = 30;
            paramString.cPH.aIB = false;
            paramString.cPH.Title = "";
            paramString.cPH.cts = 0;
            paramString.cPH.ctt = 2130970230;
            paramString.cPH.ctu = "";
            paramString.cPH.position = 0;
          }
          if (!ae.gjD)
          {
            if ((this.eeU.efc != 0L) && (bo.az(this.eeU.efc) < 1800000L))
            {
              ab.i("MicroMsg.BroadcastController", "disasterTick within half an hour, drop it");
              AppMethodBeat.o(16068);
            }
            else
            {
              this.eeU.efc = bo.yz();
            }
          }
          else if (!ae.gjE)
          {
            try
            {
              long l = bo.getLong((String)localMap.get(".e.ExpiredTime"), 0L);
              if (bo.fp(l) > 0L)
              {
                ab.i("MicroMsg.BroadcastController", "expiredTime is too small, drop id:%d", new Object[] { Long.valueOf(l) });
                AppMethodBeat.o(16068);
              }
            }
            catch (Exception paramString)
            {
              ab.i("MicroMsg.BroadcastController", "parseLong expiredTime error:%s", new Object[] { paramString });
            }
          }
          else
          {
            this.eeU.efb = ((String)localMap.get(".e.NoticeId"));
            paramString = ah.getContext().getSharedPreferences("disaster_pref", h.Mu()).getString("disaster_noticeid_list_key", "");
            if ((ae.gjF) || (!paramString.contains(this.eeU.efb)))
              break;
            ab.i("MicroMsg.BroadcastController", "noticeIdList %s contain notifyID:%s, drop id", new Object[] { paramString, this.eeU.efb });
            AppMethodBeat.o(16068);
          }
        }
      }
    }
    String str = aa.gw(ah.getContext());
    Object localObject1 = null;
    Object localObject2 = null;
    paramString = null;
    int i = 0;
    Object localObject3 = new StringBuilder(".e.Item");
    if (i == 0)
    {
      localObject4 = "";
      label498: localObject4 = localObject4;
      localObject3 = (String)localMap.get((String)localObject4 + ".Language");
      if ((localObject3 == null) && (i > 3))
        break label1044;
      if (!str.equalsIgnoreCase((String)localObject3))
        break label885;
      str = (String)localMap.get((String)localObject4 + ".Content");
      localObject3 = (String)localMap.get((String)localObject4 + ".Url");
    }
    for (Object localObject4 = (String)localMap.get((String)localObject4 + ".Tips"); ; localObject4 = null)
    {
      if (bo.isNullOrNil(str))
      {
        ab.i("MicroMsg.BroadcastController", "handleEventOOB cann't hit curLang");
        label675: localObject4 = localObject2;
        if (bo.isNullOrNil((String)localObject2))
          localObject4 = ah.getContext().getString(2131298909);
        localObject2 = paramString;
        if (bo.isNullOrNil(paramString))
        {
          ab.i("MicroMsg.BroadcastController", "handleEventOOB defContent is also null use hardcode");
          localObject2 = ah.getContext().getString(2131298902);
        }
        paramString = (String)localObject1;
        if (bo.isNullOrNil((String)localObject1))
        {
          if (bo.isNullOrNil((String)localObject2))
            paramString = ah.getContext().getString(2131298906);
        }
        else
        {
          label756: localObject1 = (tm)this.eeU.efe.get(Integer.valueOf(0));
          ((tm)localObject1).cPH.desc = paramString;
          ((tm)localObject1).cPH.url = ((String)localObject4);
          ((tm)localObject1).cPH.aIB = true;
          ((tm)localObject1).cPH.cts = 2;
          ((tm)localObject1).cPH.ctu = this.eeU.efb;
          al.d(new Runnable()
          {
            public final void run()
            {
              AppMethodBeat.i(16063);
              ab.i("MicroMsg.BroadcastController", "summerdiz handleEventOOB publish uiEvent");
              a.xxA.m(this.efa);
              AppMethodBeat.o(16063);
            }
          });
          this.eeU.efd = ((String)localObject2);
          if (aw.Rg().foreground)
            Jb();
          AppMethodBeat.o(16068);
          bool = true;
          break;
          localObject4 = Integer.valueOf(i);
          break label498;
          label885: if (!"en".equalsIgnoreCase((String)localObject3))
            break label1029;
          paramString = (String)localMap.get((String)localObject4 + ".Content");
          localObject1 = (String)localMap.get((String)localObject4 + ".Url");
        }
      }
      for (localObject2 = (String)localMap.get((String)localObject4 + ".Tips"); ; localObject2 = localObject4)
      {
        i++;
        localObject4 = localObject2;
        localObject2 = localObject1;
        localObject1 = localObject4;
        break;
        paramString = (String)localObject2;
        break label756;
        localObject2 = localObject3;
        paramString = str;
        localObject1 = localObject4;
        break label675;
        label1029: localObject4 = localObject1;
        localObject1 = localObject2;
      }
      label1044: localObject3 = null;
      str = null;
    }
  }

  static final class a
  {
    String efb;
    long efc;
    String efd;
    Map<Integer, tm> efe;

    a()
    {
      AppMethodBeat.i(16064);
      this.efb = null;
      this.efc = 0L;
      this.efd = null;
      this.efe = new HashMap();
      AppMethodBeat.o(16064);
    }

    public final String toString()
    {
      AppMethodBeat.i(16065);
      Object localObject = this.efe.keySet().iterator();
      Integer localInteger;
      for (String str = ""; ((Iterator)localObject).hasNext(); str = str + localInteger + ",")
        localInteger = (Integer)((Iterator)localObject).next();
      localObject = str;
      if (str.length() > 0)
        localObject = str.substring(0, str.length() - 1);
      str = String.format("NoticeInfo(%d){noticeID[%s], disasterTick[%d], content[%s], posistions[%s]}", new Object[] { Integer.valueOf(hashCode()), this.efb, Long.valueOf(this.efc), this.efd, localObject });
      AppMethodBeat.o(16065);
      return str;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.h.b
 * JD-Core Version:    0.6.2
 */