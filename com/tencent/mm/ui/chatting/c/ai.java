package com.tencent.mm.ui.chatting.c;

import android.app.Activity;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.g.a.by;
import com.tencent.mm.g.a.by.b;
import com.tencent.mm.hardcoder.WXHardCoderJNI;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.aw;
import com.tencent.mm.plugin.notification.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.chatting.BaseChattingUIFragment;
import com.tencent.mm.ui.chatting.ChattingAnimFrame;
import com.tencent.mm.ui.chatting.aa;
import com.tencent.mm.ui.chatting.c.b.ad;
import com.tencent.mm.ui.chatting.c.b.v;
import com.tencent.mm.ui.chatting.x;
import java.util.List;

@com.tencent.mm.ui.chatting.c.a.a(dFp=ad.class)
public class ai extends a
  implements f, ad
{
  private boolean yOx = false;
  private x yRR;
  private int yRS;

  private void djt()
  {
    AppMethodBeat.i(31682);
    if (this.yRR != null)
    {
      Object localObject = this.yRR;
      if (((x)localObject).yLx != null)
      {
        localObject = ((x)localObject).yLx;
        ((aa)localObject).mHandler.removeMessages(0);
        if (((aa)localObject).yLy != null)
          ((aa)localObject).yLy.stop();
        ab.d("MicroMsg.EggMgr", "egg has been stop");
      }
    }
    WXHardCoderJNI.stopPerformance(WXHardCoderJNI.hcSendMsgEnable, this.yRS);
    this.yRS = 0;
    AppMethodBeat.o(31682);
  }

  private boolean eB(String paramString, int paramInt)
  {
    int i = 0;
    boolean bool = false;
    AppMethodBeat.i(31684);
    paramString = bo.anz(paramString);
    if ((paramString == null) || (paramString.length() == 0))
    {
      ab.e("MicroMsg.ChattingUI.SendTextComponent", "doSendMessage null");
      AppMethodBeat.o(31684);
    }
    while (true)
    {
      return bool;
      this.yRR.ard(paramString);
      by localby = new by();
      localby.cvf.cvh = paramString;
      localby.cvf.context = this.cgL.yTx.getContext();
      localby.cvf.username = this.cgL.getTalkerUserName();
      com.tencent.mm.sdk.b.a.xxA.m(localby);
      if (localby.cvg.cvi)
      {
        AppMethodBeat.o(31684);
        bool = true;
      }
      else
      {
        bool = WXHardCoderJNI.hcSendMsgEnable;
        int j = WXHardCoderJNI.hcSendMsgDelay;
        int k = WXHardCoderJNI.hcSendMsgCPU;
        int m = WXHardCoderJNI.hcSendMsgIO;
        if (WXHardCoderJNI.hcSendMsgThr)
          i = g.RS().doL();
        this.yRS = WXHardCoderJNI.startPerformance(bool, j, k, m, i, WXHardCoderJNI.hcSendMsgTimeout, 202, WXHardCoderJNI.hcSendMsgAction, "MicroMsg.ChattingUI.SendTextComponent");
        com.tencent.mm.ui.chatting.d.a.dFz().post(new ai.1(this, paramString, paramInt));
        this.cgL.qp(true);
        AppMethodBeat.o(31684);
        bool = true;
      }
    }
  }

  public final void a(com.tencent.mm.ui.chatting.d.a parama)
  {
    AppMethodBeat.i(31685);
    super.a(parama);
    this.yRR = new x(this.cgL);
    AppMethodBeat.o(31685);
  }

  public final boolean arq(String paramString)
  {
    AppMethodBeat.i(31683);
    boolean bool = eB(paramString, 0);
    AppMethodBeat.o(31683);
    return bool;
  }

  public final void dDh()
  {
    AppMethodBeat.i(31692);
    super.dDh();
    aw.Rg().b(522, this);
    djt();
    AppMethodBeat.o(31692);
  }

  public final void dxA()
  {
    AppMethodBeat.i(31689);
    if (!this.yOx)
      d.a(this.yRR);
    this.yOx = false;
    AppMethodBeat.o(31689);
  }

  public final void dxB()
  {
    AppMethodBeat.i(31690);
    d.b(this.yRR);
    AppMethodBeat.o(31690);
  }

  public final void dxC()
  {
    AppMethodBeat.i(31691);
    aw.Rg().b(522, this);
    djt();
    AppMethodBeat.o(31691);
  }

  public final void dxy()
  {
    AppMethodBeat.i(31687);
    d.a(this.yRR);
    this.yOx = true;
    AppMethodBeat.o(31687);
  }

  public final void dxz()
  {
    AppMethodBeat.i(31688);
    aw.Rg().a(522, this);
    List localList = ((v)this.cgL.aF(v.class)).dEK();
    if (localList != null)
    {
      Object localObject = this.yRR;
      if ((((x)localObject).yLx != null) && (((x)localObject).cgL != null))
      {
        aa localaa = ((x)localObject).yLx;
        localObject = ((x)localObject).cgL.yTx.getContext();
        localaa.kbM = localList;
        localaa.yLz = ((Activity)localObject);
        if (localaa.mHandler != null)
          localaa.mHandler.sendEmptyMessageDelayed(0, 300L);
      }
    }
    AppMethodBeat.o(31688);
  }

  public final void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(31686);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    switch (paramInt1)
    {
    default:
    case 207:
    }
    while (true)
    {
      AppMethodBeat.o(31686);
      return;
      eB(paramIntent.getStringExtra("art_smiley_slelct_data"), 4);
    }
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(31693);
    if (this.cgL != null)
      this.cgL.dismissDialog();
    if (522 == paramm.getType())
    {
      WXHardCoderJNI.stopPerformance(WXHardCoderJNI.hcSendMsgEnable, this.yRS);
      this.yRS = 0;
    }
    AppMethodBeat.o(31693);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.c.ai
 * JD-Core Version:    0.6.2
 */