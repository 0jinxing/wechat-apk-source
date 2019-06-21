package com.tencent.mm.plugin.voip.widget;

import android.app.PendingIntent;
import android.app.PendingIntent.CanceledException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.graphics.Point;
import android.os.Build.VERSION;
import android.os.IBinder;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import android.os.Process;
import android.support.v4.app.v.c;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.model.an;
import com.tencent.mm.model.av;
import com.tencent.mm.model.s;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.voip.model.r;
import com.tencent.mm.plugin.voip.ui.VideoActivity;
import com.tencent.mm.plugin.voip.ui.c;
import com.tencent.mm.plugin.voip.video.CaptureView;
import com.tencent.mm.plugin.voip.video.OpenGlRender;
import com.tencent.mm.pluginsdk.permission.RequestFloatWindowPermissionDialog;
import com.tencent.mm.pluginsdk.permission.RequestFloatWindowPermissionDialog.a;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.f;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.z;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public final class b
  implements ServiceConnection, com.tencent.mm.plugin.voip.ui.b
{
  private byte[] buffer;
  private int mStatus;
  private boolean oGw;
  private int sRO;
  private CaptureView sRg;
  private ad sRl;
  private boolean sRm;
  private boolean sRn;
  private int sRr;
  private long sRs;
  private boolean sTb;
  private int sXS;
  private com.tencent.mm.sdk.platformtools.ap sZa;
  private com.tencent.mm.sdk.platformtools.ap tcA;
  private c tct;
  private BaseSmallView tcu;
  private com.tencent.mm.sdk.platformtools.ap tcv;
  private PowerManager.WakeLock tcw;
  private long tcx;
  private boolean tcy;
  private View.OnClickListener tcz;

  public b(c paramc, int paramInt, ad paramad, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    AppMethodBeat.i(5180);
    this.mStatus = -1;
    this.sRs = -1L;
    this.sRr = 1;
    this.tcx = -1L;
    this.tcy = false;
    this.sTb = false;
    this.sRO = 0;
    this.oGw = false;
    this.tcz = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        AppMethodBeat.i(5171);
        if (b.a(b.this) != null)
          b.a(b.this).setOnClickListener(null);
        b.b(b.this);
        paramAnonymousView = new Intent(ah.getContext(), VideoActivity.class);
        paramAnonymousView.setFlags(268435456);
        paramAnonymousView = PendingIntent.getActivity(ah.getContext(), 0, paramAnonymousView, 0);
        try
        {
          paramAnonymousView.send();
          AppMethodBeat.o(5171);
          return;
        }
        catch (PendingIntent.CanceledException paramAnonymousView)
        {
          while (true)
          {
            ab.printErrStackTrace("MicroMsg.Voip.VoipSmallWindow", paramAnonymousView, "send pending intent error: %s", new Object[] { paramAnonymousView.getMessage() });
            AppMethodBeat.o(5171);
          }
        }
      }
    };
    ab.i("MicroMsg.Voip.VoipSmallWindow", "initState: %s, talker: %s, isVideoCall: %b", new Object[] { com.tencent.mm.plugin.voip.a.b.GK(paramInt), paramad.field_username, Boolean.valueOf(paramBoolean1) });
    this.sRl = paramad;
    this.tct = paramc;
    this.sRn = paramBoolean1;
    this.sRm = paramBoolean2;
    this.sTb = paramBoolean3;
    fY(0, paramInt);
    this.tcw = ((PowerManager)ah.getContext().getSystemService("power")).newWakeLock(536870922, "MicroMsg.Voip.VoipSmallWindow");
    this.tcw.acquire();
    AppMethodBeat.o(5180);
  }

  private static String Bo()
  {
    AppMethodBeat.i(5208);
    String str1 = av.fly.T("login_weixin_username", "");
    String str2 = str1;
    if (bo.isNullOrNil(str1))
      str2 = av.fly.T("login_user_name", "never_login_crash");
    AppMethodBeat.o(5208);
    return str2;
  }

  private void GS(int paramInt)
  {
    AppMethodBeat.i(5182);
    switch (paramInt)
    {
    default:
      mF(true);
      AppMethodBeat.o(5182);
      return;
    case 4106:
      paramInt = 2131304468;
    case 4105:
    case 4099:
    }
    while (true)
    {
      GT(paramInt);
      break;
      paramInt = 2131304447;
      continue;
      if (this.sRn)
        paramInt = 2131304480;
      else
        paramInt = 2131304347;
    }
  }

  private static void GT(int paramInt)
  {
    AppMethodBeat.i(5183);
    Context localContext = ah.getContext();
    Toast.makeText(localContext, localContext.getString(paramInt), 1).show();
    AppMethodBeat.o(5183);
  }

  private void GU(int paramInt)
  {
    AppMethodBeat.i(5187);
    ab.i("MicroMsg.Voip.VoipSmallWindow", "showVoiceTalking");
    if (-1L == this.tcx)
      this.tcx = System.currentTimeMillis();
    if (2 == this.sRr)
      GT(2131304348);
    mF(false);
    if (this.tct != null)
      this.tct.a(this, 2);
    this.tcv = new com.tencent.mm.sdk.platformtools.ap(new b.3(this), true);
    this.tcv.ae(5000L, 5000L);
    String str = cLY();
    g(str, s.mJ(this.sRl.field_username), str, false);
    cLX();
    if (4101 == paramInt)
      GT(2131304473);
    AppMethodBeat.o(5187);
  }

  private void acc(String paramString)
  {
    AppMethodBeat.i(5188);
    try
    {
      if ((com.tencent.mm.compatible.util.d.iW(26)) && (!this.oGw))
      {
        this.oGw = true;
        Intent localIntent = new android/content/Intent;
        localIntent.<init>();
        localIntent.putExtra("Voip_User", this.sRl.field_username);
        localIntent.putExtra("mTickerText", paramString);
        localIntent.setClass(ah.getContext(), VoipForegroundService.class);
        ah.getContext().startForegroundService(localIntent);
      }
      AppMethodBeat.o(5188);
      return;
    }
    catch (Exception paramString)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.Voip.VoipSmallWindow", paramString, "bindSmallServiceIfNeed error: %s", new Object[] { paramString.getMessage() });
        AppMethodBeat.o(5188);
      }
    }
  }

  public static int bWV()
  {
    if (Build.VERSION.SDK_INT < 19);
    for (int i = 2130839731; ; i = 2130839733)
      return i;
  }

  private void cLU()
  {
    AppMethodBeat.i(5185);
    ab.i("MicroMsg.Voip.VoipSmallWindow", "show mini..");
    mF(false);
    Context localContext = ah.getContext();
    com.tencent.mm.plugin.voip.b.cIj();
    this.tcu = new a(localContext, r.mw(false));
    this.tcu.setConnectSec(this.sRs);
    this.tcu.setVoipUIListener(this.tct);
    localContext = ah.getContext();
    com.tencent.mm.plugin.voip.b.cIj();
    float f1 = r.mw(true);
    int i = ((WindowManager)localContext.getSystemService("window")).getDefaultDisplay().getHeight() / 5 + BackwardSupportUtil.b.b(localContext, 7.0F);
    float f2 = i;
    int j = (int)(BackwardSupportUtil.b.b(localContext, 7.0F) + f1 * f2);
    this.tcu.dY(j, i);
    this.tcu.setOnClickListener(this.tcz);
    ab.i("MicroMsg.Voip.VoipSmallWindow", "now add to view..");
    g(new Point(j, i));
    ab.i("MicroMsg.Voip.VoipSmallWindow", "steve: showMiniSmallView decMode:%d, beautyCmd:%d", new Object[] { Integer.valueOf(this.sXS), Integer.valueOf(this.sRO) });
    setHWDecMode(this.sXS);
    setVoipBeauty(this.sRO);
    AppMethodBeat.o(5185);
  }

  private void cLV()
  {
    AppMethodBeat.i(5186);
    if (2 == this.sRr)
      GT(2131304348);
    mF(false);
    String str = ah.getContext().getString(2131304489);
    g(str, s.mJ(this.sRl.field_username), str, true);
    cLX();
    if (this.tct != null)
      this.tct.a(this, 2);
    AppMethodBeat.o(5186);
  }

  private void cLX()
  {
    AppMethodBeat.i(5190);
    ab.i("MicroMsg.Voip.VoipSmallWindow", "showMini");
    boolean bool = false;
    if ((this.mStatus == 261) || (this.mStatus == 7))
    {
      this.tcA = new com.tencent.mm.sdk.platformtools.ap(new b.4(this), true);
      this.tcA.ae(1000L, 1000L);
      bool = true;
    }
    Intent localIntent = new Intent();
    localIntent.setClass(ah.getContext(), VideoActivity.class);
    localIntent.setFlags(268435456);
    localIntent.putExtra("Voip_User", this.sRl.field_username);
    localIntent.putExtra("Voip_Outcall", this.sRm);
    localIntent.putExtra("Voip_VideoCall", this.sRn);
    localIntent.putExtra("Voip_Is_Talking", bool);
    com.tencent.mm.plugin.voip.b.cIk().a(localIntent, new b.5(this));
    AppMethodBeat.o(5190);
  }

  private String cLY()
  {
    AppMethodBeat.i(5191);
    int i = (int)(System.currentTimeMillis() / 1000L - this.sRs);
    if (this.sRs == -1L)
      i = 0;
    String str = ah.getContext().getString(2131304489);
    if (i >= 3600);
    for (str = str + String.format(Locale.US, "    %d:%02d:%02d", new Object[] { Integer.valueOf(i / 3600), Integer.valueOf(i % 3600 / 60), Integer.valueOf(i % 60) }); ; str = str + String.format(Locale.US, "    %d:%02d", new Object[] { Integer.valueOf(i / 60), Integer.valueOf(i % 60) }))
    {
      AppMethodBeat.o(5191);
      return str;
    }
  }

  private void cLZ()
  {
    AppMethodBeat.i(5192);
    ab.i("MicroMsg.Voip.VoipSmallWindow", "showCalledVideoInviting");
    if (this.tcu == null);
    for (Object localObject = null; (localObject != null) && ((256 == ((Integer)localObject).intValue()) || (258 == ((Integer)localObject).intValue())); localObject = (Integer)this.tcu.getTag())
    {
      AppMethodBeat.o(5192);
      return;
    }
    localObject = ah.getContext().getString(2131304481);
    if (s.mJ(this.sRl.field_username) != null)
      g((String)localObject, (String)localObject, s.mJ(this.sRl.field_username), true);
    while (true)
    {
      if (this.tct != null)
        this.tct.a(this, 2);
      AppMethodBeat.o(5192);
      break;
      g((String)localObject, (String)localObject, "", true);
    }
  }

  private void cLh()
  {
    AppMethodBeat.i(5184);
    ab.i("MicroMsg.Voip.VoipSmallWindow", "showVideoTalking");
    this.tcy = true;
    if (-1L == this.tcx)
      this.tcx = System.currentTimeMillis();
    if (this.tct != null)
      this.tct.a(this, 2);
    Object localObject;
    if (!com.tencent.mm.compatible.f.b.bF(ah.getContext()))
    {
      ab.e("MicroMsg.Voip.VoipSmallWindow", "showVideoTalking, permission denied");
      localObject = ah.getContext();
      RequestFloatWindowPermissionDialog.a(ah.getContext(), ((Context)localObject).getString(2131304416), new RequestFloatWindowPermissionDialog.a()
      {
        public final void a(RequestFloatWindowPermissionDialog paramAnonymousRequestFloatWindowPermissionDialog)
        {
          AppMethodBeat.i(5172);
          paramAnonymousRequestFloatWindowPermissionDialog.finish();
          paramAnonymousRequestFloatWindowPermissionDialog = ah.getContext().getString(2131304481);
          b.this.g(paramAnonymousRequestFloatWindowPermissionDialog, s.mJ(b.c(b.this).field_username), paramAnonymousRequestFloatWindowPermissionDialog, false);
          if ((com.tencent.mm.plugin.voip.a.b.GP(b.d(b.this))) || (com.tencent.mm.plugin.voip.a.b.GN(b.d(b.this))))
          {
            b.e(b.this);
            AppMethodBeat.o(5172);
          }
          while (true)
          {
            return;
            ((com.tencent.mm.plugin.notification.b.a)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.notification.b.a.class)).getNotification().cancel(40);
            b.b(b.this);
            AppMethodBeat.o(5172);
          }
        }

        public final void b(RequestFloatWindowPermissionDialog paramAnonymousRequestFloatWindowPermissionDialog)
        {
          AppMethodBeat.i(5173);
          paramAnonymousRequestFloatWindowPermissionDialog.finish();
          AppMethodBeat.o(5173);
        }
      });
      if (!com.tencent.mm.plugin.voip.b.cIj().sSZ)
      {
        com.tencent.mm.plugin.voip.b.cIj().sSZ = true;
        long l = com.tencent.mm.kernel.g.RP().Ry().Mm(327950);
        if (System.currentTimeMillis() - l > 86400000L)
          pg("have not permission to showing floating window\n");
      }
    }
    while (true)
    {
      localObject = ah.getContext().getString(2131304481);
      g((String)localObject, s.mJ(this.sRl.field_username), (String)localObject, true);
      AppMethodBeat.o(5184);
      return;
      cLU();
    }
  }

  private void cMa()
  {
    AppMethodBeat.i(5193);
    ab.i("MicroMsg.Voip.VoipSmallWindow", "showVideoInviting");
    if (this.tcu == null);
    for (Object localObject = null; (localObject != null) && ((((Integer)localObject).intValue() == 0) || (2 == ((Integer)localObject).intValue()) || (4 == ((Integer)localObject).intValue())); localObject = (Integer)this.tcu.getTag())
    {
      AppMethodBeat.o(5193);
      return;
    }
    localObject = ah.getContext().getString(2131304481);
    if (s.mJ(this.sRl.field_username) != null)
      g((String)localObject, s.mJ(this.sRl.field_username), (String)localObject, true);
    while (true)
    {
      if (this.tct != null)
        this.tct.a(this, 2);
      AppMethodBeat.o(5193);
      break;
      g((String)localObject, (String)localObject, "", true);
    }
  }

  private void g(Point paramPoint)
  {
    AppMethodBeat.i(5195);
    ab.i("MicroMsg.Voip.VoipSmallWindow", "addViewToWindowManager");
    if ((!com.tencent.mm.plugin.voip.a.b.GP(this.mStatus)) && (!com.tencent.mm.plugin.voip.a.b.GN(this.mStatus)))
    {
      ab.i("MicroMsg.Voip.VoipSmallWindow", "not in voip talking or inviting,now return..");
      AppMethodBeat.o(5195);
    }
    while (true)
    {
      return;
      if (this.tcv != null)
        this.tcv.stopTimer();
      if (this.tcA != null)
        this.tcA.stopTimer();
      if (this.sZa != null)
        this.sZa.stopTimer();
      ((com.tencent.mm.plugin.notification.b.a)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.notification.b.a.class)).getNotification().cancel(40);
      WindowManager localWindowManager = (WindowManager)ah.getContext().getSystemService("window");
      WindowManager.LayoutParams localLayoutParams = new WindowManager.LayoutParams();
      if (com.tencent.mm.compatible.util.d.iW(26))
      {
        localLayoutParams.type = 2038;
        label148: localLayoutParams.format = 1;
        localLayoutParams.flags = 40;
        localLayoutParams.gravity = 51;
        Context localContext = ah.getContext();
        DisplayMetrics localDisplayMetrics = new DisplayMetrics();
        localWindowManager.getDefaultDisplay().getMetrics(localDisplayMetrics);
        localLayoutParams.width = paramPoint.x;
        localLayoutParams.height = paramPoint.y;
        paramPoint = com.tencent.mm.plugin.voip.b.cIj().sSY;
        if (paramPoint != null)
          break label370;
        int i = com.tencent.mm.kernel.g.RP().Ry().getInt(327947, 0);
        int j = BackwardSupportUtil.b.b(localContext, 5.0F);
        localLayoutParams.x = (localDisplayMetrics.widthPixels - localLayoutParams.width - j);
        localLayoutParams.y = (j + i);
        if (this.sRg != null)
        {
          if ((this.sRg.getParent() != null) && ((this.sRg.getParent() instanceof ViewGroup)))
            ((ViewGroup)this.sRg.getParent()).removeView(this.sRg);
          this.tcu.setCaptureView(this.sRg);
        }
        this.tcu.setTag(Integer.valueOf(this.mStatus));
      }
      try
      {
        localWindowManager.addView(this.tcu, localLayoutParams);
        AppMethodBeat.o(5195);
        continue;
        localLayoutParams.type = 2002;
        break label148;
        label370: localLayoutParams.x = paramPoint.x;
        localLayoutParams.y = paramPoint.y;
      }
      catch (Exception paramPoint)
      {
        ab.e("MicroMsg.Voip.VoipSmallWindow", "addViewToWindowManager failed: %s", new Object[] { paramPoint.getMessage() });
        AppMethodBeat.o(5195);
      }
    }
  }

  private void mF(boolean paramBoolean)
  {
    AppMethodBeat.i(5196);
    ab.i("MicroMsg.Voip.VoipSmallWindow", "removeSmallView");
    if (this.tcv != null)
      this.tcv.stopTimer();
    ab.i("MicroMsg.Voip.VoipSmallWindow", "remove small view..cancel notification first..");
    ((com.tencent.mm.plugin.notification.b.a)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.notification.b.a.class)).getNotification().cancel(40);
    Object localObject;
    if (this.tcu != null)
    {
      localObject = (WindowManager.LayoutParams)this.tcu.getLayoutParams();
      com.tencent.mm.plugin.voip.b.cIj().sSY = new Point(((WindowManager.LayoutParams)localObject).x, ((WindowManager.LayoutParams)localObject).y);
      this.tcu.uninit();
      localObject = (WindowManager)ah.getContext().getSystemService("window");
    }
    try
    {
      ((WindowManager)localObject).removeView(this.tcu);
      this.tcu = null;
      if (paramBoolean)
        com.tencent.mm.plugin.voip.b.cIk().abZ(ah.getContext().getString(2131304436));
      if (this.tcA != null)
        this.tcA.stopTimer();
      com.tencent.mm.plugin.voip.b.cIk().dismiss();
      AppMethodBeat.o(5196);
      return;
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      while (true)
        ab.e("MicroMsg.Voip.VoipSmallWindow", "remove failed", new Object[] { localIllegalArgumentException });
    }
  }

  private static void pg(String paramString)
  {
    AppMethodBeat.i(5207);
    com.tencent.mm.kernel.g.RP().Ry().setLong(327950, System.currentTimeMillis());
    ab.d("MicroMsg.Voip.VoipSmallWindow", "reportRawMessage, len: " + paramString.length());
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("\n#client.version=").append(com.tencent.mm.protocal.d.vxo).append("\n");
    localStringBuilder.append("#accinfo.revision=").append(f.REV).append("\n");
    localStringBuilder.append("#accinfo.build=").append(f.TIME).append(":").append(f.HOSTNAME).append(":").append(com.tencent.mm.sdk.platformtools.g.cdf).append("\n");
    Object localObject = new Date();
    SimpleDateFormat localSimpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSSZ", Locale.getDefault());
    localStringBuilder.append("#accinfo.uploadTime=" + localSimpleDateFormat.format((Date)localObject)).append("\n");
    localStringBuilder.append("#accinfo.content:\n");
    localObject = new Intent();
    ((Intent)localObject).setClassName(ah.getPackageName(), "com.tencent.mm.sandbox.monitor.ExceptionMonitorBroadcastReceiver");
    ((Intent)localObject).setAction("uncatch_exception");
    ((Intent)localObject).putExtra("exceptionWriteSdcard", false);
    ((Intent)localObject).putExtra("exceptionPid", Process.myPid());
    ((Intent)localObject).putExtra("userName", Bo());
    ((Intent)localObject).putExtra("tag", "float_window_permission");
    ((Intent)localObject).putExtra("exceptionMsg", Base64.encodeToString((localStringBuilder.toString() + paramString).getBytes(), 2));
    ah.getContext().sendBroadcast((Intent)localObject);
    AppMethodBeat.o(5207);
  }

  public final void GC(int paramInt)
  {
  }

  public final void a(byte[] paramArrayOfByte, long paramLong, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
  {
    AppMethodBeat.i(5202);
    if ((260 != this.mStatus) && (6 != this.mStatus))
      AppMethodBeat.o(5202);
    while (true)
    {
      return;
      if (this.tcu != null)
        this.tcu.a(paramArrayOfByte, paramLong, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
      AppMethodBeat.o(5202);
    }
  }

  public final void abY(String paramString)
  {
  }

  public final void bIK()
  {
  }

  public final void br(int paramInt, String paramString)
  {
    AppMethodBeat.i(5197);
    if (paramInt == 241)
      Toast.makeText(ah.getContext(), paramString, 1).show();
    ab.d("MicroMsg.Voip.VoipSmallWindow", "getHintByErrorCode ".concat(String.valueOf(paramInt)));
    if (paramInt == 235)
    {
      paramInt = 2131304411;
      if (paramInt != 0)
        break label154;
      GT(2131304409);
      AppMethodBeat.o(5197);
    }
    while (true)
    {
      return;
      if (paramInt == 233)
      {
        com.tencent.mm.plugin.voip.b.cIj().cKb();
        paramInt = 2131304410;
        break;
      }
      if (paramInt == 237)
      {
        if ((!com.tencent.mm.au.b.ahP()) || (this.sRn))
        {
          paramInt = 2131304412;
          break;
        }
        paramInt = 2131304414;
        break;
      }
      if (paramInt == 236)
      {
        paramInt = 2131304428;
        break;
      }
      if (paramInt == 211)
      {
        paramInt = 2131304413;
        break;
      }
      paramInt = 0;
      break;
      label154: GT(paramInt);
      AppMethodBeat.o(5197);
    }
  }

  public final void c(int paramInt1, int paramInt2, int[] paramArrayOfInt)
  {
    AppMethodBeat.i(5198);
    if ((260 != this.mStatus) && (6 != this.mStatus))
      AppMethodBeat.o(5198);
    while (true)
    {
      return;
      if (this.tcu != null)
        this.tcu.c(paramInt1, paramInt2, paramArrayOfInt);
      AppMethodBeat.o(5198);
    }
  }

  public final void cJD()
  {
    AppMethodBeat.i(5199);
    if (this.tcu != null)
      this.tcu.cJD();
    AppMethodBeat.o(5199);
  }

  public final Context cKS()
  {
    return null;
  }

  public final void cKT()
  {
  }

  public final byte[] cKU()
  {
    AppMethodBeat.i(5209);
    if ((this.tcu != null) && (this.tcu.getFilterData() != null))
      this.tcu.getFilterData().a(new b.7(this));
    byte[] arrayOfByte = this.buffer;
    AppMethodBeat.o(5209);
    return arrayOfByte;
  }

  public final String cLW()
  {
    AppMethodBeat.i(5189);
    int i = (int)(System.currentTimeMillis() / 1000L - this.sRs);
    if (this.sRs == -1L)
      i = 0;
    if (i >= 3600);
    for (String str1 = String.format(Locale.US, "%d:%02d:%02d", new Object[] { Integer.valueOf(i / 3600), Integer.valueOf(i % 3600 / 60), Integer.valueOf(i % 60) }); ; str1 = String.format(Locale.US, "%d:%02d", new Object[] { Integer.valueOf(i / 60), Integer.valueOf(i % 60) }))
    {
      String str2 = str1;
      if (bo.isNullOrNil(str1))
        str2 = "00:00";
      AppMethodBeat.o(5189);
      return str2;
    }
  }

  public final void fY(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(5181);
    ab.i("MicroMsg.Voip.VoipSmallWindow", "newState: %s ", new Object[] { com.tencent.mm.plugin.voip.a.b.GK(paramInt2) });
    if (paramInt2 == this.mStatus)
    {
      ab.i("MicroMsg.Voip.VoipSmallWindow", "state unchange");
      AppMethodBeat.o(5181);
      return;
    }
    this.mStatus = paramInt2;
    switch (paramInt2)
    {
    default:
    case 0:
    case 2:
    case 4:
    case 6:
    case 260:
    case 256:
    case 258:
    case 8:
    case 262:
    case 1:
    case 3:
    case 5:
    case 257:
    case 259:
    case 7:
    case 261:
    }
    while (true)
    {
      AppMethodBeat.o(5181);
      break;
      cMa();
      AppMethodBeat.o(5181);
      break;
      cLh();
      AppMethodBeat.o(5181);
      break;
      cLZ();
      AppMethodBeat.o(5181);
      break;
      GS(paramInt1);
      AppMethodBeat.o(5181);
      break;
      cLV();
      AppMethodBeat.o(5181);
      break;
      GU(paramInt1);
    }
  }

  public final void g(String paramString1, String paramString2, String paramString3, boolean paramBoolean)
  {
    AppMethodBeat.i(5194);
    ab.i("MicroMsg.Voip.VoipSmallWindow", "showNotification..show notification..tickContent:" + paramString1 + ",title:" + paramString2 + ",content:" + paramString3 + ",breathEffect:" + paramBoolean);
    ab.b("MicroMsg.Voip.VoipSmallWindow", "breathEffect ".concat(String.valueOf(paramBoolean)), new Object[0]);
    if (paramBoolean)
    {
      this.tcv = new com.tencent.mm.sdk.platformtools.ap(new b.6(this, paramString1, paramString2, paramString3), true);
      this.tcv.ae(5000L, 5000L);
    }
    Object localObject = new Intent();
    ((Intent)localObject).setClass(ah.getContext(), VideoActivity.class);
    ((Intent)localObject).putExtra("Voip_User", this.sRl.field_username);
    ((Intent)localObject).putExtra("Voip_Outcall", this.sRm);
    ((Intent)localObject).putExtra("Voip_VideoCall", this.sRn);
    localObject = PendingIntent.getActivity(ah.getContext(), 40, (Intent)localObject, 134217728);
    acc(paramString3);
    paramString1 = com.tencent.mm.bo.a.bt(ah.getContext(), "reminder_channel_id").g(paramString1).j(System.currentTimeMillis()).d(paramString2).e(paramString3);
    paramString1.EI = ((PendingIntent)localObject);
    paramString1 = paramString1.as(bWV());
    paramString1.k(2, true);
    paramString1 = com.tencent.mm.plugin.voip.a.d.c(paramString1);
    ((com.tencent.mm.plugin.notification.b.a)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.notification.b.a.class)).getNotification().a(40, paramString1, false);
    AppMethodBeat.o(5194);
  }

  public final void my(boolean paramBoolean)
  {
    AppMethodBeat.i(5205);
    if (paramBoolean)
    {
      Toast.makeText(ah.getContext(), 2131306060, 1).show();
      AppMethodBeat.o(5205);
    }
    while (true)
    {
      return;
      Toast.makeText(ah.getContext(), 2131306059, 1).show();
      AppMethodBeat.o(5205);
    }
  }

  public final void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
  }

  public final void onServiceDisconnected(ComponentName paramComponentName)
  {
  }

  public final void setCaptureView(CaptureView paramCaptureView)
  {
    AppMethodBeat.i(5206);
    this.sRg = paramCaptureView;
    if ((this.tcu != null) && (this.sRg != null))
    {
      if ((this.sRg.getParent() != null) && ((this.sRg.getParent() instanceof ViewGroup)))
        ((ViewGroup)this.sRg.getParent()).removeView(this.sRg);
      this.tcu.setCaptureView(paramCaptureView);
    }
    AppMethodBeat.o(5206);
  }

  public final void setConnectSec(long paramLong)
  {
    AppMethodBeat.i(5204);
    this.sRs = paramLong;
    if (this.tcu != null)
    {
      this.tcu.setConnectSec(paramLong);
      AppMethodBeat.o(5204);
    }
    while (true)
    {
      return;
      if ((261 == this.mStatus) || (7 == this.mStatus))
      {
        String str = cLY();
        g(str, s.mJ(this.sRl.field_username), str, false);
      }
      AppMethodBeat.o(5204);
    }
  }

  public final void setHWDecMode(int paramInt)
  {
    AppMethodBeat.i(5201);
    if (this.tcu != null)
      this.tcu.setHWDecMode(paramInt);
    this.sXS = paramInt;
    AppMethodBeat.o(5201);
  }

  public final void setMute(boolean paramBoolean)
  {
  }

  public final void setScreenEnable(boolean paramBoolean)
  {
  }

  public final void setVoipBeauty(int paramInt)
  {
    AppMethodBeat.i(5200);
    if (this.tcu != null)
      this.tcu.setVoipBeauty(paramInt);
    this.sRO = paramInt;
    AppMethodBeat.o(5200);
  }

  public final void uninit()
  {
    int i = 3;
    AppMethodBeat.i(5203);
    ab.i("MicroMsg.Voip.VoipSmallWindow", "uninit");
    Object localObject;
    long l;
    int j;
    if (-1L != this.tcx)
    {
      localObject = h.pYm;
      if (this.tcy)
        i = 2;
      l = (System.currentTimeMillis() - this.tcx) / 1000L;
      if (!this.sTb)
        break label253;
      j = 1;
    }
    while (true)
    {
      ((h)localObject).e(11620, new Object[] { Integer.valueOf(i), Long.valueOf(l), Integer.valueOf(j) });
      if ((this.tcw != null) && (this.tcw.isHeld()))
        this.tcw.release();
      mF(false);
      if (this.tcv != null)
        this.tcv.stopTimer();
      if (this.tcA != null)
        this.tcA.stopTimer();
      ab.i("MicroMsg.Voip.VoipSmallWindow", "uninit..cancel notification..");
      ab.b("MicroMsg.Voip.VoipSmallWindow", "unbindSmallServiceIfNeed", new Object[0]);
      try
      {
        if ((com.tencent.mm.compatible.util.d.iW(26)) && (this.oGw))
        {
          localObject = new android/content/Intent;
          ((Intent)localObject).<init>();
          ((Intent)localObject).setClass(ah.getContext(), VoipForegroundService.class);
          ((com.tencent.mm.plugin.notification.b.a)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.notification.b.a.class)).getNotification().cancel(40);
          ah.getContext().stopService((Intent)localObject);
          this.oGw = false;
        }
        this.sRg = null;
        AppMethodBeat.o(5203);
        return;
        label253: j = 2;
      }
      catch (Exception localException)
      {
        while (true)
          ab.printErrStackTrace("MicroMsg.Voip.VoipSmallWindow", localException, "unBind vidoeforeground error: %s", new Object[] { localException.getMessage() });
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip.widget.b
 * JD-Core Version:    0.6.2
 */