package com.tencent.mm.plugin.profile;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.at;
import com.tencent.mm.g.a.sz;
import com.tencent.mm.g.a.sz.b;
import com.tencent.mm.g.a.uh;
import com.tencent.mm.g.a.uh.a;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.model.ag;
import com.tencent.mm.model.ao.a;
import com.tencent.mm.model.ao.b;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.r;
import com.tencent.mm.openim.a.b.a;
import com.tencent.mm.openim.a.c.a;
import com.tencent.mm.openim.a.c.b;
import com.tencent.mm.plugin.messenger.foundation.a.a.m;
import com.tencent.mm.plugin.profile.ui.MultiButtonPreference;
import com.tencent.mm.plugin.profile.ui.NormalProfileHeaderPreference;
import com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI;
import com.tencent.mm.plugin.sns.b.h.a;
import com.tencent.mm.plugin.story.api.AbsStoryPreference;
import com.tencent.mm.pluginsdk.ui.e.j;
import com.tencent.mm.pluginsdk.ui.preference.ButtonPreference;
import com.tencent.mm.pluginsdk.ui.preference.LabelPreference;
import com.tencent.mm.pluginsdk.ui.preference.PhoneNumPreference;
import com.tencent.mm.pluginsdk.ui.preference.ProfileDescribePreference;
import com.tencent.mm.protocal.protobuf.ccl;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.bv;
import com.tencent.mm.storage.u;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.preference.KeyValuePreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.PreferenceSmallCategory;
import com.tencent.mm.ui.base.preference.PreferenceTitleCategory;
import com.tencent.mm.ui.base.preference.TextPreference;
import com.tencent.mm.ui.e.b;
import com.tencent.mm.ui.q;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class a
  implements h.a, com.tencent.mm.plugin.story.api.d, com.tencent.mm.pluginsdk.b.a
{
  u eih;
  String ejD;
  private int gOW;
  com.tencent.mm.ui.base.preference.f iFE;
  MMActivity jiE;
  ad ldh;
  com.tencent.mm.plugin.profile.a.b pkh;
  private com.tencent.mm.ui.widget.a.d pki;
  String pkj;
  com.tencent.mm.sdk.b.c<at> pkk;
  private boolean readOnly;

  public a(MMActivity paramMMActivity)
  {
    AppMethodBeat.i(23220);
    this.readOnly = false;
    this.pkj = null;
    this.pkk = new a.6(this);
    this.jiE = paramMMActivity;
    AppMethodBeat.o(23220);
  }

  static void a(com.tencent.mm.ui.base.preference.f paramf, Activity paramActivity, String paramString1, String paramString2)
  {
    AppMethodBeat.i(23237);
    ab.i("MicroMsg.NewContactWidgetNormal", "[showInviterView] inviter:%s inviterDisplayName:%s", new Object[] { paramString1, paramString2 });
    KeyValuePreference localKeyValuePreference = (KeyValuePreference)paramf.aqO("contact_info_invite_source");
    paramf.ce("contact_info_invite_source", false);
    paramf = new SpannableString(j.b(paramActivity, paramActivity.getResources().getString(2131298550, new Object[] { paramString2 })));
    paramf.setSpan(new ForegroundColorSpan(paramActivity.getResources().getColor(2131689776)), 0, paramString2.length(), 33);
    localKeyValuePreference.NT(2);
    localKeyValuePreference.yCj = false;
    localKeyValuePreference.setSummary(paramf);
    localKeyValuePreference.getExtras().putString("inviter", paramString1);
    paramActivity.getIntent().putExtra("inviteer", paramString1);
    AppMethodBeat.o(23237);
  }

  private void a(com.tencent.mm.ui.base.preference.f paramf, ad paramad, boolean paramBoolean)
  {
    AppMethodBeat.i(23222);
    boolean bool1;
    if (cak())
    {
      paramf.ce("contact_profile_setting_desc", true);
      paramf.ce("contact_profile_phone", true);
      paramf.ce("contact_profile_info_more", true);
      paramf.ce("contact_profile_sns", ad.aox(paramad.field_username));
      if ((r.YE() & 0x10000000) != 0L)
      {
        bool1 = true;
        boolean bool2 = com.tencent.mm.pluginsdk.model.app.p.u(this.jiE, "com.tencent.wework");
        aw.ZK();
        Object localObject = (Integer)com.tencent.mm.model.c.Ry().get(ac.a.xJD, Integer.valueOf(0));
        ab.i("MicroMsg.NewContactWidgetNormal", "ExtStatus:%s openAddByWework:%s isInstallWework:%s", new Object[] { Long.valueOf(r.YE()), Boolean.valueOf(bool1), Boolean.valueOf(bool2) });
        if ((!bo.gW(((Integer)localObject).intValue(), 1)) && ((!bool1) || (!com.tencent.mm.pluginsdk.model.app.p.u(this.jiE, "com.tencent.wework")) || (ad.aox(this.ldh.field_username))))
          break label321;
        paramf.ce("contact_profile_accept_contact_by_wework", false);
        localObject = com.tencent.mm.plugin.profile.ui.p.a(this.jiE, paramad, this.gOW);
        if ((localObject == null) || (localObject.length <= 0))
          break label369;
      }
    }
    label321: label369: for (paramad = com.tencent.mm.plugin.profile.ui.p.b(this.jiE, paramad, this.gOW); ; paramad = "")
    {
      if (com.tencent.mm.plugin.profile.b.e.UM(this.ldh.field_username))
        ((ButtonPreference)paramf.aqO("contact_profile_accept_contact_by_wework")).ed(this.jiE.getString(2131298547), this.jiE.getResources().getColor(2131689776));
      if ((!bo.isNullOrNil(paramad)) && (com.tencent.mm.plugin.profile.b.e.UL(paramad) == 2) && (paramBoolean))
        paramf.ce("contact_profile_accept_contact", true);
      AppMethodBeat.o(23222);
      while (true)
      {
        return;
        bool1 = false;
        break;
        paramf.ce("contact_profile_accept_contact_by_wework", true);
        AppMethodBeat.o(23222);
        continue;
        paramf.ce("contact_profile_accept_contact", true);
        paramf.ce("contact_profile_accept_contact_by_wework", true);
        AppMethodBeat.o(23222);
      }
    }
  }

  private void a(String paramString, ad paramad)
  {
    AppMethodBeat.i(23233);
    if (bo.isNullOrNil(paramString))
    {
      ab.w("MicroMsg.NewContactWidgetNormal", "view stranger remark, username is null");
      AppMethodBeat.o(23233);
    }
    while (true)
    {
      return;
      paramString = new Intent();
      paramString.putExtra("Contact_Scene", this.gOW);
      paramString.putExtra("Contact_mode_name_type", 0);
      paramString.putExtra("Contact_ModStrangerRemark", true);
      paramString.putExtra("Contact_User", paramad.field_username);
      paramString.putExtra("Contact_Nick", paramad.field_nickname);
      paramString.putExtra("Contact_RemarkName", paramad.field_conRemark);
      b.gkE.n(paramString, this.jiE);
      AppMethodBeat.o(23233);
    }
  }

  static String b(u paramu, String paramString)
  {
    Object localObject1 = null;
    Object localObject2 = null;
    AppMethodBeat.i(23238);
    if (paramu == null)
    {
      AppMethodBeat.o(23238);
      paramu = (u)localObject2;
    }
    while (true)
    {
      return paramu;
      aw.ZK();
      ad localad = com.tencent.mm.model.c.XM().aoO(paramString);
      localObject2 = localObject1;
      if (localad != null)
      {
        localObject2 = localObject1;
        if ((int)localad.ewQ > 0)
          localObject2 = localad.field_conRemark;
      }
      localObject1 = localObject2;
      if (bo.isNullOrNil((String)localObject2))
        localObject1 = paramu.mJ(paramString);
      paramu = (u)localObject1;
      if (bo.isNullOrNil((String)localObject1))
      {
        paramu = (u)localObject1;
        if (localad != null)
          paramu = localad.Oi();
      }
      AppMethodBeat.o(23238);
    }
  }

  private boolean cah()
  {
    AppMethodBeat.i(23226);
    String[] arrayOfString = com.tencent.mm.model.t.fkY;
    int i = arrayOfString.length;
    int j = 0;
    boolean bool;
    if (j < i)
      if (arrayOfString[j].equalsIgnoreCase(this.ldh.field_username))
      {
        bool = true;
        AppMethodBeat.o(23226);
      }
    while (true)
    {
      return bool;
      j++;
      break;
      bool = cai();
      AppMethodBeat.o(23226);
    }
  }

  private boolean cai()
  {
    AppMethodBeat.i(23227);
    boolean bool = com.tencent.mm.model.t.nB(this.ldh.field_username);
    AppMethodBeat.o(23227);
    return bool;
  }

  private boolean caj()
  {
    AppMethodBeat.i(23228);
    boolean bool = ad.mR(this.ldh.field_username);
    AppMethodBeat.o(23228);
    return bool;
  }

  private boolean cak()
  {
    boolean bool = false;
    AppMethodBeat.i(23229);
    if ((!com.tencent.mm.n.a.jh(this.ldh.field_type)) && (this.jiE.getIntent().getBooleanExtra("User_Verify", false)))
    {
      bool = true;
      AppMethodBeat.o(23229);
    }
    while (true)
    {
      return bool;
      AppMethodBeat.o(23229);
    }
  }

  private boolean cal()
  {
    AppMethodBeat.i(23230);
    boolean bool;
    if (this.jiE.getIntent().getIntExtra("Contact_Scene", -1) == 14)
    {
      bool = true;
      AppMethodBeat.o(23230);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(23230);
    }
  }

  private boolean cam()
  {
    boolean bool = false;
    AppMethodBeat.i(23231);
    if (this.jiE.getIntent().getIntExtra("Contact_Scene", 0) == 18)
    {
      bool = true;
      AppMethodBeat.o(23231);
    }
    while (true)
    {
      return bool;
      AppMethodBeat.o(23231);
    }
  }

  private boolean can()
  {
    boolean bool = false;
    AppMethodBeat.i(23232);
    int i = this.jiE.getIntent().getIntExtra("Contact_Scene", 0);
    if ((26 <= i) && (i <= 29))
    {
      bool = true;
      AppMethodBeat.o(23232);
    }
    while (true)
    {
      return bool;
      AppMethodBeat.o(23232);
    }
  }

  private boolean cao()
  {
    boolean bool = true;
    if (this.ldh.field_deleteFlag == 1);
    while (true)
    {
      return bool;
      bool = false;
    }
  }

  public final boolean IO(String paramString)
  {
    AppMethodBeat.i(23224);
    if (paramString.equals("contact_profile_sns"))
    {
      aw.ZK();
      if (!com.tencent.mm.model.c.isSDCardAvailable())
        com.tencent.mm.ui.base.t.hO(this.jiE);
    }
    Object localObject1;
    Object localObject2;
    int i;
    while (true)
    {
      AppMethodBeat.o(23224);
      return true;
      localObject1 = this.jiE.getIntent();
      ((Intent)localObject1).putExtra("sns_source", this.jiE.getIntent().getIntExtra("Sns_from_Scene", 0));
      ((Intent)localObject1).putExtra("sns_signature", this.ldh.signature);
      ((Intent)localObject1).putExtra("sns_nickName", this.ldh.Oi());
      ((Intent)localObject1).putExtra("sns_title", this.ldh.Oj());
      paramString = (String)localObject1;
      if (com.tencent.mm.plugin.sns.b.n.qFC != null)
        paramString = com.tencent.mm.plugin.sns.b.n.qFC.e((Intent)localObject1, this.ldh.field_username);
      if (paramString == null)
      {
        this.jiE.finish();
      }
      else
      {
        com.tencent.mm.bp.d.b(this.jiE, "sns", ".ui.SnsUserUI", paramString);
        if ((paramString.getFlags() & 0x4000000) != 0)
        {
          this.jiE.finish();
          continue;
          if ((paramString.equals("contact_profile_label")) || (paramString.equals("contact_profile_desc")) || (paramString.equals("contact_profile_phone")) || (paramString.equals("contact_profile_setting_desc")))
          {
            paramString = this.ldh;
            if (paramString == null)
            {
              ab.e("MicroMsg.NewContactWidgetNormal", "contact is null");
            }
            else if (!com.tencent.mm.n.a.jh(paramString.field_type))
            {
              if (!bo.isNullOrNil(paramString.field_encryptUsername))
                a(paramString.field_encryptUsername, paramString);
              else
                a(paramString.field_username, paramString);
            }
            else
            {
              localObject1 = (PhoneNumPreference)this.iFE.aqO("contact_profile_phone");
              localObject2 = new Intent();
              ((Intent)localObject2).putExtra("Contact_Scene", this.gOW);
              ((Intent)localObject2).putExtra("Contact_User", paramString.field_username);
              ((Intent)localObject2).putExtra("Contact_RoomNickname", this.jiE.getIntent().getStringExtra("Contact_RoomNickname"));
              ((Intent)localObject2).putExtra("view_mode", true);
              ((Intent)localObject2).putExtra("contact_phone_number_by_md5", ((PhoneNumPreference)localObject1).vim);
              ((Intent)localObject2).putExtra("contact_phone_number_list", paramString.dur);
              b.gkE.m((Intent)localObject2, this.jiE);
            }
          }
          else if (paramString.equals("contact_profile_power"))
          {
            if (this.pkh != null)
              this.pkh.cas();
          }
          else if (paramString.equals("contact_profile_send"))
          {
            localObject1 = this.ldh;
            if (bo.a(Boolean.valueOf(com.tencent.mm.model.t.mW(((ap)localObject1).field_username)), false))
            {
              paramString = ((ap)localObject1).field_username;
              localObject1 = new Intent();
              ((Intent)localObject1).addFlags(67108864);
              if (this.readOnly)
              {
                ((Intent)localObject1).putExtra("Chat_User", paramString);
                ((Intent)localObject1).putExtra("Chat_Mode", 1);
                this.jiE.setResult(-1, (Intent)localObject1);
              }
              else
              {
                ((Intent)localObject1).putExtra("Chat_User", paramString);
                ((Intent)localObject1).putExtra("Chat_Mode", 1);
                ((Intent)localObject1).setClassName(this.jiE, "com.tencent.mm.ui.chatting.ChattingUI");
                this.jiE.startActivity((Intent)localObject1);
              }
            }
            else
            {
              paramString = new Intent();
              paramString.addFlags(67108864);
              if (this.readOnly)
              {
                paramString.putExtra("Chat_User", ((ap)localObject1).field_username);
                paramString.putExtra("Chat_Mode", 1);
                this.jiE.setResult(-1, paramString);
              }
              else
              {
                paramString.putExtra("Chat_User", ((ap)localObject1).field_username);
                paramString.putExtra("Chat_Mode", 1);
                paramString.setClassName(this.jiE, "com.tencent.mm.ui.chatting.ChattingUI");
                this.jiE.startActivity(paramString);
              }
            }
          }
          else
          {
            if (!paramString.equals("contact_profile_voip"))
              break;
            paramString = this.ldh;
            localObject1 = new uh();
            com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject1);
            if ((!paramString.field_username.equals(((uh)localObject1).cQt.talker)) && ((((uh)localObject1).cQt.cQv) || (((uh)localObject1).cQt.cQw)))
            {
              if (((uh)localObject1).cQt.cQu);
              for (i = 2131297782; ; i = 2131297783)
              {
                Toast.makeText(this.jiE, i, 0).show();
                ab.i("MicroMsg.NewContactWidgetNormal", "voip is running, can't do this");
                break;
              }
            }
            if (!com.tencent.mm.r.a.bH(this.jiE))
            {
              localObject1 = new sz();
              ((sz)localObject1).cPf.cPh = true;
              com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject1);
              localObject1 = ((sz)localObject1).cPg.cPj;
              if (!bo.isNullOrNil((String)localObject1))
              {
                ab.v("MicroMsg.NewContactWidgetNormal", "Talkroom is on: ".concat(String.valueOf(localObject1)));
                com.tencent.mm.ui.base.h.d(this.jiE, this.jiE.getString(2131303996), "", this.jiE.getString(2131296994), this.jiE.getString(2131296868), new a.2(this, paramString), new a.3(this));
              }
              else
              {
                a(paramString, this.jiE);
              }
            }
          }
        }
      }
    }
    Object localObject3;
    Object localObject4;
    if (paramString.equals("contact_profile_add_contact"))
    {
      localObject3 = this.jiE;
      localObject1 = this.ldh;
      i = this.gOW;
      paramString = (String)localObject1;
      if ((int)((com.tencent.mm.n.a)localObject1).ewQ == 0)
      {
        aw.ZK();
        paramString = (String)localObject1;
        if (com.tencent.mm.model.c.XM().aa((ad)localObject1) != -1)
        {
          aw.ZK();
          paramString = com.tencent.mm.model.c.XM().aoO(((ap)localObject1).field_username);
        }
      }
      localObject1 = this.jiE.getIntent().getStringExtra("Contact_Mobile_MD5");
      localObject2 = this.jiE.getIntent().getStringExtra("Contact_full_Mobile_MD5");
      localObject1 = bo.nullAsNil((String)localObject1);
      localObject4 = bo.nullAsNil((String)localObject2);
      if ((!((String)localObject1).equals("")) || (!((String)localObject4).equals("")))
      {
        localObject2 = com.tencent.mm.plugin.account.a.getAddrUploadStg().vW((String)localObject1);
        if (localObject2 != null)
          break label2062;
        localObject2 = com.tencent.mm.plugin.account.a.getAddrUploadStg().vW((String)localObject4);
        localObject1 = localObject4;
      }
    }
    label2062: 
    while (true)
    {
      if (localObject2 != null)
        com.tencent.mm.plugin.account.a.getAddrUploadStg().a((String)localObject1, (com.tencent.mm.plugin.account.friend.a.a)localObject2);
      localObject2 = new com.tencent.mm.pluginsdk.ui.applet.a(this.jiE, new a.12(this, paramString, i));
      localObject4 = new LinkedList();
      ((LinkedList)localObject4).add(Integer.valueOf(i));
      localObject1 = ((MMActivity)localObject3).getIntent().getStringExtra("source_from_user_name");
      String str = ((MMActivity)localObject3).getIntent().getStringExtra("source_from_nick_name");
      ((com.tencent.mm.pluginsdk.ui.applet.a)localObject2).hH((String)localObject1, str);
      ((com.tencent.mm.pluginsdk.ui.applet.a)localObject2).vjI = new a.13(this, (MMActivity)localObject3, paramString, i, (String)localObject1, str);
      str = ((MMActivity)localObject3).getIntent().getStringExtra("room_name");
      localObject1 = ((MMActivity)localObject3).getIntent().getStringExtra(e.b.yfT);
      if (!TextUtils.isEmpty((CharSequence)localObject1))
      {
        ((com.tencent.mm.pluginsdk.ui.applet.a)localObject2).ajw((String)localObject1);
        ((com.tencent.mm.pluginsdk.ui.applet.a)localObject2).c(paramString.field_username, "", (LinkedList)localObject4);
        break;
      }
      if (TextUtils.isEmpty(str))
      {
        ((com.tencent.mm.pluginsdk.ui.applet.a)localObject2).ajw(paramString.dus);
        ((com.tencent.mm.pluginsdk.ui.applet.a)localObject2).e(paramString.field_username, (LinkedList)localObject4);
        break;
      }
      if (!TextUtils.isEmpty(((com.tencent.mm.pluginsdk.ui.applet.a)localObject2).mGZ))
      {
        ((com.tencent.mm.pluginsdk.ui.applet.a)localObject2).c(paramString.field_username, str, (LinkedList)localObject4);
        break;
      }
      aw.ZK();
      localObject1 = com.tencent.mm.model.c.XM().aoO(paramString.field_username);
      if (localObject1 != null);
      for (localObject1 = bo.bc(((ap)localObject1).dus, ""); ; localObject1 = "")
      {
        ab.i("MicroMsg.NewContactWidgetNormal", "dkverify footer add:%s chat:%s ticket:%s", new Object[] { paramString.field_username, str, localObject1 });
        if (TextUtils.isEmpty((CharSequence)localObject1))
          break label1384;
        ((com.tencent.mm.pluginsdk.ui.applet.a)localObject2).ajw((String)localObject1);
        ((com.tencent.mm.pluginsdk.ui.applet.a)localObject2).c(paramString.field_username, str, (LinkedList)localObject4);
        break;
      }
      label1384: ao.a.flu.a(paramString.field_username, str, new a.14(this, paramString, (com.tencent.mm.pluginsdk.ui.applet.a)localObject2, str, (LinkedList)localObject4));
      break;
      if (paramString.equals("contact_profile_accept_contact"))
      {
        localObject2 = this.jiE;
        paramString = this.ldh;
        ((MMActivity)localObject2).getIntent().removeExtra("Accept_NewFriend_FromOutside");
        localObject1 = new Intent((Context)localObject2, SayHiWithSnsPermissionUI.class);
        ((Intent)localObject1).putExtra("Contact_User", paramString.field_username);
        ((Intent)localObject1).putExtra("Contact_Nick", paramString.field_nickname);
        ((Intent)localObject1).putExtra("Contact_RemarkName", paramString.field_conRemark);
        if ((this.gOW == 14) || (this.gOW == 8))
          ((Intent)localObject1).putExtra("Contact_RoomNickname", ((MMActivity)localObject2).getIntent().getStringExtra("Contact_RoomNickname"));
        ((Intent)localObject1).putExtra("Contact_Scene", this.gOW);
        ((Intent)localObject1).putExtra("Verify_ticket", bo.nullAsNil(((Activity)localObject2).getIntent().getStringExtra("Verify_ticket")));
        ((Intent)localObject1).putExtra("sayhi_with_sns_perm_send_verify", false);
        ((Intent)localObject1).putExtra("sayhi_with_sns_perm_add_remark", true);
        ((Intent)localObject1).putExtra("sayhi_with_sns_perm_set_label", true);
        ((Intent)localObject1).putExtra("sayhi_with_sns_permission", paramString.Od());
        ((Context)localObject2).startActivity((Intent)localObject1);
        break;
      }
      if (paramString.equals("contact_profile_say_hi"))
      {
        paramString = this.ldh;
        localObject1 = new Intent();
        ((Intent)localObject1).putExtra("Contact_User", paramString.field_username);
        ((Intent)localObject1).putExtra("Contact_Scene", this.gOW);
        ((Intent)localObject1).putExtra(e.b.yfT, paramString.dus);
        b.gkE.a((Intent)localObject1, this.jiE);
        break;
      }
      if (paramString.equals("contact_profile_info_more"))
      {
        if (this.pkh == null)
          break;
        com.tencent.mm.plugin.profile.a.b.a(this.jiE, this.ldh);
        break;
      }
      if (paramString.equals("contact_info_invite_source"))
      {
        paramString = ((KeyValuePreference)this.iFE.aqO("contact_info_invite_source")).getExtras().getString("inviter");
        if (bo.isNullOrNil(paramString))
          break;
        localObject2 = b(this.eih, paramString);
        localObject1 = new Intent();
        ((Intent)localObject1).putExtra("Contact_User", paramString);
        ((Intent)localObject1).putExtra("Contact_RemarkName", (String)localObject2);
        ((Intent)localObject1).putExtra("Contact_RoomNickname", (String)localObject2);
        ((Intent)localObject1).putExtra("Contact_RoomMember", true);
        ((Intent)localObject1).putExtra("room_name", this.ejD);
        aw.ZK();
        ((Intent)localObject1).putExtra("Contact_Nick", com.tencent.mm.model.c.XM().aoO(paramString).field_nickname);
        ((Intent)localObject1).putExtra("Contact_Scene", 14);
        ((Intent)localObject1).putExtra("Is_RoomOwner", true);
        ((Intent)localObject1).putExtra("Contact_ChatRoomId", this.ejD);
        b.gkE.c((Intent)localObject1, this.jiE);
        break;
      }
      if (paramString.equals("contact_profile_accept_contact_by_wework"))
      {
        localObject4 = this.ldh;
        localObject2 = bo.nullAsNil(this.jiE.getIntent().getStringExtra("Verify_ticket"));
        localObject3 = com.tencent.mm.plugin.profile.ui.p.a(this.jiE, (ad)localObject4, this.gOW);
        localObject1 = "";
        paramString = "";
        if (localObject3.length > 0)
        {
          localObject1 = localObject3[(localObject3.length - 1)].fjz;
          paramString = com.tencent.mm.plugin.profile.ui.p.b(this.jiE, (ad)localObject4, this.gOW);
        }
        new com.tencent.mm.plugin.profile.b.a(((ap)localObject4).field_username, (String)localObject2, paramString, (String)localObject1).a(com.tencent.mm.kernel.g.RO().eJo.ftA, new a.9(this));
        break;
      }
      if (!paramString.equals("contact_profile_story"))
        break;
      paramString = (AbsStoryPreference)this.iFE.aqO("contact_profile_story");
      if (paramString == null)
        break;
      paramString.cwQ();
      break;
    }
  }

  final void a(ad paramad, Context paramContext)
  {
    AppMethodBeat.i(23234);
    this.pki = new com.tencent.mm.ui.widget.a.d(this.jiE, 1, false);
    this.pki.rBl = new a.10(this);
    this.pki.rBm = new a.11(this, paramad, paramContext);
    this.pki.cpD();
    AppMethodBeat.o(23234);
  }

  public final void a(boolean paramBoolean1, String paramString1, boolean paramBoolean2, boolean paramBoolean3, int paramInt, long paramLong, String paramString2)
  {
  }

  public final void a(boolean paramBoolean1, boolean paramBoolean2, String paramString1, boolean paramBoolean3, boolean paramBoolean4, int paramInt, long paramLong, String paramString2)
  {
    AppMethodBeat.i(23235);
    paramString1 = (com.tencent.mm.ui.base.preference.g)this.iFE.aqO("contact_profile_sns");
    if ((paramString1 != null) && (com.tencent.mm.plugin.sns.b.n.qFy != null))
    {
      paramString1.ajO(this.ldh.field_username);
      if (com.tencent.mm.plugin.sns.b.n.qFC != null)
        com.tencent.mm.plugin.sns.b.n.qFC.a(this, 3);
      this.iFE.notifyDataSetChanged();
      if (paramBoolean3)
      {
        ab.d("MicroMsg.NewContactWidgetNormal", "bg Change!");
        if (com.tencent.mm.plugin.sns.b.n.qFC != null)
          com.tencent.mm.plugin.sns.b.n.qFC.WZ(this.ldh.field_username);
      }
    }
    AppMethodBeat.o(23235);
  }

  public final boolean a(com.tencent.mm.ui.base.preference.f paramf, ad paramad, boolean paramBoolean, int paramInt)
  {
    AppMethodBeat.i(23221);
    this.readOnly = this.readOnly;
    this.iFE = paramf;
    this.ldh = paramad;
    this.gOW = paramInt;
    this.ejD = this.jiE.getIntent().getStringExtra("room_name");
    aw.ZK();
    this.eih = com.tencent.mm.model.c.XV().oa(this.ejD);
    if (this.pkh == null)
    {
      this.pkh = new com.tencent.mm.plugin.profile.a.b(this.jiE, paramad);
      this.pkh.bKH();
    }
    ab.i("MicroMsg.NewContactWidgetNormal", "[onAttach] username:%s", new Object[] { paramad.field_username });
    paramf.removeAll();
    paramf.addPreferencesFromResource(2131165252);
    Object localObject1 = (NormalProfileHeaderPreference)paramf.aqO("contact_profile_header_normal");
    ((NormalProfileHeaderPreference)localObject1).iFE = paramf;
    ((NormalProfileHeaderPreference)localObject1).a(paramad, paramInt, paramBoolean, this.pkh);
    Object localObject2 = (ButtonPreference)paramf.aqO("contact_profile_send");
    if (localObject2 != null)
      ((ButtonPreference)localObject2).vql = 2131823106;
    Object localObject3 = this.jiE;
    Object localObject4 = this.ldh;
    if ((ad.aox(((ap)localObject4).field_username)) && (((ap)localObject4).duv != 0))
    {
      int i = paramf.indexOf("contact_info_category_1");
      Object localObject5 = ((com.tencent.mm.openim.a.b)com.tencent.mm.kernel.g.K(com.tencent.mm.openim.a.b.class)).c(((ap)localObject4).field_openImAppid, "openim_custom_info_header", b.a.geR);
      if (!TextUtils.isEmpty((CharSequence)localObject5))
      {
        localObject6 = new PreferenceTitleCategory((Context)localObject3);
        ((Preference)localObject6).setTitle((CharSequence)localObject5);
        paramf.a((Preference)localObject6, i);
        ((Preference)localObject6).yCX = new com.tencent.mm.plugin.profile.a.a.1();
      }
      localObject5 = new com.tencent.mm.openim.a.c();
      ((com.tencent.mm.openim.a.c)localObject5).vj(((ap)localObject4).duw);
      Iterator localIterator = ((com.tencent.mm.openim.a.c)localObject5).geU.iterator();
      if (localIterator.hasNext())
      {
        c.a locala = (c.a)localIterator.next();
        localObject5 = locala.geV.iterator();
        j = i;
        while (true)
        {
          i = j;
          if (!((Iterator)localObject5).hasNext())
            break;
          localObject6 = (c.b)((Iterator)localObject5).next();
          i = j + 1;
          com.tencent.mm.plugin.profile.a.a.2 local2 = new com.tencent.mm.plugin.profile.a.a.2((Context)localObject3, (c.b)localObject6);
          local2.ylA = locala.title;
          local2.setSummary(j.b((Context)localObject3, ((c.b)localObject6).vk(((ap)localObject4).field_openImAppid)));
          paramf.a(local2, i);
          if ((((c.b)localObject6).action == 0) || (((c.b)localObject6).action == 1))
          {
            local2.setEnabled(true);
            j = i;
          }
          else if (((c.b)localObject6).action == 2)
          {
            local2.yCX = new com.tencent.mm.plugin.profile.a.a.3((c.b)localObject6, (ad)localObject4, locala, (Context)localObject3);
            j = i;
          }
          else if (((c.b)localObject6).action == 3)
          {
            local2.yCX = new com.tencent.mm.plugin.profile.a.a.4((c.b)localObject6, (ad)localObject4, locala, (Context)localObject3);
            j = i;
          }
          else if (((c.b)localObject6).action == 4)
          {
            local2.yCX = new com.tencent.mm.plugin.profile.a.a.5((c.b)localObject6, (ad)localObject4, locala);
            j = i;
          }
          else
          {
            j = i;
            if (((c.b)localObject6).action == 5)
            {
              local2.yCX = new com.tencent.mm.plugin.profile.a.a.6((c.b)localObject6, (ad)localObject4, locala);
              j = i;
            }
          }
        }
      }
      j = i + 1;
      paramf.a(new PreferenceSmallCategory((Context)localObject3), j);
      localObject5 = new KeyValuePreference((Context)localObject3);
      ((KeyValuePreference)localObject5).setTitle(2131298509);
      Object localObject6 = ((com.tencent.mm.openim.a.b)com.tencent.mm.kernel.g.K(com.tencent.mm.openim.a.b.class)).c(((ap)localObject4).field_openImAppid, "openim_intro_desc", b.a.geR);
      ((KeyValuePreference)localObject5).setSummary(j.b((Context)localObject3, (CharSequence)localObject6));
      localObject3 = ((com.tencent.mm.openim.a.b)com.tencent.mm.kernel.g.K(com.tencent.mm.openim.a.b.class)).c(((ap)localObject4).field_openImAppid, "openim_intro_url", b.a.geS);
      if (!TextUtils.isEmpty((CharSequence)localObject3))
        ((Preference)localObject5).yCX = new com.tencent.mm.plugin.profile.a.a.7((String)localObject3, (ad)localObject4, (String)localObject6);
      paramf.a((Preference)localObject5, j + 1);
    }
    if (cai())
    {
      paramf.removeAll();
      paramf.b((Preference)localObject1);
      paramf.b(new PreferenceSmallCategory(this.jiE));
      paramad = new KeyValuePreference(this.jiE);
      paramad.setTitle(2131298552);
      paramad.setSummary(2131298756);
      paramad.NT(2147483647);
      paramad.yCj = false;
      paramad.NW(8);
      paramf.b(paramad);
      paramf.b(new PreferenceSmallCategory(this.jiE));
      paramf.b((Preference)localObject2);
      this.pkh.knn.mController.removeAllOptionMenu();
      AppMethodBeat.o(23221);
      return true;
    }
    localObject1 = this.ldh;
    int j = this.jiE.getIntent().getIntExtra("Contact_KSnsIFlag", -1);
    long l = this.jiE.getIntent().getLongExtra("Contact_KSnsBgId", -1L);
    localObject2 = bo.bc(this.jiE.getIntent().getStringExtra("Contact_KSnsBgUrl"), "");
    localObject4 = new ccl();
    ((ccl)localObject4).guY = j;
    ((ccl)localObject4).gva = l;
    ((ccl)localObject4).guZ = ((String)localObject2);
    localObject2 = localObject4;
    if (com.tencent.mm.plugin.sns.b.n.qFy != null)
      localObject2 = com.tencent.mm.plugin.sns.b.n.qFy.b(((ap)localObject1).field_username, (ccl)localObject4);
    aw.ZK();
    boolean bool1 = com.tencent.mm.model.c.XM().aoJ(((ap)localObject1).field_username);
    boolean bool2 = r.Yz().equals(((ap)localObject1).field_username);
    if ((((ccl)localObject2).guY & 0x1) > 0)
    {
      paramBoolean = true;
      label1080: ab.i("MicroMsg.NewContactWidgetNormal", "isFriend:%s isSelf:%s openAlbum:%s", new Object[] { Boolean.valueOf(bool1), Boolean.valueOf(bool2), Boolean.valueOf(paramBoolean) });
      if (((ad.aov(((ap)localObject1).field_username)) || (!paramBoolean)) && (!cak()) && (!bool2))
        break label3111;
      this.iFE.ce("contact_profile_sns", false);
      localObject2 = (com.tencent.mm.ui.base.preference.g)this.iFE.aqO("contact_profile_sns");
      if (com.tencent.mm.plugin.sns.b.n.qFC != null)
      {
        com.tencent.mm.plugin.sns.b.n.qFC.a(3, ((ap)localObject1).field_username, this);
        j = this.jiE.getIntent().getIntExtra("Sns_from_Scene", 0);
        com.tencent.mm.plugin.sns.b.n.qFC.a(2, ((ap)localObject1).field_username, bool2, j);
      }
      ((com.tencent.mm.ui.base.preference.g)localObject2).ajO(((ap)localObject1).field_username);
      label1237: if (ad.aox(((ap)localObject1).field_username))
        this.iFE.ce("contact_profile_sns", true);
      localObject4 = paramf.aqO("contact_profile_setting_desc");
      if (!ad.aox(this.ldh.field_username))
        break label3126;
      localObject2 = this.jiE.getText(2131298767).toString();
      label1300: ((Preference)localObject4).setTitle((CharSequence)localObject2);
      localObject4 = (KeyValuePreference)paramf.aqO("contact_profile_source");
      paramInt = this.jiE.getIntent().getIntExtra("Contact_Source_FMessage", paramInt);
      localObject2 = NormalProfileHeaderPreference.a(this.jiE, this.ldh, paramInt, this.ldh.field_username, cak());
      ((KeyValuePreference)localObject4).setSummary((CharSequence)localObject2);
      ((KeyValuePreference)localObject4).NT(2);
      ((KeyValuePreference)localObject4).yCj = false;
      ((KeyValuePreference)localObject4).nnX = (com.tencent.mm.bz.a.ao(this.jiE, (int)this.jiE.getResources().getDimension(2131427813)) * com.tencent.mm.bz.a.dm(this.jiE));
      ((KeyValuePreference)localObject4).NW(8);
      if ((!com.tencent.mm.n.a.jh(paramad.field_type)) && (!bo.ac((CharSequence)localObject2)) && ((!cal()) || (cak())))
        break label3146;
      paramBoolean = true;
      label1459: paramf.ce("contact_profile_source", paramBoolean);
      localObject4 = (LabelPreference)paramf.aqO("contact_profile_label");
      ((LabelPreference)localObject4).ldh = paramad;
      if (!com.tencent.mm.n.a.jh(((LabelPreference)localObject4).ldh.field_type))
      {
        localObject2 = ((LabelPreference)localObject4).ldh.field_encryptUsername;
        if (!bo.isNullOrNil((String)localObject2))
        {
          aw.ZK();
          ((LabelPreference)localObject4).pCq = com.tencent.mm.model.c.XN().RB((String)localObject2);
        }
        if ((((LabelPreference)localObject4).pCq != null) && (((LabelPreference)localObject4).pCq.xDa < 0L))
        {
          aw.ZK();
          ((LabelPreference)localObject4).pCq = com.tencent.mm.model.c.XN().RB(((LabelPreference)localObject4).ldh.field_username);
        }
      }
      if ((!com.tencent.mm.n.a.jh(((LabelPreference)localObject4).ldh.field_type)) || (bo.isNullOrNil(((LabelPreference)localObject4).ldh.field_contactLabelIds)))
        break label3151;
      paramInt = 1;
      label1617: if (paramInt != 0)
        break label3185;
      paramBoolean = true;
      label1624: paramf.ce("contact_profile_label", paramBoolean);
      localObject1 = (PhoneNumPreference)paramf.aqO("contact_profile_phone");
      ((PhoneNumPreference)localObject1).iFE = paramf;
      localObject3 = this.jiE.getIntent();
      ((PhoneNumPreference)localObject1).ldh = paramad;
      ((PhoneNumPreference)localObject1).vin = paramad.dur;
      ab.i("MicroMsg.PhoneNumPreference", "isCancelMatchPhoneMD5 %s", new Object[] { paramad.Of() });
      if (!paramad.Of())
      {
        localObject2 = null;
        localObject4 = ((Intent)localObject3).getStringExtra("Contact_Mobile_MD5");
        localObject3 = ((Intent)localObject3).getStringExtra("Contact_full_Mobile_MD5");
        if ((!bo.isNullOrNil((String)localObject4)) || (!bo.isNullOrNil((String)localObject3)))
          break label3198;
        if (!bo.isNullOrNil(paramad.field_username))
        {
          localObject4 = com.tencent.mm.plugin.account.a.getAddrUploadStg().vT(paramad.field_username);
          localObject3 = paramad.field_username;
          if (localObject4 != null)
            break label3190;
          localObject2 = "true";
          label1794: ab.i("MicroMsg.PhoneNumPreference", "Contact name: %s AddrUpload IS NULL? %s", new Object[] { localObject3, localObject2 });
          localObject2 = localObject4;
        }
        label1821: if ((localObject2 != null) && (!bo.isNullOrNil(((com.tencent.mm.plugin.account.friend.a.a)localObject2).Aq())))
        {
          ((PhoneNumPreference)localObject1).vim = bo.nullAsNil(((com.tencent.mm.plugin.account.friend.a.a)localObject2).apG()).replace(" ", "");
          ab.i("MicroMsg.PhoneNumPreference", "Contact name: %s mMobileByMD5: %s", new Object[] { paramad.field_username, ((PhoneNumPreference)localObject1).vim });
        }
        ((PhoneNumPreference)localObject1).dlc();
      }
      ((PhoneNumPreference)localObject1).iFE.ce("contact_profile_phone", true);
      ((PhoneNumPreference)localObject1).dlc();
      ((PhoneNumPreference)localObject1).NW(8);
      localObject4 = (ProfileDescribePreference)paramf.aqO("contact_profile_desc");
      ((ProfileDescribePreference)localObject4).ldh = paramad;
      if (!com.tencent.mm.n.a.jh(((ProfileDescribePreference)localObject4).ldh.field_type))
      {
        localObject2 = ((ProfileDescribePreference)localObject4).ldh.field_encryptUsername;
        if (!bo.isNullOrNil((String)localObject2))
        {
          aw.ZK();
          ((ProfileDescribePreference)localObject4).pCq = com.tencent.mm.model.c.XN().RB((String)localObject2);
        }
        if ((((ProfileDescribePreference)localObject4).pCq != null) && (((ProfileDescribePreference)localObject4).pCq.xDa < 0L))
        {
          aw.ZK();
          ((ProfileDescribePreference)localObject4).pCq = com.tencent.mm.model.c.XN().RB(((ProfileDescribePreference)localObject4).ldh.field_username);
        }
      }
      if (com.tencent.mm.n.a.jh(((ProfileDescribePreference)localObject4).ldh.field_type))
        break label3340;
      if ((((ProfileDescribePreference)localObject4).pCq == null) || (bo.isNullOrNil(((ProfileDescribePreference)localObject4).pCq.field_conDescription)))
        break label3334;
      paramInt = 1;
      label2073: if (paramInt != 0)
        break label3394;
      paramBoolean = true;
      label2080: paramf.ce("contact_profile_desc", paramBoolean);
      if ((com.tencent.mm.n.a.jh(paramad.field_type)) || (bo.isNullOrNil(paramad.signature)))
        break label3399;
      localObject2 = (KeyValuePreference)paramf.aqO("contact_info_signature");
      if (localObject2 != null)
      {
        ((KeyValuePreference)localObject2).nnX = (com.tencent.mm.bz.a.ao(this.jiE, (int)this.jiE.getResources().getDimension(2131427813)) * com.tencent.mm.bz.a.dm(this.jiE));
        ((KeyValuePreference)localObject2).yCj = false;
        ((KeyValuePreference)localObject2).setTitle(this.jiE.getString(2131298678));
        ((KeyValuePreference)localObject2).setSummary(j.b(this.jiE, paramad.signature));
        ((KeyValuePreference)localObject2).qi(false);
        ((KeyValuePreference)localObject2).NT(5);
        ((KeyValuePreference)localObject2).NW(8);
      }
      label2220: if ((paramf.aqQ("contact_profile_desc") >= 0) || (paramf.aqQ("contact_profile_label") >= 0))
        break label3412;
      paramf.ce("contact_profile_setting_desc", false);
      label2253: if (!com.tencent.mm.n.a.jh(paramad.field_type))
        paramf.ce("contact_profile_setting_desc", false);
      paramf.ce("contact_profile_set_des_category", true);
      if ((!ad.aox(this.ldh.field_username)) || (!bo.isNullOrNil(this.ldh.field_conRemark)))
        break label3424;
      paramf.ce("contact_profile_setting_desc", false);
      paramf.ce("contact_profile_set_des_category", true);
      label2327: paramf.aqO("contact_profile_info_more").setTitle(this.jiE.getText(2131298593).toString());
      ((TextPreference)paramf.aqO("contact_profile_hint")).ae(this.jiE.getText(2131298598));
      if (!paramad.Oa())
        break label3459;
      paramf.ce("contact_profile_hint", false);
      label2395: localObject4 = (MultiButtonPreference)paramf.aqO("contact_profile_multi_button");
      if (!cak())
      {
        if ((com.tencent.mm.n.a.jh(this.ldh.field_type)) || (this.jiE.getIntent().getIntExtra("CONTACT_INFO_UI_SOURCE", 0) != 2))
          break label3472;
        paramInt = 1;
        label2450: if (paramInt == 0)
          break label3493;
      }
      if (!this.ldh.Oa())
        break label3478;
      localObject2 = this.jiE.getString(2131298599);
      label2477: ((MultiButtonPreference)localObject4).a((String)localObject2, new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          AppMethodBeat.i(23203);
          a.this.pkh.jL(true);
          AppMethodBeat.o(23203);
        }
      });
      localObject1 = this.jiE.getString(2131297652);
      localObject2 = new a.7(this);
      ((MultiButtonPreference)localObject4).pnK = ((String)localObject1);
      ((MultiButtonPreference)localObject4).pnN = ((View.OnClickListener)localObject2);
      label2528: if ((cah()) || ((com.tencent.mm.n.a.jh(paramad.field_type)) && (!paramad.Oa())) || ((!cak()) && (cal())))
        paramf.ce("contact_profile_multi_button", true);
      if ((com.tencent.mm.n.a.jh(this.ldh.field_type)) && (!cak()) && (!cao()) && (!caj()))
        break label3540;
      paramf.ce("contact_profile_send", true);
      paramf.ce("contact_profile_voip", true);
      label2630: if ((!com.tencent.mm.n.a.jh(this.ldh.field_type)) && (!cak()) && (!cao()) && (!can()) && (!cam()))
        break label3569;
      paramf.ce("contact_profile_add_contact", true);
      label2681: a(paramf, paramad, false);
      if ((cak()) || (com.tencent.mm.n.a.jh(paramad.field_type)) || ((!caj()) && (!can()) && (!cam())))
        break label3609;
      paramf.ce("contact_profile_info_more", true);
      paramf.ce("contact_profile_say_hi", false);
      label2745: if (r.mG(this.ldh.field_username))
      {
        paramf.ce("contact_profile_multi_button", true);
        paramf.ce("contact_profile_info_more", bo.isNullOrNil(paramad.signature));
        paramf.ce("contact_profile_setting_desc", true);
        paramf.ce("contact_profile_voip", true);
        this.pkh.knn.mController.removeAllOptionMenu();
      }
      localObject4 = this.ldh;
      paramf.ce("contact_info_invite_source", true);
      if (this.eih != null)
        break label3653;
      paramBoolean = this.jiE.getIntent().getBooleanExtra("Is_RoomOwner", false);
      label2852: if ((this.gOW == 14) && (paramBoolean) && (this.eih != null) && (!((ap)localObject4).field_username.equals(this.eih.field_roomowner)))
        break label3670;
      paramInt = this.gOW;
      if (this.eih != null)
        break label3664;
      bool1 = true;
      label2906: ab.i("MicroMsg.NewContactWidgetNormal", "[initInviteSource] addContactScene:%s isOwner:%s null == member:%s", new Object[] { Integer.valueOf(paramInt), Boolean.valueOf(paramBoolean), Boolean.valueOf(bool1) });
      paramf.ce("contact_info_invite_source", true);
    }
    while (true)
    {
      this.iFE.ce("contact_profile_story", true);
      aw.ZK();
      bool1 = com.tencent.mm.model.c.XM().aoJ(paramad.field_username);
      paramBoolean = r.Yz().equals(paramad.field_username);
      if (((com.tencent.mm.plugin.story.api.e)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.story.api.e.class)).getStoryBasicConfig().cwU())
      {
        ab.i("MicroMsg.NewContactWidgetNormal", "updateStoryVisible isFriend:%s isSelf:%s ", new Object[] { Boolean.valueOf(bool1), Boolean.valueOf(paramBoolean) });
        if (((!ad.aov(paramad.field_username)) && (bool1)) || (paramBoolean))
        {
          paramf = (AbsStoryPreference)this.iFE.aqO("contact_profile_story");
          paramf.onCreate(paramad.field_username);
          paramf.a(this);
          paramf.cwP();
          paramf.cwO();
        }
      }
      AppMethodBeat.o(23221);
      break;
      paramBoolean = false;
      break label1080;
      label3111: this.iFE.ce("contact_profile_sns", true);
      break label1237;
      label3126: localObject2 = this.jiE.getText(2131298766).toString();
      break label1300;
      label3146: paramBoolean = false;
      break label1459;
      label3151: if ((((LabelPreference)localObject4).pCq != null) && (!bo.isNullOrNil(((LabelPreference)localObject4).pCq.field_contactLabels)))
      {
        paramInt = 1;
        break label1617;
      }
      paramInt = 0;
      break label1617;
      label3185: paramBoolean = false;
      break label1624;
      label3190: localObject2 = "false";
      break label1794;
      label3198: if ((bo.isNullOrNil((String)localObject4)) && (bo.isNullOrNil((String)localObject3)))
        break label1821;
      ab.i("MicroMsg.PhoneNumPreference", "Contact name: %s mMobileByMD5: %s mobileFullMD5:%s", new Object[] { paramad.field_username, localObject4, localObject3 });
      localObject4 = com.tencent.mm.plugin.account.a.getAddrUploadStg().vW((String)localObject4);
      if (localObject4 != null)
      {
        localObject2 = localObject4;
        if (!bo.isNullOrNil(((com.tencent.mm.plugin.account.friend.a.a)localObject4).Aq()));
      }
      else
      {
        localObject2 = com.tencent.mm.plugin.account.a.getAddrUploadStg().vW((String)localObject3);
      }
      localObject3 = paramad.field_username;
      if (localObject2 == null);
      for (localObject4 = "true"; ; localObject4 = "false")
      {
        ab.i("MicroMsg.PhoneNumPreference", "Contact name: %s AddrUpload IS NULL? %s", new Object[] { localObject3, localObject4 });
        break;
      }
      label3334: paramInt = 0;
      break label2073;
      label3340: if (!bo.isNullOrNil(((ProfileDescribePreference)localObject4).ldh.dum));
      for (paramInt = 1; ; paramInt = 0)
      {
        if ((bo.isNullOrNil(((ProfileDescribePreference)localObject4).ldh.dul)) && (paramInt == 0))
          break label3388;
        paramInt = 1;
        break;
      }
      label3388: paramInt = 0;
      break label2073;
      label3394: paramBoolean = false;
      break label2080;
      label3399: paramf.aqP("contact_info_signature");
      break label2220;
      label3412: paramf.ce("contact_profile_setting_desc", true);
      break label2253;
      label3424: if (!ad.aox(this.ldh.field_username))
        break label2327;
      paramf.ce("contact_profile_setting_desc", true);
      paramf.ce("contact_profile_set_des_category", true);
      break label2327;
      label3459: paramf.ce("contact_profile_hint", true);
      break label2395;
      label3472: paramInt = 0;
      break label2450;
      label3478: localObject2 = this.jiE.getString(2131298594);
      break label2477;
      label3493: if ((!paramad.Oa()) && (!can()) && (!cam()))
        break label2528;
      ((MultiButtonPreference)localObject4).a(this.jiE.getString(2131297652), new a.8(this));
      break label2528;
      label3540: paramf.ce("contact_profile_send", false);
      paramf.ce("contact_profile_voip", this.ldh.Oa());
      break label2630;
      label3569: paramf.ce("contact_profile_add_contact", false);
      paramf.ce("contact_profile_setting_desc", false);
      paramf.ce("contact_profile_phone", true);
      paramf.ce("contact_profile_info_more", true);
      break label2681;
      label3609: paramf.ce("contact_profile_say_hi", true);
      if (!com.tencent.mm.n.a.jh(paramad.field_type))
      {
        paramf.ce("contact_profile_info_more", true);
        break label2745;
      }
      paramf.ce("contact_profile_info_more", false);
      break label2745;
      label3653: paramBoolean = this.eih.JR();
      break label2852;
      label3664: bool1 = false;
      break label2906;
      label3670: this.pkj = this.jiE.getIntent().getStringExtra("inviteer");
      if (bo.isNullOrNil(this.pkj))
        this.pkj = this.eih.aop(((ap)localObject4).field_username);
      if (bo.isNullOrNil(this.pkj))
        this.pkj = com.tencent.mm.model.n.Z(((ap)localObject4).field_username, this.ejD);
      if (bo.isNullOrNil(this.pkj))
      {
        ab.w("MicroMsg.NewContactWidgetNormal", "mRoomId:%s member:%s , inviter is null!", new Object[] { this.ejD, ((ap)localObject4).field_username });
        this.pkk.dnU();
        ao.a.flu.a(((ap)localObject4).field_username, this.ejD, new a.4(this));
      }
      else
      {
        this.jiE.getIntent().putExtra("inviteer", this.pkj);
        localObject2 = b(this.eih, this.pkj);
        if (bo.isNullOrNil((String)localObject2))
          ao.a.flu.a(((ap)localObject4).field_username, "", new a.5(this, paramf));
        else
          a(paramf, this.jiE, this.pkj, (String)localObject2);
      }
    }
  }

  public final boolean biV()
  {
    AppMethodBeat.i(23223);
    this.iFE.aqO("contact_profile_sns");
    if (com.tencent.mm.plugin.sns.b.n.qFC != null)
      com.tencent.mm.plugin.sns.b.n.qFC.a(this, 3);
    Object localObject = (NormalProfileHeaderPreference)this.iFE.aqO("contact_profile_header_normal");
    if (localObject != null)
      ((NormalProfileHeaderPreference)localObject).onDetach();
    localObject = (AbsStoryPreference)this.iFE.aqO("contact_profile_story");
    if (localObject != null)
      ((AbsStoryPreference)localObject).onDestroy();
    this.pkk.dead();
    AppMethodBeat.o(23223);
    return false;
  }

  public final void cA(List paramList)
  {
    AppMethodBeat.i(23236);
    if ((paramList == null) || (paramList.isEmpty()))
    {
      ab.d("MicroMsg.NewContactWidgetNormal", "onLoadFavStoryFinish hideStoryPreference");
      this.iFE.ce("contact_profile_story", true);
      AppMethodBeat.o(23236);
    }
    while (true)
    {
      return;
      ab.d("MicroMsg.NewContactWidgetNormal", "onLoadFavStoryFinish showStoryPreference");
      this.iFE.ce("contact_profile_story", false);
      AppMethodBeat.o(23236);
    }
  }

  public final void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(23225);
    a(this.iFE, this.ldh, true);
    AppMethodBeat.o(23225);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.profile.a
 * JD-Core Version:    0.6.2
 */