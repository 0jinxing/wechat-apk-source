package com.tencent.mm.plugin.sns.data;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.bau;
import java.util.LinkedList;
import java.util.List;

public final class e
{
  public List<bau> list;
  public String nQB;
  public int qFQ;

  public e()
  {
    AppMethodBeat.i(35796);
    this.list = new LinkedList();
    AppMethodBeat.o(35796);
  }

  public e(bau parambau)
  {
    AppMethodBeat.i(35797);
    this.list = new LinkedList();
    this.list.add(parambau);
    AppMethodBeat.o(35797);
  }

  public e(List<bau> paramList)
  {
    AppMethodBeat.i(35798);
    this.list = new LinkedList();
    this.list = paramList;
    AppMethodBeat.o(35798);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.data.e
 * JD-Core Version:    0.6.2
 */