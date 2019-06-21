package com.tencent.mm.plugin.qmessage.ui;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.model.aw;
import com.tencent.mm.platformtools.ae;
import com.tencent.mm.plugin.qmessage.a.b;
import com.tencent.mm.plugin.qmessage.a.d;
import com.tencent.mm.plugin.qmessage.a.e;
import com.tencent.mm.plugin.qmessage.a.g;
import com.tencent.mm.pluginsdk.ui.preference.NormalUserHeaderPreference;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.preference.Preference;
import java.util.HashSet;
import java.util.Set;
import junit.framework.Assert;

public final class a
  implements com.tencent.mm.ai.f, com.tencent.mm.pluginsdk.b.a
{
  Context context;
  private ProgressDialog ehJ;
  private com.tencent.mm.ui.base.preference.f ehK;
  private ad ehM;

  public a(Context paramContext)
  {
    this.context = paramContext;
  }

  private void biW()
  {
    AppMethodBeat.i(24100);
    d locald = g.cca().Vb(this.ehM.field_username);
    if ((locald == null) || (bo.nullAsNil(locald.getUsername()).length() <= 0))
    {
      ab.e("MicroMsg.ContactWidgetQContact", "updateProfile : Qcontact is null");
      AppMethodBeat.o(24100);
    }
    while (true)
    {
      return;
      if (bo.nullAsNil(locald.cbY()).length() <= 0)
        ab.e("MicroMsg.ContactWidgetQContact", "updateProfile: QContact extInfo is null");
      Preference localPreference1 = this.ehK.aqO("contact_info_qcontact_sex");
      Preference localPreference2 = this.ehK.aqO("contact_info_qcontact_age");
      Preference localPreference3 = this.ehK.aqO("contact_info_qcontact_birthday");
      Preference localPreference4 = this.ehK.aqO("contact_info_qcontact_address");
      a.a locala = new a.a(this, (byte)0);
      locala.parse(locald.cbY());
      if (localPreference1 != null)
        localPreference1.setSummary(locala.ccd());
      if (localPreference2 != null)
        localPreference2.setSummary(locala.cce());
      if (localPreference3 != null)
        localPreference3.setSummary(locala.ccg());
      if (localPreference4 != null)
        localPreference4.setSummary(locala.ccf());
      this.ehK.notifyDataSetChanged();
      AppMethodBeat.o(24100);
    }
  }

  public final boolean IO(String paramString)
  {
    return true;
  }

  public final boolean a(com.tencent.mm.ui.base.preference.f paramf, ad paramad, boolean paramBoolean, int paramInt)
  {
    boolean bool = false;
    AppMethodBeat.i(24099);
    if (paramf != null)
    {
      paramBoolean = true;
      Assert.assertTrue(paramBoolean);
      if (paramad == null)
        break label328;
      paramBoolean = true;
      label25: Assert.assertTrue(paramBoolean);
      Assert.assertTrue(ad.aow(paramad.field_username));
      aw.Rg().a(140, this);
      this.ehM = paramad;
      this.ehK = paramf;
      paramf.addPreferencesFromResource(2131165215);
      paramf = (NormalUserHeaderPreference)paramf.aqO("contact_info_header_normal");
      if (paramf != null)
      {
        paramf.vrj = "ContactWidgetQContact";
        paramf.a(paramad, 0, null);
      }
      biW();
      paramad = g.cca().Vb(this.ehM.field_username);
      if (paramad != null)
      {
        paramf = paramad;
        if (bo.nullAsNil(paramad.getUsername()).length() > 0);
      }
      else
      {
        ab.e("MicroMsg.ContactWidgetQContact", "getProfileOrNot: QContact is null, should not in this way");
        paramf = new d();
        paramf.username = this.ehM.field_username;
        paramf.bJt = -1;
        g.cca().a(paramf);
      }
      if (paramf.psK == 1)
      {
        paramad = this.ehM.field_username;
        if (bo.nullAsNil(paramf.cbY()).length() > 0)
          break label333;
      }
    }
    label328: label333: for (paramInt = 1; ; paramInt = 0)
    {
      paramBoolean = bool;
      if (bo.nullAsNil(paramad).length() > 0)
        paramBoolean = true;
      Assert.assertTrue(paramBoolean);
      paramf = new HashSet();
      paramf.add(paramad);
      paramad = new b(paramf);
      new ak().post(new a.1(this, paramad));
      if (paramInt != 0)
      {
        paramf = this.context;
        this.context.getString(2131297061);
        this.ehJ = h.b(paramf, this.context.getString(2131296966), true, new a.2(this, paramad));
      }
      AppMethodBeat.o(24099);
      return true;
      paramBoolean = false;
      break;
      paramBoolean = false;
      break label25;
    }
  }

  public final boolean biV()
  {
    AppMethodBeat.i(24101);
    aw.Rg().b(140, this);
    NormalUserHeaderPreference localNormalUserHeaderPreference = (NormalUserHeaderPreference)this.ehK.aqO("contact_info_header_normal");
    if (localNormalUserHeaderPreference != null)
      localNormalUserHeaderPreference.onDetach();
    AppMethodBeat.o(24101);
    return true;
  }

  public final void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    int i = 1;
    AppMethodBeat.i(24102);
    if (paramm.getType() != 140)
    {
      AppMethodBeat.o(24102);
      return;
    }
    if (this.ehJ != null)
    {
      this.ehJ.dismiss();
      this.ehJ = null;
      switch (paramInt1)
      {
      default:
        label68: i = 0;
      case 1:
      case 2:
      }
      while (true)
      {
        if (i == 0)
          break label185;
        AppMethodBeat.o(24102);
        break;
        if (!ae.ghN)
          break label68;
        Toast.makeText(this.context, this.context.getString(2131299945, new Object[] { Integer.valueOf(1), Integer.valueOf(paramInt2) }), 3000).show();
        continue;
        if (!ae.ghN)
          break label68;
        Toast.makeText(this.context, this.context.getString(2131299946, new Object[] { Integer.valueOf(2), Integer.valueOf(paramInt2) }), 3000).show();
      }
    }
    label185: if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      paramString = g.cca().Vb(this.ehM.field_username);
      if ((paramString != null) && (bo.nullAsNil(paramString.getUsername()).length() > 0))
        break label265;
      ab.e("MicroMsg.ContactWidgetQContact", "resetUpdateStatus: did not find this QContact, username = " + this.ehM.field_username);
    }
    while (true)
    {
      biW();
      AppMethodBeat.o(24102);
      break;
      label265: paramString.bJt = 8;
      paramString.psK = 0;
      if (!g.cca().a(this.ehM.field_username, paramString))
        ab.e("MicroMsg.ContactWidgetQContact", "resetUpdateStatus: update Qcontact failed, username = " + this.ehM.field_username);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.qmessage.ui.a
 * JD-Core Version:    0.6.2
 */