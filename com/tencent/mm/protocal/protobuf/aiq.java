package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class aiq extends btd
{
  public LinkedList<dq> vHk;
  public int woD;
  public int woE;
  public LinkedList<Integer> woF;
  public LinkedList<zf> woG;
  public int woH;

  public aiq()
  {
    AppMethodBeat.i(73653);
    this.woF = new LinkedList();
    this.woG = new LinkedList();
    this.vHk = new LinkedList();
    AppMethodBeat.o(73653);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(73654);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(73654);
        throw paramArrayOfObject;
      }
      if (this.BaseResponse != null)
      {
        paramArrayOfObject.iy(1, this.BaseResponse.computeSize());
        this.BaseResponse.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(2, this.woD);
      paramArrayOfObject.iz(3, this.woE);
      paramArrayOfObject.e(4, 2, this.woF);
      paramArrayOfObject.e(5, 8, this.woG);
      paramArrayOfObject.iz(6, this.woH);
      paramArrayOfObject.e(7, 8, this.vHk);
      AppMethodBeat.o(73654);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label859;
    label859: for (paramInt = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; paramInt = 0)
    {
      paramInt = paramInt + e.a.a.b.b.a.bs(2, this.woD) + e.a.a.b.b.a.bs(3, this.woE) + e.a.a.a.c(4, 2, this.woF) + e.a.a.a.c(5, 8, this.woG) + e.a.a.b.b.a.bs(6, this.woH) + e.a.a.a.c(7, 8, this.vHk);
      AppMethodBeat.o(73654);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.woF.clear();
        this.woG.clear();
        this.vHk.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = btd.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = btd.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.BaseResponse == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
          AppMethodBeat.o(73654);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(73654);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        aiq localaiq = (aiq)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(73654);
          break;
        case 1:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new BaseResponse();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((BaseResponse)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localaiq.BaseResponse = ((BaseResponse)localObject1);
          }
          AppMethodBeat.o(73654);
          paramInt = i;
          break;
        case 2:
          localaiq.woD = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(73654);
          paramInt = i;
          break;
        case 3:
          localaiq.woE = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(73654);
          paramInt = i;
          break;
        case 4:
          localaiq.woF.add(Integer.valueOf(((e.a.a.a.a)localObject1).BTU.vd()));
          AppMethodBeat.o(73654);
          paramInt = i;
          break;
        case 5:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new zf();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((zf)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localaiq.woG.add(localObject1);
          }
          AppMethodBeat.o(73654);
          paramInt = i;
          break;
        case 6:
          localaiq.woH = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(73654);
          paramInt = i;
          break;
        case 7:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new dq();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((dq)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localaiq.vHk.add(localObject1);
          }
          AppMethodBeat.o(73654);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(73654);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.aiq
 * JD-Core Version:    0.6.2
 */