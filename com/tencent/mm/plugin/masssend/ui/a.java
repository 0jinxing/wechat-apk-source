package com.tencent.mm.plugin.masssend.ui;

import android.content.Context;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.model.r;
import com.tencent.mm.model.t;
import com.tencent.mm.plugin.masssend.a.b;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.pluginsdk.ui.preference.HelperHeaderPreference;
import com.tencent.mm.sdk.e.n;
import com.tencent.mm.sdk.e.n.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.be;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.f;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;
import junit.framework.Assert;

public final class a
  implements com.tencent.mm.pluginsdk.b.a, n.b
{
  Context context;
  private f ehK;
  private ad ehM;
  private Map<String, Preference> gAX;

  public a(Context paramContext)
  {
    AppMethodBeat.i(22758);
    this.gAX = new HashMap();
    this.context = paramContext;
    AppMethodBeat.o(22758);
  }

  private void biW()
  {
    boolean bool1 = true;
    AppMethodBeat.i(22762);
    boolean bool2 = isOpen();
    Object localObject = (HelperHeaderPreference)this.ehK.aqO("contact_info_masssend_header_helper");
    ((HelperHeaderPreference)localObject).ay(this.ehM.field_username, this.ehM.Oj(), this.context.getString(2131298580));
    int i;
    if (bool2)
    {
      i = 1;
      ((HelperHeaderPreference)localObject).sd(i);
      this.ehK.ce("contact_info_masssend_install", bool2);
      localObject = this.ehK;
      if (bool2)
        break label158;
      bool3 = true;
      label91: ((f)localObject).ce("contact_info_masssend_view", bool3);
      localObject = this.ehK;
      if (bool2)
        break label164;
      bool3 = true;
      label113: ((f)localObject).ce("contact_info_masssend_clear_data", bool3);
      localObject = this.ehK;
      if (bool2)
        break label170;
    }
    label158: label164: label170: for (boolean bool3 = bool1; ; bool3 = false)
    {
      ((f)localObject).ce("contact_info_masssend_uninstall", bool3);
      AppMethodBeat.o(22762);
      return;
      i = 0;
      break;
      bool3 = false;
      break label91;
      bool3 = false;
      break label113;
    }
  }

  public static void clearData()
  {
    AppMethodBeat.i(22764);
    b localb = com.tencent.mm.plugin.masssend.a.h.bNE();
    if (localb.fni.hY("massendinfo", "delete from massendinfo"))
      localb.doNotify();
    aw.ZK();
    c.XR().aoX("masssendapp");
    AppMethodBeat.o(22764);
  }

  private static boolean isOpen()
  {
    AppMethodBeat.i(22760);
    boolean bool;
    if ((r.YK() & 0x10000) == 0)
    {
      bool = true;
      AppMethodBeat.o(22760);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(22760);
    }
  }

  public static void u(Context paramContext, boolean paramBoolean)
  {
    AppMethodBeat.i(22763);
    if (paramBoolean);
    for (Object localObject = paramContext.getString(2131303213); ; localObject = paramContext.getString(2131303221))
    {
      paramContext.getString(2131297061);
      paramContext = com.tencent.mm.ui.base.h.b(paramContext, (String)localObject, true, null);
      localObject = new a.3(paramBoolean);
      new Timer().schedule(new a.4(paramContext, (ak)localObject), 1500L);
      AppMethodBeat.o(22763);
      return;
    }
  }

  public final boolean IO(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(22759);
    ab.d("MicroMsg.ContactWidgetMassSend", "handleEvent : key = ".concat(String.valueOf(paramString)));
    if (bo.nullAsNil(paramString).length() <= 0)
      AppMethodBeat.o(22759);
    while (true)
    {
      return bool;
      if (paramString.equals("contact_info_masssend_view"))
      {
        paramString = new Intent(this.context, MassSendHistoryUI.class);
        this.context.startActivity(paramString);
        AppMethodBeat.o(22759);
        bool = true;
      }
      else if (paramString.equals("contact_info_masssend_clear_data"))
      {
        com.tencent.mm.ui.base.h.d(this.context, this.context.getString(2131298491), "", this.context.getString(2131296871), this.context.getString(2131296868), new a.1(this), null);
        AppMethodBeat.o(22759);
        bool = true;
      }
      else if (paramString.equals("contact_info_masssend_install"))
      {
        u(this.context, true);
        AppMethodBeat.o(22759);
        bool = true;
      }
      else if (paramString.equals("contact_info_masssend_uninstall"))
      {
        com.tencent.mm.ui.base.h.d(this.context, this.context.getString(2131303217), "", this.context.getString(2131296871), this.context.getString(2131296868), new a.2(this), null);
        AppMethodBeat.o(22759);
        bool = true;
      }
      else
      {
        ab.e("MicroMsg.ContactWidgetMassSend", "handleEvent : unExpected key = ".concat(String.valueOf(paramString)));
        AppMethodBeat.o(22759);
      }
    }
  }

  public final void a(int paramInt, n paramn, Object paramObject)
  {
    AppMethodBeat.i(22766);
    int i = bo.g(paramObject, 0);
    ab.d("MicroMsg.ContactWidgetMassSend", "onNotifyChange event:%d obj:%d stg:%s", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(i), paramn });
    aw.ZK();
    if ((paramn != c.Ry()) || (i <= 0))
    {
      ab.e("MicroMsg.ContactWidgetMassSend", "onNotifyChange error obj:%d stg:%s", new Object[] { Integer.valueOf(i), paramn });
      AppMethodBeat.o(22766);
    }
    while (true)
    {
      return;
      if ((i != 40) && (i != 34) && (i != 7))
      {
        AppMethodBeat.o(22766);
      }
      else
      {
        biW();
        AppMethodBeat.o(22766);
      }
    }
  }

  public final boolean a(f paramf, ad paramad, boolean paramBoolean, int paramInt)
  {
    boolean bool = false;
    AppMethodBeat.i(22761);
    if (paramf != null);
    for (paramBoolean = true; ; paramBoolean = false)
    {
      Assert.assertTrue(paramBoolean);
      paramBoolean = bool;
      if (paramad != null)
        paramBoolean = true;
      Assert.assertTrue(paramBoolean);
      Assert.assertTrue(t.ni(paramad.field_username));
      aw.ZK();
      c.Ry().a(this);
      this.ehM = paramad;
      this.ehK = paramf;
      paramf.addPreferencesFromResource(2131165211);
      biW();
      AppMethodBeat.o(22761);
      return true;
    }
  }

  public final boolean biV()
  {
    AppMethodBeat.i(22765);
    aw.ZK();
    c.Ry().b(this);
    com.tencent.mm.plugin.masssend.a.gkF.BS();
    AppMethodBeat.o(22765);
    return true;
  }

  public final void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.masssend.ui.a
 * JD-Core Version:    0.6.2
 */