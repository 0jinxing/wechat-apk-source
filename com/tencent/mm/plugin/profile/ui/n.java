package com.tencent.mm.plugin.profile.ui;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.model.r;
import com.tencent.mm.model.t;
import com.tencent.mm.plugin.profile.b;
import com.tencent.mm.pluginsdk.b.a;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.pluginsdk.ui.preference.HelperHeaderPreference;
import com.tencent.mm.sdk.e.n.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.preference.f;
import java.util.Timer;
import junit.framework.Assert;

public final class n
  implements a, n.b
{
  Context context;
  private f ehK;
  private ad ehM;

  public n(Context paramContext)
  {
    this.context = paramContext;
  }

  private void biW()
  {
    boolean bool1 = true;
    AppMethodBeat.i(23607);
    boolean bool2 = cba();
    Object localObject = (HelperHeaderPreference)this.ehK.aqO("contact_info_header_helper");
    ((HelperHeaderPreference)localObject).ay(this.ehM.field_username, this.ehM.Oj(), this.context.getString(2131298748));
    int i;
    if (bool2)
    {
      i = 1;
      ((HelperHeaderPreference)localObject).sd(i);
      this.ehK.ce("contact_info_voiceinput_install", bool2);
      localObject = this.ehK;
      if (bool2)
        break label110;
    }
    while (true)
    {
      ((f)localObject).ce("contact_info_voiceinput_uninstall", bool1);
      AppMethodBeat.o(23607);
      return;
      i = 0;
      break;
      label110: bool1 = false;
    }
  }

  private static boolean cba()
  {
    AppMethodBeat.i(23604);
    boolean bool;
    if ((r.YK() & 0x2000000) == 0)
    {
      bool = true;
      AppMethodBeat.o(23604);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(23604);
    }
  }

  public static void u(Context paramContext, boolean paramBoolean)
  {
    AppMethodBeat.i(23608);
    if (paramBoolean);
    for (Object localObject = paramContext.getString(2131303213); ; localObject = paramContext.getString(2131303221))
    {
      paramContext.getString(2131297061);
      localObject = h.b(paramContext, (String)localObject, true, null);
      paramContext = new n.2(paramBoolean);
      new Timer().schedule(new n.3((ProgressDialog)localObject, paramContext), 1500L);
      AppMethodBeat.o(23608);
      return;
    }
  }

  public final boolean IO(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(23605);
    ab.d("MicroMsg.ContactWidgetVoiceInput", "handleEvent : key = ".concat(String.valueOf(paramString)));
    if (bo.nullAsNil(paramString).length() <= 0)
      AppMethodBeat.o(23605);
    while (true)
    {
      return bool;
      if (paramString.equals("contact_info_voiceinput_install"))
      {
        u(this.context, true);
        AppMethodBeat.o(23605);
        bool = true;
      }
      else if (paramString.equals("contact_info_voiceinput_uninstall"))
      {
        h.d(this.context, this.context.getString(2131303217), "", this.context.getString(2131296871), this.context.getString(2131296868), new n.1(this), null);
        AppMethodBeat.o(23605);
        bool = true;
      }
      else
      {
        ab.e("MicroMsg.ContactWidgetVoiceInput", "handleEvent : unExpected key = ".concat(String.valueOf(paramString)));
        AppMethodBeat.o(23605);
      }
    }
  }

  public final void a(int paramInt, com.tencent.mm.sdk.e.n paramn, Object paramObject)
  {
    AppMethodBeat.i(23610);
    int i = bo.g(paramObject, 0);
    ab.d("MicroMsg.ContactWidgetVoiceInput", "onNotifyChange event:%d obj:%d stg:%s", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(i), paramn });
    aw.ZK();
    if ((paramn != c.Ry()) || (i <= 0))
    {
      ab.e("MicroMsg.ContactWidgetVoiceInput", "onNotifyChange error obj:%d stg:%s", new Object[] { Integer.valueOf(i), paramn });
      AppMethodBeat.o(23610);
    }
    while (true)
    {
      return;
      if ((i != 40) && (i != 34) && (i != 7))
      {
        AppMethodBeat.o(23610);
      }
      else
      {
        biW();
        AppMethodBeat.o(23610);
      }
    }
  }

  public final boolean a(f paramf, ad paramad, boolean paramBoolean, int paramInt)
  {
    boolean bool = false;
    AppMethodBeat.i(23606);
    if (paramf != null);
    for (paramBoolean = true; ; paramBoolean = false)
    {
      Assert.assertTrue(paramBoolean);
      paramBoolean = bool;
      if (paramad != null)
        paramBoolean = true;
      Assert.assertTrue(paramBoolean);
      Assert.assertTrue(t.nt(paramad.field_username));
      aw.ZK();
      c.Ry().a(this);
      this.ehM = paramad;
      this.ehK = paramf;
      paramf.addPreferencesFromResource(2131165226);
      biW();
      AppMethodBeat.o(23606);
      return true;
    }
  }

  public final boolean biV()
  {
    AppMethodBeat.i(23609);
    aw.ZK();
    c.Ry().b(this);
    b.gkF.BS();
    AppMethodBeat.o(23609);
    return true;
  }

  public final void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.profile.ui.n
 * JD-Core Version:    0.6.2
 */