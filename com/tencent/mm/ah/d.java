package com.tencent.mm.ah;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory.Options;
import android.os.Looper;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.f;
import com.tencent.mm.bv.a.a.a;
import com.tencent.mm.cache.e.a;
import com.tencent.mm.sdk.e.l;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class d
{
  private static a frB;
  private static int frv;
  private static int frw;
  static final Map<String, Integer> frx;
  private final d.a frA;
  private l<d.a, String> fry;
  private final List<WeakReference<d.a>> frz;

  static
  {
    AppMethodBeat.i(77904);
    frv = 150;
    frw = 150;
    ConcurrentHashMap localConcurrentHashMap = new ConcurrentHashMap();
    frx = localConcurrentHashMap;
    localConcurrentHashMap.put("voipapp", Integer.valueOf(2131231200));
    frx.put("qqmail", Integer.valueOf(2131231193));
    frx.put("fmessage", Integer.valueOf(2131231180));
    frx.put("floatbottle", Integer.valueOf(2131231173));
    frx.put("lbsapp", Integer.valueOf(2131231187));
    frx.put("shakeapp", Integer.valueOf(2131231197));
    frx.put("medianote", Integer.valueOf(2131231185));
    frx.put("qqfriend", Integer.valueOf(2131231192));
    frx.put("masssendapp", Integer.valueOf(2131231184));
    frx.put("feedsapp", Integer.valueOf(2131231179));
    frx.put("facebookapp", Integer.valueOf(2131231178));
    frx.put("newsapp", Integer.valueOf(2131231195));
    frx.put("helper_entry", Integer.valueOf(2131231189));
    frx.put("voicevoipapp", Integer.valueOf(2131231199));
    frx.put("voiceinputapp", Integer.valueOf(2131231198));
    frx.put("officialaccounts", Integer.valueOf(2131231174));
    frx.put("service_officialaccounts", Integer.valueOf(2131231196));
    frx.put("linkedinplugin", Integer.valueOf(2131231183));
    frx.put("notifymessage", Integer.valueOf(2131231188));
    frx.put("appbrandcustomerservicemsg", Integer.valueOf(2131231171));
    frx.put("downloaderapp", Integer.valueOf(2131231177));
    frB = new a(frw);
    AppMethodBeat.o(77904);
  }

  public d()
  {
    AppMethodBeat.i(77879);
    this.fry = new d.1(this);
    this.frz = new ArrayList();
    this.frA = new d.2(this);
    reset();
    this.fry.a(this.frA, null);
    AppMethodBeat.o(77879);
  }

  private static boolean B(Bitmap paramBitmap)
  {
    AppMethodBeat.i(77902);
    boolean bool;
    if ((paramBitmap != null) && (!paramBitmap.isRecycled()))
    {
      bool = true;
      AppMethodBeat.o(77902);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(77902);
    }
  }

  public static String C(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(77890);
    paramString = a(new StringBuilder(64).append("wcf://avatar/"), paramString, paramBoolean).toString();
    com.tencent.mm.vfs.e.tf(com.tencent.mm.vfs.e.atb(paramString));
    AppMethodBeat.o(77890);
    return paramString;
  }

  public static String D(String paramString, boolean paramBoolean)
  {
    Object localObject = null;
    AppMethodBeat.i(77891);
    if (bo.isNullOrNil(paramString))
    {
      AppMethodBeat.o(77891);
      paramString = localObject;
    }
    while (true)
    {
      return paramString;
      paramString = a(new StringBuilder(128).append(com.tencent.mm.kernel.g.RP().cachePath).append("avatar/"), paramString, paramBoolean).toString();
      if (com.tencent.mm.vfs.e.tf(com.tencent.mm.vfs.e.atb(paramString)))
      {
        AppMethodBeat.o(77891);
      }
      else
      {
        AppMethodBeat.o(77891);
        paramString = localObject;
      }
    }
  }

  public static boolean E(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(77893);
    String str = C(paramString, paramBoolean);
    ab.i("MicroMsg.AvatarStorage", "Removed avatar: %s, hd: %b, path: %s", new Object[] { paramString, Boolean.valueOf(paramBoolean), str });
    boolean bool1 = com.tencent.mm.vfs.e.deleteFile(str);
    boolean bool2 = bool1;
    if (!paramBoolean)
      bool2 = bool1 | d.b.remove(str);
    AppMethodBeat.o(77893);
    return bool2;
  }

  private static StringBuilder a(StringBuilder paramStringBuilder, String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(77889);
    paramString = com.tencent.mm.a.g.x(paramString.getBytes());
    paramStringBuilder.append(paramString.substring(0, 2)).append('/').append(paramString.substring(2, 4)).append('/').append("user_");
    if (paramBoolean)
      paramStringBuilder.append("hd_");
    paramStringBuilder = paramStringBuilder.append(paramString).append(".png");
    AppMethodBeat.o(77889);
    return paramStringBuilder;
  }

  public static void a(Context paramContext, ImageView paramImageView, int paramInt)
  {
    AppMethodBeat.i(77878);
    try
    {
      paramImageView.setImageBitmap(com.tencent.mm.sdk.platformtools.d.a(com.tencent.mm.compatible.g.a.decodeResource(paramContext.getResources(), paramInt), true, 1.0F));
      AppMethodBeat.o(77878);
      return;
    }
    catch (Exception paramContext)
    {
      while (true)
      {
        ab.e("MicroMsg.AvatarStorage", "exception:%s", new Object[] { bo.l(paramContext) });
        AppMethodBeat.o(77878);
      }
    }
  }

  private WeakReference<d.a> c(d.a parama)
  {
    AppMethodBeat.i(77882);
    List localList = this.frz;
    int i = 0;
    try
    {
      if (i < this.frz.size())
      {
        WeakReference localWeakReference = (WeakReference)this.frz.get(i);
        if (localWeakReference != null)
        {
          d.a locala = (d.a)localWeakReference.get();
          if ((locala != null) && (locala.equals(parama)))
          {
            AppMethodBeat.o(77882);
            parama = localWeakReference;
          }
        }
      }
      while (true)
      {
        return parama;
        i++;
        break;
        parama = null;
        AppMethodBeat.o(77882);
      }
    }
    finally
    {
      AppMethodBeat.o(77882);
    }
    throw parama;
  }

  public static Bitmap j(String paramString, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(77899);
    ab.d("MicroMsg.AvatarStorage", "getHDBitmap user:%s, width:%d, height:%d", new Object[] { paramString, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if (bo.isNullOrNil(paramString))
    {
      paramString = null;
      AppMethodBeat.o(77899);
    }
    while (true)
    {
      return paramString;
      paramString = com.tencent.mm.sdk.platformtools.d.ap(C(paramString, true), paramInt1, paramInt2);
      AppMethodBeat.o(77899);
    }
  }

  // ERROR //
  public static Bitmap m(String paramString, byte[] paramArrayOfByte)
  {
    // Byte code:
    //   0: ldc_w 344
    //   3: invokestatic 33	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: aload_1
    //   7: bipush 96
    //   9: bipush 96
    //   11: invokestatic 348	com/tencent/mm/sdk/platformtools/d:decodeByteArray	([BII)Landroid/graphics/Bitmap;
    //   14: astore_2
    //   15: aload_2
    //   16: invokestatic 350	com/tencent/mm/ah/d:B	(Landroid/graphics/Bitmap;)Z
    //   19: ifne +29 -> 48
    //   22: ldc 223
    //   24: ldc_w 352
    //   27: iconst_1
    //   28: anewarray 4	java/lang/Object
    //   31: dup
    //   32: iconst_0
    //   33: aload_0
    //   34: aastore
    //   35: invokestatic 304	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   38: ldc_w 344
    //   41: invokestatic 128	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   44: aconst_null
    //   45: astore_3
    //   46: aload_3
    //   47: areturn
    //   48: aload_2
    //   49: invokevirtual 355	android/graphics/Bitmap:getWidth	()I
    //   52: istore 4
    //   54: aload_2
    //   55: invokevirtual 358	android/graphics/Bitmap:getHeight	()I
    //   58: istore 5
    //   60: aload_2
    //   61: astore_3
    //   62: iload 4
    //   64: iload 5
    //   66: if_icmpeq +27 -> 93
    //   69: iload 4
    //   71: iload 5
    //   73: if_icmple +80 -> 153
    //   76: aload_2
    //   77: iload 4
    //   79: iload 5
    //   81: isub
    //   82: iconst_2
    //   83: idiv
    //   84: iconst_0
    //   85: iload 5
    //   87: iload 5
    //   89: invokestatic 362	android/graphics/Bitmap:createBitmap	(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;
    //   92: astore_3
    //   93: aload_0
    //   94: iconst_0
    //   95: invokestatic 221	com/tencent/mm/ah/d:C	(Ljava/lang/String;Z)Ljava/lang/String;
    //   98: astore_2
    //   99: aload_2
    //   100: iconst_0
    //   101: invokestatic 366	com/tencent/mm/vfs/e:L	(Ljava/lang/String;Z)Ljava/io/OutputStream;
    //   104: astore 6
    //   106: aload 6
    //   108: astore_2
    //   109: aload 6
    //   111: aload_1
    //   112: iconst_0
    //   113: aload_1
    //   114: arraylength
    //   115: invokevirtual 372	java/io/OutputStream:write	([BII)V
    //   118: aload 6
    //   120: ifnull +8 -> 128
    //   123: aload 6
    //   125: invokevirtual 375	java/io/OutputStream:close	()V
    //   128: ldc 223
    //   130: ldc_w 377
    //   133: iconst_1
    //   134: anewarray 4	java/lang/Object
    //   137: dup
    //   138: iconst_0
    //   139: aload_0
    //   140: aastore
    //   141: invokestatic 235	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   144: ldc_w 344
    //   147: invokestatic 128	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   150: goto -104 -> 46
    //   153: aload_2
    //   154: iconst_0
    //   155: iload 5
    //   157: iload 4
    //   159: isub
    //   160: iconst_2
    //   161: idiv
    //   162: iload 4
    //   164: iload 4
    //   166: invokestatic 362	android/graphics/Bitmap:createBitmap	(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;
    //   169: astore_3
    //   170: goto -77 -> 93
    //   173: astore_1
    //   174: aconst_null
    //   175: astore 6
    //   177: aload 6
    //   179: astore_2
    //   180: ldc 223
    //   182: aload_1
    //   183: ldc_w 379
    //   186: iconst_1
    //   187: anewarray 4	java/lang/Object
    //   190: dup
    //   191: iconst_0
    //   192: aload_0
    //   193: aastore
    //   194: invokestatic 383	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   197: aload 6
    //   199: ifnull +8 -> 207
    //   202: aload 6
    //   204: invokevirtual 375	java/io/OutputStream:close	()V
    //   207: ldc_w 344
    //   210: invokestatic 128	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   213: aconst_null
    //   214: astore_3
    //   215: goto -169 -> 46
    //   218: astore_0
    //   219: aconst_null
    //   220: astore_2
    //   221: aload_2
    //   222: ifnull +7 -> 229
    //   225: aload_2
    //   226: invokevirtual 375	java/io/OutputStream:close	()V
    //   229: ldc_w 344
    //   232: invokestatic 128	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   235: aload_0
    //   236: athrow
    //   237: astore_1
    //   238: goto -110 -> 128
    //   241: astore_0
    //   242: goto -35 -> 207
    //   245: astore_1
    //   246: goto -17 -> 229
    //   249: astore_0
    //   250: goto -29 -> 221
    //   253: astore_1
    //   254: goto -77 -> 177
    //
    // Exception table:
    //   from	to	target	type
    //   99	106	173	java/io/IOException
    //   99	106	218	finally
    //   123	128	237	java/io/IOException
    //   202	207	241	java/io/IOException
    //   225	229	245	java/io/IOException
    //   109	118	249	finally
    //   180	197	249	finally
    //   109	118	253	java/io/IOException
  }

  public static Bitmap qd(String paramString)
  {
    AppMethodBeat.i(77886);
    if (bo.isNullOrNil(paramString))
    {
      AppMethodBeat.o(77886);
      paramString = null;
    }
    while (true)
    {
      return paramString;
      Object localObject = frB;
      if (((a)localObject).fra != null);
      for (localObject = (Bitmap)((a)localObject).fra.ai(paramString); ; localObject = (Bitmap)e.a.J("avatar_cache", paramString))
      {
        if (localObject != null)
          break label77;
        AppMethodBeat.o(77886);
        paramString = null;
        break;
      }
      label77: if (((Bitmap)localObject).isRecycled())
      {
        localObject = frB;
        if (((a)localObject).fra != null)
          ((a)localObject).fra.remove(paramString);
        while (true)
        {
          AppMethodBeat.o(77886);
          paramString = null;
          break;
          e.a.K("avatar_cache", paramString);
        }
      }
      AppMethodBeat.o(77886);
      paramString = (String)localObject;
    }
  }

  public static boolean qe(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(77892);
    paramString = C(paramString, false);
    if ((com.tencent.mm.vfs.e.ct(paramString)) || (com.tencent.mm.vfs.e.ct(paramString + ".bm")))
    {
      bool = true;
      AppMethodBeat.o(77892);
    }
    while (true)
    {
      return bool;
      AppMethodBeat.o(77892);
    }
  }

  public static Bitmap qf(String paramString)
  {
    AppMethodBeat.i(77894);
    paramString = qi(C(paramString, false));
    AppMethodBeat.o(77894);
    return paramString;
  }

  public static Bitmap qg(String paramString)
  {
    AppMethodBeat.i(77900);
    ab.d("MicroMsg.AvatarStorage", "getHDBitmap user:%s", new Object[] { paramString });
    if (bo.isNullOrNil(paramString))
    {
      paramString = null;
      AppMethodBeat.o(77900);
    }
    while (true)
    {
      return paramString;
      paramString = com.tencent.mm.sdk.platformtools.d.ap(C(paramString, true), 480, 480);
      AppMethodBeat.o(77900);
    }
  }

  public static Bitmap qh(String paramString)
  {
    AppMethodBeat.i(77901);
    int i = 0;
    if (frx.containsKey(paramString))
      i = ((Integer)frx.get(paramString)).intValue();
    if (i != 0)
      o.acs();
    for (paramString = com.tencent.mm.compatible.g.a.decodeResource(o.getContext().getResources(), i); ; paramString = null)
    {
      paramString = com.tencent.mm.sdk.platformtools.d.a(paramString, true, 1.0F, true);
      AppMethodBeat.o(77901);
      return paramString;
    }
  }

  public static Bitmap qi(String paramString)
  {
    AppMethodBeat.i(77903);
    if (com.tencent.mm.vfs.e.ct(paramString));
    for (Bitmap localBitmap1 = com.tencent.mm.sdk.platformtools.d.decodeFile(paramString, null); ; localBitmap1 = null)
    {
      Bitmap localBitmap2 = localBitmap1;
      if (localBitmap1 == null)
        localBitmap2 = d.b.ql(paramString);
      paramString = localBitmap2;
      int i;
      int j;
      if (B(localBitmap2))
      {
        i = localBitmap2.getWidth();
        j = localBitmap2.getHeight();
        paramString = localBitmap2;
        if (i != j)
        {
          if (i <= j)
            break label95;
          paramString = Bitmap.createBitmap(localBitmap2, (i - j) / 2, 0, j, j);
        }
      }
      if (B(paramString))
        AppMethodBeat.o(77903);
      while (true)
      {
        return paramString;
        label95: paramString = Bitmap.createBitmap(localBitmap2, 0, (j - i) / 2, i, i);
        break;
        AppMethodBeat.o(77903);
        paramString = null;
      }
    }
  }

  public static void reset()
  {
    AppMethodBeat.i(77885);
    if (frB == null)
      frB = new a(frw);
    AppMethodBeat.o(77885);
  }

  public final void a(d.a parama)
  {
    AppMethodBeat.i(77880);
    synchronized (this.frz)
    {
      List localList2 = this.frz;
      WeakReference localWeakReference = new java/lang/ref/WeakReference;
      localWeakReference.<init>(parama);
      localList2.add(localWeakReference);
      AppMethodBeat.o(77880);
      return;
    }
  }

  public final boolean au(String paramString1, String paramString2)
  {
    boolean bool1 = false;
    AppMethodBeat.i(77897);
    try
    {
      BitmapFactory.Options localOptions = com.tencent.mm.sdk.platformtools.d.amj(paramString1);
      int i = localOptions.outWidth;
      int j = localOptions.outHeight;
      int k;
      int m;
      if (j < i)
      {
        k = i * 96 / j;
        m = 96;
      }
      while (true)
      {
        ab.d("MicroMsg.AvatarStorage", "inJustDecodeBounds old [w:%d h:%d]  new [w:%d h:%d] corner:%d", new Object[] { Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k), Integer.valueOf(m), Integer.valueOf(1) });
        localOptions = new android/graphics/BitmapFactory$Options;
        localOptions.<init>();
        localOptions.inPreferredConfig = Bitmap.Config.ARGB_8888;
        localOptions.inSampleSize = Math.min(i / k, j / m);
        boolean bool2 = f(paramString2, com.tencent.mm.sdk.platformtools.d.decodeFile(paramString1, localOptions));
        bool1 = bool2;
        AppMethodBeat.o(77897);
        return bool1;
        m = j * 96 / i;
        k = 96;
      }
    }
    catch (Exception paramString1)
    {
      while (true)
      {
        ab.e("MicroMsg.AvatarStorage", "exception:%s", new Object[] { bo.l(paramString1) });
        AppMethodBeat.o(77897);
      }
    }
  }

  public final void b(d.a parama)
  {
    AppMethodBeat.i(77881);
    synchronized (this.frz)
    {
      parama = c(parama);
      if (parama != null)
        this.frz.remove(parama);
      AppMethodBeat.o(77881);
      return;
    }
  }

  public final Bitmap bU(Context paramContext)
  {
    AppMethodBeat.i(77888);
    paramContext.getResources();
    Bitmap localBitmap = qd("I_AM_NO_SDCARD_USER_NAME");
    paramContext = localBitmap;
    if (!B(localBitmap))
    {
      paramContext = localBitmap;
      if (localBitmap != null)
      {
        ab.i("MicroMsg.AvatarStorage", "not cached, recycled=%b, reload=%s", new Object[] { Boolean.valueOf(localBitmap.isRecycled()), "I_AM_NO_SDCARD_USER_NAME" });
        paramContext = com.tencent.mm.sdk.platformtools.d.a(localBitmap, true, 1.0F);
        e("I_AM_NO_SDCARD_USER_NAME", paramContext);
      }
    }
    AppMethodBeat.o(77888);
    return paramContext;
  }

  @Deprecated
  public final void d(d.a parama)
  {
    AppMethodBeat.i(77883);
    this.fry.a(parama, Looper.getMainLooper());
    AppMethodBeat.o(77883);
  }

  @Deprecated
  public final void e(d.a parama)
  {
    AppMethodBeat.i(77884);
    this.fry.remove(parama);
    AppMethodBeat.o(77884);
  }

  public final void e(String paramString, Bitmap paramBitmap)
  {
    AppMethodBeat.i(77887);
    frB.d(paramString, paramBitmap);
    paramBitmap = a.a.xtT;
    if (paramBitmap != null)
      paramBitmap.Dp(paramString);
    this.fry.cF(paramString);
    this.fry.doNotify();
    ab.d("MicroMsg.AvatarStorage", "setToCache %s", new Object[] { paramString });
    AppMethodBeat.o(77887);
  }

  // ERROR //
  final boolean f(String paramString, Bitmap paramBitmap)
  {
    // Byte code:
    //   0: ldc_w 563
    //   3: invokestatic 33	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: aload_2
    //   7: invokestatic 350	com/tencent/mm/ah/d:B	(Landroid/graphics/Bitmap;)Z
    //   10: ifne +13 -> 23
    //   13: ldc_w 563
    //   16: invokestatic 128	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   19: iconst_0
    //   20: istore_3
    //   21: iload_3
    //   22: ireturn
    //   23: aload_2
    //   24: invokevirtual 355	android/graphics/Bitmap:getWidth	()I
    //   27: bipush 96
    //   29: if_icmpne +109 -> 138
    //   32: aload_2
    //   33: invokevirtual 358	android/graphics/Bitmap:getHeight	()I
    //   36: bipush 96
    //   38: if_icmpne +100 -> 138
    //   41: aload_2
    //   42: astore 4
    //   44: aload_2
    //   45: astore 5
    //   47: aload 4
    //   49: ifnull +39 -> 88
    //   52: aload_2
    //   53: astore 5
    //   55: aload 4
    //   57: aload_2
    //   58: if_acmpeq +30 -> 88
    //   61: ldc 223
    //   63: ldc_w 565
    //   66: iconst_1
    //   67: anewarray 4	java/lang/Object
    //   70: dup
    //   71: iconst_0
    //   72: aload_2
    //   73: invokevirtual 566	java/lang/Object:toString	()Ljava/lang/String;
    //   76: aastore
    //   77: invokestatic 235	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   80: aload_2
    //   81: invokevirtual 569	android/graphics/Bitmap:recycle	()V
    //   84: aload 4
    //   86: astore 5
    //   88: aload_1
    //   89: iconst_0
    //   90: invokestatic 221	com/tencent/mm/ah/d:C	(Ljava/lang/String;Z)Ljava/lang/String;
    //   93: astore_2
    //   94: aload_2
    //   95: iconst_0
    //   96: invokestatic 366	com/tencent/mm/vfs/e:L	(Ljava/lang/String;Z)Ljava/io/OutputStream;
    //   99: astore_2
    //   100: aload 5
    //   102: getstatic 575	android/graphics/Bitmap$CompressFormat:PNG	Landroid/graphics/Bitmap$CompressFormat;
    //   105: bipush 100
    //   107: aload_2
    //   108: invokevirtual 579	android/graphics/Bitmap:compress	(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
    //   111: pop
    //   112: aload_2
    //   113: ifnull +7 -> 120
    //   116: aload_2
    //   117: invokevirtual 375	java/io/OutputStream:close	()V
    //   120: aload_0
    //   121: aload_1
    //   122: aload 5
    //   124: invokevirtual 525	com/tencent/mm/ah/d:e	(Ljava/lang/String;Landroid/graphics/Bitmap;)V
    //   127: ldc_w 563
    //   130: invokestatic 128	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   133: iconst_1
    //   134: istore_3
    //   135: goto -114 -> 21
    //   138: aload_2
    //   139: invokevirtual 355	android/graphics/Bitmap:getWidth	()I
    //   142: istore 6
    //   144: aload_2
    //   145: invokevirtual 358	android/graphics/Bitmap:getHeight	()I
    //   148: istore 7
    //   150: iload 6
    //   152: iload 7
    //   154: if_icmpeq +64 -> 218
    //   157: iload 6
    //   159: iload 7
    //   161: if_icmple +36 -> 197
    //   164: aload_2
    //   165: iload 6
    //   167: iload 7
    //   169: isub
    //   170: iconst_2
    //   171: idiv
    //   172: iconst_0
    //   173: iload 7
    //   175: iload 7
    //   177: invokestatic 362	android/graphics/Bitmap:createBitmap	(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;
    //   180: astore 4
    //   182: aload 4
    //   184: bipush 96
    //   186: bipush 96
    //   188: iconst_1
    //   189: invokestatic 583	android/graphics/Bitmap:createScaledBitmap	(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;
    //   192: astore 4
    //   194: goto -150 -> 44
    //   197: aload_2
    //   198: iconst_0
    //   199: iload 7
    //   201: iload 6
    //   203: isub
    //   204: iconst_2
    //   205: idiv
    //   206: iload 6
    //   208: iload 6
    //   210: invokestatic 362	android/graphics/Bitmap:createBitmap	(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;
    //   213: astore 4
    //   215: goto -33 -> 182
    //   218: aload_2
    //   219: bipush 96
    //   221: bipush 96
    //   223: iconst_1
    //   224: invokestatic 583	android/graphics/Bitmap:createScaledBitmap	(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;
    //   227: astore 4
    //   229: goto -185 -> 44
    //   232: astore 4
    //   234: ldc 223
    //   236: ldc_w 585
    //   239: iconst_1
    //   240: anewarray 4	java/lang/Object
    //   243: dup
    //   244: iconst_0
    //   245: aload_1
    //   246: aastore
    //   247: invokestatic 304	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   250: aload_2
    //   251: invokestatic 350	com/tencent/mm/ah/d:B	(Landroid/graphics/Bitmap;)Z
    //   254: ifeq +26 -> 280
    //   257: ldc 223
    //   259: ldc_w 565
    //   262: iconst_1
    //   263: anewarray 4	java/lang/Object
    //   266: dup
    //   267: iconst_0
    //   268: aload_2
    //   269: invokevirtual 566	java/lang/Object:toString	()Ljava/lang/String;
    //   272: aastore
    //   273: invokestatic 235	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   276: aload_2
    //   277: invokevirtual 569	android/graphics/Bitmap:recycle	()V
    //   280: ldc_w 563
    //   283: invokestatic 128	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   286: iconst_0
    //   287: istore_3
    //   288: goto -267 -> 21
    //   291: astore 4
    //   293: aconst_null
    //   294: astore_2
    //   295: ldc 223
    //   297: aload 4
    //   299: ldc_w 379
    //   302: iconst_1
    //   303: anewarray 4	java/lang/Object
    //   306: dup
    //   307: iconst_0
    //   308: aload_1
    //   309: aastore
    //   310: invokestatic 383	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   313: aload_2
    //   314: ifnull +7 -> 321
    //   317: aload_2
    //   318: invokevirtual 375	java/io/OutputStream:close	()V
    //   321: ldc_w 563
    //   324: invokestatic 128	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   327: iconst_0
    //   328: istore_3
    //   329: goto -308 -> 21
    //   332: astore_1
    //   333: aconst_null
    //   334: astore_2
    //   335: aload_2
    //   336: ifnull +7 -> 343
    //   339: aload_2
    //   340: invokevirtual 375	java/io/OutputStream:close	()V
    //   343: ldc_w 563
    //   346: invokestatic 128	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   349: aload_1
    //   350: athrow
    //   351: astore_2
    //   352: goto -232 -> 120
    //   355: astore_1
    //   356: goto -35 -> 321
    //   359: astore_2
    //   360: goto -17 -> 343
    //   363: astore_1
    //   364: goto -29 -> 335
    //   367: astore_1
    //   368: goto -33 -> 335
    //   371: astore 4
    //   373: goto -78 -> 295
    //
    // Exception table:
    //   from	to	target	type
    //   138	150	232	java/lang/OutOfMemoryError
    //   164	182	232	java/lang/OutOfMemoryError
    //   182	194	232	java/lang/OutOfMemoryError
    //   197	215	232	java/lang/OutOfMemoryError
    //   218	229	232	java/lang/OutOfMemoryError
    //   94	100	291	java/io/IOException
    //   94	100	332	finally
    //   116	120	351	java/io/IOException
    //   317	321	355	java/io/IOException
    //   339	343	359	java/io/IOException
    //   100	112	363	finally
    //   295	313	367	finally
    //   100	112	371	java/io/IOException
  }

  public final boolean n(String paramString, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(77896);
    paramArrayOfByte = m(paramString, paramArrayOfByte);
    boolean bool;
    if (!B(paramArrayOfByte))
    {
      bool = false;
      AppMethodBeat.o(77896);
    }
    while (true)
    {
      return bool;
      e(paramString, paramArrayOfByte);
      bool = true;
      AppMethodBeat.o(77896);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ah.d
 * JD-Core Version:    0.6.2
 */