package com.tencent.mm.modelsimple;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory.Options;
import android.provider.MediaStore.Images.Media;
import android.provider.MediaStore.Images.Thumbnails;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.graphics.MMBitmapFactory;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.u.a.a;
import com.tencent.mm.protocal.protobuf.bzb;
import com.tencent.mm.protocal.protobuf.bzd;
import com.tencent.mm.protocal.protobuf.bze;
import com.tencent.mm.protocal.protobuf.rs;
import com.tencent.mm.protocal.protobuf.rt;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.File;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class d extends m
  implements k
{
  private f ehi;
  private b fAT;
  private List<String> fOr;
  private String fOs;
  private int type;

  public d(int paramInt, List<String> paramList, String paramString)
  {
    this.type = paramInt;
    this.fOr = paramList;
    this.fOs = paramString;
  }

  // ERROR //
  private void ah(List<String> paramList)
  {
    // Byte code:
    //   0: sipush 16559
    //   3: invokestatic 41	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: aload_0
    //   7: getfield 43	com/tencent/mm/modelsimple/d:fAT	Lcom/tencent/mm/ai/b;
    //   10: getfield 49	com/tencent/mm/ai/b:fsG	Lcom/tencent/mm/ai/b$b;
    //   13: getfield 55	com/tencent/mm/ai/b$b:fsP	Lcom/tencent/mm/bt/a;
    //   16: checkcast 57	com/tencent/mm/protocal/protobuf/rs
    //   19: astore_2
    //   20: aload_2
    //   21: iconst_3
    //   22: putfield 60	com/tencent/mm/protocal/protobuf/rs:jCt	I
    //   25: invokestatic 66	java/lang/System:currentTimeMillis	()J
    //   28: lstore_3
    //   29: aload_1
    //   30: invokeinterface 72 1 0
    //   35: astore 5
    //   37: aload 5
    //   39: invokeinterface 78 1 0
    //   44: ifeq +280 -> 324
    //   47: aload 5
    //   49: invokeinterface 82 1 0
    //   54: checkcast 84	java/lang/String
    //   57: astore 6
    //   59: ldc 86
    //   61: ldc 88
    //   63: iconst_1
    //   64: anewarray 90	java/lang/Object
    //   67: dup
    //   68: iconst_0
    //   69: aload 6
    //   71: aastore
    //   72: invokestatic 95	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   75: new 97	com/tencent/mm/protocal/protobuf/bzf
    //   78: dup
    //   79: invokespecial 98	com/tencent/mm/protocal/protobuf/bzf:<init>	()V
    //   82: astore 7
    //   84: new 100	android/media/MediaMetadataRetriever
    //   87: astore 8
    //   89: aload 8
    //   91: invokespecial 101	android/media/MediaMetadataRetriever:<init>	()V
    //   94: aload 8
    //   96: astore_1
    //   97: aload 8
    //   99: aload 6
    //   101: invokevirtual 105	android/media/MediaMetadataRetriever:setDataSource	(Ljava/lang/String;)V
    //   104: aload 8
    //   106: astore_1
    //   107: aload 8
    //   109: bipush 9
    //   111: invokevirtual 109	android/media/MediaMetadataRetriever:extractMetadata	(I)Ljava/lang/String;
    //   114: iconst_m1
    //   115: invokestatic 115	com/tencent/mm/sdk/platformtools/bo:getInt	(Ljava/lang/String;I)I
    //   118: istore 9
    //   120: aload 8
    //   122: astore_1
    //   123: ldc 86
    //   125: ldc 117
    //   127: iconst_1
    //   128: anewarray 90	java/lang/Object
    //   131: dup
    //   132: iconst_0
    //   133: iload 9
    //   135: invokestatic 123	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   138: aastore
    //   139: invokestatic 95	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   142: aload 8
    //   144: astore_1
    //   145: aload 7
    //   147: iload 9
    //   149: putfield 126	com/tencent/mm/protocal/protobuf/bzf:wYj	I
    //   152: aload 8
    //   154: invokevirtual 129	android/media/MediaMetadataRetriever:release	()V
    //   157: aload 7
    //   159: new 131	java/io/File
    //   162: dup
    //   163: aload 6
    //   165: invokespecial 133	java/io/File:<init>	(Ljava/lang/String;)V
    //   168: invokestatic 139	com/tencent/xweb/util/d:v	(Ljava/io/File;)Ljava/lang/String;
    //   171: putfield 142	com/tencent/mm/protocal/protobuf/bzf:wdO	Ljava/lang/String;
    //   174: aload_2
    //   175: getfield 146	com/tencent/mm/protocal/protobuf/rs:vZb	Ljava/util/LinkedList;
    //   178: aload 7
    //   180: invokevirtual 152	java/util/LinkedList:add	(Ljava/lang/Object;)Z
    //   183: pop
    //   184: goto -147 -> 37
    //   187: astore_1
    //   188: ldc 86
    //   190: aload_1
    //   191: ldc 154
    //   193: iconst_1
    //   194: anewarray 90	java/lang/Object
    //   197: dup
    //   198: iconst_0
    //   199: aload_1
    //   200: invokevirtual 158	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   203: aastore
    //   204: invokestatic 162	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   207: goto -50 -> 157
    //   210: astore 10
    //   212: aconst_null
    //   213: astore 8
    //   215: aload 8
    //   217: astore_1
    //   218: ldc 86
    //   220: aload 10
    //   222: ldc 164
    //   224: iconst_2
    //   225: anewarray 90	java/lang/Object
    //   228: dup
    //   229: iconst_0
    //   230: aload 6
    //   232: aastore
    //   233: dup
    //   234: iconst_1
    //   235: aload 10
    //   237: invokevirtual 158	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   240: aastore
    //   241: invokestatic 162	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   244: aload 8
    //   246: ifnull -89 -> 157
    //   249: aload 8
    //   251: invokevirtual 129	android/media/MediaMetadataRetriever:release	()V
    //   254: goto -97 -> 157
    //   257: astore_1
    //   258: ldc 86
    //   260: aload_1
    //   261: ldc 154
    //   263: iconst_1
    //   264: anewarray 90	java/lang/Object
    //   267: dup
    //   268: iconst_0
    //   269: aload_1
    //   270: invokevirtual 158	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   273: aastore
    //   274: invokestatic 162	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   277: goto -120 -> 157
    //   280: astore 8
    //   282: aconst_null
    //   283: astore_1
    //   284: aload_1
    //   285: ifnull +7 -> 292
    //   288: aload_1
    //   289: invokevirtual 129	android/media/MediaMetadataRetriever:release	()V
    //   292: sipush 16559
    //   295: invokestatic 167	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   298: aload 8
    //   300: athrow
    //   301: astore_1
    //   302: ldc 86
    //   304: aload_1
    //   305: ldc 154
    //   307: iconst_1
    //   308: anewarray 90	java/lang/Object
    //   311: dup
    //   312: iconst_0
    //   313: aload_1
    //   314: invokevirtual 158	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   317: aastore
    //   318: invokestatic 162	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   321: goto -29 -> 292
    //   324: ldc 86
    //   326: ldc 169
    //   328: iconst_1
    //   329: anewarray 90	java/lang/Object
    //   332: dup
    //   333: iconst_0
    //   334: invokestatic 66	java/lang/System:currentTimeMillis	()J
    //   337: lload_3
    //   338: lsub
    //   339: invokestatic 174	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   342: aastore
    //   343: invokestatic 95	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   346: sipush 16559
    //   349: invokestatic 167	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   352: return
    //   353: astore 8
    //   355: goto -71 -> 284
    //   358: astore 10
    //   360: goto -145 -> 215
    //
    // Exception table:
    //   from	to	target	type
    //   152	157	187	java/lang/Exception
    //   84	94	210	java/lang/Exception
    //   249	254	257	java/lang/Exception
    //   84	94	280	finally
    //   288	292	301	java/lang/Exception
    //   97	104	353	finally
    //   107	120	353	finally
    //   123	142	353	finally
    //   145	152	353	finally
    //   218	244	353	finally
    //   97	104	358	java/lang/Exception
    //   107	120	358	java/lang/Exception
    //   123	142	358	java/lang/Exception
    //   145	152	358	java/lang/Exception
  }

  private void ai(List<String> paramList)
  {
    AppMethodBeat.i(16560);
    rs localrs = (rs)this.fAT.fsG.fsP;
    localrs.jCt = 5;
    long l = System.currentTimeMillis();
    Iterator localIterator = paramList.iterator();
    if (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      ab.i("MicroMsg.NetSceneCheckSysShare", "share text %s", new Object[] { str });
      int i = str.indexOf("|");
      paramList = new bze();
      if ((i >= 0) && (i + 1 < str.length()))
        paramList.Title = str.substring(0, i);
      for (paramList.URL = str.substring(i + 1); ; paramList.URL = str)
      {
        paramList.wdO = com.tencent.xweb.util.d.x(paramList.URL.getBytes());
        localrs.vZe.add(paramList);
        break;
        paramList.Title = "";
      }
    }
    ab.i("MicroMsg.NetSceneCheckSysShare", "cost %d ms", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
    AppMethodBeat.o(16560);
  }

  private void aj(List<String> paramList)
  {
    AppMethodBeat.i(16561);
    rs localrs = (rs)this.fAT.fsG.fsP;
    localrs.jCt = 4;
    long l = System.currentTimeMillis();
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      Object localObject = (String)paramList.next();
      bzb localbzb = new bzb();
      localObject = new File((String)localObject);
      localbzb.FileSize = ((int)((File)localObject).length());
      localbzb.wdO = com.tencent.xweb.util.d.v((File)localObject);
      localrs.vZd.add(localbzb);
    }
    ab.i("MicroMsg.NetSceneCheckSysShare", "cost %d ms", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
    AppMethodBeat.o(16561);
  }

  public final int a(com.tencent.mm.network.e parame, f paramf)
  {
    AppMethodBeat.i(16562);
    this.ehi = paramf;
    Object localObject = new b.a();
    paramf = new rs();
    if (!bo.isNullOrNil(this.fOs))
      paramf.vYZ = this.fOs;
    ((b.a)localObject).fsJ = paramf;
    ((b.a)localObject).fsK = new rt();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/checksystemshare";
    ((b.a)localObject).fsI = 837;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.fAT = ((b.a)localObject).acD();
    int i;
    label186: long l1;
    long l2;
    long l3;
    long l4;
    label252: bzd localbzd;
    switch (this.type)
    {
    case 2:
    default:
      i = 1;
      if (com.tencent.mm.kernel.g.RK())
        i = bo.getInt(com.tencent.mm.m.g.Nu().getValue("ShareExtCheckSwitch"), 1);
      if (i != 1)
      {
        this.ehi.onSceneEnd(0, 0, "need not check", this);
        i = 0;
        AppMethodBeat.o(16562);
        return i;
      }
      break;
    case 1:
      paramf = this.fOr;
      rs localrs = (rs)this.fAT.fsG.fsP;
      localrs.jCt = 1;
      BitmapFactory.Options localOptions = new BitmapFactory.Options();
      localOptions.inJustDecodeBounds = true;
      l1 = System.currentTimeMillis();
      l2 = 0L;
      l3 = 0L;
      Iterator localIterator = paramf.iterator();
      l4 = 0L;
      if (localIterator.hasNext())
      {
        localObject = (String)localIterator.next();
        ab.i("MicroMsg.NetSceneCheckSysShare", "img file %s", new Object[] { localObject });
        paramf = com.tencent.mm.a.e.e((String)localObject, 0, -1);
        if ((paramf == null) || (paramf.length <= 0))
          break label838;
        localbzd = new bzd();
        localbzd.wdO = com.tencent.xweb.util.d.x(paramf);
        l2 = System.currentTimeMillis();
        MMBitmapFactory.decodeByteArray(paramf, 0, paramf.length, localOptions);
        ab.i("MicroMsg.NetSceneCheckSysShare", "decode img, width %d, height: %d", new Object[] { Integer.valueOf(localOptions.outWidth), Integer.valueOf(localOptions.outHeight) });
        localbzd.Width = localOptions.outWidth;
        localbzd.Height = localOptions.outHeight;
        l3 = System.currentTimeMillis();
        paramf = ah.getContext().getContentResolver().query(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, new String[] { "_id" }, "_data=?", new String[] { localObject }, null);
        if (paramf != null)
          if (paramf.moveToFirst())
          {
            i = paramf.getInt(paramf.getColumnIndex("_id"));
            paramf.close();
            paramf = MediaStore.Images.Thumbnails.getThumbnail(ah.getContext().getContentResolver(), i, 1, null);
            label483: if (paramf == null)
              break label647;
            localObject = new a().P(paramf);
            ab.i("MicroMsg.NetSceneCheckSysShare", "have thumbnail(w:%d, h:%d)", new Object[] { Integer.valueOf(paramf.getWidth()), Integer.valueOf(paramf.getHeight()) });
            paramf = (f)localObject;
            label533: l4 = System.currentTimeMillis();
            if (paramf != null)
            {
              ab.i("MicroMsg.NetSceneCheckSysShare", "scan qrcode, type %s, result %s, ", new Object[] { paramf.pAE, paramf.result });
              if (!bo.isNullOrNil(paramf.pAE))
              {
                if ((!paramf.pAE.equals("QR_CODE")) && (!paramf.pAE.equals("WX_CODE")))
                  break label662;
                localbzd.wVm = paramf.result;
                label613: localbzd.wYi = paramf.pAE;
              }
            }
            localrs.vZa.add(localbzd);
          }
      }
      break;
    case 3:
    case 5:
    case 4:
    }
    label647: label662: label838: 
    while (true)
    {
      break label252;
      paramf.close();
      paramf = null;
      break label483;
      paramf = new a().Vu((String)localObject);
      break label533;
      i = paramf.result.indexOf(",");
      if ((i >= 0) && (i + 1 < paramf.result.length()))
      {
        localbzd.wVm = paramf.result.substring(i + 1);
        break label613;
      }
      localbzd.wVm = paramf.result;
      break label613;
      ab.i("MicroMsg.NetSceneCheckSysShare", "cost %d(%d, %d, %d)ms", new Object[] { Long.valueOf(System.currentTimeMillis() - l1), Long.valueOf(l2 - l1), Long.valueOf(l3 - l2), Long.valueOf(l4 - l3) });
      break;
      ah(this.fOr);
      break;
      ai(this.fOr);
      break;
      aj(this.fOr);
      break;
      i = a(parame, this.fAT, this);
      AppMethodBeat.o(16562);
      break label186;
    }
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(16563);
    ab.i("MicroMsg.NetSceneCheckSysShare", "errType %d, errCode %d, errMsg", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(16563);
  }

  public final int getType()
  {
    return 837;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelsimple.d
 * JD-Core Version:    0.6.2
 */