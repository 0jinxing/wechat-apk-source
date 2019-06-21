package com.tencent.pb.common.b.a;

import com.google.a.a.b;
import com.google.a.a.e;

public final class a$ah extends e
{
  public a.au[] Aon = a.au.dPG();

  public a$ah()
  {
    this.bxt = -1;
  }

  public final void a(b paramb)
  {
    if ((this.Aon != null) && (this.Aon.length > 0))
      for (int i = 0; i < this.Aon.length; i++)
      {
        a.au localau = this.Aon[i];
        if (localau != null)
          paramb.a(1, localau);
      }
    super.a(paramb);
  }

  public final int vr()
  {
    int i = super.vr();
    int j = i;
    if (this.Aon != null)
    {
      j = i;
      if (this.Aon.length > 0)
      {
        int k = 0;
        while (true)
        {
          j = i;
          if (k >= this.Aon.length)
            break;
          a.au localau = this.Aon[k];
          j = i;
          if (localau != null)
            j = i + b.b(1, localau);
          k++;
          i = j;
        }
      }
    }
    return j;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.pb.common.b.a.a.ah
 * JD-Core Version:    0.6.2
 */