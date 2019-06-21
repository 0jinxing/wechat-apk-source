package com.tencent.mm.modelstat;

import android.content.Context;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Pair;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.i;
import com.tencent.mm.a.p;
import com.tencent.mm.kernel.a;
import com.tencent.mm.sdk.g.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;
import junit.framework.Assert;

public class e
{
  private static e fSf;
  private int fSg;
  private int fSh;
  private int fSi;
  private int fSj;
  private int fSk;
  private ArrayList<Pair<Float, Float>> fSl;
  private ArrayList<Pair<Float, Float>> fSm;
  private long startTime;

  public e()
  {
    AppMethodBeat.i(78726);
    this.startTime = 0L;
    this.fSg = -1;
    this.fSh = 20000;
    this.fSi = 3000;
    this.fSj = 1000;
    this.fSk = 20;
    this.fSl = new ArrayList();
    this.fSm = new ArrayList();
    AppMethodBeat.o(78726);
  }

  public static e akf()
  {
    AppMethodBeat.i(78727);
    if (fSf == null);
    try
    {
      if (fSf == null)
      {
        locale = new com/tencent/mm/modelstat/e;
        locale.<init>();
        fSf = locale;
      }
      e locale = fSf;
      AppMethodBeat.o(78727);
      return locale;
    }
    finally
    {
      AppMethodBeat.o(78727);
    }
  }

  public final void a(int paramInt1, boolean paramBoolean1, boolean paramBoolean2, float paramFloat1, float paramFloat2, int paramInt2)
  {
    AppMethodBeat.i(78728);
    ab.i("MicroMsg.IndoorReporter", "report scene:%d agps:%b mars:%b lon:%f lat:%f acc:%d", new Object[] { Integer.valueOf(paramInt1), Boolean.valueOf(paramBoolean1), Boolean.valueOf(paramBoolean2), Float.valueOf(paramFloat1), Float.valueOf(paramFloat2), Integer.valueOf(paramInt2) });
    if (com.tencent.mm.kernel.g.RN().QY())
    {
      com.tencent.mm.kernel.g.RN();
      if (!a.QT());
    }
    else
    {
      AppMethodBeat.o(78728);
    }
    while (true)
    {
      return;
      com.tencent.mm.be.b localb = com.tencent.mm.be.b.aiD();
      if (paramBoolean2);
      for (int i = 1; ; i = 0)
      {
        localb.a(paramFloat1, paramFloat2, paramInt2, "", "", i, paramInt1);
        if ((this.fSm.size() != 0) || (this.fSl.size() != 0) || (tI(com.tencent.mm.m.g.Nu().getValue("AndroidIndoorSensorReport"))))
          break label166;
        AppMethodBeat.o(78728);
        break;
      }
      label166: if (!com.tencent.mm.sdk.a.b.dnO())
      {
        com.tencent.mm.kernel.g.RN();
        i = i.bL(a.QF() + 5, 100);
        if (i > this.fSg)
        {
          com.tencent.mm.kernel.g.RN();
          ab.d("MicroMsg.IndoorReporter", "report uin:%s hash:%d config:%d", new Object[] { Long.valueOf(new p(a.QF()).longValue()), Integer.valueOf(i), Integer.valueOf(this.fSg) });
          AppMethodBeat.o(78728);
        }
      }
      else
      {
        com.tencent.mm.kernel.g.RQ();
        com.tencent.mm.kernel.g.RS().aa(new e.1(this, paramBoolean2, paramFloat1, paramFloat2, paramInt1, paramBoolean1, paramInt2));
        AppMethodBeat.o(78728);
      }
    }
  }

  public final boolean tI(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(78729);
    if (bo.isNullOrNil(paramString))
      AppMethodBeat.o(78729);
    while (true)
    {
      return bool;
      int i;
      try
      {
        String[] arrayOfString1 = paramString.split(",");
        this.fSg = bo.getInt(arrayOfString1[0], -1);
        if (this.fSg > 101)
          Assert.assertTrue(false);
        this.fSh = bo.getInt(arrayOfString1[1], 20000);
        this.fSi = bo.getInt(arrayOfString1[2], 3000);
        this.fSj = bo.getInt(arrayOfString1[3], 1000);
        this.fSk = bo.getInt(arrayOfString1[4], 20);
        i = bo.getInt(arrayOfString1[5], 0);
        int j = 0;
        if (j >= i)
          break label277;
        String[] arrayOfString2 = arrayOfString1[(j + 6)].split(";");
        ArrayList localArrayList;
        Pair localPair;
        if ("1".equals(arrayOfString2[0]))
        {
          localArrayList = this.fSl;
          localPair = new android/util/Pair;
          localPair.<init>(Float.valueOf(bo.ann(arrayOfString2[1])), Float.valueOf(bo.ann(arrayOfString2[2])));
          localArrayList.add(localPair);
        }
        while (true)
        {
          j++;
          break;
          localArrayList = this.fSm;
          localPair = new android/util/Pair;
          localPair.<init>(Float.valueOf(bo.ann(arrayOfString2[1])), Float.valueOf(bo.ann(arrayOfString2[2])));
          localArrayList.add(localPair);
        }
      }
      catch (Exception localException)
      {
        ab.e("MicroMsg.IndoorReporter", "parseConfig e:%s  [%s]", new Object[] { localException.getMessage(), paramString });
        AppMethodBeat.o(78729);
      }
      continue;
      label277: ab.i("MicroMsg.IndoorReporter", "parseConfig: max:%d wifiFreq:%d sensorFreq:%d maxWifiCount:%d cnt:%d mars:%d earth:%d", new Object[] { Integer.valueOf(this.fSh), Integer.valueOf(this.fSi), Integer.valueOf(this.fSj), Integer.valueOf(this.fSk), Integer.valueOf(i), Integer.valueOf(this.fSl.size()), Integer.valueOf(this.fSm.size()) });
      AppMethodBeat.o(78729);
      bool = true;
    }
  }

  final class b
  {
    long eRt;
    e.a fSA;
    e.a fSB;
    e.a fSC;
    private Long fSD;
    ArrayList<Long> fSE;
    ArrayList<e.a> fSF;
    ArrayList<e.a> fSG;
    ArrayList<e.a> fSH;
    ArrayList<float[]> fSI;
    private SensorEventListener fSJ;
    long fSz;
    private HandlerThread handlerThread;
    private SensorManager sensorManager;

    b()
    {
      AppMethodBeat.i(78719);
      this.fSz = 0L;
      this.handlerThread = null;
      this.fSA = null;
      this.fSB = null;
      this.fSC = null;
      this.fSD = null;
      this.eRt = 0L;
      this.fSE = new ArrayList();
      this.fSF = new ArrayList();
      this.fSG = new ArrayList();
      this.fSH = new ArrayList();
      this.fSI = new ArrayList();
      this.fSJ = new e.b.1(this);
      AppMethodBeat.o(78719);
    }

    private static String a(e.a parama)
    {
      AppMethodBeat.i(78722);
      try
      {
        new String();
        parama = String.format("%d;%.3f;%.3f;%.3f;", new Object[] { Integer.valueOf(parama.accuracy), Float.valueOf(parama.values[0]), Float.valueOf(parama.values[1]), Float.valueOf(parama.values[2]) });
        AppMethodBeat.o(78722);
        return parama;
      }
      catch (Exception parama)
      {
        while (true)
        {
          parama = "0;0;0;0;";
          AppMethodBeat.o(78722);
        }
      }
    }

    public final boolean A(Context paramContext, int paramInt)
    {
      AppMethodBeat.i(78720);
      try
      {
        if (this.sensorManager == null)
          this.sensorManager = ((SensorManager)paramContext.getSystemService("sensor"));
        if (this.handlerThread == null)
        {
          this.handlerThread = d.ek("MicroMsg.IndoorReporter", 1);
          this.handlerThread.start();
        }
        paramContext = new android/os/Handler;
        paramContext.<init>(this.handlerThread.getLooper());
        boolean bool1 = this.sensorManager.registerListener(this.fSJ, this.sensorManager.getDefaultSensor(1), 3, paramContext);
        bool2 = this.sensorManager.registerListener(this.fSJ, this.sensorManager.getDefaultSensor(4), 3, paramContext);
        boolean bool3 = this.sensorManager.registerListener(this.fSJ, this.sensorManager.getDefaultSensor(2), 3, paramContext);
        if ((bool1) && (bool2) && (bool3))
        {
          bool2 = true;
          if (bool2);
        }
      }
      catch (Exception paramContext)
      {
        try
        {
          while (true)
          {
            boolean bool2;
            if (this.sensorManager != null)
            {
              this.sensorManager.unregisterListener(this.fSJ);
              this.sensorManager = null;
            }
            try
            {
              label177: if (this.handlerThread != null)
              {
                this.handlerThread.quit();
                this.handlerThread = null;
              }
              label197: this.fSz = paramInt;
              this.fSD = Long.valueOf(bo.anU());
              AppMethodBeat.o(78720);
              return bool2;
              bool2 = false;
              continue;
              paramContext = paramContext;
              ab.e("MicroMsg.IndoorReporter", "start except:%s", new Object[] { paramContext.getMessage() });
              bool2 = false;
            }
            catch (Exception paramContext)
            {
              break label197;
            }
          }
        }
        catch (Exception paramContext)
        {
          break label177;
        }
      }
    }

    public final String akg()
    {
      AppMethodBeat.i(78721);
      try
      {
        if (this.sensorManager != null)
        {
          this.sensorManager.unregisterListener(this.fSJ);
          this.sensorManager = null;
        }
        try
        {
          label28: if (this.handlerThread != null)
          {
            this.handlerThread.quit();
            this.handlerThread = null;
          }
          label48: ab.i("MicroMsg.IndoorReporter", "stop sampling Res Count: %d", new Object[] { Integer.valueOf(this.fSE.size()) });
          String str = this.fSD + ";" + this.fSE.size() + ";#";
          for (int i = 0; i < this.fSE.size(); i++)
          {
            str = str + (((Long)this.fSE.get(i)).longValue() - this.fSD.longValue()) + ";";
            str = str + a((e.a)this.fSF.get(i));
            ab.i("MicroMsg.IndoorReporter", "%d accResArr [%d,%f,%f,%f]  %s", new Object[] { Integer.valueOf(i), Integer.valueOf(((e.a)this.fSF.get(i)).accuracy), Float.valueOf(((e.a)this.fSF.get(i)).values[0]), Float.valueOf(((e.a)this.fSF.get(i)).values[1]), Float.valueOf(((e.a)this.fSF.get(i)).values[2]), a((e.a)this.fSF.get(i)) });
            str = str + a((e.a)this.fSH.get(i));
            str = str + a((e.a)this.fSG.get(i));
            str = str + String.format("%.3f;%.3f;%.3f;#", new Object[] { Float.valueOf(((float[])this.fSI.get(i))[0]), Float.valueOf(((float[])this.fSI.get(i))[1]), Float.valueOf(((float[])this.fSI.get(i))[2]) });
          }
          ab.i("MicroMsg.IndoorReporter", "stop  Res: %d [%s]", new Object[] { Integer.valueOf(str.length()), str });
          AppMethodBeat.o(78721);
          return str;
        }
        catch (Exception localException1)
        {
          break label48;
        }
      }
      catch (Exception localException2)
      {
        break label28;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelstat.e
 * JD-Core Version:    0.6.2
 */