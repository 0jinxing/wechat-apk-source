package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class chc extends btd
{
  public LinkedList<chd> xfW;
  public int xfX;
  public int xfY;
  public int xfZ;

  public chc()
  {
    AppMethodBeat.i(11817);
    this.xfW = new LinkedList();
    AppMethodBeat.o(11817);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(11818);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(11818);
        throw paramArrayOfObject;
      }
      if (this.BaseResponse != null)
      {
        paramArrayOfObject.iy(1, this.BaseResponse.computeSize());
        this.BaseResponse.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.e(2, 8, this.xfW);
      paramArrayOfObject.iz(3, this.xfX);
      paramArrayOfObject.iz(4, this.xfY);
      paramArrayOfObject.iz(5, this.xfZ);
      AppMethodBeat.o(11818);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label666;
    label666: for (paramInt = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; paramInt = 0)
    {
      paramInt = paramInt + e.a.a.a.c(2, 8, this.xfW) + e.a.a.b.b.a.bs(3, this.xfX) + e.a.a.b.b.a.bs(4, this.xfY) + e.a.a.b.b.a.bs(5, this.xfZ);
      AppMethodBeat.o(11818);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.xfW.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = btd.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = btd.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.BaseResponse == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
          AppMethodBeat.o(11818);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(11818);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        chc localchc = (chc)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(11818);
          break;
        case 1:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new BaseResponse();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localchc.BaseResponse = paramArrayOfObject;
          }
          AppMethodBeat.o(11818);
          paramInt = i;
          break;
        case 2:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new chd();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localchc.xfW.add(paramArrayOfObject);
          }
          AppMethodBeat.o(11818);
          paramInt = i;
          break;
        case 3:
          localchc.xfX = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(11818);
          paramInt = i;
          break;
        case 4:
          localchc.xfY = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(11818);
          paramInt = i;
          break;
        case 5:
          localchc.xfZ = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(11818);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(11818);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.chc
 * JD-Core Version:    0.6.2
 */