package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class bwd extends bsr
{
  public String jBB;
  public String ncM;
  public int wIi;
  public String wWU;
  public int wrF;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(80182);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      if (this.jBB != null)
        paramArrayOfObject.e(2, this.jBB);
      if (this.ncM != null)
        paramArrayOfObject.e(3, this.ncM);
      paramArrayOfObject.iz(4, this.wIi);
      paramArrayOfObject.iz(5, this.wrF);
      if (this.wWU != null)
        paramArrayOfObject.e(6, this.wWU);
      AppMethodBeat.o(80182);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label606;
    label606: for (i = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.jBB != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.jBB);
      i = paramInt;
      if (this.ncM != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.ncM);
      i = i + e.a.a.b.b.a.bs(4, this.wIi) + e.a.a.b.b.a.bs(5, this.wrF);
      paramInt = i;
      if (this.wWU != null)
        paramInt = i + e.a.a.b.b.a.f(6, this.wWU);
      AppMethodBeat.o(80182);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(80182);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        bwd localbwd = (bwd)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(80182);
          break;
        case 1:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new hl();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbwd.BaseRequest = paramArrayOfObject;
          }
          AppMethodBeat.o(80182);
          paramInt = i;
          break;
        case 2:
          localbwd.jBB = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(80182);
          paramInt = i;
          break;
        case 3:
          localbwd.ncM = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(80182);
          paramInt = i;
          break;
        case 4:
          localbwd.wIi = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(80182);
          paramInt = i;
          break;
        case 5:
          localbwd.wrF = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(80182);
          paramInt = i;
          break;
        case 6:
          localbwd.wWU = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(80182);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(80182);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bwd
 * JD-Core Version:    0.6.2
 */