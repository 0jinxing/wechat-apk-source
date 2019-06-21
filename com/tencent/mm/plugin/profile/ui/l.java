package com.tencent.mm.plugin.profile.ui;

import android.content.Context;
import android.content.Intent;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.pluginsdk.b.a;
import com.tencent.mm.sdk.e.n;
import com.tencent.mm.sdk.e.n.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.preference.f;
import junit.framework.Assert;

abstract class l
  implements a, n.b
{
  protected Context context;
  protected f ehK;
  protected ad ehM;
  protected HelperHeaderPreference.a pnp;

  public l(Context paramContext, HelperHeaderPreference.a parama)
  {
    this.context = paramContext;
    this.pnp = parama;
  }

  private void biW()
  {
    this.ehK.removeAll();
    this.ehK.addPreferencesFromResource(2131165206);
    boolean bool = caZ();
    HelperHeaderPreference localHelperHeaderPreference = (HelperHeaderPreference)this.ehK.aqO("contact_info_header_helper");
    if (localHelperHeaderPreference != null)
      localHelperHeaderPreference.a(this.ehM, this.pnp);
    if (!bool)
    {
      this.ehK.aqP("contact_info_plugin_view");
      this.ehK.aqP("contact_info_plugin_clear_data");
      this.ehK.aqP("contact_info_plugin_uninstall");
    }
    while (true)
    {
      return;
      this.ehK.aqP("contact_info_plugin_install");
    }
  }

  public boolean IO(String paramString)
  {
    boolean bool;
    if ("contact_info_plugin_clear_data".equals(paramString))
    {
      h.d(this.context, this.context.getString(2131298491), "", this.context.getString(2131296871), this.context.getString(2131296868), new l.1(this), null);
      bool = true;
    }
    while (true)
    {
      return bool;
      if (paramString.equals("contact_info_plugin_install"))
      {
        jP(true);
        bool = true;
      }
      else if (paramString.equals("contact_info_plugin_uninstall"))
      {
        h.d(this.context, this.context.getString(2131303217), "", this.context.getString(2131296871), this.context.getString(2131296868), new l.2(this), null);
        bool = true;
      }
      else
      {
        ab.e("MicroMsg.ContactWidgetPlugin", "handleEvent : unexpected key = ".concat(String.valueOf(paramString)));
        bool = false;
      }
    }
  }

  public void a(int paramInt, n paramn, Object paramObject)
  {
    int i = bo.g(paramObject, 0);
    ab.d("MicroMsg.ContactWidgetPlugin", "onNotifyChange event:%d obj:%d stg:%s", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(i), paramn });
    aw.ZK();
    if ((paramn != c.Ry()) || (i <= 0))
      ab.e("MicroMsg.ContactWidgetPlugin", "onNotifyChange error obj:%d stg:%s", new Object[] { Integer.valueOf(i), paramn });
    while (true)
    {
      return;
      if ((i == 40) || (i == 34) || (i == 7))
        biW();
    }
  }

  public boolean a(f paramf, ad paramad, boolean paramBoolean, int paramInt)
  {
    boolean bool = false;
    if (paramad != null)
    {
      paramBoolean = true;
      Assert.assertTrue(paramBoolean);
      if (bo.nullAsNil(paramad.field_username).length() <= 0)
        break label77;
    }
    label77: for (paramBoolean = true; ; paramBoolean = false)
    {
      Assert.assertTrue(paramBoolean);
      paramBoolean = bool;
      if (paramf != null)
        paramBoolean = true;
      Assert.assertTrue(paramBoolean);
      aw.ZK();
      c.Ry().a(this);
      this.ehM = paramad;
      this.ehK = paramf;
      biW();
      return true;
      paramBoolean = false;
      break;
    }
  }

  public boolean biV()
  {
    aw.ZK();
    c.Ry().b(this);
    this.ehK.aqO("contact_info_header_helper");
    return true;
  }

  protected abstract boolean caZ();

  protected abstract void clear();

  protected abstract void jP(boolean paramBoolean);

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.profile.ui.l
 * JD-Core Version:    0.6.2
 */