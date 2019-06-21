package com.tencent.mm.sdk.platformtools;

import android.content.Context;
import android.hardware.SensorListener;
import android.hardware.SensorManager;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.List;

public final class bf
{
  private SensorManager vfZ;
  private a xBK;

  public bf(Context paramContext)
  {
    AppMethodBeat.i(52272);
    this.vfZ = ((SensorManager)paramContext.getSystemService("sensor"));
    AppMethodBeat.o(52272);
  }

  public final boolean aj(Runnable paramRunnable)
  {
    boolean bool = false;
    AppMethodBeat.i(52273);
    if (this.vfZ == null)
      AppMethodBeat.o(52273);
    while (true)
    {
      return bool;
      List localList = this.vfZ.getSensorList(1);
      if ((localList != null) && (localList.size() > 0))
      {
        this.xBK = new a(paramRunnable);
        this.vfZ.registerListener(this.xBK, 2, 3);
        AppMethodBeat.o(52273);
        bool = true;
      }
      else
      {
        AppMethodBeat.o(52273);
      }
    }
  }

  public final void dpt()
  {
    AppMethodBeat.i(52274);
    if ((this.vfZ != null) && (this.xBK != null))
      this.vfZ.unregisterListener(this.xBK, 2);
    AppMethodBeat.o(52274);
  }

  static final class a
    implements SensorListener
  {
    private Runnable callback;
    private float[] vgc;

    public a(Runnable paramRunnable)
    {
      AppMethodBeat.i(52270);
      this.vgc = new float[] { 0.0F, 0.0F, 0.0F };
      this.callback = paramRunnable;
      AppMethodBeat.o(52270);
    }

    public final void onAccuracyChanged(int paramInt1, int paramInt2)
    {
    }

    public final void onSensorChanged(int paramInt, float[] paramArrayOfFloat)
    {
      AppMethodBeat.i(52271);
      float[] arrayOfFloat = new float[3];
      paramInt = 0;
      int j;
      for (int i = 0; paramInt < 3; i = j)
      {
        arrayOfFloat[paramInt] = Math.abs(paramArrayOfFloat[paramInt] - this.vgc[paramInt]);
        j = i;
        if (this.vgc[paramInt] != 0.0F)
        {
          j = i;
          if (arrayOfFloat[paramInt] > 1.0F)
          {
            j = 1;
            ab.d("MicroMsg.ShakeManager", "isONShake:" + arrayOfFloat[paramInt]);
          }
        }
        this.vgc[paramInt] = paramArrayOfFloat[paramInt];
        paramInt++;
      }
      if (i != 0)
        this.callback.run();
      AppMethodBeat.o(52271);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.platformtools.bf
 * JD-Core Version:    0.6.2
 */