package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class alt extends btd
{
  public int OpCode;
  public String Url;
  public String vBa;
  public String vQg;
  public String wdK;
  public SKBuiltinBuffer_t wpP;
  public String wpY;
  public int wpZ;
  public int wqU;
  public LinkedList<bhu> wqV;
  public int wqW;

  public alt()
  {
    AppMethodBeat.i(113783);
    this.wqV = new LinkedList();
    AppMethodBeat.o(113783);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(113784);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(113784);
        throw paramArrayOfObject;
      }
      if (this.wpP == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: Buff");
        AppMethodBeat.o(113784);
        throw paramArrayOfObject;
      }
      if (this.BaseResponse != null)
      {
        paramArrayOfObject.iy(1, this.BaseResponse.computeSize());
        this.BaseResponse.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(2, this.wqU);
      paramArrayOfObject.e(3, 8, this.wqV);
      paramArrayOfObject.iz(4, this.OpCode);
      paramArrayOfObject.iz(5, this.wqW);
      if (this.wpP != null)
      {
        paramArrayOfObject.iy(6, this.wpP.computeSize());
        this.wpP.writeFields(paramArrayOfObject);
      }
      if (this.Url != null)
        paramArrayOfObject.e(7, this.Url);
      if (this.wpY != null)
        paramArrayOfObject.e(8, this.wpY);
      if (this.wdK != null)
        paramArrayOfObject.e(9, this.wdK);
      if (this.vBa != null)
        paramArrayOfObject.e(10, this.vBa);
      paramArrayOfObject.iz(11, this.wpZ);
      if (this.vQg != null)
        paramArrayOfObject.e(12, this.vQg);
      AppMethodBeat.o(113784);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label1234;
    label1234: for (paramInt = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.wqU) + e.a.a.a.c(3, 8, this.wqV) + e.a.a.b.b.a.bs(4, this.OpCode) + e.a.a.b.b.a.bs(5, this.wqW);
      paramInt = i;
      if (this.wpP != null)
        paramInt = i + e.a.a.a.ix(6, this.wpP.computeSize());
      i = paramInt;
      if (this.Url != null)
        i = paramInt + e.a.a.b.b.a.f(7, this.Url);
      paramInt = i;
      if (this.wpY != null)
        paramInt = i + e.a.a.b.b.a.f(8, this.wpY);
      i = paramInt;
      if (this.wdK != null)
        i = paramInt + e.a.a.b.b.a.f(9, this.wdK);
      paramInt = i;
      if (this.vBa != null)
        paramInt = i + e.a.a.b.b.a.f(10, this.vBa);
      i = paramInt + e.a.a.b.b.a.bs(11, this.wpZ);
      paramInt = i;
      if (this.vQg != null)
        paramInt = i + e.a.a.b.b.a.f(12, this.vQg);
      AppMethodBeat.o(113784);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.wqV.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = btd.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = btd.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.BaseResponse == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
          AppMethodBeat.o(113784);
          throw paramArrayOfObject;
        }
        if (this.wpP == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: Buff");
          AppMethodBeat.o(113784);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(113784);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        alt localalt = (alt)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(113784);
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
            localalt.BaseResponse = ((BaseResponse)localObject1);
          }
          AppMethodBeat.o(113784);
          paramInt = i;
          break;
        case 2:
          localalt.wqU = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(113784);
          paramInt = i;
          break;
        case 3:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new bhu();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bhu)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localalt.wqV.add(localObject1);
          }
          AppMethodBeat.o(113784);
          paramInt = i;
          break;
        case 4:
          localalt.OpCode = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(113784);
          paramInt = i;
          break;
        case 5:
          localalt.wqW = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(113784);
          paramInt = i;
          break;
        case 6:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new SKBuiltinBuffer_t();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localalt.wpP = paramArrayOfObject;
          }
          AppMethodBeat.o(113784);
          paramInt = i;
          break;
        case 7:
          localalt.Url = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(113784);
          paramInt = i;
          break;
        case 8:
          localalt.wpY = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(113784);
          paramInt = i;
          break;
        case 9:
          localalt.wdK = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(113784);
          paramInt = i;
          break;
        case 10:
          localalt.vBa = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(113784);
          paramInt = i;
          break;
        case 11:
          localalt.wpZ = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(113784);
          paramInt = i;
          break;
        case 12:
          localalt.vQg = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(113784);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(113784);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.alt
 * JD-Core Version:    0.6.2
 */