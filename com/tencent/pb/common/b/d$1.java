package com.tencent.pb.common.b;

import com.tencent.pb.common.c.c;
import com.tencent.pb.common.c.f;

final class d$1
  implements Runnable
{
  d$1(d paramd)
  {
  }

  public final void run()
  {
    this.AlS.jIN = true;
    c.d("MicroMsg.Voip", new Object[] { "NETTASK_RECV TimeOut cmd= ", this.AlS.dPt() });
    f.C(20006, 3, "-1104");
    if (this.AlS.AlM != null)
      this.AlS.AlM.a(2, -1, "time exceed, force to callback", this.AlS);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.pb.common.b.d.1
 * JD-Core Version:    0.6.2
 */