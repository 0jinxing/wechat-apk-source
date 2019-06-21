package com.tencent.pb.common.b.a;

import com.google.a.a.b;
import com.google.a.a.e;

public final class a$ac extends e
{
  public a.at Amz = null;
  public int Aoe = 0;
  public String groupId = "";

  public a$ac()
  {
    this.bxt = -1;
  }

  public final void a(b paramb)
  {
    if (!this.groupId.equals(""))
      paramb.e(1, this.groupId);
    if (this.Amz != null)
      paramb.a(2, this.Amz);
    if (this.Aoe != 0)
      paramb.bq(3, this.Aoe);
    super.a(paramb);
  }

  public final int vr()
  {
    int i = super.vr();
    int j = i;
    if (!this.groupId.equals(""))
      j = i + b.f(1, this.groupId);
    i = j;
    if (this.Amz != null)
      i = j + b.b(2, this.Amz);
    j = i;
    if (this.Aoe != 0)
      j = i + b.bs(3, this.Aoe);
    return j;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.pb.common.b.a.a.ac
 * JD-Core Version:    0.6.2
 */