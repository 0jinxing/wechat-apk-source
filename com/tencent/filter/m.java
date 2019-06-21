package com.tencent.filter;

import android.opengl.GLES20;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.view.g;

public abstract class m
{
  public int handle;
  public String name;

  public m(String paramString)
  {
    this.name = paramString;
    this.handle = -1;
  }

  public void clear()
  {
    this.handle = -1;
  }

  public void initialParams(int paramInt)
  {
    this.handle = GLES20.glGetUniformLocation(paramInt, this.name);
  }

  public abstract void setParams(int paramInt);

  public String toString()
  {
    return this.name;
  }

  public static final class a extends m
  {
    float[] bMQ;

    public a(String paramString, float[] paramArrayOfFloat)
    {
      super();
      AppMethodBeat.i(86387);
      this.bMQ = new float[paramArrayOfFloat.length];
      for (int i = 0; i < paramArrayOfFloat.length; i++)
        this.bMQ[i] = paramArrayOfFloat[i];
      AppMethodBeat.o(86387);
    }

    public final void setParams(int paramInt)
    {
      AppMethodBeat.i(86388);
      if (this.handle < 0)
        AppMethodBeat.o(86388);
      while (true)
      {
        return;
        GLES20.glUniform1fv(this.handle, this.bMQ.length, this.bMQ, 0);
        g.checkGlError("FloatParam setParams");
        AppMethodBeat.o(86388);
      }
    }

    public final String toString()
    {
      AppMethodBeat.i(86389);
      String str = this.name + "=" + this.bMQ;
      AppMethodBeat.o(86389);
      return str;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.filter.m
 * JD-Core Version:    0.6.2
 */