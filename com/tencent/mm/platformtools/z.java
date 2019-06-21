package com.tencent.mm.platformtools;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.av;
import com.tencent.mm.model.r;
import com.tencent.mm.modelsimple.q.a;
import com.tencent.mm.plugin.account.friend.a.l;
import com.tencent.mm.plugin.account.friend.a.l.a;
import com.tencent.mm.plugin.messenger.foundation.a.a.i;
import com.tencent.mm.plugin.messenger.foundation.a.a.j.a;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.pluginsdk.ui.BioHelperUI;
import com.tencent.mm.protocal.protobuf.act;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;

public final class z
{
  public static void a(Context paramContext, q.a parama, int paramInt)
  {
    AppMethodBeat.i(124592);
    paramContext = new Intent(paramContext, BioHelperUI.class);
    paramContext.putExtra("k_type", parama.type);
    paramContext.putExtra("KVoiceHelpCode", paramInt);
    paramContext.putExtra("Kvertify_key", parama.cxb);
    paramContext.putExtra("KVoiceHelpUrl", parama.fPp);
    paramContext.putExtra("KVoiceHelpWording", parama.cEh);
    paramContext.putExtra("Kusername", parama.username);
    if (parama.fPq != null)
      paramContext.getExtras().putAll(parama.fPq);
    AppMethodBeat.o(124592);
  }

  public static void cu(Context paramContext)
  {
    AppMethodBeat.i(124590);
    String str1 = paramContext.getString(2131296515);
    String str2 = paramContext.getString(2131296514);
    com.tencent.mm.ui.base.h.d(paramContext, str1, "", paramContext.getString(2131298421), paramContext.getString(2131298419), new z.3(str2, paramContext), null);
    AppMethodBeat.o(124590);
  }

  public static void f(Context paramContext, String paramString, int paramInt)
  {
    AppMethodBeat.i(124593);
    com.tencent.mm.h.a locala = com.tencent.mm.h.a.jY(paramString);
    if (locala != null)
      if (locala.showType == 8)
      {
        com.tencent.mm.plugin.account.a.b.a.b(paramContext, locala.url, paramInt, false);
        AppMethodBeat.o(124593);
      }
    while (true)
    {
      return;
      paramString = paramContext.getString(2131296994);
      String str = paramContext.getString(2131296868);
      z.5 local5 = new z.5(paramContext, locala, paramInt);
      if ((locala.showType == 1) || (locala.showType == 4))
      {
        if (bo.isNullOrNil(locala.url))
        {
          com.tencent.mm.ui.base.h.b(paramContext, locala.desc, locala.Title, true);
          AppMethodBeat.o(124593);
        }
        else
        {
          com.tencent.mm.ui.base.h.d(paramContext, locala.desc, locala.Title, paramString, str, local5, null);
        }
      }
      else
      {
        AppMethodBeat.o(124593);
        continue;
        AppMethodBeat.o(124593);
      }
    }
  }

  public static void o(Context paramContext, String paramString1, String paramString2)
  {
    AppMethodBeat.i(124591);
    paramString1 = com.tencent.mm.h.a.jY(paramString1);
    if (paramString1 != null)
      paramString1.a(paramContext, new z.4(paramString2, paramContext), null);
    AppMethodBeat.o(124591);
  }

  public static void showAddrBookUploadConfirm(final Activity paramActivity, final Runnable paramRunnable, boolean paramBoolean, int paramInt)
  {
    AppMethodBeat.i(124587);
    if ((l.apS() != l.a.gvz) && (l.apS() != l.a.gvA))
    {
      ab.e("MicroMsg.PostLoginUtil", "not successfully binded, skip addrbook confirm");
      if (paramRunnable != null)
        paramRunnable.run();
      AppMethodBeat.o(124587);
    }
    while (true)
    {
      return;
      if (bo.e((Boolean)g.RP().Ry().get(12322, null)))
      {
        ab.d("MicroMsg.PostLoginUtil", "addrbook upload confirmed");
        break;
      }
      if ((!paramBoolean) && (bo.e((Boolean)g.RP().Ry().get(12323, null))))
      {
        ab.d("MicroMsg.PostLoginUtil", "addrbook upload login confirmed showed");
        break;
      }
      g.RP().Ry().set(12322, Boolean.FALSE);
      String str = bo.nullAsNil(bo.gP(paramActivity));
      if ((str.length() > 0) && (str.equals(g.RP().Ry().get(6, null))))
      {
        g.RP().Ry().set(12322, Boolean.TRUE);
        ab.i("MicroMsg.PostLoginUtil", "same none-nil phone number, leave it");
        break;
      }
      com.tencent.mm.ui.base.h.a(paramActivity, 2131297521, 2131297061, 2131297088, 2131296990, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          AppMethodBeat.i(124582);
          ab.i("MicroMsg.PostLoginUtil", "[cpan] kv report logid:%d scene:%d", new Object[] { Integer.valueOf(11438), Integer.valueOf(this.fwD) });
          com.tencent.mm.plugin.report.service.h.pYm.e(11438, new Object[] { Integer.valueOf(this.fwD) });
          g.RP().Ry().set(12322, Boolean.TRUE);
          z.syncUploadMContactStatus(true, false);
          a.anC();
          if (paramRunnable != null)
            paramRunnable.run();
          paramActivity.getSharedPreferences(ah.doA(), 0).edit().putBoolean("login_upload_contacts_already_displayed", true).commit();
          AppMethodBeat.o(124582);
        }
      }
      , new z.2(paramRunnable, paramActivity));
      g.RP().Ry().set(12323, Boolean.TRUE);
      AppMethodBeat.o(124587);
    }
  }

  public static void syncUploadMContactStatus(boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(124588);
    int i = r.YD();
    if (paramBoolean1)
    {
      i &= -131073;
      ab.d("MicroMsg.PostLoginUtil", "Reg By mobile update = ".concat(String.valueOf(i)));
      g.RP().Ry().set(7, Integer.valueOf(i));
      if (paramBoolean1)
        break label132;
    }
    label132: for (i = 1; ; i = 2)
    {
      act localact = new act();
      localact.wkw = 17;
      localact.pvD = i;
      ((j)g.K(j.class)).XL().c(new j.a(23, localact));
      if (paramBoolean2)
        com.tencent.mm.plugin.account.a.a.gkF.BS();
      AppMethodBeat.o(124588);
      return;
      i |= 131072;
      break;
    }
  }

  public static void vx(String paramString)
  {
    AppMethodBeat.i(124589);
    av.fly.ak("login_user_name", paramString);
    AppMethodBeat.o(124589);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.platformtools.z
 * JD-Core Version:    0.6.2
 */