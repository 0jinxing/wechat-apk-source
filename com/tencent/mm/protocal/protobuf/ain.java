package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bt.b;
import java.util.LinkedList;

public final class ain extends bsr
{
  public String extra;
  public int vBd;
  public b woy;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(80071);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(2, this.vBd);
      if (this.extra != null)
        paramArrayOfObject.e(3, this.extra);
      if (this.woy != null)
        paramArrayOfObject.c(4, this.woy);
      AppMethodBeat.o(80071);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label500;
    label500: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.vBd);
      paramInt = i;
      if (this.extra != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.extra);
      i = paramInt;
      if (this.woy != null)
        i = paramInt + e.a.a.b.b.a.b(4, this.woy);
      AppMethodBeat.o(80071);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(80071);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        ain localain = (ain)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(80071);
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
            localain.BaseRequest = paramArrayOfObject;
          }
          AppMethodBeat.o(80071);
          paramInt = i;
          break;
        case 2:
          localain.vBd = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(80071);
          paramInt = i;
          break;
        case 3:
          localain.extra = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(80071);
          paramInt = i;
          break;
        case 4:
          localain.woy = ((e.a.a.a.a)localObject1).BTU.emu();
          AppMethodBeat.o(80071);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(80071);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.ain
 * JD-Core Version:    0.6.2
 */