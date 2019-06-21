package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class bjg extends btd
{
  public int cyE;
  public String cyF;
  public int okT;
  public String tCM;
  public csl wMA;
  public boolean wMB;
  public LinkedList<String> wMC;
  public csi wMD;
  public csn wMx;
  public csk wMy;
  public csg wMz;

  public bjg()
  {
    AppMethodBeat.i(56893);
    this.wMC = new LinkedList();
    AppMethodBeat.o(56893);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(56894);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(56894);
        throw paramArrayOfObject;
      }
      if (this.BaseResponse != null)
      {
        paramArrayOfObject.iy(1, this.BaseResponse.computeSize());
        this.BaseResponse.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(2, this.cyE);
      if (this.cyF != null)
        paramArrayOfObject.e(3, this.cyF);
      if (this.wMx != null)
      {
        paramArrayOfObject.iy(4, this.wMx.computeSize());
        this.wMx.writeFields(paramArrayOfObject);
      }
      if (this.wMy != null)
      {
        paramArrayOfObject.iy(5, this.wMy.computeSize());
        this.wMy.writeFields(paramArrayOfObject);
      }
      if (this.wMz != null)
      {
        paramArrayOfObject.iy(6, this.wMz.computeSize());
        this.wMz.writeFields(paramArrayOfObject);
      }
      if (this.wMA != null)
      {
        paramArrayOfObject.iy(7, this.wMA.computeSize());
        this.wMA.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(8, this.okT);
      paramArrayOfObject.aO(9, this.wMB);
      if (this.tCM != null)
        paramArrayOfObject.e(10, this.tCM);
      paramArrayOfObject.e(11, 1, this.wMC);
      if (this.wMD != null)
      {
        paramArrayOfObject.iy(12, this.wMD.computeSize());
        this.wMD.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(56894);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label1499;
    label1499: for (paramInt = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.cyE);
      paramInt = i;
      if (this.cyF != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.cyF);
      i = paramInt;
      if (this.wMx != null)
        i = paramInt + e.a.a.a.ix(4, this.wMx.computeSize());
      paramInt = i;
      if (this.wMy != null)
        paramInt = i + e.a.a.a.ix(5, this.wMy.computeSize());
      i = paramInt;
      if (this.wMz != null)
        i = paramInt + e.a.a.a.ix(6, this.wMz.computeSize());
      paramInt = i;
      if (this.wMA != null)
        paramInt = i + e.a.a.a.ix(7, this.wMA.computeSize());
      i = paramInt + e.a.a.b.b.a.bs(8, this.okT) + (e.a.a.b.b.a.fv(9) + 1);
      paramInt = i;
      if (this.tCM != null)
        paramInt = i + e.a.a.b.b.a.f(10, this.tCM);
      i = paramInt + e.a.a.a.c(11, 1, this.wMC);
      paramInt = i;
      if (this.wMD != null)
        paramInt = i + e.a.a.a.ix(12, this.wMD.computeSize());
      AppMethodBeat.o(56894);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.wMC.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = btd.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = btd.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.BaseResponse == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
          AppMethodBeat.o(56894);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(56894);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        bjg localbjg = (bjg)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(56894);
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
            localbjg.BaseResponse = paramArrayOfObject;
          }
          AppMethodBeat.o(56894);
          paramInt = i;
          break;
        case 2:
          localbjg.cyE = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56894);
          paramInt = i;
          break;
        case 3:
          localbjg.cyF = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56894);
          paramInt = i;
          break;
        case 4:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new csn();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((csn)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbjg.wMx = ((csn)localObject1);
          }
          AppMethodBeat.o(56894);
          paramInt = i;
          break;
        case 5:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new csk();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbjg.wMy = paramArrayOfObject;
          }
          AppMethodBeat.o(56894);
          paramInt = i;
          break;
        case 6:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new csg();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((csg)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbjg.wMz = ((csg)localObject1);
          }
          AppMethodBeat.o(56894);
          paramInt = i;
          break;
        case 7:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new csl();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbjg.wMA = paramArrayOfObject;
          }
          AppMethodBeat.o(56894);
          paramInt = i;
          break;
        case 8:
          localbjg.okT = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56894);
          paramInt = i;
          break;
        case 9:
          localbjg.wMB = ((e.a.a.a.a)localObject1).BTU.ehX();
          AppMethodBeat.o(56894);
          paramInt = i;
          break;
        case 10:
          localbjg.tCM = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56894);
          paramInt = i;
          break;
        case 11:
          localbjg.wMC.add(((e.a.a.a.a)localObject1).BTU.readString());
          AppMethodBeat.o(56894);
          paramInt = i;
          break;
        case 12:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new csi();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((csi)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbjg.wMD = ((csi)localObject1);
          }
          AppMethodBeat.o(56894);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(56894);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bjg
 * JD-Core Version:    0.6.2
 */