package com.tencent.mm.plugin.sns.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.rs;
import com.tencent.mm.i.g.a;
import com.tencent.mm.modelcontrol.VideoTransPara;
import com.tencent.mm.modelvideo.n;
import com.tencent.mm.modelvideo.n.a;
import com.tencent.mm.plugin.mmsight.model.h;
import com.tencent.mm.plugin.sns.storage.r;
import com.tencent.mm.plugin.sns.storage.s;
import com.tencent.mm.protocal.protobuf.baa;
import com.tencent.mm.protocal.protobuf.bar;
import com.tencent.mm.protocal.protobuf.bax;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.LinkedList;

public final class ac
{
  private int cNE;
  private String clientId;
  String fFa;
  int fFb;
  private g.a fFk;
  int fWD;
  private String hxH;
  private String mPath;
  private long qKa;
  r qKs;
  ac.a qKt;
  private bax qKu;
  long startTime;
  private String thumbPath;

  public ac(int paramInt, r paramr, String paramString1, String paramString2, ac.a parama)
  {
    AppMethodBeat.i(36375);
    this.clientId = "";
    this.qKa = 0L;
    this.startTime = 0L;
    this.fFb = 0;
    this.hxH = "";
    this.qKu = new bax();
    this.fFk = new g.a()
    {
      public final int a(String paramAnonymousString, int paramAnonymousInt, com.tencent.mm.i.c paramAnonymousc, com.tencent.mm.i.d paramAnonymousd, boolean paramAnonymousBoolean)
      {
        AppMethodBeat.i(36374);
        if (paramAnonymousInt == -21005)
        {
          ab.d("MicroMsg.SightCdnUpload", "cdntra cdnCallback clientid:%s startRet:%d proginfo:[%s] res:[%s]", new Object[] { ac.this.fFa, Integer.valueOf(paramAnonymousInt), paramAnonymousc, paramAnonymousd });
          ac.this.qKt.kJ(true);
          AppMethodBeat.o(36374);
        }
        while (true)
        {
          return 0;
          if ((paramAnonymousd != null) && (paramAnonymousd.field_retCode == 0))
          {
            ab.i("MicroMsg.SightCdnUpload", "cdntra cdnCallback clientid:%s startRet:%d proginfo:[%s] res:[%s]", new Object[] { ac.this.fFa, Integer.valueOf(paramAnonymousInt), paramAnonymousc, paramAnonymousd });
            ac.this.ae(paramAnonymousd.field_fileUrl, paramAnonymousd.field_thumbUrl, "upload_" + ac.this.fFa);
            new com.tencent.mm.g.b.a.f(com.tencent.mm.plugin.report.a.r(new Object[] { Integer.valueOf(0), Integer.valueOf(1), Long.valueOf(ac.this.startTime), Long.valueOf(bo.anU()), Integer.valueOf(com.tencent.mm.al.c.bW(ah.getContext())), Integer.valueOf(ac.this.fFb), Integer.valueOf(paramAnonymousd.field_fileLength), paramAnonymousd.field_transInfo, "", "", "", "", "", "", "", paramAnonymousd.efY })).ajK();
            n localn = n.alj();
            paramAnonymousInt = ac.this.fWD;
            if (paramAnonymousd != null)
            {
              String str1 = paramAnonymousd.field_fileUrl;
              String str2 = str1.hashCode();
              paramAnonymousc = (n.a)localn.fWm.get(str2);
              paramAnonymousString = paramAnonymousc;
              if (paramAnonymousc == null)
                paramAnonymousString = new n.a(localn);
              paramAnonymousString.dqJ = "";
              paramAnonymousString.toUser = "";
              paramAnonymousString.fWz = "";
              paramAnonymousString.fWD = paramAnonymousInt;
              paramAnonymousString.fWC = 1;
              paramAnonymousString.cEZ = str1;
              paramAnonymousString.fVQ = paramAnonymousd;
              paramAnonymousString.startTime = bo.anU();
              localn.fWm.put(str2, paramAnonymousString);
              ab.i("MicroMsg.SubCoreMediaRpt", "note sns video sendScene %d snsKey[%s] url[%s]", new Object[] { Integer.valueOf(paramAnonymousInt), str2, str1 });
            }
            ac.this.qKt.kJ(true);
            AppMethodBeat.o(36374);
          }
          else if ((paramAnonymousd != null) && (paramAnonymousd.field_retCode != 0))
          {
            ab.i("MicroMsg.SightCdnUpload", "cdntra cdnCallback clientid:%s startRet:%d proginfo:[%s] res:[%s]", new Object[] { ac.this.fFa, Integer.valueOf(paramAnonymousInt), paramAnonymousc, paramAnonymousd });
            ac.this.CQ(0);
            paramAnonymousString = com.tencent.mm.plugin.report.a.r(new Object[] { Integer.valueOf(paramAnonymousd.field_retCode), Integer.valueOf(1), Long.valueOf(ac.this.startTime), Long.valueOf(bo.anU()), Integer.valueOf(com.tencent.mm.al.c.bW(ah.getContext())), Integer.valueOf(ac.this.fFb), Integer.valueOf(paramAnonymousd.field_fileLength), paramAnonymousd.field_transInfo, "", "", "", "", "", "", "", paramAnonymousd.efY });
            new com.tencent.mm.g.b.a.f(paramAnonymousString).ajK();
            new com.tencent.mm.g.b.a.d(paramAnonymousString).ajK();
            ac.this.qKt.kJ(false);
            AppMethodBeat.o(36374);
          }
          else if (paramAnonymousInt != 0)
          {
            ab.i("MicroMsg.SightCdnUpload", "cdntra cdnCallback clientid:%s startRet:%d proginfo:[%s] res:[%s]", new Object[] { ac.this.fFa, Integer.valueOf(paramAnonymousInt), paramAnonymousc, paramAnonymousd });
            ac.this.CQ(0);
            if (paramAnonymousd != null)
              new com.tencent.mm.g.b.a.f(com.tencent.mm.plugin.report.a.r(new Object[] { Integer.valueOf(paramAnonymousInt), Integer.valueOf(1), Long.valueOf(ac.this.startTime), Long.valueOf(bo.anU()), Integer.valueOf(com.tencent.mm.al.c.bW(ah.getContext())), Integer.valueOf(ac.this.fFb), Integer.valueOf(paramAnonymousd.field_fileLength), paramAnonymousd.field_transInfo, "", "", "", "", "", "", "", paramAnonymousd.efY })).ajK();
            ac.this.qKt.kJ(false);
            AppMethodBeat.o(36374);
          }
          else
          {
            ab.d("MicroMsg.SightCdnUpload", "cdntra cdnCallback clientid:%s startRet:%d proginfo:[%s] res:[%s]", new Object[] { ac.this.fFa, Integer.valueOf(paramAnonymousInt), paramAnonymousc, paramAnonymousd });
            AppMethodBeat.o(36374);
          }
        }
      }

      public final void a(String paramAnonymousString, ByteArrayOutputStream paramAnonymousByteArrayOutputStream)
      {
      }

      public final byte[] l(String paramAnonymousString, byte[] paramAnonymousArrayOfByte)
      {
        return null;
      }
    };
    this.qKa = System.currentTimeMillis();
    this.mPath = paramString1;
    this.thumbPath = paramString2;
    this.qKt = parama;
    this.cNE = paramInt;
    this.qKs = paramr;
    try
    {
      paramString2 = new com/tencent/mm/protocal/protobuf/bax;
      paramString2.<init>();
      this.qKu = ((bax)paramString2.parseFrom(paramr.rfI));
      this.clientId = this.qKu.wFE;
      this.hxH = this.qKu.cvZ;
      if (bo.isNullOrNil(this.clientId))
      {
        this.clientId = com.tencent.mm.a.g.x(bo.yz().getBytes());
        this.qKu.wFE = this.clientId;
      }
    }
    catch (Exception paramr)
    {
      try
      {
        paramr.rfI = this.qKu.toByteArray();
        af.cnu().a(paramr.reX, paramr);
        ab.i("MicroMsg.SightCdnUpload", "sightupload %d videopath %s sightFileSize %d md5 %s", new Object[] { Integer.valueOf(paramInt), paramString1, Integer.valueOf((int)com.tencent.mm.vfs.e.asZ(paramString1)), this.hxH });
        AppMethodBeat.o(36375);
        while (true)
        {
          return;
          paramr = paramr;
          ab.e("MicroMsg.SightCdnUpload", "parseFrom MediaUploadInfo error in NetSceneSnsUpload");
          AppMethodBeat.o(36375);
        }
      }
      catch (Exception paramr)
      {
        while (true)
          ab.printErrStackTrace("MicroMsg.SightCdnUpload", paramr, "", new Object[0]);
      }
    }
  }

  final void CQ(int paramInt)
  {
    AppMethodBeat.i(36379);
    ab.i("MicroMsg.SightCdnUpload", "snsupload sight by cdn error!");
    r localr = af.cnu().kE(this.cNE);
    try
    {
      bax localbax = new com/tencent/mm/protocal/protobuf/bax;
      localbax.<init>();
      localbax = (bax)localbax.parseFrom(localr.rfI);
      localbax.wFD = 1;
      localbax.wFm = paramInt;
      if (this.qKu.wFH != null)
        this.qKu.wFH.wDQ = 0;
      localr.rfI = localbax.toByteArray();
      label83: af.cnE().CV(this.cNE);
      af.cnu().a(this.cNE, localr);
      AppMethodBeat.o(36379);
      return;
    }
    catch (Exception localException)
    {
      break label83;
    }
  }

  final boolean a(baa parambaa)
  {
    AppMethodBeat.i(36377);
    if (this.startTime == 0L)
    {
      this.startTime = bo.anU();
      this.fFb = com.tencent.mm.i.a.efI;
    }
    String str = this.clientId;
    boolean bool;
    if (bo.isNullOrNil(str))
    {
      ab.w("MicroMsg.SightCdnUpload", "cdntra genClientId failed not use cdn");
      AppMethodBeat.o(36377);
      bool = false;
    }
    while (true)
    {
      return bool;
      com.tencent.mm.i.g localg = new com.tencent.mm.i.g();
      localg.egl = this.fFk;
      localg.field_mediaId = str;
      localg.field_fullpath = this.mPath;
      localg.field_thumbpath = this.thumbPath;
      localg.field_fileType = com.tencent.mm.i.a.efI;
      localg.field_talker = "";
      localg.field_priority = com.tencent.mm.i.a.efC;
      localg.field_needStorage = true;
      localg.field_isStreamMedia = false;
      localg.field_appType = 102;
      localg.field_bzScene = 1;
      Object localObject;
      if ((!bo.isNullOrNil(parambaa.csB)) && (parambaa.csB.contains("wx5dfbe0a95623607b")))
      {
        localg.field_largesvideo = com.tencent.mm.m.g.Nu().getInt("WeiShiShareSnsSightTimeLength", 10);
        localObject = com.tencent.mm.a.g.cz(this.mPath);
        if ((!bo.isNullOrNil(this.hxH)) && (!this.hxH.equals(localObject)))
        {
          ab.i("MicroMsg.SightCdnUpload", "isNotSafeSightVideo old srcmd5 %s newmd5 %s ", new Object[] { this.hxH, localObject });
          CQ(-2);
          this.qKt.kJ(false);
          AppMethodBeat.o(36377);
          bool = false;
        }
      }
      else
      {
        com.tencent.mm.modelcontrol.d.afF();
        if (parambaa.wDP);
        for (localObject = com.tencent.mm.modelcontrol.d.afF().afH(); ; localObject = com.tencent.mm.modelcontrol.d.afF().afI())
        {
          localg.field_largesvideo = com.tencent.mm.modelcontrol.d.a((VideoTransPara)localObject);
          break;
        }
        if (com.tencent.mm.al.f.afx().e(localg))
          break;
        ab.e("MicroMsg.SightCdnUpload", "cdntra addSendTask failed. clientid:%s", new Object[] { str });
        AppMethodBeat.o(36377);
        bool = false;
      }
    }
    if ((parambaa != null) && (parambaa.wDP));
    for (int i = 4; ; i = 5)
    {
      this.fWD = i;
      AppMethodBeat.o(36377);
      bool = true;
      break;
    }
  }

  public final boolean ae(String paramString1, String paramString2, String paramString3)
  {
    AppMethodBeat.i(36378);
    r localr = af.cnu().kE(this.cNE);
    ab.d("MicroMsg.SightCdnUpload", "upload ok " + paramString1 + "  " + paramString3 + "  1");
    localr.rfH = paramString3;
    try
    {
      paramString3 = new com/tencent/mm/protocal/protobuf/bax;
      paramString3.<init>();
      paramString3 = (bax)paramString3.parseFrom(localr.rfI);
      localObject = paramString3;
      if (paramString3 == null)
        localObject = new bax();
      paramString3 = new bar();
      paramString3.jCt = 1;
      paramString3.Url = paramString1;
      ((bax)localObject).wFA = paramString3;
      ((bax)localObject).wFD = 0;
      com.tencent.mm.al.f.afy();
      ((bax)localObject).wFc = com.tencent.mm.al.a.rJ(this.mPath);
      ab.i("MicroMsg.SightCdnUpload", "onPostScene videomd5 %s", new Object[] { ((bax)localObject).wFc });
      if (!bo.isNullOrNil(paramString2))
      {
        paramString1 = new bar();
        paramString1.jCt = 1;
        paramString1.Url = paramString2;
        ((bax)localObject).wFC.add(paramString1);
      }
    }
    catch (Exception paramString3)
    {
      try
      {
        Object localObject;
        localr.rfI = ((bax)localObject).toByteArray();
        localr.crq();
        af.cnu().a(this.cNE, localr);
        af.cnE().CV(this.cNE);
        if (af.cnB() != null)
          af.cnB().cmp();
        AppMethodBeat.o(36378);
        return true;
        paramString3 = paramString3;
        paramString3 = null;
      }
      catch (Exception paramString1)
      {
        while (true)
          ab.printErrStackTrace("MicroMsg.SightCdnUpload", paramString1, "", new Object[0]);
      }
    }
  }

  public final boolean cne()
  {
    AppMethodBeat.i(36376);
    Object localObject1 = com.tencent.mm.a.g.cz(this.mPath);
    boolean bool;
    if ((!bo.isNullOrNil(this.hxH)) && (!this.hxH.equals(localObject1)))
    {
      ab.i("MicroMsg.SightCdnUpload", "checkUpload isNotSafeSightVideo old srcmd5 %s newmd5 %s ", new Object[] { this.hxH, localObject1 });
      CQ(-2);
      this.qKt.kJ(false);
      AppMethodBeat.o(36376);
      bool = false;
    }
    while (true)
    {
      return bool;
      label102: Object localObject2;
      long l1;
      if (this.qKu.wFH != null)
      {
        localObject1 = this.qKu.wFH;
        ab.i("MicroMsg.SightCdnUpload", "check upload %s %d %s", new Object[] { this.mPath, Integer.valueOf(((baa)localObject1).wDQ), Boolean.valueOf(((baa)localObject1).wDP) });
        localObject2 = com.tencent.mm.plugin.sight.base.d.WR(this.mPath);
        if (localObject2 == null)
          break label362;
        ab.i("MicroMsg.SightCdnUpload", "mediaInfo: %s", new Object[] { localObject2 });
        if ((bo.isNullOrNil(((baa)localObject1).csB)) || (!((baa)localObject1).csB.contains("wx5dfbe0a95623607b")))
          break label325;
        l1 = com.tencent.mm.m.g.Nu().getInt("WeiShiShareSnsSightTimeLength", 10);
      }
      while (true)
      {
        long l2 = l1;
        if (l1 <= 0L)
          l2 = 10L;
        l1 = l2 * 1000L + 3000L;
        ab.i("MicroMsg.SightCdnUpload", "maxVideoLen: %s", new Object[] { Long.valueOf(l1) });
        if (((com.tencent.mm.plugin.sight.base.a)localObject2).eWK < l1)
          break label362;
        ab.i("MicroMsg.SightCdnUpload", "checkUpload isNotSafeSightVideo videoDuration: %s ", new Object[] { Integer.valueOf(((com.tencent.mm.plugin.sight.base.a)localObject2).eWK) });
        CQ(-2);
        this.qKt.kJ(false);
        AppMethodBeat.o(36376);
        bool = false;
        break;
        localObject1 = new baa();
        break label102;
        label325: if (((baa)localObject1).wDP)
          l1 = com.tencent.mm.modelcontrol.d.afF().afH().duration;
        else
          l1 = com.tencent.mm.modelcontrol.d.afF().afI().duration;
      }
      label362: if (!((baa)localObject1).wDP)
      {
        a((baa)localObject1);
        AppMethodBeat.o(36376);
        bool = true;
      }
      else
      {
        int i = h.ouu;
        if (((baa)localObject1).wDQ >= 3)
        {
          onError();
          AppMethodBeat.o(36376);
          bool = false;
        }
        else
        {
          ab.i("MicroMsg.SightCdnUpload", "try need remux %d %s", new Object[] { Integer.valueOf(i), this.mPath });
          localObject2 = new rs();
          ((rs)localObject2).callback = new ac.1(this, (rs)localObject2, (baa)localObject1);
          ((rs)localObject2).cNH.cNL = new ac.2(this);
          ((rs)localObject2).cNH.cNp = this.mPath;
          ((rs)localObject2).cNH.scene = i;
          ((rs)localObject2).cNH.cNJ = ((baa)localObject1);
          ((rs)localObject2).cNH.cNK = new ac.3(this, (baa)localObject1);
          com.tencent.mm.sdk.b.a.xxA.a((com.tencent.mm.sdk.b.b)localObject2, af.cns());
          AppMethodBeat.o(36376);
          bool = true;
        }
      }
    }
  }

  final void onError()
  {
    AppMethodBeat.i(36380);
    ab.i("MicroMsg.SightCdnUpload", "snsupload sight by cdn error!");
    r localr = af.cnu().kE(this.cNE);
    localr.offset = 0;
    try
    {
      bax localbax = new com/tencent/mm/protocal/protobuf/bax;
      localbax.<init>();
      localbax = (bax)localbax.parseFrom(localr.rfI);
      localbax.wFE = "";
      if (localbax.wFH != null)
        localbax.wFH.wDQ = 0;
      localr.rfI = localbax.toByteArray();
      af.cnu().a(this.cNE, localr);
      af.cnE().CV(this.cNE);
      AppMethodBeat.o(36380);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.SightCdnUpload", "parseFrom MediaUploadInfo error in NetSceneSnsUpload");
        AppMethodBeat.o(36380);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.model.ac
 * JD-Core Version:    0.6.2
 */