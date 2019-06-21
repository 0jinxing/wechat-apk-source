package com.tencent.mm.plugin.readerapp.ui;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.kernel.e;
import com.tencent.mm.model.r;
import com.tencent.mm.model.t;
import com.tencent.mm.plugin.messenger.foundation.a.a.i;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.plugin.readerapp.c.c;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.pluginsdk.ui.preference.HelperHeaderPreference;
import com.tencent.mm.sdk.e.n;
import com.tencent.mm.sdk.e.n.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.z;
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

  public b(Context paramContext)
  {
    this.context = paramContext;
  }

  private void biW()
  {
    AppMethodBeat.i(76794);
    boolean bool1 = isOpen();
    this.ehK.removeAll();
    this.ehK.addPreferencesFromResource(2131165220);
    Object localObject = (HelperHeaderPreference)this.ehK.aqO("contact_info_header_helper");
    ((HelperHeaderPreference)localObject).ay(this.ehM.field_username, this.ehM.Oj(), this.context.getString(2131298638));
    int i;
    if (bool1)
    {
      i = 1;
      ((HelperHeaderPreference)localObject).sd(i);
      localObject = (CheckBoxPreference)this.ehK.aqO("contact_info_readerappnews_recv_remind");
      boolean bool2 = c.cdX();
      ab.d("MicroMsg.ContactWidgetReaderAppNews", "wantToReceiveNews = ".concat(String.valueOf(bool2)));
      ((CheckBoxPreference)localObject).uOT = bool2;
      if (!bool1)
        break label150;
      this.ehK.aqP("contact_info_readerappnews_install");
      AppMethodBeat.o(76794);
    }
    while (true)
    {
      return;
      i = 0;
      break;
      label150: this.ehK.aqP("contact_info_readerappnews_subscribe");
      this.ehK.aqP("contact_info_readerappnews_view");
      this.ehK.aqP("contact_info_readerappnews_clear_data");
      this.ehK.aqP("contact_info_readerappnews_uninstall");
      this.ehK.aqP("contact_info_readerappnews_recv_remind");
      AppMethodBeat.o(76794);
    }
  }

  private static boolean isOpen()
  {
    AppMethodBeat.i(76790);
    boolean bool;
    if ((r.YK() & 0x80000) == 0)
    {
      bool = true;
      AppMethodBeat.o(76790);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(76790);
    }
  }

  static void kc(boolean paramBoolean)
  {
    AppMethodBeat.i(76791);
    int i = r.YF();
    if (paramBoolean)
    {
      i &= -1025;
      com.tencent.mm.kernel.g.RP().Ry().set(40, Integer.valueOf(i));
      if (!paramBoolean)
        break label83;
    }
    label83: for (i = 2; ; i = 1)
    {
      ((j)com.tencent.mm.kernel.g.K(j.class)).XL().c(new com.tencent.mm.az.g(26, i));
      AppMethodBeat.o(76791);
      return;
      i |= 1024;
      break;
    }
  }

  public static void u(Context paramContext, boolean paramBoolean)
  {
    AppMethodBeat.i(76795);
    if (paramBoolean);
    for (Object localObject = paramContext.getString(2131303213); ; localObject = paramContext.getString(2131303221))
    {
      paramContext.getString(2131297061);
      localObject = com.tencent.mm.ui.base.h.b(paramContext, (String)localObject, true, null);
      paramContext = new b.3(paramBoolean, paramContext);
      new Timer().schedule(new b.4((ProgressDialog)localObject, paramContext), 5000L);
      AppMethodBeat.o(76795);
      return;
    }
  }

  public final boolean IO(String paramString)
  {
    boolean bool1 = false;
    boolean bool2 = true;
    AppMethodBeat.i(76792);
    ab.d("MicroMsg.ContactWidgetReaderAppNews", "handleEvent : key = ".concat(String.valueOf(paramString)));
    boolean bool3;
    if (bo.nullAsNil(paramString).length() <= 0)
    {
      AppMethodBeat.o(76792);
      bool3 = false;
    }
    while (true)
    {
      return bool3;
      if (paramString.equals("contact_info_readerappnews_view"))
      {
        paramString = new Intent(this.context, ReaderAppUI.class);
        paramString.putExtra("type", 20);
        this.context.startActivity(paramString);
        com.tencent.mm.plugin.readerapp.b.a.gkF.BS();
        AppMethodBeat.o(76792);
        bool3 = bool2;
      }
      else if (paramString.equals("contact_info_readerappnews_subscribe"))
      {
        paramString = new Intent(this.context, ReaderAppSubscribeUI.class);
        this.context.startActivity(paramString);
        AppMethodBeat.o(76792);
        bool3 = bool2;
      }
      else if (paramString.equals("contact_info_readerappnews_clear_data"))
      {
        com.tencent.mm.ui.base.h.d(this.context, this.context.getString(2131298492), "", this.context.getString(2131296871), this.context.getString(2131296868), new b.1(this), null);
        AppMethodBeat.o(76792);
        bool3 = bool2;
      }
      else
      {
        if (paramString.equals("contact_info_readerappnews_recv_remind"))
        {
          paramString = (CheckBoxPreference)this.ehK.aqO(paramString);
          boolean bool4 = c.cdX();
          if (!bool4)
          {
            com.tencent.mm.plugin.report.service.h.pYm.e(15413, new Object[] { Integer.valueOf(7), "", "" });
            label282: if (bool4)
              break label359;
          }
          label359: for (bool3 = true; ; bool3 = false)
          {
            paramString.uOT = bool3;
            bool3 = bool1;
            if (!bool4)
              bool3 = true;
            kc(bool3);
            AppMethodBeat.o(76792);
            bool3 = bool2;
            break;
            com.tencent.mm.plugin.report.service.h.pYm.e(15413, new Object[] { Integer.valueOf(6), "", "" });
            break label282;
          }
        }
        if (paramString.equals("contact_info_readerappnews_install"))
        {
          com.tencent.mm.plugin.report.service.h.pYm.e(15413, new Object[] { Integer.valueOf(5), "", "" });
          u(this.context, true);
          AppMethodBeat.o(76792);
          bool3 = bool2;
        }
        else if (paramString.equals("contact_info_readerappnews_uninstall"))
        {
          com.tencent.mm.ui.base.h.d(this.context, this.context.getString(2131303217), "", this.context.getString(2131296871), this.context.getString(2131296868), new b.2(this), null);
          AppMethodBeat.o(76792);
          bool3 = bool2;
        }
        else
        {
          ab.e("MicroMsg.ContactWidgetReaderAppNews", "handleEvent : unExpected key = ".concat(String.valueOf(paramString)));
          AppMethodBeat.o(76792);
          bool3 = false;
        }
      }
    }
  }

  public final void a(int paramInt, n paramn, Object paramObject)
  {
    AppMethodBeat.i(76797);
    int i = bo.g(paramObject, 0);
    ab.d("MicroMsg.ContactWidgetReaderAppNews", "onNotifyChange event:%d obj:%d stg:%s", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(i), paramn });
    if ((paramn != com.tencent.mm.kernel.g.RP().Ry()) || (i <= 0))
    {
      ab.e("MicroMsg.ContactWidgetReaderAppNews", "onNotifyChange error obj:%d stg:%s", new Object[] { Integer.valueOf(i), paramn });
      AppMethodBeat.o(76797);
    }
    while (true)
    {
      return;
      if ((i != 40) && (i != 34) && (i != 7))
      {
        AppMethodBeat.o(76797);
      }
      else
      {
        biW();
        AppMethodBeat.o(76797);
      }
    }
  }

  public final boolean a(f paramf, ad paramad, boolean paramBoolean, int paramInt)
  {
    boolean bool = false;
    AppMethodBeat.i(76793);
    if (paramf != null);
    for (paramBoolean = true; ; paramBoolean = false)
    {
      Assert.assertTrue(paramBoolean);
      paramBoolean = bool;
      if (paramad != null)
        paramBoolean = true;
      Assert.assertTrue(paramBoolean);
      Assert.assertTrue(t.np(paramad.field_username));
      com.tencent.mm.kernel.g.RP().Ry().a(this);
      this.ehM = paramad;
      this.ehK = paramf;
      biW();
      AppMethodBeat.o(76793);
      return true;
    }
  }

  public final boolean biV()
  {
    AppMethodBeat.i(76796);
    com.tencent.mm.kernel.g.RP().Ry().b(this);
    com.tencent.mm.plugin.readerapp.b.a.gkF.BS();
    AppMethodBeat.o(76796);
    return true;
  }

  public final void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.readerapp.ui.b
 * JD-Core Version:    0.6.2
 */