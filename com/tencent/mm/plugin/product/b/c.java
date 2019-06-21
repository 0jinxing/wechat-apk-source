package com.tencent.mm.plugin.product.b;

import android.app.Activity;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.af.j.b;
import com.tencent.mm.platformtools.x;
import com.tencent.mm.plugin.product.c.f;
import com.tencent.mm.plugin.product.c.h;
import com.tencent.mm.plugin.product.c.j;
import com.tencent.mm.plugin.product.c.k;
import com.tencent.mm.plugin.product.c.l;
import com.tencent.mm.protocal.protobuf.au;
import com.tencent.mm.protocal.protobuf.axa;
import com.tencent.mm.protocal.protobuf.blq;
import com.tencent.mm.protocal.protobuf.bpz;
import com.tencent.mm.protocal.protobuf.btx;
import com.tencent.mm.protocal.protobuf.cad;
import com.tencent.mm.protocal.protobuf.cx;
import com.tencent.mm.protocal.protobuf.xd;
import com.tencent.mm.protocal.protobuf.ze;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class c
{
  public int mCount;
  private d pgN;
  public m pgO;
  public List<n> pgP;
  public String pgQ;
  public String pgR;
  public String pgS;
  public ze pgT;
  public cx pgU;
  public bpz pgV;
  public String pgW;
  public String pgX;
  public int pgY;
  public Map<String, e> pgZ;
  public Map<String, String> pha;
  public LinkedList<ze> phb;
  public LinkedList<au> phc;
  public e phd;
  private com.tencent.mm.plugin.product.ui.e phe;
  public Map<String, LinkedList<xd>> phf;

  public c()
  {
    AppMethodBeat.i(43952);
    this.pgN = null;
    this.mCount = 1;
    this.pha = new HashMap();
    this.phf = null;
    AppMethodBeat.o(43952);
  }

  private int UI(String paramString)
  {
    AppMethodBeat.i(43963);
    int i = 0;
    int j = 0;
    int k = i;
    if (this.phf != null)
    {
      k = i;
      if (this.phf.size() > 0)
      {
        paramString = (LinkedList)this.phf.get(paramString);
        k = i;
        if (paramString != null)
        {
          k = i;
          if (paramString.size() > 0)
          {
            paramString = paramString.iterator();
            while (true)
            {
              k = j;
              if (!paramString.hasNext())
                break;
              j = ((xd)paramString.next()).vQt + j;
            }
          }
        }
      }
    }
    AppMethodBeat.o(43963);
    return k;
  }

  public static String V(Map<String, String> paramMap)
  {
    AppMethodBeat.i(43973);
    if ((paramMap == null) || (paramMap.isEmpty()))
    {
      paramMap = null;
      AppMethodBeat.o(43973);
    }
    while (true)
    {
      return paramMap;
      Object localObject = new ArrayList(paramMap.entrySet());
      Collections.sort((List)localObject, new c.1());
      paramMap = new StringBuilder();
      Iterator localIterator = ((ArrayList)localObject).iterator();
      while (localIterator.hasNext())
      {
        localObject = (Map.Entry)localIterator.next();
        paramMap.append((String)((Map.Entry)localObject).getKey()).append(":").append((String)((Map.Entry)localObject).getValue()).append(";");
      }
      paramMap.deleteCharAt(paramMap.lastIndexOf(";"));
      paramMap = paramMap.toString();
      AppMethodBeat.o(43973);
    }
  }

  private void a(String[] paramArrayOfString, l paraml)
  {
    AppMethodBeat.i(43975);
    if ((paramArrayOfString == null) || (paramArrayOfString.length <= 0))
      AppMethodBeat.o(43975);
    while (true)
    {
      return;
      int i = paramArrayOfString.length;
      int j = 1;
      if (j <= -1 >>> 32 - i)
      {
        StringBuilder localStringBuilder = new StringBuilder();
        for (int k = 0; k < i; k++)
          if (j << 31 - k >> 31 == -1)
            localStringBuilder.append(paramArrayOfString[k]).append(";");
        localStringBuilder.deleteCharAt(localStringBuilder.lastIndexOf(";"));
        e locale = (e)this.pgZ.get(localStringBuilder.toString());
        if (locale != null)
        {
          if (locale.phh < paraml.phV)
            locale.phh = paraml.phV;
          if (locale.phi > paraml.phV)
            locale.phi = paraml.phV;
          locale.phq += paraml.phq;
        }
        while (true)
        {
          j++;
          break;
          locale = new e();
          locale.phh = paraml.phV;
          locale.phi = paraml.phV;
          locale.phq = paraml.phq;
          locale.phW = paraml.phW;
          locale.url = paraml.url;
          this.pgZ.put(localStringBuilder.toString(), locale);
        }
      }
      AppMethodBeat.o(43975);
    }
  }

  private void ai(LinkedList<l> paramLinkedList)
  {
    AppMethodBeat.i(43974);
    this.pgZ = new HashMap();
    if ((paramLinkedList == null) || (paramLinkedList.size() <= 0))
      AppMethodBeat.o(43974);
    while (true)
    {
      return;
      int i = paramLinkedList.size();
      for (int j = 0; j < i; j++)
      {
        l locall = (l)paramLinkedList.get(j);
        a(locall.phU.split(";"), locall);
      }
      bZU();
      AppMethodBeat.o(43974);
    }
  }

  public final void AL(int paramInt)
  {
    AppMethodBeat.i(43960);
    if (this.phb == null)
      AppMethodBeat.o(43960);
    while (true)
    {
      return;
      if ((paramInt < this.phb.size()) && (paramInt >= 0))
        this.pgT = ((ze)this.phb.get(paramInt));
      AppMethodBeat.o(43960);
    }
  }

  public final LinkedList<com.tencent.mm.plugin.product.c.a> X(Activity paramActivity)
  {
    AppMethodBeat.i(43959);
    LinkedList localLinkedList = new LinkedList();
    if (this.phc != null)
    {
      Iterator localIterator = this.phc.iterator();
      while (localIterator.hasNext())
      {
        au localau = (au)localIterator.next();
        com.tencent.mm.plugin.product.c.a locala = new com.tencent.mm.plugin.product.c.a();
        locala.Name = localau.Name;
        locala.phA = localau.phA;
        locala.ncM = localau.ncM;
        locala.jCt = localau.jCt;
        locala.IconUrl = localau.IconUrl;
        if (locala.jCt == 1)
        {
          int i = UI(locala.ncM);
          if (i > 0)
            locala.phA = paramActivity.getString(2131301370, new Object[] { b.d(i, this.pgO.phs.pcl) });
        }
        localLinkedList.add(locala);
      }
    }
    AppMethodBeat.o(43959);
    return localLinkedList;
  }

  public final String a(m paramm)
  {
    AppMethodBeat.i(43978);
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("<mallProductInfo>");
    localStringBuilder.append("<type>").append(paramm.php).append("</type>");
    localStringBuilder.append("<id>").append(paramm.pho).append("</id>");
    localStringBuilder.append("<version>").append(paramm.phs.version).append("</version>");
    localStringBuilder.append("<name>").append(bo.ani(paramm.phs.name)).append("</name>");
    localStringBuilder.append("<highPrice>").append(paramm.phs.phE).append("</highPrice>");
    localStringBuilder.append("<lowPrice>").append(paramm.phs.phF).append("</lowPrice>");
    localStringBuilder.append("<originPrice>").append(paramm.phs.phD).append("</originPrice>");
    localStringBuilder.append("<sourceUrl>").append(bo.ani(this.pgO.phw)).append("</sourceUrl>");
    if (paramm.phs.phG != null)
    {
      localStringBuilder.append("<imgCount>").append(paramm.phs.phG.size()).append("</imgCount>");
      localStringBuilder.append("<imgList>");
      Iterator localIterator = paramm.phs.phG.iterator();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        localStringBuilder.append("<imgUrl>").append(bo.ani(str)).append("</imgUrl>");
      }
      localStringBuilder.append("</imgList>");
    }
    localStringBuilder.append("<shareInfo>");
    localStringBuilder.append("<shareUrl>").append(bo.ani(bZN())).append("</shareUrl>");
    localStringBuilder.append("<shareThumbUrl>").append(bo.ani(paramm.bZY())).append("</shareThumbUrl>");
    localStringBuilder.append("</shareInfo>");
    if (this.pgO.pht != null)
    {
      localStringBuilder.append("<sellerInfo>");
      localStringBuilder.append("<appID>").append(paramm.pht.csB).append("</appID>");
      localStringBuilder.append("<appName>").append(paramm.pht.name).append("</appName>");
      localStringBuilder.append("<usrName>").append(paramm.pht.username).append("</usrName>");
      localStringBuilder.append("</sellerInfo>");
    }
    localStringBuilder.append("</mallProductInfo>");
    paramm = localStringBuilder.toString();
    AppMethodBeat.o(43978);
    return paramm;
  }

  public final void a(m paramm, List<n> paramList)
  {
    int i = 0;
    AppMethodBeat.i(43954);
    clear();
    this.pgO = paramm;
    this.pgP = paramList;
    if (bo.isNullOrNil(this.pgO.phw))
      this.pgO.phw = this.pgR;
    ai(this.pgO.phu);
    if ((this.pgO.phs != null) && (this.pgO.phs.phM != null))
      this.pgY = this.pgO.phs.phM.size();
    if ((this.pgO.phs != null) && (this.pgO.phs.phG != null) && (this.pgO.phs.phG.size() > 0))
      this.pgW = ((String)this.pgO.phs.phG.get(0));
    if (!bo.isNullOrNil(this.pgO.bZY()))
    {
      x.a(new com.tencent.mm.plugin.product.ui.c(this.pgO.bZY()));
      ab.d("MicroMsg.MallProductManager", "product img path : " + bZM());
    }
    if ((this.pgO.phv != null) && (this.pgO.phv.phQ != null));
    for (int j = this.pgO.phv.phQ.bJt; ; j = 0)
    {
      if (this.pgO.pht != null)
        i = this.pgO.pht.bJt;
      this.phe = new com.tencent.mm.plugin.product.ui.e(j, i);
      AppMethodBeat.o(43954);
      return;
    }
  }

  public final void al(Intent paramIntent)
  {
    AppMethodBeat.i(43958);
    cx localcx = new cx();
    localcx.jBB = bo.bc(paramIntent.getStringExtra("userName"), "");
    localcx.vEV = bo.bc(paramIntent.getStringExtra("telNumber"), "");
    localcx.vEW = bo.bc(paramIntent.getStringExtra("addressPostalCode"), "");
    localcx.guO = bo.bc(paramIntent.getStringExtra("proviceFirstStageName"), "");
    localcx.guP = bo.bc(paramIntent.getStringExtra("addressCitySecondStageName"), "");
    localcx.guW = bo.bc(paramIntent.getStringExtra("addressCountiesThirdStageName"), "");
    localcx.naq = bo.bc(paramIntent.getStringExtra("addressDetailInfo"), "");
    if ((!bo.isNullOrNil(localcx.jBB)) && (!bo.isNullOrNil(localcx.vEV)))
      this.pgU = localcx;
    AppMethodBeat.o(43958);
  }

  public final com.tencent.mm.plugin.product.ui.e bZF()
  {
    AppMethodBeat.i(43955);
    if (this.phe == null)
      this.phe = new com.tencent.mm.plugin.product.ui.e(0, 0);
    com.tencent.mm.plugin.product.ui.e locale = this.phe;
    AppMethodBeat.o(43955);
    return locale;
  }

  public final String bZG()
  {
    AppMethodBeat.i(43956);
    String str;
    if ((this.phd != null) && (!bo.isNullOrNil(this.phd.url)))
    {
      str = this.phd.url;
      AppMethodBeat.o(43956);
    }
    while (true)
    {
      return str;
      str = this.pgW;
      AppMethodBeat.o(43956);
    }
  }

  public final String bZH()
  {
    AppMethodBeat.i(43957);
    StringBuilder localStringBuilder = new StringBuilder();
    Object localObject1 = this.pgO.phs.phM.iterator();
    while (true)
    {
      if (!((Iterator)localObject1).hasNext())
        break label130;
      Object localObject2 = (com.tencent.mm.plugin.product.c.m)((Iterator)localObject1).next();
      String str = (String)this.pha.get(((com.tencent.mm.plugin.product.c.m)localObject2).phX);
      if (str != null)
      {
        localObject2 = ((com.tencent.mm.plugin.product.c.m)localObject2).phZ.iterator();
        if (((Iterator)localObject2).hasNext())
        {
          h localh = (h)((Iterator)localObject2).next();
          if (!str.equals(localh.id))
            break;
          localStringBuilder.append(localh.name).append(" ");
        }
      }
    }
    label130: localObject1 = localStringBuilder.toString();
    AppMethodBeat.o(43957);
    return localObject1;
  }

  public final int bZI()
  {
    AppMethodBeat.i(43961);
    int i = 0;
    int j = i;
    if (!bZF().cab())
    {
      j = i;
      if (this.pgT != null)
        j = this.pgT.vQt + 0;
    }
    if (this.phd != null)
      j += this.phd.phh * this.mCount;
    while (true)
    {
      i = bZJ();
      AppMethodBeat.o(43961);
      return j - i;
      j += this.pgO.phs.phE * this.mCount;
    }
  }

  public final int bZJ()
  {
    AppMethodBeat.i(43962);
    int i = 0;
    int j = i;
    if (this.phf != null)
    {
      j = i;
      if (this.phf.size() > 0)
      {
        Iterator localIterator = this.phf.values().iterator();
        for (j = 0; localIterator.hasNext(); j = i)
        {
          Object localObject = (LinkedList)localIterator.next();
          i = j;
          if (localObject != null)
          {
            i = j;
            if (((LinkedList)localObject).size() > 0)
            {
              localObject = ((LinkedList)localObject).iterator();
              while (true)
              {
                i = j;
                if (!((Iterator)localObject).hasNext())
                  break;
                j += ((xd)((Iterator)localObject).next()).vQt;
              }
            }
          }
        }
      }
    }
    AppMethodBeat.o(43962);
    return j;
  }

  public final bpz bZK()
  {
    Object localObject1 = null;
    AppMethodBeat.i(43964);
    Object localObject2;
    if (this.pgV != null)
    {
      localObject2 = this.pgV;
      AppMethodBeat.o(43964);
    }
    while (true)
    {
      return localObject2;
      if (this.pgN == null)
        this.pgN = com.tencent.mm.plugin.product.a.a.bZC().bZE();
      localObject2 = this.pgN;
      if ((((d)localObject2).phg != null) && (((d)localObject2).phg.size() > 0));
      for (localObject2 = (String)((d)localObject2).phg.get(0); ; localObject2 = null)
      {
        if (bo.isNullOrNil((String)localObject2))
          break label136;
        this.pgV = new bpz();
        this.pgV.naq = ((String)localObject2);
        this.pgV.wSm = 1;
        localObject2 = this.pgV;
        AppMethodBeat.o(43964);
        break;
      }
      label136: localObject2 = this.pgU;
      if ((localObject2 != null) && (!bo.isNullOrNil(((cx)localObject2).jBB)))
      {
        this.pgV = new bpz();
        this.pgV.naq = ((cx)localObject2).jBB;
        this.pgV.wSm = 1;
        localObject2 = this.pgV;
        AppMethodBeat.o(43964);
      }
      else
      {
        AppMethodBeat.o(43964);
        localObject2 = localObject1;
      }
    }
  }

  public final String bZL()
  {
    if (this.pgO.pht != null);
    for (String str = this.pgO.pht.username; ; str = null)
      return str;
  }

  public final String bZM()
  {
    AppMethodBeat.i(43965);
    String str;
    if (!bo.isNullOrNil(this.pgO.bZY()))
    {
      str = com.tencent.mm.plugin.product.ui.c.UK(this.pgO.bZY());
      AppMethodBeat.o(43965);
    }
    while (true)
    {
      return str;
      str = null;
      AppMethodBeat.o(43965);
    }
  }

  public final String bZN()
  {
    AppMethodBeat.i(43966);
    String str;
    if ((this.pgO.phs != null) && (this.pgO.phs.phO != null))
    {
      str = this.pgO.phs.phO.url;
      AppMethodBeat.o(43966);
    }
    while (true)
    {
      return str;
      if (!bo.isNullOrNil(this.pgO.phw))
      {
        str = this.pgO.phw;
        AppMethodBeat.o(43966);
      }
      else
      {
        str = this.pgR;
        AppMethodBeat.o(43966);
      }
    }
  }

  public final int bZO()
  {
    int i = this.pgO.phq;
    int j = i;
    if (this.phd != null)
    {
      j = i;
      if (i > this.phd.phq)
        j = this.phd.phq;
    }
    return j;
  }

  public final boolean bZP()
  {
    AppMethodBeat.i(43967);
    boolean bool;
    if ((this.mCount > 0) && (this.pgO != null) && (this.mCount <= bZO()) && (this.pgO.phs != null) && (this.pgO.phs.phM != null))
    {
      bool = true;
      AppMethodBeat.o(43967);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(43967);
    }
  }

  public final boolean bZQ()
  {
    boolean bool = false;
    AppMethodBeat.i(43968);
    if (!bZP())
      AppMethodBeat.o(43968);
    while (true)
    {
      return bool;
      if ((this.pha != null) && (this.pha.size() == this.pgY))
      {
        if (this.pgY > 0)
        {
          if ((this.phd != null) && (this.mCount > 0) && (this.mCount <= bZO()))
          {
            AppMethodBeat.o(43968);
            bool = true;
          }
        }
        else if (this.pgY == 0)
        {
          AppMethodBeat.o(43968);
          bool = true;
        }
      }
      else
        AppMethodBeat.o(43968);
    }
  }

  public final boolean bZR()
  {
    boolean bool = false;
    AppMethodBeat.i(43969);
    if (!bZQ())
      AppMethodBeat.o(43969);
    while (true)
    {
      return bool;
      if (this.pgU == null)
      {
        AppMethodBeat.o(43969);
      }
      else if ((!bZF().cab()) && (this.pgT == null))
      {
        AppMethodBeat.o(43969);
      }
      else
      {
        bool = true;
        AppMethodBeat.o(43969);
      }
    }
  }

  public final LinkedList<btx> bZS()
  {
    AppMethodBeat.i(43970);
    LinkedList localLinkedList = new LinkedList();
    btx localbtx = new btx();
    localbtx.jBv = this.mCount;
    localbtx.wrm = this.pgO.pho;
    localbtx.wOG = this.pgO.phw;
    localbtx.wOH = this.pgS;
    localLinkedList.add(localbtx);
    AppMethodBeat.o(43970);
    return localLinkedList;
  }

  public final cad bZT()
  {
    AppMethodBeat.i(43971);
    cad localcad = new cad();
    localcad.vRN = this.pgQ;
    localcad.pdi = 1;
    localcad.wZm = new LinkedList();
    blq localblq = new blq();
    localblq.jBv = this.mCount;
    localblq.wrm = this.pgO.pho;
    localblq.Name = this.pgO.phs.name;
    if (this.phd != null);
    Object localObject1;
    Object localObject2;
    for (localblq.wOF = this.phd.phh; ; localblq.wOF = this.pgO.phs.phE)
    {
      localblq.wOG = this.pgO.phw;
      localblq.wOH = this.pgS;
      localblq.jCt = this.pgO.php;
      localblq.wOD = this.pgY;
      localblq.wOE = new LinkedList();
      localObject1 = this.pha.keySet().iterator();
      while (((Iterator)localObject1).hasNext())
      {
        String str1 = (String)((Iterator)localObject1).next();
        String str2 = (String)this.pha.get(str1);
        localObject2 = new axa();
        ((axa)localObject2).vMU = str1;
        ((axa)localObject2).pXM = str2;
        localblq.wOE.add(localObject2);
      }
    }
    localblq.wOL = new LinkedList();
    localblq.wOK = 0;
    if ((this.phf != null) && (this.phf.size() > 0))
    {
      localObject2 = this.phf.values().iterator();
      while (((Iterator)localObject2).hasNext())
      {
        localObject1 = (LinkedList)((Iterator)localObject2).next();
        localblq.wOL.addAll((Collection)localObject1);
        int i = localblq.wOK;
        localblq.wOK = (((LinkedList)localObject1).size() + i);
      }
    }
    localcad.wZm.add(localblq);
    localcad.wZo = new LinkedList();
    localcad.wZp = 1;
    this.pgV = bZK();
    if (this.pgV != null)
      localcad.wZo.add(this.pgV);
    while (true)
    {
      localcad.wpB = this.pgU;
      localcad.wZn = this.pgT;
      AppMethodBeat.o(43971);
      return localcad;
      this.pgV = new bpz();
      this.pgV.wSm = 0;
      localcad.wZo.add(this.pgV);
    }
  }

  public final void bZU()
  {
    AppMethodBeat.i(43972);
    if (this.pha == null)
      AppMethodBeat.o(43972);
    while (true)
    {
      return;
      Iterator localIterator1 = this.pgO.phs.phM.iterator();
      if (localIterator1.hasNext())
      {
        com.tencent.mm.plugin.product.c.m localm = (com.tencent.mm.plugin.product.c.m)localIterator1.next();
        Iterator localIterator2 = localm.phZ.iterator();
        label61: h localh;
        Object localObject;
        String str1;
        boolean bool;
        if (localIterator2.hasNext())
        {
          localh = (h)localIterator2.next();
          localObject = localm.phX;
          str1 = localh.id;
          if ((this.pha != null) && (this.pgZ != null))
            break label175;
          bool = false;
        }
        while (true)
        {
          localh.phS = bool;
          ab.d("MicroMsg.MallProductManager", "(" + localm.phX + " , " + localh.id + ") hasStock--> " + localh.phS);
          break label61;
          break;
          label175: String str2;
          if (this.pha.containsKey(localObject))
          {
            str2 = (String)this.pha.get(localObject);
            this.pha.put(localObject, str1);
            str1 = V(this.pha);
            this.pha.put(localObject, str2);
            localObject = (e)this.pgZ.get(str1);
            if (localObject != null)
            {
              if (((e)localObject).phq > 0)
                bool = true;
              else
                bool = false;
            }
            else
              bool = false;
          }
          else
          {
            this.pha.put(localObject, str1);
            str2 = V(this.pha);
            this.pha.remove(localObject);
            localObject = (e)this.pgZ.get(str2);
            if (localObject != null)
            {
              if (((e)localObject).phq > 0)
                bool = true;
              else
                bool = false;
            }
            else
              bool = false;
          }
        }
      }
      AppMethodBeat.o(43972);
    }
  }

  public final String bZV()
  {
    AppMethodBeat.i(43976);
    Object localObject = new j.b();
    ((j.b)localObject).title = this.pgO.phs.name;
    ((j.b)localObject).description = bZW();
    ((j.b)localObject).type = 13;
    ((j.b)localObject).url = bZN();
    ((j.b)localObject).thumburl = this.pgO.bZY();
    ((j.b)localObject).fgV = this.pgO.php;
    ((j.b)localObject).fgW = a(this.pgO);
    localObject = j.b.a((j.b)localObject, null, null);
    AppMethodBeat.o(43976);
    return localObject;
  }

  public final String bZW()
  {
    AppMethodBeat.i(43977);
    String str = b.d(this.pgO.phs.phF, this.pgO.phs.pcl);
    AppMethodBeat.o(43977);
    return str;
  }

  public final void clear()
  {
    AppMethodBeat.i(43953);
    this.pgO = null;
    if (this.pgP != null)
    {
      this.pgP.clear();
      this.pgP = null;
    }
    this.pgQ = null;
    this.pgR = null;
    this.mCount = 1;
    this.pgS = null;
    this.pgT = null;
    this.pgV = null;
    this.pgW = null;
    this.pgY = 0;
    this.phd = null;
    if (this.pgZ != null)
    {
      this.pgZ.clear();
      this.pgZ = null;
    }
    if (this.pha != null)
      this.pha.clear();
    if (this.phb != null)
    {
      this.phb.clear();
      this.phb = null;
    }
    if (this.phf != null)
    {
      this.phf.clear();
      this.phf = null;
    }
    AppMethodBeat.o(43953);
  }

  public final String getAppId()
  {
    if (this.pgO.pht != null);
    for (String str = this.pgO.pht.csB; ; str = null)
      return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.product.b.c
 * JD-Core Version:    0.6.2
 */