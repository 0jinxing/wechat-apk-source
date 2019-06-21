package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class crn extends com.tencent.mm.bt.a
{
  public String wsq;
  public cql xoU;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(102425);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.xoU == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: base_request");
        AppMethodBeat.o(102425);
        throw paramArrayOfObject;
      }
      if (this.xoU != null)
      {
        paramArrayOfObject.iy(1, this.xoU.computeSize());
        this.xoU.writeFields(paramArrayOfObject);
      }
      if (this.wsq != null)
        paramArrayOfObject.e(2, this.wsq);
      AppMethodBeat.o(102425);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.xoU == null)
        break label435;
    label435: for (i = e.a.a.a.ix(1, this.xoU.computeSize()) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.wsq != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.wsq);
      AppMethodBeat.o(102425);
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
          AppMethodBeat.o(102425);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(102425);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        crn localcrn = (crn)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          AppMethodBeat.o(102425);
          paramInt = -1;
          break;
        case 1:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new cql();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((cql)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcrn.xoU = ((cql)localObject1);
          }
          AppMethodBeat.o(102425);
          paramInt = i;
          break;
        case 2:
          localcrn.wsq = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(102425);
          paramInt = i;
          break;
        }
      }
      AppMethodBeat.o(102425);
      paramInt = -1;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.crn
 * JD-Core Version:    0.6.2
 */