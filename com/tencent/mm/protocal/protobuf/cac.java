package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;

public final class cac extends com.tencent.mm.bt.a
{
  public String ProductID;
  public int vKj;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(62583);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.ProductID == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: ProductID");
        AppMethodBeat.o(62583);
        throw paramArrayOfObject;
      }
      if (this.ProductID != null)
        paramArrayOfObject.e(1, this.ProductID);
      paramArrayOfObject.iz(2, this.vKj);
      AppMethodBeat.o(62583);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.ProductID == null)
        break label322;
    label322: for (paramInt = e.a.a.b.b.a.f(1, this.ProductID) + 0; ; paramInt = 0)
    {
      paramInt += e.a.a.b.b.a.bs(2, this.vKj);
      AppMethodBeat.o(62583);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.ProductID == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: ProductID");
          AppMethodBeat.o(62583);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(62583);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        cac localcac = (cac)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          AppMethodBeat.o(62583);
          paramInt = -1;
          break;
        case 1:
          localcac.ProductID = locala.BTU.readString();
          AppMethodBeat.o(62583);
          paramInt = i;
          break;
        case 2:
          localcac.vKj = locala.BTU.vd();
          AppMethodBeat.o(62583);
          paramInt = i;
          break;
        }
      }
      AppMethodBeat.o(62583);
      paramInt = -1;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cac
 * JD-Core Version:    0.6.2
 */