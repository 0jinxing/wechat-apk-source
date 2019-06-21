package com.tencent.mm.plugin.sns.model;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.g.a.gh;
import com.tencent.mm.g.a.gh.b;
import com.tencent.mm.g.a.rp;
import com.tencent.mm.model.v;
import com.tencent.mm.model.v.b;
import com.tencent.mm.opensdk.modelmsg.WXAppExtendObject;
import com.tencent.mm.opensdk.modelmsg.WXImageObject;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage.IMediaObject;
import com.tencent.mm.opensdk.modelmsg.WXMusicObject;
import com.tencent.mm.opensdk.modelmsg.WXTextObject;
import com.tencent.mm.opensdk.modelmsg.WXVideoObject;
import com.tencent.mm.opensdk.modelmsg.WXWebpageObject;
import com.tencent.mm.plugin.sns.b.l;
import com.tencent.mm.plugin.sns.data.h;
import com.tencent.mm.plugin.sns.h.j;
import com.tencent.mm.plugin.sns.storage.k;
import com.tencent.mm.plugin.sns.storage.n;
import com.tencent.mm.plugin.sns.storage.o;
import com.tencent.mm.protocal.protobuf.TimeLineObject;
import com.tencent.mm.protocal.protobuf.ayq;
import com.tencent.mm.protocal.protobuf.ayt;
import com.tencent.mm.protocal.protobuf.azu;
import com.tencent.mm.protocal.protobuf.bar;
import com.tencent.mm.protocal.protobuf.bau;
import com.tencent.mm.protocal.protobuf.bav;
import com.tencent.mm.protocal.protobuf.baw;
import com.tencent.mm.protocal.protobuf.bax;
import com.tencent.mm.protocal.protobuf.cco;
import com.tencent.mm.protocal.protobuf.cth;
import com.tencent.mm.protocal.protobuf.ds;
import com.tencent.mm.protocal.protobuf.uf;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.z;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public final class aw
  implements f, l
{
  public static int qHB = 0;
  private String ecX;
  public Set<a> epg;
  private s qNn;
  public ac.a qNo;

  public aw()
  {
    AppMethodBeat.i(36691);
    this.ecX = "";
    this.qNn = null;
    this.epg = new HashSet();
    this.qNo = new ac.a()
    {
      public final void kJ(boolean paramAnonymousBoolean)
      {
        AppMethodBeat.i(36687);
        if (!paramAnonymousBoolean)
          aw.this.cmp();
        AppMethodBeat.o(36687);
      }
    };
    AppMethodBeat.o(36691);
  }

  private static int Db(int paramInt)
  {
    switch (paramInt)
    {
    default:
      paramInt = -1;
    case 1:
    case 3:
    case 2:
    case 4:
    }
    while (true)
    {
      return paramInt;
      paramInt = 1;
      continue;
      paramInt = 3;
      continue;
      paramInt = 2;
      continue;
      paramInt = 4;
    }
  }

  private aw.b Dc(int paramInt)
  {
    AppMethodBeat.i(36708);
    Object localObject;
    if (paramInt == -1)
    {
      ab.e("MicroMsg.UploadManager", "uploading depend localMediaId can not get the media doUploadSight");
      localObject = aw.b.qNB;
      AppMethodBeat.o(36708);
    }
    while (true)
    {
      return localObject;
      localObject = af.cnu().kE(paramInt);
      bax localbax;
      aw.b localb;
      try
      {
        localbax = new com/tencent/mm/protocal/protobuf/bax;
        localbax.<init>();
        localbax = (bax)localbax.parseFrom(((com.tencent.mm.plugin.sns.storage.r)localObject).rfI);
        ab.i("MicroMsg.UploadManager", "state " + localbax.wFD + " doUploadSight, serverErr:" + localbax.wFm);
        if (localbax.wFD != 1)
          break label133;
        localObject = aw.b.qNB;
        AppMethodBeat.o(36708);
      }
      catch (Exception localException)
      {
        ab.e("MicroMsg.UploadManager", "parse uploadInfo error doUploadSight");
        localb = aw.b.qNB;
        AppMethodBeat.o(36708);
      }
      continue;
      label133: if (com.tencent.mm.vfs.e.asZ(localbax.videoPath) == 0L)
      {
        ab.i("MicroMsg.UploadManager", "path not fileexist  " + localbax.videoPath);
        localb = aw.b.qNB;
        AppMethodBeat.o(36708);
      }
      else if (com.tencent.mm.vfs.e.asZ(localbax.wFF) == 0L)
      {
        ab.i("MicroMsg.UploadManager", "thumbpath not fileexist  " + localbax.wFF);
        localb = aw.b.qNB;
        AppMethodBeat.o(36708);
      }
      else if (localbax.wFD == 0)
      {
        localb = aw.b.qNC;
        AppMethodBeat.o(36708);
      }
      else
      {
        if (af.cnE().CU(paramInt))
        {
          af.cnu().a(paramInt, localb);
          new ac(paramInt, localb, localbax.videoPath, localbax.wFF, this.qNo).cne();
        }
        localb = aw.b.qND;
        AppMethodBeat.o(36708);
      }
    }
  }

  private aw.b a(int paramInt1, boolean paramBoolean, bav parambav, int paramInt2)
  {
    AppMethodBeat.i(36706);
    if (paramInt1 == -1)
    {
      ab.e("MicroMsg.UploadManager", "uploading depend localMediaId can not get the media");
      parambav = aw.b.qNB;
      AppMethodBeat.o(36706);
    }
    while (true)
    {
      return parambav;
      Object localObject = af.cnu().kE(paramInt1);
      bax localbax;
      try
      {
        localbax = new com/tencent/mm/protocal/protobuf/bax;
        localbax.<init>();
        localbax = (bax)localbax.parseFrom(((com.tencent.mm.plugin.sns.storage.r)localObject).rfI);
        ab.i("MicroMsg.UploadManager", "state " + localbax.wFD + " pic isMuti: " + paramBoolean);
        if (localbax.wFD != 1)
          break label138;
        parambav = aw.b.qNB;
        AppMethodBeat.o(36706);
      }
      catch (Exception parambav)
      {
        ab.e("MicroMsg.UploadManager", "parse uploadInfo error");
        parambav = aw.b.qNB;
        AppMethodBeat.o(36706);
      }
      continue;
      label138: String str = com.tencent.mm.plugin.sns.data.i.Xe(((com.tencent.mm.plugin.sns.storage.r)localObject).rfE);
      str = an.fZ(af.getAccSnsPath(), ((com.tencent.mm.plugin.sns.storage.r)localObject).rfE) + str;
      if (com.tencent.mm.vfs.e.asZ(str) == 0L)
      {
        ab.i("MicroMsg.UploadManager", "path not exist  ".concat(String.valueOf(str)));
        parambav = aw.b.qNB;
        AppMethodBeat.o(36706);
      }
      else if (localbax.wFD == 0)
      {
        parambav = aw.b.qNC;
        AppMethodBeat.o(36706);
      }
      else
      {
        if (af.cnE().CU(paramInt1))
        {
          af.cnu().a(paramInt1, (com.tencent.mm.plugin.sns.storage.r)localObject);
          localObject = com.tencent.mm.a.g.x((bo.yz() + " " + System.currentTimeMillis()).getBytes());
          af.bCo().post(new aw.5(this, paramInt1, (String)localObject, paramBoolean, parambav, paramInt2));
        }
        parambav = aw.b.qND;
        AppMethodBeat.o(36706);
      }
    }
  }

  private static TimeLineObject a(n paramn, bav parambav)
  {
    AppMethodBeat.i(36703);
    TimeLineObject localTimeLineObject1 = paramn.cqu();
    ayt localayt = localTimeLineObject1.xfG;
    String str1 = localTimeLineObject1.xfF;
    Object localObject = localTimeLineObject1.ijx;
    String str2 = localTimeLineObject1.vjM;
    String str3 = localTimeLineObject1.xfI.Desc;
    String str4 = localTimeLineObject1.xfI.Title;
    String str5 = localTimeLineObject1.xfI.Url;
    String str6 = localTimeLineObject1.xfI.wbM;
    ds localds = localTimeLineObject1.xfH;
    cth localcth = localTimeLineObject1.xfO;
    int i = localTimeLineObject1.xfI.wbJ;
    int j = localTimeLineObject1.xfI.wbL;
    TimeLineObject localTimeLineObject2 = com.tencent.mm.modelsns.e.ajM();
    localTimeLineObject2.jBB = paramn.field_userName;
    localTimeLineObject2.wEJ = paramn.field_pravited;
    localTimeLineObject2.xfF = str1;
    localTimeLineObject2.ijx = bo.nullAsNil((String)localObject);
    localTimeLineObject2.vjM = bo.nullAsNil(str2);
    localTimeLineObject2.xfK = localTimeLineObject1.xfK;
    localTimeLineObject2.xfL = localTimeLineObject1.xfL;
    localTimeLineObject2.fgt = localTimeLineObject1.fgt;
    localTimeLineObject2.xfM = localTimeLineObject1.xfM;
    localTimeLineObject2.rCK = localTimeLineObject1.rCK;
    localTimeLineObject2.xfI.Desc = str3;
    localTimeLineObject2.xfI.Title = str4;
    localTimeLineObject2.xfI.wbJ = i;
    localTimeLineObject2.xfI.wbL = j;
    localTimeLineObject2.xfI.Url = str5;
    localTimeLineObject2.xfI.wbM = str6;
    localTimeLineObject2.xfG = localayt;
    localTimeLineObject2.xfN = localTimeLineObject1.xfN;
    localTimeLineObject2.rjC = localTimeLineObject1.rjC;
    if (localTimeLineObject1.qNO != null)
      localTimeLineObject2.qNO = localTimeLineObject1.qNO;
    if (localds != null)
      localTimeLineObject2.xfH = localds;
    if (localcth != null)
      localTimeLineObject2.xfO = localcth;
    localObject = localTimeLineObject1.xfI.wbK.iterator();
    while (((Iterator)localObject).hasNext())
    {
      paramn = (bau)((Iterator)localObject).next();
      if (paramn.wEN == 1)
        localTimeLineObject2.xfI.wbK.add(paramn);
    }
    if (localTimeLineObject1.qNQ != null)
      localTimeLineObject2.qNQ = localTimeLineObject1.qNQ;
    paramn = v.Zp().y(parambav.cvF, true);
    if (paramn.containsKey("_DATA_CENTER_ITEM_SHOW_TYPE"))
    {
      j = paramn.getInt("_DATA_CENTER_ITEM_SHOW_TYPE", -1);
      if (j != -1)
      {
        localTimeLineObject2.xfI.wbN = new azu();
        localTimeLineObject2.xfI.wbN.vGc = j;
        if (j == 5)
        {
          localTimeLineObject2.xfI.wbN.fgd = paramn.getString("_DATA_CENTER_VID", "");
          localTimeLineObject2.xfI.wbN.fga = paramn.getInt("_DATA_CENTER_PUB_TIME", 0);
          localTimeLineObject2.xfI.wbN.duration = paramn.getInt("_DATA_CENTER__DULATION", 0);
          localTimeLineObject2.xfI.wbN.desc = paramn.getString("_DATA_CENTER_DESC", "");
          localTimeLineObject2.xfI.wbN.lvx = paramn.getString("_DATA_CENTER_COVER_URL", "");
          localTimeLineObject2.xfI.wbN.videoWidth = paramn.getInt("_DATA_CENTER_VIDEO_WIDTH", 0);
          localTimeLineObject2.xfI.wbN.videoHeight = paramn.getInt("_DATA_CENTER_VIDEO_HEIGHT", 0);
          localTimeLineObject2.xfI.wbN.fgc = paramn.getInt("_DATA_CENTER_FUNC_FLAG", 0);
        }
      }
    }
    AppMethodBeat.o(36703);
    return localTimeLineObject2;
  }

  // ERROR //
  private void a(n paramn, int paramInt1, int paramInt2, String paramString)
  {
    // Byte code:
    //   0: ldc_w 503
    //   3: invokestatic 41	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: ldc 69
    //   8: new 108	java/lang/StringBuilder
    //   11: dup
    //   12: ldc_w 505
    //   15: invokespecial 113	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   18: aload_1
    //   19: invokevirtual 508	com/tencent/mm/plugin/sns/storage/n:cqU	()Ljava/lang/String;
    //   22: invokevirtual 125	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   25: ldc_w 510
    //   28: invokevirtual 125	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   31: iload_3
    //   32: invokevirtual 120	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   35: ldc_w 512
    //   38: invokevirtual 125	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   41: aload 4
    //   43: invokevirtual 125	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   46: invokevirtual 132	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   49: invokestatic 134	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   52: getstatic 518	com/tencent/mm/plugin/report/service/h:pYm	Lcom/tencent/mm/plugin/report/service/h;
    //   55: ldc2_w 519
    //   58: ldc2_w 521
    //   61: lconst_1
    //   62: iconst_1
    //   63: invokevirtual 525	com/tencent/mm/plugin/report/service/h:a	(JJJZ)V
    //   66: iload_2
    //   67: ifeq +231 -> 298
    //   70: invokestatic 87	com/tencent/mm/plugin/sns/model/af:cnu	()Lcom/tencent/mm/plugin/sns/storage/s;
    //   73: iload_2
    //   74: i2l
    //   75: invokevirtual 93	com/tencent/mm/plugin/sns/storage/s:kE	(J)Lcom/tencent/mm/plugin/sns/storage/r;
    //   78: astore 5
    //   80: new 95	com/tencent/mm/protocal/protobuf/bax
    //   83: astore 4
    //   85: aload 4
    //   87: invokespecial 96	com/tencent/mm/protocal/protobuf/bax:<init>	()V
    //   90: aload 4
    //   92: aload 5
    //   94: getfield 102	com/tencent/mm/plugin/sns/storage/r:rfI	[B
    //   97: invokevirtual 106	com/tencent/mm/protocal/protobuf/bax:parseFrom	([B)Lcom/tencent/mm/bt/a;
    //   100: checkcast 95	com/tencent/mm/protocal/protobuf/bax
    //   103: getfield 128	com/tencent/mm/protocal/protobuf/bax:wFm	I
    //   106: istore 6
    //   108: aload_1
    //   109: invokevirtual 529	com/tencent/mm/plugin/sns/storage/n:cqM	()Lcom/tencent/mm/protocal/protobuf/bav;
    //   112: astore 4
    //   114: iload 6
    //   116: istore_2
    //   117: aload 4
    //   119: ifnull +22 -> 141
    //   122: aload 4
    //   124: iload 6
    //   126: putfield 530	com/tencent/mm/protocal/protobuf/bav:wFm	I
    //   129: aload_1
    //   130: aload 4
    //   132: invokevirtual 533	com/tencent/mm/protocal/protobuf/bav:toByteArray	()[B
    //   135: putfield 536	com/tencent/mm/plugin/sns/storage/n:field_postBuf	[B
    //   138: iload 6
    //   140: istore_2
    //   141: ldc 69
    //   143: ldc_w 538
    //   146: iload_2
    //   147: invokestatic 541	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   150: invokevirtual 221	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   153: invokestatic 544	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   156: aload_1
    //   157: invokevirtual 547	com/tencent/mm/plugin/sns/storage/n:cqY	()V
    //   160: invokestatic 551	com/tencent/mm/plugin/sns/model/af:cnF	()Lcom/tencent/mm/plugin/sns/storage/o;
    //   163: aload_1
    //   164: getfield 554	com/tencent/mm/plugin/sns/storage/n:reX	I
    //   167: aload_1
    //   168: invokevirtual 560	com/tencent/mm/plugin/sns/storage/o:b	(ILcom/tencent/mm/plugin/sns/storage/n;)I
    //   171: pop
    //   172: ldc 69
    //   174: new 108	java/lang/StringBuilder
    //   177: dup
    //   178: ldc_w 562
    //   181: invokespecial 113	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   184: aload_1
    //   185: getfield 554	com/tencent/mm/plugin/sns/storage/n:reX	I
    //   188: invokevirtual 120	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   191: invokevirtual 132	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   194: invokestatic 544	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   197: new 564	com/tencent/mm/g/a/rp
    //   200: dup
    //   201: invokespecial 565	com/tencent/mm/g/a/rp:<init>	()V
    //   204: astore 4
    //   206: aload 4
    //   208: getfield 569	com/tencent/mm/g/a/rp:cNA	Lcom/tencent/mm/g/a/rp$a;
    //   211: aload_1
    //   212: getfield 554	com/tencent/mm/plugin/sns/storage/n:reX	I
    //   215: i2l
    //   216: putfield 575	com/tencent/mm/g/a/rp$a:cNB	J
    //   219: getstatic 581	com/tencent/mm/sdk/b/a:xxA	Lcom/tencent/mm/sdk/b/a;
    //   222: aload 4
    //   224: invokevirtual 585	com/tencent/mm/sdk/b/a:m	(Lcom/tencent/mm/sdk/b/b;)Z
    //   227: pop
    //   228: iload_3
    //   229: tableswitch	default:+39 -> 268, 1:+89->318, 2:+100->329, 3:+111->340, 4:+122->351, 5:+133->362, 6:+144->373
    //   269: aload_1
    //   270: getfield 554	com/tencent/mm/plugin/sns/storage/n:reX	I
    //   273: iconst_0
    //   274: invokespecial 589	com/tencent/mm/plugin/sns/model/aw:ac	(IZ)V
    //   277: ldc_w 503
    //   280: invokestatic 60	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   283: return
    //   284: astore 4
    //   286: iconst_0
    //   287: istore_2
    //   288: ldc 69
    //   290: ldc 191
    //   292: invokestatic 77	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   295: goto -154 -> 141
    //   298: aload_1
    //   299: invokevirtual 529	com/tencent/mm/plugin/sns/storage/n:cqM	()Lcom/tencent/mm/protocal/protobuf/bav;
    //   302: astore 4
    //   304: aload 4
    //   306: ifnull +86 -> 392
    //   309: aload 4
    //   311: getfield 530	com/tencent/mm/protocal/protobuf/bav:wFm	I
    //   314: istore_2
    //   315: goto -174 -> 141
    //   318: ldc 69
    //   320: ldc_w 591
    //   323: invokestatic 77	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   326: goto -58 -> 268
    //   329: ldc 69
    //   331: ldc_w 593
    //   334: invokestatic 77	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   337: goto -69 -> 268
    //   340: ldc 69
    //   342: ldc_w 595
    //   345: invokestatic 77	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   348: goto -80 -> 268
    //   351: ldc 69
    //   353: ldc_w 597
    //   356: invokestatic 77	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   359: goto -91 -> 268
    //   362: ldc 69
    //   364: ldc_w 599
    //   367: invokestatic 77	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   370: goto -102 -> 268
    //   373: ldc 69
    //   375: ldc_w 601
    //   378: invokestatic 77	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   381: goto -113 -> 268
    //   384: astore 4
    //   386: iload 6
    //   388: istore_2
    //   389: goto -101 -> 288
    //   392: iconst_0
    //   393: istore_2
    //   394: goto -253 -> 141
    //
    // Exception table:
    //   from	to	target	type
    //   80	108	284	java/lang/Exception
    //   108	114	384	java/lang/Exception
    //   122	138	384	java/lang/Exception
  }

  private void a(n paramn, int paramInt, String paramString)
  {
    AppMethodBeat.i(36695);
    a(paramn, 0, paramInt, paramString);
    AppMethodBeat.o(36695);
  }

  private static void a(bav parambav)
  {
    AppMethodBeat.i(36707);
    if (parambav == null)
      AppMethodBeat.o(36707);
    while (true)
    {
      return;
      parambav = parambav.wFf.iterator();
      while (parambav.hasNext())
      {
        ayq localayq = (ayq)parambav.next();
        af.cnE().CV(localayq.wCt);
      }
      AppMethodBeat.o(36707);
    }
  }

  private void ac(int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(36705);
    af.bCo().post(new aw.3(this, paramInt, paramBoolean));
    AppMethodBeat.o(36705);
  }

  public static ax b(WXMediaMessage paramWXMediaMessage, String paramString1, String paramString2, String paramString3)
  {
    AppMethodBeat.i(36697);
    ab.d("MicroMsg.UploadManager", "appmsg.description " + paramWXMediaMessage.description);
    ab.d("MicroMsg.UploadManager", "appmsg.title " + paramWXMediaMessage.title);
    Object localObject = paramWXMediaMessage.mediaObject;
    int i;
    ax localax;
    switch (((WXMediaMessage.IMediaObject)localObject).type())
    {
    default:
      i = -1;
      localax = new ax(i);
      localax.Ys(bo.bc(paramString2, "")).Yt(bo.bc(paramString3, ""));
      localax.Dh(5);
      ab.d("MicroMsg.UploadManager", "TimeLineType ".concat(String.valueOf(i)));
      if (i == -1)
      {
        ab.d("MicroMsg.UploadManager", "timeLineType is invalid");
        AppMethodBeat.o(36697);
        paramWXMediaMessage = null;
      }
      break;
    case 1:
    case 3:
    case 2:
    case 5:
    case 6:
    case 4:
    case 7:
    }
    while (true)
    {
      return paramWXMediaMessage;
      i = 2;
      break;
      i = 4;
      break;
      i = 1;
      break;
      i = 3;
      break;
      i = 5;
      break;
      i = 3;
      break;
      if (!bo.isNullOrNil(paramString1))
        localax.Ym(paramString1);
      localax.Yr(bo.bc(paramWXMediaMessage.title, "")).Yp(bo.bc(paramWXMediaMessage.description, ""));
      switch (((WXMediaMessage.IMediaObject)localObject).type())
      {
      default:
        ab.e("MicroMsg.UploadManager", "none type not support!");
        AppMethodBeat.o(36697);
        paramWXMediaMessage = null;
        break;
      case 1:
        paramWXMediaMessage = (WXTextObject)localObject;
        localax.Yp("");
        localax.Ym(paramWXMediaMessage.text);
      case 3:
      case 2:
      case 5:
      case 6:
      case 4:
      case 7:
        while (true)
        {
          label363: AppMethodBeat.o(36697);
          paramWXMediaMessage = localax;
          break;
          paramString3 = (WXMusicObject)localObject;
          if (!bo.isNullOrNil(paramString3.musicUrl))
          {
            paramString1 = paramString3.musicUrl;
            label396: paramString2 = bo.bc(paramString1, "");
            if (bo.isNullOrNil(paramString3.musicDataUrl))
              break label478;
          }
          label478: for (paramString1 = paramString3.musicDataUrl; ; paramString1 = paramString3.musicUrl)
          {
            localObject = bo.bc(paramString1, "");
            localax.Yr("").Yp("");
            i = Db(3);
            if (i != -1)
              break label486;
            ab.d("MicroMsg.UploadManager", "mediaType is invalid");
            AppMethodBeat.o(36697);
            paramWXMediaMessage = null;
            break;
            paramString1 = paramString3.musicLowBandUrl;
            break label396;
          }
          label486: if (!bo.isNullOrNil(paramString3.musicLowBandDataUrl));
          for (paramString1 = paramString3.musicLowBandDataUrl; ; paramString1 = paramString3.musicLowBandUrl)
          {
            paramString1 = bo.bc(paramString1, "");
            if (localax.a(paramWXMediaMessage.thumbData, paramString2, paramString1, (String)localObject, i, bo.bc(paramWXMediaMessage.title, ""), bo.bc(paramWXMediaMessage.description, "")))
              break label363;
            AppMethodBeat.o(36697);
            paramWXMediaMessage = null;
            break;
          }
          paramWXMediaMessage = (WXImageObject)localObject;
          if (!bo.cb(paramWXMediaMessage.imageData))
          {
            if (localax.b(paramWXMediaMessage.imageData, "", ""))
              continue;
            AppMethodBeat.o(36697);
            paramWXMediaMessage = null;
            break;
          }
          if (!bo.isNullOrNil(paramWXMediaMessage.imagePath))
          {
            if (localax.ge(paramWXMediaMessage.imagePath, ""))
              continue;
            AppMethodBeat.o(36697);
            paramWXMediaMessage = null;
            break;
          }
          ab.e("MicroMsg.UploadManager", "share img but no res is exist!");
          AppMethodBeat.o(36697);
          paramWXMediaMessage = null;
          break;
          paramString1 = (WXWebpageObject)localObject;
          if (!bo.cb(paramWXMediaMessage.thumbData))
            localax.b(paramWXMediaMessage.thumbData, bo.bc(paramWXMediaMessage.description, ""), bo.bc(paramWXMediaMessage.title, ""));
          localax.Yp(paramString1.webpageUrl).Yq(paramString1.webpageUrl);
          paramWXMediaMessage = paramString1.webpageUrl;
          localax.qNK.xfI.Url = paramWXMediaMessage;
          localax.Yo(paramString1.canvasPageXml);
          continue;
          ab.e("MicroMsg.UploadManager", "file is not support!");
          AppMethodBeat.o(36697);
          paramWXMediaMessage = null;
          break;
          paramString2 = (WXVideoObject)localObject;
          localax.Yr("").Yp("");
          i = Db(4);
          if (i == -1)
          {
            ab.d("MicroMsg.UploadManager", "mediaType is invalid");
            AppMethodBeat.o(36697);
            paramWXMediaMessage = null;
            break;
          }
          if (!bo.isNullOrNil(paramString2.videoUrl));
          for (paramString1 = paramString2.videoUrl; ; paramString1 = paramString2.videoLowBandUrl)
          {
            paramString1 = bo.bc(paramString1, "");
            if (localax.a(paramWXMediaMessage.thumbData, paramString1, paramString2.videoLowBandUrl, paramString2.videoUrl, i, bo.bc(paramWXMediaMessage.title, ""), bo.bc(paramWXMediaMessage.description, "")))
              break label363;
            AppMethodBeat.o(36697);
            paramWXMediaMessage = null;
            break;
          }
          paramWXMediaMessage = (WXAppExtendObject)localObject;
          if ((bo.isNullOrNil(paramWXMediaMessage.filePath)) || (!paramWXMediaMessage.filePath.startsWith("http")))
            break label954;
          localax.Yr(paramWXMediaMessage.filePath);
          localax.Yp(paramWXMediaMessage.filePath);
        }
        label954: ab.e("MicroMsg.UploadManager", "appdata is not support!");
        AppMethodBeat.o(36697);
        paramWXMediaMessage = null;
      }
    }
  }

  private boolean com()
  {
    AppMethodBeat.i(36702);
    Object localObject1 = af.cnF();
    Object localObject2 = "select *,rowid from SnsInfo  where " + o.rfs + " order by SnsInfo.rowid asc ";
    localObject1 = ((o)localObject1).bSd.rawQuery((String)localObject2, null);
    ab.d("MicroMsg.SnsInfoStorage", "getLastUpload ".concat(String.valueOf(localObject2)));
    boolean bool;
    if (((Cursor)localObject1).getCount() == 0)
    {
      ((Cursor)localObject1).close();
      localObject1 = null;
      localObject2 = new n();
      if (localObject1 != null)
        break label113;
      bool = false;
      AppMethodBeat.o(36702);
    }
    while (true)
    {
      return bool;
      ((Cursor)localObject1).moveToFirst();
      break;
      label113: ((Cursor)localObject1).moveToFirst();
      label120: ((n)localObject2).d((Cursor)localObject1);
      try
      {
        bav localbav = new com/tencent/mm/protocal/protobuf/bav;
        localbav.<init>();
        localbav = (bav)localbav.parseFrom(((n)localObject2).field_postBuf);
        if (n.kC(localbav.wFi))
        {
          a(localbav);
          a((n)localObject2, 6, "snsinfo is tle");
          ab.i("MicroMsg.UploadManager", "checkTLE snsinfo localId it time limit " + ((n)localObject2).cqU() + " is die ");
        }
        if (((Cursor)localObject1).moveToNext())
          break label120;
        ((Cursor)localObject1).close();
        bool = true;
        AppMethodBeat.o(36702);
      }
      catch (Exception localException)
      {
        while (true)
        {
          ab.e("MicroMsg.UploadManager", "startPost parseFrom MediaPostInfo Exception");
          a((n)localObject2, 2, "MediaPostInfo parser error");
        }
      }
    }
  }

  private boolean t(n paramn)
  {
    boolean bool1 = false;
    AppMethodBeat.i(36699);
    boolean bool2;
    if (paramn == null)
    {
      AppMethodBeat.o(36699);
      bool2 = bool1;
    }
    Object localObject1;
    Object localObject2;
    while (true)
    {
      return bool2;
      localObject1 = paramn.cqu();
      if (((TimeLineObject)localObject1).xfI.wbJ == 8)
      {
        AppMethodBeat.o(36699);
        bool2 = true;
      }
      else if (((TimeLineObject)localObject1).xfI.wbJ == 2)
      {
        AppMethodBeat.o(36699);
        bool2 = true;
      }
      else if (((TimeLineObject)localObject1).xfI.wbJ == 26)
      {
        localObject2 = new gh();
        ((gh)localObject2).cAH.type = 30;
        ((gh)localObject2).cAH.cAO = 5;
        ((gh)localObject2).cAH.desc = ((TimeLineObject)localObject1).xfI.wbM;
        ((gh)localObject2).cAH.cAN = String.valueOf(paramn.reX);
        com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject2);
        if (((gh)localObject2).cAI.ret != 1)
        {
          AppMethodBeat.o(36699);
          bool2 = bool1;
        }
      }
      else if ((localObject1 == null) || (((TimeLineObject)localObject1).xfI.wbK == null))
      {
        a(paramn, 1, "timeline or timelineObjList is null");
        AppMethodBeat.o(36699);
        bool2 = bool1;
      }
      else
      {
        if (((TimeLineObject)localObject1).xfI.wbK.size() != 0)
          break;
        AppMethodBeat.o(36699);
        bool2 = true;
      }
    }
    while (true)
    {
      bav localbav;
      Object localObject3;
      try
      {
        localObject2 = new com/tencent/mm/protocal/protobuf/bav;
        ((bav)localObject2).<init>();
        localbav = (bav)((bav)localObject2).parseFrom(paramn.field_postBuf);
        if (((TimeLineObject)localObject1).xfI.wbJ != 1)
          break label614;
        if (localbav.wFf.size() <= 1)
          break label459;
        bool2 = true;
        if (((TimeLineObject)localObject1).xfI.wbJ != 21)
          break label611;
        bool2 = false;
        if (((TimeLineObject)localObject1).xfI.wbJ != 15)
          break label494;
        localObject2 = localbav.wFf.iterator();
        if (!((Iterator)localObject2).hasNext())
          break label483;
        localObject1 = (ayq)((Iterator)localObject2).next();
        localObject3 = Dc(((ayq)localObject1).wCt);
        if (localObject3 != aw.b.qNB)
          break label464;
        a(paramn, ((ayq)localObject1).wCt, 2, "upload has set it fail");
        AppMethodBeat.o(36699);
        bool2 = bool1;
      }
      catch (Exception localException)
      {
        ab.e("MicroMsg.UploadManager", "error to parser postinfo in canPost " + paramn.cqU());
        a(paramn, 2, "mediaPostInfo parser error " + localException.getMessage());
        AppMethodBeat.o(36699);
        bool2 = bool1;
      }
      break;
      label459: bool2 = false;
      continue;
      label464: if (localObject3 == aw.b.qND)
      {
        AppMethodBeat.o(36699);
        bool2 = bool1;
        break;
        label483: AppMethodBeat.o(36699);
        bool2 = true;
        break;
        label494: localObject3 = localbav.wFf.iterator();
        while (true)
          if (((Iterator)localObject3).hasNext())
          {
            localObject2 = (ayq)((Iterator)localObject3).next();
            aw.b localb = a(((ayq)localObject2).wCt, bool2, localbav, localException.xfI.wbJ);
            if (localb == aw.b.qNB)
            {
              a(paramn, ((ayq)localObject2).wCt, 2, "upload has set it fail");
              AppMethodBeat.o(36699);
              bool2 = bool1;
              break;
            }
            if (localb == aw.b.qND)
            {
              AppMethodBeat.o(36699);
              bool2 = bool1;
              break;
            }
          }
        AppMethodBeat.o(36699);
        bool2 = true;
        break;
        label611: continue;
        label614: bool2 = true;
      }
    }
  }

  private boolean v(n paramn)
  {
    AppMethodBeat.i(36704);
    bav localbav2;
    boolean bool;
    TimeLineObject localTimeLineObject;
    Object localObject2;
    int i;
    label215: int j;
    Object localObject3;
    Object localObject4;
    label431: String str1;
    String str2;
    int k;
    Object localObject5;
    Object localObject1;
    while (true)
    {
      try
      {
        bav localbav1 = new com/tencent/mm/protocal/protobuf/bav;
        localbav1.<init>();
        localbav2 = (bav)localbav1.parseFrom(paramn.field_postBuf);
        localbav2.eRu += 1;
        paramn.field_postBuf = localbav2.toByteArray();
        af.cnF().b(paramn.reX, paramn);
        if (n.kC(localbav2.wFi))
        {
          a(paramn, 6, "this item isTimeLimit");
          ab.i("MicroMsg.UploadManager", "snsinfo localId it time limit " + paramn.cqU() + " is die ");
          bool = false;
          AppMethodBeat.o(36704);
          return bool;
        }
      }
      catch (Exception localException1)
      {
        ab.e("MicroMsg.UploadManager", "startPost parseFrom MediaPostInfo Exception");
        a(paramn, 2, "MediaPostInfo parser error:" + localException1.getMessage());
        bool = false;
        AppMethodBeat.o(36704);
        continue;
        ab.i("MicroMsg.UploadManager", "try start post " + paramn.cqU());
        if (!t(paramn))
          break label1108;
      }
      localTimeLineObject = paramn.cqu();
      localObject2 = a(paramn, localbav2);
      i = 0;
      if (i < localbav2.wFf.size())
      {
        j = ((ayq)localbav2.wFf.get(i)).wCt;
        localObject3 = af.cnu().kE(j);
        if (localObject3 == null)
        {
          a(paramn, 3, "can not get the media from db ,localMediaId: ".concat(String.valueOf(j)));
          bool = false;
          AppMethodBeat.o(36704);
          continue;
        }
        try
        {
          bax localbax = new com/tencent/mm/protocal/protobuf/bax;
          localbax.<init>();
          localObject4 = (bax)localbax.parseFrom(((com.tencent.mm.plugin.sns.storage.r)localObject3).rfI);
          if ((((bax)localObject4).wFA != null) && (((bax)localObject4).wFC.size() > 0))
            break label431;
          ab.e("MicroMsg.UploadManager", "item with not url" + paramn.field_type);
          if (paramn.field_type == 3)
            break label803;
          a(paramn, 4, "buf url is null");
          bool = false;
          AppMethodBeat.o(36704);
        }
        catch (Exception localException2)
        {
          ab.e("MicroMsg.UploadManager", "MediaUploadInfo parseFrom MediaUploadInfo Exception");
          a(paramn, 2, "mediaUploadInfo parser error " + localException2.getMessage());
          bool = false;
          AppMethodBeat.o(36704);
        }
        continue;
        str1 = ((bax)localObject4).wFA.Url;
        str2 = ((bar)((bax)localObject4).wFC.get(0)).Url;
        k = ((bax)localObject4).wFA.jCt;
        j = ((bar)((bax)localObject4).wFC.get(0)).jCt;
        localObject5 = ((bax)localObject4).cvZ;
        localObject1 = null;
        if (i < localTimeLineObject.xfI.wbK.size())
          localObject1 = ((bau)localTimeLineObject.xfI.wbK.get(i)).wEK;
        if ((localTimeLineObject.xfI.wbJ == 4) || (localTimeLineObject.xfI.wbJ == 5))
        {
          if (i >= localTimeLineObject.xfI.wbK.size())
            break label1151;
          localObject1 = (bau)localTimeLineObject.xfI.wbK.get(i);
          ((bau)localObject1).wEH = str2;
          ((bau)localObject1).wEI = j;
        }
      }
    }
    while (true)
    {
      if ((localObject1 != null) && (((TimeLineObject)localObject2).xfI.wbJ == 1))
        ((bau)localObject1).cvZ = ((String)localObject5);
      if ((localObject1 != null) && (((TimeLineObject)localObject2).xfI.wbJ == 15))
      {
        ((bau)localObject1).cvZ = ((bax)localObject4).cvZ;
        ((bau)localObject1).wFc = ((bax)localObject4).wFc;
      }
      if (i < localTimeLineObject.xfI.wbK.size())
      {
        localObject4 = (bau)localTimeLineObject.xfI.wbK.get(i);
        ((bau)localObject1).Title = ((bau)localObject4).Title;
        ((bau)localObject1).Desc = ((bau)localObject4).Desc;
        ((bau)localObject1).cuu = ((bau)localObject4).cuu;
        ((bau)localObject1).rik = ((bau)localObject4).rik;
      }
      if (localObject1 == null)
      {
        a(paramn, 3, "make media error");
        bool = false;
        AppMethodBeat.o(36704);
        break;
        localObject1 = com.tencent.mm.modelsns.e.a(((com.tencent.mm.plugin.sns.storage.r)localObject3).rfH, ((com.tencent.mm.plugin.sns.storage.r)localObject3).type, str1, str2, k, j, ((bax)localObject4).wEJ, "", (baw)localObject1);
        continue;
      }
      ((TimeLineObject)localObject2).xfI.wbK.add(localObject1);
      i++;
      break label215;
      label803: if (!af.cnE().CS(paramn.reX))
      {
        ab.d("MicroMsg.UploadManager", "this snsinfo is posting");
        bool = false;
        AppMethodBeat.o(36704);
        break;
      }
      localObject1 = new LinkedList();
      localObject4 = localbav2.wFg.iterator();
      while (((Iterator)localObject4).hasNext())
        ((List)localObject1).add(((cco)((Iterator)localObject4).next()).jBB);
      localObject4 = j.b((TimeLineObject)localObject2);
      ab.d("MicroMsg.UploadManager", "timeLine contentDescScene ：  " + ((TimeLineObject)localObject2).xfL + " contentDescShowType: " + ((TimeLineObject)localObject2).xfK);
      if (paramn.field_pravited == 1)
        ab.i("MicroMsg.UploadManager", "content private xml is null ? " + bo.isNullOrNil((String)localObject4));
      while (true)
      {
        if ((localObject4 != null) && (!((String)localObject4).equals("")))
          break label1034;
        a(paramn, 5, "content is error");
        af.cnE().CT(paramn.reX);
        bool = false;
        AppMethodBeat.o(36704);
        break;
        ab.i("MicroMsg.UploadManager", "upload xmlsns: %s", new Object[] { localObject4 });
      }
      label1034: if (localbav2.wFo == 1);
      for (bool = true; ; bool = false)
      {
        i = paramn.reX;
        localObject3 = localbav2.wFp;
        localObject5 = ((TimeLineObject)localObject2).xfG.wCG;
        localObject2 = ((TimeLineObject)localObject2).xfI.Title;
        af.bCo().post(new aw.4(this, (String)localObject4, localbav2, (List)localObject1, localTimeLineObject, i, bool, (LinkedList)localObject3, (com.tencent.mm.bt.b)localObject5, (String)localObject2));
        label1108: ab.d("MicroMsg.UploadManager", "startPost, canPost is false, snsInfoId: " + paramn.cqU());
        bool = true;
        AppMethodBeat.o(36704);
        break;
      }
      label1151: localObject1 = null;
    }
  }

  public final boolean a(WXMediaMessage paramWXMediaMessage, String paramString1, String paramString2, String paramString3, int paramInt)
  {
    boolean bool = true;
    AppMethodBeat.i(36698);
    paramString1 = b(paramWXMediaMessage, paramString1, paramString2, paramString3);
    if (paramString1 == null)
    {
      bool = false;
      AppMethodBeat.o(36698);
    }
    while (true)
    {
      return bool;
      paramString1.Yn(paramWXMediaMessage.mediaTagName);
      paramString1.af(paramString2, paramWXMediaMessage.messageExt, paramWXMediaMessage.messageAction);
      if (paramInt > com.tencent.mm.plugin.sns.c.a.qFE)
        paramString1.Dd(1);
      ab.d("MicroMsg.UploadManager", "shareAppMsg set and the result: ".concat(String.valueOf(paramString1.commit())));
      AppMethodBeat.o(36698);
    }
  }

  public final void cmp()
  {
    AppMethodBeat.i(36701);
    af.bCo().postDelayed(new aw.1(this), 1000L);
    AppMethodBeat.o(36701);
  }

  public final String cnk()
  {
    AppMethodBeat.i(36692);
    if ((this.ecX == null) || (this.ecX.equals("")))
    {
      com.tencent.mm.kernel.g.RQ();
      this.ecX = ((String)com.tencent.mm.kernel.g.RP().Ry().get(2, null));
    }
    String str = this.ecX;
    AppMethodBeat.o(36692);
    return str;
  }

  public final void con()
  {
    AppMethodBeat.i(36709);
    Iterator localIterator = this.epg.iterator();
    while (localIterator.hasNext())
    {
      a locala = (a)localIterator.next();
      if (locala != null)
        locala.coo();
    }
    AppMethodBeat.o(36709);
  }

  public final boolean fU(String paramString1, String paramString2)
  {
    boolean bool = true;
    AppMethodBeat.i(36696);
    ab.d("MicroMsg.UploadManager", "imgPath " + paramString1 + " text " + paramString2);
    String str = af.getAccSnsTmpPath() + com.tencent.mm.a.g.x(paramString1.getBytes());
    com.tencent.mm.vfs.e.y(paramString1, str);
    paramString1 = new ax(1);
    paramString1.Ym(paramString2);
    paramString1.Dh(6);
    paramString2 = new LinkedList();
    paramString2.add(new h(str, 2));
    paramString1.dh(paramString2);
    if (paramString1.commit() > 0)
      AppMethodBeat.o(36696);
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(36696);
    }
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(36710);
    ab.i("MicroMsg.UploadManager", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString + " type = " + paramm.getType() + " @" + hashCode());
    switch (paramm.getType())
    {
    case 208:
    default:
      if ((paramInt1 != 0) || (paramInt2 != 0))
        AppMethodBeat.o(36710);
      break;
    case 207:
    case 209:
    }
    while (true)
    {
      return;
      if ((paramInt1 == 0) && (paramInt2 == 0))
        break;
      cmp();
      break;
      paramString = (s)paramm;
      int i = paramString.cNE;
      if (paramString.ekq)
      {
        long l = paramString.qJo;
        ab.i("MicroMsg.UploadManager", "get the del post come back %d ".concat(String.valueOf(l)), new Object[] { Integer.valueOf(i) });
        if (l != 0L)
        {
          af.cnE().km(l);
          com.tencent.mm.kernel.g.RQ();
          com.tencent.mm.kernel.g.RO().eJo.a(new r(l, 1), 0);
        }
        af.cnF().DL(i);
        if (l != 0L)
        {
          af.cnK().ky(l);
          com.tencent.mm.plugin.sns.storage.i.kx(l);
        }
      }
      if ((paramInt1 != 0) || (paramInt2 != 0))
        ac(paramString.cNE, false);
      while (true)
      {
        this.qNn = null;
        break;
        ac(paramString.cNE, true);
        ak.iN(paramString.qJo);
      }
      AppMethodBeat.o(36710);
    }
  }

  public final void start()
  {
    AppMethodBeat.i(36693);
    com.tencent.mm.kernel.g.RQ();
    com.tencent.mm.kernel.g.RO().eJo.a(207, this);
    com.tencent.mm.kernel.g.RQ();
    com.tencent.mm.kernel.g.RO().eJo.a(209, this);
    AppMethodBeat.o(36693);
  }

  public final void u(n paramn)
  {
    AppMethodBeat.i(36700);
    if (paramn == null)
      AppMethodBeat.o(36700);
    while (true)
    {
      return;
      ab.i("MicroMsg.UploadManager", "cancel snsinfo " + paramn.cqU());
      try
      {
        Object localObject1 = new com/tencent/mm/protocal/protobuf/bav;
        ((bav)localObject1).<init>();
        localObject1 = (bav)((bav)localObject1).parseFrom(paramn.field_postBuf);
        if ((localObject1 != null) && (((bav)localObject1).wFf != null))
        {
          localObject1 = ((bav)localObject1).wFf.iterator();
          while (((Iterator)localObject1).hasNext())
          {
            ayq localayq = (ayq)((Iterator)localObject1).next();
            int i = af.cnE().CX(localayq.wCt);
            af.cnE().CW(localayq.wCt);
            ab.i("MicroMsg.UploadManager", "cancel upload %d", new Object[] { Integer.valueOf(i) });
            if ((paramn.field_type != 15) && (i >= 0))
            {
              com.tencent.mm.kernel.g.RQ();
              com.tencent.mm.kernel.g.RO().eJo.cancel(i);
              af.cnE().CV(localayq.wCt);
            }
          }
        }
      }
      catch (Exception localException)
      {
        while (true)
        {
          ab.e("MicroMsg.UploadManager", "error to parser postinfo in canPost " + paramn.cqU());
          a(paramn, 2, "mediaPostInfo parser error " + localException.getMessage());
          localObject2 = null;
        }
        if ((af.cnE().CR(paramn.reX)) && (this.qNn != null))
        {
          ab.i("MicroMsg.UploadManager", "cancel post");
          this.qNn.ekq = true;
          com.tencent.mm.kernel.g.RQ();
          com.tencent.mm.kernel.g.RO().eJo.c(this.qNn);
          af.cnE().CT(paramn.reX);
        }
        Object localObject2 = af.cnF().DK(paramn.reX);
        if ((localObject2 != null) && (((n)localObject2).field_snsId != 0L))
        {
          af.cnE().km(((n)localObject2).field_snsId);
          com.tencent.mm.kernel.g.RQ();
          com.tencent.mm.kernel.g.RO().eJo.a(new r(((n)localObject2).field_snsId, 1), 0);
        }
        af.cnF().DL(paramn.reX);
        if (paramn.field_type == 21)
          com.tencent.mm.plugin.sns.lucky.a.g.cmv().cmx();
        ab.d("MicroMsg.UploadManager", "cancelPost, publish SnsPostFailEvent, snsInfoLocalId " + paramn.cqU());
        localObject2 = new rp();
        ((rp)localObject2).cNA.cNB = paramn.reX;
        com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject2);
        AppMethodBeat.o(36700);
      }
    }
  }

  public static abstract interface a
  {
    public abstract void ad(int paramInt, boolean paramBoolean);

    public abstract void coo();
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.model.aw
 * JD-Core Version:    0.6.2
 */