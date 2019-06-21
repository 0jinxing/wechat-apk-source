package com.tencent.mm.plugin.notification.c;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.Looper;
import android.support.v4.app.v.c;
import com.tencent.mm.g.a.kt;
import com.tencent.mm.plugin.notification.d.b.a;
import com.tencent.mm.plugin.notification.d.f;
import com.tencent.mm.plugin.notification.ui.FailSendMsgNotification;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.ap;
import java.util.ArrayList;
import java.util.Iterator;

public abstract class a<T>
  implements c
{
  protected Context mContext = null;
  protected b oVG = null;
  protected FailSendMsgNotification oVH = null;
  protected boolean oVI = false;
  protected ArrayList<Long> oVJ = null;
  protected ArrayList<Long> oVK = null;
  protected ArrayList<Long> oVL = null;
  private ArrayList<ap> oVM = new ArrayList();
  private ap oVN = null;
  private com.tencent.mm.sdk.b.c oVO = new a.1(this);

  public a()
  {
    this.oVH.oWA = new a.2(this);
    this.oVH.oWB = new a.3(this);
    this.oVH.oWC = new a.4(this);
    bWo();
  }

  private void bHM()
  {
    this.oVG.clear();
    this.oVI = false;
    this.oVJ.clear();
    this.oVK.clear();
    bWy();
  }

  private String bWA()
  {
    StringBuilder localStringBuilder = new StringBuilder("");
    for (int i = 0; i < this.oVG.oVR.size(); i++)
    {
      long l = this.oVG.get(i);
      localStringBuilder.append(l + ", ");
    }
    return localStringBuilder.toString();
  }

  private void bWC()
  {
    this.oVG.currentIndex = 0;
    if (this.oVJ.size() > 0)
    {
      Iterator localIterator = this.oVJ.iterator();
      while (localIterator.hasNext())
      {
        Long localLong = (Long)localIterator.next();
        this.oVG.remove(localLong.longValue());
      }
    }
    this.oVJ.clear();
    this.oVK.clear();
  }

  private void bWE()
  {
    b.a locala = new b.a(this.oVG, this.oVG.currentIndex, this.oVJ, this.oVK);
    com.tencent.mm.plugin.notification.d.b.a(getType(), locala);
  }

  private void bWo()
  {
    this.oVN = new ap(Looper.getMainLooper(), new a.5(this), true);
  }

  private void bWp()
  {
    if (this.oVN != null)
      this.oVN.stopTimer();
    while (true)
    {
      return;
      ab.e("MicroMsg.AbstractSendMsgFailNotification", "stopCheckMsgExistTimer error, timer is null");
    }
  }

  private void bWq()
  {
    ab.d("MicroMsg.AbstractSendMsgFailNotification", "showInitNotification, isInForeground:%b", new Object[] { Boolean.valueOf(f.aJt()) });
    this.oVH.oWE = Aq(this.oVG.oVR.size());
    this.oVH.bWU();
    if ((!f.aJt()) && (!this.oVH.oWJ))
    {
      this.oVH.oWD = Aq(this.oVG.oVR.size());
      this.oVH.bWT();
      this.oVH.bWS();
      ab.d("MicroMsg.AbstractSendMsgFailNotification", "showInitNotification, first show notification");
      this.oVH.show();
      com.tencent.mm.sdk.b.a.xxA.d(this.oVO);
      com.tencent.mm.sdk.b.a.xxA.c(this.oVO);
    }
    while (true)
    {
      return;
      if (this.oVH.oWJ)
      {
        this.oVH.bWT();
        this.oVH.bWS();
        ab.d("MicroMsg.AbstractSendMsgFailNotification", "showInitNotification, update notification content text");
        this.oVH.TV(Aq(this.oVG.oVR.size()));
        com.tencent.mm.sdk.b.a.xxA.d(this.oVO);
        com.tencent.mm.sdk.b.a.xxA.c(this.oVO);
      }
      else
      {
        ab.d("MicroMsg.AbstractSendMsgFailNotification", "showInitNotification, not show or update notification, isForeground:%b", new Object[] { Boolean.valueOf(f.aJt()) });
      }
    }
  }

  private void bWr()
  {
    if (Build.VERSION.SDK_INT >= 16)
    {
      this.oVH.oWE = Aq(this.oVG.oVR.size());
      if (this.oVK.size() > 0)
        break label76;
      this.oVH.TV(eL(this.oVG.oVR.size(), this.oVJ.size() + this.oVK.size()));
    }
    while (true)
    {
      return;
      label76: this.oVH.TV(af(this.oVG.oVR.size(), this.oVJ.size() + this.oVK.size(), this.oVK.size()));
    }
  }

  private void bWs()
  {
    this.oVI = false;
    ab.d("MicroMsg.AbstractSendMsgFailNotification", "finish resend, msgList.size:%d, mFailList.size:%d, mSuccessList.size:%d", new Object[] { Integer.valueOf(this.oVG.oVR.size()), Integer.valueOf(this.oVK.size()), Integer.valueOf(this.oVJ.size()) });
    bWv();
    if ((this.oVK.size() <= 0) || (Build.VERSION.SDK_INT < 16))
      com.tencent.mm.plugin.notification.d.b.As(getType());
    h.pYm.e(11425, new Object[] { Integer.valueOf(getType()), Integer.valueOf(0), Integer.valueOf(this.oVJ.size()), Integer.valueOf(this.oVK.size()) });
    if (Build.VERSION.SDK_INT >= 16)
    {
      this.oVH.bWT();
      this.oVH.oWE = Aq(this.oVG.oVR.size());
      localObject = this.oVH;
      this.oVG.oVR.size();
      ((FailSendMsgNotification)localObject).TV(eM(this.oVJ.size(), this.oVK.size()));
      this.oVH.bWS();
      if (this.oVK.size() > 0)
      {
        this.oVH.bWU();
        this.oVH.show();
        bWC();
        bWE();
      }
    }
    Object localObject = new kt();
    ((kt)localObject).cGI.type = getType();
    com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject);
    bWp();
    bWy();
    com.tencent.mm.sdk.b.a.xxA.d(this.oVO);
    bWt();
  }

  private void bWv()
  {
    ab.d("MicroMsg.AbstractSendMsgFailNotification", "checkMsgExistAfterResend, before check, mMsgList.size:%d, mSuccessList.size:%d, mFailList.size:%d", new Object[] { Integer.valueOf(this.oVG.oVR.size()), Integer.valueOf(this.oVJ.size()), Integer.valueOf(this.oVK.size()) });
    bWw();
    bWx();
    ab.d("MicroMsg.AbstractSendMsgFailNotification", "checkMsgExistAfterResend, after check, mMsgList.size:%d, mSuccessList.size:%d, mFailList.size:%d", new Object[] { Integer.valueOf(this.oVG.oVR.size()), Integer.valueOf(this.oVJ.size()), Integer.valueOf(this.oVK.size()) });
  }

  private void bWw()
  {
    Object localObject = new ArrayList();
    for (int i = 0; i < this.oVG.oVR.size(); i++)
    {
      long l = this.oVG.get(i);
      if (!jr(l))
        ((ArrayList)localObject).add(Long.valueOf(l));
    }
    if (((ArrayList)localObject).size() > 0)
    {
      localObject = ((ArrayList)localObject).iterator();
      while (((Iterator)localObject).hasNext())
      {
        Long localLong = (Long)((Iterator)localObject).next();
        this.oVG.remove(localLong.longValue());
      }
    }
  }

  private void bWx()
  {
    Object localObject = new ArrayList();
    Iterator localIterator = this.oVJ.iterator();
    Long localLong;
    while (localIterator.hasNext())
    {
      localLong = (Long)localIterator.next();
      if (!jr(localLong.longValue()))
        ((ArrayList)localObject).add(localLong);
    }
    localIterator = ((ArrayList)localObject).iterator();
    while (localIterator.hasNext())
    {
      localLong = (Long)localIterator.next();
      this.oVJ.remove(localLong);
    }
    ((ArrayList)localObject).clear();
    localIterator = this.oVK.iterator();
    while (localIterator.hasNext())
    {
      localLong = (Long)localIterator.next();
      if (!jr(localLong.longValue()))
        ((ArrayList)localObject).add(localLong);
    }
    localIterator = ((ArrayList)localObject).iterator();
    while (localIterator.hasNext())
    {
      localObject = (Long)localIterator.next();
      this.oVK.remove(localObject);
    }
  }

  private void bWy()
  {
    Iterator localIterator = this.oVM.iterator();
    while (localIterator.hasNext())
      ((ap)localIterator.next()).stopTimer();
    this.oVM.clear();
    this.oVL.clear();
  }

  protected abstract String Aq(int paramInt);

  protected abstract void N(ArrayList<Long> paramArrayList);

  protected abstract String af(int paramInt1, int paramInt2, int paramInt3);

  public final FailSendMsgNotification bWB()
  {
    return this.oVH;
  }

  protected final void bWD()
  {
    b.a locala;
    if ((this.oVG == null) || (this.oVG.oVR.size() == 0))
    {
      ab.d("MicroMsg.AbstractSendMsgFailNotification", "autoResumeFromCrash");
      locala = com.tencent.mm.plugin.notification.d.b.Ar(getType());
      if (locala != null)
        break label49;
      ab.e("MicroMsg.AbstractSendMsgFailNotification", "resetNotificationAfterCrash, cacheObj is null");
    }
    while (true)
    {
      return;
      label49: if (this.oVN == null)
        bWo();
      b localb = locala.oVT;
      ArrayList localArrayList1 = locala.oVV;
      ArrayList localArrayList2 = locala.oVW;
      int i = locala.oVU;
      if ((localArrayList1.size() == 0) && (localArrayList2.size() == 0) && (i == 0))
      {
        ab.d("MicroMsg.AbstractSendMsgFailNotification", "resetNotificationAfterCrash, not start resend");
        this.oVG.clear();
        this.oVG = localb;
        this.oVJ.clear();
        this.oVK.clear();
        bWq();
      }
      else if (localArrayList1.size() + localArrayList2.size() >= localb.oVR.size())
      {
        ab.d("MicroMsg.AbstractSendMsgFailNotification", "resetNotificationAfterCrash, resendFinish");
        bWs();
      }
      else
      {
        ab.d("MicroMsg.AbstractSendMsgFailNotification", "resetNotificationAfterCrash, currently resending");
        this.oVG.clear();
        this.oVG = localb;
        this.oVG.currentIndex = i;
        this.oVJ.clear();
        this.oVJ.addAll(localArrayList1);
        this.oVK.clear();
        this.oVK.addAll(localArrayList2);
        bWr();
      }
    }
  }

  protected abstract void bWF();

  protected void bWt()
  {
  }

  public final void bWu()
  {
    ab.d("MicroMsg.AbstractSendMsgFailNotification", "resendAllMsg, mMsgList.size:%d", new Object[] { Integer.valueOf(this.oVG.oVR.size()) });
    this.oVI = true;
    if (Build.VERSION.SDK_INT >= 16)
    {
      FailSendMsgNotification localFailSendMsgNotification = this.oVH;
      localFailSendMsgNotification.oWL = false;
      localFailSendMsgNotification.oWx = com.tencent.mm.bo.a.bt(localFailSendMsgNotification.mContext, com.tencent.mm.bo.a.dgM());
      localFailSendMsgNotification.bWR();
      localFailSendMsgNotification.show();
      ab.d("MicroMsg.FailSendMsgNotification", "FailSendMsgNotification, removeActionButton");
      localFailSendMsgNotification = this.oVH;
      localFailSendMsgNotification.oWx.k(2, true);
      localFailSendMsgNotification.oWK = true;
      localFailSendMsgNotification.show();
      ab.d("MicroMsg.FailSendMsgNotification", "FailSendMsgNotification, setLockInNotificationBar");
      this.oVH.TV(eL(this.oVG.oVR.size(), 0));
    }
    this.oVG.currentIndex = 0;
    bWy();
    com.tencent.mm.sdk.b.a.xxA.d(this.oVO);
    com.tencent.mm.sdk.b.a.xxA.c(this.oVO);
    jp(this.oVG.bWJ());
    if (this.oVN != null)
      this.oVN.ae(300000L, 300000L);
    while (true)
    {
      return;
      ab.e("MicroMsg.AbstractSendMsgFailNotification", "startCheckMsgExistTimer error, timer is null");
    }
  }

  public final void bWz()
  {
    ab.d("MicroMsg.AbstractSendMsgFailNotification", "omitFailMsg, size:%d", new Object[] { Integer.valueOf(this.oVG.oVR.size()) });
    if (this.oVG.oVR.size() > 0)
    {
      Object localObject = this.oVG;
      ArrayList localArrayList = new ArrayList();
      localObject = ((b)localObject).oVR.iterator();
      while (((Iterator)localObject).hasNext())
        localArrayList.add(Long.valueOf(((Long)((Iterator)localObject).next()).longValue()));
      N(localArrayList);
    }
  }

  public final void ch(T paramT)
  {
    if (paramT == null);
    while (true)
    {
      return;
      ab.d("MicroMsg.AbstractSendMsgFailNotification", "processSendMsgFail, msgId:%d, msgList:%s, isResending:%b", new Object[] { Long.valueOf(cj(paramT)), bWA(), Boolean.valueOf(this.oVI) });
      if (!this.oVI)
      {
        if (!this.oVL.contains(Long.valueOf(cj(paramT))))
        {
          if (paramT == null)
          {
            ab.e("MicroMsg.AbstractSendMsgFailNotification", "showNotificationAfterSendFail, msgObj is null");
          }
          else
          {
            ArrayList localArrayList = ck(paramT);
            if ((localArrayList == null) || (localArrayList.size() <= 0))
            {
              ab.e("MicroMsg.AbstractSendMsgFailNotification", "showNotificationAfterSendFail, cannot get history fail msg");
            }
            else
            {
              bHM();
              paramT = this.oVG;
              if ((localArrayList != null) && (localArrayList.size() > 0))
                paramT.oVR.addAll(localArrayList);
              bWE();
              ab.d("MicroMsg.AbstractSendMsgFailNotification", "showNotificationAfterSendFail, msgList.size:%d, msgList:%s", new Object[] { Integer.valueOf(this.oVG.oVR.size()), bWA() });
              h.pYm.e(11426, new Object[] { Integer.valueOf(getType()) });
              al.n(new a.6(this), 1000L);
            }
          }
        }
        else
          this.oVL.remove(Long.valueOf(cj(paramT)));
      }
      else
      {
        if ((this.oVG.contains(cj(paramT))) && (!this.oVK.contains(Long.valueOf(cj(paramT)))))
          this.oVK.add(Long.valueOf(cj(paramT)));
        if (!this.oVG.contains(cj(paramT)))
        {
          ab.d("MicroMsg.AbstractSendMsgFailNotification", "sending msg, another fail msg");
          this.oVG.js(cj(paramT));
        }
        bWr();
        ab.d("MicroMsg.AbstractSendMsgFailNotification", "processSendMsgFail, successlist.size:%d, faillist.size:%d", new Object[] { Integer.valueOf(this.oVJ.size()), Integer.valueOf(this.oVK.size()) });
        if (this.oVJ.size() + this.oVK.size() < this.oVG.oVR.size())
        {
          long l = this.oVG.bWJ();
          if (l == -1L)
          {
            ab.e("TAG", "resend error, next msg id is -1");
          }
          else
          {
            ab.d("MicroMsg.AbstractSendMsgFailNotification", "continue resend, nextId:%d", new Object[] { Long.valueOf(l) });
            bWE();
            jp(l);
          }
        }
        else
        {
          bWs();
        }
      }
    }
  }

  public final void ci(T paramT)
  {
    ab.d("MicroMsg.AbstractSendMsgFailNotification", "processSendMsgSucess, msgId:%d, msgList:%s", new Object[] { Long.valueOf(cj(paramT)), bWA() });
    long l;
    if (this.oVG.contains(cj(paramT)))
    {
      l = cj(paramT);
      if ((this.oVL.contains(Long.valueOf(l))) && (this.oVK.contains(Long.valueOf(l))))
      {
        ab.i("MicroMsg.AbstractSendMsgFailNotification", "receive send msg success event from a timout message, remvoe it from the fail list");
        this.oVL.remove(Long.valueOf(l));
        this.oVK.remove(Long.valueOf(l));
      }
      if (!this.oVI)
        break label264;
      this.oVJ.add(Long.valueOf(l));
      bWr();
      ab.d("MicroMsg.AbstractSendMsgFailNotification", "processSendMsgSuccess, successlist.size:%d, faillist.size:%d", new Object[] { Integer.valueOf(this.oVJ.size()), Integer.valueOf(this.oVK.size()) });
      if (this.oVJ.size() + this.oVK.size() >= this.oVG.oVR.size())
        break label257;
      l = this.oVG.bWJ();
      if (l != -1L)
        break label226;
      ab.e("TAG", "resend error, next msg id is -1");
    }
    while (true)
    {
      return;
      label226: ab.d("MicroMsg.AbstractSendMsgFailNotification", "continue resend, nextId:%d", new Object[] { Long.valueOf(l) });
      bWE();
      jp(l);
      continue;
      label257: bWs();
      continue;
      label264: this.oVG.remove(cj(paramT));
      if (this.oVG.oVR.size() == 0)
      {
        this.oVH.dismiss();
        bHM();
        com.tencent.mm.plugin.notification.d.b.As(getType());
      }
      else
      {
        ab.d("MicroMsg.AbstractSendMsgFailNotification", "maybe the user manually resend the message, update init wording");
        this.oVH.TV(Aq(this.oVG.oVR.size()));
      }
    }
  }

  protected abstract long cj(T paramT);

  protected abstract ArrayList<Long> ck(T paramT);

  protected abstract String eL(int paramInt1, int paramInt2);

  protected abstract String eM(int paramInt1, int paramInt2);

  protected final Context getContext()
  {
    return this.mContext;
  }

  protected abstract int getType();

  final void jp(long paramLong)
  {
    al.n(new a.7(this, paramLong), 200L);
  }

  public abstract void jq(long paramLong);

  public abstract boolean jr(long paramLong);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.notification.c.a
 * JD-Core Version:    0.6.2
 */