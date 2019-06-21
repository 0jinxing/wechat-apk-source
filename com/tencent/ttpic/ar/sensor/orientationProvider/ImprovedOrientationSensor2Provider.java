package com.tencent.ttpic.ar.sensor.orientationProvider;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorManager;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.ttpic.ar.sensor.representation.MatrixF4x4;
import com.tencent.ttpic.ar.sensor.representation.Quaternion;
import java.util.List;

public class ImprovedOrientationSensor2Provider extends OrientationProvider
{
  private static final double EPSILON = 0.1000000014901161D;
  private static final float INDIRECT_INTERPOLATION_WEIGHT = 0.01F;
  private static final float NS2S = 1.0E-009F;
  private static final float OUTLIER_PANIC_THRESHOLD = 0.75F;
  private static final float OUTLIER_THRESHOLD = 0.85F;
  private static final int PANIC_THRESHOLD = 60;
  private final Quaternion correctedQuaternion;
  private final Quaternion deltaQuaternion;
  private double gyroscopeRotationVelocity;
  private final Quaternion interpolatedQuaternion;
  private int panicCounter;
  private boolean positionInitialised;
  private Quaternion quaternionGyroscope;
  private Quaternion quaternionRotationVector;
  private final float[] temporaryQuaternion;
  private long timestamp;

  public ImprovedOrientationSensor2Provider(SensorManager paramSensorManager)
  {
    super(paramSensorManager);
    AppMethodBeat.i(81677);
    this.deltaQuaternion = new Quaternion();
    this.quaternionGyroscope = new Quaternion();
    this.quaternionRotationVector = new Quaternion();
    this.gyroscopeRotationVelocity = 0.0D;
    this.positionInitialised = false;
    this.temporaryQuaternion = new float[4];
    this.correctedQuaternion = new Quaternion();
    this.interpolatedQuaternion = new Quaternion();
    this.sensorList.add(paramSensorManager.getDefaultSensor(4));
    this.sensorList.add(paramSensorManager.getDefaultSensor(11));
    AppMethodBeat.o(81677);
  }

  private void setOrientationQuaternionAndMatrix(Quaternion paramQuaternion)
  {
    AppMethodBeat.i(81679);
    this.correctedQuaternion.set(paramQuaternion);
    this.correctedQuaternion.w(-this.correctedQuaternion.w());
    synchronized (this.synchronizationToken)
    {
      this.currentOrientationQuaternion.copyVec4(paramQuaternion);
      SensorManager.getRotationMatrixFromVector(this.currentOrientationRotationMatrix.matrix, this.correctedQuaternion.array());
      AppMethodBeat.o(81679);
      return;
    }
  }

  public void onSensorChanged(SensorEvent paramSensorEvent)
  {
    AppMethodBeat.i(81678);
    if (paramSensorEvent.sensor.getType() == 11)
    {
      SensorManager.getQuaternionFromVector(this.temporaryQuaternion, paramSensorEvent.values);
      this.quaternionRotationVector.setXYZW(this.temporaryQuaternion[1], this.temporaryQuaternion[2], this.temporaryQuaternion[3], -this.temporaryQuaternion[0]);
      if (!this.positionInitialised)
      {
        this.quaternionGyroscope.set(this.quaternionRotationVector);
        this.positionInitialised = true;
        AppMethodBeat.o(81678);
      }
    }
    else if (paramSensorEvent.sensor.getType() == 4)
    {
      if (this.timestamp != 0L)
      {
        float f1 = (float)(paramSensorEvent.timestamp - this.timestamp);
        float f2 = paramSensorEvent.values[0];
        float f3 = paramSensorEvent.values[1];
        float f4 = paramSensorEvent.values[2];
        this.gyroscopeRotationVelocity = Math.sqrt(f2 * f2 + f3 * f3 + f4 * f4);
        float f5 = f4;
        float f6 = f3;
        float f7 = f2;
        if (this.gyroscopeRotationVelocity > 0.1000000014901161D)
        {
          f7 = (float)(f2 / this.gyroscopeRotationVelocity);
          f6 = (float)(f3 / this.gyroscopeRotationVelocity);
          f5 = (float)(f4 / this.gyroscopeRotationVelocity);
        }
        double d1 = this.gyroscopeRotationVelocity * (f1 * 1.0E-009F) / 2.0D;
        double d2 = Math.sin(d1);
        d1 = Math.cos(d1);
        this.deltaQuaternion.setX((float)(f7 * d2));
        this.deltaQuaternion.setY((float)(f6 * d2));
        this.deltaQuaternion.setZ((float)(f5 * d2));
        this.deltaQuaternion.setW(-(float)d1);
        this.deltaQuaternion.multiplyByQuat(this.quaternionGyroscope, this.quaternionGyroscope);
        f7 = this.quaternionGyroscope.dotProduct(this.quaternionRotationVector);
        if (Math.abs(f7) >= 0.85F)
          break label431;
        if (Math.abs(f7) < 0.75F)
          this.panicCounter += 1;
        setOrientationQuaternionAndMatrix(this.quaternionGyroscope);
        label371: if (this.panicCounter > 60)
        {
          if (this.gyroscopeRotationVelocity >= 3.0D)
            break label482;
          setOrientationQuaternionAndMatrix(this.quaternionRotationVector);
          this.quaternionGyroscope.copyVec4(this.quaternionRotationVector);
          this.panicCounter = 0;
        }
      }
    }
    while (true)
    {
      this.timestamp = paramSensorEvent.timestamp;
      AppMethodBeat.o(81678);
      break;
      label431: this.quaternionGyroscope.slerp(this.quaternionRotationVector, this.interpolatedQuaternion, (float)(0.009999999776482582D * this.gyroscopeRotationVelocity));
      setOrientationQuaternionAndMatrix(this.interpolatedQuaternion);
      this.quaternionGyroscope.copyVec4(this.interpolatedQuaternion);
      this.panicCounter = 0;
      break label371;
      label482: String.format("Panic reset delayed due to ongoing motion (user is still shaking the device). Gyroscope Velocity: %.2f > 3", new Object[] { Double.valueOf(this.gyroscopeRotationVelocity) });
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.ar.sensor.orientationProvider.ImprovedOrientationSensor2Provider
 * JD-Core Version:    0.6.2
 */