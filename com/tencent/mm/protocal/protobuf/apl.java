package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class apl extends btd
{
  public cmd wcK;
  public com.tencent.mm.bt.b wtt;
  public LinkedList<cmb> wtu;
  public int wtv;

  public apl()
  {
    AppMethodBeat.i(127725);
    this.wtu = new LinkedList();
    AppMethodBeat.o(127725);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(127726);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new e.a.a.b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(127726);
        throw paramArrayOfObject;
      }
      if (this.BaseResponse != null)
      {
        paramArrayOfObject.iy(1, this.BaseResponse.computeSize());
        this.BaseResponse.writeFields(paramArrayOfObject);
      }
      if (this.wcK != null)
      {
        paramArrayOfObject.iy(2, this.wcK.computeSize());
        this.wcK.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.e(3, 8, this.wtu);
      if (this.wtt != null)
        paramArrayOfObject.c(4, this.wtt);
      paramArrayOfObject.iz(5, this.wtv);
      AppMethodBeat.o(127726);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label785;
    label785: for (paramInt = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.wcK != null)
        i = paramInt + e.a.a.a.ix(2, this.wcK.computeSize());
      i += e.a.a.a.c(3, 8, this.wtu);
      paramInt = i;
      if (this.wtt != null)
        paramInt = i + e.a.a.b.b.a.b(4, this.wtt);
      paramInt += e.a.a.b.b.a.bs(5, this.wtv);
      AppMethodBeat.o(127726);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.wtu.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = btd.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = btd.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.BaseResponse == null)
        {
          paramArrayOfObject = new e.a.a.b("Not all required fields were included: BaseResponse");
          AppMethodBeat.o(127726);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(127726);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        apl localapl = (apl)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(127726);
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
            localapl.BaseResponse = paramArrayOfObject;
          }
          AppMethodBeat.o(127726);
          paramInt = i;
          break;
        case 2:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new cmd();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((cmd)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localapl.wcK = ((cmd)localObject1);
          }
          AppMethodBeat.o(127726);
          paramInt = i;
          break;
        case 3:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new cmb();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((cmb)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localapl.wtu.add(localObject1);
          }
          AppMethodBeat.o(127726);
          paramInt = i;
          break;
        case 4:
          localapl.wtt = ((e.a.a.a.a)localObject1).BTU.emu();
          AppMethodBeat.o(127726);
          paramInt = i;
          break;
        case 5:
          localapl.wtv = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(127726);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(127726);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.apl
 * JD-Core Version:    0.6.2
 */