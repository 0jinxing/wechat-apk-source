package com.tencent.map.lib.gl.model;

import android.opengl.Matrix;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class e
{
  public float a;
  public float b;
  public float c;
  public float d = 1.0F;

  public e()
  {
  }

  public e(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    this.a = paramFloat1;
    this.b = paramFloat2;
    this.c = paramFloat3;
  }

  public e a(float[] paramArrayOfFloat)
  {
    AppMethodBeat.i(98156);
    float[] arrayOfFloat = new float[4];
    Matrix.multiplyMV(arrayOfFloat, 0, paramArrayOfFloat, 0, new float[] { this.a, this.b, this.c, this.d }, 0);
    paramArrayOfFloat = new e(arrayOfFloat[0] / arrayOfFloat[3], arrayOfFloat[1] / arrayOfFloat[3], arrayOfFloat[2] / arrayOfFloat[3]);
    AppMethodBeat.o(98156);
    return paramArrayOfFloat;
  }

  public boolean equals(Object paramObject)
  {
    boolean bool1 = false;
    boolean bool2 = bool1;
    if (paramObject != null)
    {
      if ((paramObject instanceof e))
        break label19;
      bool2 = bool1;
    }
    while (true)
    {
      return bool2;
      label19: paramObject = (e)paramObject;
      bool2 = bool1;
      if (this.a == paramObject.a)
      {
        bool2 = bool1;
        if (this.b == paramObject.b)
        {
          bool2 = bool1;
          if (this.c == paramObject.c)
            bool2 = true;
        }
      }
    }
  }

  public String toString()
  {
    AppMethodBeat.i(98157);
    String str = this.a + "," + this.b + "," + this.c;
    AppMethodBeat.o(98157);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.map.lib.gl.model.e
 * JD-Core Version:    0.6.2
 */