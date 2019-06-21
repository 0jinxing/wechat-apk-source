package com.google.android.gms.internal.measurement;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.net.Uri;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class zzwp
{
  private static final ConcurrentHashMap<Uri, zzwp> zzbmt;
  private static final String[] zzbna;
  private final Uri uri;
  private final ContentResolver zzbmu;
  private final ContentObserver zzbmv;
  private final Object zzbmw;
  private volatile Map<String, String> zzbmx;
  private final Object zzbmy;
  private final List<zzwr> zzbmz;

  static
  {
    AppMethodBeat.i(69759);
    zzbmt = new ConcurrentHashMap();
    zzbna = new String[] { "key", "value" };
    AppMethodBeat.o(69759);
  }

  private zzwp(ContentResolver paramContentResolver, Uri paramUri)
  {
    AppMethodBeat.i(69753);
    this.zzbmw = new Object();
    this.zzbmy = new Object();
    this.zzbmz = new ArrayList();
    this.zzbmu = paramContentResolver;
    this.uri = paramUri;
    this.zzbmv = new zzwq(this, null);
    AppMethodBeat.o(69753);
  }

  public static zzwp zza(ContentResolver paramContentResolver, Uri paramUri)
  {
    AppMethodBeat.i(69754);
    zzwp localzzwp = (zzwp)zzbmt.get(paramUri);
    Object localObject = localzzwp;
    if (localzzwp == null)
    {
      paramContentResolver = new zzwp(paramContentResolver, paramUri);
      paramUri = (zzwp)zzbmt.putIfAbsent(paramUri, paramContentResolver);
      localObject = paramUri;
      if (paramUri == null)
      {
        paramContentResolver.zzbmu.registerContentObserver(paramContentResolver.uri, false, paramContentResolver.zzbmv);
        localObject = paramContentResolver;
      }
    }
    AppMethodBeat.o(69754);
    return localObject;
  }

  // ERROR //
  private final Map<String, String> zzrv()
  {
    // Byte code:
    //   0: ldc 106
    //   2: invokestatic 33	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: new 108	java/util/HashMap
    //   8: astore_1
    //   9: aload_1
    //   10: invokespecial 109	java/util/HashMap:<init>	()V
    //   13: aload_0
    //   14: getfield 66	com/google/android/gms/internal/measurement/zzwp:zzbmu	Landroid/content/ContentResolver;
    //   17: aload_0
    //   18: getfield 68	com/google/android/gms/internal/measurement/zzwp:uri	Landroid/net/Uri;
    //   21: getstatic 48	com/google/android/gms/internal/measurement/zzwp:zzbna	[Ljava/lang/String;
    //   24: aconst_null
    //   25: aconst_null
    //   26: aconst_null
    //   27: invokevirtual 113	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   30: astore_2
    //   31: aload_2
    //   32: ifnull +66 -> 98
    //   35: aload_2
    //   36: invokeinterface 119 1 0
    //   41: ifeq +51 -> 92
    //   44: aload_1
    //   45: aload_2
    //   46: iconst_0
    //   47: invokeinterface 123 2 0
    //   52: aload_2
    //   53: iconst_1
    //   54: invokeinterface 123 2 0
    //   59: invokeinterface 128 3 0
    //   64: pop
    //   65: goto -30 -> 35
    //   68: astore_1
    //   69: aload_2
    //   70: invokeinterface 131 1 0
    //   75: ldc 106
    //   77: invokestatic 51	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   80: aload_1
    //   81: athrow
    //   82: astore_1
    //   83: ldc 106
    //   85: invokestatic 51	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   88: aconst_null
    //   89: astore_1
    //   90: aload_1
    //   91: areturn
    //   92: aload_2
    //   93: invokeinterface 131 1 0
    //   98: ldc 106
    //   100: invokestatic 51	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   103: goto -13 -> 90
    //   106: astore_1
    //   107: goto -24 -> 83
    //
    // Exception table:
    //   from	to	target	type
    //   35	65	68	finally
    //   5	31	82	java/lang/SecurityException
    //   69	82	82	java/lang/SecurityException
    //   92	98	82	java/lang/SecurityException
    //   5	31	106	android/database/sqlite/SQLiteException
    //   69	82	106	android/database/sqlite/SQLiteException
    //   92	98	106	android/database/sqlite/SQLiteException
  }

  private final void zzrw()
  {
    AppMethodBeat.i(69757);
    synchronized (this.zzbmy)
    {
      Iterator localIterator = this.zzbmz.iterator();
      if (localIterator.hasNext())
        ((zzwr)localIterator.next()).zzrx();
    }
    AppMethodBeat.o(69757);
  }

  public final Map<String, String> zzrt()
  {
    AppMethodBeat.i(69755);
    Object localObject1;
    Object localObject3;
    if (zzws.zzd("gms:phenotype:phenotype_flag:debug_disable_caching", false))
    {
      localObject1 = zzrv();
      localObject3 = localObject1;
      if (localObject1 != null);
    }
    while (true)
    {
      synchronized (this.zzbmw)
      {
        localObject3 = this.zzbmx;
        localObject1 = localObject3;
        if (localObject3 == null)
        {
          localObject1 = zzrv();
          this.zzbmx = ((Map)localObject1);
        }
        localObject3 = localObject1;
        if (localObject3 != null)
        {
          AppMethodBeat.o(69755);
          return localObject3;
          localObject1 = this.zzbmx;
        }
      }
      localObject3 = Collections.emptyMap();
      AppMethodBeat.o(69755);
    }
  }

  public final void zzru()
  {
    synchronized (this.zzbmw)
    {
      this.zzbmx = null;
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.measurement.zzwp
 * JD-Core Version:    0.6.2
 */