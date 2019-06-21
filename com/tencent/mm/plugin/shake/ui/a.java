package com.tencent.mm.plugin.shake.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.model.as;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.model.r;
import com.tencent.mm.model.t;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.pluginsdk.ui.preference.HelperHeaderPreference;
import com.tencent.mm.sdk.e.n;
import com.tencent.mm.sdk.e.n.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.preference.f;
import java.util.Timer;
import junit.framework.Assert;

public final class a
  implements as, com.tencent.mm.pluginsdk.b.a, n.b
{
  Context context;
  private f ehK;
  private ad ehM;

  public a(Context paramContext)
  {
    this.context = paramContext;
  }

  private void biW()
  {
    boolean bool1 = true;
    AppMethodBeat.i(24695);
    boolean bool2 = isOpen();
    Object localObject = (HelperHeaderPreference)this.ehK.aqO("contact_info_header_helper");
    int i;
    if (localObject != null)
    {
      ((HelperHeaderPreference)localObject).ay(this.ehM.field_username, this.ehM.Oj(), this.context.getString(2131298677));
      if (bool2)
      {
        i = 1;
        ((HelperHeaderPreference)localObject).sd(i);
      }
    }
    else
    {
      this.ehK.ce("contact_info_shake_install", bool2);
      localObject = this.ehK;
      if (bool2)
        break label140;
      bool3 = true;
      label95: ((f)localObject).ce("contact_info_shake_go_shake", bool3);
      localObject = this.ehK;
      if (bool2)
        break label146;
    }
    label140: label146: for (boolean bool3 = bool1; ; bool3 = false)
    {
      ((f)localObject).ce("contact_info_shake_uninstall", bool3);
      AppMethodBeat.o(24695);
      return;
      i = 0;
      break;
      bool3 = false;
      break label95;
    }
  }

  private static boolean isOpen()
  {
    AppMethodBeat.i(24693);
    boolean bool;
    if ((r.YK() & 0x100) == 0)
    {
      bool = true;
      AppMethodBeat.o(24693);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(24693);
    }
  }

  public static void u(Context paramContext, boolean paramBoolean)
  {
    AppMethodBeat.i(24696);
    if (paramBoolean);
    for (Object localObject = paramContext.getString(2131303213); ; localObject = paramContext.getString(2131303221))
    {
      paramContext.getString(2131297061);
      paramContext = h.b(paramContext, (String)localObject, true, null);
      localObject = new a.2(paramBoolean);
      new Timer().schedule(new a.3(paramContext, (ak)localObject), 1500L);
      AppMethodBeat.o(24696);
      return;
    }
  }

  public final boolean IO(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(24692);
    ab.d("MicroMsg.ContactWidgetShake", "handleEvent : key = ".concat(String.valueOf(paramString)));
    if (bo.nullAsNil(paramString).length() <= 0)
      AppMethodBeat.o(24692);
    while (true)
    {
      return bool;
      if (paramString.equals("contact_info_shake_go_shake"))
      {
        paramString = new Intent();
        paramString.setClass(this.context, ShakeReportUI.class);
        this.context.startActivity(paramString);
        ((Activity)this.context).finish();
        AppMethodBeat.o(24692);
        bool = true;
      }
      else if (paramString.equals("contact_info_shake_install"))
      {
        u(this.context, true);
        AppMethodBeat.o(24692);
        bool = true;
      }
      else if (paramString.equals("contact_info_shake_uninstall"))
      {
        h.d(this.context, this.context.getString(2131303217), "", this.context.getString(2131296871), this.context.getString(2131296868), new a.1(this), null);
        AppMethodBeat.o(24692);
        bool = true;
      }
      else
      {
        ab.e("MicroMsg.ContactWidgetShake", "handleEvent : unExpected key = ".concat(String.valueOf(paramString)));
        AppMethodBeat.o(24692);
      }
    }
  }

  public final void ZB()
  {
    AppMethodBeat.i(24698);
    biW();
    AppMethodBeat.o(24698);
  }

  public final void a(int paramInt, n paramn, Object paramObject)
  {
    AppMethodBeat.i(24699);
    int i = bo.g(paramObject, 0);
    ab.d("MicroMsg.ContactWidgetShake", "onNotifyChange event:%d obj:%d stg:%s", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(i), paramn });
    aw.ZK();
    if ((paramn != c.Ry()) || (i <= 0))
    {
      ab.e("MicroMsg.ContactWidgetShake", "onNotifyChange error obj:%d stg:%s", new Object[] { Integer.valueOf(i), paramn });
      AppMethodBeat.o(24699);
    }
    while (true)
    {
      return;
      if ((i != 7) && (i != 34))
      {
        AppMethodBeat.o(24699);
      }
      else
      {
        biW();
        AppMethodBeat.o(24699);
      }
    }
  }

  public final boolean a(f paramf, ad paramad, boolean paramBoolean, int paramInt)
  {
    boolean bool = false;
    AppMethodBeat.i(24694);
    if (paramf != null);
    for (paramBoolean = true; ; paramBoolean = false)
    {
      Assert.assertTrue(paramBoolean);
      paramBoolean = bool;
      if (paramad != null)
        paramBoolean = true;
      Assert.assertTrue(paramBoolean);
      Assert.assertTrue(t.nn(paramad.field_username));
      aw.ZK();
      c.Ry().a(this);
      aw.ZK();
      c.a(this);
      this.ehM = paramad;
      this.ehK = paramf;
      paramf.addPreferencesFromResource(2131165222);
      biW();
      AppMethodBeat.o(24694);
      return true;
    }
  }

  public final boolean biV()
  {
    AppMethodBeat.i(24697);
    aw.ZK();
    c.Ry().b(this);
    aw.ZK();
    c.b(this);
    com.tencent.mm.plugin.shake.a.gkF.BS();
    AppMethodBeat.o(24697);
    return true;
  }

  public final void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.shake.ui.a
 * JD-Core Version:    0.6.2
 */