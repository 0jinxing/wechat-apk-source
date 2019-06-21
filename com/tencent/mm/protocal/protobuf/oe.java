package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class oe extends bsr
{
  public float cEB;
  public float cGm;
  public String cMC;
  public String kbU;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(89040);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      if (this.kbU != null)
        paramArrayOfObject.e(2, this.kbU);
      paramArrayOfObject.r(3, this.cGm);
      paramArrayOfObject.r(4, this.cEB);
      if (this.cMC != null)
        paramArrayOfObject.e(5, this.cMC);
      AppMethodBeat.o(89040);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label546;
    label546: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.kbU != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.kbU);
      i = i + (e.a.a.b.b.a.fv(3) + 4) + (e.a.a.b.b.a.fv(4) + 4);
      paramInt = i;
      if (this.cMC != null)
        paramInt = i + e.a.a.b.b.a.f(5, this.cMC);
      AppMethodBeat.o(89040);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(89040);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        oe localoe = (oe)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(89040);
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
            localoe.BaseRequest = ((hl)localObject1);
          }
          AppMethodBeat.o(89040);
          paramInt = i;
          break;
        case 2:
          localoe.kbU = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(89040);
          paramInt = i;
          break;
        case 3:
          localoe.cGm = Float.intBitsToFloat(((e.a.a.a.a)localObject1).BTU.eia());
          AppMethodBeat.o(89040);
          paramInt = i;
          break;
        case 4:
          localoe.cEB = Float.intBitsToFloat(((e.a.a.a.a)localObject1).BTU.eia());
          AppMethodBeat.o(89040);
          paramInt = i;
          break;
        case 5:
          localoe.cMC = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(89040);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(89040);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.oe
 * JD-Core Version:    0.6.2
 */