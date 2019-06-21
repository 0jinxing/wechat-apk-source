package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class blw extends bsr
{
  public String wOT;
  public String wOU;
  public String wOV;
  public String wOW;
  public String wOX;
  public int wOY;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(28577);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      if (this.wOT != null)
        paramArrayOfObject.e(2, this.wOT);
      if (this.wOU != null)
        paramArrayOfObject.e(3, this.wOU);
      if (this.wOV != null)
        paramArrayOfObject.e(4, this.wOV);
      if (this.wOW != null)
        paramArrayOfObject.e(5, this.wOW);
      if (this.wOX != null)
        paramArrayOfObject.e(6, this.wOX);
      paramArrayOfObject.iz(7, this.wOY);
      AppMethodBeat.o(28577);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label703;
    label703: for (i = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.wOT != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.wOT);
      i = paramInt;
      if (this.wOU != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.wOU);
      paramInt = i;
      if (this.wOV != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.wOV);
      i = paramInt;
      if (this.wOW != null)
        i = paramInt + e.a.a.b.b.a.f(5, this.wOW);
      paramInt = i;
      if (this.wOX != null)
        paramInt = i + e.a.a.b.b.a.f(6, this.wOX);
      paramInt += e.a.a.b.b.a.bs(7, this.wOY);
      AppMethodBeat.o(28577);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(28577);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        blw localblw = (blw)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(28577);
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
            localblw.BaseRequest = ((hl)localObject1);
          }
          AppMethodBeat.o(28577);
          paramInt = i;
          break;
        case 2:
          localblw.wOT = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28577);
          paramInt = i;
          break;
        case 3:
          localblw.wOU = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28577);
          paramInt = i;
          break;
        case 4:
          localblw.wOV = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28577);
          paramInt = i;
          break;
        case 5:
          localblw.wOW = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28577);
          paramInt = i;
          break;
        case 6:
          localblw.wOX = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28577);
          paramInt = i;
          break;
        case 7:
          localblw.wOY = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28577);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(28577);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.blw
 * JD-Core Version:    0.6.2
 */