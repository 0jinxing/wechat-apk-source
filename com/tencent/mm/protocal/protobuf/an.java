package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class an extends bsr
{
  public int vBA;
  public String vBB;
  public String vBC;
  public boolean vBD;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(88998);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(2, this.vBA);
      if (this.vBB != null)
        paramArrayOfObject.e(3, this.vBB);
      if (this.vBC != null)
        paramArrayOfObject.e(4, this.vBC);
      paramArrayOfObject.aO(5, this.vBD);
      AppMethodBeat.o(88998);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label544;
    label544: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.vBA);
      paramInt = i;
      if (this.vBB != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.vBB);
      i = paramInt;
      if (this.vBC != null)
        i = paramInt + e.a.a.b.b.a.f(4, this.vBC);
      paramInt = i + (e.a.a.b.b.a.fv(5) + 1);
      AppMethodBeat.o(88998);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(88998);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        an localan = (an)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(88998);
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
            localan.BaseRequest = ((hl)localObject1);
          }
          AppMethodBeat.o(88998);
          paramInt = i;
          break;
        case 2:
          localan.vBA = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(88998);
          paramInt = i;
          break;
        case 3:
          localan.vBB = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(88998);
          paramInt = i;
          break;
        case 4:
          localan.vBC = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(88998);
          paramInt = i;
          break;
        case 5:
          localan.vBD = ((e.a.a.a.a)localObject1).BTU.ehX();
          AppMethodBeat.o(88998);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(88998);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.an
 * JD-Core Version:    0.6.2
 */