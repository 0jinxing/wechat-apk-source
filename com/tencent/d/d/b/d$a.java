package com.tencent.d.d.b;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class d$a
{
  public int Atj;
  public String Atk;
  public String name = "";
  public int pid;
  public int uid;

  d$a(int paramInt1, int paramInt2, String paramString1, int paramInt3, String paramString2)
  {
    this.pid = paramInt1;
    this.Atj = paramInt2;
    this.name = paramString1;
    this.uid = paramInt3;
    this.Atk = paramString2;
  }

  public final String toString()
  {
    AppMethodBeat.i(114522);
    String str = "PID=" + this.pid + " PPID=" + this.Atj + " NAME=" + this.name + " UID=" + this.uid + " CONTEXT=" + this.Atk;
    AppMethodBeat.o(114522);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.d.d.b.d.a
 * JD-Core Version:    0.6.2
 */