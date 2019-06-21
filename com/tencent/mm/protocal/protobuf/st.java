package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class st extends com.tencent.mm.bt.a
{
  public int wah;
  public SKBuiltinBuffer_t wai;
  public int waj;
  public SKBuiltinBuffer_t wak;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(126189);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.wai == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: OperationInfo");
        AppMethodBeat.o(126189);
        throw paramArrayOfObject;
      }
      paramArrayOfObject.iz(1, this.wah);
      if (this.wai != null)
      {
        paramArrayOfObject.iy(2, this.wai.computeSize());
        this.wai.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(3, this.waj);
      if (this.wak != null)
      {
        paramArrayOfObject.iy(4, this.wak.computeSize());
        this.wak.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(126189);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      int i;
      if (paramInt == 1)
      {
        i = e.a.a.b.b.a.bs(1, this.wah) + 0;
        paramInt = i;
        if (this.wai != null)
          paramInt = i + e.a.a.a.ix(2, this.wai.computeSize());
        i = paramInt + e.a.a.b.b.a.bs(3, this.waj);
        paramInt = i;
        if (this.wak != null)
          paramInt = i + e.a.a.a.ix(4, this.wak.computeSize());
        AppMethodBeat.o(126189);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.wai == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: OperationInfo");
          AppMethodBeat.o(126189);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(126189);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        st localst = (st)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(126189);
          break;
        case 1:
          localst.wah = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(126189);
          paramInt = 0;
          break;
        case 2:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new SKBuiltinBuffer_t();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localst.wai = paramArrayOfObject;
          }
          AppMethodBeat.o(126189);
          paramInt = 0;
          break;
        case 3:
          localst.waj = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(126189);
          paramInt = 0;
          break;
        case 4:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new SKBuiltinBuffer_t();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localst.wak = paramArrayOfObject;
          }
          AppMethodBeat.o(126189);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(126189);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.st
 * JD-Core Version:    0.6.2
 */