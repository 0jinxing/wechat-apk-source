package com.tencent.pb.common.b.a;

import com.google.a.a.b;
import com.google.a.a.c;
import com.google.a.a.e;
import com.google.a.a.g;
import java.util.Arrays;

public abstract interface a
{
  public static final class ad extends e
  {
    public String Amx = "";
    public String groupId = "";
    public int sQS = 0;
    public long sQT = 0L;

    public ad()
    {
      this.bxt = -1;
    }

    public final void a(b paramb)
    {
      if (!this.groupId.equals(""))
        paramb.e(1, this.groupId);
      if (this.sQS != 0)
        paramb.bq(2, this.sQS);
      if (this.sQT != 0L)
        paramb.m(3, this.sQT);
      if (!this.Amx.equals(""))
        paramb.e(4, this.Amx);
      super.a(paramb);
    }

    public final int vr()
    {
      int i = super.vr();
      int j = i;
      if (!this.groupId.equals(""))
        j = i + b.f(1, this.groupId);
      i = j;
      if (this.sQS != 0)
        i = j + b.bs(2, this.sQS);
      j = i;
      if (this.sQT != 0L)
        j = i + b.o(3, this.sQT);
      i = j;
      if (!this.Amx.equals(""))
        i = j + b.f(4, this.Amx);
      return i;
    }
  }

  public static final class af extends e
  {
    public int Aof = 0;
    public int Aog = 0;
    public int Aoh = 0;
    public int Aoi = 0;
    public int Aoj = 0;
    public int Aok = 0;
    public int Aol = -1;
    public int Aom = 0;
    public int nwu = 0;
    public long nwv = 0L;

    public af()
    {
      this.bxt = -1;
    }

    public final void a(b paramb)
    {
      if (this.Aof != 0)
        paramb.br(1, this.Aof);
      if (this.nwu != 0)
        paramb.bq(2, this.nwu);
      if (this.nwv != 0L)
        paramb.m(3, this.nwv);
      if (this.Aog != 0)
        paramb.br(4, this.Aog);
      if (this.Aoh != 0)
        paramb.br(5, this.Aoh);
      if (this.Aoi != 0)
        paramb.br(6, this.Aoi);
      if (this.Aoj != 0)
        paramb.br(7, this.Aoj);
      if (this.Aok != 0)
        paramb.br(8, this.Aok);
      if (this.Aol != -1)
        paramb.bq(9, this.Aol);
      if (this.Aom != 0)
        paramb.bq(10, this.Aom);
      super.a(paramb);
    }

    public final int vr()
    {
      int i = super.vr();
      int j = i;
      if (this.Aof != 0)
        j = i + b.bt(1, this.Aof);
      i = j;
      if (this.nwu != 0)
        i = j + b.bs(2, this.nwu);
      int k = i;
      if (this.nwv != 0L)
        k = i + b.o(3, this.nwv);
      j = k;
      if (this.Aog != 0)
        j = k + b.bt(4, this.Aog);
      i = j;
      if (this.Aoh != 0)
        i = j + b.bt(5, this.Aoh);
      j = i;
      if (this.Aoi != 0)
        j = i + b.bt(6, this.Aoi);
      i = j;
      if (this.Aoj != 0)
        i = j + b.bt(7, this.Aoj);
      k = i;
      if (this.Aok != 0)
        k = i + b.bt(8, this.Aok);
      j = k;
      if (this.Aol != -1)
        j = k + b.bs(9, this.Aol);
      i = j;
      if (this.Aom != 0)
        i = j + b.bs(10, this.Aom);
      return i;
    }
  }

  public static final class am extends e
  {
    private static volatile am[] Aoo;
    public String Aop = "";
    public int Aoq = 0;
    public int kyZ = 0;
    public int vzt = 0;

    public am()
    {
      this.bxt = -1;
    }

    public static am[] dPD()
    {
      if (Aoo == null);
      synchronized (c.bxs)
      {
        if (Aoo == null)
          Aoo = new am[0];
        return Aoo;
      }
    }

    public final void a(b paramb)
    {
      if (this.kyZ != 0)
        paramb.br(1, this.kyZ);
      if (!this.Aop.equals(""))
        paramb.e(2, this.Aop);
      if (this.vzt != 0)
        paramb.br(3, this.vzt);
      if (this.Aoq != 0)
        paramb.br(4, this.Aoq);
      super.a(paramb);
    }

    public final int vr()
    {
      int i = super.vr();
      int j = i;
      if (this.kyZ != 0)
        j = i + b.bt(1, this.kyZ);
      i = j;
      if (!this.Aop.equals(""))
        i = j + b.f(2, this.Aop);
      j = i;
      if (this.vzt != 0)
        j = i + b.bt(3, this.vzt);
      i = j;
      if (this.Aoq != 0)
        i = j + b.bt(4, this.Aoq);
      return i;
    }
  }

  public static final class at extends e
  {
    public byte[] AoK = g.bxA;
    public long AoL = 0L;
    public byte[] AoM = g.bxA;
    public byte[] AoN = g.bxA;
    public byte[] AoO = g.bxA;
    public a.ax AoP = null;
    public byte[] AoQ = g.bxA;
    public a.ap AoR = null;
    public String AoS = "";
    public String AoT = "";
    public long AoU = 0L;
    public byte[] AoV = g.bxA;
    public byte[] AoW = g.bxA;
    public byte[] AoX = g.bxA;
    public byte[] AoY = g.bxA;
    public int AoZ = 0;
    public byte[] Apa = g.bxA;
    public byte[] Apb = g.bxA;
    public int Apc = 0;
    public a.n[] Apd = a.n.dPA();
    public byte[] bFS = g.bxA;
    public int cAO = 0;
    public String name = "";

    public at()
    {
      this.bxt = -1;
    }

    public final void a(b paramb)
    {
      if (!this.name.equals(""))
        paramb.e(1, this.name);
      if (!Arrays.equals(this.AoK, g.bxA))
        paramb.b(2, this.AoK);
      if (this.cAO != 0)
        paramb.bq(3, this.cAO);
      if (this.AoL != 0L)
        paramb.l(4, this.AoL);
      if (!Arrays.equals(this.AoM, g.bxA))
        paramb.b(5, this.AoM);
      if (!Arrays.equals(this.AoN, g.bxA))
        paramb.b(6, this.AoN);
      if (!Arrays.equals(this.AoO, g.bxA))
        paramb.b(7, this.AoO);
      if (this.AoP != null)
        paramb.a(8, this.AoP);
      if (!Arrays.equals(this.AoQ, g.bxA))
        paramb.b(9, this.AoQ);
      if (this.AoR != null)
        paramb.a(10, this.AoR);
      if (!this.AoS.equals(""))
        paramb.e(100, this.AoS);
      if (!this.AoT.equals(""))
        paramb.e(101, this.AoT);
      if (this.AoU != 0L)
        paramb.l(200, this.AoU);
      if (!Arrays.equals(this.AoV, g.bxA))
        paramb.b(201, this.AoV);
      if (!Arrays.equals(this.AoW, g.bxA))
        paramb.b(202, this.AoW);
      if (!Arrays.equals(this.AoX, g.bxA))
        paramb.b(203, this.AoX);
      if (!Arrays.equals(this.AoY, g.bxA))
        paramb.b(204, this.AoY);
      if (this.AoZ != 0)
        paramb.bq(220, this.AoZ);
      if (!Arrays.equals(this.Apa, g.bxA))
        paramb.b(221, this.Apa);
      if (!Arrays.equals(this.Apb, g.bxA))
        paramb.b(222, this.Apb);
      if (!Arrays.equals(this.bFS, g.bxA))
        paramb.b(223, this.bFS);
      if (this.Apc != 0)
        paramb.br(224, this.Apc);
      if ((this.Apd != null) && (this.Apd.length > 0))
        for (int i = 0; i < this.Apd.length; i++)
        {
          a.n localn = this.Apd[i];
          if (localn != null)
            paramb.a(225, localn);
        }
      super.a(paramb);
    }

    public final int vr()
    {
      int i = super.vr();
      int j = i;
      if (!this.name.equals(""))
        j = i + b.f(1, this.name);
      i = j;
      if (!Arrays.equals(this.AoK, g.bxA))
        i = j + b.c(2, this.AoK);
      j = i;
      if (this.cAO != 0)
        j = i + b.bs(3, this.cAO);
      i = j;
      if (this.AoL != 0L)
        i = j + b.n(4, this.AoL);
      j = i;
      if (!Arrays.equals(this.AoM, g.bxA))
        j = i + b.c(5, this.AoM);
      i = j;
      if (!Arrays.equals(this.AoN, g.bxA))
        i = j + b.c(6, this.AoN);
      j = i;
      if (!Arrays.equals(this.AoO, g.bxA))
        j = i + b.c(7, this.AoO);
      i = j;
      if (this.AoP != null)
        i = j + b.b(8, this.AoP);
      int k = i;
      if (!Arrays.equals(this.AoQ, g.bxA))
        k = i + b.c(9, this.AoQ);
      j = k;
      if (this.AoR != null)
        j = k + b.b(10, this.AoR);
      i = j;
      if (!this.AoS.equals(""))
        i = j + b.f(100, this.AoS);
      j = i;
      if (!this.AoT.equals(""))
        j = i + b.f(101, this.AoT);
      i = j;
      if (this.AoU != 0L)
        i = j + b.n(200, this.AoU);
      j = i;
      if (!Arrays.equals(this.AoV, g.bxA))
        j = i + b.c(201, this.AoV);
      i = j;
      if (!Arrays.equals(this.AoW, g.bxA))
        i = j + b.c(202, this.AoW);
      k = i;
      if (!Arrays.equals(this.AoX, g.bxA))
        k = i + b.c(203, this.AoX);
      j = k;
      if (!Arrays.equals(this.AoY, g.bxA))
        j = k + b.c(204, this.AoY);
      i = j;
      if (this.AoZ != 0)
        i = j + b.bs(220, this.AoZ);
      j = i;
      if (!Arrays.equals(this.Apa, g.bxA))
        j = i + b.c(221, this.Apa);
      i = j;
      if (!Arrays.equals(this.Apb, g.bxA))
        i = j + b.c(222, this.Apb);
      k = i;
      if (!Arrays.equals(this.bFS, g.bxA))
        k = i + b.c(223, this.bFS);
      j = k;
      if (this.Apc != 0)
        j = k + b.bt(224, this.Apc);
      i = j;
      if (this.Apd != null)
      {
        i = j;
        if (this.Apd.length > 0)
        {
          i = 0;
          while (i < this.Apd.length)
          {
            a.n localn = this.Apd[i];
            k = j;
            if (localn != null)
              k = j + b.b(225, localn);
            i++;
            j = k;
          }
          i = j;
        }
      }
      return i;
    }
  }

  public static final class au extends e
  {
    private static volatile au[] Ape;
    public int AmC = 0;
    public a.av[] AnQ = a.av.dPH();
    public String Apf = "";
    public String groupId = "";
    public int sQS = 0;
    public long sQT = 0L;

    public au()
    {
      this.bxt = -1;
    }

    public static au[] dPG()
    {
      if (Ape == null);
      synchronized (c.bxs)
      {
        if (Ape == null)
          Ape = new au[0];
        return Ape;
      }
    }

    public final void a(b paramb)
    {
      if (!this.groupId.equals(""))
        paramb.e(1, this.groupId);
      if (this.sQS != 0)
        paramb.bq(2, this.sQS);
      if (this.sQT != 0L)
        paramb.m(3, this.sQT);
      if ((this.AnQ != null) && (this.AnQ.length > 0))
        for (int i = 0; i < this.AnQ.length; i++)
        {
          a.av localav = this.AnQ[i];
          if (localav != null)
            paramb.a(4, localav);
        }
      if (this.AmC != 0)
        paramb.br(5, this.AmC);
      if (!this.Apf.equals(""))
        paramb.e(6, this.Apf);
      super.a(paramb);
    }

    public final int vr()
    {
      int i = super.vr();
      int j = i;
      if (!this.groupId.equals(""))
        j = i + b.f(1, this.groupId);
      i = j;
      if (this.sQS != 0)
        i = j + b.bs(2, this.sQS);
      j = i;
      if (this.sQT != 0L)
        j = i + b.o(3, this.sQT);
      i = j;
      if (this.AnQ != null)
      {
        i = j;
        if (this.AnQ.length > 0)
        {
          i = 0;
          while (i < this.AnQ.length)
          {
            a.av localav = this.AnQ[i];
            int k = j;
            if (localav != null)
              k = j + b.b(4, localav);
            i++;
            j = k;
          }
          i = j;
        }
      }
      j = i;
      if (this.AmC != 0)
        j = i + b.bt(5, this.AmC);
      i = j;
      if (!this.Apf.equals(""))
        i = j + b.f(6, this.Apf);
      return i;
    }
  }

  public static final class av extends e
  {
    private static volatile av[] Apg;
    public int AmI = 0;
    public byte[] AmN = g.bxA;
    public String Aop = "";
    public int ApA = 0;
    public int ApB = 0;
    public int Aph = 0;
    public int Api = 0;
    public a.aq Apj = null;
    public int Apk = 0;
    public String Apl = "";
    public a.ar[] Apm = a.ar.dPF();
    public int Apn = 0;
    public int[] Apo = g.bxu;
    public int App = 0;
    public int Apq = 0;
    public int Apr = 0;
    public int Aps = 0;
    public a.an Apt = null;
    public String Apu = "";
    public int Apv = 0;
    public a.s Apw = null;
    public int Apx = -1;
    public String Apy = "";
    public int Apz = 0;
    public int boZ = 0;
    public int kyZ = -1;
    public int platform = 0;
    public int status = 0;
    public int tdt = 0;
    public int vzt = 0;

    public av()
    {
      this.bxt = -1;
    }

    public static av[] dPH()
    {
      if (Apg == null);
      synchronized (c.bxs)
      {
        if (Apg == null)
          Apg = new av[0];
        return Apg;
      }
    }

    public final void a(b paramb)
    {
      int i = 0;
      if (this.vzt != 0)
        paramb.br(1, this.vzt);
      if (this.Aph != 0)
        paramb.br(2, this.Aph);
      if (this.status != 0)
        paramb.br(3, this.status);
      if (this.boZ != 0)
        paramb.br(4, this.boZ);
      if (this.kyZ != -1)
        paramb.bq(5, this.kyZ);
      if (this.Api != 0)
        paramb.br(6, this.Api);
      if (this.Apj != null)
        paramb.a(7, this.Apj);
      if (this.Apk != 0)
        paramb.br(8, this.Apk);
      if (!this.Apl.equals(""))
        paramb.e(9, this.Apl);
      int j;
      if ((this.Apm != null) && (this.Apm.length > 0))
        for (j = 0; j < this.Apm.length; j++)
        {
          a.ar localar = this.Apm[j];
          if (localar != null)
            paramb.a(10, localar);
        }
      if (this.Apn != 0)
        paramb.br(11, this.Apn);
      if ((this.Apo != null) && (this.Apo.length > 0))
        for (j = i; j < this.Apo.length; j++)
          paramb.br(12, this.Apo[j]);
      if (this.App != 0)
        paramb.br(13, this.App);
      if (this.Apq != 0)
        paramb.br(14, this.Apq);
      if (this.Apr != 0)
        paramb.br(15, this.Apr);
      if (this.Aps != 0)
        paramb.br(16, this.Aps);
      if (this.Apt != null)
        paramb.a(17, this.Apt);
      if (!this.Aop.equals(""))
        paramb.e(100, this.Aop);
      if (!this.Apu.equals(""))
        paramb.e(101, this.Apu);
      if (this.Apv != 0)
        paramb.br(102, this.Apv);
      if (!Arrays.equals(this.AmN, g.bxA))
        paramb.b(200, this.AmN);
      if (this.Apw != null)
        paramb.a(201, this.Apw);
      if (this.Apx != -1)
        paramb.bq(202, this.Apx);
      if (!this.Apy.equals(""))
        paramb.e(203, this.Apy);
      if (this.platform != 0)
        paramb.bq(204, this.platform);
      if (this.Apz != 0)
        paramb.br(205, this.Apz);
      if (this.tdt != 0)
        paramb.br(206, this.tdt);
      if (this.ApA != 0)
        paramb.br(207, this.ApA);
      if (this.ApB != 0)
        paramb.br(208, this.ApB);
      if (this.AmI != 0)
        paramb.br(240, this.AmI);
      super.a(paramb);
    }

    public final int vr()
    {
      int i = super.vr();
      int j = i;
      if (this.vzt != 0)
        j = i + b.bt(1, this.vzt);
      int k = j;
      if (this.Aph != 0)
        k = j + b.bt(2, this.Aph);
      i = k;
      if (this.status != 0)
        i = k + b.bt(3, this.status);
      j = i;
      if (this.boZ != 0)
        j = i + b.bt(4, this.boZ);
      i = j;
      if (this.kyZ != -1)
        i = j + b.bs(5, this.kyZ);
      k = i;
      if (this.Api != 0)
        k = i + b.bt(6, this.Api);
      j = k;
      if (this.Apj != null)
        j = k + b.b(7, this.Apj);
      i = j;
      if (this.Apk != 0)
        i = j + b.bt(8, this.Apk);
      j = i;
      if (!this.Apl.equals(""))
        j = i + b.f(9, this.Apl);
      i = j;
      if (this.Apm != null)
      {
        i = j;
        if (this.Apm.length > 0)
        {
          k = 0;
          while (k < this.Apm.length)
          {
            a.ar localar = this.Apm[k];
            i = j;
            if (localar != null)
              i = j + b.b(10, localar);
            k++;
            j = i;
          }
          i = j;
        }
      }
      j = i;
      if (this.Apn != 0)
        j = i + b.bt(11, this.Apn);
      i = j;
      if (this.Apo != null)
      {
        i = j;
        if (this.Apo.length > 0)
        {
          k = 0;
          i = 0;
          while (k < this.Apo.length)
          {
            i += b.fx(this.Apo[k]);
            k++;
          }
          i = j + i + this.Apo.length * 1;
        }
      }
      j = i;
      if (this.App != 0)
        j = i + b.bt(13, this.App);
      i = j;
      if (this.Apq != 0)
        i = j + b.bt(14, this.Apq);
      j = i;
      if (this.Apr != 0)
        j = i + b.bt(15, this.Apr);
      i = j;
      if (this.Aps != 0)
        i = j + b.bt(16, this.Aps);
      k = i;
      if (this.Apt != null)
        k = i + b.b(17, this.Apt);
      j = k;
      if (!this.Aop.equals(""))
        j = k + b.f(100, this.Aop);
      i = j;
      if (!this.Apu.equals(""))
        i = j + b.f(101, this.Apu);
      k = i;
      if (this.Apv != 0)
        k = i + b.bt(102, this.Apv);
      j = k;
      if (!Arrays.equals(this.AmN, g.bxA))
        j = k + b.c(200, this.AmN);
      i = j;
      if (this.Apw != null)
        i = j + b.b(201, this.Apw);
      j = i;
      if (this.Apx != -1)
        j = i + b.bs(202, this.Apx);
      k = j;
      if (!this.Apy.equals(""))
        k = j + b.f(203, this.Apy);
      i = k;
      if (this.platform != 0)
        i = k + b.bs(204, this.platform);
      j = i;
      if (this.Apz != 0)
        j = i + b.bt(205, this.Apz);
      i = j;
      if (this.tdt != 0)
        i = j + b.bt(206, this.tdt);
      j = i;
      if (this.ApA != 0)
        j = i + b.bt(207, this.ApA);
      i = j;
      if (this.ApB != 0)
        i = j + b.bt(208, this.ApB);
      j = i;
      if (this.AmI != 0)
        j = i + b.bt(240, this.AmI);
      return j;
    }
  }

  public static final class aw extends e
  {
    private static volatile aw[] ApC;
    public long ApD = 0L;
    public String ApE = "";
    public String ApF = "";
    public String pHn = "";
    public String username = "";
    public int vzt = 0;

    public aw()
    {
      this.bxt = -1;
    }

    public static aw[] dPI()
    {
      if (ApC == null);
      synchronized (c.bxs)
      {
        if (ApC == null)
          ApC = new aw[0];
        return ApC;
      }
    }

    public final void a(b paramb)
    {
      if (this.vzt != 0)
        paramb.br(1, this.vzt);
      if (!this.username.equals(""))
        paramb.e(2, this.username);
      if (!this.pHn.equals(""))
        paramb.e(3, this.pHn);
      if (this.ApD != 0L)
        paramb.l(4, this.ApD);
      if (!this.ApE.equals(""))
        paramb.e(5, this.ApE);
      if (!this.ApF.equals(""))
        paramb.e(6, this.ApF);
      super.a(paramb);
    }

    public final int vr()
    {
      int i = super.vr();
      int j = i;
      if (this.vzt != 0)
        j = i + b.bt(1, this.vzt);
      i = j;
      if (!this.username.equals(""))
        i = j + b.f(2, this.username);
      j = i;
      if (!this.pHn.equals(""))
        j = i + b.f(3, this.pHn);
      i = j;
      if (this.ApD != 0L)
        i = j + b.n(4, this.ApD);
      j = i;
      if (!this.ApE.equals(""))
        j = i + b.f(5, this.ApE);
      i = j;
      if (!this.ApF.equals(""))
        i = j + b.f(6, this.ApF);
      return i;
    }
  }

  public static final class ax extends e
  {
    public int ApG = 0;

    public ax()
    {
      this.bxt = -1;
    }

    public final void a(b paramb)
    {
      if (this.ApG != 0)
        paramb.br(1, this.ApG);
      super.a(paramb);
    }

    public final int vr()
    {
      int i = super.vr();
      int j = i;
      if (this.ApG != 0)
        j = i + b.bt(1, this.ApG);
      return j;
    }
  }

  public static final class f extends e
  {
    public int AmM = 0;
    public int boZ = 0;
    public String groupId = "";
    public int sQS = 0;
    public long sQT = 0L;

    public f()
    {
      this.bxt = -1;
    }

    public final void a(b paramb)
    {
      if (!this.groupId.equals(""))
        paramb.e(1, this.groupId);
      if (this.sQS != 0)
        paramb.bq(2, this.sQS);
      if (this.sQT != 0L)
        paramb.m(3, this.sQT);
      if (this.boZ != 0)
        paramb.bq(4, this.boZ);
      if (this.AmM != 0)
        paramb.bq(5, this.AmM);
      super.a(paramb);
    }

    public final int vr()
    {
      int i = super.vr();
      int j = i;
      if (!this.groupId.equals(""))
        j = i + b.f(1, this.groupId);
      i = j;
      if (this.sQS != 0)
        i = j + b.bs(2, this.sQS);
      j = i;
      if (this.sQT != 0L)
        j = i + b.o(3, this.sQT);
      i = j;
      if (this.boZ != 0)
        i = j + b.bs(4, this.boZ);
      j = i;
      if (this.AmM != 0)
        j = i + b.bs(5, this.AmM);
      return j;
    }
  }

  public static final class p extends e
  {
    public int AmC = 0;
    public a.ay AmE = null;
    public a.at Amz = null;
    public int Anb = 0;
    public a.aw[] Anc = a.aw.dPI();
    public a.av[] And = a.av.dPH();
    public a.as Ane = null;
    public int Anf = 0;
    public int Ang = 0;
    public int Anh = 0;
    public byte[] Ani = g.bxA;
    public byte[] Anj = g.bxA;
    public a.av[] Ank = a.av.dPH();
    public long cvx = 0L;
    public String groupId = "";
    public int sQS = 0;
    public long sQT = 0L;

    public p()
    {
      this.bxt = -1;
    }

    public final void a(b paramb)
    {
      int i = 0;
      if (this.Anb != 0)
        paramb.bq(1, this.Anb);
      if (!this.groupId.equals(""))
        paramb.e(2, this.groupId);
      if (this.sQS != 0)
        paramb.bq(3, this.sQS);
      if (this.sQT != 0L)
        paramb.m(4, this.sQT);
      if (this.AmC != 0)
        paramb.br(5, this.AmC);
      if (this.Amz != null)
        paramb.a(6, this.Amz);
      int j;
      Object localObject;
      if ((this.Anc != null) && (this.Anc.length > 0))
        for (j = 0; j < this.Anc.length; j++)
        {
          localObject = this.Anc[j];
          if (localObject != null)
            paramb.a(7, (e)localObject);
        }
      if ((this.And != null) && (this.And.length > 0))
        for (j = 0; j < this.And.length; j++)
        {
          localObject = this.And[j];
          if (localObject != null)
            paramb.a(8, (e)localObject);
        }
      if (this.Ane != null)
        paramb.a(9, this.Ane);
      if (this.AmE != null)
        paramb.a(10, this.AmE);
      if (this.Anf != 0)
        paramb.br(11, this.Anf);
      if (this.Ang != 0)
        paramb.br(12, this.Ang);
      if (this.cvx != 0L)
        paramb.l(101, this.cvx);
      if (this.Anh != 0)
        paramb.br(102, this.Anh);
      if (!Arrays.equals(this.Ani, g.bxA))
        paramb.b(103, this.Ani);
      if (!Arrays.equals(this.Anj, g.bxA))
        paramb.b(200, this.Anj);
      if ((this.Ank != null) && (this.Ank.length > 0))
        for (j = i; j < this.Ank.length; j++)
        {
          localObject = this.Ank[j];
          if (localObject != null)
            paramb.a(201, (e)localObject);
        }
      super.a(paramb);
    }

    public final int vr()
    {
      int i = 0;
      int j = super.vr();
      int k = j;
      if (this.Anb != 0)
        k = j + b.bs(1, this.Anb);
      j = k;
      if (!this.groupId.equals(""))
        j = k + b.f(2, this.groupId);
      k = j;
      if (this.sQS != 0)
        k = j + b.bs(3, this.sQS);
      j = k;
      if (this.sQT != 0L)
        j = k + b.o(4, this.sQT);
      int m = j;
      if (this.AmC != 0)
        m = j + b.bt(5, this.AmC);
      k = m;
      if (this.Amz != null)
        k = m + b.b(6, this.Amz);
      j = k;
      Object localObject;
      if (this.Anc != null)
      {
        j = k;
        if (this.Anc.length > 0)
        {
          m = 0;
          j = k;
          k = m;
          while (k < this.Anc.length)
          {
            localObject = this.Anc[k];
            m = j;
            if (localObject != null)
              m = j + b.b(7, (e)localObject);
            k++;
            j = m;
          }
        }
      }
      k = j;
      if (this.And != null)
      {
        k = j;
        if (this.And.length > 0)
        {
          m = 0;
          while (m < this.And.length)
          {
            localObject = this.And[m];
            k = j;
            if (localObject != null)
              k = j + b.b(8, (e)localObject);
            m++;
            j = k;
          }
          k = j;
        }
      }
      j = k;
      if (this.Ane != null)
        j = k + b.b(9, this.Ane);
      k = j;
      if (this.AmE != null)
        k = j + b.b(10, this.AmE);
      j = k;
      if (this.Anf != 0)
        j = k + b.bt(11, this.Anf);
      k = j;
      if (this.Ang != 0)
        k = j + b.bt(12, this.Ang);
      j = k;
      if (this.cvx != 0L)
        j = k + b.n(101, this.cvx);
      m = j;
      if (this.Anh != 0)
        m = j + b.bt(102, this.Anh);
      k = m;
      if (!Arrays.equals(this.Ani, g.bxA))
        k = m + b.c(103, this.Ani);
      j = k;
      if (!Arrays.equals(this.Anj, g.bxA))
        j = k + b.c(200, this.Anj);
      m = j;
      if (this.Ank != null)
      {
        m = j;
        if (this.Ank.length > 0)
        {
          k = i;
          while (true)
          {
            m = j;
            if (k >= this.Ank.length)
              break;
            localObject = this.Ank[k];
            m = j;
            if (localObject != null)
              m = j + b.b(201, (e)localObject);
            k++;
            j = m;
          }
        }
      }
      return m;
    }
  }

  public static final class q extends e
  {
    public int Anl = 0;

    public q()
    {
      this.bxt = -1;
    }

    public final void a(b paramb)
    {
      paramb.br(1, this.Anl);
      super.a(paramb);
    }

    public final int vr()
    {
      return super.vr() + b.bt(1, this.Anl);
    }
  }

  public static final class v extends e
  {
    public a.u AnM = null;
    public byte[] body = g.bxA;

    public v()
    {
      this.bxt = -1;
    }

    public final void a(b paramb)
    {
      if (this.AnM != null)
        paramb.a(1, this.AnM);
      if (!Arrays.equals(this.body, g.bxA))
        paramb.b(2, this.body);
      super.a(paramb);
    }

    public final int vr()
    {
      int i = super.vr();
      int j = i;
      if (this.AnM != null)
        j = i + b.b(1, this.AnM);
      i = j;
      if (!Arrays.equals(this.body, g.bxA))
        i = j + b.c(2, this.body);
      return i;
    }
  }

  public static final class x extends e
  {
    public a.at Amz = null;
    public a.av[] AnQ = a.av.dPH();
    public String groupId = "";
    public int sQS = 0;
    public long sQT = 0L;

    public x()
    {
      this.bxt = -1;
    }

    public final void a(b paramb)
    {
      if (!this.groupId.equals(""))
        paramb.e(1, this.groupId);
      if (this.sQS != 0)
        paramb.bq(2, this.sQS);
      if (this.sQT != 0L)
        paramb.m(3, this.sQT);
      if ((this.AnQ != null) && (this.AnQ.length > 0))
        for (int i = 0; i < this.AnQ.length; i++)
        {
          a.av localav = this.AnQ[i];
          if (localav != null)
            paramb.a(4, localav);
        }
      if (this.Amz != null)
        paramb.a(5, this.Amz);
      super.a(paramb);
    }

    public final int vr()
    {
      int i = super.vr();
      int j = i;
      if (!this.groupId.equals(""))
        j = i + b.f(1, this.groupId);
      i = j;
      if (this.sQS != 0)
        i = j + b.bs(2, this.sQS);
      j = i;
      if (this.sQT != 0L)
        j = i + b.o(3, this.sQT);
      i = j;
      if (this.AnQ != null)
      {
        i = j;
        if (this.AnQ.length > 0)
        {
          i = 0;
          while (i < this.AnQ.length)
          {
            a.av localav = this.AnQ[i];
            int k = j;
            if (localav != null)
              k = j + b.b(4, localav);
            i++;
            j = k;
          }
          i = j;
        }
      }
      j = i;
      if (this.Amz != null)
        j = i + b.b(5, this.Amz);
      return j;
    }
  }

  public static final class y extends e
  {
    public String Amx = "";

    public y()
    {
      this.bxt = -1;
    }

    public final void a(b paramb)
    {
      if (!this.Amx.equals(""))
        paramb.e(1, this.Amx);
      super.a(paramb);
    }

    public final int vr()
    {
      int i = super.vr();
      int j = i;
      if (!this.Amx.equals(""))
        j = i + b.f(1, this.Amx);
      return j;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.pb.common.b.a.a
 * JD-Core Version:    0.6.2
 */