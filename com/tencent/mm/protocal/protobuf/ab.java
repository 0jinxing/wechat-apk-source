package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class ab extends btd
{
  public int OpCode;
  public String vAQ;
  public int vAR;
  public int vAS;
  public String vAT;
  public bzt vAU;
  public bqv vAV;
  public bzt vAW;
  public bns vAX;
  public acq vAY;
  public gj vAZ;
  public String vBa;
  public String vBb;
  public int vBc;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(28293);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(28293);
        throw paramArrayOfObject;
      }
      if (this.BaseResponse != null)
      {
        paramArrayOfObject.iy(1, this.BaseResponse.computeSize());
        this.BaseResponse.writeFields(paramArrayOfObject);
      }
      if (this.vAQ != null)
        paramArrayOfObject.e(2, this.vAQ);
      paramArrayOfObject.iz(3, this.vAR);
      paramArrayOfObject.iz(4, this.vAS);
      if (this.vAT != null)
        paramArrayOfObject.e(5, this.vAT);
      if (this.vAU != null)
      {
        paramArrayOfObject.iy(6, this.vAU.computeSize());
        this.vAU.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(7, this.OpCode);
      if (this.vAV != null)
      {
        paramArrayOfObject.iy(8, this.vAV.computeSize());
        this.vAV.writeFields(paramArrayOfObject);
      }
      if (this.vAW != null)
      {
        paramArrayOfObject.iy(9, this.vAW.computeSize());
        this.vAW.writeFields(paramArrayOfObject);
      }
      if (this.vAX != null)
      {
        paramArrayOfObject.iy(10, this.vAX.computeSize());
        this.vAX.writeFields(paramArrayOfObject);
      }
      if (this.vAY != null)
      {
        paramArrayOfObject.iy(11, this.vAY.computeSize());
        this.vAY.writeFields(paramArrayOfObject);
      }
      if (this.vAZ != null)
      {
        paramArrayOfObject.iy(12, this.vAZ.computeSize());
        this.vAZ.writeFields(paramArrayOfObject);
      }
      if (this.vBa != null)
        paramArrayOfObject.e(13, this.vBa);
      if (this.vBb != null)
        paramArrayOfObject.e(14, this.vBb);
      paramArrayOfObject.iz(15, this.vBc);
      AppMethodBeat.o(28293);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label1798;
    label1798: for (paramInt = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.vAQ != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.vAQ);
      i = i + e.a.a.b.b.a.bs(3, this.vAR) + e.a.a.b.b.a.bs(4, this.vAS);
      paramInt = i;
      if (this.vAT != null)
        paramInt = i + e.a.a.b.b.a.f(5, this.vAT);
      i = paramInt;
      if (this.vAU != null)
        i = paramInt + e.a.a.a.ix(6, this.vAU.computeSize());
      i += e.a.a.b.b.a.bs(7, this.OpCode);
      paramInt = i;
      if (this.vAV != null)
        paramInt = i + e.a.a.a.ix(8, this.vAV.computeSize());
      i = paramInt;
      if (this.vAW != null)
        i = paramInt + e.a.a.a.ix(9, this.vAW.computeSize());
      int j = i;
      if (this.vAX != null)
        j = i + e.a.a.a.ix(10, this.vAX.computeSize());
      paramInt = j;
      if (this.vAY != null)
        paramInt = j + e.a.a.a.ix(11, this.vAY.computeSize());
      i = paramInt;
      if (this.vAZ != null)
        i = paramInt + e.a.a.a.ix(12, this.vAZ.computeSize());
      paramInt = i;
      if (this.vBa != null)
        paramInt = i + e.a.a.b.b.a.f(13, this.vBa);
      i = paramInt;
      if (this.vBb != null)
        i = paramInt + e.a.a.b.b.a.f(14, this.vBb);
      paramInt = i + e.a.a.b.b.a.bs(15, this.vBc);
      AppMethodBeat.o(28293);
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
          AppMethodBeat.o(28293);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(28293);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        ab localab = (ab)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(28293);
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
            localab.BaseResponse = paramArrayOfObject;
          }
          AppMethodBeat.o(28293);
          paramInt = i;
          break;
        case 2:
          localab.vAQ = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28293);
          paramInt = i;
          break;
        case 3:
          localab.vAR = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28293);
          paramInt = i;
          break;
        case 4:
          localab.vAS = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28293);
          paramInt = i;
          break;
        case 5:
          localab.vAT = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28293);
          paramInt = i;
          break;
        case 6:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new bzt();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localab.vAU = paramArrayOfObject;
          }
          AppMethodBeat.o(28293);
          paramInt = i;
          break;
        case 7:
          localab.OpCode = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28293);
          paramInt = i;
          break;
        case 8:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new bqv();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localab.vAV = paramArrayOfObject;
          }
          AppMethodBeat.o(28293);
          paramInt = i;
          break;
        case 9:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new bzt();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localab.vAW = paramArrayOfObject;
          }
          AppMethodBeat.o(28293);
          paramInt = i;
          break;
        case 10:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new bns();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localab.vAX = paramArrayOfObject;
          }
          AppMethodBeat.o(28293);
          paramInt = i;
          break;
        case 11:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new acq();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localab.vAY = paramArrayOfObject;
          }
          AppMethodBeat.o(28293);
          paramInt = i;
          break;
        case 12:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new gj();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localab.vAZ = paramArrayOfObject;
          }
          AppMethodBeat.o(28293);
          paramInt = i;
          break;
        case 13:
          localab.vBa = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28293);
          paramInt = i;
          break;
        case 14:
          localab.vBb = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28293);
          paramInt = i;
          break;
        case 15:
          localab.vBc = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28293);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(28293);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.ab
 * JD-Core Version:    0.6.2
 */