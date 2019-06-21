package com.tencent.mm.plugin.sns.model.a;

import android.util.SparseArray;
import com.tencent.mars.cdn.CdnLogic.BatchSnsReqImageData;
import com.tencent.mm.a.p;
import com.tencent.mm.memory.n;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.model.an;
import com.tencent.mm.plugin.sns.model.b.c;
import com.tencent.mm.pluginsdk.model.k;
import com.tencent.mm.protocal.protobuf.bau;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.az;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;

public abstract class c extends k<String, Integer, Integer>
{
  private static HashSet<String> qOr = new HashSet();
  protected bau cNr = null;
  private long dnsCostTime = -1L;
  private int gcI = -1;
  private String host = "";
  protected a qNY;
  protected n qNZ = null;
  protected a qOa = null;
  int qOt = 0;
  protected SparseArray<n> qOu = new SparseArray();

  public c(a parama, a parama1)
  {
    this.qNY = parama;
    this.qOa = parama1;
    if (parama1 == null);
    while (true)
    {
      return;
      this.cNr = parama1.qJh;
      qOr.add(parama1.qJg);
      parama1.EK();
    }
  }

  public static boolean Yz(String paramString)
  {
    boolean bool = true;
    if (qOr.contains(i.bd(1, paramString)));
    while (true)
    {
      return bool;
      if (!qOr.contains(i.bd(5, paramString)))
        bool = false;
    }
  }

  private boolean a(com.tencent.mm.i.e parame, boolean paramBoolean, String paramString)
  {
    Object localObject;
    ArrayList localArrayList1;
    ArrayList localArrayList2;
    int i;
    try
    {
      localObject = new java/net/URL;
      ((URL)localObject).<init>(this.qOa.url);
      this.host = ((URL)localObject).getHost();
      localArrayList1 = new java/util/ArrayList;
      localArrayList1.<init>();
      this.gcI = com.tencent.mm.network.b.a(this.host, false, localArrayList1);
      localArrayList2 = new java/util/ArrayList;
      localArrayList2.<init>();
      i = com.tencent.mm.network.b.a(this.host, true, localArrayList2);
      localObject = new java/util/Random;
      ((Random)localObject).<init>();
      ((Random)localObject).setSeed(bo.anU());
      Collections.shuffle(localArrayList1, (Random)localObject);
      Collections.shuffle(localArrayList2, (Random)localObject);
      while (localArrayList1.size() > 2)
        localArrayList1.remove(0);
    }
    catch (MalformedURLException parame)
    {
      ab.printErrStackTrace("MicroMsg.SnsCdnDownloadBase", parame, "", new Object[0]);
      ab.w("MicroMsg.SnsCdnDownloadBase", "attachSnsImgTaskInfo fail:".concat(String.valueOf(parame)));
      paramBoolean = false;
    }
    return paramBoolean;
    while (localArrayList2.size() > 2)
      localArrayList2.remove(0);
    if (9 == this.qOa.qNV)
    {
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      parame.field_mediaId = (this.qOa.cFc + "_" + this.qOa.qNV);
      if ((parame instanceof com.tencent.mm.i.f))
      {
        com.tencent.mm.i.f localf = (com.tencent.mm.i.f)parame;
        localf.cFc = this.qOa.cFc;
        localf.egj = this.qOa.qFU.size();
        localf.egb = new CdnLogic.BatchSnsReqImageData[localf.egj];
        for (int j = 0; j < localf.egj; j++)
        {
          int k = this.qOa.qFU.keyAt(j);
          bau localbau = (bau)this.qOa.qFU.get(k);
          CdnLogic.BatchSnsReqImageData localBatchSnsReqImageData = new com/tencent/mars/cdn/CdnLogic$BatchSnsReqImageData;
          localBatchSnsReqImageData.<init>();
          String str = localbau.wEH;
          localObject = str;
          if (bo.isNullOrNil(str))
          {
            localObject = str;
            if (localbau.jCt == 2)
              localObject = localbau.Url;
          }
          localBatchSnsReqImageData.url = b((String)localObject, localbau);
          localBatchSnsReqImageData.picIndex = k;
          localBatchSnsReqImageData.totalFileSize = 0;
          localBatchSnsReqImageData.decryptKey = localbau.wFb;
          localObject = new java/lang/StringBuilder;
          ((StringBuilder)localObject).<init>();
          str = localbau.Id;
          localBatchSnsReqImageData.imageCachePath = (an.fZ(af.getAccSnsPath(), str) + i.n(localbau));
          localObject = new java/lang/StringBuilder;
          ((StringBuilder)localObject).<init>();
          localBatchSnsReqImageData.fileKey = (localbau.Id + "_" + this.qOa.qNV);
          localf.egb[j] = localBatchSnsReqImageData;
        }
      }
    }
    else
    {
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      parame.field_mediaId = (this.qOa.cHr + "_" + this.qOa.qNV);
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      parame.egd = (this.qOa.getPath() + this.qOa.cop());
      if (this.qOa.qJh != null)
      {
        if (!this.qOa.qNT)
          break label801;
        localObject = this.qOa.qJh.wFb;
        label631: parame.snsCipherKey = ((String)localObject);
      }
    }
    parame.url = this.qOa.url;
    parame.host = this.host;
    parame.referer = paramString;
    parame.ege = di(localArrayList1);
    parame.egf = di(localArrayList2);
    parame.egg = this.gcI;
    parame.egh = i;
    parame.isColdSnsData = paramBoolean;
    paramString = new java/lang/StringBuilder;
    paramString.<init>();
    parame.signalQuality = at.getStrength(ah.getContext());
    parame.snsScene = this.qOa.qNW.tag;
    if (this.qOa.qNV == 8)
    {
      parame.duk = 3;
      parame.egi = 109;
      parame.fileType = 20204;
    }
    while (true)
    {
      ab.i("MicroMsg.SnsCdnDownloadBase", "attachSnsImgTaskInfo reqDownType:%d taskInfo:%s", new Object[] { Integer.valueOf(this.qOa.qNV), parame });
      paramBoolean = true;
      break;
      label801: localObject = this.qOa.qJh.wEY;
      break label631;
      if ((this.qOa.qNV == 6) || (this.qOa.qNV == 4))
      {
        parame.duk = 3;
        parame.egi = 105;
        parame.fileType = 20210;
      }
      else if (this.qOa.qNV == 5)
      {
        parame.duk = 3;
        parame.egi = 150;
        parame.fileType = 20250;
      }
      else if ((this.qOa.qNV == 2) || (this.qOa.qNV == 1) || (this.qOa.qNV == 3) || (this.qOa.qNV == 9))
      {
        parame.duk = 3;
        parame.egi = 100;
        parame.fileType = 20201;
      }
    }
  }

  private static String[] di(List<String> paramList)
  {
    String[] arrayOfString = new String[paramList.size()];
    for (int i = 0; i < arrayOfString.length; i++)
      arrayOfString[i] = ((String)paramList.get(i));
    return arrayOfString;
  }

  public boolean Dj(int paramInt)
  {
    return false;
  }

  public final void Dk(int paramInt)
  {
    if (af.cnn())
      return;
    Object localObject = (com.tencent.mm.plugin.sns.data.e)this.qOa.qFK.get(paramInt);
    bau localbau = (bau)this.qOa.qFU.get(paramInt);
    ab.i("MicroMsg.SnsCdnDownloadBase", "thumbAddDecode index: %d decodeType: %d.", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(((com.tencent.mm.plugin.sns.data.e)localObject).qFQ) });
    af.cnC().a(localbau.Id, (n)this.qOu.get(paramInt), ((com.tencent.mm.plugin.sns.data.e)localObject).qFQ);
    if (((com.tencent.mm.plugin.sns.data.e)localObject).qFQ == 0);
    for (localObject = i.bc(0, ((com.tencent.mm.plugin.sns.data.e)localObject).nQB); ; localObject = null)
    {
      ab.i("MicroMsg.SnsCdnDownloadBase", "thumbAddDecode cacheName: %s.", new Object[] { localObject });
      af.cnC().XM((String)localObject);
      break;
    }
  }

  public String Yx(String paramString)
  {
    return paramString;
  }

  public boolean a(az paramaz, String paramString1, long paramLong, String paramString2)
  {
    boolean bool1 = false;
    boolean bool2;
    if (paramString1 == null)
      bool2 = bool1;
    while (true)
    {
      return bool2;
      try
      {
        URL localURL = new java/net/URL;
        localURL.<init>(paramString1);
        bool2 = bool1;
        if (paramaz != null)
        {
          bool2 = bool1;
          if (paramString2 != null)
          {
            bool2 = bool1;
            if (paramString2.indexOf(localURL.getHost()) != -1)
            {
              bool2 = bool1;
              if (paramaz.oyB != 0)
              {
                long l = bo.fp(paramaz.oyB);
                bool2 = bool1;
                if (l > paramLong)
                  bool2 = true;
              }
            }
          }
        }
      }
      catch (Exception paramaz)
      {
        ab.e("MicroMsg.SnsCdnDownloadBase", "error for check dcip %s", new Object[] { paramaz.getMessage() });
        bool2 = bool1;
      }
    }
  }

  public String b(String paramString, bau parambau)
  {
    return paramString;
  }

  protected final void b(com.tencent.mm.i.d paramd)
  {
    int i = cos();
    String str = "";
    Object localObject1;
    label42: Object localObject2;
    int j;
    switch (i)
    {
    default:
      return;
    case 1:
      localObject1 = "100105";
      localObject2 = com.tencent.mm.model.c.c.abi().ll((String)localObject1);
      if (((com.tencent.mm.storage.c)localObject2).isValid())
      {
        j = bo.getInt((String)((com.tencent.mm.storage.c)localObject2).dru().get("needUploadData"), 1);
        str = ((com.tencent.mm.storage.c)localObject2).field_expId;
      }
      break;
    case 2:
    case 3:
    }
    while (j != 0)
    {
      if (this.qOa.qNV == 8)
        j = 1;
      while (true)
      {
        label108: localObject2 = new com.tencent.mm.modelsns.d();
        ((com.tencent.mm.modelsns.d)localObject2).l("20ImgSize", paramd.field_fileLength + ",");
        StringBuilder localStringBuilder = new StringBuilder();
        int k;
        if (at.isWifi(ah.getContext()))
        {
          k = 1;
          label169: ((com.tencent.mm.modelsns.d)localObject2).l("21NetType", k + ",");
          ((com.tencent.mm.modelsns.d)localObject2).l("22DelayTime", paramd.field_delayTime + ",");
          ((com.tencent.mm.modelsns.d)localObject2).l("23RetCode", paramd.field_retCode + ",");
          ((com.tencent.mm.modelsns.d)localObject2).l("24DnsCostTime", paramd.field_dnsCostTime + ",");
          ((com.tencent.mm.modelsns.d)localObject2).l("25ConnectCostTime", paramd.field_connectCostTime + ",");
          ((com.tencent.mm.modelsns.d)localObject2).l("26SendCostTime", ",");
          ((com.tencent.mm.modelsns.d)localObject2).l("27WaitResponseCostTime", paramd.field_waitResponseCostTime + ",");
          ((com.tencent.mm.modelsns.d)localObject2).l("28ReceiveCostTime", paramd.field_receiveCostTime + ",");
          ((com.tencent.mm.modelsns.d)localObject2).l("29ClientAddrIP(uint)", paramd.field_clientHostIP + ",");
          ((com.tencent.mm.modelsns.d)localObject2).l("30ServerAddrIP(uint)", paramd.field_serverHostIP + ",");
          ((com.tencent.mm.modelsns.d)localObject2).l("31dnstype", this.gcI + ",");
          ((com.tencent.mm.modelsns.d)localObject2).l("32signal(int)", at.getStrength(ah.getContext()) + ",");
          ((com.tencent.mm.modelsns.d)localObject2).l("33host(string)", this.host + ",");
          ((com.tencent.mm.modelsns.d)localObject2).l("34MediaType", i + ",");
          ((com.tencent.mm.modelsns.d)localObject2).l("35X_Errno(string)", paramd.field_xErrorNo + ",");
          ((com.tencent.mm.modelsns.d)localObject2).l("36MaxPackageSize", ",");
          ((com.tencent.mm.modelsns.d)localObject2).l("37MaxPackageTimeStamp", ",");
          ((com.tencent.mm.modelsns.d)localObject2).l("38PackageRecordList", ",");
          ((com.tencent.mm.modelsns.d)localObject2).l("39ExpLayerId", (String)localObject1 + ",");
          ((com.tencent.mm.modelsns.d)localObject2).l("40ExpId", str + ",");
          ((com.tencent.mm.modelsns.d)localObject2).l("41FeedId", ",");
          ((com.tencent.mm.modelsns.d)localObject2).l("42BizType", j + ",");
          ((com.tencent.mm.modelsns.d)localObject2).l("43CSeqCheck(uint)", paramd.field_cSeqCheck + ",");
          localObject1 = new StringBuilder();
          if (!paramd.field_usePrivateProtocol)
            break label999;
        }
        label999: for (j = 1; ; j = 0)
        {
          ((com.tencent.mm.modelsns.d)localObject2).l("44isPrivate(uint)", j + ",");
          ab.i("MicroMsg.SnsCdnDownloadBase", "report logbuffer(13480 TLMediaFielDownloadRecord): " + ((com.tencent.mm.modelsns.d)localObject2).Fk());
          h.pYm.e(13480, new Object[] { localObject2 });
          if ((paramd.field_retCode == 200) || (paramd.field_retCode == 0))
            break;
          h.pYm.e(14071, new Object[] { localObject2 });
          break;
          localObject1 = "100106";
          break label42;
          localObject1 = "100100";
          break label42;
          if ((this.qOa.qNV == 6) || (this.qOa.qNV == 4))
          {
            j = 2;
            break label108;
          }
          if (this.qOa.qNV == 5)
          {
            j = 4;
            break label108;
          }
          if ((this.qOa.qNV != 2) && (this.qOa.qNV != 1) && (this.qOa.qNV != 3))
            break label1005;
          j = 0;
          break label108;
          k = 0;
          break label169;
        }
        label1005: j = 5;
      }
      j = 0;
    }
  }

  public com.tencent.mm.sdk.g.b.a cin()
  {
    return af.cnp();
  }

  public boolean coq()
  {
    return true;
  }

  public abstract boolean cor();

  protected abstract int cos();

  public Integer cou()
  {
    com.tencent.mm.kernel.g.RQ();
    Object localObject1;
    if ((!com.tencent.mm.kernel.g.RP().isSDCardAvailable()) || (this.qOa == null))
    {
      localObject1 = Integer.valueOf(2);
      return localObject1;
    }
    Object localObject3;
    Object localObject4;
    if (coq())
    {
      if (9 == this.qOa.qNV)
        for (i = 0; i < this.qOa.qFU.size(); i++)
        {
          localObject3 = (bau)this.qOa.qFU.valueAt(i);
          localObject4 = new StringBuilder();
          localObject1 = ((bau)localObject3).Id;
          com.tencent.mm.vfs.e.deleteFile(an.fZ(af.getAccSnsPath(), (String)localObject1) + i.n((bau)localObject3));
        }
      localObject1 = this.qOa.qJc + this.qOa.cop();
      ab.i("MicroMsg.SnsCdnDownloadBase", "[tomys] delete img: %s", new Object[] { localObject1 });
      com.tencent.mm.vfs.e.deleteFile((String)localObject1);
    }
    long l1 = System.currentTimeMillis();
    String str;
    boolean bool;
    Object localObject2;
    try
    {
      localObject1 = af.cnA();
      localObject3 = this.qOa.cHr;
      if (!bo.isNullOrNil((String)localObject3));
      for (localObject1 = (b.c)((com.tencent.mm.plugin.sns.model.b)localObject1).qHN.get(localObject3); ; localObject1 = null)
      {
        if ((localObject1 != null) && (!((b.c)localObject1).qHS))
          ((b.c)localObject1).setStartTime(l1);
        i = 0;
        if (this.qOa.qFU != null)
          i = this.qOa.qFU.size();
        ab.d("MicroMsg.SnsCdnDownloadBase", "to downloadBitmap pack.mediaId: " + this.qOa.cHr + " pack.mediaObjs.size: " + i + " pack.snsId: " + this.qOa.cFc + " pack.isthumb: " + this.qOa.qNT + " type: " + this.qOa.qNV);
        localObject4 = this.qOa.qNW;
        localObject1 = "";
        if (localObject4 != null)
          break;
        localObject1 = "";
        localObject3 = localObject1;
        if (!bo.isNullOrNil((String)localObject1))
          localObject3 = "&scene=".concat(String.valueOf(localObject1));
        str = String.format("http://weixin.qq.com/?version=%d&uin=%s&nettype=%d&signal=%d%s", new Object[] { Integer.valueOf(com.tencent.mm.protocal.d.vxo), p.getString(af.cnl()), Integer.valueOf(at.getNetTypeForStat(ah.getContext())), Integer.valueOf(at.getStrength(ah.getContext())), localObject3 });
        if (9 != this.qOa.qNV)
          break label853;
        this.qOa.url = b(this.qOa.url, (bau)this.qOa.qFU.get(0));
        this.dnsCostTime = bo.anU();
        if (!this.qOa.qNU)
          break label874;
        localObject1 = "SnsSightDomainList";
        if (!this.qOa.qNU)
          break label881;
        localObject3 = "SnsSightMainStandbyIpSwitchTime";
        localObject1 = com.tencent.mm.m.g.Nu().getValue((String)localObject1);
        long l2 = com.tencent.mm.m.g.Nu().getInt((String)localObject3, 0);
        ab.i("MicroMsg.SnsCdnDownloadBase", "pack.isAlbum %s pack.isthumb %s hostvalue %s dcipTime %s", new Object[] { Boolean.valueOf(this.qOa.qNU), Boolean.valueOf(this.qOa.qNT), localObject1, Long.valueOf(l2) });
        long l3 = l2;
        if (l2 <= 0L)
          l3 = 259200L;
        bool = a((az)localObject4, this.qOa.url, l3, (String)localObject1);
        this.dnsCostTime = bo.gb(this.dnsCostTime);
        if (9 != this.qOa.qNV)
          break label944;
        localObject1 = new com.tencent.mm.i.f();
        for (i = 0; i < this.qOa.qFU.size(); i++)
        {
          localObject3 = ((bau)this.qOa.qFU.valueAt(i)).Id;
          com.tencent.mm.vfs.e.tf(an.fZ(af.getAccSnsPath(), (String)localObject3));
        }
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.SnsCdnDownloadBase", "exception msg: %s.", new Object[] { localException.getMessage() });
        continue;
        if (((az)localObject4).equals(az.xYN))
        {
          localObject2 = "album_friend";
        }
        else if (((az)localObject4).equals(az.xYO))
        {
          localObject2 = "album_self";
        }
        else if (((az)localObject4).equals(az.xYP))
        {
          localObject2 = "album_stranger";
        }
        else if (((az)localObject4).equals(az.xYQ))
        {
          localObject2 = "profile_friend";
        }
        else if (((az)localObject4).equals(az.xYR))
        {
          localObject2 = "profile_stranger";
        }
        else if (((az)localObject4).equals(az.xYS))
        {
          localObject2 = "comment";
        }
        else if (((az)localObject4).equals(az.xYM))
        {
          localObject2 = "timeline";
          continue;
          label853: this.qOa.url = Yx(this.qOa.url);
          continue;
          label874: localObject2 = "SnsAlbumDomainList";
          continue;
          label881: localObject3 = "SnsAlbumMainStandbyIpSwitchTime";
        }
      }
    }
    label888: if (a((com.tencent.mm.i.e)localObject2, bool, str))
    {
      ((com.tencent.mm.i.e)localObject2).egl = new c.1(this, (com.tencent.mm.i.e)localObject2, l1);
      if (com.tencent.mm.al.f.afx().b((com.tencent.mm.i.g)localObject2, -1))
        ab.i("MicroMsg.SnsCdnDownloadBase", "SubCoreCdnTransport addRecvTask suc");
    }
    for (int i = 1; ; i = 2)
    {
      localObject2 = Integer.valueOf(i);
      break;
      label944: com.tencent.mm.vfs.e.tf(this.qOa.getPath());
      localObject2 = new com.tencent.mm.i.e();
      break label888;
      ab.w("MicroMsg.SnsCdnDownloadBase", "SubCoreCdnTransport addRecvTask failed");
    }
  }

  public void cov()
  {
    if (af.cnn())
      return;
    System.currentTimeMillis();
    Object localObject1;
    Object localObject2;
    if (this.qOa.qFJ.qFQ == 4)
    {
      ab.i("MicroMsg.SnsCdnDownloadBase", "decodeType blur thumb");
      localObject1 = i.e(this.cNr);
      localObject2 = i.g(this.cNr);
      this.qNZ = com.tencent.mm.plugin.sns.lucky.a.a.fV(this.qOa.getPath() + (String)localObject1, this.qOa.getPath() + (String)localObject2);
      af.cnC().a(this.qOa.cHr, this.qNZ, this.qOa.qFJ.qFQ);
      label132: localObject1 = null;
      if (this.qOa.qFJ.qFQ != 0)
        break label594;
      localObject1 = "0-" + this.qOa.qFJ.nQB;
    }
    while (true)
    {
      af.cnC().XM((String)localObject1);
      break;
      if (this.qOa.qFJ.qFQ == 5)
      {
        ab.i("MicroMsg.SnsCdnDownloadBase", "decodeType blur grid");
        localObject2 = i.e(this.cNr);
        localObject1 = i.h(this.cNr);
        this.qNZ = com.tencent.mm.plugin.sns.lucky.a.a.fV(this.qOa.getPath() + (String)localObject2, this.qOa.getPath() + (String)localObject1);
        af.cnC().a(this.qOa.cHr, this.qNZ, this.qOa.qFJ.qFQ);
        break label132;
      }
      if (this.qOa.qFJ.list.size() <= 1)
      {
        af.cnC().a(this.qOa.cHr, this.qNZ, this.qOa.qFJ.qFQ);
        break label132;
      }
      af.cnC().a(this.qOa.cHr, this.qNZ, 0);
      localObject1 = new LinkedList();
      for (int i = 0; ; i++)
      {
        if ((i >= this.qOa.qFJ.list.size()) || (i >= 4))
          break label502;
        localObject2 = (bau)this.qOa.qFJ.list.get(i);
        n localn = af.cnC().XN(((bau)localObject2).Id);
        if (!i.b(localn))
          break;
        ((List)localObject1).add(localn);
        ab.i("MicroMsg.SnsCdnDownloadBase", "merge bitmap from " + localn + " " + ((bau)localObject2).Id);
      }
      label502: this.qNZ = n.w(i.p((List)localObject1, af.cnN()));
      ab.i("MicroMsg.SnsCdnDownloadBase", "merge bitmap " + this.qOa.qFJ.nQB + " " + this.qNZ);
      af.cnC().a(this.qOa.qFJ.nQB, this.qNZ, this.qOa.qFJ.qFQ);
      break label132;
      label594: if (this.qOa.qFJ.qFQ == 1)
        localObject1 = "1-" + this.qOa.qFJ.nQB;
      else if (this.qOa.qFJ.qFQ == 4)
        localObject1 = "4-" + this.qOa.qFJ.nQB;
      else if (this.qOa.qFJ.qFQ == 5)
        localObject1 = "5-" + this.qOa.qFJ.nQB;
      else if (this.qOa.qFJ.qFQ == 3)
        localObject1 = i.bc(3, this.qOa.qFJ.nQB);
    }
  }

  public void onPostExecute(Integer paramInteger)
  {
    super.onPostExecute(paramInteger);
  }

  public static abstract interface a
  {
    public abstract void a(int paramInt1, bau parambau, int paramInt2, boolean paramBoolean1, String paramString, int paramInt3, int paramInt4, boolean paramBoolean2);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.model.a.c
 * JD-Core Version:    0.6.2
 */