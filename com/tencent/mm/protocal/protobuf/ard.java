package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class ard extends bsr
{
  public double wuQ;
  public double wuR;
  public String wuS;
  public boolean wuT;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(96237);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.f(2, this.wuQ);
      paramArrayOfObject.f(3, this.wuR);
      if (this.wuS != null)
        paramArrayOfObject.e(4, this.wuS);
      paramArrayOfObject.aO(5, this.wuT);
      AppMethodBeat.o(96237);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label530;
    label530: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + (e.a.a.b.b.a.fv(2) + 8) + (e.a.a.b.b.a.fv(3) + 8);
      paramInt = i;
      if (this.wuS != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.wuS);
      paramInt += e.a.a.b.b.a.fv(5) + 1;
      AppMethodBeat.o(96237);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(96237);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        ard localard = (ard)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(96237);
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
            localard.BaseRequest = ((hl)localObject1);
          }
          AppMethodBeat.o(96237);
          paramInt = i;
          break;
        case 2:
          localard.wuQ = Double.longBitsToDouble(((e.a.a.a.a)localObject1).BTU.eib());
          AppMethodBeat.o(96237);
          paramInt = i;
          break;
        case 3:
          localard.wuR = Double.longBitsToDouble(((e.a.a.a.a)localObject1).BTU.eib());
          AppMethodBeat.o(96237);
          paramInt = i;
          break;
        case 4:
          localard.wuS = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(96237);
          paramInt = i;
          break;
        case 5:
          localard.wuT = ((e.a.a.a.a)localObject1).BTU.ehX();
          AppMethodBeat.o(96237);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(96237);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.ard
 * JD-Core Version:    0.6.2
 */