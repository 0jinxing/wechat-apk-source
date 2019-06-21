package com.tencent.mm.plugin.profile.ui;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.bv;
import com.tencent.mm.model.c;
import com.tencent.mm.model.r;
import com.tencent.mm.pluginsdk.b.a;
import com.tencent.mm.pluginsdk.model.app.p;
import com.tencent.mm.pluginsdk.ui.preference.HelperHeaderPreference;
import com.tencent.mm.sdk.e.n;
import com.tencent.mm.sdk.e.n.b;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.preference.CheckBoxPreference;
import com.tencent.mm.ui.base.preference.f;

public final class m
  implements a, n.b
{
  Context context;
  private f ehK;
  private ad ehM;
  private boolean enable;

  public m(Context paramContext)
  {
    this.context = paramContext;
  }

  private void biW()
  {
    boolean bool1 = true;
    AppMethodBeat.i(23600);
    this.enable = r.YU();
    Object localObject = (HelperHeaderPreference)this.ehK.aqO("contact_info_header_helper");
    ((HelperHeaderPreference)localObject).ay(this.ehM.field_username, this.ehM.Oj(), this.context.getString(2131298633));
    int i;
    if (this.enable)
    {
      i = 1;
      ((HelperHeaderPreference)localObject).sd(i);
      localObject = this.ehK;
      if (this.enable)
        break label173;
      bool2 = true;
      label86: ((f)localObject).ce("contact_info_go_to_sync", bool2);
      localObject = this.ehK;
      if (this.enable)
        break label179;
      bool2 = true;
      label111: ((f)localObject).ce("contact_info_remind_me_syncing_tip", bool2);
      this.ehK.ce("contact_info_qqsync_install", this.enable);
      localObject = this.ehK;
      if (this.enable)
        break label185;
    }
    label173: label179: label185: for (boolean bool2 = bool1; ; bool2 = false)
    {
      ((f)localObject).ce("contact_info_qqsync_uninstall", bool2);
      AppMethodBeat.o(23600);
      return;
      i = 0;
      break;
      bool2 = false;
      break label86;
      bool2 = false;
      break label111;
    }
  }

  public final boolean IO(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(23595);
    if (bo.nullAsNil(paramString).length() <= 0)
      AppMethodBeat.o(23595);
    while (true)
    {
      return bool;
      if ("contact_info_go_to_sync".equals(paramString))
      {
        if (p.u(this.context, "com.tencent.qqpim"))
        {
          paramString = this.context.getPackageManager().getLaunchIntentForPackage("com.tencent.qqpim");
          paramString.addFlags(268435456);
          this.context.startActivity(paramString);
        }
        while (true)
        {
          AppMethodBeat.o(23595);
          bool = true;
          break;
          h.a(this.context, 2131298631, 2131297061, 2131296887, 2131296868, new m.2(this), null);
        }
      }
      if ("contact_info_remind_me_syncing".equals(paramString))
      {
        paramString = (CheckBoxPreference)this.ehK.aqO("contact_info_remind_me_syncing");
        aw.ZK();
        c.Ry().set(65792, Boolean.valueOf(paramString.isChecked()));
        if (paramString.isChecked());
        for (paramString = "1"; ; paramString = "2")
        {
          bv.s(6, paramString);
          AppMethodBeat.o(23595);
          bool = true;
          break;
        }
      }
      if (paramString.equals("contact_info_qqsync_install"))
      {
        s(this.context, true);
        AppMethodBeat.o(23595);
        bool = true;
      }
      else if (paramString.equals("contact_info_qqsync_uninstall"))
      {
        h.d(this.context, this.context.getString(2131303217), "", this.context.getString(2131296871), this.context.getString(2131296868), new m.1(this), null);
        AppMethodBeat.o(23595);
        bool = true;
      }
      else
      {
        AppMethodBeat.o(23595);
      }
    }
  }

  public final void a(int paramInt, n paramn, Object paramObject)
  {
    AppMethodBeat.i(23599);
    if (this.enable != r.YU())
      biW();
    AppMethodBeat.o(23599);
  }

  public final boolean a(f paramf, ad paramad, boolean paramBoolean, int paramInt)
  {
    AppMethodBeat.i(23597);
    aw.ZK();
    c.Ry().a(this);
    this.ehK = paramf;
    this.ehM = paramad;
    paramf.addPreferencesFromResource(2131165219);
    biW();
    AppMethodBeat.o(23597);
    return true;
  }

  public final boolean biV()
  {
    AppMethodBeat.i(23598);
    aw.ZK();
    c.Ry().b(this);
    AppMethodBeat.o(23598);
    return true;
  }

  public final void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
  }

  final void s(Context paramContext, boolean paramBoolean)
  {
    AppMethodBeat.i(23596);
    if (paramBoolean);
    for (String str = paramContext.getString(2131303213); ; str = paramContext.getString(2131303221))
    {
      paramContext.getString(2131297061);
      paramContext = h.b(paramContext, str, true, null);
      aw.RS().aa(new m.3(this, paramBoolean, paramContext));
      AppMethodBeat.o(23596);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.profile.ui.m
 * JD-Core Version:    0.6.2
 */