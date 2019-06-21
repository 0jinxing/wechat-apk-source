package com.tencent.mm.plugin.appbrand.ipc;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ResultReceiver;
import android.view.Window;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.ui.n;
import com.tencent.mm.plugin.appbrand.ui.r;
import com.tencent.mm.plugin.appbrand.ui.s;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.a;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.widget.a.c;

@a(7)
public class AppBrandProcessProxyUI extends MMActivity
  implements b
{
  public static String huY = "appbrand_report_key_target_url";
  public static String huZ = "appbrand_report_key_target_activity";
  private int huR = 0;
  private AppBrandProxyUIProcessTask huS;
  private AppBrandProxyUIProcessTask.ProcessRequest huT;
  private boolean huU = false;
  private volatile boolean huV = false;
  private c huW;
  private AppBrandProcessProxyUI.a huX;

  public static boolean B(Intent paramIntent)
  {
    AppMethodBeat.i(73132);
    if (paramIntent != null);
    try
    {
      if ((paramIntent.getComponent() != null) && (paramIntent.getComponent().getShortClassName().equals(".plugin.appbrand.ipc.AppBrandProcessProxyUI")) && (paramIntent.getIntExtra("key_running_mode", -1) == 10000))
      {
        bool = true;
        AppMethodBeat.o(73132);
      }
      while (true)
      {
        return bool;
        AppMethodBeat.o(73132);
        bool = false;
      }
    }
    catch (Exception paramIntent)
    {
      while (true)
      {
        AppMethodBeat.o(73132);
        boolean bool = false;
      }
    }
  }

  static <_Req extends AppBrandProxyUIProcessTask.ProcessRequest, _Result extends AppBrandProxyUIProcessTask.ProcessResult> void a(Context paramContext, Class<? extends AppBrandProcessProxyUI> paramClass, _Req param_Req, AppBrandProxyUIProcessTask.b<_Result> paramb, Intent paramIntent)
  {
    AppMethodBeat.i(73134);
    if (paramContext == null)
      paramContext = ah.getContext();
    while (true)
    {
      String str = param_Req.aCa().getName();
      Object localObject;
      if (paramClass == null)
      {
        localObject = AppBrandProcessProxyUI.class;
        localObject = new Intent(paramContext, (Class)localObject).putExtra("key_model_class_name", str);
        if (paramb != null)
          break label142;
        paramb = null;
        label55: paramb = ((Intent)localObject).putExtra("key_result_receiver", paramb).putExtra(huZ, param_Req.aBZ()).putExtra("key_running_mode", 1);
        paramb.putExtra("key_request_parcel", param_Req);
        if ((paramContext instanceof Activity))
          break label160;
        paramb.addFlags(268435456);
      }
      while (true)
      {
        if (paramIntent != null)
          paramb.addFlags(paramIntent.getFlags());
        al.d(new AppBrandProcessProxyUI.2(paramClass, paramContext, paramb));
        AppMethodBeat.o(73134);
        return;
        localObject = paramClass;
        break;
        label142: paramb = new AppBrandProcessProxyUI.1(ak.fetchFreeHandler(Looper.getMainLooper()), paramb);
        break label55;
        label160: paramb.putExtra("key_need_light_status", n.b(((Activity)paramContext).getWindow()));
      }
    }
  }

  static void a(Context paramContext, Class<? extends AppBrandProcessProxyUI> paramClass, String paramString1, String paramString2, String paramString3, String paramString4, final DialogInterface.OnClickListener paramOnClickListener1, final DialogInterface.OnClickListener paramOnClickListener2, final DialogInterface.OnClickListener paramOnClickListener3)
  {
    AppMethodBeat.i(73135);
    Context localContext = paramContext;
    if (paramContext == null)
      localContext = ah.getContext();
    paramContext = new Intent(localContext, paramClass).putExtra("key_running_mode", 2).putExtra("key_result_receiver", new ResultReceiver(ak.fetchFreeHandler(Looper.getMainLooper()))
    {
      protected final void onReceiveResult(int paramAnonymousInt, Bundle paramAnonymousBundle)
      {
        AppMethodBeat.i(73126);
        if ((-1 == paramAnonymousInt) && (paramOnClickListener1 != null))
          paramOnClickListener1.onClick(null, paramAnonymousInt);
        if ((-2 == paramAnonymousInt) && (paramOnClickListener2 != null))
          paramOnClickListener2.onClick(null, paramAnonymousInt);
        if ((-3 == paramAnonymousInt) && (paramOnClickListener3 != null))
          paramOnClickListener3.onClick(null, paramAnonymousInt);
        AppMethodBeat.o(73126);
      }
    }).putExtra("key_alert_message", paramString1).putExtra("key_alert_title", paramString2).putExtra("key_alert_confirm", paramString3).putExtra("key_alert_deny", paramString4);
    if (!(localContext instanceof Activity))
      paramContext.addFlags(268435456);
    localContext.startActivity(paramContext);
    AppMethodBeat.o(73135);
  }

  private static String bZ(String paramString1, String paramString2)
  {
    AppMethodBeat.i(73138);
    if (bo.isNullOrNil(paramString1))
      AppMethodBeat.o(73138);
    while (true)
    {
      return paramString2;
      AppMethodBeat.o(73138);
      paramString2 = paramString1;
    }
  }

  public static void n(Context paramContext, Intent paramIntent)
  {
    AppMethodBeat.i(73133);
    if ((!(paramContext instanceof s)) || ((paramContext instanceof r)))
    {
      paramContext.startActivity(paramIntent);
      AppMethodBeat.o(73133);
    }
    while (true)
    {
      return;
      paramContext.startActivity(new Intent(paramContext, AppBrandProcessProxyUI.class).putExtra("key_running_mode", 10000).putExtra("key_proxy_launch_target_intent", paramIntent).putExtra("key_proxy_launch_appbrand_ui_class", paramContext.getClass()).addFlags(268435456));
      AppMethodBeat.o(73133);
    }
  }

  public final void a(AppBrandProxyUIProcessTask.ProcessResult paramProcessResult)
  {
    AppMethodBeat.i(73143);
    this.huV = true;
    runOnUiThread(new AppBrandProcessProxyUI.5(this, paramProcessResult));
    AppMethodBeat.o(73143);
  }

  public final MMActivity aBQ()
  {
    return this;
  }

  public final boolean aBR()
  {
    AppMethodBeat.i(73144);
    boolean bool;
    if ((this.uiu) || (isFinishing()) || (this.huV))
    {
      bool = true;
      AppMethodBeat.o(73144);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(73144);
    }
  }

  public final void b(AppBrandProxyUIProcessTask.ProcessResult paramProcessResult)
  {
    AppMethodBeat.i(73145);
    ResultReceiver localResultReceiver = (ResultReceiver)getIntent().getParcelableExtra("key_result_receiver");
    if ((localResultReceiver != null) && (paramProcessResult != null))
    {
      Bundle localBundle = new Bundle(2);
      localBundle.putParcelable("key_result_parcel", paramProcessResult);
      localResultReceiver.send(0, localBundle);
    }
    AppMethodBeat.o(73145);
  }

  public void finish()
  {
    AppMethodBeat.i(73142);
    super.finish();
    overridePendingTransition(0, 0);
    if (this.huS != null)
      this.huS.aBX();
    AppMethodBeat.o(73142);
  }

  public final int getLayoutId()
  {
    return -1;
  }

  public void initActivityCloseAnimation()
  {
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(73141);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    ab.d("MicroMsg.AppBrandProcessProxyUI", "onActivityResult, requestCode = %d, resultCode = %d, request = %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), this.huT.getClass().getName() });
    this.huU = false;
    AppMethodBeat.o(73141);
  }

  public void onCreate(Bundle paramBundle)
  {
    int i = 0;
    AppMethodBeat.i(73137);
    super.onCreate(paramBundle);
    overridePendingTransition(0, 0);
    n.a(getWindow());
    n.a(getWindow(), getIntent().getBooleanExtra("key_need_light_status", false));
    getWindow().setBackgroundDrawable(new ColorDrawable(0));
    if (getIntent() == null)
    {
      finish();
      AppMethodBeat.o(73137);
    }
    while (true)
    {
      return;
      switch (getIntent().getIntExtra("key_running_mode", 0))
      {
      default:
        finish();
        AppMethodBeat.o(73137);
        break;
      case 1:
        getIntent().setExtrasClassLoader(AppBrandProcessProxyUI.class.getClassLoader());
        paramBundle = getIntent().getStringExtra("key_model_class_name");
        ab.i("MicroMsg.AppBrandProcessProxyUI", "onCreate, modelClass = %s", new Object[] { paramBundle });
        if (bo.isNullOrNil(paramBundle));
        while (true)
        {
          if (i != 0)
            break label124;
          finish();
          AppMethodBeat.o(73137);
          break;
          this.huS = AppBrandProxyUIProcessTask.a.AG(paramBundle);
          if (this.huS == null)
          {
            ab.e("MicroMsg.AppBrandProcessProxyUI", "onCreate unknown model class = %s", new Object[] { paramBundle });
          }
          else if (getIntent().getBooleanExtra("key_request_need_params", true))
          {
            this.huT = ((AppBrandProxyUIProcessTask.ProcessRequest)getIntent().getParcelableExtra("key_request_parcel"));
            if (this.huT == null)
              ab.e("MicroMsg.AppBrandProcessProxyUI", "onCreate unknown request class = %s", new Object[] { paramBundle });
          }
          else
          {
            this.huT = null;
            continue;
            this.huS.hvt = this;
            this.huS.a(this.huT);
            i = 1;
          }
        }
      case 2:
        String str1 = bZ(getIntent().getStringExtra("key_alert_title"), "");
        String str2 = bZ(getIntent().getStringExtra("key_alert_message"), getString(2131297061));
        paramBundle = bZ(getIntent().getStringExtra("key_alert_confirm"), "");
        String str3 = bZ(getIntent().getStringExtra("key_alert_deny"), "");
        this.huX = new AppBrandProcessProxyUI.a(this, (byte)0);
        this.huW = h.a(this, str2, str1, paramBundle, str3, false, this.huX, this.huX);
        this.huW.setOnDismissListener(this.huX);
        this.huW.setOnKeyListener(new AppBrandProcessProxyUI.4(this, str3));
        AppMethodBeat.o(73137);
        break;
      case 10000:
        label124: paramBundle = (Intent)getIntent().getParcelableExtra("key_proxy_launch_target_intent");
        if (paramBundle != null)
        {
          if (paramBundle.getComponent() != null);
          try
          {
            Class.forName(paramBundle.getComponent().getClassName());
          }
          catch (Exception localException1)
          {
            try
            {
              while (true)
              {
                startActivity(paramBundle);
                AppMethodBeat.o(73137);
                break;
                localException1 = localException1;
                ab.e("MicroMsg.AppBrandProcessProxyUI", "proxyLaunch, Class.forName %s, e = %s", new Object[] { paramBundle.getComponent().getClassName(), localException1 });
              }
            }
            catch (Exception localException2)
            {
              try
              {
                ab.e("MicroMsg.AppBrandProcessProxyUI", "start targetActivity, %s, e = %s", new Object[] { paramBundle, localException2 });
                AppMethodBeat.o(73137);
              }
              catch (Exception paramBundle)
              {
                AppMethodBeat.o(73137);
              }
            }
          }
        }
        else
        {
          finish();
          AppMethodBeat.o(73137);
        }
        break;
      }
    }
  }

  public final void onCreateBeforeSetContentView()
  {
    AppMethodBeat.i(73136);
    super.onCreateBeforeSetContentView();
    supportRequestWindowFeature(1);
    AppMethodBeat.o(73136);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(73140);
    super.onDestroy();
    if ((this.huW != null) && (this.huW.isShowing()))
    {
      this.huW.dismiss();
      this.huW = null;
      this.huX = null;
    }
    AppMethodBeat.o(73140);
  }

  public void onResume()
  {
    AppMethodBeat.i(73139);
    super.onResume();
    int i = getIntent().getIntExtra("key_running_mode", 0);
    if (i == 10000)
    {
      i = this.huR + 1;
      this.huR = i;
      if (i <= 1);
    }
    while (true)
    {
      try
      {
        Class localClass = (Class)getIntent().getSerializableExtra("key_proxy_launch_appbrand_ui_class");
        if (localClass == null)
        {
          finish();
          AppMethodBeat.o(73139);
          return;
        }
        Intent localIntent = new android/content/Intent;
        localIntent.<init>(this, localClass);
        startActivity(localIntent.putExtra("key_appbrand_bring_ui_to_front", true).addFlags(268435456));
        finish();
        AppMethodBeat.o(73139);
        continue;
      }
      catch (Exception localException)
      {
        finish();
      }
      AppMethodBeat.o(73139);
      continue;
      if (i == 2)
      {
        ab.d("MicroMsg.AppBrandProcessProxyUI", "onResume, RUNNING_MODE_SHOW_ALERT");
        AppMethodBeat.o(73139);
      }
      else
      {
        boolean bool = aBR();
        ab.d("MicroMsg.AppBrandProcessProxyUI", "onResume, mFinishOnNextResume = %b, finishing = %b, request = %s", new Object[] { Boolean.valueOf(this.huU), Boolean.valueOf(bool), this.huT.getClass().getName() });
        if ((this.huU) && (this.huT.aBY()) && (!bool))
          a(null);
        this.huU = true;
        AppMethodBeat.o(73139);
      }
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ipc.AppBrandProcessProxyUI
 * JD-Core Version:    0.6.2
 */