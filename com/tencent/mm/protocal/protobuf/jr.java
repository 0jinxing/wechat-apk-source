package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class jr extends btd
{
  public int jBT;
  public int vCl;
  public int vCo;
  public SKBuiltinBuffer_t vEF;
  public SKBuiltinBuffer_t vHJ;
  public SKBuiltinBuffer_t vHP;
  public btv vLP;
  public String vLX;
  public bts vMa;
  public SKBuiltinBuffer_t vMb;
  public int vMd;
  public String vMe;
  public String vMf;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(73696);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(73696);
        throw paramArrayOfObject;
      }
      if (this.vEF == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: ImgBuf");
        AppMethodBeat.o(73696);
        throw paramArrayOfObject;
      }
      if (this.BaseResponse != null)
      {
        paramArrayOfObject.iy(1, this.BaseResponse.computeSize());
        this.BaseResponse.writeFields(paramArrayOfObject);
      }
      if (this.vLX != null)
        paramArrayOfObject.e(2, this.vLX);
      if (this.vEF != null)
      {
        paramArrayOfObject.iy(3, this.vEF.computeSize());
        this.vEF.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(4, this.vCo);
      paramArrayOfObject.iz(5, this.vMd);
      if (this.vMe != null)
        paramArrayOfObject.e(6, this.vMe);
      paramArrayOfObject.iz(7, this.jBT);
      if (this.vMf != null)
        paramArrayOfObject.e(8, this.vMf);
      if (this.vMa != null)
      {
        paramArrayOfObject.iy(9, this.vMa.computeSize());
        this.vMa.writeFields(paramArrayOfObject);
      }
      if (this.vHP != null)
      {
        paramArrayOfObject.iy(10, this.vHP.computeSize());
        this.vHP.writeFields(paramArrayOfObject);
      }
      if (this.vMb != null)
      {
        paramArrayOfObject.iy(11, this.vMb.computeSize());
        this.vMb.writeFields(paramArrayOfObject);
      }
      if (this.vLP != null)
      {
        paramArrayOfObject.iy(12, this.vLP.computeSize());
        this.vLP.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(13, this.vCl);
      if (this.vHJ != null)
      {
        paramArrayOfObject.iy(14, this.vHJ.computeSize());
        this.vHJ.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(73696);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label1758;
    label1758: for (i = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.vLX != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.vLX);
      i = paramInt;
      if (this.vEF != null)
        i = paramInt + e.a.a.a.ix(3, this.vEF.computeSize());
      i = i + e.a.a.b.b.a.bs(4, this.vCo) + e.a.a.b.b.a.bs(5, this.vMd);
      paramInt = i;
      if (this.vMe != null)
        paramInt = i + e.a.a.b.b.a.f(6, this.vMe);
      i = paramInt + e.a.a.b.b.a.bs(7, this.jBT);
      paramInt = i;
      if (this.vMf != null)
        paramInt = i + e.a.a.b.b.a.f(8, this.vMf);
      i = paramInt;
      if (this.vMa != null)
        i = paramInt + e.a.a.a.ix(9, this.vMa.computeSize());
      paramInt = i;
      if (this.vHP != null)
        paramInt = i + e.a.a.a.ix(10, this.vHP.computeSize());
      i = paramInt;
      if (this.vMb != null)
        i = paramInt + e.a.a.a.ix(11, this.vMb.computeSize());
      paramInt = i;
      if (this.vLP != null)
        paramInt = i + e.a.a.a.ix(12, this.vLP.computeSize());
      i = paramInt + e.a.a.b.b.a.bs(13, this.vCl);
      paramInt = i;
      if (this.vHJ != null)
        paramInt = i + e.a.a.a.ix(14, this.vHJ.computeSize());
      AppMethodBeat.o(73696);
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
          AppMethodBeat.o(73696);
          throw paramArrayOfObject;
        }
        if (this.vEF == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: ImgBuf");
          AppMethodBeat.o(73696);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(73696);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        jr localjr = (jr)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(73696);
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
            localjr.BaseResponse = ((BaseResponse)localObject1);
          }
          AppMethodBeat.o(73696);
          paramInt = i;
          break;
        case 2:
          localjr.vLX = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(73696);
          paramInt = i;
          break;
        case 3:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new SKBuiltinBuffer_t();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((SKBuiltinBuffer_t)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localjr.vEF = ((SKBuiltinBuffer_t)localObject1);
          }
          AppMethodBeat.o(73696);
          paramInt = i;
          break;
        case 4:
          localjr.vCo = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(73696);
          paramInt = i;
          break;
        case 5:
          localjr.vMd = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(73696);
          paramInt = i;
          break;
        case 6:
          localjr.vMe = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(73696);
          paramInt = i;
          break;
        case 7:
          localjr.jBT = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(73696);
          paramInt = i;
          break;
        case 8:
          localjr.vMf = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(73696);
          paramInt = i;
          break;
        case 9:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new bts();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bts)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localjr.vMa = ((bts)localObject1);
          }
          AppMethodBeat.o(73696);
          paramInt = i;
          break;
        case 10:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new SKBuiltinBuffer_t();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localjr.vHP = paramArrayOfObject;
          }
          AppMethodBeat.o(73696);
          paramInt = i;
          break;
        case 11:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new SKBuiltinBuffer_t();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localjr.vMb = paramArrayOfObject;
          }
          AppMethodBeat.o(73696);
          paramInt = i;
          break;
        case 12:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new btv();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localjr.vLP = paramArrayOfObject;
          }
          AppMethodBeat.o(73696);
          paramInt = i;
          break;
        case 13:
          localjr.vCl = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(73696);
          paramInt = i;
          break;
        case 14:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new SKBuiltinBuffer_t();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((SKBuiltinBuffer_t)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localjr.vHJ = ((SKBuiltinBuffer_t)localObject1);
          }
          AppMethodBeat.o(73696);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(73696);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.jr
 * JD-Core Version:    0.6.2
 */