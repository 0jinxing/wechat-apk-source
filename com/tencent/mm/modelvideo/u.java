package com.tencent.mm.modelvideo;

import android.content.ContentValues;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.model.bf;
import com.tencent.mm.modelcontrol.d;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.protocal.protobuf.baa;
import com.tencent.mm.protocal.protobuf.cfh;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bi;
import com.tencent.mm.storage.z;
import java.util.Iterator;
import java.util.List;

public final class u
{
  public static int A(int paramInt, String paramString)
  {
    AppMethodBeat.i(50846);
    long l = bo.yz();
    PInt localPInt1 = new PInt();
    PInt localPInt2 = new PInt();
    if ((o.alo().b(paramString, localPInt1, localPInt2)) && (bo.fp(localPInt1.value) < 300L));
    for (int i = localPInt2.value; ; i = 0)
    {
      int j;
      if (i >= 0)
      {
        j = i;
        if (i < paramInt - 1);
      }
      else
      {
        j = 0;
      }
      ab.d("MicroMsg.VideoLogic", "check last play duration result[%d] startTime[%d] filename[%s] cost %d", new Object[] { Integer.valueOf(j), Integer.valueOf(localPInt1.value), paramString, Long.valueOf(bo.az(l)) });
      AppMethodBeat.o(50846);
      return j;
    }
  }

  public static long a(String paramString1, String paramString2, String paramString3, int paramInt)
  {
    AppMethodBeat.i(50828);
    long l;
    if (bo.isNullOrNil(paramString1))
    {
      ab.w("MicroMsg.VideoLogic", "do prepare, but file name is null, type %d", new Object[] { Integer.valueOf(paramInt) });
      AppMethodBeat.o(50828);
      l = -1L;
    }
    while (true)
    {
      return l;
      if (bo.isNullOrNil(paramString2))
      {
        ab.w("MicroMsg.VideoLogic", "do prepare, but toUser is null, type %d", new Object[] { Integer.valueOf(paramInt) });
        AppMethodBeat.o(50828);
        l = -1L;
      }
      else
      {
        s locals = new s();
        locals.fileName = paramString1;
        locals.fXd = 1;
        locals.cIS = paramString2;
        locals.fWW = ((String)com.tencent.mm.kernel.g.RP().Ry().get(2, ""));
        locals.createTime = bo.anT();
        locals.fXb = bo.anT();
        locals.fXj = null;
        locals.fUG = paramString3;
        if (!bo.isNullOrNil(paramString3))
          locals.fXh = 1;
        int i;
        if (62 == paramInt)
        {
          locals.fXh = 0;
          i = 3;
        }
        while (true)
        {
          locals.fXk = i;
          locals.frO = 0;
          locals.status = 106;
          paramString2 = new bi();
          paramString2.ju(locals.getUser());
          paramString2.setType(paramInt);
          paramString2.hO(1);
          paramString2.jv(paramString1);
          paramString2.setStatus(8);
          paramString2.eJ(bf.oC(locals.getUser()));
          l = bf.l(paramString2);
          locals.fXe = ((int)l);
          if (!o.all().b(locals))
            break label307;
          AppMethodBeat.o(50828);
          break;
          if (locals.fXh == 0)
            i = 1;
          else
            i = -1;
        }
        label307: AppMethodBeat.o(50828);
        l = -1L;
      }
    }
  }

  public static boolean a(String paramString1, int paramInt1, String paramString2, String paramString3, int paramInt2, String paramString4, int paramInt3)
  {
    AppMethodBeat.i(50825);
    boolean bool = a(paramString1, paramInt1, paramString2, paramString3, paramInt2, paramString4, paramInt3, null, "");
    AppMethodBeat.o(50825);
    return bool;
  }

  public static boolean a(String paramString1, int paramInt1, String paramString2, String paramString3, int paramInt2, String paramString4, int paramInt3, cfh paramcfh, String paramString5)
  {
    AppMethodBeat.i(50826);
    s locals = new s();
    locals.fileName = paramString1;
    locals.fXd = paramInt1;
    locals.cIS = paramString2;
    locals.fWW = ((String)com.tencent.mm.kernel.g.RP().Ry().get(2, ""));
    locals.createTime = bo.anT();
    locals.fXb = bo.anT();
    locals.fXj = paramString4;
    locals.fUG = paramString3;
    locals.fXm = paramcfh;
    locals.cMn = paramString5;
    if (!bo.isNullOrNil(paramString3))
      locals.fXh = 1;
    if (paramInt2 > 0)
      locals.fXh = 1;
    boolean bool;
    if (62 == paramInt3)
    {
      locals.fXk = 3;
      o.all();
      paramInt1 = t.uj(t.uh(paramString1));
      if (paramInt1 > 0)
        break label196;
      ab.e("MicroMsg.VideoLogic", "get Video size failed :".concat(String.valueOf(paramString1)));
      bool = false;
      AppMethodBeat.o(50826);
    }
    while (true)
    {
      return bool;
      if (paramInt2 > 0)
      {
        locals.fXk = 2;
        break;
      }
      locals.fXk = 1;
      break;
      label196: locals.frO = paramInt1;
      o.all();
      paramString2 = t.ui(paramString1);
      paramInt1 = t.uj(paramString2);
      if (paramInt1 <= 0)
      {
        ab.e("MicroMsg.VideoLogic", "get Thumb size failed :" + paramString2 + " size:" + paramInt1);
        bool = false;
        AppMethodBeat.o(50826);
      }
      else
      {
        locals.fXa = paramInt1;
        ab.i("MicroMsg.VideoLogic", "init record file:" + paramString1 + " thumbsize:" + locals.fXa + " videosize:" + locals.frO + " msgType:" + paramInt3);
        locals.status = 102;
        paramString2 = new bi();
        paramString2.ju(locals.getUser());
        paramString2.setType(paramInt3);
        paramString2.hO(1);
        paramString2.jv(paramString1);
        paramString2.setStatus(1);
        paramString2.eJ(bf.oC(locals.getUser()));
        locals.fXe = ((int)bf.l(paramString2));
        bool = o.all().b(locals);
        AppMethodBeat.o(50826);
      }
    }
  }

  // ERROR //
  public static boolean a(String paramString, PInt paramPInt1, PInt paramPInt2)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_3
    //   2: ldc_w 276
    //   5: invokestatic 13	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   8: aload_0
    //   9: invokestatic 82	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   12: ifeq +19 -> 31
    //   15: ldc 49
    //   17: ldc_w 278
    //   20: invokestatic 280	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   23: ldc_w 276
    //   26: invokestatic 74	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   29: iload_3
    //   30: ireturn
    //   31: new 282	android/media/MediaMetadataRetriever
    //   34: astore 4
    //   36: aload 4
    //   38: invokespecial 283	android/media/MediaMetadataRetriever:<init>	()V
    //   41: aload 4
    //   43: astore 5
    //   45: aload 4
    //   47: aload_0
    //   48: invokevirtual 286	android/media/MediaMetadataRetriever:setDataSource	(Ljava/lang/String;)V
    //   51: aload 4
    //   53: astore 5
    //   55: aload_1
    //   56: aload 4
    //   58: bipush 9
    //   60: invokevirtual 290	android/media/MediaMetadataRetriever:extractMetadata	(I)Ljava/lang/String;
    //   63: iconst_0
    //   64: invokestatic 294	com/tencent/mm/sdk/platformtools/bo:getInt	(Ljava/lang/String;I)I
    //   67: i2l
    //   68: invokestatic 298	com/tencent/mm/sdk/platformtools/bo:mA	(J)I
    //   71: putfield 41	com/tencent/mm/pointers/PInt:value	I
    //   74: aload 4
    //   76: astore 5
    //   78: aload_2
    //   79: aload 4
    //   81: bipush 20
    //   83: invokevirtual 290	android/media/MediaMetadataRetriever:extractMetadata	(I)Ljava/lang/String;
    //   86: iconst_0
    //   87: invokestatic 294	com/tencent/mm/sdk/platformtools/bo:getInt	(Ljava/lang/String;I)I
    //   90: sipush 1000
    //   93: idiv
    //   94: putfield 41	com/tencent/mm/pointers/PInt:value	I
    //   97: aload 4
    //   99: invokevirtual 301	android/media/MediaMetadataRetriever:release	()V
    //   102: ldc 49
    //   104: ldc_w 303
    //   107: iconst_3
    //   108: anewarray 4	java/lang/Object
    //   111: dup
    //   112: iconst_0
    //   113: aload_2
    //   114: getfield 41	com/tencent/mm/pointers/PInt:value	I
    //   117: invokestatic 57	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   120: aastore
    //   121: dup
    //   122: iconst_1
    //   123: aload_1
    //   124: getfield 41	com/tencent/mm/pointers/PInt:value	I
    //   127: invokestatic 57	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   130: aastore
    //   131: dup
    //   132: iconst_2
    //   133: aload_0
    //   134: aastore
    //   135: invokestatic 71	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   138: ldc_w 276
    //   141: invokestatic 74	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   144: iconst_1
    //   145: istore_3
    //   146: goto -117 -> 29
    //   149: astore 6
    //   151: aconst_null
    //   152: astore 4
    //   154: aload 4
    //   156: astore 5
    //   158: ldc 49
    //   160: aload 6
    //   162: ldc_w 305
    //   165: iconst_1
    //   166: anewarray 4	java/lang/Object
    //   169: dup
    //   170: iconst_0
    //   171: aload_0
    //   172: aastore
    //   173: invokestatic 309	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   176: aload 4
    //   178: ifnull -76 -> 102
    //   181: aload 4
    //   183: invokevirtual 301	android/media/MediaMetadataRetriever:release	()V
    //   186: goto -84 -> 102
    //   189: astore_0
    //   190: aconst_null
    //   191: astore 5
    //   193: aload 5
    //   195: ifnull +8 -> 203
    //   198: aload 5
    //   200: invokevirtual 301	android/media/MediaMetadataRetriever:release	()V
    //   203: ldc_w 276
    //   206: invokestatic 74	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   209: aload_0
    //   210: athrow
    //   211: astore_0
    //   212: goto -19 -> 193
    //   215: astore 6
    //   217: goto -63 -> 154
    //
    // Exception table:
    //   from	to	target	type
    //   31	41	149	java/lang/Exception
    //   31	41	189	finally
    //   45	51	211	finally
    //   55	74	211	finally
    //   78	97	211	finally
    //   158	176	211	finally
    //   45	51	215	java/lang/Exception
    //   55	74	215	java/lang/Exception
    //   78	97	215	java/lang/Exception
  }

  public static boolean ae(String paramString, int paramInt)
  {
    int i = 0;
    boolean bool = false;
    AppMethodBeat.i(50837);
    s locals = ut(paramString);
    if (locals == null)
    {
      ab.e("MicroMsg.VideoLogic", "ERR:" + com.tencent.mm.compatible.util.g.Mq() + " getinfo failed: " + paramString);
      AppMethodBeat.o(50837);
    }
    while (true)
    {
      return bool;
      if (paramInt != locals.frO)
      {
        ab.w("MicroMsg.VideoLogic", "download video finish, but file size is not equals db size[%d, %d]", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(locals.frO) });
        locals.frO = paramInt;
        i = 32;
      }
      locals.fWY = paramInt;
      locals.fXb = bo.anT();
      e(locals);
      locals.status = 199;
      locals.bJt = (i | 0x510);
      bool = f(locals);
      ab.i("MicroMsg.VideoLogic", "END!!!  updateRecv  file:" + paramString + " newsize:" + paramInt + " total:" + locals.frO + " status:" + locals.status + " netTimes:" + locals.fXf + " update ret: " + bool);
      AppMethodBeat.o(50837);
    }
  }

  public static void af(String paramString, int paramInt)
  {
    AppMethodBeat.i(50851);
    paramString = ut(paramString);
    if (paramString != null)
    {
      paramString.status = 122;
      paramString.fXc = bo.anT();
      paramString.fXb = bo.anT();
      paramString.egF = paramInt;
      paramString.bJt = 268438784;
      boolean bool = o.all().c(paramString);
      ab.i("MicroMsg.VideoLogic", "set online video Completion ret: " + bool + " status: " + paramString.status);
    }
    AppMethodBeat.o(50851);
  }

  public static boolean ag(String paramString, int paramInt)
  {
    AppMethodBeat.i(50856);
    boolean bool = b(ut(paramString), paramInt);
    AppMethodBeat.o(50856);
    return bool;
  }

  public static boolean b(s params, int paramInt)
  {
    AppMethodBeat.i(50857);
    boolean bool;
    if (params != null)
    {
      params.egF = paramInt;
      params.bJt = 268435456;
      bool = f(params);
      AppMethodBeat.o(50857);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(50857);
    }
  }

  public static boolean c(String paramString1, int paramInt, String paramString2, String paramString3)
  {
    AppMethodBeat.i(50824);
    boolean bool = a(paramString1, paramInt, paramString2, paramString3, 0, "", 43);
    AppMethodBeat.o(50824);
    return bool;
  }

  public static void d(s params)
  {
    AppMethodBeat.i(50833);
    if (params == null)
    {
      ab.e("MicroMsg.VideoLogic", "video info is null");
      AppMethodBeat.o(50833);
    }
    while (true)
    {
      return;
      bi localbi = ((j)com.tencent.mm.kernel.g.K(j.class)).bOr().jf(params.fXe);
      int i = localbi.getType();
      ab.i("MicroMsg.VideoLogic", "ashutest::updateWriteFinMsgInfo, msg type %d", new Object[] { Integer.valueOf(i) });
      if ((43 != i) && (62 != i))
      {
        AppMethodBeat.o(50833);
      }
      else
      {
        localbi.hO(1);
        localbi.ju(params.getUser());
        localbi.eI(params.cKK);
        localbi.setStatus(2);
        localbi.setContent(q.d(params.alt(), params.fXd, false));
        ((j)com.tencent.mm.kernel.g.K(j.class)).bOr().a(params.fXe, localbi);
        ab.d("MicroMsg.VideoLogic", "[oneliang][updateWriteFinMsgInfo], msgId:%d", new Object[] { Long.valueOf(localbi.field_msgId) });
        AppMethodBeat.o(50833);
      }
    }
  }

  public static boolean d(String paramString1, int paramInt, String paramString2, String paramString3)
  {
    AppMethodBeat.i(50827);
    s locals = new s();
    locals.fileName = paramString1;
    locals.fXd = paramInt;
    locals.cIS = paramString2;
    locals.fWW = ((String)com.tencent.mm.kernel.g.RP().Ry().get(2, ""));
    locals.createTime = bo.anT();
    locals.fXb = bo.anT();
    locals.fXj = paramString3;
    locals.fXk = 1;
    o.all();
    locals.frO = t.uj(t.uh(paramString1));
    o.all();
    locals.fXa = t.uj(t.ui(paramString1));
    ab.i("MicroMsg.VideoLogic", "init record file:" + paramString1 + " thumbsize:" + locals.fXa + " videosize:" + locals.frO + " msgType:43");
    locals.status = 102;
    paramString2 = new bi();
    paramString2.ju(locals.getUser());
    paramString2.setType(43);
    paramString2.hO(1);
    paramString2.jv(paramString1);
    paramString2.setStatus(1);
    paramString2.eJ(bf.oC(locals.getUser()));
    locals.fXe = ((int)bf.l(paramString2));
    boolean bool = o.all().b(locals);
    AppMethodBeat.o(50827);
    return bool;
  }

  public static String e(long paramLong, int paramInt)
  {
    AppMethodBeat.i(50849);
    String str = paramLong + "_" + paramInt;
    AppMethodBeat.o(50849);
    return str;
  }

  static boolean e(s params)
  {
    AppMethodBeat.i(50834);
    bi localbi = ((j)com.tencent.mm.kernel.g.K(j.class)).bOr().jf(params.fXe);
    int i = localbi.getType();
    ab.i("MicroMsg.VideoLogic", "ashutest::update read fin msg info, msg type %d", new Object[] { Integer.valueOf(i) });
    if ((43 != i) && (62 != i))
      AppMethodBeat.o(50834);
    for (boolean bool = false; ; bool = true)
    {
      return bool;
      localbi.eI(params.cKK);
      localbi.setContent(q.d(params.alt(), params.fXd, false));
      localbi.ju(params.getUser());
      ab.d("MicroMsg.VideoLogic", "set msg content :" + localbi.field_content);
      ((j)com.tencent.mm.kernel.g.K(j.class)).bOr().b(params.cKK, localbi);
      ab.d("MicroMsg.VideoLogic", "[oneliang][updateReadFinMsgInfo], msgId:%d", new Object[] { Long.valueOf(localbi.field_msgId) });
      if (localbi.bwt())
        ab.i("MicroMsg.VideoLogic", "on receive sight, sightFileSize %d bytes", new Object[] { Integer.valueOf(params.frO) });
      AppMethodBeat.o(50834);
    }
  }

  public static int f(long paramLong, String paramString)
  {
    int i = -1;
    AppMethodBeat.i(50850);
    if (bo.isNullOrNil(paramString))
      AppMethodBeat.o(50850);
    while (true)
    {
      return i;
      try
      {
        paramString = paramString.split("_");
        int j;
        if (paramString != null)
        {
          j = paramString.length;
          if (j == 2);
        }
        else
        {
          AppMethodBeat.o(50850);
          continue;
        }
        if (bo.getLong(paramString[0], 0L) == paramLong)
        {
          j = bo.getInt(paramString[1], 0);
          i = j;
          AppMethodBeat.o(50850);
        }
      }
      catch (Exception paramString)
      {
        ab.e("MicroMsg.VideoLogic", "parseEnterVideoOpTips error: " + paramString.toString());
        AppMethodBeat.o(50850);
      }
    }
  }

  public static void f(String paramString, int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(50847);
    if (bo.isNullOrNil(paramString))
    {
      ab.w("MicroMsg.VideoLogic", "noteVideoPlayHistory error filename[%s]", new Object[] { paramString });
      AppMethodBeat.o(50847);
      return;
    }
    int i = paramInt;
    if (paramInt < 0)
      i = 0;
    i /= 1000;
    long l1 = bo.yz();
    x localx;
    label86: ContentValues localContentValues;
    long l2;
    boolean bool;
    if (!o.alo().uB(paramString))
    {
      localx = o.alo();
      int j = (int)(bo.anU() / 1000L);
      if (paramBoolean)
      {
        paramInt = 1;
        if (bo.isNullOrNil(paramString))
          break label258;
        localContentValues = new ContentValues();
        localContentValues.put("filename", paramString);
        localContentValues.put("starttime", Integer.valueOf(j));
        localContentValues.put("playduration", Integer.valueOf(i));
        localContentValues.put("downloadway", Integer.valueOf(paramInt));
        l2 = localx.bSd.insert("VideoPlayHistory", "filename", localContentValues);
        ab.i("MicroMsg.VideoPlayHistoryStorage", "insert video play history ret : ".concat(String.valueOf(l2)));
        if (l2 <= 0L)
          break label258;
        bool = true;
      }
    }
    while (true)
    {
      ab.d("MicroMsg.VideoLogic", "noteVideoPlayHistory ret %b filename %s playDuration %d isOnlinePlay %b cost %d", new Object[] { Boolean.valueOf(bool), paramString, Integer.valueOf(i), Boolean.valueOf(paramBoolean), Long.valueOf(bo.az(l1)) });
      AppMethodBeat.o(50847);
      break;
      paramInt = 0;
      break label86;
      label258: bool = false;
      continue;
      localx = o.alo();
      paramInt = (int)(bo.anU() / 1000L);
      if (!bo.isNullOrNil(paramString))
      {
        localContentValues = new ContentValues();
        localContentValues.put("starttime", Integer.valueOf(paramInt));
        localContentValues.put("playduration", Integer.valueOf(i));
        l2 = localx.bSd.update("VideoPlayHistory", localContentValues, "filename=?", new String[] { paramString });
        ab.i("MicroMsg.VideoPlayHistoryStorage", "update video play history ret : ".concat(String.valueOf(l2)));
        if (l2 > 0L)
          bool = true;
      }
      else
      {
        bool = false;
      }
    }
  }

  public static boolean f(s params)
  {
    boolean bool = false;
    AppMethodBeat.i(50841);
    if (params == null)
      AppMethodBeat.o(50841);
    while (true)
    {
      return bool;
      if (((params.getFileName() == null) || (params.getFileName().length() <= 0)) && (params.bJt == -1))
      {
        AppMethodBeat.o(50841);
      }
      else
      {
        bool = o.all().c(params);
        AppMethodBeat.o(50841);
      }
    }
  }

  public static int fV(long paramLong)
  {
    AppMethodBeat.i(50832);
    Iterator localIterator = o.all().fU(paramLong).iterator();
    Object localObject;
    int i;
    while (localIterator.hasNext())
    {
      localObject = (s)localIterator.next();
      i = ((s)localObject).status;
      ((s)localObject).status = 200;
      ab.d("MicroMsg.VideoLogic", com.tencent.mm.compatible.util.g.Mq() + "startSend file:" + ((s)localObject).getFileName() + " status:[" + i + "->" + ((s)localObject).status + "]");
      ((s)localObject).fXc = bo.anT();
      ((s)localObject).fXb = bo.anT();
      ((s)localObject).bJt = 3328;
      if (!f((s)localObject))
      {
        ab.e("MicroMsg.VideoLogic", "ERR on start MassSend:" + com.tencent.mm.compatible.util.g.Mq() + " update failed: " + ((s)localObject).getFileName());
        i = 0 - com.tencent.mm.compatible.util.g.getLine();
        AppMethodBeat.o(50832);
      }
    }
    while (true)
    {
      return i;
      localObject = o.alr();
      com.tencent.mm.kernel.g.RS().aa(new m.3((m)localObject));
      i = 0;
      AppMethodBeat.o(50832);
    }
  }

  public static int g(s params)
  {
    AppMethodBeat.i(50843);
    int i;
    if (params.frO == 0)
    {
      i = 0;
      AppMethodBeat.o(50843);
    }
    while (true)
    {
      return i;
      ab.d("MicroMsg.VideoLogic", "cdntra getDownloadProgress :" + params.fWY + " " + params.frO);
      i = params.fWY * 100 / params.frO;
      AppMethodBeat.o(50843);
    }
  }

  public static int h(s params)
  {
    AppMethodBeat.i(50844);
    int i;
    if (params.frO == 0)
    {
      i = 0;
      AppMethodBeat.o(50844);
    }
    while (true)
    {
      return i;
      ab.d("MicroMsg.VideoLogic", "cdntra getUploadProgress :" + params.fVG + " " + params.frO);
      i = params.fVG * 100 / params.frO;
      AppMethodBeat.o(50844);
    }
  }

  public static void n(String paramString, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(50830);
    s locals = ut(paramString);
    if (locals == null)
    {
      ab.w("MicroMsg.VideoLogic", "update, but video info is null, fileName %s, msgType %d", new Object[] { paramString, Integer.valueOf(paramInt2) });
      AppMethodBeat.o(50830);
    }
    while (true)
    {
      return;
      o.all();
      int i = t.uj(t.uh(paramString));
      ab.i("MicroMsg.VideoLogic", "update, video size %d, msgType %d", new Object[] { Integer.valueOf(i), Integer.valueOf(paramInt2) });
      locals.frO = i;
      locals.fXd = paramInt1;
      Object localObject = locals.fXn;
      ((baa)localObject).wDO = false;
      locals.fXn = ((baa)localObject);
      locals.status = 102;
      o.all();
      locals.fXa = t.uj(t.ui(paramString));
      ab.i("MicroMsg.VideoLogic", "update prepare:" + paramString + " thumbsize:" + locals.fXa);
      locals.bJt = 4512;
      ab.i("MicroMsg.VideoLogic", "update to db, result %B, msgType %d", new Object[] { Boolean.valueOf(f(locals)), Integer.valueOf(paramInt2) });
      localObject = ((j)com.tencent.mm.kernel.g.K(j.class)).bOr().jf(locals.fXe);
      ab.i("MicroMsg.VideoLogic", "before update msgInfo, localId[%d] svrId[%d] talker[%s] type[%d] isSend[%d] imgPath[%s], status[%d] createTime[%d]", new Object[] { Long.valueOf(((cy)localObject).field_msgId), Long.valueOf(((cy)localObject).field_msgSvrId), ((cy)localObject).field_talker, Integer.valueOf(((bi)localObject).getType()), Integer.valueOf(((cy)localObject).field_isSend), ((cy)localObject).field_imgPath, Integer.valueOf(((cy)localObject).field_status), Long.valueOf(((cy)localObject).field_createTime) });
      ((bi)localObject).ju(locals.getUser());
      ((bi)localObject).setType(paramInt2);
      ((bi)localObject).hO(1);
      ((bi)localObject).jv(paramString);
      ((bi)localObject).setStatus(1);
      ab.i("MicroMsg.VideoLogic", "after update msgInfo, localId[%d] svrId[%d] talker[%s] type[%d] isSend[%d] imgPath[%s], status[%d] createTime[%d]", new Object[] { Long.valueOf(((cy)localObject).field_msgId), Long.valueOf(((cy)localObject).field_msgSvrId), ((cy)localObject).field_talker, Integer.valueOf(((bi)localObject).getType()), Integer.valueOf(((cy)localObject).field_isSend), ((cy)localObject).field_imgPath, Integer.valueOf(((cy)localObject).field_status), Long.valueOf(((cy)localObject).field_createTime) });
      ((j)com.tencent.mm.kernel.g.K(j.class)).bOr().a(locals.fXe, (bi)localObject);
      AppMethodBeat.o(50830);
    }
  }

  public static long t(String paramString1, String paramString2, String paramString3)
  {
    AppMethodBeat.i(50829);
    long l = a(paramString1, paramString2, paramString3, 43);
    AppMethodBeat.o(50829);
    return l;
  }

  public static int uA(String paramString)
  {
    AppMethodBeat.i(50855);
    s locals = ut(paramString);
    int i;
    if (locals == null)
    {
      ab.e("MicroMsg.VideoLogic", "ERR:" + com.tencent.mm.compatible.util.g.Mq() + " getinfo failed: " + paramString);
      i = 0 - com.tencent.mm.compatible.util.g.getLine();
      AppMethodBeat.o(50855);
    }
    while (true)
    {
      return i;
      if ((locals.status != 111) && (locals.status != 113) && (locals.status != 121) && (locals.status != 122) && (locals.status != 123))
      {
        ab.e("MicroMsg.VideoLogic", "ERR:" + com.tencent.mm.compatible.util.g.Mq() + " get status failed: " + paramString + " status:" + locals.status);
        i = 0 - com.tencent.mm.compatible.util.g.getLine();
        AppMethodBeat.o(50855);
      }
      else
      {
        i = 256;
        d.afF();
        if (d.afM())
          locals.status = 122;
        while (true)
        {
          locals.fXc = bo.anT();
          locals.fXb = bo.anT();
          locals.bJt = (i | 0x800 | 0x400);
          if (f(locals))
            break label299;
          ab.e("MicroMsg.VideoLogic", "ERR:" + com.tencent.mm.compatible.util.g.Mq() + " update failed: " + paramString);
          i = 0 - com.tencent.mm.compatible.util.g.getLine();
          AppMethodBeat.o(50855);
          break;
          ab.w("MicroMsg.VideoLogic", "start complete online video, but can not stream video now!");
          locals.status = 112;
          locals.fWY = 0;
          i = 272;
        }
        label299: o.alq().alG();
        o.alq().run();
        AppMethodBeat.o(50855);
        i = 0;
      }
    }
  }

  public static boolean ul(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(50821);
    if (paramString == null)
      AppMethodBeat.o(50821);
    while (true)
    {
      return bool;
      paramString = ut(paramString);
      if (paramString == null)
      {
        AppMethodBeat.o(50821);
      }
      else if (paramString.fXf >= 2500)
      {
        AppMethodBeat.o(50821);
      }
      else
      {
        paramString.fXf += 1;
        paramString.bJt = 16384;
        bool = f(paramString);
        AppMethodBeat.o(50821);
      }
    }
  }

  public static boolean um(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(50822);
    com.tencent.mm.plugin.report.service.h.pYm.a(111L, 218L, 1L, false);
    ab.w("MicroMsg.VideoLogic", "setError file:%s stack:[%s]", new Object[] { paramString, bo.dpG() });
    o.alq().uC(paramString);
    if (paramString == null)
      AppMethodBeat.o(50822);
    while (true)
    {
      return bool;
      s locals = ut(paramString);
      if (locals == null)
      {
        ab.e("MicroMsg.VideoLogic", "Set error failed file:".concat(String.valueOf(paramString)));
        AppMethodBeat.o(50822);
      }
      else
      {
        locals.status = 198;
        locals.fXb = (System.currentTimeMillis() / 1000L);
        locals.bJt = 1280;
        baa localbaa = locals.fXn;
        localbaa.wDQ = 0;
        locals.fXn = localbaa;
        bool = f(locals);
        ab.d("MicroMsg.VideoLogic", "setError file:" + paramString + " msgid:" + locals.fXe + " old stat:" + locals.status);
        if ((locals == null) || (locals.fXe == 0))
        {
          AppMethodBeat.o(50822);
        }
        else
        {
          paramString = ((j)com.tencent.mm.kernel.g.K(j.class)).bOr().jf(locals.fXe);
          int i = paramString.getType();
          ab.i("MicroMsg.VideoLogic", "set error, msg type %d", new Object[] { Integer.valueOf(i) });
          if ((43 != i) && (62 != i))
          {
            AppMethodBeat.o(50822);
          }
          else
          {
            com.tencent.mm.plugin.report.e.pXa.a(111L, 32L, 1L, true);
            paramString.ju(locals.getUser());
            paramString.setContent(q.d(locals.alt(), -1L, true));
            ab.d("MicroMsg.VideoLogic", "[oneliang][setError]");
            ((j)com.tencent.mm.kernel.g.K(j.class)).bOr().a(paramString.field_msgId, paramString);
            AppMethodBeat.o(50822);
          }
        }
      }
    }
  }

  public static boolean un(String paramString)
  {
    AppMethodBeat.i(50823);
    s locals = ut(paramString);
    boolean bool;
    if ((locals == null) || (locals.fXe == 0))
    {
      AppMethodBeat.o(50823);
      bool = false;
    }
    while (true)
    {
      return bool;
      paramString = ((j)com.tencent.mm.kernel.g.K(j.class)).bOr().jf(locals.fXe);
      int i = paramString.getType();
      ab.i("MicroMsg.VideoLogic", "ashutest::setBlack, msg type %d", new Object[] { Integer.valueOf(i) });
      if ((43 != i) && (62 != i))
      {
        AppMethodBeat.o(50823);
        bool = false;
      }
      else
      {
        paramString.setContent(q.d(locals.alt(), locals.fXd, false));
        paramString.setStatus(2);
        ((j)com.tencent.mm.kernel.g.K(j.class)).bOr().a(locals.fXe, paramString);
        locals.status = 197;
        locals.fXb = bo.anT();
        locals.bJt = 1280;
        ab.d("MicroMsg.VideoLogic", "[oneliang][setBlack]");
        bool = f(locals);
        AppMethodBeat.o(50823);
      }
    }
  }

  public static int uo(String paramString)
  {
    AppMethodBeat.i(50831);
    s locals = ut(paramString);
    int i;
    if (locals == null)
    {
      ab.e("MicroMsg.VideoLogic", "ERR:" + com.tencent.mm.compatible.util.g.Mq() + " getinfo failed: " + paramString);
      i = 0 - com.tencent.mm.compatible.util.g.getLine();
      AppMethodBeat.o(50831);
    }
    while (true)
    {
      return i;
      if ((locals.status != 102) && (locals.status != 105))
      {
        ab.e("MicroMsg.VideoLogic", "ERR:" + com.tencent.mm.compatible.util.g.Mq() + " get status failed: " + paramString + " status:" + locals.status);
        i = 0 - com.tencent.mm.compatible.util.g.getLine();
        AppMethodBeat.o(50831);
      }
      else
      {
        i = locals.status;
        if ((locals.status != 102) && (locals.fXa == locals.fWZ));
        for (locals.status = 104; ; locals.status = 103)
        {
          ab.d("MicroMsg.VideoLogic", com.tencent.mm.compatible.util.g.Mq() + "startSend file:" + paramString + " status:[" + i + "->" + locals.status + "]");
          locals.fXc = bo.anT();
          locals.fXb = bo.anT();
          locals.bJt = 3328;
          if (f(locals))
            break label320;
          ab.e("MicroMsg.VideoLogic", "ERR:" + com.tencent.mm.compatible.util.g.Mq() + " update failed: " + paramString);
          i = 0 - com.tencent.mm.compatible.util.g.getLine();
          AppMethodBeat.o(50831);
          break;
        }
        label320: o.alq().run();
        i = 0;
        AppMethodBeat.o(50831);
      }
    }
  }

  public static int up(String paramString)
  {
    AppMethodBeat.i(50835);
    s locals = ut(paramString);
    int i;
    if (locals == null)
    {
      ab.e("MicroMsg.VideoLogic", "ERR:" + com.tencent.mm.compatible.util.g.Mq() + " getinfo failed: " + paramString);
      i = 0 - com.tencent.mm.compatible.util.g.getLine();
      AppMethodBeat.o(50835);
    }
    while (true)
    {
      return i;
      if ((locals.status != 111) && (locals.status != 113) && (locals.status != 121) && (locals.status != 122) && (locals.status != 123))
      {
        ab.e("MicroMsg.VideoLogic", "ERR:" + com.tencent.mm.compatible.util.g.Mq() + " get status failed: " + paramString + " status:" + locals.status);
        i = 0 - com.tencent.mm.compatible.util.g.getLine();
        AppMethodBeat.o(50835);
      }
      else
      {
        locals.status = 112;
        locals.fXc = bo.anT();
        locals.fXb = bo.anT();
        locals.bJt = 3328;
        if (!f(locals))
        {
          ab.e("MicroMsg.VideoLogic", "ERR:" + com.tencent.mm.compatible.util.g.Mq() + " update failed: " + paramString);
          i = 0 - com.tencent.mm.compatible.util.g.getLine();
          AppMethodBeat.o(50835);
        }
        else
        {
          o.alq().alG();
          o.alq().run();
          i = 0;
          AppMethodBeat.o(50835);
        }
      }
    }
  }

  public static int uq(String paramString)
  {
    AppMethodBeat.i(50836);
    s locals = ut(paramString);
    int i;
    if (locals == null)
    {
      ab.e("MicroMsg.VideoLogic", "ERR:" + com.tencent.mm.compatible.util.g.Mq() + " getinfo failed: " + paramString);
      i = 0 - com.tencent.mm.compatible.util.g.getLine();
      AppMethodBeat.o(50836);
    }
    while (true)
    {
      return i;
      if ((locals.status != 112) && (locals.status != 120) && (locals.status != 122) && (locals.status != 123))
      {
        ab.e("MicroMsg.VideoLogic", "ERR:" + com.tencent.mm.compatible.util.g.Mq() + " get status failed: " + paramString + " status:" + locals.status);
        i = 0 - com.tencent.mm.compatible.util.g.getLine();
        AppMethodBeat.o(50836);
      }
      else
      {
        locals.status = 113;
        locals.fXb = bo.anT();
        locals.bJt = 1280;
        if (!f(locals))
        {
          ab.e("MicroMsg.VideoLogic", "ERR:" + com.tencent.mm.compatible.util.g.Mq() + " update failed: " + paramString);
          i = 0 - com.tencent.mm.compatible.util.g.getLine();
          AppMethodBeat.o(50836);
        }
        else
        {
          i = 0;
          AppMethodBeat.o(50836);
        }
      }
    }
  }

  public static boolean ur(String paramString)
  {
    AppMethodBeat.i(50838);
    ab.i("MicroMsg.VideoLogic", "resetMsgRecv fileName : ".concat(String.valueOf(paramString)));
    s locals = new s();
    locals.status = 112;
    locals.fXb = bo.anT();
    locals.fXc = bo.anT();
    locals.fileName = paramString;
    locals.bJt = 3328;
    boolean bool;
    if (!f(locals))
    {
      bool = false;
      AppMethodBeat.o(50838);
    }
    while (true)
    {
      return bool;
      o.alq().run();
      bool = true;
      AppMethodBeat.o(50838);
    }
  }

  public static boolean us(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(50839);
    s locals = ut(paramString);
    if (locals == null)
      AppMethodBeat.o(50839);
    while (true)
    {
      return bool;
      ab.i("MicroMsg.VideoLogic", "rsetMsgSend %s", new Object[] { paramString });
      paramString = locals.fXn;
      if (paramString != null)
      {
        paramString.wDQ = 0;
        locals.fXn = paramString;
      }
      if (locals.fWZ < locals.fXa);
      for (locals.status = 103; ; locals.status = 104)
      {
        locals.createTime = bo.anT();
        locals.fXb = bo.anT();
        locals.fXc = bo.anT();
        locals.bJt = 536874752;
        if (f(locals))
          break label130;
        AppMethodBeat.o(50839);
        break;
      }
      label130: o.alq().run();
      AppMethodBeat.o(50839);
      bool = true;
    }
  }

  public static s ut(String paramString)
  {
    AppMethodBeat.i(50840);
    if (bo.isNullOrNil(paramString))
    {
      paramString = null;
      AppMethodBeat.o(50840);
    }
    while (true)
    {
      return paramString;
      paramString = o.all().uf(paramString);
      AppMethodBeat.o(50840);
    }
  }

  public static String uu(String paramString)
  {
    AppMethodBeat.i(50842);
    String str = com.tencent.mm.compatible.util.e.euR + bo.anU() + ".mp4";
    if (com.tencent.mm.vfs.e.y(paramString, str) < 0L)
    {
      paramString = null;
      AppMethodBeat.o(50842);
    }
    while (true)
    {
      return paramString;
      AppMethodBeat.o(50842);
      paramString = str;
    }
  }

  public static boolean uv(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(50845);
    if (bo.isNullOrNil(paramString))
    {
      ab.w("MicroMsg.VideoLogic", "check short video was replaced, but filename is null.");
      AppMethodBeat.o(50845);
    }
    while (true)
    {
      return bool;
      ab.d("MicroMsg.VideoLogic", "checkShortVideoWasReplaced filename: ".concat(String.valueOf(paramString)));
      Object localObject = ut(paramString);
      if ((localObject != null) && (((s)localObject).status == 199))
      {
        int i = ((s)localObject).frO;
        o.all();
        int j = (int)com.tencent.mm.vfs.e.asZ(t.uh(paramString));
        ab.d("MicroMsg.VideoLogic", "it short video file size[%d] infoLen[%d]", new Object[] { Integer.valueOf(j), Integer.valueOf(i) });
        if ((j > 0) && (Math.abs(j - i) > 16))
        {
          ab.w("MicroMsg.VideoLogic", "it error short video can not retransmit. file size[%d], video info size[%d]", new Object[] { Integer.valueOf(j), Integer.valueOf(i) });
          paramString = ((s)localObject).getFileName();
          com.tencent.mm.plugin.report.service.h.pYm.a(111L, 217L, 1L, false);
          paramString = ut(paramString);
          if (paramString != null)
          {
            localObject = ((j)com.tencent.mm.kernel.g.K(j.class)).bOr().jf(paramString.fXe);
            i = ((bi)localObject).getType();
            ab.i("MicroMsg.VideoLogic", "ashutest::setBroken, msg type %d", new Object[] { Integer.valueOf(i) });
            if ((43 == i) || (62 == i))
            {
              ((bi)localObject).setContent(q.d(paramString.alt(), paramString.fXd, false));
              ((bi)localObject).setStatus(2);
              ((j)com.tencent.mm.kernel.g.K(j.class)).bOr().a(paramString.fXe, (bi)localObject);
              paramString.status = 196;
              paramString.fXb = bo.anT();
              paramString.bJt = 1280;
              ab.d("MicroMsg.VideoLogic", "[oneliang][setBroken]");
              f(paramString);
            }
          }
          AppMethodBeat.o(50845);
          bool = true;
        }
      }
      else
      {
        AppMethodBeat.o(50845);
      }
    }
  }

  public static void uw(String paramString)
  {
    boolean bool = true;
    AppMethodBeat.i(50848);
    if (bo.isNullOrNil(paramString))
    {
      AppMethodBeat.o(50848);
      return;
    }
    if (o.alo().bSd.delete("VideoPlayHistory", "filename= ?", new String[] { paramString }) > 0);
    while (true)
    {
      ab.d("MicroMsg.VideoLogic", "delete video play history ret : " + bool + " filename : " + paramString);
      AppMethodBeat.o(50848);
      break;
      bool = false;
    }
  }

  public static boolean ux(String paramString)
  {
    AppMethodBeat.i(50852);
    s locals = ut(paramString);
    boolean bool;
    if (locals != null)
    {
      locals.videoFormat = 2;
      locals.bJt = 2;
      bool = o.all().c(locals);
      ab.i("MicroMsg.VideoLogic", "set VideoFormat ret[%b] filename[%s] format[%d]", new Object[] { Boolean.valueOf(bool), paramString, Integer.valueOf(2) });
      AppMethodBeat.o(50852);
    }
    while (true)
    {
      return bool;
      AppMethodBeat.o(50852);
      bool = false;
    }
  }

  public static boolean uy(String paramString)
  {
    AppMethodBeat.i(50853);
    paramString = ut(paramString);
    boolean bool;
    if (paramString != null)
    {
      paramString.videoFormat = 2;
      paramString.status = 199;
      paramString.fXc = bo.anT();
      paramString.fXb = bo.anT();
      paramString.egF = 19;
      paramString.bJt = 268438786;
      bool = o.all().c(paramString);
      ab.i("MicroMsg.VideoLogic", "set hevc video Completion ret: " + bool + " status: " + paramString.status);
      AppMethodBeat.o(50853);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(50853);
    }
  }

  public static boolean uz(String paramString)
  {
    AppMethodBeat.i(50854);
    paramString = ut(paramString);
    boolean bool;
    if (paramString != null)
    {
      paramString.videoFormat = 2;
      paramString.bJt = 2;
      bool = o.all().c(paramString);
      ab.i("MicroMsg.VideoLogic", "set hevc video format ret: " + bool + " status: " + paramString.status);
      AppMethodBeat.o(50854);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(50854);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelvideo.u
 * JD-Core Version:    0.6.2
 */