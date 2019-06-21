package com.tencent.mm.platformtools;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.HashMap;
import java.util.concurrent.ConcurrentLinkedQueue;

public final class ae
{
  public static boolean ghN;
  public static boolean ghO;
  public static boolean ghP;
  public static boolean ghQ;
  public static boolean ghR;
  public static boolean ghS;
  public static boolean ghT;
  public static boolean ghU;
  public static boolean ghV;
  public static boolean ghW;
  public static boolean ghX;
  public static boolean ghY;
  public static String ghZ;
  public static int giA;
  public static String giB;
  public static String giC;
  public static String giD;
  public static String giE;
  public static boolean giF;
  public static boolean giG;
  public static boolean giH;
  public static boolean giI;
  public static String giJ;
  public static String giK;
  public static String giL;
  public static String giM;
  public static String giN;
  public static boolean giO;
  public static boolean giP;
  public static boolean giQ;
  public static int giR;
  public static boolean giS;
  public static boolean giT;
  public static boolean giU;
  public static boolean giV;
  public static boolean giW;
  public static boolean giX;
  public static boolean giY;
  public static boolean giZ;
  public static boolean gia;
  public static boolean gib;
  public static boolean gic;
  public static boolean gid;
  public static int gie;
  public static boolean gif;
  public static boolean gig;
  public static boolean gih;
  public static String gii;
  public static String gij;
  public static boolean gik;
  public static boolean gil;
  public static boolean gim;
  public static boolean gin;
  public static boolean gio;
  public static boolean gip;
  public static boolean giq;
  public static int gir;
  public static int gis;
  public static boolean git;
  public static String giu;
  public static String giv;
  public static boolean giw;
  public static boolean gix;
  public static int giy;
  public static int giz;
  public static boolean gjA;
  public static boolean gjB;
  private static HashMap<Integer, ConcurrentLinkedQueue<Integer>> gjC;
  public static boolean gjD;
  public static boolean gjE;
  public static boolean gjF;
  public static boolean gja;
  public static String gjb;
  public static int gjc;
  public static boolean gjd;
  public static boolean gje;
  public static int gjf;
  public static boolean gjg;
  public static String gjh;
  public static float gji;
  public static float gjj;
  public static boolean gjk;
  public static String gjl;
  public static String gjm;
  public static boolean gjn;
  public static boolean gjo;
  public static String gjp;
  public static String gjq;
  public static boolean gjr;
  public static boolean gjs;
  public static boolean gjt;
  public static boolean gju;
  public static boolean gjv;
  public static boolean gjw;
  public static boolean gjx;
  public static boolean gjy;
  public static boolean gjz;
  public static double lat;
  public static double lng;

  static
  {
    AppMethodBeat.i(58737);
    ghN = false;
    ghO = false;
    ghP = false;
    ghQ = false;
    ghR = false;
    ghS = false;
    ghT = false;
    ghU = false;
    ghV = false;
    ghW = false;
    ghX = false;
    ghY = false;
    ghZ = "";
    gia = false;
    gib = false;
    gic = false;
    gid = false;
    gie = 0;
    gif = false;
    gig = false;
    gih = false;
    gii = "";
    gij = "";
    gik = false;
    gil = false;
    gim = false;
    gin = false;
    gio = false;
    gip = false;
    giq = false;
    gir = 0;
    gis = 0;
    git = false;
    giu = null;
    giv = null;
    giw = false;
    gix = false;
    giy = 0;
    giz = 0;
    giA = 0;
    giB = "";
    giC = "";
    giD = null;
    giE = null;
    giF = false;
    giG = false;
    giH = false;
    giI = false;
    lat = 0.0D;
    lng = 0.0D;
    giJ = "";
    giK = "";
    giL = "";
    giM = "";
    giN = "";
    giO = false;
    giP = false;
    giQ = false;
    giR = 0;
    giS = false;
    giT = false;
    giU = false;
    giV = false;
    giW = false;
    giX = false;
    giY = true;
    giZ = false;
    gja = false;
    gjb = "";
    gjc = 0;
    gjd = false;
    gje = false;
    gjf = -1;
    gjg = false;
    gjh = "";
    gji = 0.4F;
    gjj = 0.7F;
    gjk = false;
    gjl = "";
    gjm = "";
    gjn = false;
    gjo = false;
    gjp = "";
    gjq = "";
    gjr = false;
    gjs = false;
    gjt = false;
    gju = false;
    gjv = false;
    gjw = false;
    gjx = false;
    gjy = false;
    gjz = false;
    gjA = false;
    gjB = false;
    gjC = new HashMap();
    gjD = false;
    gjE = false;
    gjF = false;
    AppMethodBeat.o(58737);
  }

  public static void cH(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(58736);
    synchronized (gjC)
    {
      ConcurrentLinkedQueue localConcurrentLinkedQueue1 = (ConcurrentLinkedQueue)gjC.get(Integer.valueOf(paramInt1));
      ConcurrentLinkedQueue localConcurrentLinkedQueue2 = localConcurrentLinkedQueue1;
      if (localConcurrentLinkedQueue1 == null)
      {
        localConcurrentLinkedQueue2 = new java/util/concurrent/ConcurrentLinkedQueue;
        localConcurrentLinkedQueue2.<init>();
        gjC.put(Integer.valueOf(paramInt1), localConcurrentLinkedQueue2);
      }
      localConcurrentLinkedQueue2.add(Integer.valueOf(paramInt2));
      AppMethodBeat.o(58736);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.platformtools.ae
 * JD-Core Version:    0.6.2
 */