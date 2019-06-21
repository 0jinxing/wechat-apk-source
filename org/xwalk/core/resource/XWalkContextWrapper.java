package org.xwalk.core.resource;

import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.view.LayoutInflater;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import org.xwalk.core.Log;
import org.xwalk.core.WebViewExtension;
import org.xwalk.core.XWalkCoreWrapper;
import org.xwalk.core.XWalkEnvironment;

public class XWalkContextWrapper extends ContextWrapper
{
  private static final String GENERATED_RESOURCE_CLASS = "org.xwalk.core.R";
  private static final String TAG = "XWalkLib";
  private static String mPackageName = null;
  private static HashMap<Long, Integer> mResourcessKeyIdMap;
  public int apkVersion;
  public String extractedCoreDir;
  private ApplicationInfo mApplicationInfo;
  private ClassLoader mClassLoader;
  private Context mContext;
  private boolean mHasAddFilterResources;
  private final LayoutInflater mLayoutInflater;
  private Resources mResources;
  private Resources.Theme mTheme;
  public boolean usingCustomContext;

  public XWalkContextWrapper(Context paramContext, int paramInt)
  {
    super(paramContext);
    AppMethodBeat.i(86212);
    this.apkVersion = 0;
    this.mHasAddFilterResources = false;
    this.usingCustomContext = false;
    this.apkVersion = paramInt;
    String str = XWalkEnvironment.getDownloadApkPath(paramInt);
    this.extractedCoreDir = XWalkEnvironment.getExtractedCoreDir(paramInt);
    this.mContext = paramContext;
    this.mLayoutInflater = ((LayoutInflater)paramContext.getSystemService("layout_inflater")).cloneInContext(this);
    XWalkContextWrapper.XWalkLayoutInflaterFactory localXWalkLayoutInflaterFactory = new XWalkContextWrapper.XWalkLayoutInflaterFactory(null);
    localXWalkLayoutInflaterFactory.layoutInflater = this.mLayoutInflater;
    try
    {
      Field localField = LayoutInflater.class.getDeclaredField("mFactorySet");
      localField.setAccessible(true);
      localField.setBoolean(this.mLayoutInflater, false);
      this.mLayoutInflater.setFactory(localXWalkLayoutInflaterFactory);
      this.usingCustomContext = XWalkEnvironment.getUsingCustomContext();
      if (this.usingCustomContext)
      {
        this.mResources = new XWalkResource(getResources(paramContext, str), paramContext);
        if ((this.mResources != null) && (this.mApplicationInfo != null))
        {
          this.mTheme = this.mResources.newTheme();
          if (getPackageInfo(paramContext, str) != null)
          {
            paramContext = paramContext.getTheme();
            if (paramContext != null)
              this.mTheme.setTo(paramContext);
            this.mTheme.applyStyle(this.mApplicationInfo.theme, true);
          }
        }
        AppMethodBeat.o(86212);
        return;
      }
    }
    catch (NoSuchFieldException localNoSuchFieldException)
    {
      while (true)
        Log.e("XWalkLib", "XWalkContextWrapper mFactorySet" + localNoSuchFieldException.getMessage());
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      while (true)
      {
        Log.e("XWalkLib", "XWalkContextWrapper mFactorySet" + localIllegalAccessException.getMessage());
        continue;
        this.mResources = getResources(paramContext, str);
      }
    }
  }

  private boolean checkResApkExist(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(86215);
    if ((paramString == null) || (paramString.length() == 0))
      AppMethodBeat.o(86215);
    while (true)
    {
      return bool;
      paramString = new File(paramString);
      if ((paramString.exists()) && (paramString.isFile()))
      {
        bool = true;
        AppMethodBeat.o(86215);
      }
      else
      {
        AppMethodBeat.o(86215);
      }
    }
  }

  private PackageInfo getPackageInfo(Context paramContext, String paramString)
  {
    AppMethodBeat.i(86216);
    paramContext = paramContext.getPackageManager().getPackageArchiveInfo(paramString, 0);
    AppMethodBeat.o(86216);
    return paramContext;
  }

  private Intent getRealIntent(Intent paramIntent)
  {
    AppMethodBeat.i(86218);
    ComponentName localComponentName = paramIntent.getComponent();
    if (localComponentName != null)
      paramIntent.setComponent(new ComponentName(getBaseContext(), localComponentName.getClassName()));
    AppMethodBeat.o(86218);
    return paramIntent;
  }

  private Resources getResources(Context paramContext, String paramString)
  {
    AppMethodBeat.i(86213);
    Object localObject;
    if (checkResApkExist(paramString))
    {
      localObject = paramContext.getPackageManager().getPackageArchiveInfo(paramString, 0);
      if (localObject != null)
      {
        mPackageName = ((PackageInfo)localObject).packageName;
        this.mApplicationInfo = ((PackageInfo)localObject).applicationInfo;
        if (this.mApplicationInfo != null)
        {
          this.mApplicationInfo.sourceDir = paramString;
          this.mApplicationInfo.publicSourceDir = paramString;
        }
      }
    }
    try
    {
      localObject = paramContext.getPackageManager().getResourcesForApplication(this.mApplicationInfo);
      if (localObject != null)
      {
        AppMethodBeat.o(86213);
        paramContext = (Context)localObject;
        return paramContext;
      }
    }
    catch (Throwable localThrowable)
    {
      while (true)
      {
        Log.i("XWalkLib", "XWalkContextWrapper try getResourcesNotWithReflect failed, use getResourcesWithReflect");
        paramContext = getResourcesWithReflect(paramContext, paramString);
        AppMethodBeat.o(86213);
        continue;
        Log.i("XWalkLib", "XWalkContextWrapper checkResApkExist false");
        paramContext = null;
        AppMethodBeat.o(86213);
      }
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      label91: break label91;
    }
  }

  private Resources getResourcesWithReflect(Context paramContext, String paramString)
  {
    AppMethodBeat.i(86214);
    try
    {
      AssetManager localAssetManager = (AssetManager)AssetManager.class.newInstance();
      localAssetManager.getClass().getMethod("addAssetPath", new Class[] { String.class }).invoke(localAssetManager, new Object[] { paramString });
      paramString = super.getResources();
      paramContext = new android/content/res/Resources;
      paramContext.<init>(localAssetManager, paramString.getDisplayMetrics(), paramString.getConfiguration());
      AppMethodBeat.o(86214);
      return paramContext;
    }
    catch (Exception paramContext)
    {
      while (true)
      {
        Log.e("XWalkLib", "XWalkContextWrapper getResourcesWithReflect error:" + paramContext.getMessage());
        paramContext = null;
        AppMethodBeat.o(86214);
      }
    }
  }

  public Context getApplicationContext()
  {
    AppMethodBeat.i(86219);
    Context localContext = this.mContext.getApplicationContext();
    AppMethodBeat.o(86219);
    return localContext;
  }

  public AssetManager getAssets()
  {
    AppMethodBeat.i(86220);
    Object localObject = getResources();
    if (localObject != null)
    {
      localObject = ((Resources)localObject).getAssets();
      AppMethodBeat.o(86220);
    }
    while (true)
    {
      return localObject;
      localObject = super.getAssets();
      AppMethodBeat.o(86220);
    }
  }

  public Context getBaseContext()
  {
    return this.mContext;
  }

  public ClassLoader getClassLoader()
  {
    AppMethodBeat.i(86228);
    Object localObject;
    if (this.mClassLoader != null)
    {
      localObject = this.mClassLoader;
      AppMethodBeat.o(86228);
    }
    while (true)
    {
      return localObject;
      localObject = XWalkCoreWrapper.getInstance();
      if (localObject != null)
      {
        localObject = ((XWalkCoreWrapper)localObject).getBridgeLoader();
        AppMethodBeat.o(86228);
      }
      else
      {
        localObject = super.getClassLoader();
        AppMethodBeat.o(86228);
      }
    }
  }

  public LayoutInflater getLayoutInflater()
  {
    return this.mLayoutInflater;
  }

  public String getPackageName()
  {
    AppMethodBeat.i(86221);
    String str = this.mContext.getPackageName();
    AppMethodBeat.o(86221);
    return str;
  }

  public Context getPlatformContext()
  {
    return this.mContext;
  }

  public Resources getResources()
  {
    AppMethodBeat.i(86222);
    Resources localResources;
    if (!this.mHasAddFilterResources)
    {
      if (WebViewExtension.addFilterResources(this.mResources, getResourcesKeyIdMap(this.mResources)))
        this.mHasAddFilterResources = true;
    }
    else
    {
      localResources = this.mResources;
      if (localResources == null)
        break label64;
      AppMethodBeat.o(86222);
    }
    while (true)
    {
      return localResources;
      Log.e("XWalkLib", "mHasAddFilterResources = false");
      break;
      label64: localResources = super.getResources();
      AppMethodBeat.o(86222);
    }
  }

  // ERROR //
  public HashMap<Long, Integer> getResourcesKeyIdMap(Resources paramResources)
  {
    // Byte code:
    //   0: ldc_w 381
    //   3: invokestatic 56	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: getstatic 383	org/xwalk/core/resource/XWalkContextWrapper:mResourcessKeyIdMap	Ljava/util/HashMap;
    //   9: ifnull +21 -> 30
    //   12: getstatic 383	org/xwalk/core/resource/XWalkContextWrapper:mResourcessKeyIdMap	Ljava/util/HashMap;
    //   15: invokevirtual 388	java/util/HashMap:clone	()Ljava/lang/Object;
    //   18: checkcast 385	java/util/HashMap
    //   21: astore_1
    //   22: ldc_w 381
    //   25: invokestatic 169	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   28: aload_1
    //   29: areturn
    //   30: ldc 13
    //   32: ldc_w 390
    //   35: invokestatic 277	org/xwalk/core/Log:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   38: new 385	java/util/HashMap
    //   41: dup
    //   42: invokespecial 392	java/util/HashMap:<init>	()V
    //   45: astore_2
    //   46: aload_0
    //   47: invokevirtual 393	org/xwalk/core/resource/XWalkContextWrapper:getClassLoader	()Ljava/lang/ClassLoader;
    //   50: ldc 10
    //   52: invokevirtual 399	java/lang/ClassLoader:loadClass	(Ljava/lang/String;)Ljava/lang/Class;
    //   55: invokevirtual 403	java/lang/Class:getClasses	()[Ljava/lang/Class;
    //   58: astore_3
    //   59: aload_3
    //   60: arraylength
    //   61: istore 4
    //   63: iconst_0
    //   64: istore 5
    //   66: iload 5
    //   68: iload 4
    //   70: if_icmpge +292 -> 362
    //   73: aload_3
    //   74: iload 5
    //   76: aaload
    //   77: astore 6
    //   79: aload 6
    //   81: invokevirtual 406	java/lang/Class:getSimpleName	()Ljava/lang/String;
    //   84: ldc_w 408
    //   87: invokevirtual 412	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   90: ifeq +426 -> 516
    //   93: aload 6
    //   95: invokevirtual 416	java/lang/Class:getFields	()[Ljava/lang/reflect/Field;
    //   98: astore 7
    //   100: aload 7
    //   102: arraylength
    //   103: istore 8
    //   105: iconst_0
    //   106: istore 9
    //   108: iload 9
    //   110: iload 8
    //   112: if_icmpge +404 -> 516
    //   115: aload 7
    //   117: iload 9
    //   119: aaload
    //   120: astore 6
    //   122: aload 6
    //   124: invokevirtual 419	java/lang/reflect/Field:getModifiers	()I
    //   127: invokestatic 425	java/lang/reflect/Modifier:isFinal	(I)Z
    //   130: ifeq +9 -> 139
    //   133: aload 6
    //   135: iconst_1
    //   136: invokevirtual 111	java/lang/reflect/Field:setAccessible	(Z)V
    //   139: iconst_0
    //   140: istore 10
    //   142: iload 10
    //   144: istore 11
    //   146: new 427	android/util/TypedValue
    //   149: astore 12
    //   151: iload 10
    //   153: istore 11
    //   155: aload 12
    //   157: invokespecial 428	android/util/TypedValue:<init>	()V
    //   160: iload 10
    //   162: istore 11
    //   164: aload 6
    //   166: aconst_null
    //   167: invokevirtual 432	java/lang/reflect/Field:getInt	(Ljava/lang/Object;)I
    //   170: istore 10
    //   172: iload 10
    //   174: istore 11
    //   176: aload_1
    //   177: iload 10
    //   179: aload 12
    //   181: iconst_1
    //   182: invokevirtual 436	android/content/res/Resources:getValue	(ILandroid/util/TypedValue;Z)V
    //   185: iload 10
    //   187: istore 11
    //   189: aload 12
    //   191: getfield 439	android/util/TypedValue:assetCookie	I
    //   194: i2l
    //   195: bipush 32
    //   197: lshl
    //   198: aload 12
    //   200: getfield 442	android/util/TypedValue:data	I
    //   203: i2l
    //   204: lor
    //   205: lstore 13
    //   207: iload 10
    //   209: istore 11
    //   211: aload_2
    //   212: lload 13
    //   214: invokestatic 448	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   217: iload 10
    //   219: invokestatic 453	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   222: invokevirtual 457	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   225: pop
    //   226: iload 10
    //   228: istore 11
    //   230: new 171	java/lang/StringBuilder
    //   233: astore 12
    //   235: iload 10
    //   237: istore 11
    //   239: aload 12
    //   241: ldc_w 459
    //   244: invokespecial 176	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   247: iload 10
    //   249: istore 11
    //   251: ldc 13
    //   253: aload 12
    //   255: aload 6
    //   257: invokevirtual 462	java/lang/reflect/Field:getName	()Ljava/lang/String;
    //   260: invokevirtual 184	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   263: ldc_w 464
    //   266: invokevirtual 184	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   269: iload 10
    //   271: invokevirtual 467	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   274: ldc_w 469
    //   277: invokevirtual 184	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   280: lload 13
    //   282: invokevirtual 472	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   285: invokevirtual 187	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   288: invokestatic 475	org/xwalk/core/Log:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   291: aload 6
    //   293: invokevirtual 419	java/lang/reflect/Field:getModifiers	()I
    //   296: invokestatic 425	java/lang/reflect/Modifier:isFinal	(I)Z
    //   299: ifeq +9 -> 308
    //   302: aload 6
    //   304: iconst_0
    //   305: invokevirtual 111	java/lang/reflect/Field:setAccessible	(Z)V
    //   308: iinc 9 1
    //   311: goto -203 -> 108
    //   314: astore 12
    //   316: new 171	java/lang/StringBuilder
    //   319: astore 12
    //   321: aload 12
    //   323: invokespecial 476	java/lang/StringBuilder:<init>	()V
    //   326: ldc 13
    //   328: aload 12
    //   330: aload 6
    //   332: invokevirtual 462	java/lang/reflect/Field:getName	()Ljava/lang/String;
    //   335: invokevirtual 184	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   338: ldc_w 478
    //   341: invokevirtual 184	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   344: invokevirtual 187	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   347: invokestatic 481	org/xwalk/core/Log:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   350: goto -59 -> 291
    //   353: astore_1
    //   354: ldc 13
    //   356: ldc_w 483
    //   359: invokestatic 193	org/xwalk/core/Log:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   362: aload_2
    //   363: putstatic 383	org/xwalk/core/resource/XWalkContextWrapper:mResourcessKeyIdMap	Ljava/util/HashMap;
    //   366: ldc 13
    //   368: new 171	java/lang/StringBuilder
    //   371: dup
    //   372: ldc_w 485
    //   375: invokespecial 176	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   378: getstatic 383	org/xwalk/core/resource/XWalkContextWrapper:mResourcessKeyIdMap	Ljava/util/HashMap;
    //   381: invokevirtual 489	java/util/HashMap:keySet	()Ljava/util/Set;
    //   384: invokeinterface 494 1 0
    //   389: invokevirtual 467	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   392: invokevirtual 187	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   395: invokestatic 277	org/xwalk/core/Log:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   398: getstatic 383	org/xwalk/core/resource/XWalkContextWrapper:mResourcessKeyIdMap	Ljava/util/HashMap;
    //   401: invokevirtual 388	java/util/HashMap:clone	()Ljava/lang/Object;
    //   404: checkcast 385	java/util/HashMap
    //   407: astore_1
    //   408: ldc_w 381
    //   411: invokestatic 169	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   414: goto -386 -> 28
    //   417: astore 12
    //   419: new 171	java/lang/StringBuilder
    //   422: astore 12
    //   424: aload 12
    //   426: invokespecial 476	java/lang/StringBuilder:<init>	()V
    //   429: ldc 13
    //   431: aload 12
    //   433: aload 6
    //   435: invokevirtual 462	java/lang/reflect/Field:getName	()Ljava/lang/String;
    //   438: invokevirtual 184	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   441: ldc_w 496
    //   444: invokevirtual 184	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   447: invokevirtual 187	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   450: invokestatic 481	org/xwalk/core/Log:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   453: goto -162 -> 291
    //   456: astore_1
    //   457: ldc 13
    //   459: aload_1
    //   460: invokevirtual 326	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   463: invokestatic 193	org/xwalk/core/Log:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   466: goto -104 -> 362
    //   469: astore 12
    //   471: new 171	java/lang/StringBuilder
    //   474: astore 12
    //   476: aload 12
    //   478: invokespecial 476	java/lang/StringBuilder:<init>	()V
    //   481: ldc 13
    //   483: aload 12
    //   485: aload 6
    //   487: invokevirtual 462	java/lang/reflect/Field:getName	()Ljava/lang/String;
    //   490: invokevirtual 184	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   493: ldc_w 498
    //   496: invokevirtual 184	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   499: iload 11
    //   501: invokestatic 501	java/lang/Integer:toHexString	(I)Ljava/lang/String;
    //   504: invokevirtual 184	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   507: invokevirtual 187	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   510: invokestatic 481	org/xwalk/core/Log:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   513: goto -222 -> 291
    //   516: iinc 5 1
    //   519: goto -453 -> 66
    //
    // Exception table:
    //   from	to	target	type
    //   146	151	314	java/lang/IllegalAccessException
    //   155	160	314	java/lang/IllegalAccessException
    //   164	172	314	java/lang/IllegalAccessException
    //   176	185	314	java/lang/IllegalAccessException
    //   189	207	314	java/lang/IllegalAccessException
    //   211	226	314	java/lang/IllegalAccessException
    //   230	235	314	java/lang/IllegalAccessException
    //   239	247	314	java/lang/IllegalAccessException
    //   251	291	314	java/lang/IllegalAccessException
    //   46	63	353	java/lang/ClassNotFoundException
    //   79	105	353	java/lang/ClassNotFoundException
    //   122	139	353	java/lang/ClassNotFoundException
    //   146	151	353	java/lang/ClassNotFoundException
    //   155	160	353	java/lang/ClassNotFoundException
    //   164	172	353	java/lang/ClassNotFoundException
    //   176	185	353	java/lang/ClassNotFoundException
    //   189	207	353	java/lang/ClassNotFoundException
    //   211	226	353	java/lang/ClassNotFoundException
    //   230	235	353	java/lang/ClassNotFoundException
    //   239	247	353	java/lang/ClassNotFoundException
    //   251	291	353	java/lang/ClassNotFoundException
    //   291	308	353	java/lang/ClassNotFoundException
    //   316	350	353	java/lang/ClassNotFoundException
    //   419	453	353	java/lang/ClassNotFoundException
    //   471	513	353	java/lang/ClassNotFoundException
    //   146	151	417	java/lang/IllegalArgumentException
    //   155	160	417	java/lang/IllegalArgumentException
    //   164	172	417	java/lang/IllegalArgumentException
    //   176	185	417	java/lang/IllegalArgumentException
    //   189	207	417	java/lang/IllegalArgumentException
    //   211	226	417	java/lang/IllegalArgumentException
    //   230	235	417	java/lang/IllegalArgumentException
    //   239	247	417	java/lang/IllegalArgumentException
    //   251	291	417	java/lang/IllegalArgumentException
    //   46	63	456	java/lang/Exception
    //   79	105	456	java/lang/Exception
    //   122	139	456	java/lang/Exception
    //   146	151	456	java/lang/Exception
    //   155	160	456	java/lang/Exception
    //   164	172	456	java/lang/Exception
    //   176	185	456	java/lang/Exception
    //   189	207	456	java/lang/Exception
    //   211	226	456	java/lang/Exception
    //   230	235	456	java/lang/Exception
    //   239	247	456	java/lang/Exception
    //   251	291	456	java/lang/Exception
    //   291	308	456	java/lang/Exception
    //   316	350	456	java/lang/Exception
    //   419	453	456	java/lang/Exception
    //   471	513	456	java/lang/Exception
    //   146	151	469	android/content/res/Resources$NotFoundException
    //   155	160	469	android/content/res/Resources$NotFoundException
    //   164	172	469	android/content/res/Resources$NotFoundException
    //   176	185	469	android/content/res/Resources$NotFoundException
    //   189	207	469	android/content/res/Resources$NotFoundException
    //   211	226	469	android/content/res/Resources$NotFoundException
    //   230	235	469	android/content/res/Resources$NotFoundException
    //   239	247	469	android/content/res/Resources$NotFoundException
    //   251	291	469	android/content/res/Resources$NotFoundException
  }

  public Object getSystemService(String paramString)
  {
    AppMethodBeat.i(86223);
    if (paramString.equals("layout_inflater"))
    {
      paramString = getLayoutInflater();
      AppMethodBeat.o(86223);
    }
    while (true)
    {
      return paramString;
      paramString = this.mContext.getSystemService(paramString);
      AppMethodBeat.o(86223);
    }
  }

  public Resources.Theme getTheme()
  {
    AppMethodBeat.i(86224);
    Resources.Theme localTheme;
    if (this.mTheme != null)
    {
      localTheme = this.mTheme;
      AppMethodBeat.o(86224);
    }
    while (true)
    {
      return localTheme;
      localTheme = super.getTheme();
      AppMethodBeat.o(86224);
    }
  }

  public void setClassLoader(ClassLoader paramClassLoader)
  {
    this.mClassLoader = paramClassLoader;
  }

  public void setTheme(int paramInt)
  {
    AppMethodBeat.i(86225);
    if (this.mContext.getTheme() != null)
    {
      this.mContext.getTheme().applyStyle(paramInt, true);
      AppMethodBeat.o(86225);
    }
    while (true)
    {
      return;
      super.setTheme(paramInt);
      AppMethodBeat.o(86225);
    }
  }

  public void startActivity(Intent paramIntent)
  {
    AppMethodBeat.i(86226);
    super.startActivity(getRealIntent(paramIntent));
    AppMethodBeat.o(86226);
  }

  public ComponentName startService(Intent paramIntent)
  {
    AppMethodBeat.i(86227);
    paramIntent = super.startService(getRealIntent(paramIntent));
    AppMethodBeat.o(86227);
    return paramIntent;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     org.xwalk.core.resource.XWalkContextWrapper
 * JD-Core Version:    0.6.2
 */