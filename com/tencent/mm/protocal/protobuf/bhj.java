package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bt.b;
import java.util.LinkedList;

public final class bhj extends bsr
{
  public String csB;
  public String wKw;
  public b wKx;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(56873);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      if (this.csB != null)
        paramArrayOfObject.e(2, this.csB);
      if (this.wKw != null)
        paramArrayOfObject.e(3, this.wKw);
      if (this.wKx != null)
        paramArrayOfObject.c(4, this.wKx);
      AppMethodBeat.o(56873);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label517;
    label517: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.csB != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.csB);
      paramInt = i;
      if (this.wKw != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.wKw);
      i = paramInt;
      if (this.wKx != null)
        i = paramInt + e.a.a.b.b.a.b(4, this.wKx);
      AppMethodBeat.o(56873);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(56873);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        bhj localbhj = (bhj)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(56873);
          break;
        case 1:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new hl();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((hl)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbhj.BaseRequest = ((hl)localObject1);
          }
          AppMethodBeat.o(56873);
          paramInt = i;
          break;
        case 2:
          localbhj.csB = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56873);
          paramInt = i;
          break;
        case 3:
          localbhj.wKw = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56873);
          paramInt = i;
          break;
        case 4:
          localbhj.wKx = ((e.a.a.a.a)localObject1).BTU.emu();
          AppMethodBeat.o(56873);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(56873);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bhj
 * JD-Core Version:    0.6.2
 */