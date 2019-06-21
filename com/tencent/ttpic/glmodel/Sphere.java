package com.tencent.ttpic.glmodel;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.ttpic.baseutils.BitmapUtils;
import com.tencent.ttpic.util.Maths;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.List;
import javax.microedition.khronos.opengles.GL10;

public class Sphere
{
  private static final int AMOUNT_OF_NUMBERS_PER_TEXTURE_POINT = 2;
  private static final int AMOUNT_OF_NUMBERS_PER_VERTEX_POINT = 3;
  private static final int MAXIMUM_ALLOWED_DEPTH = 5;
  private static final int NUM_FLOATS_PER_TEXTURE = 2;
  private static final int NUM_FLOATS_PER_VERTEX = 3;
  private static final int PER_FLOAT_BYTE = 4;
  private static final int VERTEX_MAGIC_NUMBER = 5;
  private final List<FloatBuffer> mColorBuffer;
  private final List<float[]> mColors;
  private final List<FloatBuffer> mTextureBuffer;
  private final int[] mTextures;
  private final int mTotalNumStrips;
  private final List<FloatBuffer> mVertexBuffer;
  private final List<float[]> mVertices;

  public Sphere(int paramInt, float paramFloat)
  {
    AppMethodBeat.i(83268);
    this.mVertexBuffer = new ArrayList();
    this.mColors = new ArrayList();
    this.mColorBuffer = new ArrayList();
    this.mVertices = new ArrayList();
    this.mTextureBuffer = new ArrayList();
    this.mTextures = new int[1];
    paramInt = Math.max(1, Math.min(5, paramInt));
    this.mTotalNumStrips = (Maths.power(2, paramInt - 1) * 5);
    int i = Maths.power(2, paramInt) * 3;
    double d1 = 2.094395102393195D / Maths.power(2, paramInt);
    double d2 = 6.283185307179586D / this.mTotalNumStrips;
    ArrayList localArrayList = new ArrayList();
    for (paramInt = 0; paramInt < this.mTotalNumStrips; paramInt++)
    {
      Object localObject = new float[i * 3];
      float[] arrayOfFloat1 = new float[i * 2];
      float[] arrayOfFloat2 = new float[i * 3];
      int j = 0;
      int k = 0;
      double d3 = 1.570796326794897D;
      double d4 = paramInt * d2;
      for (int m = 0; m < i; m += 2)
      {
        double d5 = paramFloat;
        double d6 = Math.sin(d3);
        double d7 = paramFloat * Math.cos(d3);
        double d8 = Math.sin(d4);
        double d9 = Math.cos(d4);
        arrayOfFloat2[j] = (1.0F / this.mTotalNumStrips * paramInt);
        int n = j + 1;
        localObject[j] = ((float)(d7 * d9));
        arrayOfFloat2[n] = (1.0F / this.mTotalNumStrips * paramInt);
        int i1 = n + 1;
        localObject[n] = ((float)(d5 * d6));
        arrayOfFloat2[i1] = (1.0F / this.mTotalNumStrips * paramInt);
        j = i1 + 1;
        localObject[i1] = ((float)(d8 * d7));
        n = k + 1;
        arrayOfFloat1[k] = ((float)(1.0D - d4 / 6.283185307179586D));
        k = n + 1;
        arrayOfFloat1[n] = ((float)(1.0D - (1.570796326794897D + d3) / 3.141592653589793D));
        d3 -= d1;
        d5 = d4 - d2 / 2.0D;
        d4 = paramFloat;
        d6 = Math.sin(d3);
        d8 = paramFloat * Math.cos(d3);
        d7 = Math.sin(d5);
        d9 = Math.cos(d5);
        arrayOfFloat2[j] = (1.0F / this.mTotalNumStrips * paramInt);
        n = j + 1;
        localObject[j] = ((float)(d8 * d9));
        arrayOfFloat2[n] = (1.0F / this.mTotalNumStrips * paramInt);
        i1 = n + 1;
        localObject[n] = ((float)(d4 * d6));
        arrayOfFloat2[i1] = (1.0F / this.mTotalNumStrips * paramInt);
        j = i1 + 1;
        localObject[i1] = ((float)(d7 * d8));
        n = k + 1;
        arrayOfFloat1[k] = ((float)(1.0D - d5 / 6.283185307179586D));
        k = n + 1;
        arrayOfFloat1[n] = ((float)(1.0D - (1.570796326794897D + d3) / 3.141592653589793D));
        d4 = d5 + d2;
      }
      this.mVertices.add(localObject);
      this.mColors.add(arrayOfFloat2);
      localArrayList.add(arrayOfFloat1);
      localObject = ByteBuffer.allocateDirect(i * 3 * 32);
      ((ByteBuffer)localObject).order(ByteOrder.nativeOrder());
      localObject = ((ByteBuffer)localObject).asFloatBuffer();
      ((FloatBuffer)localObject).put((float[])this.mVertices.get(paramInt));
      ((FloatBuffer)localObject).position(0);
      this.mVertexBuffer.add(localObject);
      localObject = ByteBuffer.allocateDirect(i * 3 * 32);
      ((ByteBuffer)localObject).order(ByteOrder.nativeOrder());
      localObject = ((ByteBuffer)localObject).asFloatBuffer();
      ((FloatBuffer)localObject).put((float[])this.mColors.get(paramInt));
      ((FloatBuffer)localObject).position(0);
      this.mColorBuffer.add(localObject);
      localObject = ByteBuffer.allocateDirect(i * 2 * 32);
      ((ByteBuffer)localObject).order(ByteOrder.nativeOrder());
      localObject = ((ByteBuffer)localObject).asFloatBuffer();
      ((FloatBuffer)localObject).put((float[])localArrayList.get(paramInt));
      ((FloatBuffer)localObject).position(0);
      this.mTextureBuffer.add(localObject);
    }
    AppMethodBeat.o(83268);
  }

  public void draw(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(83271);
    GLES20.glActiveTexture(33984);
    GLES20.glBindTexture(3553, this.mTextures[0]);
    GLES20.glTexParameterf(3553, 10241, 9729.0F);
    GLES20.glTexParameterf(3553, 10240, 9729.0F);
    GLES20.glTexParameterf(3553, 10242, 33071.0F);
    GLES20.glTexParameterf(3553, 10243, 33071.0F);
    GLES20.glUniform1i(paramInt4, 0);
    GLES20.glEnableVertexAttribArray(paramInt1);
    GLES20.glEnableVertexAttribArray(paramInt2);
    GLES20.glFrontFace(2304);
    for (paramInt4 = 0; paramInt4 < this.mTotalNumStrips; paramInt4++)
    {
      GLES20.glVertexAttribPointer(paramInt1, 3, 5126, false, 12, (Buffer)this.mVertexBuffer.get(paramInt4));
      GLES20.glVertexAttribPointer(paramInt3, 2, 5126, false, 8, (Buffer)this.mColorBuffer.get(paramInt4));
      GLES20.glVertexAttribPointer(paramInt2, 2, 5126, false, 8, (Buffer)this.mTextureBuffer.get(paramInt4));
      GLES20.glDrawArrays(5, 0, ((float[])this.mVertices.get(paramInt4)).length / 3);
    }
    GLES20.glFinish();
    AppMethodBeat.o(83271);
  }

  public void draw(GL10 paramGL10)
  {
    AppMethodBeat.i(83269);
    paramGL10.glBindTexture(3553, this.mTextures[0]);
    paramGL10.glEnableClientState(32884);
    paramGL10.glEnableClientState(32888);
    paramGL10.glFrontFace(2304);
    for (int i = 0; i < this.mTotalNumStrips; i++)
    {
      paramGL10.glVertexPointer(3, 5126, 0, (Buffer)this.mVertexBuffer.get(i));
      paramGL10.glTexCoordPointer(2, 5126, 0, (Buffer)this.mTextureBuffer.get(i));
      paramGL10.glDrawArrays(5, 0, ((float[])this.mVertices.get(i)).length / 3);
    }
    paramGL10.glDisableClientState(32884);
    paramGL10.glDisableClientState(32888);
    AppMethodBeat.o(83269);
  }

  public void loadGLTexture(Bitmap paramBitmap)
  {
    AppMethodBeat.i(83270);
    if (this.mTextures[0] <= 0)
      GLES20.glGenTextures(1, this.mTextures, 0);
    if (BitmapUtils.isLegal(paramBitmap))
    {
      GLES20.glBindTexture(3553, this.mTextures[0]);
      GLES20.glTexParameterf(3553, 10241, 9728.0F);
      GLES20.glTexParameterf(3553, 10240, 9729.0F);
      GLUtils.texImage2D(3553, 0, paramBitmap, 0);
    }
    AppMethodBeat.o(83270);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.glmodel.Sphere
 * JD-Core Version:    0.6.2
 */