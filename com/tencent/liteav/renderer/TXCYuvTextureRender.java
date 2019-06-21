package com.tencent.liteav.renderer;

import android.opengl.GLES20;
import android.opengl.Matrix;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.util.b;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.ShortBuffer;

public class TXCYuvTextureRender
{
  private static final int BYTES_PER_FLOAT = 4;
  private static final int INVALID_TEXTURE_ID = -12345;
  private static final int POSITION_COMPONENT_COUNT = 2;
  private static final String TAG;
  private static final int TEXTURE_COORDINATES_COMPONENT_COUNT = 2;
  private static final String mFragmentShaderCode = "precision mediump float;varying vec2 vTextureCoord;uniform sampler2D uTextureSampler0;uniform sampler2D uTextureSampler1;uniform sampler2D uTextureSampler2;const vec4 Coefficient0 = vec4(1.164383561643836, 1.164383561643836, 1.164383561643836, 1.0);const vec4 Coefficient1 = vec4(0.0000, -0.21324861427373, 2.112401785714286, 1.0);const vec4 Coefficient2 = vec4(1.792741071428571, -0.532909328559444, 0.0000, 1.0);const vec4 Coefficient3 = vec4(-0.972945075016308, 0.301482665475862, -1.133402217873451, 1.0);void main() {vec4 x,y,z,result;x  = texture2D(uTextureSampler0, vTextureCoord);y = texture2D(uTextureSampler1, vTextureCoord);z = texture2D(uTextureSampler2, vTextureCoord);result = x * Coefficient0 + Coefficient3;result = (y * Coefficient1) + result;result = (z * Coefficient2) + result;gl_FragColor = result;}";
  private static final String mVertexShaderCode = "uniform mat4 uMatrix;uniform mat4 uTextureMatrix;attribute vec2 aPosition;attribute vec2 aTextureCoord;varying vec2 vTextureCoord;void main() {vec4 pos  = vec4(aPosition, 0.0, 1.0);gl_Position = uMatrix * pos;vTextureCoord = (uTextureMatrix*vec4(aTextureCoord, 0.0, 0.0)).xy;}";
  private int mFrameBufferID;
  private int mFrameBufferTextureID;
  private int mHeight;
  private short[] mIndices;
  private ShortBuffer mIndicesBuffer;
  private int[] mLastTextureIds;
  private float[] mMVPMatrix;
  private boolean mNeedReLoadFrameBuffer;
  private int mPositionHandle;
  private int mProgram;
  private FloatBuffer mTextureBuffer;
  private float[] mTextureCoordinates;
  private int mTextureCoordinatesHandle;
  private int[] mTextureIds;
  private float[] mTextureMatrix;
  private int mTextureMatrixHandle;
  private int mTextureUnitHandle0;
  private int mTextureUnitHandle1;
  private int mTextureUnitHandle2;
  private FloatBuffer mVertexBuffer;
  private int mVertexMatrixHandle;
  private float[] mVerticesCoordinates;
  private int mVideoHeight;
  private int mVideoWidth;
  private int mWidth;

  static
  {
    AppMethodBeat.i(67350);
    TAG = TXCYuvTextureRender.class.getSimpleName();
    b.e();
    AppMethodBeat.o(67350);
  }

  public TXCYuvTextureRender()
  {
    AppMethodBeat.i(67340);
    this.mMVPMatrix = new float[16];
    this.mTextureMatrix = new float[16];
    this.mLastTextureIds = null;
    this.mNeedReLoadFrameBuffer = false;
    this.mFrameBufferTextureID = -12345;
    this.mFrameBufferID = -12345;
    this.mVideoWidth = 0;
    this.mVideoHeight = 0;
    this.mTextureCoordinates = new float[] { 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F };
    this.mIndices = new short[] { 0, 1, 2, 1, 3, 2 };
    this.mVerticesCoordinates = new float[] { -1.0F, -1.0F, 1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F };
    this.mTextureBuffer = ByteBuffer.allocateDirect(this.mTextureCoordinates.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
    this.mTextureBuffer.put(this.mTextureCoordinates);
    this.mTextureBuffer.position(0);
    this.mVertexBuffer = ByteBuffer.allocateDirect(this.mVerticesCoordinates.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
    this.mVertexBuffer.put(this.mVerticesCoordinates);
    this.mVertexBuffer.position(0);
    this.mIndicesBuffer = ByteBuffer.allocateDirect(this.mIndices.length * 2).order(ByteOrder.nativeOrder()).asShortBuffer();
    this.mIndicesBuffer.put(this.mIndices);
    this.mIndicesBuffer.position(0);
    AppMethodBeat.o(67340);
  }

  private void destroyFrameBuffer()
  {
    AppMethodBeat.i(67345);
    if (this.mFrameBufferID != -12345)
    {
      GLES20.glDeleteFramebuffers(1, new int[] { this.mFrameBufferID }, 0);
      this.mFrameBufferID = -12345;
    }
    if (this.mFrameBufferTextureID != -12345)
    {
      GLES20.glDeleteTextures(1, new int[] { this.mFrameBufferTextureID }, 0);
      this.mFrameBufferTextureID = -12345;
    }
    AppMethodBeat.o(67345);
  }

  private void loadTexture(long paramLong)
  {
    AppMethodBeat.i(67349);
    GLES20.glUniform1i(this.mTextureUnitHandle0, 0);
    checkError();
    GLES20.glUniform1i(this.mTextureUnitHandle1, 1);
    checkError();
    GLES20.glUniform1i(this.mTextureUnitHandle2, 2);
    checkError();
    nativeLoadTexture(paramLong, this.mTextureIds);
    AppMethodBeat.o(67349);
  }

  private native int nativeGetWidth(long paramLong);

  private native void nativeLoadTexture(long paramLong, int[] paramArrayOfInt);

  private void reloadFrameBuffer()
  {
    AppMethodBeat.i(67344);
    if (!this.mNeedReLoadFrameBuffer)
      AppMethodBeat.o(67344);
    while (true)
    {
      return;
      TXCLog.d(TAG, "reloadFrameBuffer. size = " + this.mWidth + "*" + this.mHeight);
      destroyFrameBuffer();
      int[] arrayOfInt1 = new int[1];
      int[] arrayOfInt2 = new int[1];
      GLES20.glGenTextures(1, arrayOfInt1, 0);
      GLES20.glGenFramebuffers(1, arrayOfInt2, 0);
      this.mFrameBufferTextureID = arrayOfInt1[0];
      this.mFrameBufferID = arrayOfInt2[0];
      TXCLog.d(TAG, "frameBuffer id = " + this.mFrameBufferID + ", texture id = " + this.mFrameBufferTextureID);
      GLES20.glBindTexture(3553, this.mFrameBufferTextureID);
      GLES20.glTexImage2D(3553, 0, 6408, this.mWidth, this.mHeight, 0, 6408, 5121, null);
      GLES20.glTexParameterf(3553, 10241, 9729.0F);
      GLES20.glTexParameterf(3553, 10240, 9729.0F);
      GLES20.glTexParameteri(3553, 10242, 33071);
      GLES20.glTexParameteri(3553, 10243, 33071);
      GLES20.glBindFramebuffer(36160, this.mFrameBufferID);
      GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.mFrameBufferTextureID, 0);
      GLES20.glBindTexture(3553, 0);
      GLES20.glBindFramebuffer(36160, 0);
      this.mNeedReLoadFrameBuffer = false;
      AppMethodBeat.o(67344);
    }
  }

  public int checkError()
  {
    AppMethodBeat.i(67348);
    int i = GLES20.glGetError();
    if (i != 0)
    {
      IllegalStateException localIllegalStateException = new IllegalStateException("gl error=".concat(String.valueOf(i)));
      AppMethodBeat.o(67348);
      throw localIllegalStateException;
    }
    AppMethodBeat.o(67348);
    return i;
  }

  public void clearLastFrame()
  {
    AppMethodBeat.i(67342);
    this.mLastTextureIds = null;
    TXCLog.i(TAG, "clearLastFrame");
    AppMethodBeat.o(67342);
  }

  public void createTexture()
  {
    AppMethodBeat.i(67341);
    int i = GLES20.glCreateShader(35633);
    checkError();
    GLES20.glShaderSource(i, "uniform mat4 uMatrix;uniform mat4 uTextureMatrix;attribute vec2 aPosition;attribute vec2 aTextureCoord;varying vec2 vTextureCoord;void main() {vec4 pos  = vec4(aPosition, 0.0, 1.0);gl_Position = uMatrix * pos;vTextureCoord = (uTextureMatrix*vec4(aTextureCoord, 0.0, 0.0)).xy;}");
    checkError();
    GLES20.glCompileShader(i);
    checkError();
    int j = GLES20.glCreateShader(35632);
    checkError();
    GLES20.glShaderSource(j, "precision mediump float;varying vec2 vTextureCoord;uniform sampler2D uTextureSampler0;uniform sampler2D uTextureSampler1;uniform sampler2D uTextureSampler2;const vec4 Coefficient0 = vec4(1.164383561643836, 1.164383561643836, 1.164383561643836, 1.0);const vec4 Coefficient1 = vec4(0.0000, -0.21324861427373, 2.112401785714286, 1.0);const vec4 Coefficient2 = vec4(1.792741071428571, -0.532909328559444, 0.0000, 1.0);const vec4 Coefficient3 = vec4(-0.972945075016308, 0.301482665475862, -1.133402217873451, 1.0);void main() {vec4 x,y,z,result;x  = texture2D(uTextureSampler0, vTextureCoord);y = texture2D(uTextureSampler1, vTextureCoord);z = texture2D(uTextureSampler2, vTextureCoord);result = x * Coefficient0 + Coefficient3;result = (y * Coefficient1) + result;result = (z * Coefficient2) + result;gl_FragColor = result;}");
    checkError();
    GLES20.glCompileShader(j);
    this.mProgram = GLES20.glCreateProgram();
    checkError();
    GLES20.glAttachShader(this.mProgram, i);
    checkError();
    GLES20.glAttachShader(this.mProgram, j);
    checkError();
    GLES20.glLinkProgram(this.mProgram);
    checkError();
    this.mVertexMatrixHandle = GLES20.glGetUniformLocation(this.mProgram, "uMatrix");
    checkError();
    this.mTextureMatrixHandle = GLES20.glGetUniformLocation(this.mProgram, "uTextureMatrix");
    checkError();
    this.mPositionHandle = GLES20.glGetAttribLocation(this.mProgram, "aPosition");
    checkError();
    this.mTextureCoordinatesHandle = GLES20.glGetAttribLocation(this.mProgram, "aTextureCoord");
    checkError();
    this.mTextureUnitHandle0 = GLES20.glGetUniformLocation(this.mProgram, "uTextureSampler0");
    checkError();
    this.mTextureUnitHandle1 = GLES20.glGetUniformLocation(this.mProgram, "uTextureSampler1");
    checkError();
    this.mTextureUnitHandle2 = GLES20.glGetUniformLocation(this.mProgram, "uTextureSampler2");
    checkError();
    this.mTextureIds = new int[3];
    GLES20.glGenTextures(3, this.mTextureIds, 0);
    checkError();
    AppMethodBeat.o(67341);
  }

  public void drawFrame(long paramLong)
  {
    AppMethodBeat.i(67347);
    GLES20.glClearColor(0.0F, 0.0F, 0.0F, 1.0F);
    GLES20.glClear(16640);
    Matrix.setIdentityM(this.mMVPMatrix, 0);
    Matrix.setIdentityM(this.mTextureMatrix, 0);
    int i = nativeGetWidth(paramLong);
    int j;
    if ((i > 0) && (i % 8 != 0))
    {
      j = (i + 7) / 8 * 8;
      if (j != 0)
        Matrix.scaleM(this.mTextureMatrix, 0, (i - 1) * 1.0F / j, 1.0F, 1.0F);
    }
    if (this.mVideoHeight % 8 != 0)
    {
      j = (this.mVideoHeight + 7) / 8 * 8;
      if (j != 0)
        Matrix.scaleM(this.mTextureMatrix, 0, 1.0F, (this.mVideoHeight - 1) * 1.0F / j, 1.0F);
    }
    GLES20.glUseProgram(this.mProgram);
    checkError();
    GLES20.glEnableVertexAttribArray(this.mPositionHandle);
    checkError();
    this.mVertexBuffer.position(0);
    GLES20.glVertexAttribPointer(this.mPositionHandle, 2, 5126, false, 8, this.mVertexBuffer);
    checkError();
    GLES20.glEnableVertexAttribArray(this.mTextureCoordinatesHandle);
    checkError();
    this.mTextureBuffer.position(0);
    GLES20.glVertexAttribPointer(this.mTextureCoordinatesHandle, 2, 5126, false, 8, this.mTextureBuffer);
    checkError();
    GLES20.glUniformMatrix4fv(this.mVertexMatrixHandle, 1, false, this.mMVPMatrix, 0);
    checkError();
    GLES20.glUniformMatrix4fv(this.mTextureMatrixHandle, 1, false, this.mTextureMatrix, 0);
    checkError();
    loadTexture(paramLong);
    GLES20.glDrawElements(4, this.mIndices.length, 5123, this.mIndicesBuffer);
    GLES20.glDisableVertexAttribArray(this.mPositionHandle);
    GLES20.glDisableVertexAttribArray(this.mTextureCoordinatesHandle);
    this.mLastTextureIds = this.mTextureIds;
    AppMethodBeat.o(67347);
  }

  public int drawToTexture(long paramLong)
  {
    int i = -12345;
    AppMethodBeat.i(67346);
    reloadFrameBuffer();
    if (this.mFrameBufferID == -12345)
    {
      TXCLog.d(TAG, "invalid frame buffer id");
      AppMethodBeat.o(67346);
    }
    while (true)
    {
      return i;
      GLES20.glBindFramebuffer(36160, this.mFrameBufferID);
      GLES20.glViewport(0, 0, this.mWidth, this.mHeight);
      drawFrame(paramLong);
      GLES20.glBindFramebuffer(36160, 0);
      i = this.mFrameBufferTextureID;
      AppMethodBeat.o(67346);
    }
  }

  public void onSurfaceDestroy()
  {
    AppMethodBeat.i(67343);
    if (this.mTextureIds != null)
    {
      GLES20.glDeleteTextures(3, this.mTextureIds, 0);
      this.mTextureIds = null;
    }
    destroyFrameBuffer();
    AppMethodBeat.o(67343);
  }

  public void setHasFrameBuffer(int paramInt1, int paramInt2)
  {
    this.mWidth = paramInt1;
    this.mHeight = paramInt2;
    this.mNeedReLoadFrameBuffer = true;
  }

  public void setVideoSize(int paramInt1, int paramInt2)
  {
    this.mVideoWidth = paramInt1;
    this.mVideoHeight = paramInt2;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.liteav.renderer.TXCYuvTextureRender
 * JD-Core Version:    0.6.2
 */