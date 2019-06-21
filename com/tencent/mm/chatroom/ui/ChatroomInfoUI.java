package com.tencent.mm.chatroom.ui;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.chatroom.ui.preference.RoomCardPreference;
import com.tencent.mm.g.a.ko;
import com.tencent.mm.g.a.sz;
import com.tencent.mm.g.a.sz.b;
import com.tencent.mm.g.a.tv;
import com.tencent.mm.model.ag;
import com.tencent.mm.model.ao.a;
import com.tencent.mm.model.ao.b;
import com.tencent.mm.model.bf;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.report.kvdata.IMBehavior;
import com.tencent.mm.plugin.report.kvdata.IMBehaviorChattingOP;
import com.tencent.mm.plugin.report.kvdata.log_13835;
import com.tencent.mm.pluginsdk.ui.applet.ContactListExpandPreference;
import com.tencent.mm.pluginsdk.ui.applet.k.b;
import com.tencent.mm.protocal.protobuf.ayb;
import com.tencent.mm.sdk.e.k.a;
import com.tencent.mm.sdk.e.n.b;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.be;
import com.tencent.mm.storage.u;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h.b;
import com.tencent.mm.ui.base.preference.CheckBoxPreference;
import com.tencent.mm.ui.base.preference.KeyValuePreference;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.NormalIconPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.PreferenceCategory;
import com.tencent.mm.ui.contact.s;
import com.tencent.mm.ui.q;
import com.tencent.mm.ui.widget.a.e.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import junit.framework.Assert;

@com.tencent.mm.kernel.i
public class ChatroomInfoUI extends MMPreference
  implements com.tencent.mm.ai.f, com.tencent.mm.bg.a, k.a, n.b
{
  private static boolean eiu = false;
  private boolean cEH;
  private ProgressDialog ehJ;
  private com.tencent.mm.ui.base.preference.f ehK;
  private boolean ehL;
  private ad ehM;
  private RoomCardPreference ehN;
  private Preference ehO;
  private Preference ehP;
  private NormalIconPreference ehQ;
  private NormalIconPreference ehR;
  private ContactListExpandPreference ehS;
  private CheckBoxPreference ehT;
  private CheckBoxPreference ehU;
  private CheckBoxPreference ehV;
  private KeyValuePreference ehW;
  private CheckBoxPreference ehX;
  private Preference ehY;
  private SharedPreferences ehZ;
  private String ehq;
  private boolean eia;
  private boolean eib;
  private boolean eic;
  private boolean eid;
  private int eie;
  private boolean eif;
  private boolean eig;
  private u eih;
  private int eii;
  private boolean eij;
  private boolean eik;
  private boolean eil;
  private boolean eim;
  private com.tencent.mm.pluginsdk.ui.d ein;
  boolean eio;
  private com.tencent.mm.sdk.b.c eip;
  int eiq;
  private com.tencent.mm.ui.base.p eir;
  private String eis;
  private String eit;
  private String eiv;
  private com.tencent.mm.pluginsdk.c.b eiw;
  private com.tencent.mm.sdk.platformtools.ap eix;
  private int eiy;
  private ak handler;
  private boolean isDeleteCancel;

  public ChatroomInfoUI()
  {
    AppMethodBeat.i(104016);
    this.ehJ = null;
    this.handler = new ChatroomInfoUI.1(this, Looper.getMainLooper());
    this.ehZ = null;
    this.eic = false;
    this.eid = false;
    this.eig = false;
    this.eih = null;
    this.eii = -1;
    this.eij = true;
    this.eik = false;
    this.eil = false;
    this.eim = false;
    this.ein = new com.tencent.mm.pluginsdk.ui.d(new ChatroomInfoUI.11(this));
    this.eio = false;
    this.eip = new ChatroomInfoUI.42(this);
    this.eiq = -1;
    this.eir = null;
    this.eis = "";
    this.eiv = null;
    this.eiw = new ChatroomInfoUI.34(this);
    this.isDeleteCancel = false;
    this.eix = null;
    this.eiy = 0;
    AppMethodBeat.o(104016);
  }

  private void JB()
  {
    AppMethodBeat.i(104018);
    ab.i("MicroMsg.ChatroomInfoUI", "[doChatroomDetailCgi] :%s", new Object[] { this.ehq });
    com.tencent.mm.roomsdk.a.c.a locala = com.tencent.mm.roomsdk.a.b.alY(this.ehq).kd(this.ehq);
    locala.b(new ChatroomInfoUI.41(this));
    locala.dmX();
    AppMethodBeat.o(104018);
  }

  private String JD()
  {
    if (this.eih == null);
    for (String str = ""; ; str = this.eih.field_selfDisplayName)
      return str;
  }

  private void JE()
  {
    AppMethodBeat.i(104028);
    com.tencent.mm.plugin.report.service.h.pYm.a(219L, 7L, 1L, true);
    Object localObject = com.tencent.mm.model.n.my(this.ehq);
    String str = bo.c((List)localObject, ",");
    if (localObject != null)
      this.eie = ((List)localObject).size();
    localObject = new Intent();
    ((Intent)localObject).putExtra("titile", getString(2131296486));
    ((Intent)localObject).putExtra("list_type", 1);
    ((Intent)localObject).putExtra("list_attr", iz(s.znF));
    ((Intent)localObject).putExtra("always_select_contact", str);
    ((Intent)localObject).putExtra("scene", 3);
    if (!ad.aoy(this.ehM.field_username))
      ((Intent)localObject).putExtra("without_openim", true);
    ((Intent)localObject).putExtra("KBlockOpenImFav", com.tencent.mm.model.t.mO(this.ehq));
    com.tencent.mm.bp.d.b(this, ".ui.contact.SelectContactUI", (Intent)localObject, 1);
    AppMethodBeat.o(104028);
  }

  private void JF()
  {
    AppMethodBeat.i(104029);
    if (this.cEH)
    {
      JE();
      AppMethodBeat.o(104029);
    }
    while (true)
    {
      return;
      JP();
      AppMethodBeat.o(104029);
    }
  }

  private void JG()
  {
    AppMethodBeat.i(104031);
    com.tencent.mm.plugin.report.service.h.pYm.a(219L, 8L, 1L, true);
    Object localObject = com.tencent.mm.model.n.my(this.ehq);
    String str = bo.c((List)localObject, ",");
    this.eie = ((List)localObject).size();
    localObject = new Intent();
    ((Intent)localObject).putExtra("RoomInfo_Id", this.ehq);
    ((Intent)localObject).putExtra("Is_Chatroom", true);
    ((Intent)localObject).putExtra("Chatroom_member_list", str);
    ((Intent)localObject).putExtra("room_member_count", this.eie);
    ((Intent)localObject).putExtra("Is_RoomOwner", this.eic);
    ((Intent)localObject).putExtra("list_attr", s.znF);
    ((Intent)localObject).putExtra("room_name", this.ehM.field_username);
    ((Intent)localObject).putExtra("room_owner_name", this.eih.field_roomowner);
    ((Intent)localObject).setClass(this, SelectDelMemberUI.class);
    startActivityForResult((Intent)localObject, 7);
    AppMethodBeat.o(104031);
  }

  private String JH()
  {
    AppMethodBeat.i(104034);
    ad localad = ((com.tencent.mm.plugin.messenger.foundation.a.j)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XM().aoO(this.eih.field_roomowner);
    if ((localad != null) && ((int)localad.ewQ > 0));
    for (Object localObject1 = localad.field_conRemark; ; localObject1 = null)
    {
      Object localObject2 = localObject1;
      if (bo.isNullOrNil((String)localObject1))
        localObject2 = kg(this.eih.field_roomowner);
      localObject1 = localObject2;
      if (bo.isNullOrNil((String)localObject2))
      {
        localObject1 = localObject2;
        if (localad != null)
        {
          localObject1 = localObject2;
          if ((int)localad.ewQ > 0)
            localObject1 = localad.Oi();
        }
      }
      localObject2 = localObject1;
      if (bo.isNullOrNil((String)localObject1))
        localObject2 = this.eih.field_roomowner;
      AppMethodBeat.o(104034);
      return localObject2;
    }
  }

  private static boolean JI()
  {
    boolean bool = true;
    AppMethodBeat.i(104035);
    if (bo.getInt(com.tencent.mm.m.g.Nu().getValue("ChatroomGlobalSwitch"), 1) == 1)
      AppMethodBeat.o(104035);
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(104035);
    }
  }

  private void JJ()
  {
    AppMethodBeat.i(104039);
    if (this.ehS != null)
      if (this.cEH)
      {
        com.tencent.mm.kernel.g.RS().aa(new ChatroomInfoUI.33(this));
        AppMethodBeat.o(104039);
      }
    while (true)
    {
      return;
      LinkedList localLinkedList = new LinkedList();
      localLinkedList.add(this.ehq);
      this.ehS.u(this.ehq, localLinkedList);
      AppMethodBeat.o(104039);
    }
  }

  private void JK()
  {
    AppMethodBeat.i(104040);
    if (this.ehM != null)
    {
      Object localObject1 = JD();
      Object localObject2 = localObject1;
      if (bo.isNullOrNil((String)localObject1))
        localObject2 = r.YB();
      if (bo.isNullOrNil((String)localObject2))
        break label119;
      this.ehW.dAB();
      this.ehW.yCt = com.tencent.mm.bz.a.al(this.mController.ylL, 2131427877);
      KeyValuePreference localKeyValuePreference = this.ehW;
      localObject1 = localObject2;
      if (((String)localObject2).length() <= 0)
        localObject1 = getString(2131303260);
      localKeyValuePreference.setSummary(com.tencent.mm.pluginsdk.ui.e.j.b(this, (CharSequence)localObject1));
    }
    while (true)
    {
      if (this.ehK != null)
        this.ehK.notifyDataSetChanged();
      AppMethodBeat.o(104040);
      return;
      label119: this.ehW.setSummary("");
    }
  }

  private void JL()
  {
    AppMethodBeat.i(104041);
    if (this.ehZ == null)
      this.ehZ = getSharedPreferences(getPackageName() + "_preferences", 0);
    boolean bool;
    if (this.cEH)
      if (this.ehM.dua == 0)
      {
        bool = true;
        this.eif = bool;
        label69: if (!this.eif)
          break label154;
        setTitleMuteIconVisibility(0);
        if (this.ehT != null)
          this.ehZ.edit().putBoolean("room_notify_new_msg", true).commit();
      }
    while (true)
    {
      this.ehK.notifyDataSetChanged();
      AppMethodBeat.o(104041);
      return;
      bool = false;
      break;
      if (this.ehL)
        break label69;
      this.eif = this.ehM.DX();
      break label69;
      label154: setTitleMuteIconVisibility(8);
      if (this.ehT != null)
        this.ehZ.edit().putBoolean("room_notify_new_msg", false).commit();
    }
  }

  private void JM()
  {
    AppMethodBeat.i(104042);
    Object localObject;
    RoomCardPreference localRoomCardPreference;
    if ((this.ehM != null) && (this.ehN != null))
    {
      localObject = com.tencent.mm.model.n.mC(this.ehq);
      if ((localObject != null) && (((String)localObject).length() > 0))
        break label136;
      this.ehN.cui = false;
      this.ehM = ((com.tencent.mm.plugin.messenger.foundation.a.j)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XM().aoO(this.ehq);
      if (!JO())
        break label159;
      String str = this.ehM.Oj();
      localRoomCardPreference = this.ehN;
      localObject = str;
      if (str.length() <= 0)
        localObject = getString(2131303260);
    }
    label136: label159: for (localRoomCardPreference.eoj = com.tencent.mm.pluginsdk.ui.e.j.b(this, (CharSequence)localObject); ; this.ehN.eoj = getString(2131302551))
    {
      this.ehK.notifyDataSetChanged();
      AppMethodBeat.o(104042);
      return;
      this.ehN.cui = true;
      this.ehN.eok = com.tencent.mm.pluginsdk.ui.e.j.b(this, (CharSequence)localObject);
      break;
    }
  }

  private void JN()
  {
    AppMethodBeat.i(104043);
    if ((this.ehM != null) && (this.ehO != null))
    {
      this.ehM = ((com.tencent.mm.plugin.messenger.foundation.a.j)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XM().aoO(this.ehq);
      if (JO())
      {
        String str1 = this.ehM.Oj();
        Preference localPreference = this.ehO;
        String str2 = str1;
        if (str1.length() <= 0)
          str2 = getString(2131303260);
        localPreference.setSummary(com.tencent.mm.pluginsdk.ui.e.j.b(this, str2));
        if (this.ehK != null)
          this.ehK.notifyDataSetChanged();
        AppMethodBeat.o(104043);
      }
    }
    while (true)
    {
      return;
      this.ehO.setSummary(getString(2131302551));
      AppMethodBeat.o(104043);
    }
  }

  private boolean JO()
  {
    AppMethodBeat.i(104044);
    String str = this.ehM.field_nickname;
    boolean bool;
    if ((!bo.isNullOrNil(str)) && (str.length() <= 50))
    {
      bool = true;
      AppMethodBeat.o(104044);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(104044);
    }
  }

  private void JP()
  {
    AppMethodBeat.i(104046);
    com.tencent.mm.plugin.report.service.h.pYm.X(10170, "1");
    Object localObject = new LinkedList();
    ((List)localObject).add(this.ehq);
    ((List)localObject).add(r.Yz());
    String str = bo.c((List)localObject, ",");
    localObject = new Intent();
    ((Intent)localObject).putExtra("titile", getString(2131296484));
    ((Intent)localObject).putExtra("list_type", 0);
    ((Intent)localObject).putExtra("list_attr", iz(s.znG));
    ((Intent)localObject).putExtra("always_select_contact", str);
    com.tencent.mm.bp.d.f(this, ".ui.contact.SelectContactUI", (Intent)localObject);
    AppMethodBeat.o(104046);
  }

  private void JQ()
  {
    AppMethodBeat.i(104050);
    boolean bool;
    Object localObject;
    if (this.ehS != null)
    {
      if (this.cEH)
      {
        JJ();
        this.ehS.notifyChanged();
      }
    }
    else
    {
      bool = ((com.tencent.mm.plugin.chatroom.a.c)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.chatroom.a.c.class)).HH(this.ehq);
      if (JR())
        break label259;
      this.ehK.ce("manage_room", true);
      localObject = this.ehK;
      if (bool)
        break label254;
      bool = true;
      label81: ((com.tencent.mm.ui.base.preference.f)localObject).ce("room_manager_view", bool);
      label91: if (((JR()) || (this.eie < com.tencent.mm.pluginsdk.ui.applet.j.MAX_COUNT)) && ((!JR()) || (this.eie < com.tencent.mm.pluginsdk.ui.applet.j.MAX_COUNT - 1)))
        break label315;
      this.ehK.ce("see_room_member", false);
      this.ehP.setTitle(getString(2131302865));
      label154: if (com.tencent.mm.model.t.mP(this.ehq))
      {
        if (!JR())
          break label331;
        this.ehK.ce("manage_room", false);
      }
    }
    while (true)
    {
      this.ehK.ce("room_manager_view", true);
      this.ehK.notifyDataSetChanged();
      AppMethodBeat.o(104050);
      return;
      if (this.ehL)
        break;
      localObject = new LinkedList();
      ((List)localObject).add(this.ehq);
      this.ehS.u(this.ehq, (List)localObject);
      break;
      label254: bool = false;
      break label81;
      label259: this.ehK.ce("room_manager_view", true);
      if (com.tencent.mm.model.n.mA(this.ehq) > 2)
      {
        this.ehK.ce("manage_room", false);
        break label91;
      }
      this.ehK.ce("manage_room", true);
      break label91;
      label315: this.ehK.ce("see_room_member", true);
      break label154;
      label331: this.ehK.ce("manage_room", true);
    }
  }

  private boolean JR()
  {
    AppMethodBeat.i(104055);
    boolean bool;
    if ((this.eih != null) && (this.eih.JR()))
    {
      bool = true;
      AppMethodBeat.o(104055);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(104055);
    }
  }

  public static ArrayList<ad> N(List<ayb> paramList)
  {
    AppMethodBeat.i(104045);
    ArrayList localArrayList = new ArrayList();
    if (paramList == null)
      AppMethodBeat.o(104045);
    while (true)
    {
      return localArrayList;
      Iterator localIterator = paramList.iterator();
      while (localIterator.hasNext())
      {
        paramList = (ayb)localIterator.next();
        ad localad = new ad();
        localad.setUsername(paramList.jBB);
        localad.iB(paramList.jCH);
        localArrayList.add(localad);
      }
      AppMethodBeat.o(104045);
    }
  }

  private static List<String> O(List<String> paramList)
  {
    AppMethodBeat.i(104048);
    LinkedList localLinkedList = new LinkedList();
    if (!com.tencent.mm.kernel.g.RK())
      AppMethodBeat.o(104048);
    while (true)
    {
      return localLinkedList;
      if (paramList == null)
      {
        AppMethodBeat.o(104048);
      }
      else
      {
        Iterator localIterator = paramList.iterator();
        while (localIterator.hasNext())
        {
          String str = (String)localIterator.next();
          ad localad = ((com.tencent.mm.plugin.messenger.foundation.a.j)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XM().aoO(str);
          paramList = str;
          if (localad != null)
          {
            paramList = str;
            if ((int)localad.ewQ != 0)
              paramList = localad.Oj();
          }
          localLinkedList.add(paramList);
        }
        AppMethodBeat.o(104048);
      }
    }
  }

  private void b(String paramString1, String paramString2, int paramInt)
  {
    AppMethodBeat.i(104032);
    if ((com.tencent.mm.model.t.mO(this.ehq)) && (!com.tencent.mm.model.m.mo(paramString1)))
    {
      com.tencent.mm.ui.base.h.b(this, getString(2131302573), getString(2131297061), true);
      AppMethodBeat.o(104032);
    }
    while (true)
    {
      return;
      if (kh(paramString1))
      {
        com.tencent.mm.ui.base.h.b(this, getString(2131296416), getString(2131297061), true);
        AppMethodBeat.o(104032);
      }
      else
      {
        paramString1 = bo.P(paramString1.split(","));
        if (paramString1 == null)
        {
          AppMethodBeat.o(104032);
        }
        else
        {
          paramString1 = com.tencent.mm.roomsdk.a.b.alY(this.ehq).a(this.ehq, paramString1, paramString2);
          paramString1.d(new ChatroomInfoUI.23(this));
          getString(2131297061);
          paramString1.a(this, getString(paramInt), true, new ChatroomInfoUI.24(this, paramString1));
          AppMethodBeat.o(104032);
        }
      }
    }
  }

  private void bB(boolean paramBoolean)
  {
    AppMethodBeat.i(104027);
    bf.a(this.ehq, new ChatroomInfoUI.18(this));
    ((com.tencent.mm.plugin.messenger.foundation.a.j)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XL().c(new com.tencent.mm.chatroom.e.a(this.ehq));
    ((com.tencent.mm.plugin.messenger.foundation.a.j)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XR().aoX(this.ehq);
    com.tencent.mm.roomsdk.a.b.alY(this.ehq).ke(this.ehq).dmX();
    com.tencent.mm.model.n.mw(this.ehq);
    if (!paramBoolean)
      this.handler.post(new ChatroomInfoUI.36(this));
    Intent localIntent = new Intent();
    localIntent.addFlags(67108864);
    localIntent.setComponent(new ComponentName(getPackageName(), ah.doz() + ".ui.LauncherUI"));
    startActivity(localIntent);
    finish();
    AppMethodBeat.o(104027);
  }

  private void by(Context paramContext)
  {
    AppMethodBeat.i(104036);
    if (paramContext == null)
      AppMethodBeat.o(104036);
    while (true)
    {
      return;
      if (JI())
      {
        paramContext = new Intent();
        paramContext.putExtra("rawUrl", getString(2131298060, new Object[] { aa.dor() }));
        paramContext.putExtra("geta8key_username", r.Yz());
        paramContext.putExtra("showShare", false);
        com.tencent.mm.bp.d.b(this, "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", paramContext);
      }
      AppMethodBeat.o(104036);
    }
  }

  private void d(String paramString, List<String> paramList)
  {
    AppMethodBeat.i(104037);
    if ((paramList != null) && (paramList.size() > 0))
    {
      LinkedList localLinkedList = new LinkedList();
      for (int i = 0; i < paramList.size(); i++)
        localLinkedList.add(paramList.get(i));
      paramList = "weixin://findfriend/verifycontact/" + paramString + "/";
      com.tencent.mm.model.m.a(paramString, localLinkedList, getString(2131298067), true, paramList);
    }
    AppMethodBeat.o(104037);
  }

  private int iz(int paramInt)
  {
    AppMethodBeat.i(104030);
    if (!s.dIh())
      AppMethodBeat.o(104030);
    while (true)
    {
      return paramInt;
      if (this.ehM != null)
      {
        String str = this.ehM.field_username;
        if ((ad.aox(str)) || (ad.aoy(str)))
        {
          paramInt |= 16777216;
          AppMethodBeat.o(104030);
        }
        else
        {
          paramInt &= -16777217;
          AppMethodBeat.o(104030);
        }
      }
      else
      {
        AppMethodBeat.o(104030);
      }
    }
  }

  private void kf(String paramString)
  {
    AppMethodBeat.i(104021);
    int i = this.ehK.aqQ(paramString);
    this.nDp.smoothScrollToPosition(i);
    new ak().postDelayed(new ChatroomInfoUI.43(this, i), 10L);
    AppMethodBeat.o(104021);
  }

  private String kg(String paramString)
  {
    AppMethodBeat.i(104033);
    if (this.eih == null)
    {
      paramString = null;
      AppMethodBeat.o(104033);
    }
    while (true)
    {
      return paramString;
      paramString = this.eih.mJ(paramString);
      AppMethodBeat.o(104033);
    }
  }

  private boolean kh(String paramString)
  {
    boolean bool = true;
    AppMethodBeat.i(104047);
    if (bo.nullAsNil(r.Yz()).equals(paramString))
      AppMethodBeat.o(104047);
    while (true)
    {
      return bool;
      localObject = com.tencent.mm.model.n.my(this.ehq);
      if (localObject != null)
        break;
      AppMethodBeat.o(104047);
      bool = false;
    }
    Object localObject = ((List)localObject).iterator();
    bool = false;
    label61: if (((Iterator)localObject).hasNext())
    {
      if (!((String)((Iterator)localObject).next()).equals(paramString))
        break label100;
      bool = true;
    }
    label100: 
    while (true)
    {
      break label61;
      AppMethodBeat.o(104047);
      break;
    }
  }

  private void updateTitle()
  {
    AppMethodBeat.i(104038);
    if (this.cEH)
    {
      this.eie = com.tencent.mm.model.n.mA(this.ehq);
      if (this.eie == 0)
      {
        setMMTitle(getString(2131302657));
        AppMethodBeat.o(104038);
      }
    }
    while (true)
    {
      return;
      setMMTitle(getString(2131299931, new Object[] { getString(2131302657), Integer.valueOf(this.eie) }));
      AppMethodBeat.o(104038);
    }
  }

  public final int JC()
  {
    return 2131165263;
  }

  public final com.tencent.mm.ui.base.preference.h a(SharedPreferences paramSharedPreferences)
  {
    AppMethodBeat.i(104054);
    paramSharedPreferences = new com.tencent.mm.ui.base.preference.a(this, this.nDp, paramSharedPreferences);
    AppMethodBeat.o(104054);
    return paramSharedPreferences;
  }

  public final void a(int paramInt, com.tencent.mm.sdk.e.n paramn, Object paramObject)
  {
    AppMethodBeat.i(104051);
    if ((paramObject == null) || (!(paramObject instanceof String)))
    {
      ab.d("MicroMsg.ChatroomInfoUI", "onNotifyChange obj not String event:%d stg:%s obj:%s", new Object[] { Integer.valueOf(paramInt), paramn, paramObject });
      AppMethodBeat.o(104051);
    }
    while (true)
    {
      return;
      a((String)paramObject, null);
      AppMethodBeat.o(104051);
    }
  }

  public final void a(String paramString, com.tencent.mm.sdk.e.m paramm)
  {
    AppMethodBeat.i(104052);
    if (bo.isNullOrNil(paramString))
      AppMethodBeat.o(104052);
    while (true)
    {
      return;
      if (!com.tencent.mm.model.t.kH(paramString))
      {
        ab.d("MicroMsg.ChatroomInfoUI", "event:" + paramString + " cancel");
        AppMethodBeat.o(104052);
      }
      else
      {
        ab.d("MicroMsg.ChatroomInfoUI", "event:".concat(String.valueOf(paramString)));
        if ((this.cEH) && (paramString.equals(this.ehq)))
          com.tencent.mm.kernel.g.RS().aa(new ChatroomInfoUI.37(this));
        JQ();
        AppMethodBeat.o(104052);
      }
    }
  }

  public final boolean a(com.tencent.mm.ui.base.preference.f arg1, Preference paramPreference)
  {
    int i = 1;
    AppMethodBeat.i(104026);
    ??? = paramPreference.mKey;
    if (???.equals("room_name"))
    {
      ??? = com.tencent.mm.m.g.Nu().getValue("ChatRoomOwnerModTopic");
      if (bo.isNullOrNil(???))
        break label2807;
    }
    label575: label598: label1389: label2550: label2807: for (int j = bo.ank(???); ; j = 0)
    {
      if ((!bo.isNullOrNil(this.eih.field_roomowner)) && (j > 0) && (!JR()) && (j < this.eie))
        com.tencent.mm.ui.base.h.a(this, getString(2131302634, new Object[] { JH() }), null, getString(2131296955), new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
          }
        });
      boolean bool1;
      while (true)
      {
        AppMethodBeat.o(104026);
        return false;
        ??? = "";
        if (JO())
          ??? = this.ehM.Oj();
        paramPreference = new Intent();
        paramPreference.setClass(this, ModRemarkRoomNameUI.class);
        paramPreference.putExtra("room_name", ???);
        paramPreference.putExtra("RoomInfo_Id", this.ehq);
        startActivityForResult(paramPreference, 4);
        com.tencent.mm.plugin.report.service.h.pYm.a(219L, 3L, 1L, true);
        continue;
        if (???.equals("room_upgrade_entry"))
        {
          by(this);
        }
        else if (???.equals("room_qr_code"))
        {
          if (com.tencent.mm.model.t.mP(this.ehq))
          {
            ??? = new com.tencent.mm.g.b.a.t();
            ???.eO(this.ehq);
            ???.cXP = 6L;
            ???.ajK();
          }
          com.tencent.mm.plugin.report.service.h.pYm.a(219L, 5L, 1L, true);
          ??? = new Intent();
          ???.putExtra("from_userName", this.ehq);
          com.tencent.mm.bp.d.b(this, "setting", ".ui.setting.SelfQRCodeUI", ???);
        }
        else if (???.equals("room_card"))
        {
          bool1 = this.eih.aoo(r.Yz());
          if ((bo.isNullOrNil(com.tencent.mm.model.n.mC(this.ehq))) && (!JR()))
          {
            com.tencent.mm.ui.base.h.d(this, getString(2131302512), null, getString(2131302513), null, null, null);
          }
          else
          {
            ??? = new Intent();
            ???.setClass(this, RoomCardUI.class);
            ???.putExtra("RoomInfo_Id", this.ehq);
            ???.putExtra("room_name", this.ehN.eoj.toString());
            this.eie = com.tencent.mm.model.n.my(this.ehq).size();
            ???.putExtra("room_member_count", this.eie);
            ???.putExtra("room_owner_name", JH());
            ???.putExtra("room_notice", com.tencent.mm.model.n.mC(this.ehq));
            ???.putExtra("room_notice_publish_time", com.tencent.mm.model.n.mE(this.ehq));
            ???.putExtra("room_notice_editor", com.tencent.mm.model.n.mD(this.ehq));
            ???.putExtra("Is_RoomOwner", this.eic);
            ???.putExtra("Is_RoomManager", bool1);
            startActivityForResult(???, 6);
          }
        }
        else
        {
          if (???.equals("room_notify_new_msg"))
          {
            long l;
            if (!this.eif)
            {
              bool1 = true;
              this.eif = bool1;
              if (this.cEH)
              {
                if (!this.eif)
                  break label828;
                j = 0;
                com.tencent.mm.roomsdk.a.b.alY(this.ehq).E(this.ehq, j).dmX();
                this.ehM = ((com.tencent.mm.plugin.messenger.foundation.a.j)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XM().aoO(this.ehq);
                this.ehM.hE(j);
                ((com.tencent.mm.plugin.messenger.foundation.a.j)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XM().b(this.ehq, this.ehM);
                if (this.eim)
                {
                  ??? = com.tencent.mm.plugin.report.service.h.pYm;
                  if (!this.eif)
                    break label834;
                  l = 14L;
                  ???.k(869L, l, 1L);
                }
              }
              ??? = com.tencent.mm.modelstat.b.fRa;
              paramPreference = this.ehq;
              bool1 = this.eif;
              if ((???.aka()) && (???.cM(paramPreference)))
              {
                paramPreference = new IMBehavior();
                paramPreference.opType = 1;
                paramPreference.chattingOp = new IMBehaviorChattingOP();
                ??? = paramPreference.chattingOp;
                if (!bool1)
                  break label842;
                j = i;
                ((IMBehaviorChattingOP)???).changeNotifyStatus = j;
              }
            }
            synchronized (???.lock)
            {
              ???.fQZ.oplist_.add(paramPreference);
              JL();
              continue;
              bool1 = false;
              break label575;
              j = 1;
              break label598;
              l = 15L;
              break label706;
              j = 2;
            }
          }
          if (???.equals("room_save_to_contact"))
          {
            if (this.ehZ == null)
              this.ehZ = getSharedPreferences(getPackageName() + "_preferences", 0);
            paramPreference = ((com.tencent.mm.plugin.messenger.foundation.a.j)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XM().aoO(this.ehq);
            if (paramPreference != null)
            {
              boolean bool2 = com.tencent.mm.n.a.jh(paramPreference.field_type);
              ??? = this.ehZ.edit();
              if (!bool2)
              {
                bool1 = true;
                ???.putBoolean("room_save_to_contact", bool1).commit();
                if (!bool2)
                  break label1045;
                paramPreference.NC();
                com.tencent.mm.roomsdk.a.b.alY(this.ehq).a(paramPreference, false);
                com.tencent.mm.ui.base.h.bQ(this, getString(2131302605));
                com.tencent.mm.modelstat.b.fRa.R(this.ehq, false);
              }
              while (true)
              {
                this.ehK.notifyDataSetChanged();
                break;
                bool1 = false;
                break label964;
                com.tencent.mm.roomsdk.a.b.alY(this.ehq).a(paramPreference, true);
                com.tencent.mm.ui.base.h.bQ(this, getString(2131302621));
                com.tencent.mm.modelstat.b.fRa.R(this.ehq, true);
              }
            }
          }
          else if (???.equals("room_placed_to_the_top"))
          {
            ??? = getSharedPreferences(this.eis, 0);
            if (this.ehM != null)
            {
              if (((com.tencent.mm.plugin.messenger.foundation.a.j)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XR().aph(this.ehM.field_username))
              {
                com.tencent.mm.model.t.x(this.ehM.field_username, true);
                com.tencent.mm.modelstat.b.fRa.c(false, this.ehq, false);
              }
              while (true)
              {
                ???.edit().putBoolean("room_placed_to_the_top", ((com.tencent.mm.plugin.messenger.foundation.a.j)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XR().aph(this.ehM.field_username)).commit();
                break;
                com.tencent.mm.model.t.w(this.ehM.field_username, true);
                com.tencent.mm.modelstat.b.fRa.c(false, this.ehq, true);
              }
            }
          }
          else if (???.equals("room_nickname"))
          {
            paramPreference = JD();
            ??? = paramPreference;
            if (bo.isNullOrNil(paramPreference))
              ??? = r.YB();
            com.tencent.mm.ui.base.h.a(this.mController.ylL, getString(2131302580), ???, getString(2131302544), 32, new h.b()
            {
              public final boolean s(CharSequence paramAnonymousCharSequence)
              {
                AppMethodBeat.i(103969);
                if (paramAnonymousCharSequence == null)
                {
                  paramAnonymousCharSequence = "";
                  String str = com.tencent.mm.m.b.Ne();
                  if ((bo.isNullOrNil(str)) || (!paramAnonymousCharSequence.matches(".*[" + str + "].*")))
                    break label101;
                  com.tencent.mm.ui.base.h.bQ(ChatroomInfoUI.this.mController.ylL, ChatroomInfoUI.this.getString(2131300632, new Object[] { str }));
                  AppMethodBeat.o(103969);
                }
                for (boolean bool = false; ; bool = true)
                {
                  return bool;
                  paramAnonymousCharSequence = paramAnonymousCharSequence.toString();
                  break;
                  label101: if ((paramAnonymousCharSequence != null) && (!paramAnonymousCharSequence.equals(paramf)))
                    ChatroomInfoUI.a(ChatroomInfoUI.this, paramAnonymousCharSequence);
                  AppMethodBeat.o(103969);
                }
              }
            });
          }
          else
          {
            if (???.equals("room_msg_show_username"))
            {
              ??? = getSharedPreferences(this.eis, 0).edit();
              if (!this.eia)
              {
                bool1 = true;
                ???.putBoolean("room_msg_show_username", bool1).commit();
                if (this.eia)
                  break label1389;
              }
              for (bool1 = true; ; bool1 = false)
              {
                this.eia = bool1;
                this.eig = true;
                break;
                bool1 = false;
                break label1342;
              }
            }
            if (!???.equals("room_set_chatting_background"))
              break;
            if (com.tencent.mm.model.t.mP(this.ehq))
            {
              ??? = new com.tencent.mm.g.b.a.t();
              ???.eO(this.ehq);
              ???.cXP = 9L;
              ???.ajK();
            }
            ??? = new Intent();
            ???.putExtra("isApplyToAll", false);
            ???.putExtra("username", this.ehM.field_username);
            com.tencent.mm.bp.d.b(this, "setting", ".ui.setting.SettingsChattingBackgroundUI", ???, 2);
          }
        }
      }
      if (???.equals("room_search_chatting_content"))
      {
        if (com.tencent.mm.model.t.mP(this.ehq))
        {
          ??? = new com.tencent.mm.g.b.a.t();
          ???.eO(this.ehq);
          ???.cXP = 8L;
          ???.ajK();
        }
        ??? = new Intent();
        ???.putExtra("detail_username", this.ehq);
        com.tencent.mm.plugin.fts.a.d.c(this, ".ui.FTSChattingConvUI", ???);
        if ((this.eih == null) || (this.eih.afg() == null))
          break label2801;
      }
      for (j = this.eih.afg().size(); ; j = 0)
      {
        while (true)
        {
          com.tencent.mm.plugin.report.service.h.pYm.e(14569, new Object[] { Integer.valueOf(1), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(j), Integer.valueOf(1) });
          break;
          if (???.equals("room_clear_chatting_history"))
          {
            if (com.tencent.mm.model.t.mP(this.ehq))
            {
              ??? = new com.tencent.mm.g.b.a.t();
              ???.eO(this.ehq);
              ???.cXP = 11L;
              ???.ajK();
            }
            ??? = getString(2131299939);
            com.tencent.mm.ui.base.h.a(this.mController.ylL, ???, "", getString(2131296871), getString(2131296868), new ChatroomInfoUI.10(this), null, 2131689665);
            break;
          }
          if (???.equals("room_report_it"))
          {
            if (com.tencent.mm.model.t.mP(this.ehq))
            {
              ??? = new com.tencent.mm.g.b.a.t();
              ???.eO(this.ehq);
              ???.cXP = 10L;
              ???.ajK();
            }
            ??? = new Intent();
            ???.putExtra("k_username", this.ehq);
            ???.putExtra("showShare", false);
            ???.putExtra("rawUrl", String.format("https://weixin110.qq.com/security/readtemplate?t=weixin_report/w_type&scene=%d#wechat_redirect", new Object[] { Integer.valueOf(36) }));
            com.tencent.mm.bp.d.b(this, "webview", ".ui.tools.WebViewUI", ???);
            paramPreference = com.tencent.mm.modelstat.b.fRa;
            ??? = this.ehq;
            if ((!paramPreference.aka()) || (!paramPreference.cM(???)))
              break;
            ??? = new IMBehavior();
            ((IMBehavior)???).opType = 1;
            ((IMBehavior)???).chattingOp = new IMBehaviorChattingOP();
            ((IMBehavior)???).chattingOp.expose = 1;
            synchronized (paramPreference.lock)
            {
              paramPreference.fQZ.oplist_.add(???);
            }
          }
        }
        if (???.equals("room_del_quit"))
        {
          ab.d("MicroMsg.ChatroomInfoUI", " quit " + this.ehq);
          ??? = new sz();
          ???.cPf.cPh = true;
          com.tencent.mm.sdk.b.a.xxA.m(???);
          if ((!bo.isNullOrNil(this.ehq)) && (this.ehq.equals(???.cPg.cPj)))
          {
            bool1 = true;
            if (!bool1)
              break label2170;
            ab.d("MicroMsg.ChatroomInfoUI", " quit talkroom" + this.ehq);
          }
          label2170: 
          while ((!this.eic) || (this.eih.afg().size() <= 2))
          {
            com.tencent.mm.ui.base.h.a(this.mController.ylL, getString(2131298858), "", getString(2131296994), getString(2131296868), new ChatroomInfoUI.14(this, bool1), null, 2131689665);
            break;
            bool1 = false;
            break label2083;
          }
          ??? = getString(2131302594);
          paramPreference = getString(2131296868);
          ??? = new ChatroomInfoUI.13(this);
          com.tencent.mm.ui.base.h.a(this, "", new String[] { ??? }, paramPreference, ???);
          break;
        }
        if (???.equals("add_selector_btn"))
        {
          JF();
          break;
        }
        if (???.equals("del_selector_btn"))
        {
          JG();
          break;
        }
        if (???.equals("see_room_member"))
        {
          ??? = new Intent();
          ???.setClass(this.mController.ylL, SeeRoomMemberUI.class);
          ???.putExtra("Block_list", r.Yz());
          paramPreference = com.tencent.mm.model.n.my(this.ehq);
          if (paramPreference != null)
            this.eie = paramPreference.size();
          ???.putExtra("Chatroom_member_list", bo.c(paramPreference, ","));
          ???.putExtra("RoomInfo_Id", this.ehq);
          ???.putExtra("room_owner_name", this.eih.field_roomowner);
          ???.putExtra("Is_RoomOwner", this.eic);
          ???.putExtra("room_member_count", this.eie);
          ???.putExtra("Add_address_titile", getString(2131302625));
          if (this.cEH)
          {
            ???.putExtra("Contact_Scene", 14);
            paramPreference = this.nDp.getChildAt(0);
            if (paramPreference != null)
              break label2550;
          }
          for (j = 0; ; j = -paramPreference.getTop())
          {
            ???.putExtra("offset", j);
            ???.putExtra("first_pos", this.nDp.getFirstVisiblePosition());
            ???.putExtra("room_name", this.ehM.field_username);
            startActivityForResult(???, 5);
            this.eiq = 5;
            break;
            if (!this.ehL)
              break label2438;
            ???.putExtra("Contact_Scene", 44);
            if (r.mG(this.ehM.field_username))
              break label2438;
            ???.putExtra("Contact_IsLBSFriend", true);
            break label2438;
          }
        }
        if (???.equals("manage_room"))
        {
          ??? = new Intent();
          ???.setClass(this.mController.ylL, ManageChatroomUI.class);
          ???.putExtra("RoomInfo_Id", this.ehq);
          ???.putExtra("room_owner_name", this.eih.field_roomowner);
          startActivity(???);
          break;
        }
        if (???.equals("chat_room_app_brand"))
        {
          if (com.tencent.mm.model.t.mP(this.ehq))
          {
            ??? = new com.tencent.mm.g.b.a.t();
            ???.eO(this.ehq);
            ???.cXP = 7L;
            ???.ajK();
          }
          ??? = new Intent();
          ???.putExtra("Chat_User", this.ehq);
          com.tencent.mm.bp.d.f(this, ".ui.chatting.gallery.AppBrandHistoryListUI", ???);
          com.tencent.mm.plugin.report.service.h.pYm.a(219L, 25L, 1L, true);
          break;
        }
        if (???.equals("room_manager_view"))
        {
          ??? = new Intent();
          ???.setClass(this.mController.ylL, SeeRoomOwnerManagerUI.class);
          ???.putExtra("RoomInfo_Id", this.ehq);
          ???.putExtra("room_owner_name", this.eih.field_roomowner);
          startActivity(???);
          break;
        }
        ???.equals("chat_room_story_videos");
        break;
      }
    }
  }

  public final void initView()
  {
    AppMethodBeat.i(104025);
    this.ehK = this.yCw;
    Object localObject1;
    label94: boolean bool;
    if (this.cEH)
      if (this.eie == 0)
      {
        setMMTitle(getString(2131302657));
        localObject1 = null;
        if (this.eih != null)
        {
          localObject1 = this.eih.field_roomowner;
          this.eie = this.eih.afg().size();
        }
        if (!bo.isNullOrNil((String)localObject1))
          break label1220;
        this.eib = false;
        this.eic = false;
        this.eid = false;
        ab.d("MicroMsg.ChatroomInfoUI", "initBaseChatRoomView()");
        this.ehS = ((ContactListExpandPreference)this.ehK.aqO("roominfo_contact_anchor"));
        this.ehS.a(this.ehK, this.ehS.mKey);
        this.ehR = ((NormalIconPreference)this.ehK.aqO("del_selector_btn"));
        this.ehQ = ((NormalIconPreference)this.ehK.aqO("add_selector_btn"));
        this.ehO = this.ehK.aqO("room_name");
        this.ehN = ((RoomCardPreference)this.ehK.aqO("room_card"));
        this.ehP = this.ehK.aqO("see_room_member");
        this.ehT = ((CheckBoxPreference)this.ehK.aqO("room_notify_new_msg"));
        this.ehU = ((CheckBoxPreference)this.ehK.aqO("room_save_to_contact"));
        this.ehV = ((CheckBoxPreference)this.ehK.aqO("room_placed_to_the_top"));
        this.ehW = ((KeyValuePreference)this.ehK.aqO("room_nickname"));
        this.ehY = this.ehK.aqO("manage_room");
        this.ehS.oD(true).oE(true).djG();
        bool = ((com.tencent.mm.plugin.chatroom.a.c)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.chatroom.a.c.class)).HH(this.ehq);
        if (JR())
          break label1244;
        this.ehK.ce("manage_room", true);
        localObject1 = this.ehK;
        if (bool)
          break label1239;
        bool = true;
        label386: ((com.tencent.mm.ui.base.preference.f)localObject1).ce("room_manager_view", bool);
        label396: if (com.tencent.mm.model.t.mP(this.ehq))
        {
          if (!JR())
            break label1300;
          this.ehK.ce("manage_room", false);
        }
        label426: if (this.eih != null)
        {
          this.ehS.ajF(this.eih.field_roomowner);
          if (!bo.isNullOrNil(this.eih.field_roomowner))
            this.ehS.vld.vkt.vkT = true;
        }
        this.ehS.djF();
        this.ehS.djz();
        this.ehK.ce("add_selector_btn", true);
        this.ehK.ce("del_selector_btn", true);
        this.ehK.ce("room_name", false);
        this.ehK.ce("room_qr_code", false);
        this.ehK.ce("chatroom_info_chexboxes", true);
        this.ehK.ce("room_card", false);
        this.ehK.ce("room_upgrade_entry", true);
        this.ehK.ce("chat_room_story_videos", true);
        if (((JR()) || (this.eie < com.tencent.mm.pluginsdk.ui.applet.j.MAX_COUNT)) && ((!JR()) || (this.eie < com.tencent.mm.pluginsdk.ui.applet.j.MAX_COUNT - 1)))
          break label1316;
        this.ehK.ce("see_room_member", false);
        this.ehP.setTitle(getString(2131302865));
        label655: if (ad.aoy(this.ehq))
          break label1332;
        this.ehK.ce("room_openim_about", true);
        label678: ab.d("MicroMsg.ChatroomInfoUI", "updatePlaceTop()");
        if (this.ehZ == null)
          this.ehZ = getSharedPreferences(getPackageName() + "_preferences", 0);
        if (this.ehV != null)
        {
          if (this.ehM == null)
            break label1441;
          this.ehZ.edit().putBoolean("room_placed_to_the_top", ((com.tencent.mm.plugin.messenger.foundation.a.j)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XR().aph(this.ehM.field_username)).commit();
        }
        label788: this.ehK.notifyDataSetChanged();
        ab.d("MicroMsg.ChatroomInfoUI", "updateSaveToContact()");
        if (this.ehZ == null)
          this.ehZ = getSharedPreferences(getPackageName() + "_preferences", 0);
        if (this.ehU == null)
          break label1498;
        localObject1 = ((com.tencent.mm.plugin.messenger.foundation.a.j)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XM().aoO(this.ehq);
        if (localObject1 != null)
          break label1468;
        ab.e("MicroMsg.ChatroomInfoUI", "contact == null !!!");
        label887: ab.d("MicroMsg.ChatroomInfoUI", "updateDisplayNickname()");
        if (this.ehZ == null)
          this.ehZ = getSharedPreferences(getPackageName() + "_preferences", 0);
        localObject1 = ((com.tencent.mm.plugin.chatroom.a.c)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.chatroom.a.c.class)).XV().oa(this.ehq);
        if (localObject1 != null)
          break label1510;
        ab.e("MicroMsg.ChatroomInfoUI", "members == null !!!");
        label970: this.eii = ((com.tencent.mm.plugin.messenger.foundation.a.j)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).bOr().Rq(this.ehq);
        this.eii = ((com.tencent.mm.plugin.messenger.foundation.a.j)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).bOr().Rq(this.ehq);
      }
    while (true)
    {
      if (this.ehS != null)
      {
        if ((!this.cEH) && (this.ehL))
          this.ehS.ag(new ArrayList());
        this.nDp.setOnScrollListener(this.ein);
        this.ehS.a(this.ein);
        this.ehS.a(new ChatroomInfoUI.45(this));
        localObject1 = this.ehS;
        localObject2 = new ChatroomInfoUI.2(this);
        if (((ContactListExpandPreference)localObject1).vld != null)
          ((ContactListExpandPreference)localObject1).vld.pLd = ((View.OnClickListener)localObject2);
        this.ehS.a(new ChatroomInfoUI.3(this));
      }
      setBackBtn(new ChatroomInfoUI.4(this));
      AppMethodBeat.o(104025);
      return;
      if (this.eih != null)
        this.eie = this.eih.afg().size();
      setMMTitle(getString(2131299931, new Object[] { getString(2131302657), Integer.valueOf(this.eie) }));
      break;
      label1220: this.eib = true;
      this.eic = ((String)localObject1).equals(r.Yz());
      break label94;
      label1239: bool = false;
      break label386;
      label1244: this.ehK.ce("room_manager_view", true);
      if (com.tencent.mm.model.n.mA(this.ehq) > 2)
      {
        this.ehK.ce("manage_room", false);
        break label396;
      }
      this.ehK.ce("manage_room", true);
      break label396;
      label1300: this.ehK.ce("manage_room", true);
      break label426;
      label1316: this.ehK.ce("see_room_member", true);
      break label655;
      label1332: this.ehK.ce("chatroom_bottom_pc", true);
      this.ehK.ce("room_openim_about", false);
      Object localObject2 = getString(2131302592);
      localObject1 = getString(2131302593);
      int i = ((String)localObject2).lastIndexOf((String)localObject1);
      if (i < 0)
        break label678;
      int j = ((String)localObject1).length();
      localObject1 = new SpannableStringBuilder((CharSequence)localObject2);
      ((SpannableStringBuilder)localObject1).setSpan(new com.tencent.mm.plugin.messenger.a.a()
      {
        public final void onClickImp(View paramAnonymousView)
        {
          AppMethodBeat.i(103968);
          paramAnonymousView = new Intent();
          paramAnonymousView.setFlags(268435456);
          paramAnonymousView.setClassName(ah.getContext(), "com.tencent.mm.plugin.webview.ui.tools.WebViewUI");
          paramAnonymousView.putExtra("rawUrl", "https://weixin.qq.com/cgi-bin/newreadtemplate?t=work_wechat/about_group");
          ah.getContext().startActivity(paramAnonymousView);
          AppMethodBeat.o(103968);
        }
      }
      , i, j + i, 18);
      this.ehK.aqO("room_openim_about").setTitle((CharSequence)localObject1);
      break label678;
      label1441: this.ehZ.edit().putBoolean("room_placed_to_the_top", false).commit();
      break label788;
      label1468: this.ehZ.edit().putBoolean("room_save_to_contact", com.tencent.mm.n.a.jh(((com.tencent.mm.g.c.ap)localObject1).field_type)).commit();
      label1498: this.ehK.notifyDataSetChanged();
      break label887;
      label1510: this.eia = ((u)localObject1).drX();
      this.ehX = ((CheckBoxPreference)this.ehK.aqO("room_msg_show_username"));
      if (this.ehX != null)
        this.ehZ.edit().putBoolean("room_msg_show_username", this.eia).commit();
      this.ehK.notifyDataSetChanged();
      break label970;
      if (this.ehL)
      {
        this.eic = false;
        this.eid = false;
        setMMTitle(getString(2131302558));
        this.ehS = ((ContactListExpandPreference)this.ehK.aqO("roominfo_contact_anchor"));
        this.ehS.a(this.ehK, this.ehS.mKey);
        this.ehS.oD(false).oE(false);
        this.ehS.a(new k.b()
        {
          public final boolean iD(int paramAnonymousInt)
          {
            return true;
          }
        });
        this.ehK.removeAll();
        this.ehK.b(new PreferenceCategory(this));
        this.ehK.b(this.ehS);
        localObject2 = this.ehq;
        localObject1 = new ko();
        ((ko)localObject1).cGu.cEw = ((String)localObject2);
        com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject1);
        getString(2131297061);
        this.ehJ = com.tencent.mm.ui.base.h.b(this, getString(2131302556), true, new DialogInterface.OnCancelListener()
        {
          public final void onCancel(DialogInterface paramAnonymousDialogInterface)
          {
            AppMethodBeat.i(104003);
            ChatroomInfoUI.a(this.eiT);
            AppMethodBeat.o(104003);
          }
        });
        this.ehK.notifyDataSetChanged();
      }
    }
  }

  public final void k(String paramString1, String paramString2, String paramString3)
  {
    AppMethodBeat.i(104053);
    if ((paramString1.equals(this.ehq)) && (this.ehS != null))
      this.ehS.notifyChanged();
    AppMethodBeat.o(104053);
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(104024);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    switch (paramInt1)
    {
    case 3:
    default:
      AppMethodBeat.o(104024);
    case 1:
    case 7:
    case 2:
    case 4:
    case 5:
    case 6:
    }
    while (true)
    {
      return;
      if (paramIntent == null)
      {
        AppMethodBeat.o(104024);
      }
      else
      {
        paramIntent = paramIntent.getStringExtra("Select_Contact");
        Object localObject = ((com.tencent.mm.plugin.chatroom.a.c)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.chatroom.a.c.class)).XV().oa(this.ehq);
        if (localObject != null)
        {
          paramInt1 = ((u)localObject).drV();
          if (((paramInt1 == 2) || (paramInt1 == 1)) && (!JR()))
          {
            localObject = new e.a(this).asL(getString(2131302488));
            ((e.a)localObject).zQJ = getString(2131297041);
            localObject = ((e.a)localObject).re(true).m(Boolean.TRUE);
            ((e.a)localObject).zQK = getString(2131296868);
            ((e.a)localObject).asN(getString(2131302178)).c(new ChatroomInfoUI.44(this, paramIntent)).show();
            AppMethodBeat.o(104024);
            continue;
          }
          b(paramIntent, null, 2131296430);
          AppMethodBeat.o(104024);
          continue;
          if (paramIntent == null)
          {
            AppMethodBeat.o(104024);
            continue;
          }
          paramIntent = paramIntent.getStringExtra("Select_Contact");
          if ((paramIntent == null) || (paramIntent.equals("")))
          {
            AppMethodBeat.o(104024);
            continue;
          }
          paramIntent = bo.P(paramIntent.split(","));
          paramIntent = com.tencent.mm.roomsdk.a.b.alY(this.ehq).a(this.ehq, paramIntent, 0);
          paramIntent.b(new ChatroomInfoUI.19(this));
          paramIntent.c(new ChatroomInfoUI.20(this));
          getString(2131297061);
          paramIntent.a(this, getString(2131302524), true, new ChatroomInfoUI.21(this, paramIntent));
          AppMethodBeat.o(104024);
          continue;
          if (paramInt2 == -1)
          {
            finish();
            AppMethodBeat.o(104024);
            continue;
            if (paramInt2 == -1)
            {
              paramIntent = paramIntent.getStringExtra("room_name");
              if (!bo.isNullOrNil(paramIntent))
              {
                com.tencent.mm.sdk.b.a.xxA.m(new tv());
                this.ehM.iB(paramIntent);
                ((com.tencent.mm.plugin.messenger.foundation.a.j)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XM().Y(this.ehM);
                JN();
              }
              AppMethodBeat.o(104024);
              continue;
              if (paramInt2 == 0)
              {
                this.eiq = -1;
                AppMethodBeat.o(104024);
                continue;
                if (paramInt2 != -1)
                  break;
                JM();
                break;
              }
            }
          }
        }
        AppMethodBeat.o(104024);
      }
    }
  }

  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    AppMethodBeat.i(104020);
    super.onConfigurationChanged(paramConfiguration);
    this.ehS.notifyChanged();
    AppMethodBeat.o(104020);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(104017);
    super.onCreate(paramBundle);
    com.tencent.mm.kernel.g.RO().eJo.a(480, this);
    com.tencent.mm.pluginsdk.c.b.a(ko.class.getName(), this.eiw);
    paramBundle = this.eip.dnU();
    Assert.assertNotNull(this);
    keep(paramBundle);
    com.tencent.mm.kernel.g.RP().Ry().a(this);
    ((com.tencent.mm.plugin.chatroom.a.c)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.chatroom.a.c.class)).XV().c(this);
    if (com.tencent.mm.bg.g.fUs != null)
      com.tencent.mm.bg.g.fUs.a(this);
    this.ehq = getIntent().getStringExtra("RoomInfo_Id");
    this.ehM = ((com.tencent.mm.plugin.messenger.foundation.a.j)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XM().aoO(this.ehq);
    this.eij = true;
    this.cEH = getIntent().getBooleanExtra("Is_Chatroom", true);
    this.ehL = getIntent().getBooleanExtra("Is_Lbsroom", false);
    this.eik = getIntent().getBooleanExtra("fromChatting", false);
    this.eil = getIntent().getBooleanExtra("isShowSetMuteAnimation", false);
    this.eis = (getPackageName() + "_preferences");
    if (this.cEH)
    {
      this.eih = ((com.tencent.mm.plugin.chatroom.a.c)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.chatroom.a.c.class)).XV().oa(this.ehq);
      if (this.eih != null)
        this.eid = this.eih.aoo(r.Yz());
    }
    initView();
    if (this.cEH)
    {
      paramBundle = new ChatroomInfoUI.22(this);
      if (this.eih == null)
      {
        ao.a.flu.a(this.ehq, "", paramBundle);
        AppMethodBeat.o(104017);
      }
    }
    while (true)
    {
      return;
      if (System.currentTimeMillis() - this.eih.field_modifytime >= 86400000L)
        com.tencent.mm.kernel.g.RS().aa(new ChatroomInfoUI.32(this, paramBundle));
      AppMethodBeat.o(104017);
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(104023);
    if (com.tencent.mm.bg.g.fUs != null)
      com.tencent.mm.bg.g.fUs.a(this);
    com.tencent.mm.kernel.g.RP().Ry().b(this);
    com.tencent.mm.ui.g.a.dismiss();
    com.tencent.mm.kernel.g.RO().eJo.b(480, this);
    com.tencent.mm.sdk.b.a.xxA.d(this.eip);
    com.tencent.mm.pluginsdk.c.b.b(ko.class.getName(), this.eiw);
    if (com.tencent.mm.kernel.g.RK())
    {
      ((com.tencent.mm.plugin.messenger.foundation.a.j)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XM().b(this);
      ((com.tencent.mm.plugin.chatroom.a.c)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.chatroom.a.c.class)).XV().d(this);
    }
    if (com.tencent.mm.bg.g.fUs != null)
      com.tencent.mm.bg.g.fUs.b(this);
    if (this.eix != null)
      this.eix.stopTimer();
    super.onDestroy();
    AppMethodBeat.o(104023);
  }

  public void onPause()
  {
    AppMethodBeat.i(104022);
    super.onPause();
    if ((this.eig) && (this.cEH))
      if (this.eih == null)
        AppMethodBeat.o(104022);
    while (true)
    {
      return;
      com.tencent.mm.model.n.a(this.ehq, this.eih, this.eia);
      AppMethodBeat.o(104022);
    }
  }

  public void onResume()
  {
    AppMethodBeat.i(104019);
    super.onResume();
    this.ehK.notifyDataSetChanged();
    Object localObject;
    boolean bool;
    if (this.eih != null)
    {
      localObject = this.eih.drY();
      if (localObject != null)
      {
        bool = com.tencent.mm.model.n.N(this.eih.field_chatroomname, ((com.tencent.mm.j.a.a.a)localObject).eoy);
        ab.i("MicroMsg.ChatroomInfoUI", "roomId:%s newVer:%s localVer:%s owner:%s", new Object[] { this.eih.field_chatroomname, Integer.valueOf(((com.tencent.mm.j.a.a.a)localObject).eoy), Integer.valueOf(this.eih.field_chatroomVersion), this.eih.field_roomowner });
      }
    }
    while (true)
    {
      if ((com.tencent.mm.model.n.mt(this.ehq)) || (bool))
        JB();
      JM();
      updateTitle();
      JL();
      if (this.cEH)
      {
        JN();
        JK();
      }
      if (this.eij)
      {
        JJ();
        this.eij = false;
      }
      localObject = getIntent().getStringExtra("need_matte_high_light_item");
      if (!this.eio)
      {
        if (!bo.isNullOrNil((String)localObject))
          kf((String)localObject);
        this.eio = true;
      }
      if ((!bo.isNullOrNil((String)localObject)) && (((String)localObject).equals("room_notify_new_notice")) && (!this.eio))
      {
        kf("room_card");
        this.eio = true;
      }
      ab.d("MicroMsg.ChatroomInfoUI", "showSetMuteAnimation isShowSetMuteAnimation[%b]", new Object[] { Boolean.valueOf(this.eil) });
      if (this.eil)
      {
        this.eil = false;
        al.n(new ChatroomInfoUI.38(this), 50L);
      }
      AppMethodBeat.o(104019);
      return;
      bool = false;
    }
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ai.m paramm)
  {
    AppMethodBeat.i(104049);
    ab.i("MicroMsg.ChatroomInfoUI", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    ab.d("MicroMsg.ChatroomInfoUI", "pre is " + this.eie);
    this.eie = com.tencent.mm.model.n.mA(this.ehq);
    ab.d("MicroMsg.ChatroomInfoUI", "now is " + this.eie);
    if (this.ehJ != null)
      this.ehJ.dismiss();
    AppMethodBeat.o(104049);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }

  static final class a
    implements DialogInterface.OnCancelListener
  {
    public final void onCancel(DialogInterface paramDialogInterface)
    {
      AppMethodBeat.i(104015);
      ChatroomInfoUI.bC(true);
      AppMethodBeat.o(104015);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.chatroom.ui.ChatroomInfoUI
 * JD-Core Version:    0.6.2
 */