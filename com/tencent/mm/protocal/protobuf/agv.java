package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class agv extends bsr
{
  public double latitude;
  public double longitude;
  public int scene;
  public String wno;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(89089);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.f(2, this.latitude);
      paramArrayOfObject.f(3, this.longitude);
      paramArrayOfObject.iz(4, this.scene);
      if (this.wno != null)
        paramArrayOfObject.e(5, this.wno);
      AppMethodBeat.o(89089);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label529;
    label529: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + (e.a.a.b.b.a.fv(2) + 8) + (e.a.a.b.b.a.fv(3) + 8) + e.a.a.b.b.a.bs(4, this.scene);
      paramInt = i;
      if (this.wno != null)
        paramInt = i + e.a.a.b.b.a.f(5, this.wno);
      AppMethodBeat.o(89089);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(89089);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        agv localagv = (agv)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(89089);
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
            localagv.BaseRequest = paramArrayOfObject;
          }
          AppMethodBeat.o(89089);
          paramInt = i;
          break;
        case 2:
          localagv.latitude = Double.longBitsToDouble(((e.a.a.a.a)localObject1).BTU.eib());
          AppMethodBeat.o(89089);
          paramInt = i;
          break;
        case 3:
          localagv.longitude = Double.longBitsToDouble(((e.a.a.a.a)localObject1).BTU.eib());
          AppMethodBeat.o(89089);
          paramInt = i;
          break;
        case 4:
          localagv.scene = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(89089);
          paramInt = i;
          break;
        case 5:
          localagv.wno = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(89089);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(89089);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.agv
 * JD-Core Version:    0.6.2
 */