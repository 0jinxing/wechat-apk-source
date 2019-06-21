package com.tencent.mm.plugin.expt.hellhound.a.c;

import com.tencent.mm.protocal.protobuf.caz;

final class a
{
  caz lMV;

  final boolean bqH()
  {
    int i = this.lMV.qDY;
    int j = this.lMV.xaf + i;
    int k = this.lMV.iev - this.lMV.xae;
    int m;
    int n;
    label83: boolean bool;
    if (this.lMV.y >= j)
    {
      i = this.lMV.y;
      m = this.lMV.y;
      n = this.lMV.height + m;
      if (n < k)
        break label105;
      m = k;
      if (this.lMV.y < k)
        break label112;
      bool = false;
    }
    while (true)
    {
      return bool;
      i = j;
      break;
      label105: m = n;
      break label83;
      label112: if (n <= j)
      {
        bool = false;
      }
      else if ((this.lMV.y >= j) && (n <= k))
      {
        bool = true;
      }
      else
      {
        i = m - i;
        if (i / this.lMV.height >= 0.9F)
          bool = true;
        else if (i / (k - j) >= 0.5F)
          bool = true;
        else
          bool = false;
      }
    }
  }

  public final String toString()
  {
    return this.lMV.feedId;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.expt.hellhound.a.c.a
 * JD-Core Version:    0.6.2
 */