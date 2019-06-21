package com.tencent.mm.an;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class a$a
  implements Comparable<a>
{
  public long endTime = 0L;
  public long fAk = 0L;
  public int fAl = 0;
  public boolean fAm = true;
  public boolean fAn = false;
  public int fAo = 0;
  public long fAp = 0L;
  public long fAq = 0L;
  public long fAr = 0L;
  public int pid = 0;
  public long startTime = 0L;
  public int type = 0;

  public final String toString()
  {
    AppMethodBeat.i(58327);
    Object localObject = new StringBuilder();
    switch (this.type)
    {
    default:
    case 0:
    case 1:
    case 2:
    case 3:
    case 4:
    }
    while (true)
    {
      ((StringBuilder)localObject).append("\n");
      localObject = ((StringBuilder)localObject).toString();
      AppMethodBeat.o(58327);
      return localObject;
      ((StringBuilder)localObject).append(String.format("server time:%s,local start time:%s,local end time:%s,[mm] pid:%s,normal execute:%s", new Object[] { a.fF(this.fAk), a.fF(this.startTime), a.fF(this.endTime), Integer.valueOf(this.pid), Boolean.valueOf(this.fAm) }));
      continue;
      ((StringBuilder)localObject).append(String.format("server time:%s,local start time:%s,local end time:%s,[push] pid:%s,network:%s,normal execute:%s", new Object[] { a.fF(this.fAk), a.fF(this.startTime), a.fF(this.endTime), Integer.valueOf(this.pid), Integer.valueOf(this.fAl), Boolean.valueOf(this.fAm) }));
      continue;
      ((StringBuilder)localObject).append(String.format("server time:%s,local start time:%s,local end time:%s,send broadcast type(push):%s", new Object[] { a.fF(this.fAk), a.fF(this.startTime), a.fF(this.endTime), Integer.valueOf(this.fAo) }));
      continue;
      ((StringBuilder)localObject).append(String.format("server time:%s,local start time:%s,local end time:%s,receive broadcast type(mm):%s", new Object[] { a.fF(this.fAk), a.fF(this.startTime), a.fF(this.endTime), Integer.valueOf(this.fAo) }));
      continue;
      ((StringBuilder)localObject).append(String.format("server time:%s,local start time:%s,local end time:%s,delayed msg pid:%s, msg server time:%s,interval time:%s, msg server id:%s", new Object[] { a.fF(this.fAk), a.fF(this.startTime), a.fF(this.endTime), Integer.valueOf(this.pid), a.fF(this.fAp), Long.valueOf(this.fAq), Long.valueOf(this.fAr) }));
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.an.a.a
 * JD-Core Version:    0.6.2
 */