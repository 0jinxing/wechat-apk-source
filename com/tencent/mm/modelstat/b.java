package com.tencent.mm.modelstat;

import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.qe;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.report.kvdata.IMBehavior;
import com.tencent.mm.plugin.report.kvdata.IMBehaviorChattingOP;
import com.tencent.mm.plugin.report.kvdata.IMBehaviorMsgOP;
import com.tencent.mm.plugin.report.kvdata.log_13835;
import com.tencent.mm.plugin.report.kvdata.log_13913;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.an;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bi;
import com.tencent.mm.storage.d;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Map;

public final class b
{
  public static b fRa;
  private com.tencent.mm.sdk.b.c ecP;
  public log_13835 fQZ;
  private int fRb;
  private int fRc;
  private boolean hasInit;
  public Object lock;

  static
  {
    AppMethodBeat.i(78656);
    fRa = new b();
    AppMethodBeat.o(78656);
  }

  private b()
  {
    AppMethodBeat.i(78633);
    this.lock = new Object();
    this.ecP = new com.tencent.mm.sdk.b.c()
    {
    };
    this.fRb = 1;
    this.fRc = 1;
    this.hasInit = false;
    a.xxA.b(this.ecP);
    AppMethodBeat.o(78633);
  }

  private void a(IMBehavior paramIMBehavior)
  {
    AppMethodBeat.i(78639);
    synchronized (this.lock)
    {
      if (paramIMBehavior.opType == b.a.fRf.value)
      {
        this.fQZ.oplist_.add(paramIMBehavior);
        AppMethodBeat.o(78639);
        return;
      }
      Iterator localIterator = this.fQZ.oplist_.iterator();
      label180: 
      while (true)
      {
        if (!localIterator.hasNext())
          break label182;
        IMBehavior localIMBehavior = (IMBehavior)localIterator.next();
        if (localIMBehavior.opType == b.a.fRg.value)
        {
          IMBehaviorMsgOP localIMBehaviorMsgOP1 = localIMBehavior.msgOp;
          IMBehaviorMsgOP localIMBehaviorMsgOP2 = paramIMBehavior.msgOp;
          if ((localIMBehaviorMsgOP1.msgOpType == localIMBehaviorMsgOP2.msgOpType) && (localIMBehaviorMsgOP1.msgType == localIMBehaviorMsgOP2.msgType) && (localIMBehaviorMsgOP1.appMsgInnerType == localIMBehaviorMsgOP2.appMsgInnerType));
          for (int i = 1; ; i = 0)
          {
            if (i == 0)
              break label180;
            paramIMBehavior = localIMBehavior.msgOp;
            paramIMBehavior.count += 1;
            AppMethodBeat.o(78639);
            break;
          }
        }
      }
      label182: this.fQZ.oplist_.add(paramIMBehavior);
      AppMethodBeat.o(78639);
    }
  }

  private String ajZ()
  {
    AppMethodBeat.i(78652);
    Object localObject1;
    if (this.fQZ == null)
    {
      localObject1 = "";
      AppMethodBeat.o(78652);
    }
    while (true)
    {
      return localObject1;
      localObject1 = ",";
      Object localObject3 = new LinkedList();
      while (true)
      {
        Object localObject5;
        synchronized (this.lock)
        {
          ((LinkedList)localObject3).addAll(this.fQZ.oplist_);
          Iterator localIterator = ((LinkedList)localObject3).iterator();
          int i = 1;
          if (!localIterator.hasNext())
            break;
          localObject5 = (IMBehavior)localIterator.next();
          ??? = localObject1;
          if (i == 0)
            ??? = (String)localObject1 + "|";
          localObject1 = (String)??? + ((IMBehavior)localObject5).opType + "#";
          if (((IMBehavior)localObject5).opType == 1)
          {
            StringBuilder localStringBuilder = new StringBuilder().append((String)localObject1);
            localObject5 = ((IMBehavior)localObject5).chattingOp;
            localObject1 = "";
            if (((IMBehaviorChattingOP)localObject5).changeUnread != 0)
              localObject1 = "" + "changeUnread=" + ((IMBehaviorChattingOP)localObject5).changeUnread;
            ??? = localObject1;
            if (((IMBehaviorChattingOP)localObject5).changeTop != 0)
              ??? = (String)localObject1 + "changeTop=" + ((IMBehaviorChattingOP)localObject5).changeTop;
            localObject1 = ???;
            if (((IMBehaviorChattingOP)localObject5).changeNotifyStatus != 0)
              localObject1 = (String)??? + "changeNotifyStatus=" + ((IMBehaviorChattingOP)localObject5).changeNotifyStatus;
            ??? = localObject1;
            if (((IMBehaviorChattingOP)localObject5).changeSaveAddress != 0)
              ??? = (String)localObject1 + "changeSaveAddress=" + ((IMBehaviorChattingOP)localObject5).changeSaveAddress;
            localObject1 = ???;
            localObject3 = localStringBuilder;
            if (((IMBehaviorChattingOP)localObject5).expose != 0)
            {
              localObject1 = (String)??? + "expose=" + ((IMBehaviorChattingOP)localObject5).expose;
              localObject3 = localStringBuilder;
            }
            localObject1 = (String)localObject1;
            i = 0;
          }
        }
        localObject3 = new StringBuilder().append(str);
        localObject2 = ((IMBehavior)localObject5).msgOp;
        if (((IMBehaviorMsgOP)localObject2).msgType == 49)
          localObject2 = String.format(Locale.US, "msgType=%d&msgOpType=%d&appMsgInnerType=%d&count=%d", new Object[] { Integer.valueOf(((IMBehaviorMsgOP)localObject2).msgType), Integer.valueOf(((IMBehaviorMsgOP)localObject2).msgOpType), Integer.valueOf(((IMBehaviorMsgOP)localObject2).appMsgInnerType), Integer.valueOf(((IMBehaviorMsgOP)localObject2).count) });
        else
          localObject2 = String.format(Locale.US, "msgType=%d&msgOpType=%d&count=%d", new Object[] { Integer.valueOf(((IMBehaviorMsgOP)localObject2).msgType), Integer.valueOf(((IMBehaviorMsgOP)localObject2).msgOpType), Integer.valueOf(((IMBehaviorMsgOP)localObject2).count) });
      }
      Object localObject2 = (String)localObject2 + "," + this.fQZ.currChatName_;
      AppMethodBeat.o(78652);
    }
  }

  private void akb()
  {
    AppMethodBeat.i(78654);
    if (this.hasInit)
      AppMethodBeat.o(78654);
    while (true)
    {
      return;
      this.hasInit = true;
      if (!g.RK())
      {
        ab.w("MicroMsg.ChattingOperationUitl", "account has not ready");
        AppMethodBeat.o(78654);
      }
      else
      {
        com.tencent.mm.storage.c localc = com.tencent.mm.model.c.c.abi().ll("100148");
        if (localc.isValid())
          this.fRb = bo.getInt((String)localc.dru().get("needUploadData"), 1);
        localc = com.tencent.mm.model.c.c.abi().ll("100149");
        if (localc.isValid())
          this.fRc = bo.getInt((String)localc.dru().get("needUploadData"), 1);
        AppMethodBeat.o(78654);
      }
    }
  }

  public final void D(bi parambi)
  {
    AppMethodBeat.i(78644);
    if (!aka())
      AppMethodBeat.o(78644);
    while (true)
    {
      return;
      a(parambi, b.b.fRm, 0);
      AppMethodBeat.o(78644);
    }
  }

  public final void E(bi parambi)
  {
    AppMethodBeat.i(78646);
    if (!aka())
      AppMethodBeat.o(78646);
    while (true)
    {
      return;
      a(parambi, b.b.fRo, 0);
      AppMethodBeat.o(78646);
    }
  }

  public final void F(bi parambi)
  {
    AppMethodBeat.i(78647);
    if (!aka())
      AppMethodBeat.o(78647);
    while (true)
    {
      return;
      a(parambi, b.b.fRk, 0);
      AppMethodBeat.o(78647);
    }
  }

  public final void G(bi parambi)
  {
    AppMethodBeat.i(78648);
    if (!aka())
      AppMethodBeat.o(78648);
    while (true)
    {
      return;
      a(parambi, b.b.fRp, 0);
      AppMethodBeat.o(78648);
    }
  }

  public final void H(bi parambi)
  {
    AppMethodBeat.i(78650);
    if (!aka())
      AppMethodBeat.o(78650);
    while (true)
    {
      return;
      a(parambi, b.b.fRt, 0);
      AppMethodBeat.o(78650);
    }
  }

  public final void IF()
  {
    AppMethodBeat.i(78635);
    if (!aka())
      AppMethodBeat.o(78635);
    while (true)
    {
      return;
      synchronized (this.lock)
      {
        if ((this.fQZ != null) && (!this.fQZ.oplist_.isEmpty()))
        {
          i = 1;
          if (i != 0)
          {
            if (this.fRc != 0)
            {
              ab.i("MicroMsg.ChattingOperationUitl", "report imOperation(13835)");
              h.pYm.c(13835, this.fQZ);
            }
            if (this.fRb != 0)
            {
              String str = ajZ();
              ab.i("MicroMsg.ChattingOperationUitl", "report imOperation(13748) reportStr:%s", new Object[] { str });
              h.pYm.X(13748, str);
            }
          }
          this.fQZ = null;
          AppMethodBeat.o(78635);
          continue;
        }
        int i = 0;
      }
    }
  }

  public final void Q(String arg1, boolean paramBoolean)
  {
    int i = 1;
    AppMethodBeat.i(78636);
    if (!aka())
      AppMethodBeat.o(78636);
    while (true)
    {
      return;
      IMBehavior localIMBehavior = new IMBehavior();
      localIMBehavior.opType = 1;
      localIMBehavior.chattingOp = new IMBehaviorChattingOP();
      IMBehaviorChattingOP localIMBehaviorChattingOP = localIMBehavior.chattingOp;
      if (paramBoolean);
      while (true)
      {
        localIMBehaviorChattingOP.changeUnread = i;
        IF();
        if (cM(???))
          break label92;
        AppMethodBeat.o(78636);
        break;
        i = 2;
      }
      label92: synchronized (this.lock)
      {
        this.fQZ.oplist_.add(localIMBehavior);
        IF();
        AppMethodBeat.o(78636);
      }
    }
  }

  public final void R(String arg1, boolean paramBoolean)
  {
    int i = 1;
    AppMethodBeat.i(78638);
    if (!aka())
      AppMethodBeat.o(78638);
    while (true)
    {
      return;
      if (!cM(???))
      {
        AppMethodBeat.o(78638);
        continue;
      }
      IMBehavior localIMBehavior = new IMBehavior();
      localIMBehavior.opType = 1;
      localIMBehavior.chattingOp = new IMBehaviorChattingOP();
      ??? = localIMBehavior.chattingOp;
      if (paramBoolean)
        ???.changeSaveAddress = i;
      synchronized (this.lock)
      {
        this.fQZ.oplist_.add(localIMBehavior);
        AppMethodBeat.o(78638);
        continue;
        i = 2;
      }
    }
  }

  public final void a(bi parambi, int paramInt)
  {
    AppMethodBeat.i(78641);
    new ak(Looper.getMainLooper()).post(new b.2(this, parambi, paramInt));
    AppMethodBeat.o(78641);
  }

  public final void a(bi parambi, b.b paramb, int paramInt)
  {
    AppMethodBeat.i(78640);
    if ((parambi == null) || (!cM(parambi.field_talker)))
      AppMethodBeat.o(78640);
    while (true)
    {
      return;
      IMBehavior localIMBehavior = new IMBehavior();
      localIMBehavior.opType = 2;
      localIMBehavior.msgOp = new IMBehaviorMsgOP();
      localIMBehavior.msgOp.msgType = (parambi.getType() & 0xFFFF);
      if (parambi.bAA())
        localIMBehavior.msgOp.appMsgInnerType = paramInt;
      localIMBehavior.msgOp.msgOpType = paramb.value;
      localIMBehavior.msgOp.count = 1;
      a(localIMBehavior);
      AppMethodBeat.o(78640);
    }
  }

  public final void a(bi parambi, boolean paramBoolean)
  {
    AppMethodBeat.i(78649);
    if (!aka())
      AppMethodBeat.o(78649);
    while (true)
    {
      return;
      if (parambi.isText())
        break;
      AppMethodBeat.o(78649);
    }
    if (paramBoolean);
    for (b.b localb = b.b.fRq; ; localb = b.b.fRr)
    {
      a(parambi, localb, 0);
      AppMethodBeat.o(78649);
      break;
    }
  }

  public final void a(bi parambi, boolean paramBoolean, int paramInt)
  {
    AppMethodBeat.i(78651);
    if (!aka())
    {
      AppMethodBeat.o(78651);
      return;
    }
    if (paramBoolean);
    for (b.b localb = b.b.fRu; ; localb = b.b.fRv)
    {
      a(parambi, localb, paramInt);
      AppMethodBeat.o(78651);
      break;
    }
  }

  public final boolean aka()
  {
    AppMethodBeat.i(78653);
    akb();
    boolean bool;
    if ((this.fRb != 0) || (this.fRc != 0))
    {
      bool = true;
      AppMethodBeat.o(78653);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(78653);
    }
  }

  public final void b(bi parambi, int paramInt)
  {
    AppMethodBeat.i(78643);
    if (!aka())
      AppMethodBeat.o(78643);
    while (true)
    {
      return;
      a(parambi, b.b.fRm, paramInt);
      AppMethodBeat.o(78643);
    }
  }

  public final void c(bi parambi, int paramInt)
  {
    AppMethodBeat.i(78645);
    if (!aka())
      AppMethodBeat.o(78645);
    while (true)
    {
      return;
      a(parambi, b.b.fRo, paramInt);
      AppMethodBeat.o(78645);
    }
  }

  public final void c(boolean paramBoolean1, String arg2, boolean paramBoolean2)
  {
    int i = 1;
    AppMethodBeat.i(78637);
    if (!aka())
      AppMethodBeat.o(78637);
    while (true)
    {
      return;
      IMBehavior localIMBehavior = new IMBehavior();
      localIMBehavior.opType = 1;
      localIMBehavior.chattingOp = new IMBehaviorChattingOP();
      IMBehaviorChattingOP localIMBehaviorChattingOP = localIMBehavior.chattingOp;
      if (paramBoolean2);
      while (true)
      {
        localIMBehaviorChattingOP.changeTop = i;
        if (paramBoolean1)
          IF();
        if (cM(???))
          break label99;
        AppMethodBeat.o(78637);
        break;
        i = 2;
      }
      label99: synchronized (this.lock)
      {
        this.fQZ.oplist_.add(localIMBehavior);
        if (paramBoolean1)
          IF();
        AppMethodBeat.o(78637);
      }
    }
  }

  public final boolean cM(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(78634);
    if (bo.isNullOrNil(paramString))
    {
      String str = bo.dpG().toString();
      ab.e("MicroMsg.ChattingOperationUitl", "check error:%s", new Object[] { str });
      paramString = new log_13913();
      paramString.scene_ = 1;
      paramString.error_ = str;
      h.pYm.c(13913, paramString);
      AppMethodBeat.o(78634);
    }
    while (true)
    {
      return bool;
      if ((this.fQZ != null) && (this.fQZ.currChatName_ != null) && (!this.fQZ.currChatName_.equals(paramString)))
        IF();
      if (this.fQZ == null)
      {
        this.fQZ = new log_13835();
        this.fQZ.currChatName_ = paramString;
      }
      AppMethodBeat.o(78634);
      bool = true;
    }
  }

  public final void j(bi parambi)
  {
    AppMethodBeat.i(78642);
    new ak(Looper.getMainLooper()).post(new b.3(this, parambi));
    AppMethodBeat.o(78642);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelstat.b
 * JD-Core Version:    0.6.2
 */