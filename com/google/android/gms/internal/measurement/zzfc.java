package com.google.android.gms.internal.measurement;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.Parcel;
import android.os.SystemClock;
import com.google.android.gms.common.util.VisibleForTesting;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class zzfc extends zzhh
{
  private final zzfd zzaig;
  private boolean zzaih;

  zzfc(zzgl paramzzgl)
  {
    super(paramzzgl);
    AppMethodBeat.i(68802);
    this.zzaig = new zzfd(this, getContext(), "google_app_measurement_local.db");
    AppMethodBeat.o(68802);
  }

  @VisibleForTesting
  private final SQLiteDatabase getWritableDatabase()
  {
    Object localObject1 = null;
    AppMethodBeat.i(68809);
    Object localObject2;
    if (this.zzaih)
    {
      AppMethodBeat.o(68809);
      localObject2 = localObject1;
    }
    while (true)
    {
      return localObject2;
      localObject2 = this.zzaig.getWritableDatabase();
      if (localObject2 == null)
      {
        this.zzaih = true;
        AppMethodBeat.o(68809);
        localObject2 = localObject1;
      }
      else
      {
        AppMethodBeat.o(68809);
      }
    }
  }

  private final boolean zza(int paramInt, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(68804);
    zzab();
    boolean bool;
    if (this.zzaih)
    {
      bool = false;
      AppMethodBeat.o(68804);
    }
    while (true)
    {
      return bool;
      ContentValues localContentValues = new ContentValues();
      localContentValues.put("type", Integer.valueOf(paramInt));
      localContentValues.put("entry", paramArrayOfByte);
      int i = 5;
      paramInt = 0;
      label58: if (paramInt < 5)
      {
        Object localObject1 = null;
        Object localObject2 = null;
        Object localObject3 = null;
        Object localObject4 = null;
        Object localObject5 = null;
        Object localObject6 = null;
        Object localObject7 = null;
        Cursor localCursor1 = null;
        Cursor localCursor2 = localCursor1;
        Object localObject8 = localObject5;
        Object localObject9 = localObject6;
        paramArrayOfByte = localObject7;
        try
        {
          SQLiteDatabase localSQLiteDatabase = getWritableDatabase();
          if (localSQLiteDatabase == null)
          {
            localCursor2 = localCursor1;
            localObject4 = localSQLiteDatabase;
            localObject8 = localObject5;
            localObject1 = localSQLiteDatabase;
            localObject9 = localObject6;
            localObject2 = localSQLiteDatabase;
            paramArrayOfByte = localObject7;
            localObject3 = localSQLiteDatabase;
            this.zzaih = true;
            if (localSQLiteDatabase != null)
              localSQLiteDatabase.close();
            bool = false;
            AppMethodBeat.o(68804);
            continue;
          }
          localCursor2 = localCursor1;
          localObject4 = localSQLiteDatabase;
          localObject8 = localObject5;
          localObject1 = localSQLiteDatabase;
          localObject9 = localObject6;
          localObject2 = localSQLiteDatabase;
          paramArrayOfByte = localObject7;
          localObject3 = localSQLiteDatabase;
          localSQLiteDatabase.beginTransaction();
          long l1 = 0L;
          localCursor2 = localCursor1;
          localObject4 = localSQLiteDatabase;
          localObject8 = localObject5;
          localObject1 = localSQLiteDatabase;
          localObject9 = localObject6;
          localObject2 = localSQLiteDatabase;
          paramArrayOfByte = localObject7;
          localObject3 = localSQLiteDatabase;
          localCursor1 = localSQLiteDatabase.rawQuery("select count(1) from messages", null);
          l2 = l1;
          if (localCursor1 != null)
          {
            l2 = l1;
            localCursor2 = localCursor1;
            localObject4 = localSQLiteDatabase;
            localObject8 = localCursor1;
            localObject1 = localSQLiteDatabase;
            localObject9 = localCursor1;
            localObject2 = localSQLiteDatabase;
            paramArrayOfByte = localCursor1;
            localObject3 = localSQLiteDatabase;
            if (localCursor1.moveToFirst())
            {
              localCursor2 = localCursor1;
              localObject4 = localSQLiteDatabase;
              localObject8 = localCursor1;
              localObject1 = localSQLiteDatabase;
              localObject9 = localCursor1;
              localObject2 = localSQLiteDatabase;
              paramArrayOfByte = localCursor1;
              localObject3 = localSQLiteDatabase;
              l2 = localCursor1.getLong(0);
            }
          }
          if (l2 >= 100000L)
          {
            localCursor2 = localCursor1;
            localObject4 = localSQLiteDatabase;
            localObject8 = localCursor1;
            localObject1 = localSQLiteDatabase;
            localObject9 = localCursor1;
            localObject2 = localSQLiteDatabase;
            paramArrayOfByte = localCursor1;
            localObject3 = localSQLiteDatabase;
            zzge().zzim().log("Data loss, local db full");
            l1 = 100000L - l2 + 1L;
            localCursor2 = localCursor1;
            localObject4 = localSQLiteDatabase;
            localObject8 = localCursor1;
            localObject1 = localSQLiteDatabase;
            localObject9 = localCursor1;
            localObject2 = localSQLiteDatabase;
            paramArrayOfByte = localCursor1;
            localObject3 = localSQLiteDatabase;
            l2 = localSQLiteDatabase.delete("messages", "rowid in (select rowid from messages order by rowid asc limit ?)", new String[] { Long.toString(l1) });
            if (l2 != l1)
            {
              localCursor2 = localCursor1;
              localObject4 = localSQLiteDatabase;
              localObject8 = localCursor1;
              localObject1 = localSQLiteDatabase;
              localObject9 = localCursor1;
              localObject2 = localSQLiteDatabase;
              paramArrayOfByte = localCursor1;
              localObject3 = localSQLiteDatabase;
              zzge().zzim().zzd("Different delete count than expected in local db. expected, received, difference", Long.valueOf(l1), Long.valueOf(l2), Long.valueOf(l1 - l2));
            }
          }
          localCursor2 = localCursor1;
          localObject4 = localSQLiteDatabase;
          localObject8 = localCursor1;
          localObject1 = localSQLiteDatabase;
          localObject9 = localCursor1;
          localObject2 = localSQLiteDatabase;
          paramArrayOfByte = localCursor1;
          localObject3 = localSQLiteDatabase;
          localSQLiteDatabase.insertOrThrow("messages", null, localContentValues);
          localCursor2 = localCursor1;
          localObject4 = localSQLiteDatabase;
          localObject8 = localCursor1;
          localObject1 = localSQLiteDatabase;
          localObject9 = localCursor1;
          localObject2 = localSQLiteDatabase;
          paramArrayOfByte = localCursor1;
          localObject3 = localSQLiteDatabase;
          localSQLiteDatabase.setTransactionSuccessful();
          localCursor2 = localCursor1;
          localObject4 = localSQLiteDatabase;
          localObject8 = localCursor1;
          localObject1 = localSQLiteDatabase;
          localObject9 = localCursor1;
          localObject2 = localSQLiteDatabase;
          paramArrayOfByte = localCursor1;
          localObject3 = localSQLiteDatabase;
          localSQLiteDatabase.endTransaction();
          if (localCursor1 != null)
            localCursor1.close();
          if (localSQLiteDatabase != null)
            localSQLiteDatabase.close();
          bool = true;
          AppMethodBeat.o(68804);
          continue;
        }
        catch (SQLiteFullException localSQLiteFullException)
        {
          paramArrayOfByte = localCursor2;
          localObject3 = localObject4;
          zzge().zzim().zzg("Error writing entry to local database", localSQLiteFullException);
          paramArrayOfByte = localCursor2;
          localObject3 = localObject4;
          this.zzaih = true;
          if (localCursor2 != null)
            localCursor2.close();
          j = i;
          if (localObject4 != null)
          {
            localObject4.close();
            j = i;
          }
          paramInt++;
          i = j;
          break label58;
        }
        catch (SQLiteDatabaseLockedException paramArrayOfByte)
        {
          while (true)
          {
            long l2 = i;
            paramArrayOfByte = (byte[])localObject8;
            localObject3 = localObject1;
            SystemClock.sleep(l2);
            i += 20;
            if (localObject8 != null)
              ((Cursor)localObject8).close();
            j = i;
            if (localObject1 != null)
            {
              localObject1.close();
              j = i;
            }
          }
        }
        catch (SQLiteException localSQLiteException)
        {
          while (true)
          {
            if (localObject2 != null)
            {
              paramArrayOfByte = (byte[])localObject9;
              localObject3 = localObject2;
              if (localObject2.inTransaction())
              {
                paramArrayOfByte = (byte[])localObject9;
                localObject3 = localObject2;
                localObject2.endTransaction();
              }
            }
            paramArrayOfByte = (byte[])localObject9;
            localObject3 = localObject2;
            zzge().zzim().zzg("Error writing entry to local database", localSQLiteException);
            paramArrayOfByte = (byte[])localObject9;
            localObject3 = localObject2;
            this.zzaih = true;
            if (localObject9 != null)
              ((Cursor)localObject9).close();
            int j = i;
            if (localObject2 != null)
            {
              localObject2.close();
              j = i;
            }
          }
        }
        finally
        {
          if (paramArrayOfByte != null)
            paramArrayOfByte.close();
          if (localObject3 != null)
            localObject3.close();
          AppMethodBeat.o(68804);
        }
      }
      else
      {
        zzge().zzip().log("Failed to write entry to local database");
        bool = false;
        AppMethodBeat.o(68804);
      }
    }
  }

  public final void resetAnalyticsData()
  {
    AppMethodBeat.i(68803);
    zzab();
    try
    {
      int i = getWritableDatabase().delete("messages", null, null) + 0;
      if (i > 0)
        zzge().zzit().zzg("Reset local analytics data. records", Integer.valueOf(i));
      AppMethodBeat.o(68803);
      return;
    }
    catch (SQLiteException localSQLiteException)
    {
      while (true)
      {
        zzge().zzim().zzg("Error resetting local analytics data. error", localSQLiteException);
        AppMethodBeat.o(68803);
      }
    }
  }

  public final boolean zza(zzeu paramzzeu)
  {
    boolean bool = false;
    AppMethodBeat.i(68805);
    Parcel localParcel = Parcel.obtain();
    paramzzeu.writeToParcel(localParcel, 0);
    paramzzeu = localParcel.marshall();
    localParcel.recycle();
    if (paramzzeu.length > 131072)
    {
      zzge().zzip().log("Event is too long for local database. Sending event directly to service");
      AppMethodBeat.o(68805);
    }
    while (true)
    {
      return bool;
      bool = zza(0, paramzzeu);
      AppMethodBeat.o(68805);
    }
  }

  public final boolean zza(zzjx paramzzjx)
  {
    boolean bool = false;
    AppMethodBeat.i(68806);
    Parcel localParcel = Parcel.obtain();
    paramzzjx.writeToParcel(localParcel, 0);
    paramzzjx = localParcel.marshall();
    localParcel.recycle();
    if (paramzzjx.length > 131072)
    {
      zzge().zzip().log("User property too long for local database. Sending directly to service");
      AppMethodBeat.o(68806);
    }
    while (true)
    {
      return bool;
      bool = zza(1, paramzzjx);
      AppMethodBeat.o(68806);
    }
  }

  public final boolean zzc(zzed paramzzed)
  {
    AppMethodBeat.i(68807);
    zzgb();
    paramzzed = zzka.zza(paramzzed);
    boolean bool;
    if (paramzzed.length > 131072)
    {
      zzge().zzip().log("Conditional user property too long for local database. Sending directly to service");
      bool = false;
      AppMethodBeat.o(68807);
    }
    while (true)
    {
      return bool;
      bool = zza(2, paramzzed);
      AppMethodBeat.o(68807);
    }
  }

  protected final boolean zzhf()
  {
    return false;
  }

  // ERROR //
  public final java.util.List<com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable> zzp(int paramInt)
  {
    // Byte code:
    //   0: ldc_w 325
    //   3: invokestatic 19	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: aload_0
    //   7: invokevirtual 60	com/google/android/gms/internal/measurement/zzhg:zzab	()V
    //   10: aload_0
    //   11: getfield 44	com/google/android/gms/internal/measurement/zzfc:zzaih	Z
    //   14: ifeq +13 -> 27
    //   17: aconst_null
    //   18: astore_2
    //   19: ldc_w 325
    //   22: invokestatic 37	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   25: aload_2
    //   26: areturn
    //   27: new 327	java/util/ArrayList
    //   30: dup
    //   31: invokespecial 328	java/util/ArrayList:<init>	()V
    //   34: astore_3
    //   35: aload_0
    //   36: invokevirtual 27	com/google/android/gms/internal/measurement/zzhg:getContext	()Landroid/content/Context;
    //   39: ldc 29
    //   41: invokevirtual 334	android/content/Context:getDatabasePath	(Ljava/lang/String;)Ljava/io/File;
    //   44: invokevirtual 339	java/io/File:exists	()Z
    //   47: ifne +14 -> 61
    //   50: ldc_w 325
    //   53: invokestatic 37	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   56: aload_3
    //   57: astore_2
    //   58: goto -33 -> 25
    //   61: iconst_5
    //   62: istore_1
    //   63: iconst_0
    //   64: istore 4
    //   66: iload 4
    //   68: iconst_5
    //   69: if_icmpge +852 -> 921
    //   72: aconst_null
    //   73: astore 5
    //   75: aconst_null
    //   76: astore 6
    //   78: aconst_null
    //   79: astore 7
    //   81: aconst_null
    //   82: astore 8
    //   84: aload_0
    //   85: invokespecial 82	com/google/android/gms/internal/measurement/zzfc:getWritableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   88: astore_2
    //   89: aload_2
    //   90: ifnonnull +27 -> 117
    //   93: aload_0
    //   94: iconst_1
    //   95: putfield 44	com/google/android/gms/internal/measurement/zzfc:zzaih	Z
    //   98: aload_2
    //   99: ifnull +7 -> 106
    //   102: aload_2
    //   103: invokevirtual 87	android/database/sqlite/SQLiteDatabase:close	()V
    //   106: aconst_null
    //   107: astore_2
    //   108: ldc_w 325
    //   111: invokestatic 37	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   114: goto -89 -> 25
    //   117: aload_2
    //   118: invokevirtual 90	android/database/sqlite/SQLiteDatabase:beginTransaction	()V
    //   121: bipush 100
    //   123: invokestatic 342	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   126: astore 6
    //   128: aload_2
    //   129: ldc 128
    //   131: iconst_3
    //   132: anewarray 132	java/lang/String
    //   135: dup
    //   136: iconst_0
    //   137: ldc_w 344
    //   140: aastore
    //   141: dup
    //   142: iconst_1
    //   143: ldc 66
    //   145: aastore
    //   146: dup
    //   147: iconst_2
    //   148: ldc 78
    //   150: aastore
    //   151: aconst_null
    //   152: aconst_null
    //   153: aconst_null
    //   154: aconst_null
    //   155: ldc_w 346
    //   158: aload 6
    //   160: invokevirtual 350	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   163: astore 6
    //   165: ldc2_w 351
    //   168: lstore 9
    //   170: aload 6
    //   172: invokeinterface 355 1 0
    //   177: ifeq +662 -> 839
    //   180: aload 6
    //   182: iconst_0
    //   183: invokeinterface 106 2 0
    //   188: lstore 11
    //   190: aload 6
    //   192: iconst_1
    //   193: invokeinterface 359 2 0
    //   198: istore 13
    //   200: aload 6
    //   202: iconst_2
    //   203: invokeinterface 363 2 0
    //   208: astore 7
    //   210: iload 13
    //   212: ifne +346 -> 558
    //   215: invokestatic 201	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   218: astore 14
    //   220: aload 14
    //   222: aload 7
    //   224: iconst_0
    //   225: aload 7
    //   227: arraylength
    //   228: invokevirtual 367	android/os/Parcel:unmarshall	([BII)V
    //   231: aload 14
    //   233: iconst_0
    //   234: invokevirtual 370	android/os/Parcel:setDataPosition	(I)V
    //   237: getstatic 374	com/google/android/gms/internal/measurement/zzeu:CREATOR	Landroid/os/Parcelable$Creator;
    //   240: aload 14
    //   242: invokeinterface 380 2 0
    //   247: checkcast 203	com/google/android/gms/internal/measurement/zzeu
    //   250: astore 8
    //   252: aload 14
    //   254: invokevirtual 214	android/os/Parcel:recycle	()V
    //   257: lload 11
    //   259: lstore 9
    //   261: aload 8
    //   263: ifnull -93 -> 170
    //   266: aload_3
    //   267: aload 8
    //   269: invokeinterface 386 2 0
    //   274: pop
    //   275: lload 11
    //   277: lstore 9
    //   279: goto -109 -> 170
    //   282: astore 7
    //   284: aload_2
    //   285: astore 8
    //   287: aload 6
    //   289: astore 14
    //   291: aload 14
    //   293: astore 6
    //   295: aload 8
    //   297: astore_2
    //   298: aload_0
    //   299: invokevirtual 112	com/google/android/gms/internal/measurement/zzhg:zzge	()Lcom/google/android/gms/internal/measurement/zzfg;
    //   302: invokevirtual 118	com/google/android/gms/internal/measurement/zzfg:zzim	()Lcom/google/android/gms/internal/measurement/zzfi;
    //   305: ldc_w 388
    //   308: aload 7
    //   310: invokevirtual 168	com/google/android/gms/internal/measurement/zzfi:zzg	(Ljava/lang/String;Ljava/lang/Object;)V
    //   313: aload 14
    //   315: astore 6
    //   317: aload 8
    //   319: astore_2
    //   320: aload_0
    //   321: iconst_1
    //   322: putfield 44	com/google/android/gms/internal/measurement/zzfc:zzaih	Z
    //   325: aload 14
    //   327: ifnull +10 -> 337
    //   330: aload 14
    //   332: invokeinterface 162 1 0
    //   337: aload 8
    //   339: ifnull +694 -> 1033
    //   342: aload 8
    //   344: invokevirtual 87	android/database/sqlite/SQLiteDatabase:close	()V
    //   347: iinc 4 1
    //   350: goto -284 -> 66
    //   353: astore 8
    //   355: aload_0
    //   356: invokevirtual 112	com/google/android/gms/internal/measurement/zzhg:zzge	()Lcom/google/android/gms/internal/measurement/zzfg;
    //   359: invokevirtual 118	com/google/android/gms/internal/measurement/zzfg:zzim	()Lcom/google/android/gms/internal/measurement/zzfi;
    //   362: ldc_w 390
    //   365: invokevirtual 126	com/google/android/gms/internal/measurement/zzfi:log	(Ljava/lang/String;)V
    //   368: aload 14
    //   370: invokevirtual 214	android/os/Parcel:recycle	()V
    //   373: lload 11
    //   375: lstore 9
    //   377: goto -207 -> 170
    //   380: astore 14
    //   382: aload_2
    //   383: astore 8
    //   385: aload 6
    //   387: astore 14
    //   389: iload_1
    //   390: i2l
    //   391: lstore 9
    //   393: aload 14
    //   395: astore 6
    //   397: aload 8
    //   399: astore_2
    //   400: lload 9
    //   402: invokestatic 174	android/os/SystemClock:sleep	(J)V
    //   405: iload_1
    //   406: bipush 20
    //   408: iadd
    //   409: istore 13
    //   411: aload 14
    //   413: ifnull +10 -> 423
    //   416: aload 14
    //   418: invokeinterface 162 1 0
    //   423: iload 13
    //   425: istore_1
    //   426: aload 8
    //   428: ifnull -81 -> 347
    //   431: aload 8
    //   433: invokevirtual 87	android/database/sqlite/SQLiteDatabase:close	()V
    //   436: iload 13
    //   438: istore_1
    //   439: goto -92 -> 347
    //   442: astore 8
    //   444: aload 14
    //   446: invokevirtual 214	android/os/Parcel:recycle	()V
    //   449: ldc_w 325
    //   452: invokestatic 37	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   455: aload 8
    //   457: athrow
    //   458: astore 7
    //   460: aload_2
    //   461: astore 8
    //   463: aload 6
    //   465: astore 14
    //   467: aload 8
    //   469: ifnull +30 -> 499
    //   472: aload 14
    //   474: astore 6
    //   476: aload 8
    //   478: astore_2
    //   479: aload 8
    //   481: invokevirtual 177	android/database/sqlite/SQLiteDatabase:inTransaction	()Z
    //   484: ifeq +15 -> 499
    //   487: aload 14
    //   489: astore 6
    //   491: aload 8
    //   493: astore_2
    //   494: aload 8
    //   496: invokevirtual 161	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   499: aload 14
    //   501: astore 6
    //   503: aload 8
    //   505: astore_2
    //   506: aload_0
    //   507: invokevirtual 112	com/google/android/gms/internal/measurement/zzhg:zzge	()Lcom/google/android/gms/internal/measurement/zzfg;
    //   510: invokevirtual 118	com/google/android/gms/internal/measurement/zzfg:zzim	()Lcom/google/android/gms/internal/measurement/zzfi;
    //   513: ldc_w 388
    //   516: aload 7
    //   518: invokevirtual 168	com/google/android/gms/internal/measurement/zzfi:zzg	(Ljava/lang/String;Ljava/lang/Object;)V
    //   521: aload 14
    //   523: astore 6
    //   525: aload 8
    //   527: astore_2
    //   528: aload_0
    //   529: iconst_1
    //   530: putfield 44	com/google/android/gms/internal/measurement/zzfc:zzaih	Z
    //   533: aload 14
    //   535: ifnull +10 -> 545
    //   538: aload 14
    //   540: invokeinterface 162 1 0
    //   545: aload 8
    //   547: ifnull +486 -> 1033
    //   550: aload 8
    //   552: invokevirtual 87	android/database/sqlite/SQLiteDatabase:close	()V
    //   555: goto -208 -> 347
    //   558: iload 13
    //   560: iconst_1
    //   561: if_icmpne +143 -> 704
    //   564: invokestatic 201	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   567: astore 8
    //   569: aload 8
    //   571: aload 7
    //   573: iconst_0
    //   574: aload 7
    //   576: arraylength
    //   577: invokevirtual 367	android/os/Parcel:unmarshall	([BII)V
    //   580: aload 8
    //   582: iconst_0
    //   583: invokevirtual 370	android/os/Parcel:setDataPosition	(I)V
    //   586: getstatic 391	com/google/android/gms/internal/measurement/zzjx:CREATOR	Landroid/os/Parcelable$Creator;
    //   589: aload 8
    //   591: invokeinterface 380 2 0
    //   596: checkcast 223	com/google/android/gms/internal/measurement/zzjx
    //   599: astore 14
    //   601: aload 8
    //   603: invokevirtual 214	android/os/Parcel:recycle	()V
    //   606: lload 11
    //   608: lstore 9
    //   610: aload 14
    //   612: ifnull -442 -> 170
    //   615: aload_3
    //   616: aload 14
    //   618: invokeinterface 386 2 0
    //   623: pop
    //   624: lload 11
    //   626: lstore 9
    //   628: goto -458 -> 170
    //   631: astore 14
    //   633: aload 6
    //   635: ifnull +10 -> 645
    //   638: aload 6
    //   640: invokeinterface 162 1 0
    //   645: aload_2
    //   646: ifnull +7 -> 653
    //   649: aload_2
    //   650: invokevirtual 87	android/database/sqlite/SQLiteDatabase:close	()V
    //   653: ldc_w 325
    //   656: invokestatic 37	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   659: aload 14
    //   661: athrow
    //   662: astore 14
    //   664: aload_0
    //   665: invokevirtual 112	com/google/android/gms/internal/measurement/zzhg:zzge	()Lcom/google/android/gms/internal/measurement/zzfg;
    //   668: invokevirtual 118	com/google/android/gms/internal/measurement/zzfg:zzim	()Lcom/google/android/gms/internal/measurement/zzfi;
    //   671: ldc_w 393
    //   674: invokevirtual 126	com/google/android/gms/internal/measurement/zzfi:log	(Ljava/lang/String;)V
    //   677: aload 8
    //   679: invokevirtual 214	android/os/Parcel:recycle	()V
    //   682: aconst_null
    //   683: astore 14
    //   685: goto -79 -> 606
    //   688: astore 14
    //   690: aload 8
    //   692: invokevirtual 214	android/os/Parcel:recycle	()V
    //   695: ldc_w 325
    //   698: invokestatic 37	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   701: aload 14
    //   703: athrow
    //   704: iload 13
    //   706: iconst_2
    //   707: if_icmpne +112 -> 819
    //   710: invokestatic 201	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   713: astore 8
    //   715: aload 8
    //   717: aload 7
    //   719: iconst_0
    //   720: aload 7
    //   722: arraylength
    //   723: invokevirtual 367	android/os/Parcel:unmarshall	([BII)V
    //   726: aload 8
    //   728: iconst_0
    //   729: invokevirtual 370	android/os/Parcel:setDataPosition	(I)V
    //   732: getstatic 396	com/google/android/gms/internal/measurement/zzed:CREATOR	Landroid/os/Parcelable$Creator;
    //   735: aload 8
    //   737: invokeinterface 380 2 0
    //   742: checkcast 395	com/google/android/gms/internal/measurement/zzed
    //   745: astore 14
    //   747: aload 8
    //   749: invokevirtual 214	android/os/Parcel:recycle	()V
    //   752: lload 11
    //   754: lstore 9
    //   756: aload 14
    //   758: ifnull -588 -> 170
    //   761: aload_3
    //   762: aload 14
    //   764: invokeinterface 386 2 0
    //   769: pop
    //   770: lload 11
    //   772: lstore 9
    //   774: goto -604 -> 170
    //   777: astore 14
    //   779: aload_0
    //   780: invokevirtual 112	com/google/android/gms/internal/measurement/zzhg:zzge	()Lcom/google/android/gms/internal/measurement/zzfg;
    //   783: invokevirtual 118	com/google/android/gms/internal/measurement/zzfg:zzim	()Lcom/google/android/gms/internal/measurement/zzfi;
    //   786: ldc_w 393
    //   789: invokevirtual 126	com/google/android/gms/internal/measurement/zzfi:log	(Ljava/lang/String;)V
    //   792: aload 8
    //   794: invokevirtual 214	android/os/Parcel:recycle	()V
    //   797: aconst_null
    //   798: astore 14
    //   800: goto -48 -> 752
    //   803: astore 14
    //   805: aload 8
    //   807: invokevirtual 214	android/os/Parcel:recycle	()V
    //   810: ldc_w 325
    //   813: invokestatic 37	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   816: aload 14
    //   818: athrow
    //   819: aload_0
    //   820: invokevirtual 112	com/google/android/gms/internal/measurement/zzhg:zzge	()Lcom/google/android/gms/internal/measurement/zzfg;
    //   823: invokevirtual 118	com/google/android/gms/internal/measurement/zzfg:zzim	()Lcom/google/android/gms/internal/measurement/zzfi;
    //   826: ldc_w 398
    //   829: invokevirtual 126	com/google/android/gms/internal/measurement/zzfi:log	(Ljava/lang/String;)V
    //   832: lload 11
    //   834: lstore 9
    //   836: goto -666 -> 170
    //   839: aload_2
    //   840: ldc 128
    //   842: ldc_w 400
    //   845: iconst_1
    //   846: anewarray 132	java/lang/String
    //   849: dup
    //   850: iconst_0
    //   851: lload 9
    //   853: invokestatic 138	java/lang/Long:toString	(J)Ljava/lang/String;
    //   856: aastore
    //   857: invokevirtual 142	android/database/sqlite/SQLiteDatabase:delete	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
    //   860: aload_3
    //   861: invokeinterface 404 1 0
    //   866: if_icmpge +16 -> 882
    //   869: aload_0
    //   870: invokevirtual 112	com/google/android/gms/internal/measurement/zzhg:zzge	()Lcom/google/android/gms/internal/measurement/zzfg;
    //   873: invokevirtual 118	com/google/android/gms/internal/measurement/zzfg:zzim	()Lcom/google/android/gms/internal/measurement/zzfi;
    //   876: ldc_w 406
    //   879: invokevirtual 126	com/google/android/gms/internal/measurement/zzfi:log	(Ljava/lang/String;)V
    //   882: aload_2
    //   883: invokevirtual 158	android/database/sqlite/SQLiteDatabase:setTransactionSuccessful	()V
    //   886: aload_2
    //   887: invokevirtual 161	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   890: aload 6
    //   892: ifnull +10 -> 902
    //   895: aload 6
    //   897: invokeinterface 162 1 0
    //   902: aload_2
    //   903: ifnull +7 -> 910
    //   906: aload_2
    //   907: invokevirtual 87	android/database/sqlite/SQLiteDatabase:close	()V
    //   910: ldc_w 325
    //   913: invokestatic 37	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   916: aload_3
    //   917: astore_2
    //   918: goto -893 -> 25
    //   921: aload_0
    //   922: invokevirtual 112	com/google/android/gms/internal/measurement/zzhg:zzge	()Lcom/google/android/gms/internal/measurement/zzfg;
    //   925: invokevirtual 180	com/google/android/gms/internal/measurement/zzfg:zzip	()Lcom/google/android/gms/internal/measurement/zzfi;
    //   928: ldc_w 408
    //   931: invokevirtual 126	com/google/android/gms/internal/measurement/zzfi:log	(Ljava/lang/String;)V
    //   934: aconst_null
    //   935: astore_2
    //   936: ldc_w 325
    //   939: invokestatic 37	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   942: goto -917 -> 25
    //   945: astore 14
    //   947: aconst_null
    //   948: astore 6
    //   950: aload 7
    //   952: astore_2
    //   953: goto -320 -> 633
    //   956: astore 14
    //   958: aconst_null
    //   959: astore 6
    //   961: goto -328 -> 633
    //   964: astore 14
    //   966: goto -333 -> 633
    //   969: astore 7
    //   971: aconst_null
    //   972: astore 14
    //   974: aload 6
    //   976: astore 8
    //   978: goto -511 -> 467
    //   981: astore 7
    //   983: aconst_null
    //   984: astore 14
    //   986: aload_2
    //   987: astore 8
    //   989: goto -522 -> 467
    //   992: astore_2
    //   993: aconst_null
    //   994: astore 14
    //   996: aload 5
    //   998: astore 8
    //   1000: goto -611 -> 389
    //   1003: astore 6
    //   1005: aconst_null
    //   1006: astore 14
    //   1008: aload_2
    //   1009: astore 8
    //   1011: goto -622 -> 389
    //   1014: astore 7
    //   1016: aconst_null
    //   1017: astore 14
    //   1019: goto -728 -> 291
    //   1022: astore 7
    //   1024: aconst_null
    //   1025: astore 14
    //   1027: aload_2
    //   1028: astore 8
    //   1030: goto -739 -> 291
    //   1033: goto -686 -> 347
    //
    // Exception table:
    //   from	to	target	type
    //   170	210	282	android/database/sqlite/SQLiteFullException
    //   215	220	282	android/database/sqlite/SQLiteFullException
    //   252	257	282	android/database/sqlite/SQLiteFullException
    //   266	275	282	android/database/sqlite/SQLiteFullException
    //   368	373	282	android/database/sqlite/SQLiteFullException
    //   444	458	282	android/database/sqlite/SQLiteFullException
    //   564	569	282	android/database/sqlite/SQLiteFullException
    //   601	606	282	android/database/sqlite/SQLiteFullException
    //   615	624	282	android/database/sqlite/SQLiteFullException
    //   677	682	282	android/database/sqlite/SQLiteFullException
    //   690	704	282	android/database/sqlite/SQLiteFullException
    //   710	715	282	android/database/sqlite/SQLiteFullException
    //   747	752	282	android/database/sqlite/SQLiteFullException
    //   761	770	282	android/database/sqlite/SQLiteFullException
    //   792	797	282	android/database/sqlite/SQLiteFullException
    //   805	819	282	android/database/sqlite/SQLiteFullException
    //   819	832	282	android/database/sqlite/SQLiteFullException
    //   839	882	282	android/database/sqlite/SQLiteFullException
    //   882	890	282	android/database/sqlite/SQLiteFullException
    //   220	252	353	com/google/android/gms/common/internal/safeparcel/SafeParcelReader$ParseException
    //   170	210	380	android/database/sqlite/SQLiteDatabaseLockedException
    //   215	220	380	android/database/sqlite/SQLiteDatabaseLockedException
    //   252	257	380	android/database/sqlite/SQLiteDatabaseLockedException
    //   266	275	380	android/database/sqlite/SQLiteDatabaseLockedException
    //   368	373	380	android/database/sqlite/SQLiteDatabaseLockedException
    //   444	458	380	android/database/sqlite/SQLiteDatabaseLockedException
    //   564	569	380	android/database/sqlite/SQLiteDatabaseLockedException
    //   601	606	380	android/database/sqlite/SQLiteDatabaseLockedException
    //   615	624	380	android/database/sqlite/SQLiteDatabaseLockedException
    //   677	682	380	android/database/sqlite/SQLiteDatabaseLockedException
    //   690	704	380	android/database/sqlite/SQLiteDatabaseLockedException
    //   710	715	380	android/database/sqlite/SQLiteDatabaseLockedException
    //   747	752	380	android/database/sqlite/SQLiteDatabaseLockedException
    //   761	770	380	android/database/sqlite/SQLiteDatabaseLockedException
    //   792	797	380	android/database/sqlite/SQLiteDatabaseLockedException
    //   805	819	380	android/database/sqlite/SQLiteDatabaseLockedException
    //   819	832	380	android/database/sqlite/SQLiteDatabaseLockedException
    //   839	882	380	android/database/sqlite/SQLiteDatabaseLockedException
    //   882	890	380	android/database/sqlite/SQLiteDatabaseLockedException
    //   220	252	442	finally
    //   355	368	442	finally
    //   170	210	458	android/database/sqlite/SQLiteException
    //   215	220	458	android/database/sqlite/SQLiteException
    //   252	257	458	android/database/sqlite/SQLiteException
    //   266	275	458	android/database/sqlite/SQLiteException
    //   368	373	458	android/database/sqlite/SQLiteException
    //   444	458	458	android/database/sqlite/SQLiteException
    //   564	569	458	android/database/sqlite/SQLiteException
    //   601	606	458	android/database/sqlite/SQLiteException
    //   615	624	458	android/database/sqlite/SQLiteException
    //   677	682	458	android/database/sqlite/SQLiteException
    //   690	704	458	android/database/sqlite/SQLiteException
    //   710	715	458	android/database/sqlite/SQLiteException
    //   747	752	458	android/database/sqlite/SQLiteException
    //   761	770	458	android/database/sqlite/SQLiteException
    //   792	797	458	android/database/sqlite/SQLiteException
    //   805	819	458	android/database/sqlite/SQLiteException
    //   819	832	458	android/database/sqlite/SQLiteException
    //   839	882	458	android/database/sqlite/SQLiteException
    //   882	890	458	android/database/sqlite/SQLiteException
    //   170	210	631	finally
    //   215	220	631	finally
    //   252	257	631	finally
    //   266	275	631	finally
    //   368	373	631	finally
    //   444	458	631	finally
    //   564	569	631	finally
    //   601	606	631	finally
    //   615	624	631	finally
    //   677	682	631	finally
    //   690	704	631	finally
    //   710	715	631	finally
    //   747	752	631	finally
    //   761	770	631	finally
    //   792	797	631	finally
    //   805	819	631	finally
    //   819	832	631	finally
    //   839	882	631	finally
    //   882	890	631	finally
    //   569	601	662	com/google/android/gms/common/internal/safeparcel/SafeParcelReader$ParseException
    //   569	601	688	finally
    //   664	677	688	finally
    //   715	747	777	com/google/android/gms/common/internal/safeparcel/SafeParcelReader$ParseException
    //   715	747	803	finally
    //   779	792	803	finally
    //   84	89	945	finally
    //   93	98	956	finally
    //   117	165	956	finally
    //   298	313	964	finally
    //   320	325	964	finally
    //   400	405	964	finally
    //   479	487	964	finally
    //   494	499	964	finally
    //   506	521	964	finally
    //   528	533	964	finally
    //   84	89	969	android/database/sqlite/SQLiteException
    //   93	98	981	android/database/sqlite/SQLiteException
    //   117	165	981	android/database/sqlite/SQLiteException
    //   84	89	992	android/database/sqlite/SQLiteDatabaseLockedException
    //   93	98	1003	android/database/sqlite/SQLiteDatabaseLockedException
    //   117	165	1003	android/database/sqlite/SQLiteDatabaseLockedException
    //   84	89	1014	android/database/sqlite/SQLiteFullException
    //   93	98	1022	android/database/sqlite/SQLiteFullException
    //   117	165	1022	android/database/sqlite/SQLiteFullException
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.measurement.zzfc
 * JD-Core Version:    0.6.2
 */