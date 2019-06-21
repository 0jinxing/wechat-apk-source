package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class bxp extends bsr
{
  public int mask;
  public int wmV;
  public km wmX;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(11806);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.wmX == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: attr");
        AppMethodBeat.o(11806);
        throw paramArrayOfObject;
      }
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(2, this.wmV);
      paramArrayOfObject.iz(3, this.mask);
      if (this.wmX != null)
      {
        paramArrayOfObject.iy(4, this.wmX.computeSize());
        this.wmX.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(11806);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label634;
    label634: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.wmV) + e.a.a.b.b.a.bs(3, this.mask);
      paramInt = i;
      if (this.wmX != null)
        paramInt = i + e.a.a.a.ix(4, this.wmX.computeSize());
      AppMethodBeat.o(11806);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.wmX == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: attr");
          AppMethodBeat.o(11806);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(11806);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        bxp localbxp = (bxp)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(11806);
          break;
        case 1:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new hl();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbxp.BaseRequest = paramArrayOfObject;
          }
          AppMethodBeat.o(11806);
          paramInt = i;
          break;
        case 2:
          localbxp.wmV = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(11806);
          paramInt = i;
          break;
        case 3:
          localbxp.mask = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(11806);
          paramInt = i;
          break;
        case 4:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new km();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbxp.wmX = paramArrayOfObject;
          }
          AppMethodBeat.o(11806);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(11806);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bxp
 * JD-Core Version:    0.6.2
 */