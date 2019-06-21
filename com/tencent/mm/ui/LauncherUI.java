package com.tencent.mm.ui;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ActivityManager.RunningTaskInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Looper;
import android.os.MessageQueue;
import android.os.Process;
import android.support.v7.app.ActionBar;
import android.util.DisplayMetrics;
import android.view.ActionMode;
import android.view.ActionMode.Callback;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import com.tencent.mars.BaseEvent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.blink.FirstScreenFrameLayout;
import com.tencent.mm.booter.NotifyReceiver;
import com.tencent.mm.g.a.ac;
import com.tencent.mm.g.a.az;
import com.tencent.mm.g.a.az.b;
import com.tencent.mm.g.a.ez;
import com.tencent.mm.g.a.jd;
import com.tencent.mm.g.a.x;
import com.tencent.mm.kernel.l;
import com.tencent.mm.model.an;
import com.tencent.mm.model.av;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.bx;
import com.tencent.mm.model.bz;
import com.tencent.mm.model.s;
import com.tencent.mm.plugin.account.ui.WelcomeActivity;
import com.tencent.mm.plugin.account.ui.WelcomeSelectView;
import com.tencent.mm.plugin.account.ui.WelcomeView;
import com.tencent.mm.plugin.performance.elf.MainProcessChecker;
import com.tencent.mm.plugin.setting.ui.setting.SettingsSwitchAccountUI;
import com.tencent.mm.pluginsdk.f.e.a;
import com.tencent.mm.pluginsdk.g.a.a.o;
import com.tencent.mm.pluginsdk.model.app.am;
import com.tencent.mm.pluginsdk.u;
import com.tencent.mm.sdk.e.n.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.be;
import com.tencent.mm.ui.base.CustomViewPager;
import com.tencent.mm.ui.chatting.BaseChattingUIFragment;
import com.tencent.mm.ui.conversation.MainUI;
import com.tencent.mm.ui.widget.SwipeBackLayout;
import com.tencent.mm.ui.widget.listview.PullDownListView;
import com.tencent.mm.xlog.app.XLogSetup;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

@com.tencent.mm.ui.base.a(3)
@TargetApi(11)
public class LauncherUI extends MMFragmentActivity
{
  private static ArrayList<LauncherUI> yjE;
  private static ArrayList<WeakReference<LauncherUI>> yjF;
  private static boolean yjG;
  public static long yjH;
  private static boolean yjI;
  private static boolean yjR;
  private Intent cEp;
  private NewChattingTabUI chattingTabUI;
  public HomeUI yjJ;
  private n yjK;
  public boolean yjL;
  boolean yjM;
  private boolean yjN;
  private WelcomeView yjO;
  private u yjP;
  com.tencent.mm.app.t yjQ;
  private boolean yjS;
  private ak yjT;
  private Runnable yjU;

  static
  {
    AppMethodBeat.i(29485);
    yjE = new ArrayList();
    yjF = new ArrayList();
    yjG = true;
    yjI = false;
    yjR = false;
    AppMethodBeat.o(29485);
  }

  public LauncherUI()
  {
    AppMethodBeat.i(29448);
    this.yjJ = new HomeUI();
    this.chattingTabUI = new NewChattingTabUI(this.yjJ);
    this.yjK = new n();
    this.cEp = null;
    this.yjL = false;
    this.yjM = false;
    this.yjN = false;
    this.yjP = new u("MicroMsg.LauncherUI");
    this.yjS = false;
    this.yjT = new ak();
    this.yjU = new LauncherUI.4(this);
    AppMethodBeat.o(29448);
  }

  private void aQ(Intent paramIntent)
  {
    AppMethodBeat.i(29460);
    ab.i("MicroMsg.LauncherUI", "handleJump");
    if (!aw.RK())
    {
      ab.i("MicroMsg.LauncherUI", "handleJump not accHhasReady");
      startActivity(new Intent(this, LauncherUI.class).putExtra("Intro_Switch", true).addFlags(67108864));
      finish();
      AppMethodBeat.o(29460);
    }
    while (true)
    {
      return;
      localObject1 = new jd();
      ((jd)localObject1).cEo.cEp = this.cEp;
      com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject1);
      if ("talkroom_notification".equals(com.tencent.mm.sdk.platformtools.w.n(paramIntent, "nofification_type")))
      {
        localObject1 = com.tencent.mm.sdk.platformtools.w.n(paramIntent, "enter_chat_usrname");
        if (!bo.isNullOrNil((String)localObject1))
        {
          paramIntent = new Intent();
          paramIntent.putExtra("enter_room_username", (String)localObject1);
          paramIntent.setFlags(268435456);
          com.tencent.mm.bp.d.b(this, "talkroom", ".ui.TalkRoomUI", paramIntent);
        }
        AppMethodBeat.o(29460);
      }
      else
      {
        if ("back_to_pcmgr_notification".equals(paramIntent.getStringExtra("nofification_type")))
        {
          if (!paramIntent.getBooleanExtra("newPCBackup", true))
            ab.i("MicroMsg.LauncherUI", "MicroMsg.Backup jump BakToPcUI");
          for (paramIntent = new Intent().setClassName(this, "com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcui.BakToPcUI"); ; paramIntent = new Intent().setClassName(this, "com.tencent.mm.plugin.backup.backuppcui.BackupPcUI"))
          {
            paramIntent.setFlags(268435456);
            MMWizardActivity.J(this, paramIntent);
            AppMethodBeat.o(29460);
            break;
            ab.i("MicroMsg.LauncherUI", "MicroMsg.Backup jump BackupPcUI");
          }
        }
        if ("back_to_pcmgr_error_notification".equals(paramIntent.getStringExtra("nofification_type")))
        {
          paramIntent = new Intent().setClassName(this, "com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcui.BakConnErrorUI");
          paramIntent.setFlags(268435456);
          MMWizardActivity.J(this, paramIntent);
          AppMethodBeat.o(29460);
        }
        else
        {
          if (!"backup_move_notification".equals(paramIntent.getStringExtra("nofification_type")))
            break;
          paramIntent = new Intent().setClassName(this, "com.tencent.mm.plugin.backup.backupmoveui.BackupMoveRecoverUI");
          paramIntent.setFlags(268435456);
          MMWizardActivity.J(this, paramIntent);
          AppMethodBeat.o(29460);
        }
      }
    }
    if (com.tencent.mm.sdk.platformtools.w.a(paramIntent, "show_update_dialog", false))
      aR(paramIntent);
    String str = com.tencent.mm.sdk.platformtools.w.n(paramIntent, "Main_User");
    Object localObject1 = com.tencent.mm.sdk.platformtools.w.n(paramIntent, "nofification_type");
    ab.i("MicroMsg.LauncherUI", "[handleJump] user:%s", new Object[] { str });
    Object localObject2;
    int i;
    if ((str != null) && (!str.equals("")))
    {
      aw.ZK();
      localObject2 = com.tencent.mm.model.c.XR().aoZ(str);
      if (localObject2 != null)
      {
        i = ((com.tencent.mm.g.c.at)localObject2).field_unReadCount;
        label442: ab.i("MicroMsg.LauncherUI", "[oneliang] user:%s, conversation :%s, unReadCount:%s", new Object[] { str, localObject2, Integer.valueOf(i) });
      }
    }
    while (true)
    {
      int j = i;
      if (i == 0)
        j = com.tencent.mm.sdk.platformtools.w.a(paramIntent, "pushcontent_unread_count", 0);
      MMAppMgr.BV();
      com.tencent.mm.sdk.b.a.xxA.m(new ac());
      boolean bool = com.tencent.mm.sdk.platformtools.w.a(paramIntent, "Intro_Is_Muti_Talker", true);
      ab.i("MicroMsg.LauncherUI", "handleJump, isMutiTalker:%b, unReadCount:%d", new Object[] { Boolean.valueOf(bool), Integer.valueOf(j) });
      if ((!bool) && (j > 0))
      {
        i = com.tencent.mm.sdk.platformtools.w.a(paramIntent, "Intro_Bottle_unread_count", 0);
        if (i > 0)
        {
          ab.i("MicroMsg.LauncherUI", "handleJump, bottleReadCnt :%d", new Object[] { Integer.valueOf(i) });
          com.tencent.mm.bp.d.H(this, "bottle", ".ui.BottleConversationUI");
        }
      }
      if (!bool)
      {
        if (com.tencent.mm.model.t.np(str))
        {
          ab.i("MicroMsg.LauncherUI", "handleJump, isReaderAppNewsHelper");
          localObject1 = new Intent();
          ((Intent)localObject1).addFlags(67108864);
          ((Intent)localObject1).putExtra("type", 20);
          com.tencent.mm.bp.d.b(this, "readerapp", ".ui.ReaderAppUI", (Intent)localObject1);
        }
        while (true)
        {
          if (com.tencent.mm.sdk.platformtools.w.a(paramIntent, "kstyle_show_bind_mobile_afterauth", 0) > 0)
          {
            localObject1 = new Intent();
            ((Intent)localObject1).setClassName(this, "com.tencent.mm.plugin.account.bind.ui.BindMobileUI");
            ((Intent)localObject1).putExtra("kstyle_bind_recommend_show", paramIntent.getIntExtra("kstyle_bind_recommend_show", 0));
            ((Intent)localObject1).putExtra("kstyle_bind_wording", paramIntent.getParcelableExtra("kstyle_bind_wording"));
            MMWizardActivity.J(this, (Intent)localObject1);
          }
          AppMethodBeat.o(29460);
          break;
          if (!com.tencent.mm.model.t.nx(str))
            break label783;
          ab.i("MicroMsg.LauncherUI", "handleJump, isReaderAppWeiboHelper");
          localObject1 = new Intent();
          ((Intent)localObject1).addFlags(67108864);
          ((Intent)localObject1).putExtra("type", 11);
          com.tencent.mm.bp.d.b(this, "readerapp", ".ui.ReaderAppUI", (Intent)localObject1);
        }
        label783: if (paramIntent.getIntExtra("MainUI_User_Last_Msg_Type", 34) != 34)
          break label1388;
      }
      label1377: label1388: for (i = 2; ; i = 1)
      {
        localObject1 = new Bundle();
        ((Bundle)localObject1).putInt("Chat_Mode", i);
        if ("new_msg_nofification".equals(com.tencent.mm.sdk.platformtools.w.n(paramIntent, "nofification_type")))
          ((Bundle)localObject1).putInt("chat_from_scene", 1);
        localObject2 = getInstance();
        if (localObject2 == null)
          break;
        if (com.tencent.mm.aj.f.kq(str))
        {
          paramIntent.putExtra("Contact_User", str);
          paramIntent.addFlags(67108864);
          paramIntent.putExtra("biz_chat_from_scene", 4);
          com.tencent.mm.bp.d.f(this, ".ui.bizchat.BizChatConversationUI", paramIntent);
          break;
        }
        if (com.tencent.mm.aj.f.rd(str))
        {
          localObject1 = com.tencent.mm.aj.f.qX(str);
          if (localObject1 == null);
          for (localObject1 = null; ; localObject1 = ((com.tencent.mm.aj.d)localObject1).adT())
          {
            localObject2 = localObject1;
            if (localObject1 == null)
              localObject2 = "";
            paramIntent.putExtra("rawUrl", (String)localObject2);
            paramIntent.putExtra("useJs", true);
            paramIntent.putExtra("srcUsername", str);
            paramIntent.putExtra("bizofstartfrom", "enterpriseHomeSubBrand");
            paramIntent.addFlags(67108864);
            com.tencent.mm.bp.d.b(this, "webview", ".ui.tools.WebViewUI", paramIntent);
            break;
          }
        }
        if (ad.mg(str))
        {
          paramIntent.putExtra("Contact_User", str);
          paramIntent.addFlags(67108864);
          paramIntent.putExtra("app_brand_conversation_from_scene", 3);
          paramIntent.putExtra("finish_direct", true);
          paramIntent.putExtra("key_need_send_video", false);
          com.tencent.mm.bp.d.f(this, ".ui.conversation.AppBrandServiceConversationUI", paramIntent);
          break;
        }
        ((LauncherUI)localObject2).startChatting(str, (Bundle)localObject1, false);
        break;
        if (com.tencent.mm.sdk.platformtools.w.a(paramIntent, "From_fail_notify", false))
        {
          if (!bo.isNullOrNil(str))
          {
            localObject2 = getInstance();
            if (localObject2 == null)
              break;
            localObject1 = new Bundle();
            ((Bundle)localObject1).putBoolean("Chat_Mode", com.tencent.mm.sdk.platformtools.w.a(paramIntent, "resend_fail_messages", false));
            if (com.tencent.mm.aj.f.kq(str))
            {
              paramIntent.putExtra("Contact_User", str);
              paramIntent.addFlags(67108864);
              paramIntent.putExtra("biz_chat_from_scene", 4);
              com.tencent.mm.bp.d.f(this, ".ui.bizchat.BizChatConversationUI", paramIntent);
              break;
            }
            ((LauncherUI)localObject2).startChatting(str, (Bundle)localObject1, false);
            break;
          }
          if (!com.tencent.mm.sdk.platformtools.w.a(paramIntent, "jump_sns_from_notify", false))
            break;
          localObject1 = new Intent();
          ((Intent)localObject1).addFlags(67108864);
          ((Intent)localObject1).putExtra("is_need_resend_sns", paramIntent.getBooleanExtra("is_need_resend_sns", false));
          ((Intent)localObject1).putExtra("sns_resume_state", paramIntent.getBooleanExtra("sns_resume_state", false));
          ((Intent)localObject1).putExtra("sns_timeline_NeedFirstLoadint", paramIntent.getBooleanExtra("sns_timeline_NeedFirstLoadint", false));
          com.tencent.mm.bp.d.b(this, "sns", ".ui.SnsTimeLineUI", (Intent)localObject1);
          break;
        }
        if (com.tencent.mm.sdk.platformtools.w.a(paramIntent, "biz_chat_need_to_jump_to_chatting_ui", false))
        {
          if ((getInstance() == null) || (!com.tencent.mm.aj.f.kq(str)))
            break;
          paramIntent.putExtra("Contact_User", str);
          paramIntent.addFlags(67108864);
          com.tencent.mm.bp.d.f(this, ".ui.bizchat.BizChatConversationUI", paramIntent);
          break;
        }
        if ((bo.isNullOrNil(str)) || (!"new_msg_nofification".equals(localObject1)))
          break;
        if (paramIntent == null);
        for (localObject1 = "null"; ; localObject1 = paramIntent)
        {
          ab.w("MicroMsg.LauncherUI", "[handleJump] intent:%s", new Object[] { localObject1 });
          localObject1 = getInstance();
          if (localObject1 == null)
            break label1377;
          ((LauncherUI)localObject1).startChatting(str, new Bundle(), false);
          break;
        }
        ab.w("MicroMsg.LauncherUI", "LauncherUI.getInstance is null! ");
        break;
      }
      i = 0;
      break label442;
      i = 0;
    }
  }

  private void aR(Intent paramIntent)
  {
    AppMethodBeat.i(29468);
    int i = com.tencent.mm.sdk.platformtools.w.a(paramIntent, "update_type", -1);
    if (i == -1)
    {
      ab.e("MicroMsg.LauncherUI", "showUpdateDialog is true, but updateType is -1");
      AppMethodBeat.o(29468);
    }
    com.tencent.mm.plugin.p.a locala;
    while (true)
    {
      return;
      com.tencent.mm.plugin.report.service.h.pYm.a(405L, 28L, 1L, true);
      if (com.tencent.mm.plugin.p.d.bQU() == null)
        break label111;
      locala = com.tencent.mm.plugin.p.d.bQU().c(this, null);
      if (locala != null)
        break;
      AppMethodBeat.o(29468);
    }
    paramIntent = com.tencent.mm.plugin.report.service.h.pYm;
    if (i == 2);
    for (long l = 29L; ; l = 30L)
    {
      paramIntent.a(405L, l, 1L, true);
      locala.update(i);
      label111: AppMethodBeat.o(29468);
      break;
    }
  }

  public static int dxE()
  {
    AppMethodBeat.i(29450);
    int i;
    if ((getInstance() != null) && (getInstance().getHomeUI() != null) && (getInstance().getHomeUI().getMainTabUI() != null))
    {
      i = getInstance().getHomeUI().getMainTabUI().mbt;
      AppMethodBeat.o(29450);
    }
    while (true)
    {
      return i;
      i = -1;
      AppMethodBeat.o(29450);
    }
  }

  private void dxF()
  {
    AppMethodBeat.i(29451);
    int i = yjE.indexOf(this);
    if (i >= 0)
      yjE.remove(i);
    ab.i("MicroMsg.LauncherUI", "checktask delteInstance index %d, size:%d, hashCode: 0x%x", new Object[] { Integer.valueOf(i), Integer.valueOf(yjE.size()), Integer.valueOf(hashCode()) });
    AppMethodBeat.o(29451);
  }

  private void dxG()
  {
    AppMethodBeat.i(29453);
    ab.d("MicroMsg.LauncherUI", "[whatsnew] checkIfStartWhatsNew.");
    if (yjR)
    {
      ab.i("MicroMsg.LauncherUI", "[whatsnew] has been played.");
      AppMethodBeat.o(29453);
    }
    while (true)
    {
      return;
      if (!com.tencent.mm.kernel.g.RN().QY())
      {
        com.tencent.mm.kernel.g.RN();
        if (!com.tencent.mm.kernel.a.QX())
        {
          ab.i("MicroMsg.LauncherUI", "[whatsnew] not login yet, skip.");
          AppMethodBeat.o(29453);
        }
        else
        {
          ab.i("MicroMsg.LauncherUI", "[whatsnew] account not initiate, skip whatsnew.");
          AppMethodBeat.o(29453);
        }
      }
      else if (!dxH())
      {
        ab.i("MicroMsg.LauncherUI", "[whatsnew] notSwitchOrHold is false, skip whatsnew.");
        AppMethodBeat.o(29453);
      }
      else if ((!com.tencent.mm.sdk.platformtools.w.a(getIntent(), "LauncherUI.enter_from_reg", false)) && (com.tencent.mm.pluginsdk.f.e.vdx != null) && (com.tencent.mm.pluginsdk.f.e.vdx.Ch()) && (aw.RK()))
      {
        if (aj.amA("show_whatsnew"))
        {
          yjR = true;
          ab.i("MicroMsg.LauncherUI", "[whatsnew] show whatsnew.");
          MMAppMgr.aq(this);
          com.tencent.mm.blink.a.HL();
          AppMethodBeat.o(29453);
        }
      }
      else
      {
        ab.d("MicroMsg.LauncherUI", "[whatsnew] do not show whatsnew.");
        AppMethodBeat.o(29453);
      }
    }
  }

  private boolean dxH()
  {
    boolean bool = false;
    AppMethodBeat.i(29457);
    if ((this.cEp != null) && (!com.tencent.mm.sdk.platformtools.w.a(this.cEp, "Intro_Switch", false)) && (aw.ZM()) && (!aw.QT()))
    {
      bool = true;
      AppMethodBeat.o(29457);
    }
    while (true)
    {
      return bool;
      AppMethodBeat.o(29457);
    }
  }

  private boolean dxI()
  {
    boolean bool = true;
    AppMethodBeat.i(29458);
    if (this.cEp != null)
      if ((com.tencent.mm.sdk.platformtools.w.a(this.cEp, "absolutely_exit", false)) || (com.tencent.mm.sdk.platformtools.w.a(this.cEp, "absolutely_exit_pid", 0) == Process.myPid()))
      {
        ab.w("MicroMsg.LauncherUI", "resumeLogoutJump launcherOnResume exit absolutely!!! hashCode[%d]", new Object[] { Integer.valueOf(hashCode()) });
        finish();
        com.tencent.mm.plugin.report.service.g.BP(8);
        MMAppMgr.pQ(com.tencent.mm.sdk.platformtools.w.a(this.cEp, "kill_service", true));
        System.exit(0);
        AppMethodBeat.o(29458);
      }
    while (true)
    {
      return bool;
      if (com.tencent.mm.sdk.platformtools.w.a(this.cEp, "can_finish", false))
      {
        ab.i("MicroMsg.LauncherUI", "resumeLogoutJump exit obviously");
        aw.Rg().cD(true);
        if (l.bL(getApplicationContext()))
          com.tencent.mm.booter.b.bm(getApplicationContext());
        com.tencent.mm.plugin.report.service.g.BP(8);
        sendBroadcast(new Intent("com.tencent.mm.ui.ACTION_FORCE_DEACTIVE"), "com.tencent.mm.permission.MM_MESSAGE");
        finish();
        com.tencent.mm.ui.base.b.hM(this);
        AppMethodBeat.o(29458);
      }
      else if (com.tencent.mm.sdk.platformtools.w.a(this.cEp, "exit_and_restart", false))
      {
        com.tencent.mrs.a.onDestroy();
        BaseEvent.onSingalCrash(0);
        ab.i("MicroMsg.LauncherUI", "exit and restart myself.");
        ab.dot();
        finish();
        Intent localIntent = new Intent(this, LauncherUI.class);
        localIntent.addFlags(67108864);
        startActivity(localIntent);
        ab.i("MicroMsg.LauncherUI", "restart, try to kill mm pid %d", new Object[] { Integer.valueOf(Process.myPid()) });
        MMAppMgr.dys();
        Process.killProcess(Process.myPid());
        AppMethodBeat.o(29458);
      }
      else
      {
        AppMethodBeat.o(29458);
        bool = false;
      }
    }
  }

  private void dxJ()
  {
    AppMethodBeat.i(138622);
    Intent localIntent = new Intent();
    String str = av.fly.T("login_weixin_username", "");
    localIntent.putParcelableArrayListExtra("key_switch_account_users", this.cEp.getParcelableArrayListExtra("key_switch_account_users"));
    localIntent.putExtra("key_switch_from_wx_username", str);
    str = com.tencent.mm.sdk.platformtools.aa.g(getSharedPreferences(com.tencent.mm.sdk.platformtools.ah.doA(), 0));
    float f = com.tencent.mm.bz.a.dm(this);
    localIntent.putExtra("key_langauage_code", str);
    localIntent.putExtra("key_font_scale_size", f);
    ab.i("MicroMsg.LauncherUI", "mm pid %d", new Object[] { Integer.valueOf(Process.myPid()) });
    localIntent.putExtra("key_mm_process_pid", Process.myPid());
    localIntent.setClassName(this, "com.tencent.mm.plugin.setting.ui.setting.FakeSwitchAccountUI");
    startActivity(localIntent);
    com.tencent.mm.ui.base.b.hN(this);
    AppMethodBeat.o(138622);
  }

  private void dxK()
  {
    AppMethodBeat.i(29459);
    Object localObject = com.tencent.mm.sdk.platformtools.ah.getContext().getSharedPreferences("switch_account_preferences", 0);
    ab.i("MicroMsg.LauncherUI", "switch to wxid %s", new Object[] { ((SharedPreferences)localObject).getString("last_switch_account_to_wx_username", "") });
    ((SharedPreferences)localObject).edit().putBoolean("transit_to_switch_account", false).commit();
    localObject = new Intent();
    ((Intent)localObject).setClass(this, SettingsSwitchAccountUI.class);
    ((Intent)localObject).addFlags(536870912);
    ((Intent)localObject).putExtra("key_scene", 1);
    startActivity((Intent)localObject);
    com.tencent.mm.ui.base.b.hN(this);
    AppMethodBeat.o(29459);
  }

  private void dxL()
  {
    AppMethodBeat.i(29461);
    ab.i("MicroMsg.LauncherUI", "resumeLogoutJump");
    MMFragmentActivity.a.dyv();
    Object localObject = av.fly.T("login_user_name", "");
    if ((!aw.ZM()) && (((String)localObject).equals("")))
    {
      startActivity(new Intent(this, WelcomeActivity.class));
      com.tencent.mm.ui.base.b.hN(this);
      ab.i("MicroMsg.LauncherUI", "resumeLogoutJump but has not login and ret");
      al.af(this.yjU);
      al.n(this.yjU, 2000L);
      AppMethodBeat.o(29461);
    }
    while (true)
    {
      return;
      com.tencent.mm.plugin.report.service.g.BP(8);
      com.tencent.mm.kernel.g.RO().Rf();
      if ((this.cEp.getFlags() & 0x4000000) == 67108864);
      boolean bool2;
      for (boolean bool1 = true; ; bool1 = false)
      {
        bool2 = com.tencent.mm.sdk.platformtools.w.a(this.cEp, "Intro_Notify", false);
        ab.i("MicroMsg.LauncherUI", "resumeLogoutJump hasDoInit:%b needResetLaunchUI:%b formNotification:%b, ishold:%b", new Object[] { Boolean.valueOf(this.yjL), Boolean.valueOf(bool1), Boolean.valueOf(bool2), Boolean.valueOf(aw.QT()) });
        ab.i("MicroMsg.LauncherUI", "doOnResumeImp resumeLogoutJump hasCfgDefaultUin[%b]", new Object[] { Boolean.valueOf(aw.ZM()) });
        this.yjJ.getMainTabUI().dyy();
        if (!com.tencent.mm.sdk.platformtools.w.a(this.cEp, "key_transit_to_switch_account", false))
          break label322;
        ab.i("MicroMsg.LauncherUI", "transit to fake switch account");
        this.cEp.removeExtra("key_transit_to_switch_account");
        localObject = com.tencent.mm.sdk.platformtools.ah.getContext().getSharedPreferences("switch_account_preferences", 0);
        ((SharedPreferences)localObject).getString("last_switch_account_to_wx_username", "");
        ((SharedPreferences)localObject).edit().putBoolean("transit_to_switch_account", true).commit();
        dxJ();
        al.n(new LauncherUI.3(this), 500L);
        AppMethodBeat.o(29461);
        break;
      }
      label322: aw.hold();
      localObject = new x();
      com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject);
      if (com.tencent.mm.sdk.platformtools.w.a(getIntent(), "LauncherUI.From.Scaner.Shortcut", false))
        this.yjN = true;
      com.tencent.mm.kernel.g.RQ().lL("[" + this.yjL + " " + bool1 + " " + bool2 + "]");
      hn(this);
      aw.unhold();
      AppMethodBeat.o(29461);
    }
  }

  public static LauncherUI getInstance()
  {
    AppMethodBeat.i(29449);
    LauncherUI localLauncherUI;
    if (yjE.isEmpty())
    {
      ab.e("MicroMsg.LauncherUI", "LauncherUI instances should not be empty. %s", new Object[] { bo.dpG() });
      localLauncherUI = null;
      AppMethodBeat.o(29449);
    }
    while (true)
    {
      return localLauncherUI;
      localLauncherUI = (LauncherUI)yjE.get(0);
      AppMethodBeat.o(29449);
    }
  }

  private void hn(Context paramContext)
  {
    AppMethodBeat.i(29462);
    if (com.tencent.mm.sdk.platformtools.w.a(this.cEp, "LauncherUI.jump_switch_account", false))
    {
      ab.i("MicroMsg.LauncherUI", "launcher to switch account");
      dxK();
      this.cEp.removeExtra("LauncherUI.jump_switch_account");
      AppMethodBeat.o(29462);
    }
    while (true)
    {
      return;
      if ((com.tencent.mm.sdk.platformtools.w.a(this.cEp, "Intro_Switch", false)) || (this.yjL) || (com.tencent.mm.kernel.a.QI()))
      {
        com.tencent.mrs.a.onDestroy();
        BaseEvent.onSingalCrash(0);
        ab.i("MicroMsg.LauncherUI", "switch users count %d", new Object[] { Integer.valueOf(bx.fnB.aat().size()) });
        ab.i("MicroMsg.LauncherUI", "checktask ConstantsUI.Intro.KSwitch kill myself.");
        ab.dot();
        finish();
        if (!com.tencent.mm.sdk.platformtools.ah.getContext().getSharedPreferences("switch_account_preferences", 0).getBoolean("transit_to_switch_account", false))
        {
          Intent localIntent = new Intent(paramContext, LauncherUI.class);
          localIntent.addFlags(67108864);
          paramContext.startActivity(localIntent);
        }
        ab.i("MicroMsg.LauncherUI", "try to kill mm pid %d", new Object[] { Integer.valueOf(Process.myPid()) });
        MMAppMgr.dys();
        Process.killProcess(Process.myPid());
        AppMethodBeat.o(29462);
      }
      else
      {
        if (!com.tencent.mm.sdk.platformtools.w.a(this.cEp, "LauncherUI.jump_switch_account", false))
        {
          paramContext = av.fly.T("login_user_name", "");
          ab.i("MicroMsg.LauncherUI", "jumpToLogin %s", new Object[] { paramContext });
          if (!bo.isNullOrNil(paramContext))
            break;
          startActivity(new Intent(this, WelcomeActivity.class));
          com.tencent.mm.ui.base.b.hN(this);
          com.tencent.mm.plugin.report.service.g.BP(8);
          al.af(this.yjU);
          al.n(this.yjU, 2000L);
        }
        AppMethodBeat.o(29462);
      }
    }
    boolean bool = com.tencent.mm.sdk.platformtools.ah.getContext().getSharedPreferences("switch_account_preferences", 0).getBoolean("last_logout_switch_account", false);
    ab.i("MicroMsg.LauncherUI", "switchAccount %s", new Object[] { Boolean.valueOf(bool) });
    if (bool)
    {
      paramContext = new Intent(this, SettingsSwitchAccountUI.class);
      paramContext.addFlags(67108864);
      paramContext.putExtra("key_scene", 2);
      startActivity(paramContext);
    }
    while (true)
    {
      com.tencent.mm.ui.base.b.hK(this);
      break;
      int i = bo.ank(av.fly.T("last_login_use_voice", ""));
      ab.i("MicroMsg.LauncherUI", "pluginSwitch  ".concat(String.valueOf(i)));
      if ((i & 0x20000) != 0)
        startActivity(new Intent().setClassName(this, "com.tencent.mm.plugin.account.ui.LoginVoiceUI"));
      else
        startActivity(new Intent().setClassName(this, "com.tencent.mm.plugin.account.ui.LoginPasswordUI"));
    }
  }

  public static void ho(Context paramContext)
  {
    AppMethodBeat.i(29480);
    Intent localIntent = new Intent(paramContext, LauncherUI.class);
    localIntent.addFlags(67108864);
    paramContext.startActivity(localIntent);
    AppMethodBeat.o(29480);
  }

  private void pM(boolean paramBoolean)
  {
    boolean bool1 = true;
    boolean bool2 = true;
    AppMethodBeat.i(29455);
    if (paramBoolean)
    {
      if (!this.yjK.c(this, new LauncherUI.2(this)));
      for (paramBoolean = bool2; ; paramBoolean = false)
      {
        this.yjS = paramBoolean;
        AppMethodBeat.o(29455);
        return;
      }
    }
    if (!this.yjS)
      if (this.yjK.ao(this))
        break label86;
    label86: for (paramBoolean = bool1; ; paramBoolean = false)
    {
      this.yjS = paramBoolean;
      AppMethodBeat.o(29455);
      break;
    }
  }

  public final void closeChatting(boolean paramBoolean)
  {
    AppMethodBeat.i(29482);
    new LauncherUI.5(this);
    if (this.chattingTabUI.pW(paramBoolean))
    {
      this.yjJ.pI(this.chattingTabUI.ypn.isSupportCustomActionBar());
      this.yjJ.getMainTabUI().dyG();
    }
    AppMethodBeat.o(29482);
  }

  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(29472);
    Object localObject;
    boolean bool;
    if (this.chattingTabUI.dxM())
    {
      localObject = this.chattingTabUI;
      if ((paramKeyEvent.getKeyCode() == 4) && (paramKeyEvent.getAction() == 0))
        al.af(((NewChattingTabUI)localObject).mStartChattingRunnable);
      if (((NewChattingTabUI)localObject).isAnimating)
      {
        bool = true;
        if (!bool)
          break label82;
        AppMethodBeat.o(29472);
        bool = true;
      }
    }
    while (true)
    {
      return bool;
      bool = ((NewChattingTabUI)localObject).ypn.onKeyDown(paramKeyEvent.getKeyCode(), paramKeyEvent);
      break;
      label82: HomeUI localHomeUI = this.yjJ;
      ab.i("MicroMsg.LauncherUI.HomeUI", "ui group onKeyDown, code:%d action:%d", new Object[] { Integer.valueOf(paramKeyEvent.getKeyCode()), Integer.valueOf(paramKeyEvent.getAction()) });
      com.tencent.mm.compatible.b.g.KO();
      com.tencent.mm.compatible.b.g.KO();
      int i;
      if ((paramKeyEvent.getKeyCode() == 4) && (paramKeyEvent.getAction() == 1) && (localHomeUI.yiD != null) && (localHomeUI.yiD.isShowing()))
      {
        localHomeUI.yiD.dismiss();
        i = 1;
      }
      while (true)
      {
        if (i == 0)
          break label423;
        AppMethodBeat.o(29472);
        bool = true;
        break;
        if ((paramKeyEvent.getKeyCode() == 82) && (paramKeyEvent.getAction() == 1))
        {
          localHomeUI.dxj();
          i = 1;
        }
        else
        {
          localObject = localHomeUI.yiP.dyx();
          if ((localObject != null) && (((MMFragment)localObject).onKeyDown(paramKeyEvent.getKeyCode(), paramKeyEvent)))
            i = 1;
          else if ((paramKeyEvent.getKeyCode() == 4) && (paramKeyEvent.getAction() == 0))
          {
            if ((aw.RK()) && (com.tencent.mm.kernel.g.RN().eJb) && (com.tencent.mm.sdk.platformtools.at.isWap(localHomeUI.yhZ)) && (MMAppMgr.c(localHomeUI.yhZ, new HomeUI.18(localHomeUI))))
            {
              i = 1;
            }
            else
            {
              i = com.tencent.mm.sdk.platformtools.at.getBackgroundLimitType(localHomeUI.yhZ);
              if ((aw.RK()) && (com.tencent.mm.kernel.g.RN().eJb) && (com.tencent.mm.sdk.platformtools.at.isLimited(i)))
              {
                aw.ZK();
                if ((com.tencent.mm.platformtools.ah.d((Boolean)com.tencent.mm.model.c.Ry().get(16385, null))) && (MMAppMgr.a(localHomeUI.yhZ, i, new HomeUI.19(localHomeUI, i), new HomeUI.20(localHomeUI))))
                  i = 1;
              }
              else
              {
                localHomeUI.dwf();
              }
            }
          }
          else
            i = 0;
        }
      }
      try
      {
        label423: bool = super.dispatchKeyEvent(paramKeyEvent);
        AppMethodBeat.o(29472);
      }
      catch (Exception paramKeyEvent)
      {
        ab.w("MicroMsg.LauncherUI", "dispatch key event catch exception %s", new Object[] { paramKeyEvent.getMessage() });
        ab.printErrStackTrace("MicroMsg.LauncherUI", paramKeyEvent, "", new Object[0]);
        AppMethodBeat.o(29472);
        bool = false;
      }
    }
  }

  public void finish()
  {
    AppMethodBeat.i(29469);
    super.finish();
    dxF();
    ab.i("MicroMsg.LauncherUI", "checktask Launcherui onfinish 0x%x,instance size %d, stack: %s", new Object[] { Integer.valueOf(hashCode()), Integer.valueOf(yjE.size()), bo.dpG() });
    AppMethodBeat.o(29469);
  }

  public boolean forceRemoveNoMatchOnPath()
  {
    return true;
  }

  public MMFragment getCurrentFragmet()
  {
    AppMethodBeat.i(29479);
    Object localObject1 = this.chattingTabUI;
    if (!((NewChattingTabUI)localObject1).mChattingClosed);
    for (localObject1 = ((NewChattingTabUI)localObject1).ypn; ; localObject1 = null)
    {
      Object localObject2 = localObject1;
      if (localObject1 == null)
        localObject2 = super.getCurrentFragmet();
      AppMethodBeat.o(29479);
      return localObject2;
    }
  }

  public HomeUI getHomeUI()
  {
    return this.yjJ;
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    String str1 = null;
    Object localObject1 = null;
    AppMethodBeat.i(29463);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    ab.v("MicroMsg.LauncherUI", "edw on activity result");
    Object localObject2 = this.chattingTabUI;
    if (((paramInt1 == 2001) || (paramInt1 == 30763) || (paramInt1 == 30762) || (paramInt1 == 1111)) && (((NewChattingTabUI)localObject2).ypn != null))
      ((NewChattingTabUI)localObject2).ypn.onActivityResult(paramInt1, paramInt2, paramIntent);
    int i;
    if ((NewChattingTabUI.acceptRequestCode(paramInt1)) && (((NewChattingTabUI)localObject2).ypn == null))
    {
      ab.i("MicroMsg.LauncherUI.NewChattingTabUI", "on select image ActivityResult. the chattingUI maybe kill in the background.");
      al.af(((NewChattingTabUI)localObject2).ypp);
      ((NewChattingTabUI)localObject2).ypp.ypy = 0;
      ((NewChattingTabUI)localObject2).ypp.requestCode = paramInt1;
      ((NewChattingTabUI)localObject2).ypp.bFZ = paramInt2;
      ((NewChattingTabUI)localObject2).ypp.cEd = paramIntent;
      al.d(((NewChattingTabUI)localObject2).ypp);
      i = 1;
      if (i == 0)
        break label177;
      AppMethodBeat.o(29463);
    }
    while (true)
    {
      return;
      i = 0;
      break;
      label177: localObject2 = this.yjJ;
      if (((HomeUI)localObject2).yiv)
      {
        if (paramInt1 == 1)
        {
          aw.ZK();
          if (!com.tencent.mm.platformtools.ah.e((Boolean)com.tencent.mm.model.c.Ry().get(12323, null)))
            com.tencent.mm.platformtools.z.showAddrBookUploadConfirm(((HomeUI)localObject2).yhZ, null, false, 3);
          AppMethodBeat.o(29463);
        }
        else
        {
          if (paramInt1 == 22722)
          {
            str1 = (String)com.tencent.mm.kernel.g.RP().Ry().get(274436, null);
            ab.i("MicroMsg.LauncherUI.HomeUI", "showAgreements %d, %d, %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), str1 });
            if (paramIntent != null)
              localObject1 = paramIntent.getBundleExtra("result_data");
            if ((localObject1 != null) && (((Bundle)localObject1).getString("go_next", "").equals("agree_privacy")))
            {
              ab.i("MicroMsg.LauncherUI.HomeUI", "agree privacy policy");
              com.tencent.mm.plugin.report.service.h.pYm.a(712L, 4L, 1L, false);
              localObject1 = new com.tencent.mm.plugin.account.model.e(1, str1);
              com.tencent.mm.kernel.g.Rg().a((com.tencent.mm.ai.m)localObject1, 0);
              if ((com.tencent.mm.au.b.sO(str1)) && (com.tencent.mm.kernel.g.RP().Ry().getBoolean(ac.a.xVe, false)))
              {
                ab.i("MicroMsg.LauncherUI.HomeUI", "needbirthday true");
                al.n(new HomeUI.22((HomeUI)localObject2), 100L);
              }
            }
          }
          while (true)
          {
            if ((paramInt1 != 65534) || (paramInt2 != -1))
              break label692;
            aj.amB("welcome_page_show");
            l.m(((HomeUI)localObject2).yhZ, true);
            MMAppMgr.BV();
            MMAppMgr.bd(((HomeUI)localObject2).yhZ);
            ((HomeUI)localObject2).yhZ.finish();
            AppMethodBeat.o(29463);
            break;
            ab.i("MicroMsg.LauncherUI.HomeUI", "disagree privacy policy");
            localObject1 = new com.tencent.mm.plugin.account.model.e(2, str1);
            com.tencent.mm.kernel.g.Rg().a((com.tencent.mm.ai.m)localObject1, 0);
            com.tencent.mm.plugin.report.service.h.pYm.a(712L, 5L, 1L, false);
            continue;
            if (paramInt1 == 22723)
            {
              String str2 = (String)com.tencent.mm.kernel.g.RP().Ry().get(274436, null);
              localObject1 = str1;
              if (paramIntent != null)
                localObject1 = paramIntent.getBundleExtra("result_data");
              if (localObject1 != null)
                if (((Bundle)localObject1).getString("go_next", "").equals("birthdayComfirmOK"))
                {
                  ab.i("MicroMsg.LauncherUI.HomeUI", "verify birthday ok");
                  com.tencent.mm.kernel.g.RP().Ry().set(ac.a.xVe, Boolean.FALSE);
                }
                else if (((Bundle)localObject1).getString("go_next", "").equals("gdpr_confirm_logout"))
                {
                  ab.i("MicroMsg.LauncherUI.HomeUI", "quit verify birthday after H5-warnning");
                  localObject1 = new com.tencent.mm.plugin.account.model.e(2, str2);
                  com.tencent.mm.kernel.g.Rg().a((com.tencent.mm.ai.m)localObject1, 0);
                  com.tencent.mm.plugin.report.service.h.pYm.a(712L, 5L, 1L, false);
                }
            }
          }
          label692: if ((paramInt1 == 30764) && (paramIntent != null))
          {
            paramIntent = paramIntent.getBundleExtra("result_data");
            if ((paramIntent != null) && (paramIntent.getString("go_next", "").equals("gdpr_auth_location")))
            {
              com.tencent.mm.kernel.g.RP().Ry().set(ac.a.xVP, Boolean.TRUE);
              com.tencent.mm.pluginsdk.permission.b.b(((HomeUI)localObject2).yhZ, "android.permission.ACCESS_COARSE_LOCATION", 66);
            }
          }
        }
      }
      else
        AppMethodBeat.o(29463);
    }
  }

  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    AppMethodBeat.i(29477);
    super.onConfigurationChanged(paramConfiguration);
    paramConfiguration = this.yjJ;
    com.tencent.mm.pluginsdk.f.b(paramConfiguration.yhZ, paramConfiguration.contentView);
    AppMethodBeat.o(29477);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(29452);
    com.tencent.mm.blink.a.eM(com.tencent.mm.kernel.h.RT().eKD);
    long l1 = System.currentTimeMillis();
    ab.i("MicroMsg.LauncherUI", "start time check checktask onCreate 0x%x, taskid %d, task:%s", new Object[] { Integer.valueOf(hashCode()), Integer.valueOf(getTaskId()), bo.gU(this) });
    this.yjQ = new com.tencent.mm.app.t();
    super.onCreate(paramBundle);
    MainProcessChecker.UD(getClass().getName());
    getWindow().getDecorView().setSystemUiVisibility(1280);
    long l2 = System.currentTimeMillis();
    int i = getTaskId();
    Object localObject1 = getPackageName();
    paramBundle = getIntent();
    boolean bool1 = false;
    boolean bool2 = bool1;
    if (paramBundle != null)
    {
      bool2 = bool1;
      if (com.tencent.mm.sdk.platformtools.w.a(paramBundle, "absolutely_exit", false))
      {
        bool2 = true;
        ab.i("MicroMsg.LauncherUI", "checktask checkInstance isWantToRestart");
      }
    }
    Object localObject2 = yjF.iterator();
    while (((Iterator)localObject2).hasNext())
    {
      paramBundle = (LauncherUI)((WeakReference)((Iterator)localObject2).next()).get();
      if (paramBundle != null)
        ab.i("MicroMsg.LauncherUI", "Check launcher instance found one %s", new Object[] { paramBundle });
    }
    localObject2 = null;
    paramBundle = null;
    Object localObject3;
    if (!bool2)
    {
      localObject3 = yjE.iterator();
      localObject2 = paramBundle;
      if (((Iterator)localObject3).hasNext())
      {
        localObject2 = (LauncherUI)((Iterator)localObject3).next();
        if (((LauncherUI)localObject2).getTaskId() != i)
        {
          ab.i("MicroMsg.LauncherUI", "checktask checkInstance 0x%x diff taskid taskid %d, nowtaskid:%d", new Object[] { Integer.valueOf(localObject2.hashCode()), Integer.valueOf(((LauncherUI)localObject2).getTaskId()), Integer.valueOf(i) });
          paramBundle = bo.av(this, i);
          if (paramBundle != null)
          {
            ab.i("MicroMsg.LauncherUI", "checktask task diff id %d, topactivity %s, baseactivity %s, numtotal %d, numrunning %d", new Object[] { Integer.valueOf(paramBundle.id), paramBundle.topActivity.getClassName(), paramBundle.baseActivity.getClassName(), Integer.valueOf(paramBundle.numActivities), Integer.valueOf(paramBundle.numRunning) });
            if (paramBundle.baseActivity.getPackageName().equals(localObject1))
              break label525;
            ab.e("MicroMsg.LauncherUI", "checktask base activity is not mm, finish! info.baseActivity.getPackageName()  " + paramBundle.baseActivity.getPackageName());
            finish();
            if (bo.av(this, ((LauncherUI)localObject2).getTaskId()) != null)
            {
              ab.i("MicroMsg.LauncherUI", "checktask startLauncherUI with FLAG_ACTIVITY_NEW_TASK");
              paramBundle = new Intent(this, LauncherUI.class);
              paramBundle.addFlags(268435456);
              startActivity(paramBundle);
            }
            i = 0;
            label475: if (i != 0)
              break label867;
            ab.i("MicroMsg.LauncherUI", "onCreate checkInstance false");
            AppMethodBeat.o(29452);
          }
        }
      }
    }
    while (true)
    {
      return;
      ab.e("MicroMsg.LauncherUI", "checktask cannot found curren taskinfo %d", new Object[] { Integer.valueOf(i) });
      finish();
      i = 0;
      break label475;
      label525: ((LauncherUI)localObject2).finish();
      yjE.remove(localObject2);
      break;
      if (!yjE.isEmpty())
      {
        paramBundle = (Bundle)localObject2;
        if (localObject2 == null)
          paramBundle = bo.av(this, i);
        if (paramBundle == null)
          break label826;
        localObject2 = paramBundle.baseActivity.getClassName();
        localObject1 = paramBundle.baseActivity.getClassName();
        ab.i("MicroMsg.LauncherUI", "checktask now info id %d, topactivity %s, baseactivity %s, numtotal %d, numrunning %d", new Object[] { Integer.valueOf(paramBundle.id), localObject1, localObject2, Integer.valueOf(paramBundle.numActivities), Integer.valueOf(paramBundle.numRunning) });
        localObject3 = getComponentName().getClassName();
        if ((paramBundle.numActivities > 1) && (((String)localObject3).equals(localObject2)) && (((String)localObject3).equals(localObject1)))
        {
          finish();
          ab.w("MicroMsg.LauncherUI", "checktask finish this mainTabUI, and use the last LauncherUI instanceCount: %d", new Object[] { Integer.valueOf(yjE.size()) });
          i = 0;
          break label475;
        }
        ab.w("MicroMsg.LauncherUI", "checktask should not here without isWantToRestart is true launcherUIInstances.clear LauncherUI instanceCount: %d, isWantToRestart %b", new Object[] { Integer.valueOf(yjE.size()), Boolean.valueOf(bool2) });
        yjE.clear();
      }
      while (true)
      {
        yjE.add(this);
        yjF.add(new WeakReference(this));
        ab.i("MicroMsg.LauncherUI", "checktask Launcherui oncreate checkInstance size %d weak check %d, use time %d", new Object[] { Integer.valueOf(yjE.size()), Integer.valueOf(yjF.size()), Long.valueOf(System.currentTimeMillis() - l2) });
        i = 1;
        break;
        label826: ab.w("MicroMsg.LauncherUI", "checktask can not found taskid %d,  LauncherUI instanceCount: %d", new Object[] { Integer.valueOf(i), Integer.valueOf(yjE.size()) });
        yjE.clear();
      }
      label867: ab.i("MicroMsg.LauncherUI", "onCreate normally");
      this.yjJ = new HomeUI();
      this.chattingTabUI = new NewChattingTabUI(this.yjJ);
      paramBundle = this.yjJ;
      localObject2 = this.chattingTabUI;
      paramBundle.yhZ = this;
      paramBundle.yiN = ((LauncherUI.a)localObject2);
      localObject1 = paramBundle.yiP;
      ((MainTabUI)localObject1).yhZ = this;
      ((MainTabUI)localObject1).ynF = paramBundle;
      localObject2 = ((MainTabUI)localObject1).ynE;
      ((w)localObject2).yhZ = this;
      ((w)localObject2).ynS = paramBundle;
      ((MainTabUI)localObject1).iVv = paramBundle;
      paramBundle.yiO = new h(this, paramBundle);
      NotifyReceiver.Im();
      com.tencent.mm.pluginsdk.f.ah(paramBundle.yhZ);
      paramBundle.mActionBar = getSupportActionBar();
      if (paramBundle.mActionBar != null)
      {
        if (Build.VERSION.SDK_INT < 11)
          paramBundle.mActionBar.setBackgroundDrawable(new ColorDrawable(getResources().getColor(2131689644)));
        paramBundle.mActionBar.hide();
      }
      setRequestedOrientation(1);
      paramBundle.yiQ = getResources().getColor(2131690310);
      paramBundle.yiR = Color.alpha(paramBundle.yiQ);
      paramBundle = av.fly.T("login_user_name", "");
      this.cEp = getIntent();
      localObject2 = this.yjP;
      ((u)localObject2).vaA = this.cEp.getBooleanExtra("splash-hack-activity-recreate", false);
      ab.i("MicroMsg.SplashOptimizing", "[%s], recreating activity this time? %s", new Object[] { ((u)localObject2).mTag, Boolean.valueOf(((u)localObject2).vaA) });
      ab.i("MicroMsg.LauncherUI", "lastLoginName %s, hasCfgDefaultUin %s  isFirstTimeCreate %s", new Object[] { paramBundle, Boolean.valueOf(aw.ZM()), Boolean.valueOf(yjG) });
      if ((!yjG) && ((aw.ZM()) || (!paramBundle.equals(""))))
      {
        yjH = l1;
        ab.i("MicroMsg.LauncherUI", "start time check not isLauncherUIOnTop no welcomeearth create time from mmapplication==" + (System.currentTimeMillis() - com.tencent.mm.app.b.cdW));
      }
      label1467: 
      while (true)
      {
        if (!dxI())
          break label1469;
        ab.i("MicroMsg.LauncherUI", "handleExitIntent return");
        AppMethodBeat.o(29452);
        break;
        yjH = l1;
        ab.i("MicroMsg.LauncherUI", "start time check not isLauncherUIOnTop create time from mmapplication==" + (System.currentTimeMillis() - com.tencent.mm.app.b.cdW));
        setRequestedOrientation(1);
        bool2 = aw.ZM();
        paramBundle = av.fly.T("login_user_name", "");
        if ((!bool2) && (paramBundle.equals("")));
        for (i = 1; ; i = 0)
        {
          if (i != 0)
            break label1351;
          com.tencent.mm.sdk.platformtools.g.xye = false;
          break;
        }
        label1351: bool2 = false;
        if (com.tencent.mm.sdk.platformtools.g.xyf)
        {
          yjI = true;
          bool2 = MMAppMgr.a(this, new DialogInterface.OnClickListener()
          {
            public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
            {
              AppMethodBeat.i(29443);
              LauncherUI.a(LauncherUI.this);
              LauncherUI.aMx();
              o.aVi();
              paramAnonymousDialogInterface = jdField_this;
              WelcomeSelectView localWelcomeSelectView = new WelcomeSelectView(jdField_this);
              paramAnonymousDialogInterface.setContentView(localWelcomeSelectView);
              LauncherUI.a(LauncherUI.this, localWelcomeSelectView);
              LauncherUI.b(LauncherUI.this);
              AppMethodBeat.o(29443);
            }
          });
        }
        while (true)
        {
          if (bool2)
            break label1467;
          pM(true);
          yjI = false;
          o.aVi();
          com.tencent.mm.plugin.report.service.g.BP(8);
          paramBundle = new WelcomeSelectView(this);
          setContentView(paramBundle);
          this.yjO = paramBundle;
          ab.i("MicroMsg.LauncherUI", "resumeLogoutJump showLoginSelectUI hashCode[%d]", new Object[] { Integer.valueOf(hashCode()) });
          al.af(this.yjU);
          al.n(this.yjU, 2000L);
          break;
          MMAppMgr.hs(this);
        }
      }
      label1469: dxG();
      ae.hD(this);
      AppMethodBeat.o(29452);
    }
  }

  public boolean onCreateOptionsMenu(Menu paramMenu)
  {
    AppMethodBeat.i(29476);
    if (this.chattingTabUI.dxM())
      AppMethodBeat.o(29476);
    HomeUI localHomeUI;
    for (boolean bool = false; ; bool = false)
    {
      return bool;
      localHomeUI = this.yjJ;
      if ((localHomeUI.yiN != null) && (!localHomeUI.yiN.dxM()))
        break;
      AppMethodBeat.o(29476);
    }
    localHomeUI.yjf = paramMenu;
    int i = localHomeUI.yhZ.getSupportActionBar().getHeight();
    int j = com.tencent.mm.bz.a.am(localHomeUI.yhZ, 2131427600);
    if ((localHomeUI.yiP.mbt == 3) && (com.tencent.mm.plugin.story.api.n.isShowStoryCheck()))
    {
      localHomeUI.yje = paramMenu.add(0, 5, 0, 2131304084);
      if (localHomeUI.yja == null)
      {
        localHomeUI.yja = com.tencent.mm.kiss.a.b.SM().a(localHomeUI.yhZ, "R.layout.actionbar_menu", 2130968614);
        paramMenu = new ViewGroup.LayoutParams(j, i);
        localHomeUI.yja.setLayoutParams(paramMenu);
        localHomeUI.yja.setBackgroundResource(2130837630);
        localHomeUI.yja.setMinimumHeight(i);
        localHomeUI.yja.setMinimumWidth(j);
        localHomeUI.yja.setOnLongClickListener(new HomeUI.3(localHomeUI));
        localHomeUI.yja.setOnClickListener(new HomeUI.4(localHomeUI));
      }
      if (localHomeUI.yiT)
      {
        localHomeUI.yja.findViewById(2131820972).setVisibility(0);
        paramMenu = com.tencent.mm.plugin.story.g.h.scu;
        com.tencent.mm.plugin.story.g.h.lo(1L);
      }
      while (true)
      {
        localHomeUI.yje.setActionView(localHomeUI.yja);
        localHomeUI.dxu();
        localHomeUI.dxk();
        ab.v("MicroMsg.LauncherUI.HomeUI", "onCreateOptionsMenu");
        AppMethodBeat.o(29476);
        bool = true;
        break;
        localHomeUI.yja.findViewById(2131820972).setVisibility(8);
        paramMenu = com.tencent.mm.plugin.story.g.h.scu;
        com.tencent.mm.plugin.story.g.h.lo(0L);
      }
    }
    Object localObject;
    if (i == 0)
    {
      localObject = localHomeUI.yhZ.getResources().getDisplayMetrics();
      if (((DisplayMetrics)localObject).widthPixels > ((DisplayMetrics)localObject).heightPixels)
        i = localHomeUI.yhZ.getResources().getDimensionPixelSize(2131427562);
    }
    while (true)
    {
      localHomeUI.yjb = paramMenu.add(0, 1, 0, 2131304082);
      localHomeUI.yjb.setIcon(2131230741);
      if (localHomeUI.qlP)
        localHomeUI.yjb.setIcon(2131230748);
      if (localHomeUI.yfm == null)
      {
        localObject = new ViewGroup.LayoutParams(j, i);
        localHomeUI.yfm = com.tencent.mm.kiss.a.b.SM().a(localHomeUI.yhZ, "R.layout.actionview_with_dot_tips", 2130968621);
        localHomeUI.yiZ = ((ImageView)localHomeUI.yfm.findViewById(2131820915));
        localHomeUI.yfm.setLayoutParams((ViewGroup.LayoutParams)localObject);
        localHomeUI.yfm.setBackgroundResource(2130837630);
        localHomeUI.yfm.setMinimumHeight(i);
        localHomeUI.yfm.setMinimumWidth(j);
        localHomeUI.yiZ.setImageResource(2131230741);
        localHomeUI.yfm.setOnClickListener(new HomeUI.5(localHomeUI));
        localHomeUI.yfm.post(new HomeUI.6(localHomeUI));
      }
      android.support.v4.view.g.a(localHomeUI.yjb, localHomeUI.yfm);
      localHomeUI.yjc = paramMenu.add(0, 2, 0, 2131304081);
      if (localHomeUI.yiW == null)
      {
        paramMenu = new ViewGroup.LayoutParams(j, i);
        localHomeUI.yiW = com.tencent.mm.kiss.a.b.SM().a(localHomeUI.yhZ, "R.layout.actionview_with_dot_tips", 2130968621);
        localHomeUI.yiX = ((ImageView)localHomeUI.yiW.findViewById(2131820915));
        localHomeUI.yiY = localHomeUI.yiW.findViewById(2131820972);
        localHomeUI.yiW.setLayoutParams(paramMenu);
        localHomeUI.yiW.setBackgroundResource(2130837630);
        localHomeUI.yiW.setMinimumHeight(i);
        localHomeUI.yiW.setMinimumWidth(j);
        localHomeUI.yiX.setImageResource(2131231436);
        localHomeUI.yiW.setContentDescription(localHomeUI.getString(2131304081));
        localHomeUI.yiW.setOnClickListener(new HomeUI.7(localHomeUI));
        localHomeUI.yiW.post(new HomeUI.8(localHomeUI));
      }
      if ((localHomeUI.qlP) && (localHomeUI.yiX != null))
        localHomeUI.yiX.getDrawable().setColorFilter(-1, PorterDuff.Mode.SRC_ATOP);
      com.tencent.mm.blink.b.HQ().o(new HomeUI.9(localHomeUI));
      localHomeUI.yjc.setActionView(localHomeUI.yiW);
      localHomeUI.dxk();
      localHomeUI.yiW.getLayoutParams().width = j;
      localHomeUI.yiW.getLayoutParams().height = i;
      break;
      i = localHomeUI.yhZ.getResources().getDimensionPixelSize(2131427563);
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(29467);
    com.tencent.mm.blink.a.HL();
    super.onDestroy();
    Object localObject = this.yjJ;
    ((HomeUI)localObject).yiP.dyy();
    if (((HomeUI)localObject).yiO != null)
    {
      h localh = ((HomeUI)localObject).yiO;
      com.tencent.mm.sdk.b.a.xxA.d(localh.yif);
      com.tencent.mm.sdk.b.a.xxA.d(localh.yig);
    }
    if (((HomeUI)localObject).yiv)
      Looper.myQueue().removeIdleHandler(((HomeUI)localObject).jQs);
    localObject = this.chattingTabUI;
    if ((((NewChattingTabUI)localObject).mPrepareBitmap != null) && (!((NewChattingTabUI)localObject).mPrepareBitmap.isRecycled()))
    {
      ab.i("MicroMsg.LauncherUI.NewChattingTabUI", "bitmap recycle %s", new Object[] { ((NewChattingTabUI)localObject).mPrepareBitmap.toString() });
      ((NewChattingTabUI)localObject).mPrepareBitmap.recycle();
    }
    al.af(((NewChattingTabUI)localObject).mStartChattingRunnable);
    Looper.myQueue().removeIdleHandler(((NewChattingTabUI)localObject).ypi);
    dxF();
    ab.i("MicroMsg.LauncherUI", "checktask onDestroy 0x%x, taskid %d, task:%s, instancesize %d", new Object[] { Integer.valueOf(hashCode()), Integer.valueOf(getTaskId()), bo.gU(this), Integer.valueOf(yjE.size()) });
    AppMethodBeat.o(29467);
  }

  public void onNewIntent(Intent paramIntent)
  {
    AppMethodBeat.i(29454);
    ab.i("MicroMsg.LauncherUI", "onNewIntent 0x%x task:%s", new Object[] { Integer.valueOf(hashCode()), bo.gU(this) });
    this.cEp = paramIntent;
    super.onNewIntent(paramIntent);
    setIntent(paramIntent);
    if (dxI())
    {
      ab.i("MicroMsg.LauncherUI", "onNewIntent handleExitIntent");
      AppMethodBeat.o(29454);
    }
    while (true)
    {
      return;
      if ((this.cEp != null) && (com.tencent.mm.sdk.platformtools.w.a(this.cEp, "Intro_Need_Clear_Top ", false)))
      {
        ab.d("MicroMsg.LauncherUI", "KEVIN KNeedClearTop");
        finish();
        ho(this);
        AppMethodBeat.o(29454);
      }
      else
      {
        if ((paramIntent.getFlags() & 0x4000000) == 67108864)
          closeChatting(false);
        MainTabUI localMainTabUI = this.yjJ.yiP;
        if ((paramIntent.getFlags() & 0x4000000) == 67108864)
          localMainTabUI.ynG = true;
        if (this.yjL)
        {
          ab.v("MicroMsg.LauncherUI", "onMainTabNewIntent on new intent");
          aQ(paramIntent);
        }
        AppMethodBeat.o(29454);
      }
    }
  }

  public boolean onOptionsItemSelected(MenuItem paramMenuItem)
  {
    boolean bool = true;
    int i = 0;
    AppMethodBeat.i(29475);
    HomeUI localHomeUI = this.yjJ;
    Object localObject = localHomeUI.yhZ.getCurrentFragmet();
    int j;
    if ((localObject != null) && (((MMFragment)localObject).isShowing()))
    {
      j = i;
      if (j == 0)
        break label206;
      AppMethodBeat.o(29475);
    }
    while (true)
    {
      return bool;
      j = i;
      if (localHomeUI.yiN.dxM())
        break;
      if (paramMenuItem.getItemId() == 2)
      {
        com.tencent.mm.plugin.report.service.h.pYm.X(10919, "0");
        localHomeUI.dxj();
      }
      while (true)
      {
        j = 1;
        break;
        if (paramMenuItem.getItemId() == 1)
        {
          localHomeUI.dxl();
        }
        else
        {
          j = i;
          if (paramMenuItem.getItemId() != 5)
            break;
          if ((com.tencent.mm.sdk.a.b.dnO()) || (com.tencent.mm.platformtools.ae.gjs))
          {
            localObject = new com.tencent.mm.ui.tools.j(localHomeUI.yhZ);
            ((com.tencent.mm.ui.tools.j)localObject).rBl = new HomeUI.10(localHomeUI);
            ((com.tencent.mm.ui.tools.j)localObject).rBm = new HomeUI.11(localHomeUI);
            ((com.tencent.mm.ui.tools.j)localObject).cuu();
          }
          else
          {
            localHomeUI.dxm();
          }
        }
      }
      label206: bool = super.onOptionsItemSelected(paramMenuItem);
      AppMethodBeat.o(29475);
    }
  }

  public void onPause()
  {
    AppMethodBeat.i(29464);
    ab.d("MicroMsg.LauncherUI", "onPause, chatting is show ");
    super.onPause();
    Object localObject1 = this.yjP;
    boolean bool = ((u)localObject1).cM("onPause");
    if (bool)
      ((u)localObject1).vaA = false;
    if (bool)
    {
      ab.i("MicroMsg.LauncherUI", "recreate activity %s, skip this onPause");
      AppMethodBeat.o(29464);
    }
    while (true)
    {
      return;
      com.tencent.mm.blink.a.HL();
      ab.i("MicroMsg.LauncherUI", "not skip this onPause");
      localObject1 = getCurrentFragmet();
      this.yjT.removeCallbacksAndMessages(null);
      Object localObject2 = this.yjJ;
      Object localObject3 = ((HomeUI)localObject2).yiP;
      bool = ((HomeUI)localObject2).yiv;
      ab.v("MicroMsg.LauncherUI.MainTabUI", "doOnPause %d, mainTabHasCreate:%b", new Object[] { Integer.valueOf(((MainTabUI)localObject3).mbt), Boolean.valueOf(bool) });
      if (bool)
        ((MainTabUI)localObject3).dyA();
      localObject3 = ((MainTabUI)localObject3).ynE;
      if (aw.RK())
      {
        aw.ZK();
        com.tencent.mm.model.c.Ry().b(((w)localObject3).ynY);
        aw.ZK();
        com.tencent.mm.model.c.XR().b((n.b)localObject3);
        com.tencent.mm.x.c.PK().b(((w)localObject3).ynX);
        com.tencent.mm.sdk.b.a.xxA.d(((w)localObject3).ynZ);
        com.tencent.mm.sdk.b.a.xxA.d(((w)localObject3).yhr);
        com.tencent.mm.sdk.b.a.xxA.d(((w)localObject3).yhq);
      }
      if (((w)localObject3).ynW != null)
      {
        ((w)localObject3).ynW.ynT = null;
        ((w)localObject3).ynW = null;
      }
      localObject3 = ((HomeUI)localObject2).yiO;
      if (((h)localObject3).yic != null)
      {
        aw.Rg().b(255, ((h)localObject3).yic);
        aw.Rg().b(384, ((h)localObject3).yic);
        ((h)localObject3).yic = null;
      }
      com.tencent.mm.sdk.a.b.cE(false);
      ((HomeUI)localObject2).yiM = HomeUI.a.yjt;
      if (!aw.ZD())
        aw.getNotification().bv(false);
      bool = ((HomeUI)localObject2).yiN.dxM();
      ab.i("MicroMsg.LauncherUI.HomeUI", "edw onPause, chatting is show ".concat(String.valueOf(bool)));
      if (!bool)
        j.a(((HomeUI)localObject2).yhZ, 4, ((HomeUI)localObject2).yiP.mbt, "directReport_onPause");
      if (!((HomeUI)localObject2).yhZ.isFinishing())
        com.tencent.mm.ui.widget.h.a(((HomeUI)localObject2).yhZ);
      if (((HomeUI)localObject2).yiv)
      {
        ab.d("MicroMsg.LauncherUI.HomeUI", "KEVIN MainTabUI onMainTabPause");
        com.tencent.mm.blink.b.HQ().HS();
        if (aw.RK())
          com.tencent.mm.sdk.b.a.xxA.d(((HomeUI)localObject2).qjs);
      }
      if ((((HomeUI)localObject2).yiD != null) && (((HomeUI)localObject2).yiD.isShowing()))
        ((HomeUI)localObject2).yiD.dismiss();
      localObject2 = this.chattingTabUI;
      if (((NewChattingTabUI)localObject2).dxM())
      {
        ((NewChattingTabUI)localObject2).kT(4);
        if ((((NewChattingTabUI)localObject2).ypn != null) && (((NewChattingTabUI)localObject2).ypn.isSupportNavigationSwipeBack()))
          ((NewChattingTabUI)localObject2).ypn.getSwipeBackLayout().setEnableGesture(false);
      }
      if (localObject1 != null)
      {
        AppMethodBeat.o(29464);
      }
      else
      {
        this.yjM = false;
        AppMethodBeat.o(29464);
      }
    }
  }

  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    AppMethodBeat.i(29466);
    this.yjS = false;
    Object localObject;
    if (!this.yjK.a(this, paramInt, paramArrayOfString, paramArrayOfInt))
    {
      localObject = this.yjJ;
      switch (paramInt)
      {
      default:
      case 16:
      case 80:
      case 65:
      case 66:
      case 24:
      case 78:
      }
    }
    while (true)
    {
      localObject = this.chattingTabUI;
      if (((NewChattingTabUI)localObject).ypn != null)
        ((NewChattingTabUI)localObject).ypn.onRequestPermissionsResult(paramInt, paramArrayOfString, paramArrayOfInt);
      AppMethodBeat.o(29466);
      return;
      if (paramInt == 80);
      for (int i = 2131301928; paramArrayOfInt[0] != 0; i = 2131301920)
      {
        com.tencent.mm.ui.base.h.a(((HomeUI)localObject).yhZ, ((HomeUI)localObject).getString(i), ((HomeUI)localObject).getString(2131301936), ((HomeUI)localObject).getString(2131300878), ((HomeUI)localObject).getString(2131297773), false, new HomeUI.24((HomeUI)localObject), new HomeUI.25((HomeUI)localObject));
        break;
      }
      if (paramArrayOfInt[0] == 0)
      {
        ((HomeUI)localObject).dxl();
      }
      else
      {
        com.tencent.mm.ui.base.h.a(((HomeUI)localObject).yhZ, ((HomeUI)localObject).getString(2131301926), ((HomeUI)localObject).getString(2131301936), ((HomeUI)localObject).getString(2131300878), ((HomeUI)localObject).getString(2131297773), false, new HomeUI.26((HomeUI)localObject), null);
        continue;
        if (paramArrayOfInt[0] == 0)
        {
          localObject = ((HomeUI)localObject).yiP.dyx();
          if ((localObject instanceof FindMoreFriendsUI))
            ((FindMoreFriendsUI)localObject).dwU();
        }
        else
        {
          com.tencent.mm.ui.base.h.a(((HomeUI)localObject).yhZ, ((HomeUI)localObject).getString(2131301926), ((HomeUI)localObject).getString(2131301936), ((HomeUI)localObject).getString(2131300878), ((HomeUI)localObject).getString(2131297773), false, new HomeUI.27((HomeUI)localObject), null);
          continue;
          if (paramArrayOfInt[0] == 0)
          {
            ((HomeUI)localObject).dxm();
          }
          else
          {
            if ("android.permission.CAMERA".equals(paramArrayOfString[0]));
            for (i = 2131301920; ; i = 2131301928)
            {
              com.tencent.mm.ui.base.h.a(((HomeUI)localObject).yhZ, ((HomeUI)localObject).getString(i), ((HomeUI)localObject).getString(2131301936), ((HomeUI)localObject).getString(2131300878), ((HomeUI)localObject).getString(2131296868), false, new HomeUI.28((HomeUI)localObject), new HomeUI.29((HomeUI)localObject));
              break;
            }
            if (paramArrayOfInt[0] == 0)
              ((HomeUI)localObject).dxm();
            else
              com.tencent.mm.ui.base.h.a(((HomeUI)localObject).yhZ, ((HomeUI)localObject).getString(2131301926), ((HomeUI)localObject).getString(2131301936), ((HomeUI)localObject).getString(2131300878), ((HomeUI)localObject).getString(2131297773), false, new HomeUI.30((HomeUI)localObject), null);
          }
        }
      }
    }
  }

  protected void onRestoreInstanceState(Bundle paramBundle)
  {
    AppMethodBeat.i(29473);
    super.onRestoreInstanceState(paramBundle);
    NewChattingTabUI localNewChattingTabUI = this.chattingTabUI;
    localNewChattingTabUI.ypk = paramBundle.getString("last_restore_talker");
    ab.i("MicroMsg.LauncherUI.NewChattingTabUI", "onRestoreInstanceState:%s", new Object[] { localNewChattingTabUI.ypk });
    AppMethodBeat.o(29473);
  }

  public void onResume()
  {
    AppMethodBeat.i(29456);
    super.onResume();
    if (this.yjP.cM("onResume"))
    {
      ab.i("MicroMsg.LauncherUI", "recreate activity %s, skip this onResume");
      AppMethodBeat.o(29456);
      return;
    }
    ab.i("MicroMsg.LauncherUI", "not skip this onResume");
    yjG = false;
    Object localObject1;
    Object localObject2;
    long l1;
    Object localObject5;
    boolean bool2;
    label956: long l3;
    if (dxH())
    {
      ab.i("MicroMsg.LauncherUI", "doOnResumeImp notSwitchorHold, hasDoInit:%b", new Object[] { Boolean.valueOf(this.yjL) });
      if (!this.yjL)
      {
        this.yjL = true;
        localObject1 = this.yjJ;
        ((HomeUI)localObject1).yiT = ((Boolean)com.tencent.mm.kernel.g.RP().Ry().get(ac.a.xWL, Boolean.TRUE)).booleanValue();
        localObject2 = ((HomeUI)localObject1).yiO;
        com.tencent.mm.sdk.b.a.xxA.c(((h)localObject2).yif);
        com.tencent.mm.sdk.b.a.xxA.c(((h)localObject2).yig);
        if (!com.tencent.mm.ui.conversation.b.dIo())
          getWindow().setCallback(new com.tencent.mm.ui.b.c(getWindow().getCallback(), this));
        localObject2 = ((HomeUI)localObject1).yhZ.getSharedPreferences("system_config_prefs", com.tencent.mm.compatible.util.h.Mu());
        if (((SharedPreferences)localObject2).getBoolean("first_launch_weixin", true))
        {
          ((SharedPreferences)localObject2).edit().putBoolean("first_launch_weixin", false).commit();
          XLogSetup.realSetupXlog();
        }
        ((HomeUI)localObject1).yiD = new aa(this);
        ((HomeUI)localObject1).yiv = true;
        NotifyReceiver.Io();
        aw.getNotification().il(1);
        ab.d("MicroMsg.LauncherUI.HomeUI", "on main tab create");
        l1 = System.currentTimeMillis();
        if (!aw.RK())
        {
          ab.e("MicroMsg.LauncherUI.HomeUI", "mmcore has not ready, finish launcherui");
          ((HomeUI)localObject1).yhZ.finish();
          Object localObject4 = ((HomeUI)localObject1).yiP;
          ((MainTabUI)localObject4).yeo = ((CustomViewPager)((MainTabUI)localObject4).yhZ.findViewById(2131823829));
          ((MainTabUI)localObject4).yeo.setOffscreenPageLimit(4);
          ((MainTabUI)localObject4).yeo.setCanSlide(true);
          ((MainTabUI)localObject4).yeo.setCanSlideBySide(false);
          ((MainTabUI)localObject4).ynI = new MainTabUI.TabsAdapter((MainTabUI)localObject4, ((MainTabUI)localObject4).yhZ, ((MainTabUI)localObject4).yeo);
          ((MainTabUI)localObject4).Nm(0);
          localObject5 = ((MainTabUI)localObject4).ynE;
          localObject2 = (ViewGroup)((MainTabUI)localObject4).yeo.getParent();
          localObject4 = ((MainTabUI)localObject4).ynI;
          c localc = ((w)localObject5).ynT;
          if (((w)localObject5).ynT != null)
          {
            ((w)localObject5).ynT.setOnTabClickListener(null);
            ((View)((w)localObject5).ynT).setVisibility(8);
            if (localObject2 != null)
              ((ViewGroup)localObject2).removeView((View)((w)localObject5).ynT);
          }
          FrameLayout.LayoutParams localLayoutParams = new FrameLayout.LayoutParams(-1, -2);
          LauncherUIBottomTabView localLauncherUIBottomTabView = new LauncherUIBottomTabView(((w)localObject5).yhZ);
          localLauncherUIBottomTabView.setId(2131820634);
          if (localObject2 != null)
          {
            localLayoutParams.gravity = 80;
            ((ViewGroup)localObject2).addView(localLauncherUIBottomTabView, localLayoutParams);
          }
          ((w)localObject5).ynT = localLauncherUIBottomTabView;
          ((View)((w)localObject5).ynT).setVisibility(0);
          ((w)localObject5).ynT.setOnTabClickListener((c.a)localObject4);
          if ((localc != null) && (localc != ((w)localObject5).ynT))
          {
            ((w)localObject5).ynT.px(localc.getShowFriendPoint());
            ((w)localObject5).ynT.py(localc.getSettingsPoint());
            ((w)localObject5).ynT.MM(localc.getMainTabUnread());
            ((w)localObject5).ynT.MN(localc.getContactTabUnread());
            ((w)localObject5).ynT.MO(localc.getFriendTabUnread());
            ((w)localObject5).ynT.MP(localc.getSettingsTabUnread());
            ((w)localObject5).ynT.setTo(localc.getCurIdx());
          }
          ((HomeUI)localObject1).yiP.ynL = new HomeUI.1((HomeUI)localObject1);
          this.chattingTabUI.iWA = this;
          aQ(getIntent());
        }
      }
      else
      {
        localObject1 = this.yjJ;
        l1 = com.tencent.mm.platformtools.ah.anU();
        localObject2 = ((HomeUI)localObject1).yiP;
        ab.i("MicroMsg.LauncherUI.MainTabUI", "onResume start :%d", new Object[] { Integer.valueOf(((MainTabUI)localObject2).mbt) });
        if (((MainTabUI)localObject2).ynQ.size() != 0)
          ((m)((MainTabUI)localObject2).ynQ.get(Integer.valueOf(((MainTabUI)localObject2).mbt))).dwi();
        if ((((MainTabUI)localObject2).ynG) && (((MainTabUI)localObject2).yhZ.getIntent().hasExtra("isScrollFirst")) && (((MainTabUI)localObject2).yhZ.getIntent().hasExtra("isShowHeader")))
        {
          localObject5 = (MainUI)((MainTabUI)localObject2).ynQ.get(Integer.valueOf(0));
          if (localObject5 != null)
          {
            boolean bool1 = ((MainTabUI)localObject2).yhZ.getIntent().getBooleanExtra("isShowHeader", false);
            bool2 = ((MainTabUI)localObject2).yhZ.getIntent().getBooleanExtra("isScrollFirst", true);
            ((MainUI)localObject5).i(bool1, ((MainTabUI)localObject2).yhZ.getIntent().getBooleanExtra("isShowHeaderWithAnim", false), bool2);
          }
        }
        if (((MainTabUI)localObject2).ynG)
        {
          ((MainTabUI)localObject2).ynG = false;
          ((MainTabUI)localObject2).aqG("tab_main");
        }
        localObject5 = (MainUI)((MainTabUI)localObject2).ynQ.get(Integer.valueOf(0));
        if (localObject5 != null)
        {
          ((MainUI)localObject5).dHz();
          ((MainUI)localObject5).dIT();
        }
        if (((MainTabUI)localObject2).mbt != 0)
          break label3091;
        aw.getNotification().bv(true);
        localObject5 = (m)((MainTabUI)localObject2).Nn(((MainTabUI)localObject2).mbt);
        if (localObject5 != null)
          ((m)localObject5).dwj();
        ((MainTabUI)localObject2).ynG = false;
        int i = com.tencent.mm.sdk.platformtools.w.a(((MainTabUI)localObject2).yhZ.getIntent(), "preferred_tab", 0);
        ab.d("MicroMsg.LauncherUI.MainTabUI", "doOnResume, tabIdx = %d", new Object[] { Integer.valueOf(i) });
        if (i != 0)
        {
          ((MainTabUI)localObject2).Nm(i);
          ((MainTabUI)localObject2).yhZ.getIntent().putExtra("preferred_tab", 0);
        }
        com.tencent.mm.sdk.b.a.xxA.c(((MainTabUI)localObject2).ynM);
        com.tencent.mm.sdk.b.a.xxA.c(((MainTabUI)localObject2).ynO);
        localObject2 = ((MainTabUI)localObject2).ynE;
        if (((w)localObject2).ynT != null)
          ((w)localObject2).ynT.dwp();
        aw.ZK();
        com.tencent.mm.model.c.Ry().a(((w)localObject2).ynY);
        com.tencent.mm.x.c.PK().a(((w)localObject2).ynX);
        aw.ZK();
        com.tencent.mm.model.c.XR().a((n.b)localObject2);
        com.tencent.mm.sdk.b.a.xxA.c(((w)localObject2).yhr);
        com.tencent.mm.sdk.b.a.xxA.c(((w)localObject2).ynZ);
        com.tencent.mm.sdk.b.a.xxA.c(((w)localObject2).yhq);
        com.tencent.mm.blink.b.HQ().o(new w.6((w)localObject2));
        localObject5 = ((HomeUI)localObject1).yiO;
        localObject2 = new az();
        com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject2);
        if ((((az)localObject2).cuh.cui) && (!com.tencent.mm.platformtools.ah.isNullOrNil(((az)localObject2).cuh.bzH)))
        {
          ab.d("MicroMsg.LauncherUI.GlobalAlertMgr", "  now show msg:%s", new Object[] { ((az)localObject2).cuh.bzH });
          com.tencent.mm.ui.base.h.b(((h)localObject5).yhZ, ((az)localObject2).cuh.bzH, ((az)localObject2).cuh.title, true);
        }
        if (!((h)localObject5).a(((h)localObject5).yib))
          aw.RS().m(new h.6((h)localObject5), 500L);
        ((h)localObject5).yib = null;
        com.tencent.mm.sdk.a.b.cE(true);
        bool2 = ((HomeUI)localObject1).yiN.dxM();
        if ((!bool2) && (aw.RK()))
        {
          com.tencent.mm.blink.b.HQ().o(new HomeUI.35((HomeUI)localObject1));
          if ((com.tencent.mm.bh.d.fUv != null) && (com.tencent.mm.bh.d.fUu != null) && (!com.tencent.mm.platformtools.ah.isNullOrNil(com.tencent.mm.bh.d.fUu.akM())))
          {
            ab.i("MicroMsg.LauncherUI.HomeUI", "launcher onResume end track %s", new Object[] { com.tencent.mm.bh.d.fUv.akN() });
            localObject2 = new ez();
            ((ez)localObject2).cys.username = com.tencent.mm.bh.d.fUv.akN();
            com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject2);
          }
        }
        if (!bool2)
        {
          j.a(((HomeUI)localObject1).yhZ, 3, ((HomeUI)localObject1).yiP.mbt, "directReport_onResume");
          ((HomeUI)localObject1).yiP.Nj(360);
        }
        com.tencent.mm.ui.widget.h.b(((HomeUI)localObject1).yhZ);
        ((HomeUI)localObject1).yhZ.onSwipe(1.0F);
        ((HomeUI)localObject1).yiM = HomeUI.a.yjs;
        if (((HomeUI)localObject1).yix)
        {
          ((HomeUI)localObject1).yix = false;
          ((HomeUI)localObject1).yix = false;
        }
        com.tencent.mm.ah.n.acp();
        long l2 = System.currentTimeMillis();
        ab.w("MicroMsg.LauncherUI.HomeUI", "[Launching Application]");
        l.m(((HomeUI)localObject1).yhZ, false);
        l.n(((HomeUI)localObject1).yhZ, false);
        l3 = System.currentTimeMillis();
        if (!((HomeUI)localObject1).yhZ.getSharedPreferences(com.tencent.mm.sdk.platformtools.ah.doA(), 0).getBoolean("settings_landscape_mode", false))
          break label3103;
        ((HomeUI)localObject1).yhZ.setRequestedOrientation(-1);
        label1569: long l4 = System.currentTimeMillis();
        if (getInstance() != null)
        {
          com.tencent.mm.blink.b.HQ().HT();
          ((com.tencent.mm.plugin.messenger.foundation.a.p)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.messenger.foundation.a.p.class)).getSysCmdMsgExtension().a("showprivacypolicy", ((HomeUI)localObject1).yjk);
          ((HomeUI)localObject1).pH(false);
          com.tencent.mm.sdk.b.a.xxA.c(((HomeUI)localObject1).qjs);
          ab.d("MicroMsg.LauncherUI.HomeUI", "KEVIN MainTabUI onResume:" + (System.currentTimeMillis() - l4));
          if (aw.RK())
            ((HomeUI)localObject1).dxu();
        }
        ab.v("MicroMsg.LauncherUI.HomeUI", "KEVIN dispatch resume " + (System.currentTimeMillis() - l3));
        ab.d("MicroMsg.LauncherUI.HomeUI", "KEVIN LaucherUI lauch last : " + (System.currentTimeMillis() - l2));
        ab.i("MicroMsg.LauncherUI.HomeUI", "initView " + (System.currentTimeMillis() - l1));
        if (((HomeUI)localObject1).yix)
        {
          ((HomeUI)localObject1).yix = false;
          ((HomeUI)localObject1).yix = false;
        }
        localObject2 = com.tencent.mm.app.n.Bw();
        ((com.tencent.mm.app.n)localObject2).ceU = true;
        ((com.tencent.mm.app.n)localObject2).ceV.removeMessages(-1999);
        ((com.tencent.mm.app.n)localObject2).ceV.removeMessages(-2999);
        ab.i("MicroMsg.LauncherUI.HomeUI", "start time check LauncherUI Launcher onResume end: " + (System.currentTimeMillis() - l1));
        if (com.tencent.mm.model.r.Zf().booleanValue())
          ((HomeUI)localObject1).dxi();
        i = com.tencent.mm.kernel.g.RP().Ry().getInt(ac.a.xWX, 0);
        if (i != 0)
        {
          com.tencent.mm.kernel.g.RP().Ry().set(ac.a.xWX, Integer.valueOf(0));
          if (com.tencent.mm.model.r.Za());
        }
        switch (i)
        {
        default:
          label1896: com.tencent.mm.blink.b.HQ().o(new HomeUI.37((HomeUI)localObject1));
          if (((HomeUI)localObject1).getMainTabUI().mbt != 3)
          {
            localObject1 = (MoreTabUI)((HomeUI)localObject1).getMainTabUI().Nn(3);
            if ((((MoreTabUI)localObject1).yoh != null) && (!((MoreTabUI)localObject1).yoh.isVisible))
            {
              ((MoreTabUI)localObject1).yoh.dLf();
              ((MoreTabUI)localObject1).caE();
            }
          }
          localObject1 = this.chattingTabUI;
          ((NewChattingTabUI)localObject1).ypf = com.tencent.mm.platformtools.ah.anT();
          if (((NewChattingTabUI)localObject1).cXe())
          {
            ((NewChattingTabUI)localObject1).ypi = new NewChattingTabUI.1((NewChattingTabUI)localObject1);
            al.n(new NewChattingTabUI.2((NewChattingTabUI)localObject1), 500L);
          }
          if (((NewChattingTabUI)localObject1).dxM())
          {
            ((NewChattingTabUI)localObject1).kT(3);
            if ((((NewChattingTabUI)localObject1).ypn != null) && (((NewChattingTabUI)localObject1).ypn.isSupportNavigationSwipeBack()))
              ((NewChattingTabUI)localObject1).ypn.getSwipeBackLayout().setEnableGesture(true);
            label2046: ab.i("MicroMsg.LauncherUI", "resumeNormalJump");
            MMFragmentActivity.a.dyv();
            if (("pushcontent_notification".equals(com.tencent.mm.sdk.platformtools.w.n(getIntent(), "nofification_type"))) && (!bo.isNullOrNil(com.tencent.mm.sdk.platformtools.w.n(getIntent(), "Main_FromUserName"))))
            {
              localObject1 = com.tencent.mm.sdk.platformtools.w.n(getIntent(), "Main_FromUserName");
              i = com.tencent.mm.sdk.platformtools.w.a(getIntent(), "MainUI_User_Last_Msg_Type", 0);
              ab.e("MicroMsg.LauncherUI", "launch report, fromUserName = %s, msgType = %d" + (String)localObject1 + i);
              com.tencent.mm.plugin.report.service.h.pYm.e(10856, new Object[] { Integer.valueOf(i), localObject1, Integer.valueOf(0) });
            }
            localObject1 = com.tencent.mm.sdk.platformtools.w.n(getIntent(), "LauncherUI.Shortcut.LaunchType");
            if (localObject1 != null)
            {
              if (!((String)localObject1).equals("launch_type_voip"))
                break label3182;
              ab.d("MicroMsg.LauncherUI", "launch, LaunchTypeVOIP");
              startActivity(new Intent().setClassName(this, "com.tencent.mm.ui.contact.VoipAddressUI").putExtra("LauncherUI.Shortcut.LaunchType", "launch_type_voip"));
              com.tencent.mm.plugin.report.service.h.pYm.e(11034, new Object[] { Integer.valueOf(2), Integer.valueOf(0) });
            }
            label2261: localObject1 = com.tencent.mm.sdk.platformtools.w.n(getIntent(), "LauncherUI.switch.tab");
            if (!bo.isNullOrNil((String)localObject1))
            {
              this.yjJ.getMainTabUI().aqG((String)localObject1);
              getIntent().putExtra("LauncherUI.switch.tab", "");
            }
            if ((com.tencent.mm.sdk.platformtools.w.a(getIntent(), "LauncherUI.From.Scaner.Shortcut", false)) || (this.yjN))
            {
              this.yjN = false;
              localObject1 = getInstance();
              if (localObject1 != null)
                ((LauncherUI)localObject1).yjJ.dxo();
              getIntent().putExtra("LauncherUI.From.Scaner.Shortcut", false);
              getIntent().putExtra("LauncherUI.switch.tab", "tab_find_friend");
            }
            bool2 = com.tencent.mm.sdk.platformtools.w.a(getIntent(), "LauncherUI.From.Biz.Shortcut", false);
            if (!bool2)
              break label3257;
            localObject1 = com.tencent.mm.sdk.platformtools.w.n(getIntent(), "LauncherUI.Shortcut.Username");
            label2400: if (bool2)
            {
              ab.d("MicroMsg.LauncherUI", "launch, fromBizShortcut, bizUsername = ".concat(String.valueOf(localObject1)));
              if (!bo.isNullOrNil((String)localObject1))
              {
                localObject5 = com.tencent.mm.plugin.base.model.b.Fs((String)localObject1);
                if (!bo.isNullOrNil((String)localObject5))
                {
                  if (com.tencent.mm.model.t.mY((String)localObject5))
                  {
                    ab.d("MicroMsg.LauncherUI", "launch, username is contact, go to chattingui");
                    if (!com.tencent.mm.aj.f.ra((String)localObject5))
                      break label3474;
                    if (!com.tencent.mm.aj.f.kq((String)localObject5))
                      break label3281;
                    localObject1 = new Intent();
                    ((Intent)localObject1).setClassName(this, "com.tencent.mm.ui.bizchat.BizChatConversationUI");
                    ((Intent)localObject1).putExtra("Contact_User", (String)localObject5);
                    ((Intent)localObject1).putExtra("biz_chat_from_scene", 9);
                    ((Intent)localObject1).addFlags(67108864);
                    startActivity((Intent)localObject1);
                  }
                  getIntent().putExtra("LauncherUI_From_Biz_Shortcut", false);
                  getIntent().putExtra("LauncherUI.From.Biz.Shortcut", false);
                }
              }
            }
            label2522: this.yjM = true;
          }
          break;
        case 1:
        }
      }
    }
    while (true)
    {
      while (true)
      {
        com.tencent.mm.blink.a.ig(5);
        if (!yjI)
          pM(false);
        dxG();
        com.tencent.mm.blink.a.jD("LauncherUI");
        AppMethodBeat.o(29456);
        break;
        l3 = System.currentTimeMillis();
        MMActivity.initLanguage(((HomeUI)localObject1).yhZ);
        try
        {
          localObject5 = new java/util/HashSet;
          ((HashSet)localObject5).<init>();
          localObject2 = ((HomeUI)localObject1).getString(2131298792).split(";");
          ((Set)localObject5).add(localObject2[0]);
          ((Set)localObject5).add(localObject2[1]);
          s.c((Set)localObject5);
          com.tencent.mm.kernel.g.RQ();
          com.tencent.mm.kernel.g.RS().aa(new HomeUI.14((HomeUI)localObject1));
          ab.d("MicroMsg.LauncherUI.HomeUI", "KEVIN MainTabUI onCreate initLanguage: " + (System.currentTimeMillis() - l3));
          ((HomeUI)localObject1).ezi = ((LayoutInflater)((HomeUI)localObject1).yhZ.getSystemService("layout_inflater"));
          l3 = System.currentTimeMillis();
          ((HomeUI)localObject1).contentView = com.tencent.mm.kiss.a.b.SM().a(((HomeUI)localObject1).yhZ, "R.layout.main_tab", 2130970021);
          if ((((HomeUI)localObject1).contentView != null) && (Build.VERSION.SDK_INT >= 23) && (!com.tencent.mm.compatible.util.h.Mt()))
            ((HomeUI)localObject1).contentView.setBackgroundColor(((HomeUI)localObject1).yhZ.getResources().getColor(2131690310));
          com.tencent.mm.blink.b.HQ().HR();
          ((FirstScreenFrameLayout)((HomeUI)localObject1).contentView.findViewById(2131825729)).ebs = new HomeUI.12((HomeUI)localObject1);
          am.dhM();
          ab.d("MicroMsg.LauncherUI.HomeUI", "KEVIN MainTabUI onCreate inflater.inflate(R.layout.main_tab, null);" + (System.currentTimeMillis() - l3));
          ((HomeUI)localObject1).yhZ.setContentView(((HomeUI)localObject1).contentView);
          Looper.myQueue().addIdleHandler(((HomeUI)localObject1).jQs);
          ((HomeUI)localObject1).yiw = true;
          ab.d("MicroMsg.LauncherUI.HomeUI", "KEVIN MainTabUI onCreate initView(); " + (System.currentTimeMillis() - l3));
          l3 = System.currentTimeMillis();
          ab.d("MicroMsg.LauncherUI.HomeUI", "KEVIN handleJump(getIntent()); " + (System.currentTimeMillis() - l3));
          l3 = System.currentTimeMillis();
          ab.d("MicroMsg.LauncherUI.HomeUI", "KEVIN syncAddrBookAndUpload checkLastLbsroomAndQuitIt " + (System.currentTimeMillis() - l3));
          ((HomeUI)localObject1).initActionBar();
          ((HomeUI)localObject1).mActionBar.show();
          ((HomeUI)localObject1).contentView.post(new HomeUI.23((HomeUI)localObject1));
          ab.v("MicroMsg.LauncherUI.HomeUI", "KEVIN MainTabUI onCreate : " + (System.currentTimeMillis() - l1));
          al.n(new HomeUI.32((HomeUI)localObject1), 2000L);
          ((HomeUI)localObject1).contentView.addOnLayoutChangeListener(((HomeUI)localObject1).yiU);
          com.tencent.mm.pluginsdk.f.b(((HomeUI)localObject1).yhZ, ((HomeUI)localObject1).contentView);
          ((HomeUI)localObject1).contentView.postDelayed(new HomeUI.33((HomeUI)localObject1), 20L);
        }
        catch (Exception localException)
        {
          while (true)
            ab.printErrStackTrace("MicroMsg.LauncherUI.HomeUI", localException, "", new Object[0]);
        }
      }
      label3091: aw.getNotification().bv(false);
      break label956;
      label3103: ((HomeUI)localObject1).yhZ.setRequestedOrientation(1);
      break label1569;
      com.tencent.mm.ui.base.h.a(((HomeUI)localObject1).yhZ, ((HomeUI)localObject1).getString(2131301002), "", new HomeUI.36((HomeUI)localObject1), null);
      break label1896;
      if (!((NewChattingTabUI)localObject1).ypq)
        break label2046;
      ab.w("MicroMsg.LauncherUI.NewChattingTabUI", "[onResume] need exec this runnable!");
      al.af(((NewChattingTabUI)localObject1).mStartChattingRunnable);
      al.d(((NewChattingTabUI)localObject1).mStartChattingRunnable);
      ((NewChattingTabUI)localObject1).ypq = false;
      break label2046;
      label3182: if (!((String)localObject1).equals("launch_type_voip_audio"))
        break label2261;
      ab.d("MicroMsg.LauncherUI", "launch, LaunchTypeVOIPAudio");
      startActivity(new Intent().setClassName(this, "com.tencent.mm.ui.contact.VoipAddressUI").putExtra("LauncherUI.Shortcut.LaunchType", "launch_type_voip_audio"));
      com.tencent.mm.plugin.report.service.h.pYm.e(11034, new Object[] { Integer.valueOf(2), Integer.valueOf(1) });
      break label2261;
      label3257: bool2 = com.tencent.mm.sdk.platformtools.w.a(getIntent(), "LauncherUI_From_Biz_Shortcut", false);
      localObject1 = getIntent().getAction();
      break label2400;
      label3281: if (com.tencent.mm.aj.f.rc((String)localObject5))
      {
        localObject1 = new Intent();
        ((Intent)localObject1).setClassName(this, "com.tencent.mm.ui.conversation.EnterpriseConversationUI");
        ((Intent)localObject1).putExtra("enterprise_biz_name", (String)localObject5);
        ((Intent)localObject1).putExtra("enterprise_biz_display_name", s.mJ((String)localObject5));
        startActivity((Intent)localObject1);
        break label2522;
      }
      if (com.tencent.mm.aj.f.rd((String)localObject5))
      {
        localObject1 = com.tencent.mm.aj.f.qX((String)localObject5);
        if (localObject1 == null);
        for (localObject1 = null; ; localObject1 = ((com.tencent.mm.aj.d)localObject1).adT())
        {
          localObject3 = localObject1;
          if (localObject1 == null)
            localObject3 = "";
          localObject1 = new Intent();
          ((Intent)localObject1).putExtra("rawUrl", (String)localObject3);
          ((Intent)localObject1).putExtra("useJs", true);
          ((Intent)localObject1).putExtra("srcUsername", (String)localObject5);
          ((Intent)localObject1).putExtra("bizofstartfrom", "enterpriseHomeSubBrand");
          ((Intent)localObject1).addFlags(67108864);
          com.tencent.mm.bp.d.b(this, "webview", ".ui.tools.WebViewUI", (Intent)localObject1);
          break;
        }
      }
      Object localObject3 = getInstance();
      localObject1 = new Bundle();
      ((Bundle)localObject1).putInt("chat_from_scene", 3);
      ((LauncherUI)localObject3).startChatting((String)localObject5, (Bundle)localObject1, false);
      break label2522;
      label3474: localObject1 = getInstance();
      if (localObject1 == null)
        break label2522;
      ((LauncherUI)localObject1).startChatting((String)localObject5, null, false);
      break label2522;
      if (!yjI)
        dxL();
    }
  }

  public void onSaveInstanceState(Bundle paramBundle)
  {
    AppMethodBeat.i(29474);
    Object localObject = this.chattingTabUI;
    if (((NewChattingTabUI)localObject).ypn != null)
    {
      localObject = ((NewChattingTabUI)localObject).ypn.cgL.getTalkerUserName();
      if (!com.tencent.mm.platformtools.ah.isNullOrNil((String)localObject))
      {
        ab.i("MicroMsg.LauncherUI.NewChattingTabUI", "onSaveInstanceState:%s", new Object[] { localObject });
        paramBundle.putString("last_restore_talker", (String)localObject);
      }
    }
    AppMethodBeat.o(29474);
  }

  public void onSettle(boolean paramBoolean, int paramInt)
  {
    AppMethodBeat.i(29471);
    if ((this.yjL) && (!this.chattingTabUI.G(paramBoolean, paramInt)))
      super.onSettle(paramBoolean, paramInt);
    AppMethodBeat.o(29471);
  }

  public void onStop()
  {
    AppMethodBeat.i(29465);
    ab.i("MicroMsg.LauncherUI", "onStop");
    com.tencent.mm.blink.a.HL();
    HomeUI localHomeUI = this.yjJ;
    ((com.tencent.mm.plugin.messenger.foundation.a.p)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.messenger.foundation.a.p.class)).getSysCmdMsgExtension().b("showprivacypolicy", localHomeUI.yjk);
    super.onStop();
    AppMethodBeat.o(29465);
  }

  public void onSwipe(float paramFloat)
  {
    AppMethodBeat.i(29470);
    if ((this.yjL) && (!this.chattingTabUI.bo(paramFloat)))
      super.onSwipe(paramFloat);
    AppMethodBeat.o(29470);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }

  public ActionMode onWindowStartingActionMode(ActionMode.Callback paramCallback)
  {
    Object localObject1 = null;
    AppMethodBeat.i(29478);
    Object localObject2 = this.chattingTabUI;
    Object localObject3 = localObject1;
    if (((NewChattingTabUI)localObject2).ypn != null)
    {
      localObject3 = localObject1;
      if (((NewChattingTabUI)localObject2).ypn.dBO() != null)
      {
        if (((NewChattingTabUI)localObject2).ypn.isSupportCustomActionBar())
          break label71;
        localObject3 = localObject1;
      }
    }
    while (true)
    {
      localObject1 = localObject3;
      if (localObject3 == null)
        localObject1 = super.onWindowStartingActionMode(paramCallback);
      AppMethodBeat.o(29478);
      return localObject1;
      label71: localObject3 = localObject1;
      if (!com.tencent.mm.compatible.util.d.iX(22))
      {
        localObject2 = ((NewChattingTabUI)localObject2).ypn.dBO().startActionMode(paramCallback);
        localObject3 = localObject1;
        if (localObject2 != null)
          localObject3 = localObject2;
      }
    }
  }

  public final void startChatting(String paramString, Bundle paramBundle, boolean paramBoolean)
  {
    AppMethodBeat.i(29481);
    this.yjJ.dxn();
    this.chattingTabUI.startChatting(paramString, paramBundle, paramBoolean);
    AppMethodBeat.o(29481);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.LauncherUI
 * JD-Core Version:    0.6.2
 */