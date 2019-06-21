package com.tencent.mm.plugin.profile.ui;

import android.content.Context;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.m.e;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.model.r;
import com.tencent.mm.model.t;
import com.tencent.mm.plugin.messenger.foundation.a.a.i;
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
import com.tencent.mm.ui.base.p;
import com.tencent.mm.ui.base.preference.CheckBoxPreference;
import com.tencent.mm.ui.base.preference.f;
import java.util.Timer;
import junit.framework.Assert;

public final class j
  implements a, n.b
{
  private static boolean isDeleteCancel = false;
  private Context context;
  private f ehK;
  private ad ehM;

  public j(Context paramContext)
  {
    this.context = paramContext;
  }

  private void biW()
  {
    boolean bool1 = true;
    AppMethodBeat.i(23560);
    boolean bool2 = isOpen();
    boolean bool3 = cbb();
    Object localObject = (HelperHeaderPreference)this.ehK.aqO("contact_info_header_helper");
    ((HelperHeaderPreference)localObject).ay(this.ehM.field_username, this.ehM.Oj(), this.context.getString(2131298584));
    int i;
    boolean bool4;
    if (bool2)
    {
      i = 1;
      ((HelperHeaderPreference)localObject).sd(i);
      this.ehK.ce("contact_info_medianote_install", bool2);
      localObject = this.ehK;
      if (bool2)
        break label250;
      bool4 = true;
      label99: ((f)localObject).ce("contact_info_medianote_view", bool4);
      if ((!bool2) || (r.Ze()))
        break label280;
      if (bo.getInt(com.tencent.mm.m.g.Nu().getValue("BindQQSwitch"), 1) != 1)
        break label256;
      bool4 = true;
      label139: ab.i("MicroMsg.ContactWidgetMediaNote", "summerqq BindQQSwitch off");
    }
    while (true)
    {
      localObject = this.ehK;
      if (!bool4)
      {
        bool4 = true;
        label160: ((f)localObject).ce("contact_info_medianote_sync_to_qqmail", bool4);
        localObject = this.ehK;
        if (bool2)
          break label268;
        bool4 = true;
        label184: ((f)localObject).ce("contact_info_medianote_clear_data", bool4);
        localObject = this.ehK;
        if (bool2)
          break label274;
      }
      label256: label268: label274: for (bool4 = bool1; ; bool4 = false)
      {
        ((f)localObject).ce("contact_info_medianote_uninstall", bool4);
        ((CheckBoxPreference)this.ehK.aqO("contact_info_medianote_sync_to_qqmail")).uOT = bool3;
        AppMethodBeat.o(23560);
        return;
        i = 0;
        break;
        label250: bool4 = false;
        break label99;
        bool4 = false;
        break label139;
        bool4 = false;
        break label160;
        bool4 = false;
        break label184;
      }
      label280: bool4 = bool2;
    }
  }

  private static boolean cbb()
  {
    boolean bool = false;
    AppMethodBeat.i(23558);
    int i = r.YD();
    if (!r.Ze())
    {
      if ((i & 0x4000) != 0)
      {
        aw.ZK();
        c.Ry().set(7, Integer.valueOf(i & 0xFFFFBFFF));
      }
      AppMethodBeat.o(23558);
    }
    while (true)
    {
      return bool;
      if ((i & 0x4000) != 0)
      {
        bool = true;
        AppMethodBeat.o(23558);
      }
      else
      {
        AppMethodBeat.o(23558);
      }
    }
  }

  private static boolean isOpen()
  {
    AppMethodBeat.i(23557);
    boolean bool;
    if ((r.YK() & 0x10) == 0)
    {
      bool = true;
      AppMethodBeat.o(23557);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(23557);
    }
  }

  static void jQ(boolean paramBoolean)
  {
    AppMethodBeat.i(23564);
    int i = r.YD();
    if (paramBoolean)
    {
      i |= 16384;
      aw.ZK();
      c.Ry().set(7, Integer.valueOf(i));
      if (!paramBoolean)
        break label80;
    }
    label80: for (i = 1; ; i = 2)
    {
      aw.ZK();
      c.XL().c(new com.tencent.mm.az.g(13, i));
      AppMethodBeat.o(23564);
      return;
      i &= -16385;
      break;
    }
  }

  public static void u(Context paramContext, boolean paramBoolean)
  {
    AppMethodBeat.i(23561);
    if (paramBoolean);
    for (Object localObject = paramContext.getString(2131303213); ; localObject = paramContext.getString(2131303221))
    {
      paramContext.getString(2131297061);
      localObject = h.b(paramContext, (String)localObject, true, null);
      paramContext = new j.4(paramBoolean, paramContext);
      new Timer().schedule(new j.5((p)localObject, paramContext), 1500L);
      AppMethodBeat.o(23561);
      return;
    }
  }

  public final boolean IO(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(23556);
    ab.d("MicroMsg.ContactWidgetMediaNote", "handleEvent : key = ".concat(String.valueOf(paramString)));
    if (bo.nullAsNil(paramString).length() <= 0)
      AppMethodBeat.o(23556);
    while (true)
    {
      return bool;
      if (paramString.equals("contact_info_medianote_view"))
      {
        paramString = new Intent();
        paramString.putExtra("Chat_User", "medianote");
        b.gkE.d(paramString, this.context);
        b.gkF.BS();
        AppMethodBeat.o(23556);
        bool = true;
      }
      else
      {
        if (paramString.equals("contact_info_medianote_sync_to_qqmail"))
        {
          if (!r.Ze())
          {
            h.a(this.context, 2131298583, 2131298582, new j.1(this), null);
            biW();
          }
          while (true)
          {
            AppMethodBeat.o(23556);
            bool = true;
            break;
            jQ(((CheckBoxPreference)this.ehK.aqO(paramString)).isChecked());
          }
        }
        if (paramString.equals("contact_info_medianote_clear_data"))
        {
          h.d(this.context, this.context.getString(2131298491), "", this.context.getString(2131296871), this.context.getString(2131296868), new j.2(this), null);
          AppMethodBeat.o(23556);
          bool = true;
        }
        else if (paramString.equals("contact_info_medianote_install"))
        {
          u(this.context, true);
          AppMethodBeat.o(23556);
          bool = true;
        }
        else if (paramString.equals("contact_info_medianote_uninstall"))
        {
          h.d(this.context, this.context.getString(2131303217), "", this.context.getString(2131296871), this.context.getString(2131296868), new j.3(this), null);
          AppMethodBeat.o(23556);
          bool = true;
        }
        else
        {
          ab.e("MicroMsg.ContactWidgetMediaNote", "handleEvent : unExpected key = ".concat(String.valueOf(paramString)));
          AppMethodBeat.o(23556);
        }
      }
    }
  }

  public final void a(int paramInt, com.tencent.mm.sdk.e.n paramn, Object paramObject)
  {
    AppMethodBeat.i(23563);
    int i = bo.g(paramObject, 0);
    ab.d("MicroMsg.ContactWidgetMediaNote", "onNotifyChange event:%d obj:%d stg:%s", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(i), paramn });
    aw.ZK();
    if ((paramn != c.Ry()) || (i <= 0))
    {
      ab.e("MicroMsg.ContactWidgetMediaNote", "onNotifyChange error obj:%d stg:%s", new Object[] { Integer.valueOf(i), paramn });
      AppMethodBeat.o(23563);
    }
    while (true)
    {
      return;
      if ((i != 40) && (i != 34) && (i != 7))
      {
        AppMethodBeat.o(23563);
      }
      else
      {
        biW();
        AppMethodBeat.o(23563);
      }
    }
  }

  public final boolean a(f paramf, ad paramad, boolean paramBoolean, int paramInt)
  {
    boolean bool = false;
    AppMethodBeat.i(23559);
    if (paramf != null);
    for (paramBoolean = true; ; paramBoolean = false)
    {
      Assert.assertTrue(paramBoolean);
      paramBoolean = bool;
      if (paramad != null)
        paramBoolean = true;
      Assert.assertTrue(paramBoolean);
      Assert.assertTrue(t.no(paramad.field_username));
      aw.ZK();
      c.Ry().a(this);
      this.ehM = paramad;
      this.ehK = paramf;
      paramf.addPreferencesFromResource(2131165212);
      biW();
      AppMethodBeat.o(23559);
      return true;
    }
  }

  public final boolean biV()
  {
    AppMethodBeat.i(23562);
    aw.ZK();
    c.Ry().b(this);
    b.gkF.BS();
    AppMethodBeat.o(23562);
    return true;
  }

  public final void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.profile.ui.j
 * JD-Core Version:    0.6.2
 */