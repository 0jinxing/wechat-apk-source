package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class akr extends bsr
{
  public double latitude;
  public double longitude;
  public int offset;
  public int scene;
  public int vKW;
  public int wnj;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(89095);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(2, this.offset);
      paramArrayOfObject.iz(3, this.vKW);
      paramArrayOfObject.f(4, this.latitude);
      paramArrayOfObject.f(5, this.longitude);
      paramArrayOfObject.iz(6, this.scene);
      paramArrayOfObject.iz(7, this.wnj);
      AppMethodBeat.o(89095);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label604;
    label604: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      paramInt = paramInt + e.a.a.b.b.a.bs(2, this.offset) + e.a.a.b.b.a.bs(3, this.vKW) + (e.a.a.b.b.a.fv(4) + 8) + (e.a.a.b.b.a.fv(5) + 8) + e.a.a.b.b.a.bs(6, this.scene) + e.a.a.b.b.a.bs(7, this.wnj);
      AppMethodBeat.o(89095);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(89095);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        akr localakr = (akr)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(89095);
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
            localakr.BaseRequest = ((hl)localObject1);
          }
          AppMethodBeat.o(89095);
          paramInt = i;
          break;
        case 2:
          localakr.offset = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(89095);
          paramInt = i;
          break;
        case 3:
          localakr.vKW = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(89095);
          paramInt = i;
          break;
        case 4:
          localakr.latitude = Double.longBitsToDouble(((e.a.a.a.a)localObject1).BTU.eib());
          AppMethodBeat.o(89095);
          paramInt = i;
          break;
        case 5:
          localakr.longitude = Double.longBitsToDouble(((e.a.a.a.a)localObject1).BTU.eib());
          AppMethodBeat.o(89095);
          paramInt = i;
          break;
        case 6:
          localakr.scene = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(89095);
          paramInt = i;
          break;
        case 7:
          localakr.wnj = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(89095);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(89095);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.akr
 * JD-Core Version:    0.6.2
 */