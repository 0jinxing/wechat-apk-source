package com.tencent.map.lib.gl.model;

import android.opengl.Matrix;
import com.tencent.map.lib.gl.a;
import com.tencent.tencentmap.mapsdk.maps.a.hd;
import com.tencent.tencentmap.mapsdk.maps.a.he;
import java.nio.FloatBuffer;
import java.nio.ShortBuffer;
import javax.microedition.khronos.opengles.GL10;

public abstract class b
{
  protected static final int TEXTURE_NOT_EXIST = 0;
  private short[] mIndices;
  private ShortBuffer mIndicesBuffer;
  protected float[] mModelMatrix = new float[16];
  private FloatBuffer mTextureBuffer;
  protected f mVertexList;
  private FloatBuffer mVerticesBuffer;

  public b()
  {
    Matrix.setIdentityM(this.mModelMatrix, 0);
  }

  public void drawMesh(GL10 paramGL10, float[] paramArrayOfFloat1, float[] paramArrayOfFloat2)
  {
    paramGL10.glVertexPointer(3, 5126, 0, this.mVerticesBuffer);
    paramGL10.glColor4f(paramArrayOfFloat1[0], paramArrayOfFloat1[1], paramArrayOfFloat1[2], paramArrayOfFloat1[3]);
    paramGL10.glDrawElements(4, this.mIndicesBuffer.capacity(), 5123, this.mIndicesBuffer);
    paramGL10.glColor4f(paramArrayOfFloat2[0], paramArrayOfFloat2[1], paramArrayOfFloat2[2], paramArrayOfFloat2[3]);
    paramGL10.glDrawElements(1, this.mIndicesBuffer.capacity(), 5123, this.mIndicesBuffer);
  }

  public final void drawWithTexture(GL10 paramGL10, int paramInt)
  {
    try
    {
      drawWithTextureImpl(paramGL10, paramInt, 3);
      return;
    }
    finally
    {
      paramGL10 = finally;
    }
    throw paramGL10;
  }

  protected final void drawWithTextureImpl(GL10 paramGL10, int paramInt1, int paramInt2)
  {
    while (true)
    {
      try
      {
        if (this.mVerticesBuffer != null)
        {
          ShortBuffer localShortBuffer = this.mIndicesBuffer;
          if (localShortBuffer != null);
        }
        else
        {
          return;
        }
        paramGL10.glVertexPointer(paramInt2, 5126, 0, this.mVerticesBuffer);
        if (paramInt1 != 0)
        {
          paramGL10.glEnable(3553);
          paramGL10.glTexCoordPointer(2, 5126, 0, this.mTextureBuffer);
          paramGL10.glBindTexture(3553, paramInt1);
          paramGL10.glDrawElements(4, this.mIndicesBuffer.capacity(), 5123, this.mIndicesBuffer);
          paramGL10.glDisable(3553);
          continue;
        }
      }
      finally
      {
      }
      paramGL10.glDrawElements(4, this.mIndicesBuffer.capacity(), 5123, this.mIndicesBuffer);
    }
  }

  protected boolean isVisibility(float[] paramArrayOfFloat1, float[] paramArrayOfFloat2)
  {
    return he.a(he.a(paramArrayOfFloat1, paramArrayOfFloat2), this.mVertexList.a());
  }

  protected boolean isVisibility(float[][] paramArrayOfFloat)
  {
    return he.a(paramArrayOfFloat, this.mVertexList.a());
  }

  protected void loadIdentity(GL10 paramGL10)
  {
    paramGL10.glLoadIdentity();
    Matrix.setIdentityM(this.mModelMatrix, 0);
  }

  protected void rotatef(GL10 paramGL10, float paramFloat, int paramInt1, int paramInt2, int paramInt3)
  {
    paramGL10.glRotatef(paramFloat, paramInt1, paramInt2, paramInt3);
    Matrix.rotateM(this.mModelMatrix, 0, paramFloat, paramInt1, paramInt2, paramInt3);
  }

  protected void scalef(GL10 paramGL10, float paramFloat1, float paramFloat2, float paramFloat3)
  {
    paramGL10.glScalef(paramFloat1, paramFloat2, paramFloat3);
    Matrix.scaleM(this.mModelMatrix, 0, paramFloat1, paramFloat2, paramFloat3);
  }

  protected void setIndices(short[] paramArrayOfShort)
  {
    try
    {
      this.mIndices = paramArrayOfShort;
      this.mIndicesBuffer = a.a(paramArrayOfShort, this.mIndicesBuffer);
      return;
    }
    finally
    {
      paramArrayOfShort = finally;
    }
    throw paramArrayOfShort;
  }

  protected void setIndicesBuffer(ShortBuffer paramShortBuffer)
  {
    try
    {
      this.mIndicesBuffer = paramShortBuffer;
      return;
    }
    finally
    {
      paramShortBuffer = finally;
    }
    throw paramShortBuffer;
  }

  protected void setTextureBuffer(FloatBuffer paramFloatBuffer)
  {
    try
    {
      this.mTextureBuffer = paramFloatBuffer;
      return;
    }
    finally
    {
      paramFloatBuffer = finally;
    }
    throw paramFloatBuffer;
  }

  protected void setTextureCoordinates(float[] paramArrayOfFloat)
  {
    try
    {
      this.mTextureBuffer = a.a(paramArrayOfFloat, this.mTextureBuffer);
      return;
    }
    finally
    {
      paramArrayOfFloat = finally;
    }
    throw paramArrayOfFloat;
  }

  protected void setVertices(float[] paramArrayOfFloat)
  {
    try
    {
      Object localObject = new com/tencent/map/lib/gl/model/f;
      ((f)localObject).<init>();
      this.mVertexList = ((f)localObject);
      int i = 0;
      while (i < paramArrayOfFloat.length)
      {
        int j = i + 1;
        float f1 = paramArrayOfFloat[i];
        int k = j + 1;
        float f2 = paramArrayOfFloat[j];
        i = k + 1;
        float f3 = paramArrayOfFloat[k];
        localObject = new com/tencent/map/lib/gl/model/e;
        ((e)localObject).<init>(f1, f2, f3);
        this.mVertexList.a((e)localObject);
      }
    }
    finally
    {
    }
    this.mVerticesBuffer = a.a(paramArrayOfFloat, this.mVerticesBuffer);
  }

  protected void setVerticesBuffer(FloatBuffer paramFloatBuffer)
  {
    try
    {
      Object localObject = new com/tencent/map/lib/gl/model/f;
      ((f)localObject).<init>();
      this.mVertexList = ((f)localObject);
      int i = 0;
      while (i < paramFloatBuffer.limit())
      {
        int j = i + 1;
        float f1 = paramFloatBuffer.get(i);
        i = j + 1;
        float f2 = paramFloatBuffer.get(j);
        localObject = new com/tencent/map/lib/gl/model/e;
        ((e)localObject).<init>(f1, f2, 0.0F);
        this.mVertexList.a((e)localObject);
      }
    }
    finally
    {
    }
    this.mVerticesBuffer = paramFloatBuffer;
  }

  public boolean testHint(float paramFloat1, float paramFloat2, float[] paramArrayOfFloat1, float[] paramArrayOfFloat2, int[] paramArrayOfInt)
  {
    boolean bool1 = false;
    for (int i = 0; ; i++)
    {
      boolean bool2 = bool1;
      e locale1;
      e locale2;
      e locale3;
      if (i < this.mIndices.length / 3)
      {
        int j = i * 3;
        int k = this.mIndices[j];
        int m = this.mIndices[(j + 1)];
        j = this.mIndices[(j + 2)];
        locale1 = this.mVertexList.a(k).a(paramArrayOfFloat1);
        locale2 = this.mVertexList.a(m).a(paramArrayOfFloat1);
        locale3 = this.mVertexList.a(j).a(paramArrayOfFloat1);
        if ((locale1.c <= 0.0F) || (locale2.c <= 0.0F) || (locale3.c <= 0.0F))
          break label141;
      }
      for (bool2 = bool1; ; bool2 = true)
      {
        return bool2;
        label141: if (!hd.a(paramFloat1, paramFloat2, new c(locale1, locale2, locale3).a(), paramArrayOfFloat2, paramArrayOfInt))
          break;
      }
    }
  }

  protected void translatef(GL10 paramGL10, float paramFloat1, float paramFloat2, float paramFloat3)
  {
    paramGL10.glTranslatef(paramFloat1, paramFloat2, paramFloat3);
    Matrix.translateM(this.mModelMatrix, 0, paramFloat1, paramFloat2, paramFloat3);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.map.lib.gl.model.b
 * JD-Core Version:    0.6.2
 */