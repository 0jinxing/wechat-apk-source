package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class cce extends bsr
{
  public int OpCode;
  public String ncF;
  public long xbt;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(94614);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(2, this.OpCode);
      paramArrayOfObject.ai(3, this.xbt);
      if (this.ncF != null)
        paramArrayOfObject.e(4, this.ncF);
      AppMethodBeat.o(94614);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label481;
    label481: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.OpCode) + e.a.a.b.b.a.o(3, this.xbt);
      paramInt = i;
      if (this.ncF != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.ncF);
      AppMethodBeat.o(94614);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(94614);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        cce localcce = (cce)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(94614);
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
            localcce.BaseRequest = ((hl)localObject1);
          }
          AppMethodBeat.o(94614);
          paramInt = i;
          break;
        case 2:
          localcce.OpCode = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(94614);
          paramInt = i;
          break;
        case 3:
          localcce.xbt = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(94614);
          paramInt = i;
          break;
        case 4:
          localcce.ncF = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(94614);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(94614);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cce
 * JD-Core Version:    0.6.2
 */