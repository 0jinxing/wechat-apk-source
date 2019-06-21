package com.tencent.ttpic.ar.sensor.orientationProvider;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorManager;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class SimpleOrientationSensorProvider extends OrientationProvider
{
  private int ANGLE_QUEUE_MAX_SIZE;
  private Queue<Float> azimuthQueue;
  private float[] geomagnetic;
  private float[] gravity;
  private float lastAzimuth;
  private float lastPitch;
  private float lastRoll;
  private Queue<Float> pitchQueue;
  private Queue<Float> rollQueue;
  private float[] rotationMat;
  private float[] values;

  public SimpleOrientationSensorProvider(SensorManager paramSensorManager)
  {
    super(paramSensorManager);
    AppMethodBeat.i(81680);
    this.ANGLE_QUEUE_MAX_SIZE = 5;
    this.azimuthQueue = new LinkedList();
    this.pitchQueue = new LinkedList();
    this.rollQueue = new LinkedList();
    this.values = new float[3];
    this.gravity = new float[3];
    this.rotationMat = new float[9];
    this.geomagnetic = new float[3];
    this.sensorList.add(paramSensorManager.getDefaultSensor(2));
    this.sensorList.add(paramSensorManager.getDefaultSensor(1));
    AppMethodBeat.o(81680);
  }

  public void getEulerAngles(float[] paramArrayOfFloat)
  {
    AppMethodBeat.i(81682);
    float f2;
    synchronized (this.synchronizationToken)
    {
      SensorManager.getRotationMatrix(this.rotationMat, null, this.gravity, this.geomagnetic);
      SensorManager.getOrientation(this.rotationMat, this.values);
      float f1 = (float)Math.toDegrees(this.values[0]);
      f2 = f1;
      if (f1 < 0.0F)
        f2 = f1 + 360.0F;
      f1 = f2;
      if (180.0F <= f2)
      {
        f1 = f2;
        if (f2 <= 360.0F)
          f1 = f2 - 360.0F;
      }
      f2 = (float)Math.toDegrees(this.values[1]);
      float f3 = -(float)Math.toDegrees(this.values[2]);
      if (Math.abs(f1 - this.lastAzimuth) > 20.0F)
        this.azimuthQueue.clear();
      this.lastAzimuth = f1;
      if (Math.abs(f2 - this.lastPitch) > 20.0F)
        this.pitchQueue.clear();
      this.lastPitch = f2;
      if (Math.abs(f3 - this.lastRoll) > 20.0F)
        this.rollQueue.clear();
      this.lastRoll = f3;
      this.azimuthQueue.offer(Float.valueOf(f1));
      this.pitchQueue.offer(Float.valueOf(f2));
      this.rollQueue.offer(Float.valueOf(f3));
      if (this.azimuthQueue.size() > this.ANGLE_QUEUE_MAX_SIZE)
        this.azimuthQueue.poll();
    }
    while (this.pitchQueue.size() > this.ANGLE_QUEUE_MAX_SIZE)
      this.pitchQueue.poll();
    while (this.rollQueue.size() > this.ANGLE_QUEUE_MAX_SIZE)
      this.rollQueue.poll();
    paramArrayOfFloat[2] = 0.0F;
    paramArrayOfFloat[1] = 0.0F;
    paramArrayOfFloat[0] = 0.0F;
    Object localObject2 = this.azimuthQueue.iterator();
    while (((Iterator)localObject2).hasNext())
    {
      localObject3 = (Float)((Iterator)localObject2).next();
      f2 = paramArrayOfFloat[0];
      paramArrayOfFloat[0] = (((Float)localObject3).floatValue() + f2);
    }
    Object localObject3 = this.pitchQueue.iterator();
    while (((Iterator)localObject3).hasNext())
    {
      localObject2 = (Float)((Iterator)localObject3).next();
      f2 = paramArrayOfFloat[1];
      paramArrayOfFloat[1] = (((Float)localObject2).floatValue() + f2);
    }
    localObject3 = this.rollQueue.iterator();
    while (((Iterator)localObject3).hasNext())
    {
      localObject2 = (Float)((Iterator)localObject3).next();
      f2 = paramArrayOfFloat[2];
      paramArrayOfFloat[2] = (((Float)localObject2).floatValue() + f2);
    }
    paramArrayOfFloat[0] /= this.azimuthQueue.size();
    paramArrayOfFloat[1] /= this.pitchQueue.size();
    paramArrayOfFloat[2] /= this.rollQueue.size();
    AppMethodBeat.o(81682);
  }

  public void onSensorChanged(SensorEvent paramSensorEvent)
  {
    AppMethodBeat.i(81681);
    if (paramSensorEvent.sensor.getType() == 2)
      this.geomagnetic = paramSensorEvent.values;
    if (paramSensorEvent.sensor.getType() == 1)
      this.gravity = paramSensorEvent.values;
    AppMethodBeat.o(81681);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.ar.sensor.orientationProvider.SimpleOrientationSensorProvider
 * JD-Core Version:    0.6.2
 */