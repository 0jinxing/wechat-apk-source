package com.tencent.mm.plugin.dbbackup.a;

import android.annotation.SuppressLint;
import android.database.Cursor;
import android.os.AsyncTask;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.vfs.FileSystem;
import com.tencent.mm.vfs.FileSystem.b;
import com.tencent.mm.vfs.FileSystemManager.d;
import com.tencent.mm.vfs.b;
import com.tencent.wcdb.DatabaseUtils;
import com.tencent.wcdb.database.SQLiteCipherSpec;
import com.tencent.wcdb.database.SQLiteDatabase;
import com.tencent.wcdb.database.SQLiteDirectCursor;
import com.tencent.wcdb.database.SQLiteDoneException;
import com.tencent.wcdb.database.SQLiteStatement;
import com.tencent.wcdb.support.CancellationSignal;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import org.json.JSONObject;

public final class a extends AsyncTask<Void, Integer, Integer>
{
  private static final String[] CONFLICT_VALUES;
  private static final SQLiteCipherSpec kJb;
  private SQLiteDatabase kJc;
  private String kJd;
  private String kJe;
  private String kJf;
  private String kJg;
  private List<String> kJh;
  private List<String> kJi;
  private byte[] kJj;
  private byte[] kJk;
  private List<byte[]> kJl;
  private List<byte[]> kJm;
  private c kJn;
  private boolean kJo;
  private b kJp;
  private boolean kJq;
  private int kJr;
  private long kJs;
  private long kJt;
  private final CancellationSignal mCancellationSignal;

  static
  {
    AppMethodBeat.i(19030);
    kJb = new SQLiteCipherSpec().setPageSize(1024).setSQLCipherVersion(1);
    CONFLICT_VALUES = new String[] { "", " OR ROLLBACK", " OR ABORT", " OR FAIL", " OR IGNORE", " OR REPLACE" };
    AppMethodBeat.o(19030);
  }

  private a()
  {
    AppMethodBeat.i(19012);
    this.mCancellationSignal = new CancellationSignal();
    AppMethodBeat.o(19012);
  }

  private static long If(String paramString)
  {
    AppMethodBeat.i(19022);
    Object localObject = new b(paramString);
    paramString = (String)localObject;
    if (!((b)localObject).isDirectory())
      paramString = ((b)localObject).dMC();
    localObject = paramString.dMA();
    long l;
    if (!((FileSystemManager.d)localObject).valid())
    {
      l = 0L;
      label43: if (l <= 0L)
        break label88;
      AppMethodBeat.o(19022);
    }
    while (true)
    {
      return l;
      localObject = ((FileSystemManager.d)localObject).zZs.tn(((FileSystemManager.d)localObject).path);
      if (localObject == null)
      {
        l = 0L;
        break label43;
      }
      l = ((FileSystem.b)localObject).zYP;
      break label43;
      label88: localObject = paramString.dMC();
      paramString = (String)localObject;
      if (localObject != null)
        break;
      AppMethodBeat.o(19022);
      l = 0L;
    }
  }

  private int a(SQLiteDatabase paramSQLiteDatabase, String paramString, int paramInt1, boolean paramBoolean, int paramInt2, a.d paramd)
  {
    AppMethodBeat.i(19021);
    try
    {
      localObject = DatabaseUtils.stringForQuery(paramSQLiteDatabase, "SELECT sql FROM sqlite_master WHERE name = ?", new String[] { paramString });
      if ((localObject == null) || (((String)localObject).isEmpty()))
      {
        paramSQLiteDatabase = new com/tencent/wcdb/database/SQLiteDoneException;
        paramSQLiteDatabase.<init>();
        AppMethodBeat.o(19021);
        throw paramSQLiteDatabase;
      }
    }
    catch (SQLiteDoneException paramSQLiteDatabase)
    {
      ab.e("MicroMsg.DBRecoveryTask", "There is no table named '%s' to copy.", new Object[] { paramString });
      if (this.kJc.inTransaction())
        this.kJc.endTransaction();
      paramInt1 = -1;
      AppMethodBeat.o(19021);
      while (true)
      {
        return paramInt1;
        localObject = ((String)localObject).replaceFirst("(?i)^CREATE TABLE (?!IF NOT EXISTS )", "CREATE TABLE IF NOT EXISTS ");
        this.kJc.execSQL((String)localObject, null, this.mCancellationSignal);
        if (paramBoolean)
          break;
        if (this.kJc.inTransaction())
          this.kJc.endTransaction();
        paramInt1 = 0;
        AppMethodBeat.o(19021);
      }
      i = (int)DatabaseUtils.longForQuery(paramSQLiteDatabase, "SELECT count(*) FROM ".concat(String.valueOf(paramString)), null);
      localObject = paramSQLiteDatabase.rawQueryWithFactory(SQLiteDirectCursor.FACTORY, "SELECT * FROM ".concat(String.valueOf(paramString)), null, paramString, this.mCancellationSignal);
    }
    finally
    {
      try
      {
        while (true)
        {
          int i;
          paramSQLiteDatabase = ((Cursor)localObject).getColumnNames();
          StringBuilder localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>(1024);
          localStringBuilder.append("INSERT").append(CONFLICT_VALUES[paramInt1]).append(" INTO ").append(paramString).append(" (");
          int j = paramSQLiteDatabase.length;
          for (paramInt1 = 0; paramInt1 < j; paramInt1++)
            localStringBuilder.append(paramSQLiteDatabase[paramInt1]).append(',');
          localStringBuilder.setCharAt(localStringBuilder.length() - 1, ')');
          localStringBuilder.append(" VALUES (");
          for (paramInt1 = 0; paramInt1 < paramSQLiteDatabase.length; paramInt1++)
            localStringBuilder.append("?,");
          localStringBuilder.setCharAt(localStringBuilder.length() - 1, ')');
          paramString = this.kJc.compileStatement(localStringBuilder.toString());
          for (paramInt1 = 0; ; paramInt1++)
          {
            while (true)
            {
              try
              {
                this.kJc.beginTransaction();
                if (!((Cursor)localObject).moveToNext())
                  break label652;
                if ((paramInt1 % 1024 == 0) && (paramInt2 != 0))
                  publishProgress(new Integer[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt1), Integer.valueOf(i) });
                paramString.clearBindings();
                j = 0;
                if (j >= paramSQLiteDatabase.length)
                  break;
                switch (((Cursor)localObject).getType(j))
                {
                default:
                  j++;
                  break;
                case 0:
                  paramString.bindNull(j + 1);
                  continue;
                case 1:
                case 2:
                case 3:
                case 4:
                }
              }
              finally
              {
              }
              if ((localObject != null) && (!((Cursor)localObject).isClosed()))
                ((Cursor)localObject).close();
              if (this.kJc.inTransaction())
                this.kJc.endTransaction();
              if (paramString != null)
                paramString.close();
              AppMethodBeat.o(19021);
              throw paramSQLiteDatabase;
              paramString.bindLong(j + 1, ((Cursor)localObject).getLong(j));
              continue;
              paramString.bindDouble(j + 1, ((Cursor)localObject).getDouble(j));
              continue;
              paramString.bindString(j + 1, ((Cursor)localObject).getString(j));
              continue;
              paramString.bindBlob(j + 1, ((Cursor)localObject).getBlob(j));
            }
            if (paramd != null)
              paramd.a((Cursor)localObject, paramString);
            paramString.executeInsert(this.mCancellationSignal);
          }
          label652: this.kJc.setTransactionSuccessful();
          if ((localObject != null) && (!((Cursor)localObject).isClosed()))
            ((Cursor)localObject).close();
          if (this.kJc.inTransaction())
            this.kJc.endTransaction();
          if (paramString != null)
            paramString.close();
          AppMethodBeat.o(19021);
        }
        paramSQLiteDatabase = finally;
        paramString = null;
      }
      finally
      {
        while (true)
        {
          Object localObject;
          paramString = null;
        }
      }
    }
  }

  @SuppressLint({"DefaultLocale"})
  private static void a(int paramInt, String paramString, Throwable paramThrowable)
  {
    AppMethodBeat.i(19024);
    com.tencent.mm.plugin.report.e.pXa.g("DBRepairNew", String.format("[Stage: %d] %s%s", new Object[] { Integer.valueOf(paramInt), paramString, "\n" + bo.l(paramThrowable) }), null);
    AppMethodBeat.o(19024);
  }

  private int bhV()
  {
    long l1 = 0L;
    AppMethodBeat.i(19015);
    ab.i("MicroMsg.DBRecoveryTask", "Load and check database statistics.");
    int i;
    if ((this.kJd == null) || (this.kJd.isEmpty()))
    {
      i = -1;
      AppMethodBeat.o(19015);
    }
    while (true)
    {
      return i;
      this.kJq = false;
      this.kJr = 300000;
      if (this.kJg != null);
      while (true)
      {
        try
        {
          String str = com.tencent.mm.vfs.e.cy(this.kJg);
          JSONObject localJSONObject = new org/json/JSONObject;
          localJSONObject.<init>(str);
          this.kJr = localJSONObject.getInt("message");
          this.kJq = true;
          l2 = localJSONObject.getLong("dbSize");
          if (this.kJf != null)
            l1 = com.tencent.mm.vfs.e.asZ(this.kJf);
          this.kJs = Math.max(l2, l1);
          this.kJs += Math.max(this.kJs / 10L, 67108864L);
          this.kJt = If(this.kJd);
          if (this.kJs <= this.kJt)
            break label280;
          ab.e("MicroMsg.DBRecoveryTask", "Space not enough for recovery (%d required, %d available)", new Object[] { Long.valueOf(this.kJs), Long.valueOf(this.kJt) });
          i = -2;
          AppMethodBeat.o(19015);
        }
        catch (FileNotFoundException localFileNotFoundException)
        {
          ab.i("MicroMsg.DBRecoveryTask", "Statistics file not found: " + this.kJg);
          l2 = 0L;
          continue;
        }
        catch (Exception localException)
        {
          ab.printErrStackTrace("MicroMsg.DBRecoveryTask", localException, "Cannot read statistics from file.", new Object[0]);
        }
        long l2 = 0L;
      }
      label280: ab.i("MicroMsg.DBRecoveryTask", "Statistics check OK, required space: %d, available space %d, message count: %d", new Object[] { Long.valueOf(this.kJs), Long.valueOf(this.kJt), Integer.valueOf(this.kJr) });
      AppMethodBeat.o(19015);
      i = 0;
    }
  }

  private int bhW()
  {
    AppMethodBeat.i(19016);
    if (this.kJc != null)
    {
      if (this.kJc.isOpen())
        this.kJc.close();
      this.kJc = null;
    }
    this.mCancellationSignal.throwIfCanceled();
    String str = this.kJd + '-' + bo.Mb(6);
    ab.i("MicroMsg.DBRecoveryTask", "Open target database: ".concat(String.valueOf(str)));
    try
    {
      this.kJc = SQLiteDatabase.openOrCreateDatabase(str, this.kJj, kJb, null, null, 1);
      DatabaseUtils.stringForQuery(this.kJc, "PRAGMA journal_mode=OFF;", null);
      this.kJc.execSQL("PRAGMA synchronous=OFF;");
      AppMethodBeat.o(19016);
      return 0;
    }
    catch (Exception localException)
    {
      ab.e("MicroMsg.DBRecoveryTask", "Cannot open target database '%s': %s", new Object[] { str, localException.getMessage() });
      a(1, "Cannot open target database", localException);
      AppMethodBeat.o(19016);
      throw localException;
    }
  }

  // ERROR //
  private int bhX()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: aconst_null
    //   3: astore_2
    //   4: iconst_0
    //   5: istore_3
    //   6: sipush 19018
    //   9: invokestatic 59	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   12: aload_0
    //   13: getfield 99	com/tencent/mm/plugin/dbbackup/a/a:mCancellationSignal	Lcom/tencent/wcdb/support/CancellationSignal;
    //   16: invokevirtual 478	com/tencent/wcdb/support/CancellationSignal:throwIfCanceled	()V
    //   19: iconst_5
    //   20: anewarray 75	java/lang/String
    //   23: astore 4
    //   25: aload 4
    //   27: iconst_0
    //   28: ldc_w 422
    //   31: aastore
    //   32: aload 4
    //   34: iconst_1
    //   35: ldc_w 510
    //   38: aastore
    //   39: aload 4
    //   41: iconst_2
    //   42: ldc_w 512
    //   45: aastore
    //   46: aload 4
    //   48: iconst_3
    //   49: ldc_w 514
    //   52: aastore
    //   53: aload 4
    //   55: iconst_4
    //   56: ldc_w 516
    //   59: aastore
    //   60: aload_0
    //   61: getfield 352	com/tencent/mm/plugin/dbbackup/a/a:kJh	Ljava/util/List;
    //   64: invokeinterface 522 1 0
    //   69: astore 5
    //   71: aconst_null
    //   72: astore 6
    //   74: aload 5
    //   76: invokeinterface 527 1 0
    //   81: ifeq +969 -> 1050
    //   84: aload 5
    //   86: invokeinterface 531 1 0
    //   91: checkcast 75	java/lang/String
    //   94: astore 7
    //   96: aload 7
    //   98: invokestatic 535	com/tencent/mm/vfs/e:ct	(Ljava/lang/String;)Z
    //   101: ifne +22 -> 123
    //   104: ldc 163
    //   106: ldc_w 537
    //   109: aload 7
    //   111: invokestatic 201	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   114: invokevirtual 205	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   117: invokestatic 407	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   120: goto -46 -> 74
    //   123: iconst_0
    //   124: istore 8
    //   126: aload 6
    //   128: astore 9
    //   130: aload 9
    //   132: astore 6
    //   134: iload 8
    //   136: aload_0
    //   137: getfield 539	com/tencent/mm/plugin/dbbackup/a/a:kJl	Ljava/util/List;
    //   140: invokeinterface 542 1 0
    //   145: if_icmpge -71 -> 74
    //   148: aload_0
    //   149: getfield 539	com/tencent/mm/plugin/dbbackup/a/a:kJl	Ljava/util/List;
    //   152: iload 8
    //   154: invokeinterface 546 2 0
    //   159: checkcast 547	[B
    //   162: astore 10
    //   164: aload 9
    //   166: astore 6
    //   168: aload 7
    //   170: aload 10
    //   172: aload 4
    //   174: invokestatic 553	com/tencent/wcdb/repair/RepairKit$MasterInfo:load	(Ljava/lang/String;[B[Ljava/lang/String;)Lcom/tencent/wcdb/repair/RepairKit$MasterInfo;
    //   177: astore 9
    //   179: aload 9
    //   181: astore 6
    //   183: new 229	java/lang/StringBuilder
    //   186: astore 10
    //   188: aload 9
    //   190: astore 6
    //   192: aload 10
    //   194: ldc_w 555
    //   197: invokespecial 369	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   200: aload 9
    //   202: astore 6
    //   204: ldc 163
    //   206: aload 10
    //   208: aload 7
    //   210: invokevirtual 237	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   213: ldc_w 557
    //   216: invokevirtual 237	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   219: iload 8
    //   221: invokevirtual 560	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   224: invokevirtual 260	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   227: invokestatic 407	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   230: aload 9
    //   232: astore 6
    //   234: aload 6
    //   236: ifnonnull +440 -> 676
    //   239: aload 4
    //   241: invokestatic 564	com/tencent/wcdb/repair/RepairKit$MasterInfo:make	([Ljava/lang/String;)Lcom/tencent/wcdb/repair/RepairKit$MasterInfo;
    //   244: astore 4
    //   246: ldc 163
    //   248: ldc_w 566
    //   251: invokestatic 569	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   254: iconst_0
    //   255: istore 11
    //   257: iconst_1
    //   258: newarray int
    //   260: astore 5
    //   262: aload 5
    //   264: iconst_0
    //   265: iconst_0
    //   266: iastore
    //   267: aload_1
    //   268: astore 9
    //   270: new 229	java/lang/StringBuilder
    //   273: astore 6
    //   275: aload_1
    //   276: astore 9
    //   278: aload 6
    //   280: ldc_w 571
    //   283: invokespecial 369	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   286: aload_1
    //   287: astore 9
    //   289: ldc 163
    //   291: aload 6
    //   293: aload_0
    //   294: getfield 432	com/tencent/mm/plugin/dbbackup/a/a:kJf	Ljava/lang/String;
    //   297: invokevirtual 237	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   300: invokevirtual 260	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   303: invokestatic 407	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   306: iload_3
    //   307: istore 8
    //   309: aload_2
    //   310: astore 6
    //   312: aload_1
    //   313: astore 9
    //   315: iload 8
    //   317: aload_0
    //   318: getfield 573	com/tencent/mm/plugin/dbbackup/a/a:kJm	Ljava/util/List;
    //   321: invokeinterface 542 1 0
    //   326: if_icmpge +73 -> 399
    //   329: aload_1
    //   330: astore 9
    //   332: aload_0
    //   333: getfield 573	com/tencent/mm/plugin/dbbackup/a/a:kJm	Ljava/util/List;
    //   336: iload 8
    //   338: invokeinterface 546 2 0
    //   343: checkcast 547	[B
    //   346: astore 7
    //   348: aload_1
    //   349: astore 9
    //   351: new 575	com/tencent/wcdb/repair/RepairKit
    //   354: astore 6
    //   356: aload_1
    //   357: astore 9
    //   359: aload 6
    //   361: aload_0
    //   362: getfield 432	com/tencent/mm/plugin/dbbackup/a/a:kJf	Ljava/lang/String;
    //   365: aload 7
    //   367: getstatic 73	com/tencent/mm/plugin/dbbackup/a/a:kJb	Lcom/tencent/wcdb/database/SQLiteCipherSpec;
    //   370: aload 4
    //   372: invokespecial 578	com/tencent/wcdb/repair/RepairKit:<init>	(Ljava/lang/String;[BLcom/tencent/wcdb/database/SQLiteCipherSpec;Lcom/tencent/wcdb/repair/RepairKit$MasterInfo;)V
    //   375: aload 6
    //   377: invokevirtual 581	com/tencent/wcdb/repair/RepairKit:isHeaderCorrupted	()Z
    //   380: ifne +314 -> 694
    //   383: ldc 163
    //   385: ldc_w 583
    //   388: iload 8
    //   390: invokestatic 585	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   393: invokevirtual 205	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   396: invokestatic 407	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   399: aload 6
    //   401: ifnonnull +646 -> 1047
    //   404: aload 6
    //   406: astore 9
    //   408: ldc 163
    //   410: ldc_w 587
    //   413: invokestatic 407	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   416: aload 6
    //   418: astore 9
    //   420: new 575	com/tencent/wcdb/repair/RepairKit
    //   423: astore_2
    //   424: aload 6
    //   426: astore 9
    //   428: aload_2
    //   429: aload_0
    //   430: getfield 432	com/tencent/mm/plugin/dbbackup/a/a:kJf	Ljava/lang/String;
    //   433: aload_0
    //   434: getfield 573	com/tencent/mm/plugin/dbbackup/a/a:kJm	Ljava/util/List;
    //   437: iconst_0
    //   438: invokeinterface 546 2 0
    //   443: checkcast 547	[B
    //   446: getstatic 73	com/tencent/mm/plugin/dbbackup/a/a:kJb	Lcom/tencent/wcdb/database/SQLiteCipherSpec;
    //   449: aload 4
    //   451: invokespecial 578	com/tencent/wcdb/repair/RepairKit:<init>	(Ljava/lang/String;[BLcom/tencent/wcdb/database/SQLiteCipherSpec;Lcom/tencent/wcdb/repair/RepairKit$MasterInfo;)V
    //   454: aload_2
    //   455: astore 6
    //   457: aload 6
    //   459: astore 4
    //   461: new 589	com/tencent/mm/plugin/dbbackup/a/a$1
    //   464: astore 9
    //   466: aload 6
    //   468: astore 4
    //   470: aload 9
    //   472: aload_0
    //   473: aload 5
    //   475: invokespecial 592	com/tencent/mm/plugin/dbbackup/a/a$1:<init>	(Lcom/tencent/mm/plugin/dbbackup/a/a;[I)V
    //   478: aload 6
    //   480: astore 4
    //   482: aload 6
    //   484: aload 9
    //   486: invokevirtual 596	com/tencent/wcdb/repair/RepairKit:setCallback	(Lcom/tencent/wcdb/repair/RepairKit$Callback;)V
    //   489: aload 6
    //   491: astore 4
    //   493: aload 6
    //   495: aload_0
    //   496: getfield 175	com/tencent/mm/plugin/dbbackup/a/a:kJc	Lcom/tencent/wcdb/database/SQLiteDatabase;
    //   499: iconst_0
    //   500: aload_0
    //   501: getfield 99	com/tencent/mm/plugin/dbbackup/a/a:mCancellationSignal	Lcom/tencent/wcdb/support/CancellationSignal;
    //   504: invokevirtual 600	com/tencent/wcdb/repair/RepairKit:output	(Lcom/tencent/wcdb/database/SQLiteDatabase;ILcom/tencent/wcdb/support/CancellationSignal;)I
    //   507: istore 8
    //   509: iload 8
    //   511: ifne +298 -> 809
    //   514: aload 6
    //   516: astore 4
    //   518: aload 6
    //   520: invokevirtual 581	com/tencent/wcdb/repair/RepairKit:isHeaderCorrupted	()Z
    //   523: ifeq +193 -> 716
    //   526: aload 6
    //   528: astore 4
    //   530: aload 6
    //   532: invokevirtual 603	com/tencent/wcdb/repair/RepairKit:isDataCorrupted	()Z
    //   535: ifeq +181 -> 716
    //   538: aload 6
    //   540: astore 4
    //   542: new 508	java/lang/RuntimeException
    //   545: astore 9
    //   547: aload 6
    //   549: astore 4
    //   551: aload 9
    //   553: ldc_w 605
    //   556: invokespecial 606	java/lang/RuntimeException:<init>	(Ljava/lang/String;)V
    //   559: aload 6
    //   561: astore 4
    //   563: sipush 19018
    //   566: invokestatic 92	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   569: aload 6
    //   571: astore 4
    //   573: aload 9
    //   575: athrow
    //   576: astore 4
    //   578: sipush 19018
    //   581: invokestatic 92	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   584: aload 4
    //   586: athrow
    //   587: astore 4
    //   589: aload 6
    //   591: astore 9
    //   593: aload 4
    //   595: astore 6
    //   597: aload 9
    //   599: ifnull +8 -> 607
    //   602: aload 9
    //   604: invokevirtual 609	com/tencent/wcdb/repair/RepairKit:release	()V
    //   607: sipush 19018
    //   610: invokestatic 92	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   613: aload 6
    //   615: athrow
    //   616: astore 9
    //   618: ldc 163
    //   620: new 229	java/lang/StringBuilder
    //   623: dup
    //   624: ldc_w 611
    //   627: invokespecial 369	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   630: aload 9
    //   632: invokevirtual 499	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   635: invokevirtual 237	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   638: ldc_w 613
    //   641: invokevirtual 237	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   644: aload 7
    //   646: invokevirtual 237	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   649: ldc_w 557
    //   652: invokevirtual 237	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   655: iload 8
    //   657: invokevirtual 560	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   660: invokevirtual 260	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   663: invokestatic 615	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   666: iinc 8 1
    //   669: aload 6
    //   671: astore 9
    //   673: goto -543 -> 130
    //   676: ldc 163
    //   678: ldc_w 617
    //   681: invokestatic 407	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   684: iconst_1
    //   685: istore 11
    //   687: aload 6
    //   689: astore 4
    //   691: goto -434 -> 257
    //   694: ldc 163
    //   696: ldc_w 619
    //   699: iload 8
    //   701: invokestatic 585	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   704: invokevirtual 205	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   707: invokestatic 569	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   710: iinc 8 1
    //   713: goto -404 -> 309
    //   716: aload 6
    //   718: astore 4
    //   720: ldc 163
    //   722: ldc_w 621
    //   725: invokestatic 407	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   728: aload 6
    //   730: astore 4
    //   732: aload_0
    //   733: getfield 409	com/tencent/mm/plugin/dbbackup/a/a:kJq	Z
    //   736: ifeq +54 -> 790
    //   739: aload 6
    //   741: astore 4
    //   743: aload 5
    //   745: iconst_0
    //   746: iaload
    //   747: i2f
    //   748: aload_0
    //   749: getfield 146	com/tencent/mm/plugin/dbbackup/a/a:kJr	I
    //   752: i2f
    //   753: fdiv
    //   754: ldc_w 622
    //   757: fcmpg
    //   758: ifgt +32 -> 790
    //   761: aload 6
    //   763: astore 4
    //   765: getstatic 362	com/tencent/mm/plugin/report/e:pXa	Lcom/tencent/mm/plugin/report/e;
    //   768: sipush 181
    //   771: sipush 181
    //   774: bipush 62
    //   776: bipush 63
    //   778: aload_0
    //   779: getfield 146	com/tencent/mm/plugin/dbbackup/a/a:kJr	I
    //   782: aload 5
    //   784: iconst_0
    //   785: iaload
    //   786: iconst_1
    //   787: invokevirtual 625	com/tencent/mm/plugin/report/e:a	(IIIIIIZ)V
    //   790: aload 6
    //   792: ifnull +8 -> 800
    //   795: aload 6
    //   797: invokevirtual 609	com/tencent/wcdb/repair/RepairKit:release	()V
    //   800: sipush 19018
    //   803: invokestatic 92	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   806: iload 8
    //   808: ireturn
    //   809: iload 8
    //   811: iconst_1
    //   812: if_icmpne +114 -> 926
    //   815: aload 6
    //   817: astore 4
    //   819: ldc 163
    //   821: ldc_w 627
    //   824: invokestatic 407	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   827: aload 6
    //   829: astore 4
    //   831: aload_0
    //   832: getfield 99	com/tencent/mm/plugin/dbbackup/a/a:mCancellationSignal	Lcom/tencent/wcdb/support/CancellationSignal;
    //   835: invokevirtual 478	com/tencent/wcdb/support/CancellationSignal:throwIfCanceled	()V
    //   838: goto -110 -> 728
    //   841: astore 9
    //   843: aload 6
    //   845: astore 4
    //   847: new 229	java/lang/StringBuilder
    //   850: astore_2
    //   851: aload 6
    //   853: astore 4
    //   855: aload_2
    //   856: ldc_w 629
    //   859: invokespecial 369	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   862: aload 6
    //   864: astore 4
    //   866: ldc 163
    //   868: aload_2
    //   869: aload 9
    //   871: invokevirtual 630	java/lang/RuntimeException:getMessage	()Ljava/lang/String;
    //   874: invokevirtual 237	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   877: invokevirtual 260	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   880: invokestatic 615	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   883: aload 6
    //   885: astore 4
    //   887: iconst_2
    //   888: ldc_w 632
    //   891: iload 11
    //   893: invokestatic 635	java/lang/String:valueOf	(Z)Ljava/lang/String;
    //   896: invokevirtual 205	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   899: aload 9
    //   901: invokestatic 503	com/tencent/mm/plugin/dbbackup/a/a:a	(ILjava/lang/String;Ljava/lang/Throwable;)V
    //   904: aload 6
    //   906: ifnull +8 -> 914
    //   909: aload 6
    //   911: invokevirtual 609	com/tencent/wcdb/repair/RepairKit:release	()V
    //   914: iconst_m1
    //   915: istore 8
    //   917: sipush 19018
    //   920: invokestatic 92	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   923: goto -117 -> 806
    //   926: aload 6
    //   928: astore 4
    //   930: new 508	java/lang/RuntimeException
    //   933: astore 9
    //   935: aload 6
    //   937: astore 4
    //   939: aload 9
    //   941: ldc_w 637
    //   944: invokespecial 606	java/lang/RuntimeException:<init>	(Ljava/lang/String;)V
    //   947: aload 6
    //   949: astore 4
    //   951: sipush 19018
    //   954: invokestatic 92	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   957: aload 6
    //   959: astore 4
    //   961: aload 9
    //   963: athrow
    //   964: astore 6
    //   966: aload 4
    //   968: astore 9
    //   970: goto -373 -> 597
    //   973: astore 6
    //   975: aconst_null
    //   976: astore 9
    //   978: goto -381 -> 597
    //   981: astore 9
    //   983: aload 6
    //   985: astore 4
    //   987: aload 9
    //   989: astore 6
    //   991: aload 4
    //   993: astore 9
    //   995: goto -398 -> 597
    //   998: astore 9
    //   1000: aload 6
    //   1002: astore 4
    //   1004: aload 9
    //   1006: astore 6
    //   1008: aload 4
    //   1010: astore 9
    //   1012: goto -415 -> 597
    //   1015: astore 9
    //   1017: aconst_null
    //   1018: astore 6
    //   1020: goto -177 -> 843
    //   1023: astore 9
    //   1025: goto -182 -> 843
    //   1028: astore 9
    //   1030: goto -187 -> 843
    //   1033: astore 4
    //   1035: aload 9
    //   1037: astore 6
    //   1039: goto -461 -> 578
    //   1042: astore 4
    //   1044: goto -466 -> 578
    //   1047: goto -590 -> 457
    //   1050: goto -816 -> 234
    //
    // Exception table:
    //   from	to	target	type
    //   461	466	576	com/tencent/wcdb/support/OperationCanceledException
    //   470	478	576	com/tencent/wcdb/support/OperationCanceledException
    //   482	489	576	com/tencent/wcdb/support/OperationCanceledException
    //   493	509	576	com/tencent/wcdb/support/OperationCanceledException
    //   518	526	576	com/tencent/wcdb/support/OperationCanceledException
    //   530	538	576	com/tencent/wcdb/support/OperationCanceledException
    //   542	547	576	com/tencent/wcdb/support/OperationCanceledException
    //   551	559	576	com/tencent/wcdb/support/OperationCanceledException
    //   563	569	576	com/tencent/wcdb/support/OperationCanceledException
    //   573	576	576	com/tencent/wcdb/support/OperationCanceledException
    //   720	728	576	com/tencent/wcdb/support/OperationCanceledException
    //   732	739	576	com/tencent/wcdb/support/OperationCanceledException
    //   743	761	576	com/tencent/wcdb/support/OperationCanceledException
    //   765	790	576	com/tencent/wcdb/support/OperationCanceledException
    //   819	827	576	com/tencent/wcdb/support/OperationCanceledException
    //   831	838	576	com/tencent/wcdb/support/OperationCanceledException
    //   930	935	576	com/tencent/wcdb/support/OperationCanceledException
    //   939	947	576	com/tencent/wcdb/support/OperationCanceledException
    //   951	957	576	com/tencent/wcdb/support/OperationCanceledException
    //   961	964	576	com/tencent/wcdb/support/OperationCanceledException
    //   578	587	587	finally
    //   168	179	616	java/lang/Exception
    //   183	188	616	java/lang/Exception
    //   192	200	616	java/lang/Exception
    //   204	230	616	java/lang/Exception
    //   461	466	841	java/lang/RuntimeException
    //   470	478	841	java/lang/RuntimeException
    //   482	489	841	java/lang/RuntimeException
    //   493	509	841	java/lang/RuntimeException
    //   518	526	841	java/lang/RuntimeException
    //   530	538	841	java/lang/RuntimeException
    //   542	547	841	java/lang/RuntimeException
    //   551	559	841	java/lang/RuntimeException
    //   563	569	841	java/lang/RuntimeException
    //   573	576	841	java/lang/RuntimeException
    //   720	728	841	java/lang/RuntimeException
    //   732	739	841	java/lang/RuntimeException
    //   743	761	841	java/lang/RuntimeException
    //   765	790	841	java/lang/RuntimeException
    //   819	827	841	java/lang/RuntimeException
    //   831	838	841	java/lang/RuntimeException
    //   930	935	841	java/lang/RuntimeException
    //   939	947	841	java/lang/RuntimeException
    //   951	957	841	java/lang/RuntimeException
    //   961	964	841	java/lang/RuntimeException
    //   461	466	964	finally
    //   470	478	964	finally
    //   482	489	964	finally
    //   493	509	964	finally
    //   518	526	964	finally
    //   530	538	964	finally
    //   542	547	964	finally
    //   551	559	964	finally
    //   563	569	964	finally
    //   573	576	964	finally
    //   720	728	964	finally
    //   732	739	964	finally
    //   743	761	964	finally
    //   765	790	964	finally
    //   819	827	964	finally
    //   831	838	964	finally
    //   847	851	964	finally
    //   855	862	964	finally
    //   866	883	964	finally
    //   887	904	964	finally
    //   930	935	964	finally
    //   939	947	964	finally
    //   951	957	964	finally
    //   961	964	964	finally
    //   270	275	973	finally
    //   278	286	973	finally
    //   289	306	973	finally
    //   315	329	973	finally
    //   332	348	973	finally
    //   351	356	973	finally
    //   359	375	973	finally
    //   375	399	981	finally
    //   694	710	981	finally
    //   408	416	998	finally
    //   420	424	998	finally
    //   428	454	998	finally
    //   270	275	1015	java/lang/RuntimeException
    //   278	286	1015	java/lang/RuntimeException
    //   289	306	1015	java/lang/RuntimeException
    //   315	329	1015	java/lang/RuntimeException
    //   332	348	1015	java/lang/RuntimeException
    //   351	356	1015	java/lang/RuntimeException
    //   359	375	1015	java/lang/RuntimeException
    //   375	399	1023	java/lang/RuntimeException
    //   694	710	1023	java/lang/RuntimeException
    //   408	416	1028	java/lang/RuntimeException
    //   420	424	1028	java/lang/RuntimeException
    //   428	454	1028	java/lang/RuntimeException
    //   270	275	1033	com/tencent/wcdb/support/OperationCanceledException
    //   278	286	1033	com/tencent/wcdb/support/OperationCanceledException
    //   289	306	1033	com/tencent/wcdb/support/OperationCanceledException
    //   315	329	1033	com/tencent/wcdb/support/OperationCanceledException
    //   332	348	1033	com/tencent/wcdb/support/OperationCanceledException
    //   351	356	1033	com/tencent/wcdb/support/OperationCanceledException
    //   359	375	1033	com/tencent/wcdb/support/OperationCanceledException
    //   408	416	1033	com/tencent/wcdb/support/OperationCanceledException
    //   420	424	1033	com/tencent/wcdb/support/OperationCanceledException
    //   428	454	1033	com/tencent/wcdb/support/OperationCanceledException
    //   375	399	1042	com/tencent/wcdb/support/OperationCanceledException
    //   694	710	1042	com/tencent/wcdb/support/OperationCanceledException
  }

  // ERROR //
  private int bhY()
  {
    // Byte code:
    //   0: sipush 19019
    //   3: invokestatic 59	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: aload_0
    //   7: getfield 99	com/tencent/mm/plugin/dbbackup/a/a:mCancellationSignal	Lcom/tencent/wcdb/support/CancellationSignal;
    //   10: invokevirtual 478	com/tencent/wcdb/support/CancellationSignal:throwIfCanceled	()V
    //   13: ldc 163
    //   15: ldc_w 640
    //   18: invokestatic 407	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   21: aload_0
    //   22: getfield 395	com/tencent/mm/plugin/dbbackup/a/a:kJi	Ljava/util/List;
    //   25: invokeinterface 522 1 0
    //   30: astore_1
    //   31: aconst_null
    //   32: astore_2
    //   33: aload_1
    //   34: invokeinterface 527 1 0
    //   39: ifeq +98 -> 137
    //   42: aload_1
    //   43: invokeinterface 531 1 0
    //   48: checkcast 75	java/lang/String
    //   51: astore_3
    //   52: new 642	com/tencent/wcdb/repair/RecoverKit
    //   55: astore 4
    //   57: aload 4
    //   59: aload_0
    //   60: getfield 175	com/tencent/mm/plugin/dbbackup/a/a:kJc	Lcom/tencent/wcdb/database/SQLiteDatabase;
    //   63: aload_3
    //   64: aload_0
    //   65: getfield 539	com/tencent/mm/plugin/dbbackup/a/a:kJl	Ljava/util/List;
    //   68: iconst_0
    //   69: invokeinterface 546 2 0
    //   74: checkcast 547	[B
    //   77: invokespecial 645	com/tencent/wcdb/repair/RecoverKit:<init>	(Lcom/tencent/wcdb/database/SQLiteDatabase;Ljava/lang/String;[B)V
    //   80: ldc 163
    //   82: ldc_w 647
    //   85: aload_3
    //   86: invokestatic 201	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   89: invokevirtual 205	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   92: invokestatic 407	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   95: aload 4
    //   97: astore_2
    //   98: goto -65 -> 33
    //   101: astore_3
    //   102: aload 4
    //   104: astore_2
    //   105: aload_3
    //   106: astore 4
    //   108: ldc 163
    //   110: new 229	java/lang/StringBuilder
    //   113: dup
    //   114: ldc_w 649
    //   117: invokespecial 369	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   120: aload 4
    //   122: invokevirtual 499	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   125: invokevirtual 237	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   128: invokevirtual 260	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   131: invokestatic 615	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   134: goto -101 -> 33
    //   137: aload_2
    //   138: ifnonnull +15 -> 153
    //   141: sipush 19019
    //   144: invokestatic 92	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   147: iconst_m1
    //   148: istore 5
    //   150: iload 5
    //   152: ireturn
    //   153: aload_2
    //   154: iconst_0
    //   155: aload_0
    //   156: getfield 99	com/tencent/mm/plugin/dbbackup/a/a:mCancellationSignal	Lcom/tencent/wcdb/support/CancellationSignal;
    //   159: invokevirtual 653	com/tencent/wcdb/repair/RecoverKit:run	(ZLcom/tencent/wcdb/support/CancellationSignal;)I
    //   162: istore 5
    //   164: iload 5
    //   166: ifne +24 -> 190
    //   169: ldc 163
    //   171: ldc_w 655
    //   174: invokestatic 407	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   177: aload_2
    //   178: invokevirtual 656	com/tencent/wcdb/repair/RecoverKit:release	()V
    //   181: sipush 19019
    //   184: invokestatic 92	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   187: goto -37 -> 150
    //   190: iload 5
    //   192: iconst_1
    //   193: if_icmpne +47 -> 240
    //   196: ldc 163
    //   198: ldc_w 658
    //   201: invokestatic 407	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   204: aload_0
    //   205: getfield 99	com/tencent/mm/plugin/dbbackup/a/a:mCancellationSignal	Lcom/tencent/wcdb/support/CancellationSignal;
    //   208: invokevirtual 478	com/tencent/wcdb/support/CancellationSignal:throwIfCanceled	()V
    //   211: goto -34 -> 177
    //   214: astore 4
    //   216: sipush 19019
    //   219: invokestatic 92	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   222: aload 4
    //   224: athrow
    //   225: astore 4
    //   227: aload_2
    //   228: invokevirtual 656	com/tencent/wcdb/repair/RecoverKit:release	()V
    //   231: sipush 19019
    //   234: invokestatic 92	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   237: aload 4
    //   239: athrow
    //   240: ldc 163
    //   242: ldc_w 660
    //   245: invokestatic 615	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   248: goto -71 -> 177
    //   251: astore 4
    //   253: new 229	java/lang/StringBuilder
    //   256: astore_3
    //   257: aload_3
    //   258: ldc_w 629
    //   261: invokespecial 369	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   264: ldc 163
    //   266: aload_3
    //   267: aload 4
    //   269: invokevirtual 499	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   272: invokevirtual 237	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   275: invokevirtual 260	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   278: invokestatic 615	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   281: iconst_4
    //   282: ldc_w 662
    //   285: aload 4
    //   287: invokestatic 503	com/tencent/mm/plugin/dbbackup/a/a:a	(ILjava/lang/String;Ljava/lang/Throwable;)V
    //   290: aload_2
    //   291: invokevirtual 656	com/tencent/wcdb/repair/RecoverKit:release	()V
    //   294: sipush 19019
    //   297: invokestatic 92	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   300: iconst_m1
    //   301: istore 5
    //   303: goto -153 -> 150
    //   306: astore 4
    //   308: goto -200 -> 108
    //
    // Exception table:
    //   from	to	target	type
    //   80	95	101	java/lang/Exception
    //   153	164	214	com/tencent/wcdb/support/OperationCanceledException
    //   169	177	214	com/tencent/wcdb/support/OperationCanceledException
    //   196	211	214	com/tencent/wcdb/support/OperationCanceledException
    //   240	248	214	com/tencent/wcdb/support/OperationCanceledException
    //   153	164	225	finally
    //   169	177	225	finally
    //   196	211	225	finally
    //   216	225	225	finally
    //   240	248	225	finally
    //   253	290	225	finally
    //   153	164	251	java/lang/Exception
    //   169	177	251	java/lang/Exception
    //   196	211	251	java/lang/Exception
    //   240	248	251	java/lang/Exception
    //   52	80	306	java/lang/Exception
  }

  // ERROR //
  private int bhZ()
  {
    // Byte code:
    //   0: sipush 19020
    //   3: invokestatic 59	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: aload_0
    //   7: getfield 393	com/tencent/mm/plugin/dbbackup/a/a:kJe	Ljava/lang/String;
    //   10: ifnull +13 -> 23
    //   13: aload_0
    //   14: getfield 393	com/tencent/mm/plugin/dbbackup/a/a:kJe	Ljava/lang/String;
    //   17: invokevirtual 160	java/lang/String:isEmpty	()Z
    //   20: ifeq +13 -> 33
    //   23: sipush 19020
    //   26: invokestatic 92	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   29: iconst_0
    //   30: istore_1
    //   31: iload_1
    //   32: ireturn
    //   33: ldc 163
    //   35: ldc_w 665
    //   38: invokestatic 407	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   41: aload_0
    //   42: getfield 175	com/tencent/mm/plugin/dbbackup/a/a:kJc	Lcom/tencent/wcdb/database/SQLiteDatabase;
    //   45: ldc_w 667
    //   48: aconst_null
    //   49: invokestatic 209	com/tencent/wcdb/DatabaseUtils:longForQuery	(Lcom/tencent/wcdb/database/SQLiteDatabase;Ljava/lang/String;[Ljava/lang/String;)J
    //   52: l2i
    //   53: istore_1
    //   54: iconst_1
    //   55: newarray long
    //   57: astore_2
    //   58: aload_2
    //   59: iconst_0
    //   60: aload_0
    //   61: getfield 175	com/tencent/mm/plugin/dbbackup/a/a:kJc	Lcom/tencent/wcdb/database/SQLiteDatabase;
    //   64: ldc_w 669
    //   67: aconst_null
    //   68: invokestatic 209	com/tencent/wcdb/DatabaseUtils:longForQuery	(Lcom/tencent/wcdb/database/SQLiteDatabase;Ljava/lang/String;[Ljava/lang/String;)J
    //   71: lconst_1
    //   72: ladd
    //   73: lastore
    //   74: aload_2
    //   75: iconst_0
    //   76: laload
    //   77: ldc2_w 670
    //   80: lcmp
    //   81: ifle +19 -> 100
    //   84: aload_2
    //   85: iconst_0
    //   86: laload
    //   87: ldc2_w 672
    //   90: lcmp
    //   91: ifgt +9 -> 100
    //   94: aload_2
    //   95: iconst_0
    //   96: ldc2_w 674
    //   99: lastore
    //   100: new 677	java/util/HashMap
    //   103: astore_3
    //   104: aload_3
    //   105: iload_1
    //   106: iload_1
    //   107: iconst_2
    //   108: idiv
    //   109: iadd
    //   110: sipush 10240
    //   113: invokestatic 680	java/lang/Math:max	(II)I
    //   116: invokespecial 681	java/util/HashMap:<init>	(I)V
    //   119: new 683	com/tencent/mm/plugin/dbbackup/a/a$2
    //   122: astore 4
    //   124: aload 4
    //   126: aload_0
    //   127: invokespecial 686	com/tencent/mm/plugin/dbbackup/a/a$2:<init>	(Lcom/tencent/mm/plugin/dbbackup/a/a;)V
    //   130: aload_0
    //   131: getfield 393	com/tencent/mm/plugin/dbbackup/a/a:kJe	Ljava/lang/String;
    //   134: aload_0
    //   135: getfield 397	com/tencent/mm/plugin/dbbackup/a/a:kJk	[B
    //   138: getstatic 73	com/tencent/mm/plugin/dbbackup/a/a:kJb	Lcom/tencent/wcdb/database/SQLiteCipherSpec;
    //   141: aconst_null
    //   142: iconst_1
    //   143: aload 4
    //   145: iconst_1
    //   146: invokestatic 690	com/tencent/wcdb/database/SQLiteDatabase:openDatabase	(Ljava/lang/String;[BLcom/tencent/wcdb/database/SQLiteCipherSpec;Lcom/tencent/wcdb/database/SQLiteDatabase$CursorFactory;ILcom/tencent/wcdb/DatabaseErrorHandler;I)Lcom/tencent/wcdb/database/SQLiteDatabase;
    //   149: astore 4
    //   151: aload_0
    //   152: aload 4
    //   154: ldc_w 692
    //   157: iconst_0
    //   158: iconst_0
    //   159: iconst_0
    //   160: aconst_null
    //   161: invokespecial 694	com/tencent/mm/plugin/dbbackup/a/a:a	(Lcom/tencent/wcdb/database/SQLiteDatabase;Ljava/lang/String;IZILcom/tencent/mm/plugin/dbbackup/a/a$d;)I
    //   164: pop
    //   165: aload_0
    //   166: getfield 175	com/tencent/mm/plugin/dbbackup/a/a:kJc	Lcom/tencent/wcdb/database/SQLiteDatabase;
    //   169: invokevirtual 267	com/tencent/wcdb/database/SQLiteDatabase:beginTransaction	()V
    //   172: iconst_3
    //   173: anewarray 167	java/lang/Object
    //   176: astore 5
    //   178: aload 5
    //   180: iconst_0
    //   181: sipush 8197
    //   184: invokestatic 275	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   187: aastore
    //   188: aload 5
    //   190: iconst_1
    //   191: iconst_3
    //   192: invokestatic 275	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   195: aastore
    //   196: aload 5
    //   198: iconst_2
    //   199: ldc 77
    //   201: aastore
    //   202: aload_0
    //   203: getfield 175	com/tencent/mm/plugin/dbbackup/a/a:kJc	Lcom/tencent/wcdb/database/SQLiteDatabase;
    //   206: ldc_w 696
    //   209: aload 5
    //   211: invokevirtual 699	com/tencent/wcdb/database/SQLiteDatabase:execSQL	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   214: aload 5
    //   216: iconst_0
    //   217: bipush 15
    //   219: invokestatic 275	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   222: aastore
    //   223: aload 5
    //   225: iconst_1
    //   226: iconst_1
    //   227: invokestatic 275	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   230: aastore
    //   231: aload 5
    //   233: iconst_2
    //   234: ldc_w 701
    //   237: aastore
    //   238: aload_0
    //   239: getfield 175	com/tencent/mm/plugin/dbbackup/a/a:kJc	Lcom/tencent/wcdb/database/SQLiteDatabase;
    //   242: ldc_w 696
    //   245: aload 5
    //   247: invokevirtual 699	com/tencent/wcdb/database/SQLiteDatabase:execSQL	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   250: aload 5
    //   252: iconst_0
    //   253: bipush 89
    //   255: invokestatic 275	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   258: aastore
    //   259: aload 5
    //   261: iconst_1
    //   262: iconst_1
    //   263: invokestatic 275	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   266: aastore
    //   267: aload 5
    //   269: iconst_2
    //   270: ldc_w 703
    //   273: aastore
    //   274: aload_0
    //   275: getfield 175	com/tencent/mm/plugin/dbbackup/a/a:kJc	Lcom/tencent/wcdb/database/SQLiteDatabase;
    //   278: ldc_w 696
    //   281: aload 5
    //   283: invokevirtual 699	com/tencent/wcdb/database/SQLiteDatabase:execSQL	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   286: aload 4
    //   288: getstatic 215	com/tencent/wcdb/database/SQLiteDirectCursor:FACTORY	Lcom/tencent/wcdb/database/SQLiteDatabase$CursorFactory;
    //   291: ldc_w 705
    //   294: iconst_1
    //   295: anewarray 75	java/lang/String
    //   298: dup
    //   299: iconst_0
    //   300: ldc_w 707
    //   303: aastore
    //   304: ldc_w 692
    //   307: invokevirtual 710	com/tencent/wcdb/database/SQLiteDatabase:rawQueryWithFactory	(Lcom/tencent/wcdb/database/SQLiteDatabase$CursorFactory;Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/String;)Lcom/tencent/wcdb/Cursor;
    //   310: astore 6
    //   312: aload 4
    //   314: astore 7
    //   316: aload 6
    //   318: astore 8
    //   320: aload 6
    //   322: astore 9
    //   324: aload 6
    //   326: astore 10
    //   328: aload 6
    //   330: invokeinterface 713 1 0
    //   335: ifeq +121 -> 456
    //   338: aload 4
    //   340: astore 7
    //   342: aload 6
    //   344: astore 8
    //   346: aload 6
    //   348: astore 9
    //   350: aload 6
    //   352: astore 10
    //   354: aload 5
    //   356: iconst_0
    //   357: aload 6
    //   359: iconst_0
    //   360: invokeinterface 715 2 0
    //   365: invokestatic 275	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   368: aastore
    //   369: aload 4
    //   371: astore 7
    //   373: aload 6
    //   375: astore 8
    //   377: aload 6
    //   379: astore 9
    //   381: aload 6
    //   383: astore 10
    //   385: aload 5
    //   387: iconst_1
    //   388: aload 6
    //   390: iconst_1
    //   391: invokeinterface 715 2 0
    //   396: invokestatic 275	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   399: aastore
    //   400: aload 4
    //   402: astore 7
    //   404: aload 6
    //   406: astore 8
    //   408: aload 6
    //   410: astore 9
    //   412: aload 6
    //   414: astore 10
    //   416: aload 5
    //   418: iconst_2
    //   419: aload 6
    //   421: iconst_2
    //   422: invokeinterface 318 2 0
    //   427: aastore
    //   428: aload 4
    //   430: astore 7
    //   432: aload 6
    //   434: astore 8
    //   436: aload 6
    //   438: astore 9
    //   440: aload 6
    //   442: astore 10
    //   444: aload_0
    //   445: getfield 175	com/tencent/mm/plugin/dbbackup/a/a:kJc	Lcom/tencent/wcdb/database/SQLiteDatabase;
    //   448: ldc_w 696
    //   451: aload 5
    //   453: invokevirtual 699	com/tencent/wcdb/database/SQLiteDatabase:execSQL	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   456: aload 4
    //   458: astore 7
    //   460: aload 6
    //   462: astore 8
    //   464: aload 6
    //   466: astore 9
    //   468: aload 6
    //   470: astore 10
    //   472: aload 6
    //   474: invokeinterface 297 1 0
    //   479: aload 4
    //   481: astore 7
    //   483: aload 6
    //   485: astore 8
    //   487: aload 6
    //   489: astore 9
    //   491: aload 6
    //   493: astore 10
    //   495: aload 4
    //   497: getstatic 215	com/tencent/wcdb/database/SQLiteDirectCursor:FACTORY	Lcom/tencent/wcdb/database/SQLiteDatabase$CursorFactory;
    //   500: ldc_w 705
    //   503: iconst_1
    //   504: anewarray 75	java/lang/String
    //   507: dup
    //   508: iconst_0
    //   509: ldc_w 717
    //   512: aastore
    //   513: ldc_w 692
    //   516: invokevirtual 710	com/tencent/wcdb/database/SQLiteDatabase:rawQueryWithFactory	(Lcom/tencent/wcdb/database/SQLiteDatabase$CursorFactory;Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/String;)Lcom/tencent/wcdb/Cursor;
    //   519: astore 6
    //   521: aload 4
    //   523: astore 7
    //   525: aload 6
    //   527: astore 8
    //   529: aload 6
    //   531: astore 9
    //   533: aload 6
    //   535: astore 10
    //   537: aload 6
    //   539: invokeinterface 713 1 0
    //   544: ifeq +121 -> 665
    //   547: aload 4
    //   549: astore 7
    //   551: aload 6
    //   553: astore 8
    //   555: aload 6
    //   557: astore 9
    //   559: aload 6
    //   561: astore 10
    //   563: aload 5
    //   565: iconst_0
    //   566: aload 6
    //   568: iconst_0
    //   569: invokeinterface 715 2 0
    //   574: invokestatic 275	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   577: aastore
    //   578: aload 4
    //   580: astore 7
    //   582: aload 6
    //   584: astore 8
    //   586: aload 6
    //   588: astore 9
    //   590: aload 6
    //   592: astore 10
    //   594: aload 5
    //   596: iconst_1
    //   597: aload 6
    //   599: iconst_1
    //   600: invokeinterface 715 2 0
    //   605: invokestatic 275	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   608: aastore
    //   609: aload 4
    //   611: astore 7
    //   613: aload 6
    //   615: astore 8
    //   617: aload 6
    //   619: astore 9
    //   621: aload 6
    //   623: astore 10
    //   625: aload 5
    //   627: iconst_2
    //   628: aload 6
    //   630: iconst_2
    //   631: invokeinterface 318 2 0
    //   636: aastore
    //   637: aload 4
    //   639: astore 7
    //   641: aload 6
    //   643: astore 8
    //   645: aload 6
    //   647: astore 9
    //   649: aload 6
    //   651: astore 10
    //   653: aload_0
    //   654: getfield 175	com/tencent/mm/plugin/dbbackup/a/a:kJc	Lcom/tencent/wcdb/database/SQLiteDatabase;
    //   657: ldc_w 696
    //   660: aload 5
    //   662: invokevirtual 699	com/tencent/wcdb/database/SQLiteDatabase:execSQL	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   665: aload 4
    //   667: astore 7
    //   669: aload 6
    //   671: astore 8
    //   673: aload 6
    //   675: astore 9
    //   677: aload 6
    //   679: astore 10
    //   681: aload 6
    //   683: invokeinterface 297 1 0
    //   688: aload 4
    //   690: astore 7
    //   692: aload 6
    //   694: astore 8
    //   696: aload 6
    //   698: astore 9
    //   700: aload 6
    //   702: astore 10
    //   704: aload_0
    //   705: getfield 175	com/tencent/mm/plugin/dbbackup/a/a:kJc	Lcom/tencent/wcdb/database/SQLiteDatabase;
    //   708: invokevirtual 340	com/tencent/wcdb/database/SQLiteDatabase:setTransactionSuccessful	()V
    //   711: aload 4
    //   713: astore 7
    //   715: aload 6
    //   717: astore 8
    //   719: aload 6
    //   721: astore 9
    //   723: aload 6
    //   725: astore 10
    //   727: aload_0
    //   728: getfield 175	com/tencent/mm/plugin/dbbackup/a/a:kJc	Lcom/tencent/wcdb/database/SQLiteDatabase;
    //   731: invokevirtual 183	com/tencent/wcdb/database/SQLiteDatabase:endTransaction	()V
    //   734: aload 4
    //   736: astore 7
    //   738: aload 6
    //   740: astore 8
    //   742: aload 6
    //   744: astore 9
    //   746: aload 6
    //   748: astore 10
    //   750: aload 4
    //   752: getstatic 215	com/tencent/wcdb/database/SQLiteDirectCursor:FACTORY	Lcom/tencent/wcdb/database/SQLiteDatabase$CursorFactory;
    //   755: ldc_w 719
    //   758: aconst_null
    //   759: ldc_w 422
    //   762: invokevirtual 710	com/tencent/wcdb/database/SQLiteDatabase:rawQueryWithFactory	(Lcom/tencent/wcdb/database/SQLiteDatabase$CursorFactory;Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/String;)Lcom/tencent/wcdb/Cursor;
    //   765: astore 6
    //   767: aload 6
    //   769: astore 10
    //   771: aload 10
    //   773: astore 7
    //   775: aload 10
    //   777: astore 8
    //   779: aload 10
    //   781: astore 6
    //   783: aload 10
    //   785: ldc_w 721
    //   788: invokeinterface 724 2 0
    //   793: istore_1
    //   794: aload 10
    //   796: astore 7
    //   798: aload 10
    //   800: astore 8
    //   802: aload 10
    //   804: astore 6
    //   806: aload 10
    //   808: invokeinterface 297 1 0
    //   813: aload 10
    //   815: astore 7
    //   817: aload 10
    //   819: astore 8
    //   821: aload 10
    //   823: astore 6
    //   825: new 726	com/tencent/mm/plugin/dbbackup/a/a$3
    //   828: astore 9
    //   830: aload 10
    //   832: astore 7
    //   834: aload 10
    //   836: astore 8
    //   838: aload 10
    //   840: astore 6
    //   842: aload 9
    //   844: aload_0
    //   845: iload_1
    //   846: aload_2
    //   847: aload_3
    //   848: invokespecial 729	com/tencent/mm/plugin/dbbackup/a/a$3:<init>	(Lcom/tencent/mm/plugin/dbbackup/a/a;I[JLjava/util/HashMap;)V
    //   851: aload 10
    //   853: astore 7
    //   855: aload 10
    //   857: astore 8
    //   859: aload 10
    //   861: astore 6
    //   863: aload_0
    //   864: aload 4
    //   866: ldc_w 422
    //   869: iconst_4
    //   870: iconst_1
    //   871: iconst_5
    //   872: aload 9
    //   874: invokespecial 694	com/tencent/mm/plugin/dbbackup/a/a:a	(Lcom/tencent/wcdb/database/SQLiteDatabase;Ljava/lang/String;IZILcom/tencent/mm/plugin/dbbackup/a/a$d;)I
    //   877: pop
    //   878: aload 10
    //   880: astore 7
    //   882: aload 10
    //   884: astore 8
    //   886: aload 10
    //   888: astore 6
    //   890: aload_0
    //   891: aload 4
    //   893: ldc_w 516
    //   896: iconst_5
    //   897: iconst_1
    //   898: iconst_0
    //   899: aconst_null
    //   900: invokespecial 694	com/tencent/mm/plugin/dbbackup/a/a:a	(Lcom/tencent/wcdb/database/SQLiteDatabase;Ljava/lang/String;IZILcom/tencent/mm/plugin/dbbackup/a/a$d;)I
    //   903: pop
    //   904: aload 10
    //   906: astore 7
    //   908: aload 10
    //   910: astore 8
    //   912: aload 10
    //   914: astore 6
    //   916: aload 4
    //   918: getstatic 215	com/tencent/wcdb/database/SQLiteDirectCursor:FACTORY	Lcom/tencent/wcdb/database/SQLiteDatabase$CursorFactory;
    //   921: ldc_w 731
    //   924: aconst_null
    //   925: ldc_w 510
    //   928: invokevirtual 710	com/tencent/wcdb/database/SQLiteDatabase:rawQueryWithFactory	(Lcom/tencent/wcdb/database/SQLiteDatabase$CursorFactory;Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/String;)Lcom/tencent/wcdb/Cursor;
    //   931: astore 10
    //   933: aload 10
    //   935: astore 7
    //   937: aload 10
    //   939: astore 8
    //   941: aload 10
    //   943: astore 6
    //   945: aload 10
    //   947: ldc_w 733
    //   950: invokeinterface 724 2 0
    //   955: istore_1
    //   956: aload 10
    //   958: astore 7
    //   960: aload 10
    //   962: astore 8
    //   964: aload 10
    //   966: astore 6
    //   968: aload 10
    //   970: invokeinterface 297 1 0
    //   975: aload 10
    //   977: astore 7
    //   979: aload 10
    //   981: astore 8
    //   983: aload 10
    //   985: astore 6
    //   987: new 735	com/tencent/mm/plugin/dbbackup/a/a$4
    //   990: astore 9
    //   992: aload 10
    //   994: astore 7
    //   996: aload 10
    //   998: astore 8
    //   1000: aload 10
    //   1002: astore 6
    //   1004: aload 9
    //   1006: aload_0
    //   1007: iload_1
    //   1008: aload_3
    //   1009: invokespecial 738	com/tencent/mm/plugin/dbbackup/a/a$4:<init>	(Lcom/tencent/mm/plugin/dbbackup/a/a;ILjava/util/HashMap;)V
    //   1012: aload 10
    //   1014: astore 7
    //   1016: aload 10
    //   1018: astore 8
    //   1020: aload 10
    //   1022: astore 6
    //   1024: aload_0
    //   1025: aload 4
    //   1027: ldc_w 510
    //   1030: iconst_4
    //   1031: iconst_1
    //   1032: iconst_0
    //   1033: aload 9
    //   1035: invokespecial 694	com/tencent/mm/plugin/dbbackup/a/a:a	(Lcom/tencent/wcdb/database/SQLiteDatabase;Ljava/lang/String;IZILcom/tencent/mm/plugin/dbbackup/a/a$d;)I
    //   1038: pop
    //   1039: aload 10
    //   1041: astore 7
    //   1043: aload 10
    //   1045: astore 8
    //   1047: aload 10
    //   1049: astore 6
    //   1051: aload 4
    //   1053: getstatic 215	com/tencent/wcdb/database/SQLiteDirectCursor:FACTORY	Lcom/tencent/wcdb/database/SQLiteDatabase$CursorFactory;
    //   1056: ldc_w 740
    //   1059: aconst_null
    //   1060: ldc_w 512
    //   1063: invokevirtual 710	com/tencent/wcdb/database/SQLiteDatabase:rawQueryWithFactory	(Lcom/tencent/wcdb/database/SQLiteDatabase$CursorFactory;Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/String;)Lcom/tencent/wcdb/Cursor;
    //   1066: astore 10
    //   1068: aload 10
    //   1070: astore 7
    //   1072: aload 10
    //   1074: astore 8
    //   1076: aload 10
    //   1078: astore 6
    //   1080: aload 10
    //   1082: ldc_w 733
    //   1085: invokeinterface 724 2 0
    //   1090: istore_1
    //   1091: aload 10
    //   1093: astore 7
    //   1095: aload 10
    //   1097: astore 8
    //   1099: aload 10
    //   1101: astore 6
    //   1103: aload 10
    //   1105: invokeinterface 297 1 0
    //   1110: aload 10
    //   1112: astore 7
    //   1114: aload 10
    //   1116: astore 8
    //   1118: aload 10
    //   1120: astore 6
    //   1122: new 742	com/tencent/mm/plugin/dbbackup/a/a$5
    //   1125: astore 9
    //   1127: aload 10
    //   1129: astore 7
    //   1131: aload 10
    //   1133: astore 8
    //   1135: aload 10
    //   1137: astore 6
    //   1139: aload 9
    //   1141: aload_0
    //   1142: iload_1
    //   1143: aload_3
    //   1144: invokespecial 743	com/tencent/mm/plugin/dbbackup/a/a$5:<init>	(Lcom/tencent/mm/plugin/dbbackup/a/a;ILjava/util/HashMap;)V
    //   1147: aload 10
    //   1149: astore 7
    //   1151: aload 10
    //   1153: astore 8
    //   1155: aload 10
    //   1157: astore 6
    //   1159: aload_0
    //   1160: aload 4
    //   1162: ldc_w 512
    //   1165: iconst_4
    //   1166: iconst_1
    //   1167: iconst_0
    //   1168: aload 9
    //   1170: invokespecial 694	com/tencent/mm/plugin/dbbackup/a/a:a	(Lcom/tencent/wcdb/database/SQLiteDatabase;Ljava/lang/String;IZILcom/tencent/mm/plugin/dbbackup/a/a$d;)I
    //   1173: pop
    //   1174: aload 10
    //   1176: ifnull +20 -> 1196
    //   1179: aload 10
    //   1181: invokeinterface 294 1 0
    //   1186: ifne +10 -> 1196
    //   1189: aload 10
    //   1191: invokeinterface 297 1 0
    //   1196: aload_0
    //   1197: getfield 175	com/tencent/mm/plugin/dbbackup/a/a:kJc	Lcom/tencent/wcdb/database/SQLiteDatabase;
    //   1200: invokevirtual 180	com/tencent/wcdb/database/SQLiteDatabase:inTransaction	()Z
    //   1203: ifeq +10 -> 1213
    //   1206: aload_0
    //   1207: getfield 175	com/tencent/mm/plugin/dbbackup/a/a:kJc	Lcom/tencent/wcdb/database/SQLiteDatabase;
    //   1210: invokevirtual 183	com/tencent/wcdb/database/SQLiteDatabase:endTransaction	()V
    //   1213: aload 4
    //   1215: ifnull +8 -> 1223
    //   1218: aload 4
    //   1220: invokevirtual 475	com/tencent/wcdb/database/SQLiteDatabase:close	()V
    //   1223: sipush 19020
    //   1226: invokestatic 92	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1229: iconst_0
    //   1230: istore_1
    //   1231: goto -1200 -> 31
    //   1234: astore 6
    //   1236: aconst_null
    //   1237: astore 4
    //   1239: aconst_null
    //   1240: astore 9
    //   1242: aload 9
    //   1244: astore 7
    //   1246: aload 4
    //   1248: astore 8
    //   1250: ldc 163
    //   1252: ldc_w 745
    //   1255: invokestatic 407	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   1258: aload 9
    //   1260: astore 7
    //   1262: aload 4
    //   1264: astore 8
    //   1266: sipush 19020
    //   1269: invokestatic 92	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1272: aload 9
    //   1274: astore 7
    //   1276: aload 4
    //   1278: astore 8
    //   1280: aload 6
    //   1282: athrow
    //   1283: astore 6
    //   1285: aload 8
    //   1287: astore 4
    //   1289: aload 6
    //   1291: astore 8
    //   1293: aload 4
    //   1295: ifnull +20 -> 1315
    //   1298: aload 4
    //   1300: invokeinterface 294 1 0
    //   1305: ifne +10 -> 1315
    //   1308: aload 4
    //   1310: invokeinterface 297 1 0
    //   1315: aload_0
    //   1316: getfield 175	com/tencent/mm/plugin/dbbackup/a/a:kJc	Lcom/tencent/wcdb/database/SQLiteDatabase;
    //   1319: invokevirtual 180	com/tencent/wcdb/database/SQLiteDatabase:inTransaction	()Z
    //   1322: ifeq +10 -> 1332
    //   1325: aload_0
    //   1326: getfield 175	com/tencent/mm/plugin/dbbackup/a/a:kJc	Lcom/tencent/wcdb/database/SQLiteDatabase;
    //   1329: invokevirtual 183	com/tencent/wcdb/database/SQLiteDatabase:endTransaction	()V
    //   1332: aload 7
    //   1334: ifnull +8 -> 1342
    //   1337: aload 7
    //   1339: invokevirtual 475	com/tencent/wcdb/database/SQLiteDatabase:close	()V
    //   1342: sipush 19020
    //   1345: invokestatic 92	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1348: aload 8
    //   1350: athrow
    //   1351: astore 6
    //   1353: aconst_null
    //   1354: astore 4
    //   1356: aconst_null
    //   1357: astore 10
    //   1359: aload 10
    //   1361: astore 7
    //   1363: aload 4
    //   1365: astore 8
    //   1367: new 229	java/lang/StringBuilder
    //   1370: astore 9
    //   1372: aload 10
    //   1374: astore 7
    //   1376: aload 4
    //   1378: astore 8
    //   1380: aload 9
    //   1382: ldc_w 747
    //   1385: invokespecial 369	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1388: aload 10
    //   1390: astore 7
    //   1392: aload 4
    //   1394: astore 8
    //   1396: ldc 163
    //   1398: aload 9
    //   1400: aload 6
    //   1402: invokevirtual 499	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   1405: invokevirtual 237	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1408: invokevirtual 260	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1411: invokestatic 615	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   1414: aload 10
    //   1416: astore 7
    //   1418: aload 4
    //   1420: astore 8
    //   1422: new 229	java/lang/StringBuilder
    //   1425: astore 9
    //   1427: aload 10
    //   1429: astore 7
    //   1431: aload 4
    //   1433: astore 8
    //   1435: aload 9
    //   1437: ldc_w 749
    //   1440: invokespecial 369	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1443: aload 10
    //   1445: astore 7
    //   1447: aload 4
    //   1449: astore 8
    //   1451: iconst_5
    //   1452: aload 9
    //   1454: aload_0
    //   1455: getfield 388	com/tencent/mm/plugin/dbbackup/a/a:kJo	Z
    //   1458: invokevirtual 752	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   1461: invokevirtual 260	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1464: aload 6
    //   1466: invokestatic 503	com/tencent/mm/plugin/dbbackup/a/a:a	(ILjava/lang/String;Ljava/lang/Throwable;)V
    //   1469: aload 4
    //   1471: ifnull +20 -> 1491
    //   1474: aload 4
    //   1476: invokeinterface 294 1 0
    //   1481: ifne +10 -> 1491
    //   1484: aload 4
    //   1486: invokeinterface 297 1 0
    //   1491: aload_0
    //   1492: getfield 175	com/tencent/mm/plugin/dbbackup/a/a:kJc	Lcom/tencent/wcdb/database/SQLiteDatabase;
    //   1495: invokevirtual 180	com/tencent/wcdb/database/SQLiteDatabase:inTransaction	()Z
    //   1498: ifeq +10 -> 1508
    //   1501: aload_0
    //   1502: getfield 175	com/tencent/mm/plugin/dbbackup/a/a:kJc	Lcom/tencent/wcdb/database/SQLiteDatabase;
    //   1505: invokevirtual 183	com/tencent/wcdb/database/SQLiteDatabase:endTransaction	()V
    //   1508: aload 10
    //   1510: ifnull +8 -> 1518
    //   1513: aload 10
    //   1515: invokevirtual 475	com/tencent/wcdb/database/SQLiteDatabase:close	()V
    //   1518: iconst_m1
    //   1519: istore_1
    //   1520: sipush 19020
    //   1523: invokestatic 92	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1526: goto -1495 -> 31
    //   1529: astore 8
    //   1531: aconst_null
    //   1532: astore 4
    //   1534: aconst_null
    //   1535: astore 7
    //   1537: goto -244 -> 1293
    //   1540: astore 8
    //   1542: aconst_null
    //   1543: astore 6
    //   1545: aload 4
    //   1547: astore 7
    //   1549: aload 6
    //   1551: astore 4
    //   1553: goto -260 -> 1293
    //   1556: astore 8
    //   1558: aload 7
    //   1560: astore 6
    //   1562: aload 4
    //   1564: astore 7
    //   1566: aload 6
    //   1568: astore 4
    //   1570: goto -277 -> 1293
    //   1573: astore 6
    //   1575: aconst_null
    //   1576: astore 8
    //   1578: aload 4
    //   1580: astore 10
    //   1582: aload 8
    //   1584: astore 4
    //   1586: goto -227 -> 1359
    //   1589: astore 6
    //   1591: aload 4
    //   1593: astore 10
    //   1595: aload 9
    //   1597: astore 4
    //   1599: goto -240 -> 1359
    //   1602: astore 6
    //   1604: aload 4
    //   1606: astore 10
    //   1608: aload 8
    //   1610: astore 4
    //   1612: goto -253 -> 1359
    //   1615: astore 6
    //   1617: aconst_null
    //   1618: astore 8
    //   1620: aload 4
    //   1622: astore 9
    //   1624: aload 8
    //   1626: astore 4
    //   1628: goto -386 -> 1242
    //   1631: astore 6
    //   1633: aload 4
    //   1635: astore 9
    //   1637: aload 10
    //   1639: astore 4
    //   1641: goto -399 -> 1242
    //   1644: astore 7
    //   1646: aload 6
    //   1648: astore 8
    //   1650: aload 7
    //   1652: astore 6
    //   1654: aload 4
    //   1656: astore 9
    //   1658: aload 8
    //   1660: astore 4
    //   1662: goto -420 -> 1242
    //
    // Exception table:
    //   from	to	target	type
    //   41	74	1234	com/tencent/wcdb/support/OperationCanceledException
    //   100	151	1234	com/tencent/wcdb/support/OperationCanceledException
    //   328	338	1283	finally
    //   354	369	1283	finally
    //   385	400	1283	finally
    //   416	428	1283	finally
    //   444	456	1283	finally
    //   472	479	1283	finally
    //   495	521	1283	finally
    //   537	547	1283	finally
    //   563	578	1283	finally
    //   594	609	1283	finally
    //   625	637	1283	finally
    //   653	665	1283	finally
    //   681	688	1283	finally
    //   704	711	1283	finally
    //   727	734	1283	finally
    //   750	767	1283	finally
    //   1250	1258	1283	finally
    //   1266	1272	1283	finally
    //   1280	1283	1283	finally
    //   1367	1372	1283	finally
    //   1380	1388	1283	finally
    //   1396	1414	1283	finally
    //   1422	1427	1283	finally
    //   1435	1443	1283	finally
    //   1451	1469	1283	finally
    //   41	74	1351	java/lang/Exception
    //   100	151	1351	java/lang/Exception
    //   41	74	1529	finally
    //   100	151	1529	finally
    //   151	196	1540	finally
    //   202	231	1540	finally
    //   238	267	1540	finally
    //   274	312	1540	finally
    //   783	794	1556	finally
    //   806	813	1556	finally
    //   825	830	1556	finally
    //   842	851	1556	finally
    //   863	878	1556	finally
    //   890	904	1556	finally
    //   916	933	1556	finally
    //   945	956	1556	finally
    //   968	975	1556	finally
    //   987	992	1556	finally
    //   1004	1012	1556	finally
    //   1024	1039	1556	finally
    //   1051	1068	1556	finally
    //   1080	1091	1556	finally
    //   1103	1110	1556	finally
    //   1122	1127	1556	finally
    //   1139	1147	1556	finally
    //   1159	1174	1556	finally
    //   151	196	1573	java/lang/Exception
    //   202	231	1573	java/lang/Exception
    //   238	267	1573	java/lang/Exception
    //   274	312	1573	java/lang/Exception
    //   328	338	1589	java/lang/Exception
    //   354	369	1589	java/lang/Exception
    //   385	400	1589	java/lang/Exception
    //   416	428	1589	java/lang/Exception
    //   444	456	1589	java/lang/Exception
    //   472	479	1589	java/lang/Exception
    //   495	521	1589	java/lang/Exception
    //   537	547	1589	java/lang/Exception
    //   563	578	1589	java/lang/Exception
    //   594	609	1589	java/lang/Exception
    //   625	637	1589	java/lang/Exception
    //   653	665	1589	java/lang/Exception
    //   681	688	1589	java/lang/Exception
    //   704	711	1589	java/lang/Exception
    //   727	734	1589	java/lang/Exception
    //   750	767	1589	java/lang/Exception
    //   783	794	1602	java/lang/Exception
    //   806	813	1602	java/lang/Exception
    //   825	830	1602	java/lang/Exception
    //   842	851	1602	java/lang/Exception
    //   863	878	1602	java/lang/Exception
    //   890	904	1602	java/lang/Exception
    //   916	933	1602	java/lang/Exception
    //   945	956	1602	java/lang/Exception
    //   968	975	1602	java/lang/Exception
    //   987	992	1602	java/lang/Exception
    //   1004	1012	1602	java/lang/Exception
    //   1024	1039	1602	java/lang/Exception
    //   1051	1068	1602	java/lang/Exception
    //   1080	1091	1602	java/lang/Exception
    //   1103	1110	1602	java/lang/Exception
    //   1122	1127	1602	java/lang/Exception
    //   1139	1147	1602	java/lang/Exception
    //   1159	1174	1602	java/lang/Exception
    //   151	196	1615	com/tencent/wcdb/support/OperationCanceledException
    //   202	231	1615	com/tencent/wcdb/support/OperationCanceledException
    //   238	267	1615	com/tencent/wcdb/support/OperationCanceledException
    //   274	312	1615	com/tencent/wcdb/support/OperationCanceledException
    //   328	338	1631	com/tencent/wcdb/support/OperationCanceledException
    //   354	369	1631	com/tencent/wcdb/support/OperationCanceledException
    //   385	400	1631	com/tencent/wcdb/support/OperationCanceledException
    //   416	428	1631	com/tencent/wcdb/support/OperationCanceledException
    //   444	456	1631	com/tencent/wcdb/support/OperationCanceledException
    //   472	479	1631	com/tencent/wcdb/support/OperationCanceledException
    //   495	521	1631	com/tencent/wcdb/support/OperationCanceledException
    //   537	547	1631	com/tencent/wcdb/support/OperationCanceledException
    //   563	578	1631	com/tencent/wcdb/support/OperationCanceledException
    //   594	609	1631	com/tencent/wcdb/support/OperationCanceledException
    //   625	637	1631	com/tencent/wcdb/support/OperationCanceledException
    //   653	665	1631	com/tencent/wcdb/support/OperationCanceledException
    //   681	688	1631	com/tencent/wcdb/support/OperationCanceledException
    //   704	711	1631	com/tencent/wcdb/support/OperationCanceledException
    //   727	734	1631	com/tencent/wcdb/support/OperationCanceledException
    //   750	767	1631	com/tencent/wcdb/support/OperationCanceledException
    //   783	794	1644	com/tencent/wcdb/support/OperationCanceledException
    //   806	813	1644	com/tencent/wcdb/support/OperationCanceledException
    //   825	830	1644	com/tencent/wcdb/support/OperationCanceledException
    //   842	851	1644	com/tencent/wcdb/support/OperationCanceledException
    //   863	878	1644	com/tencent/wcdb/support/OperationCanceledException
    //   890	904	1644	com/tencent/wcdb/support/OperationCanceledException
    //   916	933	1644	com/tencent/wcdb/support/OperationCanceledException
    //   945	956	1644	com/tencent/wcdb/support/OperationCanceledException
    //   968	975	1644	com/tencent/wcdb/support/OperationCanceledException
    //   987	992	1644	com/tencent/wcdb/support/OperationCanceledException
    //   1004	1012	1644	com/tencent/wcdb/support/OperationCanceledException
    //   1024	1039	1644	com/tencent/wcdb/support/OperationCanceledException
    //   1051	1068	1644	com/tencent/wcdb/support/OperationCanceledException
    //   1080	1091	1644	com/tencent/wcdb/support/OperationCanceledException
    //   1103	1110	1644	com/tencent/wcdb/support/OperationCanceledException
    //   1122	1127	1644	com/tencent/wcdb/support/OperationCanceledException
    //   1139	1147	1644	com/tencent/wcdb/support/OperationCanceledException
    //   1159	1174	1644	com/tencent/wcdb/support/OperationCanceledException
  }

  private int fY(boolean paramBoolean)
  {
    int i = -1;
    AppMethodBeat.i(19017);
    ab.i("MicroMsg.DBRecoveryTask", "Close and rename target database: " + this.kJd);
    if (this.kJc == null)
      AppMethodBeat.o(19017);
    while (true)
    {
      return i;
      b localb = new b(this.kJc.getPath());
      if (this.kJc.isOpen())
        this.kJc.close();
      if (paramBoolean)
      {
        if (!localb.o(new b(this.kJd)))
        {
          ab.e("MicroMsg.DBRecoveryTask", "Cannot rename %s to %s", new Object[] { localb, this.kJd });
          AppMethodBeat.o(19017);
        }
      }
      else
      {
        ab.i("MicroMsg.DBRecoveryTask", "Delete temporary database file %s", new Object[] { localb });
        localb.delete();
        AppMethodBeat.o(19017);
        i = 0;
      }
    }
  }

  // ERROR //
  private Integer ot()
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_1
    //   2: iconst_0
    //   3: istore_2
    //   4: sipush 19013
    //   7: invokestatic 59	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   10: bipush 54
    //   12: invokestatic 775	com/tencent/mm/plugin/dbbackup/a/a:tM	(I)V
    //   15: iconst_m1
    //   16: istore_3
    //   17: invokestatic 781	com/tencent/mm/sdk/platformtools/ah:getContext	()Landroid/content/Context;
    //   20: ldc_w 783
    //   23: invokevirtual 789	android/content/Context:getSystemService	(Ljava/lang/String;)Ljava/lang/Object;
    //   26: checkcast 791	android/os/PowerManager
    //   29: iconst_1
    //   30: ldc_w 793
    //   33: invokevirtual 797	android/os/PowerManager:newWakeLock	(ILjava/lang/String;)Landroid/os/PowerManager$WakeLock;
    //   36: astore 4
    //   38: invokestatic 803	android/os/SystemClock:uptimeMillis	()J
    //   41: lstore 5
    //   43: aload 4
    //   45: ldc2_w 804
    //   48: invokevirtual 811	android/os/PowerManager$WakeLock:acquire	(J)V
    //   51: iload_3
    //   52: istore 7
    //   54: iload_3
    //   55: istore 8
    //   57: iload_3
    //   58: istore 9
    //   60: aload_0
    //   61: iconst_1
    //   62: anewarray 272	java/lang/Integer
    //   65: dup
    //   66: iconst_0
    //   67: iconst_1
    //   68: invokestatic 275	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   71: aastore
    //   72: invokevirtual 279	com/tencent/mm/plugin/dbbackup/a/a:publishProgress	([Ljava/lang/Object;)V
    //   75: iload_3
    //   76: istore 7
    //   78: iload_3
    //   79: istore 8
    //   81: iload_3
    //   82: istore 9
    //   84: aload_0
    //   85: invokespecial 813	com/tencent/mm/plugin/dbbackup/a/a:bhV	()I
    //   88: istore_3
    //   89: iload_3
    //   90: ifeq +114 -> 204
    //   93: iload_3
    //   94: invokestatic 275	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   97: astore 10
    //   99: iload_3
    //   100: tableswitch	default:+32 -> 132, -2:+96->196, -1:+32->132, 0:+51->151, 1:+88->188
    //   133: dstore 184
    //   135: iconst_0
    //   136: iconst_4
    //   137: aload 4
    //   139: invokevirtual 814	android/os/PowerManager$WakeLock:release	()V
    //   142: sipush 19013
    //   145: invokestatic 92	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   148: aload 10
    //   150: areturn
    //   151: invokestatic 803	android/os/SystemClock:uptimeMillis	()J
    //   154: lstore 11
    //   156: bipush 55
    //   158: invokestatic 775	com/tencent/mm/plugin/dbbackup/a/a:tM	(I)V
    //   161: getstatic 362	com/tencent/mm/plugin/report/e:pXa	Lcom/tencent/mm/plugin/report/e;
    //   164: ldc2_w 815
    //   167: ldc2_w 817
    //   170: lload 11
    //   172: lload 5
    //   174: lsub
    //   175: ldc2_w 819
    //   178: ldiv
    //   179: lconst_1
    //   180: ladd
    //   181: iconst_1
    //   182: invokevirtual 823	com/tencent/mm/plugin/report/e:a	(JJJZ)V
    //   185: goto -48 -> 137
    //   188: bipush 56
    //   190: invokestatic 775	com/tencent/mm/plugin/dbbackup/a/a:tM	(I)V
    //   193: goto -56 -> 137
    //   196: bipush 58
    //   198: invokestatic 775	com/tencent/mm/plugin/dbbackup/a/a:tM	(I)V
    //   201: goto -64 -> 137
    //   204: iload_3
    //   205: istore 7
    //   207: iload_3
    //   208: istore 8
    //   210: iload_3
    //   211: istore 9
    //   213: aload_0
    //   214: getfield 346	com/tencent/mm/plugin/dbbackup/a/a:kJn	Lcom/tencent/mm/plugin/dbbackup/a/a$c;
    //   217: ifnull +102 -> 319
    //   220: iload_3
    //   221: istore 7
    //   223: iload_3
    //   224: istore 8
    //   226: iload_3
    //   227: istore 9
    //   229: ldc 163
    //   231: ldc_w 825
    //   234: invokestatic 407	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   237: iload_3
    //   238: istore 7
    //   240: iload_3
    //   241: istore 8
    //   243: iload_3
    //   244: istore 9
    //   246: aload_0
    //   247: getfield 346	com/tencent/mm/plugin/dbbackup/a/a:kJn	Lcom/tencent/mm/plugin/dbbackup/a/a$c;
    //   250: invokeinterface 829 1 0
    //   255: astore 10
    //   257: iload_3
    //   258: istore 7
    //   260: iload_3
    //   261: istore 8
    //   263: iload_3
    //   264: istore 9
    //   266: aload_0
    //   267: getfield 539	com/tencent/mm/plugin/dbbackup/a/a:kJl	Ljava/util/List;
    //   270: aload 10
    //   272: invokeinterface 833 2 0
    //   277: pop
    //   278: iload_3
    //   279: istore 7
    //   281: iload_3
    //   282: istore 8
    //   284: iload_3
    //   285: istore 9
    //   287: aload_0
    //   288: getfield 346	com/tencent/mm/plugin/dbbackup/a/a:kJn	Lcom/tencent/mm/plugin/dbbackup/a/a$c;
    //   291: invokeinterface 836 1 0
    //   296: astore 10
    //   298: iload_3
    //   299: istore 7
    //   301: iload_3
    //   302: istore 8
    //   304: iload_3
    //   305: istore 9
    //   307: aload_0
    //   308: getfield 573	com/tencent/mm/plugin/dbbackup/a/a:kJm	Ljava/util/List;
    //   311: aload 10
    //   313: invokeinterface 833 2 0
    //   318: pop
    //   319: iload_3
    //   320: istore 7
    //   322: iload_3
    //   323: istore 8
    //   325: iload_3
    //   326: istore 9
    //   328: aload_0
    //   329: getfield 539	com/tencent/mm/plugin/dbbackup/a/a:kJl	Ljava/util/List;
    //   332: invokeinterface 837 1 0
    //   337: ifeq +23 -> 360
    //   340: iload_3
    //   341: istore 7
    //   343: iload_3
    //   344: istore 8
    //   346: iload_3
    //   347: istore 9
    //   349: aload_0
    //   350: getfield 539	com/tencent/mm/plugin/dbbackup/a/a:kJl	Ljava/util/List;
    //   353: aconst_null
    //   354: invokeinterface 841 2 0
    //   359: pop
    //   360: iload_3
    //   361: istore 7
    //   363: iload_3
    //   364: istore 8
    //   366: iload_3
    //   367: istore 9
    //   369: aload_0
    //   370: getfield 573	com/tencent/mm/plugin/dbbackup/a/a:kJm	Ljava/util/List;
    //   373: invokeinterface 837 1 0
    //   378: ifeq +23 -> 401
    //   381: iload_3
    //   382: istore 7
    //   384: iload_3
    //   385: istore 8
    //   387: iload_3
    //   388: istore 9
    //   390: aload_0
    //   391: getfield 573	com/tencent/mm/plugin/dbbackup/a/a:kJm	Ljava/util/List;
    //   394: aconst_null
    //   395: invokeinterface 841 2 0
    //   400: pop
    //   401: iload_1
    //   402: istore 8
    //   404: aload_0
    //   405: invokespecial 843	com/tencent/mm/plugin/dbbackup/a/a:bhW	()I
    //   408: istore 7
    //   410: iload 7
    //   412: istore 8
    //   414: iload 8
    //   416: istore 7
    //   418: iload 8
    //   420: istore 9
    //   422: iload 8
    //   424: istore_3
    //   425: aload_0
    //   426: iconst_1
    //   427: anewarray 272	java/lang/Integer
    //   430: dup
    //   431: iconst_0
    //   432: iconst_2
    //   433: invokestatic 275	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   436: aastore
    //   437: invokevirtual 279	com/tencent/mm/plugin/dbbackup/a/a:publishProgress	([Ljava/lang/Object;)V
    //   440: iload 8
    //   442: istore 7
    //   444: iload 8
    //   446: istore 9
    //   448: iload 8
    //   450: istore_3
    //   451: aload_0
    //   452: invokespecial 845	com/tencent/mm/plugin/dbbackup/a/a:bhX	()I
    //   455: istore 8
    //   457: iload 8
    //   459: istore_3
    //   460: iload_3
    //   461: iconst_1
    //   462: if_icmpne +114 -> 576
    //   465: iload_3
    //   466: invokestatic 275	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   469: astore 10
    //   471: iload_3
    //   472: tableswitch	default:+32 -> 504, -2:+96->568, -1:+32->504, 0:+51->523, 1:+88->560
    //   505: dstore 184
    //   507: iconst_0
    //   508: iconst_4
    //   509: aload 4
    //   511: invokevirtual 814	android/os/PowerManager$WakeLock:release	()V
    //   514: sipush 19013
    //   517: invokestatic 92	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   520: goto -372 -> 148
    //   523: invokestatic 803	android/os/SystemClock:uptimeMillis	()J
    //   526: lstore 11
    //   528: bipush 55
    //   530: invokestatic 775	com/tencent/mm/plugin/dbbackup/a/a:tM	(I)V
    //   533: getstatic 362	com/tencent/mm/plugin/report/e:pXa	Lcom/tencent/mm/plugin/report/e;
    //   536: ldc2_w 815
    //   539: ldc2_w 817
    //   542: lload 11
    //   544: lload 5
    //   546: lsub
    //   547: ldc2_w 819
    //   550: ldiv
    //   551: lconst_1
    //   552: ladd
    //   553: iconst_1
    //   554: invokevirtual 823	com/tencent/mm/plugin/report/e:a	(JJJZ)V
    //   557: goto -48 -> 509
    //   560: bipush 56
    //   562: invokestatic 775	com/tencent/mm/plugin/dbbackup/a/a:tM	(I)V
    //   565: goto -56 -> 509
    //   568: bipush 58
    //   570: invokestatic 775	com/tencent/mm/plugin/dbbackup/a/a:tM	(I)V
    //   573: goto -64 -> 509
    //   576: iload_3
    //   577: istore_2
    //   578: iload_3
    //   579: iconst_m1
    //   580: if_icmpne +41 -> 621
    //   583: iload_3
    //   584: istore 7
    //   586: iload_3
    //   587: istore 8
    //   589: iload_3
    //   590: istore 9
    //   592: aload_0
    //   593: iconst_1
    //   594: anewarray 272	java/lang/Integer
    //   597: dup
    //   598: iconst_0
    //   599: iconst_4
    //   600: invokestatic 275	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   603: aastore
    //   604: invokevirtual 279	com/tencent/mm/plugin/dbbackup/a/a:publishProgress	([Ljava/lang/Object;)V
    //   607: iload_3
    //   608: istore 7
    //   610: iload_3
    //   611: istore 8
    //   613: iload_3
    //   614: istore 9
    //   616: aload_0
    //   617: invokespecial 847	com/tencent/mm/plugin/dbbackup/a/a:bhY	()I
    //   620: istore_2
    //   621: iload_2
    //   622: ifeq +114 -> 736
    //   625: iload_2
    //   626: invokestatic 275	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   629: astore 10
    //   631: iload_2
    //   632: tableswitch	default:+32 -> 664, -2:+96->728, -1:+32->664, 0:+51->683, 1:+88->720
    //   665: dstore 184
    //   667: iconst_0
    //   668: iconst_4
    //   669: aload 4
    //   671: invokevirtual 814	android/os/PowerManager$WakeLock:release	()V
    //   674: sipush 19013
    //   677: invokestatic 92	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   680: goto -532 -> 148
    //   683: invokestatic 803	android/os/SystemClock:uptimeMillis	()J
    //   686: lstore 11
    //   688: bipush 55
    //   690: invokestatic 775	com/tencent/mm/plugin/dbbackup/a/a:tM	(I)V
    //   693: getstatic 362	com/tencent/mm/plugin/report/e:pXa	Lcom/tencent/mm/plugin/report/e;
    //   696: ldc2_w 815
    //   699: ldc2_w 817
    //   702: lload 11
    //   704: lload 5
    //   706: lsub
    //   707: ldc2_w 819
    //   710: ldiv
    //   711: lconst_1
    //   712: ladd
    //   713: iconst_1
    //   714: invokevirtual 823	com/tencent/mm/plugin/report/e:a	(JJJZ)V
    //   717: goto -48 -> 669
    //   720: bipush 56
    //   722: invokestatic 775	com/tencent/mm/plugin/dbbackup/a/a:tM	(I)V
    //   725: goto -56 -> 669
    //   728: bipush 58
    //   730: invokestatic 775	com/tencent/mm/plugin/dbbackup/a/a:tM	(I)V
    //   733: goto -64 -> 669
    //   736: iload_2
    //   737: istore 7
    //   739: iload_2
    //   740: istore 8
    //   742: iload_2
    //   743: istore 9
    //   745: aload_0
    //   746: iconst_1
    //   747: anewarray 272	java/lang/Integer
    //   750: dup
    //   751: iconst_0
    //   752: iconst_5
    //   753: invokestatic 275	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   756: aastore
    //   757: invokevirtual 279	com/tencent/mm/plugin/dbbackup/a/a:publishProgress	([Ljava/lang/Object;)V
    //   760: iload_2
    //   761: istore 7
    //   763: iload_2
    //   764: istore 8
    //   766: iload_2
    //   767: istore 9
    //   769: aload_0
    //   770: invokespecial 849	com/tencent/mm/plugin/dbbackup/a/a:bhZ	()I
    //   773: istore_3
    //   774: iload_3
    //   775: istore 8
    //   777: iload 8
    //   779: istore 7
    //   781: iload 8
    //   783: istore 9
    //   785: iload 8
    //   787: istore_3
    //   788: aload_0
    //   789: iconst_1
    //   790: anewarray 272	java/lang/Integer
    //   793: dup
    //   794: iconst_0
    //   795: bipush 6
    //   797: invokestatic 275	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   800: aastore
    //   801: invokevirtual 279	com/tencent/mm/plugin/dbbackup/a/a:publishProgress	([Ljava/lang/Object;)V
    //   804: iload 8
    //   806: istore 7
    //   808: iload 8
    //   810: istore 9
    //   812: iload 8
    //   814: istore_3
    //   815: aload_0
    //   816: iconst_1
    //   817: invokespecial 851	com/tencent/mm/plugin/dbbackup/a/a:fY	(Z)I
    //   820: istore 8
    //   822: iload 8
    //   824: invokestatic 275	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   827: astore 10
    //   829: iload 8
    //   831: tableswitch	default:+29 -> 860, -2:+93->924, -1:+29->860, 0:+48->879, 1:+85->916
    //   861: dstore 184
    //   863: iconst_0
    //   864: iconst_4
    //   865: aload 4
    //   867: invokevirtual 814	android/os/PowerManager$WakeLock:release	()V
    //   870: sipush 19013
    //   873: invokestatic 92	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   876: goto -728 -> 148
    //   879: invokestatic 803	android/os/SystemClock:uptimeMillis	()J
    //   882: lstore 11
    //   884: bipush 55
    //   886: invokestatic 775	com/tencent/mm/plugin/dbbackup/a/a:tM	(I)V
    //   889: getstatic 362	com/tencent/mm/plugin/report/e:pXa	Lcom/tencent/mm/plugin/report/e;
    //   892: ldc2_w 815
    //   895: ldc2_w 817
    //   898: lload 11
    //   900: lload 5
    //   902: lsub
    //   903: ldc2_w 819
    //   906: ldiv
    //   907: lconst_1
    //   908: ladd
    //   909: iconst_1
    //   910: invokevirtual 823	com/tencent/mm/plugin/report/e:a	(JJJZ)V
    //   913: goto -48 -> 865
    //   916: bipush 56
    //   918: invokestatic 775	com/tencent/mm/plugin/dbbackup/a/a:tM	(I)V
    //   921: goto -56 -> 865
    //   924: bipush 58
    //   926: invokestatic 775	com/tencent/mm/plugin/dbbackup/a/a:tM	(I)V
    //   929: goto -64 -> 865
    //   932: astore 10
    //   934: iload 7
    //   936: istore 8
    //   938: iload 8
    //   940: istore 7
    //   942: ldc 163
    //   944: ldc_w 853
    //   947: invokestatic 407	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   950: iload 8
    //   952: istore 7
    //   954: aload_0
    //   955: iconst_0
    //   956: invokespecial 851	com/tencent/mm/plugin/dbbackup/a/a:fY	(Z)I
    //   959: pop
    //   960: iconst_1
    //   961: invokestatic 275	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   964: astore 10
    //   966: bipush 56
    //   968: invokestatic 775	com/tencent/mm/plugin/dbbackup/a/a:tM	(I)V
    //   971: aload 4
    //   973: invokevirtual 814	android/os/PowerManager$WakeLock:release	()V
    //   976: sipush 19013
    //   979: invokestatic 92	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   982: goto -834 -> 148
    //   985: astore 10
    //   987: iload 8
    //   989: istore 7
    //   991: iload 7
    //   993: istore 8
    //   995: ldc 163
    //   997: aload 10
    //   999: ldc_w 855
    //   1002: iconst_0
    //   1003: anewarray 167	java/lang/Object
    //   1006: invokestatic 466	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1009: iload 7
    //   1011: istore 8
    //   1013: aload_0
    //   1014: iconst_0
    //   1015: invokespecial 851	com/tencent/mm/plugin/dbbackup/a/a:fY	(Z)I
    //   1018: pop
    //   1019: iconst_m1
    //   1020: istore 7
    //   1022: iconst_m1
    //   1023: invokestatic 275	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1026: astore 10
    //   1028: bipush 57
    //   1030: invokestatic 775	com/tencent/mm/plugin/dbbackup/a/a:tM	(I)V
    //   1033: aload 4
    //   1035: invokevirtual 814	android/os/PowerManager$WakeLock:release	()V
    //   1038: sipush 19013
    //   1041: invokestatic 92	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1044: goto -896 -> 148
    //   1047: astore 10
    //   1049: iload 9
    //   1051: istore 8
    //   1053: iload 8
    //   1055: tableswitch	default:+29 -> 1084, -2:+93->1148, -1:+29->1084, 0:+48->1103, 1:+85->1140
    //   1085: dstore 184
    //   1087: iconst_0
    //   1088: iconst_4
    //   1089: aload 4
    //   1091: invokevirtual 814	android/os/PowerManager$WakeLock:release	()V
    //   1094: sipush 19013
    //   1097: invokestatic 92	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1100: aload 10
    //   1102: athrow
    //   1103: invokestatic 803	android/os/SystemClock:uptimeMillis	()J
    //   1106: lstore 11
    //   1108: bipush 55
    //   1110: invokestatic 775	com/tencent/mm/plugin/dbbackup/a/a:tM	(I)V
    //   1113: getstatic 362	com/tencent/mm/plugin/report/e:pXa	Lcom/tencent/mm/plugin/report/e;
    //   1116: ldc2_w 815
    //   1119: ldc2_w 817
    //   1122: lload 11
    //   1124: lload 5
    //   1126: lsub
    //   1127: ldc2_w 819
    //   1130: ldiv
    //   1131: lconst_1
    //   1132: ladd
    //   1133: iconst_1
    //   1134: invokevirtual 823	com/tencent/mm/plugin/report/e:a	(JJJZ)V
    //   1137: goto -48 -> 1089
    //   1140: bipush 56
    //   1142: invokestatic 775	com/tencent/mm/plugin/dbbackup/a/a:tM	(I)V
    //   1145: goto -56 -> 1089
    //   1148: bipush 58
    //   1150: invokestatic 775	com/tencent/mm/plugin/dbbackup/a/a:tM	(I)V
    //   1153: goto -64 -> 1089
    //   1156: astore 10
    //   1158: goto -105 -> 1053
    //   1161: astore 10
    //   1163: iload 7
    //   1165: istore 8
    //   1167: goto -114 -> 1053
    //   1170: astore 10
    //   1172: iconst_1
    //   1173: istore 7
    //   1175: goto -122 -> 1053
    //   1178: astore 10
    //   1180: iload_2
    //   1181: istore 7
    //   1183: goto -192 -> 991
    //   1186: astore 10
    //   1188: iload 9
    //   1190: istore 7
    //   1192: goto -201 -> 991
    //   1195: astore 10
    //   1197: iconst_0
    //   1198: istore 8
    //   1200: goto -262 -> 938
    //   1203: astore 10
    //   1205: iload_3
    //   1206: istore 8
    //   1208: goto -270 -> 938
    //
    // Exception table:
    //   from	to	target	type
    //   60	75	932	com/tencent/wcdb/support/OperationCanceledException
    //   84	89	932	com/tencent/wcdb/support/OperationCanceledException
    //   213	220	932	com/tencent/wcdb/support/OperationCanceledException
    //   229	237	932	com/tencent/wcdb/support/OperationCanceledException
    //   246	257	932	com/tencent/wcdb/support/OperationCanceledException
    //   266	278	932	com/tencent/wcdb/support/OperationCanceledException
    //   287	298	932	com/tencent/wcdb/support/OperationCanceledException
    //   307	319	932	com/tencent/wcdb/support/OperationCanceledException
    //   328	340	932	com/tencent/wcdb/support/OperationCanceledException
    //   349	360	932	com/tencent/wcdb/support/OperationCanceledException
    //   369	381	932	com/tencent/wcdb/support/OperationCanceledException
    //   390	401	932	com/tencent/wcdb/support/OperationCanceledException
    //   592	607	932	com/tencent/wcdb/support/OperationCanceledException
    //   616	621	932	com/tencent/wcdb/support/OperationCanceledException
    //   745	760	932	com/tencent/wcdb/support/OperationCanceledException
    //   769	774	932	com/tencent/wcdb/support/OperationCanceledException
    //   60	75	985	java/lang/Exception
    //   84	89	985	java/lang/Exception
    //   213	220	985	java/lang/Exception
    //   229	237	985	java/lang/Exception
    //   246	257	985	java/lang/Exception
    //   266	278	985	java/lang/Exception
    //   287	298	985	java/lang/Exception
    //   307	319	985	java/lang/Exception
    //   328	340	985	java/lang/Exception
    //   349	360	985	java/lang/Exception
    //   369	381	985	java/lang/Exception
    //   390	401	985	java/lang/Exception
    //   592	607	985	java/lang/Exception
    //   616	621	985	java/lang/Exception
    //   745	760	985	java/lang/Exception
    //   769	774	985	java/lang/Exception
    //   60	75	1047	finally
    //   84	89	1047	finally
    //   213	220	1047	finally
    //   229	237	1047	finally
    //   246	257	1047	finally
    //   266	278	1047	finally
    //   287	298	1047	finally
    //   307	319	1047	finally
    //   328	340	1047	finally
    //   349	360	1047	finally
    //   369	381	1047	finally
    //   390	401	1047	finally
    //   592	607	1047	finally
    //   616	621	1047	finally
    //   745	760	1047	finally
    //   769	774	1047	finally
    //   404	410	1156	finally
    //   995	1009	1156	finally
    //   1013	1019	1156	finally
    //   425	440	1161	finally
    //   451	457	1161	finally
    //   788	804	1161	finally
    //   815	822	1161	finally
    //   942	950	1161	finally
    //   954	960	1161	finally
    //   404	410	1178	java/lang/Exception
    //   425	440	1186	java/lang/Exception
    //   451	457	1186	java/lang/Exception
    //   788	804	1186	java/lang/Exception
    //   815	822	1186	java/lang/Exception
    //   404	410	1195	com/tencent/wcdb/support/OperationCanceledException
    //   425	440	1203	com/tencent/wcdb/support/OperationCanceledException
    //   451	457	1203	com/tencent/wcdb/support/OperationCanceledException
    //   788	804	1203	com/tencent/wcdb/support/OperationCanceledException
    //   815	822	1203	com/tencent/wcdb/support/OperationCanceledException
  }

  private static void tM(int paramInt)
  {
    AppMethodBeat.i(19023);
    com.tencent.mm.plugin.report.e.pXa.a(181L, paramInt, 1L, true);
    AppMethodBeat.o(19023);
  }

  public final void cancel()
  {
    AppMethodBeat.i(19014);
    this.mCancellationSignal.cancel();
    ab.i("MicroMsg.DBRecoveryTask", "Recovery cancel triggered.");
    AppMethodBeat.o(19014);
  }

  public static final class a
  {
    private LinkedHashSet<byte[]> kJD;
    private LinkedHashSet<byte[]> kJE;
    public String kJd;
    public String kJe;
    public String kJf;
    public String kJg;
    private List<String> kJh;
    private List<String> kJi;
    private byte[] kJj;
    private byte[] kJk;
    public a.c kJn;
    public boolean kJo;
    public a.b kJp;

    public a()
    {
      AppMethodBeat.i(19006);
      this.kJh = new ArrayList();
      this.kJi = new ArrayList();
      this.kJD = new LinkedHashSet();
      this.kJE = new LinkedHashSet();
      AppMethodBeat.o(19006);
    }

    public final a Ig(String paramString)
    {
      AppMethodBeat.i(19008);
      this.kJh.add(paramString);
      AppMethodBeat.o(19008);
      return this;
    }

    public final a Ih(String paramString)
    {
      AppMethodBeat.i(19009);
      this.kJi.add(paramString);
      AppMethodBeat.o(19009);
      return this;
    }

    public final a aC(byte[] paramArrayOfByte)
    {
      AppMethodBeat.i(19010);
      this.kJj = Arrays.copyOf(paramArrayOfByte, paramArrayOfByte.length);
      AppMethodBeat.o(19010);
      return this;
    }

    public final a aD(byte[] paramArrayOfByte)
    {
      AppMethodBeat.i(19011);
      this.kJk = Arrays.copyOf(paramArrayOfByte, paramArrayOfByte.length);
      AppMethodBeat.o(19011);
      return this;
    }

    public final a bia()
    {
      AppMethodBeat.i(19007);
      a locala = new a((byte)0);
      a.a(locala, this.kJd);
      a.b(locala, this.kJe);
      a.c(locala, this.kJf);
      a.d(locala, this.kJg);
      a.a(locala, new ArrayList(this.kJh));
      a.b(locala, new ArrayList(this.kJi));
      a.a(locala, this.kJj);
      a.b(locala, this.kJk);
      a.a(locala, this.kJn);
      a.c(locala, new ArrayList(this.kJD));
      a.d(locala, new ArrayList(this.kJE));
      a.a(locala, this.kJo);
      a.a(locala, this.kJp);
      AppMethodBeat.o(19007);
      return locala;
    }
  }

  public static abstract interface b
  {
    public abstract void F(long paramLong1, long paramLong2);

    public abstract void R(int paramInt1, int paramInt2, int paramInt3);

    public abstract void onCanceled();

    public abstract void onFailure();

    public abstract void onSuccess();
  }

  public static abstract interface c
  {
    public abstract Collection<byte[]> bhN();

    public abstract Collection<byte[]> bhO();
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.dbbackup.a.a
 * JD-Core Version:    0.6.2
 */