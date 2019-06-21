package com.tencent.mm.plugin.sns.i;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.storage.n;
import com.tencent.mm.protocal.protobuf.TimeLineObject;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.HashSet;
import java.util.Iterator;

public final class b
{
  c ecA;
  int edf;
  public int jLU;
  public boolean qQO;
  public long qQP;
  public long qQQ;
  public int qQR;
  int qQS;
  int qQT;
  int qQU;
  public int qQV;
  public int qQW;
  int qQX;
  public int qQY;
  public int qQZ;
  public long qRA;
  long qRB;
  long qRC;
  long qRD;
  long qRE;
  long qRF;
  long qRG;
  long qRH;
  long qRI;
  long qRJ;
  long qRK;
  long qRL;
  long qRM;
  long qRN;
  long qRO;
  long qRP;
  long qRQ;
  long qRR;
  long qRS;
  long qRT;
  long qRU;
  long qRV;
  long qRW;
  long qRX;
  long qRY;
  long qRZ;
  int qRa;
  public int qRb;
  public int qRc;
  public String qRd;
  public String qRe;
  String qRf;
  int qRg;
  public int qRh;
  public int qRi;
  public int qRj;
  public int qRk;
  public int qRl;
  public int qRm;
  public int qRn;
  public int qRo;
  int qRp;
  int qRq;
  int qRr;
  int qRs;
  int qRt;
  int qRu;
  public int qRv;
  public int qRw;
  int qRx;
  int qRy;
  public long qRz;
  public HashSet<String> qSA;
  public HashSet<String> qSB;
  public HashSet<String> qSC;
  public HashSet<String> qSD;
  public HashSet<String> qSE;
  public HashSet<String> qSF;
  public HashSet<String> qSG;
  public HashSet<String> qSH;
  public HashSet<String> qSI;
  public HashSet<String> qSJ;
  public HashSet<String> qSK;
  public HashSet<String> qSL;
  public long qSM;
  long qSa;
  long qSb;
  long qSc;
  String qSd;
  int qSe;
  String qSf;
  long qSg;
  private long qSh;
  long qSi;
  private long qSj;
  private HashSet<String> qSk;
  HashSet<String> qSl;
  public HashSet<String> qSm;
  HashSet<String> qSn;
  public HashSet<String> qSo;
  HashSet<String> qSp;
  HashSet<String> qSq;
  public HashSet<String> qSr;
  public HashSet<String> qSs;
  HashSet<String> qSt;
  public HashSet<String> qSu;
  private HashSet<String> qSv;
  public HashSet<String> qSw;
  public HashSet<String> qSx;
  public int qSy;
  public int qSz;

  public b()
  {
    AppMethodBeat.i(36865);
    this.qQO = false;
    this.qQP = -1L;
    this.qQQ = 0L;
    this.qQR = 0;
    this.qQS = 0;
    this.qQT = 0;
    this.qQU = 0;
    this.qQV = 0;
    this.qQW = 0;
    this.qQX = 0;
    this.qQY = 0;
    this.qQZ = 0;
    this.qRa = 0;
    this.qRb = 0;
    this.qRc = 0;
    this.qRd = "";
    this.qRe = "";
    this.qRf = "";
    this.qRh = 0;
    this.qRi = 0;
    this.qRj = 0;
    this.qRk = 0;
    this.qRl = 0;
    this.qRm = 0;
    this.qRn = 0;
    this.jLU = 0;
    this.qRo = 0;
    this.qRp = 0;
    this.qRq = 0;
    this.qRr = 0;
    this.qRs = 0;
    this.qRt = 0;
    this.qRu = 0;
    this.qRv = 0;
    this.qRw = 0;
    this.qRx = 0;
    this.qRy = 0;
    this.qRz = 0L;
    this.qRA = 0L;
    this.qRB = 0L;
    this.qRC = 0L;
    this.qRD = 0L;
    this.qRE = 0L;
    this.qRF = 0L;
    this.qRG = 0L;
    this.qRH = 0L;
    this.qRI = 0L;
    this.qRJ = 0L;
    this.qRK = 0L;
    this.qRL = 0L;
    this.qRM = 0L;
    this.qRN = 0L;
    this.qRO = 0L;
    this.qRP = 0L;
    this.qRQ = 0L;
    this.qRR = 0L;
    this.qRS = 0L;
    this.qRT = 0L;
    this.qRU = 0L;
    this.qRV = 0L;
    this.qRW = 0L;
    this.qRX = 0L;
    this.qRY = 0L;
    this.qRZ = 0L;
    this.qSa = 0L;
    this.qSb = 0L;
    this.qSc = 0L;
    this.qSg = 0L;
    this.qSh = 0L;
    this.qSi = 0L;
    this.qSj = 0L;
    this.qSk = new HashSet();
    this.qSl = new HashSet();
    this.qSm = new HashSet();
    this.qSn = new HashSet();
    this.qSo = new HashSet();
    this.qSp = new HashSet();
    this.qSq = new HashSet();
    this.qSr = new HashSet();
    this.qSs = new HashSet();
    this.qSt = new HashSet();
    this.qSu = new HashSet();
    this.qSv = new HashSet();
    this.qSw = new HashSet();
    this.qSx = new HashSet();
    this.qSy = 2147483647;
    this.qSz = 0;
    this.qSA = new HashSet();
    this.qSB = new HashSet();
    this.qSC = new HashSet();
    this.qSD = new HashSet();
    this.qSE = new HashSet();
    this.qSF = new HashSet();
    this.qSG = new HashSet();
    this.qSH = new HashSet();
    this.qSI = new HashSet();
    this.qSJ = new HashSet();
    this.qSK = new HashSet();
    this.qSL = new HashSet();
    this.ecA = new b.1(this);
    this.qSM = 0L;
    a.xxA.c(this.ecA);
    AppMethodBeat.o(36865);
  }

  public b(int paramInt1, String paramString1, int paramInt2, String paramString2)
  {
    this();
    this.edf = paramInt1;
    this.qSd = paramString1;
    this.qSe = paramInt2;
    this.qSf = paramString2;
  }

  static String f(HashSet<String> paramHashSet)
  {
    AppMethodBeat.i(36866);
    StringBuffer localStringBuffer = new StringBuffer();
    paramHashSet = paramHashSet.iterator();
    int i = 1;
    while (paramHashSet.hasNext())
    {
      String str = (String)paramHashSet.next();
      if (i != 0)
      {
        localStringBuffer.append(str);
        i = 0;
      }
      else
      {
        localStringBuffer.append("|".concat(String.valueOf(str)));
      }
    }
    paramHashSet = localStringBuffer.toString();
    AppMethodBeat.o(36866);
    return paramHashSet;
  }

  public final void a(n paramn, boolean paramBoolean)
  {
    AppMethodBeat.i(36848);
    if (paramn == null)
      AppMethodBeat.o(36848);
    while (true)
    {
      return;
      if (paramBoolean)
        this.qSp.add(i.j(paramn));
      while (true)
      {
        this.qSt.add(paramn.field_userName);
        this.qQU = this.qSt.size();
        if (!af.cnk().equals(paramn.field_userName))
          break label98;
        kL(true);
        AppMethodBeat.o(36848);
        break;
        this.qSq.add(i.j(paramn));
      }
      label98: kM(true);
      AppMethodBeat.o(36848);
    }
  }

  public final void gg(String paramString1, String paramString2)
  {
    AppMethodBeat.i(36849);
    this.qSn.add(paramString2);
    this.qSv.add(paramString1);
    this.qQX = this.qSv.size();
    AppMethodBeat.o(36849);
  }

  public final void kK(boolean paramBoolean)
  {
    AppMethodBeat.i(36850);
    if (paramBoolean)
    {
      this.qRC = System.currentTimeMillis();
      AppMethodBeat.o(36850);
    }
    while (true)
    {
      return;
      if (this.qRC > 0L)
      {
        this.qRB += System.currentTimeMillis() - this.qRC;
        this.qRC = 0L;
      }
      AppMethodBeat.o(36850);
    }
  }

  public final void kL(boolean paramBoolean)
  {
    AppMethodBeat.i(36851);
    if (paramBoolean)
    {
      this.qRE = System.currentTimeMillis();
      AppMethodBeat.o(36851);
    }
    while (true)
    {
      return;
      if (this.qRE > 0L)
      {
        this.qRD += System.currentTimeMillis() - this.qRE;
        this.qRE = 0L;
      }
      AppMethodBeat.o(36851);
    }
  }

  public final void kM(boolean paramBoolean)
  {
    AppMethodBeat.i(36852);
    if (paramBoolean)
    {
      this.qRG = System.currentTimeMillis();
      AppMethodBeat.o(36852);
    }
    while (true)
    {
      return;
      if (this.qRG > 0L)
      {
        this.qRF += System.currentTimeMillis() - this.qRG;
        this.qRG = 0L;
      }
      AppMethodBeat.o(36852);
    }
  }

  public final void kN(boolean paramBoolean)
  {
    AppMethodBeat.i(36853);
    if (paramBoolean)
    {
      this.qRI = System.currentTimeMillis();
      AppMethodBeat.o(36853);
    }
    while (true)
    {
      return;
      if (this.qRI > 0L)
      {
        this.qRH += System.currentTimeMillis() - this.qRI;
        this.qRI = 0L;
      }
      AppMethodBeat.o(36853);
    }
  }

  public final void kO(boolean paramBoolean)
  {
    AppMethodBeat.i(36854);
    if (paramBoolean)
    {
      this.qRK = System.currentTimeMillis();
      AppMethodBeat.o(36854);
    }
    while (true)
    {
      return;
      if (this.qRK > 0L)
      {
        this.qRJ += System.currentTimeMillis() - this.qRK;
        this.qRK = 0L;
      }
      AppMethodBeat.o(36854);
    }
  }

  public final void kP(boolean paramBoolean)
  {
    AppMethodBeat.i(36855);
    if (paramBoolean)
    {
      this.qRM = System.currentTimeMillis();
      AppMethodBeat.o(36855);
    }
    while (true)
    {
      return;
      if (this.qRM > 0L)
      {
        this.qRL += System.currentTimeMillis() - this.qRM;
        this.qRM = 0L;
      }
      AppMethodBeat.o(36855);
    }
  }

  public final void kQ(boolean paramBoolean)
  {
    AppMethodBeat.i(36856);
    if (paramBoolean)
    {
      this.qSh = System.currentTimeMillis();
      AppMethodBeat.o(36856);
    }
    while (true)
    {
      return;
      if (this.qSh > 0L)
      {
        this.qSg += System.currentTimeMillis() - this.qSh;
        this.qSh = 0L;
      }
      AppMethodBeat.o(36856);
    }
  }

  public final void kR(boolean paramBoolean)
  {
    AppMethodBeat.i(36857);
    if (paramBoolean)
    {
      this.qSj = System.currentTimeMillis();
      AppMethodBeat.o(36857);
    }
    while (true)
    {
      return;
      if (this.qSj > 0L)
      {
        this.qSi += System.currentTimeMillis() - this.qSj;
        this.qSj = 0L;
      }
      AppMethodBeat.o(36857);
    }
  }

  public final void kS(boolean paramBoolean)
  {
    AppMethodBeat.i(36858);
    if (paramBoolean)
    {
      this.qRO = System.currentTimeMillis();
      AppMethodBeat.o(36858);
    }
    while (true)
    {
      return;
      if (this.qRO > 0L)
      {
        this.qRN += System.currentTimeMillis() - this.qRO;
        this.qRO = 0L;
      }
      AppMethodBeat.o(36858);
    }
  }

  public final void kT(boolean paramBoolean)
  {
    AppMethodBeat.i(36859);
    if (paramBoolean)
    {
      this.qRQ = System.currentTimeMillis();
      AppMethodBeat.o(36859);
    }
    while (true)
    {
      return;
      if (this.qRQ > 0L)
      {
        this.qRP += System.currentTimeMillis() - this.qRQ;
        this.qRQ = 0L;
      }
      AppMethodBeat.o(36859);
    }
  }

  public final void kU(boolean paramBoolean)
  {
    AppMethodBeat.i(36860);
    if (paramBoolean)
    {
      this.qRS = System.currentTimeMillis();
      AppMethodBeat.o(36860);
    }
    while (true)
    {
      return;
      if (this.qRS > 0L)
      {
        this.qRR += System.currentTimeMillis() - this.qRS;
        this.qRS = 0L;
      }
      AppMethodBeat.o(36860);
    }
  }

  public final void kV(boolean paramBoolean)
  {
    AppMethodBeat.i(36861);
    if (paramBoolean)
    {
      this.qRU = System.currentTimeMillis();
      AppMethodBeat.o(36861);
    }
    while (true)
    {
      return;
      if (this.qRU > 0L)
      {
        this.qRT += System.currentTimeMillis() - this.qRU;
        this.qRU = 0L;
      }
      AppMethodBeat.o(36861);
    }
  }

  public final void kW(boolean paramBoolean)
  {
    AppMethodBeat.i(36862);
    if (paramBoolean)
    {
      this.qRY = System.currentTimeMillis();
      AppMethodBeat.o(36862);
    }
    while (true)
    {
      return;
      if (this.qRY > 0L)
      {
        this.qRX += System.currentTimeMillis() - this.qRY;
        this.qRY = 0L;
      }
      AppMethodBeat.o(36862);
    }
  }

  public final void kX(boolean paramBoolean)
  {
    AppMethodBeat.i(36863);
    if (paramBoolean)
    {
      this.qSa = System.currentTimeMillis();
      AppMethodBeat.o(36863);
    }
    while (true)
    {
      return;
      if (this.qSa > 0L)
      {
        this.qRZ += System.currentTimeMillis() - this.qSa;
        this.qSa = 0L;
      }
      AppMethodBeat.o(36863);
    }
  }

  public final void kY(boolean paramBoolean)
  {
    AppMethodBeat.i(36864);
    if (paramBoolean)
    {
      this.qSc = System.currentTimeMillis();
      AppMethodBeat.o(36864);
    }
    while (true)
    {
      return;
      if (this.qSc > 0L)
      {
        this.qSb += System.currentTimeMillis() - this.qSc;
        this.qSc = 0L;
      }
      AppMethodBeat.o(36864);
    }
  }

  public final void kZ(boolean paramBoolean)
  {
    if (paramBoolean);
    for (int i = 1; ; i = 0)
    {
      this.qRg = i;
      return;
    }
  }

  public final void w(n paramn)
  {
    AppMethodBeat.i(36846);
    if (paramn == null)
      AppMethodBeat.o(36846);
    while (true)
    {
      return;
      this.qSk.add(paramn.cqU());
      this.qQS = this.qSk.size();
      AppMethodBeat.o(36846);
    }
  }

  public final void x(n paramn)
  {
    AppMethodBeat.i(36847);
    if (paramn == null)
      AppMethodBeat.o(36847);
    while (true)
    {
      return;
      String str1 = paramn.cqU();
      String str2 = i.j(paramn);
      if (this.qSl.contains(str2))
      {
        AppMethodBeat.o(36847);
      }
      else
      {
        ab.i("MicroMsg.SnsBrowseInfoHelper", "onClickFeed localId:Td, snsId:%s", new Object[] { str1, str2 });
        this.qQT += 1;
        this.qSl.add(str2);
        if (paramn.DI(32))
          this.qRy += 1;
        switch (paramn.field_type)
        {
        default:
        case 1:
        case 4:
        case 15:
        case 5:
        case 18:
        case 3:
        }
        while (true)
          if (paramn.DI(32))
          {
            if ((paramn.cqo() != null) && (paramn.cqo().coK()))
            {
              kQ(true);
              AppMethodBeat.o(36847);
              break;
              this.qRr += 1;
              continue;
              this.qRt += 1;
              continue;
              this.qRs += 1;
              continue;
              this.qRu += 1;
              continue;
              this.qRx += 1;
              continue;
              if (!bo.isNullOrNil(paramn.cqu().xfJ))
              {
                this.qRp += 1;
                continue;
              }
              this.qRq += 1;
              continue;
            }
            if (paramn.field_type == 1)
            {
              kV(true);
              AppMethodBeat.o(36847);
              break;
            }
            if (paramn.field_type != 15)
              break label452;
            kW(true);
            AppMethodBeat.o(36847);
            break;
          }
        if ((paramn.cqu() == null) || (bo.isNullOrNil(paramn.cqu().rCK)))
          break;
        kR(true);
        AppMethodBeat.o(36847);
      }
    }
    switch (paramn.field_type)
    {
    default:
    case 1:
    case 4:
    case 15:
    case 5:
    case 18:
    case 3:
    }
    while (true)
    {
      label452: AppMethodBeat.o(36847);
      break;
      kP(true);
      AppMethodBeat.o(36847);
      break;
      kU(true);
      AppMethodBeat.o(36847);
      break;
      kS(true);
      AppMethodBeat.o(36847);
      break;
      kU(true);
      AppMethodBeat.o(36847);
      break;
      kY(true);
      AppMethodBeat.o(36847);
      break;
      if (!bo.isNullOrNil(paramn.cqu().xfJ))
      {
        kT(true);
        AppMethodBeat.o(36847);
        break;
      }
      kU(true);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.i.b
 * JD-Core Version:    0.6.2
 */