package com.tencent.mm.plugin.sns.model;

import android.os.Build.VERSION;
import android.os.Looper;
import android.os.MessageQueue;
import android.util.SparseArray;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.memory.n;
import com.tencent.mm.model.ao.a;
import com.tencent.mm.model.ao.e;
import com.tencent.mm.modelvideo.o;
import com.tencent.mm.platformtools.ae;
import com.tencent.mm.plugin.sns.model.a.c.a;
import com.tencent.mm.protocal.protobuf.bau;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.an;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.az;
import com.tencent.mm.storage.z;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public final class b
  implements com.tencent.mm.ai.f, c.a
{
  static int qHB = 0;
  private static final int qHC;
  public final byte[] eHH;
  LinkedList<com.tencent.mm.plugin.sns.data.f> eow;
  Set<b.b> epg;
  private ak handler;
  private long qHD;
  private int qHE;
  private int qHF;
  private LinkedList<com.tencent.mm.plugin.sns.data.g> qHG;
  public HashMap<String, Long> qHH;
  HashMap<String, String> qHI;
  public boolean qHJ;
  public Set<b.a> qHK;
  private Map<String, Long> qHL;
  Map<String, com.tencent.mm.plugin.sns.data.c> qHM;
  public ConcurrentHashMap<String, b.c> qHN;
  public CopyOnWriteArrayList<String> qHO;

  static
  {
    if (Build.VERSION.SDK_INT >= 14);
    for (int i = 100; ; i = 25)
    {
      qHC = i;
      return;
    }
  }

  public b()
  {
    AppMethodBeat.i(36107);
    this.handler = null;
    this.qHD = 0L;
    this.qHE = 0;
    this.qHF = 2;
    this.qHG = new LinkedList();
    this.qHH = new HashMap();
    this.eHH = new byte[0];
    this.qHI = new HashMap();
    this.qHJ = true;
    this.epg = new HashSet();
    this.qHK = new HashSet();
    this.eow = new LinkedList();
    this.qHL = new ConcurrentHashMap();
    this.qHM = new HashMap();
    this.qHN = new ConcurrentHashMap();
    this.qHO = new CopyOnWriteArrayList();
    this.handler = af.bCo();
    cmH();
    AppMethodBeat.o(36107);
  }

  private boolean Iv()
  {
    AppMethodBeat.i(36118);
    boolean bool;
    if (bo.fp(this.qHD) * 1000L > 300000L)
    {
      bool = true;
      AppMethodBeat.o(36118);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(36118);
    }
  }

  public static void XC(String paramString)
  {
    AppMethodBeat.i(36115);
    o.alm().m(paramString, null);
    AppMethodBeat.o(36115);
  }

  private static boolean XF(String paramString)
  {
    AppMethodBeat.i(36122);
    boolean bool;
    if ((paramString == null) || (paramString.equals("")))
    {
      ab.d("MicroMsg.DownloadManager", "url  ".concat(String.valueOf(paramString)));
      bool = false;
      AppMethodBeat.o(36122);
    }
    while (true)
    {
      return bool;
      bool = true;
      AppMethodBeat.o(36122);
    }
  }

  private boolean a(bau parambau, int paramInt, com.tencent.mm.plugin.sns.data.e parame, az paramaz, String paramString1, String paramString2)
  {
    AppMethodBeat.i(36112);
    boolean bool;
    if (!com.tencent.mm.plugin.sns.data.i.Xn(af.getAccPath()))
    {
      ab.i("MicroMsg.DownloadManager", "isHasSdcard is false accpath %s sdcard: %s", new Object[] { af.getAccPath(), com.tencent.mm.compatible.util.e.eSl });
      bool = false;
      AppMethodBeat.o(36112);
    }
    while (true)
    {
      return bool;
      if ((!parambau.Id.startsWith("Locall_path")) && (!parambau.Id.startsWith("pre_temp_sns_pic")))
        break;
      ab.d("MicroMsg.DownloadManager", "is a local img not need download");
      bool = false;
      AppMethodBeat.o(36112);
    }
    String str = com.tencent.mm.plugin.sns.data.i.bd(paramInt, parambau.Id);
    while (true)
    {
      synchronized (this.eHH)
      {
        if (!this.qHM.containsKey(str))
        {
          ab.i("MicroMsg.DownloadManager", "add list %s", new Object[] { parambau.Id });
          Object localObject = this.qHM;
          com.tencent.mm.plugin.sns.data.c localc = new com/tencent/mm/plugin/sns/data/c;
          localc.<init>(parame, paramInt);
          ((Map)localObject).put(str, localc);
          localObject = this.eow;
          parame = new com/tencent/mm/plugin/sns/data/f;
          parame.<init>(parambau, paramInt, str, paramaz, paramString1, paramString2);
          ((LinkedList)localObject).add(parame);
          continue;
          ab.d("MicroMsg.DownloadManager", "tryStartNetscene size %s Tsize : %s", new Object[] { Integer.valueOf(af.cnE().cni()), Integer.valueOf(this.qHL.size()) });
          ab.v("MicroMsg.DownloadManager", "lockwaitdownload. %s * %s memeryFiles.size() ", new Object[] { Integer.valueOf(this.qHM.size()), Integer.valueOf(this.qHM.size()), Integer.valueOf(this.qHG.size()) });
          if (Looper.myLooper() == null)
            break label459;
          Looper.myQueue().addIdleHandler(new b.d(this));
          cmJ();
          cmK();
          if (this.eow.size() > 0)
            agK();
          bool = true;
          AppMethodBeat.o(36112);
          break;
        }
        parame = this.eow.iterator();
        if (!parame.hasNext())
          continue;
        paramaz = (com.tencent.mm.plugin.sns.data.f)parame.next();
        if ((paramaz.cNr == null) || (!paramaz.cNr.Id.equals(parambau.Id)) || (paramaz.requestType != paramInt))
          continue;
        if (this.eow.remove(paramaz))
          this.eow.addLast(paramaz);
        ab.v("MicroMsg.DownloadManager", "update the donwload list ");
      }
      label459: ab.w("MicroMsg.DownloadManager", "Looper.myLooper() == null");
    }
  }

  private void cmH()
  {
    AppMethodBeat.i(36108);
    synchronized (this.eHH)
    {
      this.eow.clear();
      this.qHM.clear();
      this.qHL.clear();
      this.qHG.clear();
      this.qHH.clear();
      AppMethodBeat.o(36108);
      return;
    }
  }

  private boolean cmI()
  {
    boolean bool = false;
    AppMethodBeat.i(36109);
    synchronized (this.eHH)
    {
      if ((this.qHG != null) && (this.qHG.size() > 0))
      {
        com.tencent.mm.plugin.sns.data.g localg = (com.tencent.mm.plugin.sns.data.g)this.qHG.remove();
        as localas = new com/tencent/mm/plugin/sns/model/as;
        localas.<init>();
        localas.u(new com.tencent.mm.plugin.sns.data.g[] { localg });
        AppMethodBeat.o(36109);
        bool = true;
        return bool;
      }
      AppMethodBeat.o(36109);
    }
  }

  public final boolean XD(String paramString)
  {
    boolean bool = true;
    AppMethodBeat.i(36119);
    synchronized (this.eHH)
    {
      if (this.qHL.containsKey(com.tencent.mm.plugin.sns.data.i.bd(1, paramString)))
        AppMethodBeat.o(36119);
      while (true)
      {
        return bool;
        if (!this.qHL.containsKey(com.tencent.mm.plugin.sns.data.i.bd(5, paramString)))
          break;
        AppMethodBeat.o(36119);
      }
      bool = false;
      AppMethodBeat.o(36119);
    }
  }

  public final boolean XE(String paramString)
  {
    AppMethodBeat.i(36120);
    synchronized (this.eHH)
    {
      if ((this.qHL.containsKey(com.tencent.mm.plugin.sns.data.i.bd(2, paramString))) || (this.qHL.containsKey(com.tencent.mm.plugin.sns.data.i.bd(8, paramString))))
      {
        bool = true;
        AppMethodBeat.o(36120);
        return bool;
      }
      boolean bool = false;
      AppMethodBeat.o(36120);
    }
  }

  public final void XG(String paramString)
  {
    AppMethodBeat.i(36125);
    af.bCo().post(new b.5(this, paramString));
    AppMethodBeat.o(36125);
  }

  public final b.c XH(String paramString)
  {
    AppMethodBeat.i(36128);
    if (!bo.isNullOrNil(paramString))
    {
      paramString = (b.c)this.qHN.remove(paramString);
      if (paramString != null)
        paramString.cmL();
      AppMethodBeat.o(36128);
    }
    while (true)
    {
      return paramString;
      paramString = null;
      AppMethodBeat.o(36128);
    }
  }

  public final void XI(String paramString)
  {
    AppMethodBeat.i(36129);
    this.qHO.add(paramString);
    AppMethodBeat.o(36129);
  }

  public final void a(int paramInt1, bau parambau, int paramInt2, boolean paramBoolean1, String paramString, int paramInt3, int paramInt4, boolean paramBoolean2)
  {
    AppMethodBeat.i(36124);
    if (parambau == null)
    {
      ??? = Integer.valueOf(-1);
      ab.i("MicroMsg.DownloadManager", "state:%d, mediaId:%s, reqDownloadType:%d, isThumb:%b,requestKey:%s, totalSize:%d", new Object[] { Integer.valueOf(paramInt1), ???, Integer.valueOf(paramInt2), Boolean.valueOf(paramBoolean1), paramString, Integer.valueOf(paramInt3) });
      if (!af.cnn())
      {
        com.tencent.mm.kernel.g.RQ();
        if (com.tencent.mm.kernel.g.RN().QY())
          break label108;
      }
      cmH();
      AppMethodBeat.o(36124);
    }
    while (true)
    {
      return;
      ??? = parambau.Id;
      break;
      label108: if (paramInt1 != 2)
        this.qHE += paramInt3;
      while (true)
      {
        Object localObject2;
        synchronized (this.eHH)
        {
          if ((this.qHE > 512000) && (this.eow.size() == 0))
          {
            ab.d("MicroMsg.DownloadManager", "netSizeAdd %s", new Object[] { Integer.valueOf(this.qHE) });
            ao.a.flv.cm(this.qHE, 0);
            this.qHE = 0;
          }
          if (9 == paramInt2)
          {
            if (((paramInt1 == 1) || (paramInt1 == 3)) && (paramBoolean2))
              this.qHH.put(paramString, Long.valueOf(System.currentTimeMillis()));
            if ((paramInt1 != 3) && (paramInt1 == 1) && (paramInt2 != 3) && (parambau != null))
            {
              ??? = af.cnC();
              ab.d("MicroMsg.LazyerImageLoader2", "updateCache " + parambau.Id);
              localObject2 = com.tencent.mm.plugin.sns.data.i.bc(1, parambau.Id);
              localObject2 = (n)((g)???).qHV.get((String)localObject2);
              if (com.tencent.mm.plugin.sns.data.i.b((n)localObject2))
              {
                ((n)localObject2).Xj();
                ab.d("MicroMsg.LazyerImageLoader2", "force update");
                af.cns().execute(new g.2((g)???, parambau));
              }
            }
            ??? = this.epg.iterator();
            if (!((Iterator)???).hasNext())
              break;
            localObject2 = (b.b)((Iterator)???).next();
            if (localObject2 == null)
              continue;
            if ((paramInt1 == 2) || (parambau == null))
              break label540;
            if (paramInt2 == 3)
            {
              ((b.b)localObject2).cmu();
              continue;
            }
          }
          else
          {
            if ((paramInt1 != 1) && (paramInt1 != 3))
              continue;
            this.qHH.put(paramString, Long.valueOf(System.currentTimeMillis()));
          }
        }
        if ((paramInt2 == 1) || (paramInt2 == 9) || (paramInt2 == 5) || (paramInt2 == 7))
        {
          ((b.b)localObject2).Xw(parambau.Id);
        }
        else if ((paramInt2 == 2) || (paramInt2 == 8))
        {
          ((b.b)localObject2).bj(parambau.Id, true);
        }
        else if ((paramInt2 == 4) || (paramInt2 == 6))
        {
          ((b.b)localObject2).bk(parambau.Id, true);
          continue;
          label540: if (((paramInt2 == 2) || (paramInt2 == 8)) && (parambau != null))
            ((b.b)localObject2).bj(parambau.Id, false);
          else if (((paramInt2 == 4) || (paramInt2 == 6)) && (parambau != null))
            ((b.b)localObject2).bk(parambau.Id, false);
        }
      }
      synchronized (this.eHH)
      {
        ab.d("MicroMsg.DownloadManager", "onDownLoadFinish by cdn %s, batchDownloaded %s.", new Object[] { paramString, Boolean.valueOf(paramBoolean2) });
        if (paramBoolean2)
          this.qHL.remove(paramString);
        agK();
        p(paramString, paramInt4, paramBoolean2);
        paramString = this.eHH;
        if (parambau == null);
      }
      try
      {
        parambau = XH(parambau.Id);
        if ((parambau != null) && (parambau.eTM) && (parambau.eTM))
        {
          long l = bo.gb(parambau.startTime);
          ab.d("MicroMsg.DownloadManager", "single download, feed id: %s, startTime: %d, cost: %d, this: %s.", new Object[] { parambau.cFc, Long.valueOf(parambau.startTime), Long.valueOf(l), parambau });
          com.tencent.mm.plugin.report.service.h.pYm.k(1040L, 0L, l);
          com.tencent.mm.plugin.report.service.h.pYm.k(1040L, 1L, 1L);
        }
        AppMethodBeat.o(36124);
        continue;
        parambau = finally;
        throw parambau;
      }
      finally
      {
        AppMethodBeat.o(36124);
      }
    }
  }

  public final void a(b.b paramb)
  {
    AppMethodBeat.i(36110);
    this.handler.post(new b.1(this, paramb));
    AppMethodBeat.o(36110);
  }

  public final void a(String paramString, b.c paramc)
  {
    AppMethodBeat.i(36127);
    if ((!bo.isNullOrNil(paramString)) && (paramc != null))
    {
      b.c localc = (b.c)this.qHN.get(paramString);
      if ((localc == null) || (!localc.cFc.equals(paramc.cFc)))
        this.qHN.put(paramString, paramc);
    }
    AppMethodBeat.o(36127);
  }

  public final boolean a(bau parambau, int paramInt, com.tencent.mm.plugin.sns.data.e parame, az paramaz)
  {
    AppMethodBeat.i(36113);
    boolean bool;
    if (parambau == null)
    {
      ab.e("MicroMsg.DownloadManager", "unknow case media is null " + bo.dpG().toString());
      bool = false;
      AppMethodBeat.o(36113);
    }
    while (true)
    {
      return bool;
      synchronized (this.eHH)
      {
        av.Yi(parambau.Id);
        a(parambau, paramInt, parame, paramaz, null, null);
        bool = true;
        AppMethodBeat.o(36113);
      }
    }
  }

  public final boolean a(bau parambau, com.tencent.mm.plugin.sns.data.e parame, az paramaz, String paramString1, String paramString2)
  {
    AppMethodBeat.i(36114);
    boolean bool;
    if (parambau == null)
    {
      ab.e("MicroMsg.DownloadManager", "unknow case media is null " + bo.dpG().toString());
      bool = false;
      AppMethodBeat.o(36114);
    }
    while (true)
    {
      return bool;
      synchronized (this.eHH)
      {
        av.Yi(parambau.Id);
        a(parambau, 8, parame, paramaz, paramString1, paramString2);
        bool = true;
        AppMethodBeat.o(36114);
      }
    }
  }

  public final void aa(int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(36106);
    this.qHF = paramInt;
    label480: label483: 
    while (true)
    {
      try
      {
        String str;
        int i;
        if (at.isWifi(ah.getContext()))
        {
          str = com.tencent.mm.m.g.Nu().getValue("SnsImgDownloadConcurrentCountForWifi");
          if ((!bo.isNullOrNil(str)) || (!com.tencent.mm.sdk.a.b.dnO()))
            break label483;
          str = "00:00-18:30-1-3;19:30-23:00-1-2;23:00-23:59-1-3;18:30-19:30-3-5;";
          if (bo.isNullOrNil(str))
            continue;
          Object localObject1 = new java/text/SimpleDateFormat;
          ((SimpleDateFormat)localObject1).<init>("HH:mm");
          localObject2 = new java/util/Date;
          ((Date)localObject2).<init>();
          localObject2 = ((SimpleDateFormat)localObject1).format((Date)localObject2).split(":");
          paramInt = bo.ank(localObject2[0]);
          paramInt = bo.ank(localObject2[1]) + paramInt * 60 - ((int)com.tencent.mm.plugin.sns.data.i.afB() - 8) * 60;
          if (paramInt < 0)
          {
            paramInt += 1440;
            localObject1 = str.split(";");
            i = 0;
            if (i >= localObject1.length)
              continue;
            if (!bo.isNullOrNil(localObject1[i]))
            {
              localObject2 = localObject1[i].split("-");
              if ((localObject2 != null) && (localObject2.length >= 4))
                continue;
              ab.e("MicroMsg.DownloadManager", "setMaxThread Err i%d :%s", new Object[] { Integer.valueOf(i), str });
            }
            i++;
            continue;
          }
        }
        else
        {
          str = com.tencent.mm.m.g.Nu().getValue("SnsImgDownloadConcurrentCountForNotWifi");
          continue;
        }
        if (paramInt < 1440)
          break label480;
        paramInt -= 1440;
        continue;
        String[] arrayOfString = localObject2[0].split(":");
        int j = bo.ank(arrayOfString[0]);
        j = bo.ank(arrayOfString[1]) + j * 60;
        arrayOfString = localObject2[1].split(":");
        int k = bo.ank(arrayOfString[0]);
        k = bo.ank(arrayOfString[1]) + k * 60;
        ab.i("MicroMsg.DownloadManager", "setMaxThread i:%d [%d,%d] now:%d threadcnt:[%s,%s]", new Object[] { Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k), Integer.valueOf(paramInt), localObject2[2], localObject2[3] });
        if ((paramInt > k) || (paramInt <= j))
          continue;
        if (paramBoolean)
        {
          localObject2 = localObject2[2];
          j = bo.ank((String)localObject2);
          if (j <= 0)
            continue;
          this.qHF = j;
          continue;
        }
      }
      catch (Exception localException)
      {
        ab.e("MicroMsg.DownloadManager", "setMaxThread :%s", new Object[] { bo.l(localException) });
        ab.i("MicroMsg.DownloadManager", "setMaxThread Res:%d ", new Object[] { Integer.valueOf(this.qHF) });
        AppMethodBeat.o(36106);
        return;
      }
      Object localObject2 = localObject2[3];
      continue;
    }
  }

  public final void agK()
  {
    AppMethodBeat.i(36123);
    if (!this.qHJ)
      AppMethodBeat.o(36123);
    while (true)
    {
      return;
      if (af.cnn())
      {
        cmH();
        AppMethodBeat.o(36123);
      }
      else
      {
        if (com.tencent.mm.plugin.sns.data.i.Xn(af.getAccPath()))
          break;
        AppMethodBeat.o(36123);
      }
    }
    int i = this.qHF;
    if (ae.gie > 0)
      i = ae.gie;
    label1065: label1577: 
    while (true)
    {
      com.tencent.mm.plugin.sns.data.f localf;
      bau localbau;
      String str1;
      String str2;
      String str3;
      Object localObject1;
      SparseArray localSparseArray1;
      com.tencent.mm.plugin.sns.data.e locale;
      SparseArray localSparseArray2;
      int j;
      Object localObject5;
      boolean bool2;
      synchronized (this.eHH)
      {
        Object localObject2;
        if ((this.eow.size() > 0) && (af.cnE().cni() + this.qHL.size() <= i))
        {
          ab.i("MicroMsg.DownloadManager", "tryStartNetscene size %s Tsize : %s listsize %s max_thread_downloading: %s", new Object[] { Integer.valueOf(af.cnE().cni()), Integer.valueOf(this.qHL.size()), Integer.valueOf(this.eow.size()), Integer.valueOf(this.qHF) });
          localf = (com.tencent.mm.plugin.sns.data.f)this.eow.removeLast();
          if (localf == null)
          {
            AppMethodBeat.o(36123);
            break;
          }
          localbau = localf.cNr;
          i = localf.requestType;
          str1 = localf.key;
          str2 = localf.qFR;
          str3 = localf.qFS;
          localObject1 = localf.cFc;
          localSparseArray1 = localf.qFU;
          if ((!this.qHM.containsKey(str1)) || (this.qHM.get(str1) == null))
          {
            this.qHM.remove(str1);
            AppMethodBeat.o(36123);
            break;
          }
          locale = ((com.tencent.mm.plugin.sns.data.c)this.qHM.get(str1)).qFJ;
          localSparseArray2 = ((com.tencent.mm.plugin.sns.data.c)this.qHM.get(str1)).qFK;
          j = i;
          if (i == 1)
          {
            j = i;
            if (localbau.qFG)
              j = 8;
          }
          if ((j == 1) || (j == 5) || (j == 7))
          {
            boolean bool1 = true;
            localObject2 = localbau.wEH;
            localObject5 = localObject2;
            if (j == 7)
            {
              localObject5 = localObject2;
              if (!bo.isNullOrNil(localbau.wER))
                localObject5 = localbau.wER;
            }
            int k = localbau.wEI;
            i = k;
            localObject2 = localObject5;
            bool2 = bool1;
            if (bo.isNullOrNil((String)localObject5))
            {
              i = k;
              localObject2 = localObject5;
              bool2 = bool1;
              if (localbau.jCt == 2)
              {
                localObject2 = localbau.Url;
                i = localbau.wEG;
                bool2 = bool1;
              }
            }
            if (XF((String)localObject2))
              continue;
            this.qHM.remove(str1);
            AppMethodBeat.o(36123);
            break;
          }
          if (j == 6)
          {
            bool2 = false;
            localObject2 = localbau.wEO;
            i = localbau.wEG;
            continue;
          }
          if (j == 9)
          {
            localObject5 = (bau)localSparseArray1.valueAt(0);
            bool2 = true;
            localObject2 = ((bau)localObject5).wEH;
            i = ((bau)localObject5).wEI;
            if ((!bo.isNullOrNil((String)localObject2)) || (((bau)localObject5).jCt != 2))
              break label1577;
            localObject2 = ((bau)localObject5).Url;
            i = ((bau)localObject5).wEG;
            continue;
          }
          bool2 = false;
          localObject2 = localbau.Url;
          i = localbau.wEG;
          continue;
          if (i != 2)
            continue;
          if (!af.cnE().isDownloading(str1))
          {
            localObject5 = new java/lang/StringBuilder;
            ((StringBuilder)localObject5).<init>("to downLoad scene ");
            ab.d("MicroMsg.DownloadManager", localbau.Id + "  " + (String)localObject2);
            com.tencent.mm.kernel.g.RQ();
            localObject5 = com.tencent.mm.kernel.g.RO().eJo;
            localObject1 = new com/tencent/mm/plugin/sns/model/p;
            ((p)localObject1).<init>(localbau, localbau.Id, (String)localObject2, localbau.jCt, bool2, j, str1);
            ((com.tencent.mm.ai.p)localObject5).a((m)localObject1, 0);
            af.cnE().XU(str1);
          }
        }
        AppMethodBeat.o(36123);
        break;
        if ((i != 1) && (i != 0))
          break label1562;
        if (i == 0)
        {
          localObject5 = new java/lang/StringBuilder;
          ((StringBuilder)localObject5).<init>("others http: urlType");
          ab.e("MicroMsg.DownloadManager", i + " -- url : " + (String)localObject2 + " isThumb :" + bool2);
        }
        if (this.qHL.containsKey(str1))
          continue;
        if (j == 9)
        {
          ab.i("MicroMsg.DownloadManager", "batch download, snsId: %s.", new Object[] { localObject1 });
          if (((localbau == null) && ((localSparseArray1 == null) || (localSparseArray1.size() <= 0))) || (j == 6) || (j == 8) || (!this.qHH.containsKey(str1)))
            break label1075;
          long l = ((Long)this.qHH.get(str1)).longValue();
          if (System.currentTimeMillis() - l >= 300000L)
            break label1075;
          this.qHM.remove(str1);
          localObject5 = new java/lang/StringBuilder;
          ((StringBuilder)localObject5).<init>("no need download. lastTime: ");
          localObject5 = ((StringBuilder)localObject5).append(l).append(" url: ").append((String)localObject2).append(" id: ");
          if (localbau != null)
            break label1065;
          localObject2 = localObject1;
          ab.i("MicroMsg.DownloadManager", (String)localObject2);
          AppMethodBeat.o(36123);
          break;
        }
        localObject5 = new java/lang/StringBuilder;
        ((StringBuilder)localObject5).<init>("to downLoad cdn ");
        ab.i("MicroMsg.DownloadManager", localbau.Id + "  " + (String)localObject2);
      }
      Object localObject4 = localbau.Id;
      continue;
      label1075: this.qHL.put(str1, Long.valueOf(bo.anT()));
      if ((j == 2) || (j == 8))
      {
        com.tencent.mm.kernel.g.RQ();
        i = bo.a((Integer)com.tencent.mm.kernel.g.RP().Ry().get(68391, null), 0);
        com.tencent.mm.kernel.g.RQ();
        com.tencent.mm.kernel.g.RP().Ry().set(68391, Integer.valueOf(i + 1));
      }
      if (j == 9)
      {
        localObject5 = new com/tencent/mm/plugin/sns/model/a/a;
        ((com.tencent.mm.plugin.sns.model.a.a)localObject5).<init>((String)localObject1, localSparseArray1, localSparseArray2);
        ((com.tencent.mm.plugin.sns.model.a.a)localObject5).qNW = localf.qFT;
        if (j != 4)
          break label1335;
        ((com.tencent.mm.plugin.sns.model.a.a)localObject5).qNU = true;
        label1197: ((com.tencent.mm.plugin.sns.model.a.a)localObject5).qNT = bool2;
        ((com.tencent.mm.plugin.sns.model.a.a)localObject5).qNV = j;
        ((com.tencent.mm.plugin.sns.model.a.a)localObject5).qJg = str1;
        ((com.tencent.mm.plugin.sns.model.a.a)localObject5).url = ((String)localObject4);
        ((com.tencent.mm.plugin.sns.model.a.a)localObject5).gf(str2, str3);
        localObject4 = null;
        if ((j != 1) && (j != 5) && (j != 7) && (j != 9))
          break label1344;
        ab.d("MicroMsg.DownloadManager", "SnsDownloadThumb task create.");
        localObject4 = new com/tencent/mm/plugin/sns/model/a/i;
        ((com.tencent.mm.plugin.sns.model.a.i)localObject4).<init>(this, (com.tencent.mm.plugin.sns.model.a.a)localObject5);
      }
      label1335: label1465: label1471: 
      while (true)
      {
        ((com.tencent.mm.plugin.sns.model.a.c)localObject4).u(new String[] { "" });
        break;
        localObject5 = new com/tencent/mm/plugin/sns/model/a/a;
        ((com.tencent.mm.plugin.sns.model.a.a)localObject5).<init>(localbau.Id);
        ((com.tencent.mm.plugin.sns.model.a.a)localObject5).qJh = localbau;
        ((com.tencent.mm.plugin.sns.model.a.a)localObject5).qFJ = locale;
        break label1176;
        ((com.tencent.mm.plugin.sns.model.a.a)localObject5).qNU = false;
        break label1197;
        label1344: if (j == 4)
        {
          ab.w("MicroMsg.DownloadManager", "it can not download sight, may be something warn here.");
          localObject4 = com.tencent.mm.model.c.c.abi().ll("100438");
          bool2 = false;
          if (((com.tencent.mm.storage.c)localObject4).isValid())
            if (bo.getInt((String)((com.tencent.mm.storage.c)localObject4).dru().get("CDNDownload"), 0) == 0)
              break label1465;
          for (bool2 = true; ; bool2 = false)
          {
            ab.i("MicroMsg.DownloadManager", "is Ad %s, downloadByCDN %s", new Object[] { Boolean.valueOf(localbau.qFG), Boolean.valueOf(bool2) });
            if ((localbau.qFG) && (!bool2))
              break label1471;
            localObject4 = new com.tencent.mm.plugin.sns.model.a.g(this, (com.tencent.mm.plugin.sns.model.a.a)localObject5);
            break;
          }
          localObject4 = new com.tencent.mm.plugin.sns.model.a.h(this, (com.tencent.mm.plugin.sns.model.a.a)localObject5);
        }
        else if ((j == 2) || (j == 8) || (j == 3))
        {
          localObject4 = new com.tencent.mm.plugin.sns.model.a.e(this, (com.tencent.mm.plugin.sns.model.a.a)localObject5);
        }
        else if (j == 6)
        {
          ((com.tencent.mm.plugin.sns.model.a.a)localObject5).url = localbau.wEO;
          ((com.tencent.mm.plugin.sns.model.a.a)localObject5).cvZ = localbau.wEQ;
          localObject4 = new com.tencent.mm.plugin.sns.model.a.d(this, (com.tencent.mm.plugin.sns.model.a.a)localObject5);
        }
      }
      this.qHM.remove(str1);
    }
  }

  public final void b(b.b paramb)
  {
    AppMethodBeat.i(36111);
    this.handler.post(new b.2(this, paramb));
    AppMethodBeat.o(36111);
  }

  final void cmJ()
  {
    AppMethodBeat.i(36116);
    if (Iv())
      this.handler.postDelayed(new b.4(this), 500L);
    AppMethodBeat.o(36116);
  }

  final void cmK()
  {
    AppMethodBeat.i(36117);
    Object localObject1 = new LinkedList();
    synchronized (this.eHH)
    {
      Iterator localIterator = this.qHL.entrySet().iterator();
      if (localIterator.hasNext())
        ((List)localObject1).add(((Map.Entry)localIterator.next()).getKey());
    }
    localObject1 = ((List)localObject1).iterator();
    while (((Iterator)localObject1).hasNext())
    {
      String str = (String)((Iterator)localObject1).next();
      if ((this.qHL.containsKey(str)) && (bo.fp(((Long)this.qHL.get(str)).longValue()) * 1000L > 300000L))
      {
        ab.d("MicroMsg.DownloadManager", "too long to download");
        this.qHL.remove(str);
        this.qHM.remove(str);
      }
    }
    AppMethodBeat.o(36117);
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(36126);
    ab.i("MicroMsg.DownloadManager", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString + " type = " + paramm.getType() + " @" + hashCode());
    if (paramm.getType() != 208)
      AppMethodBeat.o(36126);
    while (true)
    {
      return;
      paramString = (p)paramm;
      Iterator localIterator;
      if ((paramInt1 != 0) || (paramInt2 != 0))
      {
        if ((paramString.qJe == 2) || (paramString.qJe == 8))
        {
          localIterator = this.epg.iterator();
          while (localIterator.hasNext())
          {
            paramm = (b.b)localIterator.next();
            if (paramm != null)
              paramm.bj(paramString.cHr, false);
          }
        }
        AppMethodBeat.o(36126);
      }
      else
      {
        if (paramm.getType() == 208)
        {
          localIterator = this.epg.iterator();
          while (localIterator.hasNext())
          {
            paramm = (b.b)localIterator.next();
            if (paramm != null)
              if (paramString.qJe == 3)
                paramm.cmu();
              else if ((paramString.qJe == 1) || (paramString.qJe == 5) || (paramString.qJe == 7))
                paramm.Xw(paramString.cHr);
              else if ((paramString.qJe == 2) || (paramString.qJe == 8))
                paramm.bj(paramString.cHr, true);
          }
        }
        AppMethodBeat.o(36126);
      }
    }
  }

  public final void p(String paramString, int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(36121);
    synchronized (this.eHH)
    {
      ab.d("MicroMsg.DownloadManager", "unLockDownLoad the thread id is %s %s %s.", new Object[] { Long.valueOf(Thread.currentThread().getId()), paramString, Boolean.valueOf(paramBoolean) });
      Object localObject = (com.tencent.mm.plugin.sns.data.c)this.qHM.get(paramString);
      if (localObject != null)
      {
        if (9 != ((com.tencent.mm.plugin.sns.data.c)localObject).requestType)
          break label134;
        localObject = (com.tencent.mm.plugin.sns.data.e)((com.tencent.mm.plugin.sns.data.c)localObject).qFK.get(paramInt);
        if (localObject != null)
          af.cnC().a((com.tencent.mm.plugin.sns.data.e)localObject, paramString);
      }
      label134: 
      do
      {
        if (paramBoolean)
          this.qHM.remove(paramString);
        AppMethodBeat.o(36121);
        return;
        localObject = ((com.tencent.mm.plugin.sns.data.c)localObject).qFJ;
      }
      while (localObject == null);
      af.cnC().a((com.tencent.mm.plugin.sns.data.e)localObject, paramString);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.model.b
 * JD-Core Version:    0.6.2
 */