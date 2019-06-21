package org.xwalk.core;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.Signature;
import android.os.Build.VERSION;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.xweb.util.f;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.LinkedList;
import junit.framework.Assert;

public class XWalkCoreWrapper
{
  private static final String BRIDGE_PACKAGE = "org.xwalk.core.internal";
  public static final int INVOKE_NOTITY_FUNCTION_ID_FOR_TEST = 10001;
  public static final int INVOKE_NOTITY_FUNCTION_ID_IDKEY = 50001;
  public static final int INVOKE_NOTITY_FUNCTION_ID_KVSTAT = 50002;
  public static final int INVOKE_RUNTIME_ID_CONTEXT_CHANGED = 80001;
  public static final int INVOKE_RUNTIME_ID_DELETE_ORIGIN = 80006;
  public static final int INVOKE_RUNTIME_ID_HAS_FEATURE = 80003;
  public static final int INVOKE_RUNTIME_ID_SET_RUNTIME_TO_SDK_CHANNEL = 80005;
  private static final String TAG = "XWalkLib";
  private static final String WRAPPER_PACKAGE = "org.xwalk.core";
  private static ClassLoader mStandAloneClassLoader;
  private static XWalkCoreWrapper sInstance;
  private static XWalkCoreWrapper sProvisionalInstance;
  private static HashMap<String, LinkedList<XWalkCoreWrapper.ReservedAction>> sReservedActions;
  private static LinkedList<String> sReservedActivities;
  private int mApiVersion;
  private int mApkVersion;
  private Context mBridgeContext;
  private ClassLoader mBridgeLoader;
  private int mCoreStatus;
  private int mMinApiVersion;
  private Context mWrapperContext;
  DexClassLoader sBridgeLoader;

  static
  {
    AppMethodBeat.i(85591);
    sReservedActivities = new LinkedList();
    sReservedActions = new HashMap();
    AppMethodBeat.o(85591);
  }

  private XWalkCoreWrapper(Context paramContext, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(85568);
    this.mApiVersion = 8;
    if ((paramInt1 > 0) && (paramInt1 <= this.mApiVersion));
    while (true)
    {
      this.mMinApiVersion = paramInt1;
      this.mCoreStatus = 0;
      this.mWrapperContext = paramContext;
      this.mApkVersion = paramInt2;
      AppMethodBeat.o(85568);
      return;
      paramInt1 = this.mApiVersion;
    }
  }

  public static int attachXWalkCore(int paramInt)
  {
    AppMethodBeat.i(85565);
    Assert.assertFalse(sReservedActivities.isEmpty());
    Assert.assertNull(sInstance);
    Log.i("XWalkLib", "Attach xwalk core");
    if (paramInt == -1)
    {
      Log.i("XWalkLib", "version = -1, no xwalk");
      paramInt = 10;
      AppMethodBeat.o(85565);
    }
    while (true)
    {
      return paramInt;
      sProvisionalInstance = new XWalkCoreWrapper(XWalkEnvironment.getApplicationContext(), 1, paramInt);
      if (XWalkEnvironment.isDownloadMode())
      {
        sProvisionalInstance.findDownloadedCore();
        paramInt = sProvisionalInstance.mCoreStatus;
        AppMethodBeat.o(85565);
      }
      else
      {
        paramInt = sProvisionalInstance.mCoreStatus;
        AppMethodBeat.o(85565);
      }
    }
  }

  private boolean checkCoreApk()
  {
    AppMethodBeat.i(85584);
    boolean bool;
    if (!new File(XWalkEnvironment.getDownloadApkPath(this.mApkVersion)).exists())
    {
      Log.e("XWalkLib", "checkCoreApk apk not exists");
      this.mCoreStatus = 9;
      bool = false;
      AppMethodBeat.o(85584);
    }
    while (true)
    {
      return bool;
      Log.i("XWalkLib", "XWalk checkCoreApk matched");
      bool = true;
      AppMethodBeat.o(85584);
    }
  }

  private boolean checkCoreArchitecture()
  {
    AppMethodBeat.i(85582);
    try
    {
      Object localObject = getBridgeClass("XWalkViewDelegate");
      ReflectMethod localReflectMethod = new org/xwalk/core/ReflectMethod;
      localReflectMethod.<init>((Class)localObject, "loadXWalkLibrary", new Class[] { Context.class, String.class });
      localObject = null;
      if (this.mBridgeContext != null)
        if (Build.VERSION.SDK_INT < 17)
        {
          localObject = new java/lang/StringBuilder;
          ((StringBuilder)localObject).<init>("/data/data/");
          localObject = this.mBridgeContext.getPackageName() + "/lib";
        }
      for (bool = ((Boolean)localReflectMethod.invoke(new Object[] { this.mBridgeContext, localObject })).booleanValue(); !bool; bool = ((Boolean)localReflectMethod.invoke(new Object[] { this.mWrapperContext, localObject })).booleanValue())
      {
        Log.e("XWalkLib", "Mismatch of CPU architecture");
        this.mCoreStatus = 6;
        AppMethodBeat.o(85582);
        bool = false;
        return bool;
        if (this.mWrapperContext == null)
          break label248;
        localObject = XWalkEnvironment.getExtractedCoreDir(this.mApkVersion);
      }
    }
    catch (RuntimeException localRuntimeException)
    {
      while (true)
      {
        boolean bool;
        Log.e("XWalkLib", localRuntimeException.getLocalizedMessage());
        if ((localRuntimeException.getCause() instanceof UnsatisfiedLinkError))
        {
          this.mCoreStatus = 6;
          AppMethodBeat.o(85582);
          bool = false;
        }
        else
        {
          this.mCoreStatus = 5;
          AppMethodBeat.o(85582);
          bool = false;
          continue;
          Log.i("XWalkLib", "XWalk core architecture matched");
          AppMethodBeat.o(85582);
          bool = true;
          continue;
          label248: bool = false;
        }
      }
    }
  }

  private boolean checkCorePackage(String paramString)
  {
    AppMethodBeat.i(85583);
    try
    {
      this.mBridgeContext = this.mWrapperContext.createPackageContext(paramString, 3);
      Log.d("XWalkLib", "Created package context for ".concat(String.valueOf(paramString)));
      bool = true;
      AppMethodBeat.o(85583);
      return bool;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      while (true)
      {
        Log.d("XWalkLib", paramString + " not found");
        boolean bool = false;
        AppMethodBeat.o(85583);
      }
    }
  }

  public static void dockXWalkCore()
  {
    AppMethodBeat.i(85566);
    Assert.assertNotNull(sProvisionalInstance);
    Assert.assertNull(sInstance);
    Log.d("XWalkLib", "Dock xwalk core");
    sInstance = sProvisionalInstance;
    sProvisionalInstance = null;
    AppMethodBeat.o(85566);
  }

  private boolean findDownloadedCore()
  {
    boolean bool = true;
    AppMethodBeat.i(85571);
    this.mBridgeLoader = getBridgeLoader();
    sProvisionalInstance.initCoreBridge();
    if ((this.mBridgeLoader == null) || (!checkCoreVersion()) || (!checkCoreArchitecture()) || (!checkCoreApk()))
    {
      Log.e("XWalkLib", "mBridgeLoader set to null , prev mBridgeLoader =  " + this.mBridgeLoader);
      this.mBridgeLoader = null;
      bool = false;
      AppMethodBeat.o(85571);
      return bool;
    }
    if (!initLog(sProvisionalInstance))
      Log.e("XWalkLib", "initLog failed !");
    while (true)
    {
      Log.d("XWalkLib", "Running in downloaded mode");
      this.mCoreStatus = 1;
      AppMethodBeat.o(85571);
      break;
      Log.i("XWalkLib", "initLog success!");
    }
  }

  public static int getCoreStatus()
  {
    int i;
    if (sInstance != null)
      i = sInstance.mCoreStatus;
    while (true)
    {
      return i;
      if (sProvisionalInstance == null)
        i = 0;
      else
        i = sProvisionalInstance.mCoreStatus;
    }
  }

  public static XWalkCoreWrapper getInstance()
  {
    return sInstance;
  }

  private static ClassLoader getStandAloneClassLoader()
  {
    Object localObject1 = null;
    AppMethodBeat.i(85580);
    if ((getInstance() != null) && (getInstance().sBridgeLoader != null))
    {
      localObject1 = getInstance().sBridgeLoader;
      AppMethodBeat.o(85580);
    }
    while (true)
    {
      return localObject1;
      if (mStandAloneClassLoader != null)
      {
        localObject1 = mStandAloneClassLoader;
        AppMethodBeat.o(85580);
      }
      else
      {
        try
        {
          int i = XWalkEnvironment.getAvailableVersion();
          if (i == -1)
          {
            Log.i("XWalkLib", "getXWalkClassLoader version = -1");
            AppMethodBeat.o(85580);
          }
          else
          {
            String str1 = XWalkEnvironment.getExtractedCoreDir(i);
            String str2 = XWalkEnvironment.getClassDexFilePath(i);
            Object localObject2 = new java/io/File;
            ((File)localObject2).<init>(str2);
            boolean bool = ((File)localObject2).exists();
            if (!bool)
            {
              AppMethodBeat.o(85580);
            }
            else
            {
              localObject2 = XWalkEnvironment.getOptimizedDexDir(i);
              ClassLoader localClassLoader = ClassLoader.getSystemClassLoader();
              DexClassLoader localDexClassLoader = new dalvik/system/DexClassLoader;
              localDexClassLoader.<init>(str2, (String)localObject2, str1, localClassLoader);
              mStandAloneClassLoader = localDexClassLoader;
              localObject1 = mStandAloneClassLoader;
              AppMethodBeat.o(85580);
            }
          }
        }
        catch (Exception localException)
        {
          Log.e("XWalkLib", "getXWalkClassLoader error:" + localException.getMessage());
          AppMethodBeat.o(85580);
        }
      }
    }
  }

  public static void handlePostInit(String paramString)
  {
    AppMethodBeat.i(85560);
    Log.d("XWalkLib", "Post init xwalk core in ".concat(String.valueOf(paramString)));
    if (!sReservedActions.containsKey(paramString))
      AppMethodBeat.o(85560);
    while (true)
    {
      return;
      LinkedList localLinkedList = (LinkedList)sReservedActions.get(paramString);
      while (localLinkedList.size() != 0)
      {
        XWalkCoreWrapper.ReservedAction localReservedAction = (XWalkCoreWrapper.ReservedAction)localLinkedList.pop();
        if (localReservedAction.mObject != null)
        {
          Log.d("XWalkLib", "Init reserved object: " + localReservedAction.mObject.getClass());
          new ReflectMethod(localReservedAction.mObject, "reflectionInit", new Class[0]).invoke(new Object[0]);
        }
        else if (localReservedAction.mClass != null)
        {
          Log.d("XWalkLib", "Init reserved class: " + localReservedAction.mClass.toString());
          new ReflectMethod(localReservedAction.mClass, "reflectionInit", new Class[0]).invoke(new Object[0]);
        }
        else
        {
          Log.d("XWalkLib", "Call reserved method: " + localReservedAction.mMethod.toString());
          Object[] arrayOfObject = localReservedAction.mArguments;
          if (arrayOfObject != null)
            for (int i = 0; i < arrayOfObject.length; i++)
              if ((arrayOfObject[i] instanceof ReflectMethod))
                arrayOfObject[i] = ((ReflectMethod)arrayOfObject[i]).invokeWithArguments();
          localReservedAction.mMethod.invoke(arrayOfObject);
        }
      }
      sReservedActions.remove(paramString);
      sReservedActivities.remove(paramString);
      AppMethodBeat.o(85560);
    }
  }

  public static void handlePreInit(String paramString)
  {
    AppMethodBeat.i(85556);
    if (sInstance != null)
    {
      AppMethodBeat.o(85556);
      return;
    }
    Log.d("XWalkLib", "Pre init xwalk core in ".concat(String.valueOf(paramString)));
    if (sReservedActions.containsKey(paramString))
      sReservedActions.remove(paramString);
    while (true)
    {
      sReservedActions.put(paramString, new LinkedList());
      AppMethodBeat.o(85556);
      break;
      sReservedActivities.add(paramString);
    }
  }

  public static void handleRuntimeError(RuntimeException paramRuntimeException)
  {
    AppMethodBeat.i(85561);
    Log.e("XWalkLib", "This API is incompatible with the Crosswalk runtime library");
    AppMethodBeat.o(85561);
  }

  public static boolean hasFeatureStatic(int paramInt)
  {
    AppMethodBeat.i(85581);
    Object localObject = invokeRuntimeChannel(getStandAloneClassLoader(), 80003, new Object[] { Integer.valueOf(paramInt) });
    boolean bool;
    if ((localObject instanceof Boolean))
    {
      bool = ((Boolean)localObject).booleanValue();
      AppMethodBeat.o(85581);
    }
    while (true)
    {
      return bool;
      AppMethodBeat.o(85581);
      bool = false;
    }
  }

  private byte[] hexStringToByteArray(String paramString)
  {
    AppMethodBeat.i(85586);
    if ((paramString == null) || (paramString.isEmpty()) || (paramString.length() % 2 != 0))
    {
      paramString = null;
      AppMethodBeat.o(85586);
    }
    while (true)
    {
      return paramString;
      byte[] arrayOfByte = new byte[paramString.length() / 2];
      for (int i = 0; i < paramString.length(); i += 2)
      {
        int j = Character.digit(paramString.charAt(i), 16);
        int k = Character.digit(paramString.charAt(i + 1), 16);
        arrayOfByte[(i / 2)] = ((byte)(byte)((j << 4) + k));
      }
      AppMethodBeat.o(85586);
      paramString = arrayOfByte;
    }
  }

  private void initCoreBridge()
  {
    AppMethodBeat.i(85569);
    Log.d("XWalkLib", "Init core bridge");
    new ReflectMethod(getBridgeClass("XWalkCoreBridge"), "init", new Class[] { Context.class, Object.class }).invoke(new Object[] { this.mBridgeContext, this });
    AppMethodBeat.o(85569);
  }

  public static void initEmbeddedMode()
  {
    AppMethodBeat.i(85567);
    if ((sInstance != null) || (!sReservedActivities.isEmpty()))
    {
      AppMethodBeat.o(85567);
      return;
    }
    RuntimeException localRuntimeException = new RuntimeException("royle:downloadmode should not goto this");
    AppMethodBeat.o(85567);
    throw localRuntimeException;
  }

  private boolean initLog(XWalkCoreWrapper paramXWalkCoreWrapper)
  {
    boolean bool = false;
    AppMethodBeat.i(85573);
    if (XWalkEnvironment.getAvailableVersion() < 153)
    {
      Log.d("XWalkLib", "XWalk runtime version not matched 153");
      AppMethodBeat.o(85573);
    }
    while (true)
    {
      return bool;
      Object localObject1 = new XWalkCoreWrapper.1(this, paramXWalkCoreWrapper);
      try
      {
        paramXWalkCoreWrapper = getBridgeClass("XWalkViewDelegate");
        Object localObject2 = ((XWalkLogMessageListener)localObject1).getBridge();
        localObject1 = new org/xwalk/core/ReflectMethod;
        ((ReflectMethod)localObject1).<init>(paramXWalkCoreWrapper, "setLogCallBack", new Class[] { Object.class });
        ((ReflectMethod)localObject1).invoke(new Object[] { localObject2 });
        AppMethodBeat.o(85573);
        bool = true;
      }
      catch (RuntimeException paramXWalkCoreWrapper)
      {
        Log.d("XWalkLib", paramXWalkCoreWrapper.getLocalizedMessage());
        AppMethodBeat.o(85573);
      }
    }
  }

  private void initXWalkView()
  {
    AppMethodBeat.i(85570);
    Log.d("XWalkLib", "Init xwalk view");
    new ReflectMethod(getBridgeClass("XWalkViewDelegate"), "init", new Class[] { Context.class, Context.class }).invoke(new Object[] { this.mBridgeContext, this.mWrapperContext });
    AppMethodBeat.o(85570);
  }

  public static boolean invokeNativeChannel(ClassLoader paramClassLoader, int paramInt, Object[] paramArrayOfObject)
  {
    boolean bool = false;
    AppMethodBeat.i(85577);
    if (XWalkEnvironment.getAvailableVersion() < 153)
    {
      Log.d("XWalkLib", "XWalk invokeNativeChannel runtime version not matched 153");
      AppMethodBeat.o(85577);
    }
    while (true)
    {
      return bool;
      try
      {
        invokeReflectMethod(paramClassLoader, "invokeNativeChannel", paramInt, paramArrayOfObject);
        bool = true;
        AppMethodBeat.o(85577);
      }
      catch (RuntimeException paramClassLoader)
      {
        Log.e("XWalkLib", "invokeNativeChannel error:" + paramClassLoader.getLocalizedMessage());
        f.dVx();
        AppMethodBeat.o(85577);
      }
      catch (ClassCircularityError paramClassLoader)
      {
        while (true)
        {
          Log.e("XWalkLib", "invokeRuntimeChannel error:" + paramClassLoader.getLocalizedMessage());
          f.dVy();
        }
      }
      catch (Exception paramClassLoader)
      {
        while (true)
        {
          Log.e("XWalkLib", "invokeRuntimeChannel error:" + paramClassLoader.getLocalizedMessage());
          f.dVz();
        }
      }
    }
  }

  private static Object invokeReflectMethod(ClassLoader paramClassLoader, String paramString, int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(85578);
    if (paramClassLoader == null)
    {
      paramClassLoader = new ReflectMethod(getInstance().getBridgeClass("XWalkViewDelegate"), "invokeRuntimeChannel", new Class[] { Integer.TYPE, [Ljava.lang.Object.class }).invoke(new Object[] { Integer.valueOf(paramInt), paramArrayOfObject });
      AppMethodBeat.o(85578);
    }
    while (true)
    {
      return paramClassLoader;
      try
      {
        paramClassLoader = paramClassLoader.loadClass("org.xwalk.core.internal.XWalkViewDelegate");
        paramClassLoader = new ReflectMethod(paramClassLoader, paramString, new Class[] { Integer.TYPE, [Ljava.lang.Object.class }).invoke(new Object[] { Integer.valueOf(paramInt), paramArrayOfObject });
        AppMethodBeat.o(85578);
      }
      catch (ClassNotFoundException paramClassLoader)
      {
        Log.e("XWalkLib", "invokeRuntimeChannel with classloader error:" + paramClassLoader.getMessage());
        paramClassLoader = null;
        AppMethodBeat.o(85578);
      }
    }
  }

  public static Object invokeRuntimeChannel(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(85575);
    paramArrayOfObject = invokeRuntimeChannel(null, paramInt, paramArrayOfObject);
    AppMethodBeat.o(85575);
    return paramArrayOfObject;
  }

  private static Object invokeRuntimeChannel(ClassLoader paramClassLoader, int paramInt, Object[] paramArrayOfObject)
  {
    Object localObject = null;
    AppMethodBeat.i(85576);
    if (XWalkEnvironment.getAvailableVersion() < 255)
    {
      Log.d("XWalkLib", "invokeRuntimeChannel version below SDK_SUPPORT_INVOKE_RUNTIME_MIN_APKVERSION");
      AppMethodBeat.o(85576);
      paramClassLoader = localObject;
    }
    while (true)
    {
      return paramClassLoader;
      try
      {
        paramClassLoader = invokeReflectMethod(paramClassLoader, "invokeRuntimeChannel", paramInt, paramArrayOfObject);
        AppMethodBeat.o(85576);
      }
      catch (RuntimeException paramClassLoader)
      {
        Log.e("XWalkLib", "invokeRuntimeChannel error:" + paramClassLoader.getLocalizedMessage());
        f.dVx();
        AppMethodBeat.o(85576);
        paramClassLoader = localObject;
      }
      catch (ClassCircularityError paramClassLoader)
      {
        while (true)
        {
          Log.e("XWalkLib", "invokeRuntimeChannel error:" + paramClassLoader.getLocalizedMessage());
          f.dVy();
        }
      }
      catch (Exception paramClassLoader)
      {
        while (true)
        {
          Log.e("XWalkLib", "invokeRuntimeChannel error:" + paramClassLoader.getLocalizedMessage());
          f.dVz();
        }
      }
    }
  }

  public static void reserveReflectClass(Class<?> paramClass)
  {
    AppMethodBeat.i(85558);
    String str = (String)sReservedActivities.getLast();
    Log.d("XWalkLib", "Reserve class " + paramClass.toString() + " to " + str);
    ((LinkedList)sReservedActions.get(str)).add(new XWalkCoreWrapper.ReservedAction(paramClass));
    AppMethodBeat.o(85558);
  }

  public static void reserveReflectMethod(ReflectMethod paramReflectMethod)
  {
    AppMethodBeat.i(85559);
    String str = (String)sReservedActivities.getLast();
    Log.d("XWalkLib", "Reserve method " + paramReflectMethod.toString() + " to " + str);
    ((LinkedList)sReservedActions.get(str)).add(new XWalkCoreWrapper.ReservedAction(paramReflectMethod));
    AppMethodBeat.o(85559);
  }

  public static void reserveReflectObject(Object paramObject)
  {
    AppMethodBeat.i(85557);
    String str = (String)sReservedActivities.getLast();
    Log.d("XWalkLib", "Reserve object " + paramObject.getClass() + " to " + str);
    ((LinkedList)sReservedActions.get(str)).add(new XWalkCoreWrapper.ReservedAction(paramObject));
    AppMethodBeat.o(85557);
  }

  private boolean verifyPackageInfo(PackageInfo paramPackageInfo, String paramString1, String paramString2)
  {
    boolean bool = false;
    AppMethodBeat.i(85585);
    if (paramPackageInfo.signatures == null)
    {
      Log.e("XWalkLib", "No signature in package info");
      AppMethodBeat.o(85585);
    }
    while (true)
    {
      return bool;
      try
      {
        paramString1 = MessageDigest.getInstance(paramString1);
        paramString2 = hexStringToByteArray(paramString2);
        if (paramString2 == null)
        {
          paramPackageInfo = new IllegalArgumentException("Invalid hash code");
          AppMethodBeat.o(85585);
          throw paramPackageInfo;
        }
      }
      catch (NoSuchAlgorithmException paramPackageInfo)
      {
        paramPackageInfo = new IllegalArgumentException("Invalid hash algorithm");
        AppMethodBeat.o(85585);
        throw paramPackageInfo;
        int i = 0;
        while (true)
          if (i < paramPackageInfo.signatures.length)
          {
            Log.d("XWalkLib", "Checking signature ".concat(String.valueOf(i)));
            if (!MessageDigest.isEqual(paramString1.digest(paramPackageInfo.signatures[i].toByteArray()), paramString2))
            {
              Log.e("XWalkLib", "Hash code does not match");
              i++;
            }
            else
            {
              Log.d("XWalkLib", "Signature passed verification");
              bool = true;
              AppMethodBeat.o(85585);
              break;
            }
          }
        AppMethodBeat.o(85585);
      }
      catch (NullPointerException paramPackageInfo)
      {
        label68: break label68;
      }
    }
  }

  public boolean checkCoreVersion()
  {
    AppMethodBeat.i(85572);
    Log.i("XWalkLib", "[Environment] SDK:" + Build.VERSION.SDK_INT);
    Log.i("XWalkLib", "[App Version] build:24.53.595.0, api:" + this.mApiVersion + ", min_api:" + this.mMinApiVersion);
    try
    {
      localClass = getBridgeClass("XWalkCoreVersion");
      localObject1 = "";
    }
    catch (RuntimeException localRuntimeException1)
    {
      try
      {
        Class localClass;
        Object localObject2 = new org/xwalk/core/ReflectField;
        ((ReflectField)localObject2).<init>(localClass, "XWALK_BUILD_VERSION");
        localObject2 = (String)((ReflectField)localObject2).get();
        Object localObject1 = localObject2;
        label102: localObject2 = new org/xwalk/core/ReflectField;
        ((ReflectField)localObject2).<init>(localClass, "API_VERSION");
        int i = ((Integer)((ReflectField)localObject2).get()).intValue();
        localObject2 = new org/xwalk/core/ReflectField;
        ((ReflectField)localObject2).<init>(localClass, "MIN_API_VERSION");
        int j = ((Integer)((ReflectField)localObject2).get()).intValue();
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>("[Lib Version] build:");
        Log.i("XWalkLib", (String)localObject1 + ", api:" + i + ", min_api:" + j);
        boolean bool;
        if ((XWalkEnvironment.isDownloadMode()) && (XWalkEnvironment.isDownloadModeUpdate()) && (!((String)localObject1).isEmpty()) && (!((String)localObject1).equals("24.53.595.0")))
        {
          this.mCoreStatus = 8;
          AppMethodBeat.o(85572);
          bool = false;
        }
        while (true)
        {
          return bool;
          if (this.mMinApiVersion > i)
          {
            this.mCoreStatus = 3;
            AppMethodBeat.o(85572);
            bool = false;
          }
          else if (this.mApiVersion < j)
          {
            this.mCoreStatus = 4;
            AppMethodBeat.o(85572);
            bool = false;
            continue;
            localRuntimeException1 = localRuntimeException1;
            Log.e("XWalkLib", "XWalk core not found");
            this.mCoreStatus = 2;
            AppMethodBeat.o(85572);
            bool = false;
          }
          else
          {
            Log.i("XWalkLib", "XWalk core version matched");
            bool = true;
            AppMethodBeat.o(85572);
          }
        }
      }
      catch (RuntimeException localRuntimeException2)
      {
        break label102;
      }
    }
  }

  public int getApkVersion()
  {
    int i = 0;
    AppMethodBeat.i(85563);
    Object localObject = getBridgeLoader();
    int j;
    if (localObject == null)
    {
      AppMethodBeat.o(85563);
      j = i;
    }
    while (true)
    {
      return j;
      try
      {
        localObject = ((DexClassLoader)localObject).loadClass("org.xwalk.core.internal.XWalkCoreVersion");
        if (localObject == null)
        {
          AppMethodBeat.o(85563);
          j = i;
        }
        else
        {
          try
          {
            ReflectField localReflectField = new org/xwalk/core/ReflectField;
            localReflectField.<init>((Class)localObject, "XWALK_APK_VERSION");
            j = ((Integer)localReflectField.get()).intValue();
            AppMethodBeat.o(85563);
          }
          catch (RuntimeException localRuntimeException)
          {
            while (true)
              j = 0;
          }
        }
      }
      catch (ClassNotFoundException localClassNotFoundException)
      {
        AppMethodBeat.o(85563);
        j = i;
      }
    }
  }

  public Class<?> getBridgeClass(String paramString)
  {
    AppMethodBeat.i(85589);
    try
    {
      paramString = this.mBridgeLoader.loadClass("org.xwalk.core.internal.".concat(String.valueOf(paramString)));
      AppMethodBeat.o(85589);
      return paramString;
    }
    catch (ClassNotFoundException paramString)
    {
      while (true)
      {
        paramString = null;
        AppMethodBeat.o(85589);
      }
    }
  }

  public DexClassLoader getBridgeLoader()
  {
    AppMethodBeat.i(85562);
    Object localObject;
    if (this.sBridgeLoader != null)
    {
      localObject = this.sBridgeLoader;
      AppMethodBeat.o(85562);
    }
    while (true)
    {
      return localObject;
      localObject = XWalkEnvironment.getExtractedCoreDir(this.mApkVersion);
      String str = XWalkEnvironment.getClassDexFilePath(this.mApkVersion);
      if (!new File(str).exists())
      {
        localObject = null;
        AppMethodBeat.o(85562);
      }
      else
      {
        this.sBridgeLoader = new DexClassLoader(str, XWalkEnvironment.getOptimizedDexDir(this.mApkVersion), (String)localObject, ClassLoader.getSystemClassLoader());
        localObject = this.sBridgeLoader;
        AppMethodBeat.o(85562);
      }
    }
  }

  public Object getBridgeObject(Object paramObject)
  {
    AppMethodBeat.i(85587);
    try
    {
      ReflectMethod localReflectMethod = new org/xwalk/core/ReflectMethod;
      localReflectMethod.<init>(paramObject, "getBridge", new Class[0]);
      paramObject = localReflectMethod.invoke(new Object[0]);
      AppMethodBeat.o(85587);
      return paramObject;
    }
    catch (RuntimeException paramObject)
    {
      while (true)
      {
        paramObject = null;
        AppMethodBeat.o(85587);
      }
    }
  }

  public Class<?> getClass(String paramString)
  {
    AppMethodBeat.i(85590);
    try
    {
      paramString = this.mBridgeLoader.loadClass(paramString);
      AppMethodBeat.o(85590);
      return paramString;
    }
    catch (ClassNotFoundException paramString)
    {
      while (true)
      {
        paramString = null;
        AppMethodBeat.o(85590);
      }
    }
  }

  public Object getWrapperObject(Object paramObject)
  {
    AppMethodBeat.i(85588);
    try
    {
      ReflectMethod localReflectMethod = new org/xwalk/core/ReflectMethod;
      localReflectMethod.<init>(paramObject, "getWrapper", new Class[0]);
      paramObject = localReflectMethod.invoke(new Object[0]);
      AppMethodBeat.o(85588);
      return paramObject;
    }
    catch (RuntimeException paramObject)
    {
      while (true)
      {
        paramObject = null;
        AppMethodBeat.o(85588);
      }
    }
  }

  public boolean hasFeature(int paramInt)
  {
    AppMethodBeat.i(85579);
    Object localObject = invokeRuntimeChannel(80003, new Object[] { Integer.valueOf(paramInt) });
    boolean bool;
    if ((localObject instanceof Boolean))
    {
      bool = ((Boolean)localObject).booleanValue();
      AppMethodBeat.o(85579);
    }
    while (true)
    {
      return bool;
      AppMethodBeat.o(85579);
      bool = false;
    }
  }

  public boolean initNotifyChannnel()
  {
    boolean bool = false;
    AppMethodBeat.i(85574);
    if (XWalkEnvironment.getAvailableVersion() < 153)
    {
      Log.d("XWalkLib", "XWalk runtime version not matched 153");
      AppMethodBeat.o(85574);
    }
    while (true)
    {
      return bool;
      Object localObject1 = new XWalkCoreWrapper.2(this);
      try
      {
        Class localClass = getBridgeClass("XWalkViewDelegate");
        Object localObject2 = ((XWalkNotifyChannelListener)localObject1).getBridge();
        localObject1 = new org/xwalk/core/ReflectMethod;
        ((ReflectMethod)localObject1).<init>(localClass, "setNotifyCallBackChannel", new Class[] { Object.class });
        ((ReflectMethod)localObject1).invoke(new Object[] { localObject2 });
        AppMethodBeat.o(85574);
        bool = true;
      }
      catch (RuntimeException localRuntimeException)
      {
        Log.d("XWalkLib", localRuntimeException.getLocalizedMessage());
        AppMethodBeat.o(85574);
      }
    }
  }

  public boolean isDownLoadCoreAvailable()
  {
    boolean bool = false;
    AppMethodBeat.i(85564);
    Object localObject = getBridgeLoader();
    if (localObject == null)
      AppMethodBeat.o(85564);
    while (true)
    {
      return bool;
      try
      {
        localObject = ((DexClassLoader)localObject).loadClass("org.xwalk.core.internal.XWalkCoreVersion");
        if (localObject == null)
        {
          AppMethodBeat.o(85564);
        }
        else
        {
          bool = true;
          AppMethodBeat.o(85564);
        }
      }
      catch (ClassNotFoundException localClassNotFoundException)
      {
        AppMethodBeat.o(85564);
      }
    }
  }

  public boolean isSharedMode()
  {
    if (this.mBridgeContext != null);
    for (boolean bool = true; ; bool = false)
      return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     org.xwalk.core.XWalkCoreWrapper
 * JD-Core Version:    0.6.2
 */