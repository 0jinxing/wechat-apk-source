package com.tencent.mm.plugin.profile.ui;

import android.content.Context;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.pluginsdk.b.a;
import com.tencent.mm.pluginsdk.n;
import com.tencent.mm.pluginsdk.ui.e.j;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.preference.KeyValuePreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.f;
import com.tencent.mm.ui.e.b;
import junit.framework.Assert;

public final class d
  implements a
{
  private final Context context;
  private f ehK;
  private ad ehM;
  com.tencent.mm.plugin.profile.a.b pkh;

  public d(Context paramContext)
  {
    this.context = paramContext;
  }

  public final boolean IO(String paramString)
  {
    AppMethodBeat.i(23499);
    if (paramString.equals("contact_profile_say_hi"))
    {
      paramString = new Intent();
      paramString.putExtra("Contact_User", this.ehM.field_username);
      paramString.putExtra("Contact_Scene", 25);
      paramString.putExtra(e.b.yfT, this.ehM.dus);
      com.tencent.mm.plugin.profile.b.gkE.a(paramString, this.context);
    }
    AppMethodBeat.o(23499);
    return true;
  }

  public final boolean a(f paramf, ad paramad, boolean paramBoolean, int paramInt)
  {
    AppMethodBeat.i(23500);
    boolean bool;
    label34: label46: Object localObject;
    if (paramad != null)
    {
      bool = true;
      Assert.assertTrue(bool);
      if (bo.nullAsNil(paramad.field_username).length() <= 0)
        break label292;
      bool = true;
      Assert.assertTrue(bool);
      if (paramf == null)
        break label298;
      bool = true;
      Assert.assertTrue(bool);
      this.ehM = paramad;
      ((MMActivity)this.context).getIntent().putExtra("Contact_Scene", 25);
      if (this.pkh == null)
        this.pkh = new com.tencent.mm.plugin.profile.a.b((MMActivity)this.context, paramad);
      biV();
      this.ehK = paramf;
      paramf.removeAll();
      paramf.addPreferencesFromResource(2131165203);
      localObject = (NormalProfileHeaderPreference)paramf.aqO("contact_info_header_normal");
      if (localObject != null)
      {
        ((NormalProfileHeaderPreference)localObject).iFE = paramf;
        ((NormalProfileHeaderPreference)localObject).a(paramad, 25, paramBoolean, null);
      }
      localObject = (KeyValuePreference)paramf.aqO("contact_info_signature");
      if ((paramad.signature == null) || (paramad.signature.trim().equals("")))
        break label304;
      if (localObject != null)
      {
        ((KeyValuePreference)localObject).yCj = false;
        ((KeyValuePreference)localObject).setTitle(this.context.getString(2131298678));
        ((KeyValuePreference)localObject).setSummary(j.b(this.context, paramad.signature));
        ((KeyValuePreference)localObject).qi(false);
        ((KeyValuePreference)localObject).NW(8);
      }
    }
    while (true)
    {
      ((MultiButtonPreference)paramf.aqO("contact_profile_multi_button")).a(this.context.getString(2131297652), new d.1(this));
      AppMethodBeat.o(23500);
      return true;
      bool = false;
      break;
      label292: bool = false;
      break label34;
      label298: bool = false;
      break label46;
      label304: paramf.d((Preference)localObject);
    }
  }

  public final boolean biV()
  {
    AppMethodBeat.i(23501);
    if (this.ehK == null)
      AppMethodBeat.o(23501);
    while (true)
    {
      return true;
      NormalProfileHeaderPreference localNormalProfileHeaderPreference = (NormalProfileHeaderPreference)this.ehK.aqO("contact_info_header_normal");
      if (localNormalProfileHeaderPreference != null)
        localNormalProfileHeaderPreference.onDetach();
      AppMethodBeat.o(23501);
    }
  }

  public final void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.profile.ui.d
 * JD-Core Version:    0.6.2
 */