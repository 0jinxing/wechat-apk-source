package com.tencent.pb.common.b.a;

import com.google.a.a.b;
import com.google.a.a.e;

public final class a$r extends e
{
  public a.am[] Anm = a.am.dPD();

  public a$r()
  {
    this.bxt = -1;
  }

  public final void a(b paramb)
  {
    if ((this.Anm != null) && (this.Anm.length > 0))
      for (int i = 0; i < this.Anm.length; i++)
      {
        a.am localam = this.Anm[i];
        if (localam != null)
          paramb.a(1, localam);
      }
    super.a(paramb);
  }

  public final int vr()
  {
    int i = super.vr();
    int j = i;
    if (this.Anm != null)
    {
      j = i;
      if (this.Anm.length > 0)
      {
        int k = 0;
        while (true)
        {
          j = i;
          if (k >= this.Anm.length)
            break;
          a.am localam = this.Anm[k];
          j = i;
          if (localam != null)
            j = i + b.b(1, localam);
          k++;
          i = j;
        }
      }
    }
    return j;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.pb.common.b.a.a.r
 * JD-Core Version:    0.6.2
 */