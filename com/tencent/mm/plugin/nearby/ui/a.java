package com.tencent.mm.plugin.nearby.ui;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Message;
import android.view.View;
import android.widget.CheckBox;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.az.k;
import com.tencent.mm.bp.d;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.bp;
import com.tencent.mm.model.r;
import com.tencent.mm.model.t;
import com.tencent.mm.plugin.messenger.foundation.a.a.i;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.pluginsdk.ui.preference.HelperHeaderPreference;
import com.tencent.mm.sdk.e.n;
import com.tencent.mm.sdk.e.n.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.base.h;
import java.util.Timer;
import java.util.TimerTask;
import junit.framework.Assert;

public final class a
  implements com.tencent.mm.ai.f, com.tencent.mm.pluginsdk.b.a, n.b
{
  private static boolean oPT = true;
  private Context context;
  private com.tencent.mm.ui.base.preference.f ehK;
  private ad ehM;
  private com.tencent.mm.plugin.nearby.a.c oPQ;
  private View oPR;
  private CheckBox oPS;
  private com.tencent.mm.ui.widget.a.c oPU;
  private com.tencent.mm.ui.base.p tipDialog;

  public a(Context paramContext)
  {
    AppMethodBeat.i(55417);
    this.oPU = null;
    this.context = paramContext;
    this.oPR = View.inflate(paramContext, 2130969930, null);
    this.oPS = ((CheckBox)this.oPR.findViewById(2131825250));
    this.oPS.setChecked(false);
    g.Rg().a(148, this);
    AppMethodBeat.o(55417);
  }

  private void biW()
  {
    boolean bool1 = true;
    AppMethodBeat.i(55421);
    boolean bool2 = isOpen();
    Object localObject = (HelperHeaderPreference)this.ehK.aqO("contact_info_header_helper");
    ((HelperHeaderPreference)localObject).ay(this.ehM.field_username, this.ehM.Oj(), this.context.getString(2131298557));
    int i;
    if (bool2)
    {
      i = 1;
      ((HelperHeaderPreference)localObject).sd(i);
      this.ehK.ce("contact_info_lbs_install", bool2);
      localObject = this.ehK;
      if (bool2)
        break label156;
      bool3 = true;
      label90: ((com.tencent.mm.ui.base.preference.f)localObject).ce("contact_info_lbs_go_lbs", bool3);
      localObject = this.ehK;
      if (bool2)
        break label162;
      bool3 = true;
      label112: ((com.tencent.mm.ui.base.preference.f)localObject).ce("contact_info_lbs_clear_info", bool3);
      localObject = this.ehK;
      if (bool2)
        break label168;
    }
    label156: label162: label168: for (boolean bool3 = bool1; ; bool3 = false)
    {
      ((com.tencent.mm.ui.base.preference.f)localObject).ce("contact_info_lbs_uninstall", bool3);
      AppMethodBeat.o(55421);
      return;
      i = 0;
      break;
      bool3 = false;
      break label90;
      bool3 = false;
      break label112;
    }
  }

  private static boolean isOpen()
  {
    AppMethodBeat.i(55419);
    boolean bool;
    if ((r.YK() & 0x200) == 0)
    {
      bool = true;
      AppMethodBeat.o(55419);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(55419);
    }
  }

  public static void u(final Context paramContext, boolean paramBoolean)
  {
    AppMethodBeat.i(55422);
    if (paramBoolean);
    for (Object localObject = paramContext.getString(2131303213); ; localObject = paramContext.getString(2131303221))
    {
      oPT = paramBoolean;
      paramContext.getString(2131297061);
      localObject = h.b(paramContext, (String)localObject, true, null);
      paramContext = new ak()
      {
        public final void handleMessage(Message paramAnonymousMessage)
        {
          AppMethodBeat.i(55415);
          int i = r.YK();
          if (this.kRo)
            i &= -513;
          while (true)
          {
            g.RP().Ry().set(34, Integer.valueOf(i));
            ((j)g.K(j.class)).XL().c(new k("", "", "", "", "", "", "", "", i, "", ""));
            if (!this.kRo)
            {
              g.RN().QU();
              ((j)g.K(j.class)).bOo().axQ();
              g.Rg().a(new com.tencent.mm.plugin.nearby.a.c(2, 0.0F, 0.0F, 0, 0, "", ""), 0);
            }
            if (this.ooo != null)
              this.ooo.a(null, null);
            AppMethodBeat.o(55415);
            return;
            i |= 512;
          }
        }
      };
      new Timer().schedule(new TimerTask()
      {
        public final void run()
        {
          AppMethodBeat.i(55416);
          if (this.oop != null)
          {
            this.oop.dismiss();
            paramContext.sendEmptyMessage(0);
          }
          AppMethodBeat.o(55416);
        }
      }
      , 1500L);
      AppMethodBeat.o(55422);
      return;
    }
  }

  public final boolean IO(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(55418);
    ab.d("MicroMsg.ContactWidgetLBS", "handleEvent : key = ".concat(String.valueOf(paramString)));
    if (bo.nullAsNil(paramString).length() <= 0)
      AppMethodBeat.o(55418);
    while (true)
    {
      return bool;
      if (paramString.equals("contact_info_lbs_go_lbs"))
      {
        paramString = (Boolean)g.RP().Ry().get(4103, null);
        if ((paramString == null) || (!paramString.booleanValue()))
          d.H(this.context, "nearby", ".ui.NearbyFriendsIntroUI");
        while (true)
        {
          AppMethodBeat.o(55418);
          bool = true;
          break;
          bp localbp = bp.aap();
          if (localbp == null)
          {
            d.H(this.context, "nearby", ".ui.NearbyPersonalInfoUI");
          }
          else
          {
            String str = bo.nullAsNil(localbp.getProvince());
            paramString = bo.nullAsNil(localbp.getCity());
            int i = localbp.dtS;
            if ((str.equals("")) || (paramString.equals("")) || (i == 0))
            {
              d.H(this.context, "nearby", ".ui.NearbyPersonalInfoUI");
            }
            else
            {
              paramString = (Boolean)g.RP().Ry().get(4104, null);
              if ((paramString == null) || (!paramString.booleanValue()))
              {
                com.tencent.mm.bn.a.fy(this.context);
                ((Activity)this.context).finish();
              }
              else if (this.oPU == null)
              {
                this.oPU = h.a(this.context, this.context.getString(2131297061), this.oPR, new a.2(this), new a.3(this));
              }
              else
              {
                this.oPU.show();
              }
            }
          }
        }
      }
      if (paramString.equals("contact_info_lbs_install"))
      {
        u(this.context, true);
        AppMethodBeat.o(55418);
        bool = true;
      }
      else if (paramString.equals("contact_info_lbs_clear_info"))
      {
        h.a(this.context, 2131301615, 2131301614, new a.4(this), new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
          }
        });
        AppMethodBeat.o(55418);
        bool = true;
      }
      else if (paramString.equals("contact_info_lbs_uninstall"))
      {
        h.d(this.context, this.context.getString(2131303217), "", this.context.getString(2131296871), this.context.getString(2131296868), new a.1(this), null);
        AppMethodBeat.o(55418);
        bool = true;
      }
      else
      {
        ab.e("MicroMsg.ContactWidgetLBS", "handleEvent : unExpected key = ".concat(String.valueOf(paramString)));
        AppMethodBeat.o(55418);
      }
    }
  }

  public final void a(int paramInt, n paramn, Object paramObject)
  {
    AppMethodBeat.i(55424);
    int i = bo.g(paramObject, 0);
    ab.d("MicroMsg.ContactWidgetLBS", "onNotifyChange event:%d obj:%d stg:%s", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(i), paramn });
    if ((paramn != g.RP().Ry()) || (i <= 0))
    {
      ab.e("MicroMsg.ContactWidgetLBS", "onNotifyChange error obj:%d stg:%s", new Object[] { Integer.valueOf(i), paramn });
      AppMethodBeat.o(55424);
    }
    while (true)
    {
      return;
      if ((i != 40) && (i != 34) && (i != 7))
      {
        AppMethodBeat.o(55424);
      }
      else
      {
        biW();
        AppMethodBeat.o(55424);
      }
    }
  }

  public final boolean a(com.tencent.mm.ui.base.preference.f paramf, ad paramad, boolean paramBoolean, int paramInt)
  {
    boolean bool = false;
    AppMethodBeat.i(55420);
    if (paramf != null);
    for (paramBoolean = true; ; paramBoolean = false)
    {
      Assert.assertTrue(paramBoolean);
      paramBoolean = bool;
      if (paramad != null)
        paramBoolean = true;
      Assert.assertTrue(paramBoolean);
      Assert.assertTrue(t.nm(paramad.field_username));
      g.RP().Ry().a(this);
      ab.v("MicroMsg.ContactWidgetLBS", "listener added");
      this.ehM = paramad;
      this.ehK = paramf;
      oPT = true;
      paramf.addPreferencesFromResource(2131165209);
      biW();
      AppMethodBeat.o(55420);
      return true;
    }
  }

  public final boolean biV()
  {
    AppMethodBeat.i(55423);
    g.RP().Ry().b(this);
    g.Rg().b(148, this);
    com.tencent.mm.plugin.nearby.a.gkF.BS();
    AppMethodBeat.o(55423);
    return true;
  }

  public final void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ai.m paramm)
  {
    AppMethodBeat.i(55425);
    if ((this.oPQ == null) && (((com.tencent.mm.plugin.nearby.a.c)paramm).Ah() == 2))
      AppMethodBeat.o(55425);
    while (true)
    {
      return;
      ab.i("MicroMsg.ContactWidgetLBS", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
      if (paramm.getType() == 148)
        break;
      AppMethodBeat.o(55425);
    }
    if (this.tipDialog != null)
    {
      this.tipDialog.dismiss();
      this.tipDialog = null;
    }
    if ((paramInt1 == 0) && (paramInt2 == 0));
    for (paramInt1 = 2131301617; ; paramInt1 = 2131301616)
    {
      if ((((com.tencent.mm.plugin.nearby.a.c)paramm).Ah() == 2) && (oPT))
      {
        h.a(this.context, paramInt1, 2131297061, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
          }
        });
        this.oPQ = null;
      }
      AppMethodBeat.o(55425);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.nearby.ui.a
 * JD-Core Version:    0.6.2
 */