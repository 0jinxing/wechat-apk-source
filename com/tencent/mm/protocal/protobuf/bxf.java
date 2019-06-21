package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class bxf extends bsr
{
  public String mxc;
  public long wXn;
  public long wXo;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(10240);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      if (this.mxc != null)
        paramArrayOfObject.e(2, this.mxc);
      paramArrayOfObject.ai(3, this.wXn);
      paramArrayOfObject.ai(4, this.wXo);
      AppMethodBeat.o(10240);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label491;
    label491: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.mxc != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.mxc);
      paramInt = i + e.a.a.b.b.a.o(3, this.wXn) + e.a.a.b.b.a.o(4, this.wXo);
      AppMethodBeat.o(10240);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(10240);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        bxf localbxf = (bxf)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(10240);
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
            localbxf.BaseRequest = ((hl)localObject1);
          }
          AppMethodBeat.o(10240);
          paramInt = i;
          break;
        case 2:
          localbxf.mxc = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(10240);
          paramInt = i;
          break;
        case 3:
          localbxf.wXn = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(10240);
          paramInt = i;
          break;
        case 4:
          localbxf.wXo = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(10240);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(10240);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bxf
 * JD-Core Version:    0.6.2
 */