package com.google.android.gms.internal.measurement;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.VisibleForTesting;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

final class zzei extends zzjq
{
  private static final String[] zzaev = { "last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;" };
  private static final String[] zzaew = { "origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;" };
  private static final String[] zzaex = { "app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;" };
  private static final String[] zzaey = { "realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;" };
  private static final String[] zzaez = { "has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;" };
  private static final String[] zzafa = { "previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;" };
  private final zzel zzafb;
  private final zzjm zzafc;

  zzei(zzjr paramzzjr)
  {
    super(paramzzjr);
    AppMethodBeat.i(68638);
    this.zzafc = new zzjm(zzbt());
    this.zzafb = new zzel(this, getContext(), "google_app_measurement.db");
    AppMethodBeat.o(68638);
  }

  private final long zza(String paramString, String[] paramArrayOfString)
  {
    AppMethodBeat.i(68642);
    Object localObject1 = getWritableDatabase();
    Object localObject2 = null;
    String[] arrayOfString = null;
    try
    {
      paramArrayOfString = ((SQLiteDatabase)localObject1).rawQuery(paramString, paramArrayOfString);
      arrayOfString = paramArrayOfString;
      localObject2 = paramArrayOfString;
      if (paramArrayOfString.moveToFirst())
      {
        arrayOfString = paramArrayOfString;
        localObject2 = paramArrayOfString;
        long l = paramArrayOfString.getLong(0);
        if (paramArrayOfString != null)
          paramArrayOfString.close();
        AppMethodBeat.o(68642);
        return l;
      }
      arrayOfString = paramArrayOfString;
      localObject2 = paramArrayOfString;
      localObject1 = new android/database/sqlite/SQLiteException;
      arrayOfString = paramArrayOfString;
      localObject2 = paramArrayOfString;
      ((SQLiteException)localObject1).<init>("Database returned empty set");
      arrayOfString = paramArrayOfString;
      localObject2 = paramArrayOfString;
      AppMethodBeat.o(68642);
      arrayOfString = paramArrayOfString;
      localObject2 = paramArrayOfString;
      throw ((Throwable)localObject1);
    }
    catch (SQLiteException paramArrayOfString)
    {
      localObject2 = arrayOfString;
      zzge().zzim().zze("Database error", paramString, paramArrayOfString);
      localObject2 = arrayOfString;
      AppMethodBeat.o(68642);
      localObject2 = arrayOfString;
      throw paramArrayOfString;
    }
    finally
    {
      if (localObject2 != null)
        ((Cursor)localObject2).close();
      AppMethodBeat.o(68642);
    }
    throw paramString;
  }

  private final long zza(String paramString, String[] paramArrayOfString, long paramLong)
  {
    AppMethodBeat.i(68643);
    SQLiteDatabase localSQLiteDatabase = getWritableDatabase();
    Object localObject = null;
    String[] arrayOfString = null;
    try
    {
      paramArrayOfString = localSQLiteDatabase.rawQuery(paramString, paramArrayOfString);
      arrayOfString = paramArrayOfString;
      localObject = paramArrayOfString;
      if (paramArrayOfString.moveToFirst())
      {
        arrayOfString = paramArrayOfString;
        localObject = paramArrayOfString;
        paramLong = paramArrayOfString.getLong(0);
        if (paramArrayOfString != null)
          paramArrayOfString.close();
        AppMethodBeat.o(68643);
      }
      while (true)
      {
        return paramLong;
        if (paramArrayOfString != null)
          paramArrayOfString.close();
        AppMethodBeat.o(68643);
      }
    }
    catch (SQLiteException paramArrayOfString)
    {
      localObject = arrayOfString;
      zzge().zzim().zze("Database error", paramString, paramArrayOfString);
      localObject = arrayOfString;
      AppMethodBeat.o(68643);
      localObject = arrayOfString;
      throw paramArrayOfString;
    }
    finally
    {
      if (localObject != null)
        ((Cursor)localObject).close();
      AppMethodBeat.o(68643);
    }
    throw paramString;
  }

  @VisibleForTesting
  private final Object zza(Cursor paramCursor, int paramInt)
  {
    Object localObject = null;
    AppMethodBeat.i(68676);
    int i = paramCursor.getType(paramInt);
    switch (i)
    {
    default:
      zzge().zzim().zzg("Loaded invalid unknown value type, ignoring it", Integer.valueOf(i));
      AppMethodBeat.o(68676);
      paramCursor = localObject;
    case 0:
    case 1:
    case 2:
    case 3:
    case 4:
    }
    while (true)
    {
      return paramCursor;
      zzge().zzim().log("Loaded invalid null value from database");
      AppMethodBeat.o(68676);
      paramCursor = localObject;
      continue;
      paramCursor = Long.valueOf(paramCursor.getLong(paramInt));
      AppMethodBeat.o(68676);
      continue;
      paramCursor = Double.valueOf(paramCursor.getDouble(paramInt));
      AppMethodBeat.o(68676);
      continue;
      paramCursor = paramCursor.getString(paramInt);
      AppMethodBeat.o(68676);
      continue;
      zzge().zzim().log("Loaded invalid blob type value, ignoring it");
      AppMethodBeat.o(68676);
      paramCursor = localObject;
    }
  }

  private static void zza(ContentValues paramContentValues, String paramString, Object paramObject)
  {
    AppMethodBeat.i(68675);
    Preconditions.checkNotEmpty(paramString);
    Preconditions.checkNotNull(paramObject);
    if ((paramObject instanceof String))
    {
      paramContentValues.put(paramString, (String)paramObject);
      AppMethodBeat.o(68675);
    }
    while (true)
    {
      return;
      if ((paramObject instanceof Long))
      {
        paramContentValues.put(paramString, (Long)paramObject);
        AppMethodBeat.o(68675);
      }
      else
      {
        if (!(paramObject instanceof Double))
          break;
        paramContentValues.put(paramString, (Double)paramObject);
        AppMethodBeat.o(68675);
      }
    }
    paramContentValues = new IllegalArgumentException("Invalid value type");
    AppMethodBeat.o(68675);
    throw paramContentValues;
  }

  static void zza(zzfg paramzzfg, SQLiteDatabase paramSQLiteDatabase)
  {
    AppMethodBeat.i(68693);
    if (paramzzfg == null)
    {
      paramzzfg = new IllegalArgumentException("Monitor must not be null");
      AppMethodBeat.o(68693);
      throw paramzzfg;
    }
    paramSQLiteDatabase = new File(paramSQLiteDatabase.getPath());
    if (!paramSQLiteDatabase.setReadable(false, false))
      paramzzfg.zzip().log("Failed to turn off database read permission");
    if (!paramSQLiteDatabase.setWritable(false, false))
      paramzzfg.zzip().log("Failed to turn off database write permission");
    if (!paramSQLiteDatabase.setReadable(true, true))
      paramzzfg.zzip().log("Failed to turn on database read permission for owner");
    if (!paramSQLiteDatabase.setWritable(true, true))
      paramzzfg.zzip().log("Failed to turn on database write permission for owner");
    AppMethodBeat.o(68693);
  }

  static void zza(zzfg paramzzfg, SQLiteDatabase paramSQLiteDatabase, String paramString1, String paramString2, String paramString3, String[] paramArrayOfString)
  {
    int i = 0;
    AppMethodBeat.i(68692);
    if (paramzzfg == null)
    {
      paramzzfg = new IllegalArgumentException("Monitor must not be null");
      AppMethodBeat.o(68692);
      throw paramzzfg;
    }
    if (!zza(paramzzfg, paramSQLiteDatabase, paramString1))
      paramSQLiteDatabase.execSQL(paramString2);
    if (paramzzfg == null)
      try
      {
        paramSQLiteDatabase = new java/lang/IllegalArgumentException;
        paramSQLiteDatabase.<init>("Monitor must not be null");
        AppMethodBeat.o(68692);
        throw paramSQLiteDatabase;
      }
      catch (SQLiteException paramSQLiteDatabase)
      {
        paramzzfg.zzim().zzg("Failed to verify columns on table that was just created", paramString1);
        AppMethodBeat.o(68692);
        throw paramSQLiteDatabase;
      }
    Set localSet = zzb(paramSQLiteDatabase, paramString1);
    for (paramString2 : paramString3.split(","))
      if (!localSet.remove(paramString2))
      {
        paramSQLiteDatabase = new android/database/sqlite/SQLiteException;
        ??? = String.valueOf(paramString1).length();
        i = String.valueOf(paramString2).length();
        paramString3 = new java/lang/StringBuilder;
        paramString3.<init>(??? + 35 + i);
        paramSQLiteDatabase.<init>("Table " + paramString1 + " is missing required column: " + paramString2);
        AppMethodBeat.o(68692);
        throw paramSQLiteDatabase;
      }
    if (paramArrayOfString != null)
      for (??? = i; ??? < paramArrayOfString.length; ??? += 2)
        if (!localSet.remove(paramArrayOfString[???]))
          paramSQLiteDatabase.execSQL(paramArrayOfString[(??? + 1)]);
    if (!localSet.isEmpty())
      paramzzfg.zzip().zze("Table has extra columns. table, columns", paramString1, TextUtils.join(", ", localSet));
    AppMethodBeat.o(68692);
  }

  // ERROR //
  private static boolean zza(zzfg paramzzfg, SQLiteDatabase paramSQLiteDatabase, String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: ldc_w 411
    //   5: invokestatic 163	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   8: aload_0
    //   9: ifnonnull +22 -> 31
    //   12: new 317	java/lang/IllegalArgumentException
    //   15: dup
    //   16: ldc_w 324
    //   19: invokespecial 320	java/lang/IllegalArgumentException:<init>	(Ljava/lang/String;)V
    //   22: astore_0
    //   23: ldc_w 411
    //   26: invokestatic 192	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   29: aload_0
    //   30: athrow
    //   31: aload_1
    //   32: ldc_w 413
    //   35: iconst_1
    //   36: anewarray 19	java/lang/String
    //   39: dup
    //   40: iconst_0
    //   41: ldc_w 415
    //   44: aastore
    //   45: ldc_w 417
    //   48: iconst_1
    //   49: anewarray 19	java/lang/String
    //   52: dup
    //   53: iconst_0
    //   54: aload_2
    //   55: aastore
    //   56: aconst_null
    //   57: aconst_null
    //   58: aconst_null
    //   59: invokevirtual 421	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   62: astore_1
    //   63: aload_1
    //   64: astore_3
    //   65: aload_3
    //   66: astore_1
    //   67: aload_3
    //   68: invokeinterface 213 1 0
    //   73: istore 4
    //   75: aload_3
    //   76: ifnull +9 -> 85
    //   79: aload_3
    //   80: invokeinterface 220 1 0
    //   85: ldc_w 411
    //   88: invokestatic 192	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   91: iload 4
    //   93: ireturn
    //   94: astore 5
    //   96: aconst_null
    //   97: astore_3
    //   98: aload_3
    //   99: astore_1
    //   100: aload_0
    //   101: invokevirtual 338	com/google/android/gms/internal/measurement/zzfg:zzip	()Lcom/google/android/gms/internal/measurement/zzfi;
    //   104: ldc_w 423
    //   107: aload_2
    //   108: aload 5
    //   110: invokevirtual 243	com/google/android/gms/internal/measurement/zzfi:zze	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   113: aload_3
    //   114: ifnull +9 -> 123
    //   117: aload_3
    //   118: invokeinterface 220 1 0
    //   123: ldc_w 411
    //   126: invokestatic 192	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   129: iconst_0
    //   130: istore 4
    //   132: goto -41 -> 91
    //   135: astore_0
    //   136: aload_3
    //   137: astore_1
    //   138: aload_1
    //   139: ifnull +9 -> 148
    //   142: aload_1
    //   143: invokeinterface 220 1 0
    //   148: ldc_w 411
    //   151: invokestatic 192	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   154: aload_0
    //   155: athrow
    //   156: astore_0
    //   157: goto -19 -> 138
    //   160: astore 5
    //   162: goto -64 -> 98
    //
    // Exception table:
    //   from	to	target	type
    //   31	63	94	android/database/sqlite/SQLiteException
    //   31	63	135	finally
    //   67	75	156	finally
    //   100	113	156	finally
    //   67	75	160	android/database/sqlite/SQLiteException
  }

  // ERROR //
  private final boolean zza(String paramString, int paramInt, zzke paramzzke)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore 4
    //   3: ldc_w 427
    //   6: invokestatic 163	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   9: aload_0
    //   10: invokevirtual 430	com/google/android/gms/internal/measurement/zzjq:zzch	()V
    //   13: aload_0
    //   14: invokevirtual 433	com/google/android/gms/internal/measurement/zzhg:zzab	()V
    //   17: aload_1
    //   18: invokestatic 299	com/google/android/gms/common/internal/Preconditions:checkNotEmpty	(Ljava/lang/String;)Ljava/lang/String;
    //   21: pop
    //   22: aload_3
    //   23: invokestatic 303	com/google/android/gms/common/internal/Preconditions:checkNotNull	(Ljava/lang/Object;)Ljava/lang/Object;
    //   26: pop
    //   27: aload_3
    //   28: getfield 439	com/google/android/gms/internal/measurement/zzke:zzarq	Ljava/lang/String;
    //   31: invokestatic 442	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   34: ifeq +40 -> 74
    //   37: aload_0
    //   38: invokevirtual 229	com/google/android/gms/internal/measurement/zzhg:zzge	()Lcom/google/android/gms/internal/measurement/zzfg;
    //   41: invokevirtual 338	com/google/android/gms/internal/measurement/zzfg:zzip	()Lcom/google/android/gms/internal/measurement/zzfi;
    //   44: ldc_w 444
    //   47: aload_1
    //   48: invokestatic 448	com/google/android/gms/internal/measurement/zzfg:zzbm	(Ljava/lang/String;)Ljava/lang/Object;
    //   51: iload_2
    //   52: invokestatic 261	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   55: aload_3
    //   56: getfield 452	com/google/android/gms/internal/measurement/zzke:zzarp	Ljava/lang/Integer;
    //   59: invokestatic 378	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   62: invokevirtual 456	com/google/android/gms/internal/measurement/zzfi:zzd	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   65: ldc_w 427
    //   68: invokestatic 192	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   71: iload 4
    //   73: ireturn
    //   74: aload_3
    //   75: invokevirtual 461	com/google/android/gms/internal/measurement/zzace:zzvm	()I
    //   78: newarray byte
    //   80: astore 5
    //   82: aload 5
    //   84: iconst_0
    //   85: aload 5
    //   87: arraylength
    //   88: invokestatic 466	com/google/android/gms/internal/measurement/zzabw:zzb	([BII)Lcom/google/android/gms/internal/measurement/zzabw;
    //   91: astore 6
    //   93: aload_3
    //   94: aload 6
    //   96: invokevirtual 469	com/google/android/gms/internal/measurement/zzace:zza	(Lcom/google/android/gms/internal/measurement/zzabw;)V
    //   99: aload 6
    //   101: invokevirtual 472	com/google/android/gms/internal/measurement/zzabw:zzve	()V
    //   104: new 305	android/content/ContentValues
    //   107: dup
    //   108: invokespecial 474	android/content/ContentValues:<init>	()V
    //   111: astore 6
    //   113: aload 6
    //   115: ldc_w 476
    //   118: aload_1
    //   119: invokevirtual 309	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
    //   122: aload 6
    //   124: ldc_w 478
    //   127: iload_2
    //   128: invokestatic 261	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   131: invokevirtual 481	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Integer;)V
    //   134: aload 6
    //   136: ldc_w 483
    //   139: aload_3
    //   140: getfield 452	com/google/android/gms/internal/measurement/zzke:zzarp	Ljava/lang/Integer;
    //   143: invokevirtual 481	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Integer;)V
    //   146: aload 6
    //   148: ldc_w 485
    //   151: aload_3
    //   152: getfield 439	com/google/android/gms/internal/measurement/zzke:zzarq	Ljava/lang/String;
    //   155: invokevirtual 309	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
    //   158: aload 6
    //   160: ldc_w 487
    //   163: aload 5
    //   165: invokevirtual 490	android/content/ContentValues:put	(Ljava/lang/String;[B)V
    //   168: aload_0
    //   169: invokevirtual 201	com/google/android/gms/internal/measurement/zzei:getWritableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   172: ldc_w 492
    //   175: aconst_null
    //   176: aload 6
    //   178: iconst_5
    //   179: invokevirtual 496	android/database/sqlite/SQLiteDatabase:insertWithOnConflict	(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;I)J
    //   182: ldc2_w 497
    //   185: lcmp
    //   186: ifne +20 -> 206
    //   189: aload_0
    //   190: invokevirtual 229	com/google/android/gms/internal/measurement/zzhg:zzge	()Lcom/google/android/gms/internal/measurement/zzfg;
    //   193: invokevirtual 235	com/google/android/gms/internal/measurement/zzfg:zzim	()Lcom/google/android/gms/internal/measurement/zzfi;
    //   196: ldc_w 500
    //   199: aload_1
    //   200: invokestatic 448	com/google/android/gms/internal/measurement/zzfg:zzbm	(Ljava/lang/String;)Ljava/lang/Object;
    //   203: invokevirtual 265	com/google/android/gms/internal/measurement/zzfi:zzg	(Ljava/lang/String;Ljava/lang/Object;)V
    //   206: iconst_1
    //   207: istore 4
    //   209: ldc_w 427
    //   212: invokestatic 192	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   215: goto -144 -> 71
    //   218: astore_3
    //   219: aload_0
    //   220: invokevirtual 229	com/google/android/gms/internal/measurement/zzhg:zzge	()Lcom/google/android/gms/internal/measurement/zzfg;
    //   223: invokevirtual 235	com/google/android/gms/internal/measurement/zzfg:zzim	()Lcom/google/android/gms/internal/measurement/zzfi;
    //   226: ldc_w 502
    //   229: aload_1
    //   230: invokestatic 448	com/google/android/gms/internal/measurement/zzfg:zzbm	(Ljava/lang/String;)Ljava/lang/Object;
    //   233: aload_3
    //   234: invokevirtual 243	com/google/android/gms/internal/measurement/zzfi:zze	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   237: ldc_w 427
    //   240: invokestatic 192	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   243: goto -172 -> 71
    //   246: astore_3
    //   247: aload_0
    //   248: invokevirtual 229	com/google/android/gms/internal/measurement/zzhg:zzge	()Lcom/google/android/gms/internal/measurement/zzfg;
    //   251: invokevirtual 235	com/google/android/gms/internal/measurement/zzfg:zzim	()Lcom/google/android/gms/internal/measurement/zzfi;
    //   254: ldc_w 504
    //   257: aload_1
    //   258: invokestatic 448	com/google/android/gms/internal/measurement/zzfg:zzbm	(Ljava/lang/String;)Ljava/lang/Object;
    //   261: aload_3
    //   262: invokevirtual 243	com/google/android/gms/internal/measurement/zzfi:zze	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   265: ldc_w 427
    //   268: invokestatic 192	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   271: goto -200 -> 71
    //
    // Exception table:
    //   from	to	target	type
    //   74	104	218	java/io/IOException
    //   168	206	246	android/database/sqlite/SQLiteException
  }

  // ERROR //
  private final boolean zza(String paramString, int paramInt, zzkh paramzzkh)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore 4
    //   3: ldc_w 506
    //   6: invokestatic 163	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   9: aload_0
    //   10: invokevirtual 430	com/google/android/gms/internal/measurement/zzjq:zzch	()V
    //   13: aload_0
    //   14: invokevirtual 433	com/google/android/gms/internal/measurement/zzhg:zzab	()V
    //   17: aload_1
    //   18: invokestatic 299	com/google/android/gms/common/internal/Preconditions:checkNotEmpty	(Ljava/lang/String;)Ljava/lang/String;
    //   21: pop
    //   22: aload_3
    //   23: invokestatic 303	com/google/android/gms/common/internal/Preconditions:checkNotNull	(Ljava/lang/Object;)Ljava/lang/Object;
    //   26: pop
    //   27: aload_3
    //   28: getfield 511	com/google/android/gms/internal/measurement/zzkh:zzasf	Ljava/lang/String;
    //   31: invokestatic 442	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   34: ifeq +40 -> 74
    //   37: aload_0
    //   38: invokevirtual 229	com/google/android/gms/internal/measurement/zzhg:zzge	()Lcom/google/android/gms/internal/measurement/zzfg;
    //   41: invokevirtual 338	com/google/android/gms/internal/measurement/zzfg:zzip	()Lcom/google/android/gms/internal/measurement/zzfi;
    //   44: ldc_w 513
    //   47: aload_1
    //   48: invokestatic 448	com/google/android/gms/internal/measurement/zzfg:zzbm	(Ljava/lang/String;)Ljava/lang/Object;
    //   51: iload_2
    //   52: invokestatic 261	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   55: aload_3
    //   56: getfield 514	com/google/android/gms/internal/measurement/zzkh:zzarp	Ljava/lang/Integer;
    //   59: invokestatic 378	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   62: invokevirtual 456	com/google/android/gms/internal/measurement/zzfi:zzd	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   65: ldc_w 506
    //   68: invokestatic 192	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   71: iload 4
    //   73: ireturn
    //   74: aload_3
    //   75: invokevirtual 461	com/google/android/gms/internal/measurement/zzace:zzvm	()I
    //   78: newarray byte
    //   80: astore 5
    //   82: aload 5
    //   84: iconst_0
    //   85: aload 5
    //   87: arraylength
    //   88: invokestatic 466	com/google/android/gms/internal/measurement/zzabw:zzb	([BII)Lcom/google/android/gms/internal/measurement/zzabw;
    //   91: astore 6
    //   93: aload_3
    //   94: aload 6
    //   96: invokevirtual 469	com/google/android/gms/internal/measurement/zzace:zza	(Lcom/google/android/gms/internal/measurement/zzabw;)V
    //   99: aload 6
    //   101: invokevirtual 472	com/google/android/gms/internal/measurement/zzabw:zzve	()V
    //   104: new 305	android/content/ContentValues
    //   107: dup
    //   108: invokespecial 474	android/content/ContentValues:<init>	()V
    //   111: astore 6
    //   113: aload 6
    //   115: ldc_w 476
    //   118: aload_1
    //   119: invokevirtual 309	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
    //   122: aload 6
    //   124: ldc_w 478
    //   127: iload_2
    //   128: invokestatic 261	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   131: invokevirtual 481	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Integer;)V
    //   134: aload 6
    //   136: ldc_w 483
    //   139: aload_3
    //   140: getfield 514	com/google/android/gms/internal/measurement/zzkh:zzarp	Ljava/lang/Integer;
    //   143: invokevirtual 481	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Integer;)V
    //   146: aload 6
    //   148: ldc_w 516
    //   151: aload_3
    //   152: getfield 511	com/google/android/gms/internal/measurement/zzkh:zzasf	Ljava/lang/String;
    //   155: invokevirtual 309	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
    //   158: aload 6
    //   160: ldc_w 487
    //   163: aload 5
    //   165: invokevirtual 490	android/content/ContentValues:put	(Ljava/lang/String;[B)V
    //   168: aload_0
    //   169: invokevirtual 201	com/google/android/gms/internal/measurement/zzei:getWritableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   172: ldc_w 518
    //   175: aconst_null
    //   176: aload 6
    //   178: iconst_5
    //   179: invokevirtual 496	android/database/sqlite/SQLiteDatabase:insertWithOnConflict	(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;I)J
    //   182: ldc2_w 497
    //   185: lcmp
    //   186: ifne +85 -> 271
    //   189: aload_0
    //   190: invokevirtual 229	com/google/android/gms/internal/measurement/zzhg:zzge	()Lcom/google/android/gms/internal/measurement/zzfg;
    //   193: invokevirtual 235	com/google/android/gms/internal/measurement/zzfg:zzim	()Lcom/google/android/gms/internal/measurement/zzfi;
    //   196: ldc_w 520
    //   199: aload_1
    //   200: invokestatic 448	com/google/android/gms/internal/measurement/zzfg:zzbm	(Ljava/lang/String;)Ljava/lang/Object;
    //   203: invokevirtual 265	com/google/android/gms/internal/measurement/zzfi:zzg	(Ljava/lang/String;Ljava/lang/Object;)V
    //   206: ldc_w 506
    //   209: invokestatic 192	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   212: goto -141 -> 71
    //   215: astore_3
    //   216: aload_0
    //   217: invokevirtual 229	com/google/android/gms/internal/measurement/zzhg:zzge	()Lcom/google/android/gms/internal/measurement/zzfg;
    //   220: invokevirtual 235	com/google/android/gms/internal/measurement/zzfg:zzim	()Lcom/google/android/gms/internal/measurement/zzfi;
    //   223: ldc_w 522
    //   226: aload_1
    //   227: invokestatic 448	com/google/android/gms/internal/measurement/zzfg:zzbm	(Ljava/lang/String;)Ljava/lang/Object;
    //   230: aload_3
    //   231: invokevirtual 243	com/google/android/gms/internal/measurement/zzfi:zze	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   234: ldc_w 506
    //   237: invokestatic 192	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   240: goto -169 -> 71
    //   243: astore_3
    //   244: aload_0
    //   245: invokevirtual 229	com/google/android/gms/internal/measurement/zzhg:zzge	()Lcom/google/android/gms/internal/measurement/zzfg;
    //   248: invokevirtual 235	com/google/android/gms/internal/measurement/zzfg:zzim	()Lcom/google/android/gms/internal/measurement/zzfi;
    //   251: ldc_w 524
    //   254: aload_1
    //   255: invokestatic 448	com/google/android/gms/internal/measurement/zzfg:zzbm	(Ljava/lang/String;)Ljava/lang/Object;
    //   258: aload_3
    //   259: invokevirtual 243	com/google/android/gms/internal/measurement/zzfi:zze	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   262: ldc_w 506
    //   265: invokestatic 192	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   268: goto -197 -> 71
    //   271: iconst_1
    //   272: istore 4
    //   274: ldc_w 506
    //   277: invokestatic 192	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   280: goto -209 -> 71
    //
    // Exception table:
    //   from	to	target	type
    //   74	104	215	java/io/IOException
    //   168	206	243	android/database/sqlite/SQLiteException
  }

  private final boolean zza(String paramString, List<Integer> paramList)
  {
    boolean bool = false;
    AppMethodBeat.i(68673);
    Preconditions.checkNotEmpty(paramString);
    zzch();
    zzab();
    SQLiteDatabase localSQLiteDatabase = getWritableDatabase();
    try
    {
      long l = zza("select count(1) from audience_filter_values where app_id=?", new String[] { paramString });
      i = Math.max(0, Math.min(2000, zzgg().zzb(paramString, zzew.zzahn)));
      if (l <= i)
      {
        AppMethodBeat.o(68673);
        return bool;
      }
    }
    catch (SQLiteException paramList)
    {
      while (true)
      {
        int i;
        zzge().zzim().zze("Database error querying filters. appId", zzfg.zzbm(paramString), paramList);
        AppMethodBeat.o(68673);
        continue;
        ArrayList localArrayList = new ArrayList();
        for (int j = 0; ; j++)
        {
          if (j >= paramList.size())
            break label192;
          Integer localInteger = (Integer)paramList.get(j);
          if ((localInteger == null) || (!(localInteger instanceof Integer)))
          {
            AppMethodBeat.o(68673);
            break;
          }
          localArrayList.add(Integer.toString(localInteger.intValue()));
        }
        label192: paramList = TextUtils.join(",", localArrayList);
        paramList = String.valueOf(paramList).length() + 2 + "(" + paramList + ")";
        if (localSQLiteDatabase.delete("audience_filter_values", String.valueOf(paramList).length() + 140 + "audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in " + paramList + " order by rowid desc limit -1 offset ?)", new String[] { paramString, Integer.toString(i) }) > 0)
        {
          AppMethodBeat.o(68673);
          bool = true;
        }
        else
        {
          AppMethodBeat.o(68673);
        }
      }
    }
  }

  private static Set<String> zzb(SQLiteDatabase paramSQLiteDatabase, String paramString)
  {
    AppMethodBeat.i(68691);
    HashSet localHashSet = new HashSet();
    paramSQLiteDatabase = paramSQLiteDatabase.rawQuery(String.valueOf(paramString).length() + 22 + "SELECT * FROM " + paramString + " LIMIT 0", null);
    try
    {
      Collections.addAll(localHashSet, paramSQLiteDatabase.getColumnNames());
      return localHashSet;
    }
    finally
    {
      paramSQLiteDatabase.close();
      AppMethodBeat.o(68691);
    }
    throw paramString;
  }

  private final boolean zzhv()
  {
    AppMethodBeat.i(68689);
    boolean bool = getContext().getDatabasePath("google_app_measurement.db").exists();
    AppMethodBeat.o(68689);
    return bool;
  }

  public final void beginTransaction()
  {
    AppMethodBeat.i(68639);
    zzch();
    getWritableDatabase().beginTransaction();
    AppMethodBeat.o(68639);
  }

  public final void endTransaction()
  {
    AppMethodBeat.i(68641);
    zzch();
    getWritableDatabase().endTransaction();
    AppMethodBeat.o(68641);
  }

  @VisibleForTesting
  final SQLiteDatabase getWritableDatabase()
  {
    AppMethodBeat.i(68644);
    zzab();
    try
    {
      SQLiteDatabase localSQLiteDatabase = this.zzafb.getWritableDatabase();
      AppMethodBeat.o(68644);
      return localSQLiteDatabase;
    }
    catch (SQLiteException localSQLiteException)
    {
      zzge().zzip().zzg("Error opening database", localSQLiteException);
      AppMethodBeat.o(68644);
      throw localSQLiteException;
    }
  }

  public final void setTransactionSuccessful()
  {
    AppMethodBeat.i(68640);
    zzch();
    getWritableDatabase().setTransactionSuccessful();
    AppMethodBeat.o(68640);
  }

  // ERROR //
  public final long zza(zzkq paramzzkq)
  {
    // Byte code:
    //   0: ldc_w 646
    //   3: invokestatic 163	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: aload_0
    //   7: invokevirtual 433	com/google/android/gms/internal/measurement/zzhg:zzab	()V
    //   10: aload_0
    //   11: invokevirtual 430	com/google/android/gms/internal/measurement/zzjq:zzch	()V
    //   14: aload_1
    //   15: invokestatic 303	com/google/android/gms/common/internal/Preconditions:checkNotNull	(Ljava/lang/Object;)Ljava/lang/Object;
    //   18: pop
    //   19: aload_1
    //   20: getfield 651	com/google/android/gms/internal/measurement/zzkq:zzti	Ljava/lang/String;
    //   23: invokestatic 299	com/google/android/gms/common/internal/Preconditions:checkNotEmpty	(Ljava/lang/String;)Ljava/lang/String;
    //   26: pop
    //   27: aload_1
    //   28: invokevirtual 461	com/google/android/gms/internal/measurement/zzace:zzvm	()I
    //   31: newarray byte
    //   33: astore_2
    //   34: aload_2
    //   35: iconst_0
    //   36: aload_2
    //   37: arraylength
    //   38: invokestatic 466	com/google/android/gms/internal/measurement/zzabw:zzb	([BII)Lcom/google/android/gms/internal/measurement/zzabw;
    //   41: astore_3
    //   42: aload_1
    //   43: aload_3
    //   44: invokevirtual 469	com/google/android/gms/internal/measurement/zzace:zza	(Lcom/google/android/gms/internal/measurement/zzabw;)V
    //   47: aload_3
    //   48: invokevirtual 472	com/google/android/gms/internal/measurement/zzabw:zzve	()V
    //   51: aload_0
    //   52: invokevirtual 655	com/google/android/gms/internal/measurement/zzhg:zzgb	()Lcom/google/android/gms/internal/measurement/zzka;
    //   55: astore_3
    //   56: aload_2
    //   57: invokestatic 303	com/google/android/gms/common/internal/Preconditions:checkNotNull	(Ljava/lang/Object;)Ljava/lang/Object;
    //   60: pop
    //   61: aload_3
    //   62: invokevirtual 433	com/google/android/gms/internal/measurement/zzhg:zzab	()V
    //   65: ldc_w 657
    //   68: invokestatic 663	com/google/android/gms/internal/measurement/zzka:getMessageDigest	(Ljava/lang/String;)Ljava/security/MessageDigest;
    //   71: astore 4
    //   73: aload 4
    //   75: ifnonnull +111 -> 186
    //   78: aload_3
    //   79: invokevirtual 229	com/google/android/gms/internal/measurement/zzhg:zzge	()Lcom/google/android/gms/internal/measurement/zzfg;
    //   82: invokevirtual 235	com/google/android/gms/internal/measurement/zzfg:zzim	()Lcom/google/android/gms/internal/measurement/zzfi;
    //   85: ldc_w 665
    //   88: invokevirtual 270	com/google/android/gms/internal/measurement/zzfi:log	(Ljava/lang/String;)V
    //   91: lconst_0
    //   92: lstore 5
    //   94: new 305	android/content/ContentValues
    //   97: dup
    //   98: invokespecial 474	android/content/ContentValues:<init>	()V
    //   101: astore_3
    //   102: aload_3
    //   103: ldc_w 476
    //   106: aload_1
    //   107: getfield 651	com/google/android/gms/internal/measurement/zzkq:zzti	Ljava/lang/String;
    //   110: invokevirtual 309	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
    //   113: aload_3
    //   114: ldc_w 667
    //   117: lload 5
    //   119: invokestatic 275	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   122: invokevirtual 312	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Long;)V
    //   125: aload_3
    //   126: ldc_w 669
    //   129: aload_2
    //   130: invokevirtual 490	android/content/ContentValues:put	(Ljava/lang/String;[B)V
    //   133: aload_0
    //   134: invokevirtual 201	com/google/android/gms/internal/measurement/zzei:getWritableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   137: ldc_w 671
    //   140: aconst_null
    //   141: aload_3
    //   142: iconst_4
    //   143: invokevirtual 496	android/database/sqlite/SQLiteDatabase:insertWithOnConflict	(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;I)J
    //   146: pop2
    //   147: ldc_w 646
    //   150: invokestatic 192	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   153: lload 5
    //   155: lreturn
    //   156: astore_2
    //   157: aload_0
    //   158: invokevirtual 229	com/google/android/gms/internal/measurement/zzhg:zzge	()Lcom/google/android/gms/internal/measurement/zzfg;
    //   161: invokevirtual 235	com/google/android/gms/internal/measurement/zzfg:zzim	()Lcom/google/android/gms/internal/measurement/zzfi;
    //   164: ldc_w 673
    //   167: aload_1
    //   168: getfield 651	com/google/android/gms/internal/measurement/zzkq:zzti	Ljava/lang/String;
    //   171: invokestatic 448	com/google/android/gms/internal/measurement/zzfg:zzbm	(Ljava/lang/String;)Ljava/lang/Object;
    //   174: aload_2
    //   175: invokevirtual 243	com/google/android/gms/internal/measurement/zzfi:zze	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   178: ldc_w 646
    //   181: invokestatic 192	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   184: aload_2
    //   185: athrow
    //   186: aload 4
    //   188: aload_2
    //   189: invokevirtual 679	java/security/MessageDigest:digest	([B)[B
    //   192: invokestatic 683	com/google/android/gms/internal/measurement/zzka:zzc	([B)J
    //   195: lstore 5
    //   197: goto -103 -> 94
    //   200: astore_2
    //   201: aload_0
    //   202: invokevirtual 229	com/google/android/gms/internal/measurement/zzhg:zzge	()Lcom/google/android/gms/internal/measurement/zzfg;
    //   205: invokevirtual 235	com/google/android/gms/internal/measurement/zzfg:zzim	()Lcom/google/android/gms/internal/measurement/zzfi;
    //   208: ldc_w 685
    //   211: aload_1
    //   212: getfield 651	com/google/android/gms/internal/measurement/zzkq:zzti	Ljava/lang/String;
    //   215: invokestatic 448	com/google/android/gms/internal/measurement/zzfg:zzbm	(Ljava/lang/String;)Ljava/lang/Object;
    //   218: aload_2
    //   219: invokevirtual 243	com/google/android/gms/internal/measurement/zzfi:zze	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   222: ldc_w 646
    //   225: invokestatic 192	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   228: aload_2
    //   229: athrow
    //
    // Exception table:
    //   from	to	target	type
    //   27	51	156	java/io/IOException
    //   133	147	200	android/database/sqlite/SQLiteException
  }

  // ERROR //
  public final android.util.Pair<zzkn, Long> zza(String paramString, Long paramLong)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: ldc_w 687
    //   5: invokestatic 163	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   8: aload_0
    //   9: invokevirtual 433	com/google/android/gms/internal/measurement/zzhg:zzab	()V
    //   12: aload_0
    //   13: invokevirtual 430	com/google/android/gms/internal/measurement/zzjq:zzch	()V
    //   16: aload_0
    //   17: invokevirtual 201	com/google/android/gms/internal/measurement/zzei:getWritableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   20: ldc_w 689
    //   23: iconst_2
    //   24: anewarray 19	java/lang/String
    //   27: dup
    //   28: iconst_0
    //   29: aload_1
    //   30: aastore
    //   31: dup
    //   32: iconst_1
    //   33: aload_2
    //   34: invokestatic 378	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   37: aastore
    //   38: invokevirtual 207	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   41: astore 4
    //   43: aload 4
    //   45: astore 5
    //   47: aload 4
    //   49: invokeinterface 213 1 0
    //   54: ifne +42 -> 96
    //   57: aload 4
    //   59: astore 5
    //   61: aload_0
    //   62: invokevirtual 229	com/google/android/gms/internal/measurement/zzhg:zzge	()Lcom/google/android/gms/internal/measurement/zzfg;
    //   65: invokevirtual 692	com/google/android/gms/internal/measurement/zzfg:zzit	()Lcom/google/android/gms/internal/measurement/zzfi;
    //   68: ldc_w 694
    //   71: invokevirtual 270	com/google/android/gms/internal/measurement/zzfi:log	(Ljava/lang/String;)V
    //   74: aload 4
    //   76: ifnull +10 -> 86
    //   79: aload 4
    //   81: invokeinterface 220 1 0
    //   86: ldc_w 687
    //   89: invokestatic 192	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   92: aload_3
    //   93: astore_1
    //   94: aload_1
    //   95: areturn
    //   96: aload 4
    //   98: astore 5
    //   100: aload 4
    //   102: iconst_0
    //   103: invokeinterface 698 2 0
    //   108: astore 6
    //   110: aload 4
    //   112: astore 5
    //   114: aload 4
    //   116: iconst_1
    //   117: invokeinterface 217 2 0
    //   122: lstore 7
    //   124: aload 4
    //   126: astore 5
    //   128: aload 6
    //   130: iconst_0
    //   131: aload 6
    //   133: arraylength
    //   134: invokestatic 703	com/google/android/gms/internal/measurement/zzabv:zza	([BII)Lcom/google/android/gms/internal/measurement/zzabv;
    //   137: astore 6
    //   139: aload 4
    //   141: astore 5
    //   143: new 705	com/google/android/gms/internal/measurement/zzkn
    //   146: astore 9
    //   148: aload 4
    //   150: astore 5
    //   152: aload 9
    //   154: invokespecial 706	com/google/android/gms/internal/measurement/zzkn:<init>	()V
    //   157: aload 4
    //   159: astore 5
    //   161: aload 9
    //   163: aload 6
    //   165: invokevirtual 709	com/google/android/gms/internal/measurement/zzace:zzb	(Lcom/google/android/gms/internal/measurement/zzabv;)Lcom/google/android/gms/internal/measurement/zzace;
    //   168: pop
    //   169: aload 4
    //   171: astore 5
    //   173: aload 9
    //   175: lload 7
    //   177: invokestatic 275	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   180: invokestatic 715	android/util/Pair:create	(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;
    //   183: astore_1
    //   184: aload 4
    //   186: ifnull +10 -> 196
    //   189: aload 4
    //   191: invokeinterface 220 1 0
    //   196: ldc_w 687
    //   199: invokestatic 192	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   202: goto -108 -> 94
    //   205: astore 6
    //   207: aload 4
    //   209: astore 5
    //   211: aload_0
    //   212: invokevirtual 229	com/google/android/gms/internal/measurement/zzhg:zzge	()Lcom/google/android/gms/internal/measurement/zzfg;
    //   215: invokevirtual 235	com/google/android/gms/internal/measurement/zzfg:zzim	()Lcom/google/android/gms/internal/measurement/zzfi;
    //   218: ldc_w 717
    //   221: aload_1
    //   222: invokestatic 448	com/google/android/gms/internal/measurement/zzfg:zzbm	(Ljava/lang/String;)Ljava/lang/Object;
    //   225: aload_2
    //   226: aload 6
    //   228: invokevirtual 456	com/google/android/gms/internal/measurement/zzfi:zzd	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   231: aload 4
    //   233: ifnull +10 -> 243
    //   236: aload 4
    //   238: invokeinterface 220 1 0
    //   243: ldc_w 687
    //   246: invokestatic 192	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   249: aload_3
    //   250: astore_1
    //   251: goto -157 -> 94
    //   254: astore_1
    //   255: aconst_null
    //   256: astore 4
    //   258: aload 4
    //   260: astore 5
    //   262: aload_0
    //   263: invokevirtual 229	com/google/android/gms/internal/measurement/zzhg:zzge	()Lcom/google/android/gms/internal/measurement/zzfg;
    //   266: invokevirtual 235	com/google/android/gms/internal/measurement/zzfg:zzim	()Lcom/google/android/gms/internal/measurement/zzfi;
    //   269: ldc_w 719
    //   272: aload_1
    //   273: invokevirtual 265	com/google/android/gms/internal/measurement/zzfi:zzg	(Ljava/lang/String;Ljava/lang/Object;)V
    //   276: aload 4
    //   278: ifnull +10 -> 288
    //   281: aload 4
    //   283: invokeinterface 220 1 0
    //   288: ldc_w 687
    //   291: invokestatic 192	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   294: aload_3
    //   295: astore_1
    //   296: goto -202 -> 94
    //   299: astore_1
    //   300: aconst_null
    //   301: astore 5
    //   303: aload 5
    //   305: ifnull +10 -> 315
    //   308: aload 5
    //   310: invokeinterface 220 1 0
    //   315: ldc_w 687
    //   318: invokestatic 192	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   321: aload_1
    //   322: athrow
    //   323: astore_1
    //   324: goto -21 -> 303
    //   327: astore_1
    //   328: goto -70 -> 258
    //
    // Exception table:
    //   from	to	target	type
    //   161	169	205	java/io/IOException
    //   16	43	254	android/database/sqlite/SQLiteException
    //   16	43	299	finally
    //   47	57	323	finally
    //   61	74	323	finally
    //   100	110	323	finally
    //   114	124	323	finally
    //   128	139	323	finally
    //   143	148	323	finally
    //   152	157	323	finally
    //   161	169	323	finally
    //   173	184	323	finally
    //   211	231	323	finally
    //   262	276	323	finally
    //   47	57	327	android/database/sqlite/SQLiteException
    //   61	74	327	android/database/sqlite/SQLiteException
    //   100	110	327	android/database/sqlite/SQLiteException
    //   114	124	327	android/database/sqlite/SQLiteException
    //   128	139	327	android/database/sqlite/SQLiteException
    //   143	148	327	android/database/sqlite/SQLiteException
    //   152	157	327	android/database/sqlite/SQLiteException
    //   161	169	327	android/database/sqlite/SQLiteException
    //   173	184	327	android/database/sqlite/SQLiteException
    //   211	231	327	android/database/sqlite/SQLiteException
  }

  // ERROR //
  public final zzej zza(long paramLong, String paramString, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, boolean paramBoolean5)
  {
    // Byte code:
    //   0: ldc_w 722
    //   3: invokestatic 163	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: aload_3
    //   7: invokestatic 299	com/google/android/gms/common/internal/Preconditions:checkNotEmpty	(Ljava/lang/String;)Ljava/lang/String;
    //   10: pop
    //   11: aload_0
    //   12: invokevirtual 433	com/google/android/gms/internal/measurement/zzhg:zzab	()V
    //   15: aload_0
    //   16: invokevirtual 430	com/google/android/gms/internal/measurement/zzjq:zzch	()V
    //   19: new 724	com/google/android/gms/internal/measurement/zzej
    //   22: dup
    //   23: invokespecial 725	com/google/android/gms/internal/measurement/zzej:<init>	()V
    //   26: astore 9
    //   28: aload_0
    //   29: invokevirtual 201	com/google/android/gms/internal/measurement/zzei:getWritableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   32: astore 10
    //   34: aload 10
    //   36: ldc_w 727
    //   39: bipush 6
    //   41: anewarray 19	java/lang/String
    //   44: dup
    //   45: iconst_0
    //   46: ldc 69
    //   48: aastore
    //   49: dup
    //   50: iconst_1
    //   51: ldc 77
    //   53: aastore
    //   54: dup
    //   55: iconst_2
    //   56: ldc 73
    //   58: aastore
    //   59: dup
    //   60: iconst_3
    //   61: ldc 81
    //   63: aastore
    //   64: dup
    //   65: iconst_4
    //   66: ldc 105
    //   68: aastore
    //   69: dup
    //   70: iconst_5
    //   71: ldc 109
    //   73: aastore
    //   74: ldc_w 729
    //   77: iconst_1
    //   78: anewarray 19	java/lang/String
    //   81: dup
    //   82: iconst_0
    //   83: aload_3
    //   84: aastore
    //   85: aconst_null
    //   86: aconst_null
    //   87: aconst_null
    //   88: invokevirtual 421	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   91: astore 11
    //   93: aload 11
    //   95: astore 12
    //   97: aload 11
    //   99: invokeinterface 213 1 0
    //   104: ifne +45 -> 149
    //   107: aload 11
    //   109: astore 12
    //   111: aload_0
    //   112: invokevirtual 229	com/google/android/gms/internal/measurement/zzhg:zzge	()Lcom/google/android/gms/internal/measurement/zzfg;
    //   115: invokevirtual 338	com/google/android/gms/internal/measurement/zzfg:zzip	()Lcom/google/android/gms/internal/measurement/zzfi;
    //   118: ldc_w 731
    //   121: aload_3
    //   122: invokestatic 448	com/google/android/gms/internal/measurement/zzfg:zzbm	(Ljava/lang/String;)Ljava/lang/Object;
    //   125: invokevirtual 265	com/google/android/gms/internal/measurement/zzfi:zzg	(Ljava/lang/String;Ljava/lang/Object;)V
    //   128: aload 11
    //   130: ifnull +10 -> 140
    //   133: aload 11
    //   135: invokeinterface 220 1 0
    //   140: ldc_w 722
    //   143: invokestatic 192	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   146: aload 9
    //   148: areturn
    //   149: aload 11
    //   151: astore 12
    //   153: aload 11
    //   155: iconst_0
    //   156: invokeinterface 217 2 0
    //   161: lload_1
    //   162: lcmp
    //   163: ifne +88 -> 251
    //   166: aload 11
    //   168: astore 12
    //   170: aload 9
    //   172: aload 11
    //   174: iconst_1
    //   175: invokeinterface 217 2 0
    //   180: putfield 735	com/google/android/gms/internal/measurement/zzej:zzafe	J
    //   183: aload 11
    //   185: astore 12
    //   187: aload 9
    //   189: aload 11
    //   191: iconst_2
    //   192: invokeinterface 217 2 0
    //   197: putfield 738	com/google/android/gms/internal/measurement/zzej:zzafd	J
    //   200: aload 11
    //   202: astore 12
    //   204: aload 9
    //   206: aload 11
    //   208: iconst_3
    //   209: invokeinterface 217 2 0
    //   214: putfield 741	com/google/android/gms/internal/measurement/zzej:zzaff	J
    //   217: aload 11
    //   219: astore 12
    //   221: aload 9
    //   223: aload 11
    //   225: iconst_4
    //   226: invokeinterface 217 2 0
    //   231: putfield 744	com/google/android/gms/internal/measurement/zzej:zzafg	J
    //   234: aload 11
    //   236: astore 12
    //   238: aload 9
    //   240: aload 11
    //   242: iconst_5
    //   243: invokeinterface 217 2 0
    //   248: putfield 747	com/google/android/gms/internal/measurement/zzej:zzafh	J
    //   251: iload 4
    //   253: ifeq +19 -> 272
    //   256: aload 11
    //   258: astore 12
    //   260: aload 9
    //   262: aload 9
    //   264: getfield 735	com/google/android/gms/internal/measurement/zzej:zzafe	J
    //   267: lconst_1
    //   268: ladd
    //   269: putfield 735	com/google/android/gms/internal/measurement/zzej:zzafe	J
    //   272: iload 5
    //   274: ifeq +19 -> 293
    //   277: aload 11
    //   279: astore 12
    //   281: aload 9
    //   283: aload 9
    //   285: getfield 738	com/google/android/gms/internal/measurement/zzej:zzafd	J
    //   288: lconst_1
    //   289: ladd
    //   290: putfield 738	com/google/android/gms/internal/measurement/zzej:zzafd	J
    //   293: iload 6
    //   295: ifeq +19 -> 314
    //   298: aload 11
    //   300: astore 12
    //   302: aload 9
    //   304: aload 9
    //   306: getfield 741	com/google/android/gms/internal/measurement/zzej:zzaff	J
    //   309: lconst_1
    //   310: ladd
    //   311: putfield 741	com/google/android/gms/internal/measurement/zzej:zzaff	J
    //   314: iload 7
    //   316: ifeq +19 -> 335
    //   319: aload 11
    //   321: astore 12
    //   323: aload 9
    //   325: aload 9
    //   327: getfield 744	com/google/android/gms/internal/measurement/zzej:zzafg	J
    //   330: lconst_1
    //   331: ladd
    //   332: putfield 744	com/google/android/gms/internal/measurement/zzej:zzafg	J
    //   335: iload 8
    //   337: ifeq +19 -> 356
    //   340: aload 11
    //   342: astore 12
    //   344: aload 9
    //   346: aload 9
    //   348: getfield 747	com/google/android/gms/internal/measurement/zzej:zzafh	J
    //   351: lconst_1
    //   352: ladd
    //   353: putfield 747	com/google/android/gms/internal/measurement/zzej:zzafh	J
    //   356: aload 11
    //   358: astore 12
    //   360: new 305	android/content/ContentValues
    //   363: astore 13
    //   365: aload 11
    //   367: astore 12
    //   369: aload 13
    //   371: invokespecial 474	android/content/ContentValues:<init>	()V
    //   374: aload 11
    //   376: astore 12
    //   378: aload 13
    //   380: ldc 69
    //   382: lload_1
    //   383: invokestatic 275	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   386: invokevirtual 312	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Long;)V
    //   389: aload 11
    //   391: astore 12
    //   393: aload 13
    //   395: ldc 73
    //   397: aload 9
    //   399: getfield 738	com/google/android/gms/internal/measurement/zzej:zzafd	J
    //   402: invokestatic 275	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   405: invokevirtual 312	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Long;)V
    //   408: aload 11
    //   410: astore 12
    //   412: aload 13
    //   414: ldc 77
    //   416: aload 9
    //   418: getfield 735	com/google/android/gms/internal/measurement/zzej:zzafe	J
    //   421: invokestatic 275	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   424: invokevirtual 312	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Long;)V
    //   427: aload 11
    //   429: astore 12
    //   431: aload 13
    //   433: ldc 81
    //   435: aload 9
    //   437: getfield 741	com/google/android/gms/internal/measurement/zzej:zzaff	J
    //   440: invokestatic 275	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   443: invokevirtual 312	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Long;)V
    //   446: aload 11
    //   448: astore 12
    //   450: aload 13
    //   452: ldc 105
    //   454: aload 9
    //   456: getfield 744	com/google/android/gms/internal/measurement/zzej:zzafg	J
    //   459: invokestatic 275	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   462: invokevirtual 312	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Long;)V
    //   465: aload 11
    //   467: astore 12
    //   469: aload 13
    //   471: ldc 109
    //   473: aload 9
    //   475: getfield 747	com/google/android/gms/internal/measurement/zzej:zzafh	J
    //   478: invokestatic 275	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   481: invokevirtual 312	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Long;)V
    //   484: aload 11
    //   486: astore 12
    //   488: aload 10
    //   490: ldc_w 727
    //   493: aload 13
    //   495: ldc_w 729
    //   498: iconst_1
    //   499: anewarray 19	java/lang/String
    //   502: dup
    //   503: iconst_0
    //   504: aload_3
    //   505: aastore
    //   506: invokevirtual 751	android/database/sqlite/SQLiteDatabase:update	(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
    //   509: pop
    //   510: aload 11
    //   512: ifnull +10 -> 522
    //   515: aload 11
    //   517: invokeinterface 220 1 0
    //   522: ldc_w 722
    //   525: invokestatic 192	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   528: goto -382 -> 146
    //   531: astore 10
    //   533: aconst_null
    //   534: astore 11
    //   536: aload 11
    //   538: astore 12
    //   540: aload_0
    //   541: invokevirtual 229	com/google/android/gms/internal/measurement/zzhg:zzge	()Lcom/google/android/gms/internal/measurement/zzfg;
    //   544: invokevirtual 235	com/google/android/gms/internal/measurement/zzfg:zzim	()Lcom/google/android/gms/internal/measurement/zzfi;
    //   547: ldc_w 753
    //   550: aload_3
    //   551: invokestatic 448	com/google/android/gms/internal/measurement/zzfg:zzbm	(Ljava/lang/String;)Ljava/lang/Object;
    //   554: aload 10
    //   556: invokevirtual 243	com/google/android/gms/internal/measurement/zzfi:zze	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   559: aload 11
    //   561: ifnull +10 -> 571
    //   564: aload 11
    //   566: invokeinterface 220 1 0
    //   571: ldc_w 722
    //   574: invokestatic 192	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   577: goto -431 -> 146
    //   580: astore_3
    //   581: aconst_null
    //   582: astore 12
    //   584: aload 12
    //   586: ifnull +10 -> 596
    //   589: aload 12
    //   591: invokeinterface 220 1 0
    //   596: ldc_w 722
    //   599: invokestatic 192	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   602: aload_3
    //   603: athrow
    //   604: astore_3
    //   605: goto -21 -> 584
    //   608: astore 10
    //   610: goto -74 -> 536
    //
    // Exception table:
    //   from	to	target	type
    //   28	93	531	android/database/sqlite/SQLiteException
    //   28	93	580	finally
    //   97	107	604	finally
    //   111	128	604	finally
    //   153	166	604	finally
    //   170	183	604	finally
    //   187	200	604	finally
    //   204	217	604	finally
    //   221	234	604	finally
    //   238	251	604	finally
    //   260	272	604	finally
    //   281	293	604	finally
    //   302	314	604	finally
    //   323	335	604	finally
    //   344	356	604	finally
    //   360	365	604	finally
    //   369	374	604	finally
    //   378	389	604	finally
    //   393	408	604	finally
    //   412	427	604	finally
    //   431	446	604	finally
    //   450	465	604	finally
    //   469	484	604	finally
    //   488	510	604	finally
    //   540	559	604	finally
    //   97	107	608	android/database/sqlite/SQLiteException
    //   111	128	608	android/database/sqlite/SQLiteException
    //   153	166	608	android/database/sqlite/SQLiteException
    //   170	183	608	android/database/sqlite/SQLiteException
    //   187	200	608	android/database/sqlite/SQLiteException
    //   204	217	608	android/database/sqlite/SQLiteException
    //   221	234	608	android/database/sqlite/SQLiteException
    //   238	251	608	android/database/sqlite/SQLiteException
    //   260	272	608	android/database/sqlite/SQLiteException
    //   281	293	608	android/database/sqlite/SQLiteException
    //   302	314	608	android/database/sqlite/SQLiteException
    //   323	335	608	android/database/sqlite/SQLiteException
    //   344	356	608	android/database/sqlite/SQLiteException
    //   360	365	608	android/database/sqlite/SQLiteException
    //   369	374	608	android/database/sqlite/SQLiteException
    //   378	389	608	android/database/sqlite/SQLiteException
    //   393	408	608	android/database/sqlite/SQLiteException
    //   412	427	608	android/database/sqlite/SQLiteException
    //   431	446	608	android/database/sqlite/SQLiteException
    //   450	465	608	android/database/sqlite/SQLiteException
    //   469	484	608	android/database/sqlite/SQLiteException
    //   488	510	608	android/database/sqlite/SQLiteException
  }

  public final void zza(zzdy paramzzdy)
  {
    AppMethodBeat.i(68658);
    Preconditions.checkNotNull(paramzzdy);
    zzab();
    zzch();
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("app_id", paramzzdy.zzah());
    localContentValues.put("app_instance_id", paramzzdy.getAppInstanceId());
    localContentValues.put("gmp_app_id", paramzzdy.getGmpAppId());
    localContentValues.put("resettable_device_id_hash", paramzzdy.zzgi());
    localContentValues.put("last_bundle_index", Long.valueOf(paramzzdy.zzgq()));
    localContentValues.put("last_bundle_start_timestamp", Long.valueOf(paramzzdy.zzgk()));
    localContentValues.put("last_bundle_end_timestamp", Long.valueOf(paramzzdy.zzgl()));
    localContentValues.put("app_version", paramzzdy.zzag());
    localContentValues.put("app_store", paramzzdy.zzgn());
    localContentValues.put("gmp_version", Long.valueOf(paramzzdy.zzgo()));
    localContentValues.put("dev_cert_hash", Long.valueOf(paramzzdy.zzgp()));
    localContentValues.put("measurement_enabled", Boolean.valueOf(paramzzdy.isMeasurementEnabled()));
    localContentValues.put("day", Long.valueOf(paramzzdy.zzgu()));
    localContentValues.put("daily_public_events_count", Long.valueOf(paramzzdy.zzgv()));
    localContentValues.put("daily_events_count", Long.valueOf(paramzzdy.zzgw()));
    localContentValues.put("daily_conversions_count", Long.valueOf(paramzzdy.zzgx()));
    localContentValues.put("config_fetched_time", Long.valueOf(paramzzdy.zzgr()));
    localContentValues.put("failed_config_fetch_time", Long.valueOf(paramzzdy.zzgs()));
    localContentValues.put("app_version_int", Long.valueOf(paramzzdy.zzgm()));
    localContentValues.put("firebase_instance_id", paramzzdy.zzgj());
    localContentValues.put("daily_error_events_count", Long.valueOf(paramzzdy.zzgz()));
    localContentValues.put("daily_realtime_events_count", Long.valueOf(paramzzdy.zzgy()));
    localContentValues.put("health_monitor_sample", paramzzdy.zzha());
    localContentValues.put("android_id", Long.valueOf(paramzzdy.zzhc()));
    localContentValues.put("adid_reporting_enabled", Boolean.valueOf(paramzzdy.zzhd()));
    localContentValues.put("ssaid_reporting_enabled", Boolean.valueOf(paramzzdy.zzhe()));
    try
    {
      SQLiteDatabase localSQLiteDatabase = getWritableDatabase();
      if ((localSQLiteDatabase.update("apps", localContentValues, "app_id = ?", new String[] { paramzzdy.zzah() }) == 0L) && (localSQLiteDatabase.insertWithOnConflict("apps", null, localContentValues, 5) == -1L))
        zzge().zzim().zzg("Failed to insert/update app (got -1). appId", zzfg.zzbm(paramzzdy.zzah()));
      AppMethodBeat.o(68658);
      return;
    }
    catch (SQLiteException localSQLiteException)
    {
      while (true)
      {
        zzge().zzim().zze("Error storing app. appId", zzfg.zzbm(paramzzdy.zzah()), localSQLiteException);
        AppMethodBeat.o(68658);
      }
    }
  }

  public final void zza(zzeq paramzzeq)
  {
    Object localObject1 = null;
    AppMethodBeat.i(68646);
    Preconditions.checkNotNull(paramzzeq);
    zzab();
    zzch();
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("app_id", paramzzeq.zzti);
    localContentValues.put("name", paramzzeq.name);
    localContentValues.put("lifetime_count", Long.valueOf(paramzzeq.zzafr));
    localContentValues.put("current_bundle_count", Long.valueOf(paramzzeq.zzafs));
    localContentValues.put("last_fire_timestamp", Long.valueOf(paramzzeq.zzaft));
    localContentValues.put("last_bundled_timestamp", Long.valueOf(paramzzeq.zzafu));
    localContentValues.put("last_sampled_complex_event_id", paramzzeq.zzafv);
    localContentValues.put("last_sampling_rate", paramzzeq.zzafw);
    Object localObject2 = localObject1;
    if (paramzzeq.zzafx != null)
    {
      localObject2 = localObject1;
      if (paramzzeq.zzafx.booleanValue())
        localObject2 = Long.valueOf(1L);
    }
    localContentValues.put("last_exempt_from_sampling", (Long)localObject2);
    try
    {
      if (getWritableDatabase().insertWithOnConflict("events", null, localContentValues, 5) == -1L)
        zzge().zzim().zzg("Failed to insert/update event aggregates (got -1). appId", zzfg.zzbm(paramzzeq.zzti));
      AppMethodBeat.o(68646);
      return;
    }
    catch (SQLiteException localSQLiteException)
    {
      while (true)
      {
        zzge().zzim().zze("Error storing event aggregates. appId", zzfg.zzbm(paramzzeq.zzti), localSQLiteException);
        AppMethodBeat.o(68646);
      }
    }
  }

  final void zza(String paramString, zzkd[] paramArrayOfzzkd)
  {
    int i = 0;
    AppMethodBeat.i(68668);
    zzch();
    zzab();
    Preconditions.checkNotEmpty(paramString);
    Preconditions.checkNotNull(paramArrayOfzzkd);
    SQLiteDatabase localSQLiteDatabase = getWritableDatabase();
    localSQLiteDatabase.beginTransaction();
    Object localObject1;
    int k;
    int m;
    while (true)
    {
      try
      {
        zzch();
        zzab();
        Preconditions.checkNotEmpty(paramString);
        localObject1 = getWritableDatabase();
        ((SQLiteDatabase)localObject1).delete("property_filters", "app_id=?", new String[] { paramString });
        ((SQLiteDatabase)localObject1).delete("event_filters", "app_id=?", new String[] { paramString });
        int j = paramArrayOfzzkd.length;
        k = 0;
        if (k >= j)
          break label524;
        localObject1 = paramArrayOfzzkd[k];
        zzch();
        zzab();
        Preconditions.checkNotEmpty(paramString);
        Preconditions.checkNotNull(localObject1);
        Preconditions.checkNotNull(((zzkd)localObject1).zzarn);
        Preconditions.checkNotNull(((zzkd)localObject1).zzarm);
        if (((zzkd)localObject1).zzarl == null)
        {
          zzge().zzip().zzg("Audience with no ID. appId", zzfg.zzbm(paramString));
          k++;
          continue;
        }
        m = ((zzkd)localObject1).zzarl.intValue();
        localObject2 = ((zzkd)localObject1).zzarn;
        n = localObject2.length;
        i1 = 0;
        if (i1 >= n)
          break;
        if (localObject2[i1].zzarp == null)
        {
          zzge().zzip().zze("Event filter with no ID. Audience definition ignored. appId, audienceId", zzfg.zzbm(paramString), ((zzkd)localObject1).zzarl);
          continue;
        }
      }
      finally
      {
        localSQLiteDatabase.endTransaction();
        AppMethodBeat.o(68668);
      }
      i1++;
    }
    Object localObject2 = ((zzkd)localObject1).zzarm;
    int n = localObject2.length;
    for (int i1 = 0; ; i1++)
    {
      if (i1 >= n)
        break label336;
      if (localObject2[i1].zzarp == null)
      {
        zzge().zzip().zze("Property filter with no ID. Audience definition ignored. appId, audienceId", zzfg.zzbm(paramString), ((zzkd)localObject1).zzarl);
        break;
      }
    }
    label336: localObject2 = ((zzkd)localObject1).zzarn;
    n = localObject2.length;
    i1 = 0;
    label351: if (i1 < n)
      if (zza(paramString, m, localObject2[i1]));
    for (i1 = 0; ; i1 = 1)
    {
      n = i1;
      int i2;
      if (i1 != 0)
      {
        localObject1 = ((zzkd)localObject1).zzarm;
        i2 = localObject1.length;
      }
      for (int i3 = 0; ; i3++)
      {
        n = i1;
        if (i3 < i2)
        {
          if (!zza(paramString, m, localObject1[i3]))
            n = 0;
        }
        else
        {
          if (n != 0)
            break;
          zzch();
          zzab();
          Preconditions.checkNotEmpty(paramString);
          localObject1 = getWritableDatabase();
          ((SQLiteDatabase)localObject1).delete("property_filters", "app_id=? and audience_id=?", new String[] { paramString, String.valueOf(m) });
          ((SQLiteDatabase)localObject1).delete("event_filters", "app_id=? and audience_id=?", new String[] { paramString, String.valueOf(m) });
          break;
          i1++;
          break label351;
        }
      }
      label524: localObject1 = new java/util/ArrayList;
      ((ArrayList)localObject1).<init>();
      k = paramArrayOfzzkd.length;
      for (i1 = i; i1 < k; i1++)
        ((List)localObject1).add(paramArrayOfzzkd[i1].zzarl);
      zza(paramString, (List)localObject1);
      localSQLiteDatabase.setTransactionSuccessful();
      localSQLiteDatabase.endTransaction();
      AppMethodBeat.o(68668);
      return;
    }
  }

  public final boolean zza(zzed paramzzed)
  {
    boolean bool = false;
    AppMethodBeat.i(68652);
    Preconditions.checkNotNull(paramzzed);
    zzab();
    zzch();
    if (zzh(paramzzed.packageName, paramzzed.zzaep.name) == null)
      if (zza("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[] { paramzzed.packageName }) >= 1000L)
        AppMethodBeat.o(68652);
    while (true)
    {
      return bool;
      ContentValues localContentValues = new ContentValues();
      localContentValues.put("app_id", paramzzed.packageName);
      localContentValues.put("origin", paramzzed.origin);
      localContentValues.put("name", paramzzed.zzaep.name);
      zza(localContentValues, "value", paramzzed.zzaep.getValue());
      localContentValues.put("active", Boolean.valueOf(paramzzed.active));
      localContentValues.put("trigger_event_name", paramzzed.triggerEventName);
      localContentValues.put("trigger_timeout", Long.valueOf(paramzzed.triggerTimeout));
      zzgb();
      localContentValues.put("timed_out_event", zzka.zza(paramzzed.zzaeq));
      localContentValues.put("creation_timestamp", Long.valueOf(paramzzed.creationTimestamp));
      zzgb();
      localContentValues.put("triggered_event", zzka.zza(paramzzed.zzaer));
      localContentValues.put("triggered_timestamp", Long.valueOf(paramzzed.zzaep.zzaqz));
      localContentValues.put("time_to_live", Long.valueOf(paramzzed.timeToLive));
      zzgb();
      localContentValues.put("expired_event", zzka.zza(paramzzed.zzaes));
      try
      {
        if (getWritableDatabase().insertWithOnConflict("conditional_properties", null, localContentValues, 5) == -1L)
          zzge().zzim().zzg("Failed to insert/update conditional user property (got -1)", zzfg.zzbm(paramzzed.packageName));
        AppMethodBeat.o(68652);
        bool = true;
      }
      catch (SQLiteException localSQLiteException)
      {
        while (true)
          zzge().zzim().zze("Error storing conditional user property", zzfg.zzbm(paramzzed.packageName), localSQLiteException);
      }
    }
  }

  public final boolean zza(zzep paramzzep, long paramLong, boolean paramBoolean)
  {
    boolean bool = false;
    AppMethodBeat.i(68688);
    zzab();
    zzch();
    Preconditions.checkNotNull(paramzzep);
    Preconditions.checkNotEmpty(paramzzep.zzti);
    Object localObject1 = new zzkn();
    ((zzkn)localObject1).zzatc = Long.valueOf(paramzzep.zzafp);
    ((zzkn)localObject1).zzata = new zzko[paramzzep.zzafq.size()];
    Object localObject2 = paramzzep.zzafq.iterator();
    Object localObject4;
    for (int i = 0; ((Iterator)localObject2).hasNext(); i++)
    {
      Object localObject3 = (String)((Iterator)localObject2).next();
      localObject4 = new zzko();
      ((zzkn)localObject1).zzata[i] = localObject4;
      ((zzko)localObject4).name = ((String)localObject3);
      localObject3 = paramzzep.zzafq.get((String)localObject3);
      zzgb().zza((zzko)localObject4, localObject3);
    }
    try
    {
      localObject4 = new byte[((zzace)localObject1).zzvm()];
      localObject2 = zzabw.zzb((byte[])localObject4, 0, localObject4.length);
      ((zzace)localObject1).zza((zzabw)localObject2);
      ((zzabw)localObject2).zzve();
      zzge().zzit().zze("Saving event, name, data size", zzga().zzbj(paramzzep.name), Integer.valueOf(localObject4.length));
      localObject1 = new ContentValues();
      ((ContentValues)localObject1).put("app_id", paramzzep.zzti);
      ((ContentValues)localObject1).put("name", paramzzep.name);
      ((ContentValues)localObject1).put("timestamp", Long.valueOf(paramzzep.timestamp));
      ((ContentValues)localObject1).put("metadata_fingerprint", Long.valueOf(paramLong));
      ((ContentValues)localObject1).put("data", (byte[])localObject4);
      if (paramBoolean)
      {
        i = 1;
        ((ContentValues)localObject1).put("realtime", Integer.valueOf(i));
      }
    }
    catch (IOException localIOException)
    {
      try
      {
        if (getWritableDatabase().insert("raw_events", null, (ContentValues)localObject1) == -1L)
        {
          zzge().zzim().zzg("Failed to insert raw event (got -1). appId", zzfg.zzbm(paramzzep.zzti));
          AppMethodBeat.o(68688);
          for (paramBoolean = bool; ; paramBoolean = bool)
          {
            return paramBoolean;
            localIOException = localIOException;
            zzge().zzim().zze("Data loss. Failed to serialize event params/data. appId", zzfg.zzbm(paramzzep.zzti), localIOException);
            AppMethodBeat.o(68688);
          }
          i = 0;
        }
      }
      catch (SQLiteException localSQLiteException)
      {
        while (true)
        {
          zzge().zzim().zze("Error storing raw event. appId", zzfg.zzbm(paramzzep.zzti), localSQLiteException);
          AppMethodBeat.o(68688);
          paramBoolean = bool;
          continue;
          AppMethodBeat.o(68688);
          paramBoolean = true;
        }
      }
    }
  }

  public final boolean zza(zzjz paramzzjz)
  {
    boolean bool = false;
    AppMethodBeat.i(68648);
    Preconditions.checkNotNull(paramzzjz);
    zzab();
    zzch();
    if (zzh(paramzzjz.zzti, paramzzjz.name) == null)
      if (zzka.zzcc(paramzzjz.name))
      {
        if (zza("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[] { paramzzjz.zzti }) < 25L)
          break label120;
        AppMethodBeat.o(68648);
      }
    while (true)
    {
      return bool;
      if (zza("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[] { paramzzjz.zzti, paramzzjz.origin }) >= 25L)
      {
        AppMethodBeat.o(68648);
        continue;
      }
      label120: ContentValues localContentValues = new ContentValues();
      localContentValues.put("app_id", paramzzjz.zzti);
      localContentValues.put("origin", paramzzjz.origin);
      localContentValues.put("name", paramzzjz.name);
      localContentValues.put("set_timestamp", Long.valueOf(paramzzjz.zzaqz));
      zza(localContentValues, "value", paramzzjz.value);
      try
      {
        if (getWritableDatabase().insertWithOnConflict("user_attributes", null, localContentValues, 5) == -1L)
          zzge().zzim().zzg("Failed to insert/update user property (got -1). appId", zzfg.zzbm(paramzzjz.zzti));
        AppMethodBeat.o(68648);
        bool = true;
      }
      catch (SQLiteException localSQLiteException)
      {
        while (true)
          zzge().zzim().zze("Error storing user property. appId", zzfg.zzbm(paramzzjz.zzti), localSQLiteException);
      }
    }
  }

  public final boolean zza(zzkq paramzzkq, boolean paramBoolean)
  {
    boolean bool = false;
    AppMethodBeat.i(68662);
    zzab();
    zzch();
    Preconditions.checkNotNull(paramzzkq);
    Preconditions.checkNotEmpty(paramzzkq.zzti);
    Preconditions.checkNotNull(paramzzkq.zzatm);
    zzhp();
    long l = zzbt().currentTimeMillis();
    if ((paramzzkq.zzatm.longValue() < l - zzef.zzhh()) || (paramzzkq.zzatm.longValue() > zzef.zzhh() + l))
      zzge().zzip().zzd("Storing bundle outside of the max uploading time span. appId, now, timestamp", zzfg.zzbm(paramzzkq.zzti), Long.valueOf(l), paramzzkq.zzatm);
    try
    {
      localObject1 = new byte[paramzzkq.zzvm()];
      Object localObject2 = zzabw.zzb((byte[])localObject1, 0, localObject1.length);
      paramzzkq.zza((zzabw)localObject2);
      ((zzabw)localObject2).zzve();
      localObject2 = zzgb().zza((byte[])localObject1);
      zzge().zzit().zzg("Saving bundle, size", Integer.valueOf(localObject2.length));
      localObject1 = new ContentValues();
      ((ContentValues)localObject1).put("app_id", paramzzkq.zzti);
      ((ContentValues)localObject1).put("bundle_end_timestamp", paramzzkq.zzatm);
      ((ContentValues)localObject1).put("data", (byte[])localObject2);
      if (paramBoolean)
      {
        i = 1;
        ((ContentValues)localObject1).put("has_realtime", Integer.valueOf(i));
        if (paramzzkq.zzauj != null)
          ((ContentValues)localObject1).put("retry_count", paramzzkq.zzauj);
      }
    }
    catch (IOException localIOException)
    {
      try
      {
        Object localObject1;
        int i;
        if (getWritableDatabase().insert("queue", null, (ContentValues)localObject1) == -1L)
        {
          zzge().zzim().zzg("Failed to insert bundle (got -1). appId", zzfg.zzbm(paramzzkq.zzti));
          AppMethodBeat.o(68662);
          for (paramBoolean = bool; ; paramBoolean = bool)
          {
            return paramBoolean;
            localIOException = localIOException;
            zzge().zzim().zze("Data loss. Failed to serialize bundle. appId", zzfg.zzbm(paramzzkq.zzti), localIOException);
            AppMethodBeat.o(68662);
          }
          i = 0;
        }
      }
      catch (SQLiteException localSQLiteException)
      {
        while (true)
        {
          zzge().zzim().zze("Error storing bundle. appId", zzfg.zzbm(paramzzkq.zzti), localSQLiteException);
          AppMethodBeat.o(68662);
          paramBoolean = bool;
          continue;
          AppMethodBeat.o(68662);
          paramBoolean = true;
        }
      }
    }
  }

  public final boolean zza(String paramString, Long paramLong, long paramLong1, zzkn paramzzkn)
  {
    boolean bool = false;
    AppMethodBeat.i(68687);
    zzab();
    zzch();
    Preconditions.checkNotNull(paramzzkn);
    Preconditions.checkNotEmpty(paramString);
    Preconditions.checkNotNull(paramLong);
    try
    {
      byte[] arrayOfByte = new byte[paramzzkn.zzvm()];
      zzabw localzzabw = zzabw.zzb(arrayOfByte, 0, arrayOfByte.length);
      paramzzkn.zza(localzzabw);
      localzzabw.zzve();
      zzge().zzit().zze("Saving complex main event, appId, data size", zzga().zzbj(paramString), Integer.valueOf(arrayOfByte.length));
      paramzzkn = new ContentValues();
      paramzzkn.put("app_id", paramString);
      paramzzkn.put("event_id", paramLong);
      paramzzkn.put("children_to_process", Long.valueOf(paramLong1));
      paramzzkn.put("main_event", arrayOfByte);
    }
    catch (IOException paramzzkn)
    {
      try
      {
        if (getWritableDatabase().insertWithOnConflict("main_event_params", null, paramzzkn, 5) == -1L)
        {
          zzge().zzim().zzg("Failed to insert complex main event (got -1). appId", zzfg.zzbm(paramString));
          AppMethodBeat.o(68687);
          while (true)
          {
            return bool;
            paramzzkn = paramzzkn;
            zzge().zzim().zzd("Data loss. Failed to serialize event params/data. appId, eventId", zzfg.zzbm(paramString), paramLong, paramzzkn);
            AppMethodBeat.o(68687);
          }
        }
      }
      catch (SQLiteException paramLong)
      {
        while (true)
        {
          zzge().zzim().zze("Error storing complex main event. appId", zzfg.zzbm(paramString), paramLong);
          AppMethodBeat.o(68687);
          continue;
          bool = true;
          AppMethodBeat.o(68687);
        }
      }
    }
  }

  // ERROR //
  public final String zzab(long paramLong)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: ldc_w 1181
    //   5: invokestatic 163	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   8: aload_0
    //   9: invokevirtual 433	com/google/android/gms/internal/measurement/zzhg:zzab	()V
    //   12: aload_0
    //   13: invokevirtual 430	com/google/android/gms/internal/measurement/zzjq:zzch	()V
    //   16: aload_0
    //   17: invokevirtual 201	com/google/android/gms/internal/measurement/zzei:getWritableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   20: ldc_w 1183
    //   23: iconst_1
    //   24: anewarray 19	java/lang/String
    //   27: dup
    //   28: iconst_0
    //   29: lload_1
    //   30: invokestatic 1185	java/lang/String:valueOf	(J)Ljava/lang/String;
    //   33: aastore
    //   34: invokevirtual 207	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   37: astore 4
    //   39: aload 4
    //   41: astore 5
    //   43: aload 4
    //   45: invokeinterface 213 1 0
    //   50: ifne +44 -> 94
    //   53: aload 4
    //   55: astore 5
    //   57: aload_0
    //   58: invokevirtual 229	com/google/android/gms/internal/measurement/zzhg:zzge	()Lcom/google/android/gms/internal/measurement/zzfg;
    //   61: invokevirtual 692	com/google/android/gms/internal/measurement/zzfg:zzit	()Lcom/google/android/gms/internal/measurement/zzfi;
    //   64: ldc_w 1187
    //   67: invokevirtual 270	com/google/android/gms/internal/measurement/zzfi:log	(Ljava/lang/String;)V
    //   70: aload 4
    //   72: ifnull +10 -> 82
    //   75: aload 4
    //   77: invokeinterface 220 1 0
    //   82: ldc_w 1181
    //   85: invokestatic 192	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   88: aload_3
    //   89: astore 5
    //   91: aload 5
    //   93: areturn
    //   94: aload 4
    //   96: astore 5
    //   98: aload 4
    //   100: iconst_0
    //   101: invokeinterface 288 2 0
    //   106: astore 6
    //   108: aload 6
    //   110: astore 5
    //   112: aload 4
    //   114: ifnull +10 -> 124
    //   117: aload 4
    //   119: invokeinterface 220 1 0
    //   124: ldc_w 1181
    //   127: invokestatic 192	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   130: goto -39 -> 91
    //   133: astore 6
    //   135: aconst_null
    //   136: astore 4
    //   138: aload 4
    //   140: astore 5
    //   142: aload_0
    //   143: invokevirtual 229	com/google/android/gms/internal/measurement/zzhg:zzge	()Lcom/google/android/gms/internal/measurement/zzfg;
    //   146: invokevirtual 235	com/google/android/gms/internal/measurement/zzfg:zzim	()Lcom/google/android/gms/internal/measurement/zzfi;
    //   149: ldc_w 1189
    //   152: aload 6
    //   154: invokevirtual 265	com/google/android/gms/internal/measurement/zzfi:zzg	(Ljava/lang/String;Ljava/lang/Object;)V
    //   157: aload 4
    //   159: ifnull +10 -> 169
    //   162: aload 4
    //   164: invokeinterface 220 1 0
    //   169: ldc_w 1181
    //   172: invokestatic 192	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   175: aload_3
    //   176: astore 5
    //   178: goto -87 -> 91
    //   181: astore 5
    //   183: aconst_null
    //   184: astore 4
    //   186: aload 5
    //   188: astore 6
    //   190: aload 4
    //   192: ifnull +10 -> 202
    //   195: aload 4
    //   197: invokeinterface 220 1 0
    //   202: ldc_w 1181
    //   205: invokestatic 192	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   208: aload 6
    //   210: athrow
    //   211: astore 6
    //   213: aload 5
    //   215: astore 4
    //   217: goto -27 -> 190
    //   220: astore 6
    //   222: goto -84 -> 138
    //
    // Exception table:
    //   from	to	target	type
    //   16	39	133	android/database/sqlite/SQLiteException
    //   16	39	181	finally
    //   43	53	211	finally
    //   57	70	211	finally
    //   98	108	211	finally
    //   142	157	211	finally
    //   43	53	220	android/database/sqlite/SQLiteException
    //   57	70	220	android/database/sqlite/SQLiteException
    //   98	108	220	android/database/sqlite/SQLiteException
  }

  // ERROR //
  public final List<android.util.Pair<zzkq, Long>> zzb(String paramString, int paramInt1, int paramInt2)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore 4
    //   3: ldc_w 1191
    //   6: invokestatic 163	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   9: aload_0
    //   10: invokevirtual 433	com/google/android/gms/internal/measurement/zzhg:zzab	()V
    //   13: aload_0
    //   14: invokevirtual 430	com/google/android/gms/internal/measurement/zzjq:zzch	()V
    //   17: iload_2
    //   18: ifle +120 -> 138
    //   21: iconst_1
    //   22: istore 5
    //   24: iload 5
    //   26: invokestatic 1195	com/google/android/gms/common/internal/Preconditions:checkArgument	(Z)V
    //   29: iload_3
    //   30: ifle +114 -> 144
    //   33: iload 4
    //   35: istore 5
    //   37: iload 5
    //   39: invokestatic 1195	com/google/android/gms/common/internal/Preconditions:checkArgument	(Z)V
    //   42: aload_1
    //   43: invokestatic 299	com/google/android/gms/common/internal/Preconditions:checkNotEmpty	(Ljava/lang/String;)Ljava/lang/String;
    //   46: pop
    //   47: aload_0
    //   48: invokevirtual 201	com/google/android/gms/internal/measurement/zzei:getWritableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   51: ldc_w 1155
    //   54: iconst_3
    //   55: anewarray 19	java/lang/String
    //   58: dup
    //   59: iconst_0
    //   60: ldc_w 1197
    //   63: aastore
    //   64: dup
    //   65: iconst_1
    //   66: ldc_w 487
    //   69: aastore
    //   70: dup
    //   71: iconst_2
    //   72: ldc 141
    //   74: aastore
    //   75: ldc_w 729
    //   78: iconst_1
    //   79: anewarray 19	java/lang/String
    //   82: dup
    //   83: iconst_0
    //   84: aload_1
    //   85: aastore
    //   86: aconst_null
    //   87: aconst_null
    //   88: ldc_w 1197
    //   91: iload_2
    //   92: invokestatic 934	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   95: invokevirtual 1200	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   98: astore 6
    //   100: aload 6
    //   102: invokeinterface 213 1 0
    //   107: ifne +43 -> 150
    //   110: invokestatic 1204	java/util/Collections:emptyList	()Ljava/util/List;
    //   113: astore 7
    //   115: aload 7
    //   117: astore_1
    //   118: aload 6
    //   120: ifnull +10 -> 130
    //   123: aload 6
    //   125: invokeinterface 220 1 0
    //   130: ldc_w 1191
    //   133: invokestatic 192	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   136: aload_1
    //   137: areturn
    //   138: iconst_0
    //   139: istore 5
    //   141: goto -117 -> 24
    //   144: iconst_0
    //   145: istore 5
    //   147: goto -110 -> 37
    //   150: new 558	java/util/ArrayList
    //   153: astore 7
    //   155: aload 7
    //   157: invokespecial 559	java/util/ArrayList:<init>	()V
    //   160: iconst_0
    //   161: istore_2
    //   162: aload 6
    //   164: iconst_0
    //   165: invokeinterface 217 2 0
    //   170: lstore 8
    //   172: aload 6
    //   174: iconst_1
    //   175: invokeinterface 698 2 0
    //   180: astore 10
    //   182: aload_0
    //   183: invokevirtual 655	com/google/android/gms/internal/measurement/zzhg:zzgb	()Lcom/google/android/gms/internal/measurement/zzka;
    //   186: aload 10
    //   188: invokevirtual 1206	com/google/android/gms/internal/measurement/zzka:zzb	([B)[B
    //   191: astore 11
    //   193: aload 7
    //   195: invokeinterface 1207 1 0
    //   200: ifne +12 -> 212
    //   203: aload 11
    //   205: arraylength
    //   206: iload_2
    //   207: iadd
    //   208: iload_3
    //   209: if_icmpgt +102 -> 311
    //   212: aload 11
    //   214: iconst_0
    //   215: aload 11
    //   217: arraylength
    //   218: invokestatic 703	com/google/android/gms/internal/measurement/zzabv:zza	([BII)Lcom/google/android/gms/internal/measurement/zzabv;
    //   221: astore 10
    //   223: new 648	com/google/android/gms/internal/measurement/zzkq
    //   226: astore 12
    //   228: aload 12
    //   230: invokespecial 1208	com/google/android/gms/internal/measurement/zzkq:<init>	()V
    //   233: aload 12
    //   235: aload 10
    //   237: invokevirtual 709	com/google/android/gms/internal/measurement/zzace:zzb	(Lcom/google/android/gms/internal/measurement/zzabv;)Lcom/google/android/gms/internal/measurement/zzace;
    //   240: pop
    //   241: aload 6
    //   243: iconst_2
    //   244: invokeinterface 1212 2 0
    //   249: ifne +19 -> 268
    //   252: aload 12
    //   254: aload 6
    //   256: iconst_2
    //   257: invokeinterface 1215 2 0
    //   262: invokestatic 261	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   265: putfield 1153	com/google/android/gms/internal/measurement/zzkq:zzauj	Ljava/lang/Integer;
    //   268: aload 11
    //   270: arraylength
    //   271: iload_2
    //   272: iadd
    //   273: istore_2
    //   274: aload 7
    //   276: aload 12
    //   278: lload 8
    //   280: invokestatic 275	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   283: invokestatic 715	android/util/Pair:create	(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;
    //   286: invokeinterface 576 2 0
    //   291: pop
    //   292: aload 6
    //   294: invokeinterface 1218 1 0
    //   299: istore 5
    //   301: iload 5
    //   303: ifeq +8 -> 311
    //   306: iload_2
    //   307: iload_3
    //   308: if_icmple +161 -> 469
    //   311: aload 6
    //   313: ifnull +10 -> 323
    //   316: aload 6
    //   318: invokeinterface 220 1 0
    //   323: ldc_w 1191
    //   326: invokestatic 192	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   329: aload 7
    //   331: astore_1
    //   332: goto -196 -> 136
    //   335: astore 10
    //   337: aload_0
    //   338: invokevirtual 229	com/google/android/gms/internal/measurement/zzhg:zzge	()Lcom/google/android/gms/internal/measurement/zzfg;
    //   341: invokevirtual 235	com/google/android/gms/internal/measurement/zzfg:zzim	()Lcom/google/android/gms/internal/measurement/zzfi;
    //   344: ldc_w 1220
    //   347: aload_1
    //   348: invokestatic 448	com/google/android/gms/internal/measurement/zzfg:zzbm	(Ljava/lang/String;)Ljava/lang/Object;
    //   351: aload 10
    //   353: invokevirtual 243	com/google/android/gms/internal/measurement/zzfi:zze	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   356: goto -64 -> 292
    //   359: astore 10
    //   361: aload_0
    //   362: invokevirtual 229	com/google/android/gms/internal/measurement/zzhg:zzge	()Lcom/google/android/gms/internal/measurement/zzfg;
    //   365: invokevirtual 235	com/google/android/gms/internal/measurement/zzfg:zzim	()Lcom/google/android/gms/internal/measurement/zzfi;
    //   368: ldc_w 1222
    //   371: aload_1
    //   372: invokestatic 448	com/google/android/gms/internal/measurement/zzfg:zzbm	(Ljava/lang/String;)Ljava/lang/Object;
    //   375: aload 10
    //   377: invokevirtual 243	com/google/android/gms/internal/measurement/zzfi:zze	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   380: goto -88 -> 292
    //   383: astore 7
    //   385: aconst_null
    //   386: astore 6
    //   388: aload_0
    //   389: invokevirtual 229	com/google/android/gms/internal/measurement/zzhg:zzge	()Lcom/google/android/gms/internal/measurement/zzfg;
    //   392: invokevirtual 235	com/google/android/gms/internal/measurement/zzfg:zzim	()Lcom/google/android/gms/internal/measurement/zzfi;
    //   395: ldc_w 1224
    //   398: aload_1
    //   399: invokestatic 448	com/google/android/gms/internal/measurement/zzfg:zzbm	(Ljava/lang/String;)Ljava/lang/Object;
    //   402: aload 7
    //   404: invokevirtual 243	com/google/android/gms/internal/measurement/zzfi:zze	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   407: invokestatic 1204	java/util/Collections:emptyList	()Ljava/util/List;
    //   410: astore_1
    //   411: aload 6
    //   413: ifnull +10 -> 423
    //   416: aload 6
    //   418: invokeinterface 220 1 0
    //   423: ldc_w 1191
    //   426: invokestatic 192	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   429: goto -293 -> 136
    //   432: astore_1
    //   433: aconst_null
    //   434: astore 6
    //   436: aload 6
    //   438: ifnull +10 -> 448
    //   441: aload 6
    //   443: invokeinterface 220 1 0
    //   448: ldc_w 1191
    //   451: invokestatic 192	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   454: aload_1
    //   455: athrow
    //   456: astore_1
    //   457: goto -21 -> 436
    //   460: astore_1
    //   461: goto -25 -> 436
    //   464: astore 7
    //   466: goto -78 -> 388
    //   469: goto -307 -> 162
    //
    // Exception table:
    //   from	to	target	type
    //   172	193	335	java/io/IOException
    //   233	241	359	java/io/IOException
    //   47	100	383	android/database/sqlite/SQLiteException
    //   47	100	432	finally
    //   100	115	456	finally
    //   150	160	456	finally
    //   162	172	456	finally
    //   172	193	456	finally
    //   193	212	456	finally
    //   212	233	456	finally
    //   233	241	456	finally
    //   241	268	456	finally
    //   268	292	456	finally
    //   292	301	456	finally
    //   337	356	456	finally
    //   361	380	456	finally
    //   388	411	460	finally
    //   100	115	464	android/database/sqlite/SQLiteException
    //   150	160	464	android/database/sqlite/SQLiteException
    //   162	172	464	android/database/sqlite/SQLiteException
    //   172	193	464	android/database/sqlite/SQLiteException
    //   193	212	464	android/database/sqlite/SQLiteException
    //   212	233	464	android/database/sqlite/SQLiteException
    //   233	241	464	android/database/sqlite/SQLiteException
    //   241	268	464	android/database/sqlite/SQLiteException
    //   268	292	464	android/database/sqlite/SQLiteException
    //   292	301	464	android/database/sqlite/SQLiteException
    //   337	356	464	android/database/sqlite/SQLiteException
    //   361	380	464	android/database/sqlite/SQLiteException
  }

  // ERROR //
  public final List<zzjz> zzb(String paramString1, String paramString2, String paramString3)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 4
    //   3: ldc_w 1227
    //   6: invokestatic 163	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   9: aload_1
    //   10: invokestatic 299	com/google/android/gms/common/internal/Preconditions:checkNotEmpty	(Ljava/lang/String;)Ljava/lang/String;
    //   13: pop
    //   14: aload_0
    //   15: invokevirtual 433	com/google/android/gms/internal/measurement/zzhg:zzab	()V
    //   18: aload_0
    //   19: invokevirtual 430	com/google/android/gms/internal/measurement/zzjq:zzch	()V
    //   22: new 558	java/util/ArrayList
    //   25: dup
    //   26: invokespecial 559	java/util/ArrayList:<init>	()V
    //   29: astore 5
    //   31: new 558	java/util/ArrayList
    //   34: astore 6
    //   36: aload 6
    //   38: iconst_3
    //   39: invokespecial 1228	java/util/ArrayList:<init>	(I)V
    //   42: aload 6
    //   44: aload_1
    //   45: invokeinterface 576 2 0
    //   50: pop
    //   51: new 384	java/lang/StringBuilder
    //   54: astore 7
    //   56: aload 7
    //   58: ldc_w 729
    //   61: invokespecial 1229	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   64: aload_2
    //   65: invokestatic 442	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   68: ifne +21 -> 89
    //   71: aload 6
    //   73: aload_2
    //   74: invokeinterface 576 2 0
    //   79: pop
    //   80: aload 7
    //   82: ldc_w 1231
    //   85: invokevirtual 392	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   88: pop
    //   89: aload_3
    //   90: invokestatic 442	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   93: ifne +30 -> 123
    //   96: aload 6
    //   98: aload_3
    //   99: invokestatic 378	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   102: ldc_w 1233
    //   105: invokevirtual 1236	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   108: invokeinterface 576 2 0
    //   113: pop
    //   114: aload 7
    //   116: ldc_w 1238
    //   119: invokevirtual 392	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   122: pop
    //   123: aload 6
    //   125: aload 6
    //   127: invokeinterface 564 1 0
    //   132: anewarray 19	java/lang/String
    //   135: invokeinterface 1242 2 0
    //   140: checkcast 1243	[Ljava/lang/String;
    //   143: astore 8
    //   145: aload_0
    //   146: invokevirtual 201	com/google/android/gms/internal/measurement/zzei:getWritableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   149: astore 6
    //   151: aload 7
    //   153: invokevirtual 397	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   156: astore 7
    //   158: aload 6
    //   160: ldc_w 1119
    //   163: iconst_4
    //   164: anewarray 19	java/lang/String
    //   167: dup
    //   168: iconst_0
    //   169: ldc_w 415
    //   172: aastore
    //   173: dup
    //   174: iconst_1
    //   175: ldc_w 1113
    //   178: aastore
    //   179: dup
    //   180: iconst_2
    //   181: ldc_w 962
    //   184: aastore
    //   185: dup
    //   186: iconst_3
    //   187: ldc 39
    //   189: aastore
    //   190: aload 7
    //   192: aload 8
    //   194: aconst_null
    //   195: aconst_null
    //   196: ldc_w 1197
    //   199: ldc_w 1245
    //   202: invokevirtual 1200	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   205: astore 6
    //   207: aload_2
    //   208: astore 4
    //   210: aload 6
    //   212: invokeinterface 213 1 0
    //   217: istore 9
    //   219: iload 9
    //   221: ifne +26 -> 247
    //   224: aload 6
    //   226: ifnull +10 -> 236
    //   229: aload 6
    //   231: invokeinterface 220 1 0
    //   236: ldc_w 1227
    //   239: invokestatic 192	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   242: aload 5
    //   244: astore_1
    //   245: aload_1
    //   246: areturn
    //   247: aload_2
    //   248: astore 4
    //   250: aload 5
    //   252: invokeinterface 564 1 0
    //   257: sipush 1000
    //   260: if_icmplt +49 -> 309
    //   263: aload_2
    //   264: astore 4
    //   266: aload_0
    //   267: invokevirtual 229	com/google/android/gms/internal/measurement/zzhg:zzge	()Lcom/google/android/gms/internal/measurement/zzfg;
    //   270: invokevirtual 235	com/google/android/gms/internal/measurement/zzfg:zzim	()Lcom/google/android/gms/internal/measurement/zzfi;
    //   273: ldc_w 1247
    //   276: sipush 1000
    //   279: invokestatic 261	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   282: invokevirtual 265	com/google/android/gms/internal/measurement/zzfi:zzg	(Ljava/lang/String;Ljava/lang/Object;)V
    //   285: aload 6
    //   287: ifnull +10 -> 297
    //   290: aload 6
    //   292: invokeinterface 220 1 0
    //   297: ldc_w 1227
    //   300: invokestatic 192	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   303: aload 5
    //   305: astore_1
    //   306: goto -61 -> 245
    //   309: aload_2
    //   310: astore 4
    //   312: aload 6
    //   314: iconst_0
    //   315: invokeinterface 288 2 0
    //   320: astore 7
    //   322: aload_2
    //   323: astore 4
    //   325: aload 6
    //   327: iconst_1
    //   328: invokeinterface 217 2 0
    //   333: lstore 10
    //   335: aload_2
    //   336: astore 4
    //   338: aload_0
    //   339: aload 6
    //   341: iconst_2
    //   342: invokespecial 1249	com/google/android/gms/internal/measurement/zzei:zza	(Landroid/database/Cursor;I)Ljava/lang/Object;
    //   345: astore 8
    //   347: aload_2
    //   348: astore 4
    //   350: aload 6
    //   352: iconst_3
    //   353: invokeinterface 288 2 0
    //   358: astore_2
    //   359: aload 8
    //   361: ifnonnull +35 -> 396
    //   364: aload_0
    //   365: invokevirtual 229	com/google/android/gms/internal/measurement/zzhg:zzge	()Lcom/google/android/gms/internal/measurement/zzfg;
    //   368: invokevirtual 235	com/google/android/gms/internal/measurement/zzfg:zzim	()Lcom/google/android/gms/internal/measurement/zzfi;
    //   371: ldc_w 1251
    //   374: aload_1
    //   375: invokestatic 448	com/google/android/gms/internal/measurement/zzfg:zzbm	(Ljava/lang/String;)Ljava/lang/Object;
    //   378: aload_2
    //   379: aload_3
    //   380: invokevirtual 456	com/google/android/gms/internal/measurement/zzfi:zzd	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   383: aload 6
    //   385: invokeinterface 1218 1 0
    //   390: ifne -143 -> 247
    //   393: goto -108 -> 285
    //   396: new 1098	com/google/android/gms/internal/measurement/zzjz
    //   399: astore 4
    //   401: aload 4
    //   403: aload_1
    //   404: aload_2
    //   405: aload 7
    //   407: lload 10
    //   409: aload 8
    //   411: invokespecial 1254	com/google/android/gms/internal/measurement/zzjz:<init>	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/Object;)V
    //   414: aload 5
    //   416: aload 4
    //   418: invokeinterface 576 2 0
    //   423: pop
    //   424: goto -41 -> 383
    //   427: astore 4
    //   429: aload 6
    //   431: astore_3
    //   432: aload 4
    //   434: astore 6
    //   436: aload_0
    //   437: invokevirtual 229	com/google/android/gms/internal/measurement/zzhg:zzge	()Lcom/google/android/gms/internal/measurement/zzfg;
    //   440: invokevirtual 235	com/google/android/gms/internal/measurement/zzfg:zzim	()Lcom/google/android/gms/internal/measurement/zzfi;
    //   443: ldc_w 1256
    //   446: aload_1
    //   447: invokestatic 448	com/google/android/gms/internal/measurement/zzfg:zzbm	(Ljava/lang/String;)Ljava/lang/Object;
    //   450: aload_2
    //   451: aload 6
    //   453: invokevirtual 456	com/google/android/gms/internal/measurement/zzfi:zzd	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   456: aload_3
    //   457: ifnull +9 -> 466
    //   460: aload_3
    //   461: invokeinterface 220 1 0
    //   466: ldc_w 1227
    //   469: invokestatic 192	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   472: aconst_null
    //   473: astore_1
    //   474: goto -229 -> 245
    //   477: astore_1
    //   478: aload 4
    //   480: astore_2
    //   481: aload_2
    //   482: ifnull +9 -> 491
    //   485: aload_2
    //   486: invokeinterface 220 1 0
    //   491: ldc_w 1227
    //   494: invokestatic 192	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   497: aload_1
    //   498: athrow
    //   499: astore_1
    //   500: aload 6
    //   502: astore_2
    //   503: goto -22 -> 481
    //   506: astore_1
    //   507: aload_3
    //   508: astore_2
    //   509: goto -28 -> 481
    //   512: astore 6
    //   514: aconst_null
    //   515: astore_3
    //   516: goto -80 -> 436
    //   519: astore_2
    //   520: aload 6
    //   522: astore_3
    //   523: aload_2
    //   524: astore 6
    //   526: aload 4
    //   528: astore_2
    //   529: goto -93 -> 436
    //
    // Exception table:
    //   from	to	target	type
    //   364	383	427	android/database/sqlite/SQLiteException
    //   383	393	427	android/database/sqlite/SQLiteException
    //   396	424	427	android/database/sqlite/SQLiteException
    //   31	89	477	finally
    //   89	123	477	finally
    //   123	207	477	finally
    //   210	219	499	finally
    //   250	263	499	finally
    //   266	285	499	finally
    //   312	322	499	finally
    //   325	335	499	finally
    //   338	347	499	finally
    //   350	359	499	finally
    //   364	383	499	finally
    //   383	393	499	finally
    //   396	424	499	finally
    //   436	456	506	finally
    //   31	89	512	android/database/sqlite/SQLiteException
    //   89	123	512	android/database/sqlite/SQLiteException
    //   123	207	512	android/database/sqlite/SQLiteException
    //   210	219	519	android/database/sqlite/SQLiteException
    //   250	263	519	android/database/sqlite/SQLiteException
    //   266	285	519	android/database/sqlite/SQLiteException
    //   312	322	519	android/database/sqlite/SQLiteException
    //   325	335	519	android/database/sqlite/SQLiteException
    //   338	347	519	android/database/sqlite/SQLiteException
    //   350	359	519	android/database/sqlite/SQLiteException
  }

  // ERROR //
  public final List<zzed> zzb(String paramString, String[] paramArrayOfString)
  {
    // Byte code:
    //   0: ldc_w 1259
    //   3: invokestatic 163	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: aload_0
    //   7: invokevirtual 433	com/google/android/gms/internal/measurement/zzhg:zzab	()V
    //   10: aload_0
    //   11: invokevirtual 430	com/google/android/gms/internal/measurement/zzjq:zzch	()V
    //   14: new 558	java/util/ArrayList
    //   17: dup
    //   18: invokespecial 559	java/util/ArrayList:<init>	()V
    //   21: astore_3
    //   22: aload_0
    //   23: invokevirtual 201	com/google/android/gms/internal/measurement/zzei:getWritableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   26: ldc_w 1019
    //   29: bipush 13
    //   31: anewarray 19	java/lang/String
    //   34: dup
    //   35: iconst_0
    //   36: ldc_w 476
    //   39: aastore
    //   40: dup
    //   41: iconst_1
    //   42: ldc 39
    //   44: aastore
    //   45: dup
    //   46: iconst_2
    //   47: ldc_w 415
    //   50: aastore
    //   51: dup
    //   52: iconst_3
    //   53: ldc_w 962
    //   56: aastore
    //   57: dup
    //   58: iconst_4
    //   59: ldc_w 970
    //   62: aastore
    //   63: dup
    //   64: iconst_5
    //   65: ldc_w 975
    //   68: aastore
    //   69: dup
    //   70: bipush 6
    //   72: ldc_w 980
    //   75: aastore
    //   76: dup
    //   77: bipush 7
    //   79: ldc_w 985
    //   82: aastore
    //   83: dup
    //   84: bipush 8
    //   86: ldc_w 994
    //   89: aastore
    //   90: dup
    //   91: bipush 9
    //   93: ldc_w 999
    //   96: aastore
    //   97: dup
    //   98: bipush 10
    //   100: ldc_w 1004
    //   103: aastore
    //   104: dup
    //   105: bipush 11
    //   107: ldc_w 1009
    //   110: aastore
    //   111: dup
    //   112: bipush 12
    //   114: ldc_w 1014
    //   117: aastore
    //   118: aload_1
    //   119: aload_2
    //   120: aconst_null
    //   121: aconst_null
    //   122: ldc_w 1197
    //   125: ldc_w 1245
    //   128: invokevirtual 1200	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   131: astore_1
    //   132: aload_1
    //   133: invokeinterface 213 1 0
    //   138: istore 4
    //   140: iload 4
    //   142: ifne +23 -> 165
    //   145: aload_1
    //   146: ifnull +9 -> 155
    //   149: aload_1
    //   150: invokeinterface 220 1 0
    //   155: ldc_w 1259
    //   158: invokestatic 192	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   161: aload_3
    //   162: astore_1
    //   163: aload_1
    //   164: areturn
    //   165: aload_3
    //   166: invokeinterface 564 1 0
    //   171: sipush 1000
    //   174: if_icmplt +43 -> 217
    //   177: aload_0
    //   178: invokevirtual 229	com/google/android/gms/internal/measurement/zzhg:zzge	()Lcom/google/android/gms/internal/measurement/zzfg;
    //   181: invokevirtual 235	com/google/android/gms/internal/measurement/zzfg:zzim	()Lcom/google/android/gms/internal/measurement/zzfi;
    //   184: ldc_w 1261
    //   187: sipush 1000
    //   190: invokestatic 261	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   193: invokevirtual 265	com/google/android/gms/internal/measurement/zzfi:zzg	(Ljava/lang/String;Ljava/lang/Object;)V
    //   196: aload_1
    //   197: ifnull +9 -> 206
    //   200: aload_1
    //   201: invokeinterface 220 1 0
    //   206: ldc_w 1259
    //   209: invokestatic 192	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   212: aload_3
    //   213: astore_1
    //   214: goto -51 -> 163
    //   217: aload_1
    //   218: iconst_0
    //   219: invokeinterface 288 2 0
    //   224: astore 5
    //   226: aload_1
    //   227: iconst_1
    //   228: invokeinterface 288 2 0
    //   233: astore 6
    //   235: aload_1
    //   236: iconst_2
    //   237: invokeinterface 288 2 0
    //   242: astore 7
    //   244: aload_0
    //   245: aload_1
    //   246: iconst_3
    //   247: invokespecial 1249	com/google/android/gms/internal/measurement/zzei:zza	(Landroid/database/Cursor;I)Ljava/lang/Object;
    //   250: astore 8
    //   252: aload_1
    //   253: iconst_4
    //   254: invokeinterface 1215 2 0
    //   259: ifeq +196 -> 455
    //   262: iconst_1
    //   263: istore 4
    //   265: aload_1
    //   266: iconst_5
    //   267: invokeinterface 288 2 0
    //   272: astore 9
    //   274: aload_1
    //   275: bipush 6
    //   277: invokeinterface 217 2 0
    //   282: lstore 10
    //   284: aload_0
    //   285: invokevirtual 655	com/google/android/gms/internal/measurement/zzhg:zzgb	()Lcom/google/android/gms/internal/measurement/zzka;
    //   288: aload_1
    //   289: bipush 7
    //   291: invokeinterface 698 2 0
    //   296: getstatic 1267	com/google/android/gms/internal/measurement/zzeu:CREATOR	Landroid/os/Parcelable$Creator;
    //   299: invokevirtual 1270	com/google/android/gms/internal/measurement/zzka:zza	([BLandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;
    //   302: checkcast 1263	com/google/android/gms/internal/measurement/zzeu
    //   305: astore 12
    //   307: aload_1
    //   308: bipush 8
    //   310: invokeinterface 217 2 0
    //   315: lstore 13
    //   317: aload_0
    //   318: invokevirtual 655	com/google/android/gms/internal/measurement/zzhg:zzgb	()Lcom/google/android/gms/internal/measurement/zzka;
    //   321: aload_1
    //   322: bipush 9
    //   324: invokeinterface 698 2 0
    //   329: getstatic 1267	com/google/android/gms/internal/measurement/zzeu:CREATOR	Landroid/os/Parcelable$Creator;
    //   332: invokevirtual 1270	com/google/android/gms/internal/measurement/zzka:zza	([BLandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;
    //   335: checkcast 1263	com/google/android/gms/internal/measurement/zzeu
    //   338: astore 15
    //   340: aload_1
    //   341: bipush 10
    //   343: invokeinterface 217 2 0
    //   348: lstore 16
    //   350: aload_1
    //   351: bipush 11
    //   353: invokeinterface 217 2 0
    //   358: lstore 18
    //   360: aload_0
    //   361: invokevirtual 655	com/google/android/gms/internal/measurement/zzhg:zzgb	()Lcom/google/android/gms/internal/measurement/zzka;
    //   364: aload_1
    //   365: bipush 12
    //   367: invokeinterface 698 2 0
    //   372: getstatic 1267	com/google/android/gms/internal/measurement/zzeu:CREATOR	Landroid/os/Parcelable$Creator;
    //   375: invokevirtual 1270	com/google/android/gms/internal/measurement/zzka:zza	([BLandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;
    //   378: checkcast 1263	com/google/android/gms/internal/measurement/zzeu
    //   381: astore 20
    //   383: new 949	com/google/android/gms/internal/measurement/zzjx
    //   386: astore_2
    //   387: aload_2
    //   388: aload 7
    //   390: lload 16
    //   392: aload 8
    //   394: aload 6
    //   396: invokespecial 1273	com/google/android/gms/internal/measurement/zzjx:<init>	(Ljava/lang/String;JLjava/lang/Object;Ljava/lang/String;)V
    //   399: new 940	com/google/android/gms/internal/measurement/zzed
    //   402: astore 7
    //   404: aload 7
    //   406: aload 5
    //   408: aload 6
    //   410: aload_2
    //   411: lload 13
    //   413: iload 4
    //   415: aload 9
    //   417: aload 12
    //   419: lload 10
    //   421: aload 15
    //   423: lload 18
    //   425: aload 20
    //   427: invokespecial 1276	com/google/android/gms/internal/measurement/zzed:<init>	(Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/measurement/zzjx;JZLjava/lang/String;Lcom/google/android/gms/internal/measurement/zzeu;JLcom/google/android/gms/internal/measurement/zzeu;JLcom/google/android/gms/internal/measurement/zzeu;)V
    //   430: aload_3
    //   431: aload 7
    //   433: invokeinterface 576 2 0
    //   438: pop
    //   439: aload_1
    //   440: invokeinterface 1218 1 0
    //   445: istore 4
    //   447: iload 4
    //   449: ifne -284 -> 165
    //   452: goto -256 -> 196
    //   455: iconst_0
    //   456: istore 4
    //   458: goto -193 -> 265
    //   461: astore_2
    //   462: aconst_null
    //   463: astore_1
    //   464: aload_0
    //   465: invokevirtual 229	com/google/android/gms/internal/measurement/zzhg:zzge	()Lcom/google/android/gms/internal/measurement/zzfg;
    //   468: invokevirtual 235	com/google/android/gms/internal/measurement/zzfg:zzim	()Lcom/google/android/gms/internal/measurement/zzfi;
    //   471: ldc_w 1278
    //   474: aload_2
    //   475: invokevirtual 265	com/google/android/gms/internal/measurement/zzfi:zzg	(Ljava/lang/String;Ljava/lang/Object;)V
    //   478: invokestatic 1204	java/util/Collections:emptyList	()Ljava/util/List;
    //   481: astore_2
    //   482: aload_1
    //   483: ifnull +9 -> 492
    //   486: aload_1
    //   487: invokeinterface 220 1 0
    //   492: ldc_w 1259
    //   495: invokestatic 192	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   498: aload_2
    //   499: astore_1
    //   500: goto -337 -> 163
    //   503: astore_2
    //   504: aconst_null
    //   505: astore_1
    //   506: aload_1
    //   507: ifnull +9 -> 516
    //   510: aload_1
    //   511: invokeinterface 220 1 0
    //   516: ldc_w 1259
    //   519: invokestatic 192	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   522: aload_2
    //   523: athrow
    //   524: astore_2
    //   525: goto -19 -> 506
    //   528: astore_2
    //   529: goto -23 -> 506
    //   532: astore_2
    //   533: goto -69 -> 464
    //
    // Exception table:
    //   from	to	target	type
    //   22	132	461	android/database/sqlite/SQLiteException
    //   22	132	503	finally
    //   132	140	524	finally
    //   165	196	524	finally
    //   217	262	524	finally
    //   265	447	524	finally
    //   464	482	528	finally
    //   132	140	532	android/database/sqlite/SQLiteException
    //   165	196	532	android/database/sqlite/SQLiteException
    //   217	262	532	android/database/sqlite/SQLiteException
    //   265	447	532	android/database/sqlite/SQLiteException
  }

  // ERROR //
  public final List<zzjz> zzbb(String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: ldc_w 1282
    //   5: invokestatic 163	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   8: aload_1
    //   9: invokestatic 299	com/google/android/gms/common/internal/Preconditions:checkNotEmpty	(Ljava/lang/String;)Ljava/lang/String;
    //   12: pop
    //   13: aload_0
    //   14: invokevirtual 433	com/google/android/gms/internal/measurement/zzhg:zzab	()V
    //   17: aload_0
    //   18: invokevirtual 430	com/google/android/gms/internal/measurement/zzjq:zzch	()V
    //   21: new 558	java/util/ArrayList
    //   24: dup
    //   25: invokespecial 559	java/util/ArrayList:<init>	()V
    //   28: astore_3
    //   29: aload_0
    //   30: invokevirtual 201	com/google/android/gms/internal/measurement/zzei:getWritableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   33: ldc_w 1119
    //   36: iconst_4
    //   37: anewarray 19	java/lang/String
    //   40: dup
    //   41: iconst_0
    //   42: ldc_w 415
    //   45: aastore
    //   46: dup
    //   47: iconst_1
    //   48: ldc 39
    //   50: aastore
    //   51: dup
    //   52: iconst_2
    //   53: ldc_w 1113
    //   56: aastore
    //   57: dup
    //   58: iconst_3
    //   59: ldc_w 962
    //   62: aastore
    //   63: ldc_w 729
    //   66: iconst_1
    //   67: anewarray 19	java/lang/String
    //   70: dup
    //   71: iconst_0
    //   72: aload_1
    //   73: aastore
    //   74: aconst_null
    //   75: aconst_null
    //   76: ldc_w 1197
    //   79: ldc_w 1284
    //   82: invokevirtual 1200	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   85: astore 4
    //   87: aload 4
    //   89: invokeinterface 213 1 0
    //   94: istore 5
    //   96: iload 5
    //   98: ifne +25 -> 123
    //   101: aload 4
    //   103: ifnull +10 -> 113
    //   106: aload 4
    //   108: invokeinterface 220 1 0
    //   113: ldc_w 1282
    //   116: invokestatic 192	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   119: aload_3
    //   120: astore_1
    //   121: aload_1
    //   122: areturn
    //   123: aload 4
    //   125: iconst_0
    //   126: invokeinterface 288 2 0
    //   131: astore 6
    //   133: aload 4
    //   135: iconst_1
    //   136: invokeinterface 288 2 0
    //   141: astore 7
    //   143: aload 7
    //   145: astore_2
    //   146: aload 7
    //   148: ifnonnull +7 -> 155
    //   151: ldc_w 1286
    //   154: astore_2
    //   155: aload 4
    //   157: iconst_2
    //   158: invokeinterface 217 2 0
    //   163: lstore 8
    //   165: aload_0
    //   166: aload 4
    //   168: iconst_3
    //   169: invokespecial 1249	com/google/android/gms/internal/measurement/zzei:zza	(Landroid/database/Cursor;I)Ljava/lang/Object;
    //   172: astore 7
    //   174: aload 7
    //   176: ifnonnull +57 -> 233
    //   179: aload_0
    //   180: invokevirtual 229	com/google/android/gms/internal/measurement/zzhg:zzge	()Lcom/google/android/gms/internal/measurement/zzfg;
    //   183: invokevirtual 235	com/google/android/gms/internal/measurement/zzfg:zzim	()Lcom/google/android/gms/internal/measurement/zzfi;
    //   186: ldc_w 1288
    //   189: aload_1
    //   190: invokestatic 448	com/google/android/gms/internal/measurement/zzfg:zzbm	(Ljava/lang/String;)Ljava/lang/Object;
    //   193: invokevirtual 265	com/google/android/gms/internal/measurement/zzfi:zzg	(Ljava/lang/String;Ljava/lang/Object;)V
    //   196: aload 4
    //   198: invokeinterface 1218 1 0
    //   203: istore 5
    //   205: iload 5
    //   207: ifne -84 -> 123
    //   210: aload 4
    //   212: ifnull +10 -> 222
    //   215: aload 4
    //   217: invokeinterface 220 1 0
    //   222: ldc_w 1282
    //   225: invokestatic 192	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   228: aload_3
    //   229: astore_1
    //   230: goto -109 -> 121
    //   233: new 1098	com/google/android/gms/internal/measurement/zzjz
    //   236: astore 10
    //   238: aload 10
    //   240: aload_1
    //   241: aload_2
    //   242: aload 6
    //   244: lload 8
    //   246: aload 7
    //   248: invokespecial 1254	com/google/android/gms/internal/measurement/zzjz:<init>	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/Object;)V
    //   251: aload_3
    //   252: aload 10
    //   254: invokeinterface 576 2 0
    //   259: pop
    //   260: goto -64 -> 196
    //   263: astore_3
    //   264: aload_0
    //   265: invokevirtual 229	com/google/android/gms/internal/measurement/zzhg:zzge	()Lcom/google/android/gms/internal/measurement/zzfg;
    //   268: invokevirtual 235	com/google/android/gms/internal/measurement/zzfg:zzim	()Lcom/google/android/gms/internal/measurement/zzfi;
    //   271: ldc_w 1290
    //   274: aload_1
    //   275: invokestatic 448	com/google/android/gms/internal/measurement/zzfg:zzbm	(Ljava/lang/String;)Ljava/lang/Object;
    //   278: aload_3
    //   279: invokevirtual 243	com/google/android/gms/internal/measurement/zzfi:zze	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   282: aload 4
    //   284: ifnull +10 -> 294
    //   287: aload 4
    //   289: invokeinterface 220 1 0
    //   294: ldc_w 1282
    //   297: invokestatic 192	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   300: aconst_null
    //   301: astore_1
    //   302: goto -181 -> 121
    //   305: astore_1
    //   306: aload_2
    //   307: astore 4
    //   309: aload 4
    //   311: ifnull +10 -> 321
    //   314: aload 4
    //   316: invokeinterface 220 1 0
    //   321: ldc_w 1282
    //   324: invokestatic 192	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   327: aload_1
    //   328: athrow
    //   329: astore_1
    //   330: goto -21 -> 309
    //   333: astore_1
    //   334: goto -25 -> 309
    //   337: astore_3
    //   338: aconst_null
    //   339: astore 4
    //   341: goto -77 -> 264
    //
    // Exception table:
    //   from	to	target	type
    //   87	96	263	android/database/sqlite/SQLiteException
    //   123	143	263	android/database/sqlite/SQLiteException
    //   155	174	263	android/database/sqlite/SQLiteException
    //   179	196	263	android/database/sqlite/SQLiteException
    //   196	205	263	android/database/sqlite/SQLiteException
    //   233	260	263	android/database/sqlite/SQLiteException
    //   29	87	305	finally
    //   87	96	329	finally
    //   123	143	329	finally
    //   155	174	329	finally
    //   179	196	329	finally
    //   196	205	329	finally
    //   233	260	329	finally
    //   264	282	333	finally
    //   29	87	337	android/database/sqlite/SQLiteException
  }

  // ERROR //
  public final zzdy zzbc(String paramString)
  {
    // Byte code:
    //   0: ldc_w 1294
    //   3: invokestatic 163	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: aload_1
    //   7: invokestatic 299	com/google/android/gms/common/internal/Preconditions:checkNotEmpty	(Ljava/lang/String;)Ljava/lang/String;
    //   10: pop
    //   11: aload_0
    //   12: invokevirtual 433	com/google/android/gms/internal/measurement/zzhg:zzab	()V
    //   15: aload_0
    //   16: invokevirtual 430	com/google/android/gms/internal/measurement/zzjq:zzch	()V
    //   19: aload_0
    //   20: invokevirtual 201	com/google/android/gms/internal/measurement/zzei:getWritableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   23: ldc_w 727
    //   26: bipush 25
    //   28: anewarray 19	java/lang/String
    //   31: dup
    //   32: iconst_0
    //   33: ldc_w 762
    //   36: aastore
    //   37: dup
    //   38: iconst_1
    //   39: ldc_w 767
    //   42: aastore
    //   43: dup
    //   44: iconst_2
    //   45: ldc_w 772
    //   48: aastore
    //   49: dup
    //   50: iconst_3
    //   51: ldc_w 777
    //   54: aastore
    //   55: dup
    //   56: iconst_4
    //   57: ldc 65
    //   59: aastore
    //   60: dup
    //   61: iconst_5
    //   62: ldc_w 786
    //   65: aastore
    //   66: dup
    //   67: bipush 6
    //   69: ldc 45
    //   71: aastore
    //   72: dup
    //   73: bipush 7
    //   75: ldc 49
    //   77: aastore
    //   78: dup
    //   79: bipush 8
    //   81: ldc 53
    //   83: aastore
    //   84: dup
    //   85: bipush 9
    //   87: ldc 57
    //   89: aastore
    //   90: dup
    //   91: bipush 10
    //   93: ldc 61
    //   95: aastore
    //   96: dup
    //   97: bipush 11
    //   99: ldc 69
    //   101: aastore
    //   102: dup
    //   103: bipush 12
    //   105: ldc 73
    //   107: aastore
    //   108: dup
    //   109: bipush 13
    //   111: ldc 77
    //   113: aastore
    //   114: dup
    //   115: bipush 14
    //   117: ldc 81
    //   119: aastore
    //   120: dup
    //   121: bipush 15
    //   123: ldc 89
    //   125: aastore
    //   126: dup
    //   127: bipush 16
    //   129: ldc 93
    //   131: aastore
    //   132: dup
    //   133: bipush 17
    //   135: ldc 97
    //   137: aastore
    //   138: dup
    //   139: bipush 18
    //   141: ldc 101
    //   143: aastore
    //   144: dup
    //   145: bipush 19
    //   147: ldc 105
    //   149: aastore
    //   150: dup
    //   151: bipush 20
    //   153: ldc 109
    //   155: aastore
    //   156: dup
    //   157: bipush 21
    //   159: ldc 113
    //   161: aastore
    //   162: dup
    //   163: bipush 22
    //   165: ldc 117
    //   167: aastore
    //   168: dup
    //   169: bipush 23
    //   171: ldc 121
    //   173: aastore
    //   174: dup
    //   175: bipush 24
    //   177: ldc 125
    //   179: aastore
    //   180: ldc_w 729
    //   183: iconst_1
    //   184: anewarray 19	java/lang/String
    //   187: dup
    //   188: iconst_0
    //   189: aload_1
    //   190: aastore
    //   191: aconst_null
    //   192: aconst_null
    //   193: aconst_null
    //   194: invokevirtual 421	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   197: astore_2
    //   198: aload_2
    //   199: astore_3
    //   200: aload_2
    //   201: invokeinterface 213 1 0
    //   206: istore 4
    //   208: iload 4
    //   210: ifne +23 -> 233
    //   213: aload_2
    //   214: ifnull +9 -> 223
    //   217: aload_2
    //   218: invokeinterface 220 1 0
    //   223: ldc_w 1294
    //   226: invokestatic 192	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   229: aconst_null
    //   230: astore_1
    //   231: aload_1
    //   232: areturn
    //   233: aload_2
    //   234: astore_3
    //   235: new 757	com/google/android/gms/internal/measurement/zzdy
    //   238: astore 5
    //   240: aload_2
    //   241: astore_3
    //   242: aload 5
    //   244: aload_0
    //   245: getfield 1298	com/google/android/gms/internal/measurement/zzei:zzajp	Lcom/google/android/gms/internal/measurement/zzjr;
    //   248: invokevirtual 1304	com/google/android/gms/internal/measurement/zzjr:zzla	()Lcom/google/android/gms/internal/measurement/zzgl;
    //   251: aload_1
    //   252: invokespecial 1307	com/google/android/gms/internal/measurement/zzdy:<init>	(Lcom/google/android/gms/internal/measurement/zzgl;Ljava/lang/String;)V
    //   255: aload_2
    //   256: astore_3
    //   257: aload 5
    //   259: aload_2
    //   260: iconst_0
    //   261: invokeinterface 288 2 0
    //   266: invokevirtual 1310	com/google/android/gms/internal/measurement/zzdy:zzal	(Ljava/lang/String;)V
    //   269: aload_2
    //   270: astore_3
    //   271: aload 5
    //   273: aload_2
    //   274: iconst_1
    //   275: invokeinterface 288 2 0
    //   280: invokevirtual 1313	com/google/android/gms/internal/measurement/zzdy:zzam	(Ljava/lang/String;)V
    //   283: aload_2
    //   284: astore_3
    //   285: aload 5
    //   287: aload_2
    //   288: iconst_2
    //   289: invokeinterface 288 2 0
    //   294: invokevirtual 1316	com/google/android/gms/internal/measurement/zzdy:zzan	(Ljava/lang/String;)V
    //   297: aload_2
    //   298: astore_3
    //   299: aload 5
    //   301: aload_2
    //   302: iconst_3
    //   303: invokeinterface 217 2 0
    //   308: invokevirtual 1320	com/google/android/gms/internal/measurement/zzdy:zzr	(J)V
    //   311: aload_2
    //   312: astore_3
    //   313: aload 5
    //   315: aload_2
    //   316: iconst_4
    //   317: invokeinterface 217 2 0
    //   322: invokevirtual 1323	com/google/android/gms/internal/measurement/zzdy:zzm	(J)V
    //   325: aload_2
    //   326: astore_3
    //   327: aload 5
    //   329: aload_2
    //   330: iconst_5
    //   331: invokeinterface 217 2 0
    //   336: invokevirtual 1326	com/google/android/gms/internal/measurement/zzdy:zzn	(J)V
    //   339: aload_2
    //   340: astore_3
    //   341: aload 5
    //   343: aload_2
    //   344: bipush 6
    //   346: invokeinterface 288 2 0
    //   351: invokevirtual 1329	com/google/android/gms/internal/measurement/zzdy:setAppVersion	(Ljava/lang/String;)V
    //   354: aload_2
    //   355: astore_3
    //   356: aload 5
    //   358: aload_2
    //   359: bipush 7
    //   361: invokeinterface 288 2 0
    //   366: invokevirtual 1332	com/google/android/gms/internal/measurement/zzdy:zzap	(Ljava/lang/String;)V
    //   369: aload_2
    //   370: astore_3
    //   371: aload 5
    //   373: aload_2
    //   374: bipush 8
    //   376: invokeinterface 217 2 0
    //   381: invokevirtual 1335	com/google/android/gms/internal/measurement/zzdy:zzp	(J)V
    //   384: aload_2
    //   385: astore_3
    //   386: aload 5
    //   388: aload_2
    //   389: bipush 9
    //   391: invokeinterface 217 2 0
    //   396: invokevirtual 1338	com/google/android/gms/internal/measurement/zzdy:zzq	(J)V
    //   399: aload_2
    //   400: astore_3
    //   401: aload_2
    //   402: bipush 10
    //   404: invokeinterface 1212 2 0
    //   409: ifne +16 -> 425
    //   412: aload_2
    //   413: astore_3
    //   414: aload_2
    //   415: bipush 10
    //   417: invokeinterface 1215 2 0
    //   422: ifeq +352 -> 774
    //   425: iconst_1
    //   426: istore 4
    //   428: aload_2
    //   429: astore_3
    //   430: aload 5
    //   432: iload 4
    //   434: invokevirtual 1341	com/google/android/gms/internal/measurement/zzdy:setMeasurementEnabled	(Z)V
    //   437: aload_2
    //   438: astore_3
    //   439: aload 5
    //   441: aload_2
    //   442: bipush 11
    //   444: invokeinterface 217 2 0
    //   449: invokevirtual 1344	com/google/android/gms/internal/measurement/zzdy:zzu	(J)V
    //   452: aload_2
    //   453: astore_3
    //   454: aload 5
    //   456: aload_2
    //   457: bipush 12
    //   459: invokeinterface 217 2 0
    //   464: invokevirtual 1347	com/google/android/gms/internal/measurement/zzdy:zzv	(J)V
    //   467: aload_2
    //   468: astore_3
    //   469: aload 5
    //   471: aload_2
    //   472: bipush 13
    //   474: invokeinterface 217 2 0
    //   479: invokevirtual 1350	com/google/android/gms/internal/measurement/zzdy:zzw	(J)V
    //   482: aload_2
    //   483: astore_3
    //   484: aload 5
    //   486: aload_2
    //   487: bipush 14
    //   489: invokeinterface 217 2 0
    //   494: invokevirtual 1353	com/google/android/gms/internal/measurement/zzdy:zzx	(J)V
    //   497: aload_2
    //   498: astore_3
    //   499: aload 5
    //   501: aload_2
    //   502: bipush 15
    //   504: invokeinterface 217 2 0
    //   509: invokevirtual 1356	com/google/android/gms/internal/measurement/zzdy:zzs	(J)V
    //   512: aload_2
    //   513: astore_3
    //   514: aload 5
    //   516: aload_2
    //   517: bipush 16
    //   519: invokeinterface 217 2 0
    //   524: invokevirtual 1359	com/google/android/gms/internal/measurement/zzdy:zzt	(J)V
    //   527: aload_2
    //   528: astore_3
    //   529: aload_2
    //   530: bipush 17
    //   532: invokeinterface 1212 2 0
    //   537: ifeq +243 -> 780
    //   540: ldc2_w 1360
    //   543: lstore 6
    //   545: aload_2
    //   546: astore_3
    //   547: aload 5
    //   549: lload 6
    //   551: invokevirtual 1364	com/google/android/gms/internal/measurement/zzdy:zzo	(J)V
    //   554: aload_2
    //   555: astore_3
    //   556: aload 5
    //   558: aload_2
    //   559: bipush 18
    //   561: invokeinterface 288 2 0
    //   566: invokevirtual 1367	com/google/android/gms/internal/measurement/zzdy:zzao	(Ljava/lang/String;)V
    //   569: aload_2
    //   570: astore_3
    //   571: aload 5
    //   573: aload_2
    //   574: bipush 19
    //   576: invokeinterface 217 2 0
    //   581: invokevirtual 1370	com/google/android/gms/internal/measurement/zzdy:zzz	(J)V
    //   584: aload_2
    //   585: astore_3
    //   586: aload 5
    //   588: aload_2
    //   589: bipush 20
    //   591: invokeinterface 217 2 0
    //   596: invokevirtual 1373	com/google/android/gms/internal/measurement/zzdy:zzy	(J)V
    //   599: aload_2
    //   600: astore_3
    //   601: aload 5
    //   603: aload_2
    //   604: bipush 21
    //   606: invokeinterface 288 2 0
    //   611: invokevirtual 1376	com/google/android/gms/internal/measurement/zzdy:zzaq	(Ljava/lang/String;)V
    //   614: aload_2
    //   615: astore_3
    //   616: aload_2
    //   617: bipush 22
    //   619: invokeinterface 1212 2 0
    //   624: ifeq +172 -> 796
    //   627: lconst_0
    //   628: lstore 6
    //   630: aload_2
    //   631: astore_3
    //   632: aload 5
    //   634: lload 6
    //   636: invokevirtual 1379	com/google/android/gms/internal/measurement/zzdy:zzaa	(J)V
    //   639: aload_2
    //   640: astore_3
    //   641: aload_2
    //   642: bipush 23
    //   644: invokeinterface 1212 2 0
    //   649: ifne +16 -> 665
    //   652: aload_2
    //   653: astore_3
    //   654: aload_2
    //   655: bipush 23
    //   657: invokeinterface 1215 2 0
    //   662: ifeq +149 -> 811
    //   665: iconst_1
    //   666: istore 4
    //   668: aload_2
    //   669: astore_3
    //   670: aload 5
    //   672: iload 4
    //   674: invokevirtual 1381	com/google/android/gms/internal/measurement/zzdy:zzd	(Z)V
    //   677: aload_2
    //   678: astore_3
    //   679: aload_2
    //   680: bipush 24
    //   682: invokeinterface 1212 2 0
    //   687: ifne +16 -> 703
    //   690: aload_2
    //   691: astore_3
    //   692: aload_2
    //   693: bipush 24
    //   695: invokeinterface 1215 2 0
    //   700: ifeq +117 -> 817
    //   703: iconst_1
    //   704: istore 4
    //   706: aload_2
    //   707: astore_3
    //   708: aload 5
    //   710: iload 4
    //   712: invokevirtual 1383	com/google/android/gms/internal/measurement/zzdy:zze	(Z)V
    //   715: aload_2
    //   716: astore_3
    //   717: aload 5
    //   719: invokevirtual 1386	com/google/android/gms/internal/measurement/zzdy:zzgh	()V
    //   722: aload_2
    //   723: astore_3
    //   724: aload_2
    //   725: invokeinterface 1218 1 0
    //   730: ifeq +22 -> 752
    //   733: aload_2
    //   734: astore_3
    //   735: aload_0
    //   736: invokevirtual 229	com/google/android/gms/internal/measurement/zzhg:zzge	()Lcom/google/android/gms/internal/measurement/zzfg;
    //   739: invokevirtual 235	com/google/android/gms/internal/measurement/zzfg:zzim	()Lcom/google/android/gms/internal/measurement/zzfi;
    //   742: ldc_w 1388
    //   745: aload_1
    //   746: invokestatic 448	com/google/android/gms/internal/measurement/zzfg:zzbm	(Ljava/lang/String;)Ljava/lang/Object;
    //   749: invokevirtual 265	com/google/android/gms/internal/measurement/zzfi:zzg	(Ljava/lang/String;Ljava/lang/Object;)V
    //   752: aload_2
    //   753: ifnull +9 -> 762
    //   756: aload_2
    //   757: invokeinterface 220 1 0
    //   762: ldc_w 1294
    //   765: invokestatic 192	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   768: aload 5
    //   770: astore_1
    //   771: goto -540 -> 231
    //   774: iconst_0
    //   775: istore 4
    //   777: goto -349 -> 428
    //   780: aload_2
    //   781: astore_3
    //   782: aload_2
    //   783: bipush 17
    //   785: invokeinterface 1215 2 0
    //   790: i2l
    //   791: lstore 6
    //   793: goto -248 -> 545
    //   796: aload_2
    //   797: astore_3
    //   798: aload_2
    //   799: bipush 22
    //   801: invokeinterface 217 2 0
    //   806: lstore 6
    //   808: goto -178 -> 630
    //   811: iconst_0
    //   812: istore 4
    //   814: goto -146 -> 668
    //   817: iconst_0
    //   818: istore 4
    //   820: goto -114 -> 706
    //   823: astore 5
    //   825: aconst_null
    //   826: astore_2
    //   827: aload_2
    //   828: astore_3
    //   829: aload_0
    //   830: invokevirtual 229	com/google/android/gms/internal/measurement/zzhg:zzge	()Lcom/google/android/gms/internal/measurement/zzfg;
    //   833: invokevirtual 235	com/google/android/gms/internal/measurement/zzfg:zzim	()Lcom/google/android/gms/internal/measurement/zzfi;
    //   836: ldc_w 1390
    //   839: aload_1
    //   840: invokestatic 448	com/google/android/gms/internal/measurement/zzfg:zzbm	(Ljava/lang/String;)Ljava/lang/Object;
    //   843: aload 5
    //   845: invokevirtual 243	com/google/android/gms/internal/measurement/zzfi:zze	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   848: aload_2
    //   849: ifnull +9 -> 858
    //   852: aload_2
    //   853: invokeinterface 220 1 0
    //   858: ldc_w 1294
    //   861: invokestatic 192	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   864: aconst_null
    //   865: astore_1
    //   866: goto -635 -> 231
    //   869: astore_1
    //   870: aconst_null
    //   871: astore_3
    //   872: aload_3
    //   873: ifnull +9 -> 882
    //   876: aload_3
    //   877: invokeinterface 220 1 0
    //   882: ldc_w 1294
    //   885: invokestatic 192	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   888: aload_1
    //   889: athrow
    //   890: astore_1
    //   891: goto -19 -> 872
    //   894: astore 5
    //   896: goto -69 -> 827
    //
    // Exception table:
    //   from	to	target	type
    //   19	198	823	android/database/sqlite/SQLiteException
    //   19	198	869	finally
    //   200	208	890	finally
    //   235	240	890	finally
    //   242	255	890	finally
    //   257	269	890	finally
    //   271	283	890	finally
    //   285	297	890	finally
    //   299	311	890	finally
    //   313	325	890	finally
    //   327	339	890	finally
    //   341	354	890	finally
    //   356	369	890	finally
    //   371	384	890	finally
    //   386	399	890	finally
    //   401	412	890	finally
    //   414	425	890	finally
    //   430	437	890	finally
    //   439	452	890	finally
    //   454	467	890	finally
    //   469	482	890	finally
    //   484	497	890	finally
    //   499	512	890	finally
    //   514	527	890	finally
    //   529	540	890	finally
    //   547	554	890	finally
    //   556	569	890	finally
    //   571	584	890	finally
    //   586	599	890	finally
    //   601	614	890	finally
    //   616	627	890	finally
    //   632	639	890	finally
    //   641	652	890	finally
    //   654	665	890	finally
    //   670	677	890	finally
    //   679	690	890	finally
    //   692	703	890	finally
    //   708	715	890	finally
    //   717	722	890	finally
    //   724	733	890	finally
    //   735	752	890	finally
    //   782	793	890	finally
    //   798	808	890	finally
    //   829	848	890	finally
    //   200	208	894	android/database/sqlite/SQLiteException
    //   235	240	894	android/database/sqlite/SQLiteException
    //   242	255	894	android/database/sqlite/SQLiteException
    //   257	269	894	android/database/sqlite/SQLiteException
    //   271	283	894	android/database/sqlite/SQLiteException
    //   285	297	894	android/database/sqlite/SQLiteException
    //   299	311	894	android/database/sqlite/SQLiteException
    //   313	325	894	android/database/sqlite/SQLiteException
    //   327	339	894	android/database/sqlite/SQLiteException
    //   341	354	894	android/database/sqlite/SQLiteException
    //   356	369	894	android/database/sqlite/SQLiteException
    //   371	384	894	android/database/sqlite/SQLiteException
    //   386	399	894	android/database/sqlite/SQLiteException
    //   401	412	894	android/database/sqlite/SQLiteException
    //   414	425	894	android/database/sqlite/SQLiteException
    //   430	437	894	android/database/sqlite/SQLiteException
    //   439	452	894	android/database/sqlite/SQLiteException
    //   454	467	894	android/database/sqlite/SQLiteException
    //   469	482	894	android/database/sqlite/SQLiteException
    //   484	497	894	android/database/sqlite/SQLiteException
    //   499	512	894	android/database/sqlite/SQLiteException
    //   514	527	894	android/database/sqlite/SQLiteException
    //   529	540	894	android/database/sqlite/SQLiteException
    //   547	554	894	android/database/sqlite/SQLiteException
    //   556	569	894	android/database/sqlite/SQLiteException
    //   571	584	894	android/database/sqlite/SQLiteException
    //   586	599	894	android/database/sqlite/SQLiteException
    //   601	614	894	android/database/sqlite/SQLiteException
    //   616	627	894	android/database/sqlite/SQLiteException
    //   632	639	894	android/database/sqlite/SQLiteException
    //   641	652	894	android/database/sqlite/SQLiteException
    //   654	665	894	android/database/sqlite/SQLiteException
    //   670	677	894	android/database/sqlite/SQLiteException
    //   679	690	894	android/database/sqlite/SQLiteException
    //   692	703	894	android/database/sqlite/SQLiteException
    //   708	715	894	android/database/sqlite/SQLiteException
    //   717	722	894	android/database/sqlite/SQLiteException
    //   724	733	894	android/database/sqlite/SQLiteException
    //   735	752	894	android/database/sqlite/SQLiteException
    //   782	793	894	android/database/sqlite/SQLiteException
    //   798	808	894	android/database/sqlite/SQLiteException
  }

  public final long zzbd(String paramString)
  {
    AppMethodBeat.i(68659);
    Preconditions.checkNotEmpty(paramString);
    zzab();
    zzch();
    try
    {
      int i = getWritableDatabase().delete("raw_events", "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[] { paramString, String.valueOf(Math.max(0, Math.min(1000000, zzgg().zzb(paramString, zzew.zzagx)))) });
      l = i;
      AppMethodBeat.o(68659);
      return l;
    }
    catch (SQLiteException localSQLiteException)
    {
      while (true)
      {
        zzge().zzim().zze("Error deleting over the limit events. appId", zzfg.zzbm(paramString), localSQLiteException);
        long l = 0L;
        AppMethodBeat.o(68659);
      }
    }
  }

  // ERROR //
  public final byte[] zzbe(String paramString)
  {
    // Byte code:
    //   0: ldc_w 1404
    //   3: invokestatic 163	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: aload_1
    //   7: invokestatic 299	com/google/android/gms/common/internal/Preconditions:checkNotEmpty	(Ljava/lang/String;)Ljava/lang/String;
    //   10: pop
    //   11: aload_0
    //   12: invokevirtual 433	com/google/android/gms/internal/measurement/zzhg:zzab	()V
    //   15: aload_0
    //   16: invokevirtual 430	com/google/android/gms/internal/measurement/zzjq:zzch	()V
    //   19: aload_0
    //   20: invokevirtual 201	com/google/android/gms/internal/measurement/zzei:getWritableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   23: ldc_w 727
    //   26: iconst_1
    //   27: anewarray 19	java/lang/String
    //   30: dup
    //   31: iconst_0
    //   32: ldc 85
    //   34: aastore
    //   35: ldc_w 729
    //   38: iconst_1
    //   39: anewarray 19	java/lang/String
    //   42: dup
    //   43: iconst_0
    //   44: aload_1
    //   45: aastore
    //   46: aconst_null
    //   47: aconst_null
    //   48: aconst_null
    //   49: invokevirtual 421	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   52: astore_2
    //   53: aload_2
    //   54: astore_3
    //   55: aload_2
    //   56: invokeinterface 213 1 0
    //   61: istore 4
    //   63: iload 4
    //   65: ifne +23 -> 88
    //   68: aload_2
    //   69: ifnull +9 -> 78
    //   72: aload_2
    //   73: invokeinterface 220 1 0
    //   78: ldc_w 1404
    //   81: invokestatic 192	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   84: aconst_null
    //   85: astore_1
    //   86: aload_1
    //   87: areturn
    //   88: aload_2
    //   89: astore_3
    //   90: aload_2
    //   91: iconst_0
    //   92: invokeinterface 698 2 0
    //   97: astore 5
    //   99: aload_2
    //   100: astore_3
    //   101: aload_2
    //   102: invokeinterface 1218 1 0
    //   107: ifeq +22 -> 129
    //   110: aload_2
    //   111: astore_3
    //   112: aload_0
    //   113: invokevirtual 229	com/google/android/gms/internal/measurement/zzhg:zzge	()Lcom/google/android/gms/internal/measurement/zzfg;
    //   116: invokevirtual 235	com/google/android/gms/internal/measurement/zzfg:zzim	()Lcom/google/android/gms/internal/measurement/zzfi;
    //   119: ldc_w 1406
    //   122: aload_1
    //   123: invokestatic 448	com/google/android/gms/internal/measurement/zzfg:zzbm	(Ljava/lang/String;)Ljava/lang/Object;
    //   126: invokevirtual 265	com/google/android/gms/internal/measurement/zzfi:zzg	(Ljava/lang/String;Ljava/lang/Object;)V
    //   129: aload_2
    //   130: ifnull +9 -> 139
    //   133: aload_2
    //   134: invokeinterface 220 1 0
    //   139: ldc_w 1404
    //   142: invokestatic 192	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   145: aload 5
    //   147: astore_1
    //   148: goto -62 -> 86
    //   151: astore 5
    //   153: aconst_null
    //   154: astore_2
    //   155: aload_2
    //   156: astore_3
    //   157: aload_0
    //   158: invokevirtual 229	com/google/android/gms/internal/measurement/zzhg:zzge	()Lcom/google/android/gms/internal/measurement/zzfg;
    //   161: invokevirtual 235	com/google/android/gms/internal/measurement/zzfg:zzim	()Lcom/google/android/gms/internal/measurement/zzfi;
    //   164: ldc_w 1408
    //   167: aload_1
    //   168: invokestatic 448	com/google/android/gms/internal/measurement/zzfg:zzbm	(Ljava/lang/String;)Ljava/lang/Object;
    //   171: aload 5
    //   173: invokevirtual 243	com/google/android/gms/internal/measurement/zzfi:zze	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   176: aload_2
    //   177: ifnull +9 -> 186
    //   180: aload_2
    //   181: invokeinterface 220 1 0
    //   186: ldc_w 1404
    //   189: invokestatic 192	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   192: aconst_null
    //   193: astore_1
    //   194: goto -108 -> 86
    //   197: astore_1
    //   198: aconst_null
    //   199: astore_3
    //   200: aload_3
    //   201: ifnull +9 -> 210
    //   204: aload_3
    //   205: invokeinterface 220 1 0
    //   210: ldc_w 1404
    //   213: invokestatic 192	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   216: aload_1
    //   217: athrow
    //   218: astore_1
    //   219: goto -19 -> 200
    //   222: astore 5
    //   224: goto -69 -> 155
    //
    // Exception table:
    //   from	to	target	type
    //   19	53	151	android/database/sqlite/SQLiteException
    //   19	53	197	finally
    //   55	63	218	finally
    //   90	99	218	finally
    //   101	110	218	finally
    //   112	129	218	finally
    //   157	176	218	finally
    //   55	63	222	android/database/sqlite/SQLiteException
    //   90	99	222	android/database/sqlite/SQLiteException
    //   101	110	222	android/database/sqlite/SQLiteException
    //   112	129	222	android/database/sqlite/SQLiteException
  }

  // ERROR //
  final java.util.Map<Integer, zzkr> zzbf(String paramString)
  {
    // Byte code:
    //   0: ldc_w 1411
    //   3: invokestatic 163	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: aload_0
    //   7: invokevirtual 430	com/google/android/gms/internal/measurement/zzjq:zzch	()V
    //   10: aload_0
    //   11: invokevirtual 433	com/google/android/gms/internal/measurement/zzhg:zzab	()V
    //   14: aload_1
    //   15: invokestatic 299	com/google/android/gms/common/internal/Preconditions:checkNotEmpty	(Ljava/lang/String;)Ljava/lang/String;
    //   18: pop
    //   19: aload_0
    //   20: invokevirtual 201	com/google/android/gms/internal/measurement/zzei:getWritableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   23: astore_2
    //   24: aload_2
    //   25: ldc_w 582
    //   28: iconst_2
    //   29: anewarray 19	java/lang/String
    //   32: dup
    //   33: iconst_0
    //   34: ldc_w 478
    //   37: aastore
    //   38: dup
    //   39: iconst_1
    //   40: ldc_w 1413
    //   43: aastore
    //   44: ldc_w 729
    //   47: iconst_1
    //   48: anewarray 19	java/lang/String
    //   51: dup
    //   52: iconst_0
    //   53: aload_1
    //   54: aastore
    //   55: aconst_null
    //   56: aconst_null
    //   57: aconst_null
    //   58: invokevirtual 421	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   61: astore_3
    //   62: aload_3
    //   63: astore_2
    //   64: aload_3
    //   65: invokeinterface 213 1 0
    //   70: istore 4
    //   72: iload 4
    //   74: ifne +23 -> 97
    //   77: aload_3
    //   78: ifnull +9 -> 87
    //   81: aload_3
    //   82: invokeinterface 220 1 0
    //   87: ldc_w 1411
    //   90: invokestatic 192	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   93: aconst_null
    //   94: astore_1
    //   95: aload_1
    //   96: areturn
    //   97: aload_3
    //   98: astore_2
    //   99: new 1415	android/support/v4/f/a
    //   102: astore 5
    //   104: aload_3
    //   105: astore_2
    //   106: aload 5
    //   108: invokespecial 1416	android/support/v4/f/a:<init>	()V
    //   111: aload_3
    //   112: astore_2
    //   113: aload_3
    //   114: iconst_0
    //   115: invokeinterface 1215 2 0
    //   120: istore 6
    //   122: aload_3
    //   123: astore_2
    //   124: aload_3
    //   125: iconst_1
    //   126: invokeinterface 698 2 0
    //   131: astore 7
    //   133: aload_3
    //   134: astore_2
    //   135: aload 7
    //   137: iconst_0
    //   138: aload 7
    //   140: arraylength
    //   141: invokestatic 703	com/google/android/gms/internal/measurement/zzabv:zza	([BII)Lcom/google/android/gms/internal/measurement/zzabv;
    //   144: astore 7
    //   146: aload_3
    //   147: astore_2
    //   148: new 1418	com/google/android/gms/internal/measurement/zzkr
    //   151: astore 8
    //   153: aload_3
    //   154: astore_2
    //   155: aload 8
    //   157: invokespecial 1419	com/google/android/gms/internal/measurement/zzkr:<init>	()V
    //   160: aload_3
    //   161: astore_2
    //   162: aload 8
    //   164: aload 7
    //   166: invokevirtual 709	com/google/android/gms/internal/measurement/zzace:zzb	(Lcom/google/android/gms/internal/measurement/zzabv;)Lcom/google/android/gms/internal/measurement/zzace;
    //   169: pop
    //   170: aload_3
    //   171: astore_2
    //   172: aload 5
    //   174: iload 6
    //   176: invokestatic 261	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   179: aload 8
    //   181: invokeinterface 1424 3 0
    //   186: pop
    //   187: aload_3
    //   188: astore_2
    //   189: aload_3
    //   190: invokeinterface 1218 1 0
    //   195: istore 4
    //   197: iload 4
    //   199: ifne -88 -> 111
    //   202: aload_3
    //   203: ifnull +9 -> 212
    //   206: aload_3
    //   207: invokeinterface 220 1 0
    //   212: ldc_w 1411
    //   215: invokestatic 192	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   218: aload 5
    //   220: astore_1
    //   221: goto -126 -> 95
    //   224: astore 7
    //   226: aload_3
    //   227: astore_2
    //   228: aload_0
    //   229: invokevirtual 229	com/google/android/gms/internal/measurement/zzhg:zzge	()Lcom/google/android/gms/internal/measurement/zzfg;
    //   232: invokevirtual 235	com/google/android/gms/internal/measurement/zzfg:zzim	()Lcom/google/android/gms/internal/measurement/zzfi;
    //   235: ldc_w 1426
    //   238: aload_1
    //   239: invokestatic 448	com/google/android/gms/internal/measurement/zzfg:zzbm	(Ljava/lang/String;)Ljava/lang/Object;
    //   242: iload 6
    //   244: invokestatic 261	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   247: aload 7
    //   249: invokevirtual 456	com/google/android/gms/internal/measurement/zzfi:zzd	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   252: goto -65 -> 187
    //   255: astore 5
    //   257: aload_3
    //   258: astore_2
    //   259: aload_0
    //   260: invokevirtual 229	com/google/android/gms/internal/measurement/zzhg:zzge	()Lcom/google/android/gms/internal/measurement/zzfg;
    //   263: invokevirtual 235	com/google/android/gms/internal/measurement/zzfg:zzim	()Lcom/google/android/gms/internal/measurement/zzfi;
    //   266: ldc_w 1428
    //   269: aload_1
    //   270: invokestatic 448	com/google/android/gms/internal/measurement/zzfg:zzbm	(Ljava/lang/String;)Ljava/lang/Object;
    //   273: aload 5
    //   275: invokevirtual 243	com/google/android/gms/internal/measurement/zzfi:zze	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   278: aload_3
    //   279: ifnull +9 -> 288
    //   282: aload_3
    //   283: invokeinterface 220 1 0
    //   288: ldc_w 1411
    //   291: invokestatic 192	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   294: aconst_null
    //   295: astore_1
    //   296: goto -201 -> 95
    //   299: astore_1
    //   300: aconst_null
    //   301: astore_2
    //   302: aload_2
    //   303: ifnull +9 -> 312
    //   306: aload_2
    //   307: invokeinterface 220 1 0
    //   312: ldc_w 1411
    //   315: invokestatic 192	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   318: aload_1
    //   319: athrow
    //   320: astore_1
    //   321: goto -19 -> 302
    //   324: astore 5
    //   326: aconst_null
    //   327: astore_3
    //   328: goto -71 -> 257
    //
    // Exception table:
    //   from	to	target	type
    //   162	170	224	java/io/IOException
    //   64	72	255	android/database/sqlite/SQLiteException
    //   99	104	255	android/database/sqlite/SQLiteException
    //   106	111	255	android/database/sqlite/SQLiteException
    //   113	122	255	android/database/sqlite/SQLiteException
    //   124	133	255	android/database/sqlite/SQLiteException
    //   135	146	255	android/database/sqlite/SQLiteException
    //   148	153	255	android/database/sqlite/SQLiteException
    //   155	160	255	android/database/sqlite/SQLiteException
    //   162	170	255	android/database/sqlite/SQLiteException
    //   172	187	255	android/database/sqlite/SQLiteException
    //   189	197	255	android/database/sqlite/SQLiteException
    //   228	252	255	android/database/sqlite/SQLiteException
    //   24	62	299	finally
    //   64	72	320	finally
    //   99	104	320	finally
    //   106	111	320	finally
    //   113	122	320	finally
    //   124	133	320	finally
    //   135	146	320	finally
    //   148	153	320	finally
    //   155	160	320	finally
    //   162	170	320	finally
    //   172	187	320	finally
    //   189	197	320	finally
    //   228	252	320	finally
    //   259	278	320	finally
    //   24	62	324	android/database/sqlite/SQLiteException
  }

  public final long zzbg(String paramString)
  {
    AppMethodBeat.i(68683);
    Preconditions.checkNotEmpty(paramString);
    long l = zza("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[] { paramString }, 0L);
    AppMethodBeat.o(68683);
    return l;
  }

  public final List<zzed> zzc(String paramString1, String paramString2, String paramString3)
  {
    AppMethodBeat.i(68655);
    Preconditions.checkNotEmpty(paramString1);
    zzab();
    zzch();
    ArrayList localArrayList = new ArrayList(3);
    localArrayList.add(paramString1);
    paramString1 = new StringBuilder("app_id=?");
    if (!TextUtils.isEmpty(paramString2))
    {
      localArrayList.add(paramString2);
      paramString1.append(" and origin=?");
    }
    if (!TextUtils.isEmpty(paramString3))
    {
      localArrayList.add(String.valueOf(paramString3).concat("*"));
      paramString1.append(" and name glob ?");
    }
    paramString2 = (String[])localArrayList.toArray(new String[localArrayList.size()]);
    paramString1 = zzb(paramString1.toString(), paramString2);
    AppMethodBeat.o(68655);
    return paramString1;
  }

  @VisibleForTesting
  final void zzc(List<Long> paramList)
  {
    AppMethodBeat.i(68667);
    zzab();
    zzch();
    Preconditions.checkNotNull(paramList);
    Preconditions.checkNotZero(paramList.size());
    if (!zzhv())
      AppMethodBeat.o(68667);
    while (true)
    {
      return;
      paramList = TextUtils.join(",", paramList);
      String str = String.valueOf(paramList).length() + 2 + "(" + paramList + ")";
      if (zza(String.valueOf(str).length() + 80 + "SELECT COUNT(1) FROM queue WHERE rowid IN " + str + " AND retry_count =  2147483647 LIMIT 1", null) > 0L)
        zzge().zzip().log("The number of upload retries exceeds the limit. Will remain unchanged.");
      try
      {
        paramList = getWritableDatabase();
        int i = String.valueOf(str).length();
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>(i + 127);
        paramList.execSQL("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN " + str + " AND (retry_count IS NULL OR retry_count < 2147483647)");
        AppMethodBeat.o(68667);
      }
      catch (SQLiteException paramList)
      {
        zzge().zzim().zzg("Error incrementing retry count. error", paramList);
        AppMethodBeat.o(68667);
      }
    }
  }

  // ERROR //
  public final zzeq zzf(String paramString1, String paramString2)
  {
    // Byte code:
    //   0: ldc_w 1462
    //   3: invokestatic 163	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: aload_1
    //   7: invokestatic 299	com/google/android/gms/common/internal/Preconditions:checkNotEmpty	(Ljava/lang/String;)Ljava/lang/String;
    //   10: pop
    //   11: aload_2
    //   12: invokestatic 299	com/google/android/gms/common/internal/Preconditions:checkNotEmpty	(Ljava/lang/String;)Ljava/lang/String;
    //   15: pop
    //   16: aload_0
    //   17: invokevirtual 433	com/google/android/gms/internal/measurement/zzhg:zzab	()V
    //   20: aload_0
    //   21: invokevirtual 430	com/google/android/gms/internal/measurement/zzjq:zzch	()V
    //   24: aload_0
    //   25: invokevirtual 201	com/google/android/gms/internal/measurement/zzei:getWritableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   28: ldc_w 901
    //   31: bipush 7
    //   33: anewarray 19	java/lang/String
    //   36: dup
    //   37: iconst_0
    //   38: ldc_w 869
    //   41: aastore
    //   42: dup
    //   43: iconst_1
    //   44: ldc_w 874
    //   47: aastore
    //   48: dup
    //   49: iconst_2
    //   50: ldc_w 879
    //   53: aastore
    //   54: dup
    //   55: iconst_3
    //   56: ldc 21
    //   58: aastore
    //   59: dup
    //   60: iconst_4
    //   61: ldc 25
    //   63: aastore
    //   64: dup
    //   65: iconst_5
    //   66: ldc 29
    //   68: aastore
    //   69: dup
    //   70: bipush 6
    //   72: ldc 33
    //   74: aastore
    //   75: ldc_w 1464
    //   78: iconst_2
    //   79: anewarray 19	java/lang/String
    //   82: dup
    //   83: iconst_0
    //   84: aload_1
    //   85: aastore
    //   86: dup
    //   87: iconst_1
    //   88: aload_2
    //   89: aastore
    //   90: aconst_null
    //   91: aconst_null
    //   92: aconst_null
    //   93: invokevirtual 421	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   96: astore_3
    //   97: aload_3
    //   98: invokeinterface 213 1 0
    //   103: istore 4
    //   105: iload 4
    //   107: ifne +23 -> 130
    //   110: aload_3
    //   111: ifnull +9 -> 120
    //   114: aload_3
    //   115: invokeinterface 220 1 0
    //   120: aconst_null
    //   121: astore_1
    //   122: ldc_w 1462
    //   125: invokestatic 192	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   128: aload_1
    //   129: areturn
    //   130: aload_3
    //   131: iconst_0
    //   132: invokeinterface 217 2 0
    //   137: lstore 5
    //   139: aload_3
    //   140: iconst_1
    //   141: invokeinterface 217 2 0
    //   146: lstore 7
    //   148: aload_3
    //   149: iconst_2
    //   150: invokeinterface 217 2 0
    //   155: lstore 9
    //   157: aload_3
    //   158: iconst_3
    //   159: invokeinterface 1212 2 0
    //   164: ifeq +143 -> 307
    //   167: lconst_0
    //   168: lstore 11
    //   170: aload_3
    //   171: iconst_4
    //   172: invokeinterface 1212 2 0
    //   177: ifeq +142 -> 319
    //   180: aconst_null
    //   181: astore 13
    //   183: aload_3
    //   184: iconst_5
    //   185: invokeinterface 1212 2 0
    //   190: ifeq +144 -> 334
    //   193: aconst_null
    //   194: astore 14
    //   196: aconst_null
    //   197: astore 15
    //   199: aload_3
    //   200: bipush 6
    //   202: invokeinterface 1212 2 0
    //   207: ifne +26 -> 233
    //   210: aload_3
    //   211: bipush 6
    //   213: invokeinterface 217 2 0
    //   218: lconst_1
    //   219: lcmp
    //   220: ifne +133 -> 353
    //   223: iconst_1
    //   224: istore 4
    //   226: iload 4
    //   228: invokestatic 809	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   231: astore 15
    //   233: new 864	com/google/android/gms/internal/measurement/zzeq
    //   236: astore 16
    //   238: aload 16
    //   240: aload_1
    //   241: aload_2
    //   242: lload 5
    //   244: lload 7
    //   246: lload 9
    //   248: lload 11
    //   250: aload 13
    //   252: aload 14
    //   254: aload 15
    //   256: invokespecial 1467	com/google/android/gms/internal/measurement/zzeq:<init>	(Ljava/lang/String;Ljava/lang/String;JJJJLjava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;)V
    //   259: aload_3
    //   260: invokeinterface 1218 1 0
    //   265: ifeq +20 -> 285
    //   268: aload_0
    //   269: invokevirtual 229	com/google/android/gms/internal/measurement/zzhg:zzge	()Lcom/google/android/gms/internal/measurement/zzfg;
    //   272: invokevirtual 235	com/google/android/gms/internal/measurement/zzfg:zzim	()Lcom/google/android/gms/internal/measurement/zzfi;
    //   275: ldc_w 1469
    //   278: aload_1
    //   279: invokestatic 448	com/google/android/gms/internal/measurement/zzfg:zzbm	(Ljava/lang/String;)Ljava/lang/Object;
    //   282: invokevirtual 265	com/google/android/gms/internal/measurement/zzfi:zzg	(Ljava/lang/String;Ljava/lang/Object;)V
    //   285: aload_3
    //   286: ifnull +9 -> 295
    //   289: aload_3
    //   290: invokeinterface 220 1 0
    //   295: ldc_w 1462
    //   298: invokestatic 192	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   301: aload 16
    //   303: astore_1
    //   304: goto -176 -> 128
    //   307: aload_3
    //   308: iconst_3
    //   309: invokeinterface 217 2 0
    //   314: lstore 11
    //   316: goto -146 -> 170
    //   319: aload_3
    //   320: iconst_4
    //   321: invokeinterface 217 2 0
    //   326: invokestatic 275	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   329: astore 13
    //   331: goto -148 -> 183
    //   334: aload_3
    //   335: iconst_5
    //   336: invokeinterface 217 2 0
    //   341: lstore 17
    //   343: lload 17
    //   345: invokestatic 275	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   348: astore 14
    //   350: goto -154 -> 196
    //   353: iconst_0
    //   354: istore 4
    //   356: goto -130 -> 226
    //   359: astore 13
    //   361: aconst_null
    //   362: astore_3
    //   363: aload_0
    //   364: invokevirtual 229	com/google/android/gms/internal/measurement/zzhg:zzge	()Lcom/google/android/gms/internal/measurement/zzfg;
    //   367: invokevirtual 235	com/google/android/gms/internal/measurement/zzfg:zzim	()Lcom/google/android/gms/internal/measurement/zzfi;
    //   370: ldc_w 1471
    //   373: aload_1
    //   374: invokestatic 448	com/google/android/gms/internal/measurement/zzfg:zzbm	(Ljava/lang/String;)Ljava/lang/Object;
    //   377: aload_0
    //   378: invokevirtual 1072	com/google/android/gms/internal/measurement/zzhg:zzga	()Lcom/google/android/gms/internal/measurement/zzfe;
    //   381: aload_2
    //   382: invokevirtual 1078	com/google/android/gms/internal/measurement/zzfe:zzbj	(Ljava/lang/String;)Ljava/lang/String;
    //   385: aload 13
    //   387: invokevirtual 456	com/google/android/gms/internal/measurement/zzfi:zzd	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   390: aload_3
    //   391: ifnull +9 -> 400
    //   394: aload_3
    //   395: invokeinterface 220 1 0
    //   400: aconst_null
    //   401: astore_1
    //   402: ldc_w 1462
    //   405: invokestatic 192	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   408: goto -280 -> 128
    //   411: astore_1
    //   412: aconst_null
    //   413: astore_3
    //   414: aload_3
    //   415: ifnull +9 -> 424
    //   418: aload_3
    //   419: invokeinterface 220 1 0
    //   424: ldc_w 1462
    //   427: invokestatic 192	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   430: aload_1
    //   431: athrow
    //   432: astore_1
    //   433: goto -19 -> 414
    //   436: astore_1
    //   437: goto -23 -> 414
    //   440: astore 13
    //   442: goto -79 -> 363
    //
    // Exception table:
    //   from	to	target	type
    //   24	97	359	android/database/sqlite/SQLiteException
    //   24	97	411	finally
    //   97	105	432	finally
    //   130	167	432	finally
    //   170	180	432	finally
    //   183	193	432	finally
    //   199	223	432	finally
    //   226	233	432	finally
    //   233	285	432	finally
    //   307	316	432	finally
    //   319	331	432	finally
    //   334	343	432	finally
    //   363	390	436	finally
    //   97	105	440	android/database/sqlite/SQLiteException
    //   130	167	440	android/database/sqlite/SQLiteException
    //   170	180	440	android/database/sqlite/SQLiteException
    //   183	193	440	android/database/sqlite/SQLiteException
    //   199	223	440	android/database/sqlite/SQLiteException
    //   226	233	440	android/database/sqlite/SQLiteException
    //   233	285	440	android/database/sqlite/SQLiteException
    //   307	316	440	android/database/sqlite/SQLiteException
    //   319	331	440	android/database/sqlite/SQLiteException
    //   334	343	440	android/database/sqlite/SQLiteException
  }

  public final void zzg(String paramString1, String paramString2)
  {
    AppMethodBeat.i(68647);
    Preconditions.checkNotEmpty(paramString1);
    Preconditions.checkNotEmpty(paramString2);
    zzab();
    zzch();
    try
    {
      int i = getWritableDatabase().delete("user_attributes", "app_id=? and name=?", new String[] { paramString1, paramString2 });
      zzge().zzit().zzg("Deleted user attribute rows", Integer.valueOf(i));
      AppMethodBeat.o(68647);
      return;
    }
    catch (SQLiteException localSQLiteException)
    {
      while (true)
      {
        zzge().zzim().zzd("Error deleting user attribute. appId", zzfg.zzbm(paramString1), zzga().zzbl(paramString2), localSQLiteException);
        AppMethodBeat.o(68647);
      }
    }
  }

  // ERROR //
  public final zzjz zzh(String paramString1, String paramString2)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: ldc_w 1480
    //   5: invokestatic 163	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   8: aload_1
    //   9: invokestatic 299	com/google/android/gms/common/internal/Preconditions:checkNotEmpty	(Ljava/lang/String;)Ljava/lang/String;
    //   12: pop
    //   13: aload_2
    //   14: invokestatic 299	com/google/android/gms/common/internal/Preconditions:checkNotEmpty	(Ljava/lang/String;)Ljava/lang/String;
    //   17: pop
    //   18: aload_0
    //   19: invokevirtual 433	com/google/android/gms/internal/measurement/zzhg:zzab	()V
    //   22: aload_0
    //   23: invokevirtual 430	com/google/android/gms/internal/measurement/zzjq:zzch	()V
    //   26: aload_0
    //   27: invokevirtual 201	com/google/android/gms/internal/measurement/zzei:getWritableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   30: ldc_w 1119
    //   33: iconst_3
    //   34: anewarray 19	java/lang/String
    //   37: dup
    //   38: iconst_0
    //   39: ldc_w 1113
    //   42: aastore
    //   43: dup
    //   44: iconst_1
    //   45: ldc_w 962
    //   48: aastore
    //   49: dup
    //   50: iconst_2
    //   51: ldc 39
    //   53: aastore
    //   54: ldc_w 1464
    //   57: iconst_2
    //   58: anewarray 19	java/lang/String
    //   61: dup
    //   62: iconst_0
    //   63: aload_1
    //   64: aastore
    //   65: dup
    //   66: iconst_1
    //   67: aload_2
    //   68: aastore
    //   69: aconst_null
    //   70: aconst_null
    //   71: aconst_null
    //   72: invokevirtual 421	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   75: astore 4
    //   77: aload 4
    //   79: invokeinterface 213 1 0
    //   84: istore 5
    //   86: iload 5
    //   88: ifne +25 -> 113
    //   91: aload 4
    //   93: ifnull +10 -> 103
    //   96: aload 4
    //   98: invokeinterface 220 1 0
    //   103: ldc_w 1480
    //   106: invokestatic 192	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   109: aconst_null
    //   110: astore_1
    //   111: aload_1
    //   112: areturn
    //   113: aload 4
    //   115: iconst_0
    //   116: invokeinterface 217 2 0
    //   121: lstore 6
    //   123: aload_0
    //   124: aload 4
    //   126: iconst_1
    //   127: invokespecial 1249	com/google/android/gms/internal/measurement/zzei:zza	(Landroid/database/Cursor;I)Ljava/lang/Object;
    //   130: astore 8
    //   132: aload 4
    //   134: iconst_2
    //   135: invokeinterface 288 2 0
    //   140: astore 9
    //   142: new 1098	com/google/android/gms/internal/measurement/zzjz
    //   145: astore_3
    //   146: aload_3
    //   147: aload_1
    //   148: aload 9
    //   150: aload_2
    //   151: lload 6
    //   153: aload 8
    //   155: invokespecial 1254	com/google/android/gms/internal/measurement/zzjz:<init>	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/Object;)V
    //   158: aload 4
    //   160: invokeinterface 1218 1 0
    //   165: ifeq +20 -> 185
    //   168: aload_0
    //   169: invokevirtual 229	com/google/android/gms/internal/measurement/zzhg:zzge	()Lcom/google/android/gms/internal/measurement/zzfg;
    //   172: invokevirtual 235	com/google/android/gms/internal/measurement/zzfg:zzim	()Lcom/google/android/gms/internal/measurement/zzfi;
    //   175: ldc_w 1482
    //   178: aload_1
    //   179: invokestatic 448	com/google/android/gms/internal/measurement/zzfg:zzbm	(Ljava/lang/String;)Ljava/lang/Object;
    //   182: invokevirtual 265	com/google/android/gms/internal/measurement/zzfi:zzg	(Ljava/lang/String;Ljava/lang/Object;)V
    //   185: aload 4
    //   187: ifnull +10 -> 197
    //   190: aload 4
    //   192: invokeinterface 220 1 0
    //   197: ldc_w 1480
    //   200: invokestatic 192	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   203: aload_3
    //   204: astore_1
    //   205: goto -94 -> 111
    //   208: astore_3
    //   209: aconst_null
    //   210: astore 4
    //   212: aload_0
    //   213: invokevirtual 229	com/google/android/gms/internal/measurement/zzhg:zzge	()Lcom/google/android/gms/internal/measurement/zzfg;
    //   216: invokevirtual 235	com/google/android/gms/internal/measurement/zzfg:zzim	()Lcom/google/android/gms/internal/measurement/zzfi;
    //   219: ldc_w 1484
    //   222: aload_1
    //   223: invokestatic 448	com/google/android/gms/internal/measurement/zzfg:zzbm	(Ljava/lang/String;)Ljava/lang/Object;
    //   226: aload_0
    //   227: invokevirtual 1072	com/google/android/gms/internal/measurement/zzhg:zzga	()Lcom/google/android/gms/internal/measurement/zzfe;
    //   230: aload_2
    //   231: invokevirtual 1479	com/google/android/gms/internal/measurement/zzfe:zzbl	(Ljava/lang/String;)Ljava/lang/String;
    //   234: aload_3
    //   235: invokevirtual 456	com/google/android/gms/internal/measurement/zzfi:zzd	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   238: aload 4
    //   240: ifnull +10 -> 250
    //   243: aload 4
    //   245: invokeinterface 220 1 0
    //   250: ldc_w 1480
    //   253: invokestatic 192	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   256: aconst_null
    //   257: astore_1
    //   258: goto -147 -> 111
    //   261: astore_1
    //   262: aload_3
    //   263: astore_2
    //   264: aload_2
    //   265: ifnull +9 -> 274
    //   268: aload_2
    //   269: invokeinterface 220 1 0
    //   274: ldc_w 1480
    //   277: invokestatic 192	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   280: aload_1
    //   281: athrow
    //   282: astore_1
    //   283: aload 4
    //   285: astore_2
    //   286: goto -22 -> 264
    //   289: astore_1
    //   290: aload 4
    //   292: astore_2
    //   293: goto -29 -> 264
    //   296: astore_3
    //   297: goto -85 -> 212
    //
    // Exception table:
    //   from	to	target	type
    //   26	77	208	android/database/sqlite/SQLiteException
    //   26	77	261	finally
    //   77	86	282	finally
    //   113	185	282	finally
    //   212	238	289	finally
    //   77	86	296	android/database/sqlite/SQLiteException
    //   113	185	296	android/database/sqlite/SQLiteException
  }

  protected final boolean zzhf()
  {
    return false;
  }

  // ERROR //
  public final String zzhn()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: ldc_w 1487
    //   5: invokestatic 163	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   8: aload_0
    //   9: invokevirtual 201	com/google/android/gms/internal/measurement/zzei:getWritableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   12: astore_2
    //   13: aload_2
    //   14: ldc_w 1489
    //   17: aconst_null
    //   18: invokevirtual 207	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   21: astore_3
    //   22: aload_3
    //   23: astore_2
    //   24: aload_3
    //   25: invokeinterface 213 1 0
    //   30: ifeq +35 -> 65
    //   33: aload_3
    //   34: astore_2
    //   35: aload_3
    //   36: iconst_0
    //   37: invokeinterface 288 2 0
    //   42: astore 4
    //   44: aload 4
    //   46: astore_2
    //   47: aload_3
    //   48: ifnull +9 -> 57
    //   51: aload_3
    //   52: invokeinterface 220 1 0
    //   57: ldc_w 1487
    //   60: invokestatic 192	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   63: aload_2
    //   64: areturn
    //   65: aload_3
    //   66: ifnull +9 -> 75
    //   69: aload_3
    //   70: invokeinterface 220 1 0
    //   75: ldc_w 1487
    //   78: invokestatic 192	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   81: aload_1
    //   82: astore_2
    //   83: goto -20 -> 63
    //   86: astore 4
    //   88: aconst_null
    //   89: astore_3
    //   90: aload_3
    //   91: astore_2
    //   92: aload_0
    //   93: invokevirtual 229	com/google/android/gms/internal/measurement/zzhg:zzge	()Lcom/google/android/gms/internal/measurement/zzfg;
    //   96: invokevirtual 235	com/google/android/gms/internal/measurement/zzfg:zzim	()Lcom/google/android/gms/internal/measurement/zzfi;
    //   99: ldc_w 1491
    //   102: aload 4
    //   104: invokevirtual 265	com/google/android/gms/internal/measurement/zzfi:zzg	(Ljava/lang/String;Ljava/lang/Object;)V
    //   107: aload_3
    //   108: ifnull +9 -> 117
    //   111: aload_3
    //   112: invokeinterface 220 1 0
    //   117: ldc_w 1487
    //   120: invokestatic 192	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   123: aload_1
    //   124: astore_2
    //   125: goto -62 -> 63
    //   128: astore_3
    //   129: aconst_null
    //   130: astore_2
    //   131: aload_2
    //   132: ifnull +9 -> 141
    //   135: aload_2
    //   136: invokeinterface 220 1 0
    //   141: ldc_w 1487
    //   144: invokestatic 192	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   147: aload_3
    //   148: athrow
    //   149: astore_3
    //   150: goto -19 -> 131
    //   153: astore 4
    //   155: goto -65 -> 90
    //
    // Exception table:
    //   from	to	target	type
    //   13	22	86	android/database/sqlite/SQLiteException
    //   13	22	128	finally
    //   24	33	149	finally
    //   35	44	149	finally
    //   92	107	149	finally
    //   24	33	153	android/database/sqlite/SQLiteException
    //   35	44	153	android/database/sqlite/SQLiteException
  }

  public final boolean zzho()
  {
    AppMethodBeat.i(68664);
    boolean bool;
    if (zza("select count(1) > 0 from queue where has_realtime = 1", null) != 0L)
    {
      bool = true;
      AppMethodBeat.o(68664);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(68664);
    }
  }

  final void zzhp()
  {
    AppMethodBeat.i(68666);
    zzab();
    zzch();
    if (!zzhv())
      AppMethodBeat.o(68666);
    while (true)
    {
      return;
      long l1 = zzgf().zzajx.get();
      long l2 = zzbt().elapsedRealtime();
      if (Math.abs(l2 - l1) > ((Long)zzew.zzahg.get()).longValue())
      {
        zzgf().zzajx.set(l2);
        zzab();
        zzch();
        if (zzhv())
        {
          int i = getWritableDatabase().delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[] { String.valueOf(zzbt().currentTimeMillis()), String.valueOf(zzef.zzhh()) });
          if (i > 0)
            zzge().zzit().zzg("Deleted stale rows. rowsDeleted", Integer.valueOf(i));
        }
      }
      AppMethodBeat.o(68666);
    }
  }

  public final long zzhq()
  {
    AppMethodBeat.i(68677);
    long l = zza("select max(bundle_end_timestamp) from queue", null, 0L);
    AppMethodBeat.o(68677);
    return l;
  }

  public final long zzhr()
  {
    AppMethodBeat.i(68679);
    long l = zza("select max(timestamp) from raw_events", null, 0L);
    AppMethodBeat.o(68679);
    return l;
  }

  public final boolean zzhs()
  {
    AppMethodBeat.i(68681);
    boolean bool;
    if (zza("select count(1) > 0 from raw_events", null) != 0L)
    {
      bool = true;
      AppMethodBeat.o(68681);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(68681);
    }
  }

  public final boolean zzht()
  {
    AppMethodBeat.i(68682);
    boolean bool;
    if (zza("select count(1) > 0 from raw_events where realtime = 1", null) != 0L)
    {
      bool = true;
      AppMethodBeat.o(68682);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(68682);
    }
  }

  public final long zzhu()
  {
    long l1 = -1L;
    Object localObject1 = null;
    Object localObject2 = null;
    AppMethodBeat.i(68685);
    try
    {
      Cursor localCursor = getWritableDatabase().rawQuery("select rowid from raw_events order by rowid desc limit 1;", null);
      localObject2 = localCursor;
      localObject1 = localCursor;
      boolean bool = localCursor.moveToFirst();
      if (!bool);
      while (true)
      {
        return l1;
        localObject2 = localCursor;
        localObject1 = localCursor;
        long l2 = localCursor.getLong(0);
        l1 = l2;
        if (localCursor != null)
          localCursor.close();
        AppMethodBeat.o(68685);
      }
    }
    catch (SQLiteException localSQLiteException)
    {
      while (true)
      {
        localObject1 = localObject2;
        zzge().zzim().zzg("Error querying raw events", localSQLiteException);
        if (localObject2 != null)
          localObject2.close();
        AppMethodBeat.o(68685);
      }
    }
    finally
    {
      if (localObject1 != null)
        localObject1.close();
      AppMethodBeat.o(68685);
    }
  }

  // ERROR //
  public final zzed zzi(String paramString1, String paramString2)
  {
    // Byte code:
    //   0: ldc_w 1556
    //   3: invokestatic 163	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: aload_1
    //   7: invokestatic 299	com/google/android/gms/common/internal/Preconditions:checkNotEmpty	(Ljava/lang/String;)Ljava/lang/String;
    //   10: pop
    //   11: aload_2
    //   12: invokestatic 299	com/google/android/gms/common/internal/Preconditions:checkNotEmpty	(Ljava/lang/String;)Ljava/lang/String;
    //   15: pop
    //   16: aload_0
    //   17: invokevirtual 433	com/google/android/gms/internal/measurement/zzhg:zzab	()V
    //   20: aload_0
    //   21: invokevirtual 430	com/google/android/gms/internal/measurement/zzjq:zzch	()V
    //   24: aload_0
    //   25: invokevirtual 201	com/google/android/gms/internal/measurement/zzei:getWritableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   28: ldc_w 1019
    //   31: bipush 11
    //   33: anewarray 19	java/lang/String
    //   36: dup
    //   37: iconst_0
    //   38: ldc 39
    //   40: aastore
    //   41: dup
    //   42: iconst_1
    //   43: ldc_w 962
    //   46: aastore
    //   47: dup
    //   48: iconst_2
    //   49: ldc_w 970
    //   52: aastore
    //   53: dup
    //   54: iconst_3
    //   55: ldc_w 975
    //   58: aastore
    //   59: dup
    //   60: iconst_4
    //   61: ldc_w 980
    //   64: aastore
    //   65: dup
    //   66: iconst_5
    //   67: ldc_w 985
    //   70: aastore
    //   71: dup
    //   72: bipush 6
    //   74: ldc_w 994
    //   77: aastore
    //   78: dup
    //   79: bipush 7
    //   81: ldc_w 999
    //   84: aastore
    //   85: dup
    //   86: bipush 8
    //   88: ldc_w 1004
    //   91: aastore
    //   92: dup
    //   93: bipush 9
    //   95: ldc_w 1009
    //   98: aastore
    //   99: dup
    //   100: bipush 10
    //   102: ldc_w 1014
    //   105: aastore
    //   106: ldc_w 1464
    //   109: iconst_2
    //   110: anewarray 19	java/lang/String
    //   113: dup
    //   114: iconst_0
    //   115: aload_1
    //   116: aastore
    //   117: dup
    //   118: iconst_1
    //   119: aload_2
    //   120: aastore
    //   121: aconst_null
    //   122: aconst_null
    //   123: aconst_null
    //   124: invokevirtual 421	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   127: astore_3
    //   128: aload_3
    //   129: invokeinterface 213 1 0
    //   134: istore 4
    //   136: iload 4
    //   138: ifne +23 -> 161
    //   141: aload_3
    //   142: ifnull +9 -> 151
    //   145: aload_3
    //   146: invokeinterface 220 1 0
    //   151: aconst_null
    //   152: astore_1
    //   153: ldc_w 1556
    //   156: invokestatic 192	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   159: aload_1
    //   160: areturn
    //   161: aload_3
    //   162: iconst_0
    //   163: invokeinterface 288 2 0
    //   168: astore 5
    //   170: aload_0
    //   171: aload_3
    //   172: iconst_1
    //   173: invokespecial 1249	com/google/android/gms/internal/measurement/zzei:zza	(Landroid/database/Cursor;I)Ljava/lang/Object;
    //   176: astore 6
    //   178: aload_3
    //   179: iconst_2
    //   180: invokeinterface 1215 2 0
    //   185: ifeq +226 -> 411
    //   188: iconst_1
    //   189: istore 4
    //   191: aload_3
    //   192: iconst_3
    //   193: invokeinterface 288 2 0
    //   198: astore 7
    //   200: aload_3
    //   201: iconst_4
    //   202: invokeinterface 217 2 0
    //   207: lstore 8
    //   209: aload_0
    //   210: invokevirtual 655	com/google/android/gms/internal/measurement/zzhg:zzgb	()Lcom/google/android/gms/internal/measurement/zzka;
    //   213: aload_3
    //   214: iconst_5
    //   215: invokeinterface 698 2 0
    //   220: getstatic 1267	com/google/android/gms/internal/measurement/zzeu:CREATOR	Landroid/os/Parcelable$Creator;
    //   223: invokevirtual 1270	com/google/android/gms/internal/measurement/zzka:zza	([BLandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;
    //   226: checkcast 1263	com/google/android/gms/internal/measurement/zzeu
    //   229: astore 10
    //   231: aload_3
    //   232: bipush 6
    //   234: invokeinterface 217 2 0
    //   239: lstore 11
    //   241: aload_0
    //   242: invokevirtual 655	com/google/android/gms/internal/measurement/zzhg:zzgb	()Lcom/google/android/gms/internal/measurement/zzka;
    //   245: aload_3
    //   246: bipush 7
    //   248: invokeinterface 698 2 0
    //   253: getstatic 1267	com/google/android/gms/internal/measurement/zzeu:CREATOR	Landroid/os/Parcelable$Creator;
    //   256: invokevirtual 1270	com/google/android/gms/internal/measurement/zzka:zza	([BLandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;
    //   259: checkcast 1263	com/google/android/gms/internal/measurement/zzeu
    //   262: astore 13
    //   264: aload_3
    //   265: bipush 8
    //   267: invokeinterface 217 2 0
    //   272: lstore 14
    //   274: aload_3
    //   275: bipush 9
    //   277: invokeinterface 217 2 0
    //   282: lstore 16
    //   284: aload_0
    //   285: invokevirtual 655	com/google/android/gms/internal/measurement/zzhg:zzgb	()Lcom/google/android/gms/internal/measurement/zzka;
    //   288: aload_3
    //   289: bipush 10
    //   291: invokeinterface 698 2 0
    //   296: getstatic 1267	com/google/android/gms/internal/measurement/zzeu:CREATOR	Landroid/os/Parcelable$Creator;
    //   299: invokevirtual 1270	com/google/android/gms/internal/measurement/zzka:zza	([BLandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;
    //   302: checkcast 1263	com/google/android/gms/internal/measurement/zzeu
    //   305: astore 18
    //   307: new 949	com/google/android/gms/internal/measurement/zzjx
    //   310: astore 19
    //   312: aload 19
    //   314: aload_2
    //   315: lload 14
    //   317: aload 6
    //   319: aload 5
    //   321: invokespecial 1273	com/google/android/gms/internal/measurement/zzjx:<init>	(Ljava/lang/String;JLjava/lang/Object;Ljava/lang/String;)V
    //   324: new 940	com/google/android/gms/internal/measurement/zzed
    //   327: astore 6
    //   329: aload 6
    //   331: aload_1
    //   332: aload 5
    //   334: aload 19
    //   336: lload 11
    //   338: iload 4
    //   340: aload 7
    //   342: aload 10
    //   344: lload 8
    //   346: aload 13
    //   348: lload 16
    //   350: aload 18
    //   352: invokespecial 1276	com/google/android/gms/internal/measurement/zzed:<init>	(Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/measurement/zzjx;JZLjava/lang/String;Lcom/google/android/gms/internal/measurement/zzeu;JLcom/google/android/gms/internal/measurement/zzeu;JLcom/google/android/gms/internal/measurement/zzeu;)V
    //   355: aload_3
    //   356: invokeinterface 1218 1 0
    //   361: ifeq +28 -> 389
    //   364: aload_0
    //   365: invokevirtual 229	com/google/android/gms/internal/measurement/zzhg:zzge	()Lcom/google/android/gms/internal/measurement/zzfg;
    //   368: invokevirtual 235	com/google/android/gms/internal/measurement/zzfg:zzim	()Lcom/google/android/gms/internal/measurement/zzfi;
    //   371: ldc_w 1558
    //   374: aload_1
    //   375: invokestatic 448	com/google/android/gms/internal/measurement/zzfg:zzbm	(Ljava/lang/String;)Ljava/lang/Object;
    //   378: aload_0
    //   379: invokevirtual 1072	com/google/android/gms/internal/measurement/zzhg:zzga	()Lcom/google/android/gms/internal/measurement/zzfe;
    //   382: aload_2
    //   383: invokevirtual 1479	com/google/android/gms/internal/measurement/zzfe:zzbl	(Ljava/lang/String;)Ljava/lang/String;
    //   386: invokevirtual 243	com/google/android/gms/internal/measurement/zzfi:zze	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   389: aload_3
    //   390: ifnull +9 -> 399
    //   393: aload_3
    //   394: invokeinterface 220 1 0
    //   399: ldc_w 1556
    //   402: invokestatic 192	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   405: aload 6
    //   407: astore_1
    //   408: goto -249 -> 159
    //   411: iconst_0
    //   412: istore 4
    //   414: goto -223 -> 191
    //   417: astore 6
    //   419: aconst_null
    //   420: astore_3
    //   421: aload_0
    //   422: invokevirtual 229	com/google/android/gms/internal/measurement/zzhg:zzge	()Lcom/google/android/gms/internal/measurement/zzfg;
    //   425: invokevirtual 235	com/google/android/gms/internal/measurement/zzfg:zzim	()Lcom/google/android/gms/internal/measurement/zzfi;
    //   428: ldc_w 1560
    //   431: aload_1
    //   432: invokestatic 448	com/google/android/gms/internal/measurement/zzfg:zzbm	(Ljava/lang/String;)Ljava/lang/Object;
    //   435: aload_0
    //   436: invokevirtual 1072	com/google/android/gms/internal/measurement/zzhg:zzga	()Lcom/google/android/gms/internal/measurement/zzfe;
    //   439: aload_2
    //   440: invokevirtual 1479	com/google/android/gms/internal/measurement/zzfe:zzbl	(Ljava/lang/String;)Ljava/lang/String;
    //   443: aload 6
    //   445: invokevirtual 456	com/google/android/gms/internal/measurement/zzfi:zzd	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   448: aload_3
    //   449: ifnull +9 -> 458
    //   452: aload_3
    //   453: invokeinterface 220 1 0
    //   458: aconst_null
    //   459: astore_1
    //   460: ldc_w 1556
    //   463: invokestatic 192	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   466: goto -307 -> 159
    //   469: astore_1
    //   470: aconst_null
    //   471: astore_3
    //   472: aload_3
    //   473: ifnull +9 -> 482
    //   476: aload_3
    //   477: invokeinterface 220 1 0
    //   482: ldc_w 1556
    //   485: invokestatic 192	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   488: aload_1
    //   489: athrow
    //   490: astore_1
    //   491: goto -19 -> 472
    //   494: astore_1
    //   495: goto -23 -> 472
    //   498: astore 6
    //   500: goto -79 -> 421
    //
    // Exception table:
    //   from	to	target	type
    //   24	128	417	android/database/sqlite/SQLiteException
    //   24	128	469	finally
    //   128	136	490	finally
    //   161	188	490	finally
    //   191	389	490	finally
    //   421	448	494	finally
    //   128	136	498	android/database/sqlite/SQLiteException
    //   161	188	498	android/database/sqlite/SQLiteException
    //   191	389	498	android/database/sqlite/SQLiteException
  }

  public final int zzj(String paramString1, String paramString2)
  {
    int i = 0;
    AppMethodBeat.i(68654);
    Preconditions.checkNotEmpty(paramString1);
    Preconditions.checkNotEmpty(paramString2);
    zzab();
    zzch();
    try
    {
      j = getWritableDatabase().delete("conditional_properties", "app_id=? and name=?", new String[] { paramString1, paramString2 });
      AppMethodBeat.o(68654);
      return j;
    }
    catch (SQLiteException localSQLiteException)
    {
      while (true)
      {
        zzge().zzim().zzd("Error deleting conditional property", zzfg.zzbm(paramString1), zzga().zzbl(paramString2), localSQLiteException);
        AppMethodBeat.o(68654);
        int j = i;
      }
    }
  }

  // ERROR //
  final java.util.Map<Integer, List<zzke>> zzk(String paramString1, String paramString2)
  {
    // Byte code:
    //   0: ldc_w 1568
    //   3: invokestatic 163	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: aload_0
    //   7: invokevirtual 430	com/google/android/gms/internal/measurement/zzjq:zzch	()V
    //   10: aload_0
    //   11: invokevirtual 433	com/google/android/gms/internal/measurement/zzhg:zzab	()V
    //   14: aload_1
    //   15: invokestatic 299	com/google/android/gms/common/internal/Preconditions:checkNotEmpty	(Ljava/lang/String;)Ljava/lang/String;
    //   18: pop
    //   19: aload_2
    //   20: invokestatic 299	com/google/android/gms/common/internal/Preconditions:checkNotEmpty	(Ljava/lang/String;)Ljava/lang/String;
    //   23: pop
    //   24: new 1415	android/support/v4/f/a
    //   27: dup
    //   28: invokespecial 1416	android/support/v4/f/a:<init>	()V
    //   31: astore_3
    //   32: aload_0
    //   33: invokevirtual 201	com/google/android/gms/internal/measurement/zzei:getWritableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   36: astore 4
    //   38: aload 4
    //   40: ldc_w 492
    //   43: iconst_2
    //   44: anewarray 19	java/lang/String
    //   47: dup
    //   48: iconst_0
    //   49: ldc_w 478
    //   52: aastore
    //   53: dup
    //   54: iconst_1
    //   55: ldc_w 487
    //   58: aastore
    //   59: ldc_w 1570
    //   62: iconst_2
    //   63: anewarray 19	java/lang/String
    //   66: dup
    //   67: iconst_0
    //   68: aload_1
    //   69: aastore
    //   70: dup
    //   71: iconst_1
    //   72: aload_2
    //   73: aastore
    //   74: aconst_null
    //   75: aconst_null
    //   76: aconst_null
    //   77: invokevirtual 421	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   80: astore 4
    //   82: aload 4
    //   84: astore_2
    //   85: aload 4
    //   87: invokeinterface 213 1 0
    //   92: ifne +34 -> 126
    //   95: aload 4
    //   97: astore_2
    //   98: invokestatic 1574	java/util/Collections:emptyMap	()Ljava/util/Map;
    //   101: astore 5
    //   103: aload 5
    //   105: astore_1
    //   106: aload 4
    //   108: ifnull +10 -> 118
    //   111: aload 4
    //   113: invokeinterface 220 1 0
    //   118: ldc_w 1568
    //   121: invokestatic 192	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   124: aload_1
    //   125: areturn
    //   126: aload 4
    //   128: astore_2
    //   129: aload 4
    //   131: iconst_1
    //   132: invokeinterface 698 2 0
    //   137: astore 5
    //   139: aload 4
    //   141: astore_2
    //   142: aload 5
    //   144: iconst_0
    //   145: aload 5
    //   147: arraylength
    //   148: invokestatic 703	com/google/android/gms/internal/measurement/zzabv:zza	([BII)Lcom/google/android/gms/internal/measurement/zzabv;
    //   151: astore 5
    //   153: aload 4
    //   155: astore_2
    //   156: new 435	com/google/android/gms/internal/measurement/zzke
    //   159: astore 6
    //   161: aload 4
    //   163: astore_2
    //   164: aload 6
    //   166: invokespecial 1575	com/google/android/gms/internal/measurement/zzke:<init>	()V
    //   169: aload 4
    //   171: astore_2
    //   172: aload 6
    //   174: aload 5
    //   176: invokevirtual 709	com/google/android/gms/internal/measurement/zzace:zzb	(Lcom/google/android/gms/internal/measurement/zzabv;)Lcom/google/android/gms/internal/measurement/zzace;
    //   179: pop
    //   180: aload 4
    //   182: astore_2
    //   183: aload 4
    //   185: iconst_0
    //   186: invokeinterface 1215 2 0
    //   191: istore 7
    //   193: aload 4
    //   195: astore_2
    //   196: aload_3
    //   197: iload 7
    //   199: invokestatic 261	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   202: invokeinterface 1577 2 0
    //   207: checkcast 561	java/util/List
    //   210: astore 8
    //   212: aload 8
    //   214: astore 5
    //   216: aload 8
    //   218: ifnonnull +36 -> 254
    //   221: aload 4
    //   223: astore_2
    //   224: new 558	java/util/ArrayList
    //   227: astore 5
    //   229: aload 4
    //   231: astore_2
    //   232: aload 5
    //   234: invokespecial 559	java/util/ArrayList:<init>	()V
    //   237: aload 4
    //   239: astore_2
    //   240: aload_3
    //   241: iload 7
    //   243: invokestatic 261	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   246: aload 5
    //   248: invokeinterface 1424 3 0
    //   253: pop
    //   254: aload 4
    //   256: astore_2
    //   257: aload 5
    //   259: aload 6
    //   261: invokeinterface 576 2 0
    //   266: pop
    //   267: aload 4
    //   269: astore_2
    //   270: aload 4
    //   272: invokeinterface 1218 1 0
    //   277: istore 9
    //   279: iload 9
    //   281: ifne -155 -> 126
    //   284: aload 4
    //   286: ifnull +10 -> 296
    //   289: aload 4
    //   291: invokeinterface 220 1 0
    //   296: ldc_w 1568
    //   299: invokestatic 192	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   302: aload_3
    //   303: astore_1
    //   304: goto -180 -> 124
    //   307: astore 5
    //   309: aload 4
    //   311: astore_2
    //   312: aload_0
    //   313: invokevirtual 229	com/google/android/gms/internal/measurement/zzhg:zzge	()Lcom/google/android/gms/internal/measurement/zzfg;
    //   316: invokevirtual 235	com/google/android/gms/internal/measurement/zzfg:zzim	()Lcom/google/android/gms/internal/measurement/zzfi;
    //   319: ldc_w 1579
    //   322: aload_1
    //   323: invokestatic 448	com/google/android/gms/internal/measurement/zzfg:zzbm	(Ljava/lang/String;)Ljava/lang/Object;
    //   326: aload 5
    //   328: invokevirtual 243	com/google/android/gms/internal/measurement/zzfi:zze	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   331: goto -64 -> 267
    //   334: astore 5
    //   336: aload 4
    //   338: astore_2
    //   339: aload_0
    //   340: invokevirtual 229	com/google/android/gms/internal/measurement/zzhg:zzge	()Lcom/google/android/gms/internal/measurement/zzfg;
    //   343: invokevirtual 235	com/google/android/gms/internal/measurement/zzfg:zzim	()Lcom/google/android/gms/internal/measurement/zzfi;
    //   346: ldc_w 556
    //   349: aload_1
    //   350: invokestatic 448	com/google/android/gms/internal/measurement/zzfg:zzbm	(Ljava/lang/String;)Ljava/lang/Object;
    //   353: aload 5
    //   355: invokevirtual 243	com/google/android/gms/internal/measurement/zzfi:zze	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   358: aload 4
    //   360: ifnull +10 -> 370
    //   363: aload 4
    //   365: invokeinterface 220 1 0
    //   370: ldc_w 1568
    //   373: invokestatic 192	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   376: aconst_null
    //   377: astore_1
    //   378: goto -254 -> 124
    //   381: astore_1
    //   382: aconst_null
    //   383: astore_2
    //   384: aload_2
    //   385: ifnull +9 -> 394
    //   388: aload_2
    //   389: invokeinterface 220 1 0
    //   394: ldc_w 1568
    //   397: invokestatic 192	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   400: aload_1
    //   401: athrow
    //   402: astore_1
    //   403: goto -19 -> 384
    //   406: astore 5
    //   408: aconst_null
    //   409: astore 4
    //   411: goto -75 -> 336
    //
    // Exception table:
    //   from	to	target	type
    //   172	180	307	java/io/IOException
    //   85	95	334	android/database/sqlite/SQLiteException
    //   98	103	334	android/database/sqlite/SQLiteException
    //   129	139	334	android/database/sqlite/SQLiteException
    //   142	153	334	android/database/sqlite/SQLiteException
    //   156	161	334	android/database/sqlite/SQLiteException
    //   164	169	334	android/database/sqlite/SQLiteException
    //   172	180	334	android/database/sqlite/SQLiteException
    //   183	193	334	android/database/sqlite/SQLiteException
    //   196	212	334	android/database/sqlite/SQLiteException
    //   224	229	334	android/database/sqlite/SQLiteException
    //   232	237	334	android/database/sqlite/SQLiteException
    //   240	254	334	android/database/sqlite/SQLiteException
    //   257	267	334	android/database/sqlite/SQLiteException
    //   270	279	334	android/database/sqlite/SQLiteException
    //   312	331	334	android/database/sqlite/SQLiteException
    //   38	82	381	finally
    //   85	95	402	finally
    //   98	103	402	finally
    //   129	139	402	finally
    //   142	153	402	finally
    //   156	161	402	finally
    //   164	169	402	finally
    //   172	180	402	finally
    //   183	193	402	finally
    //   196	212	402	finally
    //   224	229	402	finally
    //   232	237	402	finally
    //   240	254	402	finally
    //   257	267	402	finally
    //   270	279	402	finally
    //   312	331	402	finally
    //   339	358	402	finally
    //   38	82	406	android/database/sqlite/SQLiteException
  }

  // ERROR //
  final java.util.Map<Integer, List<zzkh>> zzl(String paramString1, String paramString2)
  {
    // Byte code:
    //   0: ldc_w 1582
    //   3: invokestatic 163	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: aload_0
    //   7: invokevirtual 430	com/google/android/gms/internal/measurement/zzjq:zzch	()V
    //   10: aload_0
    //   11: invokevirtual 433	com/google/android/gms/internal/measurement/zzhg:zzab	()V
    //   14: aload_1
    //   15: invokestatic 299	com/google/android/gms/common/internal/Preconditions:checkNotEmpty	(Ljava/lang/String;)Ljava/lang/String;
    //   18: pop
    //   19: aload_2
    //   20: invokestatic 299	com/google/android/gms/common/internal/Preconditions:checkNotEmpty	(Ljava/lang/String;)Ljava/lang/String;
    //   23: pop
    //   24: new 1415	android/support/v4/f/a
    //   27: dup
    //   28: invokespecial 1416	android/support/v4/f/a:<init>	()V
    //   31: astore_3
    //   32: aload_0
    //   33: invokevirtual 201	com/google/android/gms/internal/measurement/zzei:getWritableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   36: astore 4
    //   38: aload 4
    //   40: ldc_w 518
    //   43: iconst_2
    //   44: anewarray 19	java/lang/String
    //   47: dup
    //   48: iconst_0
    //   49: ldc_w 478
    //   52: aastore
    //   53: dup
    //   54: iconst_1
    //   55: ldc_w 487
    //   58: aastore
    //   59: ldc_w 1584
    //   62: iconst_2
    //   63: anewarray 19	java/lang/String
    //   66: dup
    //   67: iconst_0
    //   68: aload_1
    //   69: aastore
    //   70: dup
    //   71: iconst_1
    //   72: aload_2
    //   73: aastore
    //   74: aconst_null
    //   75: aconst_null
    //   76: aconst_null
    //   77: invokevirtual 421	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   80: astore 4
    //   82: aload 4
    //   84: astore_2
    //   85: aload 4
    //   87: invokeinterface 213 1 0
    //   92: ifne +34 -> 126
    //   95: aload 4
    //   97: astore_2
    //   98: invokestatic 1574	java/util/Collections:emptyMap	()Ljava/util/Map;
    //   101: astore 5
    //   103: aload 5
    //   105: astore_1
    //   106: aload 4
    //   108: ifnull +10 -> 118
    //   111: aload 4
    //   113: invokeinterface 220 1 0
    //   118: ldc_w 1582
    //   121: invokestatic 192	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   124: aload_1
    //   125: areturn
    //   126: aload 4
    //   128: astore_2
    //   129: aload 4
    //   131: iconst_1
    //   132: invokeinterface 698 2 0
    //   137: astore 5
    //   139: aload 4
    //   141: astore_2
    //   142: aload 5
    //   144: iconst_0
    //   145: aload 5
    //   147: arraylength
    //   148: invokestatic 703	com/google/android/gms/internal/measurement/zzabv:zza	([BII)Lcom/google/android/gms/internal/measurement/zzabv;
    //   151: astore 5
    //   153: aload 4
    //   155: astore_2
    //   156: new 508	com/google/android/gms/internal/measurement/zzkh
    //   159: astore 6
    //   161: aload 4
    //   163: astore_2
    //   164: aload 6
    //   166: invokespecial 1585	com/google/android/gms/internal/measurement/zzkh:<init>	()V
    //   169: aload 4
    //   171: astore_2
    //   172: aload 6
    //   174: aload 5
    //   176: invokevirtual 709	com/google/android/gms/internal/measurement/zzace:zzb	(Lcom/google/android/gms/internal/measurement/zzabv;)Lcom/google/android/gms/internal/measurement/zzace;
    //   179: pop
    //   180: aload 4
    //   182: astore_2
    //   183: aload 4
    //   185: iconst_0
    //   186: invokeinterface 1215 2 0
    //   191: istore 7
    //   193: aload 4
    //   195: astore_2
    //   196: aload_3
    //   197: iload 7
    //   199: invokestatic 261	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   202: invokeinterface 1577 2 0
    //   207: checkcast 561	java/util/List
    //   210: astore 8
    //   212: aload 8
    //   214: astore 5
    //   216: aload 8
    //   218: ifnonnull +36 -> 254
    //   221: aload 4
    //   223: astore_2
    //   224: new 558	java/util/ArrayList
    //   227: astore 5
    //   229: aload 4
    //   231: astore_2
    //   232: aload 5
    //   234: invokespecial 559	java/util/ArrayList:<init>	()V
    //   237: aload 4
    //   239: astore_2
    //   240: aload_3
    //   241: iload 7
    //   243: invokestatic 261	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   246: aload 5
    //   248: invokeinterface 1424 3 0
    //   253: pop
    //   254: aload 4
    //   256: astore_2
    //   257: aload 5
    //   259: aload 6
    //   261: invokeinterface 576 2 0
    //   266: pop
    //   267: aload 4
    //   269: astore_2
    //   270: aload 4
    //   272: invokeinterface 1218 1 0
    //   277: istore 9
    //   279: iload 9
    //   281: ifne -155 -> 126
    //   284: aload 4
    //   286: ifnull +10 -> 296
    //   289: aload 4
    //   291: invokeinterface 220 1 0
    //   296: ldc_w 1582
    //   299: invokestatic 192	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   302: aload_3
    //   303: astore_1
    //   304: goto -180 -> 124
    //   307: astore 5
    //   309: aload 4
    //   311: astore_2
    //   312: aload_0
    //   313: invokevirtual 229	com/google/android/gms/internal/measurement/zzhg:zzge	()Lcom/google/android/gms/internal/measurement/zzfg;
    //   316: invokevirtual 235	com/google/android/gms/internal/measurement/zzfg:zzim	()Lcom/google/android/gms/internal/measurement/zzfi;
    //   319: ldc_w 1587
    //   322: aload_1
    //   323: invokestatic 448	com/google/android/gms/internal/measurement/zzfg:zzbm	(Ljava/lang/String;)Ljava/lang/Object;
    //   326: aload 5
    //   328: invokevirtual 243	com/google/android/gms/internal/measurement/zzfi:zze	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   331: goto -64 -> 267
    //   334: astore 5
    //   336: aload 4
    //   338: astore_2
    //   339: aload_0
    //   340: invokevirtual 229	com/google/android/gms/internal/measurement/zzhg:zzge	()Lcom/google/android/gms/internal/measurement/zzfg;
    //   343: invokevirtual 235	com/google/android/gms/internal/measurement/zzfg:zzim	()Lcom/google/android/gms/internal/measurement/zzfi;
    //   346: ldc_w 556
    //   349: aload_1
    //   350: invokestatic 448	com/google/android/gms/internal/measurement/zzfg:zzbm	(Ljava/lang/String;)Ljava/lang/Object;
    //   353: aload 5
    //   355: invokevirtual 243	com/google/android/gms/internal/measurement/zzfi:zze	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   358: aload 4
    //   360: ifnull +10 -> 370
    //   363: aload 4
    //   365: invokeinterface 220 1 0
    //   370: ldc_w 1582
    //   373: invokestatic 192	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   376: aconst_null
    //   377: astore_1
    //   378: goto -254 -> 124
    //   381: astore_1
    //   382: aconst_null
    //   383: astore_2
    //   384: aload_2
    //   385: ifnull +9 -> 394
    //   388: aload_2
    //   389: invokeinterface 220 1 0
    //   394: ldc_w 1582
    //   397: invokestatic 192	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   400: aload_1
    //   401: athrow
    //   402: astore_1
    //   403: goto -19 -> 384
    //   406: astore 5
    //   408: aconst_null
    //   409: astore 4
    //   411: goto -75 -> 336
    //
    // Exception table:
    //   from	to	target	type
    //   172	180	307	java/io/IOException
    //   85	95	334	android/database/sqlite/SQLiteException
    //   98	103	334	android/database/sqlite/SQLiteException
    //   129	139	334	android/database/sqlite/SQLiteException
    //   142	153	334	android/database/sqlite/SQLiteException
    //   156	161	334	android/database/sqlite/SQLiteException
    //   164	169	334	android/database/sqlite/SQLiteException
    //   172	180	334	android/database/sqlite/SQLiteException
    //   183	193	334	android/database/sqlite/SQLiteException
    //   196	212	334	android/database/sqlite/SQLiteException
    //   224	229	334	android/database/sqlite/SQLiteException
    //   232	237	334	android/database/sqlite/SQLiteException
    //   240	254	334	android/database/sqlite/SQLiteException
    //   257	267	334	android/database/sqlite/SQLiteException
    //   270	279	334	android/database/sqlite/SQLiteException
    //   312	331	334	android/database/sqlite/SQLiteException
    //   38	82	381	finally
    //   85	95	402	finally
    //   98	103	402	finally
    //   129	139	402	finally
    //   142	153	402	finally
    //   156	161	402	finally
    //   164	169	402	finally
    //   172	180	402	finally
    //   183	193	402	finally
    //   196	212	402	finally
    //   224	229	402	finally
    //   232	237	402	finally
    //   240	254	402	finally
    //   257	267	402	finally
    //   270	279	402	finally
    //   312	331	402	finally
    //   339	358	402	finally
    //   38	82	406	android/database/sqlite/SQLiteException
  }

  // ERROR //
  @VisibleForTesting
  protected final long zzm(String paramString1, String paramString2)
  {
    // Byte code:
    //   0: ldc_w 1590
    //   3: invokestatic 163	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: aload_1
    //   7: invokestatic 299	com/google/android/gms/common/internal/Preconditions:checkNotEmpty	(Ljava/lang/String;)Ljava/lang/String;
    //   10: pop
    //   11: aload_2
    //   12: invokestatic 299	com/google/android/gms/common/internal/Preconditions:checkNotEmpty	(Ljava/lang/String;)Ljava/lang/String;
    //   15: pop
    //   16: aload_0
    //   17: invokevirtual 433	com/google/android/gms/internal/measurement/zzhg:zzab	()V
    //   20: aload_0
    //   21: invokevirtual 430	com/google/android/gms/internal/measurement/zzjq:zzch	()V
    //   24: aload_0
    //   25: invokevirtual 201	com/google/android/gms/internal/measurement/zzei:getWritableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   28: astore_3
    //   29: aload_3
    //   30: invokevirtual 632	android/database/sqlite/SQLiteDatabase:beginTransaction	()V
    //   33: aload_2
    //   34: invokestatic 378	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   37: invokevirtual 382	java/lang/String:length	()I
    //   40: istore 4
    //   42: new 384	java/lang/StringBuilder
    //   45: astore 5
    //   47: aload 5
    //   49: iload 4
    //   51: bipush 32
    //   53: iadd
    //   54: invokespecial 386	java/lang/StringBuilder:<init>	(I)V
    //   57: aload_0
    //   58: aload 5
    //   60: ldc_w 1592
    //   63: invokevirtual 392	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   66: aload_2
    //   67: invokevirtual 392	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   70: ldc_w 1594
    //   73: invokevirtual 392	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   76: invokevirtual 397	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   79: iconst_1
    //   80: anewarray 19	java/lang/String
    //   83: dup
    //   84: iconst_0
    //   85: aload_1
    //   86: aastore
    //   87: ldc2_w 497
    //   90: invokespecial 1435	com/google/android/gms/internal/measurement/zzei:zza	(Ljava/lang/String;[Ljava/lang/String;J)J
    //   93: lstore 6
    //   95: lload 6
    //   97: lstore 8
    //   99: lload 6
    //   101: ldc2_w 497
    //   104: lcmp
    //   105: ifne +102 -> 207
    //   108: new 305	android/content/ContentValues
    //   111: astore 5
    //   113: aload 5
    //   115: invokespecial 474	android/content/ContentValues:<init>	()V
    //   118: aload 5
    //   120: ldc_w 476
    //   123: aload_1
    //   124: invokevirtual 309	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
    //   127: aload 5
    //   129: ldc_w 1596
    //   132: iconst_0
    //   133: invokestatic 261	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   136: invokevirtual 481	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Integer;)V
    //   139: aload 5
    //   141: ldc 147
    //   143: iconst_0
    //   144: invokestatic 261	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   147: invokevirtual 481	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Integer;)V
    //   150: aload_3
    //   151: ldc_w 1598
    //   154: aconst_null
    //   155: aload 5
    //   157: iconst_5
    //   158: invokevirtual 496	android/database/sqlite/SQLiteDatabase:insertWithOnConflict	(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;I)J
    //   161: ldc2_w 497
    //   164: lcmp
    //   165: ifne +39 -> 204
    //   168: aload_0
    //   169: invokevirtual 229	com/google/android/gms/internal/measurement/zzhg:zzge	()Lcom/google/android/gms/internal/measurement/zzfg;
    //   172: invokevirtual 235	com/google/android/gms/internal/measurement/zzfg:zzim	()Lcom/google/android/gms/internal/measurement/zzfi;
    //   175: ldc_w 1600
    //   178: aload_1
    //   179: invokestatic 448	com/google/android/gms/internal/measurement/zzfg:zzbm	(Ljava/lang/String;)Ljava/lang/Object;
    //   182: aload_2
    //   183: invokevirtual 243	com/google/android/gms/internal/measurement/zzfi:zze	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   186: aload_3
    //   187: invokevirtual 636	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   190: ldc_w 1590
    //   193: invokestatic 192	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   196: ldc2_w 497
    //   199: lstore 8
    //   201: lload 8
    //   203: lreturn
    //   204: lconst_0
    //   205: lstore 8
    //   207: new 305	android/content/ContentValues
    //   210: astore 5
    //   212: aload 5
    //   214: invokespecial 474	android/content/ContentValues:<init>	()V
    //   217: aload 5
    //   219: ldc_w 476
    //   222: aload_1
    //   223: invokevirtual 309	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
    //   226: aload 5
    //   228: aload_2
    //   229: lconst_1
    //   230: lload 8
    //   232: ladd
    //   233: invokestatic 275	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   236: invokevirtual 312	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Long;)V
    //   239: aload_3
    //   240: ldc_w 1598
    //   243: aload 5
    //   245: ldc_w 856
    //   248: iconst_1
    //   249: anewarray 19	java/lang/String
    //   252: dup
    //   253: iconst_0
    //   254: aload_1
    //   255: aastore
    //   256: invokevirtual 751	android/database/sqlite/SQLiteDatabase:update	(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
    //   259: i2l
    //   260: lconst_0
    //   261: lcmp
    //   262: ifne +39 -> 301
    //   265: aload_0
    //   266: invokevirtual 229	com/google/android/gms/internal/measurement/zzhg:zzge	()Lcom/google/android/gms/internal/measurement/zzfg;
    //   269: invokevirtual 235	com/google/android/gms/internal/measurement/zzfg:zzim	()Lcom/google/android/gms/internal/measurement/zzfi;
    //   272: ldc_w 1602
    //   275: aload_1
    //   276: invokestatic 448	com/google/android/gms/internal/measurement/zzfg:zzbm	(Ljava/lang/String;)Ljava/lang/Object;
    //   279: aload_2
    //   280: invokevirtual 243	com/google/android/gms/internal/measurement/zzfi:zze	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   283: aload_3
    //   284: invokevirtual 636	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   287: ldc_w 1590
    //   290: invokestatic 192	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   293: ldc2_w 497
    //   296: lstore 8
    //   298: goto -97 -> 201
    //   301: aload_3
    //   302: invokevirtual 644	android/database/sqlite/SQLiteDatabase:setTransactionSuccessful	()V
    //   305: aload_3
    //   306: invokevirtual 636	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   309: ldc_w 1590
    //   312: invokestatic 192	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   315: goto -114 -> 201
    //   318: astore 5
    //   320: lconst_0
    //   321: lstore 8
    //   323: aload_0
    //   324: invokevirtual 229	com/google/android/gms/internal/measurement/zzhg:zzge	()Lcom/google/android/gms/internal/measurement/zzfg;
    //   327: invokevirtual 235	com/google/android/gms/internal/measurement/zzfg:zzim	()Lcom/google/android/gms/internal/measurement/zzfi;
    //   330: ldc_w 1604
    //   333: aload_1
    //   334: invokestatic 448	com/google/android/gms/internal/measurement/zzfg:zzbm	(Ljava/lang/String;)Ljava/lang/Object;
    //   337: aload_2
    //   338: aload 5
    //   340: invokevirtual 456	com/google/android/gms/internal/measurement/zzfi:zzd	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   343: aload_3
    //   344: invokevirtual 636	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   347: goto -38 -> 309
    //   350: astore_1
    //   351: aload_3
    //   352: invokevirtual 636	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   355: ldc_w 1590
    //   358: invokestatic 192	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   361: aload_1
    //   362: athrow
    //   363: astore 5
    //   365: goto -42 -> 323
    //
    // Exception table:
    //   from	to	target	type
    //   33	95	318	android/database/sqlite/SQLiteException
    //   108	186	318	android/database/sqlite/SQLiteException
    //   33	95	350	finally
    //   108	186	350	finally
    //   207	283	350	finally
    //   301	305	350	finally
    //   323	343	350	finally
    //   207	283	363	android/database/sqlite/SQLiteException
    //   301	305	363	android/database/sqlite/SQLiteException
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.measurement.zzei
 * JD-Core Version:    0.6.2
 */