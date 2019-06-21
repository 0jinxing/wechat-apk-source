package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class ayo extends btd
{
  public int wCn;
  public int wCp;
  public LinkedList<aym> wCr;
  public LinkedList<aym> wCs;
  public String wdB;

  public ayo()
  {
    AppMethodBeat.i(73735);
    this.wCr = new LinkedList();
    this.wCs = new LinkedList();
    AppMethodBeat.o(73735);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(73736);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(73736);
        throw paramArrayOfObject;
      }
      if (this.BaseResponse != null)
      {
        paramArrayOfObject.iy(1, this.BaseResponse.computeSize());
        this.BaseResponse.writeFields(paramArrayOfObject);
      }
      if (this.wdB != null)
        paramArrayOfObject.e(2, this.wdB);
      paramArrayOfObject.iz(3, this.wCn);
      paramArrayOfObject.e(4, 8, this.wCr);
      paramArrayOfObject.iz(5, this.wCp);
      paramArrayOfObject.e(6, 8, this.wCs);
      AppMethodBeat.o(73736);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label811;
    label811: for (paramInt = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.wdB != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.wdB);
      paramInt = i + e.a.a.b.b.a.bs(3, this.wCn) + e.a.a.a.c(4, 8, this.wCr) + e.a.a.b.b.a.bs(5, this.wCp) + e.a.a.a.c(6, 8, this.wCs);
      AppMethodBeat.o(73736);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.wCr.clear();
        this.wCs.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = btd.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = btd.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.BaseResponse == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
          AppMethodBeat.o(73736);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(73736);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        ayo localayo = (ayo)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(73736);
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
            localayo.BaseResponse = paramArrayOfObject;
          }
          AppMethodBeat.o(73736);
          paramInt = i;
          break;
        case 2:
          localayo.wdB = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(73736);
          paramInt = i;
          break;
        case 3:
          localayo.wCn = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(73736);
          paramInt = i;
          break;
        case 4:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new aym();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((aym)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localayo.wCr.add(localObject1);
          }
          AppMethodBeat.o(73736);
          paramInt = i;
          break;
        case 5:
          localayo.wCp = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(73736);
          paramInt = i;
          break;
        case 6:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new aym();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localayo.wCs.add(paramArrayOfObject);
          }
          AppMethodBeat.o(73736);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(73736);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.ayo
 * JD-Core Version:    0.6.2
 */