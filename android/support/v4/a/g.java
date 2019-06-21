package android.support.v4.a;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.support.v4.content.a.a.b;
import android.support.v4.content.a.a.c;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;

public final class g extends e
{
  private static final Class Hg;
  private static final Constructor Hh;
  private static final Method Hj;
  private static final Method Hk;
  private static final Method Hl;
  private static final Method Hm;
  private static final Method Hn;

  static
  {
    try
    {
      localClass = Class.forName("android.graphics.FontFamily");
      localConstructor = localClass.getConstructor(new Class[0]);
      localMethod1 = localClass.getMethod("addFontFromAssetManager", new Class[] { AssetManager.class, String.class, Integer.TYPE, Boolean.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, [Landroid.graphics.fonts.FontVariationAxis.class });
      localMethod2 = localClass.getMethod("addFontFromBuffer", new Class[] { ByteBuffer.class, Integer.TYPE, [Landroid.graphics.fonts.FontVariationAxis.class, Integer.TYPE, Integer.TYPE });
      localMethod3 = localClass.getMethod("freeze", new Class[0]);
      Method localMethod4 = localClass.getMethod("abortCreation", new Class[0]);
      localMethod5 = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", new Class[] { Array.newInstance(localClass, 1).getClass(), Integer.TYPE, Integer.TYPE });
      localMethod5.setAccessible(true);
      Hh = localConstructor;
      Hg = localClass;
      Hk = localMethod1;
      Hl = localMethod2;
      Hm = localMethod3;
      Hn = localMethod4;
      Hj = localMethod5;
      return;
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      while (true)
      {
        new StringBuilder("Unable to collect necessary methods for class ").append(localClassNotFoundException.getClass().getName());
        Method localMethod5 = null;
        Object localObject = null;
        Method localMethod3 = null;
        Method localMethod2 = null;
        Method localMethod1 = null;
        Constructor localConstructor = null;
        Class localClass = null;
      }
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      label213: break label213;
    }
  }

  private static boolean a(Context paramContext, Object paramObject, String paramString, int paramInt1, int paramInt2)
  {
    try
    {
      boolean bool = ((Boolean)Hk.invoke(paramObject, new Object[] { paramContext.getAssets(), paramString, Integer.valueOf(0), Boolean.FALSE, Integer.valueOf(0), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), null })).booleanValue();
      return bool;
    }
    catch (IllegalAccessException paramContext)
    {
      throw new RuntimeException(paramContext);
    }
    catch (InvocationTargetException paramContext)
    {
      label76: break label76;
    }
  }

  private static boolean a(Object paramObject, ByteBuffer paramByteBuffer, int paramInt1, int paramInt2, int paramInt3)
  {
    try
    {
      boolean bool = ((Boolean)Hl.invoke(paramObject, new Object[] { paramByteBuffer, Integer.valueOf(paramInt1), null, Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) })).booleanValue();
      return bool;
    }
    catch (IllegalAccessException paramObject)
    {
      throw new RuntimeException(paramObject);
    }
    catch (InvocationTargetException paramObject)
    {
      label53: break label53;
    }
  }

  private static Object dx()
  {
    try
    {
      Object localObject = Hh.newInstance(new Object[0]);
      return localObject;
    }
    catch (InstantiationException localInstantiationException)
    {
      throw new RuntimeException(localInstantiationException);
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      break label14;
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
      label14: break label14;
    }
  }

  private static boolean dy()
  {
    if (Hk != null);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  private static Typeface q(Object paramObject)
  {
    try
    {
      Object localObject = Array.newInstance(Hg, 1);
      Array.set(localObject, 0, paramObject);
      paramObject = (Typeface)Hj.invoke(null, new Object[] { localObject, Integer.valueOf(-1), Integer.valueOf(-1) });
      return paramObject;
    }
    catch (IllegalAccessException paramObject)
    {
      throw new RuntimeException(paramObject);
    }
    catch (InvocationTargetException paramObject)
    {
      label50: break label50;
    }
  }

  private static boolean r(Object paramObject)
  {
    try
    {
      boolean bool = ((Boolean)Hm.invoke(paramObject, new Object[0])).booleanValue();
      return bool;
    }
    catch (IllegalAccessException paramObject)
    {
      throw new RuntimeException(paramObject);
    }
    catch (InvocationTargetException paramObject)
    {
      label21: break label21;
    }
  }

  private static void s(Object paramObject)
  {
    try
    {
      Hn.invoke(paramObject, new Object[0]);
      return;
    }
    catch (IllegalAccessException paramObject)
    {
      throw new RuntimeException(paramObject);
    }
    catch (InvocationTargetException paramObject)
    {
      label14: break label14;
    }
  }

  public final Typeface a(Context paramContext, Resources paramResources, int paramInt1, String paramString, int paramInt2)
  {
    Object localObject = null;
    if (!dy())
      paramContext = super.a(paramContext, paramResources, paramInt1, paramString, paramInt2);
    while (true)
    {
      return paramContext;
      paramResources = dx();
      if (!a(paramContext, paramResources, paramString, -1, -1))
      {
        s(paramResources);
        paramContext = localObject;
      }
      else
      {
        paramContext = localObject;
        if (r(paramResources))
          paramContext = q(paramResources);
      }
    }
  }

  public final Typeface a(Context paramContext, a.b paramb, Resources paramResources, int paramInt)
  {
    if (!dy())
      paramContext = super.a(paramContext, paramb, paramResources, paramInt);
    while (true)
    {
      return paramContext;
      paramResources = dx();
      a.c[] arrayOfc = paramb.GN;
      int i = arrayOfc.length;
      label102: for (paramInt = 0; ; paramInt++)
      {
        if (paramInt >= i)
          break label108;
        a.c localc = arrayOfc[paramInt];
        paramb = localc.mFileName;
        int j = localc.GO;
        if (localc.GP);
        for (int k = 1; ; k = 0)
        {
          if (a(paramContext, paramResources, paramb, j, k))
            break label102;
          s(paramResources);
          paramContext = null;
          break;
        }
      }
      label108: if (!r(paramResources))
        paramContext = null;
      else
        paramContext = q(paramResources);
    }
  }

  // ERROR //
  public final Typeface a(Context paramContext, android.support.v4.d.b.b[] paramArrayOfb, int paramInt)
  {
    // Byte code:
    //   0: aload_2
    //   1: arraylength
    //   2: ifgt +7 -> 9
    //   5: aconst_null
    //   6: astore_1
    //   7: aload_1
    //   8: areturn
    //   9: invokestatic 175	android/support/v4/a/g:dy	()Z
    //   12: ifne +142 -> 154
    //   15: aload_0
    //   16: aload_2
    //   17: iload_3
    //   18: invokevirtual 218	android/support/v4/a/g:a	([Landroid/support/v4/d/b$b;I)Landroid/support/v4/d/b$b;
    //   21: astore_2
    //   22: aload_1
    //   23: invokevirtual 222	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   26: astore_1
    //   27: aload_1
    //   28: aload_2
    //   29: getfield 228	android/support/v4/d/b$b:mUri	Landroid/net/Uri;
    //   32: ldc 229
    //   34: aconst_null
    //   35: invokevirtual 235	android/content/ContentResolver:openFileDescriptor	(Landroid/net/Uri;Ljava/lang/String;Landroid/os/CancellationSignal;)Landroid/os/ParcelFileDescriptor;
    //   38: astore 4
    //   40: aload 4
    //   42: ifnonnull +18 -> 60
    //   45: aload 4
    //   47: ifnull +8 -> 55
    //   50: aload 4
    //   52: invokevirtual 240	android/os/ParcelFileDescriptor:close	()V
    //   55: aconst_null
    //   56: astore_1
    //   57: goto -50 -> 7
    //   60: new 242	android/graphics/Typeface$Builder
    //   63: astore_1
    //   64: aload_1
    //   65: aload 4
    //   67: invokevirtual 246	android/os/ParcelFileDescriptor:getFileDescriptor	()Ljava/io/FileDescriptor;
    //   70: invokespecial 249	android/graphics/Typeface$Builder:<init>	(Ljava/io/FileDescriptor;)V
    //   73: aload_1
    //   74: aload_2
    //   75: getfield 250	android/support/v4/d/b$b:GO	I
    //   78: invokevirtual 254	android/graphics/Typeface$Builder:setWeight	(I)Landroid/graphics/Typeface$Builder;
    //   81: aload_2
    //   82: getfield 255	android/support/v4/d/b$b:GP	Z
    //   85: invokevirtual 259	android/graphics/Typeface$Builder:setItalic	(Z)Landroid/graphics/Typeface$Builder;
    //   88: invokevirtual 263	android/graphics/Typeface$Builder:build	()Landroid/graphics/Typeface;
    //   91: astore_2
    //   92: aload_2
    //   93: astore_1
    //   94: aload 4
    //   96: ifnull -89 -> 7
    //   99: aload 4
    //   101: invokevirtual 240	android/os/ParcelFileDescriptor:close	()V
    //   104: aload_2
    //   105: astore_1
    //   106: goto -99 -> 7
    //   109: astore_1
    //   110: aconst_null
    //   111: astore_1
    //   112: goto -105 -> 7
    //   115: astore_1
    //   116: aload_1
    //   117: athrow
    //   118: astore_2
    //   119: aload 4
    //   121: ifnull +12 -> 133
    //   124: aload_1
    //   125: ifnull +21 -> 146
    //   128: aload 4
    //   130: invokevirtual 240	android/os/ParcelFileDescriptor:close	()V
    //   133: aload_2
    //   134: athrow
    //   135: astore 4
    //   137: aload_1
    //   138: aload 4
    //   140: invokevirtual 266	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   143: goto -10 -> 133
    //   146: aload 4
    //   148: invokevirtual 240	android/os/ParcelFileDescriptor:close	()V
    //   151: goto -18 -> 133
    //   154: aload_1
    //   155: aload_2
    //   156: invokestatic 271	android/support/v4/d/b:a	(Landroid/content/Context;[Landroid/support/v4/d/b$b;)Ljava/util/Map;
    //   159: astore 5
    //   161: invokestatic 179	android/support/v4/a/g:dx	()Ljava/lang/Object;
    //   164: astore 6
    //   166: aload_2
    //   167: arraylength
    //   168: istore 7
    //   170: iconst_0
    //   171: istore 8
    //   173: iconst_0
    //   174: istore 9
    //   176: iload 8
    //   178: iload 7
    //   180: if_icmpge +94 -> 274
    //   183: aload_2
    //   184: iload 8
    //   186: aaload
    //   187: astore 4
    //   189: aload 5
    //   191: aload 4
    //   193: getfield 228	android/support/v4/d/b$b:mUri	Landroid/net/Uri;
    //   196: invokeinterface 277 2 0
    //   201: checkcast 56	java/nio/ByteBuffer
    //   204: astore_1
    //   205: aload_1
    //   206: ifnull +115 -> 321
    //   209: aload 4
    //   211: getfield 280	android/support/v4/d/b$b:Ks	I
    //   214: istore 10
    //   216: aload 4
    //   218: getfield 250	android/support/v4/d/b$b:GO	I
    //   221: istore 11
    //   223: aload 4
    //   225: getfield 255	android/support/v4/d/b$b:GP	Z
    //   228: ifeq +31 -> 259
    //   231: iconst_1
    //   232: istore 9
    //   234: aload 6
    //   236: aload_1
    //   237: iload 10
    //   239: iload 11
    //   241: iload 9
    //   243: invokestatic 282	android/support/v4/a/g:a	(Ljava/lang/Object;Ljava/nio/ByteBuffer;III)Z
    //   246: ifne +19 -> 265
    //   249: aload 6
    //   251: invokestatic 183	android/support/v4/a/g:s	(Ljava/lang/Object;)V
    //   254: aconst_null
    //   255: astore_1
    //   256: goto -249 -> 7
    //   259: iconst_0
    //   260: istore 9
    //   262: goto -28 -> 234
    //   265: iconst_1
    //   266: istore 9
    //   268: iinc 8 1
    //   271: goto -95 -> 176
    //   274: iload 9
    //   276: ifne +13 -> 289
    //   279: aload 6
    //   281: invokestatic 183	android/support/v4/a/g:s	(Ljava/lang/Object;)V
    //   284: aconst_null
    //   285: astore_1
    //   286: goto -279 -> 7
    //   289: aload 6
    //   291: invokestatic 185	android/support/v4/a/g:r	(Ljava/lang/Object;)Z
    //   294: ifne +8 -> 302
    //   297: aconst_null
    //   298: astore_1
    //   299: goto -292 -> 7
    //   302: aload 6
    //   304: invokestatic 187	android/support/v4/a/g:q	(Ljava/lang/Object;)Landroid/graphics/Typeface;
    //   307: iload_3
    //   308: invokestatic 286	android/graphics/Typeface:create	(Landroid/graphics/Typeface;I)Landroid/graphics/Typeface;
    //   311: astore_1
    //   312: goto -305 -> 7
    //   315: astore_2
    //   316: aconst_null
    //   317: astore_1
    //   318: goto -199 -> 119
    //   321: goto -53 -> 268
    //
    // Exception table:
    //   from	to	target	type
    //   27	40	109	java/io/IOException
    //   50	55	109	java/io/IOException
    //   99	104	109	java/io/IOException
    //   128	133	109	java/io/IOException
    //   133	135	109	java/io/IOException
    //   137	143	109	java/io/IOException
    //   146	151	109	java/io/IOException
    //   60	92	115	java/lang/Throwable
    //   116	118	118	finally
    //   128	133	135	java/lang/Throwable
    //   60	92	315	finally
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.v4.a.g
 * JD-Core Version:    0.6.2
 */