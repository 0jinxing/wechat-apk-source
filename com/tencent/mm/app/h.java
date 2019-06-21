package com.tencent.mm.app;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.util.Base64;
import android.util.StringBuilderPrinter;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.loader.j.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ao;
import com.tencent.mm.sdk.platformtools.ao.a;
import com.tencent.mm.sdk.platformtools.ao.d;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public final class h
{
  public static String a(Application paramApplication, final String paramString)
  {
    AppMethodBeat.i(115032);
    if (!"com.tencent.mm:cuploader".equals(paramString))
    {
      ao.a(new ao.d()
      {
        public final void a(ao paramAnonymousao, String paramAnonymousString, Throwable paramAnonymousThrowable)
        {
          AppMethodBeat.i(115031);
          ab.e("MicroMsg.FirstCrashCatcher", "reportException()");
          Application localApplication = this.cep;
          Object localObject1 = paramString;
          ab.e("MicroMsg.FirstCrashCatcher", "reportThrowable:".concat(String.valueOf(paramAnonymousString)));
          try
          {
            localStringBuilder = new java/lang/StringBuilder;
            localStringBuilder.<init>(2560);
            localStringBuilderPrinter = new android/util/StringBuilderPrinter;
            localStringBuilderPrinter.<init>(localStringBuilder);
            paramAnonymousao = new java/lang/StringBuilder;
            paramAnonymousao.<init>("#client.version=");
            localStringBuilderPrinter.println(a.CLIENT_VERSION);
            if (com.tencent.mm.sdk.platformtools.f.DEBUG)
            {
              localStringBuilderPrinter.println("#accinfo.revision=123321123");
              localObject2 = com.tencent.mm.loader.j.c.eSp.T("last_login_uin", "0");
              if (localObject2 != null)
              {
                paramAnonymousao = (ao)localObject2;
                if (!((String)localObject2).equals("0"));
              }
              else
              {
                paramAnonymousao = new java/lang/StringBuilder;
                paramAnonymousao.<init>();
                paramAnonymousao = Integer.toString((Build.DEVICE + Build.FINGERPRINT + Build.MANUFACTURER + Build.MODEL).hashCode());
              }
              localStringBuilderPrinter.println("#accinfo.uin=".concat(String.valueOf(paramAnonymousao)));
              paramAnonymousao = new java/lang/StringBuilder;
              paramAnonymousao.<init>("#accinfo.runtime=");
              localObject2 = paramAnonymousao.append(bo.anU() - b.cdW).append("(");
              paramAnonymousao = (ao)localObject1;
              if (localObject1 == null)
                paramAnonymousao = "";
              localStringBuilderPrinter.println(paramAnonymousao + ") by cup");
              if (!com.tencent.mm.sdk.platformtools.f.DEBUG)
                break label876;
              localStringBuilderPrinter.println("#accinfo.build=99/88/2077 66:55 PM:amm-dev");
            }
          }
          catch (Exception paramAnonymousao)
          {
            try
            {
              while (true)
              {
                StringBuilder localStringBuilder;
                StringBuilderPrinter localStringBuilderPrinter;
                Object localObject2 = Environment.getDataDirectory();
                localObject1 = new android/os/StatFs;
                ((StatFs)localObject1).<init>(((File)localObject2).getPath());
                paramAnonymousao = new android/os/StatFs;
                paramAnonymousao.<init>(com.tencent.mm.loader.j.b.eSl);
                paramAnonymousao = String.format("%dMB %dMB %s:%d:%d:%d %s:%d:%d:%d", new Object[] { Integer.valueOf(((ActivityManager)localApplication.getSystemService("activity")).getMemoryClass()), Integer.valueOf(((ActivityManager)localApplication.getSystemService("activity")).getLargeMemoryClass()), ((File)localObject2).getAbsolutePath(), Integer.valueOf(((StatFs)localObject1).getBlockSize()), Integer.valueOf(((StatFs)localObject1).getBlockCount()), Integer.valueOf(((StatFs)localObject1).getAvailableBlocks()), com.tencent.mm.loader.j.b.eSl, Integer.valueOf(paramAnonymousao.getBlockSize()), Integer.valueOf(paramAnonymousao.getBlockCount()), Integer.valueOf(paramAnonymousao.getAvailableBlocks()) });
                u.f(paramAnonymousThrowable);
                localStringBuilderPrinter.println("#accinfo.data=".concat(String.valueOf(paramAnonymousao)));
                paramAnonymousao = new java/util/Date;
                paramAnonymousao.<init>();
                localObject1 = new java/text/SimpleDateFormat;
                ((SimpleDateFormat)localObject1).<init>("yyyy-MM-dd HH:mm:ss.SSSZ", Locale.getDefault());
                paramAnonymousThrowable = new java/lang/StringBuilder;
                paramAnonymousThrowable.<init>("#accinfo.crashTime=");
                localStringBuilderPrinter.println(((SimpleDateFormat)localObject1).format(paramAnonymousao));
                localStringBuilderPrinter.println("#crashContent=");
                paramAnonymousao = paramAnonymousString;
                if (f.aV(ah.getContext()) == 1)
                  paramAnonymousao = paramAnonymousString.substring(0, f.aW(ah.getContext()));
                f.e(ah.getContext(), ah.getProcessName(), "first");
                localStringBuilderPrinter.println(paramAnonymousao);
                ab.e("MicroMsg.FirstCrashCatcher", "cpu catch crash:".concat(String.valueOf(paramAnonymousao)));
                paramAnonymousao = new android/content/Intent;
                paramAnonymousao.<init>();
                paramAnonymousao.setAction("INTENT_ACTION_UNCATCH");
                paramAnonymousao.putExtra("INTENT_EXTRA_USER_NAME", com.tencent.mm.loader.j.c.eSp.T("login_user_name", "never_login_crash"));
                paramAnonymousao.putExtra("INTENT_EXTRA_EXCEPTION_MSG", Base64.encodeToString(localStringBuilder.toString().getBytes(), 2));
                paramAnonymousString = new java/lang/StringBuilder;
                paramAnonymousString.<init>();
                paramAnonymousao.putExtra("INTENT_EXTRA_DATA_PATH", com.tencent.mm.loader.j.b.eSj + "crash/");
                paramAnonymousao.putExtra("INTENT_EXTRA_SDCARD_PATH", com.tencent.mm.loader.j.b.eSo);
                paramAnonymousao.putExtra("INTENT_EXTRA_UIN", com.tencent.mm.loader.j.c.eSp.T("last_login_uin", "0"));
                paramAnonymousao.putExtra("INTENT_EXTRA_CLIENT_VERSION", a.CLIENT_VERSION);
                paramAnonymousao.putExtra("INTENT_EXTRA_DEVICE_TYPE", a.eSg);
                paramAnonymousao.putExtra("INTENT_EXTRA_TAG", "exception");
                paramAnonymousThrowable = localApplication.getSharedPreferences("system_config_prefs", 0);
                paramAnonymousString = new java/lang/StringBuilder;
                paramAnonymousString.<init>("http://");
                paramAnonymousao.putExtra("INTENT_EXTRA_HOST", paramAnonymousThrowable.getString("support.weixin.qq.com", "support.weixin.qq.com"));
                paramAnonymousString = new java/lang/StringBuilder;
                paramAnonymousString.<init>();
                paramAnonymousao.setClassName(localApplication, localApplication.getPackageName() + ".crash.CrashUploaderService");
                paramAnonymousThrowable = new android/content/Intent;
                paramAnonymousThrowable.<init>();
                paramAnonymousString = new java/lang/StringBuilder;
                paramAnonymousString.<init>();
                com.tencent.mm.service.c.a(paramAnonymousao, "cuploader", true, paramAnonymousThrowable.setClassName(localApplication, localApplication.getPackageName() + ".crash.CuploaderProcessServicer"));
                AppMethodBeat.o(115031);
                while (true)
                {
                  return;
                  paramAnonymousao = new java/lang/StringBuilder;
                  paramAnonymousao.<init>("#accinfo.revision=");
                  localStringBuilderPrinter.println(a.Uk());
                  break;
                  paramAnonymousao = paramAnonymousao;
                  AppMethodBeat.o(115031);
                }
                label876: paramAnonymousao = new java/lang/StringBuilder;
                paramAnonymousao.<init>("#accinfo.build=");
                localStringBuilderPrinter.println(a.TIME + ":" + a.HOSTNAME + ":0");
              }
            }
            catch (Exception paramAnonymousao)
            {
              while (true)
                paramAnonymousao = "";
            }
          }
        }
      });
      ao.a(new ao.a()
      {
        public final void Bl()
        {
          String str = a.eSh;
        }
      });
    }
    AppMethodBeat.o(115032);
    return paramString;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.app.h
 * JD-Core Version:    0.6.2
 */