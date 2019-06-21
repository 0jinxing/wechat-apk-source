package com.tencent.mm.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.booter.notification.f.a;
import com.tencent.mm.booter.notification.queue.b;
import com.tencent.mm.bp.d;
import com.tencent.mm.g.a.qb;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.t;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.mm.plugin.account.bind.ui.BindMContactIntroUI;
import com.tencent.mm.plugin.account.bind.ui.BindQQUI;
import com.tencent.mm.plugin.account.ui.LoginIndepPass;
import com.tencent.mm.plugin.account.ui.LoginPasswordUI;
import com.tencent.mm.plugin.account.ui.LoginUI;
import com.tencent.mm.plugin.account.ui.MobileInputUI;
import com.tencent.mm.plugin.account.ui.RegByMobileVoiceVerifyUI;
import com.tencent.mm.plugin.account.ui.SimpleLoginUI;
import com.tencent.mm.pluginsdk.model.app.l;
import com.tencent.mm.pluginsdk.n;
import com.tencent.mm.pluginsdk.r;
import com.tencent.mm.pluginsdk.r.a;
import com.tencent.mm.pluginsdk.ui.applet.g.a;
import com.tencent.mm.pluginsdk.ui.applet.q.a;
import com.tencent.mm.pluginsdk.ui.e.q;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.an;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.LauncherUI;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMActivity.a;
import com.tencent.mm.ui.MMAppMgr;
import com.tencent.mm.ui.MMWizardActivity;
import com.tencent.mm.ui.chatting.ChattingUI;
import com.tencent.mm.ui.contact.ContactRemarkInfoModUI;
import com.tencent.mm.ui.contact.ModRemarkNameUI;
import com.tencent.mm.ui.contact.SnsLabelContactListUI;
import com.tencent.mm.ui.tools.CountryCodeUI;
import com.tencent.mm.ui.tools.ShowImageUI;
import com.tencent.mm.ui.tools.a.a;
import com.tencent.mm.ui.transmit.MsgRetransmitUI;
import com.tencent.mm.ui.transmit.SelectConversationUI;

public final class y
  implements n
{
  public final void BV()
  {
    AppMethodBeat.i(15606);
    MMAppMgr.BV();
    AppMethodBeat.o(15606);
  }

  public final void a(Activity paramActivity, Intent paramIntent, int paramInt)
  {
    AppMethodBeat.i(15578);
    if (paramActivity != null)
    {
      paramIntent.setClassName(paramActivity, "com.tencent.mm.ui.tools.CropImageNewUI");
      paramActivity.startActivityForResult(paramIntent, paramInt);
    }
    AppMethodBeat.o(15578);
  }

  public final void a(Activity paramActivity, Intent paramIntent1, Intent paramIntent2, String paramString, int paramInt, a.a parama)
  {
    AppMethodBeat.i(15579);
    if (paramActivity != null)
    {
      paramIntent2.setClassName(paramActivity, "com.tencent.mm.ui.tools.CropImageNewUI");
      com.tencent.mm.ui.tools.a.b(paramActivity, paramIntent1, paramIntent2, paramString, paramInt, parama);
    }
    AppMethodBeat.o(15579);
  }

  public final void a(Context paramContext, Intent paramIntent1, Intent paramIntent2)
  {
    AppMethodBeat.i(15601);
    int i = paramIntent1.getIntExtra("from_source", 1);
    if (i == 1)
    {
      paramIntent1.setClass(paramContext, LoginUI.class);
      paramContext.startActivity(paramIntent1);
      AppMethodBeat.o(15601);
    }
    while (true)
    {
      return;
      if (i == 2)
      {
        paramIntent1.setClass(paramContext, LoginPasswordUI.class);
        paramContext.startActivity(paramIntent1);
        AppMethodBeat.o(15601);
      }
      else if (i == 3)
      {
        paramIntent1.setClass(paramContext, SimpleLoginUI.class);
        if (paramIntent2 != null)
        {
          MMWizardActivity.b(paramContext, paramIntent1, paramIntent2);
          AppMethodBeat.o(15601);
        }
        else
        {
          MMWizardActivity.J(paramContext, paramIntent1);
          AppMethodBeat.o(15601);
        }
      }
      else if (i == 5)
      {
        paramIntent1.setClass(paramContext, LoginIndepPass.class);
        paramContext.startActivity(paramIntent1);
        AppMethodBeat.o(15601);
      }
      else
      {
        if (i == 6)
        {
          paramIntent1.setClass(paramContext, MobileInputUI.class);
          paramIntent1.putExtra("mobile_input_purpose", 1);
          paramIntent1.putExtra("mobile_auth_type", 7);
          paramContext.startActivity(paramIntent1);
        }
        AppMethodBeat.o(15601);
      }
    }
  }

  public final void a(Intent paramIntent, int paramInt, MMActivity.a parama, MMActivity paramMMActivity)
  {
    AppMethodBeat.i(15605);
    if (paramMMActivity != null)
    {
      paramIntent.setClassName(paramMMActivity, "com.tencent.mm.ui.CheckCanSubscribeBizUI");
      paramMMActivity.b(parama, paramIntent, paramInt);
    }
    AppMethodBeat.o(15605);
  }

  public final void a(Intent paramIntent1, int paramInt, MMActivity paramMMActivity, Intent paramIntent2)
  {
    AppMethodBeat.i(15576);
    paramIntent1.setClassName(paramMMActivity, "com.tencent.mm.ui.tools.CropImageNewUI");
    aw.ZK();
    com.tencent.mm.ui.tools.a.a(paramMMActivity, paramIntent2, paramIntent1, com.tencent.mm.model.c.XW(), paramInt);
    AppMethodBeat.o(15576);
  }

  public final void a(Intent paramIntent, Activity paramActivity)
  {
    AppMethodBeat.i(15582);
    paramIntent.setClass(paramActivity, ModRemarkNameUI.class);
    paramActivity.startActivityForResult(paramIntent, 2);
    AppMethodBeat.o(15582);
  }

  public final void a(Intent paramIntent, Activity paramActivity, int paramInt)
  {
    AppMethodBeat.i(15593);
    if (paramActivity != null)
    {
      paramIntent.setClassName(paramActivity, "com.tencent.mm.ui.contact.SnsAddressUI");
      paramActivity.startActivityForResult(paramIntent, paramInt);
    }
    AppMethodBeat.o(15593);
  }

  public final void a(Intent paramIntent, Context paramContext)
  {
    AppMethodBeat.i(15560);
    if (paramContext == null)
      AppMethodBeat.o(15560);
    while (true)
    {
      return;
      paramIntent.setClassName(paramContext, "com.tencent.mm.ui.contact.SayHiEditUI");
      paramContext.startActivity(paramIntent);
      AppMethodBeat.o(15560);
    }
  }

  public final void a(Intent paramIntent, MMActivity.a parama, MMActivity paramMMActivity)
  {
    AppMethodBeat.i(15588);
    if (paramMMActivity != null)
    {
      paramIntent.setClass(paramMMActivity, SelectConversationUI.class);
      paramMMActivity.b(parama, paramIntent, 0);
    }
    AppMethodBeat.o(15588);
  }

  public final void a(Intent paramIntent, MMActivity paramMMActivity)
  {
    AppMethodBeat.i(15575);
    paramIntent.setClass(paramMMActivity, SelectConversationUI.class);
    paramMMActivity.startActivityForResult(paramIntent, 1);
    AppMethodBeat.o(15575);
  }

  public final void a(final MMActivity paramMMActivity, final String paramString1, final WXMediaMessage paramWXMediaMessage, final String paramString2, final String paramString3)
  {
    AppMethodBeat.i(15574);
    String str = paramMMActivity.getResources().getString(2131296980);
    Object localObject = paramWXMediaMessage.title;
    str = str + (String)localObject;
    localObject = new g.a(paramMMActivity);
    ((g.a)localObject).cx(paramString2).ajC(str).KQ(2131298423);
    ((g.a)localObject).h(Boolean.TRUE).a(new q.a()
    {
      public final void a(boolean paramAnonymousBoolean, String paramAnonymousString, int paramAnonymousInt)
      {
        AppMethodBeat.i(15559);
        if (!paramAnonymousBoolean)
          AppMethodBeat.o(15559);
        while (true)
        {
          return;
          l.a(paramWXMediaMessage, paramString1, paramString3, paramString2, 3, null);
          if (!bo.isNullOrNil(paramAnonymousString))
          {
            qb localqb = new qb();
            localqb.cMq.cMr = paramString2;
            localqb.cMq.content = paramAnonymousString;
            localqb.cMq.type = t.nK(paramString2);
            localqb.cMq.flags = 0;
            com.tencent.mm.sdk.b.a.xxA.m(localqb);
          }
          com.tencent.mm.ui.base.h.bQ(paramMMActivity, paramMMActivity.getResources().getString(2131297050));
          com.tencent.mm.plugin.report.service.h.pYm.X(10910, "2");
          AppMethodBeat.o(15559);
        }
      }
    }).gud.show();
    AppMethodBeat.o(15574);
  }

  public final void a(MMWizardActivity paramMMWizardActivity, Intent paramIntent)
  {
    AppMethodBeat.i(15599);
    if (paramMMWizardActivity == null)
      AppMethodBeat.o(15599);
    while (true)
    {
      return;
      paramIntent.setClass(paramMMWizardActivity, MobileInputUI.class);
      MMWizardActivity.J(paramMMWizardActivity, paramIntent);
      AppMethodBeat.o(15599);
    }
  }

  public final void a(boolean paramBoolean1, boolean paramBoolean2, Context paramContext, String paramString, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(15595);
    if ((paramBoolean1) || (paramBoolean2))
    {
      if (com.tencent.mm.pluginsdk.h.b.a.a.b(paramString, paramContext, paramBoolean2))
        break label94;
      Toast.makeText(paramContext, paramContext.getString(2131304264), 0).show();
      AppMethodBeat.o(15595);
    }
    while (true)
    {
      return;
      Intent localIntent = new Intent();
      localIntent.putExtra("VideoPlayer_File_nam", paramString);
      localIntent.putExtra("VideoRecorder_VideoLength", paramInt1);
      localIntent.putExtra("VideoRecorder_VideoSize", paramInt2);
      d.b(paramContext, "subapp", ".ui.video.VideoPlayerUI", localIntent);
      label94: AppMethodBeat.o(15595);
    }
  }

  public final void b(Intent paramIntent, Activity paramActivity)
  {
    AppMethodBeat.i(15583);
    if (paramActivity != null)
    {
      paramIntent.setClass(paramActivity, CountryCodeUI.class);
      paramActivity.startActivityForResult(paramIntent, 100);
    }
    AppMethodBeat.o(15583);
  }

  public final void b(Intent paramIntent, Context paramContext)
  {
    AppMethodBeat.i(15561);
    if (paramContext == null)
      AppMethodBeat.o(15561);
    while (true)
    {
      return;
      Intent localIntent = paramIntent;
      if (paramIntent == null)
        localIntent = new Intent();
      d.f(paramContext, ".ui.tools.MultiStageCitySelectUI", localIntent);
      AppMethodBeat.o(15561);
    }
  }

  public final boolean b(Context paramContext, String paramString, Bundle paramBundle)
  {
    AppMethodBeat.i(15577);
    boolean bool = r.a.vax.a(paramContext, paramString, false, paramBundle);
    AppMethodBeat.o(15577);
    return bool;
  }

  public final boolean b(Context paramContext, String paramString, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(15604);
    boolean bool = r.a.vax.c(paramContext, paramString, paramArrayOfObject);
    AppMethodBeat.o(15604);
    return bool;
  }

  public final void bf(Context paramContext)
  {
    AppMethodBeat.i(15562);
    d.b(paramContext, "setting", ".ui.setting.EditSignatureUI", new Intent());
    AppMethodBeat.o(15562);
  }

  public final com.tencent.mm.ui.widget.a.c bg(Context paramContext)
  {
    AppMethodBeat.i(15571);
    paramContext = MMAppMgr.bg(paramContext);
    AppMethodBeat.o(15571);
    return paramContext;
  }

  public final Intent bh(Context paramContext)
  {
    AppMethodBeat.i(15586);
    paramContext = new Intent(paramContext, LauncherUI.class).addFlags(67108864);
    AppMethodBeat.o(15586);
    return paramContext;
  }

  public final void bi(Context paramContext)
  {
    AppMethodBeat.i(15587);
    d.b(paramContext, "setting", ".ui.setting.SelfQRCodeUI", new Intent());
    AppMethodBeat.o(15587);
  }

  public final void bj(Context paramContext)
  {
    AppMethodBeat.i(15596);
    d.b(paramContext, "subapp", ".ui.openapi.AddAppUI", new Intent());
    AppMethodBeat.o(15596);
  }

  public final void c(Intent paramIntent, Context paramContext)
  {
    AppMethodBeat.i(15563);
    if (paramContext == null)
      AppMethodBeat.o(15563);
    while (true)
    {
      return;
      Intent localIntent = paramIntent;
      if (paramIntent == null)
        localIntent = new Intent();
      d.b(paramContext, "profile", ".ui.ContactInfoUI", localIntent);
      AppMethodBeat.o(15563);
    }
  }

  public final void cancelNotification(String paramString)
  {
    AppMethodBeat.i(15607);
    f.a.IO();
    if (paramString != null)
    {
      int i = b.IP().getId(paramString);
      ab.d("MicroMsg.Notification.Handle", "cancel : %s", new Object[] { paramString });
      b.IP().cancel(i);
    }
    AppMethodBeat.o(15607);
  }

  public final void d(Context paramContext, Intent paramIntent)
  {
    AppMethodBeat.i(15597);
    if (paramContext != null)
    {
      paramIntent.setClass(paramContext, ShowImageUI.class);
      paramContext.startActivity(paramIntent);
    }
    AppMethodBeat.o(15597);
  }

  public final void d(Intent paramIntent, Context paramContext)
  {
    AppMethodBeat.i(15564);
    if (paramContext == null)
      AppMethodBeat.o(15564);
    while (true)
    {
      return;
      Intent localIntent = paramIntent;
      if (paramIntent == null)
        localIntent = new Intent();
      paramIntent = localIntent.getStringExtra("Contact_User");
      if (paramIntent != null)
        com.tencent.mm.ui.contact.e.a(localIntent, paramIntent);
      ab.i("MicroMsg.WorkerUICallbackImpl", "startChattingUI %s %s", new Object[] { paramIntent, bo.dpG().toString() });
      localIntent.setClass(paramContext, ChattingUI.class);
      paramContext.startActivity(localIntent);
      AppMethodBeat.o(15564);
    }
  }

  public final void e(Context paramContext, Intent paramIntent)
  {
    AppMethodBeat.i(15598);
    if (paramContext == null)
      AppMethodBeat.o(15598);
    while (true)
    {
      return;
      d.b(paramContext, "account", ".security.ui.MySafeDeviceListUI", paramIntent);
      AppMethodBeat.o(15598);
    }
  }

  public final void e(Intent paramIntent, Context paramContext)
  {
    AppMethodBeat.i(15565);
    ab.i("MicroMsg.WorkerUICallbackImpl with result", "startChattingUI %s", new Object[] { bo.dpG().toString() });
    paramIntent.setClass(paramContext, ChattingUI.class);
    ((Activity)paramContext).startActivityForResult(paramIntent, 1);
    AppMethodBeat.o(15565);
  }

  public final void f(Context paramContext, Intent paramIntent)
  {
    AppMethodBeat.i(15600);
    if (paramContext == null)
      AppMethodBeat.o(15600);
    while (true)
    {
      return;
      paramIntent.setClass(paramContext, RegByMobileVoiceVerifyUI.class);
      paramContext.startActivity(paramIntent);
      AppMethodBeat.o(15600);
    }
  }

  public final void f(Intent paramIntent, Context paramContext)
  {
    AppMethodBeat.i(15566);
    if (paramContext == null)
      AppMethodBeat.o(15566);
    while (true)
    {
      return;
      paramIntent.setClass(paramContext, BindMContactIntroUI.class);
      MMWizardActivity.J(paramContext, paramIntent);
      AppMethodBeat.o(15566);
    }
  }

  public final void g(Context paramContext, Intent paramIntent)
  {
    AppMethodBeat.i(15602);
    if (paramContext == null)
      AppMethodBeat.o(15602);
    while (true)
    {
      return;
      d.a(paramContext, "account", ".security.ui.SecurityAccountIntroUI", paramIntent);
      AppMethodBeat.o(15602);
    }
  }

  public final void g(Intent paramIntent, Context paramContext)
  {
    AppMethodBeat.i(15567);
    if (paramContext == null)
      AppMethodBeat.o(15567);
    while (true)
    {
      return;
      Intent localIntent = paramIntent;
      if (paramIntent == null)
        localIntent = new Intent();
      localIntent.setClass(paramContext, BindQQUI.class);
      MMWizardActivity.J(paramContext, localIntent);
      AppMethodBeat.o(15567);
    }
  }

  public final void h(Context paramContext, Intent paramIntent)
  {
    AppMethodBeat.i(15603);
    paramIntent.setClassName(paramContext, "com.tencent.mm.ui.contact.SelectSpecialContactUI");
    paramContext.startActivity(paramIntent);
    AppMethodBeat.o(15603);
  }

  public final void h(Intent paramIntent, Context paramContext)
  {
    AppMethodBeat.i(15568);
    paramIntent.setClass(paramContext, LauncherUI.class).addFlags(67108864);
    paramContext.startActivity(paramIntent);
    AppMethodBeat.o(15568);
  }

  public final void i(Intent paramIntent, Context paramContext)
  {
    AppMethodBeat.i(15569);
    if (paramContext == null)
      AppMethodBeat.o(15569);
    while (true)
    {
      return;
      Intent localIntent = paramIntent;
      if (paramIntent == null)
        localIntent = new Intent();
      d.b(paramContext, "webview", ".ui.tools.WebViewUI", localIntent);
      AppMethodBeat.o(15569);
    }
  }

  public final void j(Intent paramIntent, Context paramContext)
  {
    AppMethodBeat.i(15570);
    q.h(paramContext, paramIntent.getBundleExtra("reportArgs"));
    AppMethodBeat.o(15570);
  }

  public final void k(Intent paramIntent, Context paramContext)
  {
    AppMethodBeat.i(15572);
    if (paramContext != null)
    {
      if (paramIntent.getIntExtra("Retr_Msg_Type", -1) < 0)
        paramIntent.putExtra("Retr_Msg_Type", 4);
      paramIntent.setClass(paramContext, MsgRetransmitUI.class);
      paramContext.startActivity(paramIntent);
    }
    AppMethodBeat.o(15572);
  }

  public final void l(Intent paramIntent, Context paramContext)
  {
    AppMethodBeat.i(15573);
    if (paramContext != null)
    {
      paramIntent.putExtra("Ksnsupload_type", 2);
      d.b(paramContext, "sns", ".ui.SnsUploadUI", paramIntent);
    }
    AppMethodBeat.o(15573);
  }

  public final void m(Intent paramIntent, Context paramContext)
  {
    AppMethodBeat.i(15580);
    if (paramContext != null)
    {
      paramIntent.setClass(paramContext, ContactRemarkInfoModUI.class);
      paramContext.startActivity(paramIntent);
    }
    AppMethodBeat.o(15580);
  }

  public final void n(Intent paramIntent, Context paramContext)
  {
    AppMethodBeat.i(15581);
    if (paramContext != null)
    {
      paramIntent.setClass(paramContext, ModRemarkNameUI.class);
      paramContext.startActivity(paramIntent);
    }
    AppMethodBeat.o(15581);
  }

  public final void o(Intent paramIntent, Context paramContext)
  {
    AppMethodBeat.i(15584);
    if (paramContext != null)
      d.b(paramContext, "setting", ".ui.setting.SettingsLanguageUI", paramIntent);
    AppMethodBeat.o(15584);
  }

  public final void p(Intent paramIntent, Context paramContext)
  {
    AppMethodBeat.i(15585);
    if ((paramIntent != null) && (paramContext != null))
    {
      paramIntent.setClass(paramContext, LauncherUI.class).addFlags(67108864);
      paramContext.startActivity(paramIntent);
    }
    AppMethodBeat.o(15585);
  }

  public final void q(Intent paramIntent, Context paramContext)
  {
    AppMethodBeat.i(15589);
    Intent localIntent = new Intent();
    localIntent.putExtras(paramIntent.getExtras());
    if (paramIntent.getFlags() != 0)
      localIntent.addFlags(paramIntent.getFlags());
    d.b(paramContext, "subapp", ".ui.gallery.GestureGalleryUI", localIntent);
    AppMethodBeat.o(15589);
  }

  public final void r(Intent paramIntent, Context paramContext)
  {
    AppMethodBeat.i(15590);
    Intent localIntent = new Intent();
    localIntent.putExtras(paramIntent.getExtras());
    if (paramIntent.getFlags() != 0)
      localIntent.addFlags(paramIntent.getFlags());
    com.tencent.mm.pluginsdk.e.fC(paramContext);
    AppMethodBeat.o(15590);
  }

  public final void s(Intent paramIntent, Context paramContext)
  {
    AppMethodBeat.i(15591);
    if (paramContext != null)
    {
      Intent localIntent = new Intent();
      localIntent.putExtras(paramIntent.getExtras());
      if (paramIntent.getFlags() != 0)
        localIntent.addFlags(paramIntent.getFlags());
      d.b(paramContext, "subapp", ".ui.pluginapp.ContactSearchUI", localIntent);
    }
    AppMethodBeat.o(15591);
  }

  public final void t(Intent paramIntent, Context paramContext)
  {
    AppMethodBeat.i(15592);
    if (paramContext != null)
    {
      Intent localIntent = new Intent();
      localIntent.putExtras(paramIntent.getExtras());
      if (paramIntent.getFlags() != 0)
        localIntent.addFlags(paramIntent.getFlags());
      d.b(paramContext, "subapp", ".ui.pluginapp.ContactSearchResultUI", localIntent);
    }
    AppMethodBeat.o(15592);
  }

  public final void u(Intent paramIntent, Context paramContext)
  {
    AppMethodBeat.i(15594);
    paramIntent.setClass(paramContext, SnsLabelContactListUI.class);
    paramContext.startActivity(paramIntent);
    AppMethodBeat.o(15594);
  }

  public final void v(Context paramContext, String paramString)
  {
    AppMethodBeat.i(15608);
    r.a.vax.a(paramContext, paramString, true);
    AppMethodBeat.o(15608);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.app.y
 * JD-Core Version:    0.6.2
 */