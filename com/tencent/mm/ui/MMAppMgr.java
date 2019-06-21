package com.tencent.mm.ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.Intent.ShortcutIconResource;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.location.LocationManager;
import android.os.Looper;
import android.os.Process;
import android.text.Spannable;
import android.text.Spannable.Factory;
import android.text.method.LinkMovementMethod;
import android.text.style.StyleSpan;
import android.view.KeyEvent;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.TextView;
import com.tencent.mars.BaseEvent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.booter.CoreService;
import com.tencent.mm.booter.NotifyReceiver.NotifyService;
import com.tencent.mm.booter.cache.CacheService;
import com.tencent.mm.booter.x.a;
import com.tencent.mm.g.a.cu;
import com.tencent.mm.g.a.gd;
import com.tencent.mm.g.a.jl;
import com.tencent.mm.g.a.oe;
import com.tencent.mm.g.a.pc;
import com.tencent.mm.model.aw;
import com.tencent.mm.network.aa;
import com.tencent.mm.plugin.webview.ui.tools.bag.l;
import com.tencent.mm.plugin.webview.ui.tools.bag.l.a;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.sdk.platformtools.MMNativeJpeg;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.ap.a;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.o;
import com.tencent.mm.storage.y;
import com.tencent.mm.ui.widget.a.c.a;
import com.tencent.xweb.w;

public final class MMAppMgr
{
  private static StringBuffer ymG;
  private static long ymH;
  public static boolean ymL = true;
  private final ap cfq;
  private long fPQ;
  private String gEn;
  public MMAppMgr.Receiver ymI;
  private boolean ymJ;
  private boolean ymK;
  private final ap ymM;
  public int ymN;
  private boolean ymO;
  private final ap ymP;

  public MMAppMgr()
  {
    AppMethodBeat.i(29569);
    this.ymJ = false;
    this.ymK = false;
    this.cfq = new ap(new MMAppMgr.1(this), true);
    this.ymM = new ap(Looper.getMainLooper(), new MMAppMgr.9(this), false);
    this.ymN = 0;
    this.ymO = true;
    this.ymP = new ap(Looper.getMainLooper(), new ap.a()
    {
      public final boolean BI()
      {
        boolean bool = false;
        AppMethodBeat.i(29558);
        if (MMAppMgr.this.ymN >= 30)
          AppMethodBeat.o(29558);
        while (true)
        {
          return bool;
          if ((!o.gn(com.tencent.mm.sdk.platformtools.ah.getContext())) && (!MMAppMgr.b(MMAppMgr.this)) && (com.tencent.mm.kernel.g.RN().QY()))
          {
            MMAppMgr.b(MMAppMgr.this, true);
            l.uzq.dbi();
            AppMethodBeat.o(29558);
          }
          else if ((MMAppMgr.b(MMAppMgr.this)) && (MMAppMgr.d(MMAppMgr.this)) && (com.tencent.mm.kernel.g.RN().QY()))
          {
            MMAppMgr.b(MMAppMgr.this, false);
            l.uzq.nU(true);
            AppMethodBeat.o(29558);
          }
          else
          {
            MMAppMgr localMMAppMgr = MMAppMgr.this;
            localMMAppMgr.ymN += 1;
            AppMethodBeat.o(29558);
            bool = true;
          }
        }
      }
    }
    , true);
    AppMethodBeat.o(29569);
  }

  public static void BV()
  {
    AppMethodBeat.i(29575);
    aw.getNotification().BV();
    AppMethodBeat.o(29575);
  }

  public static boolean Ch()
  {
    return false;
  }

  public static boolean a(Activity paramActivity, DialogInterface.OnClickListener paramOnClickListener)
  {
    AppMethodBeat.i(29587);
    SharedPreferences localSharedPreferences = paramActivity.getSharedPreferences(com.tencent.mm.sdk.platformtools.ah.doA(), 0);
    boolean bool = localSharedPreferences.getBoolean("gprs_alert", true);
    com.tencent.mm.sdk.platformtools.g.xye &= bool;
    if (bool)
    {
      View localView = View.inflate(paramActivity, 2130969804, null);
      Object localObject1 = paramActivity.getString(2131302021);
      Object localObject2 = paramActivity.getString(2131301301);
      String str = paramActivity.getString(2131301300, new Object[] { localObject1, localObject2 });
      Object localObject3 = Spannable.Factory.getInstance().newSpannable(str);
      MMAppMgr.2 local2 = new MMAppMgr.2(paramActivity);
      int i = str.indexOf((String)localObject1);
      int j = str.indexOf((String)localObject1);
      ((Spannable)localObject3).setSpan(local2, i, ((String)localObject1).length() + j, 33);
      localObject1 = new StyleSpan(1);
      i = str.indexOf((String)localObject2);
      j = str.indexOf((String)localObject2);
      ((Spannable)localObject3).setSpan(localObject1, i, ((String)localObject2).length() + j, 33);
      localObject2 = (TextView)localView.findViewById(2131824691);
      ((TextView)localObject2).setText((CharSequence)localObject3);
      ((TextView)localObject2).setMovementMethod(LinkMovementMethod.getInstance());
      localObject3 = (CheckBox)localView.findViewById(2131824692);
      paramOnClickListener = com.tencent.mm.ui.base.h.a(paramActivity, false, null, localView, paramActivity.getString(2131298421), paramActivity.getString(2131301297), new MMAppMgr.3((CheckBox)localObject3, localSharedPreferences, paramActivity, paramOnClickListener), new MMAppMgr.4(paramActivity));
      if (paramOnClickListener == null)
      {
        bool = false;
        AppMethodBeat.o(29587);
      }
    }
    while (true)
    {
      return bool;
      paramOnClickListener.setOnCancelListener(new DialogInterface.OnCancelListener()
      {
        public final void onCancel(DialogInterface paramAnonymousDialogInterface)
        {
          AppMethodBeat.i(29552);
          this.ghG.onKeyDown(4, new KeyEvent(0, 4));
          AppMethodBeat.o(29552);
        }
      });
      AppMethodBeat.o(29587);
    }
  }

  public static boolean a(Context paramContext, int paramInt, DialogInterface.OnClickListener paramOnClickListener1, DialogInterface.OnClickListener paramOnClickListener2)
  {
    AppMethodBeat.i(29588);
    View localView = View.inflate(paramContext, 2130970300, null);
    Object localObject = (CheckBox)localView.findViewById(2131826341);
    ((CheckBox)localObject).setText(paramContext.getString(2131301660));
    ((CheckBox)localObject).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
    {
      public final void onCheckedChanged(CompoundButton paramAnonymousCompoundButton, boolean paramAnonymousBoolean)
      {
        AppMethodBeat.i(29553);
        aw.ZK();
        paramAnonymousCompoundButton = com.tencent.mm.model.c.Ry();
        if (!paramAnonymousBoolean);
        for (paramAnonymousBoolean = true; ; paramAnonymousBoolean = false)
        {
          paramAnonymousCompoundButton.set(16385, Boolean.valueOf(paramAnonymousBoolean));
          AppMethodBeat.o(29553);
          return;
        }
      }
    });
    localView.findViewById(2131826340).setVisibility(8);
    localObject = (TextView)localView.findViewById(2131826339);
    switch (paramInt)
    {
    case 2:
    default:
      ((TextView)localObject).setText(2131301669);
      paramInt = 1;
      if (paramInt != 0)
      {
        paramContext = new c.a(paramContext);
        paramContext.PV(2131297061);
        paramContext.rc(false);
        paramContext.fn(localView);
        paramContext.Qc(2131301666).a(paramOnClickListener1);
        paramContext.Qd(2131301660).b(paramOnClickListener2);
        paramContext.aMb().show();
        AppMethodBeat.o(29588);
      }
      break;
    case 3:
    case 1:
    }
    for (boolean bool = true; ; bool = false)
    {
      return bool;
      ((TextView)localObject).setText(2131301669);
      paramInt = 0;
      break;
      ((TextView)localObject).setText(2131301659);
      paramInt = 1;
      break;
      AppMethodBeat.o(29588);
    }
  }

  public static void aAd()
  {
    AppMethodBeat.i(29576);
    pQ(true);
    AppMethodBeat.o(29576);
  }

  public static void aq(Activity paramActivity)
  {
    AppMethodBeat.i(29584);
    new Intent();
    com.tencent.mm.bp.d.H(paramActivity, "whatsnew", ".ui.WhatsNewUI");
    AppMethodBeat.o(29584);
  }

  private static String aqF(String paramString)
  {
    AppMethodBeat.i(29572);
    int i = 0;
    int j = paramString.length() - 1;
    while (j >= 0)
    {
      int k = i;
      if (paramString.charAt(j) == '|')
        k = i + 1;
      if (k == 3)
        break;
      j--;
      i = k;
    }
    paramString = paramString.substring(j + 1);
    AppMethodBeat.o(29572);
    return paramString;
  }

  public static boolean ar(Activity paramActivity)
  {
    AppMethodBeat.i(29586);
    boolean bool = a(paramActivity, null);
    AppMethodBeat.o(29586);
    return bool;
  }

  public static void bd(Context paramContext)
  {
    AppMethodBeat.i(29579);
    k(paramContext, true);
    AppMethodBeat.o(29579);
  }

  public static void be(Context paramContext)
  {
    AppMethodBeat.i(29581);
    aa.anh().edit().putBoolean("is_in_notify_mode", true).commit();
    aj.amB("welcome_page_show");
    ((com.tencent.mm.plugin.notification.b.a)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.notification.b.a.class)).getNotification().k(-1, null);
    com.tencent.mm.g.a.z localz = new com.tencent.mm.g.a.z();
    localz.csU.csV = false;
    com.tencent.mm.sdk.b.a.xxA.m(localz);
    com.tencent.mm.plugin.setting.b.gkF.BV();
    ((com.tencent.mm.plugin.notification.b.a)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.notification.b.a.class)).getNotification().IH();
    k(paramContext, false);
    AppMethodBeat.o(29581);
  }

  public static com.tencent.mm.ui.widget.a.c bg(Context paramContext)
  {
    AppMethodBeat.i(29589);
    try
    {
      localObject = (LocationManager)paramContext.getSystemService("location");
      if (at.isWifi(paramContext))
      {
        boolean bool = ((LocationManager)localObject).isProviderEnabled("gps");
        if (bool)
        {
          AppMethodBeat.o(29589);
          paramContext = null;
          return paramContext;
        }
      }
    }
    catch (Exception paramContext)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.MMAppMgr", paramContext, "showLbsTipsAlert error", new Object[0]);
        AppMethodBeat.o(29589);
        paramContext = null;
        continue;
        aw.ZK();
        Object localObject = (Boolean)com.tencent.mm.model.c.Ry().get(4105, Boolean.FALSE);
        if ((localObject != null) && (((Boolean)localObject).booleanValue()))
        {
          AppMethodBeat.o(29589);
          paramContext = null;
        }
        else
        {
          View localView = View.inflate(paramContext, 2130969932, null);
          ((CheckBox)localView.findViewById(2131825253)).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
          {
            public final void onCheckedChanged(CompoundButton paramAnonymousCompoundButton, boolean paramAnonymousBoolean)
            {
              AppMethodBeat.i(29554);
              if (paramAnonymousBoolean)
              {
                aw.ZK();
                com.tencent.mm.model.c.Ry().set(4105, Boolean.TRUE);
                AppMethodBeat.o(29554);
              }
              while (true)
              {
                return;
                aw.ZK();
                com.tencent.mm.model.c.Ry().set(4105, Boolean.FALSE);
                AppMethodBeat.o(29554);
              }
            }
          });
          localObject = new DialogInterface.OnClickListener()
          {
            public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
            {
              AppMethodBeat.i(29555);
              try
              {
                paramAnonymousDialogInterface = new android/content/Intent;
                paramAnonymousDialogInterface.<init>("android.settings.LOCATION_SOURCE_SETTINGS");
                this.val$context.startActivity(paramAnonymousDialogInterface);
                AppMethodBeat.o(29555);
                return;
              }
              catch (Exception paramAnonymousDialogInterface)
              {
                while (true)
                {
                  ab.printErrStackTrace("MicroMsg.MMAppMgr", paramAnonymousDialogInterface, "showLbsTipsAlert", new Object[0]);
                  AppMethodBeat.o(29555);
                }
              }
            }
          };
          paramContext = new c.a(paramContext);
          paramContext.PV(2131301638);
          paramContext.fn(localView);
          paramContext.Qc(2131297046).a((DialogInterface.OnClickListener)localObject);
          paramContext.Qd(2131296958);
          paramContext = paramContext.aMb();
          paramContext.show();
          AppMethodBeat.o(29589);
        }
      }
    }
  }

  public static boolean c(Context paramContext, DialogInterface.OnClickListener paramOnClickListener)
  {
    AppMethodBeat.i(29582);
    boolean bool;
    if (!aw.RK())
    {
      AppMethodBeat.o(29582);
      bool = false;
    }
    while (true)
    {
      return bool;
      aw.ZK();
      int i = ((Integer)com.tencent.mm.model.c.Ry().get(65, Integer.valueOf(0))).intValue();
      if (i >= 5)
      {
        AppMethodBeat.o(29582);
        bool = false;
      }
      else if (!aj.amA("show_wap_adviser"))
      {
        AppMethodBeat.o(29582);
        bool = false;
      }
      else
      {
        View localView = View.inflate(paramContext, 2130970300, null);
        ((TextView)localView.findViewById(2131826339)).setText(2131301667);
        paramContext = new c.a(paramContext);
        paramContext.PV(2131297061);
        paramContext.fn(localView);
        paramContext.Qc(2131296994).a(new MMAppMgr.11(i));
        paramContext.rc(false);
        paramContext.Qd(2131301664).b(new MMAppMgr.12());
        paramContext.a(new MMAppMgr.13(paramOnClickListener));
        paramContext.aMb().show();
        bool = true;
        AppMethodBeat.o(29582);
      }
    }
  }

  public static void cancelNotification(String paramString)
  {
    AppMethodBeat.i(29574);
    aw.getNotification().cancelNotification(paramString);
    AppMethodBeat.o(29574);
  }

  private static void dyq()
  {
    AppMethodBeat.i(29571);
    StringBuffer localStringBuffer = new StringBuffer(800);
    if (ymG == null)
    {
      ymG = localStringBuffer;
      ymH = bo.anT();
      AppMethodBeat.o(29571);
    }
    while (true)
    {
      return;
      String str = ymG.toString();
      localStringBuffer.append(aqF(str));
      ymG = localStringBuffer;
      ab.i("MicroMsg.MMAppMgr", "oreh report clickstream %s", new Object[] { str });
      com.tencent.mm.plugin.report.service.h.pYm.X(10508, "1," + ymH + "," + str);
      ymH = bo.anT();
      AppMethodBeat.o(29571);
    }
  }

  public static void dyr()
  {
    AppMethodBeat.i(29573);
    com.tencent.mrs.a.onDestroy();
    dyq();
    ab.appenderClose();
    BaseEvent.onSingalCrash(0);
    AppMethodBeat.o(29573);
  }

  public static void dys()
  {
    AppMethodBeat.i(29578);
    Context localContext = com.tencent.mm.sdk.platformtools.ah.getContext();
    if (localContext != null)
    {
      if (!com.tencent.mm.booter.c.Ij())
        break label80;
      com.tencent.mm.app.e.Bc();
    }
    while (true)
    {
      com.tencent.mm.bp.d.aI(new Intent(localContext, NotifyReceiver.NotifyService.class));
      localContext.stopService(new Intent(localContext, CacheService.class));
      com.tencent.mm.bp.d.l(new Intent().setClassName(localContext, "com.tencent.mm.plugin.exdevice.service.ExDeviceService"), "exdevice");
      AppMethodBeat.o(29578);
      return;
      try
      {
        label80: Intent localIntent = new android/content/Intent;
        localIntent.<init>(localContext, CoreService.class);
        localContext.stopService(localIntent);
      }
      catch (Exception localException)
      {
        ab.e("MicroMsg.MMAppMgr", "killService() Exception:%s", new Object[] { localException.getMessage() });
      }
    }
  }

  public static boolean hr(Context paramContext)
  {
    AppMethodBeat.i(29583);
    boolean bool;
    if (!aw.RK())
    {
      AppMethodBeat.o(29583);
      bool = false;
    }
    while (true)
    {
      return bool;
      aw.ZK();
      if (bo.e((Boolean)com.tencent.mm.model.c.Ry().get(61, null)))
      {
        AppMethodBeat.o(29583);
        bool = false;
      }
      else if (!aj.amA("show_wap_adviser"))
      {
        AppMethodBeat.o(29583);
        bool = false;
      }
      else
      {
        View localView = View.inflate(paramContext, 2130970300, null);
        ((TextView)localView.findViewById(2131826339)).setText(2131301668);
        Object localObject = (CheckBox)localView.findViewById(2131826341);
        ((CheckBox)localObject).setText(paramContext.getString(2131302026));
        ((CheckBox)localObject).setOnCheckedChangeListener(new MMAppMgr.14());
        ((CheckBox)localObject).setVisibility(0);
        localObject = new c.a(paramContext);
        ((c.a)localObject).PV(2131297061);
        ((c.a)localObject).fn(localView);
        ((c.a)localObject).Qc(2131302028).a(new MMAppMgr.15(paramContext));
        ((c.a)localObject).rc(false);
        ((c.a)localObject).Qd(2131302027);
        ((c.a)localObject).a(new MMAppMgr.16());
        ((c.a)localObject).aMb().show();
        bool = true;
        AppMethodBeat.o(29583);
      }
    }
  }

  public static void hs(Context paramContext)
  {
    AppMethodBeat.i(29585);
    SharedPreferences localSharedPreferences = paramContext.getSharedPreferences(com.tencent.mm.sdk.platformtools.ah.doA(), 0);
    if (!localSharedPreferences.getBoolean("Main_ShortCut", false))
    {
      Intent localIntent1 = new Intent("com.android.launcher.action.INSTALL_SHORTCUT");
      localIntent1.putExtra("android.intent.extra.shortcut.NAME", paramContext.getString(2131300940));
      localIntent1.putExtra("duplicate", false);
      Intent localIntent2 = new Intent("android.intent.action.MAIN");
      localIntent2.addCategory("android.intent.category.LAUNCHER");
      localIntent2.setComponent(new ComponentName(paramContext.getPackageName(), com.tencent.mm.sdk.platformtools.ah.doz() + ".ui.LauncherUI"));
      localIntent1.putExtra("android.intent.extra.shortcut.INTENT", localIntent2);
      localIntent1.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", Intent.ShortcutIconResource.fromContext(paramContext, 2130839047));
      localIntent1.putExtra("shortcut_icon_resource_id", 2130839047);
      localIntent1.putExtra("shortcut_is_adaptive_icon", true);
      localIntent1.putExtra("is_main_shortcut", true);
      com.tencent.mm.plugin.base.model.b.r(paramContext, localIntent1);
      paramContext = localSharedPreferences.edit();
      paramContext.putBoolean("Main_ShortCut", true);
      paramContext.commit();
    }
    AppMethodBeat.o(29585);
  }

  public static void k(Context paramContext, boolean paramBoolean)
  {
    AppMethodBeat.i(29580);
    com.tencent.mm.kernel.g.RQ().cn(paramBoolean);
    com.tencent.mrs.a.onDestroy();
    BaseEvent.onSingalCrash(0);
    MMNativeJpeg.Destroy();
    com.tencent.mm.booter.n.BY();
    if ((aw.Rg() != null) && (aw.Rg().ftA != null))
      aw.Rg().ftA.cH(paramBoolean);
    Intent localIntent = new Intent().setClass(paramContext, LauncherUI.class);
    localIntent.addFlags(67108864);
    localIntent.putExtra("absolutely_exit_pid", Process.myPid());
    localIntent.putExtra("kill_service", paramBoolean);
    if (!(paramContext instanceof Activity))
      localIntent.addFlags(268435456);
    paramContext.startActivity(localIntent);
    AppMethodBeat.o(29580);
  }

  public static void pQ(boolean paramBoolean)
  {
    AppMethodBeat.i(29577);
    ab.w("MicroMsg.MMAppMgr", "killProcess thread:%s proc:%d stack:%s, killService:%b", new Object[] { Thread.currentThread().getName(), Integer.valueOf(Process.myPid()), bo.dpG(), Boolean.valueOf(paramBoolean) });
    com.tencent.mm.plugin.report.b.d.u(2, 0, "");
    if (paramBoolean)
      dys();
    Object localObject = new com.tencent.mm.g.a.x();
    com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject);
    localObject = new jl();
    ((jl)localObject).cEK.status = 0;
    ((jl)localObject).cEK.boZ = 2;
    com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject);
    dyq();
    if (paramBoolean)
    {
      aw.lE(bo.dpG().toString());
      com.tencent.mm.kernel.g.RQ().releaseAll();
    }
    ab.appenderClose();
    BaseEvent.onSingalCrash(0);
    com.tencent.mrs.a.onDestroy();
    com.tencent.mm.bs.a.f(com.tencent.mm.sdk.platformtools.ah.getContext(), new String[] { "com.tencent.mm:recovery", "com.tencent.mm:support", "com.tencent.mm:tools", "com.tencent.mm:toolsmp", "com.tencent.mm:appbrand0", "com.tencent.mm:appbrand1", "com.tencent.mm:appbrand2", "com.tencent.mm:appbrand3", "com.tencent.mm:appbrand4" });
    try
    {
      w.clearAllWebViewCache(com.tencent.mm.sdk.platformtools.ah.getContext(), true);
      ab.i("MicroMsg.MMAppMgr", "clearAllWebViewCache");
      Process.killProcess(Process.myPid());
      AppMethodBeat.o(29577);
      return;
    }
    catch (Exception localException)
    {
      while (true)
        ab.i("MicroMsg.MMAppMgr", "clear cookie failed : %s", new Object[] { localException });
    }
  }

  public final void c(Intent paramIntent, boolean paramBoolean)
  {
    AppMethodBeat.i(29570);
    if (paramBoolean)
    {
      com.tencent.mm.ah.n.acp();
      localObject1 = new oe();
      ((oe)localObject1).cKx.state = 1;
      com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject1);
      localObject1 = new com.tencent.mm.g.a.d();
      ((com.tencent.mm.g.a.d)localObject1).crQ.crR = true;
      com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject1);
      localObject1 = new pc();
      ((pc)localObject1).cLr.active = true;
      com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject1);
      localObject1 = new cu();
      ((cu)localObject1).cvW.state = 1;
      com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject1);
    }
    Object localObject1 = new gd();
    ((gd)localObject1).cAs.csi = paramBoolean;
    com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject1);
    this.ymJ = paramBoolean;
    paramIntent = paramIntent.getStringExtra("classname");
    Object localObject2;
    if (bo.isNullOrNil(paramIntent))
    {
      paramIntent = "";
      if (!paramBoolean)
        break label378;
      localObject2 = com.tencent.mm.booter.x.ecN;
      if (((com.tencent.mm.booter.x)localObject2).ecY == -1L)
      {
        if (((com.tencent.mm.booter.x)localObject2).ecO.Ml(3) == 0)
          ((com.tencent.mm.booter.x)localObject2).ecO.setLong(1, com.tencent.mm.platformtools.ah.anT());
        ((com.tencent.mm.booter.x)localObject2).ecY = com.tencent.mm.platformtools.ah.anT();
        if (((com.tencent.mm.booter.x)localObject2).ecR != null)
          break label366;
        localObject1 = "null";
        label221: ab.i("MicroMsg.StayTimeReport", "onAppResume chatUser:%s, class:%s", new Object[] { localObject1, paramIntent });
        if (((com.tencent.mm.booter.x)localObject2).ecR != null)
        {
          ((com.tencent.mm.booter.x)localObject2).ecV = com.tencent.mm.platformtools.ah.yz();
          if ((paramIntent != null) && (paramIntent.contains("WebViewUI")))
            ((com.tencent.mm.booter.x)localObject2).ecW = com.tencent.mm.platformtools.ah.yz();
        }
      }
      label280: if (com.tencent.mm.kernel.g.RN().QY())
        if (bo.isNullOrNil(l.uzq.uzu.url))
          break label720;
    }
    label720: for (int i = 1; ; i = 0)
    {
      if (i != 0)
      {
        this.ymN = 0;
        this.ymP.ae(100L, 20L);
      }
      this.ymM.ae(800L, 800L);
      AppMethodBeat.o(29570);
      return;
      paramIntent = paramIntent.substring(paramIntent.lastIndexOf(".") + 1);
      break;
      label366: localObject1 = ((com.tencent.mm.booter.x)localObject2).ecR.ede;
      break label221;
      label378: localObject1 = com.tencent.mm.booter.x.ecN;
      if (((com.tencent.mm.booter.x)localObject1).ecY == -1L)
        break label280;
      long l = com.tencent.mm.platformtools.ah.anT();
      localObject2 = (String)((com.tencent.mm.booter.x)localObject1).ecO.get(2, "");
      localObject2 = (String)localObject2 + ((com.tencent.mm.booter.x)localObject1).ecY + "|" + l + "#";
      ((com.tencent.mm.booter.x)localObject1).ecO.set(2, localObject2);
      i = ((com.tencent.mm.booter.x)localObject1).ecO.Ml(3) + 1;
      ((com.tencent.mm.booter.x)localObject1).ecO.setInt(3, i);
      ab.i("MicroMsg.StayTimeReport", "onAppPause,appReportCnt:%d app(%d-%d)", new Object[] { Integer.valueOf(i), Long.valueOf(((com.tencent.mm.booter.x)localObject1).ecY), Long.valueOf(l) });
      ((com.tencent.mm.booter.x)localObject1).ecY = -1L;
      if ((com.tencent.mm.platformtools.ah.fp(((com.tencent.mm.booter.x)localObject1).ecO.getLong(1, 0L)) > 3600L * ((com.tencent.mm.booter.x)localObject1).eda) || (i > ((com.tencent.mm.booter.x)localObject1).ecZ))
      {
        com.tencent.mm.plugin.report.service.h.pYm.X(13110, (String)localObject2);
        ab.i("MicroMsg.StayTimeReport", "report appStayTime:%s", new Object[] { localObject2 });
        ((com.tencent.mm.booter.x)localObject1).ecO.set(2, "");
        ((com.tencent.mm.booter.x)localObject1).ecO.setInt(3, 0);
      }
      if (((com.tencent.mm.booter.x)localObject1).ecR == null)
        break label280;
      localObject2 = ((com.tencent.mm.booter.x)localObject1).ecR;
      ((x.a)localObject2).time += com.tencent.mm.platformtools.ah.az(((com.tencent.mm.booter.x)localObject1).ecV) / 1000L;
      if ((paramIntent != null) && (paramIntent.contains("WebViewUI")))
      {
        paramIntent = ((com.tencent.mm.booter.x)localObject1).ecR;
        paramIntent.edi = ((int)(paramIntent.edi + com.tencent.mm.platformtools.ah.az(((com.tencent.mm.booter.x)localObject1).ecW) / 1000L));
      }
      ab.i("MicroMsg.StayTimeReport", "onAppPause, chatting:totalTime:%d", new Object[] { Long.valueOf(((com.tencent.mm.booter.x)localObject1).ecR.time) });
      break label280;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.MMAppMgr
 * JD-Core Version:    0.6.2
 */