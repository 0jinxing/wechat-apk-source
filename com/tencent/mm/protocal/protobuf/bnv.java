package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class bnv extends bsr
{
  public String vPX;
  public boolean wQW;
  public int wQX;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(48939);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      if (this.vPX != null)
        paramArrayOfObject.e(2, this.vPX);
      paramArrayOfObject.aO(3, this.wQW);
      paramArrayOfObject.iz(4, this.wQX);
      AppMethodBeat.o(48939);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label476;
    label476: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.vPX != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.vPX);
      paramInt = i + (e.a.a.b.b.a.fv(3) + 1) + e.a.a.b.b.a.bs(4, this.wQX);
      AppMethodBeat.o(48939);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(48939);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        bnv localbnv = (bnv)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(48939);
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
            localbnv.BaseRequest = paramArrayOfObject;
          }
          AppMethodBeat.o(48939);
          paramInt = i;
          break;
        case 2:
          localbnv.vPX = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48939);
          paramInt = i;
          break;
        case 3:
          localbnv.wQW = ((e.a.a.a.a)localObject1).BTU.ehX();
          AppMethodBeat.o(48939);
          paramInt = i;
          break;
        case 4:
          localbnv.wQX = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(48939);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(48939);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bnv
 * JD-Core Version:    0.6.2
 */