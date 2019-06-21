package com.tencent.mm.modelvideo;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.i;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.m.a;
import com.tencent.mm.ai.m.b;
import com.tencent.mm.model.bh;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.platformtools.ae;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.protocal.protobuf.SKBuiltinBuffer_t;
import com.tencent.mm.protocal.protobuf.baa;
import com.tencent.mm.protocal.protobuf.cfh;
import com.tencent.mm.protocal.protobuf.cls;
import com.tencent.mm.protocal.protobuf.clt;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.br;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.z;
import java.util.Map;
import java.util.Vector;
import junit.framework.Assert;

public final class g extends m
  implements k
{
  private static int fVE = 32000;
  private final int MAX_TIMES;
  private String cMW;
  boolean cng;
  com.tencent.mm.compatible.util.g.a eOm;
  private com.tencent.mm.ai.b ehh;
  private com.tencent.mm.ai.f ehi;
  private String fFa;
  private com.tencent.mm.i.g.a fFk;
  private boolean fFs;
  private final long fVF;
  private int fVG;
  private boolean fVH;
  private boolean fVI;
  private int fVJ;
  private int fVK;
  int fVL;
  public s fVj;
  private int fVl;
  private boolean fVm;
  public String fileName;
  ap frk;
  int retCode;
  private long startTime;

  public g(String paramString)
  {
    AppMethodBeat.i(50699);
    this.cMW = "";
    this.fVF = 1800000L;
    this.retCode = 0;
    this.fVm = false;
    this.cng = false;
    this.eOm = null;
    this.fFs = true;
    this.fFa = "";
    this.startTime = 0L;
    this.fVG = -1;
    this.fVl = com.tencent.mm.i.a.MediaType_VIDEO;
    this.fVH = false;
    this.fVI = false;
    this.fVJ = 0;
    this.fVK = 0;
    this.fFk = new g.1(this);
    this.fVL = 0;
    this.frk = new ap(new g.2(this), true);
    boolean bool;
    if (paramString != null)
    {
      bool = true;
      Assert.assertTrue(bool);
      com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.NetSceneUploadVideo", "NetSceneUploadVideo:  file:".concat(String.valueOf(paramString)));
      this.fileName = paramString;
      this.fVj = u.ut(paramString);
      if (this.fVj == null)
        break label253;
    }
    label253: for (this.MAX_TIMES = 2500; ; this.MAX_TIMES = 0)
    {
      this.eOm = new com.tencent.mm.compatible.util.g.a();
      if ((this.fVj != null) && (3 == this.fVj.fXk))
        this.fVl = com.tencent.mm.i.a.MediaType_TinyVideo;
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.NetSceneUploadVideo", "%s NetSceneUploadVideo:  videoType:[%d]", new Object[] { alb(), Integer.valueOf(this.fVl) });
      AppMethodBeat.o(50699);
      return;
      bool = false;
      break;
    }
  }

  private boolean ala()
  {
    AppMethodBeat.i(50698);
    boolean bool1;
    if (com.tencent.mm.model.t.nJ(this.fVj.getUser()))
    {
      com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.NetSceneUploadVideo", "%s cdntra not use cdn user:%s", new Object[] { alb(), this.fVj.getUser() });
      bool1 = false;
      AppMethodBeat.o(50698);
    }
    Object localObject1;
    String str1;
    com.tencent.mm.i.g localg;
    int i;
    label310: label358: String str2;
    Object localObject3;
    while (true)
    {
      return bool1;
      com.tencent.mm.al.f.afx();
      if ((!com.tencent.mm.al.b.lg(2)) && (this.fVj.fXi != 1))
      {
        localObject1 = alb();
        com.tencent.mm.al.f.afx();
        com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.NetSceneUploadVideo", "%s cdntra not use cdn flag:%b getCdnInfo:%d", new Object[] { localObject1, Boolean.valueOf(com.tencent.mm.al.b.lg(2)), Integer.valueOf(this.fVj.fXi) });
        bool1 = false;
        AppMethodBeat.o(50698);
      }
      else
      {
        this.fFa = com.tencent.mm.al.c.a("upvideo", this.fVj.createTime, this.fVj.getUser(), this.fVj.getFileName());
        if (bo.isNullOrNil(this.fFa))
        {
          com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.NetSceneUploadVideo", "%s cdntra genClientId failed not use cdn file:%s", new Object[] { alb(), this.fVj.getFileName() });
          bool1 = false;
          AppMethodBeat.o(50698);
        }
        else
        {
          o.all();
          localObject1 = t.ui(this.fileName);
          o.all();
          str1 = t.uh(this.fileName);
          localg = new com.tencent.mm.i.g();
          localg.egl = this.fFk;
          localg.field_mediaId = this.fFa;
          localg.field_fullpath = str1;
          localg.field_thumbpath = tW((String)localObject1);
          localg.field_fileType = com.tencent.mm.i.a.MediaType_VIDEO;
          localg.field_enable_hitcheck = this.fFs;
          if (com.tencent.mm.modelcontrol.d.afF().rT(str1))
          {
            i = 1;
            localg.field_largesvideo = i;
            if ((this.fVj != null) && (3 == this.fVj.fXk))
              localg.field_smallVideoFlag = 1;
            localObject1 = alb();
            if (this.fVj.fXn != null)
              break label719;
            bool1 = true;
            com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.NetSceneUploadVideo", "%s upload video MMSightExtInfo is null? %b %s", new Object[] { localObject1, Boolean.valueOf(bool1), this.fileName });
            if ((this.fVj.fXn != null) && (this.fVj.fXn.wDP))
            {
              com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.NetSceneUploadVideo", "%s local capture video, mark use large video", new Object[] { alb() });
              localObject1 = n.alj();
              o.all();
              ((n)localObject1).a("", t.uh(this.fileName), this.fVj.getUser(), "", "", 2, 2);
              com.tencent.mm.modelcontrol.d.afF();
              localg.field_largesvideo = com.tencent.mm.modelcontrol.d.a(com.tencent.mm.modelcontrol.d.afF().afG());
            }
            str2 = alb();
            localObject3 = this.fVj.getFileName();
            if (this.fVj.fXm != null)
              break label724;
            localObject1 = "null";
            label511: com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.NetSceneUploadVideo", "%s checkAD file:%s adinfo:%s", new Object[] { str2, localObject3, localObject1 });
            if ((this.fVj.fXm != null) && (!bo.isNullOrNil(this.fVj.fXm.fiM)))
              localg.field_advideoflag = 1;
            localg.field_talker = this.fVj.getUser();
            if (!com.tencent.mm.model.t.kH(this.fVj.getUser()))
              break label738;
          }
          label719: label724: label738: for (i = 1; ; i = 0)
          {
            localg.field_chattype = i;
            localg.field_priority = com.tencent.mm.i.a.efC;
            localg.field_needStorage = false;
            localg.field_isStreamMedia = false;
            localg.field_trysafecdn = true;
            this.fVK = ((int)com.tencent.mm.vfs.e.asZ(localg.field_fullpath));
            this.fVJ = ((int)com.tencent.mm.vfs.e.asZ(localg.field_thumbpath));
            if (this.fVJ < com.tencent.mm.i.a.efW)
              break label744;
            com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.NetSceneUploadVideo", "%s cdntra thumb[%s][%d] Too Big Not Use CDN TRANS", new Object[] { alb(), localg.field_thumbpath, Integer.valueOf(this.fVJ) });
            bool1 = false;
            AppMethodBeat.o(50698);
            break;
            i = 0;
            break label310;
            bool1 = false;
            break label358;
            localObject1 = this.fVj.fXm.fiM;
            break label511;
          }
          label744: localObject1 = br.z(this.fVj.alw(), "msg");
          if (localObject1 == null)
            break;
          localg.field_fileId = ((String)((Map)localObject1).get(".msg.videomsg.$cdnvideourl"));
          localg.field_aesKey = ((String)((Map)localObject1).get(".msg.videomsg.$aeskey"));
          this.fVI = true;
          label801: localObject1 = com.tencent.mm.plugin.report.service.h.pYm;
          if (!this.fVH)
            break label2863;
          i = 1;
          label815: ((com.tencent.mm.plugin.report.service.h)localObject1).e(12696, new Object[] { Integer.valueOf(i + 700), Integer.valueOf(this.fVj.frO) });
          if ((bo.isNullOrNil(localg.field_aesKey)) || (bo.isNullOrNil(localg.field_aesKey)))
          {
            localg.field_aesKey = "";
            localg.field_fileId = "";
          }
          com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.NetSceneUploadVideo", "%s summersafecdn check hit cache VideoHash :%s %s %s %b %d", new Object[] { alb(), localg.field_mediaId, localg.field_fileId, localg.field_aesKey, Boolean.valueOf(this.fFs), Integer.valueOf(localg.field_largesvideo) });
          if (com.tencent.mm.al.f.afx().e(localg))
            break label2882;
          com.tencent.mm.plugin.report.service.h.pYm.a(111L, 226L, 1L, false);
          com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.NetSceneUploadVideo", "%s cdntra addSendTask failed.", new Object[] { alb() });
          this.fFa = "";
          bool1 = false;
          AppMethodBeat.o(50698);
        }
      }
    }
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.NetSceneUploadVideo", "%s cdntra parse video recv xml failed", new Object[] { alb() });
    label1414: label1419: label2955: label2958: 
    while (true)
    {
      int j;
      long l1;
      try
      {
        str2 = bo.nullAsNil(((com.tencent.mm.plugin.zero.b.a)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.zero.b.a.class)).Nu().getValue("UseVideoHash"));
        localObject1 = str2.split(",");
        com.tencent.mm.kernel.g.RQ();
        com.tencent.mm.kernel.g.RN();
        i = i.bL(com.tencent.mm.kernel.a.QF(), 100);
        if ((localObject1 == null) || (localObject1.length <= 0))
          break label1419;
        if (bo.getInt(localObject1[0], 0) < i)
          break label1414;
        bool1 = true;
        if ((localObject1 == null) || (localObject1.length < 2))
          break label1430;
        if (bo.getInt(localObject1[1], 0) < i)
          break label1424;
        bool2 = true;
        if ((localObject1 == null) || (localObject1.length < 3))
          break label1442;
        if (bo.getInt(localObject1[2], 0) < i)
          break label1436;
        bool3 = true;
        if (!com.tencent.mm.sdk.a.b.dnO())
          break label2958;
        bool2 = true;
        bool1 = true;
        bool3 = true;
        if (!bool1)
          break label2858;
        localObject3 = o.all();
        j = bo.getInt(localObject1[2], 0);
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.VideoInfoStorage", "checkVideoHash in fullCheckRatio:%s path:%s stack:%s", new Object[] { Integer.valueOf(j), str1, bo.dpG() });
        l1 = bo.anU();
        if (!bo.isNullOrNil(str1))
          break label1448;
        com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.VideoInfoStorage", "checkVideoHash failed , path:%s ", new Object[] { str1 });
        localObject1 = "";
        label1251: if (bo.isNullOrNil((String)localObject1))
          break label2858;
        localObject1 = ((String)localObject1).split("##");
        label1266: if ((bool2) && (localObject1 != null) && (localObject1.length == 2))
        {
          localg.field_fileId = localObject1[0];
          localg.field_aesKey = localObject1[1];
          this.fVH = true;
        }
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.NetSceneUploadVideo", "%s CheckUseVideoHash debug:%s str:%s [%s,%s,%s] hasHash:%s [%s,%s]", new Object[] { alb(), Boolean.valueOf(com.tencent.mm.sdk.a.b.dnO()), str2, Boolean.valueOf(bool1), Boolean.valueOf(bool2), Boolean.valueOf(bool3), Boolean.valueOf(this.fVH), localg.field_fileId, localg.field_aesKey });
      }
      catch (Exception localException)
      {
        com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.NetSceneUploadVideo", "Check use videohash :%s", new Object[] { bo.l(localException) });
      }
      break label801;
      bool1 = false;
      continue;
      bool1 = false;
      continue;
      label1424: boolean bool2 = false;
      continue;
      label1430: bool2 = false;
      continue;
      label1436: boolean bool3 = false;
      continue;
      label1442: bool3 = false;
      continue;
      label1448: Object localObject2 = t.uk(str1);
      if ((localObject2 == null) || (localObject2.length < 33))
      {
        com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.VideoInfoStorage", "checkVideoHash  readHash failed :%s", new Object[] { str1 });
        localObject2 = "";
      }
      else
      {
        Object localObject4 = ((t)localObject3).fni;
        Object localObject5 = new java/lang/StringBuilder;
        ((StringBuilder)localObject5).<init>("delete from VideoHash where CreateTime < ");
        ((com.tencent.mm.cd.h)localObject4).hY("VideoHash", bo.anT() - 432000L);
        int k = localObject2[32];
        StringBuffer localStringBuffer = new java/lang/StringBuffer;
        localStringBuffer.<init>();
        for (i = 0; i < 32; i++)
          localStringBuffer.append(Integer.toHexString(localObject2[i]));
        int m = localStringBuffer.length();
        Vector localVector = new java/util/Vector;
        localVector.<init>();
        localObject5 = new java/util/Vector;
        ((Vector)localObject5).<init>();
        localObject4 = new java/util/Vector;
        ((Vector)localObject4).<init>();
        Object localObject6 = new java/util/Vector;
        ((Vector)localObject6).<init>();
        i = -1;
        Cursor localCursor = ((t)localObject3).fni.a("select size, CreateTime, hash, cdnxml, orgpath from VideoHash where size = ".concat(String.valueOf(k)), null, 0);
        label1649: long l2;
        String str4;
        String str5;
        int n;
        int i1;
        while (true)
          if (localCursor.moveToNext())
          {
            l2 = localCursor.getLong(1);
            String str3 = localCursor.getString(2);
            str4 = localCursor.getString(3);
            str5 = localCursor.getString(4);
            com.tencent.mm.sdk.platformtools.ab.v("MicroMsg.VideoInfoStorage", "checkVideoHash select [%s][%s]", new Object[] { str3, str4 });
            if ((bo.isNullOrNil(str3)) || (bo.isNullOrNil(str4)))
            {
              com.tencent.mm.plugin.report.service.h.pYm.e(12696, new Object[] { Integer.valueOf(104), Integer.valueOf(k) });
              com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.VideoInfoStorage", "checkVideoHash select error [%s][%s]", new Object[] { str3, str4 });
            }
            else if (m != str3.length())
            {
              com.tencent.mm.plugin.report.service.h.pYm.e(12696, new Object[] { Integer.valueOf(105), Integer.valueOf(k) });
              com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.VideoInfoStorage", "checkVideoHash err length file:%d cursor:%d", new Object[] { Integer.valueOf(m), Integer.valueOf(str3.length()) });
            }
            else
            {
              n = 0;
              i1 = 0;
              label1873: if (i1 < m)
              {
                if (localStringBuffer.charAt(i1) != str3.charAt(i1))
                  break label2955;
                n++;
              }
            }
          }
        while (true)
        {
          i1++;
          break label1873;
          if ((i < 0) || (((Vector)localObject4).size() <= i) || (((Integer)((Vector)localObject4).get(i)).intValue() < n))
            i = ((Vector)localObject4).size();
          while (true)
          {
            ((Vector)localObject4).add(Integer.valueOf(n));
            localVector.add(str4);
            ((Vector)localObject5).add(str5);
            ((Vector)localObject6).add(Long.valueOf(l2));
            com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.VideoInfoStorage", "checkVideoHash cursor hitCount:%d/%d ,max:%d vector:%d/%d", new Object[] { Integer.valueOf(n), Integer.valueOf(m), ((Vector)localObject4).get(i), Integer.valueOf(i), Integer.valueOf(((Vector)localObject4).size()) });
            break label1649;
            localCursor.close();
            if ((i < 0) || (((Vector)localObject4).size() <= 0))
            {
              com.tencent.mm.plugin.report.service.h.pYm.e(12696, new Object[] { Integer.valueOf(201), Integer.valueOf(k) });
              com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.VideoInfoStorage", "checkVideoHash cursor empty maxHitIndex:%d vector:%d", new Object[] { Integer.valueOf(i), Integer.valueOf(((Vector)localObject4).size()) });
              localObject2 = "";
              break label1251;
            }
            int i2 = ((Integer)((Vector)localObject4).get(i)).intValue();
            m = i2 * 100 / 256;
            if (m < 77)
            {
              com.tencent.mm.plugin.report.service.h.pYm.e(12696, new Object[] { Integer.valueOf(202), Integer.valueOf(k), Integer.valueOf(i2), Integer.valueOf(0), Integer.valueOf(((Vector)localObject6).size()) });
              com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.VideoInfoStorage", "checkVideoHash NotEnoughHit. time:%d hit:%d percentMatch:%s arr:%d path:%s", new Object[] { Long.valueOf(bo.gb(l1)), Integer.valueOf(i2), Integer.valueOf(m), Integer.valueOf(localObject2.length - 1), str1 });
              localObject2 = "";
              break label1251;
            }
            localObject2 = bo.nullAsNil((String)localVector.get(i));
            n = 0;
            i1 = 0;
            label2302: if (i1 < ((Vector)localObject4).size())
            {
              if ((i1 == i) || (((Integer)((Vector)localObject4).get(i1)).intValue() < i2) || (((String)localObject2).hashCode() == ((String)localVector.get(i1)).hashCode()))
                break label2949;
              n++;
            }
            while (true)
            {
              i1++;
              break label2302;
              if (n > 0)
              {
                ((t)localObject3).fni.hY("VideoHash", "delete from VideoHash where size = ".concat(String.valueOf(k)));
                com.tencent.mm.plugin.report.service.h.pYm.e(12696, new Object[] { Integer.valueOf(203), Integer.valueOf(k), Integer.valueOf(i2), Integer.valueOf(0), Integer.valueOf(((Vector)localObject6).size()), Integer.valueOf(0), "", "", "", Integer.valueOf(n) });
                com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.VideoInfoStorage", "checkVideoHash Not ONE hash hit this path, give up duplicate:%s path:%s", new Object[] { Integer.valueOf(n), str1 });
                localObject2 = "";
                break label1251;
              }
              l2 = bo.gb(l1);
              l1 = bo.a((Long)((Vector)localObject6).get(i), 0L);
              localObject4 = String.format("%s,%s,%s,%s,%s", new Object[] { Integer.valueOf(k), Integer.valueOf(i2), Long.valueOf(l1), Integer.valueOf(((Vector)localObject6).size()), Long.valueOf(l2) });
              com.tencent.mm.plugin.report.service.h.pYm.e(12696, new Object[] { Integer.valueOf(300), localObject4 });
              com.tencent.mm.plugin.report.service.h.pYm.e(12696, new Object[] { Integer.valueOf(m + 3000), localObject4 });
              com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.VideoInfoStorage", "checkVideoHash Succ time:%s hit:%s match:%s%% savetime:%s path:%s xml:%s orgpath:%s", new Object[] { Long.valueOf(l2), Integer.valueOf(i2), Integer.valueOf(m), Long.valueOf(l1), str1, localObject2, ((Vector)localObject5).get(i) });
              localObject5 = (String)((Vector)localObject5).get(i);
              l2 = bo.anU() % 1000L;
              if ((l2 < j * 10) || (m < 90));
              for (boolean bool4 = true; ; bool4 = false)
              {
                com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.VideoInfoStorage", "checkVideoHashByteDiff should:%s now:%s ratio:%s percentMatch:%s debuger:%s", new Object[] { Boolean.valueOf(bool4), Long.valueOf(l2), Integer.valueOf(j), Integer.valueOf(m), Boolean.valueOf(com.tencent.mm.sdk.a.b.dnO()) });
                if ((bool4) || (com.tencent.mm.sdk.a.b.dnO()))
                {
                  localObject6 = new com/tencent/mm/modelvideo/t$2;
                  ((t.2)localObject6).<init>((t)localObject3, str1, (String)localObject5, (String)localObject4);
                  com.tencent.mm.sdk.g.d.f((Runnable)localObject6, "checkVideoHashByteDiff");
                }
                break;
              }
              label2858: localObject2 = null;
              break label1266;
              label2863: if (this.fVI)
              {
                i = 2;
                break label815;
              }
              i = 0;
              break label815;
              label2882: if (this.fVj.fXi != 1)
              {
                this.fVj.fXi = 1;
                this.fVj.status = 104;
                this.fVj.clientId = this.fFa;
                this.fVj.bJt = 524544;
                u.f(this.fVj);
              }
              bool1 = true;
              AppMethodBeat.o(50698);
              break;
            }
          }
        }
      }
    }
  }

  private String alb()
  {
    AppMethodBeat.i(50706);
    String str = this.fileName + "_" + hashCode();
    AppMethodBeat.o(50706);
    return str;
  }

  // ERROR //
  private String tW(String paramString)
  {
    // Byte code:
    //   0: ldc_w 756
    //   3: invokestatic 56	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: new 758	com/tencent/mm/vfs/b
    //   9: dup
    //   10: aload_1
    //   11: invokespecial 759	com/tencent/mm/vfs/b:<init>	(Ljava/lang/String;)V
    //   14: astore_2
    //   15: new 758	com/tencent/mm/vfs/b
    //   18: dup
    //   19: aload_2
    //   20: invokevirtual 763	com/tencent/mm/vfs/b:dMC	()Lcom/tencent/mm/vfs/b;
    //   23: new 537	java/lang/StringBuilder
    //   26: dup
    //   27: ldc_w 765
    //   30: invokespecial 541	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   33: aload_2
    //   34: invokevirtual 768	com/tencent/mm/vfs/b:getName	()Ljava/lang/String;
    //   37: invokevirtual 697	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   40: invokevirtual 555	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   43: invokespecial 771	com/tencent/mm/vfs/b:<init>	(Lcom/tencent/mm/vfs/b;Ljava/lang/String;)V
    //   46: astore_3
    //   47: aconst_null
    //   48: astore 4
    //   50: aconst_null
    //   51: astore 5
    //   53: aconst_null
    //   54: astore 6
    //   56: aconst_null
    //   57: astore 7
    //   59: ldc 122
    //   61: ldc_w 773
    //   64: iconst_1
    //   65: anewarray 167	java/lang/Object
    //   68: dup
    //   69: iconst_0
    //   70: aload_2
    //   71: invokevirtual 775	com/tencent/mm/vfs/b:length	()J
    //   74: invokestatic 629	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   77: aastore
    //   78: invokestatic 633	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   81: aload_2
    //   82: invokevirtual 775	com/tencent/mm/vfs/b:length	()J
    //   85: ldc2_w 776
    //   88: lcmp
    //   89: ifle +604 -> 693
    //   92: aload_3
    //   93: invokevirtual 780	com/tencent/mm/vfs/b:exists	()Z
    //   96: ifeq +124 -> 220
    //   99: ldc 122
    //   101: ldc_w 782
    //   104: iconst_1
    //   105: anewarray 167	java/lang/Object
    //   108: dup
    //   109: iconst_0
    //   110: aload_3
    //   111: invokevirtual 786	com/tencent/mm/vfs/b:dMD	()Landroid/net/Uri;
    //   114: invokestatic 791	com/tencent/mm/vfs/j:w	(Landroid/net/Uri;)Ljava/lang/String;
    //   117: aastore
    //   118: invokestatic 633	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   121: iconst_1
    //   122: istore 8
    //   124: aload 5
    //   126: astore 9
    //   128: aload 7
    //   130: astore 6
    //   132: aload 9
    //   134: ifnull +8 -> 142
    //   137: aload 9
    //   139: invokevirtual 794	java/io/InputStream:close	()V
    //   142: iload 8
    //   144: istore 10
    //   146: aload 6
    //   148: ifnull +12 -> 160
    //   151: aload 6
    //   153: invokevirtual 797	java/io/OutputStream:close	()V
    //   156: iload 8
    //   158: istore 10
    //   160: iload 10
    //   162: ifeq +409 -> 571
    //   165: ldc 122
    //   167: ldc_w 799
    //   170: iconst_3
    //   171: anewarray 167	java/lang/Object
    //   174: dup
    //   175: iconst_0
    //   176: aload_0
    //   177: invokespecial 171	com/tencent/mm/modelvideo/g:alb	()Ljava/lang/String;
    //   180: aastore
    //   181: dup
    //   182: iconst_1
    //   183: aload_3
    //   184: invokevirtual 775	com/tencent/mm/vfs/b:length	()J
    //   187: invokestatic 629	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   190: aastore
    //   191: dup
    //   192: iconst_2
    //   193: aload_3
    //   194: invokevirtual 786	com/tencent/mm/vfs/b:dMD	()Landroid/net/Uri;
    //   197: invokestatic 791	com/tencent/mm/vfs/j:w	(Landroid/net/Uri;)Ljava/lang/String;
    //   200: aastore
    //   201: invokestatic 179	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   204: aload_3
    //   205: invokevirtual 786	com/tencent/mm/vfs/b:dMD	()Landroid/net/Uri;
    //   208: invokestatic 791	com/tencent/mm/vfs/j:w	(Landroid/net/Uri;)Ljava/lang/String;
    //   211: astore_1
    //   212: ldc_w 756
    //   215: invokestatic 182	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   218: aload_1
    //   219: areturn
    //   220: aload_2
    //   221: invokevirtual 786	com/tencent/mm/vfs/b:dMD	()Landroid/net/Uri;
    //   224: invokestatic 791	com/tencent/mm/vfs/j:w	(Landroid/net/Uri;)Ljava/lang/String;
    //   227: invokestatic 805	com/tencent/mm/sdk/platformtools/d:amj	(Ljava/lang/String;)Landroid/graphics/BitmapFactory$Options;
    //   230: astore 11
    //   232: aload 11
    //   234: ifnonnull +132 -> 366
    //   237: ldc_w 341
    //   240: astore 9
    //   242: ldc 122
    //   244: ldc_w 807
    //   247: iconst_1
    //   248: anewarray 167	java/lang/Object
    //   251: dup
    //   252: iconst_0
    //   253: aload 9
    //   255: aastore
    //   256: invokestatic 179	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   259: aload 11
    //   261: ifnull +147 -> 408
    //   264: aload 11
    //   266: getfield 812	android/graphics/BitmapFactory$Options:outWidth	I
    //   269: sipush 288
    //   272: if_icmpgt +14 -> 286
    //   275: aload 11
    //   277: getfield 815	android/graphics/BitmapFactory$Options:outHeight	I
    //   280: sipush 288
    //   283: if_icmple +125 -> 408
    //   286: aload_2
    //   287: invokevirtual 786	com/tencent/mm/vfs/b:dMD	()Landroid/net/Uri;
    //   290: invokestatic 791	com/tencent/mm/vfs/j:w	(Landroid/net/Uri;)Ljava/lang/String;
    //   293: astore 12
    //   295: getstatic 821	android/graphics/Bitmap$CompressFormat:JPEG	Landroid/graphics/Bitmap$CompressFormat;
    //   298: astore 11
    //   300: new 537	java/lang/StringBuilder
    //   303: astore 9
    //   305: aload 9
    //   307: invokespecial 694	java/lang/StringBuilder:<init>	()V
    //   310: aload 12
    //   312: sipush 288
    //   315: sipush 288
    //   318: aload 11
    //   320: bipush 60
    //   322: aload 9
    //   324: aload_3
    //   325: invokevirtual 763	com/tencent/mm/vfs/b:dMC	()Lcom/tencent/mm/vfs/b;
    //   328: invokevirtual 786	com/tencent/mm/vfs/b:dMD	()Landroid/net/Uri;
    //   331: invokestatic 791	com/tencent/mm/vfs/j:w	(Landroid/net/Uri;)Ljava/lang/String;
    //   334: invokevirtual 697	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   337: ldc_w 823
    //   340: invokevirtual 697	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   343: invokevirtual 555	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   346: aload_3
    //   347: invokevirtual 768	com/tencent/mm/vfs/b:getName	()Ljava/lang/String;
    //   350: invokestatic 826	com/tencent/mm/sdk/platformtools/d:a	(Ljava/lang/String;IILandroid/graphics/Bitmap$CompressFormat;ILjava/lang/String;Ljava/lang/String;)Z
    //   353: istore 8
    //   355: aload 7
    //   357: astore 6
    //   359: aload 5
    //   361: astore 9
    //   363: goto -231 -> 132
    //   366: new 537	java/lang/StringBuilder
    //   369: astore 9
    //   371: aload 9
    //   373: invokespecial 694	java/lang/StringBuilder:<init>	()V
    //   376: aload 9
    //   378: aload 11
    //   380: getfield 812	android/graphics/BitmapFactory$Options:outWidth	I
    //   383: invokevirtual 703	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   386: ldc_w 828
    //   389: invokevirtual 697	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   392: aload 11
    //   394: getfield 815	android/graphics/BitmapFactory$Options:outHeight	I
    //   397: invokevirtual 703	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   400: invokevirtual 555	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   403: astore 9
    //   405: goto -163 -> 242
    //   408: aload_2
    //   409: invokestatic 832	com/tencent/mm/vfs/e:p	(Lcom/tencent/mm/vfs/b;)Ljava/io/InputStream;
    //   412: astore 9
    //   414: aload 9
    //   416: fconst_0
    //   417: sipush 288
    //   420: sipush 288
    //   423: invokestatic 835	com/tencent/mm/sdk/platformtools/d:a	(Ljava/io/InputStream;FII)Landroid/graphics/Bitmap;
    //   426: astore 5
    //   428: aload 5
    //   430: ifnull +253 -> 683
    //   433: aload_3
    //   434: invokestatic 839	com/tencent/mm/vfs/e:q	(Lcom/tencent/mm/vfs/b;)Ljava/io/OutputStream;
    //   437: astore 7
    //   439: aload 7
    //   441: astore 6
    //   443: aload 6
    //   445: astore 4
    //   447: aload 9
    //   449: astore 7
    //   451: aload 5
    //   453: getstatic 821	android/graphics/Bitmap$CompressFormat:JPEG	Landroid/graphics/Bitmap$CompressFormat;
    //   456: bipush 60
    //   458: aload 6
    //   460: invokevirtual 845	android/graphics/Bitmap:compress	(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
    //   463: istore 8
    //   465: goto -333 -> 132
    //   468: astore 5
    //   470: aconst_null
    //   471: astore 6
    //   473: aconst_null
    //   474: astore 9
    //   476: aload 6
    //   478: astore 4
    //   480: aload 9
    //   482: astore 7
    //   484: ldc 122
    //   486: ldc_w 847
    //   489: iconst_1
    //   490: anewarray 167	java/lang/Object
    //   493: dup
    //   494: iconst_0
    //   495: aload 5
    //   497: invokestatic 525	com/tencent/mm/sdk/platformtools/bo:l	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   500: aastore
    //   501: invokestatic 442	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   504: aload 9
    //   506: ifnull +8 -> 514
    //   509: aload 9
    //   511: invokevirtual 794	java/io/InputStream:close	()V
    //   514: aload 6
    //   516: ifnull +161 -> 677
    //   519: aload 6
    //   521: invokevirtual 797	java/io/OutputStream:close	()V
    //   524: iconst_0
    //   525: istore 10
    //   527: goto -367 -> 160
    //   530: astore 9
    //   532: iconst_0
    //   533: istore 10
    //   535: goto -375 -> 160
    //   538: astore_1
    //   539: aload 4
    //   541: astore 9
    //   543: aload 9
    //   545: ifnull +8 -> 553
    //   548: aload 9
    //   550: invokevirtual 794	java/io/InputStream:close	()V
    //   553: aload 6
    //   555: ifnull +8 -> 563
    //   558: aload 6
    //   560: invokevirtual 797	java/io/OutputStream:close	()V
    //   563: ldc_w 756
    //   566: invokestatic 182	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   569: aload_1
    //   570: athrow
    //   571: ldc 122
    //   573: ldc_w 849
    //   576: iconst_3
    //   577: anewarray 167	java/lang/Object
    //   580: dup
    //   581: iconst_0
    //   582: aload_0
    //   583: invokespecial 171	com/tencent/mm/modelvideo/g:alb	()Ljava/lang/String;
    //   586: aastore
    //   587: dup
    //   588: iconst_1
    //   589: aload_2
    //   590: invokevirtual 775	com/tencent/mm/vfs/b:length	()J
    //   593: invokestatic 629	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   596: aastore
    //   597: dup
    //   598: iconst_2
    //   599: aload_2
    //   600: invokevirtual 786	com/tencent/mm/vfs/b:dMD	()Landroid/net/Uri;
    //   603: invokestatic 791	com/tencent/mm/vfs/j:w	(Landroid/net/Uri;)Ljava/lang/String;
    //   606: aastore
    //   607: invokestatic 179	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   610: ldc_w 756
    //   613: invokestatic 182	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   616: goto -398 -> 218
    //   619: astore 9
    //   621: goto -479 -> 142
    //   624: astore 9
    //   626: iload 8
    //   628: istore 10
    //   630: goto -470 -> 160
    //   633: astore 9
    //   635: goto -121 -> 514
    //   638: astore 9
    //   640: goto -87 -> 553
    //   643: astore 9
    //   645: goto -82 -> 563
    //   648: astore_1
    //   649: goto -106 -> 543
    //   652: astore_1
    //   653: aload 4
    //   655: astore 6
    //   657: aload 7
    //   659: astore 9
    //   661: goto -118 -> 543
    //   664: astore 5
    //   666: aconst_null
    //   667: astore 6
    //   669: goto -193 -> 476
    //   672: astore 5
    //   674: goto -198 -> 476
    //   677: iconst_0
    //   678: istore 10
    //   680: goto -520 -> 160
    //   683: iconst_0
    //   684: istore 8
    //   686: aload 7
    //   688: astore 6
    //   690: goto -558 -> 132
    //   693: iconst_0
    //   694: istore 8
    //   696: aload 7
    //   698: astore 6
    //   700: aload 5
    //   702: astore 9
    //   704: goto -572 -> 132
    //
    // Exception table:
    //   from	to	target	type
    //   81	121	468	java/lang/Exception
    //   220	232	468	java/lang/Exception
    //   242	259	468	java/lang/Exception
    //   264	286	468	java/lang/Exception
    //   286	355	468	java/lang/Exception
    //   366	405	468	java/lang/Exception
    //   408	414	468	java/lang/Exception
    //   519	524	530	java/io/IOException
    //   81	121	538	finally
    //   220	232	538	finally
    //   242	259	538	finally
    //   264	286	538	finally
    //   286	355	538	finally
    //   366	405	538	finally
    //   408	414	538	finally
    //   137	142	619	java/io/IOException
    //   151	156	624	java/io/IOException
    //   509	514	633	java/io/IOException
    //   548	553	638	java/io/IOException
    //   558	563	643	java/io/IOException
    //   414	428	648	finally
    //   433	439	648	finally
    //   451	465	652	finally
    //   484	504	652	finally
    //   414	428	664	java/lang/Exception
    //   433	439	664	java/lang/Exception
    //   451	465	672	java/lang/Exception
  }

  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ai.f paramf)
  {
    int i = 0;
    AppMethodBeat.i(50700);
    this.ehi = paramf;
    this.fVj = u.ut(this.fileName);
    if ((this.fVj == null) || ((this.fVj.status != 104) && (this.fVj.status != 103)))
    {
      com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.NetSceneUploadVideo", "%s Get info Failed file:", new Object[] { alb(), this.fileName });
      this.retCode = (0 - (com.tencent.mm.compatible.util.g.getLine() + 10000));
      AppMethodBeat.o(50700);
      i = -1;
    }
    label390: cls localcls;
    while (true)
    {
      return i;
      paramf = new StringBuilder("doscene file:").append(this.fileName).append(" stat:").append(this.fVj.status).append(" [").append(this.fVj.fWZ).append(",").append(this.fVj.fXa).append("] [").append(this.fVj.fVG).append(",").append(this.fVj.frO).append("]  netTimes:").append(this.fVj.fXf).append(" times:");
      int j = this.fVL;
      this.fVL = (j + 1);
      com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.NetSceneUploadVideo", j);
      if (this.startTime == 0L)
      {
        this.startTime = bo.anU();
        this.fVG = this.fVj.fVG;
      }
      o.all();
      if (r.ub(t.uh(this.fileName)))
      {
        com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.NetSceneUploadVideo", "%s it is mm h265 video xml[%s]", new Object[] { alb(), this.fVj.alw() });
        com.tencent.mm.plugin.report.service.h.pYm.a(354L, 139L, 1L, false);
      }
      if (ala())
      {
        com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.NetSceneUploadVideo", "cdntra use cdn return -1 for onGYNetEnd clientid:%s", new Object[] { this.fileName });
        AppMethodBeat.o(50700);
      }
      else
      {
        if (this.fVj.fXh == 1)
        {
          this.cng = true;
          paramf = new b.a();
          paramf.fsJ = new cls();
          paramf.fsK = new clt();
          paramf.uri = "/cgi-bin/micromsg-bin/uploadvideo";
          paramf.fsI = 149;
          paramf.fsL = 39;
          paramf.fsM = 1000000039;
          this.ehh = paramf.acD();
          localcls = (cls)this.ehh.fsG.fsP;
          localcls.ndG = ((String)com.tencent.mm.kernel.g.RP().Ry().get(2, ""));
          localcls.ndF = this.fVj.getUser();
          localcls.vFF = this.fileName;
          if (this.cng)
            localcls.xjr = 2;
          if (this.fVj.fXk == 3)
            localcls.xjr = 3;
          localcls.wYj = this.fVj.fXd;
          localcls.wEs = this.fVj.fXa;
          localcls.xjo = this.fVj.frO;
          if (!com.tencent.mm.network.ab.ch(ah.getContext()))
            break label1204;
          i = 1;
          label588: localcls.wdl = i;
          localcls.wEv = 2;
          localcls.xjp = 0;
          localcls.xjq = new SKBuiltinBuffer_t().setBuffer(new byte[0]);
          localcls.wEu = new SKBuiltinBuffer_t().setBuffer(new byte[0]);
          if (!bo.isNullOrNil(this.cMW))
            break label1209;
          o.all();
          paramf = com.tencent.mm.vfs.e.atg(t.uh(this.fileName));
          this.cMW = paramf;
          label672: localcls.xju = paramf;
          localcls.vEG = bh.aae();
          localcls.xjD = this.fVj.cMn;
          paramf = this.fVj.fXm;
          if ((paramf == null) || (bo.isNullOrNil(paramf.fiG)))
            break label1217;
          localcls.xjv = bo.bc(paramf.fiG, "");
          localcls.xjw = paramf.wid;
          localcls.xjx = bo.bc(paramf.fiI, "");
          localcls.xjz = bo.bc(paramf.fiK, "");
          localcls.xjy = bo.bc(paramf.fiJ, "");
          localcls.xjA = bo.bc(paramf.fiL, "");
        }
        while (true)
        {
          if (paramf != null)
          {
            localcls.xjC = bo.bc(paramf.fiM, "");
            localcls.xjB = bo.bc(paramf.fiN, "");
          }
          com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.NetSceneUploadVideo", "upload video: play length %d, thumb totalLen %d, video totalLen %d, funcFlag %d, videoMd5: %s stream %s streamtime: %d title %s thumburl %s", new Object[] { Integer.valueOf(localcls.wYj), Integer.valueOf(localcls.wEt), Integer.valueOf(localcls.xjo), Integer.valueOf(localcls.xjr), localcls.xju, localcls.xjv, Integer.valueOf(localcls.xjw), localcls.xjx, localcls.xjA });
          if (this.fVj.status != 103)
            break label1514;
          o.all();
          paramf = t.m(t.ui(this.fileName), this.fVj.fWZ, fVE);
          if ((paramf.ret >= 0) && (paramf.cqs != 0))
            break label1262;
          com.tencent.mm.plugin.report.service.h.pYm.a(111L, 225L, 1L, false);
          u.um(this.fileName);
          com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.NetSceneUploadVideo", "doScene READ THUMB[" + this.fileName + "]  Error ");
          this.retCode = (0 - (com.tencent.mm.compatible.util.g.getLine() + 10000));
          AppMethodBeat.o(50700);
          i = -1;
          break;
          if (this.fVj.createTime + 600L < bo.anT())
          {
            com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.NetSceneUploadVideo", "create time check error:" + this.fileName);
            u.um(this.fileName);
            this.retCode = (0 - (com.tencent.mm.compatible.util.g.getLine() + 10000));
            AppMethodBeat.o(50700);
            i = -1;
            break;
          }
          if (u.ul(this.fileName))
            break label390;
          com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.NetSceneUploadVideo", "checkVoiceNetTimes Failed file:" + this.fileName);
          u.um(this.fileName);
          this.retCode = (0 - (com.tencent.mm.compatible.util.g.getLine() + 10000));
          AppMethodBeat.o(50700);
          i = -1;
          break;
          label1204: i = 2;
          break label588;
          label1209: paramf = this.cMW;
          break label672;
          label1217: if ((paramf != null) && (!bo.isNullOrNil(paramf.fiK)) && (!bo.isNullOrNil(paramf.fiJ)))
          {
            localcls.xjz = paramf.fiK;
            localcls.xjy = paramf.fiJ;
          }
        }
        label1262: com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.NetSceneUploadVideo", "doScene READ THUMB[" + this.fileName + "] read ret:" + paramf.ret + " readlen:" + paramf.cqs + " newOff:" + paramf.fXD + " netOff:" + this.fVj.fWZ);
        if (paramf.fXD >= this.fVj.fWZ)
          break;
        com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.NetSceneUploadVideo", "Err doScene READ THUMB[" + this.fileName + "] newOff:" + paramf.fXD + " OldtOff:" + this.fVj.fWZ);
        u.um(this.fileName);
        this.retCode = (0 - (com.tencent.mm.compatible.util.g.getLine() + 10000));
        AppMethodBeat.o(50700);
        i = -1;
      }
    }
    Object localObject = new byte[paramf.cqs];
    System.arraycopy(paramf.buf, 0, localObject, 0, paramf.cqs);
    localcls.wEt = this.fVj.fWZ;
    localcls.wEu = new SKBuiltinBuffer_t().setBuffer((byte[])localObject);
    while (true)
    {
      i = a(parame, this.ehh, this);
      AppMethodBeat.o(50700);
      break;
      label1514: o.all();
      localObject = t.m(t.uh(this.fileName), this.fVj.fVG, fVE);
      if ((((t.b)localObject).ret < 0) || (((t.b)localObject).cqs == 0))
      {
        com.tencent.mm.plugin.report.service.h.pYm.a(111L, 224L, 1L, false);
        u.um(this.fileName);
        com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.NetSceneUploadVideo", "doScene READ VIDEO[" + this.fileName + "]  Error ");
        this.retCode = (0 - (com.tencent.mm.compatible.util.g.getLine() + 10000));
        AppMethodBeat.o(50700);
        i = -1;
        break;
      }
      com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.NetSceneUploadVideo", "doScene READ VIDEO[" + this.fileName + "] read ret:" + ((t.b)localObject).ret + " readlen:" + ((t.b)localObject).cqs + " newOff:" + ((t.b)localObject).fXD + " netOff:" + this.fVj.fVG);
      if (((t.b)localObject).fXD < this.fVj.fVG)
      {
        com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.NetSceneUploadVideo", "Err doScene READ VIDEO[" + this.fileName + "] newOff:" + ((t.b)localObject).fXD + " OldtOff:" + this.fVj.fVG);
        u.um(this.fileName);
        this.retCode = (0 - (com.tencent.mm.compatible.util.g.getLine() + 10000));
        AppMethodBeat.o(50700);
        i = -1;
        break;
      }
      if (((t.b)localObject).fXD >= c.fUE)
      {
        com.tencent.mm.plugin.report.service.h.pYm.a(111L, 222L, 1L, false);
        com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.NetSceneUploadVideo", "Err doScene READ VIDEO[" + this.fileName + "] maxsize:" + c.fUE);
        u.um(this.fileName);
        this.retCode = (0 - (com.tencent.mm.compatible.util.g.getLine() + 10000));
        AppMethodBeat.o(50700);
        i = -1;
        break;
      }
      paramf = new byte[((t.b)localObject).cqs];
      System.arraycopy(((t.b)localObject).buf, 0, paramf, 0, ((t.b)localObject).cqs);
      localcls.xjp = this.fVj.fVG;
      localcls.wEt = this.fVj.fWZ;
      localcls.xjq = new SKBuiltinBuffer_t().setBuffer(paramf);
    }
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(50704);
    com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.NetSceneUploadVideo", "cdntra onGYNetEnd errtype:" + paramInt2 + " errcode:" + paramInt3 + " useCdnTransClientId:" + this.fFa);
    if (this.fVm)
    {
      com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.NetSceneUploadVideo", "onGYNetEnd Call Stop by Service   file:" + this.fileName + " user:" + this.fVj.getUser());
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(50704);
    }
    while (true)
    {
      return;
      if ((paramInt2 == 3) && (paramInt3 == -1) && (!bo.isNullOrNil(this.fFa)))
      {
        com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.NetSceneUploadVideo", "cdntra using cdn trans,  wait cdn service callback! clientid:%s", new Object[] { this.fFa });
        AppMethodBeat.o(50704);
      }
      else
      {
        paramArrayOfByte = (clt)((com.tencent.mm.ai.b)paramq).fsH.fsP;
        paramq = (cls)((com.tencent.mm.ai.b)paramq).fsG.fsP;
        this.fVj = u.ut(this.fileName);
        if (this.fVj == null)
        {
          com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.NetSceneUploadVideo", "ERR: onGYNetEnd Get INFO FAILED :" + this.fileName);
          this.retCode = (0 - com.tencent.mm.compatible.util.g.getLine() - 10000);
          this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
          AppMethodBeat.o(50704);
        }
        else if (this.fVj.status == 105)
        {
          com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.NetSceneUploadVideo", "onGYNetEnd STATUS PAUSE [" + this.fileName + "," + this.fVj.cKK + "," + this.fVj.alt() + "," + this.fVj.getUser() + "] ");
          this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
          AppMethodBeat.o(50704);
        }
        else if ((this.fVj.status != 104) && (this.fVj.status != 103))
        {
          com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.NetSceneUploadVideo", "ERR: onGYNetEnd STATUS ERR: status:" + this.fVj.status + " [" + this.fileName + "," + this.fVj.cKK + "," + this.fVj.alt() + "," + this.fVj.getUser() + "] ");
          this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
          AppMethodBeat.o(50704);
        }
        else if ((paramInt2 == 4) && (paramInt3 == -22))
        {
          com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.NetSceneUploadVideo", "ERR: onGYNetEnd BLACK  errtype:" + paramInt2 + " errCode:" + paramInt3 + "  file:" + this.fileName + " user:" + this.fVj.getUser());
          u.un(this.fileName);
          this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
          AppMethodBeat.o(50704);
        }
        else if ((paramInt2 == 4) && (paramInt3 != 0))
        {
          com.tencent.mm.plugin.report.service.h.pYm.a(111L, 220L, 1L, false);
          com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.NetSceneUploadVideo", "ERR: onGYNetEnd SERVER FAILED errtype:" + paramInt2 + " errCode:" + paramInt3 + "  file:" + this.fileName + " user:" + this.fVj.getUser());
          u.um(this.fileName);
          com.tencent.mm.plugin.report.service.h.pYm.e(10420, new Object[] { Integer.valueOf(paramInt3), Integer.valueOf(1), Long.valueOf(this.startTime), Long.valueOf(bo.anU()), Integer.valueOf(com.tencent.mm.al.c.bW(ah.getContext())), Integer.valueOf(this.fVl), Integer.valueOf(0) });
          this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
          AppMethodBeat.o(50704);
        }
        else if ((paramInt2 != 0) || (paramInt3 != 0))
        {
          com.tencent.mm.plugin.report.service.h.pYm.a(111L, 219L, 1L, false);
          com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.NetSceneUploadVideo", "ERR: onGYNetEnd FAILED (WILL RETRY) errtype:" + paramInt2 + " errCode:" + paramInt3 + "  file:" + this.fileName + " user:" + this.fVj.getUser());
          this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
          AppMethodBeat.o(50704);
        }
        else if ((!bo.cb(paramq.wEu.getBuffer().wR)) && (paramq.wEt != paramArrayOfByte.wEt - paramq.wEu.getILen()))
        {
          com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.NetSceneUploadVideo", "onGYNetEnd Err Thumb Pos:[" + paramq.wEt + "," + paramq.wEu.getILen() + "," + paramArrayOfByte.wEt + "] file:" + this.fileName + " user:" + paramq.ndF);
          u.um(this.fileName);
          this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
          AppMethodBeat.o(50704);
        }
        else if ((!bo.cb(paramq.xjq.getBuffer().wR)) && (paramq.xjp != paramArrayOfByte.xjp - paramq.xjq.getILen()))
        {
          com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.NetSceneUploadVideo", "onGYNetEnd Err Thumb Pos:[" + paramq.xjp + "," + paramq.xjq.getILen() + "," + paramArrayOfByte.xjp + "] file:" + this.fileName + " user:" + paramq.ndF);
          u.um(this.fileName);
          this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
          AppMethodBeat.o(50704);
        }
        else
        {
          this.fVj.fXb = bo.anT();
          this.fVj.cKK = paramArrayOfByte.ptF;
          this.fVj.bJt = 1028;
          com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.NetSceneUploadVideo", "dkmsgid  set svrmsgid %d -> %d", new Object[] { Long.valueOf(this.fVj.cKK), Integer.valueOf(ae.giA) });
          if ((10007 == ae.giz) && (ae.giA != 0) && (this.fVj.cKK != 0L))
          {
            this.fVj.cKK = ae.giA;
            ae.giA = 0;
          }
          int i = 0;
          paramInt1 = this.fVj.status;
          if (paramInt1 == 103)
          {
            paramArrayOfByte = this.fVj;
            paramInt1 = paramq.wEt;
            paramArrayOfByte.fWZ = (paramq.wEu.getILen() + paramInt1);
            this.fVj.bJt |= 64;
            paramInt1 = i;
            if (this.fVj.fWZ >= this.fVj.fXa)
            {
              this.fVj.status = 104;
              this.fVj.bJt |= 256;
              paramInt1 = i;
            }
          }
          while (true)
          {
            u.f(this.fVj);
            if (!this.fVm)
              break label1691;
            this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
            AppMethodBeat.o(50704);
            break;
            if (paramInt1 != 104)
              break label1611;
            paramArrayOfByte = this.fVj;
            paramInt1 = paramq.xjp;
            paramArrayOfByte.fVG = (paramq.xjq.getILen() + paramInt1);
            this.fVj.bJt |= 8;
            paramInt1 = i;
            if (this.fVj.fVG >= this.fVj.frO)
            {
              this.fVj.status = 199;
              this.fVj.bJt |= 256;
              u.d(this.fVj);
              paramInt1 = 1;
            }
          }
          label1611: com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.NetSceneUploadVideo", "onGYNetEnd ERROR STATUS:" + paramInt1 + " file:" + this.fileName + " user:" + paramq.ndF);
          u.um(this.fileName);
          this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
          AppMethodBeat.o(50704);
          continue;
          label1691: if (paramInt1 != 0)
            break;
          this.frk.ae(10L, 10L);
          AppMethodBeat.o(50704);
        }
      }
    }
    paramq = ((j)com.tencent.mm.kernel.g.K(j.class)).bOr().jf(this.fVj.fXe);
    com.tencent.mm.modelstat.b.fRa.j(paramq);
    com.tencent.mm.plugin.report.service.h.pYm.e(10420, new Object[] { Integer.valueOf(0), Integer.valueOf(1), Long.valueOf(this.startTime), Long.valueOf(bo.anU()), Integer.valueOf(com.tencent.mm.al.c.bW(ah.getContext())), Integer.valueOf(this.fVl), Integer.valueOf(this.fVj.frO - this.fVG) });
    boolean bool;
    if (this.fVj == null)
    {
      bool = false;
      label1852: if ((!bool) && (!com.tencent.mm.model.t.nl(this.fVj.getUser())))
        break label2238;
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.NetSceneUploadVideo", "upload to biz :%s", new Object[] { this.fVj.getUser() });
      if (this.fVj.cKK < 0L)
      {
        com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.NetSceneUploadVideo", "ERR: finish video invaild MSGSVRID :" + this.fVj.cKK + " file:" + this.fileName + " toUser:" + this.fVj.getUser());
        u.um(this.fileName);
      }
      label1969: if (this.eOm == null)
        break label2326;
    }
    label2326: for (long l = this.eOm.Mr(); ; l = 0L)
    {
      com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.NetSceneUploadVideo", "!!!FIN: file:" + this.fileName + " toUser:" + this.fVj.getUser() + " msgsvrid:" + this.fVj.cKK + " thumbsize:" + this.fVj.fXa + " videosize:" + this.fVj.frO + " useTime:" + l);
      com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.NetSceneUploadVideo", "FinishLogForTime file:" + this.fileName + " packSize:" + fVE + " filesize:" + this.fVj.frO + " useTime:" + l);
      a.a(this.fVj, 0);
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(50704);
      break;
      paramq = ((j)com.tencent.mm.kernel.g.K(j.class)).XM().aoO(this.fVj.getUser());
      if ((paramq == null) || ((int)paramq.ewQ <= 0))
      {
        bool = false;
        break label1852;
      }
      bool = paramq.dsf();
      break label1852;
      label2238: com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.NetSceneUploadVideo", "not upload to biz");
      if (this.fVj.cKK > 0L)
        break label1969;
      com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.NetSceneUploadVideo", "ERR: finish video invaild MSGSVRID :" + this.fVj.cKK + " file:" + this.fileName + " toUser:" + this.fVj.getUser());
      u.um(this.fileName);
      break label1969;
    }
  }

  public final void a(m.a parama)
  {
    AppMethodBeat.i(50702);
    com.tencent.mm.plugin.report.service.h.pYm.a(111L, 221L, 1L, false);
    u.um(this.fileName);
    AppMethodBeat.o(50702);
  }

  public final boolean acJ()
  {
    AppMethodBeat.i(50703);
    boolean bool = super.acJ();
    if (bool)
      com.tencent.mm.plugin.report.service.h.pYm.a(111L, 210L, 1L, false);
    AppMethodBeat.o(50703);
    return bool;
  }

  public final int acn()
  {
    return this.MAX_TIMES;
  }

  public final m.b b(q paramq)
  {
    AppMethodBeat.i(50701);
    paramq = (cls)((com.tencent.mm.ai.b)paramq).fsG.fsP;
    if ((bo.isNullOrNil(paramq.vFF)) || (paramq.wEv <= 0) || (bo.isNullOrNil(paramq.ndG)) || (bo.isNullOrNil(paramq.ndF)) || (paramq.wdl <= 0) || (paramq.wEt > paramq.wEs) || (paramq.wEt < 0) || (paramq.xjp > paramq.xjo) || (paramq.xjp < 0) || ((paramq.xjp == paramq.xjo) && (paramq.wEt == paramq.wEs)) || (paramq.wEs <= 0) || (paramq.xjo <= 0) || ((paramq.xjq.getILen() <= 0) && (paramq.wEu.getILen() <= 0)))
    {
      com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.NetSceneUploadVideo", "ERR: Security Check Failed file:" + this.fileName + " user:" + paramq.ndF);
      paramq = m.b.ftv;
      AppMethodBeat.o(50701);
    }
    while (true)
    {
      return paramq;
      paramq = m.b.ftu;
      AppMethodBeat.o(50701);
    }
  }

  public final void cancel()
  {
    AppMethodBeat.i(50697);
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.NetSceneUploadVideo", "%s stop %s", new Object[] { alb(), this.fFa });
    if (!bo.isNullOrNil(this.fFa))
      com.tencent.mm.al.f.afx().rN(this.fFa);
    this.fVm = true;
    super.cancel();
    AppMethodBeat.o(50697);
  }

  public final int getType()
  {
    return 149;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelvideo.g
 * JD-Core Version:    0.6.2
 */