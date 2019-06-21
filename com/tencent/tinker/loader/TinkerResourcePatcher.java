package com.tencent.tinker.loader;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.os.Build.VERSION;
import com.tencent.tinker.loader.shareutil.SharePatchFileUtil;
import com.tencent.tinker.loader.shareutil.ShareReflectUtil;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

class TinkerResourcePatcher
{
  private static Collection<WeakReference<Resources>> ACJ = null;
  private static Object ACK = null;
  private static AssetManager ACL = null;
  private static Method ACM = null;
  private static Method ACN = null;
  private static Field ACO = null;
  private static Field ACP = null;
  private static Field ACQ = null;
  private static Field ACR = null;
  private static Field ACS = null;
  private static Field ACT = null;
  private static Field ACU = null;

  public static void cg(Context paramContext, String paramString)
  {
    if (paramString == null);
    while (true)
    {
      return;
      Object localObject1 = paramContext.getApplicationInfo();
      int i;
      if (Build.VERSION.SDK_INT < 27)
      {
        localObject2 = new Field[] { ACR, ACS };
        i = localObject2.length;
      }
      for (int j = 0; ; j++)
      {
        if (j >= i)
          break label169;
        Iterator localIterator = ((Map)localObject2[j].get(ACK)).entrySet().iterator();
        while (true)
          if (localIterator.hasNext())
          {
            Object localObject3 = ((WeakReference)((Map.Entry)localIterator.next()).getValue()).get();
            if (localObject3 != null)
            {
              String str = (String)ACQ.get(localObject3);
              if (((ApplicationInfo)localObject1).sourceDir.equals(str))
              {
                ACQ.set(localObject3, paramString);
                continue;
                localObject2 = new Field[] { ACR };
                break;
              }
            }
          }
      }
      label169: if (((Integer)ACM.invoke(ACL, new Object[] { paramString })).intValue() == 0)
        throw new IllegalStateException("Could not create new AssetManager");
      if ((ACU != null) && (ACN != null))
      {
        ACU.set(ACL, null);
        ACN.invoke(ACL, new Object[0]);
      }
      Object localObject2 = ACJ.iterator();
      while (true)
        if (((Iterator)localObject2).hasNext())
        {
          localObject1 = (Resources)((WeakReference)((Iterator)localObject2).next()).get();
          if (localObject1 == null)
            continue;
          try
          {
            ACO.set(localObject1, ACL);
            h((Resources)localObject1);
            ((Resources)localObject1).updateConfiguration(((Resources)localObject1).getConfiguration(), ((Resources)localObject1).getDisplayMetrics());
          }
          catch (Throwable localThrowable)
          {
            while (true)
            {
              Object localObject4 = ACP.get(localObject1);
              ShareReflectUtil.b(localObject4, "mAssets").set(localObject4, ACL);
            }
          }
        }
      if (Build.VERSION.SDK_INT >= 24);
      try
      {
        if (ACT != null)
          ACT.set(paramContext.getApplicationInfo(), paramString);
        label362: if (je(paramContext))
          continue;
        throw new TinkerRuntimeException("checkResInstall failed");
      }
      catch (Throwable paramString)
      {
        break label362;
      }
    }
  }

  private static void h(Resources paramResources)
  {
    try
    {
      Object localObject = ShareReflectUtil.d(Resources.class, "mTypedArrayPool").get(paramResources);
      Method localMethod = ShareReflectUtil.b(localObject, "acquire", new Class[0]);
      do
        paramResources = localMethod.invoke(localObject, new Object[0]);
      while (paramResources != null);
      return;
    }
    catch (Throwable paramResources)
    {
      while (true)
        new StringBuilder("clearPreloadTypedArrayIssue failed, ignore error: ").append(paramResources);
    }
  }

  // ERROR //
  public static void jd(Context paramContext)
  {
    // Byte code:
    //   0: ldc 208
    //   2: invokestatic 212	java/lang/Class:forName	(Ljava/lang/String;)Ljava/lang/Class;
    //   5: astore_1
    //   6: aload_0
    //   7: aload_1
    //   8: invokestatic 215	com/tencent/tinker/loader/shareutil/ShareReflectUtil:d	(Landroid/content/Context;Ljava/lang/Class;)Ljava/lang/Object;
    //   11: putstatic 28	com/tencent/tinker/loader/TinkerResourcePatcher:ACK	Ljava/lang/Object;
    //   14: ldc 217
    //   16: invokestatic 212	java/lang/Class:forName	(Ljava/lang/String;)Ljava/lang/Class;
    //   19: astore_2
    //   20: aload_2
    //   21: ldc 219
    //   23: invokestatic 184	com/tencent/tinker/loader/shareutil/ShareReflectUtil:d	(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   26: putstatic 40	com/tencent/tinker/loader/TinkerResourcePatcher:ACQ	Ljava/lang/reflect/Field;
    //   29: aload_1
    //   30: ldc 221
    //   32: invokestatic 184	com/tencent/tinker/loader/shareutil/ShareReflectUtil:d	(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   35: putstatic 42	com/tencent/tinker/loader/TinkerResourcePatcher:ACR	Ljava/lang/reflect/Field;
    //   38: getstatic 68	android/os/Build$VERSION:SDK_INT	I
    //   41: bipush 27
    //   43: if_icmpge +12 -> 55
    //   46: aload_1
    //   47: ldc 223
    //   49: invokestatic 184	com/tencent/tinker/loader/shareutil/ShareReflectUtil:d	(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   52: putstatic 44	com/tencent/tinker/loader/TinkerResourcePatcher:ACS	Ljava/lang/reflect/Field;
    //   55: aload_0
    //   56: invokevirtual 227	android/content/Context:getAssets	()Landroid/content/res/AssetManager;
    //   59: astore_2
    //   60: aload_2
    //   61: ldc 229
    //   63: iconst_1
    //   64: anewarray 188	java/lang/Class
    //   67: dup
    //   68: iconst_0
    //   69: ldc 107
    //   71: aastore
    //   72: invokestatic 191	com/tencent/tinker/loader/shareutil/ShareReflectUtil:b	(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   75: putstatic 32	com/tencent/tinker/loader/TinkerResourcePatcher:ACM	Ljava/lang/reflect/Method;
    //   78: aload_2
    //   79: ldc 231
    //   81: invokestatic 169	com/tencent/tinker/loader/shareutil/ShareReflectUtil:b	(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   84: putstatic 48	com/tencent/tinker/loader/TinkerResourcePatcher:ACU	Ljava/lang/reflect/Field;
    //   87: aload_2
    //   88: ldc 233
    //   90: iconst_0
    //   91: anewarray 188	java/lang/Class
    //   94: invokestatic 191	com/tencent/tinker/loader/shareutil/ShareReflectUtil:b	(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   97: putstatic 34	com/tencent/tinker/loader/TinkerResourcePatcher:ACN	Ljava/lang/reflect/Method;
    //   100: aload_2
    //   101: iconst_0
    //   102: anewarray 188	java/lang/Class
    //   105: invokestatic 237	com/tencent/tinker/loader/shareutil/ShareReflectUtil:a	(Ljava/lang/Object;[Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
    //   108: iconst_0
    //   109: anewarray 4	java/lang/Object
    //   112: invokevirtual 243	java/lang/reflect/Constructor:newInstance	([Ljava/lang/Object;)Ljava/lang/Object;
    //   115: checkcast 245	android/content/res/AssetManager
    //   118: putstatic 30	com/tencent/tinker/loader/TinkerResourcePatcher:ACL	Landroid/content/res/AssetManager;
    //   121: getstatic 68	android/os/Build$VERSION:SDK_INT	I
    //   124: bipush 19
    //   126: if_icmplt +96 -> 222
    //   129: ldc 247
    //   131: invokestatic 212	java/lang/Class:forName	(Ljava/lang/String;)Ljava/lang/Class;
    //   134: astore_1
    //   135: aload_1
    //   136: ldc 249
    //   138: iconst_0
    //   139: anewarray 188	java/lang/Class
    //   142: invokestatic 253	com/tencent/tinker/loader/shareutil/ShareReflectUtil:c	(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   145: aconst_null
    //   146: iconst_0
    //   147: anewarray 4	java/lang/Object
    //   150: invokevirtual 127	java/lang/reflect/Method:invoke	(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   153: astore_3
    //   154: aload_1
    //   155: ldc 255
    //   157: invokestatic 184	com/tencent/tinker/loader/shareutil/ShareReflectUtil:d	(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   160: aload_3
    //   161: invokevirtual 74	java/lang/reflect/Field:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   164: checkcast 257	android/util/ArrayMap
    //   167: invokevirtual 261	android/util/ArrayMap:values	()Ljava/util/Collection;
    //   170: putstatic 26	com/tencent/tinker/loader/TinkerResourcePatcher:ACJ	Ljava/util/Collection;
    //   173: getstatic 26	com/tencent/tinker/loader/TinkerResourcePatcher:ACJ	Ljava/util/Collection;
    //   176: ifnonnull +70 -> 246
    //   179: new 135	java/lang/IllegalStateException
    //   182: dup
    //   183: ldc_w 263
    //   186: invokespecial 140	java/lang/IllegalStateException:<init>	(Ljava/lang/String;)V
    //   189: athrow
    //   190: astore_2
    //   191: ldc_w 265
    //   194: invokestatic 212	java/lang/Class:forName	(Ljava/lang/String;)Ljava/lang/Class;
    //   197: astore_2
    //   198: goto -178 -> 20
    //   201: astore_2
    //   202: aload_1
    //   203: ldc_w 267
    //   206: invokestatic 184	com/tencent/tinker/loader/shareutil/ShareReflectUtil:d	(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   209: aload_3
    //   210: invokevirtual 74	java/lang/reflect/Field:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   213: checkcast 142	java/util/Collection
    //   216: putstatic 26	com/tencent/tinker/loader/TinkerResourcePatcher:ACJ	Ljava/util/Collection;
    //   219: goto -46 -> 173
    //   222: aload_1
    //   223: ldc 255
    //   225: invokestatic 184	com/tencent/tinker/loader/shareutil/ShareReflectUtil:d	(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   228: getstatic 28	com/tencent/tinker/loader/TinkerResourcePatcher:ACK	Ljava/lang/Object;
    //   231: invokevirtual 74	java/lang/reflect/Field:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   234: checkcast 269	java/util/HashMap
    //   237: invokevirtual 270	java/util/HashMap:values	()Ljava/util/Collection;
    //   240: putstatic 26	com/tencent/tinker/loader/TinkerResourcePatcher:ACJ	Ljava/util/Collection;
    //   243: goto -70 -> 173
    //   246: aload_0
    //   247: invokevirtual 274	android/content/Context:getResources	()Landroid/content/res/Resources;
    //   250: astore_2
    //   251: getstatic 68	android/os/Build$VERSION:SDK_INT	I
    //   254: bipush 24
    //   256: if_icmplt +38 -> 294
    //   259: aload_2
    //   260: ldc_w 276
    //   263: invokestatic 169	com/tencent/tinker/loader/shareutil/ShareReflectUtil:b	(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   266: putstatic 38	com/tencent/tinker/loader/TinkerResourcePatcher:ACP	Ljava/lang/reflect/Field;
    //   269: ldc 109
    //   271: ldc_w 278
    //   274: invokestatic 184	com/tencent/tinker/loader/shareutil/ShareReflectUtil:d	(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   277: putstatic 46	com/tencent/tinker/loader/TinkerResourcePatcher:ACT	Ljava/lang/reflect/Field;
    //   280: return
    //   281: astore_0
    //   282: aload_2
    //   283: ldc 163
    //   285: invokestatic 169	com/tencent/tinker/loader/shareutil/ShareReflectUtil:b	(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   288: putstatic 36	com/tencent/tinker/loader/TinkerResourcePatcher:ACO	Ljava/lang/reflect/Field;
    //   291: goto -22 -> 269
    //   294: aload_2
    //   295: ldc 163
    //   297: invokestatic 169	com/tencent/tinker/loader/shareutil/ShareReflectUtil:b	(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   300: putstatic 36	com/tencent/tinker/loader/TinkerResourcePatcher:ACO	Ljava/lang/reflect/Field;
    //   303: goto -34 -> 269
    //   306: astore_0
    //   307: goto -27 -> 280
    //   310: astore_3
    //   311: goto -211 -> 100
    //
    // Exception table:
    //   from	to	target	type
    //   14	20	190	java/lang/ClassNotFoundException
    //   154	173	201	java/lang/NoSuchFieldException
    //   259	269	281	java/lang/Throwable
    //   269	280	306	java/lang/NoSuchFieldException
    //   78	100	310	java/lang/Throwable
  }

  private static boolean je(Context paramContext)
  {
    try
    {
      paramContext = paramContext.getAssets().open("only_use_to_test_tinker_resource.txt");
      SharePatchFileUtil.ah(paramContext);
      bool = true;
      return bool;
    }
    catch (Throwable paramContext)
    {
      while (true)
      {
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>("checkResUpdate failed, can't find test resource assets file only_use_to_test_tinker_resource.txt e:");
        localStringBuilder.append(paramContext.getMessage());
        SharePatchFileUtil.ah(null);
        boolean bool = false;
      }
    }
    finally
    {
      SharePatchFileUtil.ah(null);
    }
    throw paramContext;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.tinker.loader.TinkerResourcePatcher
 * JD-Core Version:    0.6.2
 */