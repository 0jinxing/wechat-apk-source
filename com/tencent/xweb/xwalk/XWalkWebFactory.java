package com.tencent.xweb.xwalk;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.xweb.WebView;
import com.tencent.xweb.WebView.c;
import com.tencent.xweb.WebView.d;
import com.tencent.xweb.c.b.a;
import com.tencent.xweb.c.b.b;
import com.tencent.xweb.c.g;
import com.tencent.xweb.c.k.a;
import com.tencent.xweb.i.a;
import com.tencent.xweb.xwalk.b.a.a;
import org.xwalk.core.WebViewExtension;
import org.xwalk.core.WebViewExtensionListener;
import org.xwalk.core.XWalkCoreWrapper;
import org.xwalk.core.XWalkEnvironment;
import org.xwalk.core.XWalkInitializer;
import org.xwalk.core.XWalkView;
import org.xwalk.core.XWalkViewDatabase;
import org.xwalk.core.resource.XWalkContextWrapper;

public class XWalkWebFactory
  implements k.a
{
  private static final String TAG = "XWalkWebFactory";
  static XWalkWebFactory sInstance;
  private boolean mIsDebugMode = false;
  private boolean mIsDebugModeReplase = false;

  public static XWalkWebFactory getInstance()
  {
    AppMethodBeat.i(85399);
    if (sInstance == null)
      sInstance = new XWalkWebFactory();
    XWalkWebFactory localXWalkWebFactory = sInstance;
    AppMethodBeat.o(85399);
    return localXWalkWebFactory;
  }

  // ERROR //
  public static boolean tryLoadLocalAssetRuntime(Context paramContext, boolean paramBoolean)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_2
    //   2: ldc 2
    //   4: monitorenter
    //   5: ldc 50
    //   7: invokestatic 37	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   10: aload_0
    //   11: invokestatic 56	org/xwalk/core/XWalkEnvironment:init	(Landroid/content/Context;)V
    //   14: iload_1
    //   15: ifeq +17 -> 32
    //   18: invokestatic 60	org/xwalk/core/XWalkEnvironment:getAvailableVersion	()I
    //   21: ldc 61
    //   23: if_icmpne +9 -> 32
    //   26: ldc 61
    //   28: invokestatic 65	org/xwalk/core/XWalkEnvironment:delApiVersion	(I)Z
    //   31: pop
    //   32: invokestatic 60	org/xwalk/core/XWalkEnvironment:getAvailableVersion	()I
    //   35: istore_3
    //   36: iload_3
    //   37: iconst_m1
    //   38: if_icmpeq +7 -> 45
    //   41: iload_1
    //   42: ifeq +108 -> 150
    //   45: aload_0
    //   46: invokevirtual 71	android/content/Context:getAssets	()Landroid/content/res/AssetManager;
    //   49: ldc 73
    //   51: invokevirtual 79	android/content/res/AssetManager:open	(Ljava/lang/String;)Ljava/io/InputStream;
    //   54: astore_0
    //   55: new 81	java/io/File
    //   58: astore 4
    //   60: aload 4
    //   62: ldc 61
    //   64: invokestatic 85	org/xwalk/core/XWalkEnvironment:getDownloadZipDir	(I)Ljava/lang/String;
    //   67: invokespecial 88	java/io/File:<init>	(Ljava/lang/String;)V
    //   70: aload 4
    //   72: invokevirtual 92	java/io/File:exists	()Z
    //   75: ifeq +9 -> 84
    //   78: aload 4
    //   80: invokevirtual 95	java/io/File:delete	()Z
    //   83: pop
    //   84: new 97	java/io/FileOutputStream
    //   87: astore 5
    //   89: aload 5
    //   91: aload 4
    //   93: invokespecial 100	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   96: ldc 101
    //   98: newarray byte
    //   100: astore 4
    //   102: aload_0
    //   103: aload 4
    //   105: invokevirtual 107	java/io/InputStream:read	([B)I
    //   108: istore_3
    //   109: iload_3
    //   110: iconst_m1
    //   111: if_icmpeq +51 -> 162
    //   114: aload 5
    //   116: aload 4
    //   118: iconst_0
    //   119: iload_3
    //   120: invokevirtual 111	java/io/FileOutputStream:write	([BII)V
    //   123: goto -21 -> 102
    //   126: astore 4
    //   128: aload 5
    //   130: astore 4
    //   132: aload_0
    //   133: ifnull +7 -> 140
    //   136: aload_0
    //   137: invokevirtual 114	java/io/InputStream:close	()V
    //   140: aload 4
    //   142: ifnull +8 -> 150
    //   145: aload 4
    //   147: invokevirtual 115	java/io/FileOutputStream:close	()V
    //   150: ldc 50
    //   152: invokestatic 43	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   155: iload_2
    //   156: istore_1
    //   157: ldc 2
    //   159: monitorexit
    //   160: iload_1
    //   161: ireturn
    //   162: aload 5
    //   164: invokevirtual 118	java/io/FileOutputStream:flush	()V
    //   167: invokestatic 123	org/xwalk/core/XWalkUpdater:updateLocalXWalkRuntime	()V
    //   170: aload_0
    //   171: ifnull +7 -> 178
    //   174: aload_0
    //   175: invokevirtual 114	java/io/InputStream:close	()V
    //   178: aload 5
    //   180: invokevirtual 115	java/io/FileOutputStream:close	()V
    //   183: iconst_1
    //   184: istore_1
    //   185: ldc 50
    //   187: invokestatic 43	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   190: goto -33 -> 157
    //   193: astore_0
    //   194: ldc 2
    //   196: monitorexit
    //   197: aload_0
    //   198: athrow
    //   199: astore 4
    //   201: aconst_null
    //   202: astore 5
    //   204: aconst_null
    //   205: astore_0
    //   206: aload_0
    //   207: ifnull +7 -> 214
    //   210: aload_0
    //   211: invokevirtual 114	java/io/InputStream:close	()V
    //   214: aload 5
    //   216: ifnull +8 -> 224
    //   219: aload 5
    //   221: invokevirtual 115	java/io/FileOutputStream:close	()V
    //   224: ldc 50
    //   226: invokestatic 43	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   229: aload 4
    //   231: athrow
    //   232: astore_0
    //   233: goto -55 -> 178
    //   236: astore_0
    //   237: goto -54 -> 183
    //   240: astore_0
    //   241: goto -101 -> 140
    //   244: astore_0
    //   245: goto -95 -> 150
    //   248: astore_0
    //   249: goto -35 -> 214
    //   252: astore_0
    //   253: goto -29 -> 224
    //   256: astore 4
    //   258: aconst_null
    //   259: astore 5
    //   261: goto -55 -> 206
    //   264: astore 4
    //   266: goto -60 -> 206
    //   269: astore_0
    //   270: aconst_null
    //   271: astore 4
    //   273: aconst_null
    //   274: astore_0
    //   275: goto -143 -> 132
    //   278: astore 4
    //   280: aconst_null
    //   281: astore 4
    //   283: goto -151 -> 132
    //
    // Exception table:
    //   from	to	target	type
    //   96	102	126	java/io/IOException
    //   102	109	126	java/io/IOException
    //   114	123	126	java/io/IOException
    //   162	170	126	java/io/IOException
    //   5	14	193	finally
    //   18	32	193	finally
    //   32	36	193	finally
    //   136	140	193	finally
    //   145	150	193	finally
    //   150	155	193	finally
    //   174	178	193	finally
    //   178	183	193	finally
    //   185	190	193	finally
    //   210	214	193	finally
    //   219	224	193	finally
    //   224	232	193	finally
    //   45	55	199	finally
    //   174	178	232	java/lang/Exception
    //   178	183	236	java/lang/Exception
    //   136	140	240	java/lang/Exception
    //   145	150	244	java/lang/Exception
    //   210	214	248	java/lang/Exception
    //   219	224	252	java/lang/Exception
    //   55	84	256	finally
    //   84	96	256	finally
    //   96	102	264	finally
    //   102	109	264	finally
    //   114	123	264	finally
    //   162	170	264	finally
    //   45	55	269	java/io/IOException
    //   55	84	278	java/io/IOException
    //   84	96	278	java/io/IOException
  }

  public void clearAllWebViewCache(Context paramContext, boolean paramBoolean)
  {
    AppMethodBeat.i(85410);
    if (WebView.getCurWebType() != WebView.d.ANb)
      AppMethodBeat.o(85410);
    while (true)
    {
      return;
      try
      {
        int i = XWalkEnvironment.getAvailableVersion();
        if (i <= 0)
        {
          AppMethodBeat.o(85410);
        }
        else
        {
          paramContext = new org/xwalk/core/resource/XWalkContextWrapper;
          paramContext.<init>(XWalkEnvironment.getApplicationContext(), XWalkEnvironment.getAvailableVersion());
          XWalkView localXWalkView = new org/xwalk/core/XWalkView;
          localXWalkView.<init>(paramContext);
          localXWalkView.removeJavascriptInterface("searchBoxJavaBridge_");
          localXWalkView.removeJavascriptInterface("accessibility");
          localXWalkView.removeJavascriptInterface("accessibilityTraversal");
          localXWalkView.clearCache(true);
          XWalkViewDatabase.clearFormData();
          if (paramBoolean)
          {
            paramContext = getCookieManager();
            if (paramContext != null)
              paramContext.removeAllCookie();
          }
          AppMethodBeat.o(85410);
        }
      }
      catch (Throwable paramContext)
      {
        org.xwalk.core.Log.e("XWalkWebFactory", "clearAllWebViewCache exception 1 -- " + paramContext.getMessage());
        AppMethodBeat.o(85410);
      }
    }
  }

  public com.tencent.xweb.c.h createWebView(WebView paramWebView)
  {
    AppMethodBeat.i(85401);
    try
    {
      if (j.fE(paramWebView.getContext()))
      {
        WebViewExtension.updateExtension(false);
        j localj = new com/tencent/xweb/xwalk/j;
        localj.<init>(paramWebView);
        AppMethodBeat.o(85401);
        paramWebView = localj;
        return paramWebView;
      }
    }
    catch (Exception paramWebView)
    {
      while (true)
      {
        paramWebView = "init xwalk crashed:" + paramWebView.getMessage() + ",stacktrace:" + android.util.Log.getStackTraceString(paramWebView);
        org.xwalk.core.Log.e("XWalkWebFactory", paramWebView);
        XWalkInitializer.addXWalkInitializeLog(paramWebView);
        paramWebView = null;
        AppMethodBeat.o(85401);
      }
    }
  }

  public g createWebviewStorage()
  {
    AppMethodBeat.i(85413);
    i locali = new i();
    AppMethodBeat.o(85413);
    return locali;
  }

  public Object excute(String paramString, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(85400);
    if ((paramString == null) || (paramString.isEmpty()))
    {
      AppMethodBeat.o(85400);
      paramString = null;
    }
    while (true)
    {
      return paramString;
      if (paramString.equals("STR_CMD_EXXCUTE_CMD_FROM_CONFIG"))
      {
        if ((paramArrayOfObject == null) || (paramArrayOfObject.length <= 0))
        {
          AppMethodBeat.o(85400);
          paramString = null;
        }
        else
        {
          paramString = a.di(paramArrayOfObject[0]);
          AppMethodBeat.o(85400);
        }
      }
      else if (paramString.equals("STR_CMD_GET_DEBUG_VIEW"))
      {
        paramString = new c((WebView)paramArrayOfObject[0]);
        AppMethodBeat.o(85400);
      }
      else if (paramString.equals("STR_CMD_GET_UPDATER"))
      {
        paramString = new n.a();
        AppMethodBeat.o(85400);
      }
      else if (paramString.equals("STR_CMD_GET_PLUGIN_UPDATER"))
      {
        paramString = new com.tencent.xweb.xwalk.a.f();
        AppMethodBeat.o(85400);
      }
      else if (paramString.equals("STR_CMD_CLEAR_SCHEDULER"))
      {
        com.tencent.xweb.xwalk.b.c.a(null);
        AppMethodBeat.o(85400);
        paramString = null;
      }
      else
      {
        if (paramString.equals("STR_CMD_SET_DEBUG_MODE_REPLACE"))
        {
          this.mIsDebugMode = true;
          this.mIsDebugModeReplase = true;
        }
        label314: label372: 
        do
          while (true)
          {
            while (true)
            {
              AppMethodBeat.o(85400);
              paramString = null;
              break;
              if (paramString.equals("STR_CMD_SET_DEBUG_MODE_NO_REPLACE"))
              {
                this.mIsDebugMode = true;
                this.mIsDebugModeReplase = false;
              }
              else
              {
                if (!paramString.equals("STR_CMD_SET_RECHECK_COMMAND"))
                  break label314;
                try
                {
                  paramString = com.tencent.xweb.xwalk.b.a.avv(XWalkEnvironment.getUpdateConfigFullPath());
                  if (paramString == null)
                  {
                    XWalkEnvironment.addXWalkInitializeLog("recheck cmds ConfigParser failed ");
                    AppMethodBeat.o(85400);
                    paramString = null;
                    break;
                  }
                  com.tencent.xweb.a.a(paramString.ATe, paramString.ATc, true);
                  com.tencent.xweb.util.f.nI(68L);
                }
                catch (Exception paramString)
                {
                  XWalkEnvironment.addXWalkInitializeLog("recheck cmds failed , " + paramString.getMessage());
                }
              }
            }
            continue;
            if (paramString.equals("STR_CMD_SET_DEBUG_MODE_REPLACE_NOW"))
            {
              tryLoadLocalAssetRuntime((Context)paramArrayOfObject[0], true);
              c.jB((Context)paramArrayOfObject[0]);
            }
            else
            {
              if (!paramString.equals("BASE_CONTEXT_CHANGED"))
                break label372;
              XWalkCoreWrapper.getInstance();
              XWalkCoreWrapper.invokeRuntimeChannel(80001, paramArrayOfObject);
            }
          }
        while (!paramString.equals("STR_CMD_FEATURE_SUPPORT"));
        paramString = Boolean.valueOf(XWalkCoreWrapper.hasFeatureStatic(((Integer)paramArrayOfObject[0]).intValue()));
        AppMethodBeat.o(85400);
      }
    }
  }

  public b.a getCookieManager()
  {
    AppMethodBeat.i(85411);
    d locald = new d();
    AppMethodBeat.o(85411);
    return locald;
  }

  public b.b getCookieSyncManager()
  {
    AppMethodBeat.i(85412);
    e locale = new e();
    AppMethodBeat.o(85412);
    return locale;
  }

  public com.tencent.xweb.c.f getJsCore(i.a parama, Context paramContext)
  {
    Object localObject = null;
    AppMethodBeat.i(85404);
    initWebviewCore(paramContext, null);
    switch (1.izX[parama.ordinal()])
    {
    default:
      paramContext = localObject;
    case 1:
    case 2:
    }
    while (true)
    {
      AppMethodBeat.o(85404);
      return paramContext;
      paramContext = localObject;
      if (com.tencent.xweb.xwalk.b.e.isXWalkReady())
        if (parama == i.a.AMj)
        {
          paramContext = new h();
          paramContext.init(0);
        }
        else
        {
          paramContext = localObject;
          if (parama == i.a.AMk)
          {
            paramContext = new h();
            paramContext.init(1);
          }
        }
    }
  }

  public boolean hasInited()
  {
    AppMethodBeat.i(85407);
    boolean bool = XWalkWebFactory.a.hasInited();
    AppMethodBeat.o(85407);
    return bool;
  }

  public boolean hasInitedCallback()
  {
    AppMethodBeat.i(85408);
    boolean bool = XWalkWebFactory.a.hasInitedCallback();
    AppMethodBeat.o(85408);
    return bool;
  }

  public void initCallback(WebViewExtensionListener paramWebViewExtensionListener)
  {
    AppMethodBeat.i(85406);
    XWalkWebFactory.a.initCallback(paramWebViewExtensionListener);
    AppMethodBeat.o(85406);
  }

  public void initEnviroment(Context paramContext)
  {
    AppMethodBeat.i(85402);
    if (this.mIsDebugMode)
      tryLoadLocalAssetRuntime(paramContext, this.mIsDebugModeReplase);
    AppMethodBeat.o(85402);
  }

  public void initInterface()
  {
  }

  public boolean initWebviewCore(Context paramContext, WebView.c paramc)
  {
    AppMethodBeat.i(85405);
    boolean bool = XWalkWebFactory.a.jE(paramContext);
    if (paramc != null)
    {
      if (!bool)
        break label33;
      paramc.onCoreInitFinished();
    }
    while (true)
    {
      AppMethodBeat.o(85405);
      return bool;
      label33: paramc.BH();
    }
  }

  public boolean isCoreReady()
  {
    AppMethodBeat.i(85409);
    boolean bool = XWalkWebFactory.a.isCoreReady();
    AppMethodBeat.o(85409);
    return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.xweb.xwalk.XWalkWebFactory
 * JD-Core Version:    0.6.2
 */