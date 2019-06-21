package com.tencent.mm.plugin.profile.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.az.g;
import com.tencent.mm.bp.d;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.model.r;
import com.tencent.mm.model.t;
import com.tencent.mm.plugin.account.friend.a.l;
import com.tencent.mm.plugin.account.friend.a.l.a;
import com.tencent.mm.plugin.messenger.foundation.a.a.i;
import com.tencent.mm.pluginsdk.b.a;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.pluginsdk.n;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.p;
import com.tencent.mm.ui.base.preference.CheckBoxPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.f;
import junit.framework.Assert;

public final class e
  implements a
{
  Context context;
  private f ehK;
  private ad ehM;
  boolean isDeleteCancel;
  private boolean pli;
  private HelperHeaderPreference.a pmQ;
  private int status;
  p tipDialog;

  public e(Context paramContext)
  {
    AppMethodBeat.i(23504);
    this.tipDialog = null;
    this.isDeleteCancel = false;
    this.context = paramContext;
    this.pmQ = new o(paramContext);
    this.status = -1;
    AppMethodBeat.o(23504);
  }

  private boolean Be(int paramInt)
  {
    if ((this.status & paramInt) != 0);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  private void e(boolean paramBoolean, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(23506);
    ab.d("MicroMsg.ContactWidgetFMessage", "switch change : open = " + paramBoolean + " item value = " + paramInt1 + " functionId = " + paramInt2);
    if (paramBoolean)
    {
      this.status |= paramInt1;
      aw.ZK();
      c.Ry().set(7, Integer.valueOf(this.status));
      if (!paramBoolean)
        break label127;
    }
    label127: for (paramInt1 = 1; ; paramInt1 = 2)
    {
      aw.ZK();
      c.XL().c(new g(paramInt2, paramInt1));
      AppMethodBeat.o(23506);
      return;
      this.status &= (paramInt1 ^ 0xFFFFFFFF);
      break;
    }
  }

  public final boolean IO(String paramString)
  {
    boolean bool1 = false;
    boolean bool2 = true;
    AppMethodBeat.i(23505);
    ab.d("MicroMsg.ContactWidgetFMessage", "handlerEvent : key = ".concat(String.valueOf(paramString)));
    if (bo.nullAsNil(paramString).length() <= 0)
    {
      AppMethodBeat.o(23505);
      bool1 = false;
    }
    while (true)
    {
      return bool1;
      if (paramString.equals("contact_info_recommend_qqfriends_to_me"))
      {
        if (!((CheckBoxPreference)this.ehK.aqO("contact_info_recommend_qqfriends_to_me")).isChecked());
        for (bool1 = true; ; bool1 = false)
        {
          e(bool1, 128, 6);
          AppMethodBeat.o(23505);
          bool1 = bool2;
          break;
        }
      }
      if (paramString.equals("contact_info_recommend_mobilefriends_to_me"))
      {
        if (!((CheckBoxPreference)this.ehK.aqO("contact_info_recommend_mobilefriends_to_me")).isChecked())
          bool1 = true;
        e(bool1, 256, 7);
        AppMethodBeat.o(23505);
        bool1 = bool2;
      }
      else
      {
        if (paramString.equals("contact_info_recommend_fbfriends_to_me"))
        {
          bool1 = ((CheckBoxPreference)this.ehK.aqO("contact_info_recommend_fbfriends_to_me")).isChecked();
          ab.d("MicroMsg.ContactWidgetFMessage", "switch change : open = " + bool1 + " item value = 4 functionId = 18");
          int i = r.YF();
          if (bool1)
          {
            i |= 4;
            label221: aw.ZK();
            c.Ry().set(40, Integer.valueOf(i));
            if (!bool1)
              break label289;
          }
          label289: for (i = 1; ; i = 2)
          {
            aw.ZK();
            c.XL().c(new g(18, i));
            AppMethodBeat.o(23505);
            bool1 = bool2;
            break;
            i &= -5;
            break label221;
          }
        }
        if (paramString.equals("contact_info_view_message"))
        {
          paramString = new Intent();
          if (this.pli)
          {
            paramString.putExtra("Chat_User", this.ehM.field_username);
            paramString.putExtra("Chat_Mode", 1);
            paramString.addFlags(67108864);
            ((Activity)this.context).setResult(-1, paramString);
            ((Activity)this.context).finish();
          }
          while (true)
          {
            AppMethodBeat.o(23505);
            bool1 = bool2;
            break;
            paramString.putExtra("Chat_User", this.ehM.field_username);
            paramString.putExtra("Chat_Mode", 1);
            paramString.addFlags(67108864);
            com.tencent.mm.plugin.profile.b.gkE.d(paramString, this.context);
            ((Activity)this.context).finish();
          }
        }
        if (paramString.equals("contact_info_bind_mobile_entry"))
        {
          com.tencent.mm.plugin.profile.b.gkE.f(new Intent(), this.context);
          AppMethodBeat.o(23505);
          bool1 = bool2;
        }
        else if (paramString.equals("contact_info_bind_qq_entry"))
        {
          com.tencent.mm.plugin.profile.b.gkE.g(new Intent(), this.context);
          AppMethodBeat.o(23505);
          bool1 = bool2;
        }
        else if (paramString.equals("contact_info_bind_fb_entry"))
        {
          d.b(this.context, "account", ".ui.FacebookAuthUI", new Intent());
          AppMethodBeat.o(23505);
          bool1 = bool2;
        }
        else if (paramString.equals("contact_info_fmessage_clear_data"))
        {
          h.d(this.context, this.context.getString(2131298491), "", this.context.getString(2131296871), this.context.getString(2131296868), new e.1(this), null);
          AppMethodBeat.o(23505);
          bool1 = bool2;
        }
        else
        {
          ab.e("MicroMsg.ContactWidgetFMessage", "handleEvent : unExpected key = ".concat(String.valueOf(paramString)));
          AppMethodBeat.o(23505);
          bool1 = false;
        }
      }
    }
  }

  public final boolean a(f paramf, ad paramad, boolean paramBoolean, int paramInt)
  {
    int i = 0;
    AppMethodBeat.i(23507);
    boolean bool;
    label28: CheckBoxPreference localCheckBoxPreference1;
    CheckBoxPreference localCheckBoxPreference2;
    CheckBoxPreference localCheckBoxPreference3;
    if (paramf != null)
    {
      bool = true;
      Assert.assertTrue(bool);
      if (paramad == null)
        break label373;
      bool = true;
      Assert.assertTrue(bool);
      Assert.assertTrue(t.nd(paramad.field_username));
      this.ehK = paramf;
      this.pli = paramBoolean;
      this.ehM = paramad;
      if (this.status == -1)
        this.status = r.YD();
      paramf.addPreferencesFromResource(2131165207);
      localCheckBoxPreference1 = (CheckBoxPreference)paramf.aqO("contact_info_recommend_qqfriends_to_me");
      localCheckBoxPreference2 = (CheckBoxPreference)paramf.aqO("contact_info_recommend_mobilefriends_to_me");
      localCheckBoxPreference3 = (CheckBoxPreference)paramf.aqO("contact_info_recommend_fbfriends_to_me");
      if (Be(256))
        break label379;
      paramBoolean = true;
      label133: localCheckBoxPreference2.uOT = paramBoolean;
      if (Be(128))
        break label384;
      paramBoolean = true;
      label151: localCheckBoxPreference1.uOT = paramBoolean;
      if ((r.YF() & 0x4) == 0)
        break label389;
      paramBoolean = true;
      label167: localCheckBoxPreference3.uOT = paramBoolean;
      ((HelperHeaderPreference)paramf.aqO("contact_info_header_helper")).a(paramad, this.pmQ);
      aw.ZK();
      if (bo.h((Integer)c.Ry().get(9, null)) == 0)
        break label394;
      paramInt = 1;
      label218: if (paramInt == 0)
        break label400;
      paramf.d(paramf.aqO("contact_info_bind_qq_entry"));
      paramf.d(paramf.aqO("contact_info_bind_qq_entry_tip"));
      label254: if (l.apS() != l.a.gvz)
        break label449;
      paramInt = 1;
      label266: if (paramInt == 0)
        break label455;
      paramf.d(paramf.aqO("contact_info_bind_mobile_entry"));
      paramf.d(paramf.aqO("contact_info_bind_mobile_entry_tip"));
      label302: paramInt = i;
      if ((r.YK() & 0x2000) == 0)
        paramInt = 1;
      if (paramInt == 0)
        break label498;
      paramBoolean = r.Za();
      com.tencent.mm.au.b.ahN();
      paramf.d(localCheckBoxPreference3);
      if (paramBoolean)
        break label481;
      paramf.aqO("contact_info_bind_fb_entry").setSummary(2131303052);
    }
    while (true)
    {
      AppMethodBeat.o(23507);
      return true;
      bool = false;
      break;
      label373: bool = false;
      break label28;
      label379: paramBoolean = false;
      break label133;
      label384: paramBoolean = false;
      break label151;
      label389: paramBoolean = false;
      break label167;
      label394: paramInt = 0;
      break label218;
      label400: paramf.d(localCheckBoxPreference1);
      if (com.tencent.mm.au.b.ahM())
        break label254;
      paramf.d(paramf.aqO("contact_info_bind_qq_entry"));
      paramf.d(paramf.aqO("contact_info_bind_qq_entry_tip"));
      break label254;
      label449: paramInt = 0;
      break label266;
      label455: paramf.d(localCheckBoxPreference2);
      paramf.aqO("contact_info_bind_mobile_entry").setSummary(2131303052);
      break label302;
      label481: paramf.aqO("contact_info_bind_fb_entry").setSummary(2131298518);
      continue;
      label498: paramf.d(paramf.aqO("contact_info_bind_fb_entry"));
      paramf.d(paramf.aqO("contact_info_bind_fb_entry_tip"));
      paramf.d(localCheckBoxPreference3);
    }
  }

  public final boolean biV()
  {
    AppMethodBeat.i(23508);
    com.tencent.mm.plugin.profile.b.gkF.BS();
    this.ehK.aqO("contact_info_header_helper");
    AppMethodBeat.o(23508);
    return true;
  }

  public final void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.profile.ui.e
 * JD-Core Version:    0.6.2
 */