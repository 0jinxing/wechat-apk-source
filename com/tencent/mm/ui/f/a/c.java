package com.tencent.mm.ui.f.a;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public final class c
{
  protected static String zxA = "https://api.facebook.com/restserver.php";
  protected static String zxy = "https://m.facebook.com/dialog/";
  protected static String zxz = "https://graph.facebook.com/";
  public String gqE;
  private String mAppId;
  private long zxB;
  public long zxC;
  private Activity zxD;
  private String[] zxE;
  private int zxF;
  private c.a zxG;
  private final long zxH;

  public c(String paramString)
  {
    AppMethodBeat.i(80298);
    this.gqE = null;
    this.zxB = 0L;
    this.zxC = 0L;
    this.zxH = 86400000L;
    if (paramString == null)
    {
      paramString = new IllegalArgumentException("You must specify your application ID when instantiating a Facebook object. See README for details.");
      AppMethodBeat.o(80298);
      throw paramString;
    }
    this.mAppId = paramString;
    AppMethodBeat.o(80298);
  }

  private void a(Activity paramActivity, String[] paramArrayOfString)
  {
    AppMethodBeat.i(80301);
    Bundle localBundle = new Bundle();
    if (paramArrayOfString.length > 0)
      localBundle.putString("scope", TextUtils.join(",", paramArrayOfString));
    com.tencent.xweb.c.jx(paramActivity);
    a(paramActivity, "oauth", localBundle, new c.a()
    {
      public final void a(b paramAnonymousb)
      {
        AppMethodBeat.i(80295);
        ab.d("Facebook-authorize", "Login failed: ".concat(String.valueOf(paramAnonymousb)));
        c.a(c.this).a(paramAnonymousb);
        AppMethodBeat.o(80295);
      }

      public final void a(e paramAnonymouse)
      {
        AppMethodBeat.i(80296);
        ab.d("Facebook-authorize", "Login failed: ".concat(String.valueOf(paramAnonymouse)));
        c.a(c.this).a(paramAnonymouse);
        AppMethodBeat.o(80296);
      }

      public final void onCancel()
      {
        AppMethodBeat.i(80297);
        ab.d("Facebook-authorize", "Login canceled");
        c.a(c.this).onCancel();
        AppMethodBeat.o(80297);
      }

      public final void p(Bundle paramAnonymousBundle)
      {
        AppMethodBeat.i(80294);
        com.tencent.xweb.c.dTT();
        com.tencent.xweb.c.sync();
        c.this.arX(paramAnonymousBundle.getString("access_token"));
        c.this.arY(paramAnonymousBundle.getString("expires_in"));
        if (c.this.dJc())
        {
          ab.d("Facebook-authorize", "Login Success! access_token=" + c.this.gqE + " expires=" + c.this.zxC);
          c.a(c.this).p(paramAnonymousBundle);
          AppMethodBeat.o(80294);
        }
        while (true)
        {
          return;
          c.a(c.this).a(new e("Failed to receive access token."));
          AppMethodBeat.o(80294);
        }
      }
    });
    AppMethodBeat.o(80301);
  }

  private void b(Activity paramActivity, String[] paramArrayOfString, c.a parama)
  {
    AppMethodBeat.i(80300);
    this.zxG = parama;
    a(paramActivity, paramArrayOfString);
    AppMethodBeat.o(80300);
  }

  public final String a(String paramString1, Bundle paramBundle, String paramString2)
  {
    AppMethodBeat.i(80305);
    paramBundle.putString("format", "json");
    if (dJc())
      paramBundle.putString("access_token", this.gqE);
    if (paramString1 != null);
    for (paramString1 = zxz + paramString1; ; paramString1 = zxA)
    {
      paramString1 = f.e(paramString1, paramString2, paramBundle);
      AppMethodBeat.o(80305);
      return paramString1;
    }
  }

  public final void a(Activity paramActivity, String[] paramArrayOfString, c.a parama)
  {
    AppMethodBeat.i(80299);
    b(paramActivity, paramArrayOfString, parama);
    h.pYm.a(582L, 0L, 1L, false);
    AppMethodBeat.o(80299);
  }

  public final void a(Context paramContext, String paramString, Bundle paramBundle, c.a parama)
  {
    AppMethodBeat.i(80306);
    String str = zxy + paramString;
    paramBundle.putString("display", "touch");
    paramBundle.putString("redirect_uri", "fbconnect://success");
    if (paramString.equals("oauth"))
    {
      paramBundle.putString("type", "user_agent");
      paramBundle.putString("client_id", this.mAppId);
      if (dJc())
        paramBundle.putString("access_token", this.gqE);
      paramString = str + "?" + f.aA(paramBundle);
      if (paramContext.checkCallingOrSelfPermission("android.permission.INTERNET") == 0)
        break label151;
      f.L(paramContext, "Error", "Application requires permission to access the Internet");
      AppMethodBeat.o(80306);
    }
    while (true)
    {
      return;
      paramBundle.putString("app_id", this.mAppId);
      break;
      label151: new g(paramContext, paramString, parama).show();
      AppMethodBeat.o(80306);
    }
  }

  public final void arX(String paramString)
  {
    AppMethodBeat.i(80308);
    this.gqE = paramString;
    this.zxB = System.currentTimeMillis();
    AppMethodBeat.o(80308);
  }

  public final void arY(String paramString)
  {
    AppMethodBeat.i(80309);
    if (paramString != null)
      if (!paramString.equals("0"))
        break label31;
    label31: for (long l = 0L; ; l = System.currentTimeMillis() + bo.anl(paramString) * 1000L)
    {
      this.zxC = l;
      AppMethodBeat.o(80309);
      return;
    }
  }

  public final boolean dJc()
  {
    AppMethodBeat.i(80307);
    boolean bool;
    if ((this.gqE != null) && ((this.zxC == 0L) || (System.currentTimeMillis() < this.zxC)))
    {
      bool = true;
      AppMethodBeat.o(80307);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(80307);
    }
  }

  public final void h(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(80302);
    String str1;
    String str2;
    if (paramInt1 == this.zxF)
      if (paramInt2 == -1)
      {
        str1 = paramIntent.getStringExtra("error");
        str2 = str1;
        if (str1 == null)
          str2 = paramIntent.getStringExtra("error_type");
        if (str2 != null)
          if ((str2.equals("service_disabled")) || (str2.equals("AndroidAuthKillSwitchException")))
          {
            ab.d("Facebook-authorize", "Hosted auth currently disabled. Retrying dialog auth...");
            a(this.zxD, this.zxE);
            AppMethodBeat.o(80302);
          }
      }
    while (true)
    {
      return;
      if ((str2.equals("access_denied")) || (str2.equals("OAuthAccessDeniedException")))
      {
        ab.d("Facebook-authorize", "Login canceled by user.");
        this.zxG.onCancel();
        AppMethodBeat.o(80302);
      }
      else
      {
        str1 = paramIntent.getStringExtra("error_description");
        paramIntent = str2;
        if (str1 != null)
          paramIntent = str2 + ":" + str1;
        ab.d("Facebook-authorize", "Login failed: ".concat(String.valueOf(paramIntent)));
        this.zxG.a(new e(paramIntent));
        AppMethodBeat.o(80302);
        continue;
        arX(paramIntent.getStringExtra("access_token"));
        arY(paramIntent.getStringExtra("expires_in"));
        if (dJc())
        {
          ab.d("Facebook-authorize", "Login Success! access_token=" + this.gqE + " expires=" + this.zxC);
          this.zxG.p(paramIntent.getExtras());
          AppMethodBeat.o(80302);
        }
        else
        {
          this.zxG.a(new e("Failed to receive access token."));
          AppMethodBeat.o(80302);
          continue;
          if (paramInt2 == 0)
          {
            if (paramIntent != null)
            {
              ab.d("Facebook-authorize", "Login failed: " + paramIntent.getStringExtra("error"));
              this.zxG.a(new b(paramIntent.getStringExtra("error"), paramIntent.getIntExtra("error_code", -1), paramIntent.getStringExtra("failing_url")));
              AppMethodBeat.o(80302);
            }
            else
            {
              ab.d("Facebook-authorize", "Login canceled by user.");
              this.zxG.onCancel();
            }
          }
          else
            AppMethodBeat.o(80302);
        }
      }
    }
  }

  public final String ie(Context paramContext)
  {
    AppMethodBeat.i(80303);
    f.jdMethod_if(paramContext);
    arX(null);
    this.zxC = 0L;
    AppMethodBeat.o(80303);
    return null;
  }

  public final String q(String paramString, Bundle paramBundle)
  {
    AppMethodBeat.i(80304);
    paramString = a(paramString, paramBundle, "GET");
    AppMethodBeat.o(80304);
    return paramString;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.f.a.c
 * JD-Core Version:    0.6.2
 */