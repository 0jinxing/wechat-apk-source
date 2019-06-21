package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class aqq extends btd
{
  public String Desc;
  public String Title;
  public String nzz;
  public String wuA;
  public String wuB;
  public String wuC;
  public String wuD;
  public String wuE;
  public int wug;
  public LinkedList<crw> wuh;
  public String wut;
  public String wuu;
  public String wuv;
  public String wuw;
  public String wux;
  public String wuy;
  public csc wuz;

  public aqq()
  {
    AppMethodBeat.i(28508);
    this.wuh = new LinkedList();
    AppMethodBeat.o(28508);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(28509);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(28509);
        throw paramArrayOfObject;
      }
      if (this.BaseResponse != null)
      {
        paramArrayOfObject.iy(1, this.BaseResponse.computeSize());
        this.BaseResponse.writeFields(paramArrayOfObject);
      }
      if (this.wut != null)
        paramArrayOfObject.e(2, this.wut);
      if (this.nzz != null)
        paramArrayOfObject.e(3, this.nzz);
      if (this.Title != null)
        paramArrayOfObject.e(4, this.Title);
      if (this.Desc != null)
        paramArrayOfObject.e(5, this.Desc);
      if (this.wuu != null)
        paramArrayOfObject.e(6, this.wuu);
      if (this.wuv != null)
        paramArrayOfObject.e(7, this.wuv);
      if (this.wuw != null)
        paramArrayOfObject.e(8, this.wuw);
      if (this.wux != null)
        paramArrayOfObject.e(9, this.wux);
      if (this.wuy != null)
        paramArrayOfObject.e(10, this.wuy);
      if (this.wuz != null)
      {
        paramArrayOfObject.iy(11, this.wuz.computeSize());
        this.wuz.writeFields(paramArrayOfObject);
      }
      if (this.wuA != null)
        paramArrayOfObject.e(12, this.wuA);
      if (this.wuB != null)
        paramArrayOfObject.e(13, this.wuB);
      if (this.wuC != null)
        paramArrayOfObject.e(14, this.wuC);
      if (this.wuD != null)
        paramArrayOfObject.e(15, this.wuD);
      if (this.wuE != null)
        paramArrayOfObject.e(16, this.wuE);
      paramArrayOfObject.iz(17, this.wug);
      paramArrayOfObject.e(18, 8, this.wuh);
      AppMethodBeat.o(28509);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label1657;
    label1657: for (i = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.wut != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.wut);
      i = paramInt;
      if (this.nzz != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.nzz);
      paramInt = i;
      if (this.Title != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.Title);
      i = paramInt;
      if (this.Desc != null)
        i = paramInt + e.a.a.b.b.a.f(5, this.Desc);
      paramInt = i;
      if (this.wuu != null)
        paramInt = i + e.a.a.b.b.a.f(6, this.wuu);
      i = paramInt;
      if (this.wuv != null)
        i = paramInt + e.a.a.b.b.a.f(7, this.wuv);
      paramInt = i;
      if (this.wuw != null)
        paramInt = i + e.a.a.b.b.a.f(8, this.wuw);
      i = paramInt;
      if (this.wux != null)
        i = paramInt + e.a.a.b.b.a.f(9, this.wux);
      paramInt = i;
      if (this.wuy != null)
        paramInt = i + e.a.a.b.b.a.f(10, this.wuy);
      i = paramInt;
      if (this.wuz != null)
        i = paramInt + e.a.a.a.ix(11, this.wuz.computeSize());
      paramInt = i;
      if (this.wuA != null)
        paramInt = i + e.a.a.b.b.a.f(12, this.wuA);
      i = paramInt;
      if (this.wuB != null)
        i = paramInt + e.a.a.b.b.a.f(13, this.wuB);
      paramInt = i;
      if (this.wuC != null)
        paramInt = i + e.a.a.b.b.a.f(14, this.wuC);
      i = paramInt;
      if (this.wuD != null)
        i = paramInt + e.a.a.b.b.a.f(15, this.wuD);
      paramInt = i;
      if (this.wuE != null)
        paramInt = i + e.a.a.b.b.a.f(16, this.wuE);
      paramInt = paramInt + e.a.a.b.b.a.bs(17, this.wug) + e.a.a.a.c(18, 8, this.wuh);
      AppMethodBeat.o(28509);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.wuh.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = btd.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = btd.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.BaseResponse == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
          AppMethodBeat.o(28509);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(28509);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        aqq localaqq = (aqq)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(28509);
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
            localaqq.BaseResponse = ((BaseResponse)localObject1);
          }
          AppMethodBeat.o(28509);
          paramInt = i;
          break;
        case 2:
          localaqq.wut = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28509);
          paramInt = i;
          break;
        case 3:
          localaqq.nzz = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28509);
          paramInt = i;
          break;
        case 4:
          localaqq.Title = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28509);
          paramInt = i;
          break;
        case 5:
          localaqq.Desc = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28509);
          paramInt = i;
          break;
        case 6:
          localaqq.wuu = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28509);
          paramInt = i;
          break;
        case 7:
          localaqq.wuv = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28509);
          paramInt = i;
          break;
        case 8:
          localaqq.wuw = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28509);
          paramInt = i;
          break;
        case 9:
          localaqq.wux = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28509);
          paramInt = i;
          break;
        case 10:
          localaqq.wuy = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28509);
          paramInt = i;
          break;
        case 11:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new csc();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((csc)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localaqq.wuz = ((csc)localObject1);
          }
          AppMethodBeat.o(28509);
          paramInt = i;
          break;
        case 12:
          localaqq.wuA = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28509);
          paramInt = i;
          break;
        case 13:
          localaqq.wuB = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28509);
          paramInt = i;
          break;
        case 14:
          localaqq.wuC = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28509);
          paramInt = i;
          break;
        case 15:
          localaqq.wuD = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28509);
          paramInt = i;
          break;
        case 16:
          localaqq.wuE = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28509);
          paramInt = i;
          break;
        case 17:
          localaqq.wug = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28509);
          paramInt = i;
          break;
        case 18:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new crw();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((crw)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localaqq.wuh.add(localObject1);
          }
          AppMethodBeat.o(28509);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(28509);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.aqq
 * JD-Core Version:    0.6.2
 */