package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class agp extends bsr
{
  public double latitude;
  public double longitude;
  public String vSR;
  public long vTi;
  public int wnj;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(89082);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      if (this.vSR != null)
        paramArrayOfObject.e(2, this.vSR);
      paramArrayOfObject.f(3, this.latitude);
      paramArrayOfObject.f(4, this.longitude);
      paramArrayOfObject.ai(5, this.vTi);
      paramArrayOfObject.iz(6, this.wnj);
      AppMethodBeat.o(89082);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label577;
    label577: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.vSR != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.vSR);
      paramInt = i + (e.a.a.b.b.a.fv(3) + 8) + (e.a.a.b.b.a.fv(4) + 8) + e.a.a.b.b.a.o(5, this.vTi) + e.a.a.b.b.a.bs(6, this.wnj);
      AppMethodBeat.o(89082);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(89082);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        agp localagp = (agp)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(89082);
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
            localagp.BaseRequest = ((hl)localObject1);
          }
          AppMethodBeat.o(89082);
          paramInt = i;
          break;
        case 2:
          localagp.vSR = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(89082);
          paramInt = i;
          break;
        case 3:
          localagp.latitude = Double.longBitsToDouble(((e.a.a.a.a)localObject1).BTU.eib());
          AppMethodBeat.o(89082);
          paramInt = i;
          break;
        case 4:
          localagp.longitude = Double.longBitsToDouble(((e.a.a.a.a)localObject1).BTU.eib());
          AppMethodBeat.o(89082);
          paramInt = i;
          break;
        case 5:
          localagp.vTi = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(89082);
          paramInt = i;
          break;
        case 6:
          localagp.wnj = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(89082);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(89082);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.agp
 * JD-Core Version:    0.6.2
 */