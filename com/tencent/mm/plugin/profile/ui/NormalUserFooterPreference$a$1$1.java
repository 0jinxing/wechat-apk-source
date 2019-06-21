package com.tencent.mm.plugin.profile.ui;

import android.content.Context;
import android.content.Intent;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.model.t;
import com.tencent.mm.pluginsdk.n;
import com.tencent.mm.sdk.e.l;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.n.d;
import com.tencent.mm.ui.base.preference.Preference;

final class NormalUserFooterPreference$a$1$1
  implements n.d
{
  NormalUserFooterPreference$a$1$1(NormalUserFooterPreference.a.1 param1)
  {
  }

  public final void onMMMenuItemSelected(MenuItem paramMenuItem, int paramInt)
  {
    Object localObject1 = null;
    AppMethodBeat.i(23674);
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
      AppMethodBeat.o(23674);
      while (true)
      {
        return;
        if (NormalUserFooterPreference.a(this.poT.poS.poR).Oc())
        {
          t.n(NormalUserFooterPreference.a(this.poT.poS.poR));
          h.bQ(NormalUserFooterPreference.b(this.poT.poS.poR), NormalUserFooterPreference.b(this.poT.poS.poR).getString(2131298741));
        }
        while (true)
        {
          paramMenuItem = this.poT.poS.poR;
          aw.ZK();
          NormalUserFooterPreference.a(paramMenuItem, c.XM().aoO(NormalUserFooterPreference.a(this.poT.poS.poR).field_username));
          AppMethodBeat.o(23674);
          break;
          t.m(NormalUserFooterPreference.a(this.poT.poS.poR));
          h.bQ(NormalUserFooterPreference.b(this.poT.poS.poR), NormalUserFooterPreference.b(this.poT.poS.poR).getString(2131298525));
        }
        paramMenuItem = new Intent();
        paramMenuItem.putExtra("sns_permission_userName", NormalUserFooterPreference.a(this.poT.poS.poR).field_username);
        paramMenuItem.putExtra("sns_permission_anim", true);
        paramMenuItem.putExtra("sns_permission_block_scene", 1);
        d.b(NormalUserFooterPreference.b(this.poT.poS.poR), "sns", ".ui.SnsPermissionUI", paramMenuItem);
        AppMethodBeat.o(23674);
        continue;
        paramMenuItem = this.poT.poS;
        Object localObject2 = new Intent();
        ((Intent)localObject2).putExtra("Select_Talker_Name", NormalUserFooterPreference.a(paramMenuItem.poR).field_username);
        ((Intent)localObject2).putExtra("Select_block_List", NormalUserFooterPreference.a(paramMenuItem.poR).field_username);
        ((Intent)localObject2).putExtra("Select_Conv_Type", 3);
        ((Intent)localObject2).putExtra("Select_Send_Card", true);
        ((Intent)localObject2).putExtra("mutil_select_is_ret", true);
        com.tencent.mm.plugin.profile.b.gkE.a((Intent)localObject2, NormalUserFooterPreference.b(paramMenuItem.poR));
        AppMethodBeat.o(23674);
        continue;
        this.poT.poS.poR.fry.cF("hide_btn");
        this.poT.poS.poR.fry.doNotify();
        NormalUserFooterPreference.a locala = this.poT.poS;
        paramMenuItem = locala.poR;
        aw.ZK();
        NormalUserFooterPreference.a(paramMenuItem, c.XM().aoO(NormalUserFooterPreference.a(locala.poR).field_username));
        if (!com.tencent.mm.n.a.jh(NormalUserFooterPreference.a(locala.poR).field_type))
        {
          locala.UU(NormalUserFooterPreference.a(locala.poR).field_username);
          AppMethodBeat.o(23674);
        }
        else
        {
          Intent localIntent = new Intent();
          localIntent.putExtra("Contact_Scene", NormalUserFooterPreference.l(locala.poR));
          localIntent.putExtra("Contact_User", NormalUserFooterPreference.a(locala.poR).field_username);
          localIntent.putExtra("Contact_RoomNickname", NormalUserFooterPreference.b(locala.poR).getIntent().getStringExtra("Contact_RoomNickname"));
          localIntent.putExtra("contact_phone_number_list", NormalUserFooterPreference.a(locala.poR).dur);
          Object localObject3 = "";
          localObject2 = localObject3;
          String str;
          if (!NormalUserFooterPreference.a(locala.poR).Of())
          {
            localObject2 = NormalUserFooterPreference.b(locala.poR).getIntent().getStringExtra("Contact_Mobile_MD5");
            str = NormalUserFooterPreference.b(locala.poR).getIntent().getStringExtra("Contact_full_Mobile_MD5");
            if ((!bo.isNullOrNil((String)localObject2)) || (!bo.isNullOrNil(str)))
              break label826;
            paramMenuItem = localObject1;
            if (!bo.isNullOrNil(NormalUserFooterPreference.a(locala.poR).field_username))
              paramMenuItem = com.tencent.mm.plugin.account.a.getAddrUploadStg().vT(NormalUserFooterPreference.a(locala.poR).field_username);
          }
          while (true)
          {
            localObject2 = localObject3;
            if (paramMenuItem != null)
            {
              localObject2 = localObject3;
              if (!bo.isNullOrNil(paramMenuItem.Aq()))
                localObject2 = bo.nullAsNil(paramMenuItem.apG()).replace(" ", "");
            }
            localIntent.putExtra("contact_phone_number_by_md5", (String)localObject2);
            com.tencent.mm.plugin.profile.b.gkE.m(localIntent, locala.poR.mContext);
            AppMethodBeat.o(23674);
            break;
            label826: if (bo.isNullOrNil((String)localObject2))
            {
              paramMenuItem = localObject1;
              if (bo.isNullOrNil(str));
            }
            else
            {
              localObject2 = com.tencent.mm.plugin.account.a.getAddrUploadStg().vW((String)localObject2);
              if (localObject2 != null)
              {
                paramMenuItem = (MenuItem)localObject2;
                if (!bo.isNullOrNil(((com.tencent.mm.plugin.account.friend.a.a)localObject2).Aq()));
              }
              else
              {
                paramMenuItem = com.tencent.mm.plugin.account.a.getAddrUploadStg().vW(str);
              }
            }
          }
          if (NormalUserFooterPreference.a(this.poT.poS.poR).Oa())
          {
            NormalUserFooterPreference.a.a(this.poT.poS);
            AppMethodBeat.o(23674);
          }
          else
          {
            paramMenuItem = View.inflate(this.poT.poS.poR.mContext, 2130970090, null);
            paramMenuItem.setPadding(0, 0, 0, 0);
            localObject2 = (TextView)paramMenuItem.findViewById(2131825969);
            ((TextView)localObject2).setPadding(0, 0, 0, 0);
            if (ad.aox(NormalUserFooterPreference.a(this.poT.poS.poR).field_username))
            {
              paramInt = 2131298596;
              label999: ((TextView)localObject2).setText(paramInt);
              localObject3 = (CheckBox)paramMenuItem.findViewById(2131825970);
              ((CheckBox)localObject3).setChecked(false);
              localObject2 = (TextView)paramMenuItem.findViewById(2131825971);
              ((TextView)localObject2).setText(2131298597);
              if (NormalUserFooterPreference.a(this.poT.poS.poR).getSource() != 18)
                break label1179;
              ((CheckBox)localObject3).setVisibility(0);
              ((TextView)localObject2).setVisibility(0);
            }
            while (true)
            {
              h.a(this.poT.poS.poR.mContext, true, this.poT.poS.poR.mContext.getString(2131298594), paramMenuItem, this.poT.poS.poR.mContext.getString(2131296994), this.poT.poS.poR.mContext.getString(2131296868), new NormalUserFooterPreference.a.1.1.1(this, (CheckBox)localObject3), null);
              AppMethodBeat.o(23674);
              break;
              paramInt = 2131298595;
              break label999;
              label1179: ((CheckBox)localObject3).setVisibility(8);
              ((TextView)localObject2).setVisibility(8);
            }
            localObject2 = View.inflate(this.poT.poS.poR.mContext, 2130970090, null);
            ((View)localObject2).setPadding(0, 0, 0, 0);
            localObject3 = (TextView)((View)localObject2).findViewById(2131825969);
            ((TextView)localObject3).setPadding(0, 0, 0, 0);
            if (t.mW(NormalUserFooterPreference.a(this.poT.poS.poR).field_username))
            {
              paramMenuItem = this.poT.poS.poR.mContext.getString(2131298855, new Object[] { NormalUserFooterPreference.a(this.poT.poS.poR).Oj() });
              label1314: ((TextView)localObject3).setText(paramMenuItem);
              localObject3 = (CheckBox)((View)localObject2).findViewById(2131825970);
              ((CheckBox)localObject3).setChecked(false);
              paramMenuItem = (TextView)((View)localObject2).findViewById(2131825971);
              paramMenuItem.setText(2131298597);
              if (NormalUserFooterPreference.a(this.poT.poS.poR).getSource() != 18)
                break label1536;
              ((CheckBox)localObject3).setVisibility(0);
              paramMenuItem.setVisibility(0);
            }
            while (true)
            {
              h.a(this.poT.poS.poR.mContext, true, this.poT.poS.poR.mContext.getString(2131298502), (View)localObject2, this.poT.poS.poR.mContext.getString(2131296881), this.poT.poS.poR.mContext.getString(2131296868), new NormalUserFooterPreference.a.1.1.2(this, (CheckBox)localObject3), null, 2131689665);
              AppMethodBeat.o(23674);
              break;
              paramMenuItem = this.poT.poS.poR.mContext.getString(2131298853, new Object[] { NormalUserFooterPreference.a(this.poT.poS.poR).Oj() });
              break label1314;
              label1536: ((CheckBox)localObject3).setVisibility(8);
              paramMenuItem.setVisibility(8);
            }
            paramMenuItem = this.poT.poS;
            ab.d("MicroMsg.NormalUserFooterPreference", "dealAddShortcut, username = " + NormalUserFooterPreference.a(paramMenuItem.poR).field_username);
            com.tencent.mm.plugin.base.model.b.aa(NormalUserFooterPreference.b(paramMenuItem.poR), NormalUserFooterPreference.a(paramMenuItem.poR).field_username);
            al.n(new NormalUserFooterPreference.a.10(paramMenuItem), 1000L);
            AppMethodBeat.o(23674);
          }
        }
      }
      NormalUserFooterPreference.a.c(this.poT.poS);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.profile.ui.NormalUserFooterPreference.a.1.1
 * JD-Core Version:    0.6.2
 */