package com.tencent.mm.plugin.webview.stub;

import android.app.Activity;
import android.app.Dialog;
import android.app.Service;
import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.support.v4.app.a.a;
import android.support.v4.content.b;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMActivity.a;
import java.util.ArrayList;

@com.tencent.mm.ui.base.a(7)
public class WebViewStubTempUI extends MMActivity
  implements a.a, MMActivity.a
{
  private int uqI = 0;
  private boolean uqJ = false;
  private Dialog uqK = null;

  public static void a(Context paramContext, e parame, String paramString1, String paramString2, String paramString3, String paramString4, DialogInterface.OnClickListener paramOnClickListener1, DialogInterface.OnClickListener paramOnClickListener2)
  {
    AppMethodBeat.i(7229);
    com.tencent.mm.plugin.webview.ui.tools.g.a(b(paramContext, paramString1, paramString2, paramString3, paramString4, paramOnClickListener1, paramOnClickListener2).getExtras(), "webview", ".stub.WebViewStubTempUI", parame, null);
    AppMethodBeat.o(7229);
  }

  public static void a(Context paramContext, String paramString1, String paramString2, Intent paramIntent, int paramInt)
  {
    AppMethodBeat.i(7226);
    Intent localIntent = new Intent(paramContext, WebViewStubTempUI.class);
    if ((paramContext instanceof Service))
      localIntent.addFlags(268435456);
    localIntent.putExtra("key_action_code", 2);
    WebViewStubTempUI.StartActivityForResultTask localStartActivityForResultTask = new WebViewStubTempUI.StartActivityForResultTask();
    localStartActivityForResultTask.qiZ = paramString1;
    localStartActivityForResultTask.uqP = paramString2;
    localStartActivityForResultTask.uqQ = paramIntent;
    localStartActivityForResultTask.requestCode = 15;
    localStartActivityForResultTask.uqR = false;
    localStartActivityForResultTask.unN = paramInt;
    localIntent.putExtra("key_activity_result_task", localStartActivityForResultTask);
    paramContext.startActivity(localIntent);
    AppMethodBeat.o(7226);
  }

  public static boolean a(Context paramContext, e parame, String[] paramArrayOfString, int paramInt1, int paramInt2)
  {
    boolean bool = true;
    AppMethodBeat.i(7230);
    if (paramContext == null)
      AppMethodBeat.o(7230);
    while (true)
    {
      return bool;
      ArrayList localArrayList = new ArrayList();
      for (int i = 0; i <= 0; i++)
      {
        String str = paramArrayOfString[0];
        if (b.checkSelfPermission(paramContext, str) != 0)
          localArrayList.add(str);
      }
      if (localArrayList.size() == 0)
      {
        AppMethodBeat.o(7230);
      }
      else
      {
        paramContext = new Bundle();
        paramContext.putInt("key_action_code", 1);
        paramContext.putStringArray("key_permission_types", (String[])localArrayList.toArray(new String[localArrayList.size()]));
        paramContext.putInt("key_permission_request_code", paramInt1);
        paramContext.putInt("key_binder_id", paramInt2);
        com.tencent.mm.plugin.webview.ui.tools.g.a(paramContext, "webview", ".stub.WebViewStubTempUI", parame, null);
        AppMethodBeat.o(7230);
        bool = false;
      }
    }
  }

  private static Intent b(Context paramContext, String paramString1, String paramString2, String paramString3, String paramString4, DialogInterface.OnClickListener paramOnClickListener1, DialogInterface.OnClickListener paramOnClickListener2)
  {
    AppMethodBeat.i(7227);
    Intent localIntent = new Intent(paramContext, WebViewStubTempUI.class);
    if ((paramContext instanceof Service))
      localIntent.addFlags(268435456);
    localIntent.putExtra("key_action_code", 0);
    localIntent.putExtra("key_alert_cancelable", false);
    localIntent.putExtra("key_alert_message", paramString1);
    localIntent.putExtra("key_alert_title", paramString2);
    localIntent.putExtra("key_alert_yes", paramString3);
    localIntent.putExtra("key_alert_no", paramString4);
    localIntent.putExtra("key_alert_result_receiver", new WebViewStubTempUI.1(ak.fetchFreeHandler(), paramOnClickListener1, paramOnClickListener2));
    AppMethodBeat.o(7227);
    return localIntent;
  }

  public static void c(Context paramContext, String paramString1, String paramString2, String paramString3, String paramString4, DialogInterface.OnClickListener paramOnClickListener1, DialogInterface.OnClickListener paramOnClickListener2)
  {
    AppMethodBeat.i(7228);
    paramContext.startActivity(b(paramContext, paramString1, paramString2, paramString3, paramString4, paramOnClickListener1, paramOnClickListener2));
    AppMethodBeat.o(7228);
  }

  public final void c(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(7234);
    if (this.uqJ)
    {
      com.tencent.mm.plugin.webview.ui.tools.jsapi.g localg = com.tencent.mm.plugin.webview.ui.tools.jsapi.h.JR(this.uqI);
      if (localg != null)
        localg.c(paramInt1, paramInt2, paramIntent);
    }
    finish();
    AppMethodBeat.o(7234);
  }

  public final int getLayoutId()
  {
    return -1;
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(7231);
    super.onCreate(paramBundle);
    switch (getIntent().getIntExtra("key_action_code", -1))
    {
    default:
      finish();
      AppMethodBeat.o(7231);
    case 0:
    case 1:
    case 2:
    }
    while (true)
    {
      return;
      paramBundle = (ResultReceiver)getIntent().getParcelableExtra("key_alert_result_receiver");
      if (paramBundle == null)
      {
        finish();
        AppMethodBeat.o(7231);
      }
      else
      {
        this.uqK = com.tencent.mm.ui.base.h.a(this, getIntent().getBooleanExtra("key_alert_cancelable", false), getIntent().getStringExtra("key_alert_message"), getIntent().getStringExtra("key_alert_title"), getIntent().getStringExtra("key_alert_yes"), getIntent().getStringExtra("key_alert_no"), new WebViewStubTempUI.2(this, paramBundle), new WebViewStubTempUI.3(this, paramBundle));
        this.uqK.setOnCancelListener(new WebViewStubTempUI.4(this));
        AppMethodBeat.o(7231);
        continue;
        android.support.v4.app.a.a(this, getIntent().getStringArrayExtra("key_permission_types"), getIntent().getIntExtra("key_permission_request_code", 0));
        AppMethodBeat.o(7231);
        continue;
        paramBundle = (WebViewStubTempUI.StartActivityForResultTask)getIntent().getParcelableExtra("key_activity_result_task");
        this.uqI = paramBundle.unN;
        this.uqJ = true;
        this.ifE = this;
        d.a(this, paramBundle.qiZ, paramBundle.uqP, paramBundle.uqQ, paramBundle.requestCode, paramBundle.uqR);
        AppMethodBeat.o(7231);
      }
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(7232);
    super.onDestroy();
    if (this.uqK != null)
      this.uqK.dismiss();
    AppMethodBeat.o(7232);
  }

  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    AppMethodBeat.i(7233);
    int i = getIntent().getIntExtra("key_binder_id", 0);
    switch (paramInt)
    {
    default:
    case 72:
    case 113:
    case 115:
    case 116:
    case 117:
    case 118:
    }
    while (true)
    {
      finish();
      AppMethodBeat.o(7233);
      return;
      if (paramArrayOfInt[0] == 0)
        com.tencent.mm.plugin.webview.ui.tools.jsapi.h.JR(i).c(paramInt, -1, null);
      else
        com.tencent.mm.plugin.webview.ui.tools.jsapi.h.JR(i).c(paramInt, 0, null);
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.stub.WebViewStubTempUI
 * JD-Core Version:    0.6.2
 */