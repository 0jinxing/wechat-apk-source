package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class ajc extends btd
{
  public int OpCode;
  public String woW;
  public mk woX;
  public long woY;
  public cm woZ;
  public int wpa;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(59564);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(59564);
        throw paramArrayOfObject;
      }
      if (this.BaseResponse != null)
      {
        paramArrayOfObject.iy(1, this.BaseResponse.computeSize());
        this.BaseResponse.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(2, this.OpCode);
      paramArrayOfObject.ai(3, this.woY);
      if (this.woZ != null)
      {
        paramArrayOfObject.iy(4, this.woZ.computeSize());
        this.woZ.writeFields(paramArrayOfObject);
      }
      if (this.woW != null)
        paramArrayOfObject.e(5, this.woW);
      paramArrayOfObject.iz(6, this.wpa);
      if (this.woX != null)
      {
        paramArrayOfObject.iy(7, this.woX.computeSize());
        this.woX.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(59564);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label893;
    label893: for (paramInt = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.OpCode) + e.a.a.b.b.a.o(3, this.woY);
      paramInt = i;
      if (this.woZ != null)
        paramInt = i + e.a.a.a.ix(4, this.woZ.computeSize());
      i = paramInt;
      if (this.woW != null)
        i = paramInt + e.a.a.b.b.a.f(5, this.woW);
      i += e.a.a.b.b.a.bs(6, this.wpa);
      paramInt = i;
      if (this.woX != null)
        paramInt = i + e.a.a.a.ix(7, this.woX.computeSize());
      AppMethodBeat.o(59564);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = btd.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = btd.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.BaseResponse == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
          AppMethodBeat.o(59564);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(59564);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        ajc localajc = (ajc)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(59564);
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
            localajc.BaseResponse = paramArrayOfObject;
          }
          AppMethodBeat.o(59564);
          paramInt = i;
          break;
        case 2:
          localajc.OpCode = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(59564);
          paramInt = i;
          break;
        case 3:
          localajc.woY = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(59564);
          paramInt = i;
          break;
        case 4:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new cm();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localajc.woZ = paramArrayOfObject;
          }
          AppMethodBeat.o(59564);
          paramInt = i;
          break;
        case 5:
          localajc.woW = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(59564);
          paramInt = i;
          break;
        case 6:
          localajc.wpa = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(59564);
          paramInt = i;
          break;
        case 7:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new mk();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localajc.woX = paramArrayOfObject;
          }
          AppMethodBeat.o(59564);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(59564);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.ajc
 * JD-Core Version:    0.6.2
 */