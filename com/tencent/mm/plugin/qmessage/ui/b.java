package com.tencent.mm.plugin.qmessage.ui;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.az.g;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.model.r;
import com.tencent.mm.model.t;
import com.tencent.mm.plugin.messenger.foundation.a.a.i;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.pluginsdk.ui.preference.HelperHeaderPreference;
import com.tencent.mm.sdk.e.n;
import com.tencent.mm.sdk.e.n.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.preference.CheckBoxPreference;
import com.tencent.mm.ui.base.preference.f;
import java.util.Timer;
import junit.framework.Assert;

public final class b
  implements com.tencent.mm.pluginsdk.b.a, n.b
{
  Context context;
  private f ehK;
  private ad ehM;
  private boolean pli;

  public b(Context paramContext)
  {
    this.context = paramContext;
  }

  private static boolean Bn(int paramInt)
  {
    AppMethodBeat.i(24113);
    boolean bool;
    if ((r.YD() & paramInt) != 0)
    {
      bool = true;
      AppMethodBeat.o(24113);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(24113);
    }
  }

  static void f(int paramInt1, boolean paramBoolean, int paramInt2)
  {
    AppMethodBeat.i(24116);
    int i = r.YD();
    if (paramBoolean)
    {
      paramInt1 = i | paramInt1;
      aw.ZK();
      c.Ry().set(7, Integer.valueOf(paramInt1));
      if (!paramBoolean)
        break label77;
    }
    label77: for (paramInt1 = 1; ; paramInt1 = 2)
    {
      aw.ZK();
      c.XL().c(new g(paramInt2, paramInt1));
      AppMethodBeat.o(24116);
      return;
      paramInt1 = i & (paramInt1 ^ 0xFFFFFFFF);
      break;
    }
  }

  private static boolean isOpen()
  {
    AppMethodBeat.i(24112);
    boolean bool;
    if ((r.YK() & 0x20) == 0)
    {
      bool = true;
      AppMethodBeat.o(24112);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(24112);
    }
  }

  public static void u(Context paramContext, boolean paramBoolean)
  {
    AppMethodBeat.i(24111);
    if (paramBoolean);
    for (Object localObject = paramContext.getString(2131303213); ; localObject = paramContext.getString(2131303221))
    {
      paramContext.getString(2131297061);
      localObject = h.b(paramContext, (String)localObject, true, null);
      paramContext = new b.7(paramBoolean);
      new Timer().schedule(new b.8((ProgressDialog)localObject, paramContext), 5000L);
      AppMethodBeat.o(24111);
      return;
    }
  }

  public final boolean IO(String paramString)
  {
    AppMethodBeat.i(24110);
    ab.d("MicroMsg.ContactWidgetQMessage", "handleEvent : key = ".concat(String.valueOf(paramString)));
    boolean bool;
    if (bo.nullAsNil(paramString).length() <= 0)
    {
      AppMethodBeat.o(24110);
      bool = false;
    }
    while (true)
    {
      return bool;
      if (paramString.equals("contact_info_view_message"))
      {
        paramString = new Intent(this.context, QConversationUI.class);
        if (this.pli)
          ((Activity)this.context).setResult(-1, paramString);
        while (true)
        {
          ((Activity)this.context).finish();
          AppMethodBeat.o(24110);
          bool = true;
          break;
          this.context.startActivity(paramString);
        }
      }
      if (paramString.equals("contact_info_qmessage_recv_offline_msg"))
      {
        paramString = (CheckBoxPreference)this.ehK.aqO(paramString);
        if (paramString.isChecked())
          f(64, true, 5);
        while (true)
        {
          AppMethodBeat.o(24110);
          bool = true;
          break;
          if (!Bn(8192))
          {
            f(64, false, 5);
            AppMethodBeat.o(24110);
            bool = true;
            break;
          }
          h.a(this.context, 2131298613, 2131297061, new b.1(this), new b.2(this, paramString));
        }
      }
      if (paramString.equals("contact_info_qmessage_display_weixin_online"))
      {
        f(8192, ((CheckBoxPreference)this.ehK.aqO(paramString)).isChecked(), 12);
        AppMethodBeat.o(24110);
        bool = true;
      }
      else if (paramString.equals("contact_info_qmessage_clear_data"))
      {
        h.d(this.context, this.context.getString(2131298491), "", this.context.getString(2131296871), this.context.getString(2131296868), new b.3(this), null);
        AppMethodBeat.o(24110);
        bool = true;
      }
      else if (paramString.equals("contact_info_qmessage_install"))
      {
        aw.ZK();
        if (bo.h((Integer)c.Ry().get(9, null)) == 0)
        {
          h.b(this.context, 2131303355, new b.4(this), new b.5(this));
          AppMethodBeat.o(24110);
          bool = true;
        }
        else
        {
          u(this.context, true);
          AppMethodBeat.o(24110);
          bool = true;
        }
      }
      else if (paramString.equals("contact_info_qmessage_uninstall"))
      {
        h.d(this.context, this.context.getString(2131303217), "", this.context.getString(2131296871), this.context.getString(2131296868), new b.6(this), null);
        AppMethodBeat.o(24110);
        bool = true;
      }
      else
      {
        ab.e("MicroMsg.ContactWidgetQMessage", "handleEvent : unExpected key = ".concat(String.valueOf(paramString)));
        AppMethodBeat.o(24110);
        bool = false;
      }
    }
  }

  public final void a(int paramInt, n paramn, Object paramObject)
  {
    AppMethodBeat.i(24118);
    aw.ZK();
    if (paramn != c.Ry())
      AppMethodBeat.o(24118);
    while (true)
    {
      return;
      biW();
      AppMethodBeat.o(24118);
    }
  }

  public final boolean a(f paramf, ad paramad, boolean paramBoolean, int paramInt)
  {
    boolean bool1 = false;
    AppMethodBeat.i(24114);
    if (paramad != null);
    for (boolean bool2 = true; ; bool2 = false)
    {
      Assert.assertTrue(bool2);
      Assert.assertTrue(t.ng(paramad.field_username));
      bool2 = bool1;
      if (paramf != null)
        bool2 = true;
      Assert.assertTrue(bool2);
      aw.ZK();
      c.Ry().a(this);
      this.ehM = paramad;
      this.pli = paramBoolean;
      this.ehK = paramf;
      biW();
      AppMethodBeat.o(24114);
      return true;
    }
  }

  public final boolean biV()
  {
    AppMethodBeat.i(24117);
    aw.ZK();
    c.Ry().b(this);
    com.tencent.mm.plugin.qmessage.a.psH.BS();
    AppMethodBeat.o(24117);
    return true;
  }

  final void biW()
  {
    AppMethodBeat.i(24115);
    boolean bool1 = isOpen();
    boolean bool2 = Bn(64);
    Bn(8192);
    this.ehK.removeAll();
    this.ehK.addPreferencesFromResource(2131165216);
    HelperHeaderPreference localHelperHeaderPreference = (HelperHeaderPreference)this.ehK.aqO("contact_info_header_helper");
    localHelperHeaderPreference.ay(this.ehM.field_username, this.ehM.Oj(), this.context.getString(2131298616));
    int i;
    if (bool1)
    {
      i = 1;
      localHelperHeaderPreference.sd(i);
      if (bool1)
        break label166;
      this.ehK.aqP("contact_info_view_message");
      this.ehK.aqP("contact_info_qmessage_recv_offline_msg");
      this.ehK.aqP("contact_info_qmessage_uninstall");
      this.ehK.aqP("contact_info_qmessage_clear_data");
      AppMethodBeat.o(24115);
    }
    while (true)
    {
      return;
      i = 0;
      break;
      label166: this.ehK.aqP("contact_info_qmessage_install");
      ((CheckBoxPreference)this.ehK.aqO("contact_info_qmessage_recv_offline_msg")).uOT = bool2;
      AppMethodBeat.o(24115);
    }
  }

  public final void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.qmessage.ui.b
 * JD-Core Version:    0.6.2
 */