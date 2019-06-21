package com.tencent.mm.plugin.qqmail.ui;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.az.k;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.kernel.b;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.messenger.foundation.a.a.i;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.plugin.qqmail.b.ac;
import com.tencent.mm.pluginsdk.ui.preference.HelperHeaderPreference;
import com.tencent.mm.sdk.e.n.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.preference.CheckBoxPreference;
import junit.framework.Assert;

public final class a
  implements com.tencent.mm.ai.f, com.tencent.mm.pluginsdk.b.a, n.b
{
  private static boolean pxC = false;
  private Context context;
  private ProgressDialog ehJ;
  private com.tencent.mm.ui.base.preference.f ehK;
  private ad ehM;
  private boolean enable;
  private ProgressDialog fsh;
  private boolean pli;
  private boolean pxB;

  public a(Context paramContext)
  {
    AppMethodBeat.i(68267);
    if (paramContext != null);
    for (boolean bool = true; ; bool = false)
    {
      Assert.assertTrue(bool);
      this.context = paramContext;
      AppMethodBeat.o(68267);
      return;
    }
  }

  private void biW()
  {
    boolean bool1 = true;
    AppMethodBeat.i(68270);
    label46: Object localObject;
    int i;
    if ((r.YK() & 0x1) == 0)
    {
      bool2 = true;
      this.enable = bool2;
      if (bo.h((Integer)g.RP().Ry().get(17, null)) != 1)
        break label317;
      bool2 = true;
      this.pxB = bool2;
      localObject = (HelperHeaderPreference)this.ehK.aqO("contact_info_header_helper");
      ((HelperHeaderPreference)localObject).ay(this.ehM.field_username, this.ehM.Oj(), this.context.getString(2131298628));
      if (!this.enable)
        break label322;
      i = 1;
      label103: ((HelperHeaderPreference)localObject).sd(i);
      this.ehK.ce("contact_info_qqmailhelper_install", this.enable);
      localObject = this.ehK;
      if (this.enable)
        break label328;
      bool2 = true;
      label138: ((com.tencent.mm.ui.base.preference.f)localObject).ce("contact_info_qqmailhelper_view", bool2);
      localObject = this.ehK;
      if (this.enable)
        break label333;
      bool2 = true;
      label161: ((com.tencent.mm.ui.base.preference.f)localObject).ce("contact_info_qqmailhelper_compose", bool2);
      localObject = (CheckBoxPreference)this.ehK.aqO("contact_info_qqmailhelper_recv_remind");
      if (localObject != null)
        ((CheckBoxPreference)localObject).uOT = this.pxB;
      localObject = this.ehK;
      if (this.enable)
        break label338;
      bool2 = true;
      label211: ((com.tencent.mm.ui.base.preference.f)localObject).ce("contact_info_qqmailhelper_recv_remind", bool2);
      localObject = this.ehK;
      if ((this.enable & this.pxB))
        break label343;
      bool2 = true;
      label239: ((com.tencent.mm.ui.base.preference.f)localObject).ce("contact_info_qqmailhelper_set_files_view", bool2);
      this.ehK.ce("contact_info_qqmailhelper_download_mgr_view", true);
      localObject = this.ehK;
      if (this.enable)
        break label348;
      bool2 = true;
      label274: ((com.tencent.mm.ui.base.preference.f)localObject).ce("contact_info_qqmailhelper_clear_data", bool2);
      localObject = this.ehK;
      if (this.enable)
        break label353;
    }
    label317: label322: label328: label333: label338: label343: label348: label353: for (boolean bool2 = bool1; ; bool2 = false)
    {
      ((com.tencent.mm.ui.base.preference.f)localObject).ce("contact_info_qqmailhelper_uninstall", bool2);
      AppMethodBeat.o(68270);
      return;
      bool2 = false;
      break;
      bool2 = false;
      break label46;
      i = 0;
      break label103;
      bool2 = false;
      break label138;
      bool2 = false;
      break label161;
      bool2 = false;
      break label211;
      bool2 = false;
      break label239;
      bool2 = false;
      break label274;
    }
  }

  private void jX(boolean paramBoolean)
  {
    AppMethodBeat.i(68271);
    if (paramBoolean);
    for (String str = this.context.getString(2131303213); ; str = this.context.getString(2131303221))
    {
      Context localContext = this.context;
      this.context.getString(2131297061);
      this.fsh = h.b(localContext, str, true, null);
      pxC = true;
      jY(paramBoolean);
      AppMethodBeat.o(68271);
      return;
    }
  }

  private boolean jY(boolean paramBoolean)
  {
    AppMethodBeat.i(68274);
    com.tencent.mm.plugin.qqmail.b.t localt = new com.tencent.mm.plugin.qqmail.b.t(paramBoolean, "");
    if (!pxC)
      this.ehJ = h.b(this.context, this.context.getString(2131297086), true, new a.4(this, localt));
    g.RO().eJo.a(localt, 0);
    AppMethodBeat.o(68274);
    return false;
  }

  public final boolean IO(String paramString)
  {
    boolean bool1 = false;
    boolean bool2 = true;
    AppMethodBeat.i(68268);
    ab.d("MicroMsg.ContactWidgetQQMail", "handleEvent : key = ".concat(String.valueOf(paramString)));
    if (bo.nullAsNil(paramString).length() <= 0)
    {
      AppMethodBeat.o(68268);
      bool1 = false;
    }
    while (true)
    {
      return bool1;
      if (paramString.equals("contact_info_qqmailhelper_view"))
      {
        paramString = new Intent();
        if (this.pli)
        {
          paramString.putExtra("Chat_User", this.ehM.field_username);
          paramString.putExtra("Chat_Mode", 1);
          paramString.addFlags(67108864);
          ((Activity)this.context).setResult(-1, paramString);
        }
        while (true)
        {
          ((Activity)this.context).finish();
          AppMethodBeat.o(68268);
          bool1 = bool2;
          break;
          paramString.putExtra("Chat_User", this.ehM.field_username);
          paramString.putExtra("Chat_Mode", 1);
          paramString.addFlags(67108864);
          com.tencent.mm.plugin.qqmail.a.a.gkE.d(paramString, this.context);
        }
      }
      if (paramString.equals("contact_info_qqmailhelper_compose"))
      {
        paramString = new Intent(this.context, ComposeUI.class);
        if (this.pli)
        {
          paramString.putExtra("Chat_User", this.ehM.field_username);
          paramString.addFlags(67108864);
          ((Activity)this.context).setResult(-1, paramString);
        }
        while (true)
        {
          ((Activity)this.context).finish();
          AppMethodBeat.o(68268);
          bool1 = bool2;
          break;
          paramString.putExtra("Chat_User", this.ehM.field_username);
          paramString.addFlags(67108864);
          this.context.startActivity(paramString);
        }
      }
      if (paramString.equals("contact_info_qqmailhelper_set_files_view"))
      {
        paramString = new Intent("android.intent.action.VIEW", Uri.parse(bo.nullAsNil((String)g.RP().Ry().get(29, null))));
        paramString.putExtra("title", this.context.getString(2131298627));
        paramString.putExtra("zoom", false);
        paramString.putExtra("show_bottom", false);
        paramString.putExtra("showShare", false);
        paramString.putExtra("vertical_scroll", false);
        com.tencent.mm.plugin.qqmail.a.a.gkE.i(paramString, this.context);
        AppMethodBeat.o(68268);
        bool1 = bool2;
      }
      else if (paramString.equals("contact_info_qqmailhelper_recv_remind"))
      {
        paramString = (CheckBoxPreference)this.ehK.aqO(paramString);
        boolean bool3 = paramString.isChecked();
        jY(bool3);
        if (!bool3)
          bool1 = true;
        paramString.uOT = bool1;
        AppMethodBeat.o(68268);
        bool1 = bool2;
      }
      else if (paramString.equals("contact_info_qqmailhelper_clear_data"))
      {
        h.a(this.context, this.context.getString(2131298493), "", new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            AppMethodBeat.i(68261);
            ac.ccE();
            AppMethodBeat.o(68261);
          }
        }
        , null);
        AppMethodBeat.o(68268);
        bool1 = bool2;
      }
      else if (paramString.equals("contact_info_qqmailhelper_install"))
      {
        if (bo.h((Integer)g.RP().Ry().get(9, null)) == 0)
        {
          h.b(this.context, 2131303355, new DialogInterface.OnClickListener()
          {
            public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
            {
              AppMethodBeat.i(68262);
              com.tencent.mm.plugin.qqmail.a.a.gkE.g(null, a.a(a.this));
              AppMethodBeat.o(68262);
            }
          }
          , null);
          AppMethodBeat.o(68268);
          bool1 = bool2;
        }
        else
        {
          jX(true);
          AppMethodBeat.o(68268);
          bool1 = bool2;
        }
      }
      else if (paramString.equals("contact_info_qqmailhelper_uninstall"))
      {
        h.d(this.context, this.context.getString(2131303217), "", this.context.getString(2131296871), this.context.getString(2131296868), new a.3(this), null);
        AppMethodBeat.o(68268);
        bool1 = bool2;
      }
      else
      {
        ab.e("MicroMsg.ContactWidgetQQMail", "handleEvent : unExpected key = ".concat(String.valueOf(paramString)));
        AppMethodBeat.o(68268);
        bool1 = false;
      }
    }
  }

  public final void a(int paramInt, com.tencent.mm.sdk.e.n paramn, Object paramObject)
  {
    AppMethodBeat.i(68273);
    int i = bo.g(paramObject, 0);
    ab.d("MicroMsg.ContactWidgetQQMail", "onNotifyChange event:%d obj:%d stg:%s", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(i), paramn });
    if ((paramn != g.RP().Ry()) || (i <= 0))
    {
      ab.e("MicroMsg.ContactWidgetQQMail", "onNotifyChange error obj:%d stg:%s", new Object[] { Integer.valueOf(i), paramn });
      AppMethodBeat.o(68273);
    }
    while (true)
    {
      return;
      if ((i != 17) && (i != 34) && (i != 7))
      {
        AppMethodBeat.o(68273);
      }
      else
      {
        biW();
        AppMethodBeat.o(68273);
      }
    }
  }

  public final boolean a(com.tencent.mm.ui.base.preference.f paramf, ad paramad, boolean paramBoolean, int paramInt)
  {
    boolean bool1 = false;
    AppMethodBeat.i(68269);
    if (paramf != null);
    for (boolean bool2 = true; ; bool2 = false)
    {
      Assert.assertTrue(bool2);
      bool2 = bool1;
      if (paramad != null)
        bool2 = true;
      Assert.assertTrue(bool2);
      Assert.assertTrue(com.tencent.mm.model.t.nc(paramad.field_username));
      g.RP().Ry().a(this);
      g.RO().eJo.a(24, this);
      this.pli = paramBoolean;
      this.ehM = paramad;
      this.ehK = paramf;
      paramf.addPreferencesFromResource(2131165218);
      biW();
      AppMethodBeat.o(68269);
      return true;
    }
  }

  public final boolean biV()
  {
    AppMethodBeat.i(68272);
    g.RP().Ry().b(this);
    g.RO().eJo.b(24, this);
    if (this.fsh != null)
    {
      this.fsh.dismiss();
      this.fsh = null;
    }
    if (this.ehJ != null)
    {
      this.ehJ.dismiss();
      this.ehJ = null;
    }
    AppMethodBeat.o(68272);
    return true;
  }

  public final void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ai.m paramm)
  {
    AppMethodBeat.i(68275);
    if (paramm.getType() != 24)
    {
      ab.w("MicroMsg.ContactWidgetQQMail", "onSceneEnd : unExpected type = " + paramm.getType());
      AppMethodBeat.o(68275);
    }
    boolean bool;
    while (true)
    {
      return;
      if (this.ehJ != null)
      {
        this.ehJ.dismiss();
        this.ehJ = null;
      }
      if (this.fsh != null)
      {
        this.fsh.dismiss();
        this.fsh = null;
      }
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        bool = ((com.tencent.mm.plugin.qqmail.b.t)paramm).cPT;
        paramString = g.RP().Ry();
        if (bool)
        {
          paramInt1 = 1;
          label119: paramString.set(17, Integer.valueOf(paramInt1));
          if ((pxC) && (bo.cv(this.context)))
          {
            if (bool)
              g.RP().Ry().set(17, Integer.valueOf(1));
            paramInt1 = r.YK();
            if (!bool)
              break label275;
            paramInt1 &= -2;
          }
        }
        while (true)
        {
          g.RP().Ry().set(34, Integer.valueOf(paramInt1));
          ((j)g.K(j.class)).XL().c(new k("", "", "", "", "", "", "", "", paramInt1, "", ""));
          com.tencent.mm.plugin.qqmail.a.a.gkF.BS();
          if (!bool)
            ac.ccE();
          pxC = false;
          AppMethodBeat.o(68275);
          break;
          paramInt1 = 2;
          break label119;
          label275: paramInt1 |= 1;
        }
      }
      bool = ((com.tencent.mm.plugin.qqmail.b.t)paramm).cPT;
      ab.e("MicroMsg.ContactWidgetQQMail", "NetSceneSwitchPushMail fail : errType = " + paramInt1 + ", errCode = " + paramInt2);
      if (paramInt1 != 4)
        break;
      switch (paramInt2)
      {
      default:
        AppMethodBeat.o(68275);
        break;
      case -31:
        ab.i("MicroMsg.ContactWidgetQQMail", "need second pass");
        paramString = View.inflate(this.context, 2130970575, null);
        paramm = (EditText)paramString.findViewById(2131827286);
        h.a(this.context, this.context.getString(2131298626), paramString, new a.5(this, bool, paramm));
        AppMethodBeat.o(68275);
      case -1:
      }
    }
    ab.w("MicroMsg.ContactWidgetQQMail", "onSceneEnd, sys err");
    if (pxC)
    {
      paramString = this.context;
      if (bool)
        paramInt1 = 2131303210;
    }
    label465: for (paramString = paramString.getString(paramInt1); ; paramString = this.context.getString(2131296905))
    {
      Toast.makeText(this.context, paramString, 1).show();
      pxC = false;
      AppMethodBeat.o(68275);
      break;
      paramInt1 = 2131303216;
      break label465;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.qqmail.ui.a
 * JD-Core Version:    0.6.2
 */