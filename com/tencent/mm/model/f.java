package com.tencent.mm.model;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.graphics.Bitmap;
import android.os.Looper;
import android.util.Base64;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.e.a;
import com.tencent.mm.ai.e.b;
import com.tencent.mm.ai.e.d;
import com.tencent.mm.ai.p;
import com.tencent.mm.api.m;
import com.tencent.mm.g.a.ij;
import com.tencent.mm.g.a.ja;
import com.tencent.mm.g.a.ni;
import com.tencent.mm.g.a.pe;
import com.tencent.mm.g.c.at;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.platformtools.ai;
import com.tencent.mm.platformtools.ai.c;
import com.tencent.mm.plugin.messenger.foundation.a.a.i;
import com.tencent.mm.plugin.messenger.foundation.a.a.j.a;
import com.tencent.mm.pointers.PByteArray;
import com.tencent.mm.protocal.MMProtocalJni;
import com.tencent.mm.protocal.protobuf.axf;
import com.tencent.mm.protocal.protobuf.bfl;
import com.tencent.mm.protocal.protobuf.bfm;
import com.tencent.mm.protocal.protobuf.bfn;
import com.tencent.mm.protocal.protobuf.cm;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.br;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.bb;
import com.tencent.mm.storage.bi;
import java.io.ByteArrayOutputStream;
import java.net.URLDecoder;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public final class f
  implements com.tencent.mm.plugin.messenger.foundation.a.n
{
  private long fky = -1L;
  public f.a fkz;

  private static void Ys()
  {
    AppMethodBeat.i(16266);
    List localList = com.tencent.mm.m.g.Nu().kC("^JDEntranceConfigName$");
    ab.i("MicroMsg.BigBallSysCmdMsgConsumer", "jd config name %s", new Object[] { localList });
    if (localList.isEmpty())
      com.tencent.mm.plugin.report.service.h.pYm.k(931L, 6L, 1L);
    label98: label251: 
    while (true)
    {
      localList = com.tencent.mm.m.g.Nu().kC("^JDEntranceConfigIconUrl$");
      ab.i("MicroMsg.BigBallSysCmdMsgConsumer", "jd icon url %s", new Object[] { localList });
      if (localList.isEmpty())
      {
        com.tencent.mm.plugin.report.service.h.pYm.k(931L, 7L, 1L);
        localList = com.tencent.mm.m.g.Nu().kC("^JDEntranceConfigJumpUrl$");
        ab.i("MicroMsg.BigBallSysCmdMsgConsumer", "jd jump url %s", new Object[] { localList });
        if (!localList.isEmpty())
          break label215;
        com.tencent.mm.plugin.report.service.h.pYm.k(931L, 8L, 1L);
        AppMethodBeat.o(16266);
      }
      while (true)
      {
        return;
        if (!bo.isNullOrNil((String)localList.get(0)))
          break label251;
        com.tencent.mm.plugin.report.service.h.pYm.k(931L, 9L, 1L);
        break;
        if (!bo.isNullOrNil((String)localList.get(0)))
          break label98;
        com.tencent.mm.plugin.report.service.h.pYm.k(931L, 10L, 1L);
        break label98;
        if (bo.isNullOrNil((String)localList.get(0)))
          com.tencent.mm.plugin.report.service.h.pYm.k(931L, 11L, 1L);
        AppMethodBeat.o(16266);
      }
    }
  }

  // ERROR //
  private static String f(String paramString, long paramLong1, long paramLong2)
  {
    // Byte code:
    //   0: sipush 16268
    //   3: invokestatic 28	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: aload_0
    //   7: ldc 112
    //   9: invokevirtual 115	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   12: ifeq +75 -> 87
    //   15: invokestatic 121	com/tencent/mm/sdk/platformtools/ah:getContext	()Landroid/content/Context;
    //   18: invokevirtual 127	android/content/Context:getApplicationInfo	()Landroid/content/pm/ApplicationInfo;
    //   21: getfield 133	android/content/pm/ApplicationInfo:sourceDir	Ljava/lang/String;
    //   24: astore 5
    //   26: new 135	java/util/zip/ZipFile
    //   29: astore 6
    //   31: aload 6
    //   33: aload 5
    //   35: invokespecial 138	java/util/zip/ZipFile:<init>	(Ljava/lang/String;)V
    //   38: aload 6
    //   40: aload 6
    //   42: aload_0
    //   43: iconst_1
    //   44: invokevirtual 142	java/lang/String:substring	(I)Ljava/lang/String;
    //   47: invokevirtual 146	java/util/zip/ZipFile:getEntry	(Ljava/lang/String;)Ljava/util/zip/ZipEntry;
    //   50: invokevirtual 150	java/util/zip/ZipFile:getInputStream	(Ljava/util/zip/ZipEntry;)Ljava/io/InputStream;
    //   53: astore 5
    //   55: aload 6
    //   57: astore_0
    //   58: lload_1
    //   59: lconst_0
    //   60: lcmp
    //   61: ifle +37 -> 98
    //   64: aload_0
    //   65: astore 7
    //   67: aload 5
    //   69: astore 6
    //   71: aload 5
    //   73: lload_1
    //   74: invokevirtual 156	java/io/InputStream:skip	(J)J
    //   77: lstore 8
    //   79: lload_1
    //   80: lload 8
    //   82: lsub
    //   83: lstore_1
    //   84: goto -26 -> 58
    //   87: aload_0
    //   88: invokestatic 162	com/tencent/mm/vfs/e:openRead	(Ljava/lang/String;)Ljava/io/InputStream;
    //   91: astore 5
    //   93: aconst_null
    //   94: astore_0
    //   95: goto -37 -> 58
    //   98: aload_0
    //   99: astore 7
    //   101: aload 5
    //   103: astore 6
    //   105: ldc 164
    //   107: invokestatic 170	java/security/MessageDigest:getInstance	(Ljava/lang/String;)Ljava/security/MessageDigest;
    //   110: astore 10
    //   112: aload_0
    //   113: astore 7
    //   115: aload 5
    //   117: astore 6
    //   119: sipush 2048
    //   122: newarray byte
    //   124: astore 11
    //   126: lload_3
    //   127: lconst_0
    //   128: lcmp
    //   129: ifle +60 -> 189
    //   132: aload_0
    //   133: astore 7
    //   135: aload 5
    //   137: astore 6
    //   139: aload 5
    //   141: aload 11
    //   143: iconst_0
    //   144: ldc2_w 171
    //   147: lload_3
    //   148: invokestatic 178	java/lang/Math:min	(JJ)J
    //   151: l2i
    //   152: invokevirtual 182	java/io/InputStream:read	([BII)I
    //   155: istore 12
    //   157: iload 12
    //   159: iconst_m1
    //   160: if_icmpeq +29 -> 189
    //   163: aload_0
    //   164: astore 7
    //   166: aload 5
    //   168: astore 6
    //   170: aload 10
    //   172: aload 11
    //   174: iconst_0
    //   175: iload 12
    //   177: invokevirtual 186	java/security/MessageDigest:update	([BII)V
    //   180: lload_3
    //   181: iload 12
    //   183: i2l
    //   184: lsub
    //   185: lstore_3
    //   186: goto -60 -> 126
    //   189: aload_0
    //   190: astore 7
    //   192: aload 5
    //   194: astore 6
    //   196: aload 10
    //   198: invokevirtual 190	java/security/MessageDigest:digest	()[B
    //   201: invokestatic 194	com/tencent/mm/sdk/platformtools/bo:cd	([B)Ljava/lang/String;
    //   204: astore 11
    //   206: aload 11
    //   208: astore 6
    //   210: aload 5
    //   212: ifnull +8 -> 220
    //   215: aload 5
    //   217: invokevirtual 197	java/io/InputStream:close	()V
    //   220: aload_0
    //   221: ifnull +7 -> 228
    //   224: aload_0
    //   225: invokevirtual 198	java/util/zip/ZipFile:close	()V
    //   228: sipush 16268
    //   231: invokestatic 86	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   234: aload 6
    //   236: areturn
    //   237: astore 11
    //   239: aconst_null
    //   240: astore_0
    //   241: aconst_null
    //   242: astore 5
    //   244: aload_0
    //   245: astore 7
    //   247: aload 5
    //   249: astore 6
    //   251: ldc 44
    //   253: aload 11
    //   255: ldc 200
    //   257: iconst_0
    //   258: anewarray 4	java/lang/Object
    //   261: invokestatic 204	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   264: ldc 200
    //   266: astore 6
    //   268: aload 5
    //   270: ifnull +8 -> 278
    //   273: aload 5
    //   275: invokevirtual 197	java/io/InputStream:close	()V
    //   278: aload_0
    //   279: ifnull +7 -> 286
    //   282: aload_0
    //   283: invokevirtual 198	java/util/zip/ZipFile:close	()V
    //   286: sipush 16268
    //   289: invokestatic 86	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   292: goto -58 -> 234
    //   295: astore_0
    //   296: aconst_null
    //   297: astore 7
    //   299: aconst_null
    //   300: astore 6
    //   302: aload 6
    //   304: ifnull +8 -> 312
    //   307: aload 6
    //   309: invokevirtual 197	java/io/InputStream:close	()V
    //   312: aload 7
    //   314: ifnull +8 -> 322
    //   317: aload 7
    //   319: invokevirtual 198	java/util/zip/ZipFile:close	()V
    //   322: sipush 16268
    //   325: invokestatic 86	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   328: aload_0
    //   329: athrow
    //   330: astore 5
    //   332: goto -112 -> 220
    //   335: astore_0
    //   336: goto -108 -> 228
    //   339: astore 5
    //   341: goto -63 -> 278
    //   344: astore_0
    //   345: goto -59 -> 286
    //   348: astore 5
    //   350: goto -38 -> 312
    //   353: astore 5
    //   355: goto -33 -> 322
    //   358: astore_0
    //   359: aconst_null
    //   360: astore 5
    //   362: aload 6
    //   364: astore 7
    //   366: aload 5
    //   368: astore 6
    //   370: goto -68 -> 302
    //   373: astore_0
    //   374: goto -72 -> 302
    //   377: astore 11
    //   379: aconst_null
    //   380: astore 5
    //   382: aload 6
    //   384: astore_0
    //   385: goto -141 -> 244
    //   388: astore 11
    //   390: goto -146 -> 244
    //
    // Exception table:
    //   from	to	target	type
    //   6	38	237	java/lang/Exception
    //   87	93	237	java/lang/Exception
    //   6	38	295	finally
    //   87	93	295	finally
    //   215	220	330	java/io/IOException
    //   224	228	335	java/io/IOException
    //   273	278	339	java/io/IOException
    //   282	286	344	java/io/IOException
    //   307	312	348	java/io/IOException
    //   317	322	353	java/io/IOException
    //   38	55	358	finally
    //   71	79	373	finally
    //   105	112	373	finally
    //   119	126	373	finally
    //   139	157	373	finally
    //   170	180	373	finally
    //   196	206	373	finally
    //   251	264	373	finally
    //   38	55	377	java/lang/Exception
    //   71	79	388	java/lang/Exception
    //   105	112	388	java/lang/Exception
    //   119	126	388	java/lang/Exception
    //   139	157	388	java/lang/Exception
    //   170	180	388	java/lang/Exception
    //   196	206	388	java/lang/Exception
  }

  private static String h(Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(16270);
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    Object localObject;
    int m;
    try
    {
      int i = paramArrayOfObject.length;
      int j = 0;
      if (j < i)
      {
        localObject = paramArrayOfObject[j];
        if ((localObject instanceof String))
          localByteArrayOutputStream.write(((String)localObject).getBytes());
        while (true)
        {
          j++;
          break;
          if ((localObject instanceof Integer))
          {
            int k = ((Integer)localObject).intValue();
            for (m = 0; m < 4; m++)
            {
              localByteArrayOutputStream.write(k & 0xFF);
              k >>= 8;
            }
          }
          else if ((localObject instanceof Long))
          {
            long l = ((Long)localObject).longValue();
            for (m = 0; m < 8; m++)
            {
              localByteArrayOutputStream.write((int)(0xFF & l));
              l >>= 8;
            }
          }
          else
          {
            if (!(localObject instanceof Boolean))
              break label218;
            if (!((Boolean)localObject).booleanValue())
              break label212;
            m = 1;
            localByteArrayOutputStream.write(m);
          }
        }
      }
    }
    catch (Exception paramArrayOfObject)
    {
      ab.printErrStackTrace("MicroMsg.BigBallSysCmdMsgConsumer", paramArrayOfObject, "", new Object[0]);
      paramArrayOfObject = "";
      AppMethodBeat.o(16270);
    }
    while (true)
    {
      return paramArrayOfObject;
      label212: m = 0;
      break;
      label218: ab.e("MicroMsg.BigBallSysCmdMsgConsumer", "Invalid object class: %s", new Object[] { localObject });
      paramArrayOfObject = "";
      AppMethodBeat.o(16270);
      continue;
      paramArrayOfObject = bo.cd(MessageDigest.getInstance("MD5").digest(localByteArrayOutputStream.toByteArray()));
      AppMethodBeat.o(16270);
    }
  }

  // ERROR //
  private static long mm(String paramString)
  {
    // Byte code:
    //   0: ldc2_w 17
    //   3: lstore_1
    //   4: sipush 16269
    //   7: invokestatic 28	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   10: aload_0
    //   11: ldc 112
    //   13: invokevirtual 115	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   16: ifeq +140 -> 156
    //   19: invokestatic 121	com/tencent/mm/sdk/platformtools/ah:getContext	()Landroid/content/Context;
    //   22: invokevirtual 127	android/content/Context:getApplicationInfo	()Landroid/content/pm/ApplicationInfo;
    //   25: getfield 133	android/content/pm/ApplicationInfo:sourceDir	Ljava/lang/String;
    //   28: astore_3
    //   29: new 135	java/util/zip/ZipFile
    //   32: astore 4
    //   34: aload 4
    //   36: aload_3
    //   37: invokespecial 138	java/util/zip/ZipFile:<init>	(Ljava/lang/String;)V
    //   40: aload 4
    //   42: astore_3
    //   43: aload 4
    //   45: aload_0
    //   46: iconst_1
    //   47: invokevirtual 142	java/lang/String:substring	(I)Ljava/lang/String;
    //   50: invokevirtual 146	java/util/zip/ZipFile:getEntry	(Ljava/lang/String;)Ljava/util/zip/ZipEntry;
    //   53: astore_0
    //   54: aload_0
    //   55: ifnonnull +20 -> 75
    //   58: aload 4
    //   60: invokevirtual 198	java/util/zip/ZipFile:close	()V
    //   63: sipush 16269
    //   66: invokestatic 86	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   69: lload_1
    //   70: lstore 5
    //   72: lload 5
    //   74: lreturn
    //   75: aload 4
    //   77: astore_3
    //   78: aload_0
    //   79: invokevirtual 255	java/util/zip/ZipEntry:getSize	()J
    //   82: lstore 5
    //   84: aload 4
    //   86: invokevirtual 198	java/util/zip/ZipFile:close	()V
    //   89: sipush 16269
    //   92: invokestatic 86	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   95: goto -23 -> 72
    //   98: astore 7
    //   100: aconst_null
    //   101: astore_0
    //   102: aload_0
    //   103: astore_3
    //   104: ldc 44
    //   106: aload 7
    //   108: ldc 200
    //   110: iconst_0
    //   111: anewarray 4	java/lang/Object
    //   114: invokestatic 204	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   117: aload_0
    //   118: ifnull +7 -> 125
    //   121: aload_0
    //   122: invokevirtual 198	java/util/zip/ZipFile:close	()V
    //   125: sipush 16269
    //   128: invokestatic 86	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   131: lload_1
    //   132: lstore 5
    //   134: goto -62 -> 72
    //   137: astore_0
    //   138: aconst_null
    //   139: astore_3
    //   140: aload_3
    //   141: ifnull +7 -> 148
    //   144: aload_3
    //   145: invokevirtual 198	java/util/zip/ZipFile:close	()V
    //   148: sipush 16269
    //   151: invokestatic 86	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   154: aload_0
    //   155: athrow
    //   156: aload_0
    //   157: invokestatic 258	com/tencent/mm/vfs/e:asZ	(Ljava/lang/String;)J
    //   160: lstore 5
    //   162: sipush 16269
    //   165: invokestatic 86	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   168: goto -96 -> 72
    //   171: astore_0
    //   172: goto -109 -> 63
    //   175: astore_0
    //   176: goto -87 -> 89
    //   179: astore_0
    //   180: goto -55 -> 125
    //   183: astore_3
    //   184: goto -36 -> 148
    //   187: astore_0
    //   188: goto -48 -> 140
    //   191: astore 7
    //   193: aload 4
    //   195: astore_0
    //   196: goto -94 -> 102
    //
    // Exception table:
    //   from	to	target	type
    //   19	40	98	java/io/IOException
    //   19	40	137	finally
    //   58	63	171	java/io/IOException
    //   84	89	175	java/io/IOException
    //   121	125	179	java/io/IOException
    //   144	148	183	java/io/IOException
    //   43	54	187	finally
    //   78	84	187	finally
    //   104	117	187	finally
    //   43	54	191	java/io/IOException
    //   78	84	191	java/io/IOException
  }

  public final e.b a(String paramString, Map<String, String> paramMap, e.a parama)
  {
    AppMethodBeat.i(16267);
    Object localObject1 = parama.eAB;
    Object localObject2 = com.tencent.mm.platformtools.aa.a(((cm)localObject1).vED);
    Object localObject3 = null;
    Object localObject6 = localObject3;
    if (paramString != null)
    {
      localObject6 = localObject3;
      if (paramString.equals("addcontact"))
      {
        ((cm)localObject1).vED = com.tencent.mm.platformtools.aa.vy((String)paramMap.get(".sysmsg.addcontact.content"));
        ((cm)localObject1).nao = 1;
        localObject6 = e.d.bg(Integer.valueOf(1));
        if (localObject6 != null)
          break label1219;
        localObject6 = null;
      }
    }
    label1935: label2483: label3382: label6457: 
    while (true)
    {
      int i;
      if ((paramString != null) && (paramString.equals("dynacfg")))
      {
        com.tencent.mm.m.g.Nu().a((String)localObject2, paramMap, false);
        com.tencent.mm.m.g.Nv();
        if (com.tencent.mm.m.c.Ng() == 2)
          com.tencent.mm.plugin.report.service.h.pYm.X(10879, "");
        i = bo.getInt(com.tencent.mm.m.g.Nu().getValue("MuteRoomDisable"), 0);
        ab.d("MicroMsg.BigBallSysCmdMsgConsumer", "Mute_Room_Disable:" + Integer.toString(i));
        if (com.tencent.mm.sdk.platformtools.aa.doo())
          Ys();
      }
      if ((paramString != null) && (paramString.equals("dynacfg_split")))
      {
        com.tencent.mm.m.g.Nu().a((String)localObject2, paramMap, true);
        if (com.tencent.mm.sdk.platformtools.aa.doo())
          Ys();
      }
      Object localObject7;
      Object localObject8;
      Object localObject9;
      if ((paramString != null) && (paramString.equals("banner")))
      {
        localObject7 = (String)paramMap.get(".sysmsg.mainframebanner.$type");
        localObject8 = (String)paramMap.get(".sysmsg.mainframebanner.showtype");
        localObject9 = (String)paramMap.get(".sysmsg.mainframebanner.data");
        if ((localObject7 == null) || (((String)localObject7).length() <= 0));
      }
      label4155: 
      try
      {
        localObject10 = be.ZV();
        localObject3 = new com/tencent/mm/model/bd;
        ((bd)localObject3).<init>(Integer.valueOf((String)localObject7).intValue(), Integer.valueOf((String)localObject8).intValue(), (String)localObject9);
        ((be)localObject10).a((bd)localObject3);
        localObject3 = (String)paramMap.get(".sysmsg.friendrecommand.fromuser");
        localObject7 = (String)paramMap.get(".sysmsg.friendrecommand.touser");
        if ((localObject3 == null) || (localObject7 == null));
      }
      catch (Exception localException4)
      {
        label3644: label4031: 
        try
        {
          aw.ZK().Yk().a((String)localObject7, true, null);
          localObject7 = (String)paramMap.get(".sysmsg.banner.securitybanner.chatname");
          localObject3 = (String)paramMap.get(".sysmsg.banner.securitybanner.wording");
          localObject8 = (String)paramMap.get(".sysmsg.banner.securitybanner.linkname");
          localObject9 = (String)paramMap.get(".sysmsg.banner.securitybanner.linksrc");
          localObject10 = (String)paramMap.get(".sysmsg.banner.securitybanner.showtype");
          if ((bo.isNullOrNil((String)localObject7)) || (bo.isNullOrNil((String)localObject10)));
        }
        catch (Exception localException4)
        {
          label3906: 
          try
          {
            if (((String)localObject10).equals("1"))
            {
              bool1 = true;
              aw.ZK().Yl().a((String)localObject7, bool1, new String[] { localObject3, localObject8, localObject9 });
              aw.ZK().Ym().n(paramMap);
              if ((!bo.isNullOrNil(paramString)) && (paramString.equals("midinfo")))
              {
                localObject7 = (String)paramMap.get(".sysmsg.midinfo.json_buffer");
                localObject3 = (String)paramMap.get(".sysmsg.midinfo.time_interval");
                ab.i("MicroMsg.BigBallSysCmdMsgConsumer", "QueryMid time[%s] json[%s]  [%s] ", new Object[] { localObject3, localObject7, localObject2 });
                i = bo.getInt((String)localObject3, 0);
                if ((i > 86400L) && (i < 864000L))
                {
                  aw.ZK();
                  c.Ry().set(331777, Long.valueOf(bo.anT() + i));
                }
                if (!bo.isNullOrNil((String)localObject7))
                  com.tencent.mm.plugin.report.b.d.VY((String)localObject7);
              }
              if ((paramString != null) && (paramString.equals("revokemsg")))
              {
                ab.i("MicroMsg.BigBallSysCmdMsgConsumer", "mm hit MM_DATA_SYSCMD_NEWXML_SUBTYPE_REVOKE");
                localObject3 = (String)paramMap.get(".sysmsg.revokemsg.session");
                localObject6 = (String)paramMap.get(".sysmsg.revokemsg.newmsgid");
                paramString = (String)paramMap.get(".sysmsg.revokemsg.replacemsg");
                ab.i("MicroMsg.BigBallSysCmdMsgConsumer", "ashutest::[oneliang][xml parse] ,msgId:%s,replaceMsg:%s ", new Object[] { localObject6, paramString });
                l1 = 0L;
              }
            }
          }
          catch (Exception localException4)
          {
            label1219: label2115: label5574: 
            while (true)
            {
              Object localObject10;
              long l1;
              try
              {
                long l2 = bo.getLong((String)localObject6, 0L);
                l1 = l2;
                aw.ZK();
                l1 = l2;
                localObject6 = c.XO().Q((String)localObject3, l2);
                l1 = l2;
                paramMap = bi.ar((bi)localObject6);
                l1 = l2;
                if ((((cy)localObject6).dqI & 0x4) != 4)
                {
                  l1 = l2;
                  ((bi)localObject6).setContent(paramString);
                  l1 = l2;
                  ((bi)localObject6).setType(10000);
                  l1 = l2;
                  bf.a((bi)localObject6, parama);
                  l1 = l2;
                  aw.ZK();
                  l1 = l2;
                  c.XO().a(((cy)localObject6).field_msgId, (bi)localObject6);
                }
                l1 = l2;
                aw.ZK();
                l1 = l2;
                localObject3 = c.XR().aoZ(((cy)localObject6).field_talker);
                if (localObject3 != null)
                {
                  l1 = l2;
                  if (((at)localObject3).field_unReadCount > 0)
                  {
                    l1 = l2;
                    aw.ZK();
                    l1 = l2;
                    i = c.XO().Y((bi)localObject6);
                    l1 = l2;
                    if (((at)localObject3).field_unReadCount >= i)
                    {
                      l1 = l2;
                      ((com.tencent.mm.storage.ak)localObject3).hM(((at)localObject3).field_unReadCount - 1);
                      l1 = l2;
                      aw.ZK();
                      l1 = l2;
                      c.XR().a((com.tencent.mm.storage.ak)localObject3, ((at)localObject3).field_username);
                    }
                  }
                }
                if (parama != null)
                {
                  l1 = l2;
                  if (parama.fsU)
                  {
                    l1 = l2;
                    localObject7 = new com/tencent/mm/storage/bb;
                    l1 = l2;
                    ((bb)localObject7).<init>();
                    l1 = l2;
                    ((bb)localObject7).field_originSvrId = l2;
                    l1 = l2;
                    if (((cy)localObject6).field_msgId == 0L)
                    {
                      l1 = l2;
                      ab.i("MicroMsg.BigBallSysCmdMsgConsumer", "summerbadcr get a revoke but msg id is 0 originSvrId[%d]", new Object[] { Long.valueOf(l2) });
                      l1 = l2;
                      ((bb)localObject7).field_content = ((String)localObject2);
                      l1 = l2;
                      ((bb)localObject7).field_createTime = ((cm)localObject1).pcX;
                      l1 = l2;
                      ((bb)localObject7).field_flag = bf.d(parama);
                      l1 = l2;
                      ((bb)localObject7).field_fromUserName = com.tencent.mm.platformtools.aa.a(((cm)localObject1).vEB);
                      l1 = l2;
                      ((bb)localObject7).field_toUserName = com.tencent.mm.platformtools.aa.a(((cm)localObject1).vEC);
                      l1 = l2;
                      ((bb)localObject7).field_newMsgId = ((cm)localObject1).ptF;
                      l1 = l2;
                      com.tencent.mm.modelmulti.n.ahX();
                      l1 = l2;
                      ab.i("MicroMsg.BigBallSysCmdMsgConsumer", "summerbadcr insert ret[%b], systemRowid[%d]", new Object[] { Boolean.valueOf(com.tencent.mm.modelmulti.n.ahV().b((com.tencent.mm.sdk.e.c)localObject7)), Long.valueOf(((bb)localObject7).xDa) });
                      paramString = null;
                      AppMethodBeat.o(16267);
                      return paramString;
                      localObject6 = ((com.tencent.mm.ai.e)localObject6).b(parama);
                      break;
                      localException2 = localException2;
                      ab.e("MicroMsg.BigBallSysCmdMsgConsumer", localException2.toString());
                      continue;
                      localException3 = localException3;
                      ab.e("MicroMsg.BigBallSysCmdMsgConsumer", localException3.toString());
                      continue;
                      localException4 = localException4;
                      ab.e("MicroMsg.BigBallSysCmdMsgConsumer", "[oneliang]" + localException4.toString());
                      continue;
                    }
                    l1 = l2;
                    ab.i("MicroMsg.BigBallSysCmdMsgConsumer", "summerbadcr get a revoke and has done delete info, originSvrId[%d]", new Object[] { Long.valueOf(l2) });
                    l1 = l2;
                    com.tencent.mm.modelmulti.n.ahX();
                    l1 = l2;
                    com.tencent.mm.modelmulti.n.ahV().a((com.tencent.mm.sdk.e.c)localObject7, true, new String[0]);
                    l1 = l2;
                    aw.ZK();
                    l1 = l2;
                    c.XO().jj(l2);
                    if (localException4 != null)
                    {
                      l1 = l2;
                      if (parama.eAB != null)
                      {
                        l1 = l2;
                        if (localException4.field_lastSeq == parama.eAB.vEI)
                        {
                          l1 = l2;
                          ab.i("MicroMsg.BigBallSysCmdMsgConsumer", "summerbadcr get a revoke and fix fault lastseq[%s], firstUnDeliverSeq[%s]", new Object[] { Long.valueOf(localException4.field_lastSeq), Long.valueOf(localException4.field_firstUnDeliverSeq) });
                          l1 = l2;
                          aw.ZK();
                          l1 = l2;
                          localObject2 = c.XO().Rc(localException4.field_username);
                          if (localObject2 != null)
                          {
                            l1 = l2;
                            localException4.eF(((cy)localObject2).field_msgSeq);
                            l1 = l2;
                            aw.ZK();
                            l1 = l2;
                            i = c.XR().a(localException4, localException4.field_username);
                            l1 = l2;
                            ab.i("MicroMsg.BigBallSysCmdMsgConsumer", "summerbadcr get a revoke and fix fault by [%s, %s] lastseq[%s], firstUnDeliverSeq[%s], update[%s]", new Object[] { Long.valueOf(((cy)localObject2).field_msgSvrId), Long.valueOf(((cy)localObject2).field_msgSeq), Long.valueOf(localException4.field_lastSeq), Long.valueOf(localException4.field_firstUnDeliverSeq), Integer.valueOf(i) });
                          }
                        }
                      }
                    }
                  }
                }
                l1 = l2;
                if (((cy)localObject6).field_msgId == 0L)
                  if (parama != null)
                  {
                    l1 = l2;
                    if (parama.fsU);
                  }
                  else
                  {
                    l1 = l2;
                    ab.i("MicroMsg.BigBallSysCmdMsgConsumer", "summer revoke msg id is 0 and svrid[%d]", new Object[] { Long.valueOf(l2) });
                    l1 = l2;
                    aw.ZK();
                    l1 = l2;
                    c.XO().jj(l2);
                  }
                l1 = l2;
                parama = new com/tencent/mm/g/a/pe;
                l1 = l2;
                parama.<init>();
                l1 = l2;
                parama.cLt.cvx = ((cy)localObject6).field_msgId;
                l1 = l2;
                parama.cLt.cLu = paramString;
                l1 = l2;
                parama.cLt.cKd = ((bi)localObject6);
                l1 = l2;
                parama.cLt.cLv = paramMap;
                l1 = l2;
                parama.cLt.cLw = l2;
                l1 = l2;
                com.tencent.mm.sdk.b.a.xxA.m(parama);
                if (paramMap != null)
                {
                  l1 = l2;
                  paramString = com.tencent.mm.kernel.g.RS();
                  l1 = l2;
                  parama = new com/tencent/mm/model/f$3;
                  l1 = l2;
                  parama.<init>(this, paramMap);
                  l1 = l2;
                  paramString.aa(parama);
                }
                paramString = null;
                AppMethodBeat.o(16267);
                continue;
              }
              catch (Exception paramString)
              {
                ab.printErrStackTrace("MicroMsg.BigBallSysCmdMsgConsumer", paramString, "[oneliang][revokeMsg] msgId:%d,error:%s", new Object[] { Long.valueOf(l1), paramString.toString() });
                continue;
              }
              int j;
              if ((paramString != null) && (paramString.equals("clouddelmsg")))
              {
                ab.i("MicroMsg.BigBallSysCmdMsgConsumer", "mm hit MM_DATA_SYSCMD_NEWXML_CLOUD_DEL_MSG");
                localObject4 = (String)paramMap.get(".sysmsg.clouddelmsg.delcommand");
                localObject6 = (String)paramMap.get(".sysmsg.clouddelmsg.msgid");
                paramMap = (String)paramMap.get(".sysmsg.clouddelmsg.fromuser");
                i = ((String)localObject2).indexOf("<msg>");
                j = ((String)localObject2).indexOf("</msg>");
                if ((i == -1) || (j == -1))
                {
                  paramString = "";
                  ab.i("MicroMsg.BigBallSysCmdMsgConsumer", "[hakon][clouddelmsg], delcommand:%s, msgid:%s, fromuser:%s, sysmsgcontent:%s", new Object[] { localObject4, localObject6, paramMap, paramString });
                }
                while (true)
                {
                  try
                  {
                    aw.ZK();
                    paramMap = c.XO().fd(paramMap, (String)localObject6);
                    if ((paramMap == null) || (paramMap.size() <= 0))
                    {
                      ab.e("MicroMsg.BigBallSysCmdMsgConsumer", "get null by getByBizClientMsgId");
                      paramString = null;
                      AppMethodBeat.o(16267);
                      break;
                      paramString = com.tencent.mm.sdk.platformtools.be.aS(br.z(((String)localObject2).substring(i, j + 6), "msg"));
                      break label1935;
                    }
                    localObject2 = paramMap.iterator();
                    if (((Iterator)localObject2).hasNext())
                    {
                      paramMap = (bi)((Iterator)localObject2).next();
                      if (paramMap != null)
                        break label2115;
                      ab.e("MicroMsg.BigBallSysCmdMsgConsumer", "[hakon][clouddelmsg], msgInfo == null");
                      continue;
                    }
                  }
                  catch (Exception paramString)
                  {
                    ab.printErrStackTrace("MicroMsg.BigBallSysCmdMsgConsumer", paramString, "[hakon][clouddelmsg], BizClientMsgId:%d,error:%s", new Object[] { localObject6, paramString.toString() });
                    paramString = null;
                    AppMethodBeat.o(16267);
                  }
                  break;
                  if (paramMap.field_msgSvrId >= 0L)
                    break label2159;
                  ab.e("MicroMsg.BigBallSysCmdMsgConsumer", "[hakon][clouddelmsg], invalid msgInfo.msgId = %s, srvId = %s", new Object[] { Long.valueOf(paramMap.field_msgId), Long.valueOf(paramMap.field_msgSvrId) });
                }
                label2159: ab.i("MicroMsg.BigBallSysCmdMsgConsumer", "[hakon][clouddelmsg], msgInfo.msgId = %s, srvId = %s", new Object[] { Long.valueOf(paramMap.field_msgId), Long.valueOf(paramMap.field_msgSvrId) });
                i = bo.getInt((String)localObject4, 0);
                if (i == 1)
                {
                  aw.ZK();
                  c.XO().aa(paramMap.field_talker, paramMap.field_msgSvrId);
                }
                while (true)
                {
                  localObject1 = new com/tencent/mm/g/a/pe;
                  ((pe)localObject1).<init>();
                  ((pe)localObject1).cLt.cvx = paramMap.field_msgId;
                  ((pe)localObject1).cLt.cLu = paramString;
                  ((pe)localObject1).cLt.cKd = paramMap;
                  com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject1);
                  break;
                  if ((i == 2) && (paramMap.drC()))
                  {
                    paramMap.setContent(paramString);
                    bf.a(paramMap, parama);
                    aw.ZK();
                    c.XO().b(paramMap.field_msgSvrId, paramMap);
                    aw.ZK();
                    localObject1 = c.XR().aoZ(paramMap.field_talker);
                    if ((localObject1 != null) && (((at)localObject1).field_unReadCount > 0))
                    {
                      aw.ZK();
                      i = c.XO().Y(paramMap);
                      if (((at)localObject1).field_unReadCount >= i)
                      {
                        ((com.tencent.mm.storage.ak)localObject1).hM(((at)localObject1).field_unReadCount - 1);
                        aw.ZK();
                        c.XR().a((com.tencent.mm.storage.ak)localObject1, ((at)localObject1).field_username);
                      }
                    }
                  }
                }
              }
              if ((paramString != null) && (paramString.equals("updatepackage")))
              {
                localObject6 = e.d.bg(Integer.valueOf(-1879048175));
                if (localObject6 != null);
              }
              label2643: Object localObject5;
              label2890: label3921: label4185: for (Object localObject4 = null; ; localObject5 = localObject6)
              {
                while (true)
                {
                  localObject6 = localObject4;
                  if (paramString != null)
                  {
                    localObject6 = localObject4;
                    if (paramString.equals("deletepackage"))
                    {
                      localObject6 = e.d.bg(Integer.valueOf(-1879048174));
                      if (localObject6 != null)
                        break label3341;
                      localObject6 = null;
                    }
                  }
                  Object localObject11;
                  if ((paramString != null) && (paramString.equals("delchatroommember")))
                  {
                    localObject4 = com.tencent.mm.platformtools.aa.a(((cm)localObject1).vEB);
                    aw.ZK();
                    localObject7 = c.XO().Q((String)localObject4, ((cm)localObject1).ptF);
                    i = 0;
                    if (((cy)localObject7).field_msgId > 0L)
                      i = 1;
                    ((bi)localObject7).eI(((cm)localObject1).ptF);
                    if ((parama == null) || (!parama.fsU) || (!parama.fsW))
                      ((bi)localObject7).eJ(bf.q((String)localObject4, ((cm)localObject1).pcX));
                    ((bi)localObject7).setType(10002);
                    ((bi)localObject7).setContent((String)localObject2);
                    ((bi)localObject7).hO(0);
                    ((bi)localObject7).ju((String)localObject4);
                    ((bi)localObject7).ix(((cm)localObject1).vEG);
                    bf.a((bi)localObject7, parama);
                    if (i == 0)
                      bf.l((bi)localObject7);
                  }
                  else
                  {
                    localObject4 = localObject6;
                    if (paramString != null)
                    {
                      localObject4 = localObject6;
                      if (paramString.equals("WakenPush"))
                      {
                        localObject4 = localObject6;
                        if (this.fky != ((cm)localObject1).ptF)
                        {
                          this.fky = ((cm)localObject1).ptF;
                          ab.i("MicroMsg.BigBallSysCmdMsgConsumer", "dzmonster[subType wakenpush]");
                          localObject9 = new cg(paramMap);
                          localObject2 = (String)((cg)localObject9).fjf.get(".sysmsg.WakenPush.PushContent");
                          localObject4 = (String)((cg)localObject9).fjf.get(".sysmsg.WakenPush.Jump");
                          localObject6 = (String)((cg)localObject9).fjf.get(".sysmsg.WakenPush.ExpiredTime");
                          localObject7 = (String)((cg)localObject9).fjf.get(".sysmsg.WakenPush.Username");
                          ab.d("MicroMsg.WakenPushMsgExtension", "dzmonster[xml parse of wakenpush,pushContent:%s, jump:%s, expiredTime %s]", new Object[] { localObject2, localObject4, localObject6 });
                          localObject6 = com.tencent.mm.m.g.Nu().getValue("WakenPushDeepLinkBitSet");
                          ab.d("MicroMsg.WakenPushMsgExtension", "dzmonster[config of WakenPushDeepLinkBitSet:%s", new Object[] { localObject6 });
                          if (bo.isNullOrNil((String)localObject6))
                            break label3376;
                          l1 = bo.getLong((String)localObject6, 0L);
                          localObject8 = com.tencent.mm.ah.b.a((String)localObject7, false, -1);
                          localObject10 = aw.getNotification();
                          if (!bo.isNullOrNil((String)localObject4))
                            break label3382;
                          ab.e("MicroMsg.WakenPushMsgExtension", "dzmonster:dealDeepLink[url is null]");
                          localObject6 = "com.tencent.mm.ui.LauncherUI";
                          localObject11 = new Intent();
                          ((Intent)localObject11).setClassName(ah.getContext(), (String)localObject6);
                          ((Intent)localObject11).setFlags(536870912);
                          ((Intent)localObject11).putExtra("LauncherUI.Show.Update.DialogMsg", (String)((cg)localObject9).fjf.get(".sysmsg.WakenPush.PushContent"));
                          if (!((String)localObject4).equals("weixin://dl/update_newest_version"))
                            ((Intent)localObject11).putExtra("LauncherUI.Show.Update.Url", (String)((cg)localObject9).fjf.get(".sysmsg.WakenPush.Jump"));
                          com.tencent.mm.plugin.report.service.h.pYm.a(405L, 32L, 1L, true);
                          localObject6 = ((an)localObject10).a(PendingIntent.getActivity(ah.getContext(), UUID.randomUUID().hashCode(), (Intent)localObject11, 134217728), ah.getContext().getString(2131296982), (String)localObject2, (String)localObject2, (Bitmap)localObject8, (String)localObject7);
                          ((Notification)localObject6).flags |= 16;
                          aw.getNotification().a((Notification)localObject6, false);
                          com.tencent.mm.plugin.report.service.h.pYm.a(405L, 31L, 1L, true);
                          localObject4 = null;
                        }
                      }
                    }
                    localObject6 = localObject4;
                    if (paramString == null)
                      break label3644;
                    localObject6 = localObject4;
                    if (!paramString.equals("DisasterNotice"))
                      break label3644;
                    localObject8 = (String)paramMap.get(".sysmsg.NoticeId");
                    localObject9 = (String)paramMap.get(".sysmsg.Content");
                    ab.i("MicroMsg.BigBallSysCmdMsgConsumer", "disaster noticeID:%s, content:%s", new Object[] { localObject8, localObject9 });
                    localObject7 = ah.getContext().getSharedPreferences("disaster_pref", com.tencent.mm.compatible.util.h.Mu());
                    localObject2 = ((SharedPreferences)localObject7).getString("disaster_noticeid_list_key", "");
                    if (((String)localObject2).contains((CharSequence)localObject8))
                      break label3587;
                    localObject10 = ((String)localObject2).split(";");
                    if ((localObject10 == null) || (localObject10.length <= 10))
                      break label3498;
                    localObject6 = "";
                    j = localObject10.length;
                    i = 0;
                    localObject4 = localObject6;
                    if (i >= j)
                      break label3502;
                    localObject11 = localObject10[i].split(",");
                    localObject4 = localObject6;
                  }
                  try
                  {
                    if (bo.fp(bo.getLong(localObject11[0], 0L)) < 1296000L)
                    {
                      localObject4 = new java/lang/StringBuilder;
                      ((StringBuilder)localObject4).<init>();
                      localObject4 = (String)localObject6 + localObject11[0] + "," + localObject11[1] + ";";
                    }
                    i++;
                    localObject6 = localObject4;
                    break label3224;
                    localObject4 = ((com.tencent.mm.ai.e)localObject6).b(parama);
                    continue;
                    localObject6 = ((com.tencent.mm.ai.e)localObject6).b(parama);
                    break label2483;
                    aw.ZK();
                    c.XO().b(((cm)localObject1).ptF, (bi)localObject7);
                    break label2643;
                    l1 = 0L;
                    break label2854;
                    if (((0x4 & l1) == 4L) && (((String)localObject4).startsWith("weixin://dl/moments")))
                    {
                      localObject6 = "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI";
                      break label2890;
                    }
                    if (((l1 & 0x40000) == 262144L) && (((String)localObject4).startsWith("weixin://dl/recommendation")))
                    {
                      localObject6 = "com.tencent.mm.plugin.subapp.ui.friend.FMessageConversationUI";
                      break label2890;
                    }
                    ab.e("MicroMsg.WakenPushMsgExtension", "dzmonster:dealDeepLink[unable to deal with the deep link:%s)", new Object[] { localObject4 });
                    localObject6 = "com.tencent.mm.ui.LauncherUI";
                  }
                  catch (Exception localException5)
                  {
                    while (true)
                    {
                      ab.e("MicroMsg.BigBallSysCmdMsgConsumer", "MM_DATA_SYSCMD_NEWXML_DISASTER_NOTICE parseLong error:%s", new Object[] { localException5 });
                      localObject5 = localObject6;
                    }
                  }
                }
                localObject5 = localObject2;
                localObject6 = (String)localObject5 + bo.anT() + "," + (String)localObject8 + ";";
                ab.i("MicroMsg.BigBallSysCmdMsgConsumer", "update noticeIdList %s -> %s", new Object[] { localObject2, localObject6 });
                ((SharedPreferences)localObject7).edit().putString("disaster_noticeid_list_key", (String)localObject6).commit();
                new com.tencent.mm.sdk.platformtools.ak(Looper.getMainLooper()).post(new f.1(this, (String)localObject8));
                ((cm)localObject1).vED = com.tencent.mm.platformtools.aa.vy((String)localObject9);
                ((cm)localObject1).nao = 1;
                localObject6 = e.d.bg(Integer.valueOf(1));
                if (localObject6 == null)
                {
                  localObject6 = null;
                  if ((paramString == null) || (!paramString.equals("EmotionKv")))
                    break label4201;
                  paramString = (String)paramMap.get(".sysmsg.EmotionKv.K");
                  localObject6 = (String)paramMap.get(".sysmsg.EmotionKv.I");
                  if (paramString != null)
                    break label7386;
                  paramString = "";
                }
                label3929: label7386: 
                while (true)
                  while (true)
                  {
                    while (true)
                    {
                      ab.i("MicroMsg.BigBallSysCmdMsgConsumer", "summercck emotionkv pcKeyStr len:%d, content[%s] pcId[%s]", new Object[] { Integer.valueOf(paramString.length()), paramString, localObject6 });
                      localObject2 = com.tencent.mm.protocal.z.dmv().vyO.getBytes();
                      localObject5 = com.tencent.mm.protocal.z.dmv().vyP.getBytes();
                      paramMap = null;
                      try
                      {
                        parama = aw.Rg().ftA.adg().adc();
                        paramMap = parama;
                        if (bo.cb(paramMap))
                        {
                          ab.e("MicroMsg.BigBallSysCmdMsgConsumer", "DISASTER_NOTICE  ecdh  is null .");
                          paramString = null;
                          AppMethodBeat.o(16267);
                          break;
                          localObject6 = ((com.tencent.mm.ai.e)localObject6).b(parama);
                        }
                      }
                      catch (Exception parama)
                      {
                        while (true)
                          ab.e("MicroMsg.BigBallSysCmdMsgConsumer", "DISASTER_NOTICE :%s ", new Object[] { bo.l(parama) });
                        localObject1 = com.tencent.mm.protocal.f.dmi();
                        if (bo.cb((byte[])localObject1))
                        {
                          ab.e("MicroMsg.BigBallSysCmdMsgConsumer", "DISASTER_NOTICE  newECDH  is null .");
                          paramString = null;
                          AppMethodBeat.o(16267);
                          break;
                        }
                        parama = new PByteArray();
                        if (bo.isNullOrNil(paramString))
                          break label3906;
                      }
                    }
                    int k;
                    int m;
                    label3936: int n;
                    if ((bo.cb((byte[])localObject5)) || (bo.cb((byte[])localObject2)) || (bo.cb(paramMap)) || (bo.cb((byte[])localObject1)))
                      if (paramString == null)
                      {
                        i = -1;
                        if (localObject5 != null)
                          break label4132;
                        j = -1;
                        if (localObject2 != null)
                          break label4140;
                        k = -1;
                        if (paramMap != null)
                          break label4148;
                        m = -1;
                        if (localObject1 != null)
                          break label4155;
                        n = -1;
                        label3944: ab.w("MicroMsg.BigBallSysCmdMsgConsumer", "summercck emotionkv param len err pcKeylen:%d, keynlen:%d, keyelen:%d, ecdhlen:%d newECDH:%d", new Object[] { Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k), Integer.valueOf(m), Integer.valueOf(n) });
                        paramMap = parama.value;
                        paramString = new axf();
                        if (parama.value == null)
                          break label4185;
                        paramString.pXM = new String(parama.value);
                        if (paramMap != null)
                          break label4194;
                      }
                    label4194: for (i = -1; ; i = paramMap.length)
                    {
                      ab.i("MicroMsg.BigBallSysCmdMsgConsumer", "summercck emotionkv res len:%d val len:%d, content[%s]", new Object[] { Integer.valueOf(i), Integer.valueOf(paramString.pXM.length()), com.tencent.mm.a.g.x(paramString.pXM.getBytes()) });
                      paramString.wBn = ((String)localObject6);
                      aw.ZK();
                      c.XL().c(new j.a(59, paramString));
                      paramString = null;
                      AppMethodBeat.o(16267);
                      break;
                      i = paramString.length();
                      break label3913;
                      j = localObject5.length;
                      break label3921;
                      k = localObject2.length;
                      break label3929;
                      m = paramMap.length;
                      break label3936;
                      n = localObject1.length;
                      break label3944;
                      aw.ZK();
                      MMProtocalJni.genClientCheckKVRes(c.QF(), paramString, (byte[])localObject2, (byte[])localObject5, paramMap, (byte[])localObject1, parama);
                      break label3996;
                      paramString.pXM = "";
                      break label4031;
                    }
                    label4201: if ((paramString != null) && (paramString.equals("globalalert")))
                    {
                      localObject6 = (String)paramMap.get(".sysmsg.uuid");
                      i = bo.getInt((String)paramMap.get(".sysmsg.id"), -1);
                      j = bo.getInt((String)paramMap.get(".sysmsg.important"), -1);
                      if ((bo.isNullOrNil((String)localObject6)) || (i < 0) || (j < 0))
                      {
                        ab.i("MicroMsg.BigBallSysCmdMsgConsumer", "summeralert uuid[%s], id[%d], important[%d] is illegal ret", new Object[] { localObject6, Integer.valueOf(i), Integer.valueOf(j) });
                        paramString = null;
                        AppMethodBeat.o(16267);
                        break;
                      }
                      parama = (String)paramMap.get(".sysmsg.title");
                      paramString = (String)paramMap.get(".sysmsg.msg");
                      if ((bo.isNullOrNil(parama)) && (bo.isNullOrNil(paramString)))
                      {
                        ab.i("MicroMsg.BigBallSysCmdMsgConsumer", "summeralert title[%s], msg[%s] is illegal ret", new Object[] { parama, paramString });
                        paramString = null;
                        AppMethodBeat.o(16267);
                        break;
                      }
                      localObject1 = (String)paramMap.get(".sysmsg.btnlist.btn.$title");
                      k = bo.getInt((String)paramMap.get(".sysmsg.btnlist.btn.$id"), -1);
                      int i1 = bo.getInt((String)paramMap.get(".sysmsg.btnlist.btn.$actiontype"), -1);
                      localObject2 = (String)paramMap.get(".sysmsg.btnlist.btn");
                      if ((bo.isNullOrNil((String)localObject1)) || (k < 0) || (i1 < 0))
                      {
                        ab.i("MicroMsg.BigBallSysCmdMsgConsumer", "summeralert first btn btnStr[%s], btnId[%d] btnActionType[%d] is illegal ret", new Object[] { localObject1, Integer.valueOf(k), Integer.valueOf(i1) });
                        paramString = null;
                        AppMethodBeat.o(16267);
                        break;
                      }
                      localObject5 = (String)paramMap.get(".sysmsg.btnlist.btn1.$title");
                      n = bo.getInt((String)paramMap.get(".sysmsg.btnlist.btn1.$id"), -1);
                      m = bo.getInt((String)paramMap.get(".sysmsg.btnlist.btn1.$actiontype"), -1);
                      paramMap = (String)paramMap.get(".sysmsg.btnlist.btn1");
                      bool1 = true;
                      if ((bo.isNullOrNil((String)localObject5)) || (n < 0) || (m < 0))
                      {
                        bool1 = false;
                        ab.i("MicroMsg.BigBallSysCmdMsgConsumer", "summeralert sec btn btnStr[%s], btnId[%d] btnActionType[%d] is illegal only one btn", new Object[] { localObject1, Integer.valueOf(k), Integer.valueOf(i1) });
                      }
                      localObject7 = new ij();
                      localObject9 = new com.tencent.mm.protocal.b.a.b();
                      ((ij)localObject7).cDv.cDw = ((com.tencent.mm.protocal.b.a.b)localObject9);
                      ((com.tencent.mm.protocal.b.a.b)localObject9).id = i;
                      ((com.tencent.mm.protocal.b.a.b)localObject9).title = parama;
                      ((com.tencent.mm.protocal.b.a.b)localObject9).bzH = paramString;
                      ((com.tencent.mm.protocal.b.a.b)localObject9).vzI = new LinkedList();
                      localObject8 = new com.tencent.mm.protocal.b.a.a();
                      ((com.tencent.mm.protocal.b.a.a)localObject8).id = k;
                      ((com.tencent.mm.protocal.b.a.a)localObject8).actionType = i1;
                      ((com.tencent.mm.protocal.b.a.a)localObject8).vzG = ((String)localObject1);
                      ((com.tencent.mm.protocal.b.a.a)localObject8).vzH = ((String)localObject2);
                      ((com.tencent.mm.protocal.b.a.b)localObject9).vzI.add(localObject8);
                      if (bool1)
                      {
                        localObject2 = new com.tencent.mm.protocal.b.a.a();
                        ((com.tencent.mm.protocal.b.a.a)localObject2).id = n;
                        ((com.tencent.mm.protocal.b.a.a)localObject2).actionType = m;
                        ((com.tencent.mm.protocal.b.a.a)localObject2).vzG = ((String)localObject5);
                        ((com.tencent.mm.protocal.b.a.a)localObject2).vzH = paramMap;
                        ((com.tencent.mm.protocal.b.a.b)localObject9).vzI.add(localObject2);
                      }
                      ab.i("MicroMsg.BigBallSysCmdMsgConsumer", "summeralert uuid[%s], id[%d], important[%d], title[%s], msg[%s], twoBtn[%b], publish[%b]", new Object[] { localObject6, Integer.valueOf(i), Integer.valueOf(j), parama, paramString, Boolean.valueOf(bool1), Boolean.valueOf(com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject7)) });
                      paramString = null;
                      AppMethodBeat.o(16267);
                      break;
                    }
                    if ((paramString != null) && (paramString.equals("yybsigcheck")))
                    {
                      com.tencent.mm.plugin.report.service.h.pYm.a(322L, 14L, 1L, false);
                      l1 = System.currentTimeMillis();
                      parama = (String)paramMap.get(".sysmsg.yybsigcheck.yybsig.nocheckmarket");
                      paramString = (String)paramMap.get(".sysmsg.yybsigcheck.yybsig.wording");
                      paramMap = (String)paramMap.get(".sysmsg.yybsigcheck.yybsig.url");
                      ab.i("MicroMsg.BigBallSysCmdMsgConsumer", "summertoken newxml nocheckmarket[%s], wording[%s], url[%s]", new Object[] { parama, paramString, paramMap });
                      com.tencent.mm.plugin.report.service.h.pYm.e(11098, new Object[] { Integer.valueOf(4014), String.format("%s|%s|%s", new Object[] { parama, paramString, paramMap }) });
                      if (bo.isNullOrNil(parama))
                      {
                        ab.w("MicroMsg.BigBallSysCmdMsgConsumer", "summertoken newxml nocheckmarket is nil and return");
                        com.tencent.mm.plugin.report.service.h.pYm.a(322L, 15L, 1L, false);
                        com.tencent.mm.plugin.report.service.h.pYm.e(11098, new Object[] { Integer.valueOf(4015), String.format("%s|%s", new Object[] { paramString, paramMap }) });
                        paramString = null;
                        AppMethodBeat.o(16267);
                        break;
                      }
                      localObject6 = parama.split(";");
                      if (localObject6 == null);
                      for (i = -1; ; i = localObject6.length)
                      {
                        ab.d("MicroMsg.BigBallSysCmdMsgConsumer", "summertoken newxml infoStrs len is %d", new Object[] { Integer.valueOf(i) });
                        if ((localObject6 != null) && (localObject6.length != 0))
                          break label5212;
                        com.tencent.mm.plugin.report.service.h.pYm.a(322L, 16L, 1L, false);
                        com.tencent.mm.plugin.report.service.h.pYm.e(11098, new Object[] { Integer.valueOf(4016), parama });
                        paramString = null;
                        AppMethodBeat.o(16267);
                        break;
                      }
                      label5212: localObject2 = new ArrayList();
                      i = 0;
                      if (i < localObject6.length)
                      {
                        localObject5 = localObject6[i];
                        if (bo.isNullOrNil((String)localObject5))
                          ab.i("MicroMsg.BigBallSysCmdMsgConsumer", "summertoken newxml infoStr is nil index:%d, continue", new Object[] { Integer.valueOf(i) });
                        while (true)
                        {
                          i++;
                          break;
                          localObject1 = ((String)localObject5).split(",");
                          if (localObject1 == null);
                          for (j = -1; ; j = localObject1.length)
                          {
                            ab.d("MicroMsg.BigBallSysCmdMsgConsumer", "summertoken newxml fields len is %d", new Object[] { Integer.valueOf(j) });
                            if ((localObject1 != null) && (localObject1.length == 3))
                              break label5354;
                            ab.i("MicroMsg.BigBallSysCmdMsgConsumer", "summertoken newxml fields len is invalid index:%d, continue", new Object[] { Integer.valueOf(i) });
                            break;
                          }
                          try
                          {
                            label5354: localObject7 = new com/tencent/mm/platformtools/ai$c;
                            ((ai.c)localObject7).<init>(localObject1[0], Integer.valueOf(localObject1[1]).intValue(), localObject1[2]);
                            ((ArrayList)localObject2).add(localObject7);
                          }
                          catch (Exception localException1)
                          {
                            ab.w("MicroMsg.BigBallSysCmdMsgConsumer", "summertoken newxml parse info index:%d, e:%s", new Object[] { Integer.valueOf(i), localException1.getMessage() });
                            com.tencent.mm.plugin.report.service.h.pYm.a(322L, 17L, 1L, false);
                            com.tencent.mm.plugin.report.service.h.pYm.e(11098, new Object[] { Integer.valueOf(4017), localObject5 });
                          }
                        }
                      }
                      if (((ArrayList)localObject2).size() == 0)
                      {
                        ab.w("MicroMsg.BigBallSysCmdMsgConsumer", "summertoken newxml marketList size is 0 and return");
                        com.tencent.mm.plugin.report.service.h.pYm.a(322L, 18L, 1L, false);
                        com.tencent.mm.plugin.report.service.h.pYm.e(11098, new Object[] { Integer.valueOf(4018), String.format("%s|%s|%s", new Object[] { parama, paramString, paramMap }) });
                        paramString = null;
                        AppMethodBeat.o(16267);
                        break;
                      }
                      if (bo.getInt(com.tencent.mm.m.g.Nu().getValue("YYBVerifyMarketUseSystemApi"), 0) != 0)
                      {
                        bool1 = true;
                        boolean bool2 = ai.a(ah.getContext(), (ArrayList)localObject2, bool1);
                        ab.i("MicroMsg.BigBallSysCmdMsgConsumer", "summertoken newxml marketList size[%d], usesSystemApi[%b], containLowerMarket[%b], take[%d]ms", new Object[] { Integer.valueOf(((ArrayList)localObject2).size()), Boolean.valueOf(bool1), Boolean.valueOf(bool2), Long.valueOf(System.currentTimeMillis() - l1) });
                        if (bool2)
                          break label5765;
                        aw.ZI().setInt(46, 4);
                        localObject6 = new ja();
                        ((ja)localObject6).cEg.cEh = paramString;
                        ((ja)localObject6).cEg.url = paramMap;
                        com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject6);
                        com.tencent.mm.plugin.report.service.h.pYm.a(322L, 20L, 1L, true);
                        com.tencent.mm.plugin.report.service.h.pYm.e(11098, new Object[] { Integer.valueOf(4020), String.format("%s|%s|%s", new Object[] { parama, paramString, paramMap }) });
                      }
                      while (true)
                      {
                        paramString = null;
                        AppMethodBeat.o(16267);
                        break;
                        bool1 = false;
                        break label5574;
                        aw.ZI().setInt(46, 0);
                        com.tencent.mm.plugin.report.service.h.pYm.a(322L, 19L, 1L, true);
                        com.tencent.mm.plugin.report.service.h.pYm.e(11098, new Object[] { Integer.valueOf(4019), String.format("%s|%s|%s", new Object[] { parama, paramString, paramMap }) });
                      }
                    }
                    if ((paramString != null) && (paramString.equals("qy_status_notify")))
                    {
                      parama = (String)paramMap.get(".sysmsg.chat_id");
                      paramMap.get(".sysmsg.last_create_time");
                      paramString = (String)paramMap.get(".sysmsg.brand_username");
                      l1 = com.tencent.mm.aj.a.e.ry(parama);
                      if (l1 == -1L)
                      {
                        ab.i("MicroMsg.BigBallSysCmdMsgConsumer", "qy_status_notify bizLocalId == -1,%s", new Object[] { parama });
                        paramString = null;
                        AppMethodBeat.o(16267);
                        break;
                      }
                      i = com.tencent.mm.aj.z.aeU().fv(l1).field_newUnReadCount;
                      com.tencent.mm.aj.z.aeU().fx(l1);
                      parama = com.tencent.mm.aj.z.aeT().aK(l1);
                      aw.ZK();
                      paramMap = c.XR().aoZ(paramString);
                      if (paramMap == null)
                      {
                        ab.w("MicroMsg.BigBallSysCmdMsgConsumer", "qy_status_notify cvs == null:%s", new Object[] { paramString });
                        paramString = null;
                        AppMethodBeat.o(16267);
                        break;
                      }
                      if (parama.lc(1))
                      {
                        if (paramMap.field_unReadMuteCount <= i)
                        {
                          paramMap.hS(0);
                          aw.ZK();
                          c.XR().a(paramMap, paramString);
                          aw.getNotification().cancelNotification(paramString);
                        }
                        while (true)
                        {
                          paramString = null;
                          AppMethodBeat.o(16267);
                          break;
                          paramMap.hS(paramMap.field_unReadMuteCount - i);
                          aw.ZK();
                          c.XR().a(paramMap, paramString);
                        }
                      }
                      if (paramMap.field_unReadCount <= i)
                      {
                        aw.ZK();
                        c.XR().apb(paramString);
                        aw.getNotification().cancelNotification(paramString);
                      }
                      while (true)
                      {
                        paramString = null;
                        AppMethodBeat.o(16267);
                        break;
                        paramMap.hR(0);
                        paramMap.hU(0);
                        paramMap.hM(paramMap.field_unReadCount - i);
                        aw.ZK();
                        c.XR().a(paramMap, paramString);
                      }
                    }
                    if ((paramString != null) && (paramString.equals("qy_chat_update")))
                    {
                      parama = (String)paramMap.get(".sysmsg.chat_id");
                      localObject5 = (String)paramMap.get(".sysmsg.ver");
                      com.tencent.mm.aj.a.e.p((String)paramMap.get(".sysmsg.brand_username"), parama, (String)localObject5);
                    }
                    if ((paramString != null) && (paramString.equals("bindmobiletip")))
                    {
                      i = bo.getInt((String)paramMap.get(".sysmsg.bindmobiletip.forcebind"), 0);
                      parama = bo.nullAsNil((String)paramMap.get(".sysmsg.bindmobiletip.deviceid"));
                      paramString = bo.nullAsNil((String)paramMap.get(".sysmsg.bindmobiletip.wording"));
                      parama = new String(Base64.decode(parama.getBytes(), 0));
                      paramMap = new String(com.tencent.mm.bt.b.bI(com.tencent.mm.compatible.e.q.LM().getBytes()).Lv(16).wR);
                      ab.i("MicroMsg.BigBallSysCmdMsgConsumer", "summerbindmobile forceBind:%d,decodeDeviceId[%s],localDeviceId[%s],woridingStr[%s]", new Object[] { Integer.valueOf(i), parama, paramMap, paramString });
                      if ((bo.isNullOrNil(parama)) || (parama.equals(paramMap)))
                      {
                        aw.ZK();
                        c.Ry().set(ac.a.xKX, Boolean.TRUE);
                        aw.ZK();
                        paramMap = c.Ry();
                        parama = ac.a.xKY;
                        if (i != 1)
                          break label6457;
                      }
                      for (bool1 = true; ; bool1 = false)
                      {
                        paramMap.set(parama, Boolean.valueOf(bool1));
                        aw.ZK();
                        c.Ry().set(ac.a.xKZ, paramString);
                        paramString = null;
                        AppMethodBeat.o(16267);
                        break;
                      }
                    }
                    if ((paramString != null) && (paramString.equals("ClientCheckConsistency")))
                    {
                      parama = new bfl();
                      parama.fMd = ((String)paramMap.get(".sysmsg.ClientCheckConsistency.clientcheck.fullpathfilename"));
                      parama.wJn = bo.getInt((String)paramMap.get(".sysmsg.ClientCheckConsistency.clientcheck.fileoffset"), 0);
                      parama.wJo = bo.getInt((String)paramMap.get(".sysmsg.ClientCheckConsistency.clientcheck.checkbuffersize"), 0);
                      parama.vPb = bo.getInt((String)paramMap.get(".sysmsg.ClientCheckConsistency.clientcheck.seq"), 0);
                      parama.wJp = f(parama.fMd, parama.wJn, parama.wJo);
                      parama.FileSize = ((int)mm(parama.fMd));
                      if (com.tencent.mm.plugin.normsg.a.b.oTO.bVI())
                      {
                        i = 1;
                        parama.wJq = i;
                        parama.vZF = com.tencent.mm.compatible.e.y.Me();
                        parama.wJr = h(new Object[] { parama.fMd, Integer.valueOf(parama.wJn), Integer.valueOf(parama.wJo), Integer.valueOf(parama.vPb), parama.wJp, Integer.valueOf(parama.FileSize), Integer.valueOf(parama.wJq), Integer.valueOf(parama.vZF) });
                        aw.ZK();
                        c.XL().c(new j.a(61, parama));
                      }
                    }
                    else
                    {
                      if ((paramString != null) && (paramString.equals("ClientCheckHook")))
                      {
                        parama = new bfn();
                        parama.vPb = bo.getInt((String)paramMap.get(".sysmsg.ClientCheckHook.clientcheck.seq"), 0);
                        parama.wJt = com.tencent.mm.plugin.normsg.a.b.oTO.jE(false);
                        if (!com.tencent.mm.plugin.normsg.a.b.oTO.bVI())
                          break label7339;
                        i = 1;
                        parama.wJq = i;
                        parama.vZF = com.tencent.mm.compatible.e.y.Me();
                        parama.wJr = h(new Object[] { Integer.valueOf(parama.vPb), parama.wJt, Integer.valueOf(parama.wJq), Integer.valueOf(parama.vZF) });
                        aw.ZK();
                        c.XL().c(new j.a(62, parama));
                      }
                      if ((paramString != null) && (paramString.equals("ClientCheckGetAppList")))
                      {
                        parama = new bfm();
                        parama.vPb = bo.getInt((String)paramMap.get(".sysmsg.ClientCheckGetAppList.clientcheck.seq"), 0);
                        parama.wJs = com.tencent.mm.plugin.normsg.a.b.oTO.bVQ();
                        if (!com.tencent.mm.plugin.normsg.a.b.oTO.bVI())
                          break label7345;
                        i = 1;
                        parama.wJq = i;
                        parama.vZF = com.tencent.mm.compatible.e.y.Me();
                        parama.wJr = h(new Object[] { Integer.valueOf(parama.vPb), parama.wJs, Integer.valueOf(parama.wJq), Integer.valueOf(parama.vZF) });
                        aw.ZK();
                        c.XL().c(new j.a(63, parama));
                      }
                      if ((paramString != null) && (paramString.equals("ClientCheckGetExtInfo")))
                        com.tencent.mm.sdk.g.d.g(new f.2(this, paramMap), "syscmd_rpt_cc");
                      if ((!bo.isNullOrNil(paramString)) && (paramString.equals("functionmsg")))
                      {
                        ab.d("MicroMsg.BigBallSysCmdMsgConsumer", "subtype functionmsg");
                        ((com.tencent.mm.api.q)com.tencent.mm.kernel.g.M(com.tencent.mm.api.q.class)).getReceiver().a(localException1, paramMap);
                      }
                      if ((!bo.isNullOrNil(paramString)) && (paramString.equals("paymsg")))
                      {
                        i = bo.getInt((String)paramMap.get(".sysmsg.paymsg.PayMsgType"), 0);
                        localObject5 = (String)paramMap.get(".sysmsg.paymsg.appmsgcontent");
                        paramString = (String)paramMap.get(".sysmsg.paymsg.fromusername");
                        parama = (String)paramMap.get(".sysmsg.paymsg.tousername");
                        paramMap = (String)paramMap.get(".sysmsg.paymsg.paymsgid");
                        ab.d("MicroMsg.BigBallSysCmdMsgConsumer", "payMsg, payMsgType: %s, MsgId: %s, fromUsername: %s, toUsername: %s, paymsgid: %s, appMsgContentEncode: %s, ", new Object[] { Integer.valueOf(i), Long.valueOf(localException1.ptF), paramString, parama, paramMap, localObject5 });
                      }
                    }
                    try
                    {
                      localObject2 = URLDecoder.decode((String)localObject5, "UTF-8");
                      if (!bo.isNullOrNil((String)localObject2))
                      {
                        localObject5 = new com/tencent/mm/g/a/ni;
                        ((ni)localObject5).<init>();
                        ((ni)localObject5).cJE.type = i;
                        ((ni)localObject5).cJE.content = ((String)localObject2);
                        ((ni)localObject5).cJE.cEV = paramString;
                        ((ni)localObject5).cJE.toUser = parama;
                        ((ni)localObject5).cJE.cJF = paramMap;
                        com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject5);
                      }
                      AppMethodBeat.o(16267);
                      paramString = (String)localObject6;
                      break;
                      i = 0;
                      break label6606;
                      i = 0;
                      break label6794;
                      i = 0;
                    }
                    catch (Exception paramString)
                    {
                      while (true)
                      {
                        ab.printErrStackTrace("MicroMsg.BigBallSysCmdMsgConsumer", paramString, "", new Object[0]);
                        ab.d("MicroMsg.BigBallSysCmdMsgConsumer", "pay msg, parse failed: %s", new Object[] { paramString.getMessage() });
                      }
                    }
                  }
              }
              label3913: label6606: boolean bool1 = false;
            }
          }
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.model.f
 * JD-Core Version:    0.6.2
 */