package com.tencent.mm.plugin.sns.ui.a.b;

import android.content.Context;
import android.database.Cursor;
import android.text.StaticLayout;
import android.view.Display;
import android.view.WindowManager;
import com.tencent.mm.ai.p;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.plugin.sns.model.aj;
import com.tencent.mm.plugin.sns.model.am.a;
import com.tencent.mm.plugin.sns.model.l;
import com.tencent.mm.plugin.sns.storage.n;
import com.tencent.mm.plugin.sns.storage.o;
import com.tencent.mm.plugin.sns.ui.au;
import com.tencent.mm.plugin.sns.ui.av;
import com.tencent.mm.plugin.sns.ui.aw;
import com.tencent.mm.plugin.story.api.f.a;
import com.tencent.mm.protocal.protobuf.TimeLineObject;
import com.tencent.mm.protocal.protobuf.ayt;
import com.tencent.mm.protocal.protobuf.bav;
import com.tencent.mm.protocal.protobuf.bp;
import com.tencent.mm.protocal.protobuf.cat;
import com.tencent.mm.protocal.protobuf.cbb;
import com.tencent.mm.protocal.protobuf.cbf;
import com.tencent.mm.protocal.protobuf.cbu;
import com.tencent.mm.protocal.protobuf.cvi;
import com.tencent.mm.protocal.protobuf.ds;
import com.tencent.mm.protocal.protobuf.uf;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bd;
import com.tencent.mm.vending.d.b.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public abstract class a extends b
{
  private boolean DEBUG = false;
  private bd fnq;
  protected volatile String lQD = "";
  private Context mContext;
  private au rES;
  private int rET = (int)(System.currentTimeMillis() / 1000L);
  private com.tencent.mm.n.a rEU;
  private boolean rEV = false;
  private volatile boolean rEW = false;
  private byte[] rEX = new byte[0];
  protected HashMap<String, String> rEY = new HashMap();
  public HashMap<String, Boolean> rEZ = new HashMap();
  private String rFa = "";
  private String rFb = "";
  protected volatile String rmL = "";
  private String ryC;

  public a(n paramn)
  {
    super(paramn);
    dLZ();
  }

  private av Eo(int paramInt)
  {
    if (paramInt < 0);
    long l1;
    av localav;
    n localn;
    for (Object localObject1 = null; ; localObject1 = localav)
    {
      return localObject1;
      ab.i("MicroMsg.SnsTimeLineVendingSide", "resolveAsynchronous %s", new Object[] { Integer.valueOf(paramInt) });
      l1 = System.currentTimeMillis();
      localav = new av();
      localn = (n)super.getItem(paramInt);
      if (localn != null)
        break;
      ab.printErrStackTrace("MicroMsg.SnsTimeLineVendingSide", new Throwable(), "mSnsInfo is null, index %s, count %s, why?", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(this.mCount) });
    }
    TimeLineObject localTimeLineObject = localn.cqu();
    cbf localcbf = aj.q(localn);
    int i = au.E(localn);
    localav.auo = i;
    localav.rAt = localn.field_snsId;
    localav.rAx = localn.field_likeFlag;
    localav.rAy = localn.cqQ();
    Object localObject2;
    Object localObject3;
    label251: boolean bool1;
    label261: int j;
    if (localn.cqq() == null)
    {
      localObject1 = "";
      localav.rAz = ((String)localObject1);
      localav.qBY = localn;
      localav.qCc = localTimeLineObject;
      localav.qBX = localcbf;
      localObject2 = localav.qCc.xfF;
      localObject3 = this.mContext;
      com.tencent.mm.plugin.sns.ui.widget.e.cvB();
      float f = com.tencent.mm.plugin.sns.ui.widget.e.getTextSize();
      if (!((com.tencent.mm.plugin.story.api.e)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.story.api.e.class)).getStoryBasicConfig().a(f.a.rQz))
        break label1313;
      if (localav.qCc != null)
        break label1301;
      localObject1 = "";
      if (!com.tencent.mm.plugin.sns.e.a.Xu((String)localObject1))
        break label1313;
      bool1 = true;
      localObject1 = com.tencent.mm.plugin.sns.ui.widget.f.a((Context)localObject3, (String)localObject2, f, bool1);
      localav.rAq = ((CharSequence)localObject1);
      j = com.tencent.mm.plugin.sns.ui.widget.e.cvB().getViewWidth();
      if (paramInt >= this.rES.getCount())
        break label2858;
      localObject3 = (n)super.getItem(paramInt);
      if ((localObject3 == null) || (!((n)localObject3).DI(32)))
        break label2858;
      localObject3 = ((n)localObject3).cqo();
      if ((localObject3 == null) || (((com.tencent.mm.plugin.sns.storage.b)localObject3).qUG != 1))
        break label2858;
      j = ((WindowManager)this.mContext.getSystemService("window")).getDefaultDisplay().getWidth() - com.tencent.mm.bz.a.fromDPToPix(this.mContext, 50) - com.tencent.mm.bz.a.fromDPToPix(this.mContext, 50) - com.tencent.mm.bz.a.fromDPToPix(this.mContext, 12) - com.tencent.mm.bz.a.fromDPToPix(this.mContext, 12);
    }
    label674: label2855: label2858: 
    while (true)
    {
      if (this.DEBUG)
        ab.d("MicroMsg.SnsTimeLineVendingSide", "debug:renderSnsPostDesc position " + paramInt + " viewWidth: " + j + " desc:" + (String)localObject2);
      localObject2 = com.tencent.mm.kiss.widget.textview.d.a((CharSequence)localObject1, j, com.tencent.mm.plugin.sns.ui.widget.e.cvB().getTextViewConfig()).SO();
      com.tencent.mm.kiss.widget.textview.c.eNj.a(com.tencent.mm.plugin.sns.ui.widget.e.cvB().getTextViewConfig(), (com.tencent.mm.kiss.widget.textview.f)localObject2);
      if (((com.tencent.mm.kiss.widget.textview.f)localObject2).eNO.getLineCount() > 7)
      {
        localObject1 = com.tencent.mm.kiss.widget.textview.d.a((CharSequence)localObject1, j, com.tencent.mm.plugin.sns.ui.widget.e.cvB().cvC()).SO();
        com.tencent.mm.kiss.widget.textview.c.eNj.a(com.tencent.mm.plugin.sns.ui.widget.e.cvB().cvC(), (com.tencent.mm.kiss.widget.textview.f)localObject1);
      }
      a(paramInt, localav);
      label560: Object localObject4;
      if (localav.qBY.DI(32))
      {
        com.tencent.mm.plugin.sns.model.af.cnC().b(localn, null);
        e(localav.qCc);
        localObject4 = localn.field_userName;
        localObject1 = this.fnq.aoN((String)localObject4);
        if (!bo.isNullOrNil((String)localObject4))
        {
          if (!((String)localObject4).equals(this.ryC))
            break label2855;
          if (this.rEU != null)
            break label1332;
          this.rEU = ((com.tencent.mm.n.a)localObject1);
        }
      }
      while (true)
      {
        label621: label629: Object localObject5;
        if (localObject1 == null)
        {
          localObject2 = localObject4;
          localObject3 = localObject2;
          if (localn.DI(32))
          {
            localObject5 = localn.cqo();
            localObject3 = localObject2;
            if (localObject5 != null)
            {
              if (!((com.tencent.mm.plugin.sns.storage.b)localObject5).qVa)
                break label1349;
              localObject3 = ((com.tencent.mm.plugin.sns.storage.b)localObject5).qVb;
            }
          }
          localav.igi = ((String)localObject4);
          localav.rAH = ((String)localObject3);
          localav.rgZ = localn.DI(32);
          localav.riA = localn.cqU();
          if (localObject1 != null)
            break label1386;
          bool1 = true;
          label717: localav.rAI = bool1;
          localav.rAr = ((com.tencent.mm.n.a)localObject1);
          localav.rAs = localn.cqA();
          localav.rAu = localTimeLineObject.xfF;
          localav.rAv = localTimeLineObject.xfK;
          localav.rAw = localn.field_createTime;
          localav.rAA = aw.h(this.mContext, localav.rAw * 1000L);
          localav.rAK = false;
          if ((i == 10) && (!r.Yz().equals(localTimeLineObject.jBB)) && (localcbf.xaE != null) && (localcbf.xaE.xbg != 0))
          {
            localav.rAL = localcbf.xaE.xbg;
            localav.rAK = true;
          }
          if (!localav.rgZ)
            break label1412;
          localObject1 = localn.cqq();
          if (localObject1 != null)
          {
            localav.rAN = ((com.tencent.mm.plugin.sns.storage.a)localObject1).qTD;
            if (bo.isNullOrNil(((com.tencent.mm.plugin.sns.storage.a)localObject1).qTE))
              break label1406;
            bool1 = true;
            localav.rAO = bool1;
          }
          localObject1 = e(localTimeLineObject);
          if ((!com.tencent.mm.plugin.sns.c.a.gkF.dg((String)localObject1)) || (!f(localTimeLineObject)))
            break label1683;
          localav.rAP = true;
          if (localTimeLineObject.xfH != null)
            break label1547;
          bool1 = false;
        }
        while (true)
        {
          label948: localav.mAppName = ((String)localObject1);
          localav.rAR = bool1;
          label961: if ((localTimeLineObject.qNQ != null) && (!bo.isNullOrNil(localTimeLineObject.qNQ.uaa)))
          {
            localav.mAppName = this.mContext.getString(2131304110);
            localav.rAP = true;
          }
          label1125: label1126: label1264: label1406: boolean bool2;
          if ((localav.igi != null) && (localav.igi.equals(this.ryC)))
          {
            bool1 = true;
            localav.rAJ = bool1;
            localav.rAV = localn.cqW();
            localav.rAW = localn.cqM().wFm;
            localav.rAX = false;
            if ((localcbf != null) && (localav.rAJ))
            {
              j = localcbf.wGz;
              if ((j == 3) || (j == 5))
                localav.rAX = true;
            }
            if (localcbf == null)
              break label2427;
            if (localcbf.xaw.size() > 0)
              break label1758;
            localav.rAY = false;
            break label1939;
            if ((localcbf.xaE == null) || (!r.Yz().equals(localTimeLineObject.jBB)) || (localcbf.xaE.xbg <= 0))
              break label2011;
            localav.rBd = (com.tencent.mm.plugin.sns.lucky.a.m.b(localn, localcbf) * 1.0D);
            localav.rBc = localcbf.xaE.xbg;
            localav.rBb = true;
            localObject3 = new b.a();
            localObject4 = localcbf.xaE.xbh.iterator();
            while (true)
              if (((Iterator)localObject4).hasNext())
              {
                localObject2 = (cbb)((Iterator)localObject4).next();
                localObject1 = this.fnq.aoN(((cbb)localObject2).vHl);
                if (localObject1 != null)
                {
                  localObject1 = bo.nullAsNil(((com.tencent.mm.n.a)localObject1).Oj());
                  ((b.a)localObject3).A(new com.tencent.mm.vending.j.a[] { com.tencent.mm.vending.j.a.F(((cbb)localObject2).vHl, localObject1) });
                  continue;
                  localObject1 = localn.cqq().hnw;
                  break;
                  localObject1 = localav.qCc.jBB;
                  break label251;
                  bool1 = false;
                  break label261;
                  com.tencent.mm.plugin.sns.model.af.cnC().a(localn, null);
                  break label560;
                  label1332: localObject1 = this.rEU;
                  break label621;
                  localObject2 = ((com.tencent.mm.n.a)localObject1).Oj();
                  break label629;
                  label1349: localObject3 = localObject2;
                  if (!bo.isNullOrNil((String)localObject2))
                    break label674;
                  localObject3 = localObject2;
                  if (bo.isNullOrNil(((com.tencent.mm.plugin.sns.storage.b)localObject5).nickname))
                    break label674;
                  localObject3 = ((com.tencent.mm.plugin.sns.storage.b)localObject5).nickname;
                  break label674;
                  label1386: if ((int)((com.tencent.mm.n.a)localObject1).ewQ == 0)
                  {
                    bool1 = true;
                    break label717;
                  }
                  bool1 = false;
                  break label717;
                  bool1 = false;
                  break label897;
                  if (localTimeLineObject.xfG == null)
                  {
                    localObject1 = null;
                    if (localTimeLineObject.xfG != null)
                      break label1509;
                    localObject2 = null;
                    if (bo.isNullOrNil((String)localObject2))
                      break label1532;
                    if ((localn.field_snsId != 0L) || (bo.isNullOrNil((String)localObject1)))
                      break label1522;
                  }
                  label1509: label1522: for (localav.rAN = ((String)localObject1 + "·" + (String)localObject2); ; localav.rAN = ((String)localObject2))
                  {
                    localav.rAO = true;
                    break;
                    localObject1 = localTimeLineObject.xfG.guP;
                    break label1422;
                    localObject2 = localTimeLineObject.xfG.eUu;
                    break label1433;
                  }
                  label1532: localav.rAN = ((String)localObject1);
                  localav.rAO = false;
                  break label904;
                  if (this.rEZ.containsKey(localTimeLineObject.xfH.Id))
                  {
                    if (((Boolean)this.rEZ.get(localTimeLineObject.xfH.Id)).booleanValue())
                      break label2849;
                    bool1 = false;
                    break label948;
                  }
                  if (com.tencent.mm.pluginsdk.model.app.g.dk(localTimeLineObject.xfH.Id))
                    if (localTimeLineObject.xfH.vFy == 0)
                    {
                      bool2 = false;
                      bool1 = false;
                    }
                }
              }
          }
          while (true)
          {
            this.rEZ.put(localTimeLineObject.xfH.Id, Boolean.valueOf(bool2));
            break label948;
            bool2 = true;
            bool1 = true;
            continue;
            bool2 = com.tencent.mm.pluginsdk.model.app.g.aiF(localTimeLineObject.xfH.Id);
            if (!bool2)
            {
              bool1 = false;
              continue;
              if ((!bo.isNullOrNil(localTimeLineObject.xfJ)) && (f(localTimeLineObject)))
              {
                localav.mAppName = ((String)localObject1);
                localav.rAQ = true;
                localav.rAT = localTimeLineObject.vjM;
                localav.rAS = localTimeLineObject.xfJ;
                break label961;
              }
              localav.rAP = false;
              localav.rAQ = false;
              break label961;
              bool1 = false;
              break label1030;
              label1758: if (this.ryC.equals(localcbf.vHl))
              {
                localav.rAY = true;
                localObject2 = new StringBuffer();
                localObject3 = localcbf.xaw.iterator();
                j = 0;
                if (((Iterator)localObject3).hasNext())
                {
                  localObject4 = (cat)((Iterator)localObject3).next();
                  if (j == 0)
                  {
                    j = 1;
                    ((StringBuffer)localObject2).append("  ");
                  }
                  while (true)
                  {
                    if (((cat)localObject4).wCW == null)
                      break label1874;
                    ((StringBuffer)localObject2).append(((cat)localObject4).wCW);
                    break;
                    ((StringBuffer)localObject2).append(",  ");
                  }
                  localObject1 = this.fnq.aoN(((cat)localObject4).vHl);
                  if (localObject1 == null);
                  for (localObject1 = ((cat)localObject4).vHl; ; localObject1 = ((com.tencent.mm.n.a)localObject1).Oj())
                  {
                    ((StringBuffer)localObject2).append((String)localObject1);
                    break;
                  }
                }
                localav.rAZ = ((StringBuffer)localObject2).toString();
                break label1126;
              }
              label1874: localObject1 = localcbf.xaw.iterator();
              if (!((Iterator)localObject1).hasNext())
                break label1126;
              localObject2 = (cat)((Iterator)localObject1).next();
              if (!this.ryC.equals(((cat)localObject2).vHl))
                break label1125;
              localav.rAY = true;
              localav.rBa = true;
              break label1126;
              localObject1 = bo.nullAsNil(((cbb)localObject2).vHl);
              break label1264;
              localav.rBe = ((b.a)localObject3).dMh();
              label2011: if (localcbf.xaq.size() > 0)
              {
                localObject2 = new b.a();
                localObject3 = localcbf.xaq.iterator();
                if (((Iterator)localObject3).hasNext())
                {
                  localObject4 = (cat)((Iterator)localObject3).next();
                  localObject1 = this.fnq.aoN(((cat)localObject4).vHl);
                  if (localObject1 != null);
                  for (localObject1 = bo.nullAsNil(((com.tencent.mm.n.a)localObject1).Oj()); ; localObject1 = bo.nullAsNil(((cat)localObject4).vHl))
                  {
                    ((b.a)localObject2).A(new com.tencent.mm.vending.j.a[] { com.tencent.mm.vending.j.a.F(((cat)localObject4).vHl, localObject1) });
                    break;
                  }
                }
                localav.rBf = ((b.a)localObject2).dMh();
              }
              if (localcbf.xat.size() > 0)
              {
                localObject2 = new b.a();
                localObject4 = localcbf.xat.iterator();
                if (((Iterator)localObject4).hasNext())
                {
                  localObject5 = (cat)((Iterator)localObject4).next();
                  long l2;
                  if (((cat)localObject5).wZG != 0)
                  {
                    l2 = ((cat)localObject5).wZG;
                    localObject3 = ((cat)localObject5).vHl;
                    if (!((cat)localObject5).vHl.equals(this.ryC))
                      break label2373;
                    if (this.rEU != null)
                      break label2365;
                    localObject1 = this.fnq.aoN(((cat)localObject5).vHl);
                    this.rEU = ((com.tencent.mm.n.a)localObject1);
                    label2254: if (localObject1 == null)
                      break label2391;
                    localObject1 = ((com.tencent.mm.n.a)localObject1).Oj();
                  }
                  while (true)
                  {
                    ((b.a)localObject2).A(new com.tencent.mm.vending.j.a[] { com.tencent.mm.vending.j.a.b(Long.valueOf(l2), localObject3, localObject1, ((cat)localObject5).ncM, (CharSequence)localav.rAp.qFP.get(((cat)localObject5).wZG + "-" + ((cat)localObject5).wZJ + "-" + ((cat)localObject5).ncM)) });
                    break;
                    l2 = ((cat)localObject5).wZJ;
                    break label2205;
                    label2365: localObject1 = this.rEU;
                    break label2254;
                    label2373: localObject1 = this.fnq.aoN(((cat)localObject5).vHl);
                    break label2254;
                    label2391: if (((cat)localObject5).wCW != null)
                      localObject1 = ((cat)localObject5).wCW;
                    else
                      localObject1 = ((cat)localObject5).vHl;
                  }
                }
                localav.rBg = ((b.a)localObject2).dMh();
              }
              label2427: com.tencent.mm.plugin.sns.ui.af.a(this.mContext, localav, localTimeLineObject.qNO);
              if (localav.rgZ)
              {
                localav.rAB = localn.cqq();
                localav.rAC = localn.cqo();
                localObject1 = localn.cqo();
                if (localObject1 != null)
                {
                  localObject1 = ((com.tencent.mm.plugin.sns.storage.b)localObject1).qUf;
                  label2484: localav.rAD = ((String)localObject1);
                }
              }
              else if (localav.rgZ)
              {
                localObject4 = localav.rAB;
                if (localav.rAB.qTF != com.tencent.mm.plugin.sns.storage.a.qTr)
                  break label2617;
                localav.rAE = ((com.tencent.mm.plugin.sns.storage.a)localObject4).qTG;
              }
              while (true)
              {
                localObject1 = localn.cqM();
                localav.rBj = ((bav)localObject1);
                if ((localObject1 != null) && (!r.Yz().equals(localTimeLineObject.jBB)) && (com.tencent.mm.plugin.sns.lucky.a.m.a(localn, localcbf)))
                  localav.rAM = true;
                ab.d("MicroMsg.SnsTimeLineVendingSide", "SnsTimeLineVendingStruct resolve %s %s ms", new Object[] { Integer.valueOf(paramInt), Long.valueOf(System.currentTimeMillis() - l1) });
                localObject1 = localav;
                break;
                localObject1 = "";
                break label2484;
                label2617: if ((((com.tencent.mm.plugin.sns.storage.a)localObject4).qTF == com.tencent.mm.plugin.sns.storage.a.qTs) && (!bo.isNullOrNil(((com.tencent.mm.plugin.sns.storage.a)localObject4).qTG)))
                {
                  localObject2 = "";
                  localObject3 = ((com.tencent.mm.plugin.sns.storage.a)localObject4).qTI.iterator();
                  if (((Iterator)localObject3).hasNext())
                  {
                    localObject5 = (String)((Iterator)localObject3).next();
                    localObject1 = com.tencent.mm.plugin.sns.model.af.cnt().aoN((String)localObject5);
                    if (localObject1 != null)
                    {
                      localObject1 = ((com.tencent.mm.n.a)localObject1).Oj();
                      if (!bo.isNullOrNil((String)localObject1))
                        localObject1 = (String)localObject2 + (String)localObject1;
                    }
                    while (true)
                    {
                      localObject2 = localObject1;
                      if (((com.tencent.mm.plugin.sns.storage.a)localObject4).qTI.getLast() == localObject5)
                        break;
                      localObject2 = (String)localObject1 + ",";
                      break;
                      localObject1 = (String)localObject2 + (String)localObject5;
                      continue;
                      localObject1 = (String)localObject2 + (String)localObject5;
                    }
                  }
                  localav.rAG = ((String)localObject2);
                  localav.rAF = String.format(((com.tencent.mm.plugin.sns.storage.a)localObject4).qTG, new Object[] { localObject2 });
                }
              }
            }
            bool1 = true;
          }
          bool1 = true;
        }
      }
    }
  }

  private void Kh()
  {
    synchronized (this.rEX)
    {
      this.lQD = w(0L, this.lQD);
      return;
    }
  }

  private void a(int paramInt, av paramav)
  {
    Object localObject1 = paramav.qBX.xat;
    paramav.rAp = new com.tencent.mm.plugin.sns.data.d();
    if (this.DEBUG)
      ab.d("MicroMsg.SnsTimeLineVendingSide", "debug:renderSnsComment position " + paramInt + " commentInfoList: " + ((List)localObject1).size() + " commentData:" + paramav.rAp.qFP.size());
    Iterator localIterator = ((List)localObject1).iterator();
    label132: label263: label268: label273: label340: 
    while (localIterator.hasNext())
    {
      Object localObject2 = (cat)localIterator.next();
      CharSequence localCharSequence;
      if (com.tencent.mm.plugin.sns.ui.widget.d.fF(((cat)localObject2).wZL, 16))
      {
        localObject1 = com.tencent.mm.plugin.sns.ui.widget.b.cvx().getTextViewConfig();
        localCharSequence = com.tencent.mm.plugin.sns.ui.widget.d.a(this.mContext, (cat)localObject2, new a.1(this), paramav.qBY.field_type, paramav.qBY.field_userName, 1);
        Object localObject3 = com.tencent.mm.kiss.widget.textview.c.eNj;
        if (localObject1 == null)
          break label268;
        localObject3 = (com.tencent.mm.kiss.widget.textview.b)((com.tencent.mm.kiss.widget.textview.c)localObject3).eNk.get(Integer.valueOf(com.tencent.mm.kiss.widget.textview.c.a((com.tencent.mm.kiss.widget.textview.a.a)localObject1)));
        if (localObject3 == null)
          break label268;
        localObject3 = (LinkedList)((com.tencent.mm.kiss.widget.textview.b)localObject3).eNi.get(localCharSequence.toString());
        if ((localObject3 != null) && (((LinkedList)localObject3).size() != 0))
          break label263;
        paramInt = 0;
      }
      while (true)
      {
        if (paramInt == 0)
          break label273;
        paramav.rAp.a((cat)localObject2, localCharSequence);
        break;
        localObject1 = com.tencent.mm.plugin.sns.ui.widget.c.cvy().getTextViewConfig();
        break label132;
        paramInt = 1;
        continue;
        paramInt = 0;
      }
      paramav.rAp.a((cat)localObject2, localCharSequence);
      if (com.tencent.mm.plugin.sns.ui.widget.d.fF(((cat)localObject2).wZL, 16));
      for (paramInt = com.tencent.mm.plugin.sns.ui.widget.b.cvx().getViewWidth(); ; paramInt = com.tencent.mm.plugin.sns.ui.widget.c.cvy().getViewWidth())
      {
        if (paramInt <= 0)
          break label340;
        localObject2 = com.tencent.mm.kiss.widget.textview.d.a(localCharSequence, paramInt, (com.tencent.mm.kiss.widget.textview.a.a)localObject1).SO();
        com.tencent.mm.kiss.widget.textview.c.eNj.a((com.tencent.mm.kiss.widget.textview.a.a)localObject1, (com.tencent.mm.kiss.widget.textview.f)localObject2);
        break;
      }
    }
  }

  private String e(TimeLineObject paramTimeLineObject)
  {
    Object localObject;
    if (paramTimeLineObject.xfI.wbJ == 26)
      localObject = this.mContext.getString(2131299589);
    while (true)
    {
      return localObject;
      if (paramTimeLineObject.xfH == null)
      {
        localObject = "";
      }
      else if (bo.isNullOrNil(paramTimeLineObject.xfH.Id))
      {
        localObject = "";
      }
      else if (this.rEY.containsKey(paramTimeLineObject.xfH.Id))
      {
        localObject = (String)this.rEY.get(paramTimeLineObject.xfH.Id);
      }
      else
      {
        int i = bo.getInt(paramTimeLineObject.xfH.jCh, 0);
        String str = com.tencent.mm.pluginsdk.model.app.g.r(this.mContext, paramTimeLineObject.xfH.Id, i);
        localObject = str;
        if (!bo.isNullOrNil(str))
        {
          this.rEY.put(paramTimeLineObject.xfH.Id, str);
          localObject = str;
        }
      }
    }
  }

  private static boolean f(TimeLineObject paramTimeLineObject)
  {
    boolean bool = true;
    if (bo.isNullOrNil(paramTimeLineObject.xfJ));
    while (true)
    {
      return bool;
      if ((am.a.coe() & 0x2) > 0)
        bool = false;
    }
  }

  public final void PA()
  {
    looperCheckForVending();
    ab.i("MicroMsg.SnsTimeLineVendingSide", "resetSize %s", new Object[] { Boolean.valueOf(this.rEW) });
    if (this.rEW);
    while (true)
    {
      return;
      synchronized (this.rEX)
      {
        this.lQD = w(0L, this.lQD);
      }
    }
  }

  public final void ZK(String paramString)
  {
    this.rmL = paramString;
  }

  public final void ZL(String paramString)
  {
    synchronized (this.rEX)
    {
      this.lQD = paramString;
      return;
    }
  }

  public final void a(Context paramContext, au paramau, String paramString)
  {
    this.mContext = paramContext;
    this.rES = paramau;
    this.ryC = paramString;
    com.tencent.mm.kernel.g.RQ();
    this.fnq = ((j)com.tencent.mm.kernel.g.K(j.class)).XM();
  }

  public final void ctK()
  {
    looperCheckForVending();
    long l;
    if (this.c == 0)
    {
      l = 0L;
      this.rEW = true;
    }
    while (true)
      synchronized (this.rEX)
      {
        this.lQD = w(l, this.lQD);
        return;
        int i = this.c - 1;
        int j = 0;
        n localn = (n)getItem(i);
        if ((localn != null) && (!localn.DI(32)) && (localn.field_snsId != 0L))
        {
          l = localn.field_snsId;
          ab.i("MicroMsg.SnsTimeLineVendingSide", "get list last not ad item %s %s", new Object[] { Long.valueOf(l), localn.field_stringSeq });
          break;
        }
        j++;
        i--;
        if ((i < 0) || (j > 500))
          l = 0L;
      }
  }

  public final String cuO()
  {
    return this.lQD;
  }

  public final String cuP()
  {
    return this.rmL;
  }

  public final void cuQ()
  {
    this.rEW = true;
  }

  public Cursor cuR()
  {
    init();
    int i = com.tencent.mm.plugin.sns.model.af.cnF().Zg(this.lQD);
    ab.i("MicroMsg.SnsTimeLineVendingSide", "create time sql %s to %s getLimitSeq() %s", new Object[] { Integer.valueOf(this.rET), Integer.valueOf(i), this.lQD });
    Object localObject1 = new ArrayList();
    Object localObject2;
    Object localObject3;
    Object localObject4;
    Object localObject5;
    Object localObject6;
    Object localObject7;
    long l1;
    int j;
    boolean bool;
    if (this.rET != i)
    {
      localObject2 = com.tencent.mm.plugin.sns.model.af.cnI().fq(this.rET, i);
      if ((localObject2 != null) && (((Cursor)localObject2).moveToFirst()))
      {
        localObject3 = new LinkedList();
        localObject4 = new com.tencent.mm.plugin.sns.storage.e();
        ((com.tencent.mm.plugin.sns.storage.e)localObject4).d((Cursor)localObject2);
        localObject5 = ((com.tencent.mm.plugin.sns.storage.e)localObject4).cqB();
        localObject6 = new StringBuilder("ad xml ");
        com.tencent.mm.plugin.sns.storage.e locale = ((n)localObject5).crd();
        localObject7 = new StringBuffer();
        ((StringBuffer)localObject7).append(((n)localObject5).field_stringSeq);
        ((StringBuffer)localObject7).append(locale.field_adxml);
        ((StringBuffer)localObject7).append(" <createtime " + ((n)localObject5).field_createTime + ">");
        ((StringBuffer)localObject7).append(" <exposuretime " + locale.field_exposureTime + ">");
        ((StringBuffer)localObject7).append(" <adcreatetime " + locale.field_createAdTime + "> ");
        ((StringBuffer)localObject7).append(locale.cqu().xfF);
        ab.d("MicroMsg.SnsTimeLineVendingSide", ((StringBuffer)localObject7).toString());
        l1 = 21600L;
        localObject6 = ((n)localObject5).cqq();
        j = ((n)localObject5).field_createTime;
        if ((((com.tencent.mm.plugin.sns.storage.e)localObject4).field_localFlag & 0x80) > 0)
        {
          bool = true;
          if (localObject6 == null)
            break label1103;
          if (!bool)
            break label732;
          l1 = 60L * ((com.tencent.mm.plugin.sns.storage.a)localObject6).qTv;
          j = ((com.tencent.mm.plugin.sns.storage.e)localObject4).field_exposureTime;
        }
      }
    }
    label828: label1103: 
    while (true)
    {
      label366: long l2 = bo.fp(j);
      int k;
      if (l2 >= l1)
      {
        localObject6 = aj.q((n)localObject5);
        if (((n)localObject5).field_likeFlag == 0)
        {
          localObject6 = ((cbf)localObject6).xat.iterator();
          do
          {
            if (!((Iterator)localObject6).hasNext())
              break;
            localObject7 = (cat)((Iterator)localObject6).next();
          }
          while ((localObject7 == null) || (bo.isNullOrNil(((cat)localObject7).vHl)) || (!((cat)localObject7).vHl.equals(this.ryC)));
        }
        k = 1;
        label463: if (k == 0)
        {
          ((List)localObject1).add(Long.valueOf(((n)localObject5).field_snsId));
          ab.i("MicroMsg.SnsTimeLineVendingSide", "prepare to delete the ad " + ((n)localObject5).field_snsId + " exposureTime: " + l1 + " field_createTime: " + ((n)localObject5).field_createTime + " checktime: " + l2 + " gettime: " + j + " isexposure " + bool + " exposureTime " + ((com.tencent.mm.plugin.sns.storage.e)localObject4).field_exposureTime + " adCreateTIme:" + ((com.tencent.mm.plugin.sns.storage.e)localObject4).field_createAdTime);
          if (!bool)
            ((LinkedList)localObject3).add(localObject4);
        }
      }
      while (true)
      {
        if (((Cursor)localObject2).moveToNext())
          break label828;
        if (((LinkedList)localObject3).size() <= 0)
          break label854;
        localObject4 = new LinkedList();
        localObject5 = ((LinkedList)localObject3).iterator();
        while (((Iterator)localObject5).hasNext())
        {
          localObject3 = (com.tencent.mm.plugin.sns.storage.e)((Iterator)localObject5).next();
          localObject6 = new bp();
          ((bp)localObject6).vDS = 13298;
          ((bp)localObject6).vDT = new com.tencent.mm.bt.b(((com.tencent.mm.plugin.sns.storage.e)localObject3).cqq().qPj.getBytes());
          ((bp)localObject6).vDU = (System.currentTimeMillis() / 1000L);
          ((LinkedList)localObject4).add(localObject6);
        }
        bool = false;
        break;
        label732: l1 = 60L * ((com.tencent.mm.plugin.sns.storage.a)localObject6).qTu;
        j = ((com.tencent.mm.plugin.sns.storage.e)localObject4).field_createAdTime;
        break label366;
        k = 0;
        break label463;
        l1 = ((n)localObject5).field_snsId;
        ab.i("MicroMsg.SnsTimeLineVendingSide", "try to update snsid ".concat(String.valueOf(l1)));
        if (com.tencent.mm.plugin.sns.model.m.kb(l1))
        {
          localObject4 = new com.tencent.mm.plugin.sns.model.m(l1, 1, ((n)localObject5).cqq().qTU);
          com.tencent.mm.kernel.g.RQ();
          com.tencent.mm.kernel.g.RO().eJo.a((com.tencent.mm.ai.m)localObject4, 0);
        }
      }
      break;
      com.tencent.mm.kernel.g.RQ();
      com.tencent.mm.kernel.g.RO().eJo.a(new l((LinkedList)localObject4), 0);
      label854: if (localObject2 != null)
      {
        ab.d("MicroMsg.SnsTimeLineVendingSide", "test for adcount " + ((Cursor)localObject2).getCount());
        ((Cursor)localObject2).close();
      }
      if (!((List)localObject1).isEmpty())
      {
        localObject2 = ((List)localObject1).iterator();
        while (((Iterator)localObject2).hasNext())
          com.tencent.mm.plugin.sns.model.a.jX(((Long)((Iterator)localObject2).next()).longValue());
        ((List)localObject1).clear();
      }
      this.rET = i;
      localObject2 = com.tencent.mm.plugin.sns.model.af.cnF().df(this.lQD, i);
      ab.d("MicroMsg.SnsTimeLineVendingSide", "onCursorResetFinish");
      localObject3 = com.tencent.mm.modelsns.b.lY(500);
      if (((com.tencent.mm.modelsns.b)localObject3).ajG())
      {
        j = this.c;
        if (j != 0)
          break label1015;
        ((com.tencent.mm.modelsns.b)localObject3).mb(0).mb(0).mb(0);
        ((com.tencent.mm.modelsns.b)localObject3).ajK();
      }
      while (true)
      {
        return localObject2;
        label1015: localObject4 = i.j((n)getItem(1));
        localObject1 = i.j((n)getItem(j - 1));
        if ((!((String)localObject4).equals(this.rFa)) || (!((String)localObject1).equals(this.rFb)))
        {
          this.rFa = ((String)localObject4);
          this.rFb = ((String)localObject1);
          ((com.tencent.mm.modelsns.b)localObject3).mb(j).tx((String)localObject4).tx((String)localObject1);
          ((com.tencent.mm.modelsns.b)localObject3).ajK();
        }
      }
    }
  }

  public void destroyAsynchronous()
  {
    super.destroyAsynchronous();
    com.tencent.mm.kiss.widget.textview.c.eNj.SN();
    this.rEZ.clear();
    this.mContext = null;
    this.rES = null;
    this.fnq = null;
    this.zXa = null;
  }

  protected final void init()
  {
    if (!this.rEV)
    {
      Kh();
      this.rEV = true;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.a.b.a
 * JD-Core Version:    0.6.2
 */