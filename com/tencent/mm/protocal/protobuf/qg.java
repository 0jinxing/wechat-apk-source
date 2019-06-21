package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class qg extends bsr
{
  public String fKh;
  public int vFH;
  public String vMJ;
  public long vXq;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(112418);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(2, this.vFH);
      if (this.vMJ != null)
        paramArrayOfObject.e(3, this.vMJ);
      if (this.fKh != null)
        paramArrayOfObject.e(4, this.fKh);
      paramArrayOfObject.ai(5, this.vXq);
      AppMethodBeat.o(112418);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label544;
    label544: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.vFH);
      paramInt = i;
      if (this.vMJ != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.vMJ);
      i = paramInt;
      if (this.fKh != null)
        i = paramInt + e.a.a.b.b.a.f(4, this.fKh);
      paramInt = i + e.a.a.b.b.a.o(5, this.vXq);
      AppMethodBeat.o(112418);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(112418);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        qg localqg = (qg)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(112418);
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
            localqg.BaseRequest = ((hl)localObject1);
          }
          AppMethodBeat.o(112418);
          paramInt = i;
          break;
        case 2:
          localqg.vFH = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(112418);
          paramInt = i;
          break;
        case 3:
          localqg.vMJ = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(112418);
          paramInt = i;
          break;
        case 4:
          localqg.fKh = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(112418);
          paramInt = i;
          break;
        case 5:
          localqg.vXq = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(112418);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(112418);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.qg
 * JD-Core Version:    0.6.2
 */