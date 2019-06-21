package com.tencent.mm.booter.notification.queue;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.Serializable;

public final class a$a
  implements Serializable
{
  public long cvx;
  public int edE;
  public boolean edY;
  public int eee;
  public int eef;
  public String userName;

  public a$a(int paramInt1, long paramLong, String paramString, int paramInt2, boolean paramBoolean, int paramInt3)
  {
    AppMethodBeat.i(15969);
    this.cvx = -1L;
    this.userName = "";
    this.edY = false;
    this.eef = 0;
    a(paramInt1, paramLong, paramString, paramInt2, paramBoolean, paramInt3);
    AppMethodBeat.o(15969);
  }

  public a$a(int paramInt, boolean paramBoolean)
  {
    this.cvx = -1L;
    this.userName = "";
    this.edY = false;
    this.eef = 0;
    this.eee = paramInt;
    this.edY = paramBoolean;
  }

  public final void a(int paramInt1, long paramLong, String paramString, int paramInt2, boolean paramBoolean, int paramInt3)
  {
    this.eee = paramInt1;
    this.cvx = paramLong;
    this.userName = paramString;
    this.edE = paramInt2;
    this.edY = paramBoolean;
    this.eef = paramInt3;
  }

  public final String toString()
  {
    AppMethodBeat.i(15970);
    String str = this.userName + " id:" + this.cvx + " unReadCount:" + this.edE + "　notificationId:" + this.eee;
    AppMethodBeat.o(15970);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.booter.notification.queue.a.a
 * JD-Core Version:    0.6.2
 */