package com.tencent.mm.ui.bizchat;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.os.Looper;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.ListView;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.aj.a.b;
import com.tencent.mm.aj.a.c;
import com.tencent.mm.aj.a.d.a;
import com.tencent.mm.aj.a.e;
import com.tencent.mm.aj.a.k;
import com.tencent.mm.aj.z;
import com.tencent.mm.at.o;
import com.tencent.mm.chatroom.ui.preference.SignaturePreference;
import com.tencent.mm.pluginsdk.ui.applet.ContactListExpandPreference;
import com.tencent.mm.protocal.protobuf.acr;
import com.tencent.mm.protocal.protobuf.kd;
import com.tencent.mm.protocal.protobuf.kf;
import com.tencent.mm.protocal.protobuf.kg;
import com.tencent.mm.protocal.protobuf.un;
import com.tencent.mm.protocal.protobuf.uo;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.preference.CheckBoxPreference;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.chatting.ChattingUI;
import com.tencent.mm.ui.q;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class BizChatroomInfoUI extends MMPreference
  implements com.tencent.mm.ai.f, com.tencent.mm.aj.n
{
  private static boolean eiu = false;
  private ProgressDialog ehJ;
  private com.tencent.mm.ui.base.preference.f ehK;
  private ContactListExpandPreference ehS;
  private CheckBoxPreference ehT;
  private CheckBoxPreference ehU;
  private CheckBoxPreference ehV;
  private SharedPreferences ehZ;
  private boolean eic;
  private int eie;
  private boolean eif;
  private com.tencent.mm.pluginsdk.ui.d ein;
  boolean eio;
  private SignaturePreference ekx;
  private int fromScene;
  private boolean isDeleteCancel;
  private long jMj;
  private String jMp;
  private com.tencent.mm.aj.a.j pmx;
  private boolean sjy;
  private c yDI;
  private d.a yEn;
  private String yFk;
  private boolean yFl;
  private boolean yFm;
  private int yFn;
  private com.tencent.mm.aj.a.j yFo;

  public BizChatroomInfoUI()
  {
    AppMethodBeat.i(30211);
    this.ehJ = null;
    this.ehZ = null;
    this.eic = false;
    this.yFl = false;
    this.yDI = null;
    this.pmx = null;
    this.yFo = null;
    this.ein = new com.tencent.mm.pluginsdk.ui.d(new AbsListView.OnScrollListener()
    {
      public final void onScroll(AbsListView paramAnonymousAbsListView, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
      }

      public final void onScrollStateChanged(AbsListView paramAnonymousAbsListView, int paramAnonymousInt)
      {
        AppMethodBeat.i(30196);
        o.ahp().cm(paramAnonymousInt);
        AppMethodBeat.o(30196);
      }
    });
    this.eio = false;
    this.isDeleteCancel = false;
    this.yEn = new BizChatroomInfoUI.3(this);
    AppMethodBeat.o(30211);
  }

  private void H(boolean paramBoolean, int paramInt)
  {
    AppMethodBeat.i(30223);
    this.yFn = this.yDI.field_bitFlag;
    this.yFk = this.yDI.field_chatName;
    Object localObject;
    if (this.yFl)
    {
      if (paramBoolean)
        localObject = this.yDI;
      for (((c)localObject).field_bitFlag |= paramInt; ; ((c)localObject).field_bitFlag &= (paramInt ^ 0xFFFFFFFF))
      {
        ab.i("MicroMsg.BizChatroomInfoUI", "dealSetMute:bitFlag %s", new Object[] { Integer.valueOf(this.yDI.field_bitFlag) });
        z.aeT().b(this.yDI);
        localObject = new kd();
        ((kd)localObject).vMV = this.yDI.field_bizChatServId;
        ((kd)localObject).vMX = this.yDI.field_bitFlag;
        z.aeZ();
        com.tencent.mm.aj.a.h.a(this.yDI.field_brandUserName, (kd)localObject, this);
        AppMethodBeat.o(30223);
        return;
        localObject = this.yDI;
      }
    }
    if (paramBoolean)
      localObject = this.pmx;
    for (((com.tencent.mm.aj.a.j)localObject).field_bitFlag |= paramInt; ; ((com.tencent.mm.aj.a.j)localObject).field_bitFlag &= (paramInt ^ 0xFFFFFFFF))
    {
      z.aeV().b(this.pmx);
      this.yDI.field_bitFlag = this.pmx.field_bitFlag;
      z.aeT().b(this.yDI);
      break;
      localObject = this.pmx;
    }
  }

  private void JJ()
  {
    AppMethodBeat.i(30225);
    Object localObject;
    if (this.ehS != null)
    {
      if (!this.yFl)
        break label82;
      localObject = e.fC(this.jMj);
      if (localObject == null)
        break label107;
      this.eie = ((List)localObject).size();
      label42: if (this.eie > 1)
        break label115;
      this.ehS.oD(true).oE(false);
    }
    while (true)
    {
      this.ehS.u(this.jMp, (List)localObject);
      AppMethodBeat.o(30225);
      return;
      label82: localObject = new LinkedList();
      ((List)localObject).add(this.yDI.field_bizChatServId);
      break;
      label107: this.eie = 0;
      break label42;
      label115: this.ehS.oD(true).oE(this.eic);
    }
  }

  private void JL()
  {
    AppMethodBeat.i(30228);
    if (this.ehZ == null)
      this.ehZ = getSharedPreferences(getPackageName() + "_preferences", 0);
    if (this.yFl)
    {
      this.eif = this.yDI.lc(1);
      this.yFn = this.yDI.field_bitFlag;
      if (!this.eif)
        break label159;
      setTitleMuteIconVisibility(0);
      if (this.ehT != null)
        this.ehZ.edit().putBoolean("room_notify_new_msg", true).commit();
    }
    while (true)
    {
      this.ehK.notifyDataSetChanged();
      AppMethodBeat.o(30228);
      return;
      this.eif = this.pmx.lc(1);
      this.yFn = this.pmx.field_bitFlag;
      break;
      label159: setTitleMuteIconVisibility(8);
      if (this.ehT != null)
        this.ehZ.edit().putBoolean("room_notify_new_msg", false).commit();
    }
  }

  private void JN()
  {
    AppMethodBeat.i(30229);
    if (this.ekx != null)
      if (JO())
      {
        Object localObject1 = this.yDI.field_chatName;
        Object localObject2 = localObject1;
        if (localObject1 != null)
        {
          localObject2 = localObject1;
          if (((String)localObject1).length() > 50)
            localObject2 = ((String)localObject1).substring(0, 32);
        }
        ab.i("MicroMsg.BizChatroomInfoUI", "updateRoomName chatName:%s", new Object[] { localObject2 });
        SignaturePreference localSignaturePreference = this.ekx;
        if (localObject2 != null)
        {
          localObject1 = localObject2;
          if (((String)localObject2).length() > 0);
        }
        else
        {
          localObject1 = getString(2131303260);
        }
        localSignaturePreference.setSummary(com.tencent.mm.pluginsdk.ui.e.j.b(this, (CharSequence)localObject1));
        AppMethodBeat.o(30229);
      }
    while (true)
    {
      return;
      this.ekx.setSummary(getString(2131302551));
      AppMethodBeat.o(30229);
    }
  }

  private boolean JO()
  {
    AppMethodBeat.i(30231);
    String str;
    boolean bool;
    if (this.yFl)
    {
      str = this.yDI.field_chatName;
      if (!bo.isNullOrNil(str))
        break label49;
      bool = false;
      AppMethodBeat.o(30231);
    }
    while (true)
    {
      return bool;
      str = this.pmx.field_userName;
      break;
      label49: bool = true;
      AppMethodBeat.o(30231);
    }
  }

  private void Kb()
  {
    AppMethodBeat.i(30220);
    dAX();
    dAY();
    caY();
    JL();
    AppMethodBeat.o(30220);
  }

  private void a(kg paramkg1, kg paramkg2)
  {
    AppMethodBeat.i(30218);
    ab.i("MicroMsg.BizChatroomInfoUI", "updateBizChatMemberList()");
    if (paramkg1 == null);
    for (String str = getString(2131302524); ; str = getString(2131296430))
    {
      z.aeZ();
      paramkg1 = com.tencent.mm.aj.a.h.a(this.yDI.field_brandUserName, this.yDI.field_bizChatServId, paramkg1, paramkg2, this);
      getString(2131297061);
      this.ehJ = com.tencent.mm.ui.base.h.b(this, str, true, new BizChatroomInfoUI.6(this, paramkg1));
      AppMethodBeat.o(30218);
      return;
    }
  }

  private boolean aqX(String paramString)
  {
    boolean bool = true;
    AppMethodBeat.i(30217);
    if (paramString != null);
    label285: 
    while (true)
    {
      try
      {
        JSONArray localJSONArray = new org/json/JSONArray;
        localJSONArray.<init>(paramString);
        kg localkg = new com/tencent/mm/protocal/protobuf/kg;
        localkg.<init>();
        int i = 0;
        if (i < localJSONArray.length())
        {
          Object localObject = localJSONArray.getJSONObject(i);
          String str = ((JSONObject)localObject).getString("id");
          paramString = z.aeV().cH(str);
          if (paramString != null)
            break label285;
          paramString = new com/tencent/mm/aj/a/j;
          paramString.<init>();
          paramString.field_userId = str;
          paramString.field_userName = ((JSONObject)localObject).getString("nick_name");
          paramString.field_brandUserName = this.jMp;
          paramString.field_headImageUrl = ((JSONObject)localObject).getString("head_img_url");
          paramString.field_profileUrl = ((JSONObject)localObject).getString("profile_url");
          paramString.field_UserVersion = ((JSONObject)localObject).getInt("ver");
          if (this.yFo != null)
          {
            localObject = this.yFo.field_addMemberUrl;
            paramString.field_addMemberUrl = ((String)localObject);
            if (!z.aeV().b(paramString))
              z.aeV().a(paramString);
            localObject = new com/tencent/mm/protocal/protobuf/kf;
            ((kf)localObject).<init>();
            ((kf)localObject).vNc = paramString.field_userId;
            localkg.vNd.add(localObject);
            i++;
            continue;
          }
          localObject = null;
          continue;
        }
        a(localkg, null);
        AppMethodBeat.o(30217);
        return bool;
      }
      catch (JSONException paramString)
      {
        ab.i("MicroMsg.BizChatroomInfoUI", "parse memberJson Exception:%s", new Object[] { paramString.getMessage() });
        ab.printErrStackTrace("MicroMsg.BizChatroomInfoUI", paramString, "", new Object[0]);
      }
      AppMethodBeat.o(30217);
      bool = false;
    }
  }

  private void caY()
  {
    AppMethodBeat.i(30227);
    ab.d("MicroMsg.BizChatroomInfoUI", "updatePlaceTop()");
    if (this.ehZ == null)
      this.ehZ = getSharedPreferences(getPackageName() + "_preferences", 0);
    if (this.yFl)
      this.yFm = this.yDI.lc(16);
    for (this.yFn = this.yDI.field_bitFlag; ; this.yFn = this.pmx.field_bitFlag)
    {
      if (this.ehV != null)
        this.ehZ.edit().putBoolean("room_placed_to_the_top", this.yFm).commit();
      this.ehK.notifyDataSetChanged();
      AppMethodBeat.o(30227);
      return;
      this.yFm = this.pmx.lc(16);
    }
  }

  private void dAX()
  {
    AppMethodBeat.i(30221);
    ab.d("MicroMsg.BizChatroomInfoUI", "initBaseChatRoomView()");
    this.ehS = ((ContactListExpandPreference)this.ehK.aqO("roominfo_contact_anchor"));
    this.ehS.a(this.ehK, this.ehS.mKey);
    this.ekx = ((SignaturePreference)this.ehK.aqO("room_name"));
    this.ehT = ((CheckBoxPreference)this.ehK.aqO("room_notify_new_msg"));
    this.ehV = ((CheckBoxPreference)this.ehK.aqO("room_placed_to_the_top"));
    this.ehU = ((CheckBoxPreference)this.ehK.aqO("room_save_to_contact"));
    this.ehS.oB(this.yFl);
    this.ehS.oC(this.eic);
    if (this.eic)
      this.ehS.oD(true).oE(true);
    while (true)
    {
      this.ehS.ajF(this.yDI.field_ownerUserId);
      this.ehS.djF();
      this.ehS.djz();
      if (!this.yFl)
      {
        this.ehK.ce("room_save_to_contact", true);
        this.ehK.ce("room_name", true);
        this.ehK.ce("room_del_quit", true);
      }
      AppMethodBeat.o(30221);
      return;
      this.ehS.oD(true).oE(false);
    }
  }

  private void dAY()
  {
    AppMethodBeat.i(30226);
    ab.d("MicroMsg.BizChatroomInfoUI", "updateSaveToContact()");
    if (this.ehZ == null)
      this.ehZ = getSharedPreferences(getPackageName() + "_preferences", 0);
    if (this.yFl)
    {
      this.sjy = this.yDI.lc(8);
      this.yFn = this.yDI.field_bitFlag;
      if (!this.sjy)
        break label164;
      if (this.ehU != null)
        this.ehZ.edit().putBoolean("room_save_to_contact", true).commit();
    }
    while (true)
    {
      this.ehK.notifyDataSetChanged();
      AppMethodBeat.o(30226);
      return;
      this.sjy = this.pmx.lc(8);
      this.yFn = this.pmx.field_bitFlag;
      break;
      label164: if (this.ehU != null)
        this.ehZ.edit().putBoolean("room_save_to_contact", false).commit();
    }
  }

  private void dAZ()
  {
    AppMethodBeat.i(30235);
    ab.i("MicroMsg.BizChatroomInfoUI", "dealModChatNameFail reset bizChatName");
    this.yDI.field_chatName = this.yFk;
    this.yDI.field_bitFlag = this.yFn;
    this.eif = this.yDI.lc(1);
    this.sjy = this.yDI.lc(8);
    this.yFm = this.yDI.lc(16);
    z.aeT().b(this.yDI);
    if (this.yFm)
      z.aeU().fz(this.yDI.field_bizChatLocalId);
    while (true)
    {
      this.ehZ.edit().putBoolean("room_placed_to_the_top", z.aeU().fy(this.yDI.field_bizChatLocalId)).commit();
      JN();
      JL();
      caY();
      dAY();
      Toast.makeText(this, getString(2131302515), 0).show();
      AppMethodBeat.o(30235);
      return;
      if (!this.yFm)
        z.aeU().fA(this.yDI.field_bizChatLocalId);
    }
  }

  private void onDataChanged()
  {
    AppMethodBeat.i(30234);
    if (this.ehS != null)
    {
      JN();
      updateTitle();
      JL();
      JJ();
      dAY();
      caY();
      this.ehS.notifyChanged();
    }
    this.ehK.notifyDataSetChanged();
    AppMethodBeat.o(30234);
  }

  private void updateTitle()
  {
    AppMethodBeat.i(30230);
    if (this.yFl)
    {
      this.eie = e.fB(this.jMj);
      if (this.eie != 0)
      {
        setMMTitle(getString(2131299931, new Object[] { getString(2131302657), Integer.valueOf(this.eie) }));
        AppMethodBeat.o(30230);
      }
    }
    while (true)
    {
      return;
      setMMTitle(getString(2131302657));
      AppMethodBeat.o(30230);
    }
  }

  public final int JC()
  {
    return 2131165198;
  }

  public final com.tencent.mm.aj.a.j Oa(int paramInt)
  {
    AppMethodBeat.i(30224);
    com.tencent.mm.aj.a.j localj;
    if ((this.ehS.getItem(paramInt) instanceof com.tencent.mm.aj.a.j))
    {
      localj = (com.tencent.mm.aj.a.j)this.ehS.getItem(paramInt);
      AppMethodBeat.o(30224);
    }
    while (true)
    {
      return localj;
      localj = null;
      AppMethodBeat.o(30224);
    }
  }

  public final com.tencent.mm.ui.base.preference.h a(SharedPreferences paramSharedPreferences)
  {
    AppMethodBeat.i(30236);
    paramSharedPreferences = new com.tencent.mm.ui.base.preference.a(this, this.nDp, paramSharedPreferences);
    AppMethodBeat.o(30236);
    return paramSharedPreferences;
  }

  public final void a(int paramInt, m paramm)
  {
    AppMethodBeat.i(30232);
    if (this.ehJ != null)
    {
      this.ehJ.dismiss();
      this.ehJ = null;
    }
    Object localObject;
    if (paramm.getType() == 1355)
    {
      localObject = ((com.tencent.mm.aj.a.n)paramm).afm();
      paramm = ((com.tencent.mm.aj.a.n)paramm).afn();
      localObject = z.aeT().rq(((uo)localObject).wcb.wku.vMV);
      if (localObject == null)
      {
        Toast.makeText(ah.getContext(), getString(2131302514), 0).show();
        AppMethodBeat.o(30232);
      }
    }
    while (true)
    {
      return;
      Intent localIntent;
      if (this.fromScene == 2)
      {
        localIntent = new Intent();
        localIntent.addFlags(67108864);
        localIntent.putExtra("biz_chat_need_to_jump_to_chatting_ui", true);
        localIntent.putExtra("Contact_User", paramm.vNb);
        localIntent.putExtra("biz_chat_chat_id", ((c)localObject).field_bizChatLocalId);
        com.tencent.mm.bp.d.f(this, ".ui.bizchat.BizChatConversationUI", localIntent);
        AppMethodBeat.o(30232);
      }
      else
      {
        localIntent = new Intent();
        localIntent.addFlags(67108864);
        localIntent.putExtra("Chat_User", paramm.vNb);
        localIntent.putExtra("key_biz_chat_id", ((c)localObject).field_bizChatLocalId);
        localIntent.putExtra("finish_direct", true);
        localIntent.putExtra("key_need_send_video", false);
        localIntent.putExtra("key_is_biz_chat", true);
        localIntent.setClass(this, ChattingUI.class);
        startActivity(localIntent);
        AppMethodBeat.o(30232);
        continue;
        if (paramm.getType() == 1356)
        {
          if (paramInt != 0)
          {
            dAZ();
            AppMethodBeat.o(30232);
          }
        }
        else
        {
          if ((paramm.getType() == 1353) && (paramInt >= 0) && (this.pmx != null))
          {
            this.pmx = z.aeV().cH(this.pmx.field_userId);
            onDataChanged();
          }
          AppMethodBeat.o(30232);
        }
      }
    }
  }

  public final boolean a(com.tencent.mm.ui.base.preference.f paramf, Preference paramPreference)
  {
    boolean bool1 = true;
    boolean bool2 = true;
    AppMethodBeat.i(30222);
    paramf = paramPreference.mKey;
    if (paramf.equals("room_name"))
    {
      paramf = "";
      if (JO())
        paramf = this.yDI.field_chatName;
      com.tencent.mm.ui.base.h.a(this.mController.ylL, getString(2131302583), paramf, "", 32, new BizChatroomInfoUI.9(this, paramf));
    }
    label197: 
    do
      while (true)
      {
        AppMethodBeat.o(30222);
        return false;
        if (paramf.equals("room_notify_new_msg"))
        {
          if (!this.eif);
          for (bool2 = true; ; bool2 = false)
          {
            this.eif = bool2;
            H(this.eif, 1);
            JL();
            break;
          }
        }
        if (paramf.equals("room_placed_to_the_top"))
        {
          if (!this.yFm);
          while (true)
          {
            this.yFm = bool2;
            H(this.yFm, 16);
            if (!this.yFm)
              break label197;
            z.aeU().fz(this.yDI.field_bizChatLocalId);
            break;
            bool2 = false;
          }
          z.aeU().fA(this.yDI.field_bizChatLocalId);
        }
        else
        {
          if (!paramf.equals("room_del_quit"))
            break;
          ab.d("MicroMsg.BizChatroomInfoUI", " quit " + this.jMj);
          com.tencent.mm.ui.base.h.a(this.mController.ylL, getString(2131298858), "", new BizChatroomInfoUI.10(this), null);
        }
      }
    while (!paramf.equals("room_save_to_contact"));
    if (!this.sjy);
    for (bool2 = bool1; ; bool2 = false)
    {
      this.sjy = bool2;
      H(this.sjy, 8);
      dAY();
      break;
    }
  }

  public final void initView()
  {
    AppMethodBeat.i(30219);
    this.ehK = this.yCw;
    String str = this.yDI.field_ownerUserId;
    this.eie = this.yDI.afg().size();
    if (bo.isNullOrNil(str));
    for (this.eic = false; ; this.eic = str.equals(z.aeV().cI(this.jMp)))
    {
      Kb();
      if (this.ehS != null)
      {
        this.nDp.setOnScrollListener(this.ein);
        this.ehS.a(this.ein);
        this.ehS.a(new BizChatroomInfoUI.7(this));
      }
      setBackBtn(new BizChatroomInfoUI.8(this));
      AppMethodBeat.o(30219);
      return;
    }
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(30216);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if (paramInt2 != -1)
      AppMethodBeat.o(30216);
    while (true)
    {
      return;
      switch (paramInt1)
      {
      default:
        AppMethodBeat.o(30216);
      case 1:
      }
    }
    paramIntent = paramIntent.getBundleExtra("result_data");
    String str;
    boolean bool;
    if (paramIntent != null)
    {
      ab.i("MicroMsg.BizChatroomInfoUI", "bundle != null");
      str = paramIntent.getString("enterprise_members");
      ab.i("MicroMsg.BizChatroomInfoUI", "enterprise_members:%s", new Object[] { str });
      if (this.yFl)
        bool = aqX(str);
    }
    while (true)
    {
      if (!bool)
      {
        Toast.makeText(this, getString(2131302514), 0).show();
        AppMethodBeat.o(30216);
        break;
        acr localacr = new acr();
        c localc = new c();
        if (this.yFo != null);
        for (paramIntent = this.yFo.field_addMemberUrl; ; paramIntent = null)
        {
          localc.field_addMemberUrl = paramIntent;
          localc.field_brandUserName = this.jMp;
          if (!e.a(localc, str, this.pmx.field_userId, localacr))
            break label269;
          z.aeZ();
          paramIntent = com.tencent.mm.aj.a.h.a(this.jMp, localacr, this);
          getString(2131297061);
          this.ehJ = com.tencent.mm.ui.base.h.b(this, getString(2131296430), true, new BizChatroomInfoUI.5(this, paramIntent));
          bool = true;
          break;
        }
        label269: bool = false;
        continue;
      }
      AppMethodBeat.o(30216);
      break;
      bool = false;
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(30212);
    super.onCreate(paramBundle);
    z.aeT().a(this.yEn, Looper.getMainLooper());
    this.fromScene = getIntent().getIntExtra("key_biz_chat_info_from_scene", -1);
    this.jMp = getIntent().getStringExtra("Chat_User");
    this.jMj = getIntent().getLongExtra("key_biz_chat_id", -1L);
    this.yDI = z.aeT().aK(this.jMj);
    this.yFk = this.yDI.field_chatName;
    this.yFl = e.rs(this.yDI.field_bizChatServId);
    if (!this.yFl)
      this.pmx = z.aeV().cH(this.yDI.field_bizChatServId);
    this.yFo = z.aeV().rD(this.jMp);
    initView();
    if ((this.yDI == null) || (this.yDI.field_bizChatServId == null) || (this.jMp == null))
      AppMethodBeat.o(30212);
    while (true)
    {
      return;
      if (this.yDI.isGroup())
      {
        z.aeZ();
        com.tencent.mm.aj.a.h.aH(this.yDI.field_bizChatServId, this.jMp);
        AppMethodBeat.o(30212);
      }
      else
      {
        z.aeZ();
        com.tencent.mm.aj.a.h.a(this.yDI.field_bizChatServId, this.jMp, this);
        AppMethodBeat.o(30212);
      }
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(30215);
    com.tencent.mm.ui.g.a.dismiss();
    com.tencent.mm.ui.g.a.dismiss();
    z.aeT().a(this.yEn);
    super.onDestroy();
    AppMethodBeat.o(30215);
  }

  public void onPause()
  {
    AppMethodBeat.i(30214);
    super.onPause();
    AppMethodBeat.o(30214);
  }

  public void onResume()
  {
    AppMethodBeat.i(30213);
    JN();
    updateTitle();
    JL();
    caY();
    dAY();
    JJ();
    this.ehK.notifyDataSetChanged();
    super.onResume();
    if (!this.eio)
    {
      String str = getIntent().getStringExtra("need_matte_high_light_item");
      if (!bo.isNullOrNil(str))
      {
        int i = this.ehK.aqQ(str);
        setSelection(i - 3);
        new ak().postDelayed(new BizChatroomInfoUI.4(this, i), 10L);
      }
      this.eio = true;
    }
    AppMethodBeat.o(30213);
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(30233);
    if (paramm == null)
    {
      ab.e("MicroMsg.BizChatroomInfoUI", "onSceneEnd: [%d], [%d], [%s], scene is null", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
      AppMethodBeat.o(30233);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.BizChatroomInfoUI", "onSceneEnd: [%d], [%d], [%s], sceneType[%d]", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString, Integer.valueOf(paramm.getType()) });
      this.eie = e.fB(this.jMj);
      ab.d("MicroMsg.BizChatroomInfoUI", "now is " + this.eie);
      if (this.ehJ != null)
        this.ehJ.dismiss();
      paramString = com.tencent.mm.h.a.jY(paramString);
      if (paramString != null)
      {
        paramString.a(this, null, null);
        AppMethodBeat.o(30233);
      }
      else if ((paramInt1 != 0) || (paramInt2 != 0))
      {
        ab.w("MicroMsg.BizChatroomInfoUI", "willen onSceneEnd err:Network not ok");
        dAZ();
        AppMethodBeat.o(30233);
      }
      else
      {
        paramm.getType();
        AppMethodBeat.o(30233);
      }
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.bizchat.BizChatroomInfoUI
 * JD-Core Version:    0.6.2
 */