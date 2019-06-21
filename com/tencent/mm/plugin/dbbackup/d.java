package com.tencent.mm.plugin.dbbackup;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.PowerManager;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.at.o;
import com.tencent.mm.cd.f;
import com.tencent.mm.cd.h.d;
import com.tencent.mm.compatible.e.q;
import com.tencent.mm.model.at;
import com.tencent.mm.model.aw;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.e.k.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.be;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.MMAppMgr;
import com.tencent.wcdb.database.SQLiteCipherSpec;
import com.tencent.wcdb.database.SQLiteDatabase;
import com.tencent.wcdb.database.SQLiteDirectCursor;
import com.tencent.wcdb.repair.BackupKit;
import com.tencent.wcdb.repair.RecoverKit;
import com.tencent.wcdb.repair.RepairKit;
import com.tencent.wcdb.repair.RepairKit.MasterInfo;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;

public final class d
  implements at
{
  private static final SQLiteCipherSpec kIB;
  private boolean jZS;
  private boolean jZT;
  private BroadcastReceiver jZU;
  private Runnable jZV;
  private com.tencent.mm.sdk.b.c kIA;
  private volatile BackupKit kIn;
  private volatile RecoverKit kIo;
  private volatile RepairKit kIp;
  private volatile boolean kIq;
  private boolean kIr;
  private boolean kIs;
  private long kIt;
  private long kIu;
  private long kIv;
  private int kIw;
  private boolean kIx;
  final SimpleDateFormat kIy;
  private k.a kIz;

  static
  {
    AppMethodBeat.i(19001);
    kIB = new SQLiteCipherSpec().setPageSize(1024).setSQLCipherVersion(1);
    AppMethodBeat.o(19001);
  }

  public d()
  {
    AppMethodBeat.i(18982);
    this.kIq = false;
    this.kIr = false;
    this.kIs = false;
    this.kIt = 0L;
    this.kIu = 600000L;
    this.jZS = false;
    this.jZT = true;
    this.kIv = 0L;
    this.kIw = 10;
    this.kIx = false;
    this.kIy = new SimpleDateFormat("HH:mm:ss.SSS");
    AppMethodBeat.o(18982);
  }

  // ERROR //
  private static long[] Ie(String paramString)
  {
    // Byte code:
    //   0: lconst_0
    //   1: lstore_1
    //   2: sipush 18984
    //   5: invokestatic 45	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   8: new 103	java/io/BufferedReader
    //   11: astore_3
    //   12: new 105	com/tencent/mm/vfs/g
    //   15: astore 4
    //   17: new 107	java/lang/StringBuilder
    //   20: astore 5
    //   22: aload 5
    //   24: invokespecial 108	java/lang/StringBuilder:<init>	()V
    //   27: aload 4
    //   29: aload 5
    //   31: aload_0
    //   32: invokevirtual 112	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   35: ldc 114
    //   37: invokevirtual 112	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   40: invokevirtual 118	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   43: invokespecial 119	com/tencent/mm/vfs/g:<init>	(Ljava/lang/String;)V
    //   46: aload_3
    //   47: aload 4
    //   49: invokespecial 122	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   52: aload_3
    //   53: astore 4
    //   55: aload_3
    //   56: invokevirtual 125	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   59: astore 5
    //   61: aload 5
    //   63: ifnull +229 -> 292
    //   66: aload_3
    //   67: astore 4
    //   69: aload 5
    //   71: invokestatic 131	java/lang/Long:parseLong	(Ljava/lang/String;)J
    //   74: lstore 6
    //   76: aload_3
    //   77: astore 4
    //   79: aload_3
    //   80: invokevirtual 125	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   83: astore 5
    //   85: aload 5
    //   87: ifnull +199 -> 286
    //   90: aload_3
    //   91: astore 4
    //   93: aload 5
    //   95: invokestatic 131	java/lang/Long:parseLong	(Ljava/lang/String;)J
    //   98: lstore 8
    //   100: aload_3
    //   101: astore 4
    //   103: aload_3
    //   104: invokevirtual 125	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   107: astore 5
    //   109: aload 5
    //   111: ifnull +169 -> 280
    //   114: aload_3
    //   115: astore 4
    //   117: aload 5
    //   119: invokestatic 131	java/lang/Long:parseLong	(Ljava/lang/String;)J
    //   122: lstore 10
    //   124: aload_3
    //   125: astore 4
    //   127: aload_3
    //   128: invokevirtual 125	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   131: astore 5
    //   133: aload 5
    //   135: ifnull +12 -> 147
    //   138: aload_3
    //   139: astore 4
    //   141: aload 5
    //   143: invokestatic 131	java/lang/Long:parseLong	(Ljava/lang/String;)J
    //   146: lstore_1
    //   147: aload_3
    //   148: astore 4
    //   150: iconst_4
    //   151: newarray long
    //   153: astore 5
    //   155: aload 5
    //   157: iconst_0
    //   158: lload 6
    //   160: lastore
    //   161: aload 5
    //   163: iconst_1
    //   164: lload 8
    //   166: lastore
    //   167: aload 5
    //   169: iconst_2
    //   170: lload 10
    //   172: lastore
    //   173: aload 5
    //   175: iconst_3
    //   176: lload_1
    //   177: lastore
    //   178: aload_3
    //   179: invokevirtual 134	java/io/BufferedReader:close	()V
    //   182: sipush 18984
    //   185: invokestatic 62	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   188: aload 5
    //   190: astore_0
    //   191: aload_0
    //   192: areturn
    //   193: astore 5
    //   195: aconst_null
    //   196: astore_3
    //   197: aload_3
    //   198: astore 4
    //   200: ldc 136
    //   202: aload 5
    //   204: ldc 138
    //   206: iconst_1
    //   207: anewarray 4	java/lang/Object
    //   210: dup
    //   211: iconst_0
    //   212: aload_0
    //   213: aastore
    //   214: invokestatic 144	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   217: aload_3
    //   218: ifnull +7 -> 225
    //   221: aload_3
    //   222: invokevirtual 134	java/io/BufferedReader:close	()V
    //   225: sipush 18984
    //   228: invokestatic 62	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   231: aconst_null
    //   232: astore_0
    //   233: goto -42 -> 191
    //   236: astore_0
    //   237: aconst_null
    //   238: astore 4
    //   240: aload 4
    //   242: ifnull +8 -> 250
    //   245: aload 4
    //   247: invokevirtual 134	java/io/BufferedReader:close	()V
    //   250: sipush 18984
    //   253: invokestatic 62	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   256: aload_0
    //   257: athrow
    //   258: astore_0
    //   259: goto -77 -> 182
    //   262: astore_0
    //   263: goto -38 -> 225
    //   266: astore 4
    //   268: goto -18 -> 250
    //   271: astore_0
    //   272: goto -32 -> 240
    //   275: astore 5
    //   277: goto -80 -> 197
    //   280: lconst_0
    //   281: lstore 10
    //   283: goto -159 -> 124
    //   286: lconst_0
    //   287: lstore 8
    //   289: goto -189 -> 100
    //   292: lconst_0
    //   293: lstore 6
    //   295: goto -219 -> 76
    //
    // Exception table:
    //   from	to	target	type
    //   8	52	193	java/lang/Exception
    //   8	52	236	finally
    //   178	182	258	java/io/IOException
    //   221	225	262	java/io/IOException
    //   245	250	266	java/io/IOException
    //   55	61	271	finally
    //   69	76	271	finally
    //   79	85	271	finally
    //   93	100	271	finally
    //   103	109	271	finally
    //   117	124	271	finally
    //   127	133	271	finally
    //   141	147	271	finally
    //   150	155	271	finally
    //   200	217	271	finally
    //   55	61	275	java/lang/Exception
    //   69	76	275	java/lang/Exception
    //   79	85	275	java/lang/Exception
    //   93	100	275	java/lang/Exception
    //   103	109	275	java/lang/Exception
    //   117	124	275	java/lang/Exception
    //   127	133	275	java/lang/Exception
    //   141	147	275	java/lang/Exception
    //   150	155	275	java/lang/Exception
  }

  // ERROR //
  private static boolean a(String paramString, long[] paramArrayOfLong)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_2
    //   2: sipush 18985
    //   5: invokestatic 45	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   8: new 164	com/tencent/mm/vfs/h
    //   11: astore_3
    //   12: new 107	java/lang/StringBuilder
    //   15: astore 4
    //   17: aload 4
    //   19: invokespecial 108	java/lang/StringBuilder:<init>	()V
    //   22: aload_3
    //   23: aload 4
    //   25: aload_0
    //   26: invokevirtual 112	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   29: ldc 114
    //   31: invokevirtual 112	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   34: invokevirtual 118	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   37: invokespecial 165	com/tencent/mm/vfs/h:<init>	(Ljava/lang/String;)V
    //   40: aload_3
    //   41: astore 4
    //   43: aload_1
    //   44: arraylength
    //   45: istore 5
    //   47: iconst_0
    //   48: istore 6
    //   50: iload 6
    //   52: iload 5
    //   54: if_icmpge +56 -> 110
    //   57: aload_1
    //   58: iload 6
    //   60: laload
    //   61: lstore 7
    //   63: aload_3
    //   64: astore 4
    //   66: new 107	java/lang/StringBuilder
    //   69: astore 9
    //   71: aload_3
    //   72: astore 4
    //   74: aload 9
    //   76: invokespecial 108	java/lang/StringBuilder:<init>	()V
    //   79: aload_3
    //   80: astore 4
    //   82: aload_3
    //   83: aload 9
    //   85: lload 7
    //   87: invokestatic 168	java/lang/Long:toString	(J)Ljava/lang/String;
    //   90: invokevirtual 112	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   93: ldc 170
    //   95: invokevirtual 112	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   98: invokevirtual 118	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   101: invokevirtual 173	com/tencent/mm/vfs/h:write	(Ljava/lang/String;)V
    //   104: iinc 6 1
    //   107: goto -57 -> 50
    //   110: aload_3
    //   111: invokevirtual 174	com/tencent/mm/vfs/h:close	()V
    //   114: sipush 18985
    //   117: invokestatic 62	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   120: iload_2
    //   121: ireturn
    //   122: astore 9
    //   124: aconst_null
    //   125: astore_1
    //   126: aload_1
    //   127: astore 4
    //   129: ldc 136
    //   131: aload 9
    //   133: ldc 176
    //   135: iconst_1
    //   136: anewarray 4	java/lang/Object
    //   139: dup
    //   140: iconst_0
    //   141: aload_0
    //   142: aastore
    //   143: invokestatic 144	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   146: aload_1
    //   147: ifnull +7 -> 154
    //   150: aload_1
    //   151: invokevirtual 174	com/tencent/mm/vfs/h:close	()V
    //   154: sipush 18985
    //   157: invokestatic 62	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   160: iconst_0
    //   161: istore_2
    //   162: goto -42 -> 120
    //   165: astore_0
    //   166: aconst_null
    //   167: astore 4
    //   169: aload 4
    //   171: ifnull +8 -> 179
    //   174: aload 4
    //   176: invokevirtual 174	com/tencent/mm/vfs/h:close	()V
    //   179: sipush 18985
    //   182: invokestatic 62	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   185: aload_0
    //   186: athrow
    //   187: astore_0
    //   188: goto -74 -> 114
    //   191: astore_0
    //   192: goto -38 -> 154
    //   195: astore_1
    //   196: goto -17 -> 179
    //   199: astore_0
    //   200: goto -31 -> 169
    //   203: astore 9
    //   205: aload_3
    //   206: astore_1
    //   207: goto -81 -> 126
    //
    // Exception table:
    //   from	to	target	type
    //   8	40	122	java/io/IOException
    //   8	40	165	finally
    //   110	114	187	java/io/IOException
    //   150	154	191	java/io/IOException
    //   174	179	195	java/io/IOException
    //   43	47	199	finally
    //   66	71	199	finally
    //   74	79	199	finally
    //   82	104	199	finally
    //   129	146	199	finally
    //   43	47	203	java/io/IOException
    //   66	71	203	java/io/IOException
    //   74	79	203	java/io/IOException
    //   82	104	203	java/io/IOException
  }

  private static long[] a(SQLiteDatabase paramSQLiteDatabase)
  {
    long l1 = -1L;
    AppMethodBeat.i(18983);
    com.tencent.wcdb.Cursor localCursor = paramSQLiteDatabase.rawQueryWithFactory(SQLiteDirectCursor.FACTORY, "SELECT max(msgId) FROM message;", null, null);
    if (localCursor.moveToFirst());
    for (long l2 = localCursor.getLong(0); ; l2 = -1L)
    {
      localCursor.close();
      localCursor = paramSQLiteDatabase.rawQueryWithFactory(SQLiteDirectCursor.FACTORY, "SELECT max(id) FROM ImgInfo2;", null, null);
      if (localCursor.moveToFirst());
      for (long l3 = localCursor.getLong(0); ; l3 = -1L)
      {
        localCursor.close();
        localCursor = paramSQLiteDatabase.rawQueryWithFactory(SQLiteDirectCursor.FACTORY, "SELECT max(rowid) FROM videoinfo2;", null, null);
        if (localCursor.moveToFirst());
        for (long l4 = localCursor.getLong(0); ; l4 = -1L)
        {
          localCursor.close();
          paramSQLiteDatabase = paramSQLiteDatabase.rawQueryWithFactory(SQLiteDirectCursor.FACTORY, "SELECT max(rowid) FROM EmojiInfo;", null, null);
          if (paramSQLiteDatabase.moveToFirst())
            l1 = paramSQLiteDatabase.getLong(0);
          paramSQLiteDatabase.close();
          AppMethodBeat.o(18983);
          return new long[] { l2, l3, l4, l1 };
        }
      }
    }
  }

  private static String[] a(long[] paramArrayOfLong1, long[] paramArrayOfLong2)
  {
    AppMethodBeat.i(18986);
    String[] arrayOfString;
    if ((paramArrayOfLong2 != null) && (paramArrayOfLong2.length >= 4))
    {
      arrayOfString = new String[12];
      arrayOfString[0] = "message";
      arrayOfString[1] = String.format("msgId > %d AND msgId <= %d", new Object[] { Long.valueOf(paramArrayOfLong2[0]), Long.valueOf(paramArrayOfLong1[0]) });
      arrayOfString[2] = "ImgInfo2";
      arrayOfString[3] = String.format("id > %d AND id <= %d", new Object[] { Long.valueOf(paramArrayOfLong2[1]), Long.valueOf(paramArrayOfLong1[1]) });
      arrayOfString[4] = "videoinfo2";
      arrayOfString[5] = String.format("rowid > %d AND rowid <= %d", new Object[] { Long.valueOf(paramArrayOfLong2[2]), Long.valueOf(paramArrayOfLong1[2]) });
      arrayOfString[6] = "EmojiInfo";
      arrayOfString[7] = String.format("rowid > %d AND rowid <= %d", new Object[] { Long.valueOf(paramArrayOfLong2[3]), Long.valueOf(paramArrayOfLong1[3]) });
      arrayOfString[8] = "conversation";
      arrayOfString[9] = null;
      arrayOfString[10] = "rconversation";
      arrayOfString[11] = null;
      AppMethodBeat.o(18986);
    }
    for (paramArrayOfLong1 = arrayOfString; ; paramArrayOfLong1 = paramArrayOfLong2)
    {
      return paramArrayOfLong1;
      paramArrayOfLong2 = new String[12];
      paramArrayOfLong2[0] = "message";
      paramArrayOfLong2[1] = ("msgId <= " + paramArrayOfLong1[0]);
      paramArrayOfLong2[2] = "ImgInfo2";
      paramArrayOfLong2[3] = ("id <= " + paramArrayOfLong1[1]);
      paramArrayOfLong2[4] = "videoinfo2";
      paramArrayOfLong2[5] = ("rowid <= " + paramArrayOfLong1[2]);
      paramArrayOfLong2[6] = "EmojiInfo";
      paramArrayOfLong2[7] = ("rowid <= " + paramArrayOfLong1[3]);
      paramArrayOfLong2[8] = "conversation";
      paramArrayOfLong2[9] = null;
      paramArrayOfLong2[10] = "rconversation";
      paramArrayOfLong2[11] = null;
      AppMethodBeat.o(18986);
    }
  }

  private static boolean b(SQLiteDatabase paramSQLiteDatabase)
  {
    AppMethodBeat.i(18987);
    Object localObject1 = paramSQLiteDatabase.getPath();
    Object localObject2 = (String)localObject1 + ".sm";
    String str = (String)localObject2 + ".tmp";
    localObject1 = com.tencent.mm.kernel.g.RP().Ry();
    long l1 = ((z)localObject1).Mm(237569);
    long l2 = System.currentTimeMillis();
    localObject2 = new com.tencent.mm.vfs.b((String)localObject2);
    if ((((com.tencent.mm.vfs.b)localObject2).exists()) && (l2 - l1 < 86400000L))
    {
      AppMethodBeat.o(18987);
      bool = true;
      return bool;
    }
    l1 = System.nanoTime();
    StringBuilder localStringBuilder = new StringBuilder().append(q.LK());
    aw.ZK();
    boolean bool = RepairKit.MasterInfo.save(paramSQLiteDatabase, str, com.tencent.mm.a.g.y(com.tencent.mm.model.c.QF().getBytes()));
    paramSQLiteDatabase = new com.tencent.mm.vfs.b(str);
    if (bool)
    {
      ((com.tencent.mm.vfs.b)localObject2).delete();
      bool = paramSQLiteDatabase.o((com.tencent.mm.vfs.b)localObject2);
      ((z)localObject1).setLong(237569, l2);
      ((z)localObject1).dsb();
      label201: l2 = System.nanoTime();
      if (!bool)
        break label289;
      paramSQLiteDatabase = "SUCCEEDED";
      label215: ab.i("MicroMsg.SubCoreDBBackup", "Master table backup %s, elapsed %.3f", new Object[] { paramSQLiteDatabase, Float.valueOf((float)(l2 - l1) / 1.0E+009F) });
      paramSQLiteDatabase = com.tencent.mm.plugin.report.service.h.pYm;
      if (!bool)
        break label296;
    }
    label289: label296: for (l1 = 24L; ; l1 = 25L)
    {
      paramSQLiteDatabase.a(181L, l1, 1L, false);
      AppMethodBeat.o(18987);
      break;
      paramSQLiteDatabase.delete();
      break label201;
      paramSQLiteDatabase = "FAILED";
      break label215;
    }
  }

  private static void bhQ()
  {
    AppMethodBeat.i(18995);
    Object localObject = com.tencent.mm.model.c.c.abi().ll("100274");
    if (((com.tencent.mm.storage.c)localObject).isValid())
    {
      Map localMap = ((com.tencent.mm.storage.c)localObject).dru();
      localObject = new HashMap();
      ((Map)localObject).put("flags", Integer.valueOf(bo.getInt((String)localMap.get("flags"), 0)));
      ((Map)localObject).put("acp", Integer.valueOf(bo.getInt((String)localMap.get("acp"), 100)));
      f.aV((Map)localObject);
    }
    AppMethodBeat.o(18995);
  }

  static void bhR()
  {
    AppMethodBeat.i(18996);
    Object localObject = com.tencent.mm.model.c.XO();
    ((com.tencent.mm.plugin.messenger.foundation.a.a.h)localObject).bOz();
    ((com.tencent.mm.plugin.messenger.foundation.a.a.h)localObject).bOB();
    ((com.tencent.mm.plugin.messenger.foundation.a.a.h)localObject).bOA();
    com.tencent.mm.model.c.XR().dsL();
    o.ahl().agT();
    localObject = com.tencent.mm.model.c.Ry();
    ((z)localObject).set(ac.a.xJw, Integer.valueOf(0));
    ((z)localObject).set(ac.a.xJx, Integer.valueOf(0));
    ((z)localObject).set(ac.a.xJy, Integer.valueOf(0));
    AppMethodBeat.o(18996);
  }

  public static void bhS()
  {
    AppMethodBeat.i(18998);
    MMAppMgr.pQ(true);
    AppMethodBeat.o(18998);
  }

  public static void dB(Context paramContext)
  {
    AppMethodBeat.i(18997);
    MMAppMgr.k(paramContext, true);
    AppMethodBeat.o(18997);
  }

  public final HashMap<Integer, h.d> Jx()
  {
    return null;
  }

  @Deprecated
  public final int a(b paramb)
  {
    int i = -3;
    AppMethodBeat.i(18992);
    aw.ZK();
    Object localObject1 = com.tencent.mm.model.c.Rs();
    if ((localObject1 == null) || (((String)localObject1).isEmpty()))
      AppMethodBeat.o(18992);
    while (true)
    {
      return i;
      localObject1 = new com.tencent.mm.vfs.b((String)localObject1);
      if (!((com.tencent.mm.vfs.b)localObject1).canRead())
      {
        AppMethodBeat.o(18992);
      }
      else
      {
        Object localObject2 = new StringBuilder().append(q.LK());
        aw.ZK();
        localObject2 = com.tencent.mm.a.g.x(com.tencent.mm.model.c.QF().getBytes()).substring(0, 7);
        long l1 = ((com.tencent.mm.vfs.b)localObject1).length() * 2L;
        long l2 = bo.dpD();
        ab.i("MicroMsg.SubCoreDBBackup", "db recover needSize : %d blockSize:%d", new Object[] { Long.valueOf(l1), Long.valueOf(l2) });
        if (l2 < l1)
        {
          i = -2;
          AppMethodBeat.o(18992);
        }
        else
        {
          aw.RS().Bn();
          aw.RS().ae(new d.4(this, (com.tencent.mm.vfs.b)localObject1, (String)localObject2, paramb));
          AppMethodBeat.o(18992);
          i = 0;
        }
      }
    }
  }

  @Deprecated
  public final int a(String paramString, b paramb)
  {
    try
    {
      AppMethodBeat.i(18990);
      com.tencent.mm.model.c localc = aw.ZK();
      long l = bo.dpD();
      d.2 local2 = new com/tencent/mm/plugin/dbbackup/d$2;
      local2.<init>(this, localc, paramString, l, paramb);
      this.kIq = true;
      aw.RS().Bn();
      aw.RS().ae(local2);
      AppMethodBeat.o(18990);
      return 0;
    }
    finally
    {
      paramString = finally;
    }
    throw paramString;
  }

  public final boolean a(boolean paramBoolean, b paramb)
  {
    AppMethodBeat.i(18988);
    if (this.kIq)
    {
      ab.i("MicroMsg.SubCoreDBBackup", "Backup or recover task is in progress, %s canceled", new Object[] { "backup" });
      paramBoolean = false;
      AppMethodBeat.o(18988);
      return paramBoolean;
    }
    com.tencent.mm.model.c localc = aw.ZK();
    String str1 = com.tencent.mm.model.c.Rw();
    SQLiteDatabase localSQLiteDatabase = com.tencent.mm.model.c.Ru().dvx();
    String str2 = str1 + ".bak";
    String str3 = str2 + ".tmp";
    String str4 = str1 + ".sm";
    String str5 = str4 + ".tmp";
    int i = 8;
    int j = i;
    boolean bool = paramBoolean;
    label188: long[] arrayOfLong1;
    long[] arrayOfLong2;
    label207: String[] arrayOfString;
    if (paramBoolean)
    {
      if (com.tencent.mm.vfs.e.ct(str2))
      {
        j = 24;
        com.tencent.mm.vfs.e.y(str2, str3);
        bool = paramBoolean;
      }
    }
    else
    {
      arrayOfLong1 = a(localSQLiteDatabase);
      if (!bool)
        break label303;
      arrayOfLong2 = Ie(str1);
      arrayOfString = a(arrayOfLong1, arrayOfLong2);
      if (arrayOfLong2 != null)
        break label312;
      bool = false;
    }
    label303: label312: 
    while (true)
    {
      if (this.kIx)
        j |= 3;
      while (true)
      {
        paramb = new d.1(this, paramb, localc, str4, bool, localSQLiteDatabase, str5, str1, str3, arrayOfLong2, arrayOfLong1, j, arrayOfString, str2);
        this.kIq = true;
        com.tencent.mm.sdk.g.d.post(paramb, "DB Backup");
        paramBoolean = true;
        AppMethodBeat.o(18988);
        break;
        bool = false;
        j = i;
        break label188;
        arrayOfLong2 = null;
        break label207;
      }
    }
  }

  @Deprecated
  public final int b(String paramString, b paramb)
  {
    int i = 0;
    while (true)
    {
      com.tencent.mm.model.c localc;
      String str;
      long l;
      try
      {
        AppMethodBeat.i(18991);
        localc = aw.ZK();
        str = paramString;
        if (paramString == null)
          str = com.tencent.mm.model.c.Rs();
        l = bo.dpD();
        if (str == null)
        {
          paramString = null;
          if ((paramString == null) || (!paramString.canRead()))
          {
            i = -3;
            AppMethodBeat.o(18991);
            return i;
          }
        }
        else
        {
          paramString = new com.tencent.mm.vfs.b(str);
          continue;
        }
      }
      finally
      {
      }
      ab.i("MicroMsg.SubCoreDBBackup", "[Repair] inFileSize: %d, diskFreeSpace: %d", new Object[] { Long.valueOf(paramString.length()), Long.valueOf(l) });
      if ((float)l < (float)paramString.length() * 1.5F)
      {
        i = -2;
        AppMethodBeat.o(18991);
      }
      else
      {
        paramString = new com/tencent/mm/plugin/dbbackup/d$3;
        paramString.<init>(this, localc, str, paramb);
        this.kIq = true;
        aw.RS().Bn();
        aw.RS().ae(paramString);
        AppMethodBeat.o(18991);
      }
    }
  }

  public final void bA(boolean paramBoolean)
  {
  }

  public final boolean bhP()
  {
    boolean bool = false;
    try
    {
      AppMethodBeat.i(18989);
      this.kIq = false;
      if (this.kIn == null)
        AppMethodBeat.o(18989);
      while (true)
      {
        return bool;
        this.kIn.onCancel();
        bool = true;
        AppMethodBeat.o(18989);
      }
    }
    finally
    {
    }
  }

  public final void bz(boolean paramBoolean)
  {
    AppMethodBeat.i(18993);
    aw.ZK();
    Object localObject1 = com.tencent.mm.model.c.Ry();
    SQLiteDatabase localSQLiteDatabase = com.tencent.mm.model.c.Ru().dvx();
    this.kIv = ((z)localObject1).Mm(237569);
    this.kIw = ((z)localObject1).getInt(237570, 10);
    Object localObject2;
    if (((z)localObject1).getInt(237571, 0) != 0)
    {
      paramBoolean = true;
      this.kIx = paramBoolean;
      localObject1 = ah.getContext();
      localObject2 = ((Context)localObject1).registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
      if (localObject2 == null)
        break label557;
      int i = ((Intent)localObject2).getIntExtra("status", -1);
      if ((i != 2) && (i != 5))
        break label552;
      paramBoolean = true;
      label114: this.jZS = paramBoolean;
      label119: this.jZT = ((PowerManager)((Context)localObject1).getSystemService("power")).isScreenOn();
      this.kIz = new d.7(this);
      com.tencent.mm.model.c.c.abi().c(this.kIz);
      bhQ();
      this.kIA = new d.8(this);
      a.xxA.c(this.kIA);
      this.jZU = new d.9(this);
      localObject2 = new IntentFilter();
      ((IntentFilter)localObject2).addAction("android.intent.action.SCREEN_ON");
      ((IntentFilter)localObject2).addAction("android.intent.action.SCREEN_OFF");
      ((IntentFilter)localObject2).addAction("android.intent.action.ACTION_POWER_CONNECTED");
      ((IntentFilter)localObject2).addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
      ((Context)localObject1).registerReceiver(this.jZU, (IntentFilter)localObject2);
      com.tencent.mm.pluginsdk.cmd.b.a(new c(this), new String[] { "//recover-old", "//recover", "//post-recover", "//backupdb", "//recoverdb", "//repairdb", "//corruptdb", "//iotracedb", "//recover-status", "//dbbusy" });
      if (!this.kIs)
        break label565;
      localObject1 = "enabled";
      label339: if (!this.jZT)
        break label572;
      localObject2 = "";
      label351: if (!this.jZS)
        break label580;
    }
    label552: label557: label565: label572: label580: for (String str = ""; ; str = " not")
    {
      ab.i("MicroMsg.SubCoreDBBackup", "Auto database backup %s. Device status:%s interactive,%s charging.", new Object[] { localObject1, localObject2, str });
      b(localSQLiteDatabase);
      com.tencent.mm.plugin.dbbackup.a.b.Ii(q.LK());
      com.tencent.mm.vfs.e.deleteFile(com.tencent.mm.kernel.g.RP().eJM + "dbback/EnMicroMsg.db.bak");
      com.tencent.mm.vfs.e.deleteFile(com.tencent.mm.kernel.g.RP().eJM + "dbback/corrupted/EnMicroMsg.db.bak");
      com.tencent.mm.vfs.e.deleteFile(com.tencent.mm.kernel.g.RP().cachePath + "EnMicroMsg.db.bak");
      com.tencent.mm.vfs.e.deleteFile(com.tencent.mm.kernel.g.RP().cachePath + "corrupted/EnMicroMsg.db.bak");
      localObject1 = com.tencent.mm.model.c.Rt();
      aw.RS().m(new d.6(this, (String)localObject1), 60000L);
      AppMethodBeat.o(18993);
      return;
      paramBoolean = false;
      break;
      paramBoolean = false;
      break label114;
      this.jZS = false;
      break label119;
      localObject1 = "disabled";
      break label339;
      localObject2 = " not";
      break label351;
    }
  }

  public final void iy(int paramInt)
  {
  }

  public final void onAccountRelease()
  {
    AppMethodBeat.i(18994);
    bhP();
    this.kIr = false;
    if (this.jZV != null)
    {
      aw.RS().doN().removeCallbacks(this.jZV);
      this.jZV = null;
    }
    if (this.kIA != null)
    {
      a.xxA.d(this.kIA);
      this.kIA = null;
    }
    if (this.jZU != null)
    {
      ah.getContext().unregisterReceiver(this.jZU);
      this.jZU = null;
    }
    com.tencent.mm.pluginsdk.cmd.b.N(new String[] { "//recover-old", "//recover", "//post-recover", "//backupdb", "//recoverdb", "//repairdb", "//corruptdb", "//iotracedb", "//recover-status", "//dbbusy" });
    AppMethodBeat.o(18994);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.dbbackup.d
 * JD-Core Version:    0.6.2
 */