package com.tencent.mm.plugin.sns.a.b;

import android.app.Activity;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.g.a.kw;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.storage.e;
import com.tencent.mm.plugin.sns.storage.n;
import com.tencent.mm.plugin.sns.storage.o;
import com.tencent.mm.plugin.sns.storage.v;
import com.tencent.mm.protocal.protobuf.TimeLineObject;
import com.tencent.mm.protocal.protobuf.bau;
import com.tencent.mm.protocal.protobuf.bl;
import com.tencent.mm.protocal.protobuf.cbf;
import com.tencent.mm.protocal.protobuf.uf;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.al;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Set;

public final class g
  implements b
{
  public static Map<String, Integer> qDT;
  private Activity activity;
  public int cvd;
  public HashMap<String, Long> qDJ;
  public HashSet<Long> qDK;
  private Map<String, Long> qDL;
  private Map<String, Integer> qDM;
  private Map<String, a> qDN;
  public HashSet<Long> qDO;
  public Map<Long, h> qDP;
  public Map<Long, h> qDQ;
  public Map<String, g.a> qDR;
  private Map<String, Integer> qDS;
  private int qDU;
  private View qDV;
  public Map<Long, Integer> qDW;
  public Map<Long, Integer> qDX;
  private int qDY;
  private int qDc;

  static
  {
    AppMethodBeat.i(35743);
    qDT = new HashMap();
    AppMethodBeat.o(35743);
  }

  public g(int paramInt)
  {
    AppMethodBeat.i(35721);
    this.qDJ = new HashMap();
    this.qDK = new HashSet();
    this.qDL = new HashMap();
    this.qDM = new HashMap();
    this.qDN = new HashMap();
    this.qDO = new HashSet();
    this.qDP = new HashMap();
    this.qDQ = new HashMap();
    this.qDR = new HashMap();
    this.cvd = 0;
    this.qDS = new HashMap();
    this.qDU = 0;
    this.qDc = 0;
    this.qDV = null;
    this.qDW = new HashMap();
    this.qDX = new HashMap();
    this.qDY = -1;
    this.cvd = paramInt;
    AppMethodBeat.o(35721);
  }

  private com.tencent.mm.plugin.sns.storage.a f(n paramn)
  {
    AppMethodBeat.i(35734);
    if (paramn != null)
      if (this.cvd == 2)
      {
        paramn = paramn.cqr();
        AppMethodBeat.o(35734);
      }
    while (true)
    {
      return paramn;
      paramn = paramn.cqq();
      AppMethodBeat.o(35734);
      continue;
      paramn = null;
      AppMethodBeat.o(35734);
    }
  }

  private com.tencent.mm.bt.b g(n paramn)
  {
    AppMethodBeat.i(35735);
    if (paramn != null)
      if (this.cvd == 2)
      {
        paramn = paramn.crd().cqy();
        AppMethodBeat.o(35735);
      }
    while (true)
    {
      return paramn;
      paramn = paramn.crd().cqw();
      AppMethodBeat.o(35735);
      continue;
      paramn = null;
      AppMethodBeat.o(35735);
    }
  }

  private com.tencent.mm.bt.b h(n paramn)
  {
    AppMethodBeat.i(35736);
    if (paramn != null)
      if (this.cvd == 2)
      {
        paramn = paramn.crd().cqz();
        AppMethodBeat.o(35736);
      }
    while (true)
    {
      return paramn;
      paramn = paramn.crd().cqx();
      AppMethodBeat.o(35736);
      continue;
      paramn = null;
      AppMethodBeat.o(35736);
    }
  }

  public final void T(long paramLong1, long paramLong2)
  {
    AppMethodBeat.i(35729);
    al.d(new g.3(this, paramLong1, paramLong2));
    AppMethodBeat.o(35729);
  }

  public final void a(int paramInt, View paramView, Activity paramActivity)
  {
    this.qDc = paramInt;
    this.qDV = paramView;
    this.activity = paramActivity;
  }

  public final void a(int paramInt1, String paramString, boolean paramBoolean, View paramView, long paramLong, cbf paramcbf, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(35737);
    this.qDK.add(Long.valueOf(paramLong));
    this.qDJ.put(paramString, Long.valueOf(paramLong));
    if (this.qDY == -1)
      if (this.activity != null)
        break label83;
    n localn;
    label83: for (int i = -1; ; i = com.tencent.mm.ui.ae.hA(this.activity))
    {
      this.qDY = i;
      localn = af.cnF().YT(paramString);
      if (localn != null)
        break;
      ab.w("MicroMsg.SnsAdStatistic", "snsinfo not found! skip onAdAdded logic!");
      AppMethodBeat.o(35737);
      return;
    }
    Object localObject1 = (a)this.qDN.get(paramString);
    Object localObject2 = f(localn);
    if (localObject2 != null);
    for (String str = ((com.tencent.mm.plugin.sns.storage.a)localObject2).hnw; ; str = "")
    {
      if ((localObject1 == null) && (paramView != null) && (af.qKD))
      {
        paramView = new a((com.tencent.mm.plugin.sns.storage.a)localObject2, paramString, paramLong, paramView, this.qDc, this.qDV, this.qDY, paramInt3, paramcbf, paramInt1, localn.cqo());
        paramView.qDo = System.currentTimeMillis();
        af.bCo().post(new a.1(paramView));
        this.qDN.put(paramString, paramView);
        if (!this.qDW.containsKey(Long.valueOf(paramLong)))
        {
          paramcbf = this.qDW;
          if (localn.field_likeFlag != 1)
            break label492;
          i = 1;
          label256: paramcbf.put(Long.valueOf(paramLong), Integer.valueOf(i));
        }
      }
      while (true)
      {
        label335: long l;
        if ((paramInt2 == 11) && (localn.cqu().xfI.wbK.size() > 1))
        {
          if (this.qDQ.containsKey(Long.valueOf(paramLong)))
          {
            paramcbf = (h)this.qDQ.get(Long.valueOf(paramLong));
            paramcbf.qEm = com.tencent.mm.sdk.platformtools.bo.yz();
            this.qDQ.put(Long.valueOf(paramLong), paramcbf);
          }
        }
        else
        {
          if (!this.qDL.containsKey(paramString))
            break label537;
          l = com.tencent.mm.sdk.platformtools.bo.az(((Long)this.qDL.get(paramString)).longValue());
          if (l >= 1200000L)
            break label888;
          if (!this.qDM.containsKey(paramString))
            break label513;
        }
        label513: for (i = ((Integer)this.qDM.get(paramString)).intValue(); ; i = 0)
        {
          if (i < 2)
            break label519;
          ab.i("MicroMsg.SnsAdStatistic", "passed localid " + paramString + " viewid " + str + " passedTime: " + l);
          AppMethodBeat.o(35737);
          break;
          label492: i = 0;
          break label256;
          paramcbf = new h("timeline");
          break label335;
        }
        label519: this.qDM.put(paramString, Integer.valueOf(i + 1));
        label537: if (!this.qDR.containsKey(paramString))
        {
          this.qDR.put(paramString, new g.a(com.tencent.mm.sdk.platformtools.bo.yz(), paramString, paramInt1, str, paramInt2, paramLong, paramInt3));
          ab.i("MicroMsg.SnsAdStatistic", "onAdAdded " + paramInt1 + " " + paramString + "  isExposure: " + paramBoolean);
          if (paramInt2 != 9)
            break label938;
          if (!this.qDP.containsKey(Long.valueOf(paramLong)))
            break label923;
          paramcbf = (h)this.qDP.get(Long.valueOf(paramLong));
          label666: paramcbf.qEm = com.tencent.mm.sdk.platformtools.bo.yz();
          this.qDP.put(Long.valueOf(paramLong), paramcbf);
          label691: if (!this.qDS.containsKey(paramString))
          {
            ab.i("MicroMsg.SnsAdStatistic", "exposures item ".concat(String.valueOf(paramString)));
            this.qDS.put(paramString, Integer.valueOf((int)(System.currentTimeMillis() / 1000L)));
          }
          localObject2 = localn.cqo();
          localObject1 = localn.cqu();
          paramcbf = null;
          paramString = paramcbf;
          if (paramView != null)
          {
            paramString = paramcbf;
            if (af.qKD)
              paramString = paramView.cmd();
          }
          paramView = localn.crd();
          paramInt1 = 0;
          if (this.cvd == 0)
          {
            paramInt1 = paramView.field_exposureCount + 1;
            paramView.field_exposureCount = paramInt1;
            af.cnI().c(paramView, new String[0]);
          }
          if (!((com.tencent.mm.plugin.sns.storage.b)localObject2).coO())
            break label1073;
          paramString = new d(str, paramInt3, paramString, 3, paramInt1, localn.cre(), g(localn), h(localn));
        }
        while (true)
        {
          com.tencent.mm.kernel.g.RQ();
          com.tencent.mm.kernel.g.RO().eJo.a(paramString, 0);
          AppMethodBeat.o(35737);
          break;
          label888: this.qDL.put(paramString, Long.valueOf(com.tencent.mm.sdk.platformtools.bo.yz()));
          this.qDM.put(paramString, Integer.valueOf(0));
          break label537;
          label923: paramcbf = new h("timeline");
          break label666;
          label938: if ((paramInt2 != 11) || (localn.cqu().xfI.wbK.size() <= 0) || (((bau)localn.cqu().xfI.wbK.get(0)).jCt != 6))
            break label691;
          if (this.qDP.containsKey(Long.valueOf(paramLong)));
          for (paramcbf = (h)this.qDP.get(Long.valueOf(paramLong)); ; paramcbf = new h("timeline"))
          {
            paramcbf.qEm = com.tencent.mm.sdk.platformtools.bo.yz();
            paramcbf.qEr = true;
            this.qDP.put(Long.valueOf(paramLong), paramcbf);
            break;
          }
          label1073: if (localn.crg())
          {
            i = localn.cre();
            if (localn.field_likeFlag == 1);
            for (paramInt2 = 2; ; paramInt2 = 1)
            {
              paramString = new d(str, paramInt3, 1, 0, null, paramString, 6, "", paramInt1, i, 0, 0, paramInt2, g(localn), h(localn));
              break;
            }
          }
          if ((localn.coP()) || (localn.coQ()))
          {
            if ((localObject1 != null) && (((TimeLineObject)localObject1).xfI.wbJ == 15) && (((TimeLineObject)localObject1).xfP != 1))
              paramString = new d(str, paramInt3, paramString, 5, paramInt1, localn.cre(), g(localn), h(localn));
            else
              paramString = new d(str, paramInt3, paramString, 4, paramInt1, localn.cre(), g(localn), h(localn));
          }
          else if (paramInt2 == 9)
            paramString = new d(str, paramInt3, paramString, 2, paramInt1, localn.cre(), g(localn), h(localn));
          else
            paramString = new d(str, paramInt3, paramString, 1, paramInt1, localn.cre(), g(localn), h(localn));
        }
        paramView = (View)localObject1;
      }
    }
  }

  public final void a(long paramLong, int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(35726);
    h localh;
    if (paramBoolean2)
      if (this.qDQ.containsKey(Long.valueOf(paramLong)))
      {
        localh = (h)this.qDQ.get(Long.valueOf(paramLong));
        if (paramInt > 0)
          localh.setDuration(paramInt);
        if (!paramBoolean1)
          break label163;
        paramInt = 1;
        label62: localh.qEk = paramInt;
        if (!paramBoolean2)
          break label168;
        this.qDQ.put(Long.valueOf(paramLong), localh);
        AppMethodBeat.o(35726);
      }
    while (true)
    {
      return;
      localh = new h("timeline");
      break;
      if (this.qDP.containsKey(Long.valueOf(paramLong)))
      {
        localh = (h)this.qDP.get(Long.valueOf(paramLong));
        break;
      }
      localh = new h("timeline");
      break;
      label163: paramInt = 0;
      break label62;
      label168: this.qDP.put(Long.valueOf(paramLong), localh);
      AppMethodBeat.o(35726);
    }
  }

  public final void c(long paramLong1, long paramLong2, boolean paramBoolean)
  {
    AppMethodBeat.i(35731);
    al.d(new g.4(this, paramLong1, paramLong2, paramBoolean));
    AppMethodBeat.o(35731);
  }

  public final void c(long paramLong, boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(35728);
    h localh;
    if (paramBoolean2)
      if (this.qDQ.containsKey(Long.valueOf(paramLong)))
      {
        localh = (h)this.qDQ.get(Long.valueOf(paramLong));
        if (!paramBoolean1)
          break label162;
        localh.qEs.qFs = 2;
        label58: localh.qEs.qFt = 1;
        if (!paramBoolean2)
          break label174;
        this.qDQ.put(Long.valueOf(paramLong), localh);
        AppMethodBeat.o(35728);
      }
    while (true)
    {
      return;
      localh = new h("timeline");
      break;
      if (this.qDP.containsKey(Long.valueOf(paramLong)))
      {
        localh = (h)this.qDP.get(Long.valueOf(paramLong));
        break;
      }
      localh = new h("timeline");
      break;
      label162: localh.qEs.qFs = 1;
      break label58;
      label174: this.qDP.put(Long.valueOf(paramLong), localh);
      AppMethodBeat.o(35728);
    }
  }

  public final void clear()
  {
    AppMethodBeat.i(35740);
    ab.i("MicroMsg.SnsAdStatistic", "clean the adRemove");
    Object localObject1 = new HashSet(this.qDR.keySet()).iterator();
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (String)((Iterator)localObject1).next();
      localObject2 = (g.a)this.qDR.get(localObject2);
      j(((g.a)localObject2).position, ((g.a)localObject2).cOc, ((g.a)localObject2).fPY);
    }
    Object localObject2 = this.qDS.keySet().iterator();
    e locale;
    int i;
    while (((Iterator)localObject2).hasNext())
    {
      String str = (String)((Iterator)localObject2).next();
      locale = af.cnI().DG(v.Zn(str));
      if (locale != null)
      {
        localObject1 = locale.cqB();
        locale.field_localFlag |= 128;
        i = (int)(System.currentTimeMillis() / 1000L);
        if (!this.qDS.containsKey(str))
          break label281;
        i = ((Integer)this.qDS.get(str)).intValue();
      }
    }
    label281: 
    while (true)
    {
      if (locale.field_exposureTime <= 0)
        locale.field_exposureTime = i;
      ((n)localObject1).field_localFlag |= 128;
      af.cnF().b(((n)localObject1).field_snsId, (n)localObject1);
      af.cnI().b(locale.field_snsId, locale);
      break;
      this.qDR.clear();
      this.qDS.clear();
      AppMethodBeat.o(35740);
      return;
    }
  }

  public final void f(long paramLong, int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(35724);
    al.d(new g.2(this, paramLong, paramInt, paramBoolean));
    AppMethodBeat.o(35724);
  }

  public final void j(int paramInt1, String paramString, int paramInt2)
  {
    AppMethodBeat.i(35738);
    long l1;
    if (this.qDJ.containsKey(paramString))
    {
      l1 = ((Long)this.qDJ.remove(paramString)).longValue();
      this.qDK.remove(Long.valueOf(l1));
    }
    Object localObject1 = null;
    n localn = null;
    Object localObject2 = (a)this.qDN.get(paramString);
    Object localObject3 = localObject1;
    Object localObject4 = localn;
    if (localObject2 != null)
    {
      localObject3 = localObject1;
      localObject4 = localn;
      if (af.qKD)
      {
        ((a)localObject2).eTf = true;
        ((a)localObject2).qDp = System.currentTimeMillis();
        ((a)localObject2).qDH = 0;
        kH(false);
        if (((a)localObject2).qDk < 0)
        {
          ((a)localObject2).qDF = 2;
          if (((a)localObject2).qDm >= 0)
            break label1127;
          ((a)localObject2).qDG = 2;
          label147: localObject4 = new StringBuilder();
          ((StringBuilder)localObject4).append(com.tencent.mm.plugin.sns.data.i.jV(((a)localObject2).qDh) + ",");
          ((StringBuilder)localObject4).append(((a)localObject2).qDg + ",");
          ((StringBuilder)localObject4).append(((a)localObject2).qDF + ",");
          ((StringBuilder)localObject4).append(((a)localObject2).qDG + ",");
          ((StringBuilder)localObject4).append(((a)localObject2).qDC + ",");
          ((StringBuilder)localObject4).append(((a)localObject2).qDD + ",");
          ((StringBuilder)localObject4).append(((a)localObject2).qDE + ",");
          ((StringBuilder)localObject4).append(((a)localObject2).qDo + ",");
          ((StringBuilder)localObject4).append(((a)localObject2).qDp + ",");
          if ((((a)localObject2).qDs > 0L) && (((a)localObject2).qDv == 0L))
            ((a)localObject2).qDv = System.currentTimeMillis();
          ((StringBuilder)localObject4).append(((a)localObject2).qDs + ",");
          ((StringBuilder)localObject4).append(((a)localObject2).qDv + ",");
          if ((((a)localObject2).qDy > 0L) && (((a)localObject2).qDB == 0L))
            ((a)localObject2).qDB = System.currentTimeMillis();
          ((StringBuilder)localObject4).append(((a)localObject2).qDy + ",");
          ((StringBuilder)localObject4).append(((a)localObject2).qDB);
          f.a(((a)localObject2).qDh, (StringBuilder)localObject4);
          ab.i("MicroMsg.AdViewStatic", "report " + ((StringBuilder)localObject4).toString());
          localObject3 = new bl();
          ((bl)localObject3).vDI = ((a)localObject2).qDy;
          ((bl)localObject3).vDJ = ((a)localObject2).qDB;
          ((bl)localObject3).qDF = ((a)localObject2).qDF;
          ((bl)localObject3).qDG = ((a)localObject2).qDG;
          ((bl)localObject3).vDD = ((a)localObject2).qDC;
          ((bl)localObject3).vDE = ((a)localObject2).qDD;
          ((bl)localObject3).vDF = ((a)localObject2).qDE;
          ((bl)localObject3).vDG = ((a)localObject2).qDs;
          ((bl)localObject3).vDH = ((a)localObject2).qDv;
          ((bl)localObject3).startTime = ((a)localObject2).qDo;
          ((bl)localObject3).endTime = ((a)localObject2).qDp;
          if ((((a)localObject2).qDj == null) || (!((a)localObject2).qDj.coX()))
            break label1136;
          af.cnz().e(14648, new Object[] { ((StringBuilder)localObject4).toString() });
          label785: localObject1 = com.tencent.mm.modelsns.b.lY(730);
          ((com.tencent.mm.modelsns.b)localObject1).tx(com.tencent.mm.plugin.sns.data.i.jV(((a)localObject2).qDh)).tx(((a)localObject2).qDg).mb(((a)localObject2).qDF).mb(((a)localObject2).qDG).mb(((a)localObject2).qDC).mb(((a)localObject2).qDD).mb(((a)localObject2).qDE).tx(((a)localObject2).qDo).tx(((a)localObject2).qDp).tx(((a)localObject2).qDs).tx(((a)localObject2).qDv).tx(((a)localObject2).qDy).tx(((a)localObject2).qDB);
          ((com.tencent.mm.modelsns.b)localObject1).ajK();
          localObject1 = new kw();
          ((kw)localObject1).cGO.position = ((a)localObject2).position;
          com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject1);
          if (!com.tencent.mm.platformtools.ae.gje)
            break label1184;
          i = new Random(System.currentTimeMillis()).nextInt(2000) + 10;
          ab.i("MicroMsg.AdViewStatic", "run on test kv ".concat(String.valueOf(i)));
          j = 0;
          label1065: if (j >= i)
            break label1184;
          if ((((a)localObject2).qDj == null) || (!((a)localObject2).qDj.coX()))
            break label1160;
          af.cnz().e(14648, new Object[] { ((StringBuilder)localObject4).toString() });
        }
        while (true)
        {
          j++;
          break label1065;
          ((a)localObject2).qDF = 1;
          break;
          label1127: ((a)localObject2).qDG = 1;
          break label147;
          label1136: af.cnz().e(12010, new Object[] { ((StringBuilder)localObject4).toString() });
          break label785;
          label1160: af.cnz().e(12010, new Object[] { ((StringBuilder)localObject4).toString() });
        }
        label1184: localObject4 = ((a)localObject2).cmd();
        this.qDN.remove(paramString);
      }
    }
    int j = 0;
    int i = 0;
    localn = af.cnF().YT(paramString);
    label1323: int k;
    label1368: Object localObject5;
    if (localn != null)
    {
      j = i;
      if (this.qDQ.containsKey(Long.valueOf(localn.field_snsId)))
      {
        j = i;
        if (localn.cqu().xfI.wbJ == 27)
        {
          if (localn.field_likeFlag != 1)
            break label1744;
          j = 2;
          if (!this.qDX.containsKey(Long.valueOf(localn.field_snsId)))
            break label1750;
          i = ((Integer)this.qDX.get(Long.valueOf(localn.field_snsId))).intValue();
          if (!this.qDW.containsKey(Long.valueOf(localn.field_snsId)))
            break label1756;
          k = ((Integer)this.qDW.get(Long.valueOf(localn.field_snsId))).intValue();
          long l2 = 0L;
          long l3 = 0L;
          l1 = 0L;
          localObject1 = (h)this.qDQ.remove(Long.valueOf(localn.field_snsId));
          if (localObject1 != null)
          {
            ((h)localObject1).CI(0);
            ((h)localObject1).cmg();
            l2 = ((h)localObject1).qEq;
            l3 = ((h)localObject1).qEp;
            l1 = ((h)localObject1).qEu * 1000L;
          }
          localObject2 = localn.cqu().Id;
          localObject5 = localn.crc();
          if (localn.field_likeFlag != 1)
            break label1762;
          localObject1 = "1";
          label1486: localObject1 = String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s", new Object[] { localObject2, localObject5, String.valueOf(paramInt2), String.valueOf(i), String.valueOf(k), String.valueOf(l2), String.valueOf(l3), String.valueOf(l1), localObject1 });
          com.tencent.mm.plugin.report.service.h.pYm.X(15155, (String)localObject1);
          ab.i("MicroMsg.SnsAdStatistic", "15155, %s", new Object[] { localObject1 });
          this.qDO.remove(Long.valueOf(localn.field_snsId));
          this.qDO.remove(Long.valueOf(localn.field_snsId + 1L));
        }
      }
      this.qDX.remove(Long.valueOf(localn.field_snsId));
      this.qDW.remove(Long.valueOf(localn.field_snsId));
    }
    else
    {
      if (!this.qDR.containsKey(paramString))
        break label2226;
      localObject1 = "";
      if (f(localn) != null)
        localObject1 = f(localn).hnw;
      localObject2 = (g.a)this.qDR.remove(paramString);
      this.qDL.put(paramString, Long.valueOf(com.tencent.mm.sdk.platformtools.bo.yz()));
      if (localObject2 != null)
        break label1770;
      AppMethodBeat.o(35738);
    }
    while (true)
    {
      return;
      label1744: j = 1;
      break;
      label1750: i = 0;
      break label1323;
      label1756: k = 0;
      break label1368;
      label1762: localObject1 = "0";
      break label1486;
      label1770: l1 = com.tencent.mm.sdk.platformtools.bo.az(((g.a)localObject2).qEe);
      if (((g.a)localObject2).qEf > 0L)
        ((g.a)localObject2).qEi += com.tencent.mm.sdk.platformtools.bo.az(((g.a)localObject2).qEf);
      ab.i("MicroMsg.SnsAdStatistic", "onAdRemoved " + paramInt1 + " " + paramString + " " + l1 + " ");
      if (localn == null)
      {
        AppMethodBeat.o(35738);
      }
      else
      {
        paramString = "";
        localObject5 = localn.cqu();
        if (!localn.cqo().coO())
          break label1978;
        paramInt1 = 3;
        paramString = "";
        label1900: paramString = new d((String)localObject1, paramInt2, 2, (int)l1, (bl)localObject3, (com.tencent.mm.protocal.protobuf.bo)localObject4, paramInt1, paramString, -1, localn.cre(), (int)((g.a)localObject2).qEi, (int)((g.a)localObject2).qEj, j, g(localn), h(localn));
        com.tencent.mm.kernel.g.RQ();
        com.tencent.mm.kernel.g.RO().eJo.a(paramString, 0);
        AppMethodBeat.o(35738);
      }
    }
    label1978: if (localn.crg())
    {
      paramInt1 = 6;
      paramString = (h)this.qDP.remove(Long.valueOf(((g.a)localObject2).qDh));
      if (paramString == null)
        break label2267;
      if (localn.field_likeFlag == 0)
        paramString.CI(0);
    }
    label2226: label2267: for (paramString = paramString.cmf(); ; paramString = "")
    {
      break label1900;
      if ((localn.coP()) || (localn.coQ()))
      {
        if ((localObject5 != null) && (((TimeLineObject)localObject5).xfI.wbJ == 15) && (((TimeLineObject)localObject5).xfP != 1))
        {
          paramInt1 = 5;
          localObject5 = (h)this.qDP.remove(Long.valueOf(((g.a)localObject2).qDh));
          if (localObject5 != null)
          {
            ((h)localObject5).CI(0);
            paramString = ((h)localObject5).cmf();
          }
          this.qDO.remove(Long.valueOf(((g.a)localObject2).qDh));
          break label1900;
        }
        paramInt1 = 4;
        paramString = "";
        break label1900;
      }
      if (((g.a)localObject2).klY == 9)
      {
        paramInt1 = 2;
        localObject5 = (h)this.qDP.remove(Long.valueOf(((g.a)localObject2).qDh));
        if (localObject5 != null)
        {
          ((h)localObject5).CI(0);
          paramString = ((h)localObject5).cmf();
        }
        this.qDO.remove(Long.valueOf(((g.a)localObject2).qDh));
        break label1900;
      }
      paramInt1 = 1;
      paramString = "";
      break label1900;
      ab.w("MicroMsg.SnsAdStatistic", "can not find onAdRemoved " + paramInt1 + " " + paramString);
      AppMethodBeat.o(35738);
      break;
    }
  }

  public final boolean jN(long paramLong)
  {
    AppMethodBeat.i(35720);
    boolean bool = this.qDK.contains(Long.valueOf(paramLong));
    AppMethodBeat.o(35720);
    return bool;
  }

  public final boolean jO(long paramLong)
  {
    AppMethodBeat.i(35730);
    boolean bool;
    if (this.qDO.contains(Long.valueOf(paramLong)))
    {
      bool = true;
      AppMethodBeat.o(35730);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(35730);
    }
  }

  public final void jP(long paramLong)
  {
    AppMethodBeat.i(35741);
    int i = 0;
    if (this.qDW.containsKey(Long.valueOf(paramLong)))
      i = ((Integer)this.qDW.get(Long.valueOf(paramLong))).intValue();
    this.qDW.put(Long.valueOf(paramLong), Integer.valueOf(i + 1));
    AppMethodBeat.o(35741);
  }

  public final void jQ(long paramLong)
  {
    AppMethodBeat.i(35742);
    int i = 0;
    if (this.qDX.containsKey(Long.valueOf(paramLong)))
      i = ((Integer)this.qDX.get(Long.valueOf(paramLong))).intValue();
    this.qDX.put(Long.valueOf(paramLong), Integer.valueOf(i + 1));
    AppMethodBeat.o(35742);
  }

  public final void kH(boolean paramBoolean)
  {
    AppMethodBeat.i(35739);
    ab.i("MicroMsg.SnsAdStatistic", "checkAd %s", new Object[] { Boolean.valueOf(paramBoolean) });
    Iterator localIterator = this.qDN.entrySet().iterator();
    while (localIterator.hasNext())
    {
      a locala = (a)((Map.Entry)localIterator.next()).getValue();
      if ((locala != null) && (af.qKD))
      {
        locala.kG(paramBoolean);
        if ((!com.tencent.mm.sdk.platformtools.bo.isNullOrNil(locala.czD)) && (this.qDR.get(locala.czD) != null))
        {
          g.a locala1 = (g.a)this.qDR.get(locala.czD);
          boolean bool = locala.cme();
          if ((bool) && (locala1.qEh == 0L))
          {
            locala1.qEh = com.tencent.mm.sdk.platformtools.bo.yz();
          }
          else if ((!bool) && (locala1.qEh > 0L))
          {
            locala1.qEj += com.tencent.mm.sdk.platformtools.bo.az(locala1.qEh);
            locala1.qEh = 0L;
          }
        }
      }
    }
    AppMethodBeat.o(35739);
  }

  public final void onPause()
  {
    AppMethodBeat.i(35733);
    Iterator localIterator = this.qDR.keySet().iterator();
    Object localObject2;
    while (localIterator.hasNext())
    {
      Object localObject1 = (String)localIterator.next();
      localObject2 = (g.a)this.qDR.get(localObject1);
      ab.i("MicroMsg.SnsAdStatistic", "onPause Key ".concat(String.valueOf(localObject1)));
      ((g.a)localObject2).qEi += com.tencent.mm.sdk.platformtools.bo.az(((g.a)localObject2).qEf);
      ((g.a)localObject2).qEf = 0L;
      localObject1 = (h)this.qDP.get(Long.valueOf(((g.a)localObject2).qDh));
      if (localObject1 != null)
        ((h)localObject1).fQd = com.tencent.mm.sdk.platformtools.bo.yz();
      localObject2 = (h)this.qDQ.get(Long.valueOf(((g.a)localObject2).qDh));
      if (localObject2 != null)
        ((h)localObject2).fQd = com.tencent.mm.sdk.platformtools.bo.yz();
    }
    localIterator = this.qDN.entrySet().iterator();
    while (localIterator.hasNext())
    {
      localObject2 = (a)((Map.Entry)localIterator.next()).getValue();
      if ((localObject2 != null) && (af.qKD))
      {
        ((a)localObject2).kG(false);
        if ((!com.tencent.mm.sdk.platformtools.bo.isNullOrNil(((a)localObject2).czD)) && (this.qDR.get(((a)localObject2).czD) != null))
        {
          localObject2 = (g.a)this.qDR.get(((a)localObject2).czD);
          if (((g.a)localObject2).qEh > 0L)
          {
            ((g.a)localObject2).qEj += com.tencent.mm.sdk.platformtools.bo.az(((g.a)localObject2).qEh);
            ((g.a)localObject2).qEh = 0L;
          }
        }
      }
    }
    AppMethodBeat.o(35733);
  }

  public final void onResume()
  {
    AppMethodBeat.i(35722);
    long l = com.tencent.mm.sdk.platformtools.bo.yz();
    Iterator localIterator = this.qDR.keySet().iterator();
    Object localObject1;
    Object localObject2;
    while (localIterator.hasNext())
    {
      localObject1 = (String)localIterator.next();
      localObject2 = (g.a)this.qDR.get(localObject1);
      ab.i("MicroMsg.SnsAdStatistic", "onResume Key ".concat(String.valueOf(localObject1)));
      ((g.a)localObject2).qEf = l;
      localObject1 = (h)this.qDP.get(Long.valueOf(((g.a)localObject2).qDh));
      if (localObject1 != null)
        ((h)localObject1).onResume();
      localObject2 = (h)this.qDQ.get(Long.valueOf(((g.a)localObject2).qDh));
      if (localObject2 != null)
        ((h)localObject2).onResume();
    }
    localIterator = this.qDN.entrySet().iterator();
    while (localIterator.hasNext())
    {
      localObject2 = (a)((Map.Entry)localIterator.next()).getValue();
      if ((localObject2 != null) && (af.qKD))
      {
        ((a)localObject2).kG(false);
        if ((!com.tencent.mm.sdk.platformtools.bo.isNullOrNil(((a)localObject2).czD)) && (this.qDR.get(((a)localObject2).czD) != null))
        {
          localObject1 = (g.a)this.qDR.get(((a)localObject2).czD);
          if (((a)localObject2).cme())
            ((g.a)localObject1).qEh = com.tencent.mm.sdk.platformtools.bo.yz();
        }
      }
    }
    AppMethodBeat.o(35722);
  }

  public final void u(long paramLong, boolean paramBoolean)
  {
    AppMethodBeat.i(35723);
    al.d(new g.1(this, paramLong, paramBoolean));
    AppMethodBeat.o(35723);
  }

  public final void v(long paramLong, boolean paramBoolean)
  {
    AppMethodBeat.i(35725);
    a(paramLong, 0, paramBoolean, false);
    AppMethodBeat.o(35725);
  }

  public final void w(long paramLong, boolean paramBoolean)
  {
    AppMethodBeat.i(35727);
    c(paramLong, paramBoolean, false);
    AppMethodBeat.o(35727);
  }

  public final void x(long paramLong, boolean paramBoolean)
  {
    AppMethodBeat.i(35732);
    h localh;
    if (paramBoolean)
    {
      if (this.qDQ.containsKey(Long.valueOf(paramLong)))
      {
        localh = (h)this.qDQ.get(Long.valueOf(paramLong));
        localh.CI(0);
      }
      while (true)
      {
        this.qDQ.put(Long.valueOf(paramLong), localh);
        AppMethodBeat.o(35732);
        return;
        localh = new h("timeline");
      }
    }
    if (this.qDP.containsKey(Long.valueOf(paramLong)))
    {
      localh = (h)this.qDP.get(Long.valueOf(paramLong));
      localh.CI(0);
    }
    while (true)
    {
      this.qDP.put(Long.valueOf(paramLong), localh);
      AppMethodBeat.o(35732);
      break;
      localh = new h("timeline");
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.a.b.g
 * JD-Core Version:    0.6.2
 */