package com.tencent.mm.ui.chatting;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.media.ToneGenerator;
import android.os.Looper;
import android.os.Vibrator;
import android.view.MotionEvent;
import android.widget.ListView;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.j.a;
import com.tencent.mm.ai.j.b;
import com.tencent.mm.aj.d.b;
import com.tencent.mm.aj.f;
import com.tencent.mm.compatible.util.e;
import com.tencent.mm.g.a.nu;
import com.tencent.mm.g.a.ui;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.bf;
import com.tencent.mm.model.c;
import com.tencent.mm.model.r;
import com.tencent.mm.platformtools.ae;
import com.tencent.mm.plugin.subapp.c.i;
import com.tencent.mm.pluginsdk.ui.chat.AppPanel.a;
import com.tencent.mm.pluginsdk.ui.chat.ChatFooter;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.bi;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.MMFragment;
import com.tencent.mm.ui.chatting.c.b.af;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

public final class p
  implements com.tencent.mm.pluginsdk.ui.chat.b
{
  public static boolean yJd = true;
  private com.tencent.mm.storage.ad ehM;
  private final com.tencent.mm.sdk.platformtools.ap gci;
  private Vibrator kgA;
  private Object lock;
  private final com.tencent.mm.sdk.platformtools.ap miP;
  private ChatFooter oor;
  private ToneGenerator oot;
  private final j.a oox;
  private final j.b ooy;
  private AppPanel.a ope;
  private boolean yFW;
  private com.tencent.mm.ai.j yJe;
  private String yJf;
  private String yJg;
  private boolean yJh;
  private boolean yJi;
  public boolean yJj;
  private volatile boolean yJk;
  private volatile boolean yJl;
  private boolean yJm;
  com.tencent.mm.ui.chatting.d.a yod;

  public p(com.tencent.mm.ui.chatting.d.a parama, ChatFooter paramChatFooter, String paramString)
  {
    AppMethodBeat.i(30655);
    this.oox = new p.1(this);
    this.ooy = new p.4(this);
    this.yJk = false;
    this.yJl = false;
    this.lock = new Object();
    this.gci = new com.tencent.mm.sdk.platformtools.ap(new p.8(this), true);
    this.yJm = false;
    this.miP = new com.tencent.mm.sdk.platformtools.ap(new p.9(this), true);
    this.ope = new p.10(this);
    this.yod = parama;
    this.oor = paramChatFooter;
    this.yJf = paramString;
    aw.ZK();
    this.ehM = c.XM().aoO(paramString);
    this.yJh = com.tencent.mm.model.t.kH(this.yod.getTalkerUserName());
    this.yJi = com.tencent.mm.model.t.mT(this.yod.getTalkerUserName());
    boolean bool;
    if ((this.yJh) || (this.yJi))
    {
      bool = true;
      this.yFW = bool;
      this.kgA = ((Vibrator)this.yod.yTx.getContext().getSystemService("vibrator"));
      if (!com.tencent.mm.model.t.nv(this.yJf))
        break label292;
      this.yJe = new i();
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.ChattingFooterEventImpl", "initRecorder new VoiceRemindRecorder().");
    }
    while (true)
    {
      this.yJe.a(this.ooy);
      this.yJe.a(this.oox);
      paramChatFooter.setAppPanelListener(this.ope);
      AppMethodBeat.o(30655);
      return;
      bool = false;
      break;
      label292: parama = this.yJf;
      int i;
      if (com.tencent.mm.model.t.nG(parama))
        i = 1;
      while (true)
      {
        if (i == 0)
          break label473;
        this.yJe = new com.tencent.mm.audio.b.h(this.yod.yTx.getContext(), true);
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.ChattingFooterEventImpl", "initRecorder new SceneVoiceRecorder, use Speex");
        break;
        parama = ((com.tencent.mm.plugin.messenger.foundation.a.j)g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XM().aoO(parama);
        if ((parama != null) && (parama.dsf()))
        {
          paramString = f.qX(parama.field_username);
          if (paramString != null)
          {
            paramString = paramString.cJ(false);
            if (paramString != null)
            {
              if (paramString.fvc != null)
                paramString.fvg = "1".equals(paramString.fvc.optString("CanReceiveSpeexVoice"));
              if (paramString.fvg)
              {
                com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.BizInfoStorageLogic", "bizinfo name=" + parama.field_username + " canReceiveSpeexVoice");
                i = 1;
              }
            }
          }
        }
        else
        {
          i = 0;
        }
      }
      label473: this.yJe = new com.tencent.mm.audio.b.h(this.yod.yTx.getContext(), false);
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.ChattingFooterEventImpl", "initRecorder new SceneVoiceRecorder, not use Speex");
    }
  }

  private static void Ol(int paramInt)
  {
    AppMethodBeat.i(30671);
    nu localnu = new nu();
    localnu.cKl.state = paramInt;
    com.tencent.mm.sdk.b.a.xxA.m(localnu);
    AppMethodBeat.o(30671);
  }

  private boolean dCg()
  {
    boolean bool = false;
    int i = 1;
    AppMethodBeat.i(30664);
    this.yod.yTx.enableOptionMenu(true);
    this.yod.yTx.enableBackMenu(true);
    if (this.yJe != null)
      if ((this.yJe.isRecording()) && (dCh()))
      {
        bool = this.yJe.EH();
        this.gci.stopTimer();
        this.miP.stopTimer();
        if (i != 0)
          dCi();
        com.tencent.mm.sdk.platformtools.aj.amB("keep_app_silent");
      }
    while (true)
    {
      AppMethodBeat.o(30664);
      return bool;
      i = 0;
      break;
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.ChattingFooterEventImpl", "stopRecording recorder == null");
    }
  }

  private boolean dCh()
  {
    AppMethodBeat.i(30668);
    boolean bool;
    if ((this.ehM.field_username.equals("medianote")) && ((r.YD() & 0x4000) == 0))
    {
      bool = true;
      AppMethodBeat.o(30668);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(30668);
    }
  }

  private void dCi()
  {
    AppMethodBeat.i(30669);
    bi localbi = new bi();
    localbi.ju("medianote");
    localbi.setType(34);
    localbi.hO(1);
    localbi.jv(this.yJg);
    localbi.setStatus(2);
    localbi.setContent(com.tencent.mm.modelvoice.n.d(r.Yz(), this.yJe.ET(), false));
    localbi.eJ(bf.oC("medianote"));
    if (this.yJe.EY() == 2)
      localbi.ix("SOURCE_SILK_FILE");
    aw.ZK();
    long l = c.XO().Z(localbi);
    if (l <= 0L)
    {
      com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.ChattingFooterEventImpl", "insertLocalMsg fail");
      AppMethodBeat.o(30669);
    }
    while (true)
    {
      return;
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.ChattingFooterEventImpl", "insertLocalMsg success, msgId = ".concat(String.valueOf(l)));
      AppMethodBeat.o(30669);
    }
  }

  private void releaseWakeLock()
  {
    AppMethodBeat.i(30663);
    this.yod.setKeepScreenOn(false);
    AppMethodBeat.o(30663);
  }

  public final void I(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(30662);
    if ((paramMotionEvent == null) || (paramMotionEvent.getAction() == 1))
    {
      this.yod.dFA();
      this.yod.dCy();
    }
    AppMethodBeat.o(30662);
  }

  public final void Om(int paramInt)
  {
    AppMethodBeat.i(30673);
    boolean bool = com.tencent.mm.pluginsdk.permission.b.a(this.yod.yTx.getContext(), "android.permission.CAMERA", 18, "", "");
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.ChattingFooterEventImpl", "summerper checkPermission checkCamera[%b], stack[%s], activity[%s]", new Object[] { Boolean.valueOf(bool), bo.dpG(), this.yod.yTx.getContext() });
    if (!bool)
      AppMethodBeat.o(30673);
    while (true)
    {
      return;
      bool = com.tencent.mm.pluginsdk.permission.b.a(this.yod.yTx.getContext(), "android.permission.RECORD_AUDIO", 18, "", "");
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.ChattingFooterEventImpl", "summerper checkPermission checkmicrophone[%b], stack[%s], activity[%s]", new Object[] { Boolean.valueOf(bool), bo.dpG(), this.yod.yTx.getContext() });
      if (!bool)
      {
        AppMethodBeat.o(30673);
      }
      else if ((com.tencent.mm.sdk.a.b.dnO()) || (ae.gjs))
      {
        com.tencent.mm.ui.tools.j localj = new com.tencent.mm.ui.tools.j(this.yod.yTx.getContext());
        localj.rBl = new p.2(this);
        localj.rBm = new p.3(this, paramInt);
        localj.cuu();
        AppMethodBeat.o(30673);
      }
      else
      {
        if (!ae.gjt)
        {
          com.tencent.mm.plugin.report.service.h.pYm.e(13822, new Object[] { Integer.valueOf(1), Integer.valueOf(1) });
          com.tencent.mm.pluginsdk.ui.tools.n.a(this.yod.yTx, new Intent(), getTalkerUserName(), paramInt);
        }
        AppMethodBeat.o(30673);
      }
    }
  }

  public final boolean Qu(String paramString)
  {
    AppMethodBeat.i(30659);
    this.yod.dFA();
    this.yod.dCy();
    boolean bool = ((com.tencent.mm.ui.chatting.c.b.ad)this.yod.aF(com.tencent.mm.ui.chatting.c.b.ad.class)).arq(paramString);
    AppMethodBeat.o(30659);
    return bool;
  }

  public final boolean bNG()
  {
    AppMethodBeat.i(30656);
    boolean bool;
    synchronized (this.lock)
    {
      this.yJk = true;
      if (!this.yJl)
      {
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.ChattingFooterEventImpl", "jacks in voice rcd stop but not begin.");
        AppMethodBeat.o(30656);
        bool = false;
        return bool;
      }
    }
    this.yJl = false;
    releaseWakeLock();
    if (!dCg())
    {
      this.oor.ddN();
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.ChattingFooterEventImpl", "record stop on stop request setRcdTooShort");
    }
    while (true)
    {
      ((com.tencent.mm.ui.chatting.c.b.aj)this.yod.aF(com.tencent.mm.ui.chatting.c.b.aj.class)).dFm().dBx();
      ((com.tencent.mm.ui.chatting.c.b.ab)this.yod.aF(com.tencent.mm.ui.chatting.c.b.ab.class)).OE(4);
      ((com.tencent.mm.ui.chatting.c.b.ab)this.yod.aF(com.tencent.mm.ui.chatting.c.b.ab.class)).stopSignalling();
      Ol(1);
      ((com.tencent.mm.ui.chatting.c.b.aj)this.yod.aF(com.tencent.mm.ui.chatting.c.b.aj.class)).a(this.yod.yTx, false);
      AppMethodBeat.o(30656);
      bool = true;
      break;
      this.oor.bvH();
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.ChattingFooterEventImpl", "record stop on stop request resetRcdStatus");
    }
  }

  public final boolean bNI()
  {
    AppMethodBeat.i(30657);
    com.tencent.mm.sdk.platformtools.ab.v("MicroMsg.ChattingFooterEventImpl", "record cancel on cancel request");
    while (true)
    {
      synchronized (this.lock)
      {
        this.yJk = true;
        if (!this.yJl)
        {
          com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.ChattingFooterEventImpl", "jacks in voice rcd stop but not begin.");
          AppMethodBeat.o(30657);
          bool = false;
          return bool;
        }
      }
      this.yJl = false;
      releaseWakeLock();
      this.yod.yTx.enableOptionMenu(true);
      this.yod.yTx.enableBackMenu(true);
      if (this.yJe != null)
      {
        this.yJe.cancel();
        this.gci.stopTimer();
        this.miP.stopTimer();
      }
      this.oor.bvH();
      ((com.tencent.mm.ui.chatting.c.b.aj)this.yod.aF(com.tencent.mm.ui.chatting.c.b.aj.class)).dFm().dBx();
      ((com.tencent.mm.ui.chatting.c.b.ab)this.yod.aF(com.tencent.mm.ui.chatting.c.b.ab.class)).OE(4);
      ((com.tencent.mm.ui.chatting.c.b.ab)this.yod.aF(com.tencent.mm.ui.chatting.c.b.ab.class)).stopSignalling();
      Ol(1);
      ((com.tencent.mm.ui.chatting.c.b.aj)this.yod.aF(com.tencent.mm.ui.chatting.c.b.aj.class)).a(this.yod.yTx, false);
      AppMethodBeat.o(30657);
      boolean bool = true;
    }
  }

  public final boolean bNJ()
  {
    boolean bool = true;
    AppMethodBeat.i(30658);
    if ((com.tencent.mm.r.a.bJ(this.yod.yTx.getContext())) || (com.tencent.mm.r.a.bH(this.yod.yTx.getContext())))
    {
      com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.ChattingFooterEventImpl", "voip is running, cann't record voice");
      AppMethodBeat.o(30658);
      bool = false;
    }
    while (true)
    {
      return bool;
      aw.ZK();
      if (!c.isSDCardAvailable())
      {
        com.tencent.mm.ui.base.t.hO(this.yod.yTx.getContext());
        com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.ChattingFooterEventImpl", "onVoiceRcdStartRequest isSDCardAvailable() failed and return.");
        AppMethodBeat.o(30658);
        bool = false;
        continue;
      }
      if (!com.tencent.mm.compatible.f.b.Mi())
        com.tencent.mm.ui.base.h.a(this.yod.yTx.getContext(), this.yod.yTx.getMMResources().getString(2131297057), this.yod.yTx.getMMResources().getString(2131296984), this.yod.yTx.getMMResources().getString(2131296986), true, new p.5(this));
      int i;
      if (this.yJe != null)
        if (this.oot == null)
        {
          i = this.yod.yTx.getStreamMaxVolume(3);
          int j = this.yod.yTx.getStreamVolume(3);
          i = (int)(i / j * 100.0F);
        }
      try
      {
        ??? = new android/media/ToneGenerator;
        ((ToneGenerator)???).<init>(3, i);
        this.oot = ((ToneGenerator)???);
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.ChattingFooterEventImpl", "init tone");
        if (this.oot != null)
        {
          this.oot.startTone(24);
          com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.ChattingFooterEventImpl", "start tone");
        }
        this.yod.getListView().postDelayed(new p.7(this), 200L);
      }
      catch (Exception localException)
      {
        synchronized (this.lock)
        {
          this.yJk = false;
          new ak(Looper.myLooper()).postDelayed(new p.6(this), 200L);
          AppMethodBeat.o(30658);
          continue;
          localException = localException;
          com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.ChattingFooterEventImpl", "init tone failed");
        }
      }
    }
  }

  public final void bNK()
  {
    AppMethodBeat.i(30660);
    this.yod.dFA();
    this.yod.dCy();
    AppMethodBeat.o(30660);
  }

  public final void bNL()
  {
    AppMethodBeat.i(30661);
    this.yod.dFA();
    this.yod.dCy();
    AppMethodBeat.o(30661);
  }

  public final void cbl()
  {
    AppMethodBeat.i(30676);
    boolean bool = com.tencent.mm.pluginsdk.permission.b.a(this.yod.yTx.getContext(), "android.permission.RECORD_AUDIO", 82, "", "");
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.ChattingFooterEventImpl", "summerper checkPermission checkmicrophone[%b], stack[%s], activity[%s]", new Object[] { Boolean.valueOf(bool), bo.dpG(), this.yod.yTx.getContext() });
    if (!bool)
      AppMethodBeat.o(30676);
    while (true)
    {
      return;
      ui localui = new ui();
      localui.cQx.cAd = 5;
      localui.cQx.talker = getTalkerUserName();
      localui.cQx.context = this.yod.yTx.getContext();
      localui.cQx.cQs = 4;
      if (this.oor.dky())
        this.oor.setBottomPanelVisibility(8);
      com.tencent.mm.sdk.b.a.xxA.m(localui);
      AppMethodBeat.o(30676);
    }
  }

  public final void cbm()
  {
    AppMethodBeat.i(30677);
    boolean bool = com.tencent.mm.pluginsdk.permission.b.a(this.yod.yTx.getContext(), "android.permission.CAMERA", 19, "", "");
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.ChattingFooterEventImpl", "summerper checkPermission checkCamera[%b], stack[%s], activity[%s]", new Object[] { Boolean.valueOf(bool), bo.dpG(), this.yod.yTx.getContext() });
    if (!bool)
      AppMethodBeat.o(30677);
    while (true)
    {
      return;
      bool = com.tencent.mm.pluginsdk.permission.b.a(this.yod.yTx.getContext(), "android.permission.RECORD_AUDIO", 19, "", "");
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.ChattingFooterEventImpl", "summerper checkPermission checkmicrophone[%b], stack[%s], activity[%s]", new Object[] { Boolean.valueOf(bool), bo.dpG(), this.yod.yTx.getContext() });
      if (!bool)
      {
        AppMethodBeat.o(30677);
      }
      else
      {
        ui localui = new ui();
        localui.cQx.cAd = 5;
        localui.cQx.talker = getTalkerUserName();
        localui.cQx.context = this.yod.yTx.getContext();
        localui.cQx.cQs = 2;
        if (this.oor.dky())
          this.oor.setBottomPanelVisibility(8);
        com.tencent.mm.sdk.b.a.xxA.m(localui);
        AppMethodBeat.o(30677);
      }
    }
  }

  public final void dCj()
  {
    AppMethodBeat.i(30672);
    boolean bool = com.tencent.mm.pluginsdk.permission.b.a(this.yod.yTx.getContext(), "android.permission.CAMERA", 22, "", "");
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.ChattingFooterEventImpl", "summerper checkPermission checkCamera[%b], stack[%s], activity[%s]", new Object[] { Boolean.valueOf(bool), bo.dpG(), this.yod.yTx.getContext() });
    if (!bool)
      AppMethodBeat.o(30672);
    Intent localIntent;
    while (true)
    {
      return;
      bool = com.tencent.mm.pluginsdk.permission.b.a(this.yod.yTx.getContext(), "android.permission.RECORD_AUDIO", 22, "", "");
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.ChattingFooterEventImpl", "summerper checkPermission checkmicrophone[%b], stack[%s], activity[%s]", new Object[] { Boolean.valueOf(bool), bo.dpG(), this.yod.yTx.getContext() });
      if (!bool)
      {
        AppMethodBeat.o(30672);
      }
      else
      {
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.ChattingFooterEventImpl", "onEnterMultiTalk");
        localIntent = new Intent();
        if (!com.tencent.mm.bh.d.fUu.tQ(getTalkerUserName()))
          break;
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.ChattingFooterEventImpl", "onEnterMultiTalk, but now is in share location!");
        Toast.makeText(ah.getContext(), 2131300616, 0).show();
        AppMethodBeat.o(30672);
      }
    }
    List localList;
    if (getTalkerUserName() != null)
    {
      localList = ((com.tencent.mm.plugin.multitalk.model.a)g.K(com.tencent.mm.plugin.multitalk.model.a.class)).RY(getTalkerUserName());
      aw.ZK();
      String str1 = (String)c.Ry().get(2, null);
      bool = ((com.tencent.mm.plugin.multitalk.model.a)g.K(com.tencent.mm.plugin.multitalk.model.a.class)).RV(getTalkerUserName());
      Iterator localIterator = localList.iterator();
      String str2;
      do
      {
        if (!localIterator.hasNext())
          break;
        str2 = (String)localIterator.next();
      }
      while ((str1 == null) || (!str1.equals(str2)));
    }
    for (int i = 1; ; i = 0)
    {
      if ((localList.size() >= 9) && (i == 0))
      {
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.ChattingFooterEventImpl", "onEnterMultiTalk, but > max 9 members!");
        Toast.makeText(ah.getContext(), ah.getContext().getString(2131301554, new Object[] { Integer.valueOf(9) }), 0).show();
        AppMethodBeat.o(30672);
        break;
      }
      if (i != 0)
      {
        if (((com.tencent.mm.plugin.multitalk.model.a)g.K(com.tencent.mm.plugin.multitalk.model.a.class)).bRd())
        {
          com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.ChattingFooterEventImpl", "onEnterMultiTalk, but already in it!");
          Toast.makeText(ah.getContext(), ah.getContext().getString(2131301542), 0).show();
          AppMethodBeat.o(30672);
          break;
        }
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.ChattingFooterEventImpl", "onEnterMultiTalk, already inlist, but in fact not multitalking now!");
      }
      if (((com.tencent.mm.plugin.multitalk.model.a)g.K(com.tencent.mm.plugin.multitalk.model.a.class)).bRb())
      {
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.ChattingFooterEventImpl", "onEnterMultiTalk, but already in VoIP or multitalk!");
        Toast.makeText(ah.getContext(), ah.getContext().getString(2131301542), 0).show();
        AppMethodBeat.o(30672);
        break;
      }
      if (bool)
      {
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.ChattingFooterEventImpl", "onEnterMultiTalk, but this group already in multitalk, alter take in or not tips!");
        com.tencent.mm.ui.base.h.d(this.yod.yTx.getContext(), this.yod.yTx.getMMResources().getString(2131301577), "", this.yod.yTx.getMMResources().getString(2131301526), this.yod.yTx.getMMResources().getString(2131301523), new p.11(this), null);
        AppMethodBeat.o(30672);
        break;
      }
      localIntent.putExtra("chatroomName", getTalkerUserName());
      localIntent.putExtra("key_need_gallery", true);
      localIntent.putExtra("titile", this.yod.yTx.getMMResources().getString(2131301563));
      com.tencent.mm.bp.d.b(this.yod.yTx.getContext(), "multitalk", ".ui.MultiTalkSelectContactUI", localIntent);
      AppMethodBeat.o(30672);
      break;
    }
  }

  public final void dCk()
  {
    AppMethodBeat.i(30674);
    boolean bool = com.tencent.mm.pluginsdk.permission.b.a(this.yod.yTx.getContext(), "android.permission.RECORD_AUDIO", 83, "", "");
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.ChattingFooterEventImpl", "summerper checkPermission checkmicrophone[%b], stack[%s], activity[%s]", new Object[] { Boolean.valueOf(bool), bo.dpG(), this.yod.yTx.getContext() });
    if (!bool)
      AppMethodBeat.o(30674);
    while (true)
    {
      return;
      if (this.oor.dky())
        this.oor.setBottomPanelVisibility(8);
      ui localui = new ui();
      localui.cQx.cAd = 5;
      localui.cQx.talker = getTalkerUserName();
      localui.cQx.context = this.yod.yTx.getContext();
      localui.cQx.cQs = 3;
      com.tencent.mm.sdk.b.a.xxA.m(localui);
      com.tencent.mm.plugin.report.service.h.pYm.e(11033, new Object[] { Integer.valueOf(4), Integer.valueOf(2), Integer.valueOf(0) });
      AppMethodBeat.o(30674);
    }
  }

  public final void dCl()
  {
    AppMethodBeat.i(30675);
    boolean bool = com.tencent.mm.pluginsdk.permission.b.a(this.yod.yTx.getContext(), "android.permission.CAMERA", 21, "", "");
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.ChattingFooterEventImpl", "summerper checkPermission checkCamera[%b], stack[%s], activity[%s]", new Object[] { Boolean.valueOf(bool), bo.dpG(), this.yod.yTx.getContext() });
    if (!bool)
      AppMethodBeat.o(30675);
    while (true)
    {
      return;
      bool = com.tencent.mm.pluginsdk.permission.b.a(this.yod.yTx.getContext(), "android.permission.RECORD_AUDIO", 21, "", "");
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.ChattingFooterEventImpl", "summerper checkPermission checkmicrophone[%b], stack[%s], activity[%s]", new Object[] { Boolean.valueOf(bool), bo.dpG(), this.yod.yTx.getContext() });
      if (!bool)
      {
        AppMethodBeat.o(30675);
      }
      else
      {
        if (this.oor.dky())
          this.oor.setBottomPanelVisibility(8);
        ui localui = new ui();
        localui.cQx.cAd = 5;
        localui.cQx.talker = getTalkerUserName();
        localui.cQx.context = this.yod.yTx.getContext();
        localui.cQx.cQs = 2;
        com.tencent.mm.sdk.b.a.xxA.m(localui);
        AppMethodBeat.o(30675);
      }
    }
  }

  public final void dCm()
  {
    AppMethodBeat.i(30678);
    ((af)this.yod.aF(af.class)).qt(false);
    this.oor.setBottomPanelVisibility(8);
    AppMethodBeat.o(30678);
  }

  public final void dCn()
  {
    AppMethodBeat.i(30679);
    if (!com.tencent.mm.pluginsdk.ui.tools.n.a(this.yod.yTx, e.euR, "microMsg." + System.currentTimeMillis() + ".jpg"))
      Toast.makeText(this.yod.yTx.getContext(), this.yod.yTx.getMMResources().getString(2131302908), 1).show();
    AppMethodBeat.o(30679);
  }

  public final String getTalkerUserName()
  {
    AppMethodBeat.i(30665);
    String str;
    if ((this.ehM != null) && (com.tencent.mm.storage.ad.mR(this.ehM.field_username)))
    {
      str = this.yJf;
      AppMethodBeat.o(30665);
    }
    while (true)
    {
      return str;
      if (this.ehM == null)
      {
        str = null;
        AppMethodBeat.o(30665);
      }
      else
      {
        str = this.ehM.field_username;
        AppMethodBeat.o(30665);
      }
    }
  }

  public final void iS(boolean paramBoolean)
  {
    AppMethodBeat.i(30670);
    if (paramBoolean)
    {
      ((com.tencent.mm.ui.chatting.c.b.ab)this.yod.aF(com.tencent.mm.ui.chatting.c.b.ab.class)).keepSignalling();
      AppMethodBeat.o(30670);
    }
    while (true)
    {
      return;
      ((com.tencent.mm.ui.chatting.c.b.ab)this.yod.aF(com.tencent.mm.ui.chatting.c.b.ab.class)).stopSignalling();
      AppMethodBeat.o(30670);
    }
  }

  public final void onPause()
  {
    AppMethodBeat.i(30667);
    if (this.oot != null)
    {
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.ChattingFooterEventImpl", "release");
      this.oot.release();
      this.oot = null;
    }
    dCg();
    this.gci.stopTimer();
    this.miP.stopTimer();
    AppMethodBeat.o(30667);
  }

  public final void release()
  {
    AppMethodBeat.i(30666);
    if (this.oot != null)
    {
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.ChattingFooterEventImpl", "release");
      this.oot.release();
      this.oot = null;
    }
    AppMethodBeat.o(30666);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.p
 * JD-Core Version:    0.6.2
 */