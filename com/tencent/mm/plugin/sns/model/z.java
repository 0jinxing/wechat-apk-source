package com.tencent.mm.plugin.sns.model;

import android.graphics.BitmapFactory.Options;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.m.b;
import com.tencent.mm.graphics.MMBitmapFactory;
import com.tencent.mm.i.a;
import com.tencent.mm.i.g.a;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.platformtools.ae;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.plugin.sns.i.c;
import com.tencent.mm.plugin.sns.storage.r;
import com.tencent.mm.plugin.sns.storage.s;
import com.tencent.mm.protocal.protobuf.SKBuiltinBuffer_t;
import com.tencent.mm.protocal.protobuf.bar;
import com.tencent.mm.protocal.protobuf.bax;
import com.tencent.mm.protocal.protobuf.caq;
import com.tencent.mm.protocal.protobuf.ccj;
import com.tencent.mm.protocal.protobuf.cck;
import com.tencent.mm.protocal.protobuf.civ;
import com.tencent.mm.sdk.platformtools.MMNativeJpeg;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.LinkedList;

public final class z extends m
  implements k
{
  private int cNE;
  private com.tencent.mm.ai.b ehh;
  public com.tencent.mm.ai.f ehi;
  public String fFa;
  int fFb;
  private g.a fFk;
  private int fFu;
  private int frO;
  private int offset;
  private String path;
  private String qJU;
  private ccj qJV;
  private String qJW;
  private boolean qJX;
  private boolean qJY;
  private boolean qJZ;
  long qKa;
  int qKb;
  long startTime;

  public z(int paramInt1, String paramString, boolean paramBoolean, int paramInt2)
  {
    AppMethodBeat.i(36346);
    this.fFu = 8192;
    this.offset = 0;
    this.path = "";
    this.qJU = "";
    this.cNE = 0;
    this.qJW = "";
    this.fFa = "";
    this.qJX = false;
    this.qJY = false;
    this.qJZ = false;
    this.qKa = 0L;
    this.startTime = 0L;
    this.fFb = 0;
    this.qKb = 0;
    this.fFk = new z.1(this);
    this.qKa = System.currentTimeMillis();
    this.cNE = paramInt1;
    this.qJW = paramString;
    this.qKb = paramInt2;
    paramString = new b.a();
    paramString.fsJ = new ccj();
    paramString.fsK = new cck();
    paramString.uri = "/cgi-bin/micromsg-bin/mmsnsupload";
    paramString.fsI = 207;
    paramString.fsL = 95;
    paramString.fsM = 1000000095;
    this.ehh = paramString.acD();
    this.qJV = ((ccj)this.ehh.fsG.fsP);
    r localr = af.cnu().kE(paramInt1);
    this.qJZ = paramBoolean;
    ab.i("MicroMsg.NetSceneMMSnsUpload", "start snsupload netscene localId " + paramInt1 + "  offset " + localr.offset + " path " + localr.rfE + " totallen " + localr.rfD);
    if (!paramBoolean)
    {
      this.qJV.wGz = 1;
      ab.i("MicroMsg.NetSceneMMSnsUpload", "this is single upload");
    }
    try
    {
      paramString = new com/tencent/mm/protocal/protobuf/bax;
      paramString.<init>();
      localbax = (bax)paramString.parseFrom(localr.rfI);
      this.qJU = i.Xe(localr.rfE);
      this.path = (an.fZ(af.getAccSnsPath(), localr.rfE) + this.qJU);
      this.frO = ((int)com.tencent.mm.vfs.e.asZ(this.path));
      this.qJX = i.Xo(this.path);
      ab.i("MicroMsg.NetSceneMMSnsUpload", "totallen " + this.frO + " isLongPic: " + this.qJX);
      String str = localbax.wFE;
      paramString = str;
      if (bo.isNullOrNil(str))
      {
        paramString = com.tencent.mm.a.g.x(bo.yz().getBytes());
        localbax.wFE = paramString;
      }
    }
    catch (Exception paramString)
    {
      try
      {
        bax localbax;
        localr.rfI = localbax.toByteArray();
        af.cnu().a(localr.reX, localr);
        this.qJV.ptw = this.frO;
        this.qJV.ptx = localr.offset;
        this.qJV.ptv = paramString;
        this.fFa = paramString;
        ab.d("MicroMsg.NetSceneMMSnsUpload", "filter style " + localbax.wFd);
        this.qJV.wFd = localbax.wFd;
        ab.d("MicroMsg.NetSceneMMSnsUpload", "syncWeibo " + localbax.wFe);
        this.qJV.vEA = localbax.Desc;
        this.qJV.wFe = localbax.wFe;
        ab.i("MicroMsg.NetSceneMMSnsUpload", "request upload type " + localr.type + " md5: " + localbax.cvZ + " appid " + localbax.csB + " contenttype " + localbax.aPA);
        this.qJV.jCt = localr.type;
        paramString = new civ();
        paramString.xhJ = localbax.token;
        paramString.xhK = localbax.wFn;
        this.qJV.wNQ = paramString;
        if (!bo.isNullOrNil(localbax.cvZ))
          this.qJV.wdO = localbax.cvZ;
        if (!bo.isNullOrNil(localbax.csB))
          this.qJV.fKh = localbax.csB;
        this.qJV.xbO = localbax.aPA;
        if (ae.gic)
          this.qJV.jCt = 0;
        if (this.startTime == 0L)
        {
          this.startTime = bo.anU();
          this.fFb = a.MediaType_FRIENDS;
        }
        paramString = this.qJV;
        com.tencent.mm.al.f.afx();
        if (!com.tencent.mm.al.b.lg(32))
        {
          com.tencent.mm.al.f.afx();
          ab.w("MicroMsg.NetSceneMMSnsUpload", "cdntra not use cdn flag:%b", new Object[] { Boolean.valueOf(com.tencent.mm.al.b.lg(32)) });
          paramInt1 = 0;
          if (paramInt1 == 0)
            break label983;
          this.qJY = true;
          AppMethodBeat.o(36346);
          while (true)
          {
            return;
            paramString = paramString;
            ab.e("MicroMsg.NetSceneMMSnsUpload", "parseFrom MediaUploadInfo error in NetSceneSnsUpload");
            AppMethodBeat.o(36346);
          }
        }
      }
      catch (Exception localException)
      {
        while (true)
        {
          ab.printErrStackTrace("MicroMsg.NetSceneMMSnsUpload", localException, "", new Object[0]);
          continue;
          if (ae.giR == 2)
          {
            paramInt1 = 0;
          }
          else
          {
            this.fFa = paramString.ptv;
            if (bo.isNullOrNil(this.fFa))
            {
              ab.w("MicroMsg.NetSceneMMSnsUpload", "cdntra genClientId failed not use cdn");
              paramInt1 = 0;
            }
            else
            {
              paramInt1 = 1;
              continue;
              label983: if (!cnd())
                onError();
              AppMethodBeat.o(36346);
            }
          }
        }
      }
    }
  }

  private boolean cnd()
  {
    AppMethodBeat.i(36347);
    Object localObject = af.cnu().kE(this.cNE);
    int i = ((r)localObject).rfD - ((r)localObject).offset;
    int j = i;
    if (i > this.fFu)
      j = this.fFu;
    this.offset = ((r)localObject).offset;
    byte[] arrayOfByte = com.tencent.mm.vfs.e.e(this.path, this.offset, j);
    boolean bool;
    if ((arrayOfByte == null) || (arrayOfByte.length <= 0))
    {
      bool = false;
      AppMethodBeat.o(36347);
    }
    while (true)
    {
      return bool;
      localObject = new SKBuiltinBuffer_t();
      ((SKBuiltinBuffer_t)localObject).setBuffer(arrayOfByte);
      this.qJV.vJd = ((SKBuiltinBuffer_t)localObject);
      this.qJV.ptx = this.offset;
      bool = true;
      AppMethodBeat.o(36347);
    }
  }

  private void onError()
  {
    AppMethodBeat.i(36351);
    r localr = af.cnu().kE(this.cNE);
    localr.offset = 0;
    try
    {
      bax localbax = new com/tencent/mm/protocal/protobuf/bax;
      localbax.<init>();
      localbax = (bax)localbax.parseFrom(localr.rfI);
      localbax.wFE = "";
      localr.rfI = localbax.toByteArray();
      af.cnu().a(this.cNE, localr);
      af.cnE().CV(this.cNE);
      AppMethodBeat.o(36351);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.NetSceneMMSnsUpload", "parseFrom MediaUploadInfo error in NetSceneSnsUpload");
        AppMethodBeat.o(36351);
      }
    }
  }

  final void CQ(int paramInt)
  {
    AppMethodBeat.i(36350);
    r localr = af.cnu().kE(this.cNE);
    try
    {
      bax localbax = new com/tencent/mm/protocal/protobuf/bax;
      localbax.<init>();
      localbax = (bax)localbax.parseFrom(localr.rfI);
      localbax.wFD = 1;
      localbax.wFm = paramInt;
      localr.rfI = localbax.toByteArray();
      label56: af.cnE().CV(this.cNE);
      af.cnu().a(this.cNE, localr);
      AppMethodBeat.o(36350);
      return;
    }
    catch (Exception localException)
    {
      break label56;
    }
  }

  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ai.f paramf)
  {
    int i = 108;
    AppMethodBeat.i(36353);
    this.ehi = paramf;
    if (this.qJY)
    {
      this.fFa = this.qJV.ptv;
      if (bo.isNullOrNil(this.fFa))
      {
        ab.w("MicroMsg.NetSceneMMSnsUpload", "cdntra genClientId failed not use cdn");
        AppMethodBeat.o(36353);
        i = 0;
      }
    }
    while (true)
    {
      return i;
      parame = new com.tencent.mm.i.g();
      parame.egl = this.fFk;
      parame.field_mediaId = this.fFa;
      parame.field_fullpath = this.path;
      parame.field_thumbpath = "";
      parame.field_fileType = a.MediaType_FRIENDS;
      parame.field_talker = "";
      parame.field_priority = a.efC;
      parame.field_needStorage = true;
      parame.field_isStreamMedia = false;
      if (s.crs())
      {
        if (this.qJZ);
        while (true)
        {
          parame.field_appType = i;
          parame.field_bzScene = 1;
          if (com.tencent.mm.al.f.afx().e(parame))
            break;
          ab.e("MicroMsg.NetSceneMMSnsUpload", "cdntra addSendTask failed. clientid:%s", new Object[] { this.fFa });
          this.fFa = "";
          break;
          i = 107;
        }
      }
      if (s.crr())
      {
        if (this.qJZ);
        while (true)
        {
          parame.field_appType = i;
          break;
          i = 107;
        }
      }
      com.tencent.mm.al.f.afx();
      if (com.tencent.mm.al.b.lg(64))
      {
        if (this.qJZ);
        for (i = 104; ; i = 103)
        {
          parame.field_appType = i;
          break;
        }
      }
      if (this.qJZ);
      for (i = 101; ; i = 100)
      {
        parame.field_appType = i;
        break;
      }
      i = a(parame, this.ehh, this);
      AppMethodBeat.o(36353);
    }
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(36348);
    ab.i("MicroMsg.NetSceneMMSnsUpload", "netId : " + paramInt1 + " errType :" + paramInt2 + " errCode: " + paramInt3 + " errMsg :" + paramString);
    paramArrayOfByte = (cck)((com.tencent.mm.ai.b)paramq).fsH.fsP;
    if (paramInt2 == 4)
    {
      CQ(paramInt3);
      if (this.qKb == 21)
        com.tencent.mm.plugin.sns.lucky.a.b.kT(12);
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(36348);
    }
    while (true)
    {
      return;
      if ((paramInt2 != 0) || (paramInt3 != 0))
      {
        onError();
        if (this.qKb == 21)
          com.tencent.mm.plugin.sns.lucky.a.b.kT(13);
        this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
        AppMethodBeat.o(36348);
      }
      else
      {
        paramq = af.cnu().kE(this.cNE);
        if ((paramArrayOfByte.ptx < 0) || ((paramArrayOfByte.ptx > paramq.rfD) && (paramq.rfD > 0)))
        {
          onError();
          if (paramInt2 == 3)
            com.tencent.mm.plugin.sns.lucky.a.b.kT(14);
          AppMethodBeat.o(36348);
        }
        else if (paramArrayOfByte.ptx < paramq.offset)
        {
          onError();
          if (paramInt2 == 3)
            com.tencent.mm.plugin.sns.lucky.a.b.kT(14);
          AppMethodBeat.o(36348);
        }
        else
        {
          ab.d("MicroMsg.NetSceneMMSnsUpload", " bufferUrl: " + paramArrayOfByte.xbP.Url + " bufferUrlType: " + paramArrayOfByte.xbP.jCt + "  id:" + paramArrayOfByte.vQE + " thumb Count: " + paramArrayOfByte.wFB + "  type " + paramArrayOfByte.jCt + " startPos : " + paramArrayOfByte.ptx);
          paramq.offset = paramArrayOfByte.ptx;
          af.cnu().a(this.cNE, paramq);
          if ((paramq.offset == paramq.rfD) && (paramq.rfD != 0))
          {
            paramInt1 = 1;
            label418: if (paramInt1 == 0)
              break label629;
            ab.i("MicroMsg.NetSceneMMSnsUpload", "uploadsns done pass: " + (System.currentTimeMillis() - this.qKa));
            if ((paramArrayOfByte.wFC.size() == 0) || (paramArrayOfByte.wFC.size() <= 0))
              break label577;
            a(paramArrayOfByte.xbP.Url, paramArrayOfByte.xbP.jCt, ((caq)paramArrayOfByte.wFC.get(0)).Url, ((caq)paramArrayOfByte.wFC.get(0)).jCt, paramArrayOfByte.vQE, this.qJV.wdO);
          }
          while (true)
          {
            this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
            AppMethodBeat.o(36348);
            break;
            paramInt1 = 0;
            break label418;
            label577: a(paramArrayOfByte.xbP.Url, paramArrayOfByte.xbP.jCt, "", 0, paramArrayOfByte.vQE, this.qJV.wdO);
          }
          label629: if ((cnd()) && (a(this.ftf, this.ehi) < 0))
            this.ehi.onSceneEnd(3, -1, "doScene failed", this);
          AppMethodBeat.o(36348);
        }
      }
    }
  }

  public final boolean a(String paramString1, int paramInt1, String paramString2, int paramInt2, String paramString3, String paramString4)
  {
    AppMethodBeat.i(36349);
    r localr = af.cnu().kE(this.cNE);
    ab.i("MicroMsg.NetSceneMMSnsUpload", "upload ok " + paramString1 + "  " + paramString3 + "  " + paramInt1 + " thumbUrl: " + paramString2);
    BitmapFactory.Options localOptions = new BitmapFactory.Options();
    localOptions.inJustDecodeBounds = true;
    MMBitmapFactory.decodeFile(this.path, localOptions);
    Object localObject;
    if (localOptions.outMimeType != null)
      localObject = localOptions.outMimeType.toLowerCase();
    while (true)
    {
      int i = -1;
      if ((((String)localObject).endsWith("jpg")) || (((String)localObject).endsWith("jpeg")))
      {
        int j = MMNativeJpeg.queryQuality(this.path);
        i = j;
        if (j == 0)
          i = -1;
      }
      long l = com.tencent.mm.vfs.e.asZ(this.path);
      c.a(paramString1, localOptions.outMimeType, localOptions.outWidth, localOptions.outHeight, i, l);
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
        paramString3.jCt = paramInt1;
        paramString3.Url = paramString1;
        ((bax)localObject).wFA = paramString3;
        ((bax)localObject).wFD = 0;
        ((bax)localObject).cvZ = paramString4;
        if (!bo.isNullOrNil(paramString2))
        {
          paramString1 = new bar();
          paramString1.jCt = paramInt2;
          paramString1.Url = paramString2;
          ((bax)localObject).wFC.add(paramString1);
        }
      }
      catch (Exception paramString3)
      {
        try
        {
          localr.rfI = ((bax)localObject).toByteArray();
          localr.crq();
          af.cnu().a(this.cNE, localr);
          af.cnE().CV(this.cNE);
          if (af.cnB() != null)
            af.cnB().cmp();
          AppMethodBeat.o(36349);
          return true;
          localObject = "";
          continue;
          paramString3 = paramString3;
          paramString3 = null;
        }
        catch (Exception paramString1)
        {
          while (true)
            ab.printErrStackTrace("MicroMsg.NetSceneMMSnsUpload", paramString1, "", new Object[0]);
        }
      }
    }
  }

  public final int acn()
  {
    if (this.qJX);
    for (int i = 675; ; i = 100)
      return i;
  }

  public final m.b b(q paramq)
  {
    return m.b.ftu;
  }

  public final void cancel()
  {
    AppMethodBeat.i(36352);
    super.cancel();
    if ((this.qJY) && (!bo.isNullOrNil(this.fFa)))
    {
      ab.i("MicroMsg.NetSceneMMSnsUpload", "cancel by cdn " + this.fFa);
      com.tencent.mm.al.f.afx().rN(this.fFa);
    }
    AppMethodBeat.o(36352);
  }

  public final int getType()
  {
    return 207;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.model.z
 * JD-Core Version:    0.6.2
 */