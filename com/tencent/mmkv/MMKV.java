package com.tencent.mmkv;

import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.Process;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.File;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MMKV
  implements SharedPreferences, SharedPreferences.Editor
{
  private static final int ASHMEM_MODE = 8;
  private static final int CONTEXT_MODE_MULTI_PROCESS = 4;
  public static final int MULTI_PROCESS_MODE = 2;
  public static final int SINGLE_PROCESS_MODE = 1;
  private static a gCallbackHandler;
  private static boolean gWantLogReDirecting;
  private static b[] index2LogLevel;
  private static EnumMap<b, Integer> logLevel2Index;
  private static final HashMap<String, Parcelable.Creator<?>> mCreators;
  private static EnumMap<c, Integer> recoverIndex;
  private static String rootDir;
  private long nativeHandle;

  static
  {
    AppMethodBeat.i(124036);
    EnumMap localEnumMap = new EnumMap(c.class);
    recoverIndex = localEnumMap;
    localEnumMap.put(c.AiN, Integer.valueOf(0));
    recoverIndex.put(c.AiO, Integer.valueOf(1));
    localEnumMap = new EnumMap(b.class);
    logLevel2Index = localEnumMap;
    localEnumMap.put(b.AiH, Integer.valueOf(0));
    logLevel2Index.put(b.AiI, Integer.valueOf(1));
    logLevel2Index.put(b.AiJ, Integer.valueOf(2));
    logLevel2Index.put(b.AiK, Integer.valueOf(3));
    logLevel2Index.put(b.AiL, Integer.valueOf(4));
    index2LogLevel = new b[] { b.AiH, b.AiI, b.AiJ, b.AiK, b.AiL };
    rootDir = null;
    mCreators = new HashMap();
    gWantLogReDirecting = false;
    AppMethodBeat.o(124036);
  }

  private MMKV(long paramLong)
  {
    this.nativeHandle = paramLong;
  }

  private native boolean containsKey(long paramLong, String paramString);

  private native long count(long paramLong);

  private static native long createNB(int paramInt);

  public static d createNativeBuffer(int paramInt)
  {
    AppMethodBeat.i(124027);
    long l = createNB(paramInt);
    d locald;
    if (l <= 0L)
    {
      locald = null;
      AppMethodBeat.o(124027);
    }
    while (true)
    {
      return locald;
      locald = new d(l, paramInt);
      AppMethodBeat.o(124027);
    }
  }

  private native boolean decodeBool(long paramLong, String paramString, boolean paramBoolean);

  private native byte[] decodeBytes(long paramLong, String paramString);

  private native double decodeDouble(long paramLong, String paramString, double paramDouble);

  private native float decodeFloat(long paramLong, String paramString, float paramFloat);

  private native int decodeInt(long paramLong, String paramString, int paramInt);

  private native long decodeLong(long paramLong1, String paramString, long paramLong2);

  private native String decodeString(long paramLong, String paramString1, String paramString2);

  private native String[] decodeStringSet(long paramLong, String paramString);

  public static MMKV defaultMMKV()
  {
    AppMethodBeat.i(123972);
    if (rootDir == null)
    {
      localObject = new IllegalStateException("You should Call MMKV.initialize() first.");
      AppMethodBeat.o(123972);
      throw ((Throwable)localObject);
    }
    Object localObject = new MMKV(getDefaultMMKV(1, null));
    AppMethodBeat.o(123972);
    return localObject;
  }

  public static MMKV defaultMMKV(int paramInt, String paramString)
  {
    AppMethodBeat.i(123973);
    if (rootDir == null)
    {
      paramString = new IllegalStateException("You should Call MMKV.initialize() first.");
      AppMethodBeat.o(123973);
      throw paramString;
    }
    paramString = new MMKV(getDefaultMMKV(paramInt, paramString));
    AppMethodBeat.o(123973);
    return paramString;
  }

  private static native void destroyNB(long paramLong, int paramInt);

  public static void destroyNativeBuffer(d paramd)
  {
    AppMethodBeat.i(124028);
    destroyNB(paramd.AiQ, paramd.size);
    AppMethodBeat.o(124028);
  }

  private native boolean encodeBool(long paramLong, String paramString, boolean paramBoolean);

  private native boolean encodeBytes(long paramLong, String paramString, byte[] paramArrayOfByte);

  private native boolean encodeDouble(long paramLong, String paramString, double paramDouble);

  private native boolean encodeFloat(long paramLong, String paramString, float paramFloat);

  private native boolean encodeInt(long paramLong, String paramString, int paramInt);

  private native boolean encodeLong(long paramLong1, String paramString, long paramLong2);

  private native boolean encodeSet(long paramLong, String paramString, String[] paramArrayOfString);

  private native boolean encodeString(long paramLong, String paramString1, String paramString2);

  private static native long getDefaultMMKV(int paramInt, String paramString);

  private static native long getMMKVWithAshmemFD(String paramString1, int paramInt1, int paramInt2, String paramString2);

  private static native long getMMKVWithID(String paramString1, int paramInt, String paramString2, String paramString3);

  private static native long getMMKVWithIDAndSize(String paramString1, int paramInt1, int paramInt2, String paramString2);

  public static String getRootDir()
  {
    return rootDir;
  }

  public static String initialize(Context paramContext)
  {
    AppMethodBeat.i(123962);
    paramContext = initialize(paramContext.getFilesDir().getAbsolutePath() + "/mmkv", null);
    AppMethodBeat.o(123962);
    return paramContext;
  }

  public static String initialize(String paramString)
  {
    AppMethodBeat.i(123963);
    paramString = initialize(paramString, null);
    AppMethodBeat.o(123963);
    return paramString;
  }

  public static String initialize(String paramString, a parama)
  {
    AppMethodBeat.i(123964);
    if (parama != null)
      "StaticCpp".equals("SharedCpp");
    while (true)
    {
      rootDir = paramString;
      jniInitialize(paramString);
      AppMethodBeat.o(123964);
      return paramString;
      if ("StaticCpp".equals("SharedCpp"))
        System.loadLibrary("c++_shared");
      System.loadLibrary("mmkv");
    }
  }

  public static native boolean isFileValid(String paramString);

  private static native void jniInitialize(String paramString);

  private static void mmkvLogImp(int paramInt1, String paramString1, int paramInt2, String paramString2, String paramString3)
  {
    AppMethodBeat.i(124034);
    if ((gCallbackHandler != null) && (gWantLogReDirecting))
    {
      gCallbackHandler.h(paramString1, paramInt2, paramString2, paramString3);
      AppMethodBeat.o(124034);
    }
    while (true)
    {
      return;
      paramString1 = 1.AiF;
      index2LogLevel[paramInt1].ordinal();
      AppMethodBeat.o(124034);
    }
  }

  public static MMKV mmkvWithAshmemFD(String paramString1, int paramInt1, int paramInt2, String paramString2)
  {
    AppMethodBeat.i(124026);
    paramString1 = new MMKV(getMMKVWithAshmemFD(paramString1, paramInt1, paramInt2, paramString2));
    AppMethodBeat.o(124026);
    return paramString1;
  }

  public static MMKV mmkvWithAshmemID(Context paramContext, String paramString1, int paramInt1, int paramInt2, String paramString2)
  {
    AppMethodBeat.i(123971);
    if (rootDir == null)
    {
      paramContext = new IllegalStateException("You should Call MMKV.initialize() first.");
      AppMethodBeat.o(123971);
      throw paramContext;
    }
    Object localObject = MMKVContentProvider.aB(paramContext, Process.myPid());
    if ((localObject == null) || (((String)localObject).length() == 0))
    {
      simpleLog(b.AiK, "process name detect fail, try again later");
      AppMethodBeat.o(123971);
      paramContext = null;
    }
    while (true)
    {
      return paramContext;
      if (((String)localObject).contains(":"))
      {
        Uri localUri = MMKVContentProvider.ix(paramContext);
        if (localUri == null)
        {
          simpleLog(b.AiK, "MMKVContentProvider has invalid authority");
          AppMethodBeat.o(123971);
          paramContext = null;
        }
        else
        {
          simpleLog(b.AiI, "getting parcelable mmkv in process, Uri = ".concat(String.valueOf(localUri)));
          localObject = new Bundle();
          ((Bundle)localObject).putInt("KEY_SIZE", paramInt1);
          ((Bundle)localObject).putInt("KEY_MODE", paramInt2);
          if (paramString2 != null)
            ((Bundle)localObject).putString("KEY_CRYPT", paramString2);
          paramContext = paramContext.getContentResolver().call(localUri, "mmkvFromAshmemID", paramString1, (Bundle)localObject);
          if (paramContext != null)
          {
            paramContext.setClassLoader(ParcelableMMKV.class.getClassLoader());
            paramContext = (ParcelableMMKV)paramContext.getParcelable("KEY");
            if (paramContext != null)
            {
              if ((paramContext.AiS >= 0) && (paramContext.AiT >= 0));
              for (paramContext = mmkvWithAshmemFD(paramContext.AiR, paramContext.AiS, paramContext.AiT, paramContext.AiU); ; paramContext = null)
              {
                if (paramContext != null)
                  simpleLog(b.AiI, paramContext.mmapID() + " fd = " + paramContext.ashmemFD() + ", meta fd = " + paramContext.ashmemMetaFD());
                AppMethodBeat.o(123971);
                break;
              }
            }
          }
        }
      }
      else
      {
        simpleLog(b.AiI, "getting mmkv in main process");
        paramContext = new MMKV(getMMKVWithIDAndSize(paramString1, paramInt1, paramInt2 | 0x8, paramString2));
        AppMethodBeat.o(123971);
        continue;
        AppMethodBeat.o(123971);
        paramContext = null;
      }
    }
  }

  public static MMKV mmkvWithID(String paramString)
  {
    AppMethodBeat.i(123966);
    if (rootDir == null)
    {
      paramString = new IllegalStateException("You should Call MMKV.initialize() first.");
      AppMethodBeat.o(123966);
      throw paramString;
    }
    paramString = new MMKV(getMMKVWithID(paramString, 1, null, null));
    AppMethodBeat.o(123966);
    return paramString;
  }

  public static MMKV mmkvWithID(String paramString, int paramInt)
  {
    AppMethodBeat.i(123967);
    if (rootDir == null)
    {
      paramString = new IllegalStateException("You should Call MMKV.initialize() first.");
      AppMethodBeat.o(123967);
      throw paramString;
    }
    paramString = new MMKV(getMMKVWithID(paramString, paramInt, null, null));
    AppMethodBeat.o(123967);
    return paramString;
  }

  public static MMKV mmkvWithID(String paramString1, int paramInt, String paramString2)
  {
    AppMethodBeat.i(123968);
    if (rootDir == null)
    {
      paramString1 = new IllegalStateException("You should Call MMKV.initialize() first.");
      AppMethodBeat.o(123968);
      throw paramString1;
    }
    paramString1 = new MMKV(getMMKVWithID(paramString1, paramInt, paramString2, null));
    AppMethodBeat.o(123968);
    return paramString1;
  }

  public static MMKV mmkvWithID(String paramString1, int paramInt, String paramString2, String paramString3)
  {
    AppMethodBeat.i(123970);
    if (rootDir == null)
    {
      paramString1 = new IllegalStateException("You should Call MMKV.initialize() first.");
      AppMethodBeat.o(123970);
      throw paramString1;
    }
    long l = getMMKVWithID(paramString1, paramInt, paramString2, paramString3);
    if (l == 0L)
    {
      paramString1 = null;
      AppMethodBeat.o(123970);
    }
    while (true)
    {
      return paramString1;
      paramString1 = new MMKV(l);
      AppMethodBeat.o(123970);
    }
  }

  public static MMKV mmkvWithID(String paramString1, String paramString2)
  {
    Object localObject = null;
    AppMethodBeat.i(123969);
    if (rootDir == null)
    {
      paramString1 = new IllegalStateException("You should Call MMKV.initialize() first.");
      AppMethodBeat.o(123969);
      throw paramString1;
    }
    long l = getMMKVWithID(paramString1, 1, null, paramString2);
    if (l == 0L)
    {
      AppMethodBeat.o(123969);
      paramString1 = localObject;
    }
    while (true)
    {
      return paramString1;
      paramString1 = new MMKV(l);
      AppMethodBeat.o(123969);
    }
  }

  public static native void onExit();

  private static int onMMKVCRCCheckFail(String paramString)
  {
    AppMethodBeat.i(124032);
    c localc = c.AiN;
    if (gCallbackHandler != null)
      localc = gCallbackHandler.amJ(paramString);
    simpleLog(b.AiI, "Recover strategic for " + paramString + " is " + localc);
    int i = ((Integer)recoverIndex.get(localc)).intValue();
    AppMethodBeat.o(124032);
    return i;
  }

  private static int onMMKVFileLengthError(String paramString)
  {
    AppMethodBeat.i(124033);
    c localc = c.AiN;
    if (gCallbackHandler != null)
      localc = gCallbackHandler.amK(paramString);
    simpleLog(b.AiI, "Recover strategic for " + paramString + " is " + localc);
    int i = ((Integer)recoverIndex.get(localc)).intValue();
    AppMethodBeat.o(124033);
    return i;
  }

  public static native int pageSize();

  public static void registerHandler(a parama)
  {
    AppMethodBeat.i(124030);
    gCallbackHandler = parama;
    setLogReDirecting(true);
    gWantLogReDirecting = true;
    AppMethodBeat.o(124030);
  }

  private native void removeValueForKey(long paramLong, String paramString);

  private static native void setLogLevel(int paramInt);

  public static void setLogLevel(b paramb)
  {
    int i = 1;
    AppMethodBeat.i(123965);
    int j = i;
    switch (1.AiF[paramb.ordinal()])
    {
    default:
      j = i;
    case 2:
    case 1:
    case 3:
    case 4:
    case 5:
    }
    while (true)
    {
      setLogLevel(j);
      AppMethodBeat.o(123965);
      return;
      j = 0;
      continue;
      j = 2;
      continue;
      j = 3;
      continue;
      j = 4;
    }
  }

  private static native void setLogReDirecting(boolean paramBoolean);

  private static void simpleLog(b paramb, String paramString)
  {
    AppMethodBeat.i(124035);
    Object localObject = Thread.currentThread().getStackTrace();
    localObject = localObject[(localObject.length - 1)];
    mmkvLogImp(((Integer)logLevel2Index.get(paramb)).intValue(), ((StackTraceElement)localObject).getFileName(), ((StackTraceElement)localObject).getLineNumber(), ((StackTraceElement)localObject).getMethodName(), paramString);
    AppMethodBeat.o(124035);
  }

  private native long totalSize(long paramLong);

  public static void unregisterHandler()
  {
    AppMethodBeat.i(124031);
    gCallbackHandler = null;
    setLogReDirecting(false);
    gWantLogReDirecting = false;
    AppMethodBeat.o(124031);
  }

  private native int valueSize(long paramLong, String paramString, boolean paramBoolean);

  private native int writeValueToNB(long paramLong1, String paramString, long paramLong2, int paramInt);

  public native String[] allKeys();

  public void apply()
  {
  }

  public native int ashmemFD();

  public native int ashmemMetaFD();

  public native void checkReSetCryptKey(String paramString);

  public SharedPreferences.Editor clear()
  {
    AppMethodBeat.i(124021);
    clearAll();
    AppMethodBeat.o(124021);
    return this;
  }

  public native void clearAll();

  public native void clearMemoryCache();

  public native void close();

  public boolean commit()
  {
    AppMethodBeat.i(124022);
    sync();
    AppMethodBeat.o(124022);
    return true;
  }

  public boolean contains(String paramString)
  {
    AppMethodBeat.i(124023);
    boolean bool = containsKey(paramString);
    AppMethodBeat.o(124023);
    return bool;
  }

  public boolean containsKey(String paramString)
  {
    AppMethodBeat.i(124002);
    boolean bool = containsKey(this.nativeHandle, paramString);
    AppMethodBeat.o(124002);
    return bool;
  }

  public long count()
  {
    AppMethodBeat.i(124003);
    long l = count(this.nativeHandle);
    AppMethodBeat.o(124003);
    return l;
  }

  public native String cryptKey();

  public boolean decodeBool(String paramString)
  {
    AppMethodBeat.i(123975);
    boolean bool = decodeBool(this.nativeHandle, paramString, false);
    AppMethodBeat.o(123975);
    return bool;
  }

  public boolean decodeBool(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(123976);
    paramBoolean = decodeBool(this.nativeHandle, paramString, paramBoolean);
    AppMethodBeat.o(123976);
    return paramBoolean;
  }

  public byte[] decodeBytes(String paramString)
  {
    AppMethodBeat.i(123996);
    paramString = decodeBytes(this.nativeHandle, paramString);
    AppMethodBeat.o(123996);
    return paramString;
  }

  public double decodeDouble(String paramString)
  {
    AppMethodBeat.i(123987);
    double d = decodeDouble(this.nativeHandle, paramString, 0.0D);
    AppMethodBeat.o(123987);
    return d;
  }

  public double decodeDouble(String paramString, double paramDouble)
  {
    AppMethodBeat.i(123988);
    paramDouble = decodeDouble(this.nativeHandle, paramString, paramDouble);
    AppMethodBeat.o(123988);
    return paramDouble;
  }

  public float decodeFloat(String paramString)
  {
    AppMethodBeat.i(123984);
    float f = decodeFloat(this.nativeHandle, paramString, 0.0F);
    AppMethodBeat.o(123984);
    return f;
  }

  public float decodeFloat(String paramString, float paramFloat)
  {
    AppMethodBeat.i(123985);
    paramFloat = decodeFloat(this.nativeHandle, paramString, paramFloat);
    AppMethodBeat.o(123985);
    return paramFloat;
  }

  public int decodeInt(String paramString)
  {
    AppMethodBeat.i(123978);
    int i = decodeInt(this.nativeHandle, paramString, 0);
    AppMethodBeat.o(123978);
    return i;
  }

  public int decodeInt(String paramString, int paramInt)
  {
    AppMethodBeat.i(123979);
    paramInt = decodeInt(this.nativeHandle, paramString, paramInt);
    AppMethodBeat.o(123979);
    return paramInt;
  }

  public long decodeLong(String paramString)
  {
    AppMethodBeat.i(123981);
    long l = decodeLong(this.nativeHandle, paramString, 0L);
    AppMethodBeat.o(123981);
    return l;
  }

  public long decodeLong(String paramString, long paramLong)
  {
    AppMethodBeat.i(123982);
    paramLong = decodeLong(this.nativeHandle, paramString, paramLong);
    AppMethodBeat.o(123982);
    return paramLong;
  }

  public <T extends Parcelable> T decodeParcelable(String paramString, Class<T> paramClass)
  {
    AppMethodBeat.i(123998);
    paramString = decodeParcelable(paramString, paramClass, null);
    AppMethodBeat.o(123998);
    return paramString;
  }

  public <T extends Parcelable> T decodeParcelable(String paramString, Class<T> paramClass, T paramT)
  {
    AppMethodBeat.i(123999);
    if (paramClass == null)
    {
      AppMethodBeat.o(123999);
      paramString = paramT;
    }
    while (true)
    {
      return paramString;
      paramString = decodeBytes(this.nativeHandle, paramString);
      if (paramString == null)
      {
        AppMethodBeat.o(123999);
        paramString = paramT;
        continue;
      }
      Parcel localParcel = Parcel.obtain();
      localParcel.unmarshall(paramString, 0, paramString.length);
      localParcel.setDataPosition(0);
      try
      {
        str = paramClass.toString();
        synchronized (mCreators)
        {
          Parcelable.Creator localCreator = (Parcelable.Creator)mCreators.get(str);
          paramString = localCreator;
          if (localCreator == null)
          {
            paramClass = (Parcelable.Creator)paramClass.getField("CREATOR").get(null);
            paramString = paramClass;
            if (paramClass != null)
            {
              mCreators.put(str, paramClass);
              paramString = paramClass;
            }
          }
          if (paramString != null)
            paramString = (Parcelable)paramString.createFromParcel(localParcel);
        }
      }
      catch (Exception paramString)
      {
        String str;
        simpleLog(b.AiK, paramString.toString());
        localParcel.recycle();
        AppMethodBeat.o(123999);
        paramString = paramT;
        continue;
        paramString = new java/lang/Exception;
        paramString.<init>("Parcelable protocol requires a non-null static Parcelable.Creator object called CREATOR on class ".concat(String.valueOf(str)));
        AppMethodBeat.o(123999);
        throw paramString;
      }
      finally
      {
        localParcel.recycle();
        AppMethodBeat.o(123999);
      }
    }
  }

  public String decodeString(String paramString)
  {
    AppMethodBeat.i(123990);
    paramString = decodeString(this.nativeHandle, paramString, null);
    AppMethodBeat.o(123990);
    return paramString;
  }

  public String decodeString(String paramString1, String paramString2)
  {
    AppMethodBeat.i(123991);
    paramString1 = decodeString(this.nativeHandle, paramString1, paramString2);
    AppMethodBeat.o(123991);
    return paramString1;
  }

  public Set<String> decodeStringSet(String paramString)
  {
    AppMethodBeat.i(123993);
    paramString = decodeStringSet(paramString, null);
    AppMethodBeat.o(123993);
    return paramString;
  }

  public Set<String> decodeStringSet(String paramString, Set<String> paramSet)
  {
    AppMethodBeat.i(123994);
    paramString = decodeStringSet(this.nativeHandle, paramString);
    if (paramString == null)
      AppMethodBeat.o(123994);
    while (true)
    {
      return paramSet;
      paramSet = new HashSet(Arrays.asList(paramString));
      AppMethodBeat.o(123994);
    }
  }

  public SharedPreferences.Editor edit()
  {
    return this;
  }

  public boolean encode(String paramString, double paramDouble)
  {
    AppMethodBeat.i(123986);
    boolean bool = encodeDouble(this.nativeHandle, paramString, paramDouble);
    AppMethodBeat.o(123986);
    return bool;
  }

  public boolean encode(String paramString, float paramFloat)
  {
    AppMethodBeat.i(123983);
    boolean bool = encodeFloat(this.nativeHandle, paramString, paramFloat);
    AppMethodBeat.o(123983);
    return bool;
  }

  public boolean encode(String paramString, int paramInt)
  {
    AppMethodBeat.i(123977);
    boolean bool = encodeInt(this.nativeHandle, paramString, paramInt);
    AppMethodBeat.o(123977);
    return bool;
  }

  public boolean encode(String paramString, long paramLong)
  {
    AppMethodBeat.i(123980);
    boolean bool = encodeLong(this.nativeHandle, paramString, paramLong);
    AppMethodBeat.o(123980);
    return bool;
  }

  public boolean encode(String paramString, Parcelable paramParcelable)
  {
    AppMethodBeat.i(123997);
    Parcel localParcel = Parcel.obtain();
    paramParcelable.writeToParcel(localParcel, paramParcelable.describeContents());
    paramParcelable = localParcel.marshall();
    localParcel.recycle();
    boolean bool = encodeBytes(this.nativeHandle, paramString, paramParcelable);
    AppMethodBeat.o(123997);
    return bool;
  }

  public boolean encode(String paramString1, String paramString2)
  {
    AppMethodBeat.i(123989);
    boolean bool = encodeString(this.nativeHandle, paramString1, paramString2);
    AppMethodBeat.o(123989);
    return bool;
  }

  public boolean encode(String paramString, Set<String> paramSet)
  {
    AppMethodBeat.i(123992);
    boolean bool = encodeSet(this.nativeHandle, paramString, (String[])paramSet.toArray(new String[paramSet.size()]));
    AppMethodBeat.o(123992);
    return bool;
  }

  public boolean encode(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(123974);
    paramBoolean = encodeBool(this.nativeHandle, paramString, paramBoolean);
    AppMethodBeat.o(123974);
    return paramBoolean;
  }

  public boolean encode(String paramString, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(123995);
    boolean bool = encodeBytes(this.nativeHandle, paramString, paramArrayOfByte);
    AppMethodBeat.o(123995);
    return bool;
  }

  public Map<String, ?> getAll()
  {
    AppMethodBeat.i(124007);
    UnsupportedOperationException localUnsupportedOperationException = new UnsupportedOperationException("use allKeys() instead, getAll() not implement because type-erasure inside mmkv");
    AppMethodBeat.o(124007);
    throw localUnsupportedOperationException;
  }

  public boolean getBoolean(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(124018);
    paramBoolean = decodeBool(this.nativeHandle, paramString, paramBoolean);
    AppMethodBeat.o(124018);
    return paramBoolean;
  }

  public float getFloat(String paramString, float paramFloat)
  {
    AppMethodBeat.i(124016);
    paramFloat = decodeFloat(this.nativeHandle, paramString, paramFloat);
    AppMethodBeat.o(124016);
    return paramFloat;
  }

  public int getInt(String paramString, int paramInt)
  {
    AppMethodBeat.i(124012);
    paramInt = decodeInt(this.nativeHandle, paramString, paramInt);
    AppMethodBeat.o(124012);
    return paramInt;
  }

  public long getLong(String paramString, long paramLong)
  {
    AppMethodBeat.i(124014);
    paramLong = decodeLong(this.nativeHandle, paramString, paramLong);
    AppMethodBeat.o(124014);
    return paramLong;
  }

  public String getString(String paramString1, String paramString2)
  {
    AppMethodBeat.i(124008);
    paramString1 = decodeString(this.nativeHandle, paramString1, paramString2);
    AppMethodBeat.o(124008);
    return paramString1;
  }

  public Set<String> getStringSet(String paramString, Set<String> paramSet)
  {
    AppMethodBeat.i(124010);
    paramString = decodeStringSet(paramString, paramSet);
    AppMethodBeat.o(124010);
    return paramString;
  }

  public int getValueActualSize(String paramString)
  {
    AppMethodBeat.i(124001);
    int i = valueSize(this.nativeHandle, paramString, true);
    AppMethodBeat.o(124001);
    return i;
  }

  public int getValueSize(String paramString)
  {
    AppMethodBeat.i(124000);
    int i = valueSize(this.nativeHandle, paramString, false);
    AppMethodBeat.o(124000);
    return i;
  }

  public int importFromSharedPreferences(SharedPreferences paramSharedPreferences)
  {
    AppMethodBeat.i(124006);
    Map localMap = paramSharedPreferences.getAll();
    int i;
    if ((localMap == null) || (localMap.size() <= 0))
    {
      i = 0;
      AppMethodBeat.o(124006);
    }
    while (true)
    {
      return i;
      paramSharedPreferences = localMap.entrySet().iterator();
      while (paramSharedPreferences.hasNext())
      {
        Object localObject = (Map.Entry)paramSharedPreferences.next();
        String str = (String)((Map.Entry)localObject).getKey();
        localObject = ((Map.Entry)localObject).getValue();
        if ((str != null) && (localObject != null))
          if ((localObject instanceof Boolean))
            encodeBool(this.nativeHandle, str, ((Boolean)localObject).booleanValue());
          else if ((localObject instanceof Integer))
            encodeInt(this.nativeHandle, str, ((Integer)localObject).intValue());
          else if ((localObject instanceof Long))
            encodeLong(this.nativeHandle, str, ((Long)localObject).longValue());
          else if ((localObject instanceof Float))
            encodeFloat(this.nativeHandle, str, ((Float)localObject).floatValue());
          else if ((localObject instanceof Double))
            encodeDouble(this.nativeHandle, str, ((Double)localObject).doubleValue());
          else if ((localObject instanceof String))
            encodeString(this.nativeHandle, str, (String)localObject);
          else if ((localObject instanceof Set))
            encode(str, (Set)localObject);
          else
            simpleLog(b.AiK, "unknown type: " + localObject.getClass());
      }
      i = localMap.size();
      AppMethodBeat.o(124006);
    }
  }

  public native void lock();

  public native String mmapID();

  public SharedPreferences.Editor putBoolean(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(124019);
    encodeBool(this.nativeHandle, paramString, paramBoolean);
    AppMethodBeat.o(124019);
    return this;
  }

  public SharedPreferences.Editor putFloat(String paramString, float paramFloat)
  {
    AppMethodBeat.i(124017);
    encodeFloat(this.nativeHandle, paramString, paramFloat);
    AppMethodBeat.o(124017);
    return this;
  }

  public SharedPreferences.Editor putInt(String paramString, int paramInt)
  {
    AppMethodBeat.i(124013);
    encodeInt(this.nativeHandle, paramString, paramInt);
    AppMethodBeat.o(124013);
    return this;
  }

  public SharedPreferences.Editor putLong(String paramString, long paramLong)
  {
    AppMethodBeat.i(124015);
    encodeLong(this.nativeHandle, paramString, paramLong);
    AppMethodBeat.o(124015);
    return this;
  }

  public SharedPreferences.Editor putString(String paramString1, String paramString2)
  {
    AppMethodBeat.i(124009);
    encodeString(this.nativeHandle, paramString1, paramString2);
    AppMethodBeat.o(124009);
    return this;
  }

  public SharedPreferences.Editor putStringSet(String paramString, Set<String> paramSet)
  {
    AppMethodBeat.i(124011);
    encode(paramString, paramSet);
    AppMethodBeat.o(124011);
    return this;
  }

  public native boolean reKey(String paramString);

  public void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener paramOnSharedPreferenceChangeListener)
  {
    AppMethodBeat.i(124024);
    paramOnSharedPreferenceChangeListener = new UnsupportedOperationException("Not implement in MMKV");
    AppMethodBeat.o(124024);
    throw paramOnSharedPreferenceChangeListener;
  }

  public SharedPreferences.Editor remove(String paramString)
  {
    AppMethodBeat.i(124020);
    removeValueForKey(paramString);
    AppMethodBeat.o(124020);
    return this;
  }

  public void removeValueForKey(String paramString)
  {
    AppMethodBeat.i(124005);
    removeValueForKey(this.nativeHandle, paramString);
    AppMethodBeat.o(124005);
  }

  public native void removeValuesForKeys(String[] paramArrayOfString);

  public native void sync();

  public long totalSize()
  {
    AppMethodBeat.i(124004);
    long l = totalSize(this.nativeHandle);
    AppMethodBeat.o(124004);
    return l;
  }

  public native void trim();

  public native boolean tryLock();

  public native void unlock();

  public void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener paramOnSharedPreferenceChangeListener)
  {
    AppMethodBeat.i(124025);
    paramOnSharedPreferenceChangeListener = new UnsupportedOperationException("Not implement in MMKV");
    AppMethodBeat.o(124025);
    throw paramOnSharedPreferenceChangeListener;
  }

  public int writeValueToNativeBuffer(String paramString, d paramd)
  {
    AppMethodBeat.i(124029);
    int i = writeValueToNB(this.nativeHandle, paramString, paramd.AiQ, paramd.size);
    AppMethodBeat.o(124029);
    return i;
  }

  public static abstract interface a
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mmkv.MMKV
 * JD-Core Version:    0.6.2
 */