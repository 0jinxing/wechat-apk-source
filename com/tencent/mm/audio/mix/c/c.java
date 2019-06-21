package com.tencent.mm.audio.mix.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.audio.mix.a.d;

public class c
  implements g
{
  protected static long clg;
  protected static long clh;
  protected static Object cli;
  protected h ckU;
  protected int ckV;
  protected int ckW;
  protected int ckX;
  protected int ckY;
  protected int ckZ;
  protected int cla;
  protected boolean clb;
  protected boolean clc;
  protected boolean cld;
  protected String cle;
  protected String clf;
  protected byte[][] clj;
  protected h clk;

  static
  {
    AppMethodBeat.i(137018);
    clg = 0L;
    clh = 0L;
    cli = new Object();
    AppMethodBeat.o(137018);
  }

  public c()
  {
    AppMethodBeat.i(137013);
    this.ckV = 0;
    this.ckW = 0;
    this.ckX = 0;
    this.ckY = 44100;
    this.ckZ = 2;
    this.cla = 2;
    this.clb = false;
    this.clc = false;
    this.cld = false;
    this.clj = new byte[2][];
    AppMethodBeat.o(137013);
  }

  public final void C(int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(137015);
    int i = this.ckV;
    this.ckV = paramInt1;
    this.ckW = paramInt2;
    this.ckX = paramInt3;
    if (this.ckY != this.ckV)
      if (this.ckU == null)
      {
        this.ckU = Dr();
        this.ckU.g(this.clf, this.ckV, this.ckY);
        if ((this.ckW == 2) && (this.ckZ == 2))
        {
          if (this.clk != null)
            break label247;
          this.clk = Dr();
          this.clk.g(this.clf + "RResample", this.ckV, this.ckY);
        }
        label145: this.cld = true;
      }
    while (true)
    {
      if (this.cla != this.ckX)
        this.clc = true;
      if (this.ckZ != this.ckW)
        this.clb = true;
      AppMethodBeat.o(137015);
      return;
      if ((this.ckU == null) || (i == this.ckV))
        break;
      this.ckU.release();
      this.ckU = Dr();
      this.ckU.g(this.clf, this.ckV, this.ckY);
      break;
      label247: if ((this.clk == null) || (i == this.ckV))
        break label145;
      this.clk.release();
      this.clk = Dr();
      this.clk.g(this.clf + "RResample", this.ckV, this.ckY);
      break label145;
      this.cld = false;
      if (this.ckU != null)
      {
        this.ckU.release();
        this.ckU = null;
      }
    }
  }

  public h Dr()
  {
    AppMethodBeat.i(137014);
    i locali = new i();
    AppMethodBeat.o(137014);
    return locali;
  }

  public void Ds()
  {
  }

  public d Dt()
  {
    return null;
  }

  public byte[] F(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(137016);
    if (paramArrayOfByte == null)
    {
      AppMethodBeat.o(137016);
      return paramArrayOfByte;
    }
    if (this.clc)
    {
      ??? = b.b(this.ckX, this.cla, paramArrayOfByte);
      if (??? == null);
    }
    while (true)
    {
      if (??? == null)
        ??? = paramArrayOfByte;
      while (true)
      {
        if ((this.ckW == 1) && (this.ckZ == 2) && (this.cld))
        {
          paramArrayOfByte = this.ckU.F((byte[])???);
          if (paramArrayOfByte != null)
            ??? = paramArrayOfByte;
          paramArrayOfByte = b.c(this.ckW, this.ckZ, this.cla, (byte[])???);
          if (paramArrayOfByte != null)
            ??? = paramArrayOfByte;
          AppMethodBeat.o(137016);
          paramArrayOfByte = (byte[])???;
          break;
        }
        byte[] arrayOfByte;
        if ((this.ckW == 2) && (this.ckZ == 2) && (this.cld))
        {
          if ((this.ckU instanceof i))
            if (this.ckZ == 2)
            {
              int i = ???.length / 2;
              if ((this.clj == null) || (i != this.clj.length))
                this.clj = new byte[2][i];
              b.a(this.cla, (byte[])???, this.clj);
              arrayOfByte = this.ckU.F(this.clj[0]);
              paramArrayOfByte = this.clk.F(this.clj[1]);
              if ((arrayOfByte == null) || (paramArrayOfByte == null))
                paramArrayOfByte = (byte[])???;
            }
          while (true)
          {
            if (paramArrayOfByte != null)
              ??? = paramArrayOfByte;
            AppMethodBeat.o(137016);
            paramArrayOfByte = (byte[])???;
            break;
            paramArrayOfByte = b.a(this.cla, arrayOfByte, paramArrayOfByte);
            continue;
            paramArrayOfByte = this.ckU.F((byte[])???);
            continue;
            paramArrayOfByte = this.ckU.F((byte[])???);
          }
        }
        if (this.clb)
        {
          arrayOfByte = b.c(this.ckW, this.ckZ, this.cla, (byte[])???);
          if (arrayOfByte != null)
            ??? = arrayOfByte;
        }
        while (true)
        {
          if (??? == null);
          while (true)
          {
            while (true)
            {
              ??? = paramArrayOfByte;
              if (this.cld);
              synchronized (cli)
              {
                clg += 1L;
                System.nanoTime();
                ??? = this.ckU.F(paramArrayOfByte);
                if (??? != null)
                  paramArrayOfByte = (byte[])???;
                synchronized (cli)
                {
                  ??? = paramArrayOfByte;
                }
              }
            }
            paramArrayOfByte = finally;
            AppMethodBeat.o(137016);
            throw paramArrayOfByte;
            paramArrayOfByte = (byte[])???;
          }
        }
      }
      ??? = null;
    }
  }

  public void flushCache()
  {
  }

  public void release()
  {
    AppMethodBeat.i(137017);
    if (this.ckU != null)
    {
      this.ckU.release();
      this.ckU = null;
    }
    if (this.clk != null)
    {
      this.clk.release();
      this.clk = null;
    }
    AppMethodBeat.o(137017);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.audio.mix.c.c
 * JD-Core Version:    0.6.2
 */