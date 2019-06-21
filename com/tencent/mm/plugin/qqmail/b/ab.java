package com.tencent.mm.plugin.qqmail.b;

import android.util.Base64;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.b;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.vfs.e;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

public final class ab
  implements f
{
  String cEV;
  String ptN;
  String[] pur;
  String[] pus;
  private String[] put;
  ab.e pvc;
  String pve;
  Map<String, String> pvf;
  private Map<String, String> pvg;
  private Map<String, String> pvh;
  private ab.b pvi;
  public z pvj;
  Map<String, String> pvk;
  ab.f pvl;
  private HashMap<Long, Integer> pvm;
  private HashMap<Long, String> pvn;
  private HashMap<String, Integer> pvo;
  private int pvp;
  ArrayList<g> pvq;
  String pvr;
  String pvs;
  HashMap<String, String> pvt;
  ab.c pvu;
  ab.d pvv;
  int pvw;
  com.tencent.mm.ai.g pvx;

  public ab()
  {
    AppMethodBeat.i(68045);
    this.pvf = new HashMap();
    this.pvg = new LinkedHashMap();
    this.pvh = new LinkedHashMap();
    this.pvk = new HashMap();
    this.pvl = null;
    this.pvc = null;
    this.pvm = new HashMap();
    this.pvn = new HashMap();
    this.pvo = new HashMap();
    this.pvp = 0;
    this.pvq = new ArrayList();
    this.pvr = null;
    this.pvs = null;
    this.pvt = new HashMap();
    this.pvw = 0;
    this.pvx = new ab.7(this);
    com.tencent.mm.kernel.g.RO().eJo.a(483, this);
    com.tencent.mm.kernel.g.RO().eJo.a(484, this);
    com.tencent.mm.kernel.g.RO().eJo.a(485, this);
    AppMethodBeat.o(68045);
  }

  private void O(ArrayList<Long> paramArrayList)
  {
    AppMethodBeat.i(68054);
    if (this.pvm != null)
    {
      this.pvm.clear();
      this.pvm = null;
    }
    this.pvm = new HashMap();
    paramArrayList = paramArrayList.iterator();
    while (paramArrayList.hasNext())
    {
      long l = ((Long)paramArrayList.next()).longValue();
      this.pvm.put(Long.valueOf(l), Integer.valueOf(1));
    }
    AppMethodBeat.o(68054);
  }

  private void a(r paramr)
  {
    AppMethodBeat.i(68057);
    this.pvp += 1;
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.ShareModeMailAppService", "processCheckImgStatusSceneEnd, checkTimes: %d", new Object[] { Integer.valueOf(this.pvp) });
    paramr = paramr.ccu().iterator();
    while (paramr.hasNext())
    {
      g localg = (g)paramr.next();
      long l = localg.ptD;
      int i = localg.jBT;
      if (this.pvm.containsKey(Long.valueOf(l)))
      {
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.ShareModeMailAppService", "msgSvrId: %d, status: %d", new Object[] { Long.valueOf(l), Integer.valueOf(i) });
        if (i == 0)
        {
          this.pvm.remove(Long.valueOf(l));
          if (localg.ptE != null)
          {
            com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.ShareModeMailAppService", "msgSvrId: %d, attachId: %s", new Object[] { Long.valueOf(l), localg.ptE });
            this.pvn.put(Long.valueOf(l), localg.ptE);
            this.pvo.put(localg.ptE, Integer.valueOf(localg.FileSize));
          }
        }
        else
        {
          this.pvm.put(Long.valueOf(l), Integer.valueOf(i));
        }
      }
    }
    if (this.pvm.isEmpty())
    {
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.ShareModeMailAppService", "all image is in server");
      if (this.pvi != null)
        this.pvi.a(new ArrayList(), this.pvn);
      AppMethodBeat.o(68057);
    }
    while (true)
    {
      return;
      if (this.pvp < 3)
      {
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.ShareModeMailAppService", "checkTime small than limit, doScene again");
        paramr = new r(m(this.pvm));
        com.tencent.mm.kernel.g.RO().eJo.a(paramr, 0);
        AppMethodBeat.o(68057);
      }
      else
      {
        this.pvi.a(m(this.pvm), this.pvn);
        AppMethodBeat.o(68057);
      }
    }
  }

  private void a(ArrayList<Long> paramArrayList, ab.b paramb)
  {
    AppMethodBeat.i(68055);
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.ShareModeMailAppService", "checkImgStatus");
    this.pvp = 0;
    O(paramArrayList);
    if (this.pvn != null)
    {
      this.pvn.clear();
      this.pvn = null;
    }
    this.pvn = new HashMap();
    this.pvi = paramb;
    paramArrayList = new r(paramArrayList);
    com.tencent.mm.kernel.g.RO().eJo.a(paramArrayList, 0);
    AppMethodBeat.o(68055);
  }

  private static ArrayList<Long> m(HashMap<Long, Integer> paramHashMap)
  {
    AppMethodBeat.i(68056);
    ArrayList localArrayList = new ArrayList();
    paramHashMap = paramHashMap.keySet().iterator();
    while (paramHashMap.hasNext())
      localArrayList.add((Long)paramHashMap.next());
    AppMethodBeat.o(68056);
    return localArrayList;
  }

  public final void Br(int paramInt)
  {
    AppMethodBeat.i(68049);
    if (this.pvl != null)
      al.d(new ab.1(this, paramInt));
    AppMethodBeat.o(68049);
  }

  public final void X(Map<String, String> paramMap)
  {
    AppMethodBeat.i(68046);
    this.pvf = new HashMap();
    this.pvf.putAll(paramMap);
    AppMethodBeat.o(68046);
  }

  public final void Y(Map<String, String> paramMap)
  {
    AppMethodBeat.i(68047);
    this.pvg = new LinkedHashMap();
    this.pvg.putAll(paramMap);
    AppMethodBeat.o(68047);
  }

  public final void Z(Map<String, String> paramMap)
  {
    AppMethodBeat.i(68048);
    this.pvh = new LinkedHashMap();
    this.pvh.putAll(paramMap);
    AppMethodBeat.o(68048);
  }

  public final void a(ab.f paramf, ab.e parame)
  {
    AppMethodBeat.i(68051);
    this.pvl = paramf;
    this.pvc = parame;
    if (this.pvf.size() > 0)
    {
      parame = new ArrayList();
      Iterator localIterator = this.pvf.keySet().iterator();
      while (localIterator.hasNext())
      {
        paramf = (String)localIterator.next();
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.ShareModeMailAppService", "check img status, msgSvrId: %s", new Object[] { paramf });
        parame.add(Long.valueOf(bo.getLong(paramf, 0L)));
      }
      a(parame, new ab.b()
      {
        public final void a(ArrayList<Long> paramAnonymousArrayList, HashMap<Long, String> paramAnonymousHashMap)
        {
          AppMethodBeat.i(68038);
          com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.ShareModeMailAppService", "finishChckImgStatus, notUploadedImgIdList.size: %d, attachIdMap.size: %d", new Object[] { Integer.valueOf(paramAnonymousArrayList.size()), Integer.valueOf(paramAnonymousHashMap.size()) });
          Object localObject1;
          if (paramAnonymousArrayList.size() > 0)
          {
            localObject1 = ab.this;
            paramAnonymousArrayList = paramAnonymousArrayList.iterator();
            while (paramAnonymousArrayList.hasNext())
            {
              Object localObject2 = (Long)paramAnonymousArrayList.next();
              localObject2 = (String)((ab)localObject1).pvf.get(String.valueOf(localObject2));
              com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.ShareModeMailAppService", "appendAllUndownloadImage, filePath: %s", new Object[] { localObject2 });
              if (!bo.isNullOrNil((String)localObject2))
              {
                if (((ab)localObject1).pvq == null)
                  ((ab)localObject1).pvq = new ArrayList();
                ((ab)localObject1).pvq.add(new ab.g((String)localObject2, (String)localObject2));
              }
            }
          }
          if (paramAnonymousHashMap.size() > 0)
            ab.a(ab.this, paramAnonymousHashMap);
          ab.this.Br(10);
          paramAnonymousArrayList = ab.this;
          com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.ShareModeMailAppService", "uploadMsgImg, filesInfo.size = %d", new Object[] { Integer.valueOf(paramAnonymousArrayList.pvq.size()) });
          if (paramAnonymousArrayList.pvq == null)
            paramAnonymousArrayList.pvq = new ArrayList();
          if (paramAnonymousArrayList.pvq.size() > 0)
          {
            paramAnonymousHashMap = new ab.3(paramAnonymousArrayList);
            localObject1 = new ab.4(paramAnonymousArrayList);
            com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.ShareModeMailAppService", "uploadFile, filesInfo.size: %d", new Object[] { Integer.valueOf(paramAnonymousArrayList.pvq.size()) });
            paramAnonymousArrayList.pvu = paramAnonymousHashMap;
            paramAnonymousArrayList.pvv = ((ab.d)localObject1);
            paramAnonymousArrayList.pvw = paramAnonymousArrayList.pvq.size();
            if ((paramAnonymousArrayList.pvq != null) && (paramAnonymousArrayList.pvq.size() > 0))
            {
              paramAnonymousHashMap = (ab.g)paramAnonymousArrayList.pvq.remove(0);
              paramAnonymousArrayList.pvr = paramAnonymousHashMap.fileId;
              paramAnonymousArrayList.pvs = paramAnonymousHashMap.fileName;
              paramAnonymousArrayList.pvt = new HashMap();
              paramAnonymousArrayList = new u(paramAnonymousArrayList.pvs, paramAnonymousArrayList.pvr, paramAnonymousArrayList.pvx);
              com.tencent.mm.kernel.g.RO().eJo.a(paramAnonymousArrayList, 0);
            }
            AppMethodBeat.o(68038);
          }
          while (true)
          {
            return;
            paramAnonymousArrayList.Br(90);
            paramAnonymousArrayList.ccy();
            AppMethodBeat.o(68038);
          }
        }
      });
      AppMethodBeat.o(68051);
    }
    while (true)
    {
      return;
      Br(90);
      ccy();
      AppMethodBeat.o(68051);
    }
  }

  final void ccy()
  {
    AppMethodBeat.i(68052);
    int i = 0;
    Object localObject1;
    Object localObject2;
    int j;
    Object localObject3;
    Object localObject4;
    if ((this.pvg != null) && (this.pvg.size() > 0))
    {
      localObject1 = new q.a[this.pvg.size()];
      localObject2 = this.pvg.keySet().iterator();
      i = 0;
      for (j = 0; ((Iterator)localObject2).hasNext(); j++)
      {
        localObject3 = (String)((Iterator)localObject2).next();
        localObject4 = new q.a();
        ((q.a)localObject4).pux = ((String)this.pvg.get(localObject3));
        ((q.a)localObject4).fileName = ((String)localObject3);
        ((q.a)localObject4).name = ((String)this.pvh.get(localObject3));
        ((q.a)localObject4).fileSize = ((int)e.asZ((String)localObject3));
        localObject1[j] = localObject4;
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.ShareModeMailAppService", "fileInfos[%d], attachId: %s, fileName: %s, name: %s, fileSize: %d", new Object[] { Integer.valueOf(j), ((q.a)localObject4).pux, ((q.a)localObject4).fileName, ((q.a)localObject4).name, Integer.valueOf(((q.a)localObject4).fileSize) });
        i = ((q.a)localObject4).fileSize + i;
      }
    }
    while (true)
    {
      Object localObject5;
      if ((this.pvk != null) && (this.pvk.size() > 0))
      {
        localObject3 = new q.a[this.pvk.size()];
        localObject5 = this.pvk.keySet().iterator();
        for (j = 0; ((Iterator)localObject5).hasNext(); j++)
        {
          localObject2 = (String)((Iterator)localObject5).next();
          localObject4 = new q.a();
          ((q.a)localObject4).pux = ((String)this.pvk.get(localObject2));
          ((q.a)localObject4).fileName = ((String)localObject2);
          ((q.a)localObject4).fileSize = bo.a((Integer)this.pvo.get(((q.a)localObject4).pux), 0);
          if (((q.a)localObject4).fileSize == 0)
            ((q.a)localObject4).fileSize = ((int)e.asZ((String)localObject2));
          localObject3[j] = localObject4;
          com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.ShareModeMailAppService", "imagesFileInfos[%d], attachId: %s, fileName: %s, fileSize: %d", new Object[] { Integer.valueOf(j), ((q.a)localObject4).pux, ((q.a)localObject4).fileName, Integer.valueOf(((q.a)localObject4).fileSize) });
          i = ((q.a)localObject4).fileSize + i;
        }
      }
      while (true)
      {
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.ShareModeMailAppService", "totalFileSize = %d", new Object[] { Integer.valueOf(i) });
        if ((localObject3 == null) || (localObject3.length == 0))
        {
          localObject3 = null;
          if ((localObject1 != null) && (localObject1.length != 0))
            break label581;
          localObject1 = null;
        }
        label581: 
        while (true)
        {
          localObject2 = new ab.5(this);
          localObject4 = new q(this.cEV, this.pur, this.pus, this.put, this.ptN);
          ((q)localObject4).puu = this.pve;
          if ((localObject1 == null) || (localObject1.length <= 0))
            break label1578;
          ((q)localObject4).puw = new q.a[localObject1.length];
          for (j = 0; j < ((q)localObject4).puw.length; j++)
            ((q)localObject4).puw[j] = localObject1[j];
          break;
        }
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MailContentFormatter", "setFileInfo, fileInfos.length = %d", new Object[] { Integer.valueOf(((q)localObject4).puw.length) });
        if ((localObject3 != null) && (localObject3.length > 0))
        {
          ((q)localObject4).puv = ((q.a[])localObject3);
          label627: localObject3 = new StringBuilder("");
          localObject5 = new StringBuilder("");
          if (((q)localObject4).cEV == null)
            break label1596;
          localObject1 = new StringBuilder("");
          ((StringBuilder)localObject1).append("From: ");
          ((StringBuilder)localObject1).append("\"");
          ((StringBuilder)localObject1).append("=?utf-8?B?");
          ((StringBuilder)localObject1).append(Base64.encodeToString(((q)localObject4).cEV.getBytes(), 2));
          ((StringBuilder)localObject1).append("?=");
          ((StringBuilder)localObject1).append("\"");
          ((StringBuilder)localObject1).append(" ");
          ((StringBuilder)localObject1).append("<");
          ((StringBuilder)localObject1).append(((q)localObject4).cEV);
          ((StringBuilder)localObject1).append(">");
        }
        int m;
        label1578: label1596: for (localObject1 = ((StringBuilder)localObject1).toString(); ; localObject1 = null)
        {
          if (localObject1 != null)
          {
            ((StringBuilder)localObject5).append((String)localObject1);
            ((StringBuilder)localObject5).append("\n");
          }
          localObject1 = ((q)localObject4).ccr();
          if (localObject1 != null)
          {
            ((StringBuilder)localObject5).append((String)localObject1);
            ((StringBuilder)localObject5).append("\n");
          }
          localObject1 = ((q)localObject4).ccs();
          if (localObject1 != null)
          {
            ((StringBuilder)localObject5).append((String)localObject1);
            ((StringBuilder)localObject5).append("\n");
          }
          localObject1 = ((q)localObject4).cct();
          if (localObject1 != null)
          {
            ((StringBuilder)localObject5).append((String)localObject1);
            ((StringBuilder)localObject5).append("\n");
          }
          ((StringBuilder)localObject5).append("Subject: ");
          if (((q)localObject4).ptN != null)
            ((StringBuilder)localObject5).append(((q)localObject4).ptN);
          ((StringBuilder)localObject5).append("\n");
          ((StringBuilder)localObject5).append("Mime-Version: 1.0");
          ((StringBuilder)localObject5).append("\n");
          ((StringBuilder)localObject5).append("Content-Type: multipart/mixed;boundary=\"----=_NextPart_5208D22F_0929AFA8_5112E4AB\"");
          ((StringBuilder)localObject5).append("\n");
          ((StringBuilder)localObject5).append("Content-Transfer-Encoding: 8Bit");
          ((StringBuilder)localObject5).append("\n");
          ((StringBuilder)localObject5).append("Date: ".concat(String.valueOf(new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss Z", new Locale("en")).format(new Date()))));
          ((StringBuilder)localObject5).append("\n");
          ((StringBuilder)localObject5).append("X-QQ-MIME: TCMime 1.0 by Tencent");
          ((StringBuilder)localObject5).append("\n");
          ((StringBuilder)localObject5).append("X-Mailer: QQMail 2.x");
          ((StringBuilder)localObject5).append("\n");
          ((StringBuilder)localObject5).append("X-QQ-Mailer: QQMail 2.x");
          ((StringBuilder)localObject5).append("\n");
          ((StringBuilder)localObject3).append(((StringBuilder)localObject5).toString());
          ((StringBuilder)localObject3).append("\r\n");
          ((StringBuilder)localObject3).append("This is a multi-part message in MIME format.");
          ((StringBuilder)localObject3).append("\n");
          ((StringBuilder)localObject3).append("\r\n");
          localObject1 = new StringBuilder("");
          ((StringBuilder)localObject1).append("------=_NextPart_5208D22F_0929AFA8_5112E4AB");
          ((StringBuilder)localObject1).append("\n");
          ((StringBuilder)localObject1).append("Content-Type:text/html;charset=\"utf-8\"");
          ((StringBuilder)localObject1).append("\n");
          ((StringBuilder)localObject1).append("Content-Transfer-Encoding:base64");
          ((StringBuilder)localObject1).append("\n");
          ((StringBuilder)localObject1).append("\r\n");
          ((StringBuilder)localObject1).append(Base64.encodeToString(((q)localObject4).puu.getBytes(), 0));
          ((StringBuilder)localObject1).append("\n");
          ((StringBuilder)localObject3).append(((StringBuilder)localObject1).toString());
          ((StringBuilder)localObject3).append("\r\n");
          if ((((q)localObject4).puv == null) || (((q)localObject4).puv.length <= 0))
            break label1601;
          for (StringBuilder localStringBuilder : ((q)localObject4).puv)
          {
            localObject1 = localStringBuilder.pux;
            localObject5 = localStringBuilder.fileName;
            m = localStringBuilder.fileSize;
            localStringBuilder = new StringBuilder("");
            localStringBuilder.append("------=_NextPart_5208D22F_0929AFA8_5112E4AB");
            localStringBuilder.append("\n");
            localStringBuilder.append(String.format("Content-Type:image/jpeg;name=\"%s\"", new Object[] { localObject5 }));
            localStringBuilder.append("\n");
            localStringBuilder.append("Content-Transfer-Encoding:base64");
            localStringBuilder.append("\n");
            localStringBuilder.append(String.format("Content-ID:<%s>", new Object[] { localObject5 }));
            localStringBuilder.append("\n");
            localStringBuilder.append("\r\n");
            localStringBuilder.append(String.format("QQMail-LinkID:%s", new Object[] { localObject1 }));
            localStringBuilder.append("\n");
            localStringBuilder.append(String.format("QQMail-LinkSize:%d", new Object[] { Integer.valueOf(m) }));
            localStringBuilder.append("\n");
            localStringBuilder.append("QQMail-LineLen:72");
            localStringBuilder.append("\n");
            localStringBuilder.append("QQMail-BreakType:1");
            localStringBuilder.append("\n");
            localStringBuilder.append(String.format("QQMail-Key:%s", new Object[] { q.Vk((String)localObject1) }));
            localStringBuilder.append("\n");
            localStringBuilder.append("QQMail-LinkEnd");
            localStringBuilder.append("\n");
            ((StringBuilder)localObject3).append(localStringBuilder.toString());
            ((StringBuilder)localObject3).append("\r\n");
          }
          ((q)localObject4).puw = null;
          break;
          ((q)localObject4).puv = null;
          break label627;
        }
        label1601: ((StringBuilder)localObject3).append("\r\n");
        if ((((q)localObject4).puw != null) && (((q)localObject4).puw.length > 0))
          for (localObject5 : ((q)localObject4).puw)
          {
            localObject4 = ((q.a)localObject5).pux;
            m = ((q.a)localObject5).fileSize;
            localObject5 = ((q.a)localObject5).name;
            ??? = new StringBuilder("");
            ((StringBuilder)???).append("------=_NextPart_5208D22F_0929AFA8_5112E4AB");
            ((StringBuilder)???).append("\n");
            ((StringBuilder)???).append(String.format("Content-Type:application/octet-stream;charset=\"utf-8\";name=\"=?utf-8?B?%s?=\"", new Object[] { Base64.encodeToString(((String)localObject5).getBytes(), 2) }));
            ((StringBuilder)???).append("\n");
            ((StringBuilder)???).append(String.format("Content-Disposition: attachment; filename=\"=?utf-8?B?%s?=\"", new Object[] { Base64.encodeToString(((String)localObject5).getBytes(), 2) }));
            ((StringBuilder)???).append("\n");
            ((StringBuilder)???).append("Content-Transfer-Encoding:base64");
            ((StringBuilder)???).append("\n");
            ((StringBuilder)???).append(String.format("Content-ID:<%s>", new Object[] { Long.valueOf(System.currentTimeMillis()) }));
            ((StringBuilder)???).append("\n");
            ((StringBuilder)???).append("\r\n");
            ((StringBuilder)???).append(String.format("QQMail-LinkID:%s", new Object[] { localObject4 }));
            ((StringBuilder)???).append("\n");
            ((StringBuilder)???).append(String.format("QQMail-LinkSize:%d", new Object[] { Integer.valueOf(m) }));
            ((StringBuilder)???).append("\n");
            ((StringBuilder)???).append("QQMail-LineLen:72");
            ((StringBuilder)???).append("\n");
            ((StringBuilder)???).append("QQMail-BreakType:1");
            ((StringBuilder)???).append("\n");
            ((StringBuilder)???).append(String.format("QQMail-Key:%s", new Object[] { q.Vk((String)localObject4) }));
            ((StringBuilder)???).append("\n");
            ((StringBuilder)???).append("QQMail-LinkEnd");
            ((StringBuilder)???).append("\n");
            ((StringBuilder)localObject3).append(((StringBuilder)???).toString());
            ((StringBuilder)localObject3).append("\r\n");
          }
        ((StringBuilder)localObject3).append("------=_NextPart_5208D22F_0929AFA8_5112E4AB--");
        localObject1 = new s(((StringBuilder)localObject3).toString(), this.cEV, this.pur, i, new ab.8(this, (ab.a)localObject2));
        com.tencent.mm.kernel.g.RO().eJo.a((m)localObject1, 0);
        AppMethodBeat.o(68052);
        return;
        localObject3 = null;
      }
      localObject1 = null;
    }
  }

  public final void clearData()
  {
    AppMethodBeat.i(68050);
    this.pvn.clear();
    this.put = null;
    this.pvp = 0;
    this.pvr = null;
    this.pvs = null;
    this.pvt.clear();
    this.pvq.clear();
    this.cEV = null;
    this.pvm.clear();
    this.pvf.clear();
    this.pve = null;
    this.ptN = null;
    this.pvw = 0;
    this.pur = null;
    this.pvg.clear();
    this.pvk.clear();
    this.pvo.clear();
    this.pvl = null;
    this.pvc = null;
    AppMethodBeat.o(68050);
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(68053);
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.ShareModeMailAppService", "onSceneEnd, errType: %d, errCode: %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if ((paramInt1 != 0) || (paramInt2 != 0))
    {
      com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.ShareModeMailAppService", "errType = %d, errCode = %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
      if (paramm.getType() == 483)
      {
        a((r)paramm);
        AppMethodBeat.o(68053);
      }
    }
    while (true)
    {
      return;
      if (this.pvc != null)
        al.d(new ab.6(this));
      AppMethodBeat.o(68053);
      continue;
      if (paramm.getType() == 483)
      {
        a((r)paramm);
        AppMethodBeat.o(68053);
      }
      else
      {
        if (paramm.getType() != 484)
          paramm.getType();
        AppMethodBeat.o(68053);
      }
    }
  }

  public static final class g
  {
    public String fileId;
    public String fileName;

    public g()
    {
    }

    public g(String paramString1, String paramString2)
    {
      this.fileId = paramString1;
      this.fileName = paramString2;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.qqmail.b.ab
 * JD-Core Version:    0.6.2
 */