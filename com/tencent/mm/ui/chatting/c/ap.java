package com.tencent.mm.ui.chatting.c;

import android.content.res.Resources;
import android.view.MenuItem;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.th;
import com.tencent.mm.g.a.ti;
import com.tencent.mm.g.a.ti.b;
import com.tencent.mm.g.a.tj;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.bf;
import com.tencent.mm.plugin.messenger.foundation.a.a.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.az;
import com.tencent.mm.storage.bi;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.MMFragment;
import com.tencent.mm.ui.chatting.BaseChattingUIFragment;
import com.tencent.mm.ui.chatting.c.b.ah;
import com.tencent.mm.ui.chatting.viewitems.ChattingItemTranslate.b;
import com.tencent.mm.ui.widget.a.c.a;
import java.util.HashMap;

@com.tencent.mm.ui.chatting.c.a.a(dFp=ah.class)
public class ap extends a
  implements ah
{
  private az ySV;
  private HashMap<Long, ChattingItemTranslate.b> ySW;
  private com.tencent.mm.sdk.b.c ySX;

  public ap()
  {
    AppMethodBeat.i(31829);
    this.ySV = new az(5, "msg-translate-update-worker");
    this.ySW = new HashMap();
    this.ySX = new com.tencent.mm.sdk.b.c()
    {
    };
    AppMethodBeat.o(31829);
  }

  private void d(bi parambi, boolean paramBoolean)
  {
    AppMethodBeat.i(31835);
    if ((parambi.dtF()) && (!paramBoolean))
      if (parambi.dtM())
      {
        parambi.dtO();
        a(parambi.field_msgId, ChattingItemTranslate.b.zhg);
        com.tencent.mm.modelstat.b.fRa.a(parambi, false);
        aw.ZK();
        com.tencent.mm.model.c.XO().a(parambi.field_msgId, parambi);
        this.cgL.aWv();
        AppMethodBeat.o(31835);
      }
    while (true)
    {
      return;
      parambi.dtN();
      a(parambi.field_msgId, ChattingItemTranslate.b.zhj);
      com.tencent.mm.modelstat.b.fRa.a(parambi, true);
      break;
      if (bl(parambi) != ChattingItemTranslate.b.zhi)
        break label124;
      AppMethodBeat.o(31835);
    }
    label124: th localth = new th();
    localth.cPy.cPA = false;
    localth.cPy.id = parambi.field_msgId;
    localth.cPy.cPz = parambi.field_content;
    localth.cPy.cPB = parambi.dJG;
    if ((!this.cgL.dFx()) || (parambi.field_isSend == 1));
    for (localth.cPy.type = 0; ; localth.cPy.type = 1)
    {
      localth.cPy.source = this.cgL.getTalkerUserName();
      com.tencent.mm.sdk.b.a.xxA.m(localth);
      a(parambi.field_msgId, ChattingItemTranslate.b.zhi);
      break;
    }
  }

  private void dDi()
  {
    AppMethodBeat.i(31830);
    com.tencent.mm.sdk.b.a.xxA.d(this.ySX);
    AppMethodBeat.o(31830);
  }

  public final void a(long paramLong, ChattingItemTranslate.b paramb)
  {
    AppMethodBeat.i(31831);
    this.ySW.put(Long.valueOf(paramLong), paramb);
    AppMethodBeat.o(31831);
  }

  public final boolean b(MenuItem paramMenuItem, bi parambi)
  {
    boolean bool1 = true;
    AppMethodBeat.i(31833);
    int i = paramMenuItem.getItemId();
    boolean bool2;
    switch (i)
    {
    default:
      AppMethodBeat.o(31833);
      bool2 = false;
      return bool2;
    case 124:
    case 125:
    }
    ab.d("MicroMsg.ChattingUI.TranslateComponent", "longclick transalte type: %d isShowTranslated: %s", new Object[] { Integer.valueOf(parambi.getType()), Boolean.valueOf(parambi.dtM()) });
    int j;
    if (i == 124)
    {
      aw.ZK();
      if (!((Boolean)com.tencent.mm.model.c.Ry().get(327712, Boolean.FALSE)).booleanValue())
      {
        j = 2131298258;
        aw.ZK();
        com.tencent.mm.model.c.Ry().set(327712, Boolean.TRUE);
      }
    }
    while (true)
    {
      if (j != 0)
      {
        c.a locala = new c.a(this.cgL.yTx.getContext());
        locala.asE(this.cgL.yTx.getMMResources().getString(j));
        locala.asD(this.cgL.yTx.getMMResources().getString(2131298259));
        locala.Qc(2131300601).a(new ap.3(this, parambi, paramMenuItem, i));
        locala.aMb().show();
        AppMethodBeat.o(31833);
        bool2 = bool1;
        break;
        if (i != 125)
          break label336;
        aw.ZK();
        if (((Boolean)com.tencent.mm.model.c.Ry().get(327713, Boolean.FALSE)).booleanValue())
          break label336;
        j = 2131298218;
        aw.ZK();
        com.tencent.mm.model.c.Ry().set(327713, Boolean.TRUE);
        continue;
      }
      paramMenuItem.getGroupId();
      if (i == 125);
      for (bool2 = true; ; bool2 = false)
      {
        d(parambi, bool2);
        break;
      }
      label336: j = 0;
    }
  }

  public final ChattingItemTranslate.b bl(bi parambi)
  {
    AppMethodBeat.i(31832);
    ChattingItemTranslate.b localb = (ChattingItemTranslate.b)this.ySW.get(Long.valueOf(parambi.field_msgId));
    Object localObject = localb;
    if (localb == null)
    {
      if (!parambi.dtF())
        break label63;
      if (!parambi.dtM())
        break label56;
      localObject = ChattingItemTranslate.b.zhj;
    }
    while (true)
    {
      AppMethodBeat.o(31832);
      return localObject;
      label56: localObject = ChattingItemTranslate.b.zhg;
      continue;
      label63: localObject = new ti();
      ((ti)localObject).cPC.id = parambi.field_msgId;
      com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject);
      if (((ti)localObject).cPD.cPE)
      {
        localObject = ChattingItemTranslate.b.zhi;
        a(parambi.field_msgId, (ChattingItemTranslate.b)localObject);
      }
      else
      {
        localObject = ChattingItemTranslate.b.zhg;
      }
    }
  }

  public final String bm(bi parambi)
  {
    AppMethodBeat.i(31834);
    String str = parambi.field_content;
    int i = parambi.field_isSend;
    parambi = str;
    if (this.cgL.dFw())
    {
      parambi = str;
      if (str != null)
      {
        parambi = str;
        if (i == 0)
          parambi = bf.oz(str);
      }
    }
    AppMethodBeat.o(31834);
    return parambi;
  }

  public final void dDh()
  {
    AppMethodBeat.i(31838);
    super.dDh();
    dDi();
    AppMethodBeat.o(31838);
  }

  public final void dxC()
  {
    AppMethodBeat.i(31837);
    dDi();
    AppMethodBeat.o(31837);
  }

  public final void dxz()
  {
    AppMethodBeat.i(31836);
    this.ySW.clear();
    com.tencent.mm.sdk.b.a.xxA.c(this.ySX);
    AppMethodBeat.o(31836);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.c.ap
 * JD-Core Version:    0.6.2
 */