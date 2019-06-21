package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bt.b;
import java.util.LinkedList;

public final class pi extends bsr
{
  public String kCK;
  public int nUf;
  public b vWg;
  public b vWh;
  public int vWi = 4;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(56756);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(2, this.nUf);
      if (this.vWg != null)
        paramArrayOfObject.c(3, this.vWg);
      if (this.vWh != null)
        paramArrayOfObject.c(4, this.vWh);
      if (this.kCK != null)
        paramArrayOfObject.e(5, this.kCK);
      paramArrayOfObject.iz(6, this.vWi);
      AppMethodBeat.o(56756);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label610;
    label610: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.nUf);
      paramInt = i;
      if (this.vWg != null)
        paramInt = i + e.a.a.b.b.a.b(3, this.vWg);
      i = paramInt;
      if (this.vWh != null)
        i = paramInt + e.a.a.b.b.a.b(4, this.vWh);
      paramInt = i;
      if (this.kCK != null)
        paramInt = i + e.a.a.b.b.a.f(5, this.kCK);
      paramInt += e.a.a.b.b.a.bs(6, this.vWi);
      AppMethodBeat.o(56756);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(56756);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        pi localpi = (pi)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(56756);
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
            localpi.BaseRequest = paramArrayOfObject;
          }
          AppMethodBeat.o(56756);
          paramInt = i;
          break;
        case 2:
          localpi.nUf = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56756);
          paramInt = i;
          break;
        case 3:
          localpi.vWg = ((e.a.a.a.a)localObject1).BTU.emu();
          AppMethodBeat.o(56756);
          paramInt = i;
          break;
        case 4:
          localpi.vWh = ((e.a.a.a.a)localObject1).BTU.emu();
          AppMethodBeat.o(56756);
          paramInt = i;
          break;
        case 5:
          localpi.kCK = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56756);
          paramInt = i;
          break;
        case 6:
          localpi.vWi = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56756);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(56756);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.pi
 * JD-Core Version:    0.6.2
 */