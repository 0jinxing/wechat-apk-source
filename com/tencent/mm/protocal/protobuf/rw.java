package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class rw extends com.tencent.mm.bt.a
{
  public int jCt;
  public LinkedList<String> vZh;
  public String vZi;
  public long vZj;

  public rw()
  {
    AppMethodBeat.i(14717);
    this.vZh = new LinkedList();
    AppMethodBeat.o(14717);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(14718);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.jCt);
      paramArrayOfObject.e(2, 1, this.vZh);
      if (this.vZi != null)
        paramArrayOfObject.e(3, this.vZi);
      paramArrayOfObject.ai(4, this.vZj);
      AppMethodBeat.o(14718);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        int i = e.a.a.b.b.a.bs(1, this.jCt) + 0 + e.a.a.a.c(2, 1, this.vZh);
        paramInt = i;
        if (this.vZi != null)
          paramInt = i + e.a.a.b.b.a.f(3, this.vZi);
        paramInt += e.a.a.b.b.a.o(4, this.vZj);
        AppMethodBeat.o(14718);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.vZh.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(14718);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        rw localrw = (rw)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(14718);
          break;
        case 1:
          localrw.jCt = locala.BTU.vd();
          AppMethodBeat.o(14718);
          paramInt = 0;
          break;
        case 2:
          localrw.vZh.add(locala.BTU.readString());
          AppMethodBeat.o(14718);
          paramInt = 0;
          break;
        case 3:
          localrw.vZi = locala.BTU.readString();
          AppMethodBeat.o(14718);
          paramInt = 0;
          break;
        case 4:
          localrw.vZj = locala.BTU.ve();
          AppMethodBeat.o(14718);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(14718);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.rw
 * JD-Core Version:    0.6.2
 */