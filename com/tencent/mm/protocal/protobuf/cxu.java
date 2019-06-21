package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class cxu extends com.tencent.mm.bt.a
{
  public cxp xsZ;
  public String xtm;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(115021);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.xsZ != null)
      {
        paramArrayOfObject.iy(1, this.xsZ.computeSize());
        this.xsZ.writeFields(paramArrayOfObject);
      }
      if (this.xtm != null)
        paramArrayOfObject.e(2, this.xtm);
      AppMethodBeat.o(115021);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.xsZ == null)
        break label387;
    label387: for (i = e.a.a.a.ix(1, this.xsZ.computeSize()) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.xtm != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.xtm);
      AppMethodBeat.o(115021);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(115021);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        cxu localcxu = (cxu)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          AppMethodBeat.o(115021);
          paramInt = -1;
          break;
        case 1:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new cxp();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((cxp)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcxu.xsZ = ((cxp)localObject1);
          }
          AppMethodBeat.o(115021);
          paramInt = i;
          break;
        case 2:
          localcxu.xtm = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(115021);
          paramInt = i;
          break;
        }
      }
      AppMethodBeat.o(115021);
      paramInt = -1;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cxu
 * JD-Core Version:    0.6.2
 */