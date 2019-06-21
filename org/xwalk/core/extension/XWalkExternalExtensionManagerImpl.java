package org.xwalk.core.extension;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.File;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import org.xwalk.core.Log;
import org.xwalk.core.XWalkExternalExtensionManager;
import org.xwalk.core.XWalkNativeExtensionLoader;
import org.xwalk.core.XWalkView;

public class XWalkExternalExtensionManagerImpl extends XWalkExternalExtensionManager
  implements XWalkExtensionContextClient
{
  private static final String TAG = "XWalkExternalExtensionManagerImpl";
  private final Context mContext;
  private final HashMap<String, XWalkExternalExtensionBridge> mExtensions;
  private boolean mLoadExternalExtensions;
  private final XWalkNativeExtensionLoader mNativeExtensionLoader;
  private final XWalkView mXWalkView;

  public XWalkExternalExtensionManagerImpl(XWalkView paramXWalkView)
  {
    super(paramXWalkView);
    AppMethodBeat.i(86191);
    this.mExtensions = new HashMap();
    this.mXWalkView = paramXWalkView;
    if (getBridge() == null)
    {
      Log.e("XWalkExternalExtensionManagerImpl", "Cannot load external extensions due to old version of runtime library");
      this.mContext = null;
      this.mLoadExternalExtensions = false;
      this.mNativeExtensionLoader = null;
      AppMethodBeat.o(86191);
    }
    while (true)
    {
      return;
      this.mContext = getViewContext();
      this.mLoadExternalExtensions = true;
      this.mNativeExtensionLoader = new XWalkNativeExtensionLoader();
      loadNativeExtensions();
      AppMethodBeat.o(86191);
    }
  }

  private void createExternalExtension(String paramString1, String paramString2, String paramString3, XWalkExtensionContextClient paramXWalkExtensionContextClient)
  {
    AppMethodBeat.i(86206);
    paramXWalkExtensionContextClient = paramXWalkExtensionContextClient.getContext();
    try
    {
      paramXWalkExtensionContextClient.getClassLoader().loadClass(paramString2).getConstructor(new Class[] { String.class, String.class, XWalkExtensionContextClient.class }).newInstance(new Object[] { paramString1, paramString3, this });
      AppMethodBeat.o(86206);
      return;
    }
    catch (ClassNotFoundException paramString1)
    {
      while (true)
      {
        handleException(paramString1);
        AppMethodBeat.o(86206);
      }
    }
    catch (IllegalAccessException paramString1)
    {
      while (true)
      {
        handleException(paramString1);
        AppMethodBeat.o(86206);
      }
    }
    catch (InstantiationException paramString1)
    {
      while (true)
      {
        handleException(paramString1);
        AppMethodBeat.o(86206);
      }
    }
    catch (InvocationTargetException paramString1)
    {
      while (true)
      {
        handleException(paramString1);
        AppMethodBeat.o(86206);
      }
    }
    catch (NoSuchMethodException paramString1)
    {
      while (true)
      {
        handleException(paramString1);
        AppMethodBeat.o(86206);
      }
    }
  }

  private String getFileContent(Context paramContext, String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(86205);
    Object localObject1 = null;
    Object localObject2 = null;
    Object localObject3 = localObject2;
    if (paramBoolean)
      localObject3 = localObject1;
    try
    {
      Object localObject5 = paramContext.getResources();
      localObject3 = localObject1;
      Object localObject6 = new java/io/File;
      localObject3 = localObject1;
      ((File)localObject6).<init>(paramString);
      localObject3 = localObject1;
      localObject6 = localObject6.getName().split("\\.")[0];
      localObject3 = localObject1;
      int i = ((Resources)localObject5).getIdentifier((String)localObject6, "raw", paramContext.getPackageName());
      localObject3 = localObject2;
      if (i > 0)
        localObject3 = localObject1;
      try
      {
        localObject5 = ((Resources)localObject5).openRawResource(i);
        localObject3 = localObject5;
        localObject2 = localObject3;
        if (localObject3 == null)
          localObject2 = paramContext.getAssets().open(paramString);
        localObject3 = localObject2;
        paramContext = new byte[((InputStream)localObject2).available()];
        localObject3 = localObject2;
        ((InputStream)localObject2).read(paramContext);
        localObject3 = localObject2;
        paramContext = new String(paramContext);
        if (localObject2 != null)
          ((InputStream)localObject2).close();
        AppMethodBeat.o(86205);
        return paramContext;
      }
      catch (Resources.NotFoundException localNotFoundException)
      {
        while (true)
        {
          localObject4 = localObject1;
          localObject5 = new java/lang/StringBuilder;
          localObject4 = localObject1;
          ((StringBuilder)localObject5).<init>("Inputstream failed to open for R.raw.");
          localObject4 = localObject1;
          Log.w("XWalkExternalExtensionManagerImpl", (String)localObject6 + ", try to find it in assets");
          localObject4 = localObject2;
        }
      }
    }
    finally
    {
      Object localObject4;
      if (localObject4 != null)
        localObject4.close();
      AppMethodBeat.o(86205);
    }
    throw paramContext;
  }

  private static void handleException(Exception paramException)
  {
    AppMethodBeat.i(86208);
    Log.e("XWalkExternalExtensionManagerImpl", "Error in calling methods of external extensions. " + paramException.toString());
    AppMethodBeat.o(86208);
  }

  private void loadNativeExtensions()
  {
    AppMethodBeat.i(86207);
    Object localObject = null;
    try
    {
      String str = this.mContext.getPackageManager().getApplicationInfo(this.mContext.getPackageName(), 0).nativeLibraryDir;
      localObject = str;
      label31: if ((localObject != null) && (new File(localObject).isDirectory()))
        this.mNativeExtensionLoader.registerNativeExtensionsInPath(localObject);
      AppMethodBeat.o(86207);
      return;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      break label31;
    }
  }

  public void broadcastMessage(XWalkExternalExtension paramXWalkExternalExtension, String paramString)
  {
    AppMethodBeat.i(86198);
    paramXWalkExternalExtension = (XWalkExternalExtensionBridge)this.mExtensions.get(paramXWalkExternalExtension.getExtensionName());
    if (paramXWalkExternalExtension != null)
      paramXWalkExternalExtension.broadcastMessage(paramString);
    AppMethodBeat.o(86198);
  }

  public Activity getActivity()
  {
    if ((this.mContext instanceof Activity));
    for (Activity localActivity = (Activity)this.mContext; ; localActivity = null)
      return localActivity;
  }

  public Context getContext()
  {
    return this.mContext;
  }

  // ERROR //
  public void loadExtension(String paramString)
  {
    // Byte code:
    //   0: ldc_w 260
    //   3: invokestatic 32	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: aload_0
    //   7: getfield 57	org/xwalk/core/extension/XWalkExternalExtensionManagerImpl:mLoadExternalExtensions	Z
    //   10: ifne +10 -> 20
    //   13: ldc_w 260
    //   16: invokestatic 62	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   19: return
    //   20: aload_1
    //   21: invokevirtual 263	java/lang/String:length	()I
    //   24: istore_2
    //   25: aload_1
    //   26: astore_3
    //   27: aload_1
    //   28: iload_2
    //   29: iconst_1
    //   30: isub
    //   31: invokevirtual 267	java/lang/String:charAt	(I)C
    //   34: getstatic 271	java/io/File:separatorChar	C
    //   37: if_icmpne +12 -> 49
    //   40: aload_1
    //   41: iconst_0
    //   42: iload_2
    //   43: iconst_1
    //   44: isub
    //   45: invokevirtual 275	java/lang/String:substring	(II)Ljava/lang/String;
    //   48: astore_3
    //   49: aload_3
    //   50: aload_3
    //   51: getstatic 271	java/io/File:separatorChar	C
    //   54: invokevirtual 279	java/lang/String:lastIndexOf	(I)I
    //   57: iconst_1
    //   58: iadd
    //   59: invokevirtual 282	java/lang/String:substring	(I)Ljava/lang/String;
    //   62: astore_1
    //   63: new 188	java/lang/StringBuilder
    //   66: dup
    //   67: invokespecial 283	java/lang/StringBuilder:<init>	()V
    //   70: aload_3
    //   71: invokevirtual 195	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   74: getstatic 286	java/io/File:separator	Ljava/lang/String;
    //   77: invokevirtual 195	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   80: aload_1
    //   81: invokevirtual 195	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   84: ldc_w 288
    //   87: invokevirtual 195	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   90: invokevirtual 200	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   93: astore 4
    //   95: aload_0
    //   96: aload_0
    //   97: getfield 55	org/xwalk/core/extension/XWalkExternalExtensionManagerImpl:mContext	Landroid/content/Context;
    //   100: aload 4
    //   102: iconst_0
    //   103: invokespecial 290	org/xwalk/core/extension/XWalkExternalExtensionManagerImpl:getFileContent	(Landroid/content/Context;Ljava/lang/String;Z)Ljava/lang/String;
    //   106: astore 5
    //   108: new 292	org/json/JSONObject
    //   111: astore_1
    //   112: aload_1
    //   113: aload 5
    //   115: invokespecial 293	org/json/JSONObject:<init>	(Ljava/lang/String;)V
    //   118: aload_1
    //   119: ldc_w 295
    //   122: invokevirtual 299	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   125: astore 6
    //   127: aload_1
    //   128: ldc_w 301
    //   131: invokevirtual 299	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   134: astore 7
    //   136: aload_1
    //   137: ldc_w 303
    //   140: invokevirtual 306	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   143: astore_1
    //   144: aload_1
    //   145: ifnull +215 -> 360
    //   148: aload_1
    //   149: invokevirtual 263	java/lang/String:length	()I
    //   152: ifeq +208 -> 360
    //   155: new 188	java/lang/StringBuilder
    //   158: astore 5
    //   160: aload 5
    //   162: invokespecial 283	java/lang/StringBuilder:<init>	()V
    //   165: aload 5
    //   167: aload_3
    //   168: invokevirtual 195	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   171: getstatic 286	java/io/File:separator	Ljava/lang/String;
    //   174: invokevirtual 195	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   177: aload_1
    //   178: invokevirtual 195	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   181: invokevirtual 200	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   184: astore_1
    //   185: aconst_null
    //   186: astore 5
    //   188: aload 5
    //   190: astore_3
    //   191: aload_1
    //   192: ifnull +26 -> 218
    //   195: aload_1
    //   196: invokevirtual 263	java/lang/String:length	()I
    //   199: istore_2
    //   200: aload 5
    //   202: astore_3
    //   203: iload_2
    //   204: ifeq +14 -> 218
    //   207: aload_0
    //   208: aload_0
    //   209: getfield 55	org/xwalk/core/extension/XWalkExternalExtensionManagerImpl:mContext	Landroid/content/Context;
    //   212: aload_1
    //   213: iconst_0
    //   214: invokespecial 290	org/xwalk/core/extension/XWalkExternalExtensionManagerImpl:getFileContent	(Landroid/content/Context;Ljava/lang/String;Z)Ljava/lang/String;
    //   217: astore_3
    //   218: aload 6
    //   220: ifnull +54 -> 274
    //   223: aload 7
    //   225: ifnull +49 -> 274
    //   228: new 188	java/lang/StringBuilder
    //   231: astore_1
    //   232: aload_1
    //   233: ldc_w 308
    //   236: invokespecial 191	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   239: ldc 10
    //   241: aload_1
    //   242: aload 6
    //   244: invokevirtual 195	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   247: ldc_w 310
    //   250: invokevirtual 195	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   253: aload 7
    //   255: invokevirtual 195	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   258: invokevirtual 200	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   261: invokestatic 312	org/xwalk/core/Log:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   264: aload_0
    //   265: aload 6
    //   267: aload 7
    //   269: aload_3
    //   270: aload_0
    //   271: invokespecial 314	org/xwalk/core/extension/XWalkExternalExtensionManagerImpl:createExternalExtension	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xwalk/core/extension/XWalkExtensionContextClient;)V
    //   274: ldc_w 260
    //   277: invokestatic 62	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   280: goto -261 -> 19
    //   283: astore_1
    //   284: ldc 10
    //   286: ldc_w 316
    //   289: aload 4
    //   291: invokestatic 320	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   294: invokevirtual 323	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   297: invokestatic 203	org/xwalk/core/Log:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   300: ldc_w 260
    //   303: invokestatic 62	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   306: goto -287 -> 19
    //   309: astore_3
    //   310: ldc 10
    //   312: ldc_w 325
    //   315: aload_1
    //   316: invokestatic 320	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   319: invokevirtual 323	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   322: invokestatic 203	org/xwalk/core/Log:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   325: ldc_w 260
    //   328: invokestatic 62	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   331: goto -312 -> 19
    //   334: astore_1
    //   335: ldc 10
    //   337: ldc_w 327
    //   340: aload 4
    //   342: invokestatic 320	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   345: invokevirtual 323	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   348: invokestatic 203	org/xwalk/core/Log:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   351: ldc_w 260
    //   354: invokestatic 62	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   357: goto -338 -> 19
    //   360: goto -175 -> 185
    //
    // Exception table:
    //   from	to	target	type
    //   95	108	283	java/io/IOException
    //   207	218	309	java/io/IOException
    //   108	144	334	org/json/JSONException
    //   148	185	334	org/json/JSONException
    //   195	200	334	org/json/JSONException
    //   207	218	334	org/json/JSONException
    //   228	274	334	org/json/JSONException
    //   310	325	334	org/json/JSONException
  }

  public void onDestroy()
  {
    AppMethodBeat.i(86203);
    Iterator localIterator = this.mExtensions.values().iterator();
    while (localIterator.hasNext())
      ((XWalkExternalExtensionBridge)localIterator.next()).onDestroy();
    this.mExtensions.clear();
    AppMethodBeat.o(86203);
  }

  public void onNewIntent(Intent paramIntent)
  {
    AppMethodBeat.i(86204);
    Iterator localIterator = this.mExtensions.values().iterator();
    while (localIterator.hasNext())
      ((XWalkExternalExtensionBridge)localIterator.next()).onNewIntent(paramIntent);
    AppMethodBeat.o(86204);
  }

  public void onPause()
  {
    AppMethodBeat.i(86201);
    Iterator localIterator = this.mExtensions.values().iterator();
    while (localIterator.hasNext())
      ((XWalkExternalExtensionBridge)localIterator.next()).onPause();
    AppMethodBeat.o(86201);
  }

  public void onResume()
  {
    AppMethodBeat.i(86200);
    Iterator localIterator = this.mExtensions.values().iterator();
    while (localIterator.hasNext())
      ((XWalkExternalExtensionBridge)localIterator.next()).onResume();
    AppMethodBeat.o(86200);
  }

  public void onStart()
  {
    AppMethodBeat.i(86199);
    Iterator localIterator = this.mExtensions.values().iterator();
    while (localIterator.hasNext())
      ((XWalkExternalExtensionBridge)localIterator.next()).onStart();
    AppMethodBeat.o(86199);
  }

  public void onStop()
  {
    AppMethodBeat.i(86202);
    Iterator localIterator = this.mExtensions.values().iterator();
    while (localIterator.hasNext())
      ((XWalkExternalExtensionBridge)localIterator.next()).onStop();
    AppMethodBeat.o(86202);
  }

  public void postBinaryMessage(XWalkExternalExtension paramXWalkExternalExtension, int paramInt, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(86197);
    paramXWalkExternalExtension = (XWalkExternalExtensionBridge)this.mExtensions.get(paramXWalkExternalExtension.getExtensionName());
    if (paramXWalkExternalExtension != null)
      paramXWalkExternalExtension.postBinaryMessage(paramInt, paramArrayOfByte);
    AppMethodBeat.o(86197);
  }

  public void postMessage(XWalkExternalExtension paramXWalkExternalExtension, int paramInt, String paramString)
  {
    AppMethodBeat.i(86196);
    paramXWalkExternalExtension = (XWalkExternalExtensionBridge)this.mExtensions.get(paramXWalkExternalExtension.getExtensionName());
    if (paramXWalkExternalExtension != null)
      paramXWalkExternalExtension.postMessage(paramInt, paramString);
    AppMethodBeat.o(86196);
  }

  public void registerExtension(XWalkExternalExtension paramXWalkExternalExtension)
  {
    AppMethodBeat.i(86192);
    if (this.mExtensions.get(paramXWalkExternalExtension.getExtensionName()) != null)
    {
      Log.e("XWalkExternalExtensionManagerImpl", paramXWalkExternalExtension.getExtensionName() + "is already registered!");
      AppMethodBeat.o(86192);
    }
    while (true)
    {
      return;
      XWalkExternalExtensionBridge localXWalkExternalExtensionBridge = XWalkExternalExtensionBridgeFactory.createInstance(paramXWalkExternalExtension);
      this.mExtensions.put(paramXWalkExternalExtension.getExtensionName(), localXWalkExternalExtensionBridge);
      AppMethodBeat.o(86192);
    }
  }

  public void setAllowExternalExtensions(boolean paramBoolean)
  {
    this.mLoadExternalExtensions = paramBoolean;
  }

  public void startActivityForResult(Intent paramIntent, int paramInt, Bundle paramBundle)
  {
    AppMethodBeat.i(86194);
    paramIntent = new ActivityNotFoundException("This method is no longer supported");
    AppMethodBeat.o(86194);
    throw paramIntent;
  }

  public void unregisterExtension(String paramString)
  {
    AppMethodBeat.i(86193);
    XWalkExternalExtensionBridge localXWalkExternalExtensionBridge = (XWalkExternalExtensionBridge)this.mExtensions.get(paramString);
    if (localXWalkExternalExtensionBridge != null)
    {
      this.mExtensions.remove(paramString);
      localXWalkExternalExtensionBridge.onDestroy();
    }
    AppMethodBeat.o(86193);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     org.xwalk.core.extension.XWalkExternalExtensionManagerImpl
 * JD-Core Version:    0.6.2
 */