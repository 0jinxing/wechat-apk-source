package com.tencent.pb.common.b.a;

import com.google.a.a.b;
import com.google.a.a.e;

public final class a$aq extends e
{
  public int sceneType = 0;

  public a$aq()
  {
    this.bxt = -1;
  }

  public final void a(b paramb)
  {
    if (this.sceneType != 0)
      paramb.bq(1, this.sceneType);
    super.a(paramb);
  }

  public final int vr()
  {
    int i = super.vr();
    int j = i;
    if (this.sceneType != 0)
      j = i + b.bs(1, this.sceneType);
    return j;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.pb.common.b.a.a.aq
 * JD-Core Version:    0.6.2
 */