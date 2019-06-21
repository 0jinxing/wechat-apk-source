package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class brp extends bsr
{
  public com.tencent.mm.bt.b wTP;
  public int wTQ;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(58928);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.wTP == null)
      {
        paramArrayOfObject = new e.a.a.b("Not all required fields were included: clientCheckData");
        AppMethodBeat.o(58928);
        throw paramArrayOfObject;
      }
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      if (this.wTP != null)
        paramArrayOfObject.c(2, this.wTP);
      paramArrayOfObject.iz(3, this.wTQ);
      AppMethodBeat.o(58928);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label481;
    label481: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.wTP != null)
        i = paramInt + e.a.a.b.b.a.b(2, this.wTP);
      paramInt = i + e.a.a.b.b.a.bs(3, this.wTQ);
      AppMethodBeat.o(58928);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.wTP == null)
        {
          paramArrayOfObject = new e.a.a.b("Not all required fields were included: clientCheckData");
          AppMethodBeat.o(58928);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(58928);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        brp localbrp = (brp)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(58928);
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
            localbrp.BaseRequest = paramArrayOfObject;
          }
          AppMethodBeat.o(58928);
          paramInt = i;
          break;
        case 2:
          localbrp.wTP = ((e.a.a.a.a)localObject1).BTU.emu();
          AppMethodBeat.o(58928);
          paramInt = i;
          break;
        case 3:
          localbrp.wTQ = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(58928);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(58928);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.brp
 * JD-Core Version:    0.6.2
 */