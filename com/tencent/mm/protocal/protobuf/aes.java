package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class aes extends btd
{
  public gj mzh;
  public int vAO;
  public int vAS;
  public String vAT;
  public bzt vAU;
  public int vBc;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(28416);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(28416);
        throw paramArrayOfObject;
      }
      if (this.BaseResponse != null)
      {
        paramArrayOfObject.iy(1, this.BaseResponse.computeSize());
        this.BaseResponse.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(2, this.vAS);
      paramArrayOfObject.iz(3, this.vBc);
      if (this.vAT != null)
        paramArrayOfObject.e(4, this.vAT);
      if (this.vAU != null)
      {
        paramArrayOfObject.iy(5, this.vAU.computeSize());
        this.vAU.writeFields(paramArrayOfObject);
      }
      if (this.mzh != null)
      {
        paramArrayOfObject.iy(6, this.mzh.computeSize());
        this.mzh.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(7, this.vAO);
      AppMethodBeat.o(28416);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label907;
    label907: for (paramInt = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; paramInt = 0)
    {
      paramInt = paramInt + e.a.a.b.b.a.bs(2, this.vAS) + e.a.a.b.b.a.bs(3, this.vBc);
      i = paramInt;
      if (this.vAT != null)
        i = paramInt + e.a.a.b.b.a.f(4, this.vAT);
      paramInt = i;
      if (this.vAU != null)
        paramInt = i + e.a.a.a.ix(5, this.vAU.computeSize());
      i = paramInt;
      if (this.mzh != null)
        i = paramInt + e.a.a.a.ix(6, this.mzh.computeSize());
      paramInt = i + e.a.a.b.b.a.bs(7, this.vAO);
      AppMethodBeat.o(28416);
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
          AppMethodBeat.o(28416);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(28416);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        aes localaes = (aes)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(28416);
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
            localaes.BaseResponse = paramArrayOfObject;
          }
          AppMethodBeat.o(28416);
          paramInt = i;
          break;
        case 2:
          localaes.vAS = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28416);
          paramInt = i;
          break;
        case 3:
          localaes.vBc = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28416);
          paramInt = i;
          break;
        case 4:
          localaes.vAT = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28416);
          paramInt = i;
          break;
        case 5:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new bzt();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bzt)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localaes.vAU = ((bzt)localObject1);
          }
          AppMethodBeat.o(28416);
          paramInt = i;
          break;
        case 6:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new gj();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localaes.mzh = paramArrayOfObject;
          }
          AppMethodBeat.o(28416);
          paramInt = i;
          break;
        case 7:
          localaes.vAO = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28416);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(28416);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.aes
 * JD-Core Version:    0.6.2
 */