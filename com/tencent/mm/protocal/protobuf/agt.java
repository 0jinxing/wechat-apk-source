package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class agt extends bsr
{
  public String kfA;
  public double latitude;
  public double longitude;
  public String wnm;
  public String wnn;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(89087);
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
      if (this.kfA != null)
        paramArrayOfObject.e(4, this.kfA);
      if (this.wnm != null)
        paramArrayOfObject.e(5, this.wnm);
      if (this.wnn != null)
        paramArrayOfObject.e(6, this.wnn);
      AppMethodBeat.o(89087);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label612;
    label612: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      paramInt = paramInt + (e.a.a.b.b.a.fv(2) + 8) + (e.a.a.b.b.a.fv(3) + 8);
      i = paramInt;
      if (this.kfA != null)
        i = paramInt + e.a.a.b.b.a.f(4, this.kfA);
      paramInt = i;
      if (this.wnm != null)
        paramInt = i + e.a.a.b.b.a.f(5, this.wnm);
      i = paramInt;
      if (this.wnn != null)
        i = paramInt + e.a.a.b.b.a.f(6, this.wnn);
      AppMethodBeat.o(89087);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(89087);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        agt localagt = (agt)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(89087);
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
            localagt.BaseRequest = paramArrayOfObject;
          }
          AppMethodBeat.o(89087);
          paramInt = i;
          break;
        case 2:
          localagt.latitude = Double.longBitsToDouble(((e.a.a.a.a)localObject1).BTU.eib());
          AppMethodBeat.o(89087);
          paramInt = i;
          break;
        case 3:
          localagt.longitude = Double.longBitsToDouble(((e.a.a.a.a)localObject1).BTU.eib());
          AppMethodBeat.o(89087);
          paramInt = i;
          break;
        case 4:
          localagt.kfA = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(89087);
          paramInt = i;
          break;
        case 5:
          localagt.wnm = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(89087);
          paramInt = i;
          break;
        case 6:
          localagt.wnn = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(89087);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(89087);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.agt
 * JD-Core Version:    0.6.2
 */