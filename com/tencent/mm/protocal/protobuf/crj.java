package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class crj extends com.tencent.mm.bt.a
{
  public cql xoU;
  public int xoV;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(102421);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.xoU == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: base_request");
        AppMethodBeat.o(102421);
        throw paramArrayOfObject;
      }
      if (this.xoU != null)
      {
        paramArrayOfObject.iy(1, this.xoU.computeSize());
        this.xoU.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(2, this.xoV);
      AppMethodBeat.o(102421);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.xoU == null)
        break label418;
    label418: for (paramInt = e.a.a.a.ix(1, this.xoU.computeSize()) + 0; ; paramInt = 0)
    {
      paramInt += e.a.a.b.b.a.bs(2, this.xoV);
      AppMethodBeat.o(102421);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.xoU == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: base_request");
          AppMethodBeat.o(102421);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(102421);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        crj localcrj = (crj)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          AppMethodBeat.o(102421);
          paramInt = -1;
          break;
        case 1:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new cql();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcrj.xoU = paramArrayOfObject;
          }
          AppMethodBeat.o(102421);
          paramInt = i;
          break;
        case 2:
          localcrj.xoV = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(102421);
          paramInt = i;
          break;
        }
      }
      AppMethodBeat.o(102421);
      paramInt = -1;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.crj
 * JD-Core Version:    0.6.2
 */