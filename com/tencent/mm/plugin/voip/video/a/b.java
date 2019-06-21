package com.tencent.mm.plugin.voip.video.a;

import android.opengl.GLES20;
import android.opengl.Matrix;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.voip.video.OpenGlRender;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.ttpic.util.BenchUtil;
import com.tencent.view.g;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

public final class b
{
  public static final float[] eZY = { -1.0F, -1.0F, 1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F };
  public static final float[] eZZ = { 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F };
  public static final float[] tbQ = { 1.0F, 0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.0F, 1.0F };
  public volatile boolean eNa;
  private boolean eYS;
  public int eZM;
  public int eZN;
  public int eZO;
  public int eZP;
  public int eZQ;
  public int eZR;
  public int eZS;
  public int eZT;
  private ByteBuffer eZU;
  private ByteBuffer eZV;
  public FloatBuffer eZh;
  public FloatBuffer eZi;
  public float[] gLB;
  private int gLw;
  private int gLx;
  private float[] gLz;
  private int iZn;
  private int iZo;
  public int lpC;
  public int lpD;
  public int lpE;
  public int lpF;
  public int lpG;
  public FloatBuffer lpK;
  public FloatBuffer lpL;
  public float[] lpO;
  public float[] lpP;
  public int lpQ;
  public int lpR;
  public int lpS;
  public int lpU;
  public byte[] lpV;
  private int rotate;
  public byte[] sWh;
  public int tbR;
  private ByteBuffer tbS;
  private int tbT;
  private int tbU;
  public volatile a tbV;
  private boolean tbW;

  public b()
  {
    AppMethodBeat.i(5125);
    this.gLz = new float[16];
    this.gLB = eZY;
    this.lpO = eZY;
    this.tbV = new a();
    this.tbW = false;
    this.eNa = false;
    AppMethodBeat.o(5125);
  }

  private static int M(String paramString, int paramInt)
  {
    int i = 0;
    AppMethodBeat.i(5130);
    int[] arrayOfInt = new int[1];
    paramInt = GLES20.glCreateShader(paramInt);
    GLES20.glShaderSource(paramInt, paramString);
    GLES20.glCompileShader(paramInt);
    GLES20.glGetShaderiv(paramInt, 35713, arrayOfInt, 0);
    if (arrayOfInt[0] == 0)
    {
      ab.e("loadShader error, infoLog: %s", GLES20.glGetShaderInfoLog(paramInt));
      AppMethodBeat.o(5130);
      paramInt = i;
    }
    while (true)
    {
      return paramInt;
      AppMethodBeat.o(5130);
    }
  }

  public static int U(String paramString1, String paramString2)
  {
    int i = 0;
    AppMethodBeat.i(5131);
    int[] arrayOfInt = new int[1];
    int j = M(paramString1, 35633);
    int k;
    if (j == 0)
    {
      ab.e("MicroMsg.FilterRenderer", "load vertex shader failed");
      AppMethodBeat.o(5131);
      k = i;
    }
    while (true)
    {
      return k;
      int m = M(paramString2, 35632);
      if (m == 0)
      {
        ab.e("MicroMsg.FilterRenderer", "load fragment shader failed");
        AppMethodBeat.o(5131);
        k = i;
      }
      else
      {
        k = GLES20.glCreateProgram();
        GLES20.glAttachShader(k, j);
        GLES20.glAttachShader(k, m);
        GLES20.glLinkProgram(k);
        GLES20.glGetProgramiv(k, 35714, arrayOfInt, 0);
        if (arrayOfInt[0] <= 0)
        {
          ab.e("MicroMsg.FilterRenderer", "link program failed");
          AppMethodBeat.o(5131);
          k = i;
        }
        else
        {
          GLES20.glDeleteShader(j);
          GLES20.glDeleteShader(m);
          AppMethodBeat.o(5131);
        }
      }
    }
  }

  public static int Vh()
  {
    AppMethodBeat.i(5129);
    int[] arrayOfInt = new int[1];
    GLES20.glGenTextures(1, arrayOfInt, 0);
    GLES20.glBindTexture(3553, arrayOfInt[0]);
    GLES20.glTexParameteri(3553, 10241, 9729);
    GLES20.glTexParameteri(3553, 10240, 9728);
    GLES20.glTexParameteri(3553, 10242, 33071);
    GLES20.glTexParameteri(3553, 10243, 33071);
    GLES20.glBindTexture(3553, 0);
    int i = arrayOfInt[0];
    AppMethodBeat.o(5129);
    return i;
  }

  public static int Vi()
  {
    int i = 0;
    AppMethodBeat.i(5132);
    int[] arrayOfInt = new int[1];
    GLES20.glGenFramebuffers(1, arrayOfInt, 0);
    if (arrayOfInt[0] == 0)
    {
      ab.e("MicroMsg.FilterRenderer", "gen frame buffer error");
      AppMethodBeat.o(5132);
    }
    while (true)
    {
      return i;
      i = arrayOfInt[0];
      AppMethodBeat.o(5132);
    }
  }

  public final void c(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    label1744: label1750: label2263: label2276: 
    while (true)
    {
      int i;
      float f1;
      float f2;
      float f3;
      float f4;
      try
      {
        AppMethodBeat.i(5126);
        if ((this.gLw == paramInt1) && (this.gLx == paramInt2))
          break label2791;
        i = 1;
        this.gLw = paramInt1;
        this.gLx = paramInt2;
        paramInt1 = paramInt3 >> 2 & 0x3;
        if (paramInt1 == 3)
        {
          this.rotate = 270;
          if ((paramInt3 >> 4 & 0x1) == 1)
          {
            bool = true;
            this.eYS = bool;
            if (OpenGlRender.taQ == 1)
              break label1744;
            bool = true;
            this.tbW = bool;
            if ((this.tbV == null) && (paramInt4 != 0))
            {
              a locala = new com/tencent/mm/plugin/voip/video/a/a;
              locala.<init>();
              this.tbV = locala;
              this.tbV.initial(this.lpS, this.lpU);
            }
            GLES20.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
            GLES20.glClear(16640);
            if (!this.tbW)
              break label1764;
            if ((this.eZO != 0) && (this.eZM != -1) && (this.eZN != -1) && (this.gLw > 0) && (this.gLx > 0) && (paramArrayOfByte != null))
            {
              if ((this.eZU == null) || (this.eZV == null) || (this.eZU.capacity() != this.gLx * this.gLw) || (this.eZV.capacity() != this.gLw * this.gLx / 2))
              {
                this.eZU = ByteBuffer.allocateDirect(this.gLx * this.gLw);
                this.eZV = ByteBuffer.allocateDirect(this.gLw * this.gLx / 2);
                this.eZU.order(ByteOrder.nativeOrder());
                this.eZV.order(ByteOrder.nativeOrder());
              }
              this.eZU.put(paramArrayOfByte, 0, this.gLw * this.gLx);
              this.eZU.position(0);
              this.eZV.put(paramArrayOfByte, this.gLw * this.gLx, this.gLw * this.gLx / 2);
              this.eZV.position(0);
              GLES20.glBindFramebuffer(36160, this.lpQ);
              GLES20.glBindTexture(3553, this.lpS);
              this.tbT = this.gLw;
              this.tbU = this.gLx;
              GLES20.glTexImage2D(3553, 0, 6408, this.tbT, this.tbU, 0, 6408, 5121, null);
              GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.lpS, 0);
              GLES20.glBindTexture(3553, 0);
              GLES20.glViewport(0, 0, this.tbT, this.tbU);
              GLES20.glUseProgram(this.eZO);
              GLES20.glActiveTexture(33984);
              GLES20.glBindTexture(3553, this.eZM);
              GLES20.glTexImage2D(3553, 0, 6409, this.gLw, this.gLx, 0, 6409, 5121, this.eZU);
              GLES20.glTexParameterf(3553, 10241, 9729.0F);
              GLES20.glTexParameterf(3553, 10240, 9729.0F);
              GLES20.glTexParameterf(3553, 10242, 33071.0F);
              GLES20.glTexParameterf(3553, 10243, 33071.0F);
              GLES20.glUniform1i(this.eZR, 0);
              GLES20.glActiveTexture(33985);
              GLES20.glBindTexture(3553, this.eZN);
              GLES20.glTexImage2D(3553, 0, 6410, this.gLw / 2, this.gLx / 2, 0, 6410, 5121, this.eZV);
              GLES20.glTexParameterf(3553, 10241, 9729.0F);
              GLES20.glTexParameterf(3553, 10240, 9729.0F);
              GLES20.glTexParameterf(3553, 10242, 33071.0F);
              GLES20.glTexParameterf(3553, 10243, 33071.0F);
              GLES20.glUniform1i(this.eZS, 1);
              Matrix.setIdentityM(this.gLz, 0);
              if (!this.eYS)
                break label1750;
              Matrix.scaleM(this.gLz, 0, -1.0F, 1.0F, 1.0F);
              GLES20.glUniformMatrix4fv(this.eZT, 1, false, this.gLz, 0);
              this.eZi.position(0);
              GLES20.glVertexAttribPointer(this.eZQ, 2, 5126, false, 0, this.eZi);
              GLES20.glEnableVertexAttribArray(this.eZQ);
              this.eZh.position(0);
              GLES20.glVertexAttribPointer(this.eZP, 2, 5126, false, 0, this.eZh);
              GLES20.glEnableVertexAttribArray(this.eZP);
              GLES20.glDrawArrays(5, 0, 4);
              GLES20.glDisableVertexAttribArray(this.eZQ);
              GLES20.glDisableVertexAttribArray(this.eZP);
              GLES20.glBindTexture(3553, 0);
              GLES20.glBindFramebuffer(36160, 0);
              GLES20.glUseProgram(0);
              GLES20.glFinish();
            }
            if ((paramInt4 != 0) && ((this.lpV == null) || (i != 0)))
            {
              ab.i("MicroMsg.FilterRenderer", "%s frameSizeChange %s %s %s %s", new Object[] { Integer.valueOf(hashCode()), Integer.valueOf(this.tbT), Integer.valueOf(this.tbU), Integer.valueOf(this.iZn), Integer.valueOf(this.iZo) });
              this.lpV = new byte[this.tbT * this.tbU * 4];
              this.tbV.lho = this.lpV;
            }
            if (paramInt4 == 0)
              break label2276;
            paramArrayOfByte = this.tbV;
            paramInt2 = this.tbT;
            paramInt1 = this.tbU;
            paramArrayOfByte.eYW = paramInt2;
            paramArrayOfByte.eYX = paramInt1;
            paramArrayOfByte = this.tbV;
            if ((paramInt4 & 0x4) == 0)
              break label2242;
            paramInt1 = 1;
            if ((paramInt1 != 0) && (paramArrayOfByte.mPTFilter != null))
            {
              BenchUtil.benchStart("PTFilter");
              BenchUtil.benchEnd("PTFilter");
              ab.d(a.TAG, "%s mFilterOutTex: %s", new Object[] { Integer.valueOf(paramArrayOfByte.hashCode()), Integer.valueOf(paramArrayOfByte.tbK) });
            }
            if ((paramArrayOfByte.tbH != null) && (paramArrayOfByte.tbJ != 0) && (paramArrayOfByte.tbO != 0))
              g.a(paramArrayOfByte.tbJ, paramArrayOfByte.eYW, paramArrayOfByte.eYX, paramArrayOfByte.lho, paramArrayOfByte.tbO);
            paramArrayOfByte = this.tbV.lho;
            GLES20.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
            GLES20.glClear(16640);
            if ((this.tbR != 0) && (this.tbT > 0) && (this.tbU > 0) && (paramArrayOfByte != null))
            {
              if ((this.tbS == null) || (this.tbS.capacity() != this.tbT * this.tbU * 4))
              {
                this.tbS = ByteBuffer.allocateDirect(this.tbT * this.tbU * 4);
                this.tbS.order(ByteOrder.nativeOrder());
              }
              this.tbS.put(paramArrayOfByte, 0, paramArrayOfByte.length);
              this.tbS.position(0);
              GLES20.glViewport(0, 0, this.iZn, this.iZo);
              GLES20.glUseProgram(this.tbR);
              GLES20.glActiveTexture(33984);
              GLES20.glBindTexture(3553, this.lpC);
              GLES20.glTexImage2D(3553, 0, 6408, this.tbT, this.tbU, 0, 6408, 5121, this.tbS);
              GLES20.glTexParameterf(3553, 10241, 9729.0F);
              GLES20.glTexParameterf(3553, 10240, 9729.0F);
              GLES20.glTexParameterf(3553, 10242, 33071.0F);
              GLES20.glTexParameterf(3553, 10243, 33071.0F);
              GLES20.glUniform1i(this.lpF, 0);
              if ((this.rotate != 0) && (this.rotate != 180))
                break label2247;
              paramInt1 = this.tbT;
              if ((this.rotate != 0) && (this.rotate != 180))
                break label2255;
              paramInt2 = this.tbU;
              if (paramInt1 / paramInt2 >= this.iZn / this.iZo)
                break label2263;
              f1 = this.iZn / paramInt1;
              paramInt3 = (int)(this.iZn / f1);
              paramInt4 = (int)(this.iZo / f1);
              Matrix.setIdentityM(this.gLz, 0);
              if (this.rotate > 0)
                Matrix.setRotateM(this.gLz, 0, Math.abs(this.rotate - 180), 0.0F, 0.0F, -1.0F);
              GLES20.glUniformMatrix4fv(this.lpG, 1, false, this.gLz, 0);
              this.lpL.put(this.lpO);
              this.lpL.position(0);
              GLES20.glVertexAttribPointer(this.lpE, 2, 5126, false, 0, this.lpL);
              GLES20.glEnableVertexAttribArray(this.lpE);
              f2 = (paramInt1 - paramInt3) / 2.0F / paramInt1;
              f3 = 1.0F - f2;
              f4 = (paramInt2 - paramInt4) / 2.0F / paramInt2;
              f1 = 1.0F - f4;
              this.lpP[0] = f4;
              this.lpP[1] = f2;
              this.lpP[2] = f1;
              this.lpP[3] = f2;
              this.lpP[4] = f4;
              this.lpP[5] = f3;
              this.lpP[6] = f1;
              this.lpP[7] = f3;
              this.lpK.put(this.lpP);
              this.lpK.position(0);
              GLES20.glVertexAttribPointer(this.lpD, 2, 5126, false, 0, this.lpK);
              GLES20.glEnableVertexAttribArray(this.lpD);
              GLES20.glDrawArrays(5, 0, 4);
              GLES20.glDisableVertexAttribArray(this.lpE);
              GLES20.glDisableVertexAttribArray(this.lpD);
              GLES20.glBindTexture(3553, 0);
              GLES20.glUseProgram(0);
            }
            GLES20.glBindFramebuffer(36160, 0);
            GLES20.glBindTexture(3553, 0);
            AppMethodBeat.o(5126);
          }
        }
        else
        {
          if (paramInt1 != 1)
            continue;
          this.rotate = 90;
          continue;
        }
      }
      finally
      {
      }
      boolean bool = false;
      continue;
      bool = false;
      continue;
      Matrix.scaleM(this.gLz, 0, 1.0F, 1.0F, 1.0F);
      continue;
      label1764: if ((this.tbR != 0) && (this.lpS != -1) && (this.gLw > 0) && (this.gLx > 0) && (paramArrayOfByte != null))
      {
        if ((this.tbS == null) || (this.tbS.capacity() != this.gLx * this.gLw * 4))
        {
          this.tbS = ByteBuffer.allocateDirect(this.gLx * this.gLw * 4);
          this.tbS.order(ByteOrder.nativeOrder());
        }
        this.tbS.put(paramArrayOfByte, 0, this.gLw * this.gLx * 4);
        this.tbS.position(0);
        GLES20.glBindFramebuffer(36160, this.lpQ);
        GLES20.glBindTexture(3553, this.lpS);
        if ((this.rotate == 180) || (this.rotate == 0))
        {
          paramInt1 = this.gLw;
          this.tbT = paramInt1;
          if ((this.rotate != 180) && (this.rotate != 0))
            break label2234;
        }
        for (paramInt1 = this.gLx; ; paramInt1 = this.gLw)
        {
          this.tbU = paramInt1;
          GLES20.glTexImage2D(3553, 0, 6408, this.tbT, this.tbU, 0, 6408, 5121, null);
          GLES20.glBindTexture(3553, 0);
          GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.lpS, 0);
          GLES20.glUseProgram(this.tbR);
          GLES20.glActiveTexture(33984);
          GLES20.glBindTexture(3553, this.lpC);
          GLES20.glTexImage2D(3553, 0, 6408, this.tbT, this.tbU, 0, 6408, 5121, this.tbS);
          GLES20.glUniform1i(this.lpF, 0);
          Matrix.setIdentityM(this.gLz, 0);
          Matrix.setRotateM(this.gLz, 0, this.rotate, 0.0F, 0.0F, -1.0F);
          if (this.eYS)
            Matrix.scaleM(this.gLz, 0, 1.0F, -1.0F, 1.0F);
          GLES20.glUniformMatrix4fv(this.lpG, 1, false, this.gLz, 0);
          this.eZi.position(0);
          GLES20.glVertexAttribPointer(this.lpE, 2, 5126, false, 0, this.eZi);
          GLES20.glEnableVertexAttribArray(this.lpE);
          this.eZh.position(0);
          GLES20.glVertexAttribPointer(this.lpD, 2, 5126, false, 0, this.eZh);
          GLES20.glEnableVertexAttribArray(this.lpD);
          GLES20.glDrawArrays(5, 0, 4);
          GLES20.glDisableVertexAttribArray(this.lpE);
          GLES20.glDisableVertexAttribArray(this.lpD);
          GLES20.glBindTexture(3553, 0);
          GLES20.glBindFramebuffer(36160, 0);
          break;
          paramInt1 = this.gLx;
          break label1925;
        }
        paramInt1 = 0;
        continue;
        paramInt1 = this.tbU;
        continue;
        paramInt2 = this.tbT;
        continue;
        f1 = this.iZo / paramInt2;
        continue;
        paramInt1 = this.lpS;
        GLES20.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
        GLES20.glClear(16640);
        GLES20.glViewport(0, 0, this.iZn, this.iZo);
        GLES20.glUseProgram(this.tbR);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, paramInt1);
        GLES20.glTexParameterf(3553, 10241, 9729.0F);
        GLES20.glTexParameterf(3553, 10240, 9729.0F);
        GLES20.glTexParameterf(3553, 10242, 33071.0F);
        GLES20.glTexParameterf(3553, 10243, 33071.0F);
        GLES20.glUniform1i(this.lpF, 0);
        if ((this.rotate == 0) || (this.rotate == 180))
        {
          paramInt1 = this.tbT;
          label2405: if ((this.rotate != 0) && (this.rotate != 180))
            break label2766;
          paramInt2 = this.tbU;
          label2427: if (paramInt1 / paramInt2 >= this.iZn / this.iZo)
            break label2774;
        }
        for (f1 = this.iZn / paramInt1; ; f1 = paramInt3 / paramInt2)
        {
          paramInt4 = (int)(this.iZn / f1);
          paramInt3 = (int)(this.iZo / f1);
          Matrix.setIdentityM(this.gLz, 0);
          if (this.rotate > 0)
            Matrix.setRotateM(this.gLz, 0, Math.abs(this.rotate - 180), 0.0F, 0.0F, -1.0F);
          GLES20.glUniformMatrix4fv(this.lpG, 1, false, this.gLz, 0);
          this.lpL.put(this.lpO);
          this.lpL.position(0);
          GLES20.glVertexAttribPointer(this.lpE, 2, 5126, false, 0, this.lpL);
          GLES20.glEnableVertexAttribArray(this.lpE);
          f2 = (paramInt1 - paramInt4) / 2.0F / paramInt1;
          f4 = 1.0F - f2;
          f3 = (paramInt2 - paramInt3) / 2.0F / paramInt2;
          f1 = 1.0F - f3;
          this.lpP[0] = f3;
          this.lpP[1] = f2;
          this.lpP[2] = f1;
          this.lpP[3] = f2;
          this.lpP[4] = f3;
          this.lpP[5] = f4;
          this.lpP[6] = f1;
          this.lpP[7] = f4;
          this.lpK.put(this.lpP);
          this.lpK.position(0);
          GLES20.glVertexAttribPointer(this.lpD, 2, 5126, false, 0, this.lpK);
          GLES20.glEnableVertexAttribArray(this.lpD);
          GLES20.glDrawArrays(5, 0, 4);
          GLES20.glDisableVertexAttribArray(this.lpE);
          GLES20.glDisableVertexAttribArray(this.lpD);
          GLES20.glBindTexture(3553, 0);
          GLES20.glUseProgram(0);
          break;
          paramInt1 = this.tbU;
          break label2405;
          paramInt2 = this.tbT;
          break label2427;
          paramInt3 = this.iZo;
        }
        label2791: i = 0;
      }
    }
  }

  public final byte[] cLS()
  {
    AppMethodBeat.i(5133);
    byte[] arrayOfByte;
    if ((this.tbV != null) && (this.tbV.lho != null))
    {
      if ((this.sWh == null) || (this.sWh.length != this.tbV.lho.length))
        this.sWh = new byte[this.tbV.lho.length];
      System.arraycopy(this.tbV.lho, 0, this.sWh, 0, this.tbV.lho.length);
      arrayOfByte = this.sWh;
      AppMethodBeat.o(5133);
    }
    while (true)
    {
      return arrayOfByte;
      arrayOfByte = null;
      AppMethodBeat.o(5133);
    }
  }

  public final void destroy()
  {
    try
    {
      AppMethodBeat.i(5128);
      if (!this.eNa)
        AppMethodBeat.o(5128);
      while (true)
      {
        return;
        ab.i("MicroMsg.FilterRenderer", "%s do destroy", new Object[] { Integer.valueOf(hashCode()) });
        if (this.tbV != null)
        {
          this.tbV.clear();
          this.tbV = null;
        }
        GLES20.glDeleteTextures(5, new int[] { this.eZM, this.eZN, this.lpC, this.lpS, this.lpU }, 0);
        GLES20.glDeleteFramebuffers(2, new int[] { this.lpQ, this.lpR }, 0);
        GLES20.glDeleteProgram(this.eZO);
        GLES20.glDeleteProgram(this.tbR);
        this.lpV = null;
        GLES20.glBindTexture(3553, 0);
        GLES20.glBindFramebuffer(36160, 0);
        GLES20.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
        GLES20.glClear(16640);
        GLES20.glFinish();
        if (this.eZU != null)
          this.eZU.clear();
        if (this.eZV != null)
          this.eZV.clear();
        this.eZU = null;
        this.eZV = null;
        this.eNa = false;
        AppMethodBeat.o(5128);
      }
    }
    finally
    {
    }
  }

  public final void reset()
  {
    try
    {
      AppMethodBeat.i(5127);
      ab.d("MicroMsg.FilterRenderer", "%s reset", new Object[] { Integer.valueOf(hashCode()) });
      GLES20.glBindFramebuffer(36160, 0);
      GLES20.glBindTexture(3553, 0);
      if (this.tbV != null)
      {
        this.tbV.clear();
        this.tbV = null;
      }
      this.lpV = null;
      AppMethodBeat.o(5127);
      return;
    }
    finally
    {
    }
  }

  public final void updateSize(int paramInt1, int paramInt2)
  {
    this.iZn = paramInt1;
    this.iZo = paramInt2;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip.video.a.b
 * JD-Core Version:    0.6.2
 */