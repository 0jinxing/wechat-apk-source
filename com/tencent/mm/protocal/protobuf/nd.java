package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class nd extends bsr
{
  public String vHD;
  public int vRK;
  public int vRL;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(56735);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.vHD == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: ReqKey");
        AppMethodBeat.o(56735);
        throw paramArrayOfObject;
      }
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(2, this.vRK);
      paramArrayOfObject.iz(3, this.vRL);
      if (this.vHD != null)
        paramArrayOfObject.e(4, this.vHD);
      AppMethodBeat.o(56735);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label529;
    label529: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.vRK) + e.a.a.b.b.a.bs(3, this.vRL);
      paramInt = i;
      if (this.vHD != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.vHD);
      AppMethodBeat.o(56735);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.vHD == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: ReqKey");
          AppMethodBeat.o(56735);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(56735);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        nd localnd = (nd)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(56735);
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
            localnd.BaseRequest = ((hl)localObject1);
          }
          AppMethodBeat.o(56735);
          paramInt = i;
          break;
        case 2:
          localnd.vRK = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56735);
          paramInt = i;
          break;
        case 3:
          localnd.vRL = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56735);
          paramInt = i;
          break;
        case 4:
          localnd.vHD = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56735);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(56735);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.nd
 * JD-Core Version:    0.6.2
 */