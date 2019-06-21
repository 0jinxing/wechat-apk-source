package com.tencent.xweb.xwalk;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.net.Uri;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Environment;
import android.os.Process;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.xweb.WebView.d;
import com.tencent.xweb.c.k;
import com.tencent.xweb.c.k.a;
import com.tencent.xweb.d.a;
import com.tencent.xweb.i;
import com.tencent.xweb.i.a;
import com.tencent.xweb.m;
import com.tencent.xweb.util.b;
import com.tencent.xweb.w;
import com.tencent.xweb.xwalk.a.e;
import com.tencent.xweb.xwalk.a.f;
import com.tencent.xweb.xwalk.a.f.a;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.xwalk.core.Log;
import org.xwalk.core.XWalkEnvironment;
import org.xwalk.core.XWalkInitializer;
import org.xwalk.core.XWalkPreferences;
import org.xwalk.core.XWalkUpdater;
import org.xwalk.core.XWalkUpdater.UpdateConfig;

public final class c
  implements com.tencent.xweb.c.d
{
  Context AMr;
  com.tencent.xweb.WebView ARb;
  ScrollView ARc;
  TextView ARd;
  TextView ARe;
  TextView ARf;
  Button ARg;
  View ARh;
  boolean ARi;
  String ARj;

  public c(com.tencent.xweb.WebView paramWebView)
  {
    AppMethodBeat.i(85182);
    this.ARc = null;
    this.ARd = null;
    this.ARe = null;
    this.ARf = null;
    this.ARg = null;
    this.ARi = false;
    this.ARj = "tools";
    this.AMr = paramWebView.getContext();
    this.ARb = paramWebView;
    dVD();
    dVB();
    AppMethodBeat.o(85182);
  }

  private static String aaV(String paramString)
  {
    int i = 0;
    AppMethodBeat.i(85185);
    try
    {
      byte[] arrayOfByte = MessageDigest.getInstance("MD5").digest(paramString.getBytes());
      if ((arrayOfByte == null) || (arrayOfByte.length == 0))
      {
        paramString = "";
        AppMethodBeat.o(85185);
      }
      while (true)
      {
        return paramString;
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>(arrayOfByte.length);
        int j = arrayOfByte.length;
        while (i < j)
        {
          paramString = Integer.toHexString(arrayOfByte[i] & 0xFF);
          if (paramString.length() == 1)
            localStringBuilder.append(0);
          localStringBuilder.append(paramString);
          i++;
        }
        paramString = localStringBuilder.toString().toUpperCase();
        AppMethodBeat.o(85185);
      }
    }
    catch (Exception paramString)
    {
      while (true)
      {
        paramString = "";
        AppMethodBeat.o(85185);
      }
    }
  }

  private void avr(String paramString)
  {
    AppMethodBeat.i(85195);
    File localFile = new File(paramString);
    if (localFile.isDirectory())
    {
      String[] arrayOfString = localFile.list();
      if (arrayOfString != null)
        for (int i = 0; i < arrayOfString.length; i++)
          avr(paramString + "//" + arrayOfString[i]);
    }
    localFile.delete();
    AppMethodBeat.o(85195);
  }

  public static boolean avs(String paramString)
  {
    int i = 99999;
    boolean bool = false;
    AppMethodBeat.i(85200);
    com.tencent.xweb.xwalk.a.c localc = e.avu("FileReader");
    if (localc == null)
      AppMethodBeat.o(85200);
    while (true)
    {
      return bool;
      try
      {
        if (localc.ASG >= 99999)
          i = localc.ASG + 1;
        com.tencent.xweb.xwalk.a.d locald = new com/tencent/xweb/xwalk/a/d;
        locald.<init>();
        locald.version = i;
        locald.isPatch = false;
        locald.cvZ = com.tencent.xweb.util.d.cz(paramString);
        locald.path = localc.aM(i, false);
        b.copyFile(paramString, locald.path);
        if (localc.a(locald) == 0)
        {
          AppMethodBeat.o(85200);
          bool = true;
        }
        else
        {
          AppMethodBeat.o(85200);
        }
      }
      catch (Exception paramString)
      {
        Log.e("WebDebugPage", "loadFileReaderFromLocalInternal error: " + paramString.getMessage());
        AppMethodBeat.o(85200);
      }
    }
  }

  private boolean cr(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(85186);
    Object localObject1;
    if ((paramString.contains("debugxweb.qq.com")) || (paramBoolean))
    {
      paramString = Uri.parse(paramString);
      localObject1 = paramString.getQueryParameterNames();
      if ((localObject1 == null) || (((Set)localObject1).size() == 0))
      {
        dVF();
        AppMethodBeat.o(85186);
        paramBoolean = true;
      }
    }
    while (true)
    {
      return paramBoolean;
      localObject1 = ((Set)localObject1).iterator();
      while (((Iterator)localObject1).hasNext())
      {
        Object localObject2 = (String)((Iterator)localObject1).next();
        if (localObject2 != null)
        {
          label224: int i;
          switch (((String)localObject2).hashCode())
          {
          default:
            i = -1;
          case 603805332:
          case 1874228874:
          case -748036674:
          case -974615216:
          case 368659514:
          case 2135256815:
          case 989541982:
          case -1302829141:
          case -83404669:
          case -1688684924:
          case 1098980480:
          case 684429537:
          case -939528941:
          case -1479708147:
          case 208243139:
          }
          while (true)
            switch (i)
            {
            default:
              break;
            case 0:
              rD(false);
              break;
              if (!((String)localObject2).equals("load_local_xwalk"))
                break label224;
              i = 0;
              continue;
              if (!((String)localObject2).equals("set_web_config"))
                break label224;
              i = 1;
              continue;
              if (!((String)localObject2).equals("set_appbrand_config"))
                break label224;
              i = 2;
              continue;
              if (!((String)localObject2).equals("show_webview_version"))
                break label224;
              i = 3;
              continue;
              if (!((String)localObject2).equals("clear_commands"))
                break label224;
              i = 4;
              continue;
              if (!((String)localObject2).equals("set_config_url"))
                break label224;
              i = 5;
              continue;
              if (!((String)localObject2).equals("check_xwalk_update"))
                break label224;
              i = 6;
              continue;
              if (!((String)localObject2).equals("wait_debugger"))
                break label224;
              i = 7;
              continue;
              if (!((String)localObject2).equals("debug_process"))
                break label224;
              i = 8;
              continue;
              if (!((String)localObject2).equals("set_apkver"))
                break label224;
              i = 9;
              continue;
              if (!((String)localObject2).equals("check_files"))
                break label224;
              i = 10;
              continue;
              if (!((String)localObject2).equals("set_plugin_config_url"))
                break label224;
              i = 11;
              continue;
              if (!((String)localObject2).equals("revert_to_apk"))
                break label224;
              i = 12;
              continue;
              if (!((String)localObject2).equals("set_config_peroid"))
                break label224;
              i = 13;
              continue;
              if (!((String)localObject2).equals("recheck_cmds"))
                break label224;
              i = 14;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            }
          try
          {
            localObject2 = WebView.d.valueOf(paramString.getQueryParameter("set_web_config"));
            m.dTZ().a("tools", (WebView.d)localObject2);
            m.dTZ().a("toolsmp", (WebView.d)localObject2);
            cs("打开网页将使用:".concat(String.valueOf(localObject2)), true);
          }
          catch (Exception localException1)
          {
          }
          continue;
          try
          {
            WebView.d locald = WebView.d.valueOf(paramString.getQueryParameter("set_appbrand_config"));
            m.dTZ().a("appbrand", locald);
            m.dTZ().a("support", locald);
            switch (c.41.iJa[locald.ordinal()])
            {
            default:
              break;
            case 1:
              m.dTZ().a(i.a.AMl);
              cs("打开小程序将使用:".concat(String.valueOf(locald)), true);
            case 2:
            case 3:
            }
          }
          catch (Exception localException2)
          {
          }
          continue;
          m.dTZ().a(i.a.AMi);
          cs("打开小程序将使用:".concat(String.valueOf(localException2)), true);
          continue;
          m.dTZ().a(i.a.AMl);
          cs("打开小程序将使用:".concat(String.valueOf(localException2)), true);
          continue;
          if (this.ARf == null)
          {
            Object localObject3 = new ScrollView(this.AMr);
            this.ARf = new TextView(this.AMr);
            this.ARf.setBackgroundColor(-1);
            ((ScrollView)localObject3).addView(this.ARf);
            this.ARf.setOnClickListener(new View.OnClickListener()
            {
              public final void onClick(View paramAnonymousView)
              {
                AppMethodBeat.i(85133);
                c.this.dVC();
                AppMethodBeat.o(85133);
              }
            });
            dVC();
            this.ARb.getTopView().addView((View)localObject3);
            continue;
            com.tencent.xweb.a.a(null, "0");
            continue;
            try
            {
              localObject3 = paramString.getQueryParameter("set_config_url");
              XWalkEnvironment.setTestDownLoadUrl(this.AMr, (String)localObject3);
              cs("测试连接设置为:".concat(String.valueOf(localObject3)), true);
            }
            catch (Exception localException3)
            {
              cs("测试连接设置失败，格式错误", true);
            }
            continue;
            dVH();
            continue;
            paramBoolean = paramString.getBooleanQueryParameter("wait_debugger", false);
            Object localObject4 = m.dTZ();
            ((m)localObject4).AMy = paramBoolean;
            ((m)localObject4).AMr.getSharedPreferences("wcwebview", 0).edit().putBoolean("bWaitforDebugger", paramBoolean).commit();
            continue;
            localObject4 = paramString.getQueryParameter("debug_process");
            m.dTZ().AMr.getSharedPreferences("wcwebview", 4).edit().putString("strDebugProcess", (String)localObject4).commit();
            continue;
            String str2 = paramString.getQueryParameter("set_apkver");
            try
            {
              XWalkEnvironment.setAvailableVersion(Integer.parseInt(str2), "1.0.".concat(String.valueOf(str2)));
              localObject4 = new java/lang/StringBuilder;
              ((StringBuilder)localObject4).<init>("版本号设置到:");
              ct(str2 + " 点击空白处退出重启进程", true);
            }
            catch (Exception localException4)
            {
              cs("设置版本号失败:" + localException4.getMessage(), true);
            }
            continue;
            n.rE(true);
            continue;
            try
            {
              String str1 = paramString.getQueryParameter("set_plugin_config_url");
              XWalkEnvironment.setPluginTestConfigUrl(str1);
              cs("插件测试连接设置为:".concat(String.valueOf(str1)), true);
            }
            catch (Exception localException5)
            {
              cs("插件测试连接设置失败，格式错误", true);
            }
            continue;
            Object localObject5 = paramString.getQueryParameter("revert_to_apk");
            try
            {
              i = n.aE(XWalkEnvironment.getApplicationContext(), Integer.parseInt((String)localObject5));
              localObject5 = new java/lang/StringBuilder;
              ((StringBuilder)localObject5).<init>("版本号回滚到:");
              ct(i + " 点击空白处退出重启进程", true);
            }
            catch (Exception localException6)
            {
              cs("版本号回滚到失败:" + localException6.getMessage(), true);
            }
            continue;
            str2 = paramString.getQueryParameter("set_config_peroid");
            try
            {
              com.tencent.xweb.a.Sv(Integer.parseInt(str2));
              StringBuilder localStringBuilder = new java/lang/StringBuilder;
              localStringBuilder.<init>("设置配置拉取周期为:");
              ct(str2 + "分钟", false);
            }
            catch (Exception localException7)
            {
              cs("设置配置拉取周期失败:" + localException7.getMessage(), true);
            }
            continue;
            k.f(WebView.d.ANb).excute("STR_CMD_SET_RECHECK_COMMAND", null);
            ct("重新跑了一遍命令配置 点击空白处退出重启进程", true);
          }
        }
      }
      AppMethodBeat.o(85186);
      paramBoolean = true;
      continue;
      AppMethodBeat.o(85186);
      paramBoolean = false;
    }
  }

  private void dVE()
  {
    AppMethodBeat.i(85191);
    if (this.ARe == null)
      AppMethodBeat.o(85191);
    while (true)
    {
      return;
      String str = rC(false);
      this.ARe.setText(str);
      AppMethodBeat.o(85191);
    }
  }

  private static String dVG()
  {
    AppMethodBeat.i(85194);
    StringBuilder localStringBuilder = new StringBuilder("文件预览服务设置：\n");
    for (str : com.tencent.xweb.d.ALV)
      localStringBuilder.append(str).append(": force-").append(com.tencent.xweb.a.avf(m.dTZ().AMr.getSharedPreferences("wcwebview", 4).getString("force_fr_" + str.toLowerCase(), ""))).append("  cmd-").append(com.tencent.xweb.a.auX(str)).append("\n");
    String str = localStringBuilder.toString();
    AppMethodBeat.o(85194);
    return str;
  }

  protected static void jB(Context paramContext)
  {
    AppMethodBeat.i(85198);
    paramContext = (ActivityManager)paramContext.getSystemService("activity");
    int i = Process.myPid();
    int j = Process.myUid();
    paramContext = paramContext.getRunningAppProcesses().iterator();
    while (paramContext.hasNext())
    {
      ActivityManager.RunningAppProcessInfo localRunningAppProcessInfo = (ActivityManager.RunningAppProcessInfo)paramContext.next();
      if ((localRunningAppProcessInfo.uid == j) && (localRunningAppProcessInfo.pid != i))
      {
        String str = localRunningAppProcessInfo.processName;
        if ((str == null) || (!str.contains("com.tencent.mm")) || (localRunningAppProcessInfo.processName.contains("tools")) || (localRunningAppProcessInfo.processName.contains("appbrand")) || (localRunningAppProcessInfo.processName.contains("support")))
          Process.killProcess(localRunningAppProcessInfo.pid);
      }
    }
    Process.killProcess(i);
    AppMethodBeat.o(85198);
  }

  final void G(String paramString1, String paramString2, boolean paramBoolean)
  {
    AppMethodBeat.i(85202);
    Object localObject1 = new a(paramString1, paramString2);
    try
    {
      Object localObject2 = new java/io/File;
      ((File)localObject2).<init>(XWalkEnvironment.getDownloadZipDir(((a)localObject1).apkVer));
      if (((File)localObject2).exists())
        ((File)localObject2).delete();
      localFileInputStream = new java/io/FileInputStream;
      localFileInputStream.<init>(paramString1);
      paramString1 = new java/io/FileOutputStream;
      paramString1.<init>((File)localObject2);
      localObject2 = new byte[1048576];
      while (true)
      {
        int i = localFileInputStream.read((byte[])localObject2);
        if (i == -1)
          break;
        paramString1.write((byte[])localObject2, 0, i);
      }
    }
    catch (IOException paramString1)
    {
      while (true)
      {
        FileInputStream localFileInputStream;
        localObject1 = XWalkUpdater.onHandleFile((XWalkUpdater.UpdateConfig)localObject1);
        if (((Integer)localObject1).intValue() != 0)
          break;
        paramString1 = new java/lang/StringBuilder;
        paramString1.<init>("安装");
        cs(paramString2 + "成功", paramBoolean);
        AppMethodBeat.o(85202);
        return;
        paramString1.flush();
        localFileInputStream.close();
        paramString1.close();
      }
    }
    catch (Exception paramString1)
    {
      while (true)
      {
        cs("安装失败", true);
        Log.e("WebDebugPage", "install local apk failed : " + paramString1.getMessage());
        AppMethodBeat.o(85202);
        continue;
        paramString1 = new java/lang/StringBuilder;
        paramString1.<init>("安装");
        cs(paramString2 + "失败,错误码=" + localObject1, true);
        AppMethodBeat.o(85202);
      }
    }
  }

  public final void a(boolean paramBoolean1, Button paramButton, boolean paramBoolean2)
  {
    AppMethodBeat.i(85199);
    try
    {
      XWalkPreferences.setValue("remote-debugging", paramBoolean1);
      try
      {
        label13: if (Build.VERSION.SDK_INT >= 19)
          android.webkit.WebView.setWebContentsDebuggingEnabled(paramBoolean1);
        try
        {
          label25: com.tencent.smtt.sdk.WebView.setWebContentsDebuggingEnabled(paramBoolean1);
          label29: if ((paramBoolean2) && (this.ARb.getX5WebViewExtension() != null))
          {
            if (paramBoolean1)
              this.ARb.loadUrl("http://debugx5.qq.com/?inspector=true");
          }
          else
          {
            if (paramButton == null)
              break label99;
            if (!paramBoolean1)
              break label92;
            paramButton.setText("关闭远程调试模式");
            AppMethodBeat.o(85199);
          }
          while (true)
          {
            return;
            this.ARb.loadUrl("http://debugx5.qq.com/?inspector=false");
            break;
            label92: paramButton.setText("打开远程调试模式");
            label99: AppMethodBeat.o(85199);
          }
        }
        catch (Exception localException1)
        {
          break label29;
        }
      }
      catch (Exception localException2)
      {
        break label25;
      }
    }
    catch (Exception localException3)
    {
      break label13;
    }
  }

  final void aAe()
  {
    AppMethodBeat.i(85197);
    jB(this.AMr);
    AppMethodBeat.o(85197);
  }

  public final boolean avh(String paramString)
  {
    boolean bool1 = false;
    boolean bool2 = true;
    AppMethodBeat.i(85184);
    boolean bool3;
    if (paramString == null)
    {
      AppMethodBeat.o(85184);
      bool3 = false;
    }
    label23: Object localObject1;
    Object localObject2;
    boolean bool4;
    String str1;
    label172: int i;
    while (true)
    {
      return bool3;
      if ((paramString.contains("debugmm.qq.com")) || (paramString.contains("debugxweb.qq.com")))
      {
        localObject1 = Uri.parse(paramString);
        localObject2 = ((Uri)localObject1).getQueryParameterNames();
        if ((localObject2 != null) && (((Set)localObject2).size() > 0))
        {
          localObject2 = ((Set)localObject2).iterator();
          bool3 = false;
          while (true)
          {
            bool4 = bool3;
            if (!((Iterator)localObject2).hasNext())
              break label882;
            str1 = (String)((Iterator)localObject2).next();
            if (str1 != null)
              switch (str1.hashCode())
              {
              default:
                i = -1;
                switch (i)
                {
                default:
                  break;
                case 0:
                  if (((Uri)localObject1).getBooleanQueryParameter("forcex5", false))
                  {
                    m.dTZ().a("tools", WebView.d.ANc);
                    m.dTZ().a("appbrand", WebView.d.ANc);
                    m.dTZ().a("support", WebView.d.ANc);
                    m.dTZ().a("mm", WebView.d.ANc);
                    m.dTZ().a("toolsmp", WebView.d.ANc);
                    m.dTZ().a(i.a.AMi);
                    ct("force use x5 switch is on ", true);
                  }
                  break;
                case 1:
                case 2:
                case 3:
                case 4:
                }
                break;
              case -677737752:
              case -82035977:
              case -873960692:
              case 624401059:
              case -1767214708:
                while (true)
                {
                  label175: AppMethodBeat.o(85184);
                  bool3 = bool2;
                  break;
                  if (!str1.equals("forcex5"))
                    break label172;
                  i = 0;
                  break label175;
                  if (!str1.equals("inspector"))
                    break label172;
                  i = 1;
                  break label175;
                  if (!str1.equals("ticket"))
                    break label172;
                  i = 2;
                  break label175;
                  if (!str1.equals("show_x5_ver"))
                    break label172;
                  i = 3;
                  break label175;
                  if (!str1.equals("encrpt_url"))
                    break label172;
                  i = 4;
                  break label175;
                  m.dTZ().a("tools", WebView.d.ANa);
                  m.dTZ().a("appbrand", WebView.d.ANa);
                  m.dTZ().a("support", WebView.d.ANa);
                  m.dTZ().a("mm", WebView.d.ANa);
                  m.dTZ().a("toolsmp", WebView.d.ANa);
                  m.dTZ().a(i.a.AMd);
                  ct("force use x5 switch is off ", true);
                }
                bool3 = ((Uri)localObject1).getBooleanQueryParameter("inspector", false);
                m.dTZ().rw(bool3);
                a(bool3, null, true);
                AppMethodBeat.o(85184);
                bool3 = bool2;
                break label23;
                str1 = ((Uri)localObject1).getQueryParameter("ticket");
                String str2 = ((Uri)localObject1).toString();
                if ((TextUtils.isEmpty(str2)) || (TextUtils.isEmpty(str1)))
                  bool3 = false;
                while (true)
                {
                  if (bool3)
                    break label691;
                  cs("权限校验失败", true);
                  Log.e("WebDebugPage", "checkTempPerssion failed");
                  break;
                  str2 = str2.trim();
                  i = str2.lastIndexOf("ticket");
                  if ((i < 0) || (i >= str2.length()))
                  {
                    bool3 = false;
                  }
                  else
                  {
                    String str3 = str2.substring(0, i);
                    str2 = new SimpleDateFormat("yyyyMMdd").format(new Date());
                    bool3 = str1.equalsIgnoreCase(aaV((str3 + "@check_permission@" + str2).toLowerCase()));
                  }
                }
                label691: Log.i("WebDebugPage", "checkTempPerssion suc");
              }
          }
          bool3 = ((Uri)localObject1).getBooleanQueryParameter("show_x5_ver", false);
          paramString = m.dTZ();
          if (bool3 != paramString.AMv)
          {
            paramString.AMv = bool3;
            paramString.AMr.getSharedPreferences("wcwebview", 0).edit().putBoolean("bShowX5Version", paramString.AMv).commit();
          }
          if (bool3)
            cs("开启显示x5内核信息", true);
          while (true)
          {
            AppMethodBeat.o(85184);
            bool3 = bool2;
            break;
            cs("关闭显示x5内核信息", true);
          }
          paramString = ((Uri)localObject1).getQueryParameter("encrpt_url");
          try
          {
            paramString = com.tencent.xweb.util.a.a(paramString, com.tencent.xweb.util.a.avj("b01d4598de5875eb9b86abdef32b811e9c55edcfb1673b5617cc0a6ab7dceaff"));
            if (TextUtils.isEmpty(paramString))
            {
              cs("解密失败", true);
              AppMethodBeat.o(85184);
              bool3 = bool2;
              continue;
            }
            avh(paramString);
            AppMethodBeat.o(85184);
            bool3 = bool2;
          }
          catch (Throwable paramString)
          {
            while (true)
              cs("解密失败", true);
          }
        }
      }
      else
      {
        bool4 = false;
        label882: if (!paramString.contains("public.debugxweb.qq.com"))
          break;
        paramString = Uri.parse(paramString);
        localObject1 = paramString.getQueryParameterNames();
        if ((localObject1 != null) && (((Set)localObject1).size() > 0))
        {
          localObject1 = ((Set)localObject1).iterator();
          while (((Iterator)localObject1).hasNext())
          {
            localObject2 = (String)((Iterator)localObject1).next();
            if (localObject2 != null)
            {
              switch (((String)localObject2).hashCode())
              {
              default:
              case -1157057597:
              }
              label976: for (i = -1; ; i = 0)
                switch (i)
                {
                default:
                  break;
                case 0:
                  localObject2 = m.dTZ();
                  bool3 = paramString.getBooleanQueryParameter("enable_local_debug", false);
                  ((m)localObject2).AMr.getSharedPreferences("wcwebview", 4).edit().putBoolean("m_bEnableLocalDebug", bool3).commit();
                  break;
                  if (!((String)localObject2).equals("enable_local_debug"))
                    break label976;
                }
            }
          }
        }
        AppMethodBeat.o(85184);
        bool3 = bool2;
      }
    }
    int j;
    if ((m.dTZ().AMr.getSharedPreferences("wcwebview", 4).getBoolean("m_bEnableLocalDebug", false)) || (bool4))
      j = 1;
    int k;
    while (true)
      if ((paramString.contains("debugxweb.qq.com")) || (bool4))
      {
        localObject1 = Uri.parse(paramString);
        localObject2 = ((Uri)localObject1).getQueryParameterNames();
        if ((localObject2 == null) || (((Set)localObject2).size() == 0))
        {
          if (j != 0)
            dVF();
          AppMethodBeat.o(85184);
          bool3 = bool2;
          break;
          j = 0;
          continue;
        }
        localObject2 = ((Set)localObject2).iterator();
        k = 0;
        bool3 = false;
        while (((Iterator)localObject2).hasNext())
        {
          str1 = (String)((Iterator)localObject2).next();
          if (str1 != null)
          {
            switch (str1.hashCode())
            {
            default:
              label1316: i = -1;
            case -82035977:
            case 724449292:
            case 386281809:
            case -604633792:
            case 971862549:
            case 184008721:
            case -1258153200:
            case 176290201:
            case -844092179:
            }
            while (true)
              switch (i)
              {
              default:
                break;
              case 0:
                bool3 = ((Uri)localObject1).getBooleanQueryParameter("inspector", false);
                m.dTZ().rw(bool3);
                a(bool3, null, true);
                bool3 = true;
                break;
                if (!str1.equals("inspector"))
                  break label1316;
                i = 0;
                continue;
                if (!str1.equals("use_testconfig"))
                  break label1316;
                i = 1;
                continue;
                if (!str1.equals("set_grayvalue"))
                  break label1316;
                i = 2;
                continue;
                if (!str1.equals("kill_all"))
                  break label1316;
                i = 3;
                continue;
                if (!str1.equals("ignore_crashwatch"))
                  break label1316;
                i = 4;
                continue;
                if (!str1.equals("save_page"))
                  break label1316;
                i = 5;
                continue;
                if (!str1.equals("clear_cache"))
                  break label1316;
                i = 6;
                continue;
                if (!str1.equals("clear_old_ver"))
                  break label1316;
                i = 7;
                continue;
                if (!str1.equals("fix_dex"))
                  break label1316;
                i = 8;
              case 1:
              case 2:
              case 3:
              case 4:
              case 5:
              case 6:
              case 7:
              case 8:
              }
            bool3 = ((Uri)localObject1).getBooleanQueryParameter("use_testconfig", false);
            m.dTZ().ry(bool3);
            if (bool3)
              cs("使用测试config", true);
            while (true)
            {
              bool3 = true;
              break;
              cs("使用正式config", true);
            }
            try
            {
              i = Integer.parseInt(((Uri)localObject1).getQueryParameter("set_grayvalue"));
              XWalkEnvironment.setGrayValueForTest(i);
              cs("灰度值设为" + i % 10000, true);
              bool3 = true;
            }
            catch (Exception localException)
            {
              cs("灰度值设置失败，参数解析错误", true);
              bool3 = true;
            }
            continue;
            k = 1;
            bool3 = true;
            continue;
            bool2 = ((Uri)localObject1).getBooleanQueryParameter("ignore_crashwatch", false);
            m localm = m.dTZ();
            localm.AMz = bool2;
            localm.AMr.getSharedPreferences("wcwebview", 0).edit().putBoolean("ignore_crashwatch", bool2).commit();
            cs("忽略crash检测设为 = ".concat(String.valueOf(bool2)), true);
            continue;
            if (!m.dTZ().AMw);
            for (bool2 = true; ; bool2 = false)
            {
              m.dTZ().rx(bool2);
              if (!bool2)
                break label1801;
              dVB();
              this.ARg.setVisibility(0);
              break;
            }
            label1801: if (this.ARg != null)
            {
              this.ARg.setVisibility(8);
              continue;
              w.clearAllWebViewCache(XWalkEnvironment.getApplicationContext(), true);
              cs("网页cache已经清理:", true);
              continue;
              n.E(XWalkEnvironment.getApplicationContext(), true);
              cs("旧版本已经清理", true);
              continue;
              n.dVL();
            }
          }
        }
      }
    while (true)
    {
      if (j != 0)
      {
        if (!cr(paramString, bool4))
        {
          bool4 = bool1;
          if (!bool3);
        }
        else
        {
          bool4 = true;
        }
        bool3 = bool4;
      }
      while (true)
      {
        if (k != 0)
          aAe();
        AppMethodBeat.o(85184);
        break;
      }
      k = 0;
      bool3 = false;
    }
  }

  final void cs(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(85203);
    if (paramBoolean);
    while (true)
    {
      try
      {
        AlertDialog.Builder localBuilder = new android/app/AlertDialog$Builder;
        localBuilder.<init>(this.AMr);
        localBuilder.setMessage(paramString);
        localBuilder.create().show();
        AppMethodBeat.o(85203);
        return;
      }
      catch (Exception paramString)
      {
        Log.i("WebDebugPage", "show alert failed may be in abtets exe " + paramString.getMessage());
        AppMethodBeat.o(85203);
        continue;
      }
      Log.e("WebDebugPage", paramString);
      AppMethodBeat.o(85203);
    }
  }

  final void ct(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(85204);
    try
    {
      AlertDialog.Builder localBuilder = new android/app/AlertDialog$Builder;
      localBuilder.<init>(this.AMr);
      localBuilder.setMessage(paramString);
      localBuilder.create();
      localBuilder.setCancelable(true);
      if (paramBoolean)
      {
        paramString = new com/tencent/xweb/xwalk/c$39;
        paramString.<init>(this);
        localBuilder.setOnCancelListener(paramString);
      }
      localBuilder.show();
      AppMethodBeat.o(85204);
      return;
    }
    catch (Exception paramString)
    {
      while (true)
      {
        Log.i("WebDebugPage", "show alert failed may be in abtets exe " + paramString.getMessage());
        AppMethodBeat.o(85204);
      }
    }
  }

  public final void dUl()
  {
    AppMethodBeat.i(85183);
    if (m.dTZ().AMt)
      a(m.dTZ().AMt, null, false);
    AppMethodBeat.o(85183);
  }

  final void dVB()
  {
    AppMethodBeat.i(85187);
    if (!m.dTZ().AMw)
      AppMethodBeat.o(85187);
    while (true)
    {
      return;
      if (this.ARg != null)
      {
        AppMethodBeat.o(85187);
      }
      else
      {
        this.ARg = new Button(this.AMr);
        this.ARg.setText("保存页面");
        this.ARg.setOnClickListener(new c.1(this));
        this.ARb.getTopView().addView(this.ARg);
        AppMethodBeat.o(85187);
      }
    }
  }

  final void dVC()
  {
    AppMethodBeat.i(85188);
    if (this.ARf == null)
      AppMethodBeat.o(85188);
    while (true)
    {
      return;
      Object localObject1 = XWalkEnvironment.getXWalkUpdateConfigUrl();
      Object localObject3 = "\n\n" + this.ARb.getAbstractInfo();
      Object localObject4 = localObject3;
      if (com.tencent.xweb.WebView.getCurWebType() != WebView.d.ANb)
        localObject4 = (String)localObject3 + "\n xwebsdk is = 190301 apk ver is " + XWalkEnvironment.getAvailableVersion();
      localObject4 = new StringBuilder().append((String)localObject4).append("\n\n current js engine: =  ").append(i.dTU()).append("\n prefered js engine =  ").append(i.a(i.a.AMd, "appbrand", this.AMr)).append("\n isWaitingForUpdate = ");
      com.tencent.xweb.xwalk.b.c.dVV();
      localObject4 = com.tencent.xweb.xwalk.b.c.dVW() + "\n local gray value = " + XWalkEnvironment.getGrayValue() + "\n config url = " + (String)localObject1 + "\n config period(minutes) = " + com.tencent.xweb.xwalk.b.c.dWb() / 60000L + "\n\n apilevel = " + Build.VERSION.SDK_INT + "\n device is  " + Build.BRAND + " " + Build.MODEL + "\n usertype is " + XWalkEnvironment.getUserType();
      localObject1 = com.tencent.xweb.a.getAbstractInfo();
      localObject3 = localObject4;
      if (localObject1 != null)
      {
        localObject3 = localObject4;
        if (!((String)localObject1).isEmpty())
          localObject3 = (String)localObject4 + "\n\n ------dump commands start:------\n" + (String)localObject1 + "\n ------dump commands end------";
      }
      Object localObject5 = "";
      localObject4 = localObject5;
      try
      {
        SimpleDateFormat localSimpleDateFormat = new java/text/SimpleDateFormat;
        localObject4 = localObject5;
        localSimpleDateFormat.<init>("yyyy-MM-dd HH:mm:ss");
        localObject1 = localObject5;
        localObject4 = localObject5;
        if (com.tencent.xweb.xwalk.b.c.dVX())
        {
          localObject4 = localObject5;
          localObject1 = new java/util/Date;
          localObject4 = localObject5;
          ((Date)localObject1).<init>(com.tencent.xweb.xwalk.b.c.dWd().ATv);
          localObject4 = localObject5;
          localObject6 = localSimpleDateFormat.format((Date)localObject1);
          localObject4 = localObject5;
          localObject1 = new java/lang/StringBuilder;
          localObject4 = localObject5;
          ((StringBuilder)localObject1).<init>();
          localObject4 = localObject5;
          localObject1 = "" + "going to update to apk ver = " + com.tencent.xweb.xwalk.b.c.dWd().ATn;
          localObject4 = localObject1;
          localObject5 = new java/lang/StringBuilder;
          localObject4 = localObject1;
          ((StringBuilder)localObject5).<init>();
          localObject4 = localObject1;
          localObject1 = (String)localObject1 + "\n update time is = " + (String)localObject6;
          localObject4 = localObject1;
          localObject5 = new java/lang/StringBuilder;
          localObject4 = localObject1;
          ((StringBuilder)localObject5).<init>();
          localObject4 = localObject1;
          localObject1 = (String)localObject1 + "\n is patch update = " + com.tencent.xweb.xwalk.b.c.dWd().ATt;
          localObject4 = localObject1;
          localObject5 = new java/lang/StringBuilder;
          localObject4 = localObject1;
          ((StringBuilder)localObject5).<init>();
          localObject4 = localObject1;
          localObject1 = (String)localObject1 + "\n can use cellular = " + com.tencent.xweb.xwalk.b.c.dWd().ATh;
          localObject4 = localObject1;
          localObject5 = new java/lang/StringBuilder;
          localObject4 = localObject1;
          ((StringBuilder)localObject5).<init>();
          localObject4 = localObject1;
          localObject1 = (String)localObject1 + "\n try count = " + com.tencent.xweb.xwalk.b.c.dWd().ATx;
          localObject4 = localObject1;
          localObject5 = new java/lang/StringBuilder;
          localObject4 = localObject1;
          ((StringBuilder)localObject5).<init>();
          localObject4 = localObject1;
          localObject1 = (String)localObject1 + "\n try use shared core count = " + com.tencent.xweb.xwalk.b.c.dWd().ATy;
          localObject4 = localObject1;
          localObject5 = new java/lang/StringBuilder;
          localObject4 = localObject1;
          ((StringBuilder)localObject5).<init>();
          localObject4 = localObject1;
          localObject1 = (String)localObject1 + "\n";
        }
        localObject4 = localObject1;
        localObject5 = new java/util/Date;
        localObject4 = localObject1;
        ((Date)localObject5).<init>(com.tencent.xweb.xwalk.b.c.dWd().ATs);
        localObject4 = localObject1;
        Object localObject6 = new java/lang/StringBuilder;
        localObject4 = localObject1;
        ((StringBuilder)localObject6).<init>();
        localObject4 = localObject1;
        localObject1 = (String)localObject1 + " last fetch config time = " + localSimpleDateFormat.format((Date)localObject5);
        localObject4 = localObject3;
        if (localObject1 != null)
        {
          localObject4 = localObject3;
          if (!((String)localObject1).isEmpty())
            localObject4 = (String)localObject3 + "\n\n ------dump schedule updateInfo start:------\n" + (String)localObject1 + "\n ------dump schedule updateInfo end------";
        }
        localObject1 = XWalkEnvironment.getXWalkInitializeLog();
        localObject3 = localObject4;
        if (localObject1 != null)
        {
          localObject3 = localObject4;
          if (!((String)localObject1).isEmpty())
            localObject3 = (String)localObject4 + "\n\n ------dump xweb log------\n" + (String)localObject1;
        }
        this.ARf.setText((CharSequence)localObject3);
        AppMethodBeat.o(85188);
      }
      catch (Exception localException)
      {
        while (true)
          Object localObject2 = localObject4;
      }
    }
  }

  final void dVD()
  {
    AppMethodBeat.i(85189);
    if ((!m.dTZ().AMu) && ((!m.dTZ().AMv) || (this.ARb.getWebCoreType() != WebView.d.ANc)))
      AppMethodBeat.o(85189);
    while (true)
    {
      return;
      if (this.ARe != null)
      {
        AppMethodBeat.o(85189);
      }
      else
      {
        this.ARe = new TextView(this.AMr);
        this.ARe.setOnLongClickListener(new c.23(this));
        dVE();
        this.ARb.getTopView().addView(this.ARe);
        AppMethodBeat.o(85189);
      }
    }
  }

  final boolean dVF()
  {
    AppMethodBeat.i(85193);
    if (this.ARh != null)
    {
      this.ARh.setVisibility(0);
      AppMethodBeat.o(85193);
      return true;
    }
    this.ARh = ((LayoutInflater)this.AMr.getSystemService("layout_inflater")).inflate(2130969264, this.ARb.getTopView(), true).findViewById(2131822083);
    ((Button)this.ARh.findViewById(2131823205)).setOnClickListener(new c.34(this));
    Object localObject1 = (CheckBox)this.ARh.findViewById(2131823203);
    ((CheckBox)localObject1).setChecked(m.dTZ().AMu);
    ((CheckBox)localObject1).setOnCheckedChangeListener(new c.42(this));
    ((TextView)this.ARh.findViewById(2131823204)).setOnClickListener(new c.43(this, (CheckBox)localObject1));
    localObject1 = (EditText)this.ARh.findViewById(2131823226);
    if (localObject1 != null)
    {
      ((EditText)localObject1).setInputType(2);
      ((EditText)localObject1).setText(XWalkEnvironment.getGrayValue());
      ((EditText)localObject1).addTextChangedListener(new c.44(this, (EditText)localObject1));
    }
    ((Spinner)this.ARh.findViewById(2131823214)).setOnItemSelectedListener(new c.45(this));
    ((RadioGroup)this.ARh.findViewById(2131823215)).setOnCheckedChangeListener(new c.46(this));
    label304: Object localObject2;
    switch (c.41.izX[m.dTZ().AMA.ordinal()])
    {
    default:
      ((RadioGroup)this.ARh.findViewById(2131823220)).setOnCheckedChangeListener(new c.2(this));
      ((Button)this.ARh.findViewById(2131823227)).setOnClickListener(new c.3(this));
      localObject1 = (Button)this.ARh.findViewById(2131823228);
      a(m.dTZ().AMt, (Button)localObject1, false);
      ((Button)localObject1).setOnClickListener(new c.4(this, (Button)localObject1));
      ((Button)this.ARh.findViewById(2131823229)).setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          AppMethodBeat.i(85126);
          XWalkEnvironment.clearAllVersion(c.this.AMr);
          AppMethodBeat.o(85126);
        }
      });
      ((Button)this.ARh.findViewById(2131823247)).setOnClickListener(new c.6(this));
      ((Button)this.ARh.findViewById(2131823232)).setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          AppMethodBeat.i(85128);
          c.this.rD(true);
          AppMethodBeat.o(85128);
        }
      });
      localObject2 = (Button)this.ARh.findViewById(2131823230);
      if (m.dTZ().AMB)
      {
        localObject1 = "使用正式版config";
        label490: ((Button)localObject2).setText((CharSequence)localObject1);
        ((Button)localObject2).setOnClickListener(new c.8(this, (Button)localObject2));
        ((Button)this.ARh.findViewById(2131823231)).setOnClickListener(new c.9(this));
        localObject2 = (LinearLayout)this.ARh.findViewById(2131823234);
        ((LinearLayout)localObject2).setVisibility(8);
        localObject1 = (Button)this.ARh.findViewById(2131823233);
        ((Button)localObject1).setText("插件设置");
        ((Button)localObject1).setOnClickListener(new c.10(this, (LinearLayout)localObject2));
        localObject2 = (Button)this.ARh.findViewById(2131823235);
        if (!XWalkEnvironment.hasPluginTestConfigUrl())
          break label1241;
      }
      break;
    case 1:
    case 2:
    case 3:
    case 4:
    case 5:
    }
    label1241: for (localObject1 = "切换插件config，当前使用测试版"; ; localObject1 = "切换插件config，当前使用正式版")
    {
      ((Button)localObject2).setText((CharSequence)localObject1);
      ((Button)localObject2).setOnClickListener(new c.11(this, (Button)localObject2));
      ((Button)this.ARh.findViewById(2131823237)).setOnClickListener(new c.13(this));
      ((Button)this.ARh.findViewById(2131823238)).setOnClickListener(new c.14(this));
      ((Button)this.ARh.findViewById(2131823236)).setOnClickListener(new c.15(this));
      ((Button)this.ARh.findViewById(2131823239)).setOnClickListener(new c.16(this));
      ((Button)this.ARh.findViewById(2131823240)).setOnClickListener(new c.17(this));
      ((Button)this.ARh.findViewById(2131823241)).setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          AppMethodBeat.i(85139);
          paramAnonymousView = c.this;
          Object localObject = Environment.getExternalStorageDirectory();
          if (localObject == null)
          {
            paramAnonymousView.cs("请确认应用权限，在权限管理打开应用的读写存储权限", true);
            AppMethodBeat.o(85139);
          }
          while (true)
          {
            return;
            if (((File)localObject).listFiles() == null)
            {
              paramAnonymousView.cs("请确认应用权限，在权限管理打开应用的读写存储权限", true);
              AppMethodBeat.o(85139);
            }
            else
            {
              localObject = ((File)localObject).getPath() + "/apkxwebtest/xweb_filereader.zip";
              if (!new File((String)localObject).exists())
              {
                paramAnonymousView.cs("文件不存在 /apkxwebtest/xweb_filereader.zip", true);
                AppMethodBeat.o(85139);
              }
              else
              {
                new c.33(paramAnonymousView, (String)localObject).execute(new Void[0]);
                AppMethodBeat.o(85139);
              }
            }
          }
        }
      });
      ((TextView)this.ARh.findViewById(2131823242)).setText(dVG());
      localObject1 = (EditText)this.ARh.findViewById(2131823243);
      ((Button)this.ARh.findViewById(2131823244)).setOnClickListener(new c.19(this, (EditText)localObject1));
      ((Button)this.ARh.findViewById(2131823245)).setOnClickListener(new c.20(this, (EditText)localObject1));
      ((Button)this.ARh.findViewById(2131823246)).setOnClickListener(new c.21(this, (EditText)localObject1));
      ((TextView)this.ARh.findViewById(2131823250)).setText(rC(true) + "\n" + XWalkInitializer.getXWalkInitializeLog());
      ((LinearLayout)this.ARh.findViewById(2131823212)).setVisibility(8);
      ((Button)this.ARh.findViewById(2131823207)).setOnClickListener(new c.22(this));
      ((Button)this.ARh.findViewById(2131823208)).setOnClickListener(new c.24(this));
      ((Button)this.ARh.findViewById(2131823209)).setOnClickListener(new c.25(this));
      ((Button)this.ARh.findViewById(2131823210)).setOnClickListener(new c.26(this));
      ((Button)this.ARh.findViewById(2131823211)).setOnClickListener(new c.27(this));
      ((Button)this.ARh.findViewById(2131823248)).setOnClickListener(new c.28(this));
      localObject1 = (Button)this.ARh.findViewById(2131823249);
      ((Button)localObject1).setOnClickListener(new c.29(this));
      ((Button)localObject1).setOnLongClickListener(new c.30(this));
      AppMethodBeat.o(85193);
      break;
      ((RadioButton)this.ARh.findViewById(2131823221)).setChecked(true);
      break label304;
      ((RadioButton)this.ARh.findViewById(2131823223)).setChecked(true);
      break label304;
      ((RadioButton)this.ARh.findViewById(2131823224)).setChecked(true);
      break label304;
      ((RadioButton)this.ARh.findViewById(2131823222)).setChecked(true);
      break label304;
      ((RadioButton)this.ARh.findViewById(2131823225)).setChecked(true);
      break label304;
      localObject1 = "使用测试config";
      break label490;
    }
  }

  final void dVH()
  {
    AppMethodBeat.i(85196);
    com.tencent.xweb.a.a(null, "0");
    SharedPreferences.Editor localEditor = XWalkEnvironment.getSharedPreferencesForUpdateConfig().edit();
    localEditor.putLong("nLastFetchConfigTime", 0L);
    localEditor.putBoolean("bCanUseCellular", true);
    localEditor.putLong("nTimeToUpdate", 100L);
    localEditor.commit();
    com.tencent.xweb.xwalk.b.c.dWd().ATs = 100L;
    com.tencent.xweb.xwalk.b.c.dWd().ATh = true;
    com.tencent.xweb.xwalk.b.c.dWd().ATv = 100L;
    new c.b(this, this.AMr).s(null);
    AppMethodBeat.o(85196);
  }

  final void l(WebView.d paramd)
  {
    AppMethodBeat.i(85192);
    switch (c.41.iJa[paramd.ordinal()])
    {
    default:
    case 4:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      AppMethodBeat.o(85192);
      while (true)
      {
        return;
        ((RadioButton)this.ARh.findViewById(2131823216)).setChecked(true);
        AppMethodBeat.o(85192);
        continue;
        ((RadioButton)this.ARh.findViewById(2131823217)).setChecked(true);
        AppMethodBeat.o(85192);
        continue;
        ((RadioButton)this.ARh.findViewById(2131823219)).setChecked(true);
        AppMethodBeat.o(85192);
      }
      ((RadioButton)this.ARh.findViewById(2131823218)).setChecked(true);
    }
  }

  final String rC(boolean paramBoolean)
  {
    AppMethodBeat.i(85190);
    String str1 = this.ARb.getVersionInfo();
    int i;
    if (!paramBoolean)
    {
      i = str1.indexOf(",apkversion");
      str2 = str1;
      if (i <= 0);
    }
    for (String str2 = str1.substring(0, i); ; str2 = str1 + ", " + e.dVR() + " current process is " + XWalkEnvironment.getProcessName())
    {
      AppMethodBeat.o(85190);
      return str2;
    }
  }

  final void rD(boolean paramBoolean)
  {
    AppMethodBeat.i(85201);
    Object localObject1 = Environment.getExternalStorageDirectory();
    if (localObject1 == null)
    {
      cs("请确认应用权限，在权限管理打开应用的读写存储权限", true);
      AppMethodBeat.o(85201);
    }
    while (true)
    {
      return;
      if (((File)localObject1).listFiles() == null)
      {
        cs("请确认应用权限，在权限管理打开应用的读写存储权限", true);
        AppMethodBeat.o(85201);
      }
      else
      {
        localObject1 = ((File)localObject1).getPath() + "/apkxwebtest";
        Object localObject2;
        try
        {
          localObject2 = new java/io/File;
          ((File)localObject2).<init>((String)localObject1);
          localObject2 = ((File)localObject2).listFiles();
          if ((localObject2 != null) && (localObject2.length != 0))
            break label135;
          cs("apkxwebtest目录下没有.zip文件,请确认应用权限，在权限管理打开应用的读写存储权限", true);
          AppMethodBeat.o(85201);
        }
        catch (Exception localException)
        {
          cs("没有找到apkxwebtest目录,请确认应用权限，在权限管理打开应用的读写存储权限", true);
          AppMethodBeat.o(85201);
        }
        continue;
        label135: for (int i = 0; ; i++)
        {
          if (i >= localObject2.length)
            break label290;
          if (localObject2[i].getName().endsWith(".zip"))
          {
            String str = localObject2[i].getAbsolutePath();
            localObject2 = localObject2[i].getName();
            if (paramBoolean)
            {
              new AlertDialog.Builder(this.AMr).setTitle("提示").setMessage("确定加载:" + (String)localObject2 + "?").setPositiveButton("确定", new c.36(this, str, (String)localObject2, paramBoolean)).setNegativeButton("取消", new c.35(this)).show();
              AppMethodBeat.o(85201);
              break;
            }
            G(str, (String)localObject2, paramBoolean);
            AppMethodBeat.o(85201);
            break;
          }
        }
        label290: cs("apkxwebtest目录下没有.zip文件", true);
        AppMethodBeat.o(85201);
      }
    }
  }

  static final class a extends XWalkUpdater.UpdateConfig
  {
    String ARF;

    private a(int paramInt)
    {
      super(false, paramInt);
    }

    public a(String paramString1, String paramString2)
    {
      this(i);
      AppMethodBeat.i(85175);
      this.ARF = paramString1;
      this.isMatchMd5 = false;
      this.isPatchUpdate = false;
      this.versionDetail = "local:".concat(String.valueOf(paramString2));
      AppMethodBeat.o(85175);
    }

    public final boolean checkValid()
    {
      return true;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.xweb.xwalk.c
 * JD-Core Version:    0.6.2
 */