package com.tencent.mm.plugin.sns.model;

import android.app.ActivityManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.database.sqlite.SQLiteException;
import android.graphics.Point;
import android.os.Build.VERSION;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cd.h.d;
import com.tencent.mm.g.a.cn;
import com.tencent.mm.g.a.hf;
import com.tencent.mm.g.a.lj;
import com.tencent.mm.g.a.lj.a;
import com.tencent.mm.g.a.lr;
import com.tencent.mm.model.at;
import com.tencent.mm.model.bz;
import com.tencent.mm.plugin.sns.a.b.i;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.a.e;
import com.tencent.mm.plugin.sns.storage.s;
import com.tencent.mm.plugin.sns.storage.w;
import com.tencent.mm.plugin.sns.storage.y;
import com.tencent.mm.plugin.sns.ui.ai;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bd.a;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.z;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;

public final class af
  implements at, com.tencent.mm.plugin.sns.b.j
{
  public static boolean qKD;
  private static int qKE;
  private static int qKF;
  private static int qKK;
  private static int qKL;
  private static String qLl;
  protected static HashMap<Integer, h.d> qLm;
  private static ak qLu;
  private static int qLv;
  private static Point qLw;
  private com.tencent.mm.cd.h eJN;
  private byte[] eMl;
  private ak handler;
  private com.tencent.mm.sdk.b.c oMA;
  private com.tencent.mm.sdk.g.b.a qKG;
  private com.tencent.mm.sdk.g.b.a qKH;
  private com.tencent.mm.sdk.g.b.a qKI;
  private com.tencent.mm.sdk.g.b.a qKJ;
  private s qKM;
  private com.tencent.mm.plugin.sns.storage.o qKN;
  private com.tencent.mm.plugin.sns.storage.f qKO;
  private com.tencent.mm.plugin.sns.storage.d qKP;
  private y qKQ;
  private g qKR;
  private com.tencent.mm.plugin.sns.storage.m qKS;
  private com.tencent.mm.plugin.sns.storage.k qKT;
  private com.tencent.mm.plugin.sns.storage.u qKU;
  private ad qKV;
  private am.a qKW;
  private b qKX;
  private aw qKY;
  private ai qKZ;
  private com.tencent.mm.plugin.sns.p qLA;
  private com.tencent.mm.plugin.sns.h qLB;
  private com.tencent.mm.plugin.sns.g qLC;
  private com.tencent.mm.plugin.sns.m qLD;
  private com.tencent.mm.plugin.sns.j qLE;
  private com.tencent.mm.plugin.sns.b qLF;
  private com.tencent.mm.plugin.sns.c qLG;
  private com.tencent.mm.plugin.sns.f qLH;
  private com.tencent.mm.sdk.b.c qLI;
  private com.tencent.mm.sdk.b.c qLJ;
  private com.tencent.mm.sdk.b.c qLK;
  private com.tencent.mm.sdk.b.c qLL;
  private com.tencent.mm.sdk.b.c qLM;
  private com.tencent.mm.sdk.b.c qLN;
  private com.tencent.mm.sdk.b.c qLO;
  private com.tencent.mm.sdk.b.c qLP;
  private com.tencent.mm.sdk.b.c qLQ;
  private com.tencent.mm.sdk.b.c qLR;
  private com.tencent.mm.sdk.b.c qLS;
  private com.tencent.mm.sdk.b.c qLT;
  private com.tencent.mm.sdk.b.c qLU;
  private com.tencent.mm.sdk.b.c qLV;
  private com.tencent.mm.sdk.b.c qLW;
  private com.tencent.mm.sdk.b.c qLX;
  private com.tencent.mm.sdk.b.c qLY;
  private com.tencent.mm.sdk.b.c qLZ;
  private com.tencent.mm.plugin.sns.g.c qLa;
  private com.tencent.mm.plugin.sns.g.g qLb;
  private com.tencent.mm.plugin.sns.storage.q qLc;
  private i qLd;
  private ao qLe;
  private boolean qLf;
  private boolean qLg;
  private w qLh;
  private boolean qLi;
  private byte[] qLj;
  private String qLk;
  private com.tencent.mm.plugin.sns.d qLn;
  private com.tencent.mm.plugin.sns.f.a qLo;
  private ar qLp;
  private com.tencent.mm.plugin.sns.lucky.a.f qLq;
  private com.tencent.mm.plugin.sns.lucky.a.j qLr;
  private com.tencent.mm.plugin.sns.lucky.a.d qLs;
  private com.tencent.mm.plugin.sns.lucky.a.l qLt;
  private com.tencent.mm.plugin.sns.n qLx;
  private com.tencent.mm.plugin.sns.k qLy;
  private com.tencent.mm.plugin.sns.e qLz;
  private com.tencent.mm.sdk.b.c qMa;
  private boolean qMb;
  private com.tencent.mm.sdk.b.c qMc;
  private com.tencent.mm.sdk.b.c qMd;

  static
  {
    AppMethodBeat.i(36524);
    qKD = true;
    qKE = 0;
    qKF = 0;
    qLl = "";
    qLm = new HashMap();
    qLv = 103;
    qLw = new Point();
    qLm.put(Integer.valueOf("CanvasInfo".hashCode()), new af.12());
    qLm.put(Integer.valueOf("UxCanvasInfo".hashCode()), new af.23());
    qLm.put(Integer.valueOf("SNSMEDIA_TABLE".hashCode()), new af.32());
    qLm.put(Integer.valueOf("SNSINFO_TABLE".hashCode()), new af.33());
    qLm.put(Integer.valueOf("SNSINFO_TABLE".hashCode()), new af.34());
    qLm.put(Integer.valueOf("ADSNSINFO_TABLE".hashCode()), new af.35());
    qLm.put(Integer.valueOf("SNSEXT_TABLE".hashCode()), new af.36());
    qLm.put(Integer.valueOf("SNSCOMMENT_TABLE".hashCode()), new af.37());
    qLm.put(Integer.valueOf("SNSTAGINFO_TABLE".hashCode()), new af.2());
    qLm.put(Integer.valueOf("SNSKVREPORT_TABLE".hashCode()), new af.3());
    AppMethodBeat.o(36524);
  }

  public af()
  {
    AppMethodBeat.i(36480);
    this.handler = new ak(Looper.getMainLooper());
    this.qLe = new ao();
    this.qLf = false;
    this.qLg = true;
    this.eMl = new byte[0];
    this.qLh = new w();
    this.qLi = false;
    this.qLj = new byte[0];
    this.qLq = new com.tencent.mm.plugin.sns.lucky.a.f();
    this.qLr = new com.tencent.mm.plugin.sns.lucky.a.j();
    this.qLs = new com.tencent.mm.plugin.sns.lucky.a.d();
    this.qLt = new com.tencent.mm.plugin.sns.lucky.a.l();
    this.qLI = new af.7(this);
    this.qLJ = new af.8(this);
    this.qLK = new af.9(this);
    this.qLL = new af.10(this);
    this.qLM = new af.11(this);
    this.qLN = new com.tencent.mm.sdk.b.c()
    {
    };
    this.qLO = new com.tencent.mm.sdk.b.c()
    {
      private static boolean a(lj paramAnonymouslj)
      {
        AppMethodBeat.i(36435);
        Object localObject1 = paramAnonymouslj.cHj.cCa;
        com.tencent.mm.plugin.sns.storage.o localo = af.cnF();
        paramAnonymouslj = af.Ru();
        long l1 = paramAnonymouslj.iV(-1L);
        try
        {
          Iterator localIterator = ((ArrayList)localObject1).iterator();
          while (localIterator.hasNext())
          {
            long l2 = ((Long)localIterator.next()).longValue();
            localObject1 = localo.DK((int)l2);
            if (localObject1 != null)
            {
              ((com.tencent.mm.plugin.sns.storage.n)localObject1).field_localFlag |= 64;
              ab.d("MicroMsg.SnsInfoStorage", "snsInfoId:%d, setOmitFailResend", new Object[] { Long.valueOf(l2) });
              localo.b((int)l2, (com.tencent.mm.plugin.sns.storage.n)localObject1);
            }
          }
        }
        finally
        {
          paramAnonymouslj.mB(l1);
          AppMethodBeat.o(36435);
        }
        paramAnonymouslj.mB(l1);
        AppMethodBeat.o(36435);
        return false;
      }
    };
    this.qLP = new af.15(this);
    this.qLQ = new af.16(this);
    this.qLR = new af.17(this);
    this.qLS = new af.18(this);
    this.qLT = new af.19(this);
    this.qLU = new com.tencent.mm.sdk.b.c()
    {
    };
    this.qLV = new af.21(this);
    this.qLW = new af.22(this);
    this.qLX = new af.24(this);
    this.qLY = new af.25(this);
    this.qLZ = new af.26(this);
    this.qMa = new com.tencent.mm.sdk.b.c()
    {
    };
    this.qMb = false;
    this.oMA = new af.29(this);
    this.qMc = new af.30(this);
    this.qMd = new af.31(this);
    ab.i("MicroMsg.SnsCore", "snscore create! " + Thread.currentThread().getId());
    if (this.qKI == null)
      this.qKI = com.tencent.mm.sdk.g.c.d.a("SnsCore_CDNDownload_handler", new LinkedBlockingQueue());
    if (this.qKH == null)
      this.qKH = com.tencent.mm.sdk.g.c.d.a("SnsCore_thumbDecode_handler", new LinkedBlockingQueue());
    if (this.qKG == null)
      this.qKG = com.tencent.mm.sdk.g.c.d.anP("SnsCore#File");
    if (this.qKJ == null)
      this.qKJ = com.tencent.mm.sdk.g.c.d.anP("SnsCore#Task");
    int i = ((ActivityManager)com.tencent.mm.sdk.platformtools.ah.getContext().getSystemService("activity")).getLargeMemoryClass();
    if (i > 256)
      if ((Build.VERSION.SDK_INT == 24) || (Build.VERSION.SDK_INT == 25))
        i = 3;
    while (true)
    {
      al.n(new af.1(this, i), 3000L);
      AppMethodBeat.o(36480);
      return;
      i = 6;
      continue;
      if (i > 128)
        i = 4;
      else
        i = 2;
    }
  }

  public static com.tencent.mm.cd.h Ru()
  {
    AppMethodBeat.i(36477);
    com.tencent.mm.cd.h localh = cnm().eJN;
    AppMethodBeat.o(36477);
    return localh;
  }

  public static ak bCo()
  {
    AppMethodBeat.i(36486);
    ak localak = cnm().handler;
    AppMethodBeat.o(36486);
    return localak;
  }

  private static Point bPg()
  {
    AppMethodBeat.i(36511);
    Object localObject = (WindowManager)com.tencent.mm.sdk.platformtools.ah.getContext().getSystemService("window");
    DisplayMetrics localDisplayMetrics = new DisplayMetrics();
    ((WindowManager)localObject).getDefaultDisplay().getMetrics(localDisplayMetrics);
    qLw.x = localDisplayMetrics.widthPixels;
    qLw.y = localDisplayMetrics.heightPixels;
    localObject = qLw;
    AppMethodBeat.o(36511);
    return localObject;
  }

  private static void checkDir()
  {
    AppMethodBeat.i(36516);
    com.tencent.mm.vfs.e.tf(((com.tencent.mm.plugin.sns.b.b)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.sns.b.b.class)).getAccSnsPath());
    com.tencent.mm.vfs.e.tf(((com.tencent.mm.plugin.sns.b.b)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.sns.b.b.class)).getAccSnsTmpPath());
    AppMethodBeat.o(36516);
  }

  public static b cnA()
  {
    AppMethodBeat.i(36496);
    com.tencent.mm.kernel.g.RN().QU();
    if (cnm().qKX == null)
      cnm().qKX = new b();
    b localb = cnm().qKX;
    AppMethodBeat.o(36496);
    return localb;
  }

  public static aw cnB()
  {
    AppMethodBeat.i(36497);
    com.tencent.mm.kernel.g.RN().QU();
    if (cnm().qKY == null)
    {
      cnm().qKY = new aw();
      com.tencent.mm.plugin.sns.b.n.qFw = cnm().qKY;
    }
    aw localaw = cnm().qKY;
    AppMethodBeat.o(36497);
    return localaw;
  }

  public static g cnC()
  {
    AppMethodBeat.i(36498);
    com.tencent.mm.kernel.g.RN().QU();
    if (cnm().qKR == null)
    {
      cnm().qKR = new g();
      com.tencent.mm.plugin.sns.b.n.qFx = cnm().qKR;
    }
    g localg = cnm().qKR;
    AppMethodBeat.o(36498);
    return localg;
  }

  public static ar cnD()
  {
    AppMethodBeat.i(36499);
    com.tencent.mm.kernel.g.RN().QU();
    if (cnm().qLp == null)
      cnm().qLp = new ar();
    ar localar = cnm().qLp;
    AppMethodBeat.o(36499);
    return localar;
  }

  public static ad cnE()
  {
    AppMethodBeat.i(36500);
    com.tencent.mm.kernel.g.RN().QU();
    if (cnm().qKV == null)
    {
      localObject = cnm();
      StringBuilder localStringBuilder = new StringBuilder();
      com.tencent.mm.kernel.g.RQ();
      ((af)localObject).qKV = new ad(com.tencent.mm.kernel.g.RP().cachePath + "snsAsyncQueue.data");
    }
    Object localObject = cnm().qKV;
    AppMethodBeat.o(36500);
    return localObject;
  }

  public static com.tencent.mm.plugin.sns.storage.o cnF()
  {
    AppMethodBeat.i(36501);
    com.tencent.mm.kernel.g.RN().QU();
    if (cnm().qKN == null)
    {
      cnm().qKN = new com.tencent.mm.plugin.sns.storage.o(cnm().eJN);
      com.tencent.mm.plugin.sns.b.n.qFD = cnm().qKN;
    }
    com.tencent.mm.plugin.sns.storage.o localo = cnm().qKN;
    AppMethodBeat.o(36501);
    return localo;
  }

  public static com.tencent.mm.plugin.sns.storage.d cnG()
  {
    AppMethodBeat.i(36502);
    com.tencent.mm.kernel.g.RN().QU();
    if (cnm().qKP == null)
      cnm().qKP = new com.tencent.mm.plugin.sns.storage.d(cnm().eJN);
    com.tencent.mm.plugin.sns.storage.d locald = cnm().qKP;
    AppMethodBeat.o(36502);
    return locald;
  }

  public static y cnH()
  {
    AppMethodBeat.i(36503);
    com.tencent.mm.kernel.g.RN().QU();
    if (cnm().qKQ == null)
      cnm().qKQ = new y(cnm().eJN);
    y localy = cnm().qKQ;
    AppMethodBeat.o(36503);
    return localy;
  }

  public static com.tencent.mm.plugin.sns.storage.f cnI()
  {
    AppMethodBeat.i(36504);
    com.tencent.mm.kernel.g.RN().QU();
    if (cnm().qKO == null)
      cnm().qKO = new com.tencent.mm.plugin.sns.storage.f(cnm().eJN);
    com.tencent.mm.plugin.sns.storage.f localf = cnm().qKO;
    AppMethodBeat.o(36504);
    return localf;
  }

  public static com.tencent.mm.plugin.sns.storage.m cnJ()
  {
    AppMethodBeat.i(36505);
    com.tencent.mm.kernel.g.RN().QU();
    if (cnm().qKS == null)
    {
      cnm().qKS = new com.tencent.mm.plugin.sns.storage.m(cnm().eJN, new ah());
      com.tencent.mm.plugin.sns.b.n.qFy = cnm().qKS;
    }
    com.tencent.mm.plugin.sns.storage.m localm = cnm().qKS;
    AppMethodBeat.o(36505);
    return localm;
  }

  public static com.tencent.mm.plugin.sns.storage.k cnK()
  {
    AppMethodBeat.i(36506);
    com.tencent.mm.kernel.g.RN().QU();
    if (cnm().qKT == null)
    {
      cnm().qKT = new com.tencent.mm.plugin.sns.storage.k(cnm().eJN);
      com.tencent.mm.plugin.sns.b.n.qFz = cnm().qKT;
    }
    com.tencent.mm.plugin.sns.storage.k localk = cnm().qKT;
    AppMethodBeat.o(36506);
    return localk;
  }

  public static com.tencent.mm.plugin.sns.storage.u cnL()
  {
    AppMethodBeat.i(36507);
    com.tencent.mm.kernel.g.RN().QU();
    if (cnm().qKU == null)
    {
      cnm().qKU = new com.tencent.mm.plugin.sns.storage.u(cnm().eJN);
      com.tencent.mm.plugin.sns.b.n.qFA = cnm().qKU;
    }
    com.tencent.mm.plugin.sns.storage.u localu = cnm().qKU;
    AppMethodBeat.o(36507);
    return localu;
  }

  public static ai cnM()
  {
    AppMethodBeat.i(36508);
    com.tencent.mm.kernel.g.RN().QU();
    if (cnm().qKZ == null)
      cnm().qKZ = new ai();
    ai localai = cnm().qKZ;
    AppMethodBeat.o(36508);
    return localai;
  }

  public static int cnN()
  {
    AppMethodBeat.i(36509);
    int i;
    if (bPg().y < bPg().x)
    {
      i = bPg().y;
      i /= 3;
      qKK = i;
      if (i > 10)
        break label83;
      ab.e("MicroMsg.SnsCore", "can not get multiThumbDisplaySize or the multiThumbDisplaySize < 10");
      i = 150;
      AppMethodBeat.o(36509);
    }
    while (true)
    {
      return i;
      i = bPg().x - com.tencent.mm.bz.a.fromDPToPix(com.tencent.mm.sdk.platformtools.ah.getContext(), qLv);
      break;
      label83: i = qKK;
      AppMethodBeat.o(36509);
    }
  }

  public static int cnO()
  {
    AppMethodBeat.i(36510);
    if (qKL <= 0)
    {
      qKL = 200;
      qKL = com.tencent.mm.bz.a.fromDPToPix(com.tencent.mm.sdk.platformtools.ah.getContext(), qKL);
    }
    int i = qKL;
    AppMethodBeat.o(36510);
    return i;
  }

  public static boolean cnP()
  {
    AppMethodBeat.i(36512);
    SharedPreferences localSharedPreferences = com.tencent.mm.sdk.platformtools.ar.s(com.tencent.mm.sdk.platformtools.ah.getContext(), "sp_sns_dynswitch_stg", 4);
    boolean bool;
    if (localSharedPreferences.contains("st_sw_use_vcodec_img"))
    {
      bool = localSharedPreferences.getBoolean("st_sw_use_vcodec_img", false);
      ab.w("MicroMsg.SnsCore", "isUseVCodecImg: %b (set statically outside)", new Object[] { Boolean.valueOf(bool) });
    }
    while (true)
    {
      AppMethodBeat.o(36512);
      return bool;
      bool = localSharedPreferences.getBoolean("sw_use_vcodec_img", false);
      ab.d("MicroMsg.SnsCore", "isUseVCodecImg: %b", new Object[] { Boolean.valueOf(bool) });
    }
  }

  public static boolean cnQ()
  {
    AppMethodBeat.i(36513);
    SharedPreferences localSharedPreferences = com.tencent.mm.sdk.platformtools.ar.s(com.tencent.mm.sdk.platformtools.ah.getContext(), "sp_sns_dynswitch_stg", 4);
    boolean bool;
    if (localSharedPreferences.contains("st_sw_use_wxpc_img"))
    {
      bool = localSharedPreferences.getBoolean("st_sw_use_wxpc_img", false);
      ab.w("MicroMsg.SnsCore", "isUseWxpcImg: %b (set statically outside)", new Object[] { Boolean.valueOf(bool) });
    }
    while (true)
    {
      AppMethodBeat.o(36513);
      return bool;
      bool = localSharedPreferences.getBoolean("sw_use_wxpc_img", false);
      ab.d("MicroMsg.SnsCore", "isUseWxpcImg: %b", new Object[] { Boolean.valueOf(bool) });
    }
  }

  public static String cnR()
  {
    AppMethodBeat.i(36520);
    if (bo.isNullOrNil(qLl))
    {
      Iterator localIterator = com.tencent.mm.sdk.platformtools.bd.dpo().iterator();
      while (localIterator.hasNext())
      {
        localObject = (bd.a)localIterator.next();
        if (com.tencent.mm.compatible.util.e.eSl.equals(((bd.a)localObject).xBt))
          qLl = ((bd.a)localObject).xBu;
      }
      ab.i("MicroMsg.SnsCore", "get filesys " + qLl);
    }
    Object localObject = bo.bc(qLl, "");
    AppMethodBeat.o(36520);
    return localObject;
  }

  public static String cnk()
  {
    AppMethodBeat.i(36475);
    com.tencent.mm.kernel.g.RQ();
    String str = (String)com.tencent.mm.kernel.g.RP().Ry().get(2, null);
    AppMethodBeat.o(36475);
    return str;
  }

  public static int cnl()
  {
    AppMethodBeat.i(36476);
    com.tencent.mm.kernel.g.RQ();
    com.tencent.mm.kernel.g.RN();
    int i = com.tencent.mm.kernel.a.QF();
    AppMethodBeat.o(36476);
    return i;
  }

  private static af cnm()
  {
    AppMethodBeat.i(36478);
    Object localObject1 = (af)com.tencent.mm.model.q.Y(af.class);
    if (!((af)localObject1).qLi);
    com.tencent.mm.model.b localb;
    while (true)
    {
      Object localObject4;
      Object localObject5;
      Object localObject6;
      synchronized (((af)localObject1).qLj)
      {
        if (!((af)localObject1).qLi)
        {
          ab.i("MicroMsg.SnsCore", "onAccInit because bug!");
          ((af)localObject1).bz(true);
        }
        if (!((af)localObject1).qLf)
          break label1621;
        synchronized (((af)localObject1).eMl)
        {
          localObject4 = new java/lang/StringBuilder;
          ((StringBuilder)localObject4).<init>("getCore need reset DB now ");
          ab.i("MicroMsg.SnsCore", Thread.currentThread().getName() + " " + Thread.currentThread().getId() + " " + localObject1.hashCode());
          if (!((af)localObject1).qLf)
            break label1619;
          ((af)localObject1).qLg = false;
          localObject5 = ((af)localObject1).qLh;
          localObject6 = qLm;
          if (((w)localObject5).rfK)
          {
            ab.i("MicroMsg.TrimSnsDb", "pass hasTrim");
            if (((af)localObject1).eJN != null)
              break;
            localObject4 = new com/tencent/mm/cd/h;
            ((com.tencent.mm.cd.h)localObject4).<init>();
            ((af)localObject1).eJN = ((com.tencent.mm.cd.h)localObject4);
            com.tencent.mm.kernel.g.RQ();
            localObject4 = com.tencent.mm.kernel.g.RP().cachePath;
            localObject6 = new java/lang/StringBuilder;
            ((StringBuilder)localObject6).<init>();
            localObject4 = (String)localObject4 + "SnsMicroMsg.db";
            if (((af)localObject1).eJN.b((String)localObject4, qLm, true))
              break;
            localObject1 = new android/database/sqlite/SQLiteException;
            ((SQLiteException)localObject1).<init>("sns db init failed");
            AppMethodBeat.o(36478);
            throw ((Throwable)localObject1);
          }
        }
      }
      com.tencent.mm.kernel.g.RQ();
      if (com.tencent.mm.kernel.g.RN().QY())
      {
        int i = bo.getInt(com.tencent.mm.m.g.Nu().getValue("AndroidCleanSnsDb"), 0);
        ab.i("MicroMsg.TrimSnsDb", "pass dynamic? ".concat(String.valueOf(i)));
        if (i <= 0)
        {
          com.tencent.mm.kernel.g.RQ();
          localObject4 = com.tencent.mm.kernel.g.RP().cachePath;
          Object localObject7 = new java/lang/StringBuilder;
          ((StringBuilder)localObject7).<init>();
          if (com.tencent.mm.vfs.e.ct((String)localObject4 + "SnsMicroMsg2.db.ini"))
          {
            w.Zq((String)localObject4);
            localObject7 = new java/lang/StringBuilder;
            ((StringBuilder)localObject7).<init>();
            com.tencent.mm.vfs.e.deleteFile((String)localObject4 + "SnsMicroMsg2.db.ini");
          }
          localObject7 = com.tencent.mm.sdk.platformtools.ah.getContext().getSharedPreferences(com.tencent.mm.sdk.platformtools.ah.doA(), 0);
          if (bo.fp(((SharedPreferences)localObject7).getLong("check_trim_time", 0L)) < 604800L)
          {
            ab.i("MicroMsg.TrimSnsDb", "trim sns pass because time short");
          }
          else
          {
            ((SharedPreferences)localObject7).edit().putLong("check_trim_time", bo.anT()).commit();
            ((w)localObject5).rfK = true;
            long l1 = System.currentTimeMillis();
            i = com.tencent.mm.q.a.On();
            if ((i == 1) || (i == 2))
            {
              ab.i("MicroMsg.TrimSnsDb", "trim sns error space dangerous");
            }
            else
            {
              localObject5 = new java/lang/StringBuilder;
              ((StringBuilder)localObject5).<init>();
              if (com.tencent.mm.vfs.e.ct((String)localObject4 + "sns_mark.ini"))
              {
                localObject5 = new java/lang/StringBuilder;
                ((StringBuilder)localObject5).<init>();
                if (bo.gb(com.tencent.mm.vfs.e.ata((String)localObject4 + "sns_mark.ini")) < 2592000000L)
                {
                  ab.i("MicroMsg.TrimSnsDb", "mark file exist and return");
                  w.Zq((String)localObject4);
                }
                else
                {
                  localObject5 = new java/lang/StringBuilder;
                  ((StringBuilder)localObject5).<init>();
                  com.tencent.mm.vfs.e.deleteFile((String)localObject4 + "sns_mark.ini");
                }
              }
              else
              {
                localObject5 = new java/lang/StringBuilder;
                ((StringBuilder)localObject5).<init>();
                long l2 = com.tencent.mm.vfs.e.asZ((String)localObject4 + "SnsMicroMsg.db");
                ab.i("MicroMsg.TrimSnsDb", "trim sns ".concat(String.valueOf(l2)));
                if (l2 < 52428800L)
                {
                  localObject4 = new java/lang/StringBuilder;
                  ((StringBuilder)localObject4).<init>("trim sns free pass: ");
                  ab.i("MicroMsg.TrimSnsDb", System.currentTimeMillis() - l1);
                }
                else
                {
                  localObject5 = new java/lang/StringBuilder;
                  ((StringBuilder)localObject5).<init>();
                  com.tencent.mm.vfs.e.atc((String)localObject4 + "sns_mark.ini");
                  localObject5 = new java/lang/StringBuilder;
                  ((StringBuilder)localObject5).<init>();
                  localObject7 = (String)localObject4 + "SnsMicroMsg2.db";
                  localObject5 = new com/tencent/mm/cd/h;
                  ((com.tencent.mm.cd.h)localObject5).<init>();
                  if (!((com.tencent.mm.cd.h)localObject5).b((String)localObject7, null, false))
                  {
                    localb = new com/tencent/mm/model/b;
                    localb.<init>((byte)0);
                    AppMethodBeat.o(36478);
                    throw localb;
                  }
                  localObject7 = new com/tencent/mm/cd/h;
                  ((com.tencent.mm.cd.h)localObject7).<init>();
                  StringBuilder localStringBuilder = new java/lang/StringBuilder;
                  localStringBuilder.<init>();
                  if (!((com.tencent.mm.cd.h)localObject7).b((String)localObject4 + "SnsMicroMsg.db", (HashMap)localObject6, true))
                  {
                    localb = new com/tencent/mm/model/b;
                    localb.<init>((byte)0);
                    AppMethodBeat.o(36478);
                    throw localb;
                  }
                  l2 = System.currentTimeMillis();
                  if (!w.a((com.tencent.mm.cd.h)localObject7, (com.tencent.mm.cd.h)localObject5));
                  for (i = -1; ; i = 1)
                  {
                    long l3 = System.currentTimeMillis() - l2;
                    ab.i("MicroMsg.TrimSnsDb", "copysns insert all %d passed ret:".concat(String.valueOf(i)), new Object[] { Long.valueOf(l3) });
                    ((com.tencent.mm.cd.h)localObject7).closeDB();
                    ((com.tencent.mm.cd.h)localObject5).closeDB();
                    if (i >= 0)
                    {
                      com.tencent.mm.kernel.g.RQ();
                      localObject4 = com.tencent.mm.kernel.g.RP().cachePath;
                      localObject6 = new java/lang/StringBuilder;
                      ((StringBuilder)localObject6).<init>();
                      com.tencent.mm.vfs.e.deleteFile((String)localObject4 + "SnsMicroMsg.db");
                      ab.i("MicroMsg.TrimSnsDb", "rename file ".concat(String.valueOf(com.tencent.mm.vfs.e.h((String)localObject4, "SnsMicroMsg2.db", "SnsMicroMsg.db"))));
                      localObject6 = new java/lang/StringBuilder;
                      ((StringBuilder)localObject6).<init>();
                      com.tencent.mm.vfs.e.deleteFile((String)localObject4 + "SnsMicroMsg.db-shm");
                      localObject6 = new java/lang/StringBuilder;
                      ((StringBuilder)localObject6).<init>();
                      com.tencent.mm.vfs.e.deleteFile((String)localObject4 + "SnsMicroMsg.db-wal");
                      localObject6 = new java/lang/StringBuilder;
                      ((StringBuilder)localObject6).<init>();
                      com.tencent.mm.vfs.e.deleteFile((String)localObject4 + "SnsMicroMsg.db.ini");
                      com.tencent.mm.vfs.e.y("SnsMicroMsg2.db.ini", "SnsMicroMsg.db.ini");
                      localObject6 = new java/lang/StringBuilder;
                      ((StringBuilder)localObject6).<init>();
                      com.tencent.mm.vfs.e.deleteFile((String)localObject4 + "SnsMicroMsg2.db.ini");
                      localObject6 = new java/lang/StringBuilder;
                      ((StringBuilder)localObject6).<init>();
                      com.tencent.mm.vfs.e.deleteFile((String)localObject4 + "SnsMicroMsg2.db");
                      localObject6 = new java/lang/StringBuilder;
                      ((StringBuilder)localObject6).<init>();
                      com.tencent.mm.vfs.e.deleteFile((String)localObject4 + "sns_mark.ini");
                    }
                    l2 = System.currentTimeMillis() - l2;
                    ab.i("MicroMsg.TrimSnsDb", "copysns data ret=%d all: %d copytime %d ", new Object[] { Integer.valueOf(i), Long.valueOf(l2), Long.valueOf(l2 - l3) });
                    localObject4 = new java/lang/StringBuilder;
                    ((StringBuilder)localObject4).<init>("trim sns done pass: ");
                    ab.i("MicroMsg.TrimSnsDb", System.currentTimeMillis() - l1);
                    break;
                    l3 = System.currentTimeMillis();
                    w.a((com.tencent.mm.cd.h)localObject7, (com.tencent.mm.cd.h)localObject5, "snsExtInfo3");
                    localObject4 = new java/lang/StringBuilder;
                    ((StringBuilder)localObject4).<init>("insert into ");
                    boolean bool = ((com.tencent.mm.cd.h)localObject5).hY("", "snsExtInfo3" + " select * from old." + "snsExtInfo3");
                    localObject4 = new java/lang/StringBuilder;
                    ((StringBuilder)localObject4).<init>("copysns ret_ext:");
                    ab.i("MicroMsg.TrimSnsDb", bool + " passed " + (System.currentTimeMillis() - l3));
                    w.a((com.tencent.mm.cd.h)localObject7, (com.tencent.mm.cd.h)localObject5, "SnsComment");
                    localObject4 = new java/lang/StringBuilder;
                    ((StringBuilder)localObject4).<init>("insert into ");
                    bool = ((com.tencent.mm.cd.h)localObject5).hY("", "SnsComment" + " select * from old." + "SnsComment");
                    localObject4 = new java/lang/StringBuilder;
                    ((StringBuilder)localObject4).<init>("copysns ret_msg:");
                    ab.i("MicroMsg.TrimSnsDb", bool + " passed " + (System.currentTimeMillis() - l3));
                    w.a((com.tencent.mm.cd.h)localObject7, (com.tencent.mm.cd.h)localObject5, "SnsInfo");
                    localObject4 = new java/lang/StringBuilder;
                    ((StringBuilder)localObject4).<init>("insert into ");
                    bool = ((com.tencent.mm.cd.h)localObject5).hY("", "SnsInfo" + " select * from old." + "SnsInfo" + " where  (sourceType & 2 != 0 ) " + com.tencent.mm.plugin.sns.storage.o.rfn + " limit 200");
                    localObject4 = new java/lang/StringBuilder;
                    ((StringBuilder)localObject4).<init>("copysns ret_sns:");
                    ab.i("MicroMsg.TrimSnsDb", bool + " passed " + (System.currentTimeMillis() - l3));
                    bool = ((com.tencent.mm.cd.h)localObject5).hY("", "update snsExtinfo3 set md5 = '', faults = '';");
                    ab.i("MicroMsg.TrimSnsDb", "update ext info  passed  %s  updateRet %s", new Object[] { Long.valueOf(System.currentTimeMillis() - l3), Boolean.valueOf(bool) });
                    ((com.tencent.mm.cd.h)localObject5).hY("", "DETACH DATABASE old");
                  }
                }
              }
            }
          }
        }
      }
    }
    localb.qLf = false;
    ab.i("MicroMsg.SnsCore", "resetdb done");
    label1619: label1621: AppMethodBeat.o(36478);
    return localb;
  }

  public static boolean cnn()
  {
    AppMethodBeat.i(36479);
    cnm();
    boolean bool;
    if (!com.tencent.mm.kernel.g.RN().QY())
    {
      bool = true;
      AppMethodBeat.o(36479);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(36479);
    }
  }

  public static ak cno()
  {
    AppMethodBeat.i(36481);
    if (qLu == null)
      qLu = new ak("MicroMsg.SnsCore#WorkingHandler");
    ak localak = qLu;
    AppMethodBeat.o(36481);
    return localak;
  }

  public static com.tencent.mm.sdk.g.b.a cnp()
  {
    AppMethodBeat.i(36482);
    com.tencent.mm.sdk.g.b.a locala = cnm().qKI;
    AppMethodBeat.o(36482);
    return locala;
  }

  public static com.tencent.mm.sdk.g.b.a cnq()
  {
    AppMethodBeat.i(36483);
    com.tencent.mm.sdk.g.b.a locala = cnm().qKH;
    AppMethodBeat.o(36483);
    return locala;
  }

  protected static com.tencent.mm.sdk.g.b.a cnr()
  {
    AppMethodBeat.i(36484);
    com.tencent.mm.sdk.g.b.a locala = cnm().qKG;
    AppMethodBeat.o(36484);
    return locala;
  }

  public static com.tencent.mm.sdk.g.b.a cns()
  {
    AppMethodBeat.i(36485);
    com.tencent.mm.sdk.g.b.a locala = cnm().qKJ;
    AppMethodBeat.o(36485);
    return locala;
  }

  public static com.tencent.mm.storage.bd cnt()
  {
    AppMethodBeat.i(36489);
    com.tencent.mm.kernel.g.RQ();
    com.tencent.mm.storage.bd localbd = ((com.tencent.mm.plugin.messenger.foundation.a.j)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XM();
    AppMethodBeat.o(36489);
    return localbd;
  }

  public static s cnu()
  {
    AppMethodBeat.i(36490);
    com.tencent.mm.kernel.g.RN().QU();
    if (cnm().qKM == null)
      cnm().qKM = new s(cnm().eJN);
    s locals = cnm().qKM;
    AppMethodBeat.o(36490);
    return locals;
  }

  public static am.a cnv()
  {
    AppMethodBeat.i(36491);
    com.tencent.mm.kernel.g.RN().QU();
    if (cnm().qKW == null)
    {
      cnm().qKW = new am.a();
      com.tencent.mm.plugin.sns.b.n.qFC = cnm().qKW;
    }
    am.a locala = cnm().qKW;
    AppMethodBeat.o(36491);
    return locala;
  }

  public static com.tencent.mm.plugin.sns.g.c cnw()
  {
    AppMethodBeat.i(36492);
    com.tencent.mm.kernel.g.RN().QU();
    if (cnm().qLa == null)
      cnm().qLa = new com.tencent.mm.plugin.sns.g.c();
    com.tencent.mm.plugin.sns.g.c localc = cnm().qLa;
    AppMethodBeat.o(36492);
    return localc;
  }

  public static com.tencent.mm.plugin.sns.g.g cnx()
  {
    AppMethodBeat.i(36493);
    com.tencent.mm.kernel.g.RN().QU();
    if (cnm().qLb == null)
      cnm().qLb = new com.tencent.mm.plugin.sns.g.g();
    com.tencent.mm.plugin.sns.g.g localg = cnm().qLb;
    AppMethodBeat.o(36493);
    return localg;
  }

  public static com.tencent.mm.plugin.sns.storage.q cny()
  {
    AppMethodBeat.i(36494);
    com.tencent.mm.kernel.g.RN().QU();
    if (cnm().qLc == null)
      cnm().qLc = new com.tencent.mm.plugin.sns.storage.q(cnm().eJN);
    com.tencent.mm.plugin.sns.storage.q localq = cnm().qLc;
    AppMethodBeat.o(36494);
    return localq;
  }

  public static i cnz()
  {
    AppMethodBeat.i(36495);
    com.tencent.mm.kernel.g.RN().QU();
    if (cnm().qLd == null)
      cnm().qLd = new i();
    i locali = cnm().qLd;
    AppMethodBeat.o(36495);
    return locali;
  }

  public static String getAccPath()
  {
    AppMethodBeat.i(36474);
    com.tencent.mm.kernel.g.RN().QU();
    com.tencent.mm.kernel.g.RQ();
    String str = com.tencent.mm.kernel.g.RP().eJM;
    AppMethodBeat.o(36474);
    return str;
  }

  public static String getAccSnsPath()
  {
    AppMethodBeat.i(36487);
    String str = ((com.tencent.mm.plugin.sns.b.b)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.sns.b.b.class)).getAccSnsPath();
    AppMethodBeat.o(36487);
    return str;
  }

  public static String getAccSnsTmpPath()
  {
    AppMethodBeat.i(36488);
    String str = ((com.tencent.mm.plugin.sns.b.b)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.sns.b.b.class)).getAccSnsTmpPath();
    AppMethodBeat.o(36488);
    return str;
  }

  public final HashMap<Integer, h.d> Jx()
  {
    return null;
  }

  public final void a(com.tencent.mm.model.ar paramar)
  {
    AppMethodBeat.i(36518);
    u.a(paramar);
    AppMethodBeat.o(36518);
  }

  public final void b(com.tencent.mm.model.ar paramar)
  {
    AppMethodBeat.i(36519);
    u.b(paramar);
    AppMethodBeat.o(36519);
  }

  public final void bA(boolean paramBoolean)
  {
    AppMethodBeat.i(36517);
    com.tencent.mm.vfs.e.tf(getAccPath() + "sfs");
    checkDir();
    AppMethodBeat.o(36517);
  }

  public final void bz(boolean paramBoolean)
  {
    AppMethodBeat.i(36515);
    ab.i("MicroMsg.SnsCore", "onAccountPostReset " + Thread.currentThread().getId() + " isAccInit: " + this.qLi);
    if (this.qLi)
      AppMethodBeat.o(36515);
    while (true)
    {
      return;
      this.qLi = true;
      this.qLf = true;
      com.tencent.mm.vfs.e.tf(getAccPath() + "sfs");
      this.qLk = getAccSnsPath();
      checkDir();
      ((com.tencent.mm.plugin.messenger.foundation.a.p)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.messenger.foundation.a.p.class)).getSysCmdMsgExtension().a("NewYearSNSCtrl2016", this.qLq, true);
      ((com.tencent.mm.plugin.messenger.foundation.a.p)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.messenger.foundation.a.p.class)).getSysCmdMsgExtension().a("NewYearSNSTips2016", this.qLr, true);
      ((com.tencent.mm.plugin.messenger.foundation.a.p)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.messenger.foundation.a.p.class)).getSysCmdMsgExtension().a("NewYearSNSAmountLevelCtrl2016", this.qLs, true);
      ((com.tencent.mm.plugin.messenger.foundation.a.p)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.messenger.foundation.a.p.class)).getSysCmdMsgExtension().a("SnsAd", this.qLt, true);
      com.tencent.mm.plugin.sns.b.n.qFw = cnB();
      com.tencent.mm.plugin.sns.b.n.qFx = cnC();
      com.tencent.mm.plugin.sns.b.n.qFy = cnJ();
      com.tencent.mm.plugin.sns.b.n.qFz = cnK();
      com.tencent.mm.plugin.sns.b.n.qFA = cnL();
      com.tencent.mm.plugin.sns.b.n.qFC = cnv();
      com.tencent.mm.plugin.sns.b.n.qFB = this;
      com.tencent.mm.plugin.sns.b.n.qFD = cnF();
      com.tencent.mm.sdk.b.a.xxA.c(this.qLZ);
      com.tencent.mm.sdk.b.a.xxA.c(this.qMa);
      com.tencent.mm.sdk.b.a.xxA.c(this.qLM);
      com.tencent.mm.sdk.b.a.xxA.c(this.qLK);
      com.tencent.mm.sdk.b.a.xxA.c(this.qLL);
      com.tencent.mm.sdk.b.a.xxA.c(this.qLN);
      com.tencent.mm.sdk.b.a.xxA.c(this.qLO);
      com.tencent.mm.sdk.b.a.xxA.c(this.qLP);
      com.tencent.mm.sdk.b.a.xxA.c(this.qLQ);
      com.tencent.mm.sdk.b.a.xxA.c(this.qLR);
      com.tencent.mm.sdk.b.a.xxA.c(this.qLT);
      com.tencent.mm.sdk.b.a.xxA.c(this.qLU);
      com.tencent.mm.sdk.b.a.xxA.c(this.qLV);
      com.tencent.mm.sdk.b.a.xxA.c(this.qMd);
      this.qLx = new com.tencent.mm.plugin.sns.n();
      this.qLy = new com.tencent.mm.plugin.sns.k();
      this.qLz = new com.tencent.mm.plugin.sns.e();
      this.qLA = new com.tencent.mm.plugin.sns.p();
      this.qLB = new com.tencent.mm.plugin.sns.h();
      this.qLC = new com.tencent.mm.plugin.sns.g();
      this.qLD = new com.tencent.mm.plugin.sns.m();
      this.qLE = new com.tencent.mm.plugin.sns.j();
      this.qLF = new com.tencent.mm.plugin.sns.b();
      this.qLG = new com.tencent.mm.plugin.sns.c();
      this.qLH = new com.tencent.mm.plugin.sns.f();
      com.tencent.mm.sdk.b.a.xxA.c(this.qLY);
      com.tencent.mm.sdk.b.a.xxA.c(this.qLX);
      com.tencent.mm.sdk.b.a.xxA.c(this.qLA);
      com.tencent.mm.sdk.b.a.xxA.c(this.qLx);
      com.tencent.mm.sdk.b.a.xxA.c(this.qLy);
      com.tencent.mm.sdk.b.a.xxA.c(this.qLz);
      com.tencent.mm.sdk.b.a.xxA.c(this.qLB);
      com.tencent.mm.sdk.b.a.xxA.c(this.qLC);
      com.tencent.mm.sdk.b.a.xxA.c(this.qLD);
      com.tencent.mm.sdk.b.a.xxA.c(this.qLE);
      com.tencent.mm.sdk.b.a.xxA.c(this.qLF);
      com.tencent.mm.sdk.b.a.xxA.c(this.qLG);
      com.tencent.mm.sdk.b.a.xxA.c(this.qLH);
      com.tencent.mm.sdk.b.a.xxA.c(this.oMA);
      this.qLn = new com.tencent.mm.plugin.sns.d();
      com.tencent.mm.sdk.b.a.xxA.c(this.qLn);
      com.tencent.mm.sdk.b.a.xxA.c(this.qMc);
      com.tencent.mm.sdk.b.a.xxA.c(this.qLI);
      com.tencent.mm.sdk.b.a.xxA.c(this.qLJ);
      com.tencent.mm.sdk.b.a.xxA.c(this.qLW);
      com.tencent.mm.sdk.b.a.xxA.c(this.qLS);
      cnz().start();
      cnB().start();
      this.qLe.start();
      this.qLo = new com.tencent.mm.plugin.sns.f.a();
      ap.init();
      Object localObject1 = com.tencent.mm.modelsns.c.fQs;
      com.tencent.mm.modelsns.c.ajL();
      if (com.tencent.mm.memory.l.Xg())
      {
        localObject2 = com.tencent.mm.memory.c.fdx;
        localObject1 = com.tencent.mm.memory.c.fdx;
        localObject1.getClass();
        ((com.tencent.mm.memory.c)localObject2).a(new af.4(this, (com.tencent.mm.memory.c)localObject1));
      }
      localObject1 = com.tencent.mm.memory.o.fdT;
      Object localObject2 = com.tencent.mm.memory.o.fdT;
      localObject2.getClass();
      ((com.tencent.mm.memory.o)localObject1).a(new af.5(this, (com.tencent.mm.memory.o)localObject2));
      localObject1 = com.tencent.mm.memory.g.fdE;
      localObject2 = com.tencent.mm.memory.g.fdE;
      localObject2.getClass();
      ((com.tencent.mm.memory.g)localObject1).a(new af.6(this, (com.tencent.mm.memory.g)localObject2));
      cnD();
      com.tencent.mm.plugin.sns.e.a.init();
      AppMethodBeat.o(36515);
    }
  }

  public final void iy(int paramInt)
  {
  }

  public final void onAccountRelease()
  {
    AppMethodBeat.i(36514);
    ??? = cnz();
    com.tencent.mm.kernel.g.RQ();
    com.tencent.mm.kernel.g.RO().eJo.b(1802, (com.tencent.mm.ai.f)???);
    ??? = this.qLe;
    com.tencent.mm.sdk.b.a.xxA.d(((ao)???).qML);
    com.tencent.mm.sdk.b.a.xxA.d(((ao)???).qMM);
    com.tencent.mm.sdk.b.a.xxA.d(((ao)???).qMN);
    com.tencent.mm.sdk.b.a.xxA.d(this.qLZ);
    com.tencent.mm.sdk.b.a.xxA.d(this.qMa);
    com.tencent.mm.sdk.b.a.xxA.d(this.qLY);
    com.tencent.mm.sdk.b.a.xxA.d(this.qLX);
    com.tencent.mm.sdk.b.a.xxA.d(this.qLM);
    com.tencent.mm.sdk.b.a.xxA.d(this.qLK);
    com.tencent.mm.sdk.b.a.xxA.d(this.qLL);
    com.tencent.mm.sdk.b.a.xxA.d(this.qLN);
    com.tencent.mm.sdk.b.a.xxA.d(this.qLO);
    com.tencent.mm.sdk.b.a.xxA.d(this.qLP);
    com.tencent.mm.sdk.b.a.xxA.d(this.qLA);
    com.tencent.mm.sdk.b.a.xxA.d(this.qLB);
    com.tencent.mm.sdk.b.a.xxA.d(this.qLR);
    com.tencent.mm.sdk.b.a.xxA.d(this.qLT);
    com.tencent.mm.sdk.b.a.xxA.d(this.qLx);
    com.tencent.mm.sdk.b.a.xxA.d(this.qLy);
    com.tencent.mm.sdk.b.a.xxA.d(this.qLz);
    com.tencent.mm.sdk.b.a.xxA.d(this.qLC);
    com.tencent.mm.sdk.b.a.xxA.d(this.qLD);
    com.tencent.mm.sdk.b.a.xxA.d(this.qLE);
    com.tencent.mm.sdk.b.a.xxA.d(this.qLF);
    com.tencent.mm.sdk.b.a.xxA.d(this.qLG);
    com.tencent.mm.sdk.b.a.xxA.d(this.qLH);
    com.tencent.mm.sdk.b.a.xxA.d(this.qLQ);
    com.tencent.mm.sdk.b.a.xxA.d(this.qLn);
    com.tencent.mm.sdk.b.a.xxA.d(this.qLU);
    com.tencent.mm.sdk.b.a.xxA.d(this.qLV);
    com.tencent.mm.sdk.b.a.xxA.d(this.oMA);
    com.tencent.mm.sdk.b.a.xxA.d(this.qMc);
    com.tencent.mm.sdk.b.a.xxA.d(this.qLW);
    com.tencent.mm.sdk.b.a.xxA.d(this.qLI);
    com.tencent.mm.sdk.b.a.xxA.d(this.qLJ);
    com.tencent.mm.sdk.b.a.xxA.d(this.qMd);
    com.tencent.mm.sdk.b.a.xxA.d(this.qLS);
    ??? = a.e.qVH;
    if (((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.a)???).qVA);
    try
    {
      com.tencent.mm.sdk.platformtools.ah.getContext().unregisterReceiver(((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.a)???).qVz);
      ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.a)???).qVA = false;
      com.tencent.mm.plugin.downloader.model.d.bij();
      com.tencent.mm.plugin.downloader.model.b.b(((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.a)???).qVE);
      ((com.tencent.mm.plugin.messenger.foundation.a.p)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.messenger.foundation.a.p.class)).getSysCmdMsgExtension().b("NewYearSNSCtrl2016", this.qLq, true);
      ((com.tencent.mm.plugin.messenger.foundation.a.p)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.messenger.foundation.a.p.class)).getSysCmdMsgExtension().b("NewYearSNSTips2016", this.qLr, true);
      ((com.tencent.mm.plugin.messenger.foundation.a.p)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.messenger.foundation.a.p.class)).getSysCmdMsgExtension().b("NewYearSNSAmountLevelCtrl2016", this.qLs, true);
      ((com.tencent.mm.plugin.messenger.foundation.a.p)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.messenger.foundation.a.p.class)).getSysCmdMsgExtension().b("SnsAd", this.qLt, true);
      ??? = cnB();
      com.tencent.mm.kernel.g.RQ();
      com.tencent.mm.kernel.g.RO().eJo.b(207, (com.tencent.mm.ai.f)???);
      com.tencent.mm.kernel.g.RQ();
      com.tencent.mm.kernel.g.RO().eJo.b(209, (com.tencent.mm.ai.f)???);
      ??? = (af)com.tencent.mm.model.q.Y(af.class);
      if (??? != null)
      {
        ab.d("MicroMsg.SnsCore", "SnsCore close db");
        if (((af)???).eJN != null)
        {
          ((af)???).eJN.closeDB();
          ((af)???).eJN = null;
        }
        if (((af)???).qKI != null)
          ((af)???).qKI.reset();
        if (((af)???).qKH != null)
          ((af)???).qKH.reset();
        if (((af)???).qKG != null)
          ((af)???).qKG.reset();
        if (((af)???).qKJ != null)
          ((af)???).qKJ.reset();
      }
      ??? = this.qLo;
      cnA().b((b.b)???);
      com.tencent.mm.sdk.b.a.xxA.d(((com.tencent.mm.plugin.sns.f.a)???).qGl);
      ap.aon();
      com.tencent.mm.memory.g.fdE.WY();
      com.tencent.mm.memory.c.fdx.WY();
      com.tencent.mm.memory.o.fdT.WY();
      localar = cnD();
      localar.qMW = null;
      localar.fWa = null;
      localar.qMY.clear();
      localar.qMX.clear();
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      synchronized (localar.qMZ)
      {
        ar localar;
        localar.qMZ.clear();
        com.tencent.mm.sdk.b.a.xxA.d(localar.qNa);
        com.tencent.mm.sdk.b.a.xxA.d(localar.qMM);
        com.tencent.mm.sdk.b.a.xxA.d(localar.qMN);
        com.tencent.mm.plugin.sns.e.a.destroy();
        AppMethodBeat.o(36514);
        return;
        localIllegalArgumentException = localIllegalArgumentException;
        ab.e("MicroMsg.AdDownloadApkMgr", "unregister install receiver exception", new Object[] { localIllegalArgumentException.getMessage() });
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.model.af
 * JD-Core Version:    0.6.2
 */