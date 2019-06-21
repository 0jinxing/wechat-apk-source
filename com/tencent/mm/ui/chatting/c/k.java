package com.tencent.mm.ui.chatting.c;

import android.text.TextUtils;
import android.widget.AbsListView;
import com.tencent.mars.smc.IDKey;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aj.f;
import com.tencent.mm.booter.x;
import com.tencent.mm.g.a.av;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.bf;
import com.tencent.mm.model.r;
import com.tencent.mm.model.t;
import com.tencent.mm.platformtools.ah;
import com.tencent.mm.plugin.messenger.a.e.c;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bi;
import com.tencent.mm.ui.chatting.ChattingUI;
import com.tencent.mm.ui.chatting.c.b.aj;
import com.tencent.mm.ui.chatting.c.b.s;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

@com.tencent.mm.ui.chatting.c.a.a(dFp=com.tencent.mm.ui.chatting.c.b.j.class)
public class k extends a
  implements com.tencent.mm.ui.chatting.c.b.j
{
  private static String yPc = "100134";
  private long jEg;
  private HashSet<Long> yOW;
  private int yOX;
  private HashSet<Long> yOY;
  private HashSet<Long> yOZ;
  private boolean yOx;
  private int yPa;
  private boolean yPb;
  private e.c yPd;
  private long yPe;
  private boolean yPf;
  private String yPg;
  private long yPh;
  private int yPi;

  public k()
  {
    AppMethodBeat.i(31351);
    this.yOW = new HashSet();
    this.yOY = new HashSet();
    this.yOZ = new HashSet();
    this.yPa = 0;
    this.yPb = false;
    this.yPd = new k.5(this);
    this.yPe = 0L;
    this.yPf = false;
    this.yPg = null;
    this.jEg = 0L;
    this.yPh = 0L;
    this.yPi = 0;
    this.yOx = false;
    AppMethodBeat.o(31351);
  }

  private void IF()
  {
    AppMethodBeat.i(31361);
    this.yPg = null;
    if ((!r.Yz().equals(this.cgL.getTalkerUserName())) && (this.cgL.dFw()))
    {
      this.yPg = this.cgL.getTalkerUserName();
      this.jEg = (bf.aaa() / 1000L * 1000L);
      this.yPi = 0;
      String str = this.yPg;
      aw.RS().aa(new k.6(this, str));
    }
    dDR();
    AppMethodBeat.o(31361);
  }

  private void dDQ()
  {
    AppMethodBeat.i(31355);
    x.ecN.jL(this.cgL.getTalkerUserName());
    com.tencent.mm.modelstat.b.fRa.IF();
    av localav = new av();
    localav.ctX.ctY = false;
    com.tencent.mm.sdk.b.a.xxA.m(localav);
    ((com.tencent.mm.plugin.messenger.a.e)g.K(com.tencent.mm.plugin.messenger.a.e.class)).b("tmpl_type_succeed_contact", this.yPd);
    AppMethodBeat.o(31355);
  }

  private void dDR()
  {
    int i = 0;
    AppMethodBeat.i(31356);
    h localh;
    if (this.yPf)
    {
      long l1 = System.currentTimeMillis();
      long l2 = this.yPe;
      this.yPe = 0L;
      this.yPf = false;
      localh = h.pYm;
      if (i >= 8)
        break label145;
      if (l1 - l2 >= new long[] { 0L, 200L, 400L, 600L, 800L, 1000L, 1500L, 2000L }[i])
        break label127;
    }
    label145: 
    while (true)
    {
      localh.a(109L, i, 1L, true);
      AppMethodBeat.o(31356);
      return;
      label127: if (i == 7)
      {
        i = 8;
      }
      else
      {
        i++;
        break;
        i = -1;
      }
    }
  }

  public final void Oz(int paramInt)
  {
    this.yOX = paramInt;
  }

  public final void be(bi parambi)
  {
    AppMethodBeat.i(31352);
    if (!this.yOW.contains(Long.valueOf(parambi.field_msgSvrId)))
    {
      this.yOW.add(Long.valueOf(parambi.field_msgSvrId));
      com.tencent.mm.sdk.g.d.post(new k.1(this, parambi), "ChattingUI.adVideoExposeReport");
    }
    AppMethodBeat.o(31352);
  }

  public final void bf(bi parambi)
  {
    AppMethodBeat.i(31353);
    if (this.yOY.contains(Long.valueOf(parambi.field_msgSvrId)))
      AppMethodBeat.o(31353);
    while (true)
    {
      return;
      this.yOY.add(Long.valueOf(parambi.field_msgSvrId));
      com.tencent.mm.sdk.g.d.post(new k.2(this, parambi), "ChattingUI.expExposeReport");
      AppMethodBeat.o(31353);
    }
  }

  public final void bg(bi parambi)
  {
    AppMethodBeat.i(31354);
    if (!this.yPb)
    {
      this.yPb = true;
      com.tencent.mm.storage.c localc = com.tencent.mm.model.c.c.abi().ll(yPc);
      if (localc.isValid())
        this.yPa = ah.getInt((String)localc.dru().get("needUploadData"), 0);
    }
    if (this.yPa == 0)
      AppMethodBeat.o(31354);
    while (true)
    {
      return;
      if (this.yOZ.contains(Long.valueOf(parambi.field_msgSvrId)))
      {
        AppMethodBeat.o(31354);
      }
      else
      {
        com.tencent.mm.sdk.g.d.post(new k.3(this, parambi), "ChattingUI.appExposeReport");
        AppMethodBeat.o(31354);
      }
    }
  }

  public final void dDh()
  {
    AppMethodBeat.i(31364);
    super.dDh();
    dDQ();
    AppMethodBeat.o(31364);
  }

  public final void dxA()
  {
    AppMethodBeat.i(31360);
    if (!this.yOx)
      IF();
    this.yOx = false;
    AppMethodBeat.o(31360);
  }

  public final void dxB()
  {
    AppMethodBeat.i(31362);
    if ((!TextUtils.isEmpty(this.yPg)) && (this.cgL.dFw()))
    {
      this.yPh = bf.aaa();
      String str = this.yPg;
      this.yPg = "";
      int i = ((s)this.cgL.aF(s.class)).dEC();
      if (i == 2)
        ((s)this.cgL.aF(s.class)).dEB();
      int j = 0;
      int k = j;
      if (this.cgL.dFw())
      {
        k = j;
        if (this.cgL.sRl.dua == 0)
          k = 1;
      }
      aw.RS().aa(new k.7(this, str, i, k));
    }
    AppMethodBeat.o(31362);
  }

  public final void dxC()
  {
    AppMethodBeat.i(31363);
    dDQ();
    boolean bool1 = ((com.tencent.mm.plugin.messenger.foundation.a.j)g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).bOm().QL(this.cgL.getTalkerUserName());
    Object localObject1 = com.tencent.mm.ui.chatting.j.a.yZE;
    boolean bool2 = this.cgL.dFx();
    Object localObject2 = new ArrayList();
    if ((bool2) && (!bool1))
    {
      if (localObject1.yZF[0] > 0)
        ((ArrayList)localObject2).add(new IDKey(890, 0, localObject1.yZF[0]));
      if (localObject1.yZF[1] > 0)
        ((ArrayList)localObject2).add(new IDKey(890, 1, localObject1.yZF[1]));
      if (localObject1.yZF[2] > 0)
        ((ArrayList)localObject2).add(new IDKey(890, 2, localObject1.yZF[2]));
      if (localObject1.yZF[3] > 0)
        ((ArrayList)localObject2).add(new IDKey(890, 3, localObject1.yZF[3]));
      if (localObject1.yZF[4] > 0)
        ((ArrayList)localObject2).add(new IDKey(890, 4, localObject1.yZF[4]));
      ((ArrayList)localObject2).add(new IDKey(890, 19, 1));
    }
    while (true)
    {
      com.tencent.mm.plugin.report.e.pXa.b((ArrayList)localObject2, true);
      localObject2 = com.tencent.mm.ui.chatting.j.b.yZH;
      ab.i("MicroMsg.GetChatroomReporter", "[report] chatroomId:%s mCount:%s mDownCount:%s mUpCount:%s mErrCount:%s mSuccessCount:%s mFetchCount:%s", new Object[] { this.cgL.getTalkerUserName(), Integer.valueOf(((com.tencent.mm.ui.chatting.j.b)localObject2).mCount), Integer.valueOf(((com.tencent.mm.ui.chatting.j.b)localObject2).yZI), Integer.valueOf(((com.tencent.mm.ui.chatting.j.b)localObject2).yZJ), Integer.valueOf(((com.tencent.mm.ui.chatting.j.b)localObject2).tVN), Integer.valueOf(((com.tencent.mm.ui.chatting.j.b)localObject2).mSuccessCount), Integer.valueOf(((com.tencent.mm.ui.chatting.j.b)localObject2).yZK) });
      com.tencent.mm.plugin.report.e.pXa.a(403L, 60L, ((com.tencent.mm.ui.chatting.j.b)localObject2).mCount, true);
      com.tencent.mm.plugin.report.e.pXa.a(403L, 61L, ((com.tencent.mm.ui.chatting.j.b)localObject2).yZI, true);
      com.tencent.mm.plugin.report.e.pXa.a(403L, 62L, ((com.tencent.mm.ui.chatting.j.b)localObject2).yZJ, true);
      com.tencent.mm.plugin.report.e.pXa.a(403L, 63L, ((com.tencent.mm.ui.chatting.j.b)localObject2).tVN, true);
      localObject1 = new ArrayList();
      ((ArrayList)localObject1).add(new IDKey(403, 64, ((com.tencent.mm.ui.chatting.j.b)localObject2).mSuccessCount));
      ((ArrayList)localObject1).add(new IDKey(403, 65, ((com.tencent.mm.ui.chatting.j.b)localObject2).yZK));
      com.tencent.mm.plugin.report.e.pXa.b((ArrayList)localObject1, true);
      AppMethodBeat.o(31363);
      return;
      if ((bool2) && (bool1))
      {
        if (localObject1.yZF[0] > 0)
          ((ArrayList)localObject2).add(new IDKey(890, 40, localObject1.yZF[0]));
        if (localObject1.yZF[1] > 0)
          ((ArrayList)localObject2).add(new IDKey(890, 41, localObject1.yZF[1]));
        if (localObject1.yZF[2] > 0)
          ((ArrayList)localObject2).add(new IDKey(890, 42, localObject1.yZF[2]));
        if (localObject1.yZF[3] > 0)
          ((ArrayList)localObject2).add(new IDKey(890, 43, localObject1.yZF[3]));
        if (localObject1.yZF[4] > 0)
          ((ArrayList)localObject2).add(new IDKey(890, 44, localObject1.yZF[4]));
        ((ArrayList)localObject2).add(new IDKey(890, 59, 1));
      }
      else
      {
        if (localObject1.yZF[0] > 0)
          ((ArrayList)localObject2).add(new IDKey(890, 20, localObject1.yZF[0]));
        if (localObject1.yZF[1] > 0)
          ((ArrayList)localObject2).add(new IDKey(890, 21, localObject1.yZF[1]));
        if (localObject1.yZF[2] > 0)
          ((ArrayList)localObject2).add(new IDKey(890, 22, localObject1.yZF[2]));
        if (localObject1.yZF[3] > 0)
          ((ArrayList)localObject2).add(new IDKey(890, 23, localObject1.yZF[3]));
        if (localObject1.yZF[4] > 0)
          ((ArrayList)localObject2).add(new IDKey(890, 24, localObject1.yZF[4]));
        ((ArrayList)localObject2).add(new IDKey(890, 39, 1));
      }
    }
  }

  public final void dxx()
  {
    AppMethodBeat.i(31358);
    if (bo.isNullOrNil(this.cgL.getTalkerUserName()))
      h.pYm.a(110L, 0L, 1L, true);
    AppMethodBeat.o(31358);
  }

  public final void dxy()
  {
    int i = 0;
    AppMethodBeat.i(31359);
    this.yPe = System.currentTimeMillis();
    this.yPf = true;
    if ((this.cgL.sRl == null) || (this.cgL.getTalkerUserName() == null))
    {
      this.yOx = true;
      IF();
      AppMethodBeat.o(31359);
      return;
    }
    com.tencent.mm.modelstat.b.fRa.cM(this.cgL.getTalkerUserName());
    Object localObject;
    if (!r.Yz().equals(this.cgL.getTalkerUserName()))
    {
      localObject = new av();
      ((av)localObject).ctX.ctY = true;
      com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject);
    }
    boolean bool = ((aj)this.cgL.aF(aj.class)).DX();
    int j;
    int k;
    if ("notification_messages".equals(this.cgL.getTalkerUserName()))
    {
      j = 1;
      k = 8;
      label152: if (!this.cgL.dFv())
        break label455;
      k = i;
    }
    while (true)
    {
      if (k != 0)
        com.tencent.mm.sdk.g.d.xDG.b(new k.4(this, k, j), "MicroMsg.ChattingUI.ChattingReportComponent");
      ((com.tencent.mm.plugin.messenger.a.e)g.K(com.tencent.mm.plugin.messenger.a.e.class)).a("tmpl_type_succeed_contact", this.yPd);
      break;
      if (t.mZ(this.cgL.getTalkerUserName()))
      {
        localObject = (com.tencent.mm.ui.chatting.c.b.d)this.cgL.aF(com.tencent.mm.ui.chatting.c.b.d.class);
        if (((com.tencent.mm.ui.chatting.c.b.d)localObject).dDm())
        {
          if (bool);
          for (k = 0; ; k = 1)
          {
            if (!((com.tencent.mm.ui.chatting.c.b.d)localObject).dDn())
              break label303;
            ((com.tencent.mm.ui.chatting.c.b.d)localObject).dDk().afg().size();
            m = 5;
            j = k;
            k = m;
            break;
          }
          label303: m = 4;
          j = k;
          k = m;
          break label152;
        }
        if (f.rb(this.cgL.getTalkerUserName()))
        {
          if (bool);
          for (j = 0; ; j = 1)
          {
            k = 3;
            break;
          }
        }
        if (f.rc(this.cgL.getTalkerUserName()))
        {
          j = 1;
          k = 0;
          break label152;
        }
        if (f.qY(this.cgL.getTalkerUserName()))
        {
          k = 6;
          j = 0;
        }
      }
      while (true)
      {
        break;
        k = 7;
        j = 0;
        continue;
        if (this.cgL.dFw())
        {
          if (bool);
          for (j = 0; ; j = 1)
          {
            k = 2;
            break;
          }
        }
        if (bool)
        {
          j = 0;
          k = 1;
        }
        else
        {
          j = 1;
          k = 1;
        }
      }
      label455: localObject = t.fkY;
      int m = localObject.length;
      for (i = 0; i < m; i++)
        if (localObject[i].equals(this.cgL.getTalkerUserName()))
          k = 0;
    }
  }

  public final void dxz()
  {
  }

  public final void onScrollStateChanged(AbsListView paramAbsListView, int paramInt)
  {
    AppMethodBeat.i(31357);
    super.onScrollStateChanged(paramAbsListView, paramInt);
    if (paramInt == 2)
      com.tencent.mm.cf.d.dvV().ev(ChattingUI.class.getName() + ".Listview", 4);
    AppMethodBeat.o(31357);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.c.k
 * JD-Core Version:    0.6.2
 */