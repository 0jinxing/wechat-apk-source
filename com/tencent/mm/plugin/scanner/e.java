package com.tencent.mm.plugin.scanner;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory.Options;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.cd.h.d;
import com.tencent.mm.g.a.ao;
import com.tencent.mm.g.a.pu;
import com.tencent.mm.g.a.pv;
import com.tencent.mm.g.b.a.r;
import com.tencent.mm.model.at;
import com.tencent.mm.platformtools.t;
import com.tencent.mm.platformtools.t.a;
import com.tencent.mm.plugin.scanner.a.k;
import com.tencent.mm.plugin.scanner.a.o;
import com.tencent.mm.plugin.scanner.util.n.a;
import com.tencent.mm.plugin.scanner.util.n.b;
import com.tencent.mm.protocal.protobuf.bef;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.br;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class e
  implements f, at
{
  private static HashMap<Integer, h.d> eaA;

  @SuppressLint({"UseSparseArrays"})
  private static HashMap<Integer, h.d> jZD;
  public String eJM;
  private t.a jZF;
  public com.tencent.mm.plugin.u.a.b pYI;
  private k pYJ;
  private o pYK;
  private com.tencent.mm.plugin.scanner.a.n pYL;
  public com.tencent.mm.plugin.scanner.util.p pYM;
  public com.tencent.mm.plugin.scanner.util.n pYN;
  private com.tencent.mm.plugin.scanner.b.a pYO;
  private com.tencent.mm.plugin.scanner.b.b pYP;
  private HashMap<Integer, com.tencent.mm.plugin.scanner.a.q> pYQ;
  private HashMap<Integer, r> pYR;
  private HashMap<Integer, Long> pYS;
  private n.b pYT;
  private com.tencent.mm.sdk.b.c<ao> pYU;
  private com.tencent.mm.sdk.b.c<pu> pYV;
  private com.tencent.mm.plugin.scanner.a.b pYW;

  static
  {
    AppMethodBeat.i(80798);
    jZD = new HashMap();
    HashMap localHashMap = new HashMap();
    eaA = localHashMap;
    localHashMap.put(Integer.valueOf("SCANHISTORY_TABLE".hashCode()), new e.5());
    eaA.put(Integer.valueOf("scan_translation_result_table".hashCode()), new e.6());
    AppMethodBeat.o(80798);
  }

  public e()
  {
    AppMethodBeat.i(80781);
    this.pYI = new com.tencent.mm.plugin.u.a.b();
    this.pYJ = new k();
    this.pYK = new o();
    this.pYL = new com.tencent.mm.plugin.scanner.a.n();
    this.pYM = new com.tencent.mm.plugin.scanner.util.p();
    this.pYN = new com.tencent.mm.plugin.scanner.util.n();
    this.pYQ = new HashMap();
    this.pYR = new HashMap();
    this.pYS = new HashMap();
    this.pYT = new e.1(this);
    this.pYU = new e.2(this);
    this.pYV = new e.3(this);
    this.pYW = new com.tencent.mm.plugin.scanner.a.b();
    AppMethodBeat.o(80781);
  }

  private void BS(int paramInt)
  {
    AppMethodBeat.i(80782);
    pv localpv = new pv();
    localpv.cMa.ctE = paramInt;
    localpv.cMa.ctn = false;
    com.tencent.mm.sdk.b.a.xxA.m(localpv);
    this.pYQ.remove(Integer.valueOf(paramInt));
    AppMethodBeat.o(80782);
  }

  public static String Wb(String paramString)
  {
    AppMethodBeat.i(80791);
    paramString = cgB() + String.format("%s_%d.%s", new Object[] { "translation", Long.valueOf(System.currentTimeMillis()), paramString });
    AppMethodBeat.o(80791);
    return paramString;
  }

  public static String Wc(String paramString)
  {
    AppMethodBeat.i(80792);
    paramString = cgA() + String.format("%s_%d.%s", new Object[] { "tmp", Long.valueOf(System.currentTimeMillis()), paramString });
    AppMethodBeat.o(80792);
    return paramString;
  }

  public static String Wd(String paramString)
  {
    AppMethodBeat.i(80793);
    paramString = String.format("%s.%s", new Object[] { cgA() + "scan_translation_bg", paramString });
    AppMethodBeat.o(80793);
    return paramString;
  }

  public static String cgA()
  {
    AppMethodBeat.i(80789);
    String str = cgz() + "scan_camera/";
    AppMethodBeat.o(80789);
    return str;
  }

  private static String cgB()
  {
    AppMethodBeat.i(80790);
    String str = cgz() + "scan_result/";
    AppMethodBeat.o(80790);
    return str;
  }

  public static e cgy()
  {
    try
    {
      AppMethodBeat.i(80783);
      e locale = (e)com.tencent.mm.model.q.Y(e.class);
      AppMethodBeat.o(80783);
      return locale;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  private static String cgz()
  {
    AppMethodBeat.i(80788);
    Object localObject = new StringBuilder();
    com.tencent.mm.kernel.g.RQ();
    localObject = com.tencent.mm.kernel.g.RP().eJM + "scanner/";
    AppMethodBeat.o(80788);
    return localObject;
  }

  public final HashMap<Integer, h.d> Jx()
  {
    return eaA;
  }

  public final void bA(boolean paramBoolean)
  {
    AppMethodBeat.i(80786);
    ab.d("MicroMsg.scanner.SubCoreScanner", "onSdcardMount " + com.tencent.mm.kernel.g.RP().eJM);
    Object localObject = com.tencent.mm.kernel.g.RP().eJM;
    ab.d("MicroMsg.scanner.SubCoreScanner", "resetAccPath on accPath : ".concat(String.valueOf(localObject)));
    this.eJM = ((String)localObject);
    File localFile = new File((String)localObject);
    if (!localFile.exists())
      localFile.mkdirs();
    localFile = new File((String)localObject + "image/scan/img");
    if (!localFile.exists())
      localFile.mkdirs();
    localObject = new File((String)localObject + "image/scan/music");
    if (!((File)localObject).exists())
      ((File)localObject).mkdirs();
    localObject = new File(cgz());
    if (!((File)localObject).exists())
      ((File)localObject).mkdirs();
    cgy();
    com.tencent.mm.vfs.e.ate(cgA());
    cgy();
    com.tencent.mm.vfs.e.ate(cgB());
    AppMethodBeat.o(80786);
  }

  public final void bz(boolean paramBoolean)
  {
    AppMethodBeat.i(80785);
    Object localObject = com.tencent.mm.kernel.g.RP().cachePath + "CommonOneMicroMsg.db";
    this.jZF = t.a(hashCode(), (String)localObject, jZD, false);
    localObject = this.pYW;
    com.tencent.mm.sdk.b.a.xxA.c(((com.tencent.mm.plugin.scanner.a.b)localObject).pZy);
    com.tencent.mm.sdk.b.a.xxA.c(((com.tencent.mm.plugin.scanner.a.b)localObject).pZz);
    com.tencent.mm.sdk.b.a.xxA.c(this.pYJ);
    com.tencent.mm.sdk.b.a.xxA.c(this.pYK.qah);
    com.tencent.mm.sdk.b.a.xxA.c(this.pYK.qai);
    com.tencent.mm.sdk.b.a.xxA.b(this.pYL);
    com.tencent.mm.sdk.b.a.xxA.b(this.pYV);
    com.tencent.mm.sdk.b.a.xxA.b(this.pYU);
    com.tencent.mm.kernel.g.Rg().a(294, this);
    localObject = ((com.tencent.mm.plugin.zero.b.a)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.zero.b.a.class)).Nu().getValue("NewOCRTranslationRedDot");
    ab.i("MicroMsg.scanner.SubCoreScanner", "redDotStr %s", new Object[] { localObject });
    if (!bo.isNullOrNil((String)localObject))
    {
      localObject = br.z((String)localObject, "Id");
      if (((Map)localObject).containsKey(".Id"))
      {
        int i = bo.getInt((String)((Map)localObject).get(".Id"), 0);
        int j = com.tencent.mm.kernel.g.RP().Ry().getInt(ac.a.xVM, 0);
        if ((i != 0) && (j != i))
        {
          com.tencent.mm.kernel.g.RP().Ry().set(ac.a.xVM, Integer.valueOf(i));
          com.tencent.mm.x.c.PK().b(ac.a.xVK, true);
        }
      }
    }
    com.tencent.mm.sdk.g.d.post(new e.4(this), "MicroMsg.scanner.SubCoreScannerdeleteOutDateImg");
    AppMethodBeat.o(80785);
  }

  public final com.tencent.mm.plugin.scanner.b.a cgC()
  {
    AppMethodBeat.i(80794);
    com.tencent.mm.kernel.g.RN().QU();
    if (this.pYO == null)
      this.pYO = new com.tencent.mm.plugin.scanner.b.a(com.tencent.mm.kernel.g.RP().eJN);
    com.tencent.mm.plugin.scanner.b.a locala = this.pYO;
    AppMethodBeat.o(80794);
    return locala;
  }

  public final com.tencent.mm.plugin.scanner.b.b cgD()
  {
    AppMethodBeat.i(80795);
    com.tencent.mm.kernel.g.RN().QU();
    if (this.pYP == null)
      this.pYP = new com.tencent.mm.plugin.scanner.b.b(com.tencent.mm.kernel.g.RP().eJN);
    com.tencent.mm.plugin.scanner.b.b localb = this.pYP;
    AppMethodBeat.o(80795);
    return localb;
  }

  public final String fQ(String paramString1, String paramString2)
  {
    AppMethodBeat.i(80787);
    if ((com.tencent.mm.kernel.g.RK()) && (!bo.isNullOrNil(paramString1)))
    {
      paramString1 = String.format("%s/scanbook%s_%s", new Object[] { this.eJM + "image/scan/img", paramString2, com.tencent.mm.a.g.x(paramString1.getBytes()) });
      AppMethodBeat.o(80787);
    }
    while (true)
    {
      return paramString1;
      paramString1 = "";
      AppMethodBeat.o(80787);
    }
  }

  public final void iy(int paramInt)
  {
  }

  public final void onAccountRelease()
  {
    AppMethodBeat.i(80784);
    com.tencent.mm.sdk.b.a.xxA.d(this.pYJ);
    com.tencent.mm.sdk.b.a.xxA.d(this.pYK.qah);
    com.tencent.mm.sdk.b.a.xxA.d(this.pYK.qai);
    com.tencent.mm.sdk.b.a.xxA.d(this.pYL);
    com.tencent.mm.sdk.b.a.xxA.d(this.pYV);
    com.tencent.mm.sdk.b.a.xxA.d(this.pYU);
    com.tencent.mm.kernel.g.Rg().b(294, this);
    Object localObject = this.pYW;
    com.tencent.mm.sdk.b.a.xxA.d(((com.tencent.mm.plugin.scanner.a.b)localObject).pZy);
    com.tencent.mm.sdk.b.a.xxA.d(((com.tencent.mm.plugin.scanner.a.b)localObject).pZz);
    ((com.tencent.mm.plugin.scanner.a.b)localObject).cgE();
    localObject = this.pYI;
    ((com.tencent.mm.plugin.u.a.b)localObject).fGz.clear();
    ((com.tencent.mm.plugin.u.a.b)localObject).ce.clear();
    ((com.tencent.mm.plugin.u.a.b)localObject).pAo.clear();
    if (this.jZF != null)
    {
      this.jZF.mJ(hashCode());
      this.jZF = null;
    }
    this.eJM = "";
    AppMethodBeat.o(80784);
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(80796);
    ab.i("MicroMsg.scanner.SubCoreScanner", "onSceneEnd errType %d, errCode %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    int i;
    List localList;
    Object localObject;
    float f;
    if (paramm.getType() == 294)
    {
      i = ((com.tencent.mm.plugin.scanner.a.e)paramm).ctE;
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        localList = ((com.tencent.mm.plugin.scanner.a.e)paramm).pZB;
        if (localList != null)
        {
          ab.i("MicroMsg.scanner.SubCoreScanner", "session %d, angle %f, translationInfos length %d", new Object[] { Integer.valueOf(i), Float.valueOf(((com.tencent.mm.plugin.scanner.a.e)paramm).angle), Integer.valueOf(localList.size()) });
          if (this.pYR.containsKey(Integer.valueOf(i)))
            ((r)this.pYR.get(Integer.valueOf(i))).cWZ = (System.currentTimeMillis() - ((com.tencent.mm.plugin.scanner.a.e)paramm).pZC);
          if ((localList.size() > 0) && (this.pYQ.containsKey(Integer.valueOf(i))))
          {
            localObject = (com.tencent.mm.plugin.scanner.a.q)this.pYQ.get(Integer.valueOf(i));
            ((com.tencent.mm.plugin.scanner.a.q)localObject).cMc = ((bef)((com.tencent.mm.plugin.scanner.a.e)paramm).ehh.fsH.fsP).pZE;
            ((com.tencent.mm.plugin.scanner.a.q)localObject).cMd = ((com.tencent.mm.plugin.scanner.a.e)paramm).cgF();
            if (this.pYR.containsKey(Integer.valueOf(i)))
              ((r)this.pYR.get(Integer.valueOf(i))).cWX = 1L;
            paramString = cgy().pYN;
            f = ((com.tencent.mm.plugin.scanner.a.e)paramm).angle;
            localObject = ((com.tencent.mm.plugin.scanner.a.q)localObject).qal;
            paramm = this.pYT;
            if ((i != 0) && (localList != null) && (localList.size() > 0) && (paramm != null))
            {
              localObject = com.tencent.mm.sdk.platformtools.d.decodeFile((String)localObject, new BitmapFactory.Options());
              if (localObject == null)
              {
                paramm.b(i, null);
                AppMethodBeat.o(80796);
              }
            }
          }
        }
      }
    }
    while (true)
    {
      return;
      if ((paramString.qiA != 0) && (i != paramString.qiA))
      {
        ab.i("MicroMsg.ScanTranslationRender", "stop current session %d, start new session %d", new Object[] { Integer.valueOf(paramString.qiA), Integer.valueOf(i) });
        paramString.cim();
      }
      paramString.qiA = i;
      paramString.qiB = paramm;
      paramString.qiC = new n.a(paramString, i, localList, f, (Bitmap)localObject);
      paramString.qiC.u(new Void[0]);
      AppMethodBeat.o(80796);
      continue;
      if ((this.pYR.containsKey(Integer.valueOf(i))) && (this.pYS.containsKey(Integer.valueOf(i))))
        ((r)this.pYR.get(Integer.valueOf(i))).cXa = (System.currentTimeMillis() - ((Long)this.pYS.get(Integer.valueOf(i))).longValue());
      BS(i);
      AppMethodBeat.o(80796);
      continue;
      if ((this.pYR.containsKey(Integer.valueOf(i))) && (this.pYS.containsKey(Integer.valueOf(i))))
      {
        ((r)this.pYR.get(Integer.valueOf(i))).cXa = (System.currentTimeMillis() - ((Long)this.pYS.get(Integer.valueOf(i))).longValue());
        ((r)this.pYR.get(Integer.valueOf(i))).cWX = 5L;
        ((r)this.pYR.get(Integer.valueOf(i))).ajK();
        this.pYR.remove(Integer.valueOf(i));
        this.pYS.remove(Integer.valueOf(i));
        ab.i("MicroMsg.scanner.SubCoreScanner", "translationReports size %d, translationUpload size %d", new Object[] { Integer.valueOf(this.pYR.size()), Integer.valueOf(this.pYS.size()) });
      }
      BS(i);
      AppMethodBeat.o(80796);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.scanner.e
 * JD-Core Version:    0.6.2
 */