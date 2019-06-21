package com.b.a.a;

import android.annotation.TargetApi;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.opengl.Matrix;
import android.os.Build.VERSION;
import android.os.Handler;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class u extends d
  implements SensorEventListener
{
  private static final int bGB;
  private static final int bGC;
  private static u bGU;
  private Sensor accelerometer;
  private SensorManager bCW;
  private Sensor bGD;
  private Sensor bGE;
  private Sensor bGF;
  private Sensor bGG;
  private long bGH;
  private boolean bGI;
  private float[][] bGJ;
  private float[][] bGK;
  private float[][] bGL;
  private float[][] bGM;
  private float[][] bGN;
  private float[][] bGO;
  private float[][] bGP;
  private float[] bGQ;
  private float[][] bGR;
  private float[][] bGS;
  private float[][] bGT;
  boolean bGV;
  private u.c bGW;
  private boolean[] bGX;
  private int[] bGY;
  private float[] bGZ;
  private float[] bHa;
  private float[] bHb;
  private float[][] bHc;
  private final u.d bHd;
  private final u.f bHe;
  private final u.a bHf;

  static
  {
    AppMethodBeat.i(55641);
    int i = Math.round(50000.0F);
    bGB = i;
    bGC = i;
    AppMethodBeat.o(55641);
  }

  private u()
  {
    AppMethodBeat.i(55643);
    this.bCW = null;
    this.bGG = null;
    this.bGH = 0L;
    this.bGI = true;
    this.bGJ = new float[6][9];
    this.bGK = new float[6][9];
    this.bGL = new float[6][9];
    this.bGM = new float[6][3];
    this.bGN = new float[6][3];
    this.bGO = new float[6][3];
    this.bGP = new float[6][3];
    this.bGQ = new float[4];
    this.bGR = new float[6][3];
    this.bGS = new float[6][3];
    this.bGT = new float[6][3];
    this.bGX = new boolean[6];
    this.bGY = new int[6];
    this.bGZ = new float[6];
    this.bHa = new float[6];
    this.bHb = new float[] { (0.0F / 0.0F), (0.0F / 0.0F), (0.0F / 0.0F), (0.0F / 0.0F), (0.0F / 0.0F), (0.0F / 0.0F) };
    this.bHc = new float[6][20];
    this.bHf = new u.a((byte)0);
    this.bHd = new u.d((byte)0);
    this.bHe = new u.f(this, (byte)0);
    AppMethodBeat.o(55643);
  }

  private static void a(float[] paramArrayOfFloat, float[][] paramArrayOfFloat1)
  {
    AppMethodBeat.i(55649);
    paramArrayOfFloat1[0][0] = (-paramArrayOfFloat[1]);
    paramArrayOfFloat1[0][1] = paramArrayOfFloat[0];
    paramArrayOfFloat1[0][2] = paramArrayOfFloat[2];
    paramArrayOfFloat1[1][0] = paramArrayOfFloat[1];
    paramArrayOfFloat1[1][1] = (-paramArrayOfFloat[0]);
    paramArrayOfFloat1[1][2] = paramArrayOfFloat[2];
    System.arraycopy(paramArrayOfFloat, 0, paramArrayOfFloat1[2], 0, 3);
    paramArrayOfFloat1[3][0] = (-paramArrayOfFloat[0]);
    paramArrayOfFloat1[3][1] = (-paramArrayOfFloat[1]);
    paramArrayOfFloat1[3][2] = paramArrayOfFloat[2];
    paramArrayOfFloat1[4][0] = paramArrayOfFloat[0];
    paramArrayOfFloat1[4][1] = paramArrayOfFloat[2];
    paramArrayOfFloat1[4][2] = (-paramArrayOfFloat[1]);
    paramArrayOfFloat1[5][0] = paramArrayOfFloat[0];
    paramArrayOfFloat1[5][1] = (-paramArrayOfFloat[2]);
    paramArrayOfFloat1[5][2] = paramArrayOfFloat[1];
    AppMethodBeat.o(55649);
  }

  private static void a(float[][] paramArrayOfFloat1, float[][] paramArrayOfFloat2)
  {
    AppMethodBeat.i(55644);
    for (int i = 0; ; i++)
    {
      if (i > 5)
      {
        AppMethodBeat.o(55644);
        return;
      }
      SensorManager.getOrientation(paramArrayOfFloat1[i], paramArrayOfFloat2[i]);
    }
  }

  @TargetApi(19)
  private static boolean a(SensorManager paramSensorManager, SensorEventListener paramSensorEventListener, int paramInt1, int paramInt2, Handler paramHandler, Sensor[] paramArrayOfSensor)
  {
    AppMethodBeat.i(55648);
    try
    {
      int i;
      int j;
      if (Build.VERSION.SDK_INT >= 19)
      {
        i = 1;
        j = paramArrayOfSensor.length;
      }
      label112: for (int k = 0; ; k++)
      {
        if (k >= j)
        {
          bool = true;
          AppMethodBeat.o(55648);
          return bool;
          i = 0;
          break;
        }
        Sensor localSensor = paramArrayOfSensor[k];
        if (i != 0);
        for (bool = paramSensorManager.registerListener(paramSensorEventListener, localSensor, paramInt1, paramInt2, paramHandler); ; bool = paramSensorManager.registerListener(paramSensorEventListener, localSensor, paramInt1, paramHandler))
        {
          if (bool)
            break label112;
          paramSensorManager.unregisterListener(paramSensorEventListener);
          bool = false;
          AppMethodBeat.o(55648);
          break;
        }
      }
    }
    catch (Error paramSensorManager)
    {
      while (true)
      {
        bool = false;
        AppMethodBeat.o(55648);
      }
    }
    catch (Exception paramSensorManager)
    {
      while (true)
      {
        boolean bool = false;
        AppMethodBeat.o(55648);
      }
    }
  }

  private static float[] b(float[] paramArrayOfFloat1, float[] paramArrayOfFloat2)
  {
    return new float[] { paramArrayOfFloat1[0] * paramArrayOfFloat2[0] + paramArrayOfFloat1[1] * paramArrayOfFloat2[3] + paramArrayOfFloat1[2] * paramArrayOfFloat2[6], paramArrayOfFloat1[0] * paramArrayOfFloat2[1] + paramArrayOfFloat1[1] * paramArrayOfFloat2[4] + paramArrayOfFloat1[2] * paramArrayOfFloat2[7], paramArrayOfFloat1[0] * paramArrayOfFloat2[2] + paramArrayOfFloat1[1] * paramArrayOfFloat2[5] + paramArrayOfFloat1[2] * paramArrayOfFloat2[8], paramArrayOfFloat1[3] * paramArrayOfFloat2[0] + paramArrayOfFloat1[4] * paramArrayOfFloat2[3] + paramArrayOfFloat1[5] * paramArrayOfFloat2[6], paramArrayOfFloat1[3] * paramArrayOfFloat2[1] + paramArrayOfFloat1[4] * paramArrayOfFloat2[4] + paramArrayOfFloat1[5] * paramArrayOfFloat2[7], paramArrayOfFloat1[3] * paramArrayOfFloat2[2] + paramArrayOfFloat1[4] * paramArrayOfFloat2[5] + paramArrayOfFloat1[5] * paramArrayOfFloat2[8], paramArrayOfFloat1[6] * paramArrayOfFloat2[0] + paramArrayOfFloat1[7] * paramArrayOfFloat2[3] + paramArrayOfFloat1[8] * paramArrayOfFloat2[6], paramArrayOfFloat1[6] * paramArrayOfFloat2[1] + paramArrayOfFloat1[7] * paramArrayOfFloat2[4] + paramArrayOfFloat1[8] * paramArrayOfFloat2[7], paramArrayOfFloat1[6] * paramArrayOfFloat2[2] + paramArrayOfFloat1[7] * paramArrayOfFloat2[5] + paramArrayOfFloat1[8] * paramArrayOfFloat2[8] };
  }

  static u wx()
  {
    AppMethodBeat.i(55642);
    if (bGU == null)
      bGU = new u();
    u localu = bGU;
    AppMethodBeat.o(55642);
    return localu;
  }

  final void a(Context paramContext, Handler paramHandler, d.a parama)
  {
    AppMethodBeat.i(55645);
    if (paramContext == null)
      try
      {
        paramContext = new java/lang/Exception;
        paramContext.<init>("SensorModule: register with null context");
        AppMethodBeat.o(55645);
        throw paramContext;
      }
      catch (Exception paramContext)
      {
        this.bGV = false;
      }
    label414: label418: 
    while (true)
    {
      AppMethodBeat.o(55645);
      return;
      int i = 0;
      label45: boolean bool;
      if (i > 5)
      {
        this.bCW = ((SensorManager)paramContext.getSystemService("sensor"));
        this.accelerometer = this.bCW.getDefaultSensor(10);
        this.bGF = this.bCW.getDefaultSensor(9);
        if ((this.accelerometer == null) || (this.bGF == null))
          break label414;
        this.bGG = this.bCW.getDefaultSensor(11);
        if (this.bGG == null)
          break label324;
        bool = a(this.bCW, this, bGB, bGC, paramHandler, new Sensor[] { this.accelerometer, this.bGF, this.bGG });
      }
      while (true)
      {
        if (!bool)
          break label418;
        this.bGV = true;
        paramContext = new com/b/a/a/u$c;
        paramContext.<init>(this, paramHandler);
        this.bGW = paramContext;
        if (this.bGW != null)
          this.bGW.n(Math.round(50.0F), 1000L);
        AppMethodBeat.o(55645);
        break;
        this.bGK[i][0] = 1.0F;
        this.bGK[i][1] = 0.0F;
        this.bGK[i][2] = 0.0F;
        this.bGK[i][3] = 0.0F;
        this.bGK[i][4] = 1.0F;
        this.bGK[i][5] = 0.0F;
        this.bGK[i][6] = 0.0F;
        this.bGK[i][7] = 0.0F;
        this.bGK[i][8] = 1.0F;
        i++;
        break label45;
        label324: this.bGD = this.bCW.getDefaultSensor(4);
        this.bGE = this.bCW.getDefaultSensor(2);
        if ((this.bGD != null) && (this.bGE != null))
          bool = a(this.bCW, this, bGB, bGC, paramHandler, new Sensor[] { this.accelerometer, this.bGF, this.bGD, this.bGE });
        else
          bool = false;
      }
    }
  }

  final void a(Handler paramHandler, d.a parama)
  {
    try
    {
      AppMethodBeat.i(55647);
      super.a(paramHandler, parama);
      AppMethodBeat.o(55647);
      return;
    }
    finally
    {
      paramHandler = finally;
    }
    throw paramHandler;
  }

  final void at(Context paramContext)
  {
  }

  final void au(Context paramContext)
  {
    AppMethodBeat.i(55646);
    if (this.bGW != null)
      this.bGW.stop();
    if (this.bCW != null);
    try
    {
      this.bCW.unregisterListener(this);
      label35: this.bCW = null;
      this.bGG = null;
      this.bGF = null;
      this.bGE = null;
      this.bGD = null;
      this.accelerometer = null;
      this.bGH = 0L;
      this.bGI = true;
      this.bGJ = new float[6][9];
      this.bGK = new float[6][9];
      this.bGM = new float[6][3];
      this.bGN = new float[6][3];
      this.bGO = new float[6][3];
      this.bGX = new boolean[6];
      this.bGY = new int[6];
      this.bGZ = new float[6];
      this.bHa = new float[6];
      this.bHb = new float[] { (0.0F / 0.0F), (0.0F / 0.0F), (0.0F / 0.0F), (0.0F / 0.0F), (0.0F / 0.0F), (0.0F / 0.0F) };
      this.bHc = new float[6][20];
      this.bHf.reset();
      this.bHd.reset();
      this.bHe.reset();
      AppMethodBeat.o(55646);
      return;
    }
    catch (Error paramContext)
    {
      break label35;
    }
    catch (Exception paramContext)
    {
      break label35;
    }
  }

  public final void onAccuracyChanged(Sensor paramSensor, int paramInt)
  {
  }

  public final void onSensorChanged(SensorEvent paramSensorEvent)
  {
    int i = 0;
    int j = 0;
    AppMethodBeat.i(55650);
    switch (paramSensorEvent.sensor.getType())
    {
    case 3:
    case 5:
    case 6:
    case 7:
    case 8:
    default:
    case 10:
    case 9:
    case 11:
    case 4:
    case 2:
    }
    while (true)
    {
      AppMethodBeat.o(55650);
      Object localObject1;
      float[] arrayOfFloat;
      while (true)
      {
        return;
        localObject1 = new float[16];
        if (this.bGG != null);
        for (Object localObject2 = this.bGL; ; localObject2 = this.bGK)
        {
          arrayOfFloat = localObject2[2];
          localObject2 = new float[16];
          if (arrayOfFloat.length == 9)
          {
            localObject2[0] = arrayOfFloat[0];
            localObject2[1] = arrayOfFloat[1];
            localObject2[2] = arrayOfFloat[2];
            localObject2[3] = 0.0F;
            localObject2[4] = arrayOfFloat[3];
            localObject2[5] = arrayOfFloat[4];
            localObject2[6] = arrayOfFloat[5];
            localObject2[7] = 0.0F;
            localObject2[8] = arrayOfFloat[6];
            localObject2[9] = arrayOfFloat[7];
            localObject2[10] = arrayOfFloat[8];
            localObject2[11] = 0.0F;
            localObject2[12] = 0.0F;
            localObject2[13] = 0.0F;
            localObject2[14] = 0.0F;
            localObject2[15] = 1.0F;
          }
          Matrix.invertM((float[])localObject1, 0, (float[])localObject2, 0);
          Matrix.multiplyMV(this.bGQ, 0, (float[])localObject1, 0, new float[] { paramSensorEvent.values[0], paramSensorEvent.values[1], paramSensorEvent.values[2], 0.0F }, 0);
          this.bHd.a(this.bGQ, paramSensorEvent.values, this.bGT[2]);
          AppMethodBeat.o(55650);
          break;
        }
        a(paramSensorEvent.values, this.bGT);
        if ((this.bGS[2][0] == 0.0F) && (this.bGS[2][1] == 0.0F) && (this.bGS[2][2] == 0.0F))
          break;
        paramSensorEvent = this.bGJ;
        localObject2 = this.bGT;
        localObject1 = this.bGS;
        if ((SensorManager.getRotationMatrix(paramSensorEvent[0], null, localObject2[0], localObject1[0])) && (SensorManager.getRotationMatrix(paramSensorEvent[1], null, localObject2[1], localObject1[1])) && (SensorManager.getRotationMatrix(paramSensorEvent[2], null, localObject2[2], localObject1[2])) && (SensorManager.getRotationMatrix(paramSensorEvent[3], null, localObject2[3], localObject1[3])) && (SensorManager.getRotationMatrix(paramSensorEvent[4], null, localObject2[4], localObject1[4])) && (SensorManager.getRotationMatrix(paramSensorEvent[5], null, localObject2[5], localObject1[5])))
        {
          j = 1;
          label510: if (j != 0)
          {
            a(this.bGJ, this.bGM);
            if ((this.bGN[2][0] == 0.0F) && (this.bGN[2][1] == 0.0F) && (this.bGN[2][2] == 0.0F))
            {
              paramSensorEvent = this.bGM;
              localObject2 = this.bGN;
            }
          }
        }
        for (j = 0; ; j++)
        {
          if (j > 5)
          {
            AppMethodBeat.o(55650);
            break;
            j = 0;
            break label510;
          }
          System.arraycopy(paramSensorEvent[j], 0, localObject2[j], 0, 3);
        }
        try
        {
          SensorManager.getRotationMatrixFromVector(this.bGL[2], paramSensorEvent.values);
          SensorManager.remapCoordinateSystem(this.bGL[2], 2, 129, this.bGL[0]);
          SensorManager.remapCoordinateSystem(this.bGL[2], 130, 1, this.bGL[1]);
          SensorManager.remapCoordinateSystem(this.bGL[2], 129, 130, this.bGL[3]);
          SensorManager.remapCoordinateSystem(this.bGL[2], 129, 3, this.bGL[4]);
          SensorManager.remapCoordinateSystem(this.bGL[2], 1, 3, this.bGL[5]);
          if (j > 5)
            AppMethodBeat.o(55650);
        }
        catch (IllegalArgumentException localIllegalArgumentException)
        {
          while (true)
            if (paramSensorEvent.values.length > 3)
            {
              SensorManager.getRotationMatrixFromVector(this.bGL[2], new float[] { paramSensorEvent.values[0], paramSensorEvent.values[1], paramSensorEvent.values[2] });
              continue;
              SensorManager.getOrientation(this.bGL[j], this.bGP[j]);
              j++;
            }
        }
      }
      label865: Object localObject3;
      float f1;
      if ((this.bGM[2][0] != 0.0F) || (this.bGM[2][1] != 0.0F) || (this.bGM[2][2] != 0.0F))
      {
        if (this.bGI)
        {
          j = 0;
          if (j <= 5)
            break label958;
          this.bGI = false;
        }
        localObject3 = new float[6][4];
        if (this.bGH != 0L)
        {
          f1 = (float)(paramSensorEvent.timestamp - this.bGH);
          a(paramSensorEvent.values, this.bGR);
        }
      }
      label933: label958: float f2;
      float f3;
      for (j = 0; ; j++)
      {
        if (j > 5)
        {
          this.bGH = paramSensorEvent.timestamp;
          j = i;
          if (j <= 5)
            break label1168;
          a(this.bGK, this.bGN);
          AppMethodBeat.o(55650);
          break;
          localObject1 = this.bGJ[j];
          localObject3 = this.bGK;
          localObject3[j] = b(localObject3[j], (float[])localObject1);
          j++;
          break label865;
        }
        arrayOfFloat = this.bGR[j];
        Object localObject4 = localObject3[j];
        f2 = 1.0E-009F * f1 / 2.0F;
        localObject1 = new float[3];
        f3 = (float)Math.sqrt(arrayOfFloat[0] * arrayOfFloat[0] + arrayOfFloat[1] * arrayOfFloat[1] + arrayOfFloat[2] * arrayOfFloat[2]);
        if (f3 > 1.0E-009F)
        {
          arrayOfFloat[0] /= f3;
          arrayOfFloat[1] /= f3;
          arrayOfFloat[2] /= f3;
        }
        f3 *= f2;
        f2 = (float)Math.sin(f3);
        f3 = (float)Math.cos(f3);
        localObject1[0] *= f2;
        localObject1[1] *= f2;
        localObject4[2] = (f2 * localObject1[2]);
        localObject4[3] = f3;
      }
      label1168: paramSensorEvent = new float[9];
      try
      {
        SensorManager.getRotationMatrixFromVector(paramSensorEvent, localObject3[j]);
        label1181: localObject1 = this.bGK;
        localObject1[j] = b(localObject1[j], paramSensorEvent);
        j++;
        break label933;
        a(paramSensorEvent.values, this.bGS);
        localObject3 = this.bHf;
        paramSensorEvent = paramSensorEvent.values;
        if (paramSensorEvent.length < 3)
          continue;
        ((u.a)localObject3).bHg += 1;
        double d = ((u.a)localObject3).bHh;
        float f4 = paramSensorEvent[0];
        f2 = paramSensorEvent[0];
        f3 = paramSensorEvent[1];
        float f5 = paramSensorEvent[1];
        f1 = paramSensorEvent[2];
        ((u.a)localObject3).bHh = ((float)(Math.sqrt(f2 * f4 + f5 * f3 + paramSensorEvent[2] * f1) + d));
      }
      catch (Exception localException)
      {
        break label1181;
      }
    }
  }

  final void vV()
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.b.a.a.u
 * JD-Core Version:    0.6.2
 */