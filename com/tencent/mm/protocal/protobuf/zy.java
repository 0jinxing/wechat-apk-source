package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class zy extends btd
{
  public int cRU;
  public int cRV;
  public int cvG;
  public int kCl;
  public String kCm;
  public String nSX;
  public int nUf;
  public int nUh;
  public String nUi;
  public String nUj;
  public String nUk;
  public int nUl;
  public String nXl;
  public bpt vWf;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(56785);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(56785);
        throw paramArrayOfObject;
      }
      if (this.BaseResponse != null)
      {
        paramArrayOfObject.iy(1, this.BaseResponse.computeSize());
        this.BaseResponse.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(2, this.kCl);
      if (this.kCm != null)
        paramArrayOfObject.e(3, this.kCm);
      paramArrayOfObject.iz(4, this.cvG);
      if (this.nSX != null)
        paramArrayOfObject.e(5, this.nSX);
      paramArrayOfObject.iz(6, this.cRU);
      paramArrayOfObject.iz(7, this.cRV);
      if (this.nXl != null)
        paramArrayOfObject.e(8, this.nXl);
      paramArrayOfObject.iz(9, this.nUf);
      if (this.vWf != null)
      {
        paramArrayOfObject.iy(10, this.vWf.computeSize());
        this.vWf.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(11, this.nUh);
      if (this.nUi != null)
        paramArrayOfObject.e(12, this.nUi);
      if (this.nUj != null)
        paramArrayOfObject.e(13, this.nUj);
      if (this.nUk != null)
        paramArrayOfObject.e(14, this.nUk);
      paramArrayOfObject.iz(15, this.nUl);
      AppMethodBeat.o(56785);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label1254;
    label1254: for (paramInt = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.kCl);
      paramInt = i;
      if (this.kCm != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.kCm);
      i = paramInt + e.a.a.b.b.a.bs(4, this.cvG);
      paramInt = i;
      if (this.nSX != null)
        paramInt = i + e.a.a.b.b.a.f(5, this.nSX);
      i = paramInt + e.a.a.b.b.a.bs(6, this.cRU) + e.a.a.b.b.a.bs(7, this.cRV);
      paramInt = i;
      if (this.nXl != null)
        paramInt = i + e.a.a.b.b.a.f(8, this.nXl);
      i = paramInt + e.a.a.b.b.a.bs(9, this.nUf);
      paramInt = i;
      if (this.vWf != null)
        paramInt = i + e.a.a.a.ix(10, this.vWf.computeSize());
      paramInt += e.a.a.b.b.a.bs(11, this.nUh);
      i = paramInt;
      if (this.nUi != null)
        i = paramInt + e.a.a.b.b.a.f(12, this.nUi);
      paramInt = i;
      if (this.nUj != null)
        paramInt = i + e.a.a.b.b.a.f(13, this.nUj);
      i = paramInt;
      if (this.nUk != null)
        i = paramInt + e.a.a.b.b.a.f(14, this.nUk);
      paramInt = i + e.a.a.b.b.a.bs(15, this.nUl);
      AppMethodBeat.o(56785);
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
          AppMethodBeat.o(56785);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(56785);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        zy localzy = (zy)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(56785);
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
            localzy.BaseResponse = ((BaseResponse)localObject1);
          }
          AppMethodBeat.o(56785);
          paramInt = i;
          break;
        case 2:
          localzy.kCl = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56785);
          paramInt = i;
          break;
        case 3:
          localzy.kCm = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56785);
          paramInt = i;
          break;
        case 4:
          localzy.cvG = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56785);
          paramInt = i;
          break;
        case 5:
          localzy.nSX = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56785);
          paramInt = i;
          break;
        case 6:
          localzy.cRU = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56785);
          paramInt = i;
          break;
        case 7:
          localzy.cRV = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56785);
          paramInt = i;
          break;
        case 8:
          localzy.nXl = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56785);
          paramInt = i;
          break;
        case 9:
          localzy.nUf = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56785);
          paramInt = i;
          break;
        case 10:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new bpt();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localzy.vWf = paramArrayOfObject;
          }
          AppMethodBeat.o(56785);
          paramInt = i;
          break;
        case 11:
          localzy.nUh = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56785);
          paramInt = i;
          break;
        case 12:
          localzy.nUi = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56785);
          paramInt = i;
          break;
        case 13:
          localzy.nUj = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56785);
          paramInt = i;
          break;
        case 14:
          localzy.nUk = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56785);
          paramInt = i;
          break;
        case 15:
          localzy.nUl = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56785);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(56785);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.zy
 * JD-Core Version:    0.6.2
 */