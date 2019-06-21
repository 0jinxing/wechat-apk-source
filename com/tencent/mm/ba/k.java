package com.tencent.mm.ba;

import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m.a;
import com.tencent.mm.ai.m.b;
import com.tencent.mm.ai.o;
import com.tencent.mm.ai.p;
import com.tencent.mm.g.a.mn;
import com.tencent.mm.g.a.mn.a;
import com.tencent.mm.g.a.tu;
import com.tencent.mm.kernel.g;
import com.tencent.mm.m.c;
import com.tencent.mm.network.q;
import com.tencent.mm.platformtools.aa;
import com.tencent.mm.platformtools.ae;
import com.tencent.mm.protocal.protobuf.alw;
import com.tencent.mm.protocal.protobuf.alx;
import com.tencent.mm.protocal.protobuf.bic;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class k extends com.tencent.mm.ai.m
  implements o, com.tencent.mm.network.k
{
  private int cvz;
  private com.tencent.mm.ai.b ehh;
  private f ehi;
  private boolean fMo;
  private int flags;

  public k(int paramInt)
  {
    AppMethodBeat.i(78459);
    this.fMo = false;
    this.flags = -1;
    this.cvz = paramInt;
    this.fMo = false;
    ab.d("MicroMsg.NetSceneGetPackageList", "Init dkregcode:".concat(String.valueOf(paramInt)));
    AppMethodBeat.o(78459);
  }

  public k(boolean paramBoolean)
  {
    AppMethodBeat.i(78458);
    this.fMo = false;
    this.flags = -1;
    this.cvz = 26;
    this.fMo = false;
    ab.d("MicroMsg.NetSceneGetPackageList", "Init dkregcode:26");
    ab.d("MicroMsg.NetSceneGetPackageList", "isOnlyCheckInReqList: %b", new Object[] { Boolean.valueOf(paramBoolean) });
    if (paramBoolean)
      this.flags = 1;
    AppMethodBeat.o(78458);
  }

  private m a(bic parambic)
  {
    AppMethodBeat.i(78461);
    m localm = new m();
    localm.id = parambic.ndE;
    localm.version = parambic.Version;
    localm.name = parambic.Name;
    localm.size = parambic.jCo;
    localm.fMt = parambic.PackName;
    localm.status = 5;
    localm.cBc = this.cvz;
    AppMethodBeat.o(78461);
    return localm;
  }

  private void ae(List<bic> paramList)
  {
    AppMethodBeat.i(78470);
    if ((paramList == null) || (paramList.size() <= 0))
    {
      ab.d("MicroMsg.NetSceneGetPackageList", "[oneliang]empty update expose scene list");
      AppMethodBeat.o(78470);
    }
    while (true)
    {
      return;
      r.aix();
      String str = n.aiu();
      int i = 0;
      if (i < paramList.size())
      {
        bic localbic = (bic)paramList.get(i);
        Object localObject = r.aix().cv(localbic.ndE, this.cvz);
        m localm;
        if ((localObject == null) || (((m)localObject).version != localbic.Version))
        {
          com.tencent.mm.a.e.deleteFile(str + r.aix().cx(localbic.ndE, this.cvz));
          localm = a(localbic);
          localm.bJt = -1;
          if (localObject != null)
            break label224;
          r.aix().a(localm);
        }
        while (true)
        {
          localObject = new j(localm.id, 19);
          g.RO().eJo.a((com.tencent.mm.ai.m)localObject, 0);
          ab.d("MicroMsg.NetSceneGetPackageList", "[oneliang]name:%s,packName:%s", new Object[] { localbic.Name, localbic.PackName });
          i++;
          break;
          label224: r.aix().b(localm);
        }
      }
      AppMethodBeat.o(78470);
    }
  }

  private void af(List<bic> paramList)
  {
    AppMethodBeat.i(78471);
    if ((paramList == null) || (paramList.size() == 0))
    {
      ab.d("MicroMsg.NetSceneGetPackageList", "updateIPCallCountryCodeConfig, package list is empty");
      AppMethodBeat.o(78471);
    }
    while (true)
    {
      return;
      ab.d("MicroMsg.NetSceneGetPackageList", "updateIPCallCountryCodeConfig, pkgList.size: %d", new Object[] { Integer.valueOf(paramList.size()) });
      int i = ((Integer)g.RP().Ry().get(ac.a.xLl, Integer.valueOf(-1))).intValue();
      ab.d("MicroMsg.NetSceneGetPackageList", "configPkgId: %d", new Object[] { Integer.valueOf(i) });
      if (i == -1)
      {
        AppMethodBeat.o(78471);
      }
      else
      {
        m localm = r.aix().cv(i, this.cvz);
        Iterator localIterator = paramList.iterator();
        while (true)
          if (localIterator.hasNext())
          {
            paramList = a((bic)localIterator.next());
            ab.d("MicroMsg.NetSceneGetPackageList", "newInfo.id: %d, version: %d", new Object[] { Integer.valueOf(paramList.id), Integer.valueOf(paramList.version) });
            if ((localm != null) && (paramList.id == i))
            {
              ab.d("MicroMsg.NetSceneGetPackageList", "find match old pkg, update one");
              r.aix().b(paramList);
              AppMethodBeat.o(78471);
              break;
            }
            if ((localm == null) && (paramList.id == i))
            {
              ab.d("MicroMsg.NetSceneGetPackageList", "insert new pkg");
              r.aix().a(paramList);
              AppMethodBeat.o(78471);
              break;
            }
          }
        AppMethodBeat.o(78471);
      }
    }
  }

  private void ag(List<bic> paramList)
  {
    AppMethodBeat.i(78472);
    if ((paramList == null) || (paramList.size() == 0))
    {
      ab.d("MicroMsg.NetSceneGetPackageList", "update sense where location but package list is empty.");
      AppMethodBeat.o(78472);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.NetSceneGetPackageList", "start update sense where location. package list size " + paramList.size());
      paramList = paramList.iterator();
      while (paramList.hasNext())
      {
        Object localObject1 = (bic)paramList.next();
        Object localObject2 = r.aix().cv(((bic)localObject1).ndE, this.cvz);
        if ((localObject2 == null) || (((m)localObject2).version != ((bic)localObject1).Version))
        {
          localObject1 = a((bic)localObject1);
          ((m)localObject1).bJt = -1;
          if (localObject2 == null)
            r.aix().a((m)localObject1);
          while (true)
          {
            localObject2 = new j(((m)localObject1).id, 36);
            g.RO().eJo.a((com.tencent.mm.ai.m)localObject2, 0);
            break;
            r.aix().b((m)localObject1);
          }
        }
      }
      AppMethodBeat.o(78472);
    }
  }

  private void g(LinkedList<bic> paramLinkedList)
  {
    AppMethodBeat.i(78463);
    if ((paramLinkedList == null) || (paramLinkedList.size() <= 0))
    {
      ab.d("MicroMsg.NetSceneGetPackageList", "empty upload speex config list");
      AppMethodBeat.o(78463);
    }
    while (true)
    {
      return;
      r.aix();
      String str = n.aiu();
      int i = 0;
      if (i < paramLinkedList.size())
      {
        bic localbic = (bic)paramLinkedList.get(i);
        m localm = r.aix().cv(localbic.ndE, this.cvz);
        Object localObject;
        if ((localm == null) || (localm.version != localbic.Version))
        {
          com.tencent.mm.a.e.deleteFile(str + r.aix().cx(localbic.ndE, this.cvz));
          localObject = a(localbic);
          ((m)localObject).bJt = -1;
          if (localm != null)
            break label352;
          r.aix().a((m)localObject);
        }
        while (true)
        {
          localObject = new j(((m)localObject).id, 9);
          g.RO().eJo.a((com.tencent.mm.ai.m)localObject, 0);
          if (aa.a(localbic.vFG) != null)
            ab.v("MicroMsg.NetSceneGetPackageList", "xml:".concat(String.valueOf(new String(aa.a(localbic.vFG)))));
          if (aa.a(localbic.wLt) != null)
            ab.v("MicroMsg.NetSceneGetPackageList", "xml2:".concat(String.valueOf(new String(aa.a(localbic.wLt)))));
          ab.v("MicroMsg.NetSceneGetPackageList", "xml3:" + localbic.toString());
          ab.v("MicroMsg.NetSceneGetPackageList", "xml4:" + localbic.Name);
          ab.v("MicroMsg.NetSceneGetPackageList", "xml5:" + localbic.PackName);
          i++;
          break;
          label352: r.aix().b((m)localObject);
        }
      }
      AppMethodBeat.o(78463);
    }
  }

  private void h(LinkedList<bic> paramLinkedList)
  {
    AppMethodBeat.i(78464);
    if ((paramLinkedList == null) || (paramLinkedList.size() <= 0))
    {
      ab.e("MicroMsg.NetSceneGetPackageList", "empty background pkg list");
      AppMethodBeat.o(78464);
    }
    while (true)
    {
      return;
      r.aix();
      String str = n.aiu();
      int i = 0;
      if (i < paramLinkedList.size())
      {
        Object localObject1 = (bic)paramLinkedList.get(i);
        Object localObject2 = r.aix().cv(((bic)localObject1).ndE, this.cvz);
        m localm;
        if ((localObject2 == null) || (((m)localObject2).version != ((bic)localObject1).Version))
        {
          com.tencent.mm.a.e.deleteFile(str + r.aix().cx(((bic)localObject1).ndE, this.cvz));
          localm = a((bic)localObject1);
          localm.bJt = -1;
          if (localObject2 != null)
            break label272;
        }
        label272: for (boolean bool = r.aix().a(localm); ; bool = r.aix().b(localm))
        {
          ab.i("MicroMsg.NetSceneGetPackageList", "[updateBackgroundPkg] ret:%s newInfo:%s", new Object[] { Boolean.valueOf(bool), localm });
          localObject2 = aa.a(((bic)localObject1).vFG);
          if ((localObject2 != null) && (localObject2.length > 0))
          {
            r.aix();
            localObject1 = n.cw(((bic)localObject1).ndE, this.cvz);
            com.tencent.mm.a.e.deleteFile(str + (String)localObject1);
            if (com.tencent.mm.a.e.b(str, (String)localObject1, (byte[])localObject2) < 0)
              ab.e("MicroMsg.NetSceneGetPackageList", "[updateBackgroundPkg] appendBuf thumb error!");
          }
          i++;
          break;
        }
      }
      AppMethodBeat.o(78464);
    }
  }

  @Deprecated
  private void i(LinkedList<bic> paramLinkedList)
  {
    AppMethodBeat.i(78465);
    if ((paramLinkedList == null) || (paramLinkedList.size() <= 0))
    {
      ab.d("MicroMsg.NetSceneGetPackageList", "empty emoji pkg list");
      AppMethodBeat.o(78465);
    }
    while (true)
    {
      return;
      int i = 0;
      if (i < paramLinkedList.size())
      {
        Object localObject1 = (bic)paramLinkedList.get(i);
        Object localObject2 = r.aix().cv(((bic)localObject1).ndE, this.cvz);
        m localm = a((bic)localObject1);
        localm.bJt = -1;
        if (localObject2 == null)
          r.aix().a(localm);
        while (true)
        {
          localObject2 = aa.a(((bic)localObject1).vFG);
          if ((localObject2 != null) && (localObject2.length > 0))
          {
            localObject1 = new ArrayList();
            ((List)localObject1).add(new String((byte[])localObject2));
            ((List)localObject1).size();
          }
          i++;
          break;
          r.aix().b(localm);
        }
      }
      AppMethodBeat.o(78465);
    }
  }

  private void j(LinkedList<bic> paramLinkedList)
  {
    AppMethodBeat.i(78466);
    if ((paramLinkedList == null) || (paramLinkedList.size() <= 0))
    {
      ab.d("MicroMsg.NetSceneGetPackageList", "empty emoji pkg list");
      AppMethodBeat.o(78466);
    }
    while (true)
    {
      return;
      ab.d("MicroMsg.NetSceneGetPackageList", "pkgList size " + paramLinkedList.size());
      r.aix();
      String str1 = n.aiu();
      int i = 0;
      while (i < paramLinkedList.size())
      {
        bic localbic = (bic)paramLinkedList.get(i);
        m localm = r.aix().cv(localbic.ndE, this.cvz);
        byte[] arrayOfByte = aa.a(localbic.vFG);
        if (localbic.vFG == null)
        {
          ab.e("MicroMsg.NetSceneGetPackageList", "error give me a null thumb it should be xml");
          i++;
        }
        else
        {
          String str2;
          Object localObject;
          if ((localm == null) || (localm.version != localbic.Version))
          {
            str2 = new String(arrayOfByte);
            localObject = "zh_CN";
            if (str2.indexOf("zh_CN") >= 0)
            {
              label179: str2 = (String)localObject + "_ARTIST.mm";
              com.tencent.mm.a.e.deleteFile(str1 + str2);
              com.tencent.mm.a.e.deleteFile(str1 + (String)localObject + "_ARTISTF.mm");
              com.tencent.mm.a.e.b(str1, str2, arrayOfByte);
            }
          }
          else
          {
            localObject = a(localbic);
            ((m)localObject).bJt = -1;
            if (localm != null)
              break label399;
            r.aix().a((m)localObject);
          }
          while (true)
          {
            ab.d("MicroMsg.NetSceneGetPackageList", localbic.Name + " - " + localbic.ndE + " - " + localbic.PackName + " - " + localbic.jCo);
            break;
            localObject = "en";
            if (str2.indexOf("en") >= 0)
              break label179;
            localObject = "zh_TW";
            if (str2.indexOf("zh_TW") >= 0)
              break label179;
            localObject = "en";
            break label179;
            label399: r.aix().b((m)localObject);
          }
        }
      }
      AppMethodBeat.o(78466);
    }
  }

  private void k(LinkedList<bic> paramLinkedList)
  {
    AppMethodBeat.i(78467);
    if ((paramLinkedList == null) || (paramLinkedList.size() <= 0))
    {
      ab.d("MicroMsg.NetSceneGetPackageList", "empty config list");
      AppMethodBeat.o(78467);
    }
    while (true)
    {
      return;
      ab.d("MicroMsg.NetSceneGetPackageList", "updateConfigList pkgList size " + paramLinkedList.size());
      int i = 0;
      while (true)
        if (i < paramLinkedList.size())
        {
          Object localObject1 = (bic)paramLinkedList.get(i);
          Object localObject2 = r.aix().cv(((bic)localObject1).ndE, this.cvz);
          Object localObject3 = a((bic)localObject1);
          ((m)localObject3).bJt = -1;
          int j;
          if (localObject2 == null)
          {
            r.aix().a((m)localObject3);
            ab.d("MicroMsg.NetSceneGetPackageList", ((bic)localObject1).Name + " - " + ((bic)localObject1).ndE + " - " + ((bic)localObject1).PackName + " - " + ((bic)localObject1).jCo);
            localObject3 = aa.a(((bic)localObject1).vFG);
            ab.d("MicroMsg.NetSceneGetPackageList", "ConfigList xml : ".concat(String.valueOf(new String((byte[])localObject3))));
            localObject2 = ((com.tencent.mm.plugin.zero.b.a)g.K(com.tencent.mm.plugin.zero.b.a.class)).Nv();
            j = ((bic)localObject1).ndE;
            localObject1 = new File(c.evW);
            if (!((File)localObject1).exists())
              ((File)localObject1).mkdir();
          }
          try
          {
            localObject1 = new java/io/File;
            ((File)localObject1).<init>(c.iY(j));
            if (!((File)localObject1).exists())
              ((File)localObject1).createNewFile();
            com.tencent.mm.a.e.b(c.iY(j), (byte[])localObject3, localObject3.length);
            localObject1 = new java/lang/String;
            ((String)localObject1).<init>((byte[])localObject3);
            ((c)localObject2).o(j, (String)localObject1);
            i++;
            continue;
            r.aix().b((m)localObject3);
          }
          catch (Exception localException)
          {
            while (true)
              ab.e("MicroMsg.ConfigListDecoder", "exception:%s", new Object[] { bo.l(localException) });
          }
        }
      AppMethodBeat.o(78467);
    }
  }

  private void l(LinkedList<bic> paramLinkedList)
  {
    AppMethodBeat.i(78468);
    if ((paramLinkedList == null) || (paramLinkedList.size() <= 0))
    {
      ab.d("MicroMsg.NetSceneGetPackageList", "empty regioncode pkg list");
      AppMethodBeat.o(78468);
    }
    while (true)
    {
      return;
      ab.d("MicroMsg.NetSceneGetPackageList", "pkgList size " + paramLinkedList.size());
      Iterator localIterator = paramLinkedList.iterator();
      if (localIterator.hasNext())
      {
        paramLinkedList = (bic)localIterator.next();
        m localm1 = r.aix().cv(paramLinkedList.ndE, this.cvz);
        m localm2 = a(paramLinkedList);
        localm2.bJt = -1;
        if (localm1 == null)
          r.aix().a(localm2);
        while (true)
        {
          ab.d("MicroMsg.NetSceneGetPackageList", paramLinkedList.Name + " - " + paramLinkedList.ndE + " - " + paramLinkedList.PackName + " - " + paramLinkedList.jCo);
          break;
          r.aix().b(localm2);
        }
      }
      AppMethodBeat.o(78468);
    }
  }

  private void m(LinkedList<bic> paramLinkedList)
  {
    AppMethodBeat.i(78469);
    if ((paramLinkedList == null) || (paramLinkedList.size() <= 0))
    {
      ab.e("MicroMsg.NetSceneGetPackageList", "empty address pkg list");
      AppMethodBeat.o(78469);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.NetSceneGetPackageList", "updateRcptAddress pkgList size " + paramLinkedList.size());
      int i = 0;
      if (i < paramLinkedList.size())
      {
        Object localObject1 = (bic)paramLinkedList.get(i);
        Object localObject2 = r.aix().cv(((bic)localObject1).ndE, this.cvz);
        localObject1 = a((bic)localObject1);
        ((m)localObject1).bJt = -1;
        if (localObject2 == null)
          r.aix().a((m)localObject1);
        while (true)
        {
          localObject2 = new j(((m)localObject1).id, 12);
          g.RO().eJo.a((com.tencent.mm.ai.m)localObject2, 0);
          i++;
          break;
          r.aix().b((m)localObject1);
        }
      }
      AppMethodBeat.o(78469);
    }
  }

  private void n(LinkedList<bic> paramLinkedList)
  {
    AppMethodBeat.i(78473);
    ab.d("MicroMsg.NetSceneGetPackageList", "updateLangPkg");
    if ((paramLinkedList == null) || (paramLinkedList.size() == 0))
    {
      ab.d("MicroMsg.NetSceneGetPackageList", "empty langage package list");
      AppMethodBeat.o(78473);
    }
    while (true)
    {
      return;
      Iterator localIterator = paramLinkedList.iterator();
      while (localIterator.hasNext())
      {
        Object localObject = (bic)localIterator.next();
        ab.d("MicroMsg.NetSceneGetPackageList", "pkg.toString %s", new Object[] { localObject.toString() });
        paramLinkedList = r.aix().cv(((bic)localObject).ndE, this.cvz);
        localObject = a((bic)localObject);
        ((m)localObject).bJt = -1;
        if (paramLinkedList == null)
          r.aix().a((m)localObject);
        else
          r.aix().b((m)localObject);
      }
      AppMethodBeat.o(78473);
    }
  }

  private void o(LinkedList<bic> paramLinkedList)
  {
    AppMethodBeat.i(78474);
    ab.d("MicroMsg.NetSceneGetPackageList", "updateAppleEmojiPackage");
    if ((paramLinkedList == null) || (paramLinkedList.size() == 0))
    {
      ab.d("MicroMsg.NetSceneGetPackageList", "update apple emoji but package list is empty.");
      AppMethodBeat.o(78474);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.NetSceneGetPackageList", "start update apple emoji. package list size " + paramLinkedList.size());
      paramLinkedList = paramLinkedList.iterator();
      while (paramLinkedList.hasNext())
      {
        Object localObject1 = (bic)paramLinkedList.next();
        Object localObject2 = r.aix().cv(((bic)localObject1).ndE, this.cvz);
        if ((localObject2 == null) || (((m)localObject2).version != ((bic)localObject1).Version))
        {
          localObject1 = a((bic)localObject1);
          ((m)localObject1).bJt = -1;
          if (localObject2 == null)
            r.aix().a((m)localObject1);
          while (true)
          {
            localObject2 = new j(((m)localObject1).id, 37);
            g.RO().eJo.a((com.tencent.mm.ai.m)localObject2, 0);
            break;
            r.aix().b((m)localObject1);
          }
        }
      }
      AppMethodBeat.o(78474);
    }
  }

  public final int a(com.tencent.mm.network.e parame, f paramf)
  {
    AppMethodBeat.i(78460);
    this.ehi = paramf;
    ab.d("MicroMsg.NetSceneGetPackageList", "DoScene dkregcode :" + this.cvz);
    paramf = new b.a();
    paramf.fsJ = new alw();
    paramf.fsK = new alx();
    paramf.uri = "/cgi-bin/micromsg-bin/getpackagelist";
    paramf.fsI = 159;
    paramf.fsL = 51;
    paramf.fsM = 1000000051;
    this.ehh = paramf.acD();
    paramf = (alw)this.ehh.fsG.fsP;
    LinkedList localLinkedList = new LinkedList();
    int i;
    if (!g.RN().QY())
    {
      AppMethodBeat.o(78460);
      i = -1;
    }
    while (true)
    {
      return i;
      m[] arrayOfm = r.aix().lU(this.cvz);
      if ((arrayOfm != null) && (arrayOfm.length > 0))
      {
        i = 0;
        if (i < arrayOfm.length)
        {
          bic localbic = new bic();
          localbic.ndE = arrayOfm[i].id;
          if ((ae.gip) && (this.cvz == 7))
            ab.d("MicroMsg.NetSceneGetPackageList", "isShakeGetConfigList");
          for (localbic.Version = 0; ; localbic.Version = arrayOfm[i].version)
          {
            ab.d("MicroMsg.NetSceneGetPackageList", "package, id:%d, ver:%d", new Object[] { Integer.valueOf(localbic.ndE), Integer.valueOf(localbic.Version) });
            localLinkedList.add(localbic);
            i++;
            break;
          }
        }
      }
      paramf.jBw = localLinkedList;
      paramf.jBv = localLinkedList.size();
      paramf.jCt = this.cvz;
      if (this.flags != -1)
        paramf.vEq = this.flags;
      i = a(parame, this.ehh, this);
      AppMethodBeat.o(78460);
    }
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(78462);
    ab.i("MicroMsg.NetSceneGetPackageList", "onGYNetEnd, netid:%d, errType:%d, errCode:%d, pkgType:%d, errMsg:%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Integer.valueOf(this.cvz), paramString });
    if ((paramInt2 != 0) && (paramInt3 != 0))
    {
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(78462);
    }
    while (true)
    {
      return;
      paramArrayOfByte = (alx)((com.tencent.mm.ai.b)paramq).fsH.fsP;
      if (paramArrayOfByte.jCt != this.cvz)
      {
        ab.e("MicroMsg.NetSceneGetPackageList", "packageType is not consistent, respType = %d", new Object[] { Integer.valueOf(paramArrayOfByte.jCt) });
        this.ehi.onSceneEnd(3, -1, "", this);
        AppMethodBeat.o(78462);
      }
      else
      {
        paramq = paramArrayOfByte.jBw;
        Object localObject1 = new StringBuilder("summer list size:");
        if (paramq == null)
        {
          paramInt1 = 0;
          label184: ab.i("MicroMsg.NetSceneGetPackageList", paramInt1 + " packageType: " + this.cvz + " resp.Type: " + paramArrayOfByte.jCt);
          if (this.cvz != 2)
            break label336;
          i(paramq);
        }
        while (true)
        {
          localObject1 = new tu();
          ((tu)localObject1).cPV.cPW = paramq;
          ((tu)localObject1).cPV.cvz = this.cvz;
          com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject1);
          if (paramArrayOfByte.vQe <= 0)
            break label1395;
          if (a(this.ftf, this.ehi) != -1)
            break label1418;
          this.ehi.onSceneEnd(3, -1, "doScene failed", this);
          AppMethodBeat.o(78462);
          break;
          paramInt1 = paramq.size();
          break label184;
          label336: if (this.cvz == 1)
          {
            h(paramq);
          }
          else if (this.cvz == 4)
          {
            j(paramq);
          }
          else if (this.cvz == 6)
          {
            ab.i("MicroMsg.NetSceneGetPackageList", "change new egg.");
          }
          else if (this.cvz == 7)
          {
            k(paramq);
          }
          else if (this.cvz == 9)
          {
            g(paramq);
          }
          else
          {
            Object localObject2;
            if (this.cvz == 10)
            {
              if ((paramq == null) || (paramq.size() <= 0))
              {
                ab.e("MicroMsg.NetSceneGetPackageList", "empty mass send top config package");
              }
              else
              {
                ab.d("MicroMsg.NetSceneGetPackageList", "pkgList size " + paramq.size());
                localObject2 = (bic)paramq.get(0);
                localObject1 = r.aix().cv(((bic)localObject2).ndE, this.cvz);
                localObject2 = a((bic)localObject2);
                ((m)localObject2).bJt = -1;
                if (localObject1 == null)
                  r.aix().a((m)localObject2);
                else
                  r.aix().b((m)localObject2);
              }
            }
            else if (this.cvz != 11)
              if (this.cvz == 12)
                m(paramq);
              else if (this.cvz == 5)
                n(paramq);
              else if (this.cvz == 20)
                l(paramq);
              else if (this.cvz == 17)
              {
                if ((paramq == null) || (paramq.size() == 0))
                {
                  ab.d("MicroMsg.NetSceneGetPackageList", "poi type is null");
                }
                else
                {
                  localObject1 = (bic)paramq.get(0);
                  ab.d("MicroMsg.NetSceneGetPackageList", ((bic)localObject1).Name + " - " + ((bic)localObject1).ndE + " - " + ((bic)localObject1).PackName + " - " + ((bic)localObject1).jCo);
                  localObject2 = r.aix().cv(((bic)localObject1).ndE, this.cvz);
                  m localm2 = a((bic)localObject1);
                  localm2.bJt = -1;
                  if (localObject2 == null)
                  {
                    r.aix().a(localm2);
                    localObject2 = new mn();
                  }
                  try
                  {
                    ((mn)localObject2).cIq.content = aa.a(((bic)localObject1).vFG);
                    if (((mn)localObject2).cIq.content == null)
                      continue;
                    com.tencent.mm.sdk.b.a.xxA.a((com.tencent.mm.sdk.b.b)localObject2, Looper.getMainLooper());
                    continue;
                    r.aix().b(localm2);
                  }
                  catch (Exception localException)
                  {
                    ab.e("MicroMsg.NetSceneGetPackageList", localException.getMessage());
                  }
                }
              }
              else if (this.cvz != 18)
                if (this.cvz == 19)
                {
                  ae(paramq);
                }
                else
                {
                  m localm1;
                  if (this.cvz == 21)
                  {
                    if ((paramq == null) || (paramq.size() <= 0))
                    {
                      ab.d("MicroMsg.NetSceneGetPackageList", "summer trace config empty scene list");
                    }
                    else
                    {
                      localObject2 = (bic)paramq.get(0);
                      ab.d("MicroMsg.NetSceneGetPackageList", "summer getpackage pkg: " + localObject2 + "|id = " + ((bic)localObject2).ndE + "|Name = " + ((bic)localObject2).Name + "|PackName = " + ((bic)localObject2).PackName + "|Size = " + ((bic)localObject2).jCo + "|Version = " + ((bic)localObject2).Version);
                      localm1 = r.aix().cv(((bic)localObject2).ndE, this.cvz);
                      localObject2 = a((bic)localObject2);
                      ((m)localObject2).bJt = -1;
                      if (localm1 == null)
                        r.aix().a((m)localObject2);
                      else if (localm1.version < ((m)localObject2).version)
                        r.aix().b((m)localObject2);
                      else
                        ab.d("MicroMsg.NetSceneGetPackageList", "summer old version [%d] new version[%d], not need update", new Object[] { Integer.valueOf(localm1.version), Integer.valueOf(((m)localObject2).version) });
                    }
                  }
                  else if (23 == this.cvz)
                  {
                    if ((paramq == null) || (paramq.size() <= 0))
                    {
                      ab.d("MicroMsg.NetSceneGetPackageList", "permission tips config is empty");
                    }
                    else
                    {
                      localObject2 = (bic)paramq.get(0);
                      ab.d("MicroMsg.NetSceneGetPackageList", "permission getpackage pkg: " + localObject2 + "|id = " + ((bic)localObject2).ndE + "|Name = " + ((bic)localObject2).Name + "|PackName = " + ((bic)localObject2).PackName + "|Size = " + ((bic)localObject2).jCo + "|Version = " + ((bic)localObject2).Version);
                      localm1 = r.aix().cv(((bic)localObject2).ndE, this.cvz);
                      localObject2 = a((bic)localObject2);
                      ((m)localObject2).bJt = -1;
                      if (localm1 == null)
                        r.aix().a((m)localObject2);
                      else if (localm1.version < ((m)localObject2).version)
                        r.aix().b((m)localObject2);
                    }
                  }
                  else if (this.cvz == 26)
                    af(paramq);
                  else if (this.cvz == 36)
                    ag(paramq);
                  else if (this.cvz == 37)
                    o(paramq);
                }
          }
        }
        label1395: this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
        AppMethodBeat.o(78462);
        continue;
        label1418: AppMethodBeat.o(78462);
      }
    }
  }

  public final void a(m.a parama)
  {
  }

  public final boolean acI()
  {
    return true;
  }

  public final int acR()
  {
    return this.cvz;
  }

  public final int acn()
  {
    return 20;
  }

  public final m.b b(q paramq)
  {
    return m.b.ftu;
  }

  public final boolean b(com.tencent.mm.ai.m paramm)
  {
    boolean bool = true;
    if (!(paramm instanceof k));
    while (true)
    {
      return bool;
      if (this.cvz == ((k)paramm).cvz)
        bool = false;
    }
  }

  public final int getType()
  {
    return 159;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ba.k
 * JD-Core Version:    0.6.2
 */