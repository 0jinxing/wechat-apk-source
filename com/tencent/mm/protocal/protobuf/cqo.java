package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class cqo extends com.tencent.mm.bt.a
{
  public String xot;
  public String xou;
  public LinkedList<String> xov;
  public int xow;

  public cqo()
  {
    AppMethodBeat.i(102395);
    this.xov = new LinkedList();
    AppMethodBeat.o(102395);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(102396);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.xot != null)
        paramArrayOfObject.e(1, this.xot);
      if (this.xou != null)
        paramArrayOfObject.e(2, this.xou);
      paramArrayOfObject.e(3, 1, this.xov);
      paramArrayOfObject.iz(4, this.xow);
      AppMethodBeat.o(102396);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.xot == null)
        break label400;
    label400: for (paramInt = e.a.a.b.b.a.f(1, this.xot) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.xou != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.xou);
      paramInt = i + e.a.a.a.c(3, 1, this.xov) + e.a.a.b.b.a.bs(4, this.xow);
      AppMethodBeat.o(102396);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.xov.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(102396);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        cqo localcqo = (cqo)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(102396);
          break;
        case 1:
          localcqo.xot = locala.BTU.readString();
          AppMethodBeat.o(102396);
          paramInt = i;
          break;
        case 2:
          localcqo.xou = locala.BTU.readString();
          AppMethodBeat.o(102396);
          paramInt = i;
          break;
        case 3:
          localcqo.xov.add(locala.BTU.readString());
          AppMethodBeat.o(102396);
          paramInt = i;
          break;
        case 4:
          localcqo.xow = locala.BTU.vd();
          AppMethodBeat.o(102396);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(102396);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cqo
 * JD-Core Version:    0.6.2
 */