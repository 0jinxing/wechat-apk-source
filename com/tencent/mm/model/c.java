package com.tencent.mm.model;

import android.content.SharedPreferences;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cd.h.d;
import com.tencent.mm.kernel.e.b;
import com.tencent.mm.plugin.messenger.foundation.a.a.k;
import com.tencent.mm.plugin.messenger.foundation.a.a.m;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.aa;
import com.tencent.mm.storage.ac;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.be;
import com.tencent.mm.storage.bh;
import com.tencent.mm.storage.l;
import com.tencent.mm.storage.n;
import com.tencent.mm.storage.p;
import com.tencent.mm.storage.z;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public final class c
{
  public static HashMap<Integer, h.d> eaA;
  public br fkd;
  public bq fke;
  com.tencent.mm.storage.h fkf;
  com.tencent.mm.model.b.c fkg;
  com.tencent.mm.model.b.d fkh;
  com.tencent.mm.storage.j fki;
  n fkj;
  l fkk;
  com.tencent.mm.model.b.b fkl;

  static
  {
    AppMethodBeat.i(16262);
    HashMap localHashMap = new HashMap();
    eaA = localHashMap;
    localHashMap.put(Integer.valueOf("BOTTLE_MESSAGE_TABLE".hashCode()), new c.5());
    eaA.put(Integer.valueOf("APPBRAND_MESSAGE_TABLE".hashCode()), new c.6());
    eaA.put(Integer.valueOf("BackupMoveTime".hashCode()), new c.7());
    eaA.put(Integer.valueOf("BackupTempMoveTime".hashCode()), new c.8());
    eaA.put(Integer.valueOf("BackupRecoverMsgListDataId".hashCode()), new c.9());
    AppMethodBeat.o(16262);
  }

  public c()
  {
    AppMethodBeat.i(16205);
    com.tencent.mm.kernel.g.RQ();
    com.tencent.mm.kernel.e locale = com.tencent.mm.kernel.g.RP();
    c.1 local1 = new c.1(this);
    locale.eJJ.aD(local1);
    com.tencent.mm.kernel.a.c.Sa().add(new com.tencent.mm.kernel.api.b()
    {
      public final List<String> collectStoragePaths()
      {
        AppMethodBeat.i(16200);
        LinkedList localLinkedList = new LinkedList();
        Collections.addAll(localLinkedList, new String[] { "image/shakeTranImg/", "emoji/", "locallog", "mailapp/", "mailapp/", "voice2/", "video/", "attachment/" });
        AppMethodBeat.o(16200);
        return localLinkedList;
      }
    });
    com.tencent.mm.kernel.a.c.Sa().add(new c.3(this));
    AppMethodBeat.o(16205);
  }

  public static int QF()
  {
    AppMethodBeat.i(16206);
    com.tencent.mm.kernel.g.RQ();
    com.tencent.mm.kernel.g.RN();
    int i = com.tencent.mm.kernel.a.QF();
    AppMethodBeat.o(16206);
    return i;
  }

  public static void QV()
  {
    AppMethodBeat.i(16214);
    com.tencent.mm.kernel.g.RQ();
    com.tencent.mm.kernel.g.RN().QV();
    AppMethodBeat.o(16214);
  }

  public static void RA()
  {
    AppMethodBeat.i(16208);
    com.tencent.mm.kernel.g.RQ();
    com.tencent.mm.kernel.g.RP().RA();
    AppMethodBeat.o(16208);
  }

  public static String Rs()
  {
    AppMethodBeat.i(16210);
    com.tencent.mm.kernel.g.RQ();
    String str = com.tencent.mm.kernel.g.RP().Rs();
    AppMethodBeat.o(16210);
    return str;
  }

  public static String Rt()
  {
    AppMethodBeat.i(16250);
    com.tencent.mm.kernel.g.RQ();
    String str = com.tencent.mm.kernel.g.RP().cachePath;
    AppMethodBeat.o(16250);
    return str;
  }

  public static com.tencent.mm.cd.h Ru()
  {
    AppMethodBeat.i(16217);
    com.tencent.mm.kernel.g.RQ();
    com.tencent.mm.cd.h localh = com.tencent.mm.kernel.g.RP().eJN;
    AppMethodBeat.o(16217);
    return localh;
  }

  public static String Rv()
  {
    AppMethodBeat.i(16248);
    com.tencent.mm.kernel.g.RQ();
    String str = com.tencent.mm.kernel.g.RP().Rv();
    AppMethodBeat.o(16248);
    return str;
  }

  public static String Rw()
  {
    AppMethodBeat.i(16249);
    com.tencent.mm.kernel.g.RQ();
    String str = com.tencent.mm.kernel.g.RP().Rw();
    AppMethodBeat.o(16249);
    return str;
  }

  public static z Ry()
  {
    AppMethodBeat.i(16220);
    com.tencent.mm.kernel.g.RQ();
    z localz = com.tencent.mm.kernel.g.RP().Ry();
    AppMethodBeat.o(16220);
    return localz;
  }

  public static String XH()
  {
    AppMethodBeat.i(16207);
    com.tencent.mm.kernel.g.RQ();
    String str = com.tencent.mm.kernel.g.RP().eJL;
    AppMethodBeat.o(16207);
    return str;
  }

  public static boolean XI()
  {
    AppMethodBeat.i(16215);
    com.tencent.mm.kernel.g.RQ();
    boolean bool = com.tencent.mm.kernel.a.jP(com.tencent.mm.kernel.g.RN().eIV);
    AppMethodBeat.o(16215);
    return bool;
  }

  public static int XJ()
  {
    AppMethodBeat.i(16216);
    com.tencent.mm.kernel.g.RQ();
    int i = com.tencent.mm.kernel.g.RN().eIW;
    AppMethodBeat.o(16216);
    return i;
  }

  public static com.tencent.mm.cd.h XK()
  {
    AppMethodBeat.i(16218);
    com.tencent.mm.kernel.g.RQ();
    com.tencent.mm.cd.h localh = com.tencent.mm.kernel.g.RP().eJO;
    AppMethodBeat.o(16218);
    return localh;
  }

  public static com.tencent.mm.plugin.messenger.foundation.a.a.i XL()
  {
    AppMethodBeat.i(16221);
    com.tencent.mm.plugin.messenger.foundation.a.a.i locali = ((com.tencent.mm.plugin.messenger.foundation.a.j)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XL();
    AppMethodBeat.o(16221);
    return locali;
  }

  public static bd XM()
  {
    AppMethodBeat.i(16222);
    bd localbd = ((com.tencent.mm.plugin.messenger.foundation.a.j)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XM();
    AppMethodBeat.o(16222);
    return localbd;
  }

  public static m XN()
  {
    AppMethodBeat.i(16223);
    m localm = ((com.tencent.mm.plugin.messenger.foundation.a.j)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XN();
    AppMethodBeat.o(16223);
    return localm;
  }

  public static com.tencent.mm.plugin.messenger.foundation.a.a.h XO()
  {
    AppMethodBeat.i(16224);
    com.tencent.mm.plugin.messenger.foundation.a.a.h localh = ((com.tencent.mm.plugin.messenger.foundation.a.j)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).bOr();
    AppMethodBeat.o(16224);
    return localh;
  }

  public static com.tencent.mm.storage.o XP()
  {
    AppMethodBeat.i(16225);
    com.tencent.mm.storage.o localo = ((com.tencent.mm.aj.o)com.tencent.mm.kernel.g.K(com.tencent.mm.aj.o.class)).XP();
    AppMethodBeat.o(16225);
    return localo;
  }

  public static p XQ()
  {
    AppMethodBeat.i(16226);
    p localp = ((com.tencent.mm.aj.o)com.tencent.mm.kernel.g.K(com.tencent.mm.aj.o.class)).XQ();
    AppMethodBeat.o(16226);
    return localp;
  }

  public static be XR()
  {
    AppMethodBeat.i(16227);
    be localbe = ((com.tencent.mm.plugin.messenger.foundation.a.j)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XR();
    AppMethodBeat.o(16227);
    return localbe;
  }

  public static com.tencent.mm.plugin.downloader.f.b XS()
  {
    AppMethodBeat.i(16228);
    com.tencent.mm.plugin.downloader.f.b localb = ((com.tencent.mm.plugin.downloader.a.d)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.downloader.a.d.class)).XS();
    AppMethodBeat.o(16228);
    return localb;
  }

  public static bh XT()
  {
    AppMethodBeat.i(16229);
    bh localbh = ((com.tencent.mm.plugin.m.a.a)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.m.a.a.class)).XT();
    AppMethodBeat.o(16229);
    return localbh;
  }

  public static k XU()
  {
    AppMethodBeat.i(16230);
    k localk = ((com.tencent.mm.plugin.messenger.foundation.a.j)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XU();
    AppMethodBeat.o(16230);
    return localk;
  }

  public static ag XV()
  {
    AppMethodBeat.i(16231);
    com.tencent.mm.kernel.g.RQ();
    com.tencent.mm.kernel.g.RN().QU();
    ag localag = ((com.tencent.mm.plugin.chatroom.a.c)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.chatroom.a.c.class)).XV();
    AppMethodBeat.o(16231);
    return localag;
  }

  public static String XW()
  {
    AppMethodBeat.i(16232);
    String str = com.tencent.mm.plugin.i.c.XW();
    AppMethodBeat.o(16232);
    return str;
  }

  public static String XX()
  {
    AppMethodBeat.i(16233);
    String str = com.tencent.mm.plugin.i.c.XX();
    AppMethodBeat.o(16233);
    return str;
  }

  public static String XY()
  {
    AppMethodBeat.i(16234);
    String str = com.tencent.mm.modelvoice.q.XY();
    AppMethodBeat.o(16234);
    return str;
  }

  public static String XZ()
  {
    AppMethodBeat.i(16235);
    String str = com.tencent.mm.plugin.record.b.XZ();
    AppMethodBeat.o(16235);
    return str;
  }

  public static String Ya()
  {
    AppMethodBeat.i(16236);
    String str = aa.Ya();
    AppMethodBeat.o(16236);
    return str;
  }

  public static String Yb()
  {
    AppMethodBeat.i(16237);
    Object localObject = new StringBuilder();
    com.tencent.mm.kernel.g.RQ();
    localObject = com.tencent.mm.kernel.g.RP().eJM + "emoji/";
    AppMethodBeat.o(16237);
    return localObject;
  }

  public static String Yc()
  {
    AppMethodBeat.i(16239);
    Object localObject = new StringBuilder();
    com.tencent.mm.kernel.g.RQ();
    localObject = com.tencent.mm.kernel.g.RP().eJM + "image/shakeTranImg/";
    AppMethodBeat.o(16239);
    return localObject;
  }

  public static String Yd()
  {
    AppMethodBeat.i(16240);
    String str = com.tencent.mm.plugin.h.a.Yd();
    AppMethodBeat.o(16240);
    return str;
  }

  public static String Ye()
  {
    AppMethodBeat.i(16241);
    Object localObject = new StringBuilder();
    com.tencent.mm.kernel.g.RQ();
    localObject = com.tencent.mm.kernel.g.RP().eJM + "attachment/";
    AppMethodBeat.o(16241);
    return localObject;
  }

  public static String Yf()
  {
    AppMethodBeat.i(16242);
    String str = ((com.tencent.mm.aj.o)com.tencent.mm.kernel.g.K(com.tencent.mm.aj.o.class)).Yf();
    AppMethodBeat.o(16242);
    return str;
  }

  public static String Yg()
  {
    AppMethodBeat.i(16243);
    Object localObject = new StringBuilder();
    com.tencent.mm.kernel.g.RQ();
    localObject = com.tencent.mm.kernel.g.RP().eJM + "record/";
    AppMethodBeat.o(16243);
    return localObject;
  }

  public static String Yh()
  {
    AppMethodBeat.i(16246);
    Object localObject = new StringBuilder();
    aw.ZK();
    localObject = getAccPath() + "voiceremind/";
    AppMethodBeat.o(16246);
    return localObject;
  }

  public static String Yi()
  {
    AppMethodBeat.i(16247);
    Object localObject = new StringBuilder();
    aw.ZK();
    localObject = getAccPath() + "wenote/";
    AppMethodBeat.o(16247);
    return localObject;
  }

  public static com.tencent.mm.storage.g Yn()
  {
    AppMethodBeat.i(16257);
    com.tencent.mm.kernel.g.RQ();
    com.tencent.mm.kernel.g.RN().QU();
    com.tencent.mm.storage.g localg = com.tencent.mm.plugin.c.a.ask().Yn();
    AppMethodBeat.o(16257);
    return localg;
  }

  public static com.tencent.mm.plugin.messenger.foundation.a.a.c Yo()
  {
    AppMethodBeat.i(16258);
    com.tencent.mm.kernel.g.RQ();
    com.tencent.mm.kernel.g.RN().QU();
    com.tencent.mm.plugin.messenger.foundation.a.a.c localc = ((com.tencent.mm.plugin.messenger.foundation.a.j)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).Yo();
    AppMethodBeat.o(16258);
    return localc;
  }

  public static void a(as paramas)
  {
    AppMethodBeat.i(16212);
    com.tencent.mm.kernel.g.RQ();
    com.tencent.mm.kernel.a locala = com.tencent.mm.kernel.g.RN();
    ab.i("MMKernel.CoreAccount", "UserStatusChange: add %s", new Object[] { paramas });
    synchronized (locala.eIX)
    {
      if (!locala.eIX.contains(paramas))
        locala.eIX.add(paramas);
      AppMethodBeat.o(16212);
      return;
    }
  }

  public static void b(as paramas)
  {
    AppMethodBeat.i(16213);
    com.tencent.mm.kernel.g.RQ();
    com.tencent.mm.kernel.a locala = com.tencent.mm.kernel.g.RN();
    ab.i("MMKernel.CoreAccount", "UserStatusChange: remove %s", new Object[] { paramas });
    synchronized (locala.eIX)
    {
      locala.eIX.remove(paramas);
      AppMethodBeat.o(16213);
      return;
    }
  }

  public static void closeDB()
  {
    AppMethodBeat.i(16211);
    com.tencent.mm.kernel.g.RQ();
    com.tencent.mm.kernel.g.RP().jC(null);
    AppMethodBeat.o(16211);
  }

  public static String getAccPath()
  {
    AppMethodBeat.i(16251);
    com.tencent.mm.kernel.g.RQ();
    String str = com.tencent.mm.kernel.g.RP().eJM;
    AppMethodBeat.o(16251);
    return str;
  }

  public static String getAccSnsPath()
  {
    AppMethodBeat.i(16244);
    String str = ((com.tencent.mm.plugin.sns.b.b)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.sns.b.b.class)).getAccSnsPath();
    AppMethodBeat.o(16244);
    return str;
  }

  public static String getAccSnsTmpPath()
  {
    AppMethodBeat.i(16245);
    String str = ((com.tencent.mm.plugin.sns.b.b)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.sns.b.b.class)).getAccSnsTmpPath();
    AppMethodBeat.o(16245);
    return str;
  }

  public static String getAccVideoPath()
  {
    AppMethodBeat.i(16238);
    com.tencent.mm.modelvideo.o.alk();
    String str = com.tencent.mm.modelvideo.o.getAccVideoPath();
    AppMethodBeat.o(16238);
    return str;
  }

  public static boolean isSDCardAvailable()
  {
    AppMethodBeat.i(16209);
    com.tencent.mm.kernel.g.RQ();
    boolean bool = com.tencent.mm.kernel.g.RP().isSDCardAvailable();
    AppMethodBeat.o(16209);
    return bool;
  }

  public static void iy(int paramInt)
  {
    AppMethodBeat.i(16253);
    q.kt(paramInt);
    if ((paramInt & 0x10) != 0)
    {
      bf.a("medianote", null);
      aw.ZK();
      XR().aoX("medianote");
    }
    AppMethodBeat.o(16253);
  }

  public static SharedPreferences lK(String paramString)
  {
    AppMethodBeat.i(16219);
    com.tencent.mm.kernel.g.RQ();
    paramString = com.tencent.mm.kernel.g.RP().lK(paramString);
    AppMethodBeat.o(16219);
    return paramString;
  }

  public final void Yj()
  {
    AppMethodBeat.i(16252);
    Object localObject = new StringBuilder("mm");
    com.tencent.mm.kernel.g.RQ();
    com.tencent.mm.kernel.g.RN();
    String str1 = com.tencent.mm.a.g.x(com.tencent.mm.kernel.a.QF().getBytes());
    localObject = ac.eSj + str1 + "/";
    String str2 = com.tencent.mm.compatible.util.e.eSn + str1 + "/";
    String[] arrayOfString = new com.tencent.mm.vfs.b((String)localObject).a(new com.tencent.mm.vfs.i()
    {
      public final boolean ml(String paramAnonymousString)
      {
        AppMethodBeat.i(16203);
        boolean bool;
        if ((paramAnonymousString.equals("EnMicroMsg.db")) || (paramAnonymousString.startsWith("EnMicroMsg.dberr")) || (paramAnonymousString.equals("FTS5IndexMicroMsg_encrypt.db")))
        {
          bool = true;
          AppMethodBeat.o(16203);
        }
        while (true)
        {
          return bool;
          bool = false;
          AppMethodBeat.o(16203);
        }
      }
    });
    if (arrayOfString == null)
      AppMethodBeat.o(16252);
    while (true)
    {
      return;
      int i = arrayOfString.length;
      for (int j = 0; j < i; j++)
      {
        String str3 = arrayOfString[j];
        str1 = str2 + str3 + ".dump";
        com.tencent.mm.vfs.e.deleteFile(str1);
        com.tencent.mm.vfs.e.y((String)localObject + str3, str1);
        ab.i("MicroMsg.AccountStorage", "Exported: ".concat(String.valueOf(str1)));
      }
      AppMethodBeat.o(16252);
    }
  }

  public final com.tencent.mm.model.b.c Yk()
  {
    AppMethodBeat.i(16254);
    com.tencent.mm.kernel.g.RQ();
    com.tencent.mm.kernel.g.RN().QU();
    com.tencent.mm.model.b.c localc = this.fkg;
    AppMethodBeat.o(16254);
    return localc;
  }

  public final com.tencent.mm.model.b.d Yl()
  {
    AppMethodBeat.i(16255);
    com.tencent.mm.kernel.g.RQ();
    com.tencent.mm.kernel.g.RN().QU();
    com.tencent.mm.model.b.d locald = this.fkh;
    AppMethodBeat.o(16255);
    return locald;
  }

  public final com.tencent.mm.model.b.b Ym()
  {
    AppMethodBeat.i(16256);
    com.tencent.mm.kernel.g.RQ();
    com.tencent.mm.kernel.g.RN().QU();
    com.tencent.mm.model.b.b localb = this.fkl;
    AppMethodBeat.o(16256);
    return localb;
  }

  public final com.tencent.mm.storage.j Yp()
  {
    AppMethodBeat.i(16259);
    com.tencent.mm.kernel.g.RQ();
    com.tencent.mm.kernel.g.RN().QU();
    com.tencent.mm.storage.j localj = this.fki;
    AppMethodBeat.o(16259);
    return localj;
  }

  public final n Yq()
  {
    AppMethodBeat.i(16260);
    com.tencent.mm.kernel.g.RQ();
    com.tencent.mm.kernel.g.RN().QU();
    n localn = this.fkj;
    AppMethodBeat.o(16260);
    return localn;
  }

  public final l Yr()
  {
    AppMethodBeat.i(16261);
    com.tencent.mm.kernel.g.RQ();
    com.tencent.mm.kernel.g.RN().QU();
    l locall = this.fkk;
    AppMethodBeat.o(16261);
    return locall;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.model.c
 * JD-Core Version:    0.6.2
 */