package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class ayv extends com.tencent.mm.bt.a
{
  public String eUt;
  public String eUu;
  public cnw wCL;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(2532);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.eUt == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: cityName");
        AppMethodBeat.o(2532);
        throw paramArrayOfObject;
      }
      if (this.eUu == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: poiName");
        AppMethodBeat.o(2532);
        throw paramArrayOfObject;
      }
      if (this.wCL == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: matrix");
        AppMethodBeat.o(2532);
        throw paramArrayOfObject;
      }
      if (this.eUt != null)
        paramArrayOfObject.e(1, this.eUt);
      if (this.eUu != null)
        paramArrayOfObject.e(2, this.eUu);
      if (this.wCL != null)
      {
        paramArrayOfObject.iy(4, this.wCL.computeSize());
        this.wCL.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(2532);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.eUt == null)
        break label614;
    label614: for (i = e.a.a.b.b.a.f(1, this.eUt) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.eUu != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.eUu);
      i = paramInt;
      if (this.wCL != null)
        i = paramInt + e.a.a.a.ix(4, this.wCL.computeSize());
      AppMethodBeat.o(2532);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.eUt == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: cityName");
          AppMethodBeat.o(2532);
          throw paramArrayOfObject;
        }
        if (this.eUu == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: poiName");
          AppMethodBeat.o(2532);
          throw paramArrayOfObject;
        }
        if (this.wCL == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: matrix");
          AppMethodBeat.o(2532);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(2532);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        ayv localayv = (ayv)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        case 3:
        default:
          AppMethodBeat.o(2532);
          paramInt = -1;
          break;
        case 1:
          localayv.eUt = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(2532);
          paramInt = i;
          break;
        case 2:
          localayv.eUu = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(2532);
          paramInt = i;
          break;
        case 4:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new cnw();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localayv.wCL = paramArrayOfObject;
          }
          AppMethodBeat.o(2532);
          paramInt = i;
          break;
        }
      }
      AppMethodBeat.o(2532);
      paramInt = -1;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.ayv
 * JD-Core Version:    0.6.2
 */