package com.tencent.filter;

import android.opengl.GLES20;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.util.f;
import com.tencent.util.i;
import com.tencent.view.b;
import com.tencent.view.g;

public final class h
{
  public h bJA;
  boolean bJy;
  public int[] bJz;
  public int height;
  public boolean needReleaseFrmae;
  public int[] texture;
  public int width;

  public h()
  {
    AppMethodBeat.i(86364);
    this.bJy = false;
    this.texture = new int[] { 0 };
    this.bJz = new int[] { 0 };
    this.needReleaseFrmae = false;
    AppMethodBeat.o(86364);
  }

  public h(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(86365);
    this.bJy = false;
    this.texture = new int[] { 0 };
    this.bJz = new int[] { 0 };
    this.needReleaseFrmae = false;
    this.texture[0] = paramInt2;
    this.bJz[0] = paramInt1;
    this.width = paramInt3;
    this.height = paramInt4;
    AppMethodBeat.o(86365);
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, double paramDouble)
  {
    AppMethodBeat.i(86366);
    g.checkGlError("before glBindFramebuffer");
    if (paramInt1 == 0)
    {
      GLES20.glBindFramebuffer(36160, 0);
      if (paramDouble <= 0.0D)
      {
        GLES20.glViewport(0, 0, paramInt2, paramInt3);
        AppMethodBeat.o(86366);
      }
    }
    while (true)
    {
      return;
      double d1 = paramInt3;
      double d2 = paramInt3 * paramDouble;
      double d3 = d2;
      if (paramInt2 > d2)
      {
        d3 = paramInt2;
        d1 = paramInt2 / paramDouble;
      }
      GLES20.glViewport((int)-(d3 - paramInt2) / 2, (int)-(d1 - paramInt3) / 2, (int)d3, (int)d1);
      AppMethodBeat.o(86366);
      continue;
      if ((paramInt1 != -2) || (b.AIH < 0))
        break;
      int i = GLSLRender.nativeCheckMagicEngine(5, b.AIH);
      b.AIH = i;
      if (i < 0)
        break;
      GLSLRender.nativeBeginUseEglImage(paramInt2, paramInt3, b.AIH);
      this.texture[0] = 0;
      AppMethodBeat.o(86366);
    }
    if (((paramInt1 > 0) && (this.texture[0] != paramInt1)) || (this.width != paramInt2) || (this.height != paramInt3))
    {
      if (this.bJz[0] != 0)
      {
        GLES20.glBindFramebuffer(36160, this.bJz[0]);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, 0, 0);
      }
      if ((this.bJy) && (this.texture[0] != 0))
        GLES20.glDeleteTextures(1, this.texture, 0);
      this.texture[0] = 0;
    }
    this.width = paramInt2;
    this.height = paramInt3;
    if (this.bJz[0] <= 0)
      GLES20.glGenFramebuffers(1, this.bJz, 0);
    if ((paramInt1 > 0) && (this.texture[0] != paramInt1))
    {
      this.bJy = false;
      this.texture[0] = paramInt1;
      GLES20.glActiveTexture(33984);
      GLES20.glBindTexture(3553, this.texture[0]);
      if (!f.dSJ().aI(this.texture[0], this.width, this.height))
      {
        f.dSJ().aJ(this.texture[0], this.width, this.height);
        GLES20.glTexImage2D(3553, 0, 6408, this.width, this.height, 0, 6408, 5121, null);
        f.dSJ().ig(this.width, this.height);
      }
      GLES20.glTexParameterf(3553, 10240, 9729.0F);
      GLES20.glTexParameterf(3553, 10241, 9729.0F);
      GLES20.glTexParameterf(3553, 10242, 33071.0F);
      GLES20.glTexParameterf(3553, 10243, 33071.0F);
      GLES20.glBindFramebuffer(36160, this.bJz[0]);
      GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.texture[0], 0);
      GLES20.glViewport(0, 0, this.width, this.height);
      i.k("Frame", "new frame buffer");
    }
    while (true)
    {
      g.checkGlError("glBindFramebuffer");
      AppMethodBeat.o(86366);
      break;
      if (this.texture[0] <= 0)
      {
        this.bJy = true;
        GLES20.glActiveTexture(33984);
        this.texture[0] = f.dSJ().jdMethod_if(this.width, this.height);
        GLES20.glBindTexture(3553, this.texture[0]);
        if (!f.dSJ().aI(this.texture[0], this.width, this.height))
        {
          f.dSJ().aJ(this.texture[0], this.width, this.height);
          GLES20.glTexImage2D(3553, 0, 6408, this.width, this.height, 0, 6408, 5121, null);
          f.dSJ().ig(this.width, this.height);
        }
        GLES20.glTexParameterf(3553, 10240, 9729.0F);
        GLES20.glTexParameterf(3553, 10241, 9729.0F);
        GLES20.glTexParameterf(3553, 10242, 33071.0F);
        GLES20.glTexParameterf(3553, 10243, 33071.0F);
        GLES20.glBindFramebuffer(36160, this.bJz[0]);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.texture[0], 0);
        GLES20.glViewport(0, 0, this.width, this.height);
        i.k("Frame", "new frame buffer auto");
      }
      else
      {
        GLES20.glBindFramebuffer(36160, this.bJz[0]);
        GLES20.glViewport(0, 0, this.width, this.height);
      }
    }
  }

  public final void clear()
  {
    AppMethodBeat.i(86367);
    if (this.bJz[0] != 0)
    {
      GLES20.glBindFramebuffer(36160, this.bJz[0]);
      GLES20.glFramebufferTexture2D(36160, 36064, 3553, 0, 0);
      GLES20.glDeleteFramebuffers(1, this.bJz, 0);
      this.bJz[0] = 0;
    }
    wF();
    if (this.bJA != null)
      this.bJA.clear();
    GLES20.glBindFramebuffer(36160, 0);
    AppMethodBeat.o(86367);
  }

  public final int getTextureId()
  {
    return this.texture[0];
  }

  public final int wE()
  {
    return this.bJz[0];
  }

  public final void wF()
  {
    AppMethodBeat.i(86368);
    i.k("Frame", "frame clear");
    if (this.texture[0] != 0)
    {
      if (this.bJy)
      {
        f.dSJ().Sh(this.texture[0]);
        f.dSJ().ih(this.width, this.height);
      }
      this.texture[0] = 0;
    }
    AppMethodBeat.o(86368);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.filter.h
 * JD-Core Version:    0.6.2
 */