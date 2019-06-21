package com.tencent.ttpic.ar.sensor.representation;

import com.tencent.matrix.trace.core.AppMethodBeat;

public class Quaternion extends Vector4f
{
  private boolean dirty;
  private MatrixF4x4 matrix;
  private Quaternion tmpQuaternion;
  private Vector4f tmpVector;

  public Quaternion()
  {
    AppMethodBeat.i(81705);
    this.dirty = false;
    this.tmpVector = new Vector4f();
    this.matrix = new MatrixF4x4();
    loadIdentityQuat();
    AppMethodBeat.o(81705);
  }

  private void convertQuatToMatrix()
  {
    AppMethodBeat.i(81715);
    float f1 = this.points[0];
    float f2 = this.points[1];
    float f3 = this.points[2];
    float f4 = this.points[3];
    this.matrix.setX0(1.0F - f2 * f2 * 2.0F - f3 * f3 * 2.0F);
    this.matrix.setX1(f1 * f2 * 2.0F + f4 * f3 * 2.0F);
    this.matrix.setX2(f1 * f3 * 2.0F - f4 * f2 * 2.0F);
    this.matrix.setX3(0.0F);
    this.matrix.setY0(f1 * f2 * 2.0F - f4 * f3 * 2.0F);
    this.matrix.setY1(1.0F - f1 * f1 * 2.0F - f3 * f3 * 2.0F);
    this.matrix.setY2(f2 * f3 * 2.0F + f4 * f1 * 2.0F);
    this.matrix.setY3(0.0F);
    this.matrix.setZ0(f1 * f3 * 2.0F + f4 * f2 * 2.0F);
    this.matrix.setZ1(f3 * f2 * 2.0F - f4 * f1 * 2.0F);
    this.matrix.setZ2(1.0F - f1 * f1 * 2.0F - f2 * f2 * 2.0F);
    this.matrix.setZ3(0.0F);
    this.matrix.setW0(0.0F);
    this.matrix.setW1(0.0F);
    this.matrix.setW2(0.0F);
    this.matrix.setW3(1.0F);
    AppMethodBeat.o(81715);
  }

  private void generateQuaternionFromMatrix()
  {
    AppMethodBeat.i(81720);
    float[] arrayOfFloat = this.matrix.getMatrix();
    int[] arrayOfInt;
    int i;
    int j;
    int k;
    int m;
    int n;
    int i1;
    int i2;
    int i3;
    int i4;
    float f1;
    float f2;
    float f3;
    float f4;
    if (this.matrix.size() == 16)
      if (this.matrix.isColumnMajor())
      {
        arrayOfInt = MatrixF4x4.matIndCol16_3x3;
        i = arrayOfInt[0];
        j = arrayOfInt[1];
        k = arrayOfInt[2];
        m = arrayOfInt[3];
        n = arrayOfInt[4];
        i1 = arrayOfInt[5];
        i2 = arrayOfInt[6];
        i3 = arrayOfInt[7];
        i4 = arrayOfInt[8];
        f1 = arrayOfFloat[i] + arrayOfFloat[n] + arrayOfFloat[i4];
        if (f1 <= 0.0F)
          break label231;
        f2 = (float)Math.sqrt(f1 + 1.0D) * 2.0F;
        f1 = 0.25F * f2;
        f3 = (arrayOfFloat[i3] - arrayOfFloat[i1]) / f2;
        f4 = (arrayOfFloat[k] - arrayOfFloat[i2]) / f2;
        f2 = (arrayOfFloat[m] - arrayOfFloat[j]) / f2;
      }
    while (true)
    {
      setX(f3);
      setY(f4);
      setZ(f2);
      setW(f1);
      AppMethodBeat.o(81720);
      return;
      arrayOfInt = MatrixF4x4.matIndRow16_3x3;
      break;
      if (this.matrix.isColumnMajor())
      {
        arrayOfInt = MatrixF4x4.matIndCol9_3x3;
        break;
      }
      arrayOfInt = MatrixF4x4.matIndRow9_3x3;
      break;
      label231: int i5;
      if (arrayOfFloat[i] > arrayOfFloat[n])
      {
        i5 = 1;
        label245: if (arrayOfFloat[i] <= arrayOfFloat[i4])
          break label355;
      }
      float f5;
      label355: for (int i6 = 1; ; i6 = 0)
      {
        if ((i5 & i6) == 0)
          break label361;
        f5 = (float)Math.sqrt(1.0D + arrayOfFloat[i] - arrayOfFloat[n] - arrayOfFloat[i4]) * 2.0F;
        f1 = (arrayOfFloat[i3] - arrayOfFloat[i1]) / f5;
        f3 = 0.25F * f5;
        f4 = (arrayOfFloat[j] + arrayOfFloat[m]) / f5;
        f2 = arrayOfFloat[k];
        f2 = (arrayOfFloat[i2] + f2) / f5;
        break;
        i5 = 0;
        break label245;
      }
      label361: if (arrayOfFloat[n] > arrayOfFloat[i4])
      {
        f5 = (float)Math.sqrt(1.0D + arrayOfFloat[n] - arrayOfFloat[i] - arrayOfFloat[i4]) * 2.0F;
        f1 = (arrayOfFloat[k] - arrayOfFloat[i2]) / f5;
        f3 = (arrayOfFloat[j] + arrayOfFloat[m]) / f5;
        f4 = 0.25F * f5;
        f2 = arrayOfFloat[i1];
        f2 = (arrayOfFloat[i3] + f2) / f5;
      }
      else
      {
        f2 = (float)Math.sqrt(1.0D + arrayOfFloat[i4] - arrayOfFloat[i] - arrayOfFloat[n]) * 2.0F;
        f1 = (arrayOfFloat[m] - arrayOfFloat[j]) / f2;
        f3 = (arrayOfFloat[k] + arrayOfFloat[i2]) / f2;
        f4 = (arrayOfFloat[i1] + arrayOfFloat[i3]) / f2;
        f2 = 0.25F * f2;
      }
    }
  }

  public void addQuat(Quaternion paramQuaternion)
  {
    AppMethodBeat.i(81711);
    this.dirty = true;
    addQuat(paramQuaternion, this);
    AppMethodBeat.o(81711);
  }

  public void addQuat(Quaternion paramQuaternion1, Quaternion paramQuaternion2)
  {
    AppMethodBeat.i(81712);
    paramQuaternion2.setX(getX() + paramQuaternion1.getX());
    paramQuaternion2.setY(getY() + paramQuaternion1.getY());
    paramQuaternion2.setZ(getZ() + paramQuaternion1.getZ());
    paramQuaternion2.setW(getW() + paramQuaternion1.getW());
    AppMethodBeat.o(81712);
  }

  public void copyFromVec3(Vector3f paramVector3f, float paramFloat)
  {
    AppMethodBeat.i(81727);
    copyFromV3f(paramVector3f, paramFloat);
    AppMethodBeat.o(81727);
  }

  public MatrixF4x4 getMatrix4x4()
  {
    AppMethodBeat.i(81726);
    if (this.dirty)
    {
      convertQuatToMatrix();
      this.dirty = false;
    }
    MatrixF4x4 localMatrixF4x4 = this.matrix;
    AppMethodBeat.o(81726);
    return localMatrixF4x4;
  }

  public void loadIdentityQuat()
  {
    AppMethodBeat.i(81718);
    this.dirty = true;
    setX(0.0F);
    setY(0.0F);
    setZ(0.0F);
    setW(1.0F);
    AppMethodBeat.o(81718);
  }

  public void multiplyByQuat(Quaternion paramQuaternion)
  {
    AppMethodBeat.i(81709);
    this.dirty = true;
    if (this.tmpQuaternion == null)
      this.tmpQuaternion = new Quaternion();
    this.tmpQuaternion.copyVec4(this);
    multiplyByQuat(paramQuaternion, this.tmpQuaternion);
    copyVec4(this.tmpQuaternion);
    AppMethodBeat.o(81709);
  }

  public void multiplyByQuat(Quaternion paramQuaternion1, Quaternion paramQuaternion2)
  {
    if (paramQuaternion1 != paramQuaternion2)
    {
      paramQuaternion2.points[3] = (this.points[3] * paramQuaternion1.points[3] - this.points[0] * paramQuaternion1.points[0] - this.points[1] * paramQuaternion1.points[1] - this.points[2] * paramQuaternion1.points[2]);
      paramQuaternion2.points[0] = (this.points[3] * paramQuaternion1.points[0] + this.points[0] * paramQuaternion1.points[3] + this.points[1] * paramQuaternion1.points[2] - this.points[2] * paramQuaternion1.points[1]);
      paramQuaternion2.points[1] = (this.points[3] * paramQuaternion1.points[1] + this.points[1] * paramQuaternion1.points[3] + this.points[2] * paramQuaternion1.points[0] - this.points[0] * paramQuaternion1.points[2]);
      paramQuaternion2.points[2] = (this.points[3] * paramQuaternion1.points[2] + this.points[2] * paramQuaternion1.points[3] + this.points[0] * paramQuaternion1.points[1] - this.points[1] * paramQuaternion1.points[0]);
    }
    while (true)
    {
      return;
      this.tmpVector.points[0] = paramQuaternion1.points[0];
      this.tmpVector.points[1] = paramQuaternion1.points[1];
      this.tmpVector.points[2] = paramQuaternion1.points[2];
      this.tmpVector.points[3] = paramQuaternion1.points[3];
      paramQuaternion2.points[3] = (this.points[3] * this.tmpVector.points[3] - this.points[0] * this.tmpVector.points[0] - this.points[1] * this.tmpVector.points[1] - this.points[2] * this.tmpVector.points[2]);
      paramQuaternion2.points[0] = (this.points[3] * this.tmpVector.points[0] + this.points[0] * this.tmpVector.points[3] + this.points[1] * this.tmpVector.points[2] - this.points[2] * this.tmpVector.points[1]);
      paramQuaternion2.points[1] = (this.points[3] * this.tmpVector.points[1] + this.points[1] * this.tmpVector.points[3] + this.points[2] * this.tmpVector.points[0] - this.points[0] * this.tmpVector.points[2]);
      paramQuaternion2.points[2] = (this.points[3] * this.tmpVector.points[2] + this.points[2] * this.tmpVector.points[3] + this.points[0] * this.tmpVector.points[1] - this.points[1] * this.tmpVector.points[0]);
    }
  }

  public void multiplyByScalar(float paramFloat)
  {
    AppMethodBeat.i(81710);
    this.dirty = true;
    multiplyByScalar(paramFloat);
    AppMethodBeat.o(81710);
  }

  public void normalise()
  {
    AppMethodBeat.i(81706);
    this.dirty = true;
    float f = (float)Math.sqrt(this.points[3] * this.points[3] + this.points[0] * this.points[0] + this.points[1] * this.points[1] + this.points[2] * this.points[2]);
    this.points[3] /= f;
    this.points[0] /= f;
    this.points[1] /= f;
    this.points[2] /= f;
    AppMethodBeat.o(81706);
  }

  public void normalize()
  {
    AppMethodBeat.i(81707);
    normalise();
    AppMethodBeat.o(81707);
  }

  public void set(Quaternion paramQuaternion)
  {
    AppMethodBeat.i(81708);
    this.dirty = true;
    copyVec4(paramQuaternion);
    AppMethodBeat.o(81708);
  }

  public void setAxisAngle(Vector3f paramVector3f, float paramFloat)
  {
    AppMethodBeat.i(81724);
    double d = Math.sin(Math.toRadians(paramFloat / 2.0F));
    setX(paramVector3f.getX() * (float)d);
    setY(paramVector3f.getY() * (float)d);
    float f = paramVector3f.getZ();
    setZ((float)d * f);
    setW((float)Math.cos(Math.toRadians(paramFloat / 2.0F)));
    this.dirty = true;
    AppMethodBeat.o(81724);
  }

  public void setAxisAngleRad(Vector3f paramVector3f, double paramDouble)
  {
    AppMethodBeat.i(81725);
    double d = paramDouble / 2.0D;
    setX(paramVector3f.getX() * (float)d);
    setY(paramVector3f.getY() * (float)d);
    float f = paramVector3f.getZ();
    setZ((float)d * f);
    setW((float)paramDouble / 2.0F);
    this.dirty = true;
    AppMethodBeat.o(81725);
  }

  public void setColumnMajor(float[] paramArrayOfFloat)
  {
    AppMethodBeat.i(81721);
    this.matrix.setMatrix(paramArrayOfFloat);
    this.matrix.setColumnMajor(true);
    generateQuaternionFromMatrix();
    AppMethodBeat.o(81721);
  }

  public void setEulerAngle(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    AppMethodBeat.i(81723);
    double d1 = Math.toRadians(paramFloat3);
    double d2 = Math.toRadians(paramFloat2);
    double d3 = Math.toRadians(paramFloat1);
    double d4 = Math.cos(d1 / 2.0D);
    d1 = Math.sin(d1 / 2.0D);
    double d5 = Math.cos(d2 / 2.0D);
    double d6 = Math.sin(d2 / 2.0D);
    d2 = Math.cos(d3 / 2.0D);
    double d7 = Math.sin(d3 / 2.0D);
    double d8 = d4 * d5;
    d3 = d1 * d6;
    setW((float)(d8 * d2 - d3 * d7));
    setX((float)(d8 * d7 + d3 * d2));
    setY((float)(d1 * d5 * d2 + d4 * d6 * d7));
    setZ((float)(d6 * d4 * d2 - d1 * d5 * d7));
    this.dirty = true;
    AppMethodBeat.o(81723);
  }

  public void setRowMajor(float[] paramArrayOfFloat)
  {
    AppMethodBeat.i(81722);
    this.matrix.setMatrix(paramArrayOfFloat);
    this.matrix.setColumnMajor(false);
    generateQuaternionFromMatrix();
    AppMethodBeat.o(81722);
  }

  public void slerp(Quaternion paramQuaternion1, Quaternion paramQuaternion2, float paramFloat)
  {
    AppMethodBeat.i(81728);
    float f1 = dotProduct(paramQuaternion1);
    float f2 = f1;
    Quaternion localQuaternion = paramQuaternion1;
    if (f1 < 0.0F)
    {
      if (this.tmpQuaternion == null)
        this.tmpQuaternion = new Quaternion();
      localQuaternion = this.tmpQuaternion;
      f2 = -f1;
      localQuaternion.points[0] = (-paramQuaternion1.points[0]);
      localQuaternion.points[1] = (-paramQuaternion1.points[1]);
      localQuaternion.points[2] = (-paramQuaternion1.points[2]);
      localQuaternion.points[3] = (-paramQuaternion1.points[3]);
    }
    if (Math.abs(f2) >= 1.0D)
    {
      paramQuaternion2.points[0] = this.points[0];
      paramQuaternion2.points[1] = this.points[1];
      paramQuaternion2.points[2] = this.points[2];
      paramQuaternion2.points[3] = this.points[3];
      AppMethodBeat.o(81728);
    }
    while (true)
    {
      return;
      double d1 = Math.sqrt(1.0D - f2 * f2);
      double d2 = Math.acos(f2);
      double d3 = Math.sin((1.0F - paramFloat) * d2) / d1;
      d1 = Math.sin(d2 * paramFloat) / d1;
      paramQuaternion2.points[3] = ((float)(this.points[3] * d3 + localQuaternion.points[3] * d1));
      paramQuaternion2.points[0] = ((float)(this.points[0] * d3 + localQuaternion.points[0] * d1));
      paramQuaternion2.points[1] = ((float)(this.points[1] * d3 + localQuaternion.points[1] * d1));
      paramQuaternion1 = paramQuaternion2.points;
      d2 = this.points[2];
      paramQuaternion1[2] = ((float)(d1 * localQuaternion.points[2] + d3 * d2));
      AppMethodBeat.o(81728);
    }
  }

  public void subQuat(Quaternion paramQuaternion)
  {
    AppMethodBeat.i(81713);
    this.dirty = true;
    subQuat(paramQuaternion, this);
    AppMethodBeat.o(81713);
  }

  public void subQuat(Quaternion paramQuaternion1, Quaternion paramQuaternion2)
  {
    AppMethodBeat.i(81714);
    paramQuaternion2.setX(getX() - paramQuaternion1.getX());
    paramQuaternion2.setY(getY() - paramQuaternion1.getY());
    paramQuaternion2.setZ(getZ() - paramQuaternion1.getZ());
    paramQuaternion2.setW(getW() - paramQuaternion1.getW());
    AppMethodBeat.o(81714);
  }

  public void toAxisAngle(Vector4f paramVector4f)
  {
    AppMethodBeat.i(81716);
    if (getW() > 1.0F)
      normalise();
    float f1 = (float)Math.toDegrees(Math.acos(getW()));
    float f2 = (float)Math.sqrt(1.0F - getW() * getW());
    float f3;
    float f4;
    if (f2 < 0.001D)
    {
      f3 = this.points[0];
      f4 = this.points[1];
    }
    for (f2 = this.points[2]; ; f2 = this.points[2] / f2)
    {
      paramVector4f.points[0] = f3;
      paramVector4f.points[1] = f4;
      paramVector4f.points[2] = f2;
      paramVector4f.points[3] = (2.0F * f1);
      AppMethodBeat.o(81716);
      return;
      f3 = this.points[0] / f2;
      f4 = this.points[1] / f2;
    }
  }

  public double[] toEulerAngles()
  {
    AppMethodBeat.i(81717);
    double d1 = Math.atan2(this.points[1] * 2.0F * getW() - this.points[0] * 2.0F * this.points[2], 1.0F - this.points[1] * this.points[1] * 2.0F - this.points[2] * this.points[2] * 2.0F);
    double d2 = Math.asin(this.points[0] * 2.0F * this.points[1] + this.points[2] * 2.0F * getW());
    double d3 = Math.atan2(this.points[0] * 2.0F * getW() - this.points[1] * 2.0F * this.points[2], 1.0F - this.points[0] * this.points[0] * 2.0F - this.points[2] * this.points[2] * 2.0F);
    AppMethodBeat.o(81717);
    return new double[] { d1, d2, d3 };
  }

  public String toString()
  {
    AppMethodBeat.i(81719);
    String str = "{X: " + getX() + ", Y:" + getY() + ", Z:" + getZ() + ", W:" + getW() + "}";
    AppMethodBeat.o(81719);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.ar.sensor.representation.Quaternion
 * JD-Core Version:    0.6.2
 */