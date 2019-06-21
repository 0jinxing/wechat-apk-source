package com.tencent.mm.plugin.sns.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.data.h;
import com.tencent.mm.plugin.sns.storage.n;
import com.tencent.mm.plugin.sns.storage.o;
import com.tencent.mm.plugin.sns.storage.r;
import com.tencent.mm.plugin.sns.storage.s;
import com.tencent.mm.plugin.sns.storage.v;
import com.tencent.mm.protocal.protobuf.SKBuiltinBuffer_t;
import com.tencent.mm.protocal.protobuf.TimeLineObject;
import com.tencent.mm.protocal.protobuf.at;
import com.tencent.mm.protocal.protobuf.av;
import com.tencent.mm.protocal.protobuf.ayq;
import com.tencent.mm.protocal.protobuf.ayt;
import com.tencent.mm.protocal.protobuf.baa;
import com.tencent.mm.protocal.protobuf.bau;
import com.tencent.mm.protocal.protobuf.bav;
import com.tencent.mm.protocal.protobuf.baw;
import com.tencent.mm.protocal.protobuf.bax;
import com.tencent.mm.protocal.protobuf.bts;
import com.tencent.mm.protocal.protobuf.cat;
import com.tencent.mm.protocal.protobuf.cba;
import com.tencent.mm.protocal.protobuf.cbf;
import com.tencent.mm.protocal.protobuf.cbp;
import com.tencent.mm.protocal.protobuf.cco;
import com.tencent.mm.protocal.protobuf.cfg;
import com.tencent.mm.protocal.protobuf.cvi;
import com.tencent.mm.protocal.protobuf.dj;
import com.tencent.mm.protocal.protobuf.ds;
import com.tencent.mm.protocal.protobuf.du;
import com.tencent.mm.protocal.protobuf.uf;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class ax
{
  private static final Pattern gIU;
  public int aPA;
  public baa cNJ;
  private String ecX;
  int qFX;
  int qFY;
  List<h> qNF;
  String qNG;
  String qNH;
  LinkedList<cco> qNI;
  LinkedList<Long> qNJ;
  public TimeLineObject qNK;
  public bav qNL;
  n qNM;
  cbf qNN;
  av qNO;
  public cfg qNP;
  public cvi qNQ;
  private boolean qNR;

  static
  {
    AppMethodBeat.i(36740);
    gIU = Pattern.compile("(\n){3,}");
    AppMethodBeat.o(36740);
  }

  public ax(int paramInt)
  {
    AppMethodBeat.i(36714);
    this.qNK = com.tencent.mm.modelsns.e.ajM();
    this.qNL = new bav();
    this.qNM = new n();
    this.qNN = null;
    Object localObject = new av();
    ((av)localObject).vCy = new at();
    ((av)localObject).vCA = new dj();
    ((av)localObject).vCB = new du();
    this.qNO = ((av)localObject);
    this.qNP = new cfg();
    this.cNJ = new baa();
    this.qNQ = null;
    this.ecX = "";
    this.qNR = false;
    this.ecX = af.cnk();
    this.aPA = paramInt;
    this.qNK.xfI.wbJ = paramInt;
    ab.d("MicroMsg.UploadPackHelper", "contentType ".concat(String.valueOf(paramInt)));
    this.qNK.wEJ = 0;
    this.qNK.jBB = this.ecX;
    this.qNL.ptv = com.tencent.mm.a.g.x((af.cnk() + bo.yz() + System.currentTimeMillis()).getBytes());
    this.qNL.wFd = 0;
    this.qNL.wFe = 0;
    this.qNL.wEJ = 0;
    this.qNL.wFh = 0;
    this.qNL.eRu = 0;
    this.qNL.wFj = 0;
    this.qNL.wFl = 0;
    localObject = new cbf();
    ((cbf)localObject).vQE = 0L;
    ((cbf)localObject).pcX = 0;
    ((cbf)localObject).xan = 0;
    ((cbf)localObject).vHl = af.cnk();
    ((cbf)localObject).xaq = new LinkedList();
    ((cbf)localObject).xao = 0;
    ((cbf)localObject).xap = 0;
    ((cbf)localObject).xaw = new LinkedList();
    ((cbf)localObject).xau = 0;
    ((cbf)localObject).xav = 0;
    ((cbf)localObject).xat = new LinkedList();
    ((cbf)localObject).xar = 0;
    ((cbf)localObject).xas = 0;
    ((cbf)localObject).wGz = 1;
    ((cbf)localObject).xan = 0;
    ((cbf)localObject).xax = 0;
    ((cbf)localObject).xam = new SKBuiltinBuffer_t().setBuffer(new byte[0]);
    this.qNN = ((cbf)localObject);
    localObject = this.qNM;
    ((n)localObject).field_localFlag |= 16;
    this.qNM.ls((int)(System.currentTimeMillis() / 1000L));
    this.qNM.field_type = paramInt;
    this.qNM.field_userName = this.ecX;
    this.qNM.field_pravited = 0;
    this.qNM.field_stringSeq = "0000099999999999999999999";
    this.qNM.DF(2);
    this.qNM.cqR();
    if ((paramInt == 1) || (paramInt == 2))
      this.qNM.DF(4);
    if (paramInt == 7)
      this.qNM.DJ(2);
    this.qNJ = new LinkedList();
    this.qNL.wFk = this.qNJ;
    Iterator localIterator = this.qNJ.iterator();
    while (localIterator.hasNext())
    {
      long l = ((Long)localIterator.next()).longValue();
      localObject = new cba();
      ((cba)localObject).xak = l;
      this.qNN.vFk.add(localObject);
    }
    this.qNN.wHG = this.qNJ.size();
    AppMethodBeat.o(36714);
  }

  private static bau A(String paramString, byte[] paramArrayOfByte)
  {
    Object localObject = null;
    AppMethodBeat.i(36726);
    if (bo.cb(paramArrayOfByte))
    {
      ab.e("MicroMsg.UploadPackHelper", com.tencent.mm.compatible.util.g.Mq() + " attachBuf is null");
      AppMethodBeat.o(36726);
      paramString = localObject;
    }
    while (true)
    {
      return paramString;
      String str = af.getAccSnsTmpPath() + com.tencent.mm.a.g.x(new StringBuilder(" ").append(System.currentTimeMillis()).toString().getBytes());
      com.tencent.mm.vfs.e.tf(af.getAccSnsTmpPath());
      ab.d("MicroMsg.UploadPackHelper", com.tencent.mm.compatible.util.g.Mq() + " buildUploadAttachInfo file:" + str);
      if (com.tencent.mm.vfs.e.b(str, paramArrayOfByte, paramArrayOfByte.length) < 0)
      {
        ab.e("MicroMsg.UploadPackHelper", com.tencent.mm.compatible.util.g.Mq() + " writeFile error file:" + str);
        AppMethodBeat.o(36726);
        paramString = localObject;
      }
      else
      {
        paramString = gd(paramString, str);
        AppMethodBeat.o(36726);
      }
    }
  }

  private static String Yl(String paramString)
  {
    AppMethodBeat.i(36715);
    if (paramString == null);
    label59: String str2;
    for (String str1 = ""; ; str2 = paramString)
    {
      paramString = str1;
      try
      {
        str1 = str1.trim();
        paramString = str1;
        str1 = str1.replace("\r\n", "\n");
        paramString = str1;
        str1 = gIU.matcher(str1).replaceAll("\n\n");
        paramString = str1;
        AppMethodBeat.o(36715);
        while (true)
        {
          return paramString;
          ab.e("MicroMsg.UploadPackHelper", "filter desc error ");
          AppMethodBeat.o(36715);
        }
      }
      catch (Exception localException)
      {
        break label59;
      }
    }
  }

  public static void Yw(String paramString)
  {
    AppMethodBeat.i(36731);
    com.tencent.mm.vfs.e.tf(com.tencent.mm.vfs.e.atb(paramString));
    AppMethodBeat.o(36731);
  }

  public static bau ag(String paramString1, String paramString2, String paramString3)
  {
    AppMethodBeat.i(36729);
    bau localbau = com.tencent.mm.modelsns.e.ajN();
    localbau.Id = paramString1;
    ab.d("MicroMsg.UploadPackHelper", "mediaOBj type 2");
    localbau.jCt = 2;
    localbau.Url = paramString2;
    localbau.wEG = 0;
    localbau.wEH = paramString3;
    localbau.wEI = 0;
    localbau.wEN = 1;
    AppMethodBeat.o(36729);
    return localbau;
  }

  public static bau c(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6)
  {
    Object localObject = null;
    AppMethodBeat.i(36727);
    bau localbau = com.tencent.mm.modelsns.e.ajN();
    localbau.Id = paramString1;
    ab.i("MicroMsg.UploadPackHelper", "mediaType %d  videopath %s sightmd5 %s,cdnUrl %s,cdnThumbUrl %s", new Object[] { Integer.valueOf(6), paramString2, paramString4, paramString5, paramString6 });
    localbau.jCt = 6;
    if (com.tencent.mm.vfs.e.asZ(paramString2) <= 0L)
    {
      AppMethodBeat.o(36727);
      paramString1 = localObject;
      return paramString1;
    }
    paramString1 = new h(paramString2, 6);
    paramString1.qGb = paramString4;
    paramString2 = af.cnu().a(paramString1, paramString2, paramString3, paramString5, paramString6);
    if ((paramString2.height > 0) && (paramString2.width > 0) && (paramString2.fileSize > 0))
    {
      paramString1 = new baw();
      paramString1.wFy = paramString2.height;
      paramString1.wFx = paramString2.width;
      paramString1.wFz = paramString2.fileSize;
    }
    while (true)
    {
      localbau.Id = ("Locall_path" + paramString2.cNE);
      localbau.wEK = paramString1;
      localbau.cNE = paramString2.cNE;
      AppMethodBeat.o(36727);
      paramString1 = localbau;
      break;
      paramString1 = null;
    }
  }

  private static bau gd(String paramString1, String paramString2)
  {
    Object localObject1 = null;
    Object localObject2 = null;
    AppMethodBeat.i(36728);
    bau localbau = com.tencent.mm.modelsns.e.ajN();
    localbau.Id = paramString1;
    ab.d("MicroMsg.UploadPackHelper", "mediaOBj type 2");
    localbau.jCt = 2;
    if (com.tencent.mm.vfs.e.asZ(paramString2) <= 0L)
    {
      AppMethodBeat.o(36728);
      paramString1 = localObject2;
    }
    while (true)
    {
      return paramString1;
      paramString1 = af.getAccSnsTmpPath() + com.tencent.mm.a.g.x(new StringBuilder().append(paramString2).append(System.currentTimeMillis()).toString().getBytes());
      com.tencent.mm.vfs.e.y(paramString2, paramString1);
      paramString2 = new h(paramString1, 2);
      paramString1 = new LinkedList();
      paramString1.add(paramString2);
      paramString1 = af.cnu().dn(paramString1);
      if ((paramString1 == null) || (paramString1.size() == 0))
      {
        AppMethodBeat.o(36728);
        paramString1 = localObject2;
      }
      else
      {
        paramString2 = (h)paramString1.get(0);
        paramString1 = localObject1;
        if (paramString2.height > 0)
        {
          paramString1 = localObject1;
          if (paramString2.width > 0)
          {
            paramString1 = localObject1;
            if (paramString2.fileSize > 0)
            {
              paramString1 = new baw();
              paramString1.wFy = paramString2.height;
              paramString1.wFx = paramString2.width;
              paramString1.wFz = paramString2.fileSize;
            }
          }
        }
        localbau.Id = ("Locall_path" + paramString2.cNE);
        localbau.wEK = paramString1;
        localbau.cNE = paramString2.cNE;
        AppMethodBeat.o(36728);
        paramString1 = localbau;
      }
    }
  }

  public final ax Dd(int paramInt)
  {
    this.qNK.xfK = 1;
    this.qNK.xfL = paramInt;
    return this;
  }

  public final void De(int paramInt)
  {
    AppMethodBeat.i(36718);
    ab.d("MicroMsg.UploadPackHelper", "set post form ".concat(String.valueOf(paramInt)));
    this.qNL.wFj = paramInt;
    AppMethodBeat.o(36718);
  }

  public final ax Df(int paramInt)
  {
    AppMethodBeat.i(36719);
    this.qFY = paramInt;
    this.qNL.wEJ = paramInt;
    this.qNK.wEJ = paramInt;
    if (paramInt > 0)
    {
      this.qNM.field_pravited = paramInt;
      this.qNM.cqO();
      this.qNM.DJ(2);
      this.qNM.cqS();
    }
    AppMethodBeat.o(36719);
    return this;
  }

  public final ax Dg(int paramInt)
  {
    this.qFX = paramInt;
    this.qNL.wFe = paramInt;
    return this;
  }

  public final ax Dh(int paramInt)
  {
    this.qNL.wFl = paramInt;
    return this;
  }

  public final ax Di(int paramInt)
  {
    if (paramInt == 1)
      this.qNN.wGz = 3;
    while (true)
    {
      this.qNL.wFo = paramInt;
      return this;
      if (paramInt == 0)
        this.qNN.wGz = 5;
    }
  }

  public final ax Ym(String paramString)
  {
    AppMethodBeat.i(36716);
    this.qNG = Yl(paramString);
    this.qNK.xfF = this.qNG;
    AppMethodBeat.o(36716);
    return this;
  }

  public final ax Yn(String paramString)
  {
    this.qNK.xfM = paramString;
    this.qNO.vCy.vCs = paramString;
    return this;
  }

  public final ax Yo(String paramString)
  {
    this.qNK.rCK = paramString;
    return this;
  }

  public final ax Yp(String paramString)
  {
    this.qNH = paramString;
    this.qNK.xfI.Desc = paramString;
    return this;
  }

  public final ax Yq(String paramString)
  {
    this.qNK.xfI.Url = paramString;
    return this;
  }

  public final ax Yr(String paramString)
  {
    this.qNK.xfI.Title = paramString;
    return this;
  }

  public final ax Ys(String paramString)
  {
    AppMethodBeat.i(36721);
    ds localds1 = this.qNK.xfH;
    ds localds2 = localds1;
    if (localds1 == null)
      localds2 = new ds();
    localds2.Id = paramString;
    this.qNK.xfH = localds2;
    AppMethodBeat.o(36721);
    return this;
  }

  public final ax Yt(String paramString)
  {
    AppMethodBeat.i(36722);
    ds localds1 = this.qNK.xfH;
    ds localds2 = localds1;
    if (localds1 == null)
      localds2 = new ds();
    localds2.ncH = paramString;
    this.qNK.xfH = localds2;
    AppMethodBeat.o(36722);
    return this;
  }

  public final ax Yu(String paramString)
  {
    AppMethodBeat.i(36723);
    this.qNK.ijx = bo.nullAsNil(paramString);
    AppMethodBeat.o(36723);
    return this;
  }

  public final ax Yv(String paramString)
  {
    AppMethodBeat.i(36724);
    this.qNK.vjM = bo.nullAsNil(paramString);
    AppMethodBeat.o(36724);
    return this;
  }

  public final ax a(ayt paramayt)
  {
    if (paramayt == null);
    while (true)
    {
      return this;
      this.qNK.xfG = paramayt;
    }
  }

  public final boolean a(byte[] paramArrayOfByte, String paramString1, String paramString2, int paramInt, String paramString3)
  {
    AppMethodBeat.i(36735);
    paramArrayOfByte = A("", paramArrayOfByte);
    boolean bool;
    if (paramArrayOfByte == null)
    {
      ab.e("MicroMsg.UploadPackHelper", "share img o.data is null!");
      bool = false;
      AppMethodBeat.o(36735);
    }
    while (true)
    {
      return bool;
      paramArrayOfByte.Desc = paramString1;
      if (paramInt > 0)
        paramArrayOfByte.cuu = paramInt;
      if (!bo.isNullOrNil(paramString3))
        paramArrayOfByte.rik = paramString3;
      if (!bo.isNullOrNil(paramString2))
        paramArrayOfByte.Title = paramString2;
      if (!bo.isNullOrNil(paramString1))
        paramArrayOfByte.Desc = paramString1;
      this.qNK.xfI.wbK.add(paramArrayOfByte);
      paramString1 = new ayq();
      paramString1.wCt = paramArrayOfByte.cNE;
      this.qNL.wFf.add(paramString1);
      bool = true;
      AppMethodBeat.o(36735);
    }
  }

  public final boolean a(byte[] paramArrayOfByte, String paramString1, String paramString2, String paramString3, int paramInt, String paramString4, String paramString5)
  {
    boolean bool = false;
    AppMethodBeat.i(36736);
    paramArrayOfByte = A("", paramArrayOfByte);
    if ((paramArrayOfByte == null) || ((bo.isNullOrNil(paramString2)) && (bo.isNullOrNil(paramString3))))
    {
      ab.e("MicroMsg.UploadPackHelper", "share music/video  appmsg.thumbData is null!");
      AppMethodBeat.o(36736);
      return bool;
    }
    if (!bo.isNullOrNil(paramString1))
      this.qNK.xfI.Url = paramString1;
    if (!bo.isNullOrNil(paramString3))
    {
      paramArrayOfByte.Url = paramString3;
      paramArrayOfByte.wEG = 0;
    }
    while (true)
    {
      if (!bo.isNullOrNil(paramString2))
      {
        paramArrayOfByte.wEL = paramString2;
        paramArrayOfByte.wEM = 0;
      }
      paramArrayOfByte.jCt = paramInt;
      paramArrayOfByte.Title = bo.bc(paramString4, "");
      paramArrayOfByte.Desc = bo.bc(paramString5, "");
      this.qNK.xfI.wbK.add(paramArrayOfByte);
      paramString1 = new ayq();
      paramString1.wCt = paramArrayOfByte.cNE;
      this.qNL.wFf.add(paramString1);
      bool = true;
      AppMethodBeat.o(36736);
      break;
      if (!bo.isNullOrNil(paramString2))
      {
        paramArrayOfByte.Url = paramString2;
        paramArrayOfByte.wEG = 0;
      }
    }
  }

  public final ax af(String paramString1, String paramString2, String paramString3)
  {
    AppMethodBeat.i(36717);
    at localat = this.qNO.vCy;
    Object localObject = paramString1;
    if (bo.isNullOrNil(paramString1))
      localObject = "";
    localat.fKh = ((String)localObject);
    localObject = this.qNO.vCy;
    paramString1 = paramString2;
    if (bo.isNullOrNil(paramString2))
      paramString1 = "";
    ((at)localObject).vCt = paramString1;
    paramString2 = this.qNO.vCy;
    paramString1 = paramString3;
    if (bo.isNullOrNil(paramString3))
      paramString1 = "";
    paramString2.vCu = paramString1;
    AppMethodBeat.o(36717);
    return this;
  }

  public final ax ar(LinkedList<cco> paramLinkedList)
  {
    AppMethodBeat.i(36720);
    this.qNI = paramLinkedList;
    this.qNL.wFg = paramLinkedList;
    paramLinkedList = this.qNI.iterator();
    while (paramLinkedList.hasNext())
    {
      cco localcco = (cco)paramLinkedList.next();
      cat localcat = new cat();
      localcat.vHl = localcco.jBB;
      this.qNN.xaw.add(localcat);
    }
    this.qNN.xau = this.qNI.size();
    this.qNN.xav = this.qNI.size();
    AppMethodBeat.o(36720);
    return this;
  }

  @Deprecated
  public final boolean b(String paramString1, String paramString2, String paramString3, int paramInt, String paramString4)
  {
    AppMethodBeat.i(36733);
    paramString1 = ag("", paramString1, paramString2);
    boolean bool;
    if (paramString1 == null)
    {
      ab.e("MicroMsg.UploadPackHelper", "share img o.url is null!");
      bool = false;
      AppMethodBeat.o(36733);
    }
    while (true)
    {
      return bool;
      paramString1.Desc = paramString3;
      if (paramInt > 0)
        paramString1.cuu = paramInt;
      if (!bo.isNullOrNil(paramString4))
        paramString1.rik = paramString4;
      this.qNK.xfI.wbK.add(paramString1);
      bool = true;
      AppMethodBeat.o(36733);
    }
  }

  public final boolean b(byte[] paramArrayOfByte, String paramString1, String paramString2)
  {
    AppMethodBeat.i(36734);
    boolean bool = a(paramArrayOfByte, paramString1, paramString2, -1, "");
    AppMethodBeat.o(36734);
    return bool;
  }

  public final int commit()
  {
    AppMethodBeat.i(36739);
    long l = System.currentTimeMillis();
    try
    {
      this.qNL.wFi = System.currentTimeMillis();
      this.qNL.eRu = 0;
      this.qNM.bi(this.qNN.toByteArray());
      this.qNM.field_postBuf = this.qNL.toByteArray();
      Object localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>("snsObj ");
      ab.d("MicroMsg.UploadPackHelper", this.qNN.toString());
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>("postinfo ");
      ab.d("MicroMsg.UploadPackHelper", this.qNL.toString());
      ab.d("MicroMsg.UploadPackHelper", "timelineObj " + this.qNK.toString());
      if (this.qNK.xfI.wbK != null)
      {
        ab.d("MicroMsg.UploadPackHelper", "timelineObj MeidaCount %d ", new Object[] { Integer.valueOf(this.qNK.xfI.wbK.size()) });
        for (i = 0; i < this.qNK.xfI.wbK.size(); i++)
        {
          localObject1 = (bau)this.qNK.xfI.wbK.get(i);
          if (localObject1 != null)
            ab.d("MicroMsg.UploadPackHelper", "timelineObj media %d %s", new Object[] { Integer.valueOf(((bau)localObject1).cNE), bo.bc(((bau)localObject1).Url, "") });
        }
      }
    }
    catch (Exception localException1)
    {
      int i;
      while (true)
        ab.printErrStackTrace("MicroMsg.UploadPackHelper", localException1, "", new Object[0]);
      if (this.qNO != null)
        this.qNK.qNO = this.qNO;
      if (this.qNQ != null)
        this.qNK.qNQ = this.qNQ;
      this.qNM.c(this.qNK);
      int j = af.cnF().A(this.qNM);
      Iterator localIterator = this.qNL.wFf.iterator();
      int k = 0;
      Object localObject2 = null;
      if (localIterator.hasNext())
      {
        ayq localayq = (ayq)localIterator.next();
        Object localObject3 = af.cnu().kE(localayq.wCt);
        while (true)
        {
          try
          {
            bax localbax = new com/tencent/mm/protocal/protobuf/bax;
            localbax.<init>();
            localbax = (bax)localbax.parseFrom(((r)localObject3).rfI);
            if (this.qNK.xfH != null)
              localbax.csB = this.qNK.xfH.Id;
            if (this.cNJ != null)
              this.cNJ.wDQ = 0;
            localbax.wFH = this.cNJ;
            localbax.aPA = this.qNK.xfI.wbJ;
            if ((localbax.aPA == 1) || (localbax.aPA == 15))
            {
              if (!bo.isNullOrNil(localbax.csB))
              {
                i = 5;
                localbax.wFI = i;
              }
            }
            else
            {
              ((r)localObject3).rfI = localbax.toByteArray();
              af.cnu().a(localayq.wCt, (r)localObject3);
              localObject3 = localbax.cvZ;
              k++;
              localObject2 = localObject3;
              break;
            }
            if ((localbax.wFH == null) || (localbax.aPA != 15))
              break label630;
            if (!localbax.wFH.wDP)
              break label624;
            i = 1;
            localbax.wFI = i;
            continue;
          }
          catch (Exception localException2)
          {
            ab.e("MicroMsg.UploadPackHelper", "parseFrom MediaUploadInfo error in NetSceneSnsUpload");
          }
          break;
          label624: i = 2;
          continue;
          label630: boolean bool = ((h)this.qNF.get(k)).qGc;
          if (bool)
            i = 1;
          else
            i = 2;
        }
      }
      ab.i("MicroMsg.UploadPackHelper", "commit sns info ret %d, typeFlag %d sightMd5 %s", new Object[] { Integer.valueOf(j), Integer.valueOf(this.qNM.field_type), localObject2 });
      if ((j > 0) && (this.qNM.field_type == 15))
        aq.gb(v.ao("sns_table_", j), localObject2);
      ab.d("MicroMsg.UploadPackHelper", "pack commit result " + j + " cost " + (System.currentTimeMillis() - l));
      AppMethodBeat.o(36739);
      return j;
    }
  }

  public final ax dg(List<String> paramList)
  {
    AppMethodBeat.i(36725);
    if ((paramList == null) || (paramList.size() == 0))
    {
      this.qNN.wGz = 1;
      AppMethodBeat.o(36725);
      return this;
    }
    paramList = paramList.iterator();
    LinkedList localLinkedList = new LinkedList();
    while (paramList.hasNext())
    {
      String str = (String)paramList.next();
      bts localbts = new bts();
      localbts.alV(str);
      localLinkedList.add(localbts);
    }
    this.qNL.wFp = localLinkedList;
    if (this.qNN.wGz == 3)
    {
      this.qNN.xaB = localLinkedList;
      this.qNN.xaA = localLinkedList.size();
    }
    while (true)
    {
      AppMethodBeat.o(36725);
      break;
      if (this.qNN.wGz == 5)
      {
        this.qNN.wFp = localLinkedList;
        this.qNN.xaC = localLinkedList.size();
      }
    }
  }

  public final void dh(List<h> paramList)
  {
    AppMethodBeat.i(36737);
    this.qNF = paramList;
    List localList = af.cnu().dn(this.qNF);
    Object localObject1 = new LinkedList();
    if (localList == null)
      AppMethodBeat.o(36737);
    while (true)
    {
      return;
      Iterator localIterator = localList.iterator();
      Object localObject2;
      while (localIterator.hasNext())
      {
        paramList = (h)localIterator.next();
        localObject2 = new ayq();
        ((ayq)localObject2).wCt = paramList.cNE;
        ((LinkedList)localObject1).add(localObject2);
      }
      this.qNL.wFf = ((LinkedList)localObject1);
      paramList = localList.iterator();
      while (paramList.hasNext())
      {
        localObject1 = (h)paramList.next();
        localObject2 = new baw();
        ((baw)localObject2).wFy = 0.0F;
        ((baw)localObject2).wFx = 0.0F;
        ((baw)localObject2).wFz = 0.0F;
        if ((((h)localObject1).height > 0) && (((h)localObject1).width > 0) && (((h)localObject1).fileSize > 0))
        {
          ((baw)localObject2).wFy = ((h)localObject1).height;
          ((baw)localObject2).wFx = ((h)localObject1).width;
          ((baw)localObject2).wFz = ((h)localObject1).fileSize;
        }
        localObject2 = com.tencent.mm.modelsns.e.a("Locall_path" + ((h)localObject1).cNE, ((h)localObject1).type, "", "", 0, 0, this.qFY, "", (baw)localObject2);
        this.qNK.xfI.wbK.add(localObject2);
      }
      AppMethodBeat.o(36737);
    }
  }

  public final void g(String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(36738);
    cbp localcbp = new cbp();
    localcbp.vFJ = paramString1;
    localcbp.vFK = paramString2;
    localcbp.vFL = paramString3;
    localcbp.rnf = paramInt1;
    localcbp.rng = paramInt2;
    this.qNL.wFq = localcbp;
    AppMethodBeat.o(36738);
  }

  public final ax gc(String paramString1, String paramString2)
  {
    this.qNL.token = paramString1;
    this.qNL.wFn = paramString2;
    return this;
  }

  public final boolean ge(String paramString1, String paramString2)
  {
    AppMethodBeat.i(36732);
    String str = af.getAccSnsTmpPath() + com.tencent.mm.a.g.x(paramString1.getBytes());
    Yw(str);
    com.tencent.mm.vfs.e.y(paramString1, str);
    paramString1 = gd("", str);
    boolean bool;
    if (paramString1 == null)
    {
      ab.e("MicroMsg.UploadPackHelper", "share img o.imagePath is null!");
      bool = false;
      AppMethodBeat.o(36732);
    }
    while (true)
    {
      return bool;
      paramString1.Desc = paramString2;
      if (bo.isNullOrNil(paramString1.Title))
        paramString1.Title = paramString2;
      this.qNK.xfI.wbK.add(paramString1);
      paramString2 = new ayq();
      paramString2.wCt = paramString1.cNE;
      this.qNL.wFf.add(paramString2);
      bool = true;
      AppMethodBeat.o(36732);
    }
  }

  public final void setSessionId(String paramString)
  {
    this.qNL.cvF = paramString;
  }

  public final boolean t(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    AppMethodBeat.i(36730);
    String str = af.getAccSnsTmpPath() + com.tencent.mm.a.g.x(paramString1.getBytes());
    Yw(str);
    com.tencent.mm.vfs.e.y(paramString1, str);
    paramString1 = af.getAccSnsTmpPath() + com.tencent.mm.a.g.x(paramString2.getBytes());
    com.tencent.mm.vfs.e.y(paramString2, paramString1);
    paramString1 = c("", str, paramString1, paramString4, "", "");
    boolean bool;
    if (paramString1 == null)
    {
      ab.e("MicroMsg.UploadPackHelper", "share img o.imagePath is null!");
      bool = false;
      AppMethodBeat.o(36730);
    }
    while (true)
    {
      return bool;
      paramString1.Desc = paramString3;
      if (bo.isNullOrNil(paramString1.Title))
        paramString1.Title = paramString3;
      this.qNK.xfI.wbK.add(paramString1);
      paramString2 = new ayq();
      paramString2.wCt = paramString1.cNE;
      this.qNL.wFf.add(paramString2);
      bool = true;
      AppMethodBeat.o(36730);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.model.ax
 * JD-Core Version:    0.6.2
 */