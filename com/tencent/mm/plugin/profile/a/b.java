package com.tencent.mm.plugin.profile.a;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.bf;
import com.tencent.mm.model.t;
import com.tencent.mm.platformtools.w;
import com.tencent.mm.plugin.messenger.foundation.a.a.i;
import com.tencent.mm.plugin.profile.ui.ContactMoreInfoUI;
import com.tencent.mm.plugin.profile.ui.PermissionSettingUI;
import com.tencent.mm.pluginsdk.n;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.be;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.l;
import com.tencent.mm.ui.base.n.c;
import com.tencent.mm.ui.base.n.d;

public final class b
  implements MenuItem.OnMenuItemClickListener, n.c, n.d
{
  private int gwP;
  private com.tencent.mm.ui.widget.a.d iHZ;
  private boolean isDeleteCancel;
  public MMActivity knn;
  private ad ldh;
  private boolean pkC;

  public b(MMActivity paramMMActivity, ad paramad)
  {
    AppMethodBeat.i(23264);
    this.knn = paramMMActivity;
    this.ldh = paramad;
    this.gwP = this.knn.getIntent().getIntExtra("Contact_Scene", 9);
    this.pkC = this.knn.getIntent().getBooleanExtra("Contact_FMessageCard", false);
    AppMethodBeat.o(23264);
  }

  public static void a(Activity paramActivity, ad paramad)
  {
    AppMethodBeat.i(23277);
    Intent localIntent = new Intent();
    localIntent.setClass(paramActivity, ContactMoreInfoUI.class);
    localIntent.putExtra("Is_RoomOwner", paramActivity.getIntent().getBooleanExtra("Is_RoomOwner", false));
    localIntent.putExtra("Contact_User", paramad.field_username);
    String str = paramActivity.getIntent().getStringExtra("room_name");
    paramad = str;
    if (str == null)
      paramad = paramActivity.getIntent().getStringExtra("Contact_ChatRoomId");
    localIntent.putExtra("Contact_ChatRoomId", paramad);
    paramad = bo.bc(paramActivity.getIntent().getStringExtra("verify_gmail"), "");
    str = bo.bc(paramActivity.getIntent().getStringExtra("profileName"), bo.anu(paramad));
    localIntent.putExtra("verify_gmail", paramad);
    localIntent.putExtra("profileName", str);
    long l = paramActivity.getIntent().getLongExtra("Contact_Uin", 0L);
    paramad = paramActivity.getIntent().getStringExtra("Contact_QQNick");
    localIntent.putExtra("Contact_Uin", l);
    localIntent.putExtra("Contact_QQNick", paramad);
    paramActivity.startActivity(localIntent);
    AppMethodBeat.o(23277);
  }

  private void cat()
  {
    AppMethodBeat.i(23271);
    t.i(this.ldh);
    this.ldh.ND();
    AppMethodBeat.o(23271);
  }

  private void cau()
  {
    AppMethodBeat.i(23272);
    t.j(this.ldh);
    this.ldh.NE();
    AppMethodBeat.o(23272);
  }

  private void zq(String paramString)
  {
    AppMethodBeat.i(23274);
    int i = this.knn.getIntent().getIntExtra("Kdel_from", -1);
    this.ldh.NC();
    this.ldh.setSource(0);
    if (ad.aox(paramString))
    {
      ((com.tencent.mm.openim.a.a)g.K(com.tencent.mm.openim.a.a.class)).ve(paramString);
      bf.a(paramString, new b.6(this));
      aw.ZK();
      com.tencent.mm.model.c.XM().b(paramString, this.ldh);
      aw.ZK();
      com.tencent.mm.model.c.XR().aoX(paramString);
      com.tencent.mm.bi.c.e(0L, paramString);
      com.tencent.mm.bi.c.e(0L, this.ldh.field_encryptUsername);
      switch (this.gwP)
      {
      case 11:
      case 12:
      default:
        label152: if (this.gwP == 9)
          ab.i("MicroMsg.ProfileMenuManager", "add scene unkown, check the contact getsource: " + this.ldh.getSource());
        switch (this.ldh.getSource())
        {
        case 11:
        case 12:
        default:
          label228: if (i == 0)
          {
            paramString = new Intent();
            paramString.addFlags(67108864);
            com.tencent.mm.plugin.profile.b.gkE.p(paramString, this.knn);
            AppMethodBeat.o(23274);
          }
          break;
        case 10:
        case 13:
        }
        break;
      case 13:
      case 10:
      }
    }
    while (true)
    {
      return;
      aw.ZK();
      com.tencent.mm.model.c.XL().c(new com.tencent.mm.az.c(paramString));
      break;
      com.tencent.mm.plugin.account.friend.a.a locala = com.tencent.mm.plugin.account.a.getAddrUploadStg().vT(paramString);
      if ((locala != null) && (!bo.isNullOrNil(locala.guM)))
      {
        locala.status = 1;
        com.tencent.mm.plugin.account.a.getAddrUploadStg().a(locala.Aq(), locala);
      }
      w.J(this.knn, paramString);
      break label152;
      w.J(this.knn, paramString);
      break label152;
      ab.i("MicroMsg.ProfileMenuManager", "delete the system contact info added by wechat");
      w.J(this.knn, paramString);
      break label228;
      this.knn.setResult(-1, this.knn.getIntent().putExtra("_delete_ok_", true));
      this.knn.finish();
      AppMethodBeat.o(23274);
    }
  }

  public final void a(l paraml)
  {
    AppMethodBeat.i(23267);
    int i;
    if (!t.nB(this.ldh.field_username))
    {
      if (ad.aox(this.ldh.field_username))
        paraml.ax(1, 2131298767, 2131231014);
    }
    else
    {
      if ((com.tencent.mm.n.a.jh(this.ldh.field_type)) && (!t.nB(this.ldh.field_username)))
      {
        i = 2131298668;
        if (this.ldh.dtS != 1)
          break label416;
        i = 2131298666;
        label89: paraml.ax(4, i, 2131231019);
      }
      if (!this.ldh.Oc())
        break label434;
      str = this.knn.getResources().getString(2131298740);
      label123: if ((com.tencent.mm.n.a.jh(this.ldh.field_type)) && (!t.nB(this.ldh.field_username)))
        paraml.a(2, str, 2131231017);
      if ((com.tencent.mm.n.a.jh(this.ldh.field_type)) || (!this.knn.getIntent().getBooleanExtra("User_Verify", false)))
        break label451;
      i = 1;
      label191: if ((i != 0) || ((!ad.aox(this.ldh.field_username)) && (!t.nB(this.ldh.field_username)) && (com.tencent.mm.n.a.jh(this.ldh.field_type))))
        paraml.ax(3, 2131298604, 2131231005);
      if (!this.ldh.Oa())
        break label456;
    }
    label416: label434: label451: label456: for (String str = this.knn.getString(2131298599); ; str = this.knn.getString(2131298594))
    {
      if (!t.nB(this.ldh.field_username))
        paraml.a(5, str, 2131230983);
      if ((!t.nB(this.ldh.field_username)) && (com.tencent.mm.n.a.jh(this.ldh.field_type)))
        paraml.ax(9, 2131297652, 2131230987);
      if (com.tencent.mm.n.a.jh(this.ldh.field_type))
        paraml.ax(7, 2131298439, 2131230991);
      if ((com.tencent.mm.n.a.jh(this.ldh.field_type)) && (!t.nB(this.ldh.field_username)))
        paraml.ax(6, 2131297533, 2131230990);
      AppMethodBeat.o(23267);
      return;
      paraml.ax(1, 2131298589, 2131231014);
      break;
      if (this.ldh.dtS != 2)
        break label89;
      i = 2131298667;
      break label89;
      str = this.knn.getResources().getString(2131298524);
      break label123;
      i = 0;
      break label191;
    }
  }

  public final void bKH()
  {
    AppMethodBeat.i(23265);
    this.knn.addIconOptionMenu(0, 2130839555, this);
    AppMethodBeat.o(23265);
  }

  public final void cas()
  {
    AppMethodBeat.i(23269);
    Intent localIntent = new Intent(this.knn, PermissionSettingUI.class);
    localIntent.putExtra("sns_permission_userName", this.ldh.field_username);
    localIntent.putExtra("sns_permission_anim", true);
    localIntent.putExtra("sns_permission_block_scene", 1);
    this.knn.startActivity(localIntent);
    AppMethodBeat.o(23269);
  }

  public final void cav()
  {
    AppMethodBeat.i(23273);
    View localView = View.inflate(this.knn, 2130970090, null);
    localView.setPadding(0, 0, 0, 0);
    Object localObject1 = (TextView)localView.findViewById(2131825969);
    ((TextView)localObject1).setPadding(0, 0, 0, 0);
    Object localObject2;
    if (t.mW(this.ldh.field_username))
    {
      localObject2 = this.knn.getString(2131298855, new Object[] { this.ldh.Oj() });
      ((TextView)localObject1).setText((CharSequence)localObject2);
      localObject1 = (CheckBox)localView.findViewById(2131825970);
      ((CheckBox)localObject1).setChecked(false);
      localObject2 = (TextView)localView.findViewById(2131825971);
      ((TextView)localObject2).setText(2131298597);
      if (this.ldh.getSource() != 18)
        break label232;
      ((CheckBox)localObject1).setVisibility(0);
      ((TextView)localObject2).setVisibility(0);
    }
    while (true)
    {
      com.tencent.mm.ui.base.h.a(this.knn, true, this.knn.getString(2131298502), localView, this.knn.getString(2131296881), this.knn.getString(2131296868), new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          AppMethodBeat.i(23258);
          b.d(b.this);
          if (b.b(b.this).getSource() == 18)
          {
            b.c(b.this);
            if (this.pkD.isChecked())
              b.this.cax();
          }
          AppMethodBeat.o(23258);
        }
      }
      , null, 2131689665);
      AppMethodBeat.o(23273);
      return;
      localObject2 = this.knn.getString(2131298853, new Object[] { this.ldh.Oj() });
      break;
      label232: ((CheckBox)localObject1).setVisibility(8);
      ((TextView)localObject2).setVisibility(8);
    }
  }

  public final void caw()
  {
    AppMethodBeat.i(23275);
    Intent localIntent = new Intent();
    localIntent.putExtra("Select_Talker_Name", this.ldh.field_username);
    localIntent.putExtra("Select_block_List", this.ldh.field_username);
    localIntent.putExtra("Select_Conv_Type", 3);
    localIntent.putExtra("Select_Send_Card", true);
    localIntent.putExtra("mutil_select_is_ret", true);
    com.tencent.mm.plugin.profile.b.gkE.a(localIntent, new b.7(this), this.knn);
    AppMethodBeat.o(23275);
  }

  public final void cax()
  {
    int i = 7;
    AppMethodBeat.i(23276);
    Intent localIntent = new Intent();
    switch (this.gwP)
    {
    default:
      i = 999;
    case 18:
    case 22:
    case 23:
    case 24:
    case 26:
    case 27:
    case 28:
    case 29:
    case 30:
    case 25:
    case 9:
    case 14:
    case 1:
    case 2:
    case 3:
    case 12:
    case 13:
    case 58:
    case 59:
    case 60:
    }
    while (true)
    {
      localIntent.putExtra("k_username", this.ldh.field_username);
      localIntent.putExtra("showShare", false);
      localIntent.putExtra("rawUrl", String.format("https://weixin110.qq.com/security/readtemplate?t=weixin_report/w_type&scene=%d#wechat_redirect", new Object[] { Integer.valueOf(i) }));
      com.tencent.mm.bp.d.b(this.knn, "webview", ".ui.tools.WebViewUI", localIntent);
      AppMethodBeat.o(23276);
      return;
      if (this.pkC);
      for (i = 2; ; i = 1)
      {
        localIntent.putStringArrayListExtra("k_outside_expose_proof_item_list", com.tencent.mm.bi.a.tS(this.ldh.field_username));
        break;
      }
      if (this.pkC);
      for (i = 4; ; i = 3)
      {
        localIntent.putStringArrayListExtra("k_outside_expose_proof_item_list", com.tencent.mm.bi.a.tT(this.ldh.field_username));
        break;
      }
      localIntent.putStringArrayListExtra("k_outside_expose_proof_item_list", com.tencent.mm.bi.a.z(7, this.ldh.field_username));
      continue;
      if (this.pkC);
      for (i = 6; ; i = 5)
      {
        if (!this.pkC)
          break label403;
        localIntent.putExtra("k_outside_expose_proof_item_list", com.tencent.mm.bi.a.z(i, this.ldh.field_username));
        break;
      }
      label403: if (!bo.isNullOrNil(this.ldh.xXc));
      for (String str = this.ldh.xXc; ; str = this.ldh.field_username)
      {
        localIntent.putExtra("k_outside_expose_proof_item_list", com.tencent.mm.bi.a.tU(str));
        break;
      }
      i = 35;
      continue;
      localIntent.putExtra("k_outside_expose_proof_item_list", com.tencent.mm.bi.a.z(45, this.ldh.field_username));
      i = 45;
    }
  }

  public final void jL(boolean paramBoolean)
  {
    AppMethodBeat.i(23270);
    if (this.ldh.Oa())
    {
      cau();
      AppMethodBeat.o(23270);
    }
    while (true)
    {
      return;
      View localView = View.inflate(this.knn, 2130970090, null);
      localView.setPadding(0, 0, 0, 0);
      Object localObject = (TextView)localView.findViewById(2131825969);
      ((TextView)localObject).setPadding(0, 0, 0, 0);
      int i;
      label84: TextView localTextView;
      if (ad.aox(this.ldh.field_username))
      {
        i = 2131298596;
        ((TextView)localObject).setText(i);
        localObject = (CheckBox)localView.findViewById(2131825970);
        ((CheckBox)localObject).setChecked(false);
        localTextView = (TextView)localView.findViewById(2131825971);
        localTextView.setText(2131298597);
        if (this.ldh.getSource() != 18)
          break label220;
        ((CheckBox)localObject).setVisibility(0);
        localTextView.setVisibility(0);
      }
      while (true)
      {
        if (!paramBoolean)
          break label236;
        com.tencent.mm.ui.base.h.a(this.knn, true, this.knn.getString(2131298594), localView, this.knn.getString(2131296994), this.knn.getString(2131296868), new b.1(this, (CheckBox)localObject), null);
        AppMethodBeat.o(23270);
        break;
        i = 2131298595;
        break label84;
        label220: ((CheckBox)localObject).setVisibility(8);
        localTextView.setVisibility(8);
      }
      label236: cat();
      AppMethodBeat.o(23270);
    }
  }

  public final void onMMMenuItemSelected(MenuItem paramMenuItem, int paramInt)
  {
    AppMethodBeat.i(23268);
    switch (paramMenuItem.getItemId())
    {
    case 8:
    default:
    case 2:
    case 3:
    case 4:
    case 1:
    case 5:
    case 6:
    case 7:
    case 9:
    }
    while (true)
    {
      AppMethodBeat.o(23268);
      while (true)
      {
        return;
        if (this.ldh.Oc())
        {
          t.n(this.ldh);
          com.tencent.mm.ui.base.h.bQ(this.knn, this.knn.getString(2131298741));
        }
        while (true)
        {
          aw.ZK();
          this.ldh = com.tencent.mm.model.c.XM().aoO(this.ldh.field_username);
          AppMethodBeat.o(23268);
          break;
          t.m(this.ldh);
          com.tencent.mm.ui.base.h.bQ(this.knn, this.knn.getString(2131298525));
        }
        cas();
        AppMethodBeat.o(23268);
        continue;
        caw();
        AppMethodBeat.o(23268);
        continue;
        if (!com.tencent.mm.n.a.jh(this.ldh.field_type))
        {
          if (bo.isNullOrNil(this.ldh.field_username))
          {
            ab.w("MicroMsg.ProfileMenuManager", "mod stranger remark, username is null");
            AppMethodBeat.o(23268);
          }
          else
          {
            paramMenuItem = new Intent();
            paramMenuItem.putExtra("Contact_Scene", this.gwP);
            paramMenuItem.putExtra("Contact_mode_name_type", 0);
            paramMenuItem.putExtra("Contact_ModStrangerRemark", true);
            paramMenuItem.putExtra("Contact_User", this.ldh.field_username);
            paramMenuItem.putExtra("Contact_Nick", this.ldh.field_nickname);
            paramMenuItem.putExtra("Contact_RemarkName", this.ldh.field_conRemark);
            com.tencent.mm.plugin.profile.b.gkE.n(paramMenuItem, this.knn);
            AppMethodBeat.o(23268);
          }
        }
        else
        {
          Intent localIntent = new Intent();
          localIntent.putExtra("Contact_Scene", this.gwP);
          localIntent.putExtra("Contact_User", this.ldh.field_username);
          localIntent.putExtra("Contact_RoomNickname", this.knn.getIntent().getStringExtra("Contact_RoomNickname"));
          localIntent.putExtra("contact_phone_number_list", this.ldh.dur);
          String str1 = "";
          Object localObject = str1;
          String str2;
          if (!this.ldh.Of())
          {
            paramMenuItem = null;
            localObject = this.knn.getIntent().getStringExtra("Contact_Mobile_MD5");
            str2 = this.knn.getIntent().getStringExtra("Contact_full_Mobile_MD5");
            if ((!bo.isNullOrNil((String)localObject)) || (!bo.isNullOrNil(str2)))
              break label572;
            if (!bo.isNullOrNil(this.ldh.field_username))
              paramMenuItem = com.tencent.mm.plugin.account.a.getAddrUploadStg().vT(this.ldh.field_username);
          }
          while (true)
          {
            localObject = str1;
            if (paramMenuItem != null)
            {
              localObject = str1;
              if (!bo.isNullOrNil(paramMenuItem.Aq()))
                localObject = bo.nullAsNil(paramMenuItem.apG()).replace(" ", "");
            }
            localIntent.putExtra("contact_phone_number_by_md5", (String)localObject);
            com.tencent.mm.plugin.profile.b.gkE.m(localIntent, this.knn);
            AppMethodBeat.o(23268);
            break;
            label572: if ((!bo.isNullOrNil((String)localObject)) || (!bo.isNullOrNil(str2)))
            {
              localObject = com.tencent.mm.plugin.account.a.getAddrUploadStg().vW((String)localObject);
              if (localObject != null)
              {
                paramMenuItem = (MenuItem)localObject;
                if (!bo.isNullOrNil(((com.tencent.mm.plugin.account.friend.a.a)localObject).Aq()));
              }
              else
              {
                paramMenuItem = com.tencent.mm.plugin.account.a.getAddrUploadStg().vW(str2);
              }
            }
          }
          jL(true);
          AppMethodBeat.o(23268);
          continue;
          cav();
          AppMethodBeat.o(23268);
          continue;
          ab.d("MicroMsg.ProfileMenuManager", "dealAddShortcut, username = " + this.ldh.field_username);
          com.tencent.mm.plugin.base.model.b.aa(this.knn, this.ldh.field_username);
          com.tencent.mm.plugin.base.model.b.Z(this.knn, this.ldh.field_username);
          AppMethodBeat.o(23268);
        }
      }
      cax();
    }
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(23266);
    this.iHZ = new com.tencent.mm.ui.widget.a.d(this.knn, 1, false);
    this.iHZ.rBm = this;
    this.iHZ.rBl = this;
    this.iHZ.cpD();
    AppMethodBeat.o(23266);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.profile.a.b
 * JD-Core Version:    0.6.2
 */