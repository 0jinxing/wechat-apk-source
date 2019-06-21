package com.b.a.a;

import android.location.Location;
import android.net.wifi.ScanResult;
import android.os.Handler;
import android.os.SystemClock;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.List;

class n extends b
{
  private final n.e bET;
  final j bEU;
  private final n.d bEV;
  private final i bEW;
  final s bEX;
  private long bEY;
  private long bEZ;
  private long bFa;
  private int bFb;
  private long bFc;
  private boolean bFd;
  private Location bFe;
  private int bFf;
  private float bFg;
  private float bFh;
  private float bFi;
  private int bFj;
  private int bFk;
  private long bFl;

  n()
  {
    AppMethodBeat.i(55685);
    this.bET = new n.e(this, (byte)0);
    this.bEU = new j();
    this.bEV = new n.d((byte)0);
    if (i.bDs == null)
      i.bDs = new i();
    this.bEW = i.bDs;
    this.bFd = true;
    this.bEX = new s(this);
    AppMethodBeat.o(55685);
  }

  private boolean a(long paramLong, int paramInt1, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, int paramInt2, float paramFloat2)
  {
    AppMethodBeat.i(55686);
    paramLong /= 1000L;
    paramDouble1 = Math.toRadians(paramDouble1);
    paramDouble2 = Math.toRadians(paramDouble2);
    if (this.bFd)
    {
      this.bEU.a(paramLong, paramDouble1, paramDouble2, paramFloat1, this.bET.bFw, y.bIS);
      this.bFd = false;
    }
    for (boolean bool = true; ; bool = false)
    {
      j.a locala = new j.a(paramInt1, paramLong, paramDouble1, paramDouble2, paramDouble3, paramFloat1, paramInt2, paramFloat2, 0, 0.0D, 0.0D);
      this.bEU.a(locala);
      if (y.bIM)
        o.s("filter_input_log_" + y.bIT, locala.toString());
      AppMethodBeat.o(55686);
      return bool;
    }
  }

  private void we()
  {
    AppMethodBeat.i(55694);
    this.bEW.bDB = false;
    this.bEX.wq();
    this.bEV.reset();
    n.e.a(this.bET);
    wd();
    this.bEZ = 0L;
    this.bFa = SystemClock.elapsedRealtime();
    this.bFg = 0.0F;
    this.bFh = 0.0F;
    this.bFi = 0.0F;
    this.bFj = 0;
    this.bFk = 0;
    this.bFb = 0;
    AppMethodBeat.o(55694);
  }

  final k.a a(d.a parama)
  {
    AppMethodBeat.i(55695);
    parama = new k.a(0L);
    AppMethodBeat.o(55695);
    return parama;
  }

  final void a(double paramDouble1, double paramDouble2, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, float paramFloat, long paramLong1, long paramLong2)
  {
    AppMethodBeat.i(55690);
    if (paramInt2 <= 0)
    {
      AppMethodBeat.o(55690);
      return;
    }
    Object localObject = this.bET;
    if (paramInt3 >= 3)
    {
      if (paramLong2 - ((n.e)localObject).bFv <= 5000L)
        ((n.e)localObject).aW(true);
      ((n.e)localObject).bFv = paramLong2;
    }
    int i = Math.round(paramFloat);
    if (!v.e(paramDouble1, paramDouble2));
    for (localObject = ""; ; localObject = "&GD=" + paramDouble1 + ',' + paramDouble2 + ',' + paramInt1 + ',' + paramInt3 + ',' + paramInt5 + ',' + paramInt2 + ',' + i + ',' + paramLong1 + ',')
    {
      this.bEV.d((String)localObject, paramLong2);
      if (a(paramLong2, 1, paramDouble1, paramDouble2, paramInt1, paramInt2, paramInt5, paramInt3))
        this.bEW.a(paramDouble1, paramDouble2, paramInt2, this.bFg, this.bFh, this.bFi);
      if (n.d.o(paramLong2, this.bFa))
        this.bEX.a(paramDouble1, paramDouble2, paramInt2, paramFloat, this.bFg, this.bFh, this.bFi, paramLong2);
      if (y.bIM)
        o.s("gps_log_" + y.bIT, String.valueOf(paramDouble1) + ',' + paramDouble2 + ',' + paramInt1 + ',' + paramInt2 + ',' + paramInt3 + ',' + paramInt4 + ',' + paramInt5 + ',' + paramFloat + ',' + paramLong1);
      AppMethodBeat.o(55690);
      break;
    }
  }

  final void a(float paramFloat1, float paramFloat2, int paramInt, float paramFloat3, float paramFloat4, float paramFloat5, long paramLong)
  {
    AppMethodBeat.i(55689);
    Object localObject1 = this.bET;
    if (paramLong - ((n.e)localObject1).bFv > 5000L)
      ((n.e)localObject1).aW(false);
    if (paramLong - this.bFa > 5000L)
      we();
    this.bFg = paramFloat1;
    this.bFh = paramFloat2;
    this.bFi = paramFloat4;
    this.bFj = paramInt;
    this.bFa = paramLong;
    boolean bool;
    if (paramFloat5 > 0.0F)
    {
      i = 1;
      this.bFk = i;
      if ((this.bEZ != 0L) || (paramLong - this.bFl >= 30000L))
      {
        if (i != 0)
          break label339;
        bool = true;
        label125: if ((!bool) || (!this.bET.bFw))
        {
          ab.wD().aV(bool);
          k.wc().aV(bool);
        }
      }
      localObject1 = new double[2];
      localObject2 = this.bEW;
      localObject3 = new double[2];
      localObject3[0] = paramFloat1;
      localObject3[1] = paramFloat2;
      if (!((i)localObject2).bDB)
        break label397;
      localObject1[0] = ((i)localObject2).bDt;
      localObject1[1] = ((i)localObject2).bDu;
      localObject1[0] += 1.E-005D * (localObject3[1] - ((i)localObject2).bDw) / ((i)localObject2).bDz;
      localObject1[1] += 1.E-005D * (localObject3[0] - ((i)localObject2).bDv) / ((i)localObject2).bDA;
      if (localObject1[0] <= 90.0D)
        break label345;
      localObject1[0] = (180.0D - localObject1[0]);
      label295: if (localObject1[1] <= 180.0D)
        break label371;
      localObject1[1] -= 360.0D;
    }
    label318: for (int i = 1; ; i = 0)
    {
      if (i != 0)
        break label403;
      AppMethodBeat.o(55689);
      return;
      i = 0;
      break;
      label339: bool = false;
      break label125;
      label345: if (localObject1[0] >= -90.0D)
        break label295;
      localObject1[0] = (-180.0D - localObject1[0]);
      break label295;
      label371: if (localObject1[1] >= -180.0D)
        break label318;
      localObject1[1] += 360.0D;
      break label318;
    }
    label397: label403: double d1 = localObject1[0];
    double d2 = localObject1[1];
    localObject1 = this.bEW;
    paramFloat2 = (paramFloat4 - ((i)localObject1).bDx) / 10.0F;
    paramFloat4 = ((i)localObject1).bDy;
    paramFloat1 = 0.0F;
    localObject1 = new Location("S");
    ((Location)localObject1).setLatitude(d1);
    ((Location)localObject1).setLongitude(d2);
    if (this.bFe != null)
      paramFloat1 = this.bFe.bearingTo((Location)localObject1);
    this.bFe = ((Location)localObject1);
    i = Math.max(0, paramInt - this.bFf);
    this.bFf = paramInt;
    long l = paramLong / 1000L;
    d1 = Math.toRadians(d1);
    d2 = Math.toRadians(d2);
    double d3 = Math.toRadians(paramFloat1);
    localObject1 = new j.a(3, l, d1, d2, 0.0D, paramFloat2 + paramFloat4, 0, paramFloat5, i, paramFloat3, d3);
    this.bEU.a((j.a)localObject1);
    if (y.bIM)
      o.s("filter_input_log_" + y.bIT, ((j.a)localObject1).toString());
    double[] arrayOfDouble1 = new double[4];
    l = paramLong / 1000L;
    Object localObject2 = new double[2];
    double[] arrayOfDouble2 = new double[2];
    localObject1 = new double[2];
    double[][] arrayOfDouble = new double[2][2];
    Object localObject3 = new double[2][2];
    j localj = this.bEU;
    d3 = l - localj.bDD.bDF;
    d2 = d3 * d3;
    double[] arrayOfDouble3 = new double[2];
    localObject2[0] = (localj.bDD.bEo[0] + localj.bDD.bEo[2] * d3);
    d1 = localj.bDD.bEo[1];
    localObject2[1] = (d3 * localj.bDD.bEo[3] + d1);
    localObject1[0] = localj.bDD.bEo[2];
    localObject1[1] = localj.bDD.bEo[3];
    label867: int j;
    if (localj.bDD.bDW)
    {
      localObject2[0] -= localj.bDD.bDX[0];
      localObject2[1] -= localj.bDD.bDX[1];
      d1 = Math.sqrt(arrayOfDouble3[0] * arrayOfDouble3[0] + arrayOfDouble3[1] * arrayOfDouble3[1]);
      d1 = d1 * d1 * localj.bDD.bEr;
      arrayOfDouble[0][0] = (localj.bDD.bEp[0][0] + localj.bDD.bEp[2][2] * d2 + d1);
      arrayOfDouble[0][1] = (localj.bDD.bEp[0][1] + localj.bDD.bEp[2][3] * d2);
      arrayOfDouble[1][0] = (localj.bDD.bEp[1][0] + localj.bDD.bEp[3][2] * d2);
      arrayOfDouble3 = arrayOfDouble[1];
      d3 = localj.bDD.bEp[1][1];
      arrayOfDouble3[1] = (d1 + (d2 * localj.bDD.bEp[3][3] + d3));
      localObject3[0][0] = localj.bDD.bEp[2][2];
      localObject3[0][1] = localj.bDD.bEp[2][3];
      localObject3[1][0] = localj.bDD.bEp[3][2];
      localObject3[1][1] = localj.bDD.bEp[3][3];
      localj.a(1, (double[])localObject2, arrayOfDouble2);
      arrayOfDouble1[0] = Math.toDegrees(arrayOfDouble2[0]);
      arrayOfDouble1[1] = Math.toDegrees(arrayOfDouble2[1]);
      arrayOfDouble1[2] = Math.sqrt((arrayOfDouble[0][0] + arrayOfDouble[1][1]) / 2.0D);
      d3 = localObject1[0];
      d1 = localObject1[0];
      d2 = localObject1[1];
      arrayOfDouble1[3] = Math.sqrt(d3 * d1 + localObject1[1] * d2);
      if (y.bIM)
        o.s("filter_output_log_" + y.bIT, String.valueOf(l) + ',' + arrayOfDouble1[0] + ',' + arrayOfDouble1[1] + ',' + arrayOfDouble1[2] + ',' + arrayOfDouble1[3]);
      d2 = arrayOfDouble1[0];
      d1 = arrayOfDouble1[1];
      paramInt = Double.valueOf(arrayOfDouble1[2]).intValue();
      j = Double.valueOf(arrayOfDouble1[3]).intValue();
      i = this.bFb;
      if (v.e(d2, d1))
        break label1383;
    }
    label1383: for (localObject1 = ""; ; localObject1 = "&SD=" + d2 + ',' + d1 + ',' + 0 + ',' + paramInt + ',' + i + ',' + 0 + ',' + j + ',' + 0 + ',' + 0 + ',' + 0)
    {
      this.bEV.e((String)localObject1, paramLong);
      c(new n.a(d2, d1, paramInt, this.bFb, this.bFc));
      AppMethodBeat.o(55689);
      break;
      d1 = 0.0D;
      break label867;
    }
  }

  void a(int paramInt, String paramString, long paramLong1, long paramLong2)
  {
    AppMethodBeat.i(55691);
    c(new n.b(paramInt, paramString, (byte)0));
    if ((paramInt == -4) || (paramInt == -5))
      stop();
    AppMethodBeat.o(55691);
  }

  void a(Handler paramHandler, d.a parama)
  {
    try
    {
      AppMethodBeat.i(55692);
      if ((parama instanceof n.c))
      {
        parama = (n.c)parama;
        this.bEY = parama.bFq;
        we();
        this.bEX.bGi = paramHandler;
        this.bFl = SystemClock.elapsedRealtime();
        super.a(paramHandler, parama);
        AppMethodBeat.o(55692);
        return;
      }
      if (parama != null);
      for (long l = parama.bCP; ; l = 5000L)
      {
        parama = new n.c(l, 9000L);
        break;
      }
    }
    finally
    {
    }
    throw paramHandler;
  }

  void a(x paramx, long paramLong1, long paramLong2)
  {
    AppMethodBeat.i(55688);
    this.bEZ = paramx.bFX;
    this.bFb = paramx.level;
    this.bFc = paramx.bFo;
    if ((paramx.bIy.equals("W")) && (a(paramLong2, 2, paramx.latitude, paramx.longitude, paramx.altitude, paramx.bEJ, paramx.bID, paramx.speed)))
      this.bEW.a(paramx.latitude, paramx.longitude, paramx.bEJ, this.bFg, this.bFh, this.bFi);
    if (!u.wx().bGV)
      c(new n.a(paramx.latitude, paramx.longitude, Float.valueOf(paramx.bEJ).intValue(), this.bFb, this.bFc));
    AppMethodBeat.o(55688);
  }

  final void a(List<ScanResult> paramList, long paramLong1, long paramLong2)
  {
    AppMethodBeat.i(55687);
    paramLong1 = aa.ay(paramLong1);
    boolean bool;
    Object localObject1;
    Object localObject2;
    r localr;
    int i;
    long l2;
    if ((this.bEZ != 0L) && (paramLong2 - this.bEZ < this.bEY))
    {
      bool = false;
      localObject1 = v.a(paramList, bool);
      localObject2 = this.bEV.c((String)localObject1, paramLong2, bool);
      if (!bool)
        break label320;
      localr = r.wg();
      i = this.bFk;
      if (localObject2 != null)
      {
        if (!localr.isRunning)
          break label278;
        if (!localr.wi())
          break label273;
        long l1 = System.currentTimeMillis();
        l2 = SystemClock.elapsedRealtime();
        if (localr.bFK != null)
          localr.bFK.execute(new r.e(localr, (String)localObject2, l1, l2, i, (byte)0));
      }
      label142: if (n.d.o(paramLong2, this.bFa))
        if (bool)
          break label338;
    }
    while (true)
    {
      localObject2 = localObject1;
      if (localObject1 == null)
        localObject2 = v.a(paramList, false);
      paramList = v.b((String)localObject2, paramLong1, "2");
      localObject1 = this.bEX;
      float f1 = this.bFg;
      float f2 = this.bFh;
      float f3 = this.bFi;
      float f4 = this.bFj;
      i = this.bFb;
      if (((s)localObject1).bGd != 0.0F)
        z.b(null).execute(new s.a((s)localObject1, f1, f2, f3, f4, i, paramList, (byte)0));
      AppMethodBeat.o(55687);
      return;
      bool = true;
      break;
      label273: localr.wh();
      label278: l2 = aa.ay(System.currentTimeMillis());
      if (localr.bFK == null)
        break label142;
      localr.bFK.execute(new r.c(localr, (String)localObject2, l2, 0, (byte)0));
      break label142;
      label320: r.wg().bp(v.b((String)localObject2, paramLong1, "0"));
      break label142;
      label338: localObject1 = null;
    }
  }

  final void stop()
  {
    try
    {
      AppMethodBeat.i(55693);
      this.bEX.wo();
      super.stop();
      AppMethodBeat.o(55693);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  final void wd()
  {
    this.bFd = true;
    this.bFe = null;
    this.bFf = 0;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.b.a.a.n
 * JD-Core Version:    0.6.2
 */