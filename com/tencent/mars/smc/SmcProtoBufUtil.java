package com.tencent.mars.smc;

import com.tencent.mm.protocal.a.a.a;
import com.tencent.mm.protocal.a.a.c;
import com.tencent.mm.protocal.a.a.d;
import com.tencent.mm.protocal.a.a.e;
import com.tencent.mm.protocal.a.a.f;
import com.tencent.mm.protocal.a.a.g;
import com.tencent.mm.protocal.a.a.h;
import com.tencent.mm.protocal.a.a.i;
import com.tencent.mm.protocal.a.a.j;
import com.tencent.mm.protocal.a.a.k;
import com.tencent.mm.protocal.a.a.l;
import com.tencent.mm.protocal.a.a.m;
import com.tencent.mm.protocal.a.a.n;
import com.tencent.mm.protocal.a.a.o;
import com.tencent.mm.protocal.protobuf.ahi;
import com.tencent.mm.protocal.protobuf.ahj;
import com.tencent.mm.protocal.protobuf.auf;
import com.tencent.mm.protocal.protobuf.aug;
import com.tencent.mm.protocal.protobuf.awy;
import com.tencent.mm.protocal.protobuf.bei;
import com.tencent.mm.protocal.protobuf.cff;
import com.tencent.mm.protocal.protobuf.sj;
import com.tencent.mm.protocal.protobuf.sk;
import com.tencent.mm.protocal.protobuf.sl;
import java.util.ArrayList;
import java.util.LinkedList;

public class SmcProtoBufUtil
{
  private static o fillStrategyTable(LinkedList<cff> paramLinkedList)
  {
    o localo = new o();
    for (int i = 0; i < paramLinkedList.size(); i++)
    {
      cff localcff = (cff)paramLinkedList.get(i);
      m localm = new m();
      localm.vzw = localcff.xeK;
      localm.vzx = localcff.xeL;
      for (int j = 0; j < localcff.xeM.size(); j++)
      {
        bei localbei = (bei)localcff.xeM.get(j);
        n localn = new n();
        localn.vyQ = localbei.wBd;
        localn.vzz = localbei.wIs;
        localn.vzA = localbei.wIq;
        localn.vzB = localbei.wIr;
        localn.vzC = localbei.wIt;
        localn.vzD = localbei.wIu;
        localn.vzE = localbei.wIv;
        localn.type = localbei.jCt;
        localm.vzy.add(localn);
      }
      localo.vzF.add(localm);
    }
    return localo;
  }

  public static ahi toMMGetStrategyReq()
  {
    ahi localahi = new ahi();
    ArrayList localArrayList = SmcLogic.getStrategyVersions();
    if (localArrayList.size() != 6)
      localahi = null;
    while (true)
    {
      return localahi;
      localahi.vZG = ((Integer)localArrayList.get(0)).intValue();
      localahi.vZH = ((Integer)localArrayList.get(1)).intValue();
      localahi.vZI = ((Integer)localArrayList.get(2)).intValue();
      localahi.wnO = ((Integer)localArrayList.get(3)).intValue();
      localahi.wnP = ((Integer)localArrayList.get(4)).intValue();
      localahi.wnQ = ((Integer)localArrayList.get(5)).intValue();
    }
  }

  public static sk toMMReportIdkeyReq(g paramg)
  {
    sk localsk = new sk();
    localsk.vZG = paramg.vyT;
    localsk.vZH = paramg.vzj;
    localsk.vZI = 0;
    for (int i = 0; i < paramg.vzk.size(); i++)
    {
      com.tencent.mm.protocal.a.a.b localb = (com.tencent.mm.protocal.a.a.b)paramg.vzk.get(i);
      sj localsj = new sj();
      localsj.luF = localb.uin;
      localsj.vKd = localb.vyR;
      localsj.vZF = localb.nettype;
      for (int j = 0; j < localb.vyS.size(); j++)
      {
        a locala = (a)localb.vyS.get(j);
        awy localawy = new awy();
        localawy.wBd = locala.vyQ;
        localawy.wdc = 0;
        localawy.wBf = 0;
        localawy.jBv = locala.count;
        localawy.wBe = com.tencent.mm.bt.b.bI(Integer.toString(locala.value).getBytes());
        localsj.naO.add(localawy);
      }
      localsk.vZJ.add(localsj);
    }
    return localsk;
  }

  public static sk toMMReportKvReq(i parami)
  {
    sk localsk = new sk();
    localsk.vZG = parami.vyT;
    localsk.vZH = parami.vzj;
    localsk.vZI = parami.vzh;
    for (int i = 0; i < parami.vzk.size(); i++)
    {
      e locale = (e)parami.vzk.get(i);
      sj localsj = new sj();
      localsj.luF = locale.uin;
      localsj.vKd = locale.vyR;
      localsj.vZF = locale.nettype;
      localsj.vOB = locale.vzd;
      localsj.vOz = locale.vzb;
      localsj.vOA = locale.vzc;
      localsj.vOC = locale.vze;
      localsj.vOD = locale.vzf;
      localsj.jCy = locale.vzg;
      for (int j = 0; j < locale.vyS.size(); j++)
      {
        d locald = (d)locale.vyS.get(j);
        awy localawy = new awy();
        localawy.wBd = locald.vyQ;
        localawy.wBe = locald.vyZ;
        localawy.wBf = locald.vza;
        localawy.wdc = locald.qsz;
        localawy.jBv = locald.count;
        localsj.naO.add(localawy);
      }
      localsk.vZJ.add(localsj);
    }
    return localsk;
  }

  public static auf toMMSelfMonitor(k paramk)
  {
    auf localauf = new auf();
    localauf.wye = paramk.vzn;
    for (int i = 0; i < paramk.vzo.size(); i++)
    {
      aug localaug = new aug();
      l locall = (l)paramk.vzo.get(i);
      localaug.wyf = locall.vzp;
      localaug.cts = locall.action;
      localaug.wyg = locall.vzq;
      localaug.wyh = locall.vzr;
      localaug.wyi = locall.vzs;
      localaug.wyj = locall.vzt;
      localaug.wyk = locall.vzu;
      localaug.wyl = locall.vzv;
      localauf.naO.add(localaug);
    }
    return localauf;
  }

  public static c toSmcIdkeyStrategyResp(ahj paramahj)
  {
    c localc = new c();
    localc.ret = paramahj.Ret;
    localc.vyT = paramahj.vZM;
    localc.vyU = paramahj.vZN;
    localc.vyX = paramahj.vZS;
    localc.vyY = paramahj.vZU;
    localc.vyV = fillStrategyTable(paramahj.vZP);
    localc.vyW = fillStrategyTable(paramahj.vZQ);
    return localc;
  }

  public static f toSmcKVStrategyResp(ahj paramahj)
  {
    f localf = new f();
    localf.ret = paramahj.Ret;
    localf.vyT = paramahj.wnO;
    localf.vyU = paramahj.wnP;
    localf.vzh = paramahj.wnQ;
    localf.vyX = paramahj.vZS;
    localf.vyY = paramahj.vZU;
    localf.vyV = fillStrategyTable(paramahj.wnR);
    localf.vyW = fillStrategyTable(paramahj.wnS);
    localf.vzi = fillStrategyTable(paramahj.wnT);
    return localf;
  }

  public static h toSmcReportIdkeyResp(sl paramsl)
  {
    h localh = new h();
    localh.ret = paramsl.Ret;
    localh.vyT = paramsl.vZM;
    localh.vyU = paramsl.vZN;
    localh.vyX = paramsl.vZS;
    localh.vzm = paramsl.vZT;
    localh.vyY = paramsl.vZU;
    localh.vyV = fillStrategyTable(paramsl.vZP);
    localh.vyW = fillStrategyTable(paramsl.vZQ);
    return localh;
  }

  public static j toSmcReportKvResp(sl paramsl)
  {
    j localj = new j();
    localj.ret = paramsl.Ret;
    localj.vyT = paramsl.vZM;
    localj.vyU = paramsl.vZN;
    localj.vzh = paramsl.vZO;
    localj.vyX = paramsl.vZS;
    localj.vzm = paramsl.vZT;
    localj.vyY = paramsl.vZU;
    localj.vyV = fillStrategyTable(paramsl.vZP);
    localj.vyW = fillStrategyTable(paramsl.vZQ);
    localj.vzi = fillStrategyTable(paramsl.vZR);
    return localj;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mars.smc.SmcProtoBufUtil
 * JD-Core Version:    0.6.2
 */