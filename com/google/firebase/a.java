package com.google.firebase;

import android.app.Application;
import android.content.Context;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.internal.BackgroundDetector;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Objects.ToStringHelper;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.ProcessUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.firebase.components.k;
import com.google.firebase.components.m;
import com.google.firebase.components.n;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.concurrent.GuardedBy;

public class a
{
  private static final List<String> but;
  private static final List<String> buu;
  private static final List<String> buv;
  private static final List<String> buw;
  private static final Set<String> bux;

  @GuardedBy("sLock")
  static final Map<String, a> buy;
  private static final Object sLock;
  private final b buA;
  private final n buB;
  private final AtomicBoolean buC;
  private final AtomicBoolean buD;
  private final List<Object> buE;
  private final List<Object> buF;
  private a.a buG;
  private final Context buz;
  private final String mName;
  private final List<Object> zzm;

  static
  {
    AppMethodBeat.i(10595);
    but = Arrays.asList(new String[] { "com.google.firebase.auth.FirebaseAuth", "com.google.firebase.iid.FirebaseInstanceId" });
    buu = Collections.singletonList("com.google.firebase.crash.FirebaseCrash");
    buv = Arrays.asList(new String[] { "com.google.android.gms.measurement.AppMeasurement" });
    buw = Arrays.asList(new String[0]);
    bux = Collections.emptySet();
    sLock = new Object();
    buy = new android.support.v4.f.a();
    AppMethodBeat.o(10595);
  }

  private a(Context paramContext, String paramString, b paramb)
  {
    AppMethodBeat.i(10588);
    this.buC = new AtomicBoolean(false);
    this.buD = new AtomicBoolean();
    this.buE = new CopyOnWriteArrayList();
    this.zzm = new CopyOnWriteArrayList();
    this.buF = new CopyOnWriteArrayList();
    this.buz = ((Context)Preconditions.checkNotNull(paramContext));
    this.mName = Preconditions.checkNotEmpty(paramString);
    this.buA = ((b)Preconditions.checkNotNull(paramb));
    this.buG = new com.google.firebase.b.a();
    paramContext = new k(this.buz);
    this.buB = new n(k.A(paramContext.bvb.ao(paramContext.mContext)), new com.google.firebase.components.a[] { com.google.firebase.components.a.a(Context.class, this.buz), com.google.firebase.components.a.a(a.class, this), com.google.firebase.components.a.a(b.class, this.buA) });
    AppMethodBeat.o(10588);
  }

  private static a a(Context arg0, b paramb, String paramString)
  {
    AppMethodBeat.i(10585);
    com.google.firebase.b.b.uY();
    if ((PlatformVersion.isAtLeastIceCreamSandwich()) && ((???.getApplicationContext() instanceof Application)))
    {
      BackgroundDetector.initialize((Application)???.getApplicationContext());
      BackgroundDetector.getInstance().addListener(new c());
    }
    String str = paramString.trim();
    paramString = ???;
    if (???.getApplicationContext() != null)
      paramString = ???.getApplicationContext();
    synchronized (sLock)
    {
      if (!buy.containsKey(str))
      {
        bool = true;
        int i = String.valueOf(str).length();
        Object localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>(i + 33);
        Preconditions.checkState(bool, "FirebaseApp name " + str + " already exists!");
        Preconditions.checkNotNull(paramString, "Application context cannot be null.");
        localObject = new com/google/firebase/a;
        ((a)localObject).<init>(paramString, str, paramb);
        buy.put(str, localObject);
        com.google.firebase.b.b.uZ();
        ((a)localObject).zzc();
        AppMethodBeat.o(10585);
        return localObject;
      }
      boolean bool = false;
    }
  }

  private static <T> void a(Class<T> paramClass, T paramT, Iterable<String> paramIterable, boolean paramBoolean)
  {
    AppMethodBeat.i(10593);
    Iterator localIterator = paramIterable.iterator();
    while (true)
    {
      if (!localIterator.hasNext())
        break label257;
      paramIterable = (String)localIterator.next();
      if (paramBoolean);
      try
      {
        if (buw.contains(paramIterable))
        {
          Method localMethod = Class.forName(paramIterable).getMethod("getInstance", new Class[] { paramClass });
          int i = localMethod.getModifiers();
          if ((Modifier.isPublic(i)) && (Modifier.isStatic(i)))
            localMethod.invoke(null, new Object[] { paramT });
        }
      }
      catch (ClassNotFoundException localClassNotFoundException)
      {
        if (bux.contains(paramIterable))
        {
          paramClass = new IllegalStateException(String.valueOf(paramIterable).concat(" is missing, but is required. Check if it has been removed by Proguard."));
          AppMethodBeat.o(10593);
          throw paramClass;
        }
        String.valueOf(paramIterable).concat(" is not linked. Skipping initialization.");
      }
      catch (NoSuchMethodException paramClass)
      {
        paramClass = new IllegalStateException(String.valueOf(paramIterable).concat("#getInstance has been removed by Proguard. Add keep rule to prevent it."));
        AppMethodBeat.o(10593);
        throw paramClass;
      }
      catch (InvocationTargetException paramIterable)
      {
        Log.wtf("FirebaseApp", "Firebase API initialization failure.", paramIterable);
      }
      catch (IllegalAccessException localIllegalAccessException)
      {
        paramIterable = String.valueOf(paramIterable);
        if (paramIterable.length() == 0);
      }
    }
    for (paramIterable = "Failed to initialize ".concat(paramIterable); ; paramIterable = new String("Failed to initialize "))
    {
      Log.wtf("FirebaseApp", paramIterable, localIllegalAccessException);
      break;
    }
    label257: AppMethodBeat.o(10593);
  }

  public static a ak(Context paramContext)
  {
    AppMethodBeat.i(10584);
    synchronized (sLock)
    {
      if (buy.containsKey("[DEFAULT]"))
      {
        paramContext = ut();
        AppMethodBeat.o(10584);
      }
      b localb;
      while (true)
      {
        return paramContext;
        localb = b.am(paramContext);
        if (localb != null)
          break;
        paramContext = null;
        AppMethodBeat.o(10584);
      }
      paramContext = a(paramContext, localb, "[DEFAULT]");
      AppMethodBeat.o(10584);
    }
  }

  private String getName()
  {
    AppMethodBeat.i(10578);
    zza();
    String str = this.mName;
    AppMethodBeat.o(10578);
    return str;
  }

  public static a ut()
  {
    AppMethodBeat.i(10583);
    synchronized (sLock)
    {
      Object localObject2 = (a)buy.get("[DEFAULT]");
      if (localObject2 == null)
      {
        IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
        localObject2 = ProcessUtils.getMyProcessName();
        int i = String.valueOf(localObject2).length();
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>(i + 116);
        localIllegalStateException.<init>("Default FirebaseApp is not initialized in this process " + (String)localObject2 + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
        AppMethodBeat.o(10583);
        throw localIllegalStateException;
      }
    }
    AppMethodBeat.o(10583);
    return locala;
  }

  @KeepForSdk
  public static void uu()
  {
    AppMethodBeat.i(10586);
    synchronized (sLock)
    {
      ArrayList localArrayList = new java/util/ArrayList;
      localArrayList.<init>(buy.values());
      localArrayList = (ArrayList)localArrayList;
      int i = localArrayList.size();
      int j = 0;
      while (j < i)
      {
        Object localObject3 = localArrayList.get(j);
        int k = j + 1;
        localObject3 = (a)localObject3;
        j = k;
        if (((a)localObject3).buC.get())
        {
          ((a)localObject3).uw();
          j = k;
        }
      }
    }
    AppMethodBeat.o(10586);
  }

  @KeepForSdk
  @VisibleForTesting
  private boolean uv()
  {
    AppMethodBeat.i(10590);
    boolean bool = "[DEFAULT]".equals(getName());
    AppMethodBeat.o(10590);
    return bool;
  }

  private final void uw()
  {
    AppMethodBeat.i(10591);
    Iterator localIterator = this.zzm.iterator();
    while (localIterator.hasNext())
      localIterator.next();
    AppMethodBeat.o(10591);
  }

  private final void zza()
  {
    AppMethodBeat.i(10589);
    if (!this.buD.get());
    for (boolean bool = true; ; bool = false)
    {
      Preconditions.checkState(bool, "FirebaseApp was deleted");
      AppMethodBeat.o(10589);
      return;
    }
  }

  private final void zzc()
  {
    AppMethodBeat.i(10592);
    boolean bool = android.support.v4.content.b.R(this.buz);
    if (bool)
      a.b.al(this.buz);
    while (true)
    {
      a(a.class, this, but, bool);
      if (uv())
      {
        a(a.class, this, buu, bool);
        a(Context.class, this.buz, buv, bool);
      }
      AppMethodBeat.o(10592);
      return;
      this.buB.aS(uv());
    }
  }

  public boolean equals(Object paramObject)
  {
    AppMethodBeat.i(10580);
    boolean bool;
    if (!(paramObject instanceof a))
    {
      bool = false;
      AppMethodBeat.o(10580);
    }
    while (true)
    {
      return bool;
      bool = this.mName.equals(((a)paramObject).getName());
      AppMethodBeat.o(10580);
    }
  }

  public final Context getApplicationContext()
  {
    AppMethodBeat.i(10577);
    zza();
    Context localContext = this.buz;
    AppMethodBeat.o(10577);
    return localContext;
  }

  public int hashCode()
  {
    AppMethodBeat.i(10581);
    int i = this.mName.hashCode();
    AppMethodBeat.o(10581);
    return i;
  }

  public String toString()
  {
    AppMethodBeat.i(10582);
    String str = Objects.toStringHelper(this).add("name", this.mName).add("options", this.buA).toString();
    AppMethodBeat.o(10582);
    return str;
  }

  public final b us()
  {
    AppMethodBeat.i(10579);
    zza();
    b localb = this.buA;
    AppMethodBeat.o(10579);
    return localb;
  }

  @KeepForSdk
  public final <T> T x(Class<T> paramClass)
  {
    AppMethodBeat.i(10587);
    zza();
    paramClass = com.google.firebase.components.c.a(this.buB, paramClass);
    AppMethodBeat.o(10587);
    return paramClass;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.google.firebase.a
 * JD-Core Version:    0.6.2
 */