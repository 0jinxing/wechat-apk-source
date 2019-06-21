package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class cow extends bsr
{
  public long wOP;
  public long wen;
  public long xeF;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(135451);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.ai(2, this.xeF);
      paramArrayOfObject.ai(3, this.wen);
      paramArrayOfObject.ai(4, this.wOP);
      AppMethodBeat.o(135451);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label461;
    label461: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      paramInt = paramInt + e.a.a.b.b.a.o(2, this.xeF) + e.a.a.b.b.a.o(3, this.wen) + e.a.a.b.b.a.o(4, this.wOP);
      AppMethodBeat.o(135451);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(135451);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        cow localcow = (cow)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(135451);
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
            localcow.BaseRequest = ((hl)localObject1);
          }
          AppMethodBeat.o(135451);
          paramInt = i;
          break;
        case 2:
          localcow.xeF = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(135451);
          paramInt = i;
          break;
        case 3:
          localcow.wen = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(135451);
          paramInt = i;
          break;
        case 4:
          localcow.wOP = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(135451);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(135451);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cow
 * JD-Core Version:    0.6.2
 */