package com.tencent.mm.ui.chatting.c;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.Looper;
import android.view.Display;
import android.view.KeyEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.aj.a.j;
import com.tencent.mm.aj.d.b;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.model.ae;
import com.tencent.mm.model.ao.a;
import com.tencent.mm.model.ao.d;
import com.tencent.mm.model.ao.f;
import com.tencent.mm.model.aw;
import com.tencent.mm.pluginsdk.ui.chat.ChatFooter.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ay;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bi;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.LauncherUI;
import com.tencent.mm.ui.MMFragment;
import com.tencent.mm.ui.chatting.BaseChattingUIFragment;
import com.tencent.mm.ui.chatting.ak;
import com.tencent.mm.ui.chatting.c.b.aj;
import com.tencent.mm.ui.chatting.c.b.o;
import com.tencent.mm.ui.u;
import com.tencent.mm.ui.u.a;
import org.json.JSONObject;

@com.tencent.mm.ui.chatting.c.a.a(dFp=aj.class)
public class as extends a
  implements com.tencent.mm.ai.f, aj
{
  public boolean mfQ;
  private ao.d svH;
  private com.tencent.mm.ui.chatting.d yTf;
  private View yTg;
  public ChatFooter.d yTh;

  public as()
  {
    AppMethodBeat.i(31868);
    this.yTf = null;
    this.mfQ = false;
    this.svH = new as.1(this);
    this.yTg = null;
    this.yTh = new as.2(this);
    AppMethodBeat.o(31868);
  }

  private boolean d(int paramInt, KeyEvent paramKeyEvent)
  {
    boolean bool = false;
    int i = 0;
    int j = 0;
    AppMethodBeat.i(31869);
    if ((paramInt == 25) && (this.yTf != null) && (this.yTf.isPlaying()) && ((this.mfQ) || (!this.yTf.mfP)))
    {
      if (paramKeyEvent.getAction() == 0)
      {
        paramInt = j;
        if (aw.ZL().KP())
        {
          paramInt = j;
          if (!aw.ZL().KV())
            paramInt = aw.ZL().Lc();
        }
        aw.ZL().iK(paramInt);
      }
      AppMethodBeat.o(31869);
      bool = true;
    }
    while (true)
    {
      return bool;
      if ((paramInt == 24) && (this.yTf != null) && (this.yTf.isPlaying()) && ((this.mfQ) || (!this.yTf.mfP)))
      {
        if (paramKeyEvent.getAction() == 0)
        {
          paramInt = i;
          if (aw.ZL().KP())
          {
            paramInt = i;
            if (!aw.ZL().KV())
              paramInt = aw.ZL().Lc();
          }
          aw.ZL().iJ(paramInt);
        }
        AppMethodBeat.o(31869);
        bool = true;
      }
      else
      {
        AppMethodBeat.o(31869);
      }
    }
  }

  public final boolean DX()
  {
    AppMethodBeat.i(31870);
    boolean bool1 = ((com.tencent.mm.ui.chatting.c.b.d)this.cgL.aF(com.tencent.mm.ui.chatting.c.b.d.class)).dDm();
    boolean bool2 = ((com.tencent.mm.ui.chatting.c.b.d)this.cgL.aF(com.tencent.mm.ui.chatting.c.b.d.class)).dDn();
    int i;
    if ((this.cgL.dFw()) || (bool2))
    {
      i = 1;
      if (!bool1)
        break label132;
      if (!bool2)
        break label101;
      bool2 = ((com.tencent.mm.ui.chatting.c.b.d)this.cgL.aF(com.tencent.mm.ui.chatting.c.b.d.class)).dDk().lc(1);
      AppMethodBeat.o(31870);
    }
    while (true)
    {
      return bool2;
      i = 0;
      break;
      label101: bool2 = ((com.tencent.mm.ui.chatting.c.b.d)this.cgL.aF(com.tencent.mm.ui.chatting.c.b.d.class)).dDl().lc(1);
      AppMethodBeat.o(31870);
      continue;
      label132: if (((i != 0) && (this.cgL.sRl.dua == 0)) || (this.cgL.sRl.DX()))
      {
        AppMethodBeat.o(31870);
        bool2 = true;
      }
      else
      {
        AppMethodBeat.o(31870);
        bool2 = false;
      }
    }
  }

  @TargetApi(9)
  public final void a(MMFragment paramMMFragment, boolean paramBoolean)
  {
    AppMethodBeat.i(31877);
    if (paramMMFragment.getLandscapeMode())
      if (paramBoolean)
        if (Build.VERSION.SDK_INT >= 9)
        {
          ab.i("MicroMsg.ChattingUI.VoiceComponent", "rotation %d", new Object[] { Integer.valueOf(paramMMFragment.getWindowManager().getDefaultDisplay().getOrientation()) });
          switch (paramMMFragment.getWindowManager().getDefaultDisplay().getOrientation())
          {
          default:
            AppMethodBeat.o(31877);
          case 0:
          case 1:
          case 2:
          case 3:
          }
        }
    while (true)
    {
      return;
      paramMMFragment.setRequestedOrientation(1);
      AppMethodBeat.o(31877);
      continue;
      paramMMFragment.setRequestedOrientation(0);
      AppMethodBeat.o(31877);
      continue;
      paramMMFragment.setRequestedOrientation(9);
      AppMethodBeat.o(31877);
      continue;
      paramMMFragment.setRequestedOrientation(8);
      AppMethodBeat.o(31877);
      continue;
      if (this.cgL.yTx.getMMResources().getConfiguration().orientation == 2)
      {
        paramMMFragment.setRequestedOrientation(0);
        AppMethodBeat.o(31877);
      }
      else if (this.cgL.yTx.getMMResources().getConfiguration().orientation == 1)
      {
        paramMMFragment.setRequestedOrientation(1);
        AppMethodBeat.o(31877);
        continue;
        paramMMFragment.setRequestedOrientation(-1);
      }
      else
      {
        AppMethodBeat.o(31877);
      }
    }
  }

  public final void acquireWakeLock()
  {
    AppMethodBeat.i(31872);
    this.cgL.setKeepScreenOn(true);
    AppMethodBeat.o(31872);
  }

  public final boolean bn(bi parambi)
  {
    AppMethodBeat.i(31875);
    boolean bool;
    if (parambi.drD())
    {
      if (parambi.field_msgId == this.yTf.yGO)
        this.yTf.dBB();
      bool = true;
      AppMethodBeat.o(31875);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(31875);
    }
  }

  public final boolean bo(bi parambi)
  {
    boolean bool = true;
    AppMethodBeat.i(31876);
    if (parambi.drD())
    {
      aw.ZK();
      if (!com.tencent.mm.model.c.isSDCardAvailable())
      {
        com.tencent.mm.ui.base.t.hO(this.cgL.yTx.getContext());
        AppMethodBeat.o(31876);
      }
    }
    while (true)
    {
      return bool;
      if (parambi.field_msgId == this.yTf.yGO)
        this.yTf.dBB();
      if (!this.cgL.getTalkerUserName().equals("medianote"))
      {
        aw.ZK();
        com.tencent.mm.model.c.XL().c(new com.tencent.mm.az.e(parambi.field_talker, parambi.field_msgSvrId));
      }
      ak.aQ(parambi);
      AppMethodBeat.o(31876);
      continue;
      bool = false;
      AppMethodBeat.o(31876);
    }
  }

  public final void dDh()
  {
    AppMethodBeat.i(31878);
    super.dDh();
    com.tencent.mm.modelvoice.r.b(this.yTf);
    com.tencent.mm.modelvoice.e.b(this.yTf);
    aw.Rg().b(127, this);
    releaseWakeLock();
    if (this.yTf != null)
    {
      this.yTf.dBw();
      com.tencent.mm.ui.chatting.d locald = this.yTf;
      locald.release();
      locald.context = null;
      locald.yGU = false;
      com.tencent.mm.sdk.b.a.xxA.d(locald.yGZ);
      aw.Cc().b(locald);
    }
    AppMethodBeat.o(31878);
  }

  public final com.tencent.mm.ui.chatting.d dFm()
  {
    return this.yTf;
  }

  public final void dFn()
  {
    AppMethodBeat.i(31871);
    com.tencent.mm.ui.chatting.c.b.r localr = (com.tencent.mm.ui.chatting.c.b.r)this.cgL.aF(com.tencent.mm.ui.chatting.c.b.r.class);
    if (((com.tencent.mm.ui.chatting.c.b.i)this.cgL.aF(com.tencent.mm.ui.chatting.c.b.i.class)).dDN())
    {
      ab.d("MicroMsg.ChattingUI.VoiceComponent", "trigger title icon, in show mode");
      this.cgL.qv(false);
      localr.setTitlePhoneIconVisibility(8);
      localr.setTitleMuteIconVisibility(8);
      AppMethodBeat.o(31871);
      return;
    }
    label111: label119: Boolean localBoolean;
    if (((com.tencent.mm.plugin.forcenotify.a.b)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.forcenotify.a.b.class)).Mp(this.cgL.getTalkerUserName()))
    {
      localr.Nd(0);
      localr.setTitleMuteIconVisibility(8);
      aw.ZK();
      localBoolean = (Boolean)com.tencent.mm.model.c.Ry().get(26, null);
      if (localBoolean != null)
        break label195;
      this.mfQ = false;
      label145: if (!this.mfQ)
        break label206;
    }
    label195: label206: for (int i = 0; ; i = 8)
    {
      localr.setTitlePhoneIconVisibility(i);
      AppMethodBeat.o(31871);
      break;
      localr.Nd(8);
      if (!DX())
        break label111;
      localr.setTitleMuteIconVisibility(0);
      break label119;
      this.mfQ = localBoolean.booleanValue();
      break label145;
    }
  }

  public final boolean dFo()
  {
    return this.mfQ;
  }

  public final void dxA()
  {
    AppMethodBeat.i(31882);
    ab.i("MicroMsg.ChattingUI.VoiceComponent", "summeranrt resetAutoPlay looper[%s]", new Object[] { Looper.myLooper() });
    long l = System.currentTimeMillis();
    ab.i("MicroMsg.ChattingUI.VoiceComponent", "resetAutoPlay autoPlay is:%s tid:%d looper:%s", new Object[] { this.yTf, Long.valueOf(Thread.currentThread().getId()), Looper.myLooper() });
    Object localObject;
    if (this.yTf == null)
    {
      this.yTf = new com.tencent.mm.ui.chatting.d(this.cgL, this, this.cgL.getTalkerUserName());
      com.tencent.mm.modelvoice.r.c(this.yTf);
      com.tencent.mm.modelvoice.e.a(this.yTf);
      aw.ZK();
      bool = bo.a((Boolean)com.tencent.mm.model.c.Ry().get(16387, null), true);
      localObject = this.yTf;
      if (!((com.tencent.mm.ui.chatting.d)localObject).yGU)
      {
        ((com.tencent.mm.ui.chatting.d)localObject).yGS = bool;
        ((com.tencent.mm.ui.chatting.d)localObject).dBw();
      }
      localObject = ((com.tencent.mm.ui.chatting.c.b.d)this.cgL.aF(com.tencent.mm.ui.chatting.c.b.d.class)).dDj();
      if (localObject != null)
      {
        localObject = ((com.tencent.mm.aj.d)localObject).cJ(false);
        if (localObject != null)
        {
          if (((d.b)localObject).fvc != null)
          {
            if (((d.b)localObject).fvc.optInt("AudioPlayType", 0) != 1)
              break label380;
            bool = true;
            label219: ((d.b)localObject).fvr = bool;
          }
          if (((d.b)localObject).fvr)
            this.yTf.yGT = false;
        }
      }
      localObject = this.yTf;
      if (this.mfQ)
        break label385;
    }
    label385: for (boolean bool = true; ; bool = false)
    {
      ((com.tencent.mm.ui.chatting.d)localObject).mfP = bool;
      this.yTf.qn(true);
      ab.i("MicroMsg.ChattingUI.VoiceComponent", "summeranrt resetAutoPlay end take[%s]ms", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
      if ((com.tencent.mm.model.t.nw(this.cgL.getTalkerUserName())) && (ao.a.flx != null))
        ao.a.flx.a(this.svH);
      if (!com.tencent.mm.au.b.ahK())
        ((o)this.cgL.aF(o.class)).setVoiceInputShowCallback(this.yTh);
      dFn();
      AppMethodBeat.o(31882);
      return;
      this.yTf.aqZ(this.cgL.getTalkerUserName());
      break;
      label380: bool = false;
      break label219;
    }
  }

  public final void dxB()
  {
    AppMethodBeat.i(31883);
    if ((com.tencent.mm.model.t.nw(this.cgL.getTalkerUserName())) && (ao.a.flx != null))
      ao.a.flx.b(this.svH);
    if ((this.yTg != null) && (this.yTg.getVisibility() == 0))
    {
      ab.i("MicroMsg.ChattingUI.VoiceComponent", "doPause set voiceinputMask GONE");
      this.yTg.setVisibility(8);
    }
    ((o)this.cgL.aF(o.class)).setVoiceInputShowCallback(null);
    aw.ZK();
    com.tencent.mm.model.c.Ry().set(26, Boolean.valueOf(this.mfQ));
    if ((!com.tencent.mm.ui.q.dyk()) && (this.yTf != null))
    {
      this.yTf.dBw();
      this.yTf.dBB();
      this.yTf.release();
    }
    if ((aw.ZL().KP()) && (!com.tencent.mm.plugin.voip.e.cIm()) && (!com.tencent.mm.r.a.Oo()))
      aw.ZL().KN();
    AppMethodBeat.o(31883);
  }

  public final void dxC()
  {
    AppMethodBeat.i(31884);
    aw.Rg().b(127, this);
    AppMethodBeat.o(31884);
  }

  public final void dxy()
  {
    AppMethodBeat.i(31880);
    dFn();
    AppMethodBeat.o(31880);
  }

  public final void dxz()
  {
    AppMethodBeat.i(31881);
    aw.Rg().a(127, this);
    AppMethodBeat.o(31881);
  }

  public final boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(31879);
    boolean bool = d(paramInt, paramKeyEvent);
    AppMethodBeat.o(31879);
    return bool;
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    int i = 1;
    AppMethodBeat.i(31885);
    ab.i("MicroMsg.ChattingUI.VoiceComponent", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString + " sceneType:" + paramm.getType());
    this.cgL.dismissDialog();
    if (!this.cgL.caA)
    {
      ab.i("MicroMsg.ChattingUI.VoiceComponent", "onSceneEnd fragment not foreground, return");
      AppMethodBeat.o(31885);
    }
    while (true)
    {
      return;
      if (bo.cv(this.cgL.yTx.getContext()))
        break;
      AppMethodBeat.o(31885);
    }
    Activity localActivity = this.cgL.yTx.getContext();
    if (u.a.a(localActivity, paramInt1, paramInt2, paramString, 7));
    while (true)
    {
      if (i == 0)
        break label213;
      AppMethodBeat.o(31885);
      break;
      if (!u.a(localActivity, paramInt1, paramInt2, new Intent().setClass(localActivity, LauncherUI.class).putExtra("Intro_Switch", true).putExtra("animation_pop_in", true).addFlags(67108864), paramString))
        i = 0;
    }
    label213: if ((paramInt1 == 0) && (paramInt2 == 0))
      switch (paramm.getType())
      {
      default:
      case 127:
      }
    while (true)
    {
      AppMethodBeat.o(31885);
      break;
      paramString = com.tencent.mm.modelvoice.q.uW(((com.tencent.mm.modelvoice.f)paramm).fileName);
      if ((paramString != null) && (paramString.status == 99))
        ay.au(this.cgL.yTx.getContext(), 2131296498);
    }
  }

  public final void qu(boolean paramBoolean)
  {
    AppMethodBeat.i(31874);
    if (this.yTf == null)
    {
      ab.e("MicroMsg.ChattingUI.VoiceComponent", "setForceSpeakOff error, autoPlay is null!!!");
      AppMethodBeat.o(31874);
    }
    com.tencent.mm.ui.chatting.c.b.r localr;
    while (true)
    {
      return;
      localr = (com.tencent.mm.ui.chatting.c.b.r)this.cgL.aF(com.tencent.mm.ui.chatting.c.b.r.class);
      if (!paramBoolean)
        break;
      this.yTf.mfP = false;
      this.mfQ = true;
      aw.ZK();
      com.tencent.mm.model.c.Ry().set(26, Boolean.TRUE);
      localr.setTitlePhoneIconVisibility(0);
      Toast.makeText(this.cgL.yTx.getContext(), this.cgL.yTx.getMMResources().getString(2131299992), 0).show();
      this.yTf.dBA();
      this.cgL.Na(2131230730);
      AppMethodBeat.o(31874);
    }
    if (!aw.ZL().KP())
      this.yTf.mfP = true;
    while (true)
    {
      this.mfQ = false;
      aw.ZK();
      com.tencent.mm.model.c.Ry().set(26, Boolean.FALSE);
      localr.setTitlePhoneIconVisibility(8);
      Toast.makeText(this.cgL.yTx.getContext(), this.cgL.yTx.getMMResources().getString(2131299993), 0).show();
      this.yTf.dBA();
      this.cgL.Na(2131230750);
      AppMethodBeat.o(31874);
      break;
      ab.i("MicroMsg.ChattingUI.VoiceComponent", "setForceSpeakOff true but isBluetoothOn");
    }
  }

  public final void releaseWakeLock()
  {
    AppMethodBeat.i(31873);
    this.cgL.setKeepScreenOn(false);
    AppMethodBeat.o(31873);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.c.as
 * JD-Core Version:    0.6.2
 */