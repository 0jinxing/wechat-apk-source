package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class awd extends btd
{
  public com.tencent.mm.bt.b jBi;
  public String ncH;
  public String vDm;
  public avi wzH;
  public String wzJ;
  public String wzK;
  public String wzL;
  public buj wzS;
  public va wzT;
  public boolean wzU;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(96267);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new e.a.a.b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(96267);
        throw paramArrayOfObject;
      }
      if (this.BaseResponse != null)
      {
        paramArrayOfObject.iy(1, this.BaseResponse.computeSize());
        this.BaseResponse.writeFields(paramArrayOfObject);
      }
      if (this.wzH != null)
      {
        paramArrayOfObject.iy(2, this.wzH.computeSize());
        this.wzH.writeFields(paramArrayOfObject);
      }
      if (this.jBi != null)
        paramArrayOfObject.c(3, this.jBi);
      if (this.wzS != null)
      {
        paramArrayOfObject.iy(4, this.wzS.computeSize());
        this.wzS.writeFields(paramArrayOfObject);
      }
      if (this.ncH != null)
        paramArrayOfObject.e(5, this.ncH);
      if (this.vDm != null)
        paramArrayOfObject.e(6, this.vDm);
      if (this.wzT != null)
      {
        paramArrayOfObject.iy(7, this.wzT.computeSize());
        this.wzT.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.aO(8, this.wzU);
      if (this.wzJ != null)
        paramArrayOfObject.e(9, this.wzJ);
      if (this.wzK != null)
        paramArrayOfObject.e(10, this.wzK);
      if (this.wzL != null)
        paramArrayOfObject.e(11, this.wzL);
      AppMethodBeat.o(96267);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label1280;
    label1280: for (paramInt = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.wzH != null)
        i = paramInt + e.a.a.a.ix(2, this.wzH.computeSize());
      paramInt = i;
      if (this.jBi != null)
        paramInt = i + e.a.a.b.b.a.b(3, this.jBi);
      i = paramInt;
      if (this.wzS != null)
        i = paramInt + e.a.a.a.ix(4, this.wzS.computeSize());
      paramInt = i;
      if (this.ncH != null)
        paramInt = i + e.a.a.b.b.a.f(5, this.ncH);
      i = paramInt;
      if (this.vDm != null)
        i = paramInt + e.a.a.b.b.a.f(6, this.vDm);
      paramInt = i;
      if (this.wzT != null)
        paramInt = i + e.a.a.a.ix(7, this.wzT.computeSize());
      i = paramInt + (e.a.a.b.b.a.fv(8) + 1);
      paramInt = i;
      if (this.wzJ != null)
        paramInt = i + e.a.a.b.b.a.f(9, this.wzJ);
      i = paramInt;
      if (this.wzK != null)
        i = paramInt + e.a.a.b.b.a.f(10, this.wzK);
      paramInt = i;
      if (this.wzL != null)
        paramInt = i + e.a.a.b.b.a.f(11, this.wzL);
      AppMethodBeat.o(96267);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = btd.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = btd.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.BaseResponse == null)
        {
          paramArrayOfObject = new e.a.a.b("Not all required fields were included: BaseResponse");
          AppMethodBeat.o(96267);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(96267);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        awd localawd = (awd)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(96267);
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
            localawd.BaseResponse = ((BaseResponse)localObject1);
          }
          AppMethodBeat.o(96267);
          paramInt = i;
          break;
        case 2:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new avi();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((avi)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localawd.wzH = ((avi)localObject1);
          }
          AppMethodBeat.o(96267);
          paramInt = i;
          break;
        case 3:
          localawd.jBi = ((e.a.a.a.a)localObject1).BTU.emu();
          AppMethodBeat.o(96267);
          paramInt = i;
          break;
        case 4:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new buj();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((buj)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localawd.wzS = ((buj)localObject1);
          }
          AppMethodBeat.o(96267);
          paramInt = i;
          break;
        case 5:
          localawd.ncH = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(96267);
          paramInt = i;
          break;
        case 6:
          localawd.vDm = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(96267);
          paramInt = i;
          break;
        case 7:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new va();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localawd.wzT = paramArrayOfObject;
          }
          AppMethodBeat.o(96267);
          paramInt = i;
          break;
        case 8:
          localawd.wzU = ((e.a.a.a.a)localObject1).BTU.ehX();
          AppMethodBeat.o(96267);
          paramInt = i;
          break;
        case 9:
          localawd.wzJ = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(96267);
          paramInt = i;
          break;
        case 10:
          localawd.wzK = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(96267);
          paramInt = i;
          break;
        case 11:
          localawd.wzL = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(96267);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(96267);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.awd
 * JD-Core Version:    0.6.2
 */