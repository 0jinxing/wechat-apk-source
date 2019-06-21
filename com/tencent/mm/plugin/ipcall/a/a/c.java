package com.tencent.mm.plugin.ipcall.a.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bt.b;
import com.tencent.mm.protocal.protobuf.blt;
import java.util.Iterator;
import java.util.LinkedList;

public final class c
{
  public String cMr;
  public String cOz;
  public int hGH;
  public LinkedList<blt> jud;
  public int luT;
  public String luU;
  public String nickname;
  public int nwA;
  public String nwB;
  public int nwC;
  public int nwD;
  public int nwE;
  public int nwF;
  public boolean nwG;
  public boolean nwH;
  public boolean nwI;
  public boolean nwJ;
  public int nwK;
  public int nwL;
  public int nwM;
  public int nwN;
  public b nwO;
  public int nwP;
  public int nwQ;
  public b nwR;
  public LinkedList<blt> nwS;
  public int nwT;
  public LinkedList<d> nwU;
  public String nwV;
  public String nwW;
  public String nwX;
  public int nwY;
  public boolean nwZ;
  public int nwu;
  public long nwv;
  public long nww;
  public int nwx;
  public int nwy;
  public int nwz;

  public c()
  {
    AppMethodBeat.i(21793);
    this.nwG = false;
    this.nwH = false;
    this.nwI = false;
    this.nwJ = true;
    this.nwK = 0;
    this.jud = new LinkedList();
    this.nwS = new LinkedList();
    this.nwT = 999;
    this.nwU = new LinkedList();
    this.nwZ = false;
    AppMethodBeat.o(21793);
  }

  public final int bHG()
  {
    AppMethodBeat.i(21794);
    int i;
    if ((this.nwU != null) && (this.nwU.size() > 0))
    {
      i = ((d)this.nwU.get(0)).nwD;
      AppMethodBeat.o(21794);
    }
    while (true)
    {
      return i;
      i = this.nwD;
      AppMethodBeat.o(21794);
    }
  }

  public final int bHH()
  {
    AppMethodBeat.i(21795);
    int i;
    if ((this.nwU != null) && (this.nwU.size() > 0))
    {
      i = ((d)this.nwU.get(0)).eIV;
      AppMethodBeat.o(21795);
    }
    while (true)
    {
      return i;
      i = this.hGH;
      AppMethodBeat.o(21795);
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(21796);
    Object localObject1 = new StringBuilder("");
    ((StringBuilder)localObject1).append("IPCallInfo: ");
    ((StringBuilder)localObject1).append(String.format("[roomId: %d, roomKey: %d, callSeq: %d, inviteId: %d, roomMemberId: %d, syncKey: %d, syncInterval: %d, currentStatus: %d, ErrMsg: %s, ErrCode：%d, ErrLevel：%d]\n", new Object[] { Integer.valueOf(this.nwu), Long.valueOf(this.nwv), Long.valueOf(this.nww), Integer.valueOf(this.nwx), Integer.valueOf(this.nwC), Integer.valueOf(this.nwD), Integer.valueOf(this.nwE), Integer.valueOf(this.hGH), this.luU, Integer.valueOf(this.luT), Integer.valueOf(this.nwA) }));
    ((StringBuilder)localObject1).append(String.format("[toUsername: %s, toPhoneNumber: %s]\n", new Object[] { this.cMr, this.nwW }));
    ((StringBuilder)localObject1).append("[addrList: ");
    Iterator localIterator = this.jud.iterator();
    Object localObject2;
    while (localIterator.hasNext())
    {
      localObject2 = (blt)localIterator.next();
      ((StringBuilder)localObject1).append(String.format("{IP: %s, port: %d}", new Object[] { ((blt)localObject2).wCK, Integer.valueOf(((blt)localObject2).wOO) }));
    }
    ((StringBuilder)localObject1).append("]");
    ((StringBuilder)localObject1).append("\n");
    if ((this.nwU != null) && (this.nwU.size() > 0))
    {
      ((StringBuilder)localObject1).append("[userInfoList: ");
      localIterator = this.nwU.iterator();
      while (localIterator.hasNext())
      {
        localObject2 = (d)localIterator.next();
        ((StringBuilder)localObject1).append("{");
        ((StringBuilder)localObject1).append(((d)localObject2).toString());
        ((StringBuilder)localObject1).append("}");
      }
      ((StringBuilder)localObject1).append("]");
    }
    while (true)
    {
      localObject1 = ((StringBuilder)localObject1).toString();
      AppMethodBeat.o(21796);
      return localObject1;
      ((StringBuilder)localObject1).append("userInfoList is empty");
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.a.a.c
 * JD-Core Version:    0.6.2
 */