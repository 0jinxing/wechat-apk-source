package com.tencent.mm.pluginsdk.ui.tools;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.webkit.MimeTypeMap;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.expt.a.a.a;
import com.tencent.mm.pluginsdk.model.o;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.k;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.e.l;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.HashMap;

public final class a
{
  private static Intent vsW;
  private static WeakReference<Activity> vsX;
  public static HashMap<String, String> vsY;
  public static HashMap<String, String> vsZ;

  static
  {
    int i = 0;
    AppMethodBeat.i(125853);
    vsY = new HashMap();
    long l = System.currentTimeMillis();
    Object localObject1 = ah.getContext().getAssets();
    Object localObject2 = null;
    Object localObject3 = null;
    try
    {
      localObject1 = ((AssetManager)localObject1).open("mimetype.txt");
      localObject3 = localObject1;
      localObject2 = localObject1;
      Object localObject5 = new java/lang/String;
      localObject3 = localObject1;
      localObject2 = localObject1;
      ((String)localObject5).<init>(com.tencent.mm.a.e.q((InputStream)localObject1));
      localObject3 = localObject1;
      localObject2 = localObject1;
      arrayOfString = ((String)localObject5).split("\n");
      localObject3 = localObject1;
      localObject2 = localObject1;
      int j = arrayOfString.length;
      if (i < j)
      {
        String str = arrayOfString[i];
        localObject3 = localObject1;
        localObject2 = localObject1;
        localObject5 = str.split(",");
        if (localObject5 != null)
        {
          localObject3 = localObject1;
          localObject2 = localObject1;
          if (localObject5.length > 1)
          {
            localObject3 = localObject1;
            localObject2 = localObject1;
            if (!bo.isNullOrNil(localObject5[0]))
            {
              localObject3 = localObject1;
              localObject2 = localObject1;
              if (!bo.isNullOrNil(localObject5[1]))
              {
                localObject3 = localObject1;
                localObject2 = localObject1;
                vsY.put(localObject5[0].trim(), localObject5[1].trim());
              }
            }
          }
        }
        while (true)
        {
          i++;
          break;
          localObject3 = localObject1;
          localObject2 = localObject1;
          ab.i("MicroMsg.AppChooserIntentUtil", "mimeType %s", new Object[] { str });
        }
      }
    }
    catch (IOException localIOException)
    {
      String[] arrayOfString;
      localObject2 = localObject3;
      ab.printErrStackTrace("MicroMsg.AppChooserIntentUtil", localIOException, "read mimeType from asset", new Object[0]);
      com.tencent.mm.a.e.p((InputStream)localObject3);
      while (true)
      {
        localObject3 = new HashMap();
        vsZ = (HashMap)localObject3;
        ((HashMap)localObject3).put("txt", "mtt/txt");
        vsZ.put("epub", "mtt/epub");
        vsZ.put("pdf", "mtt/pdf");
        vsZ.put("doc", "mtt/doc");
        vsZ.put("xls", "mtt/xls");
        vsZ.put("ppt", "mtt/ppt");
        vsZ.put("docx", "mtt/docx");
        vsZ.put("xlsx", "mtt/xlsx");
        vsZ.put("pptx", "mtt/pptx");
        vsZ.put("chm", "mtt/chm");
        vsZ.put("ini", "mtt/ini");
        vsZ.put("log", "mtt/log");
        vsZ.put("bat", "mtt/bat");
        vsZ.put("php", "mtt/php");
        vsZ.put("lrc", "mtt/lrc");
        vsZ.put("js", "mtt/js");
        AppMethodBeat.o(125853);
        return;
        localObject3 = localIOException;
        localObject2 = localIOException;
        ab.i("MicroMsg.AppChooserIntentUtil", "read from mimetype text %d %d %d", new Object[] { Integer.valueOf(arrayOfString.length), Integer.valueOf(vsY.size()), Long.valueOf(System.currentTimeMillis() - l) });
        com.tencent.mm.a.e.p(localIOException);
      }
    }
    finally
    {
      com.tencent.mm.a.e.p((InputStream)localObject2);
      AppMethodBeat.o(125853);
    }
  }

  private static void D(Context paramContext, String paramString1, String paramString2)
  {
    AppMethodBeat.i(125843);
    Intent localIntent = new Intent();
    localIntent.putExtra("file_path", paramString1);
    localIntent.putExtra("file_ext", paramString2);
    localIntent.addFlags(268435456);
    localIntent.setComponent(new ComponentName(e.l.iRj, "com.tencent.mm.booter.MMReceivers$ToolsProcessReceiver"));
    localIntent.putExtra("tools_process_action_code_key", "com.tencent.mm.intent.ACTION_CHECK_MINIQB_CAN_OPEN_FILE");
    paramContext.sendBroadcast(localIntent);
    AppMethodBeat.o(125843);
  }

  private static Intent E(Context paramContext, String paramString1, String paramString2)
  {
    AppMethodBeat.i(125846);
    Intent localIntent = new Intent();
    localIntent.setAction("android.intent.action.VIEW");
    localIntent.addFlags(268435456);
    k.a(paramContext, localIntent, new File(paramString2), paramString1);
    try
    {
      ab.i("MicroMsg.AppChooserIntentUtil", "createNormalIntent %s %s %s", new Object[] { paramString1, paramString2, localIntent.toString() });
      label68: AppMethodBeat.o(125846);
      return localIntent;
    }
    catch (Exception paramContext)
    {
      break label68;
    }
  }

  private static Intent F(Context paramContext, String paramString1, String paramString2)
  {
    AppMethodBeat.i(125847);
    Intent localIntent = new Intent();
    localIntent.setPackage("com.tencent.mtt");
    localIntent.addFlags(268435456);
    localIntent.setAction("android.intent.action.VIEW");
    k.a(paramContext, localIntent, new File(paramString2), paramString1);
    try
    {
      ab.i("MicroMsg.AppChooserIntentUtil", "createQQBrowserIntent %s %s %s", new Object[] { paramString1, paramString2, localIntent.toString() });
      label77: AppMethodBeat.o(125847);
      return localIntent;
    }
    catch (Exception paramContext)
    {
      break label77;
    }
  }

  private static Intent G(Context paramContext, String paramString1, String paramString2)
  {
    AppMethodBeat.i(125848);
    Intent localIntent = new Intent("com.tencent.QQBrowser.action.sdk.document");
    localIntent.setPackage("com.tencent.mtt");
    localIntent.addFlags(268435456);
    localIntent.putExtra("ChannelID", "com.tencent.mm");
    localIntent.putExtra("PosID", 4);
    localIntent.putExtra("key_reader_sdk_id", 1);
    localIntent.putExtra("key_reader_sdk_type", 0);
    localIntent.putExtra("key_reader_sdk_format", paramString2);
    localIntent.putExtra("key_reader_sdk_path", paramString1);
    String str1 = (String)vsZ.get(paramString2);
    String str2 = str1;
    if (bo.isNullOrNil(str1))
      str2 = ajT(paramString2);
    k.a(paramContext, localIntent, new File(paramString1), str2);
    try
    {
      ab.i("MicroMsg.AppChooserIntentUtil", "createQQBrowserDocumentIntent %s %s %s %s", new Object[] { str2, paramString1, localIntent.toString(), paramString2 });
      label165: AppMethodBeat.o(125848);
      return localIntent;
    }
    catch (Exception paramContext)
    {
      break label165;
    }
  }

  public static boolean M(String paramString1, String paramString2, int paramInt)
  {
    AppMethodBeat.i(125840);
    Context localContext = ah.getContext();
    Object localObject1 = new File(paramString1);
    ab.i("MicroMsg.AppChooserIntentUtil", "path:%s, isExisted:%b, size:%d fileExt: %s", new Object[] { paramString1, Boolean.valueOf(((File)localObject1).exists()), Long.valueOf(((File)localObject1).length()), paramString2 });
    boolean bool;
    if (!((File)localObject1).exists())
    {
      ab.e("MicroMsg.AppChooserIntentUtil", "Cannot open file not existed!");
      AppMethodBeat.o(125840);
      bool = true;
    }
    while (true)
    {
      return bool;
      String str = ajT(paramString2);
      Object localObject2 = ajQ(str);
      localObject1 = localObject2;
      if (((String)localObject2).equals("com.baidu.searchbox"))
      {
        ajR(str);
        localObject1 = "";
      }
      if (!((String)localObject1).equals(""))
      {
        ab.i("MicroMsg.AppChooserIntentUtil", "User exist always config, package is %s", new Object[] { localObject1 });
        localObject2 = E(localContext, str, paramString1);
        ((Intent)localObject2).setPackage((String)localObject1);
        if (bo.k(localContext, (Intent)localObject2))
        {
          ab.i("MicroMsg.AppChooserIntentUtil", "Always package support mimeType %s", new Object[] { str });
          localContext.startActivity((Intent)localObject2);
          AppMethodBeat.o(125840);
          bool = false;
        }
        else
        {
          ab.i("MicroMsg.AppChooserIntentUtil", "Always package do not support mimeType %s", new Object[] { str });
        }
      }
      else if (((com.tencent.mm.plugin.expt.a.a)g.K(com.tencent.mm.plugin.expt.a.a.class)).a(a.a.lIV, true))
      {
        localObject1 = G(localContext, paramString1, paramString2);
        if (bo.k(localContext, (Intent)localObject1))
        {
          ah.getContext().startActivity((Intent)localObject1);
          com.tencent.mm.plugin.report.service.h.pYm.e(11168, new Object[] { Integer.valueOf(5), Integer.valueOf(paramInt) });
          AppMethodBeat.o(125840);
          bool = false;
        }
      }
      else
      {
        localObject1 = F(localContext, str, paramString1);
        if (bo.k(localContext, (Intent)localObject1))
        {
          ah.getContext().startActivity((Intent)localObject1);
          com.tencent.mm.plugin.report.service.h.pYm.e(11168, new Object[] { Integer.valueOf(5), Integer.valueOf(paramInt) });
          AppMethodBeat.o(125840);
          bool = false;
        }
        else
        {
          int i;
          if (!bo.isNullOrNil(paramString2))
          {
            localObject1 = (String)g.RP().Ry().get(ac.a.xNN, "");
            if ((!bo.isNullOrNil((String)localObject1)) && (((String)localObject1).contains(paramString2)))
              i = 1;
          }
          while (true)
            if (i != 0)
            {
              if (paramInt == 7)
              {
                AppMethodBeat.o(125840);
                bool = true;
                break;
                i = 0;
                continue;
              }
              D(localContext, paramString1, paramString2);
              AppMethodBeat.o(125840);
              bool = false;
              break;
            }
          AppMethodBeat.o(125840);
          bool = true;
        }
      }
    }
  }

  public static void a(Activity paramActivity, int paramInt1, int paramInt2, Intent paramIntent, boolean paramBoolean, int paramInt3, int paramInt4, int paramInt5)
  {
    AppMethodBeat.i(125845);
    if (paramInt1 == 2)
      if ((-1 == paramInt2) && (paramIntent != null))
      {
        String str = paramIntent.getStringExtra("selectpkg");
        paramIntent = (Intent)paramIntent.getBundleExtra("transferback").getParcelable("targetintent");
        if (paramIntent != null)
        {
          ab.i("MicroMsg.AppChooserIntentUtil", "AppChooserUI select package name %s and target intent is not null", new Object[] { str });
          paramIntent = new Intent(paramIntent);
          paramIntent.setPackage(str);
          if (bo.k(paramActivity, paramIntent))
          {
            paramActivity.startActivity(paramIntent);
            if (!"com.tencent.mtt".equals(str))
              break label164;
            com.tencent.mm.plugin.report.service.h.pYm.e(11168, new Object[] { Integer.valueOf(5), Integer.valueOf(paramInt5) });
            AppMethodBeat.o(125845);
          }
        }
      }
    while (true)
    {
      return;
      ab.e("MicroMsg.AppChooserIntentUtil", "Always Intent is not support mimetype");
      if (paramBoolean)
        com.tencent.mm.ui.base.h.g(paramActivity, paramInt3, paramInt4);
      label164: AppMethodBeat.o(125845);
      continue;
      ab.e("MicroMsg.AppChooserIntentUtil", "AppChooserUI target intent is null in handlerResultOfAppChooserUI");
      if (paramBoolean)
        com.tencent.mm.ui.base.h.g(paramActivity, paramInt3, paramInt4);
      AppMethodBeat.o(125845);
      continue;
      if (4098 == paramInt2)
      {
        ab.e("MicroMsg.AppChooserIntentUtil", "Not Found App Support media type");
        if (paramBoolean)
        {
          com.tencent.mm.ui.base.h.g(paramActivity, paramInt3, paramInt4);
          AppMethodBeat.o(125845);
        }
      }
      else if (4097 == paramInt2)
      {
        ab.i("MicroMsg.AppChooserIntentUtil", "AppChooserUI result code is no choice");
        if (paramBoolean)
        {
          com.tencent.mm.ui.base.h.g(paramActivity, paramInt3, paramInt4);
          AppMethodBeat.o(125845);
        }
      }
      else
      {
        ab.i("MicroMsg.AppChooserIntentUtil", "AppChooserUI result code is not ok or data is null");
        AppMethodBeat.o(125845);
      }
    }
  }

  public static void a(Activity paramActivity, String paramString1, String paramString2, int paramInt)
  {
    boolean bool = true;
    AppMethodBeat.i(125841);
    Object localObject1 = new File(paramString1);
    ab.i("MicroMsg.AppChooserIntentUtil", "path:%s, isExisted:%b, size:%d", new Object[] { paramString1, Boolean.valueOf(((File)localObject1).exists()), Long.valueOf(((File)localObject1).length()) });
    if (!((File)localObject1).exists())
    {
      ab.e("MicroMsg.AppChooserIntentUtil", "Cannot open file not existed!");
      AppMethodBeat.o(125841);
    }
    Object localObject2;
    Object localObject3;
    while (true)
    {
      return;
      localObject2 = ah.getContext();
      localObject3 = ajT(paramString2);
      localObject4 = ajQ((String)localObject3);
      localObject1 = localObject4;
      if (((String)localObject4).equals("com.baidu.searchbox"))
      {
        ajR((String)localObject3);
        localObject1 = "";
      }
      if (!((String)localObject1).equals(""))
      {
        ab.i("MicroMsg.AppChooserIntentUtil", "User exist always config, package is %s", new Object[] { localObject1 });
        localObject4 = E(ah.getContext(), (String)localObject3, paramString1);
        ((Intent)localObject4).setPackage((String)localObject1);
        if (bo.k((Context)localObject2, (Intent)localObject4))
        {
          ab.i("MicroMsg.AppChooserIntentUtil", "Always package support mimeType %s", new Object[] { localObject3 });
          ((Context)localObject2).startActivity((Intent)localObject4);
          AppMethodBeat.o(125841);
        }
        else
        {
          ab.i("MicroMsg.AppChooserIntentUtil", "Always package do not support mimeType %s", new Object[] { localObject3 });
        }
      }
      else if (((com.tencent.mm.plugin.expt.a.a)g.K(com.tencent.mm.plugin.expt.a.a.class)).a(a.a.lIV, true))
      {
        localObject1 = G((Context)localObject2, paramString1, paramString2);
        if (bo.k((Context)localObject2, (Intent)localObject1))
        {
          ah.getContext().startActivity((Intent)localObject1);
          com.tencent.mm.plugin.report.service.h.pYm.e(11168, new Object[] { Integer.valueOf(5), Integer.valueOf(paramInt) });
          AppMethodBeat.o(125841);
        }
      }
      else
      {
        localObject1 = F((Context)localObject2, (String)localObject3, paramString1);
        if (!bo.k((Context)localObject2, (Intent)localObject1))
          break;
        ah.getContext().startActivity((Intent)localObject1);
        com.tencent.mm.plugin.report.service.h.pYm.e(11168, new Object[] { Integer.valueOf(5), Integer.valueOf(paramInt) });
        AppMethodBeat.o(125841);
      }
    }
    Object localObject4 = E((Context)localObject2, (String)localObject3, paramString1);
    int i;
    if (!o.fF(ah.getContext()))
    {
      i = 1;
      label400: localObject2 = ajT(paramString2);
      localObject3 = Uri.fromFile(new File(paramString1));
      localObject1 = new Bundle();
      ((Bundle)localObject1).putString("targeturl", ((Uri)localObject3).toString());
      ((Bundle)localObject1).putString("filepath", paramString1);
      ((Bundle)localObject1).putString("fileext", paramString2);
      ((Bundle)localObject1).putParcelable("targetintent", (Parcelable)localObject4);
      localObject3 = new Intent();
      ((Intent)localObject3).putExtra("type", 0);
      ((Intent)localObject3).putExtra("title", paramActivity.getResources().getString(2131298273));
      ((Intent)localObject3).putExtra("needupate", false);
      if (i != 0)
        break label630;
      label522: ((Intent)localObject3).putExtra("not_show_recommend_app", bool);
      ((Intent)localObject3).putExtra("mimetype", (String)localObject2);
      ((Intent)localObject3).putExtra("targetintent", (Parcelable)localObject4);
      ((Intent)localObject3).putExtra("transferback", (Bundle)localObject1);
      ((Intent)localObject3).putExtra("scene", paramInt);
      if (paramInt != 7)
        break label636;
      ((com.tencent.mm.choosemsgfile.compat.a)g.K(com.tencent.mm.choosemsgfile.compat.a.class)).h(paramActivity, paramString1, paramString2);
    }
    while (true)
    {
      vsW = (Intent)localObject3;
      vsX = new WeakReference(paramActivity);
      AppMethodBeat.o(125841);
      break;
      i = 0;
      break label400;
      label630: bool = false;
      break label522;
      label636: D(paramActivity, paramString1, paramString2);
    }
  }

  public static void aF(Intent paramIntent)
  {
    AppMethodBeat.i(125844);
    boolean bool = paramIntent.getBooleanExtra("MINIQB_OPEN_RET_VAL", false);
    paramIntent.getStringExtra("file_path");
    String str1 = paramIntent.getStringExtra("file_ext");
    ab.i("MicroMsg.AppChooserIntentUtil", "miniQB retVal:%b", new Object[] { Boolean.valueOf(bool) });
    if (!g.RK())
    {
      AppMethodBeat.o(125844);
      return;
    }
    String str2 = (String)g.RP().Ry().get(ac.a.xNN, "");
    if (!bool)
      paramIntent = str2.replace(str1, "");
    while (true)
    {
      g.RP().Ry().set(ac.a.xNN, paramIntent);
      if ((!bool) && (vsW != null) && (vsX != null) && (vsX.get() != null))
      {
        vsW.setClass((Context)vsX.get(), AppChooserUI.class);
        ((Activity)vsX.get()).startActivityForResult(vsW, 2);
      }
      vsW = null;
      AppMethodBeat.o(125844);
      break;
      paramIntent = str2;
      if (!str2.contains(str1))
        paramIntent = str2.concat(str1);
    }
  }

  private static String ajQ(String paramString)
  {
    AppMethodBeat.i(125849);
    paramString = (String)g.RP().Ry().get(ajS(paramString), "");
    AppMethodBeat.o(125849);
    return paramString;
  }

  private static void ajR(String paramString)
  {
    AppMethodBeat.i(125850);
    g.RP().Ry().set(ajS(paramString), "");
    AppMethodBeat.o(125850);
  }

  private static int ajS(String paramString)
  {
    int i = 274528;
    AppMethodBeat.i(125851);
    if (paramString != null)
    {
      i = 274528 + paramString.hashCode();
      AppMethodBeat.o(125851);
    }
    while (true)
    {
      return i;
      AppMethodBeat.o(125851);
    }
  }

  private static String ajT(String paramString)
  {
    AppMethodBeat.i(125852);
    Object localObject1;
    if (bo.isNullOrNil(paramString))
      localObject1 = "application/octet-stream";
    while (true)
    {
      ab.i("MicroMsg.AppChooserIntentUtil", "getMimeTypeByExt fileExt: %s mimeType: %s", new Object[] { paramString, localObject1 });
      AppMethodBeat.o(125852);
      return localObject1;
      localObject1 = MimeTypeMap.getSingleton().getMimeTypeFromExtension(paramString);
      Object localObject2 = localObject1;
      if (bo.isNullOrNil((String)localObject1))
        localObject2 = (String)vsY.get(paramString);
      localObject1 = localObject2;
      if (bo.isNullOrNil((String)localObject2))
        if (paramString.startsWith("/"))
          localObject1 = "application/octet-stream";
        else
          localObject1 = "application/".concat(String.valueOf(paramString));
    }
  }

  public static boolean b(Activity paramActivity, String paramString1, String paramString2, int paramInt)
  {
    AppMethodBeat.i(125842);
    String str = ajT(paramString2);
    Uri localUri = Uri.fromFile(new File(paramString1));
    Bundle localBundle = new Bundle();
    Intent localIntent = E(paramActivity, str, paramString1);
    localBundle.putString("targeturl", localUri.toString());
    localBundle.putString("filepath", paramString1);
    localBundle.putString("fileext", paramString2);
    localBundle.putParcelable("targetintent", localIntent);
    paramString1 = new Intent(paramActivity, AppChooserUI.class);
    paramString1.putExtra("type", 0);
    paramString1.putExtra("title", paramActivity.getResources().getString(2131298273));
    paramString1.putExtra("mimetype", str);
    paramString1.putExtra("targetintent", localIntent);
    paramString1.putExtra("transferback", localBundle);
    paramString1.putExtra("scene", paramInt);
    paramString1.putExtra("openWay", true);
    paramActivity.startActivityForResult(paramString1, 2);
    AppMethodBeat.o(125842);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.tools.a
 * JD-Core Version:    0.6.2
 */