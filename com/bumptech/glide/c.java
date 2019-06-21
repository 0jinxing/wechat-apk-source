package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.bumptech.glide.c.b.b.i.a;
import com.bumptech.glide.c.c.a.b;
import com.bumptech.glide.c.c.a.c;
import com.bumptech.glide.c.c.a.c.a;
import com.bumptech.glide.c.c.a.d.a;
import com.bumptech.glide.c.c.a.e.a;
import com.bumptech.glide.c.c.b.d;
import com.bumptech.glide.c.c.d.b;
import com.bumptech.glide.c.c.e.c;
import com.bumptech.glide.c.c.f.b;
import com.bumptech.glide.c.c.f.e;
import com.bumptech.glide.c.c.s.a;
import com.bumptech.glide.c.c.s.b;
import com.bumptech.glide.c.c.s.c;
import com.bumptech.glide.c.c.s.d;
import com.bumptech.glide.c.c.t;
import com.bumptech.glide.c.c.u.a;
import com.bumptech.glide.c.c.u.b;
import com.bumptech.glide.c.c.u.c;
import com.bumptech.glide.c.c.v.a;
import com.bumptech.glide.c.c.w.a;
import com.bumptech.glide.c.c.w.b;
import com.bumptech.glide.c.c.w.d;
import com.bumptech.glide.c.c.x.a;
import com.bumptech.glide.c.d.a.n;
import com.bumptech.glide.c.d.a.o;
import com.bumptech.glide.c.d.a.q;
import com.bumptech.glide.c.d.a.r;
import com.bumptech.glide.manager.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.File;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class c
  implements ComponentCallbacks2
{
  private static volatile c awc;
  private static volatile boolean awd;
  private final com.bumptech.glide.c.b.j awe;
  public final com.bumptech.glide.c.b.a.e awf;
  private final com.bumptech.glide.c.b.b.h awg;
  private final com.bumptech.glide.c.b.d.a awh;
  public final e awi;
  public final h awj;
  public final com.bumptech.glide.c.b.a.b awk;
  public final l awl;
  final com.bumptech.glide.manager.d awm;
  final List<j> awn;
  private f awo;

  private c(Context paramContext, com.bumptech.glide.c.b.j paramj, com.bumptech.glide.c.b.b.h paramh, com.bumptech.glide.c.b.a.e parame, com.bumptech.glide.c.b.a.b paramb, l paraml, com.bumptech.glide.manager.d paramd, int paramInt, com.bumptech.glide.f.e parame1, Map<Class<?>, k<?, ?>> paramMap)
  {
    AppMethodBeat.i(91607);
    this.awn = new ArrayList();
    this.awo = f.awD;
    this.awe = paramj;
    this.awf = parame;
    this.awk = paramb;
    this.awg = paramh;
    this.awl = paraml;
    this.awm = paramd;
    this.awh = new com.bumptech.glide.c.b.d.a(paramh, parame, (com.bumptech.glide.c.b)parame1.aAd.a(com.bumptech.glide.c.d.a.h.aFl));
    paramh = paramContext.getResources();
    this.awj = new h();
    paramd = this.awj;
    paraml = new com.bumptech.glide.c.d.a.f();
    paramd.awS.a(paraml);
    Object localObject = new com.bumptech.glide.c.d.a.h(this.awj.lF(), paramh.getDisplayMetrics(), parame, paramb);
    com.bumptech.glide.c.d.e.a locala = new com.bumptech.glide.c.d.e.a(paramContext, this.awj.lF(), parame, paramb);
    paraml = r.b(parame);
    paramd = new com.bumptech.glide.c.d.a.e((com.bumptech.glide.c.d.a.h)localObject);
    o localo = new o((com.bumptech.glide.c.d.a.h)localObject, paramb);
    com.bumptech.glide.c.d.c.d locald = new com.bumptech.glide.c.d.c.d(paramContext);
    s.c localc = new s.c(paramh);
    s.d locald1 = new s.d(paramh);
    s.b localb = new s.b(paramh);
    s.a locala1 = new s.a(paramh);
    com.bumptech.glide.c.d.a.c localc1 = new com.bumptech.glide.c.d.a.c(paramb);
    com.bumptech.glide.c.d.f.a locala2 = new com.bumptech.glide.c.d.f.a();
    com.bumptech.glide.c.d.f.d locald2 = new com.bumptech.glide.c.d.f.d();
    localObject = paramContext.getContentResolver();
    this.awj.a(ByteBuffer.class, new com.bumptech.glide.c.c.c()).a(InputStream.class, new t(paramb)).a("Bitmap", ByteBuffer.class, Bitmap.class, paramd).a("Bitmap", InputStream.class, Bitmap.class, localo).a("Bitmap", ParcelFileDescriptor.class, Bitmap.class, paraml).a("Bitmap", AssetFileDescriptor.class, Bitmap.class, r.a(parame)).a(Bitmap.class, Bitmap.class, v.a.nl()).a("Bitmap", Bitmap.class, Bitmap.class, new q()).a(Bitmap.class, localc1).a("BitmapDrawable", ByteBuffer.class, BitmapDrawable.class, new com.bumptech.glide.c.d.a.a(paramh, paramd)).a("BitmapDrawable", InputStream.class, BitmapDrawable.class, new com.bumptech.glide.c.d.a.a(paramh, localo)).a("BitmapDrawable", ParcelFileDescriptor.class, BitmapDrawable.class, new com.bumptech.glide.c.d.a.a(paramh, paraml)).a(BitmapDrawable.class, new com.bumptech.glide.c.d.a.b(parame, localc1)).a("Gif", InputStream.class, com.bumptech.glide.c.d.e.c.class, new com.bumptech.glide.c.d.e.j(this.awj.lF(), locala, paramb)).a("Gif", ByteBuffer.class, com.bumptech.glide.c.d.e.c.class, locala).a(com.bumptech.glide.c.d.e.c.class, new com.bumptech.glide.c.d.e.d()).a(com.bumptech.glide.b.a.class, com.bumptech.glide.b.a.class, v.a.nl()).a("Bitmap", com.bumptech.glide.b.a.class, Bitmap.class, new com.bumptech.glide.c.d.e.h(parame)).a(Uri.class, Drawable.class, locald).a(Uri.class, Bitmap.class, new n(locald, parame)).a(new com.bumptech.glide.c.d.b.a.a()).a(File.class, ByteBuffer.class, new d.b()).a(File.class, InputStream.class, new f.e()).a(File.class, File.class, new com.bumptech.glide.c.d.d.a()).a(File.class, ParcelFileDescriptor.class, new f.b()).a(File.class, File.class, v.a.nl()).a(new com.bumptech.glide.c.a.k.a(paramb)).a(Integer.TYPE, InputStream.class, localc).a(Integer.TYPE, ParcelFileDescriptor.class, localb).a(Integer.class, InputStream.class, localc).a(Integer.class, ParcelFileDescriptor.class, localb).a(Integer.class, Uri.class, locald1).a(Integer.TYPE, AssetFileDescriptor.class, locala1).a(Integer.class, AssetFileDescriptor.class, locala1).a(Integer.TYPE, Uri.class, locald1).a(String.class, InputStream.class, new e.c()).a(Uri.class, InputStream.class, new e.c()).a(String.class, InputStream.class, new u.c()).a(String.class, ParcelFileDescriptor.class, new u.b()).a(String.class, AssetFileDescriptor.class, new u.a()).a(Uri.class, InputStream.class, new com.bumptech.glide.c.c.a.b.a()).a(Uri.class, InputStream.class, new a.c(paramContext.getAssets())).a(Uri.class, ParcelFileDescriptor.class, new a.b(paramContext.getAssets())).a(Uri.class, InputStream.class, new c.a(paramContext)).a(Uri.class, InputStream.class, new d.a(paramContext)).a(Uri.class, InputStream.class, new w.d((ContentResolver)localObject)).a(Uri.class, ParcelFileDescriptor.class, new w.b((ContentResolver)localObject)).a(Uri.class, AssetFileDescriptor.class, new w.a((ContentResolver)localObject)).a(Uri.class, InputStream.class, new x.a()).a(URL.class, InputStream.class, new e.a()).a(Uri.class, File.class, new com.bumptech.glide.c.c.k.a(paramContext)).a(com.bumptech.glide.c.c.g.class, InputStream.class, new com.bumptech.glide.c.c.a.a.a()).a([B.class, ByteBuffer.class, new com.bumptech.glide.c.c.b.a()).a([B.class, InputStream.class, new b.d()).a(Uri.class, Uri.class, v.a.nl()).a(Drawable.class, Drawable.class, v.a.nl()).a(Drawable.class, Drawable.class, new com.bumptech.glide.c.d.c.e()).a(Bitmap.class, BitmapDrawable.class, new com.bumptech.glide.c.d.f.b(paramh)).a(Bitmap.class, [B.class, locala2).a(Drawable.class, [B.class, new com.bumptech.glide.c.d.f.c(parame, locala2, locald2)).a(com.bumptech.glide.c.d.e.c.class, [B.class, locald2);
    paramh = new com.bumptech.glide.f.a.b();
    this.awi = new e(paramContext, paramb, this.awj, paramh, parame1, paramMap, paramj, paramInt);
    AppMethodBeat.o(91607);
  }

  private static void a(Context paramContext, d paramd)
  {
    AppMethodBeat.i(91604);
    paramContext = paramContext.getApplicationContext();
    Object localObject1 = lE();
    Collections.emptyList();
    Object localObject2 = new com.bumptech.glide.d.d(paramContext).nJ();
    Object localObject3;
    Object localObject4;
    if ((localObject1 != null) && (!((a)localObject1).lD().isEmpty()))
    {
      localObject3 = ((a)localObject1).lD();
      localObject4 = ((List)localObject2).iterator();
      while (((Iterator)localObject4).hasNext())
      {
        localObject1 = (com.bumptech.glide.d.b)((Iterator)localObject4).next();
        if (((Set)localObject3).contains(localObject1.getClass()))
        {
          if (Log.isLoggable("Glide", 3))
            new StringBuilder("AppGlideModule excludes manifest GlideModule: ").append(localObject1);
          ((Iterator)localObject4).remove();
        }
      }
    }
    if (Log.isLoggable("Glide", 3))
    {
      localObject1 = ((List)localObject2).iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject3 = (com.bumptech.glide.d.b)((Iterator)localObject1).next();
        new StringBuilder("Discovered GlideModule from manifest: ").append(localObject3.getClass());
      }
    }
    paramd.aww = null;
    localObject1 = ((List)localObject2).iterator();
    while (((Iterator)localObject1).hasNext())
      ((Iterator)localObject1).next();
    if (paramd.awq == null)
      paramd.awq = com.bumptech.glide.c.b.c.a.nc();
    if (paramd.awr == null)
      paramd.awr = com.bumptech.glide.c.b.c.a.nb();
    if (paramd.awx == null)
      paramd.awx = com.bumptech.glide.c.b.c.a.ne();
    if (paramd.awt == null)
      paramd.awt = new com.bumptech.glide.c.b.b.i(new i.a(paramContext));
    if (paramd.awm == null)
      paramd.awm = new com.bumptech.glide.manager.f();
    int i;
    if (paramd.awf == null)
    {
      i = paramd.awt.aDj;
      if (i <= 0)
        break label570;
    }
    label570: for (paramd.awf = new com.bumptech.glide.c.b.a.k(i); ; paramd.awf = new com.bumptech.glide.c.b.a.f())
    {
      if (paramd.awk == null)
        paramd.awk = new com.bumptech.glide.c.b.a.j(paramd.awt.aDl);
      if (paramd.awg == null)
        paramd.awg = new com.bumptech.glide.c.b.b.g(paramd.awt.aDk);
      if (paramd.aws == null)
        paramd.aws = new com.bumptech.glide.c.b.b.f(paramContext);
      if (paramd.awe == null)
        paramd.awe = new com.bumptech.glide.c.b.j(paramd.awg, paramd.aws, paramd.awr, paramd.awq, com.bumptech.glide.c.b.c.a.nd(), com.bumptech.glide.c.b.c.a.ne(), paramd.awy);
      localObject4 = new l(paramd.aww);
      com.bumptech.glide.c.b.j localj = paramd.awe;
      com.bumptech.glide.c.b.b.h localh = paramd.awg;
      com.bumptech.glide.c.b.a.e locale = paramd.awf;
      com.bumptech.glide.c.b.a.b localb = paramd.awk;
      localObject1 = paramd.awm;
      i = paramd.awu;
      localObject3 = paramd.awv;
      ((com.bumptech.glide.f.e)localObject3).aCf = true;
      paramd = new c(paramContext, localj, localh, locale, localb, (l)localObject4, (com.bumptech.glide.manager.d)localObject1, i, (com.bumptech.glide.f.e)localObject3, paramd.awp);
      localObject2 = ((List)localObject2).iterator();
      while (((Iterator)localObject2).hasNext())
        ((Iterator)localObject2).next();
    }
    paramContext.registerComponentCallbacks(paramd);
    awc = paramd;
    AppMethodBeat.o(91604);
  }

  private static void a(Exception paramException)
  {
    AppMethodBeat.i(91606);
    paramException = new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", paramException);
    AppMethodBeat.o(91606);
    throw paramException;
  }

  public static c ae(Context paramContext)
  {
    AppMethodBeat.i(91603);
    if (awc == null)
    {
      try
      {
        if (awc != null)
          break label79;
        if (awd)
        {
          paramContext = new java/lang/IllegalStateException;
          paramContext.<init>("You cannot call Glide.get() in registerComponents(), use the provided Glide instance instead");
          AppMethodBeat.o(91603);
          throw paramContext;
        }
      }
      finally
      {
        AppMethodBeat.o(91603);
      }
      awd = true;
      d locald = new com/bumptech/glide/d;
      locald.<init>();
      a(paramContext, locald);
      awd = false;
    }
    label79: paramContext = awc;
    AppMethodBeat.o(91603);
    return paramContext;
  }

  public static j af(Context paramContext)
  {
    AppMethodBeat.i(91608);
    com.bumptech.glide.h.i.d(paramContext, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
    paramContext = ae(paramContext).awl.ah(paramContext);
    AppMethodBeat.o(91608);
    return paramContext;
  }

  private static a lE()
  {
    AppMethodBeat.i(91605);
    try
    {
      a locala = (a)Class.forName("com.bumptech.glide.GeneratedAppGlideModuleImpl").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
      AppMethodBeat.o(91605);
      return locala;
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      while (true)
      {
        Log.isLoggable("Glide", 5);
        Object localObject1 = null;
      }
    }
    catch (InstantiationException localInstantiationException)
    {
      while (true)
      {
        a(localInstantiationException);
        Object localObject2 = null;
      }
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      while (true)
      {
        a(localIllegalAccessException);
        Object localObject3 = null;
      }
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      while (true)
      {
        a(localNoSuchMethodException);
        Object localObject4 = null;
      }
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
      while (true)
      {
        a(localInvocationTargetException);
        Object localObject5 = null;
      }
    }
  }

  final boolean a(com.bumptech.glide.f.a.e<?> parame)
  {
    AppMethodBeat.i(91609);
    synchronized (this.awn)
    {
      Iterator localIterator = this.awn.iterator();
      while (localIterator.hasNext())
        if (((j)localIterator.next()).e(parame))
        {
          bool = true;
          AppMethodBeat.o(91609);
          return bool;
        }
      boolean bool = false;
      AppMethodBeat.o(91609);
    }
  }

  public void onConfigurationChanged(Configuration paramConfiguration)
  {
  }

  public void onLowMemory()
  {
    AppMethodBeat.i(91611);
    com.bumptech.glide.h.j.om();
    this.awg.mO();
    this.awf.mO();
    this.awk.mO();
    AppMethodBeat.o(91611);
  }

  public void onTrimMemory(int paramInt)
  {
    AppMethodBeat.i(91610);
    com.bumptech.glide.h.j.om();
    this.awg.trimMemory(paramInt);
    this.awf.trimMemory(paramInt);
    this.awk.trimMemory(paramInt);
    AppMethodBeat.o(91610);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.c
 * JD-Core Version:    0.6.2
 */