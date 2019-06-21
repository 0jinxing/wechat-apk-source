package com.tencent.mm.ui.chatting.c;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aj.a.k;
import com.tencent.mm.aj.d.b;
import com.tencent.mm.aj.d.b.c;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.g.c.at;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.r;
import com.tencent.mm.openim.PluginOpenIM;
import com.tencent.mm.openim.a.b.a;
import com.tencent.mm.pluginsdk.ui.ChatFooterPanel;
import com.tencent.mm.pluginsdk.ui.chat.AppPanel;
import com.tencent.mm.pluginsdk.ui.chat.ChatFooter;
import com.tencent.mm.pluginsdk.ui.chat.ChatFooter.d;
import com.tencent.mm.pluginsdk.ui.chat.ChatFooter.e;
import com.tencent.mm.pluginsdk.ui.chat.ChatFooterBottom;
import com.tencent.mm.pluginsdk.ui.chat.a.a;
import com.tencent.mm.pluginsdk.ui.chat.m.6;
import com.tencent.mm.sdk.e.k.a;
import com.tencent.mm.sdk.e.n.b;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.be;
import com.tencent.mm.ui.MMFragment;
import com.tencent.mm.ui.base.MMFlipper;
import com.tencent.mm.ui.bizchat.BizChatAtSomeoneUI;
import com.tencent.mm.ui.chatting.AtSomeoneUI;
import com.tencent.mm.ui.chatting.BaseChattingUIFragment;
import com.tencent.mm.ui.chatting.ChatFooterCustom;
import com.tencent.mm.ui.chatting.af;
import com.tencent.mm.ui.chatting.c.b.aa;
import com.tencent.mm.ui.chatting.c.b.ae;
import com.tencent.mm.ui.chatting.w;
import com.tencent.mm.ui.widget.MMEditText;
import com.tencent.mm.ui.widget.SwipeBackLayout;
import java.util.List;
import org.json.JSONObject;

@com.tencent.mm.ui.chatting.c.a.a(dFp=com.tencent.mm.ui.chatting.c.b.o.class)
public class q extends a
  implements k.a, n.b, com.tencent.mm.ui.chatting.c.b.o
{
  protected ChatFooter oor;
  private final ChatFooter.e vmZ;
  private com.tencent.mm.ui.chatting.p yPG;
  protected ChatFooterCustom yPH;
  private int yPI;
  private com.tencent.mm.ui.chatting.t yPJ;
  private w yPK;
  private com.tencent.mm.ui.chatting.h yPL;
  private AnimationSet yPM;
  private String yPN;
  private int yPO;
  private int yPP;
  private boolean yPQ;
  private boolean yPR;
  public boolean yPS;
  private long yPT;

  public q()
  {
    AppMethodBeat.i(31419);
    this.yPI = 0;
    this.yPN = null;
    this.yPQ = false;
    this.vmZ = new q.1(this);
    this.yPR = false;
    this.yPS = false;
    this.yPT = 0L;
    AppMethodBeat.o(31419);
  }

  private void arm(String paramString)
  {
    boolean bool1 = false;
    AppMethodBeat.i(31429);
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.ChattingUI.FootComponent", "initFooterPanelMenu %s", new Object[] { paramString });
    this.oor.dkk();
    this.oor.dkb();
    int i;
    Object localObject;
    int j;
    label777: label802: label814: boolean bool2;
    if (((com.tencent.mm.ui.chatting.c.b.i)this.cgL.aF(com.tencent.mm.ui.chatting.c.b.i.class)).dDN())
    {
      com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.ChattingUI.FootComponent", "match shake, in show mode, do not open short video recode view");
      i = 0;
      if (i == 0)
        this.oor.dkm();
      if (((com.tencent.mm.ui.chatting.c.b.d)this.cgL.aF(com.tencent.mm.ui.chatting.c.b.d.class)).dDm())
      {
        localObject = com.tencent.mm.aj.f.qX(this.cgL.getTalkerUserName());
        if ((localObject != null) && (((com.tencent.mm.aj.d)localObject).field_enterpriseFather != null))
          break label1782;
        j = 0;
        if (j != 0)
        {
          localObject = this.oor.vmM;
          ((AppPanel)localObject).vlP.vmG.value = true;
          ((AppPanel)localObject).djQ();
        }
      }
      if (!this.cgL.dFx())
        this.oor.dks();
      if ((this.cgL.sRl != null) && (!com.tencent.mm.n.a.jh(this.cgL.sRl.field_type)) && (!com.tencent.mm.model.t.kH(this.cgL.getTalkerUserName())))
        this.oor.dkp();
      if (ad.mR(paramString))
      {
        this.oor.vmM.djK();
        this.oor.vmM.djM();
        this.oor.vmM.djN();
        this.oor.dkn();
        this.oor.dko();
        this.oor.vmM.djL();
        this.oor.ac(true, true);
        this.oor.dkp();
        this.oor.dkq();
        this.oor.vmM.djP();
      }
      if (ad.aow(paramString))
      {
        this.oor.vmM.djK();
        this.oor.vmM.djM();
        this.oor.vmM.djN();
        this.oor.dkn();
        this.oor.dko();
        this.oor.vmM.djL();
        this.oor.ac(true, true);
        this.oor.dkp();
        this.oor.dkq();
        this.oor.vmM.djP();
      }
      if (ad.aou(paramString))
      {
        this.oor.vmM.djK();
        this.oor.vmM.djM();
        this.oor.vmM.djN();
        this.oor.dkn();
        this.oor.dkj();
        this.oor.dko();
        this.oor.vmM.djL();
        this.oor.ac(true, true);
        this.oor.dkp();
        this.oor.dkq();
        this.oor.vmM.djP();
      }
      if (com.tencent.mm.model.t.no(paramString))
      {
        this.oor.vmM.djK();
        this.oor.vmM.djM();
        this.oor.vmM.djN();
        this.oor.dko();
        this.oor.vmM.djL();
        this.oor.ac(true, true);
        this.oor.dkp();
        this.oor.dkq();
        this.oor.vmM.djP();
      }
      if (com.tencent.mm.model.t.nl(paramString))
      {
        this.oor.vmM.djK();
        this.oor.ac(true, true);
        this.oor.vmM.djL();
        this.oor.vmM.djP();
      }
      aw.ZK();
      paramString = com.tencent.mm.model.c.XM().aoO(paramString);
      if ((paramString != null) && (paramString.dsf()))
      {
        if (!((com.tencent.mm.ui.chatting.c.b.d)this.cgL.aF(com.tencent.mm.ui.chatting.c.b.d.class)).dDm())
          break label1838;
        this.oor.vmM.djK();
        this.oor.vmM.djN();
        this.oor.vmM.djL();
        this.oor.ac(true, true);
        this.oor.dkp();
        this.oor.dkq();
        this.oor.dkm();
        this.oor.vmM.djO();
        this.oor.dkl();
        this.oor.dkr();
        this.oor.AD();
      }
      if (!this.cgL.dFw())
        break label1882;
      if (com.tencent.mm.m.g.Nu().getInt("MultitalkBlockCaller", 0) != 0)
        break label1877;
      i = 1;
      if (i == 0)
        break label1882;
      this.oor.oH(false);
      if ((this.cgL.dFx()) || (this.cgL.dFv()))
      {
        this.oor.ac(true, true);
        this.oor.dkq();
      }
      com.tencent.mm.bp.d.dlL();
      if (this.cgL.dFv())
        this.oor.vmM.djL();
      if (this.cgL.getTalkerUserName().equals(r.Yz()))
      {
        this.oor.vmM.djL();
        this.oor.ac(true, true);
        this.oor.dkp();
        this.oor.dkq();
      }
      this.oor.setAppPanelTip(null);
      if ((ad.aox(this.cgL.sRl.field_username)) || (com.tencent.mm.model.t.mP(this.cgL.sRl.field_username)))
      {
        com.tencent.mm.kernel.g.RQ();
        localObject = ((com.tencent.mm.plugin.messenger.foundation.a.j)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XM().aoO(this.cgL.sRl.field_username);
        ((com.tencent.mm.openim.a.b)com.tencent.mm.kernel.g.K(com.tencent.mm.openim.a.b.class)).aZ(((ap)localObject).field_openImAppid, ((ap)localObject).field_descWordingId);
        i = ((com.tencent.mm.openim.a.b)com.tencent.mm.kernel.g.K(com.tencent.mm.openim.a.b.class)).vi(((ap)localObject).field_openImAppid);
        paramString = ((com.tencent.mm.openim.a.b)com.tencent.mm.kernel.g.K(com.tencent.mm.openim.a.b.class)).c(this.cgL.sRl.field_openImAppid, "openim_function_tip", b.a.geR);
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.ChattingUI.FootComponent", "openim showFlag:%d username: %s appid: %s tip %s", new Object[] { Integer.valueOf(i), this.cgL.sRl.field_username, ((ap)localObject).field_openImAppid, paramString });
        if ((i & 0x1) == 0)
          this.oor.dkj();
        if ((i & 0x2) == 0)
          this.oor.dkl();
        if ((i & 0x4) == 0)
        {
          localObject = this.oor.vmM;
          ((AppPanel)localObject).vlP.vmn.value = false;
          ((AppPanel)localObject).djQ();
        }
        if ((i & 0x8) == 0)
          this.oor.dkn();
        if ((i & 0x10) == 0)
          this.oor.vmM.djM();
        if ((i & 0x20) == 0)
          this.oor.vmM.djK();
        if ((i & 0x40) == 0)
          this.oor.vmM.djP();
        if ((i & 0x80) == 0)
          this.oor.dko();
        if (((i & 0x100) == 0) || ((i & 0x2000) == 0))
        {
          localObject = this.oor;
          if ((i & 0x100) != 0)
            break label1893;
          bool2 = true;
          label1288: if ((i & 0x2000) != 0)
            break label1899;
        }
      }
    }
    label1838: label1877: label1882: label1893: label1899: for (boolean bool3 = true; ; bool3 = false)
    {
      ((ChatFooter)localObject).ac(bool2, bool3);
      if ((i & 0x200) == 0)
      {
        this.oor.dkp();
        this.oor.dkq();
      }
      if ((i & 0x400) == 0)
        this.oor.vmM.vma = true;
      if ((com.tencent.mm.model.t.mP(this.cgL.sRl.field_username)) && ((i & 0x100) == 0))
        this.oor.oH(true);
      this.oor.setAppPanelTip(paramString);
      paramString = this.oor;
      com.tencent.mm.bp.d.dlL();
      if (paramString.eAk != null)
        paramString.eAk.j(false, false);
      paramString = this.oor;
      com.tencent.mm.bp.d.dlL();
      bool2 = bool1;
      if (com.tencent.mm.au.b.ahK())
        bool2 = true;
      paramString.oI(bool2);
      this.oor.vmM.djL();
      if (ad.mg(this.cgL.getTalkerUserName()))
      {
        this.oor.dkb();
        this.oor.dkj();
        this.oor.vmM.djN();
        this.oor.dks();
        this.oor.dko();
        this.oor.dkl();
        this.oor.dkn();
        this.oor.vmM.djK();
        this.oor.dkm();
        this.oor.dko();
        this.oor.dkl();
        this.oor.dkr();
        this.oor.AD();
        this.oor.vmM.djO();
        this.oor.ac(true, true);
        this.oor.oH(true);
        this.oor.oI(true);
        this.oor.dkp();
        this.oor.dkq();
        this.oor.vmM.djL();
        this.oor.vmM.djK();
        this.oor.vmM.djM();
        this.oor.vmM.djP();
      }
      AppMethodBeat.o(31429);
      return;
      bool3 = ((com.tencent.mm.ui.chatting.c.b.z)this.cgL.aF(com.tencent.mm.ui.chatting.c.b.z.class)).dET();
      bool2 = ((com.tencent.mm.ui.chatting.c.b.z)this.cgL.aF(com.tencent.mm.ui.chatting.c.b.z.class)).dES();
      if ((bool3) || (bool2))
      {
        com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.ChattingUI.FootComponent", "match shake, in search mode, do not open short video recode view");
        i = 0;
        break;
      }
      if ((ad.aow(this.cgL.getTalkerUserName())) || (ad.mR(this.cgL.getTalkerUserName())))
      {
        com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.ChattingUI.FootComponent", "match shake, but is Qcontact or Bcontact");
        i = 0;
        break;
      }
      if (com.tencent.mm.model.t.nI(this.cgL.getTalkerUserName()))
      {
        i = 0;
        break;
      }
      i = 1;
      break;
      label1782: localObject = com.tencent.mm.aj.z.aeR().qQ(((com.tencent.mm.aj.d)localObject).field_enterpriseFather);
      if ((localObject != null) && (((Cursor)localObject).getCount() > 0));
      for (i = 1; ; i = 0)
      {
        j = i;
        if (localObject == null)
          break;
        ((Cursor)localObject).close();
        j = i;
        break;
      }
      this.oor.vmM.djK();
      this.oor.ac(true, true);
      this.oor.dkn();
      this.oor.vmM.djL();
      break label777;
      i = 0;
      break label802;
      this.oor.oH(true);
      break label814;
      bool2 = false;
      break label1288;
    }
  }

  private void dDZ()
  {
    AppMethodBeat.i(31420);
    if (this.cgL.yTx.isCurrentActivity)
      AppMethodBeat.o(31420);
    while (true)
    {
      return;
      this.cgL.yTz.dCz();
      if (this.oor != null)
      {
        ChatFooter localChatFooter = this.oor;
        Object localObject = localChatFooter.findViewById(2131822409);
        if (localObject != null)
          ((View)localObject).setVisibility(8);
        localChatFooter.setSwitchButtonMode(0);
        localChatFooter.mHandler.removeMessages(1002);
        if (localChatFooter.vmS != null)
          localChatFooter.vmS.setVisibility(8);
        if (localChatFooter.vmT != null)
          localChatFooter.vmT.setVisibility(8);
        if (localChatFooter.vmU != null)
          localChatFooter.vmU.setVisibility(8);
        if (localChatFooter.miF != null)
          localChatFooter.miF.setVisibility(8);
        localChatFooter.oik.setVisibility(8);
        if (localChatFooter.miI != null)
          localChatFooter.miI.setVisibility(8);
        if (localChatFooter.miJ != null)
          localChatFooter.miJ.setVisibility(8);
        if (localChatFooter.miG != null)
          localChatFooter.miG.setVisibility(8);
        if (localChatFooter.viY != null)
        {
          localChatFooter.viY.setVisibility(8);
          localChatFooter.vjb = false;
          localChatFooter.viY.destroy();
          if (localChatFooter.oij != null)
            localChatFooter.oij.setVisibility(0);
        }
        if (localChatFooter.miF != null)
          localChatFooter.miF.setVisibility(8);
        if (localChatFooter.sze != null)
          localChatFooter.sze.setVisibility(8);
        if (localChatFooter.szb != null)
          localChatFooter.szb.update();
        if (localChatFooter.vmN != null)
          localChatFooter.vmN.setVisibility(8);
        if (localChatFooter.vmQ != null)
          localChatFooter.vmQ.setVisibility(8);
        localChatFooter.vmM = ((AppPanel)localChatFooter.findViewById(2131822423));
        if (localChatFooter.vmM != null)
        {
          localChatFooter.setAppPanelVisible(8);
          localObject = localChatFooter.vmM;
          if (((AppPanel)localObject).qgO != null)
            ((AppPanel)localObject).qgO.setToScreen(0);
        }
        if (localChatFooter.eAk != null)
        {
          localChatFooter.eAk.destroy();
          localChatFooter.vmQ.removeView(localChatFooter.eAk);
          localChatFooter.eAk = null;
        }
        localChatFooter.dkC();
        localChatFooter = this.oor;
        if (!bo.ac(localChatFooter.oij.getText()))
          localChatFooter.oij.setText("");
        localChatFooter.oP(false);
        localChatFooter.dka();
        this.oor.vna.voc = null;
      }
      AppMethodBeat.o(31420);
    }
  }

  private void dEe()
  {
    AppMethodBeat.i(31424);
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.ChattingUI.FootComponent", "[goneFooter] %s", new Object[] { bo.dpG() });
    if (this.oor != null)
      this.oor.setVisibility(8);
    if (this.yPH != null)
      this.yPH.setVisibility(8);
    this.oor.oP(false);
    this.cgL.aqX();
    AppMethodBeat.o(31424);
  }

  public final void a(int paramInt, com.tencent.mm.sdk.e.n paramn, Object paramObject)
  {
    AppMethodBeat.i(31431);
    if (paramObject != null)
      paramObject.equals("");
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.ChattingUI.FootComponent", "onNotifyChange obj %s talker %s", new Object[] { paramObject, this.cgL.getTalkerUserName() });
    if (paramObject.equals(this.cgL.getTalkerUserName()))
    {
      arm(this.cgL.getTalkerUserName());
      dEh();
    }
    AppMethodBeat.o(31431);
  }

  public final void a(String paramString, com.tencent.mm.sdk.e.m paramm)
  {
    AppMethodBeat.i(31432);
    if (paramString != null)
      paramString.equals("");
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.ChattingUI.FootComponent", "onNotifyChange obj %s talker %s", new Object[] { paramString, this.cgL.getTalkerUserName() });
    if (com.tencent.mm.model.t.mP(this.cgL.getTalkerUserName()))
    {
      arm(this.cgL.getTalkerUserName());
      dEh();
    }
    AppMethodBeat.o(31432);
  }

  public final boolean ae(ad paramad)
  {
    boolean bool1 = true;
    AppMethodBeat.i(31427);
    boolean bool2 = ((com.tencent.mm.ui.chatting.c.b.z)this.cgL.aF(com.tencent.mm.ui.chatting.c.b.z.class)).dET();
    boolean bool3 = ((com.tencent.mm.ui.chatting.c.b.z)this.cgL.aF(com.tencent.mm.ui.chatting.c.b.z.class)).dES();
    boolean bool4 = ((com.tencent.mm.ui.chatting.c.b.i)this.cgL.aF(com.tencent.mm.ui.chatting.c.b.i.class)).dDN();
    boolean bool5 = ((com.tencent.mm.ui.chatting.c.b.n)this.cgL.aF(com.tencent.mm.ui.chatting.c.b.n.class)).dDW();
    if ((bool2) || (bool3) || (bool4) || (bool5))
    {
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.ChattingUI.FootComponent", bool2 + ", " + bool3 + ", " + bool4 + ", " + bool5);
      dEe();
      AppMethodBeat.o(31427);
      bool2 = false;
    }
    com.tencent.mm.ui.chatting.c.b.d locald;
    Object localObject;
    while (true)
    {
      return bool2;
      if ((paramad != null) && (com.tencent.mm.model.t.mV(paramad.field_username)))
      {
        this.yPL = new com.tencent.mm.ui.chatting.h(this.yPH);
        this.yPL.ctT();
        dEc();
        AppMethodBeat.o(31427);
        bool2 = bool1;
      }
      else
      {
        if ((paramad == null) || (!paramad.dsf()))
          break label462;
        locald = (com.tencent.mm.ui.chatting.c.b.d)this.cgL.aF(com.tencent.mm.ui.chatting.c.b.d.class);
        if (locald.dDj() == null)
          break label462;
        localObject = locald.dDj().cJ(false);
        if (localObject == null)
          break;
        if (((d.b)localObject).fvc != null)
          ((d.b)localObject).fve = "1".equals(((d.b)localObject).fvc.optString("IsHideInputToolbarInMsg"));
        if (!((d.b)localObject).fve)
          break;
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.ChattingUI.FootComponent", "bizinfo name=" + paramad.field_username + " is hide tool bar");
        dEe();
        AppMethodBeat.o(31427);
        bool2 = false;
      }
    }
    int i;
    if ((!bo.isNullOrNil(paramad.field_username)) && (localObject != null))
    {
      i = this.cgL.yTx.getIntExtra("key_temp_session_show_type", 0);
      switch (((d.b)localObject).aeh())
      {
      default:
        dEd();
        paramad = paramad.field_username;
        if (localObject == null)
          break;
      case 2:
      }
    }
    for (bool2 = true; ; bool2 = false)
    {
      com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.ChattingUI.FootComponent", "bizinfo name=%s, %b, %d", new Object[] { paramad, Boolean.valueOf(bool2), Integer.valueOf(((d.b)localObject).aeh()) });
      while (true)
      {
        label462: AppMethodBeat.o(31427);
        bool2 = bool1;
        break;
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.ChattingUI.FootComponent", "bizinfo name=" + paramad.field_username + " is show custom menu");
        if (this.yPH == null)
        {
          i.a(this.cgL.yTx, 2131822392);
          this.yPH = ((ChatFooterCustom)this.cgL.findViewById(2131822433));
          if (this.yPH != null)
            this.yPH.u((ViewGroup)this.cgL.findViewById(2131822377));
        }
        localObject = ((d.b)localObject).aeo();
        if ((localObject != null) && (((d.b.c)localObject).type == 1))
        {
          this.oor.setSwitchButtonMode(1);
          this.oor.setOnFooterSwitchListener(((com.tencent.mm.ui.chatting.c.b.d)this.cgL.aF(com.tencent.mm.ui.chatting.c.b.d.class)).dDq());
          dEd();
        }
        else
        {
          this.oor.setSwitchButtonMode(0);
          try
          {
            if (!com.tencent.mm.model.t.mU(paramad.field_username))
              break label725;
            paramad = new com/tencent/mm/ui/chatting/w;
            paramad.<init>(this.yPH);
            this.yPK = paramad;
            this.yPK.ctT();
            dEc();
          }
          catch (Exception paramad)
          {
            if (localObject == null)
              break label705;
          }
        }
      }
      if ((((d.b.c)localObject).fvL == null) || (((d.b.c)localObject).fvL.size() == 0))
        label705: dEd();
      while (true)
      {
        com.tencent.mm.sdk.platformtools.ab.printErrStackTrace("MicroMsg.ChattingUI.FootComponent", paramad, "", new Object[0]);
        break;
        label725: ChatFooterCustom localChatFooterCustom = this.yPH;
        if ((localChatFooterCustom.yHx != null) && (localChatFooterCustom.yHw != null))
        {
          localChatFooterCustom.yHx.setVisibility(0);
          localChatFooterCustom.yHw.setVisibility(0);
        }
        if (localChatFooterCustom.yHy != null)
          localChatFooterCustom.yHy.dBX();
        this.yPH.setTalker(this.cgL.sRl);
        this.yPH.a(this.cgL.yTx, locald.dDj(), paramad.field_username);
        this.yPH.setOnFooterSwitchListener(this.vmZ);
        this.yPH.setOnProcessClickListener(((com.tencent.mm.ui.chatting.c.b.d)this.cgL.aF(com.tencent.mm.ui.chatting.c.b.d.class)).dDp());
        this.oor.setOnFooterSwitchListener(this.vmZ);
        if ((((com.tencent.mm.ui.chatting.c.b.v)this.cgL.aF(com.tencent.mm.ui.chatting.c.b.v.class)).dEL()) && (i == 1))
        {
          dEd();
          break;
        }
        dEc();
        break;
        this.vmZ.oS(true);
      }
    }
  }

  public final ChatFooter dDX()
  {
    return this.oor;
  }

  public final ChatFooterCustom dDY()
  {
    return this.yPH;
  }

  public final void dDh()
  {
    AppMethodBeat.i(31436);
    super.dDh();
    if (this.oor != null)
    {
      this.oor.setFooterEventListener(null);
      this.yPG = null;
      this.oor.setSmileyPanelCallback(null);
      this.oor.setSmileyPanelCallback2(null);
    }
    if (this.yPH != null)
    {
      this.yPH.ctm();
      this.yPH = null;
    }
    dDZ();
    if (this.yPH != null)
      this.yPH.dBU();
    com.tencent.mm.pluginsdk.ui.e.j.clearCache();
    if (this.oor != null)
    {
      ChatFooter localChatFooter = this.oor;
      if (localChatFooter.vmX != null)
      {
        localChatFooter.vmX.voJ = false;
        localChatFooter.vmX.hide();
      }
    }
    if ((this.cgL.yTx.isCurrentActivity) && (this.oor != null))
      this.oor.destroy();
    com.tencent.mm.kernel.g.RQ();
    ((com.tencent.mm.plugin.messenger.foundation.a.j)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XM().b(this);
    ((PluginOpenIM)com.tencent.mm.kernel.g.M(PluginOpenIM.class)).getWordingInfoStg().d(this);
    AppMethodBeat.o(31436);
  }

  public final String dEa()
  {
    return this.yPN;
  }

  public final void dEb()
  {
    AppMethodBeat.i(31421);
    try
    {
      if (this.oor.dky())
        this.oor.setBottomPanelVisibility(8);
      AppMethodBeat.o(31421);
      return;
    }
    catch (Exception localException)
    {
      while (true)
        AppMethodBeat.o(31421);
    }
  }

  public final void dEc()
  {
    AppMethodBeat.i(31422);
    this.cgL.aqX();
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.ChattingUI.FootComponent", "visibleCustomFooter customFooter is %s", new Object[] { this.yPH });
    if (this.yPH == null)
      AppMethodBeat.o(31422);
    while (true)
    {
      return;
      this.yPH.setVisibility(0);
      if (this.oor != null)
        this.oor.setVisibility(8);
      AppMethodBeat.o(31422);
    }
  }

  public final void dEd()
  {
    AppMethodBeat.i(31423);
    if (this.oor == null)
      AppMethodBeat.o(31423);
    while (true)
    {
      return;
      this.oor.setVisibility(0);
      if (this.yPH != null)
        this.yPH.setVisibility(8);
      AppMethodBeat.o(31423);
    }
  }

  public final void dEf()
  {
    AppMethodBeat.i(31425);
    this.yPM = new AnimationSet(false);
    TranslateAnimation localTranslateAnimation = new TranslateAnimation(2, 0.0F, 2, 0.0F, 1, 1.0F, 1, 0.0F);
    AlphaAnimation localAlphaAnimation = new AlphaAnimation(0.0F, 1.0F);
    this.yPM.setInterpolator(new DecelerateInterpolator(1.5F));
    this.yPM.addAnimation(localTranslateAnimation);
    this.yPM.addAnimation(localAlphaAnimation);
    this.yPM.setDuration(300L);
    this.yPM.setFillBefore(true);
    if (this.oor != null)
      this.oor.startAnimation(this.yPM);
    AppMethodBeat.o(31425);
  }

  public final void dEg()
  {
    AppMethodBeat.i(31426);
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.ChattingUI.FootComponent", "triggerFooter, originChatFooterVisibility:%s", new Object[] { Integer.valueOf(this.yPO) });
    if (this.oor == null)
    {
      this.oor = ((ChatFooter)this.cgL.findViewById(2131822391));
      this.oor.vnq = new q.3(this);
    }
    if ((((com.tencent.mm.ui.chatting.c.b.i)this.cgL.aF(com.tencent.mm.ui.chatting.c.b.i.class)).dDN()) || (com.tencent.mm.ui.widget.snackbar.b.aFF()))
    {
      if (!this.yPQ)
        this.yPO = this.oor.getVisibility();
      this.oor.u(0, -1, false);
      if (this.yPH != null)
      {
        if (!this.yPQ)
          this.yPP = this.yPH.getVisibility();
        dEe();
        this.yPQ = true;
        AppMethodBeat.o(31426);
      }
    }
    while (true)
    {
      return;
      this.yPP = -1;
      break;
      this.yPQ = false;
      if ((this.yPO == 8) && (this.yPP == 8))
      {
        dEe();
        AppMethodBeat.o(31426);
      }
      else if (this.yPO == 0)
      {
        dEd();
        AppMethodBeat.o(31426);
      }
      else
      {
        dEc();
        AppMethodBeat.o(31426);
      }
    }
  }

  public final void dEh()
  {
    AppMethodBeat.i(31428);
    String str = this.cgL.getTalkerUserName();
    int i;
    if ((com.tencent.mm.model.t.ne(str)) || (ad.aou(str)))
    {
      i = 1;
      if (i != 2)
        break label338;
      boolean bool = com.tencent.mm.pluginsdk.permission.b.a(this.cgL.yTx.getContext(), "android.permission.RECORD_AUDIO", 80, "", "");
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.ChattingUI.FootComponent", "summerper checkPermission checkmicrophone[%b], stack[%s], activity[%s]", new Object[] { Boolean.valueOf(bool), bo.dpG(), this.cgL.yTx.getContext() });
      if (bool)
        this.oor.az(i, false);
      AppMethodBeat.o(31428);
    }
    while (true)
    {
      return;
      if (com.tencent.mm.model.t.nv(str))
      {
        i = 2;
        break;
      }
      int j = this.cgL.yTx.getIntExtra("Chat_Mode", 0);
      com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.ChattingUI.FootComponent", "dkcm getChatMode old:%d intent:%d ", new Object[] { Integer.valueOf(this.yPI), Integer.valueOf(j) });
      if (this.yPI != 0)
        j = this.yPI;
      str = com.tencent.mm.m.g.Nu().getValue("DefaultMsgType");
      i = j;
      if (this.yPI == 0)
      {
        i = j;
        if (str != null)
        {
          com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.ChattingUI.FootComponent", "config def chatmode is %s", new Object[] { str });
          i = bo.getInt(com.tencent.mm.m.g.Nu().getValue("DefaultMsgType"), 0);
        }
      }
      j = i;
      if (i == 0)
      {
        j = i;
        if (com.tencent.mm.n.a.jh(this.cgL.sRl.field_type))
        {
          aw.ZK();
          j = ((Integer)com.tencent.mm.model.c.Ry().get(18, Integer.valueOf(0))).intValue();
        }
      }
      i = j;
      if (j == 0)
        i = 1;
      com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.ChattingUI.FootComponent", "dkcm getChatMode old:%d intent:%d ", new Object[] { Integer.valueOf(this.yPI), Integer.valueOf(i) });
      break;
      label338: this.oor.az(i, false);
      AppMethodBeat.o(31428);
    }
  }

  public final void dxA()
  {
    AppMethodBeat.i(31438);
    this.yPN = this.cgL.yTx.getStringExtra("smiley_product_id");
    if (this.oor.dkD())
      ((com.tencent.mm.ui.chatting.c.b.ab)this.cgL.aF(com.tencent.mm.ui.chatting.c.b.ab.class)).keepSignalling();
    if ((com.tencent.mm.model.t.nc(this.cgL.getTalkerUserName())) && (this.yPJ != null) && (this.yPJ.yJZ))
      this.yPJ.dCs();
    Object localObject1 = this.oor;
    Object localObject2 = this.cgL.yTx;
    ((ChatFooter)localObject1).vnp = ((MMFragment)localObject2);
    if (!((ChatFooter)localObject1).vjb)
      ((ChatFooter)localObject1).findViewById(2131822408).setVisibility(0);
    ((ChatFooter)localObject1).a(((MMFragment)localObject2).getContext(), ((MMFragment)localObject2).thisActivity());
    ((ChatFooter)localObject1).vnV = true;
    if ((!bo.isNullOrNil(this.yPN)) && (this.oor != null))
    {
      com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.ChattingUI.FootComponent", "deal use smiley panel in product: %s", new Object[] { this.yPN });
      this.oor.setDefaultSmileyByDetail(this.yPN);
      this.oor.dkh();
    }
    this.cgL.yTx.getContext().getIntent().putExtra("smiley_product_id", "");
    this.oor.setUserName(this.cgL.getTalkerUserName());
    ChatFooter localChatFooter = this.oor;
    localObject1 = this.cgL.dFu();
    localObject2 = this.cgL.getTalkerUserName();
    localChatFooter.cEV = ((String)localObject1);
    localChatFooter.toUser = ((String)localObject2);
    if (this.cgL.yTx.getBooleanExtra("key_show_bottom_app_panel", false).booleanValue())
    {
      localObject1 = this.oor;
      ((ChatFooter)localObject1).dkf();
      if (((ChatFooter)localObject1).vmS != null)
      {
        ((ChatFooter)localObject1).vmS.performClick();
        com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.ChatFooter", "perform click attach bt to show bottom panel");
      }
    }
    if (ae(this.cgL.sRl))
    {
      if (this.oor != null)
      {
        aw.ZK();
        bool1 = ((Boolean)com.tencent.mm.model.c.Ry().get(66832, Boolean.FALSE)).booleanValue();
        com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.ChattingUI.FootComponent", "jacks refresh Footer Plugin Setting , Enable Enter Button: %B", new Object[] { Boolean.valueOf(bool1) });
        this.oor.dkE();
        if (bool1)
        {
          this.oor.dkt();
          this.oor.dkd();
        }
        if (bool1)
          this.oor.dkl();
        localObject1 = this.oor;
        if (((ChatFooter)localObject1).vmM != null)
          ((ChatFooter)localObject1).vmM.djJ();
      }
      ((ae)this.cgL.aF(ae.class)).dDS();
      if (this.oor != null)
      {
        this.oor.vmM.refresh();
        this.oor.addTextChangedListener(new a((byte)0));
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.ChattingUI.FootComponent", "addTextChangedListener");
      }
    }
    boolean bool2 = ((com.tencent.mm.ui.chatting.c.b.z)this.cgL.aF(com.tencent.mm.ui.chatting.c.b.z.class)).dET();
    boolean bool1 = ((com.tencent.mm.ui.chatting.c.b.z)this.cgL.aF(com.tencent.mm.ui.chatting.c.b.z.class)).dES();
    boolean bool3 = ((com.tencent.mm.ui.chatting.c.b.i)this.cgL.aF(com.tencent.mm.ui.chatting.c.b.i.class)).dDN();
    if ((!bool2) && (!bool1) && (!bool3) && (this.cgL.sRl != null) && (!this.cgL.sRl.dsf()) && (!com.tencent.mm.model.t.nF(this.cgL.getTalkerUserName())) && (!com.tencent.mm.ui.widget.snackbar.b.aFF()) && (!com.tencent.mm.model.t.mV(this.cgL.getTalkerUserName())))
    {
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.ChattingUI.FootComponent", "call visibleFooter again.");
      dEd();
      AppMethodBeat.o(31438);
    }
    while (true)
    {
      return;
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.ChattingUI.FootComponent", "no call visibleFooter again.");
      AppMethodBeat.o(31438);
    }
  }

  public final void dxB()
  {
    AppMethodBeat.i(31439);
    Object localObject;
    if (this.oor != null)
    {
      localObject = this.oor;
      if (((ChatFooter)localObject).vnw != null)
      {
        ((ChatFooter)localObject).oij.removeTextChangedListener(((ChatFooter)localObject).vnw);
        ((ChatFooter)localObject).vnw = null;
      }
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.ChattingUI.FootComponent", "removeTextChangeListener");
      this.oor.onPause();
      if (com.tencent.mm.kernel.g.RK())
        break label86;
      com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.ChattingUI.FootComponent", "account not ready");
      AppMethodBeat.o(31439);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(31439);
      continue;
      label86: aw.ZK();
      com.tencent.mm.model.c.Ry().set(18, Integer.valueOf(this.oor.getMode()));
      com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.ChattingUI.FootComponent", "dkcm old:%d footer:%d ", new Object[] { Integer.valueOf(this.yPI), Integer.valueOf(this.oor.getMode()) });
      if (this.yPI != this.oor.getMode())
      {
        this.yPI = this.oor.getMode();
        aw.ZK();
        localObject = com.tencent.mm.model.c.XR().aoZ(this.cgL.getTalkerUserName());
        if ((localObject != null) && (this.cgL.getTalkerUserName().equals(((at)localObject).field_username)))
        {
          ((com.tencent.mm.storage.ak)localObject).hN(this.yPI);
          aw.ZK();
          com.tencent.mm.model.c.XR().a((com.tencent.mm.storage.ak)localObject, this.cgL.getTalkerUserName());
        }
      }
      this.oor.bvH();
      AppMethodBeat.o(31439);
    }
  }

  public final void dxC()
  {
  }

  public final void dxy()
  {
    AppMethodBeat.i(31437);
    this.yPR = false;
    this.yPS = false;
    this.yPT = 0L;
    aw.ZK();
    Object localObject1 = com.tencent.mm.model.c.XR().aoZ(this.cgL.getTalkerUserName());
    if (localObject1 != null)
      this.yPI = ((at)localObject1).field_chatmode;
    com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.ChattingUI.FootComponent", "dkcm init old:%d   ", new Object[] { Integer.valueOf(this.yPI) });
    localObject1 = this.cgL.getTalkerUserName();
    if (this.oor == null)
    {
      this.oor = ((ChatFooter)this.cgL.findViewById(2131822391));
      this.oor.vnq = new q.4(this);
    }
    this.oor.setCattingRootLayoutId(2131821521);
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.ChattingUI.FootComponent", "resetFooter customFooter is %s", new Object[] { this.yPH });
    if (this.yPH != null)
    {
      this.yPH.ctm();
      this.yPH.setOnFooterSwitchListener(null);
      this.yPH.setOnProcessClickListener(null);
      this.oor.setOnFooterSwitchListener(null);
      this.yPH.dBU();
    }
    dEe();
    this.oor.dkk();
    boolean bool1 = ((com.tencent.mm.ui.chatting.c.b.z)this.cgL.aF(com.tencent.mm.ui.chatting.c.b.z.class)).dET();
    boolean bool2 = ((com.tencent.mm.ui.chatting.c.b.z)this.cgL.aF(com.tencent.mm.ui.chatting.c.b.z.class)).dES();
    int i;
    if ((bool1) || (bool2))
    {
      dEe();
      dDZ();
      this.yPG = new com.tencent.mm.ui.chatting.p(this.cgL, this.oor, this.cgL.getTalkerUserName());
      this.yPG.yJj = this.cgL.yTx.getBooleanExtra("key_need_send_video", true).booleanValue();
      this.oor.setFooterEventListener(this.yPG);
      localObject1 = new com.tencent.mm.ui.chatting.v(this.cgL.yTx.getContext(), this.cgL.sRl, this.cgL.getTalkerUserName());
      this.oor.setSmileyPanelCallback((com.tencent.mm.pluginsdk.ui.chat.f)localObject1);
      this.oor.setSmileyPanelCallback2((com.tencent.mm.pluginsdk.ui.chat.j)localObject1);
      dEh();
      this.oor.dkd();
      i = this.cgL.yTx.getIntExtra("key_temp_session_show_type", 0);
      localObject1 = (com.tencent.mm.ui.chatting.c.b.v)this.cgL.aF(com.tencent.mm.ui.chatting.c.b.v.class);
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.ChattingUI.FootComponent", "isTempSession : %s, showType : %d.", new Object[] { Boolean.valueOf(((com.tencent.mm.ui.chatting.c.b.v)localObject1).dEL()), Integer.valueOf(i) });
      com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.ChattingUI.FootComponent", "is temp session : %s.", new Object[] { Boolean.valueOf(((com.tencent.mm.ui.chatting.c.b.v)localObject1).dEL()) });
      if (((com.tencent.mm.ui.chatting.c.b.v)localObject1).dEL())
      {
        if (i != 1)
          break label1518;
        this.vmZ.oS(true);
      }
    }
    while (true)
    {
      ae(this.cgL.sRl);
      com.tencent.mm.kernel.g.RQ();
      ((com.tencent.mm.plugin.messenger.foundation.a.j)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XM().a(this);
      ((PluginOpenIM)com.tencent.mm.kernel.g.M(PluginOpenIM.class)).getWordingInfoStg().c(this);
      AppMethodBeat.o(31437);
      return;
      if (com.tencent.mm.model.t.nc((String)localObject1))
      {
        dEe();
        i.a(this.cgL.yTx, 2131822392);
        if (this.yPH == null)
        {
          i = 1;
          this.yPH = ((ChatFooterCustom)this.cgL.findViewById(2131822433));
          if (i != 0)
            this.yPH.u((ViewGroup)this.cgL.findViewById(2131822377));
          this.yPJ = new com.tencent.mm.ui.chatting.t(this.yPH);
          localObject1 = this.yPJ;
          if (com.tencent.mm.sdk.platformtools.g.cdf != 1)
            break label849;
          i = 1;
          label659: ((com.tencent.mm.ui.chatting.t)localObject1).yJS.findViewById(2131822434).setVisibility(8);
          ((com.tencent.mm.ui.chatting.t)localObject1).lfQ = ((LinearLayout)((com.tencent.mm.ui.chatting.t)localObject1).yJS.findViewById(2131822436));
          ((com.tencent.mm.ui.chatting.t)localObject1).yJS.findViewById(2131822437).setVisibility(8);
          localObject2 = ((com.tencent.mm.ui.chatting.t)localObject1).lfQ;
          if (i == 0)
            break label855;
        }
        label849: label855: for (float f = 1.0F; ; f = 2.0F)
        {
          ((LinearLayout)localObject2).setWeightSum(f);
          ((com.tencent.mm.ui.chatting.t)localObject1).yJT = ((FrameLayout)((com.tencent.mm.ui.chatting.t)localObject1).lfQ.getChildAt(0));
          ((com.tencent.mm.ui.chatting.t)localObject1).yJT.setVisibility(0);
          ((com.tencent.mm.ui.chatting.t)localObject1).yJT.setOnClickListener(((com.tencent.mm.ui.chatting.t)localObject1).yKc);
          ((TextView)((com.tencent.mm.ui.chatting.t)localObject1).yJT.findViewById(2131822432)).setText(2131298043);
          ((com.tencent.mm.ui.chatting.t)localObject1).yJT.findViewById(2131822431).setVisibility(8);
          ((com.tencent.mm.ui.chatting.t)localObject1).yJT.getChildAt(2).setVisibility(8);
          if (i == 0)
            break label861;
          for (i = 1; i < 6; i++)
            ((com.tencent.mm.ui.chatting.t)localObject1).lfQ.getChildAt(i).setVisibility(8);
          i = 0;
          break;
          i = 0;
          break label659;
        }
        label861: ((com.tencent.mm.ui.chatting.t)localObject1).yJU = ((FrameLayout)((com.tencent.mm.ui.chatting.t)localObject1).lfQ.getChildAt(1));
        ((com.tencent.mm.ui.chatting.t)localObject1).yJU.setVisibility(0);
        ((com.tencent.mm.ui.chatting.t)localObject1).yJU.setOnClickListener(((com.tencent.mm.ui.chatting.t)localObject1).yKd);
        ((com.tencent.mm.ui.chatting.t)localObject1).yJV = ((TextView)((com.tencent.mm.ui.chatting.t)localObject1).yJU.findViewById(2131822432));
        ((com.tencent.mm.ui.chatting.t)localObject1).yJW = ((ImageView)((com.tencent.mm.ui.chatting.t)localObject1).yJU.findViewById(2131822431));
        ((com.tencent.mm.ui.chatting.t)localObject1).yJW.setVisibility(0);
        ((com.tencent.mm.ui.chatting.t)localObject1).dCr();
        aw.ZK();
        ((com.tencent.mm.ui.chatting.t)localObject1).yJY = ((Integer)com.tencent.mm.model.c.Ry().get(ac.a.xJW, Integer.valueOf(-1))).intValue();
        if (((com.tencent.mm.ui.chatting.t)localObject1).yJY >= 0)
          ((com.tencent.mm.ui.chatting.t)localObject1).dCt();
        while (true)
        {
          ((com.tencent.mm.ui.chatting.t)localObject1).yJU.getChildAt(2).setVisibility(8);
          for (i = 2; i < 6; i++)
            ((com.tencent.mm.ui.chatting.t)localObject1).lfQ.getChildAt(i).setVisibility(8);
          ((com.tencent.mm.ui.chatting.t)localObject1).yJV.setText(2131298056);
        }
        ((com.tencent.mm.ui.chatting.t)localObject1).yKb = com.tencent.mm.m.g.Nv().getMailAppEnterUlAndroid();
        if (bo.isNullOrNil(((com.tencent.mm.ui.chatting.t)localObject1).yKb))
          ((com.tencent.mm.ui.chatting.t)localObject1).yKb = "qqmail://folderlist?app=weixin&action=list&uin=$uin$";
        aw.ZK();
        localObject2 = new com.tencent.mm.a.p(bo.h((Integer)com.tencent.mm.model.c.Ry().get(9, null))).toString();
        ((com.tencent.mm.ui.chatting.t)localObject1).yKb = ((com.tencent.mm.ui.chatting.t)localObject1).yKb.replace("$uin$", (CharSequence)localObject2);
        ((com.tencent.mm.ui.chatting.t)localObject1).pzJ = com.tencent.mm.m.g.Nv().Nm();
        ((com.tencent.mm.ui.chatting.t)localObject1).yJZ = true;
        dEc();
        break;
      }
      this.yPJ = null;
      if (com.tencent.mm.model.t.mU((String)localObject1))
      {
        dEe();
        i.a(this.cgL.yTx, 2131822392);
        if (this.yPH == null);
        for (i = 1; ; i = 0)
        {
          this.yPH = ((ChatFooterCustom)this.cgL.findViewById(2131822433));
          if (i != 0)
            this.yPH.u((ViewGroup)this.cgL.findViewById(2131822377));
          this.yPK = new w(this.yPH);
          this.yPK.ctT();
          dEc();
          break;
        }
      }
      this.yPK = null;
      if (com.tencent.mm.model.t.mV((String)localObject1))
      {
        dEe();
        i.a(this.cgL.yTx, 2131822392);
        if (this.yPH == null);
        for (i = 1; ; i = 0)
        {
          this.yPH = ((ChatFooterCustom)this.cgL.findViewById(2131822433));
          if (i != 0)
            this.yPH.u((ViewGroup)this.cgL.findViewById(2131822377));
          this.yPL = new com.tencent.mm.ui.chatting.h(this.yPH);
          this.yPL.ctT();
          dEc();
          break;
        }
      }
      this.yPL = null;
      if ((!com.tencent.mm.model.t.nd((String)localObject1)) && (!com.tencent.mm.model.t.mU((String)localObject1)) && (!com.tencent.mm.model.t.nc((String)localObject1)) && (!com.tencent.mm.model.t.mV((String)localObject1)))
      {
        com.tencent.mm.model.t.Zj();
        if (!com.tencent.mm.model.t.nD((String)localObject1));
      }
      else
      {
        dEe();
        break;
      }
      dEd();
      ae(this.cgL.sRl);
      this.oor.setUserName((String)localObject1);
      arm((String)localObject1);
      Object localObject2 = (com.tencent.mm.ui.chatting.c.b.i)this.cgL.aF(com.tencent.mm.ui.chatting.c.b.i.class);
      localObject1 = (com.tencent.mm.ui.chatting.c.b.z)this.cgL.aF(com.tencent.mm.ui.chatting.c.b.z.class);
      if (!((com.tencent.mm.ui.chatting.c.b.i)localObject2).dDN())
        break;
      if (((com.tencent.mm.ui.chatting.c.b.z)localObject1).dEQ())
      {
        ((com.tencent.mm.ui.chatting.c.b.z)localObject1).dEP();
        ((com.tencent.mm.ui.chatting.c.b.i)localObject2).dDO();
        break;
      }
      ((com.tencent.mm.ui.chatting.c.b.i)localObject2).dDL();
      break;
      label1518: this.vmZ.oS(false);
    }
  }

  public final void dxz()
  {
  }

  public final void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(31433);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if ((1111 == paramInt1) && (-1 == paramInt2))
      this.oor.dkh();
    if (paramInt2 != -1)
    {
      if ((paramInt1 == 200) || (paramInt1 == 201) || (paramInt1 == 203))
        this.oor.clearFocus();
      AppMethodBeat.o(31433);
      return;
    }
    if ((paramInt1 != 217) && (this.yPH != null))
      this.yPH.r(paramInt1, paramIntent);
    switch (paramInt1)
    {
    default:
    case 202:
    }
    while (true)
    {
      AppMethodBeat.o(31433);
      break;
      if (paramIntent == null)
      {
        com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.ChattingUI.FootComponent", "CONTEXT_MENU_WECHAT_GALLERY_IMAGE intent == null");
        AppMethodBeat.o(31433);
        break;
      }
      paramInt1 = paramIntent.getIntExtra("Chat_Mode", 1);
      if (this.oor != null)
        this.oor.setMode(paramInt1);
    }
  }

  public final boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(31435);
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.ChattingUI.FootComponent", "chatting onKeyDown, code:%d action:%d", new Object[] { Integer.valueOf(paramKeyEvent.getKeyCode()), Integer.valueOf(paramKeyEvent.getAction()) });
    int i;
    label66: boolean bool;
    if (paramKeyEvent.getKeyCode() == 4)
      if (!this.cgL.caA)
      {
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.ChattingUI.FootComponent", "onKeyDown back key fragment not foreground");
        i = 0;
        if (i != 0)
          break label406;
        bool = super.onKeyDown(paramInt, paramKeyEvent);
        AppMethodBeat.o(31435);
      }
    while (true)
    {
      return bool;
      if ((this.cgL.yTx.isSupportNavigationSwipeBack()) && (this.cgL.yTx.getSwipeBackLayout().dkx()))
      {
        com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.ChattingUI.FootComponent", "ashutest::onKeyDown back ScrollToFinishing");
        i = 1;
        break label66;
      }
      if (paramKeyEvent.getAction() == 0)
      {
        this.yPR = true;
        this.yPT = System.currentTimeMillis();
      }
      com.tencent.mm.ui.chatting.c.b.i locali;
      if (paramKeyEvent.getAction() == 1)
      {
        com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.ChattingUI.FootComponent", "hasBack %B, %d", new Object[] { Boolean.valueOf(this.yPR), Long.valueOf(System.currentTimeMillis() - this.yPT) });
        if ((!this.yPR) || (System.currentTimeMillis() - this.yPT > 30000L))
        {
          i = 1;
          break label66;
        }
        this.yPS = true;
        locali = (com.tencent.mm.ui.chatting.c.b.i)this.cgL.aF(com.tencent.mm.ui.chatting.c.b.i.class);
        com.tencent.mm.ui.chatting.c.b.z localz = (com.tencent.mm.ui.chatting.c.b.z)this.cgL.aF(com.tencent.mm.ui.chatting.c.b.z.class);
        if (!locali.dDN())
          break label336;
        if (!localz.dEQ())
          break label326;
        localz.dEP();
        locali.dDO();
        label287: i = 1;
        label289: if (i == 0)
        {
          if ((this.oor == null) || (!this.oor.dky()))
            break label341;
          this.oor.u(2, 23, false);
        }
      }
      while (true)
      {
        i = 1;
        break;
        label326: locali.dDL();
        break label287;
        label336: i = 0;
        break label289;
        label341: this.cgL.yTx.dBP();
      }
      if ((paramKeyEvent.getKeyCode() == 67) && (!this.cgL.caA))
      {
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.ChattingUI.FootComponent", "onKeyDown back key fragment not foreground");
        break;
      }
      if (this.cgL.caA)
        break;
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.ChattingUI.FootComponent", "onKeyDown fragment not foreground");
      break;
      label406: AppMethodBeat.o(31435);
      bool = true;
    }
  }

  public final void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    int i = 0;
    AppMethodBeat.i(31434);
    super.onRequestPermissionsResult(paramInt, paramArrayOfString, paramArrayOfInt);
    if ((paramArrayOfInt == null) || (paramArrayOfInt.length <= 0))
    {
      if (paramArrayOfInt == null);
      for (i = -1; ; i = paramArrayOfInt.length)
      {
        com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.ChattingUI.FootComponent", "summerper onRequestPermissionsResult, grantResults length is:%d requestCode:%d, permissions:%s, stack:%s", new Object[] { Integer.valueOf(i), Integer.valueOf(paramInt), paramArrayOfString, bo.dpG() });
        AppMethodBeat.o(31434);
        return;
      }
    }
    switch (paramInt)
    {
    default:
    case 18:
    case 19:
    case 21:
    case 22:
    case 20:
    case 81:
    case 82:
    case 83:
    }
    while (true)
    {
      AppMethodBeat.o(31434);
      break;
      if (paramArrayOfInt[0] == 0)
      {
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.ChattingUI.FootComponent", "summerper doFooterSightRequest,footerEventImpl[%s], stack[%s]", new Object[] { this.yPG, bo.dpG() });
        if (this.yPG != null)
        {
          paramArrayOfString = this.yPG;
          if (!this.oor.vmM.vlP.vmD.value)
            break label248;
        }
        label248: for (paramInt = i; ; paramInt = 2)
        {
          paramArrayOfString.Om(paramInt);
          AppMethodBeat.o(31434);
          break;
        }
      }
      if ("android.permission.CAMERA".equals(paramArrayOfString[0]));
      for (paramInt = 2131301920; ; paramInt = 2131301928)
      {
        if (paramArrayOfInt[0] != 0)
          com.tencent.mm.ui.base.h.a(this.cgL.yTx.getContext(), this.cgL.yTx.getMMResources().getString(paramInt), this.cgL.yTx.getMMResources().getString(2131301936), this.cgL.yTx.getMMResources().getString(2131300878), this.cgL.yTx.getMMResources().getString(2131297773), false, new q.5(this), new q.6(this));
        AppMethodBeat.o(31434);
        break;
      }
      if (paramArrayOfInt[0] == 0)
      {
        if (paramInt == 19)
        {
          com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.ChattingUI.FootComponent", "summerper doVoipMenuVideoSelected,footerEventImpl[%s], stack[%s]", new Object[] { this.yPG, bo.dpG() });
          if (this.yPG != null)
            this.yPG.cbm();
          AppMethodBeat.o(31434);
          break;
        }
        if (paramInt == 21)
        {
          com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.ChattingUI.FootComponent", "summerper doOnVoipRequest,footerEventImpl[%s], stack[%s]", new Object[] { this.yPG, bo.dpG() });
          if (this.yPG != null)
            this.yPG.dCl();
          AppMethodBeat.o(31434);
          break;
        }
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.ChattingUI.FootComponent", "summerper doOnEnterMultiTalk,footerEventImpl[%s], stack[%s]", new Object[] { this.yPG, bo.dpG() });
        if (this.yPG != null)
          this.yPG.dCj();
        AppMethodBeat.o(31434);
        break;
      }
      if ("android.permission.CAMERA".equals(paramArrayOfString[0]));
      for (paramInt = 2131301920; ; paramInt = 2131301928)
      {
        if (paramArrayOfInt[0] != 0)
          com.tencent.mm.ui.base.h.a(this.cgL.yTx.getContext(), this.cgL.yTx.getMMResources().getString(paramInt), this.cgL.yTx.getMMResources().getString(2131301936), this.cgL.yTx.getMMResources().getString(2131300878), this.cgL.yTx.getMMResources().getString(2131297773), false, new q.7(this), new q.8(this));
        AppMethodBeat.o(31434);
        break;
      }
      if (paramArrayOfInt[0] == 0)
      {
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.ChattingUI.FootComponent", "summerper doImageSelectTakePhotoRequest,footerEventImpl[%s], stack[%s]", new Object[] { this.yPG, bo.dpG() });
        if (this.yPG != null)
          this.yPG.dCn();
        AppMethodBeat.o(31434);
        break;
      }
      com.tencent.mm.ui.base.h.a(this.cgL.yTx.getContext(), this.cgL.yTx.getMMResources().getString(2131301920), this.cgL.yTx.getMMResources().getString(2131301936), this.cgL.yTx.getMMResources().getString(2131300878), this.cgL.yTx.getMMResources().getString(2131297773), false, new q.9(this), null);
      AppMethodBeat.o(31434);
      break;
      if (paramArrayOfInt[0] == 0)
      {
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.ChattingUI.FootComponent", "summerper doTalkRoomRequest,footerEventImpl[%s], stack[%s]", new Object[] { this.yPG, bo.dpG() });
        if (this.yPG != null)
          this.yPG.dCm();
        AppMethodBeat.o(31434);
        break;
      }
      com.tencent.mm.ui.base.h.a(this.cgL.yTx.getContext(), this.cgL.yTx.getMMResources().getString(2131301926), this.cgL.yTx.getMMResources().getString(2131301936), this.cgL.yTx.getMMResources().getString(2131300878), this.cgL.yTx.getMMResources().getString(2131297773), false, new q.10(this), null);
      AppMethodBeat.o(31434);
      break;
      if (paramArrayOfInt[0] == 0)
      {
        if (paramInt == 82)
        {
          com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.ChattingUI.FootComponent", "summerper doVoipMenuAudioSelected,footerEventImpl[%s], stack[%s]", new Object[] { this.yPG, bo.dpG() });
          if (this.yPG != null)
            this.yPG.cbl();
          AppMethodBeat.o(31434);
          break;
        }
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.ChattingUI.FootComponent", "summerper doOnVoipAudioRequest,footerEventImpl[%s], stack[%s]", new Object[] { this.yPG, bo.dpG() });
        if (this.yPG != null)
          this.yPG.dCk();
        AppMethodBeat.o(31434);
        break;
      }
      com.tencent.mm.ui.base.h.a(this.cgL.yTx.getContext(), this.cgL.yTx.getMMResources().getString(2131301928), this.cgL.yTx.getMMResources().getString(2131301936), this.cgL.yTx.getMMResources().getString(2131300878), this.cgL.yTx.getMMResources().getString(2131297773), false, new q.2(this), null);
    }
  }

  public final void setVoiceInputShowCallback(ChatFooter.d paramd)
  {
    AppMethodBeat.i(31430);
    this.oor.setVoiceInputShowCallback(paramd);
    AppMethodBeat.o(31430);
  }

  final class a
    implements TextWatcher
  {
    private boolean yPX = false;
    private List<String> yPY = null;

    private a()
    {
    }

    private static boolean eA(String paramString, int paramInt)
    {
      boolean bool = true;
      AppMethodBeat.i(31417);
      if ((paramString == null) || (paramInt < 0) || (paramString.length() <= paramInt))
      {
        bool = false;
        AppMethodBeat.o(31417);
      }
      while (true)
      {
        return bool;
        if (paramInt == 0)
          AppMethodBeat.o(31417);
        else
          AppMethodBeat.o(31417);
      }
    }

    public final void afterTextChanged(Editable paramEditable)
    {
    }

    public final void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
    {
    }

    public final void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
    {
      AppMethodBeat.i(31418);
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.ChattingUI.FootComponent", "[onTextChanged]");
      ((com.tencent.mm.ui.chatting.c.b.ab)q.this.cgL.aF(com.tencent.mm.ui.chatting.c.b.ab.class)).OE(1);
      Object localObject = (com.tencent.mm.ui.chatting.c.b.d)q.this.cgL.aF(com.tencent.mm.ui.chatting.c.b.d.class);
      paramCharSequence = String.valueOf(paramCharSequence);
      String str1 = paramCharSequence.substring(paramInt1, paramInt1 + paramInt3);
      String str2;
      Intent localIntent;
      if ((q.this.cgL.dFw()) && ("@".equals(str1)) && (!paramCharSequence.equals(q.this.oor.getLastContent())) && (!q.this.oor.vnb))
      {
        q.this.oor.setLastContent(paramCharSequence);
        q.this.oor.setInsertPos(paramInt1 + 1);
        if (eA(paramCharSequence, paramInt1))
        {
          str2 = bo.c(com.tencent.mm.model.n.my(q.this.cgL.getTalkerUserName()), ",");
          localIntent = new Intent();
          localIntent.setClass(q.this.cgL.yTx.getContext(), AtSomeoneUI.class);
          localIntent.putExtra("Block_list", r.Yz());
          localIntent.putExtra("Chatroom_member_list", str2);
          localIntent.putExtra("Chat_User", q.this.cgL.getTalkerUserName());
          localIntent.putExtra("Add_address_titile", q.this.cgL.yTx.getMMString(2131302505));
          q.this.cgL.yTx.startActivityForResult(localIntent, 212);
        }
      }
      while (true)
      {
        ((aa)q.this.cgL.aF(aa.class)).z(paramCharSequence, paramInt1, str1);
        if (!((com.tencent.mm.ui.chatting.c.b.d)localObject).dDm())
        {
          localObject = q.this.oor;
          if ((((ChatFooter)localObject).vmX != null) && (((ChatFooter)localObject).oik != null))
          {
            ((ChatFooter)localObject).vmX.voJ = true;
            localObject = ((ChatFooter)localObject).vmX;
            if ((!bo.isNullOrNil(paramCharSequence)) && (!paramCharSequence.equals(((com.tencent.mm.pluginsdk.ui.chat.m)localObject).voI)))
              com.tencent.mm.kernel.g.RS().aa(new m.6((com.tencent.mm.pluginsdk.ui.chat.m)localObject, paramCharSequence));
            ((com.tencent.mm.pluginsdk.ui.chat.m)localObject).voI = paramCharSequence;
          }
        }
        AppMethodBeat.o(31418);
        return;
        if ((((com.tencent.mm.ui.chatting.c.b.d)localObject).dDn()) && ("@".equals(str1)) && (!paramCharSequence.equals(q.this.oor.getLastContent())) && (!q.this.oor.vnb))
        {
          q.this.oor.setLastContent(paramCharSequence);
          q.this.oor.setInsertPos(paramInt1 + 1);
          if (eA(paramCharSequence, paramInt1))
          {
            str2 = ((com.tencent.mm.ui.chatting.c.b.d)localObject).dDk().field_userList;
            localIntent = new Intent();
            localIntent.setClass(q.this.cgL.yTx.getContext(), BizChatAtSomeoneUI.class);
            localIntent.putExtra("Block_list", com.tencent.mm.aj.z.aeV().cI(q.this.cgL.getTalkerUserName()));
            localIntent.putExtra("Chatroom_member_list", str2);
            localIntent.putExtra("Chat_User", q.this.cgL.getTalkerUserName());
            localIntent.putExtra("Add_address_titile", q.this.cgL.yTx.getMMString(2131302505));
            localIntent.putExtra("key_biz_chat_id", ((com.tencent.mm.ui.chatting.c.b.d)q.this.cgL.aF(com.tencent.mm.ui.chatting.c.b.d.class)).dDz());
            q.this.cgL.yTx.startActivityForResult(localIntent, 212);
          }
        }
        else if (!paramCharSequence.equals(q.this.oor.getLastContent()))
        {
          q.this.oor.setLastContent(paramCharSequence);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.c.q
 * JD-Core Version:    0.6.2
 */