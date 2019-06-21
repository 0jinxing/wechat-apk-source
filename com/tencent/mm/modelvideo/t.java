package com.tencent.mm.modelvideo;

import android.content.ContentValues;
import android.database.Cursor;
import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.e.l;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.vfs.b;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Vector;
import junit.framework.Assert;

public final class t
{
  private static long fXo = 0L;
  public static final String[] fnj = { "CREATE TABLE IF NOT EXISTS videoinfo2 ( filename text  PRIMARY KEY , clientid text  , msgsvrid int  , netoffset int  , filenowsize int  , totallen int  , thumbnetoffset int  , thumblen int  , status int  , createtime long  , lastmodifytime long  , downloadtime long  , videolength int  , msglocalid int  , nettimes int  , cameratype int  , user text  , human text  , reserved1 int  , reserved2 int  , reserved3 text  , reserved4 text  , videofuncflag int ,masssendid long ,masssendlist text,videomd5 text, streamvideo byte[], statextstr text, downloadscene int, mmsightextinfo byte[], preloadsize int, videoformat int )", "CREATE INDEX IF NOT EXISTS  video_status_index ON videoinfo2 ( status,downloadtime )", "CREATE TABLE IF NOT EXISTS videoinfo ( filename text  PRIMARY KEY , clientid text  , msgsvrid int  , netoffset int  , filenowsize int  , totallen int  , thumbnetoffset int  , thumblen int  , status int  , createtime long  , lastmodifytime long  , downloadtime long  , videolength int  , msglocalid int  , nettimes int  , cameratype int  , user text  , human text  , reserved1 int  , reserved2 int  , reserved3 text  , reserved4 text  , videofuncflag int ,masssendid long ,masssendlist text,videomd5 text, streamvideo byte[], statextstr text, downloadscene int, mmsightextinfo byte[], preloadsize int, videoformat int )", "alter table videoinfo2 add videofuncflag int ;", "alter table videoinfo2 add masssendid long default 0;", "alter table videoinfo2 add masssendlist text ;", "alter table videoinfo2 add videomd5 text ;", "alter table videoinfo2 add streamvideo byte[] ;", "alter table videoinfo2 add statextstr text ;", "alter table videoinfo2 add downloadscene int ;", "alter table videoinfo2 add mmsightextinfo byte[] ;", "alter table videoinfo2 add preloadsize int ;", "alter table videoinfo2 add videoformat int ;", "alter table videoinfo add videofuncflag int ;", "alter table videoinfo add masssendid long default 0;", "alter table videoinfo add masssendlist text ;", "alter table videoinfo add videomd5 text ;", "alter table videoinfo add streamvideo byte[] ;", "alter table videoinfo add statextstr text ;", "alter table videoinfo add downloadscene int ;", "alter table videoinfo add mmsightextinfo byte[] ;", "alter table videoinfo add preloadsize int ;", "alter table videoinfo add videoformat int ;", "insert into videoinfo2 select * from videoinfo ;", "delete from videoinfo ;", "CREATE INDEX IF NOT EXISTS  massSendIdIndex ON videoinfo2 ( masssendid )", "CREATE INDEX IF NOT EXISTS  LastModifyTimeIndex ON videoinfo2 ( lastmodifytime )", "CREATE TABLE IF NOT EXISTS  VideoHash  (size int , CreateTime long, hash text ,  cdnxml text, orgpath text);", "CREATE INDEX IF NOT EXISTS  VideoHashSizeIndex ON VideoHash ( size  )", "CREATE INDEX IF NOT EXISTS  VideoHashTimeIndex ON VideoHash ( CreateTime  )" };
  public com.tencent.mm.cd.h fni;
  l<t.a, a.a> fry;

  public t(com.tencent.mm.cd.h paramh)
  {
    AppMethodBeat.i(50800);
    this.fry = new t.1(this);
    this.fni = paramh;
    AppMethodBeat.o(50800);
  }

  // ERROR //
  public static int a(String paramString, int paramInt, byte[] paramArrayOfByte)
  {
    // Byte code:
    //   0: ldc 119
    //   2: invokestatic 103	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: aload_0
    //   6: invokestatic 125	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   9: ifeq +44 -> 53
    //   12: ldc 127
    //   14: new 129	java/lang/StringBuilder
    //   17: dup
    //   18: ldc 131
    //   20: invokespecial 134	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   23: invokestatic 140	com/tencent/mm/compatible/util/g:Mq	()Ljava/lang/String;
    //   26: invokevirtual 144	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   29: ldc 146
    //   31: invokevirtual 144	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   34: invokevirtual 149	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   37: invokestatic 155	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   40: iconst_0
    //   41: invokestatic 159	com/tencent/mm/compatible/util/g:getLine	()I
    //   44: isub
    //   45: istore_1
    //   46: ldc 119
    //   48: invokestatic 115	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   51: iload_1
    //   52: ireturn
    //   53: iload_1
    //   54: ifge +58 -> 112
    //   57: ldc 127
    //   59: new 129	java/lang/StringBuilder
    //   62: dup
    //   63: ldc 131
    //   65: invokespecial 134	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   68: invokestatic 140	com/tencent/mm/compatible/util/g:Mq	()Ljava/lang/String;
    //   71: invokevirtual 144	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   74: ldc 161
    //   76: invokevirtual 144	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   79: aload_0
    //   80: invokevirtual 144	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   83: ldc 163
    //   85: invokevirtual 144	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   88: iload_1
    //   89: invokevirtual 166	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   92: invokevirtual 149	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   95: invokestatic 155	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   98: iconst_0
    //   99: invokestatic 159	com/tencent/mm/compatible/util/g:getLine	()I
    //   102: isub
    //   103: istore_1
    //   104: ldc 119
    //   106: invokestatic 115	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   109: goto -58 -> 51
    //   112: aload_2
    //   113: invokestatic 170	com/tencent/mm/sdk/platformtools/bo:cb	([B)Z
    //   116: ifeq +54 -> 170
    //   119: ldc 127
    //   121: new 129	java/lang/StringBuilder
    //   124: dup
    //   125: ldc 131
    //   127: invokespecial 134	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   130: invokestatic 140	com/tencent/mm/compatible/util/g:Mq	()Ljava/lang/String;
    //   133: invokevirtual 144	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   136: ldc 161
    //   138: invokevirtual 144	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   141: aload_0
    //   142: invokevirtual 144	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   145: ldc 172
    //   147: invokevirtual 144	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   150: invokevirtual 149	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   153: invokestatic 155	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   156: iconst_0
    //   157: invokestatic 159	com/tencent/mm/compatible/util/g:getLine	()I
    //   160: isub
    //   161: istore_1
    //   162: ldc 119
    //   164: invokestatic 115	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   167: goto -116 -> 51
    //   170: new 174	com/tencent/mm/compatible/util/g$a
    //   173: dup
    //   174: invokespecial 175	com/tencent/mm/compatible/util/g$a:<init>	()V
    //   177: astore_3
    //   178: new 177	java/io/RandomAccessFile
    //   181: astore 4
    //   183: aload 4
    //   185: aload_0
    //   186: ldc 179
    //   188: invokespecial 181	java/io/RandomAccessFile:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   191: aload 4
    //   193: astore 5
    //   195: aload_3
    //   196: invokevirtual 185	com/tencent/mm/compatible/util/g$a:Mr	()J
    //   199: lstore 6
    //   201: aload 4
    //   203: astore 5
    //   205: aload 4
    //   207: iload_1
    //   208: i2l
    //   209: invokevirtual 189	java/io/RandomAccessFile:seek	(J)V
    //   212: aload 4
    //   214: astore 5
    //   216: aload_3
    //   217: invokevirtual 185	com/tencent/mm/compatible/util/g$a:Mr	()J
    //   220: lstore 8
    //   222: aload 4
    //   224: astore 5
    //   226: aload 4
    //   228: aload_2
    //   229: iconst_0
    //   230: aload_2
    //   231: arraylength
    //   232: invokevirtual 193	java/io/RandomAccessFile:write	([BII)V
    //   235: aload 4
    //   237: astore 5
    //   239: aload_3
    //   240: invokevirtual 185	com/tencent/mm/compatible/util/g$a:Mr	()J
    //   243: lstore 10
    //   245: aload 4
    //   247: astore 5
    //   249: aload 4
    //   251: invokevirtual 196	java/io/RandomAccessFile:getFilePointer	()J
    //   254: l2i
    //   255: istore 12
    //   257: aload 4
    //   259: astore 5
    //   261: aload_3
    //   262: invokevirtual 185	com/tencent/mm/compatible/util/g$a:Mr	()J
    //   265: lstore 13
    //   267: aload 4
    //   269: invokevirtual 199	java/io/RandomAccessFile:close	()V
    //   272: ldc 127
    //   274: new 129	java/lang/StringBuilder
    //   277: dup
    //   278: ldc 201
    //   280: invokespecial 134	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   283: invokestatic 140	com/tencent/mm/compatible/util/g:Mq	()Ljava/lang/String;
    //   286: invokevirtual 144	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   289: ldc 161
    //   291: invokevirtual 144	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   294: aload_0
    //   295: invokevirtual 144	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   298: ldc 203
    //   300: invokevirtual 144	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   303: iload_1
    //   304: invokevirtual 166	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   307: ldc 205
    //   309: invokevirtual 144	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   312: aload_2
    //   313: arraylength
    //   314: invokevirtual 166	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   317: invokevirtual 149	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   320: invokestatic 208	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   323: ldc 127
    //   325: new 129	java/lang/StringBuilder
    //   328: dup
    //   329: ldc 201
    //   331: invokespecial 134	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   334: invokestatic 140	com/tencent/mm/compatible/util/g:Mq	()Ljava/lang/String;
    //   337: invokevirtual 144	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   340: ldc 161
    //   342: invokevirtual 144	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   345: aload_0
    //   346: invokevirtual 144	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   349: ldc 210
    //   351: invokevirtual 144	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   354: lload 6
    //   356: invokevirtual 213	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   359: ldc 215
    //   361: invokevirtual 144	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   364: lload 8
    //   366: invokevirtual 213	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   369: ldc 217
    //   371: invokevirtual 144	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   374: lload 10
    //   376: invokevirtual 213	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   379: ldc 219
    //   381: invokevirtual 144	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   384: lload 13
    //   386: invokevirtual 213	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   389: invokevirtual 149	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   392: invokestatic 208	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   395: ldc 119
    //   397: invokestatic 115	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   400: iload 12
    //   402: istore_1
    //   403: goto -352 -> 51
    //   406: astore_3
    //   407: aconst_null
    //   408: astore_2
    //   409: aload_2
    //   410: astore 5
    //   412: new 129	java/lang/StringBuilder
    //   415: astore 4
    //   417: aload_2
    //   418: astore 5
    //   420: aload 4
    //   422: ldc 131
    //   424: invokespecial 134	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   427: aload_2
    //   428: astore 5
    //   430: ldc 127
    //   432: aload 4
    //   434: invokestatic 140	com/tencent/mm/compatible/util/g:Mq	()Ljava/lang/String;
    //   437: invokevirtual 144	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   440: ldc 161
    //   442: invokevirtual 144	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   445: aload_0
    //   446: invokevirtual 144	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   449: ldc 221
    //   451: invokevirtual 144	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   454: iload_1
    //   455: invokevirtual 166	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   458: ldc 223
    //   460: invokevirtual 144	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   463: aload_3
    //   464: invokevirtual 226	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   467: invokevirtual 144	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   470: ldc 228
    //   472: invokevirtual 144	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   475: invokevirtual 149	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   478: invokestatic 155	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   481: aload_2
    //   482: astore 5
    //   484: invokestatic 159	com/tencent/mm/compatible/util/g:getLine	()I
    //   487: istore_1
    //   488: iconst_0
    //   489: iload_1
    //   490: isub
    //   491: istore_1
    //   492: aload_2
    //   493: ifnull +7 -> 500
    //   496: aload_2
    //   497: invokevirtual 199	java/io/RandomAccessFile:close	()V
    //   500: ldc 119
    //   502: invokestatic 115	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   505: goto -454 -> 51
    //   508: astore_0
    //   509: aconst_null
    //   510: astore 5
    //   512: aload 5
    //   514: ifnull +8 -> 522
    //   517: aload 5
    //   519: invokevirtual 199	java/io/RandomAccessFile:close	()V
    //   522: ldc 119
    //   524: invokestatic 115	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   527: aload_0
    //   528: athrow
    //   529: astore 5
    //   531: goto -259 -> 272
    //   534: astore_0
    //   535: goto -35 -> 500
    //   538: astore_2
    //   539: goto -17 -> 522
    //   542: astore_0
    //   543: goto -31 -> 512
    //   546: astore_3
    //   547: aload 4
    //   549: astore_2
    //   550: goto -141 -> 409
    //
    // Exception table:
    //   from	to	target	type
    //   178	191	406	java/lang/Exception
    //   178	191	508	finally
    //   267	272	529	java/lang/Exception
    //   496	500	534	java/lang/Exception
    //   517	522	538	java/lang/Exception
    //   195	201	542	finally
    //   205	212	542	finally
    //   216	222	542	finally
    //   226	235	542	finally
    //   239	245	542	finally
    //   249	257	542	finally
    //   261	267	542	finally
    //   412	417	542	finally
    //   420	427	542	finally
    //   430	481	542	finally
    //   484	488	542	finally
    //   195	201	546	java/lang/Exception
    //   205	212	546	java/lang/Exception
    //   216	222	546	java/lang/Exception
    //   226	235	546	java/lang/Exception
    //   239	245	546	java/lang/Exception
    //   249	257	546	java/lang/Exception
    //   261	267	546	java/lang/Exception
  }

  private boolean aW(String paramString1, String paramString2)
  {
    AppMethodBeat.i(50820);
    ab.i("MicroMsg.VideoInfoStorage", "saveVideoHash path:%s xml:%s stack:%s", new Object[] { paramString1, paramString2, bo.dpG() });
    long l1 = bo.anU();
    boolean bool;
    if ((bo.isNullOrNil(paramString1)) || (bo.isNullOrNil(paramString2)))
    {
      ab.e("MicroMsg.VideoInfoStorage", "saveVideoHash failed , path:%s xml:%s", new Object[] { paramString1, paramString2 });
      bool = false;
      AppMethodBeat.o(50820);
    }
    while (true)
    {
      return bool;
      Object localObject = uk(paramString1);
      if ((localObject == null) || (localObject.length < 33))
      {
        ab.e("MicroMsg.VideoInfoStorage", "saveVideoHash  readHash failed :%s", new Object[] { paramString1 });
        bool = false;
        AppMethodBeat.o(50820);
      }
      else
      {
        int i = localObject[32];
        StringBuffer localStringBuffer = new StringBuffer();
        for (int j = 0; j < 32; j++)
          localStringBuffer.append(Integer.toHexString(localObject[j]));
        Cursor localCursor = this.fni.a("select cdnxml from VideoHash where size = " + i + " and hash = \"" + localStringBuffer.toString() + "\"", null, 2);
        localObject = new Vector();
        while (localCursor.moveToNext())
        {
          ((Vector)localObject).add(localCursor.getString(0));
          ab.v("MicroMsg.VideoInfoStorage", "saveVideoHash index:%s get:%s", new Object[] { Integer.valueOf(((Vector)localObject).size()), ((Vector)localObject).get(((Vector)localObject).size() - 1) });
        }
        localCursor.close();
        if ((((Vector)localObject).size() == 1) && (paramString2.equals(((Vector)localObject).get(0))))
        {
          ab.w("MicroMsg.VideoInfoStorage", "saveVideoHash Check exist now return,time:%d,  path:%s xml:%s", new Object[] { Long.valueOf(bo.gb(l1)), paramString1, paramString2 });
          bool = true;
          AppMethodBeat.o(50820);
        }
        else
        {
          if (((Vector)localObject).size() > 0)
          {
            com.tencent.mm.plugin.report.service.h.pYm.e(12696, new Object[] { Integer.valueOf(102), Integer.valueOf(i), "", "", Integer.valueOf(((Vector)localObject).size()) });
            ab.e("MicroMsg.VideoInfoStorage", "saveVideoHash Err Check  xml diff OR  select more than one row,  rowCount:%d size:%d ", new Object[] { Integer.valueOf(((Vector)localObject).size()), Integer.valueOf(i) });
            this.fni.hY("VideoHash", "delete from VideoHash where size = " + i + " and hash = \"" + localStringBuffer.toString() + "\"");
          }
          localObject = new ContentValues();
          ((ContentValues)localObject).put("size", Integer.valueOf(i));
          ((ContentValues)localObject).put("CreateTime", Long.valueOf(bo.anT()));
          ((ContentValues)localObject).put("hash", localStringBuffer.toString());
          ((ContentValues)localObject).put("cdnxml", paramString2);
          ((ContentValues)localObject).put("orgpath", paramString1);
          long l2 = this.fni.insert("VideoHash", "", (ContentValues)localObject);
          ab.i("MicroMsg.VideoInfoStorage", "summersafecdn saveVideoHash time:%d insert:%d path:%s hash:%s xml:%s", new Object[] { Long.valueOf(bo.gb(l1)), Long.valueOf(l2), paramString1, localStringBuffer, paramString2 });
          if (l2 < 0L)
          {
            com.tencent.mm.plugin.report.service.h.pYm.e(12696, new Object[] { Integer.valueOf(103), Integer.valueOf(i) });
            ab.e("MicroMsg.VideoInfoStorage", "saveVideoHash insert failed :%d  path:%s", new Object[] { Long.valueOf(l2), paramString1 });
          }
          bool = true;
          AppMethodBeat.o(50820);
        }
      }
    }
  }

  private static String getVideoPath()
  {
    AppMethodBeat.i(50812);
    String str = com.tencent.mm.kernel.g.RP().eJM + "video/";
    AppMethodBeat.o(50812);
    return str;
  }

  // ERROR //
  public static t.b m(String paramString, int paramInt1, int paramInt2)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_3
    //   2: ldc_w 399
    //   5: invokestatic 103	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   8: new 14	com/tencent/mm/modelvideo/t$b
    //   11: dup
    //   12: invokespecial 400	com/tencent/mm/modelvideo/t$b:<init>	()V
    //   15: astore 4
    //   17: aload_0
    //   18: invokestatic 125	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   21: ifeq +50 -> 71
    //   24: ldc 127
    //   26: new 129	java/lang/StringBuilder
    //   29: dup
    //   30: ldc 131
    //   32: invokespecial 134	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   35: invokestatic 140	com/tencent/mm/compatible/util/g:Mq	()Ljava/lang/String;
    //   38: invokevirtual 144	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   41: ldc 146
    //   43: invokevirtual 144	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   46: invokevirtual 149	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   49: invokestatic 155	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   52: aload 4
    //   54: iconst_0
    //   55: invokestatic 159	com/tencent/mm/compatible/util/g:getLine	()I
    //   58: isub
    //   59: putfield 404	com/tencent/mm/modelvideo/t$b:ret	I
    //   62: ldc_w 399
    //   65: invokestatic 115	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   68: aload 4
    //   70: areturn
    //   71: iload_1
    //   72: ifge +64 -> 136
    //   75: ldc 127
    //   77: new 129	java/lang/StringBuilder
    //   80: dup
    //   81: ldc 131
    //   83: invokespecial 134	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   86: invokestatic 140	com/tencent/mm/compatible/util/g:Mq	()Ljava/lang/String;
    //   89: invokevirtual 144	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   92: ldc 161
    //   94: invokevirtual 144	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   97: aload_0
    //   98: invokevirtual 144	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   101: ldc_w 406
    //   104: invokevirtual 144	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   107: iload_1
    //   108: invokevirtual 166	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   111: invokevirtual 149	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   114: invokestatic 155	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   117: aload 4
    //   119: iconst_0
    //   120: invokestatic 159	com/tencent/mm/compatible/util/g:getLine	()I
    //   123: isub
    //   124: putfield 404	com/tencent/mm/modelvideo/t$b:ret	I
    //   127: ldc_w 399
    //   130: invokestatic 115	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   133: goto -65 -> 68
    //   136: iload_2
    //   137: ifgt +60 -> 197
    //   140: ldc 127
    //   142: new 129	java/lang/StringBuilder
    //   145: dup
    //   146: ldc 131
    //   148: invokespecial 134	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   151: invokestatic 140	com/tencent/mm/compatible/util/g:Mq	()Ljava/lang/String;
    //   154: invokevirtual 144	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   157: ldc 161
    //   159: invokevirtual 144	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   162: aload_0
    //   163: invokevirtual 144	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   166: ldc_w 408
    //   169: invokevirtual 144	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   172: invokevirtual 149	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   175: invokestatic 155	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   178: aload 4
    //   180: iconst_0
    //   181: invokestatic 159	com/tencent/mm/compatible/util/g:getLine	()I
    //   184: isub
    //   185: putfield 404	com/tencent/mm/modelvideo/t$b:ret	I
    //   188: ldc_w 399
    //   191: invokestatic 115	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   194: goto -126 -> 68
    //   197: new 174	com/tencent/mm/compatible/util/g$a
    //   200: dup
    //   201: invokespecial 175	com/tencent/mm/compatible/util/g$a:<init>	()V
    //   204: astore 5
    //   206: aload 4
    //   208: iload_2
    //   209: newarray byte
    //   211: putfield 412	com/tencent/mm/modelvideo/t$b:buf	[B
    //   214: new 177	java/io/RandomAccessFile
    //   217: astore 6
    //   219: aload 6
    //   221: aload_0
    //   222: ldc_w 414
    //   225: invokespecial 181	java/io/RandomAccessFile:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   228: aload 6
    //   230: astore 7
    //   232: aload 5
    //   234: invokevirtual 185	com/tencent/mm/compatible/util/g$a:Mr	()J
    //   237: lstore 8
    //   239: aload 6
    //   241: astore 7
    //   243: aload 6
    //   245: iload_1
    //   246: i2l
    //   247: invokevirtual 189	java/io/RandomAccessFile:seek	(J)V
    //   250: aload 6
    //   252: astore 7
    //   254: aload 5
    //   256: invokevirtual 185	com/tencent/mm/compatible/util/g$a:Mr	()J
    //   259: lstore 10
    //   261: aload 6
    //   263: astore 7
    //   265: aload 6
    //   267: aload 4
    //   269: getfield 412	com/tencent/mm/modelvideo/t$b:buf	[B
    //   272: iconst_0
    //   273: iload_2
    //   274: invokevirtual 418	java/io/RandomAccessFile:read	([BII)I
    //   277: istore 12
    //   279: aload 6
    //   281: astore 7
    //   283: aload 5
    //   285: invokevirtual 185	com/tencent/mm/compatible/util/g$a:Mr	()J
    //   288: lstore 13
    //   290: aload 6
    //   292: astore 7
    //   294: aload 5
    //   296: invokevirtual 185	com/tencent/mm/compatible/util/g$a:Mr	()J
    //   299: lstore 15
    //   301: iload 12
    //   303: ifge +325 -> 628
    //   306: aload 6
    //   308: astore 7
    //   310: aload 4
    //   312: iload_3
    //   313: putfield 421	com/tencent/mm/modelvideo/t$b:cqs	I
    //   316: aload 6
    //   318: astore 7
    //   320: aload 4
    //   322: iload_3
    //   323: iload_1
    //   324: iadd
    //   325: putfield 424	com/tencent/mm/modelvideo/t$b:fXD	I
    //   328: aload 6
    //   330: invokevirtual 199	java/io/RandomAccessFile:close	()V
    //   333: ldc 127
    //   335: new 129	java/lang/StringBuilder
    //   338: dup
    //   339: ldc 201
    //   341: invokespecial 134	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   344: invokestatic 140	com/tencent/mm/compatible/util/g:Mq	()Ljava/lang/String;
    //   347: invokevirtual 144	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   350: ldc 161
    //   352: invokevirtual 144	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   355: aload_0
    //   356: invokevirtual 144	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   359: ldc 203
    //   361: invokevirtual 144	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   364: iload_1
    //   365: invokevirtual 166	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   368: ldc_w 426
    //   371: invokevirtual 144	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   374: iload_2
    //   375: invokevirtual 166	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   378: invokevirtual 149	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   381: invokestatic 208	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   384: ldc 127
    //   386: new 129	java/lang/StringBuilder
    //   389: dup
    //   390: ldc 201
    //   392: invokespecial 134	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   395: invokestatic 140	com/tencent/mm/compatible/util/g:Mq	()Ljava/lang/String;
    //   398: invokevirtual 144	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   401: ldc 161
    //   403: invokevirtual 144	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   406: aload_0
    //   407: invokevirtual 144	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   410: ldc 210
    //   412: invokevirtual 144	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   415: lload 8
    //   417: invokevirtual 213	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   420: ldc 215
    //   422: invokevirtual 144	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   425: lload 10
    //   427: invokevirtual 213	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   430: ldc 217
    //   432: invokevirtual 144	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   435: lload 13
    //   437: invokevirtual 213	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   440: ldc 219
    //   442: invokevirtual 144	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   445: lload 15
    //   447: invokevirtual 213	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   450: invokevirtual 149	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   453: invokestatic 208	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   456: ldc_w 399
    //   459: invokestatic 115	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   462: goto -394 -> 68
    //   465: astore 5
    //   467: aconst_null
    //   468: astore 6
    //   470: aload 6
    //   472: astore 7
    //   474: new 129	java/lang/StringBuilder
    //   477: astore 17
    //   479: aload 6
    //   481: astore 7
    //   483: aload 17
    //   485: ldc 131
    //   487: invokespecial 134	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   490: aload 6
    //   492: astore 7
    //   494: ldc 127
    //   496: aload 17
    //   498: invokestatic 140	com/tencent/mm/compatible/util/g:Mq	()Ljava/lang/String;
    //   501: invokevirtual 144	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   504: ldc 161
    //   506: invokevirtual 144	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   509: aload_0
    //   510: invokevirtual 144	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   513: ldc 221
    //   515: invokevirtual 144	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   518: aload 4
    //   520: getfield 424	com/tencent/mm/modelvideo/t$b:fXD	I
    //   523: invokevirtual 166	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   526: ldc 223
    //   528: invokevirtual 144	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   531: aload 5
    //   533: invokevirtual 226	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   536: invokevirtual 144	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   539: ldc 228
    //   541: invokevirtual 144	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   544: invokevirtual 149	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   547: invokestatic 155	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   550: aload 6
    //   552: astore 7
    //   554: aload 4
    //   556: iconst_0
    //   557: invokestatic 159	com/tencent/mm/compatible/util/g:getLine	()I
    //   560: isub
    //   561: putfield 404	com/tencent/mm/modelvideo/t$b:ret	I
    //   564: aload 6
    //   566: ifnull +8 -> 574
    //   569: aload 6
    //   571: invokevirtual 199	java/io/RandomAccessFile:close	()V
    //   574: ldc_w 399
    //   577: invokestatic 115	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   580: goto -512 -> 68
    //   583: astore_0
    //   584: aconst_null
    //   585: astore 7
    //   587: aload 7
    //   589: ifnull +8 -> 597
    //   592: aload 7
    //   594: invokevirtual 199	java/io/RandomAccessFile:close	()V
    //   597: ldc_w 399
    //   600: invokestatic 115	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   603: aload_0
    //   604: athrow
    //   605: astore 7
    //   607: goto -274 -> 333
    //   610: astore_0
    //   611: goto -37 -> 574
    //   614: astore 7
    //   616: goto -19 -> 597
    //   619: astore_0
    //   620: goto -33 -> 587
    //   623: astore 5
    //   625: goto -155 -> 470
    //   628: iload 12
    //   630: istore_3
    //   631: goto -325 -> 306
    //
    // Exception table:
    //   from	to	target	type
    //   214	228	465	java/lang/Exception
    //   214	228	583	finally
    //   328	333	605	java/lang/Exception
    //   569	574	610	java/lang/Exception
    //   592	597	614	java/lang/Exception
    //   232	239	619	finally
    //   243	250	619	finally
    //   254	261	619	finally
    //   265	279	619	finally
    //   283	290	619	finally
    //   294	301	619	finally
    //   310	316	619	finally
    //   320	328	619	finally
    //   474	479	619	finally
    //   483	490	619	finally
    //   494	550	619	finally
    //   554	564	619	finally
    //   232	239	623	java/lang/Exception
    //   243	250	623	java/lang/Exception
    //   254	261	623	java/lang/Exception
    //   265	279	623	java/lang/Exception
    //   283	290	623	java/lang/Exception
    //   294	301	623	java/lang/Exception
    //   310	316	623	java/lang/Exception
    //   320	328	623	java/lang/Exception
  }

  public static String ug(String paramString)
  {
    AppMethodBeat.i(50811);
    long l = System.currentTimeMillis();
    String str1 = new SimpleDateFormat("HHmmssddMMyy").format(new Date(l));
    String str2 = str1;
    if (paramString != null)
    {
      str2 = str1;
      if (paramString.length() > 1)
        str2 = str1 + com.tencent.mm.a.g.x(paramString.getBytes()).substring(0, 7);
    }
    paramString = str2 + l % 10000L;
    paramString = new StringBuilder().append(paramString);
    l = fXo;
    fXo = 1L + l;
    paramString = l;
    AppMethodBeat.o(50811);
    return paramString;
  }

  public static String uh(String paramString)
  {
    AppMethodBeat.i(50813);
    if (bo.isNullOrNil(paramString))
    {
      paramString = null;
      AppMethodBeat.o(50813);
    }
    while (true)
    {
      return paramString;
      paramString = getVideoPath() + paramString;
      if (com.tencent.mm.vfs.e.ct(paramString))
      {
        AppMethodBeat.o(50813);
      }
      else
      {
        paramString = paramString + ".mp4";
        AppMethodBeat.o(50813);
      }
    }
  }

  public static String ui(String paramString)
  {
    AppMethodBeat.i(50814);
    if (bo.isNullOrNil(paramString))
    {
      paramString = null;
      AppMethodBeat.o(50814);
    }
    while (true)
    {
      return paramString;
      paramString = getVideoPath() + paramString + ".jpg";
      AppMethodBeat.o(50814);
    }
  }

  public static int uj(String paramString)
  {
    int i = 0;
    AppMethodBeat.i(50817);
    int j;
    if (bo.isNullOrNil(paramString))
    {
      j = -1;
      AppMethodBeat.o(50817);
    }
    while (true)
    {
      return j;
      paramString = new b(paramString);
      if (!paramString.exists())
      {
        AppMethodBeat.o(50817);
        j = i;
      }
      else
      {
        j = (int)paramString.length();
        if (j <= 0)
        {
          AppMethodBeat.o(50817);
          j = i;
        }
        else
        {
          AppMethodBeat.o(50817);
        }
      }
    }
  }

  // ERROR //
  static int[] uk(String paramString)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_1
    //   2: ldc_w 493
    //   5: invokestatic 103	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   8: bipush 33
    //   10: newarray int
    //   12: astore_2
    //   13: invokestatic 243	com/tencent/mm/sdk/platformtools/bo:anU	()J
    //   16: lstore_3
    //   17: aload_0
    //   18: invokestatic 497	com/tencent/mm/vfs/e:asZ	(Ljava/lang/String;)J
    //   21: l2i
    //   22: istore 5
    //   24: iload 5
    //   26: ldc_w 498
    //   29: if_icmplt +11 -> 40
    //   32: iload 5
    //   34: ldc_w 499
    //   37: if_icmplt +87 -> 124
    //   40: ldc 127
    //   42: ldc_w 501
    //   45: iconst_2
    //   46: anewarray 4	java/lang/Object
    //   49: dup
    //   50: iconst_0
    //   51: iload 5
    //   53: invokestatic 302	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   56: aastore
    //   57: dup
    //   58: iconst_1
    //   59: aload_0
    //   60: aastore
    //   61: invokestatic 247	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   64: getstatic 333	com/tencent/mm/plugin/report/service/h:pYm	Lcom/tencent/mm/plugin/report/service/h;
    //   67: astore_0
    //   68: iload 5
    //   70: ldc_w 498
    //   73: if_icmpge +45 -> 118
    //   76: bipush 10
    //   78: istore_1
    //   79: aload_0
    //   80: sipush 12696
    //   83: iconst_2
    //   84: anewarray 4	java/lang/Object
    //   87: dup
    //   88: iconst_0
    //   89: iload_1
    //   90: bipush 101
    //   92: iadd
    //   93: invokestatic 302	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   96: aastore
    //   97: dup
    //   98: iconst_1
    //   99: iload 5
    //   101: invokestatic 302	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   104: aastore
    //   105: invokevirtual 338	com/tencent/mm/plugin/report/service/h:e	(I[Ljava/lang/Object;)V
    //   108: ldc_w 493
    //   111: invokestatic 115	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   114: aconst_null
    //   115: astore_0
    //   116: aload_0
    //   117: areturn
    //   118: bipush 20
    //   120: istore_1
    //   121: goto -42 -> 79
    //   124: aload_2
    //   125: bipush 32
    //   127: iload 5
    //   129: iastore
    //   130: iload 5
    //   132: sipush 20480
    //   135: isub
    //   136: bipush 32
    //   138: idiv
    //   139: istore 6
    //   141: sipush 512
    //   144: newarray byte
    //   146: astore 7
    //   148: new 177	java/io/RandomAccessFile
    //   151: astore 8
    //   153: aload 8
    //   155: aload_0
    //   156: ldc_w 414
    //   159: invokespecial 181	java/io/RandomAccessFile:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   162: iload_1
    //   163: bipush 32
    //   165: if_icmpge +65 -> 230
    //   168: iload_1
    //   169: iload 6
    //   171: imul
    //   172: sipush 10240
    //   175: iadd
    //   176: i2l
    //   177: lstore 9
    //   179: aload 8
    //   181: astore 11
    //   183: aload 8
    //   185: lload 9
    //   187: invokevirtual 189	java/io/RandomAccessFile:seek	(J)V
    //   190: aload 8
    //   192: astore 11
    //   194: aload 8
    //   196: aload 7
    //   198: invokevirtual 505	java/io/RandomAccessFile:readFully	([B)V
    //   201: aload 8
    //   203: astore 11
    //   205: aload_2
    //   206: iload_1
    //   207: aload 7
    //   209: sipush 512
    //   212: invokestatic 511	com/tencent/mm/a/i:s	([BI)I
    //   215: ldc_w 512
    //   218: irem
    //   219: ldc_w 512
    //   222: ior
    //   223: iastore
    //   224: iinc 1 1
    //   227: goto -65 -> 162
    //   230: aload 8
    //   232: astore 11
    //   234: aload 8
    //   236: invokevirtual 199	java/io/RandomAccessFile:close	()V
    //   239: aload 8
    //   241: astore 11
    //   243: ldc 127
    //   245: ldc_w 514
    //   248: iconst_3
    //   249: anewarray 4	java/lang/Object
    //   252: dup
    //   253: iconst_0
    //   254: lload_3
    //   255: invokestatic 319	com/tencent/mm/sdk/platformtools/bo:gb	(J)J
    //   258: invokestatic 324	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   261: aastore
    //   262: dup
    //   263: iconst_1
    //   264: iload 5
    //   266: invokestatic 302	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   269: aastore
    //   270: dup
    //   271: iconst_2
    //   272: aload_0
    //   273: aastore
    //   274: invokestatic 240	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   277: aload 8
    //   279: invokevirtual 199	java/io/RandomAccessFile:close	()V
    //   282: ldc_w 493
    //   285: invokestatic 115	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   288: aload_2
    //   289: astore_0
    //   290: goto -174 -> 116
    //   293: astore_2
    //   294: aconst_null
    //   295: astore 8
    //   297: aload 8
    //   299: astore 11
    //   301: ldc 127
    //   303: ldc_w 516
    //   306: iconst_2
    //   307: anewarray 4	java/lang/Object
    //   310: dup
    //   311: iconst_0
    //   312: aload_0
    //   313: aastore
    //   314: dup
    //   315: iconst_1
    //   316: aload_2
    //   317: invokestatic 520	com/tencent/mm/sdk/platformtools/bo:l	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   320: aastore
    //   321: invokestatic 247	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   324: aload 8
    //   326: ifnull +8 -> 334
    //   329: aload 8
    //   331: invokevirtual 199	java/io/RandomAccessFile:close	()V
    //   334: ldc_w 493
    //   337: invokestatic 115	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   340: aconst_null
    //   341: astore_0
    //   342: goto -226 -> 116
    //   345: astore_0
    //   346: aconst_null
    //   347: astore 11
    //   349: aload 11
    //   351: ifnull +8 -> 359
    //   354: aload 11
    //   356: invokevirtual 199	java/io/RandomAccessFile:close	()V
    //   359: ldc_w 493
    //   362: invokestatic 115	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   365: aload_0
    //   366: athrow
    //   367: astore_0
    //   368: goto -86 -> 282
    //   371: astore_0
    //   372: goto -38 -> 334
    //   375: astore 11
    //   377: goto -18 -> 359
    //   380: astore_0
    //   381: goto -32 -> 349
    //   384: astore_2
    //   385: goto -88 -> 297
    //
    // Exception table:
    //   from	to	target	type
    //   148	162	293	java/lang/Exception
    //   148	162	345	finally
    //   277	282	367	java/lang/Exception
    //   329	334	371	java/lang/Exception
    //   354	359	375	java/lang/Exception
    //   183	190	380	finally
    //   194	201	380	finally
    //   205	224	380	finally
    //   234	239	380	finally
    //   243	277	380	finally
    //   301	324	380	finally
    //   183	190	384	java/lang/Exception
    //   194	201	384	java/lang/Exception
    //   205	224	384	java/lang/Exception
    //   234	239	384	java/lang/Exception
    //   243	277	384	java/lang/Exception
  }

  public final void a(t.a parama)
  {
    AppMethodBeat.i(50799);
    this.fry.remove(parama);
    AppMethodBeat.o(50799);
  }

  public final void a(t.a parama, Looper paramLooper)
  {
    AppMethodBeat.i(50798);
    this.fry.a(parama, paramLooper);
    AppMethodBeat.o(50798);
  }

  public final List<s> alB()
  {
    AppMethodBeat.i(50804);
    Object localObject = "select videoinfo2.filename,videoinfo2.clientid,videoinfo2.msgsvrid,videoinfo2.netoffset,videoinfo2.filenowsize,videoinfo2.totallen,videoinfo2.thumbnetoffset,videoinfo2.thumblen,videoinfo2.status,videoinfo2.createtime,videoinfo2.lastmodifytime,videoinfo2.downloadtime,videoinfo2.videolength,videoinfo2.msglocalid,videoinfo2.nettimes,videoinfo2.cameratype,videoinfo2.user,videoinfo2.human,videoinfo2.reserved1,videoinfo2.reserved2,videoinfo2.reserved3,videoinfo2.reserved4,videoinfo2.videofuncflag,videoinfo2.masssendid,videoinfo2.masssendlist,videoinfo2.videomd5,videoinfo2.streamvideo,videoinfo2.statextstr,videoinfo2.downloadscene,videoinfo2.mmsightextinfo,videoinfo2.preloadsize,videoinfo2.videoformat from videoinfo2  " + " WHERE status=200 order by masssendid desc";
    ArrayList localArrayList = new ArrayList();
    Cursor localCursor = this.fni.a((String)localObject, null, 2);
    for (int i = 0; localCursor.moveToNext(); i++)
    {
      localObject = new s();
      ((s)localObject).d(localCursor);
      localArrayList.add(localObject);
    }
    localCursor.close();
    ab.d("MicroMsg.VideoInfoStorage", "getUnfinishMassInfo resCount:".concat(String.valueOf(i)));
    AppMethodBeat.o(50804);
    return localArrayList;
  }

  public final List<s> alC()
  {
    AppMethodBeat.i(50805);
    Object localObject = "select videoinfo2.filename,videoinfo2.clientid,videoinfo2.msgsvrid,videoinfo2.netoffset,videoinfo2.filenowsize,videoinfo2.totallen,videoinfo2.thumbnetoffset,videoinfo2.thumblen,videoinfo2.status,videoinfo2.createtime,videoinfo2.lastmodifytime,videoinfo2.downloadtime,videoinfo2.videolength,videoinfo2.msglocalid,videoinfo2.nettimes,videoinfo2.cameratype,videoinfo2.user,videoinfo2.human,videoinfo2.reserved1,videoinfo2.reserved2,videoinfo2.reserved3,videoinfo2.reserved4,videoinfo2.videofuncflag,videoinfo2.masssendid,videoinfo2.masssendlist,videoinfo2.videomd5,videoinfo2.streamvideo,videoinfo2.statextstr,videoinfo2.downloadscene,videoinfo2.mmsightextinfo,videoinfo2.preloadsize,videoinfo2.videoformat from videoinfo2  " + " WHERE status=198 AND masssendid > 0 order by masssendid desc";
    ArrayList localArrayList = new ArrayList();
    Cursor localCursor = this.fni.a((String)localObject, null, 2);
    while (localCursor.moveToNext())
    {
      localObject = new s();
      ((s)localObject).d(localCursor);
      localArrayList.add(localObject);
    }
    localCursor.close();
    AppMethodBeat.o(50805);
    return localArrayList;
  }

  // ERROR //
  public final List<String> alD()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: ldc_w 567
    //   5: invokestatic 103	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   8: new 129	java/lang/StringBuilder
    //   11: dup
    //   12: invokespecial 382	java/lang/StringBuilder:<init>	()V
    //   15: ldc_w 569
    //   18: invokevirtual 144	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   21: ldc_w 571
    //   24: invokevirtual 144	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   27: ldc_w 573
    //   30: invokevirtual 144	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   33: invokevirtual 149	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   36: astore_2
    //   37: aload_0
    //   38: getfield 112	com/tencent/mm/modelvideo/t:fni	Lcom/tencent/mm/cd/h;
    //   41: aload_2
    //   42: aconst_null
    //   43: iconst_2
    //   44: invokevirtual 277	com/tencent/mm/cd/h:a	(Ljava/lang/String;[Ljava/lang/String;I)Landroid/database/Cursor;
    //   47: astore_2
    //   48: aload_2
    //   49: invokeinterface 576 1 0
    //   54: ifeq +36 -> 90
    //   57: new 542	java/util/ArrayList
    //   60: astore_1
    //   61: aload_1
    //   62: invokespecial 543	java/util/ArrayList:<init>	()V
    //   65: aload_1
    //   66: aload_2
    //   67: iconst_0
    //   68: invokeinterface 289 2 0
    //   73: invokeinterface 552 2 0
    //   78: pop
    //   79: aload_2
    //   80: invokeinterface 286 1 0
    //   85: istore_3
    //   86: iload_3
    //   87: ifne -22 -> 65
    //   90: aload_2
    //   91: ifnull +9 -> 100
    //   94: aload_2
    //   95: invokeinterface 310 1 0
    //   100: ldc_w 567
    //   103: invokestatic 115	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   106: aload_1
    //   107: areturn
    //   108: astore_1
    //   109: aconst_null
    //   110: astore_2
    //   111: aload_2
    //   112: ifnull +9 -> 121
    //   115: aload_2
    //   116: invokeinterface 310 1 0
    //   121: ldc_w 567
    //   124: invokestatic 115	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   127: aload_1
    //   128: athrow
    //   129: astore_1
    //   130: goto -19 -> 111
    //
    // Exception table:
    //   from	to	target	type
    //   37	48	108	finally
    //   48	65	129	finally
    //   65	86	129	finally
  }

  // ERROR //
  public final List<String> alE()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: ldc_w 579
    //   5: invokestatic 103	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   8: new 129	java/lang/StringBuilder
    //   11: dup
    //   12: invokespecial 382	java/lang/StringBuilder:<init>	()V
    //   15: ldc_w 581
    //   18: invokevirtual 144	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   21: ldc_w 583
    //   24: invokevirtual 144	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   27: ldc_w 585
    //   30: invokevirtual 144	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   33: invokevirtual 149	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   36: astore_2
    //   37: new 129	java/lang/StringBuilder
    //   40: dup
    //   41: invokespecial 382	java/lang/StringBuilder:<init>	()V
    //   44: aload_2
    //   45: invokevirtual 144	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   48: ldc_w 587
    //   51: invokevirtual 144	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   54: invokevirtual 149	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   57: astore_2
    //   58: new 129	java/lang/StringBuilder
    //   61: dup
    //   62: invokespecial 382	java/lang/StringBuilder:<init>	()V
    //   65: aload_2
    //   66: invokevirtual 144	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   69: ldc_w 589
    //   72: invokevirtual 144	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   75: ldc_w 585
    //   78: invokevirtual 144	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   81: invokevirtual 149	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   84: astore_2
    //   85: new 129	java/lang/StringBuilder
    //   88: dup
    //   89: invokespecial 382	java/lang/StringBuilder:<init>	()V
    //   92: aload_2
    //   93: invokevirtual 144	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   96: ldc_w 591
    //   99: invokevirtual 144	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   102: invokevirtual 149	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   105: astore_2
    //   106: aload_0
    //   107: getfield 112	com/tencent/mm/modelvideo/t:fni	Lcom/tencent/mm/cd/h;
    //   110: aload_2
    //   111: aconst_null
    //   112: iconst_2
    //   113: invokevirtual 277	com/tencent/mm/cd/h:a	(Ljava/lang/String;[Ljava/lang/String;I)Landroid/database/Cursor;
    //   116: astore_2
    //   117: aload_2
    //   118: invokeinterface 576 1 0
    //   123: ifeq +36 -> 159
    //   126: new 542	java/util/ArrayList
    //   129: astore_1
    //   130: aload_1
    //   131: invokespecial 543	java/util/ArrayList:<init>	()V
    //   134: aload_1
    //   135: aload_2
    //   136: iconst_0
    //   137: invokeinterface 289 2 0
    //   142: invokeinterface 552 2 0
    //   147: pop
    //   148: aload_2
    //   149: invokeinterface 286 1 0
    //   154: istore_3
    //   155: iload_3
    //   156: ifne -22 -> 134
    //   159: aload_2
    //   160: ifnull +9 -> 169
    //   163: aload_2
    //   164: invokeinterface 310 1 0
    //   169: ldc_w 579
    //   172: invokestatic 115	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   175: aload_1
    //   176: areturn
    //   177: astore_1
    //   178: aconst_null
    //   179: astore_2
    //   180: aload_2
    //   181: ifnull +9 -> 190
    //   184: aload_2
    //   185: invokeinterface 310 1 0
    //   190: ldc_w 579
    //   193: invokestatic 115	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   196: aload_1
    //   197: athrow
    //   198: astore_1
    //   199: goto -19 -> 180
    //
    // Exception table:
    //   from	to	target	type
    //   106	117	177	finally
    //   117	134	198	finally
    //   134	155	198	finally
  }

  // ERROR //
  public final List<String> alF()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: ldc_w 593
    //   5: invokestatic 103	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   8: new 129	java/lang/StringBuilder
    //   11: dup
    //   12: invokespecial 382	java/lang/StringBuilder:<init>	()V
    //   15: ldc_w 581
    //   18: invokevirtual 144	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   21: ldc_w 595
    //   24: invokevirtual 144	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   27: ldc_w 585
    //   30: invokevirtual 144	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   33: invokevirtual 149	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   36: astore_2
    //   37: new 129	java/lang/StringBuilder
    //   40: dup
    //   41: invokespecial 382	java/lang/StringBuilder:<init>	()V
    //   44: aload_2
    //   45: invokevirtual 144	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   48: ldc_w 587
    //   51: invokevirtual 144	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   54: invokevirtual 149	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   57: astore_2
    //   58: new 129	java/lang/StringBuilder
    //   61: dup
    //   62: invokespecial 382	java/lang/StringBuilder:<init>	()V
    //   65: aload_2
    //   66: invokevirtual 144	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   69: ldc_w 597
    //   72: invokevirtual 144	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   75: ldc_w 585
    //   78: invokevirtual 144	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   81: invokevirtual 149	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   84: astore_2
    //   85: new 129	java/lang/StringBuilder
    //   88: dup
    //   89: invokespecial 382	java/lang/StringBuilder:<init>	()V
    //   92: aload_2
    //   93: invokevirtual 144	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   96: ldc_w 591
    //   99: invokevirtual 144	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   102: invokevirtual 149	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   105: astore_2
    //   106: aload_0
    //   107: getfield 112	com/tencent/mm/modelvideo/t:fni	Lcom/tencent/mm/cd/h;
    //   110: aload_2
    //   111: aconst_null
    //   112: iconst_2
    //   113: invokevirtual 277	com/tencent/mm/cd/h:a	(Ljava/lang/String;[Ljava/lang/String;I)Landroid/database/Cursor;
    //   116: astore_2
    //   117: aload_2
    //   118: invokeinterface 576 1 0
    //   123: ifeq +36 -> 159
    //   126: new 542	java/util/ArrayList
    //   129: astore_1
    //   130: aload_1
    //   131: invokespecial 543	java/util/ArrayList:<init>	()V
    //   134: aload_1
    //   135: aload_2
    //   136: iconst_0
    //   137: invokeinterface 289 2 0
    //   142: invokeinterface 552 2 0
    //   147: pop
    //   148: aload_2
    //   149: invokeinterface 286 1 0
    //   154: istore_3
    //   155: iload_3
    //   156: ifne -22 -> 134
    //   159: aload_2
    //   160: ifnull +9 -> 169
    //   163: aload_2
    //   164: invokeinterface 310 1 0
    //   169: ldc_w 593
    //   172: invokestatic 115	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   175: aload_1
    //   176: areturn
    //   177: astore_2
    //   178: aconst_null
    //   179: astore 4
    //   181: aload_2
    //   182: astore_1
    //   183: aload 4
    //   185: ifnull +10 -> 195
    //   188: aload 4
    //   190: invokeinterface 310 1 0
    //   195: ldc_w 593
    //   198: invokestatic 115	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   201: aload_1
    //   202: athrow
    //   203: astore_1
    //   204: aload_2
    //   205: astore 4
    //   207: goto -24 -> 183
    //
    // Exception table:
    //   from	to	target	type
    //   106	117	177	finally
    //   117	134	203	finally
    //   134	155	203	finally
  }

  public final boolean b(s params)
  {
    boolean bool = false;
    AppMethodBeat.i(50801);
    if (params == null)
      AppMethodBeat.o(50801);
    while (true)
    {
      return bool;
      params.bJt = -1;
      ContentValues localContentValues = params.Hl();
      if ((int)this.fni.insert("videoinfo2", "filename", localContentValues) != -1)
      {
        params = new a.a(params.getFileName(), t.a.b.fXv, a.c.fXz, params.fXk, params.fVs);
        this.fry.cF(params);
        this.fry.doNotify();
        bool = true;
        AppMethodBeat.o(50801);
      }
      else
      {
        AppMethodBeat.o(50801);
      }
    }
  }

  public final boolean c(s params)
  {
    boolean bool1 = true;
    AppMethodBeat.i(50806);
    boolean bool2;
    if (params != null)
    {
      bool2 = true;
      Assert.assertTrue(bool2);
      if (params.getFileName().length() <= 0)
        break label71;
      bool2 = true;
      label30: Assert.assertTrue(bool2);
      localObject = params.Hl();
      if (((ContentValues)localObject).size() > 0)
        break label76;
      ab.e("MicroMsg.VideoInfoStorage", "update failed, no values set");
    }
    label71: label76: 
    while (this.fni.update("videoinfo2", (ContentValues)localObject, "filename= ?", new String[] { params.getFileName() }) <= 0)
    {
      AppMethodBeat.o(50806);
      bool2 = false;
      return bool2;
      bool2 = false;
      break;
      bool2 = false;
      break label30;
    }
    Object localObject = a.c.fXz;
    if (params.status == 112);
    for (localObject = a.c.fXB; ; localObject = a.c.fXA)
      do
      {
        params = new a.a(params.getFileName(), t.a.b.fXx, (a.c)localObject, params.fXk, params.fVs);
        this.fry.cF(params);
        this.fry.doNotify();
        AppMethodBeat.o(50806);
        bool2 = bool1;
        break;
      }
      while ((params.status != 103) && (params.status != 104));
  }

  public final List<s> fU(long paramLong)
  {
    Object localObject1 = null;
    AppMethodBeat.i(50803);
    Object localObject2 = "select videoinfo2.filename,videoinfo2.clientid,videoinfo2.msgsvrid,videoinfo2.netoffset,videoinfo2.filenowsize,videoinfo2.totallen,videoinfo2.thumbnetoffset,videoinfo2.thumblen,videoinfo2.status,videoinfo2.createtime,videoinfo2.lastmodifytime,videoinfo2.downloadtime,videoinfo2.videolength,videoinfo2.msglocalid,videoinfo2.nettimes,videoinfo2.cameratype,videoinfo2.user,videoinfo2.human,videoinfo2.reserved1,videoinfo2.reserved2,videoinfo2.reserved3,videoinfo2.reserved4,videoinfo2.videofuncflag,videoinfo2.masssendid,videoinfo2.masssendlist,videoinfo2.videomd5,videoinfo2.streamvideo,videoinfo2.statextstr,videoinfo2.downloadscene,videoinfo2.mmsightextinfo,videoinfo2.preloadsize,videoinfo2.videoformat from videoinfo2   where videoinfo2.masssendid = ".concat(String.valueOf(paramLong));
    localObject2 = this.fni.a((String)localObject2, null, 2);
    if (localObject2 == null)
      AppMethodBeat.o(50803);
    while (true)
    {
      return localObject1;
      localObject1 = new ArrayList();
      while (((Cursor)localObject2).moveToNext())
      {
        s locals = new s();
        locals.d((Cursor)localObject2);
        ((List)localObject1).add(locals);
      }
      ((Cursor)localObject2).close();
      AppMethodBeat.o(50803);
    }
  }

  public final boolean s(String paramString1, String paramString2, String paramString3)
  {
    AppMethodBeat.i(50818);
    boolean bool = aW(paramString1, paramString2 + "##" + paramString3);
    AppMethodBeat.o(50818);
    return bool;
  }

  public final s uf(String paramString)
  {
    Object localObject1 = null;
    Object localObject2 = null;
    AppMethodBeat.i(50802);
    paramString = "select videoinfo2.filename,videoinfo2.clientid,videoinfo2.msgsvrid,videoinfo2.netoffset,videoinfo2.filenowsize,videoinfo2.totallen,videoinfo2.thumbnetoffset,videoinfo2.thumblen,videoinfo2.status,videoinfo2.createtime,videoinfo2.lastmodifytime,videoinfo2.downloadtime,videoinfo2.videolength,videoinfo2.msglocalid,videoinfo2.nettimes,videoinfo2.cameratype,videoinfo2.user,videoinfo2.human,videoinfo2.reserved1,videoinfo2.reserved2,videoinfo2.reserved3,videoinfo2.reserved4,videoinfo2.videofuncflag,videoinfo2.masssendid,videoinfo2.masssendlist,videoinfo2.videomd5,videoinfo2.streamvideo,videoinfo2.statextstr,videoinfo2.downloadscene,videoinfo2.mmsightextinfo,videoinfo2.preloadsize,videoinfo2.videoformat from videoinfo2   where videoinfo2.filename = \"" + bo.vA(String.valueOf(paramString)) + "\"";
    Cursor localCursor = this.fni.a(paramString, null, 2);
    if (localCursor == null)
    {
      AppMethodBeat.o(50802);
      paramString = localObject2;
    }
    while (true)
    {
      return paramString;
      paramString = localObject1;
      if (localCursor.moveToFirst())
      {
        paramString = new s();
        paramString.d(localCursor);
      }
      localCursor.close();
      AppMethodBeat.o(50802);
    }
  }

  // ERROR //
  public final List<s> v(int paramInt, long paramLong)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 4
    //   3: ldc_w 695
    //   6: invokestatic 103	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   9: new 129	java/lang/StringBuilder
    //   12: dup
    //   13: ldc_w 697
    //   16: invokespecial 134	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   19: iload_1
    //   20: invokevirtual 166	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   23: ldc_w 699
    //   26: invokevirtual 144	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   29: lload_2
    //   30: invokevirtual 213	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   33: ldc_w 701
    //   36: invokevirtual 144	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   39: invokevirtual 149	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   42: astore 5
    //   44: aload_0
    //   45: getfield 112	com/tencent/mm/modelvideo/t:fni	Lcom/tencent/mm/cd/h;
    //   48: aload 5
    //   50: aconst_null
    //   51: iconst_2
    //   52: invokevirtual 277	com/tencent/mm/cd/h:a	(Ljava/lang/String;[Ljava/lang/String;I)Landroid/database/Cursor;
    //   55: astore 5
    //   57: aload 5
    //   59: invokeinterface 576 1 0
    //   64: ifeq +54 -> 118
    //   67: new 542	java/util/ArrayList
    //   70: astore 4
    //   72: aload 4
    //   74: invokespecial 543	java/util/ArrayList:<init>	()V
    //   77: new 545	com/tencent/mm/modelvideo/s
    //   80: astore 6
    //   82: aload 6
    //   84: invokespecial 546	com/tencent/mm/modelvideo/s:<init>	()V
    //   87: aload 6
    //   89: aload 5
    //   91: invokevirtual 549	com/tencent/mm/modelvideo/s:d	(Landroid/database/Cursor;)V
    //   94: aload 4
    //   96: aload 6
    //   98: invokeinterface 552 2 0
    //   103: pop
    //   104: aload 5
    //   106: invokeinterface 286 1 0
    //   111: istore 7
    //   113: iload 7
    //   115: ifne -38 -> 77
    //   118: aload 5
    //   120: ifnull +10 -> 130
    //   123: aload 5
    //   125: invokeinterface 310 1 0
    //   130: ldc_w 695
    //   133: invokestatic 115	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   136: aload 4
    //   138: areturn
    //   139: astore 4
    //   141: aconst_null
    //   142: astore 5
    //   144: aload 5
    //   146: ifnull +10 -> 156
    //   149: aload 5
    //   151: invokeinterface 310 1 0
    //   156: ldc_w 695
    //   159: invokestatic 115	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   162: aload 4
    //   164: athrow
    //   165: astore 4
    //   167: goto -23 -> 144
    //
    // Exception table:
    //   from	to	target	type
    //   44	57	139	finally
    //   57	77	165	finally
    //   77	113	165	finally
  }

  public static final class a$a
  {
    public final long fVs;
    public final int fXk;
    public final t.a.b fXt;
    public final t.a.c fXu;
    public final String fileName;

    public a$a(String paramString, t.a.b paramb, t.a.c paramc, int paramInt, long paramLong)
    {
      this.fileName = paramString;
      this.fXt = paramb;
      this.fXu = paramc;
      this.fXk = paramInt;
      this.fVs = paramLong;
    }
  }

  public static enum a$c
  {
    static
    {
      AppMethodBeat.i(50797);
      fXz = new c("NORMAL", 0);
      fXA = new c("UPLOAD", 1);
      fXB = new c("DOWNLOAD", 2);
      fXC = new c[] { fXz, fXA, fXB };
      AppMethodBeat.o(50797);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelvideo.t
 * JD-Core Version:    0.6.2
 */