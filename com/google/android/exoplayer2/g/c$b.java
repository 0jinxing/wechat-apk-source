package com.google.android.exoplayer2.g;

import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class c$b
{
  public final String bpj = null;
  public final String bpk = null;
  public final int bpl = 2147483647;
  public final int bpm = 2147483647;
  public final int bpn = 2147483647;
  public final boolean bpo = true;
  public final boolean bpp = true;
  public final boolean bpq = false;
  public final boolean bpr = true;
  public final boolean bpt = true;
  public final int viewportHeight = 2147483647;
  public final int viewportWidth = 2147483647;

  public c$b()
  {
    this((byte)0);
  }

  private c$b(byte paramByte)
  {
  }

  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    AppMethodBeat.i(95763);
    if (this == paramObject)
      AppMethodBeat.o(95763);
    while (true)
    {
      return bool;
      if ((paramObject == null) || (getClass() != paramObject.getClass()))
      {
        AppMethodBeat.o(95763);
        bool = false;
      }
      else
      {
        paramObject = (b)paramObject;
        if ((this.bpq == paramObject.bpq) && (this.bpr == paramObject.bpr) && (this.bpl == paramObject.bpl) && (this.bpm == paramObject.bpm) && (this.bpo == paramObject.bpo) && (this.bpt == paramObject.bpt) && (this.bpp == paramObject.bpp) && (this.viewportWidth == paramObject.viewportWidth) && (this.viewportHeight == paramObject.viewportHeight) && (this.bpn == paramObject.bpn) && (TextUtils.equals(this.bpj, paramObject.bpj)) && (TextUtils.equals(this.bpk, paramObject.bpk)))
        {
          AppMethodBeat.o(95763);
        }
        else
        {
          AppMethodBeat.o(95763);
          bool = false;
        }
      }
    }
  }

  public final int hashCode()
  {
    int i = 1;
    AppMethodBeat.i(95764);
    int j = this.bpj.hashCode();
    int k = this.bpk.hashCode();
    int m;
    int n;
    label43: int i1;
    int i2;
    int i3;
    int i4;
    label71: int i5;
    if (this.bpq)
    {
      m = 1;
      if (!this.bpr)
        break label177;
      n = 1;
      i1 = this.bpl;
      i2 = this.bpm;
      i3 = this.bpn;
      if (!this.bpo)
        break label183;
      i4 = 1;
      if (!this.bpt)
        break label189;
      i5 = 1;
      label81: if (!this.bpp)
        break label195;
    }
    while (true)
    {
      int i6 = this.viewportWidth;
      int i7 = this.viewportHeight;
      AppMethodBeat.o(95764);
      return (((i5 + (i4 + ((((n + (m + (j * 31 + k) * 31) * 31) * 31 + i1) * 31 + i2) * 31 + i3) * 31) * 31) * 31 + i) * 31 + i6) * 31 + i7;
      m = 0;
      break;
      label177: n = 0;
      break label43;
      label183: i4 = 0;
      break label71;
      label189: i5 = 0;
      break label81;
      label195: i = 0;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.g.c.b
 * JD-Core Version:    0.6.2
 */