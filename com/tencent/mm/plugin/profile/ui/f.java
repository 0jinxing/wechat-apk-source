package com.tencent.mm.plugin.profile.ui;

import android.content.Context;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.model.r;
import com.tencent.mm.model.t;
import com.tencent.mm.plugin.account.ui.FacebookFriendUI;
import com.tencent.mm.pluginsdk.b.a;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.sdk.e.n;
import com.tencent.mm.sdk.e.n.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.be;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.p;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.PreferenceCategory;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;
import junit.framework.Assert;

public final class f
  implements a, n.b
{
  Context context;
  private com.tencent.mm.ui.base.preference.f ehK;
  private ad ehM;
  private Map<String, Preference> gAX;
  private HelperHeaderPreference.a pmS;

  public f(Context paramContext)
  {
    AppMethodBeat.i(23512);
    this.gAX = new HashMap();
    this.context = paramContext;
    this.pmS = new q(paramContext);
    aw.ZK();
    c.XR().apb("facebookapp");
    AppMethodBeat.o(23512);
  }

  private void biW()
  {
    AppMethodBeat.i(23516);
    this.ehK.removeAll();
    Object localObject;
    if (this.gAX.containsKey("contact_info_header_helper"))
    {
      localObject = (HelperHeaderPreference)this.gAX.get("contact_info_header_helper");
      ((HelperHeaderPreference)localObject).a(this.ehM, this.pmS);
      this.ehK.b((Preference)localObject);
    }
    if (this.gAX.containsKey("contact_info_facebookapp_cat"))
      this.ehK.b((Preference)this.gAX.get("contact_info_facebookapp_cat"));
    if (!isOpen())
    {
      if (this.gAX.containsKey("contact_info_facebookapp_install"))
        this.ehK.b((Preference)this.gAX.get("contact_info_facebookapp_install"));
      AppMethodBeat.o(23516);
      return;
    }
    if (!r.Za())
      if (this.gAX.containsKey("contact_info_facebookapp_connect"))
        this.ehK.b((Preference)this.gAX.get("contact_info_facebookapp_connect"));
    while (true)
    {
      if (this.gAX.containsKey("contact_info_facebookapp_cat2"))
        this.ehK.b((Preference)this.gAX.get("contact_info_facebookapp_cat2"));
      if (this.gAX.containsKey("contact_info_facebookapp_uninstall"))
        this.ehK.b((Preference)this.gAX.get("contact_info_facebookapp_uninstall"));
      AppMethodBeat.o(23516);
      break;
      com.tencent.mm.au.b.ahN();
      if (this.gAX.containsKey("contact_info_facebookapp_addr"))
      {
        this.ehK.b((Preference)this.gAX.get("contact_info_facebookapp_addr"));
        localObject = (Preference)this.gAX.get("contact_info_facebookapp_addr");
        aw.ZK();
        ((Preference)localObject).setSummary((String)c.Ry().get(65826, null));
      }
    }
  }

  private static boolean isOpen()
  {
    AppMethodBeat.i(23515);
    boolean bool;
    if ((r.YK() & 0x2000) == 0)
    {
      bool = true;
      AppMethodBeat.o(23515);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(23515);
    }
  }

  public static void u(Context paramContext, boolean paramBoolean)
  {
    AppMethodBeat.i(23517);
    if (paramBoolean);
    for (Object localObject = paramContext.getString(2131303213); ; localObject = paramContext.getString(2131303221))
    {
      paramContext.getString(2131297061);
      localObject = h.b(paramContext, (String)localObject, true, null);
      paramContext = new f.2(paramBoolean);
      new Timer().schedule(new f.3((p)localObject, paramContext), 1500L);
      AppMethodBeat.o(23517);
      return;
    }
  }

  public final boolean IO(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(23513);
    ab.d("MicroMsg.ContactWidgetFacebookapp", "handleEvent : key = ".concat(String.valueOf(paramString)));
    if (bo.nullAsNil(paramString).length() <= 0)
      AppMethodBeat.o(23513);
    while (true)
    {
      return bool;
      if (paramString.equals("contact_info_facebookapp_install"))
      {
        u(this.context, true);
        AppMethodBeat.o(23513);
        bool = true;
      }
      else if (paramString.equals("contact_info_facebookapp_uninstall"))
      {
        h.d(this.context, this.context.getString(2131303217), "", this.context.getString(2131296871), this.context.getString(2131296868), new f.1(this), null);
        AppMethodBeat.o(23513);
        bool = true;
      }
      else if (paramString.equals("contact_info_facebookapp_listfriend"))
      {
        paramString = new Intent(this.context, FacebookFriendUI.class);
        this.context.startActivity(paramString);
        AppMethodBeat.o(23513);
        bool = true;
      }
      else if (paramString.equals("contact_info_facebookapp_connect"))
      {
        d.b(this.context, "account", ".ui.FacebookAuthUI", new Intent());
        AppMethodBeat.o(23513);
        bool = true;
      }
      else if (paramString.equals("contact_info_facebookapp_addr"))
      {
        d.b(this.context, "account", ".ui.FacebookAuthUI", new Intent());
        AppMethodBeat.o(23513);
        bool = true;
      }
      else
      {
        ab.e("MicroMsg.ContactWidgetFacebookapp", "handleEvent : unExpected key = ".concat(String.valueOf(paramString)));
        AppMethodBeat.o(23513);
      }
    }
  }

  public final void a(int paramInt, n paramn, Object paramObject)
  {
    AppMethodBeat.i(23519);
    int i = bo.g(paramObject, 0);
    ab.d("MicroMsg.ContactWidgetFacebookapp", "onNotifyChange event:%d obj:%d stg:%s", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(i), paramn });
    aw.ZK();
    if ((paramn != c.Ry()) || (i <= 0))
    {
      ab.e("MicroMsg.ContactWidgetFacebookapp", "onNotifyChange error obj:%d stg:%s", new Object[] { Integer.valueOf(i), paramn });
      AppMethodBeat.o(23519);
    }
    while (true)
    {
      return;
      if ((i != 40) && (i != 34) && (i != 65825))
      {
        AppMethodBeat.o(23519);
      }
      else
      {
        biW();
        AppMethodBeat.o(23519);
      }
    }
  }

  public final boolean a(com.tencent.mm.ui.base.preference.f paramf, ad paramad, boolean paramBoolean, int paramInt)
  {
    boolean bool = false;
    AppMethodBeat.i(23514);
    if (paramf != null);
    for (paramBoolean = true; ; paramBoolean = false)
    {
      Assert.assertTrue(paramBoolean);
      paramBoolean = bool;
      if (paramad != null)
        paramBoolean = true;
      Assert.assertTrue(paramBoolean);
      Assert.assertTrue(t.nh(paramad.field_username));
      aw.ZK();
      c.Ry().a(this);
      this.ehM = paramad;
      this.ehK = paramf;
      paramf.addPreferencesFromResource(2131165205);
      paramad = paramf.aqO("contact_info_header_helper");
      if (paramad != null)
        this.gAX.put("contact_info_header_helper", paramad);
      paramad = paramf.aqO("contact_info_facebookapp_listfriend");
      if (paramad != null)
        this.gAX.put("contact_info_facebookapp_listfriend", paramad);
      paramad = paramf.aqO("contact_info_facebookapp_connect");
      if (paramad != null)
        this.gAX.put("contact_info_facebookapp_connect", paramad);
      paramad = (PreferenceCategory)paramf.aqO("contact_info_facebookapp_cat");
      if (paramad != null)
        this.gAX.put("contact_info_facebookapp_cat", paramad);
      paramad = paramf.aqO("contact_info_facebookapp_addr");
      if (paramad != null)
        this.gAX.put("contact_info_facebookapp_addr", paramad);
      paramad = (PreferenceCategory)paramf.aqO("contact_info_facebookapp_cat2");
      if (paramad != null)
        this.gAX.put("contact_info_facebookapp_cat2", paramad);
      paramad = paramf.aqO("contact_info_facebookapp_install");
      if (paramad != null)
        this.gAX.put("contact_info_facebookapp_install", paramad);
      paramf = paramf.aqO("contact_info_facebookapp_uninstall");
      if (paramf != null)
        this.gAX.put("contact_info_facebookapp_uninstall", paramf);
      biW();
      AppMethodBeat.o(23514);
      return true;
    }
  }

  public final boolean biV()
  {
    AppMethodBeat.i(23518);
    aw.ZK();
    c.Ry().b(this);
    this.gAX.get("contact_info_header_helper");
    com.tencent.mm.plugin.profile.b.gkF.BS();
    AppMethodBeat.o(23518);
    return true;
  }

  public final void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.profile.ui.f
 * JD-Core Version:    0.6.2
 */