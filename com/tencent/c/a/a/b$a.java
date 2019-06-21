package com.tencent.c.a.a;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build;
import android.os.Build.VERSION;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Locale;
import java.util.TimeZone;

final class b$a
{
  String aOt;
  String appVersion;
  String cbg;
  DisplayMetrics cbh;
  int cbi;
  String cbj;
  String cbk;
  String cbl;
  int cbm;
  String cbn;
  String cbo;
  String channel;
  Context ctx;
  String imsi;
  String model;
  String packageName;
  String timezone;

  private b$a(Context paramContext)
  {
    AppMethodBeat.i(125744);
    this.cbg = "2.21";
    this.cbi = Build.VERSION.SDK_INT;
    this.model = Build.MODEL;
    this.cbj = Build.MANUFACTURER;
    this.aOt = Locale.getDefault().getLanguage();
    this.channel = "WX";
    this.cbm = 0;
    this.packageName = null;
    this.ctx = null;
    this.cbn = null;
    this.cbo = null;
    this.ctx = paramContext.getApplicationContext();
    try
    {
      this.appVersion = this.ctx.getPackageManager().getPackageInfo(this.ctx.getPackageName(), 0).versionName;
      this.cbh = new DisplayMetrics();
      ((WindowManager)this.ctx.getApplicationContext().getSystemService("window")).getDefaultDisplay().getMetrics(this.cbh);
      if (s.q(paramContext, "android.permission.READ_PHONE_STATE"))
      {
        paramContext = (TelephonyManager)paramContext.getSystemService("phone");
        if (paramContext != null)
        {
          this.cbk = paramContext.getSimOperator();
          this.imsi = paramContext.getSubscriberId();
        }
      }
      this.timezone = TimeZone.getDefault().getID();
      this.cbl = s.aO(this.ctx);
      this.packageName = this.ctx.getPackageName();
      this.cbo = s.Aa();
      AppMethodBeat.o(125744);
      return;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      while (true)
        s.zY();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.c.a.a.b.a
 * JD-Core Version:    0.6.2
 */