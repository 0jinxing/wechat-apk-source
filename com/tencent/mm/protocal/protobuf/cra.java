package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class cra extends com.tencent.mm.bt.a
{
  public String xou;
  public LinkedList<String> xov;

  public cra()
  {
    AppMethodBeat.i(102409);
    this.xov = new LinkedList();
    AppMethodBeat.o(102409);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(102410);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.xou != null)
        paramArrayOfObject.e(1, this.xou);
      paramArrayOfObject.e(2, 1, this.xov);
      AppMethodBeat.o(102410);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.xou == null)
        break label290;
    label290: for (paramInt = e.a.a.b.b.a.f(1, this.xou) + 0; ; paramInt = 0)
    {
      paramInt += e.a.a.a.c(2, 1, this.xov);
      AppMethodBeat.o(102410);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.xov.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(102410);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        cra localcra = (cra)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          AppMethodBeat.o(102410);
          paramInt = -1;
          break;
        case 1:
          localcra.xou = locala.BTU.readString();
          AppMethodBeat.o(102410);
          paramInt = i;
          break;
        case 2:
          localcra.xov.add(locala.BTU.readString());
          AppMethodBeat.o(102410);
          paramInt = i;
          break;
        }
      }
      AppMethodBeat.o(102410);
      paramInt = -1;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cra
 * JD-Core Version:    0.6.2
 */