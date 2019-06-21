package com.tencent.mm.ui.chatting.c;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Looper;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.aj.a.d.a;
import com.tencent.mm.aj.d.b;
import com.tencent.mm.aj.d.b.c;
import com.tencent.mm.aj.e.a;
import com.tencent.mm.aj.f;
import com.tencent.mm.aj.n;
import com.tencent.mm.aj.z;
import com.tencent.mm.chatroom.ui.ChatroomInfoUI;
import com.tencent.mm.g.a.ed;
import com.tencent.mm.g.a.pm;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.g.c.at;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.ao.a;
import com.tencent.mm.model.ao.b;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.bf;
import com.tencent.mm.model.bh;
import com.tencent.mm.model.t;
import com.tencent.mm.modelsimple.y;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.pluginsdk.ui.chat.ChatFooter;
import com.tencent.mm.pluginsdk.ui.chat.ChatFooter.e;
import com.tencent.mm.protocal.protobuf.bxk;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.be;
import com.tencent.mm.storage.bi;
import com.tencent.mm.storage.q;
import com.tencent.mm.storage.r.a;
import com.tencent.mm.storage.r.b;
import com.tencent.mm.storage.s;
import com.tencent.mm.ui.MMFragment;
import com.tencent.mm.ui.bizchat.BizChatroomInfoUI;
import com.tencent.mm.ui.chatting.BaseChattingUIFragment;
import com.tencent.mm.ui.chatting.ChattingUI;
import com.tencent.mm.ui.chatting.c.b.v;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

@com.tencent.mm.ui.chatting.c.a.a(dFp=com.tencent.mm.ui.chatting.c.b.d.class)
public class c extends a
  implements n, com.tencent.mm.ui.chatting.c.b.d
{
  private bxk fwz;
  public boolean mgP;
  private com.tencent.mm.aj.d pkW;
  private com.tencent.mm.ui.widget.a.c pmG;
  public com.tencent.mm.aj.a.j pmx;
  public com.tencent.mm.aj.a.c yDI;
  private d.a yEn;
  protected final ChatFooter.e yGx;
  protected final c.a yHz;
  private com.tencent.mm.app.plugin.a.a yNW;
  private long yNX;
  private bi yNY;
  public boolean yNZ;
  private long yOa;
  private RelativeLayout yOb;
  private TextView yOc;
  private int yOd;
  private boolean yOe;
  private boolean yOf;
  private e.a yOg;
  private boolean yOh;

  public c()
  {
    AppMethodBeat.i(31208);
    this.yNX = 0L;
    this.mgP = false;
    this.yNZ = false;
    this.yOa = -1L;
    this.pmG = null;
    this.fwz = null;
    this.yHz = new c.1(this);
    this.yGx = new ChatFooter.e()
    {
      public final boolean oS(boolean paramAnonymousBoolean)
      {
        AppMethodBeat.i(31199);
        if (c.c(c.this) == null)
        {
          AppMethodBeat.o(31199);
          paramAnonymousBoolean = false;
        }
        while (true)
        {
          return paramAnonymousBoolean;
          Object localObject1 = c.c(c.this).cJ(false);
          if (localObject1 == null)
          {
            AppMethodBeat.o(31199);
            paramAnonymousBoolean = false;
          }
          else
          {
            localObject1 = ((d.b)localObject1).aeo();
            if ((localObject1 == null) || (((d.b.c)localObject1).fvL == null) || (((d.b.c)localObject1).fvL.isEmpty()))
            {
              AppMethodBeat.o(31199);
              paramAnonymousBoolean = false;
            }
            else
            {
              Object localObject2 = (com.tencent.mm.aj.j)((d.b.c)localObject1).fvL.get(0);
              try
              {
                localObject1 = new org/json/JSONObject;
                ((JSONObject)localObject1).<init>(((com.tencent.mm.aj.j)localObject2).value);
                localObject2 = new com/tencent/mm/plugin/appbrand/report/AppBrandStatObject;
                ((AppBrandStatObject)localObject2).<init>();
                ((AppBrandStatObject)localObject2).scene = 1083;
                ((AppBrandStatObject)localObject2).cst = c.c(c.this).field_username;
                ((com.tencent.mm.plugin.appbrand.service.e)g.K(com.tencent.mm.plugin.appbrand.service.e.class)).a(c.this.cgL.yTx.getContext(), ((JSONObject)localObject1).optString("userName"), null, 0, 0, ((JSONObject)localObject1).optString("pagePath"), (AppBrandStatObject)localObject2, c.c(c.this).field_appId);
                paramAnonymousBoolean = true;
                AppMethodBeat.o(31199);
              }
              catch (JSONException localJSONException)
              {
                AppMethodBeat.o(31199);
                paramAnonymousBoolean = false;
              }
            }
          }
        }
      }
    };
    this.yEn = new c.9(this);
    this.yOe = false;
    this.yOf = false;
    this.yOg = new c.10(this);
    this.yOh = false;
    AppMethodBeat.o(31208);
  }

  private String aI(LinkedList<String> paramLinkedList)
  {
    AppMethodBeat.i(31223);
    if (paramLinkedList.size() <= 0)
    {
      paramLinkedList = null;
      AppMethodBeat.o(31223);
    }
    while (true)
    {
      return paramLinkedList;
      StringBuilder localStringBuilder = new StringBuilder(this.yDI.mJ((String)paramLinkedList.get(0)));
      for (int i = 1; i < paramLinkedList.size(); i++)
        localStringBuilder.append(this.cgL.yTx.getContext().getString(2131298068)).append(this.yDI.mJ((String)paramLinkedList.get(i)));
      paramLinkedList = localStringBuilder.toString();
      AppMethodBeat.o(31223);
    }
  }

  public static boolean aU(Intent paramIntent)
  {
    boolean bool1 = true;
    AppMethodBeat.i(31209);
    String str = paramIntent.getStringExtra("Chat_User");
    boolean bool2 = paramIntent.getBooleanExtra("key_is_biz_chat", false);
    if ((!bool2) && (str == null))
    {
      ab.e("MicroMsg.ChattingUI.BizComponent", "talker is null !!!");
      AppMethodBeat.o(31209);
    }
    while (true)
    {
      return bool1;
      if ((bool2) && (paramIntent.getLongExtra("key_biz_chat_id", -1L) == -1L))
      {
        ab.e("MicroMsg.ChattingUI.BizComponent", "bizChatId is null !!");
        AppMethodBeat.o(31209);
      }
      else
      {
        AppMethodBeat.o(31209);
        bool1 = false;
      }
    }
  }

  private void dDB()
  {
    AppMethodBeat.i(31224);
    if (!this.mgP)
      AppMethodBeat.o(31224);
    while (true)
    {
      return;
      z.aeZ();
      com.tencent.mm.aj.a.h.e(this.cgL.getTalkerUserName(), this.yDI.field_bizChatServId, (int)(System.currentTimeMillis() / 1000L));
      AppMethodBeat.o(31224);
    }
  }

  private void djt()
  {
    AppMethodBeat.i(31213);
    bh.A("bizflag", false);
    Object localObject;
    if (this.mgP)
    {
      dDB();
      z.afe();
      localObject = this.yDI;
      if (com.tencent.mm.kernel.a.jP(g.RN().eIV))
      {
        String str = String.format("%s;%s;%d", new Object[] { ((com.tencent.mm.aj.a.c)localObject).field_brandUserName, ((com.tencent.mm.aj.a.c)localObject).field_bizChatServId, Long.valueOf(System.currentTimeMillis() / 1000L) });
        y.b(((com.tencent.mm.aj.a.c)localObject).field_brandUserName, 8, "EnterpriseChatStatus", str);
        ab.d("MicroMsg.BizChatStatusNotifyService", "quitChat:arg:%s", new Object[] { str });
      }
    }
    if (this.yNX != 0L);
    for (int i = (int)(System.currentTimeMillis() - this.yNX) / 1000; ; i = 0)
    {
      if (aw.RK())
      {
        if (this.mgP)
          z.aeT().a(this.yEn);
        if ((this.cgL.sRl != null) && (this.cgL.sRl.dsf()))
          z.aeR().a(this.yOg);
        if ((com.tencent.mm.n.a.jh(this.cgL.sRl.field_type)) && (this.cgL.sRl.dsf()) && (!f.kq(this.cgL.getTalkerUserName())))
        {
          if ((this.pkW != null) && (this.pkW.adM()))
          {
            if (this.fwz == null)
              this.fwz = new bxk();
            this.fwz.wXr = i;
            this.fwz.wXv = this.cgL.yTx.getIntExtra("Main_IndexInSessionList", 0);
            this.fwz.wXt = this.cgL.yTx.getIntExtra("Main_UnreadCount", 0);
            if (this.yNY != null)
            {
              this.fwz.wXu = this.yNY.getType();
              if (this.fwz.wXt > 0)
                this.fwz.wXs = ((int)(this.yNX - this.yNY.field_createTime) / 1000);
            }
          }
          z.afc().a(this.cgL.getTalkerUserName(), this.fwz);
        }
      }
      if ((com.tencent.mm.app.plugin.a.a.a(this.pkW)) && (this.yNW != null))
      {
        ab.i("MicroMsg.ChattingUI.BizComponent", "hardevice brand account, init event : %s, notify exit chattingui", new Object[] { dDw() });
        this.yNW.a(2, this.pkW);
        this.cgL.yTx.setMMSubTitle(null);
      }
      if ((com.tencent.mm.n.a.jh(this.cgL.sRl.field_type)) && (this.cgL.sRl.dsf()) && (i != 0))
      {
        int j = this.cgL.yTx.getIntExtra("specific_chat_from_scene", 0);
        int k = s.getSessionId();
        com.tencent.mm.plugin.report.service.h.pYm.e(10638, new Object[] { this.cgL.getTalkerUserName(), Integer.valueOf(i), Integer.valueOf(this.cgL.yTx.getIntExtra("biz_click_item_unread_count", 0)), Integer.valueOf(this.cgL.yTx.getIntExtra("biz_click_item_position", 0)), Integer.valueOf(j), Integer.valueOf(k) });
      }
      if (this.yNW != null)
      {
        localObject = this.yNW;
        ab.d("MicroMsg.exdevice.ChattingUIExDeviceLogic", "now release the event listener");
        if (((com.tencent.mm.app.plugin.a.a)localObject).cgM != null)
        {
          com.tencent.mm.sdk.b.a.xxA.d(((com.tencent.mm.app.plugin.a.a)localObject).cgM);
          ((com.tencent.mm.app.plugin.a.a)localObject).cgM = null;
          if (((com.tencent.mm.app.plugin.a.a)localObject).cgP != null)
            ((com.tencent.mm.app.plugin.a.a)localObject).cgP.clear();
        }
        ((com.tencent.mm.app.plugin.a.a)localObject).cgQ = false;
        if (((com.tencent.mm.app.plugin.a.a)localObject).cgN != null)
        {
          com.tencent.mm.sdk.b.a.xxA.d(((com.tencent.mm.app.plugin.a.a)localObject).cgN);
          ((com.tencent.mm.app.plugin.a.a)localObject).cgN = null;
        }
        this.yNW = null;
      }
      s.aom(null);
      this.yNX = 0L;
      AppMethodBeat.o(31213);
      return;
    }
  }

  private boolean f(KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(31216);
    if ((paramKeyEvent.getKeyCode() == 82) && (paramKeyEvent.getAction() == 1) && ((this.pkW == null) || (this.pkW.cJ(false) == null) || (this.pkW.cJ(false).aeo() == null) || (this.pkW.cJ(false).aeo().fvL == null) || (this.pkW.cJ(false).aeo().fvL.isEmpty())))
      ((com.tencent.mm.ui.chatting.c.b.o)this.cgL.aF(com.tencent.mm.ui.chatting.c.b.o.class)).dDX().dkc();
    AppMethodBeat.o(31216);
    return false;
  }

  public final void a(int paramInt, m paramm)
  {
    AppMethodBeat.i(31219);
    if (paramm.getType() == 1357)
    {
      this.cgL.dismissDialog();
      if (paramInt != 0)
        Toast.makeText(ah.getContext(), this.cgL.yTx.getMMResources().getString(2131302515), 0).show();
    }
    AppMethodBeat.o(31219);
  }

  public final void aH(LinkedList<String> paramLinkedList)
  {
    AppMethodBeat.i(31222);
    z.aeT().aK(dDz());
    LinkedList localLinkedList = new LinkedList();
    List localList = this.yDI.afg();
    Iterator localIterator = paramLinkedList.iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      if ((localList != null) && (localList.contains(str)))
        localLinkedList.add(str);
    }
    if (localLinkedList.size() == 0)
      if (paramLinkedList.size() == 1)
      {
        com.tencent.mm.ui.base.h.a(this.cgL.yTx.getContext(), this.cgL.yTx.getMMResources().getString(2131302534), null, this.cgL.yTx.getMMResources().getString(2131302535), new c.2(this));
        AppMethodBeat.o(31222);
      }
    while (true)
    {
      return;
      com.tencent.mm.ui.base.h.a(this.cgL.yTx.getContext(), this.cgL.yTx.getMMResources().getString(2131302529), null, this.cgL.yTx.getMMResources().getString(2131302535), new c.3(this));
      AppMethodBeat.o(31222);
      continue;
      paramLinkedList = this.cgL.yTx.getMMResources().getString(2131302528, new Object[] { aI(localLinkedList) });
      com.tencent.mm.ui.base.h.a(this.cgL.yTx.getContext(), paramLinkedList, null, this.cgL.yTx.getMMResources().getString(2131302536), this.cgL.yTx.getMMResources().getString(2131296868), true, new c.4(this, localLinkedList), new c.5(this));
      AppMethodBeat.o(31222);
    }
  }

  public final String ari(String paramString)
  {
    AppMethodBeat.i(31221);
    if ((!TextUtils.isEmpty(paramString)) && (paramString.contains("http://weixin.qq.com/emoticonstore/")))
    {
      paramString = paramString.substring(paramString.lastIndexOf("/") + 1);
      if ((com.tencent.mm.n.a.jh(this.cgL.sRl.field_type)) && (this.cgL.sRl.dsf()) && (this.pkW != null))
      {
        d.b localb = this.pkW.cJ(false);
        if ((localb != null) && (!TextUtils.isEmpty(localb.aen())) && (paramString.contains(localb.aen())))
          AppMethodBeat.o(31221);
      }
    }
    while (true)
    {
      return paramString;
      paramString = null;
      AppMethodBeat.o(31221);
    }
  }

  public final void dDA()
  {
    AppMethodBeat.i(31220);
    aw.RS().m(new c.15(this), 500L);
    AppMethodBeat.o(31220);
  }

  public final void dDh()
  {
    AppMethodBeat.i(31233);
    super.dDh();
    djt();
    AppMethodBeat.o(31233);
  }

  public final com.tencent.mm.aj.d dDj()
  {
    return this.pkW;
  }

  public final com.tencent.mm.aj.a.c dDk()
  {
    return this.yDI;
  }

  public final com.tencent.mm.aj.a.j dDl()
  {
    return this.pmx;
  }

  public final boolean dDm()
  {
    return this.mgP;
  }

  public final boolean dDn()
  {
    return this.yNZ;
  }

  public final boolean dDo()
  {
    AppMethodBeat.i(31210);
    int i;
    if (this.mgP)
      if (this.yNZ)
      {
        i = com.tencent.mm.aj.a.e.fB(dDz());
        if (bo.isNullOrNil(this.yDI.field_chatName))
          if (i == 0)
          {
            this.cgL.yTx.setMMTitle(this.cgL.yTx.getMMResources().getString(2131298223));
            AppMethodBeat.o(31210);
          }
      }
    for (boolean bool = true; ; bool = false)
    {
      return bool;
      this.cgL.yTx.setMMTitle(this.cgL.yTx.getMMResources().getString(2131299931, new Object[] { this.cgL.yTx.getMMResources().getString(2131298223), Integer.valueOf(i) }));
      break;
      ((com.tencent.mm.ui.chatting.c.b.r)this.cgL.aF(com.tencent.mm.ui.chatting.c.b.r.class)).M(this.cgL.yTx.getMMResources().getString(2131299931, new Object[] { this.yDI.field_chatName, Integer.valueOf(i) }));
      break;
      this.cgL.yTx.setMMTitle(this.pmx.field_userName);
      break;
      AppMethodBeat.o(31210);
    }
  }

  public final c.a dDp()
  {
    return this.yHz;
  }

  public final ChatFooter.e dDq()
  {
    return this.yGx;
  }

  public final List<bi> dDr()
  {
    int i = 100;
    AppMethodBeat.i(31212);
    Object localObject = z.aeU().fv(dDz());
    if (((com.tencent.mm.aj.a.a)localObject).field_unReadCount > 100);
    while (true)
    {
      aw.ZK();
      localObject = com.tencent.mm.model.c.XP().o(this.cgL.sRl.field_username, dDz(), i);
      AppMethodBeat.o(31212);
      return localObject;
      i = ((com.tencent.mm.aj.a.a)localObject).field_unReadCount;
    }
  }

  public final boolean dDs()
  {
    return this.yOh;
  }

  public final void dDt()
  {
    AppMethodBeat.i(31214);
    if (this.pkW == null)
    {
      AppMethodBeat.o(31214);
      return;
    }
    final boolean bool;
    label34: String str;
    if ((!com.tencent.mm.modelgeo.d.agA()) && (!com.tencent.mm.modelgeo.d.agB()))
    {
      bool = true;
      if ((this.pkW.field_hadAlert != 0) || (!bool))
        break label146;
      str = this.cgL.yTx.getMMResources().getString(2131298077, new Object[] { this.cgL.sRl.Oj() });
    }
    while (true)
    {
      this.pmG = com.tencent.mm.ui.base.h.a(this.cgL.yTx.getContext(), str, this.cgL.yTx.getMMResources().getString(2131297061), new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          AppMethodBeat.i(31205);
          c.c(c.this).field_hadAlert = 1;
          paramAnonymousDialogInterface = c.c(c.this);
          if (paramAnonymousDialogInterface != null)
          {
            paramAnonymousDialogInterface.field_brandFlag |= 4;
            f.g(paramAnonymousDialogInterface);
          }
          if (bool)
          {
            paramAnonymousDialogInterface = new Intent("android.settings.LOCATION_SOURCE_SETTINGS");
            c.this.cgL.yTx.startActivity(paramAnonymousDialogInterface);
            AppMethodBeat.o(31205);
          }
          while (true)
          {
            return;
            z.afc().rj(c.this.cgL.getTalkerUserName());
            AppMethodBeat.o(31205);
          }
        }
      }
      , new c.14(this));
      AppMethodBeat.o(31214);
      break;
      bool = false;
      break label34;
      label146: if (bool)
        str = this.cgL.yTx.getMMResources().getString(2131298078);
      else
        str = this.cgL.yTx.getMMResources().getString(2131298076, new Object[] { this.cgL.sRl.Oj() });
    }
  }

  public final void dDu()
  {
    AppMethodBeat.i(31215);
    Intent localIntent = new Intent();
    localIntent.putExtra("Contact_User", this.cgL.getTalkerUserName());
    localIntent.putExtra("key_start_biz_profile_setting_from_scene", 1);
    com.tencent.mm.bp.d.b(this.cgL.yTx.getContext(), "profile", ".ui.newbizinfo.NewBizInfoSettingUI", localIntent);
    AppMethodBeat.o(31215);
  }

  public final int dDv()
  {
    return this.yOd;
  }

  public final String dDw()
  {
    String str = null;
    if (this.mgP)
      if (this.yNZ)
        if (this.yDI != null);
    while (true)
    {
      return str;
      str = this.yDI.field_chatName;
      continue;
      if (this.pmx != null)
      {
        str = this.pmx.field_userName;
        continue;
        if (this.cgL.sRl != null)
          str = this.cgL.sRl.field_nickname;
      }
    }
  }

  public final boolean dDx()
  {
    boolean bool1 = true;
    AppMethodBeat.i(31217);
    Intent localIntent1 = new Intent(this.cgL.yTx.getContext(), ChatroomInfoUI.class);
    if ((this.cgL.dFw()) || (this.yNZ));
    for (int i = 1; (i != 0) && (!this.mgP); i = 0)
    {
      localIntent1.putExtra("Chat_User", this.cgL.sRl.field_username);
      localIntent1.putExtra("RoomInfo_Id", this.cgL.getTalkerUserName());
      localIntent1.putExtra("Is_Chatroom", this.cgL.dFw());
      localIntent1.putExtra("fromChatting", true);
      this.cgL.startActivity(localIntent1);
      AppMethodBeat.o(31217);
      bool2 = bool1;
      return bool2;
    }
    if (this.mgP)
    {
      localIntent1.setClass(this.cgL.yTx.getContext(), BizChatroomInfoUI.class);
      localIntent1.putExtra("Chat_User", this.cgL.sRl.field_username);
      localIntent1.putExtra("key_biz_chat_id", dDz());
      if ((this.cgL.yTx.thisActivity() instanceof ChattingUI))
        localIntent1.putExtra("key_biz_chat_info_from_scene", 1);
      while (true)
      {
        this.cgL.yTx.startActivity(localIntent1);
        AppMethodBeat.o(31217);
        bool2 = bool1;
        break;
        localIntent1.putExtra("key_biz_chat_info_from_scene", 2);
      }
    }
    if ((t.nF(this.cgL.getTalkerUserName())) || (ad.aou(this.cgL.getTalkerUserName())) || (ad.aow(this.cgL.getTalkerUserName())) || (t.nB(this.cgL.getTalkerUserName())) || (ad.mR(this.cgL.getTalkerUserName())) || (this.cgL.sRl.dsf()))
    {
      localIntent1 = new Intent();
      com.tencent.mm.ui.contact.e.r(localIntent1, this.cgL.getTalkerUserName());
      if (this.cgL.yTx.getIntExtra("chat_from_scene", 0) == 2)
      {
        localIntent1.putExtra("Kdel_from", 2);
        label377: localIntent1.putExtra("chat_from_scene", this.cgL.yTx.getIntExtra("chat_from_scene", 0));
        localIntent1.putExtra("preUsername", this.cgL.getTalkerUserName());
        localIntent1.putExtra("preChatName", this.cgL.getTalkerUserName());
        if ((this.pkW == null) || (!this.pkW.adM()))
          break label700;
        i = 6;
        label449: localIntent1.putExtra("preChatTYPE", this.cgL.yTx.getIntExtra("preChatTYPE", i));
        Intent localIntent2 = this.cgL.yTx.getContext().getIntent();
        i = localIntent2.getIntExtra("key_temp_session_scene", 5);
        if ((i != 16) && (i != 17) && (!localIntent2.getBooleanExtra("key_biz_profile_stay_after_follow_op", false)))
          break label769;
        localIntent1.putExtra("Kdel_from", 1);
      }
    }
    label769: for (boolean bool2 = true; ; bool2 = false)
    {
      localIntent1.putExtra("key_biz_profile_stay_after_follow_op", bool2);
      if ((((v)this.cgL.aF(v.class)).dEL()) && (i.arl(this.cgL.getTalkerUserName())))
      {
        if (i != 16)
          break label706;
        localIntent1.putExtra("Contact_Scene", 92);
      }
      while (true)
      {
        if (this.cgL.getTalkerUserName().equals("gh_43f2581f6fd6"))
        {
          com.tencent.mm.plugin.sport.a.d.kT(2);
          com.tencent.mm.plugin.r.a.bVv();
          if (com.tencent.mm.ax.c.lQ(com.tencent.mm.ax.b.fKF))
          {
            com.tencent.mm.plugin.r.a.bVt();
            com.tencent.mm.ax.d.lR(com.tencent.mm.ax.b.fKF);
            localIntent1.putExtra("key_from_wesport_right_newtips", true);
          }
        }
        localIntent1.putExtra("KOpenArticleSceneFromScene", 0);
        com.tencent.mm.bp.d.b(this.cgL.yTx.getContext(), "profile", ".ui.ContactInfoUI", localIntent1, 213);
        AppMethodBeat.o(31217);
        bool2 = bool1;
        break;
        localIntent1.putExtra("Kdel_from", 0);
        break label377;
        label700: i = 7;
        break label449;
        label706: if (i == 17)
          localIntent1.putExtra("Contact_Scene", 93);
        else if (i == 18)
          localIntent1.putExtra("Contact_Scene", 94);
        else
          localIntent1.putExtra("Contact_Scene", 81);
      }
      AppMethodBeat.o(31217);
      bool2 = false;
      break;
    }
  }

  public final boolean dDy()
  {
    int i = 0;
    boolean bool = false;
    AppMethodBeat.i(31218);
    if (this.cgL == null)
    {
      ab.e("MicroMsg.ChattingUI.BizComponent", "[writeOpLogAndMarkReadTContact] mChattingContext is null!");
      AppMethodBeat.o(31218);
    }
    while (true)
    {
      return bool;
      Object localObject1;
      if ((this.cgL.sRl.dsf()) && (this.pkW != null))
      {
        if (this.mgP)
        {
          bool = z.aeU().fx(dDz());
          AppMethodBeat.o(31218);
        }
        else if (this.pkW.adQ())
        {
          if ((this.pkW.cJ(false) != null) && (this.pkW.cJ(false).aer() != null) && (!bo.isNullOrNil(this.pkW.adX())))
          {
            aw.ZK();
            localObject1 = com.tencent.mm.model.c.XR().apn(this.pkW.adX());
            if ((localObject1 != null) && (((at)localObject1).field_username.equals(this.cgL.getTalkerUserName())) && (((at)localObject1).field_unReadCount > 0))
            {
              if (this.cgL.yTx.getIntExtra("chat_from_scene", 0) == 2)
              {
                AppMethodBeat.o(31218);
                continue;
              }
              aw.ZK();
              com.tencent.mm.model.c.XR().apb(this.pkW.adX());
            }
          }
        }
      }
      else
      {
        label441: 
        while (true)
        {
          if (!t.ny(this.cgL.getTalkerUserName()))
            break label443;
          bool = true;
          AppMethodBeat.o(31218);
          break;
          if ((!this.pkW.adM()) && (!this.pkW.adO()))
            if (!s.aVO())
            {
              aw.ZK();
              localObject1 = com.tencent.mm.model.c.XR().dsT();
              if ((localObject1 != null) && (((at)localObject1).field_username.equals(this.cgL.getTalkerUserName())) && (((at)localObject1).field_unReadCount > 0))
              {
                aw.ZK();
                com.tencent.mm.model.c.XR().apb("officialaccounts");
              }
            }
            else
            {
              Object localObject2 = z.aeX();
              localObject1 = ((com.tencent.mm.storage.r)localObject2).drI();
              if (localObject1 == null);
              while (true)
              {
                if (i <= 0)
                  break label441;
                localObject1 = z.aeX();
                localObject2 = this.cgL.getTalkerUserName();
                localObject2 = "update BizTimeLineInfo set hasShow = 1 where hasShow < 1  and talker = '" + (String)localObject2 + "' ";
                ((com.tencent.mm.storage.r)localObject1).fni.hY("BizTimeLineInfo", (String)localObject2);
                localObject2 = new r.a();
                ((r.a)localObject2).xId = r.b.xIh;
                ((com.tencent.mm.storage.r)localObject1).a((r.a)localObject2);
                break;
                i = ((com.tencent.mm.storage.r)localObject2).mI(((q)localObject1).field_orderFlag);
              }
            }
        }
        label443: aw.ZK();
        bool = com.tencent.mm.model.c.XR().apb(this.cgL.getTalkerUserName());
        AppMethodBeat.o(31218);
      }
    }
  }

  public final long dDz()
  {
    if (this.yDI == null);
    for (long l = -1L; ; l = this.yDI.field_bizChatLocalId)
      return l;
  }

  public final void dxA()
  {
    AppMethodBeat.i(31230);
    this.yOf = true;
    bh.A("bizflag", ((v)this.cgL.aF(v.class)).dEL());
    int i;
    if ((this.pkW != null) && (!com.tencent.mm.app.plugin.a.a.a(this.pkW)))
    {
      this.cgL.yTx.setMMSubTitle(null);
      Object localObject1 = this.pkW;
      if ((localObject1 == null) || (localObject1 == null))
        break label565;
      localObject1 = ((com.tencent.mm.aj.d)localObject1).cJ(false);
      if ((localObject1 == null) || (!((d.b)localObject1).adZ()))
        break label565;
      i = 1;
      label95: if (i != 0)
        aw.RS().aa(new Runnable()
        {
          public final void run()
          {
            AppMethodBeat.i(31203);
            pm localpm = new pm();
            if (c.c(c.this) != null)
            {
              localpm.cLH.userName = c.c(c.this).field_username;
              com.tencent.mm.sdk.b.a.xxA.m(localpm);
            }
            AppMethodBeat.o(31203);
          }
        });
      if ((!com.tencent.mm.n.a.jh(this.cgL.sRl.field_type)) || (!this.cgL.sRl.dsf()) || (this.pkW == null))
        break label586;
      localObject1 = this.pkW.cJ(false);
      if ((localObject1 != null) && (((d.b)localObject1).adL()))
      {
        if (this.pkW.field_hadAlert != 0)
          break label570;
        String str = this.cgL.yTx.getContext().getResources().getString(2131298079, new Object[] { this.cgL.sRl.Oj() });
        Object localObject2 = this.cgL.yTx.getContext().getResources().getString(2131298080);
        localObject1 = new StringBuffer();
        ((StringBuffer)localObject1).append("<sysmsg type=\"reportbizlocation\">");
        ((StringBuffer)localObject1).append("<reportbizlocation>");
        ((StringBuffer)localObject1).append("<text><![CDATA[").append(str).append("]]></text>");
        ((StringBuffer)localObject1).append("<link>");
        ((StringBuffer)localObject1).append("<scene>reportbizlocation</scene>");
        ((StringBuffer)localObject1).append("<text><![CDATA[").append((String)localObject2).append("]]></text>");
        ((StringBuffer)localObject1).append("</link>");
        ((StringBuffer)localObject1).append("</reportbizlocation>");
        ((StringBuffer)localObject1).append("</sysmsg>");
        localObject2 = new bi();
        ((bi)localObject2).ju(this.cgL.getTalkerUserName());
        ((bi)localObject2).hO(2);
        ((bi)localObject2).setType(10002);
        ((bi)localObject2).eJ(bf.aaa());
        ((bi)localObject2).setContent(((StringBuffer)localObject1).toString());
        bf.l((bi)localObject2);
        this.pkW.field_hadAlert = 1;
        z.aeR().c(this.pkW, new String[0]);
      }
      label420: if ((this.pkW.adJ()) && ((!this.cgL.sRl.dsf()) || (!com.tencent.mm.aj.a.adG())))
      {
        ao.a.flu.ai(this.cgL.sRl.field_username, "");
        com.tencent.mm.ah.b.pY(this.cgL.sRl.field_username);
      }
      if (this.pkW.field_status == 1)
      {
        this.pkW.field_status = 0;
        z.aeR().e(this.pkW);
      }
    }
    while (true)
    {
      dDA();
      AppMethodBeat.o(31230);
      return;
      ab.i("MicroMsg.ChattingUI.BizComponent", "hardevice brand account, onresume: %s, notify switch view enter chattingui", new Object[] { dDw() });
      if (this.yNW == null)
        break;
      this.yNW.a(1, this.pkW);
      break;
      label565: i = 0;
      break label95;
      label570: z.afc().rj(this.cgL.getTalkerUserName());
      break label420;
      label586: if ((!this.cgL.yTx.getBooleanExtra("key_has_add_contact", false).booleanValue()) && (!com.tencent.mm.n.a.jh(this.cgL.sRl.field_type)) && (this.cgL.sRl.dsf()))
        al.d(new Runnable()
        {
          public final void run()
          {
            AppMethodBeat.i(31204);
            if ((!com.tencent.mm.n.a.jh(c.this.cgL.sRl.field_type)) && (c.this.cgL.sRl.dsf()))
              c.this.cgL.yTx.setMMSubTitle(2131298075);
            AppMethodBeat.o(31204);
          }
        });
    }
  }

  public final void dxB()
  {
    AppMethodBeat.i(31231);
    this.yOf = false;
    if ((com.tencent.mm.n.a.jh(this.cgL.sRl.field_type)) && (this.cgL.sRl.dsf()) && (this.pkW != null))
    {
      z.afc().aeJ();
      if (this.pmG != null)
        this.pmG.dismiss();
    }
    AppMethodBeat.o(31231);
  }

  public final void dxC()
  {
    AppMethodBeat.i(31232);
    this.yOe = false;
    djt();
    AppMethodBeat.o(31232);
  }

  public final void dxx()
  {
    boolean bool1 = false;
    AppMethodBeat.i(31227);
    this.yOa = this.cgL.yTx.getLongExtra("key_biz_chat_id", -1L);
    this.mgP = this.cgL.yTx.getBooleanExtra("key_is_biz_chat", false).booleanValue();
    if (this.mgP)
    {
      this.yDI = z.aeT().aK(this.yOa);
      this.yDI = com.tencent.mm.aj.a.e.a(this.yDI, this.yOa);
      this.yOd = z.aeU().fv(dDz()).field_unReadCount;
    }
    boolean bool2 = bool1;
    if (this.mgP)
    {
      bool2 = bool1;
      if (com.tencent.mm.aj.a.e.rs(this.yDI.field_bizChatServId))
        bool2 = true;
    }
    this.yNZ = bool2;
    if ((this.mgP) && (!this.yNZ))
    {
      this.pmx = z.aeV().cH(this.yDI.field_bizChatServId);
      this.pmx = com.tencent.mm.aj.a.e.a(this.pmx, this.yDI.field_bizChatServId);
    }
    if (this.yNZ)
      this.yOh = com.tencent.mm.aj.a.e.c(this.yDI);
    this.pkW = f.qX(this.cgL.getTalkerUserName());
    this.yOe = true;
    AppMethodBeat.o(31227);
  }

  public final void dxy()
  {
    AppMethodBeat.i(31228);
    this.yNX = System.currentTimeMillis();
    Object localObject = (com.tencent.mm.ui.chatting.c.b.h)this.cgL.aF(com.tencent.mm.ui.chatting.c.b.h.class);
    if (((com.tencent.mm.ui.chatting.c.b.h)localObject).getCount() > 0);
    for (localObject = ((com.tencent.mm.ui.chatting.c.b.h)localObject).Ou(((com.tencent.mm.ui.chatting.c.b.h)localObject).getCount() - 1); ; localObject = null)
    {
      this.yNY = ((bi)localObject);
      s.aom(this.cgL.getTalkerUserName());
      this.cgL.yTx.getLongExtra("key_biz_chat_id", -1L);
      if (this.mgP)
      {
        ab.d("MicroMsg.ChattingUI.BizComponent", "getBizChatInfo");
        aw.RS().m(new c.7(this), 500L);
      }
      if ((this.cgL.sRl != null) && (this.cgL.sRl.dsf()))
        z.afd().qB(this.cgL.sRl.field_username);
      this.yOa = this.cgL.yTx.getLongExtra("key_biz_chat_id", -1L);
      if ((com.tencent.mm.app.plugin.a.a.a(this.pkW)) && (this.yNW == null))
      {
        ab.i("MicroMsg.ChattingUI.BizComponent", "hardevice brand account, init event : %s", new Object[] { dDw() });
        this.yNW = new com.tencent.mm.app.plugin.a.a(this.cgL);
      }
      if (this.cgL.sRl.dsf())
        com.tencent.mm.bf.d.chatType = 2;
      if (this.mgP)
        z.aeT().a(this.yEn, Looper.getMainLooper());
      if ((this.cgL.sRl != null) && (this.cgL.sRl.dsf()))
        z.aeR().a(this.yOg, Looper.getMainLooper());
      AppMethodBeat.o(31228);
      return;
    }
  }

  public final void dxz()
  {
    AppMethodBeat.i(31229);
    if ((com.tencent.mm.n.a.jh(this.cgL.sRl.field_type)) && (this.cgL.sRl.dsf()) && (com.tencent.mm.n.a.jh(this.cgL.sRl.field_type)) && (this.cgL.sRl.dsf()) && (!f.kq(this.cgL.getTalkerUserName())))
    {
      int i = this.cgL.yTx.getIntExtra("specific_chat_from_scene", 0);
      if (this.fwz == null)
        this.fwz = new bxk();
      this.fwz.wXv = this.cgL.yTx.getIntExtra("Main_IndexInSessionList", 0);
      this.fwz.wXt = this.cgL.yTx.getIntExtra("Main_UnreadCount", 0);
      if (this.yNY != null)
      {
        this.fwz.wXu = this.yNY.getType();
        if (this.fwz.wXt > 0)
          this.fwz.wXs = ((int)(this.yNX - this.yNY.field_createTime) / 1000);
      }
      z.afc().a(this.cgL.getTalkerUserName(), this.yNY, i, this.fwz);
    }
    AppMethodBeat.o(31229);
  }

  public final void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(31226);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    switch (paramInt1)
    {
    default:
    case 12001:
    }
    while (true)
    {
      AppMethodBeat.o(31226);
      while (true)
      {
        return;
        if (this.yNW == null)
          break;
        paramIntent = this.yNW;
        if (paramIntent.cgL == null)
        {
          ab.e("MicroMsg.exdevice.ChattingUIExDeviceLogic", "context is null, maybe has been released");
          AppMethodBeat.o(31226);
        }
        else
        {
          if (paramInt2 != -1)
            break label170;
          Toast.makeText(paramIntent.cgL.yTx.getContext(), 2131299341, 0).show();
          ed localed = new ed();
          localed.cxE.op = 0;
          localed.cxE.userName = paramIntent.cgL.getTalkerUserName();
          localed.cxE.context = paramIntent.cgL.yTx.getContext();
          com.tencent.mm.sdk.b.a.xxA.m(localed);
          AppMethodBeat.o(31226);
        }
      }
      continue;
      label170: if (paramInt2 == 0)
        Toast.makeText(paramIntent.cgL.yTx.getContext(), 2131299340, 0).show();
    }
  }

  public final boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(31225);
    boolean bool = f(paramKeyEvent);
    AppMethodBeat.o(31225);
    return bool;
  }

  public final String ru(String paramString)
  {
    AppMethodBeat.i(31211);
    paramString = this.yDI.ro(paramString);
    if (paramString != null)
    {
      paramString = paramString.field_headImageUrl;
      AppMethodBeat.o(31211);
    }
    while (true)
    {
      return paramString;
      paramString = null;
      AppMethodBeat.o(31211);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.c.c
 * JD-Core Version:    0.6.2
 */