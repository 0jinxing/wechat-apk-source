package com.tencent.mm.plugin.wenote.model.nativenote.c;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class b
{
  public float hke = -1.0F;
  public float hkf = -1.0F;
  public int klY = 0;
  public float uQU = -1.0F;
  public float uQV = -1.0F;
  public int uQW = -1;
  public float uQX = -1.0F;
  public float uQY = -1.0F;
  public float uQZ = -1.0F;
  public float uRa = -1.0F;
  public int uRb = -1;

  private boolean deY()
  {
    if ((this.uQU >= 0.0F) && (this.uQV >= 0.0F) && (this.hke >= 0.0F) && (this.hkf >= 0.0F) && (this.uQW >= 0));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  private boolean deZ()
  {
    if ((this.uQX >= 0.0F) && (this.uQY >= 0.0F) && (this.uQZ >= 0.0F) && (this.uRa >= 0.0F) && (this.uRb >= 0));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final void a(int paramInt1, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, int paramInt2)
  {
    this.klY = paramInt1;
    this.uQU = paramFloat1;
    this.uQV = paramFloat2;
    this.hke = paramFloat3;
    this.hkf = paramFloat4;
    if (this.klY == 1);
    for (this.uQW = paramInt2; ; this.uQW = 0)
      return;
  }

  public final int getType()
  {
    AppMethodBeat.i(26854);
    int i;
    if (!deY())
    {
      i = 0;
      AppMethodBeat.o(26854);
    }
    while (true)
    {
      return i;
      if (!deZ())
      {
        i = 1;
        AppMethodBeat.o(26854);
      }
      else
      {
        i = Math.abs((int)(this.hke - this.uQZ));
        int j = Math.abs((int)(this.hkf - this.uRa));
        if ((i > 30) || (j > 30) || (this.uQW != this.uRb))
        {
          i = 3;
          AppMethodBeat.o(26854);
        }
        else
        {
          i = 2;
          AppMethodBeat.o(26854);
        }
      }
    }
  }

  public final void reset()
  {
    this.klY = 0;
    this.uQU = -1.0F;
    this.uQV = -1.0F;
    this.hke = -1.0F;
    this.hkf = -1.0F;
    this.uQW = -1;
    this.uQX = -1.0F;
    this.uQY = -1.0F;
    this.uQZ = -1.0F;
    this.uRa = -1.0F;
    this.uRb = -1;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wenote.model.nativenote.c.b
 * JD-Core Version:    0.6.2
 */