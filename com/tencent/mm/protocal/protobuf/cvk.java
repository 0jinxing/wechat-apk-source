package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class cvk extends btd
{
  public int vOq;
  public String vOy;
  public int wCB;
  public int wXX;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(124388);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.vOy == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: Json");
        AppMethodBeat.o(124388);
        throw paramArrayOfObject;
      }
      if (this.BaseResponse != null)
      {
        paramArrayOfObject.iy(1, this.BaseResponse.computeSize());
        this.BaseResponse.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(2, this.wCB);
      paramArrayOfObject.iz(3, this.vOq);
      if (this.vOy != null)
        paramArrayOfObject.e(4, this.vOy);
      paramArrayOfObject.iz(5, this.wXX);
      AppMethodBeat.o(124388);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label575;
    label575: for (paramInt = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.wCB) + e.a.a.b.b.a.bs(3, this.vOq);
      paramInt = i;
      if (this.vOy != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.vOy);
      paramInt += e.a.a.b.b.a.bs(5, this.wXX);
      AppMethodBeat.o(124388);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = btd.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = btd.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.vOy == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: Json");
          AppMethodBeat.o(124388);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(124388);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        cvk localcvk = (cvk)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(124388);
          break;
        case 1:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new BaseResponse();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcvk.BaseResponse = paramArrayOfObject;
          }
          AppMethodBeat.o(124388);
          paramInt = i;
          break;
        case 2:
          localcvk.wCB = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(124388);
          paramInt = i;
          break;
        case 3:
          localcvk.vOq = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(124388);
          paramInt = i;
          break;
        case 4:
          localcvk.vOy = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(124388);
          paramInt = i;
          break;
        case 5:
          localcvk.wXX = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(124388);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(124388);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cvk
 * JD-Core Version:    0.6.2
 */