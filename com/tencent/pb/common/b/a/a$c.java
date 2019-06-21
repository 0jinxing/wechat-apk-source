package com.tencent.pb.common.b.a;

import com.google.a.a.b;
import com.google.a.a.e;

public final class a$c extends e
{
  public a.w[] Amy = a.w.dPC();

  public a$c()
  {
    this.bxt = -1;
  }

  public final void a(b paramb)
  {
    if ((this.Amy != null) && (this.Amy.length > 0))
      for (int i = 0; i < this.Amy.length; i++)
      {
        a.w localw = this.Amy[i];
        if (localw != null)
          paramb.a(1, localw);
      }
    super.a(paramb);
  }

  public final int vr()
  {
    int i = super.vr();
    int j = i;
    if (this.Amy != null)
    {
      j = i;
      if (this.Amy.length > 0)
      {
        int k = 0;
        while (true)
        {
          j = i;
          if (k >= this.Amy.length)
            break;
          a.w localw = this.Amy[k];
          j = i;
          if (localw != null)
            j = i + b.b(1, localw);
          k++;
          i = j;
        }
      }
    }
    return j;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.pb.common.b.a.a.c
 * JD-Core Version:    0.6.2
 */