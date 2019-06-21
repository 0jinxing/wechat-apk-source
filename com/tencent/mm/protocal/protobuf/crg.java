package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class crg extends com.tencent.mm.bt.a
{
  public LinkedList<cqt> xoJ;
  public cql xoU;
  public int xoV;

  public crg()
  {
    AppMethodBeat.i(102417);
    this.xoJ = new LinkedList();
    AppMethodBeat.o(102417);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(102418);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.xoU == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: base_request");
        AppMethodBeat.o(102418);
        throw paramArrayOfObject;
      }
      if (this.xoU != null)
      {
        paramArrayOfObject.iy(1, this.xoU.computeSize());
        this.xoU.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.e(2, 8, this.xoJ);
      paramArrayOfObject.iz(3, this.xoV);
      AppMethodBeat.o(102418);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.xoU == null)
        break label563;
    label563: for (paramInt = e.a.a.a.ix(1, this.xoU.computeSize()) + 0; ; paramInt = 0)
    {
      paramInt = paramInt + e.a.a.a.c(2, 8, this.xoJ) + e.a.a.b.b.a.bs(3, this.xoV);
      AppMethodBeat.o(102418);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.xoJ.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.xoU == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: base_request");
          AppMethodBeat.o(102418);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(102418);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        crg localcrg = (crg)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(102418);
          break;
        case 1:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new cql();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((cql)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcrg.xoU = ((cql)localObject1);
          }
          AppMethodBeat.o(102418);
          paramInt = i;
          break;
        case 2:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new cqt();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((cqt)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcrg.xoJ.add(localObject1);
          }
          AppMethodBeat.o(102418);
          paramInt = i;
          break;
        case 3:
          localcrg.xoV = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(102418);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(102418);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.crg
 * JD-Core Version:    0.6.2
 */