package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class are extends btd
{
  public String cEh;
  public int jsN;
  public cwg vXT;
  public String wuS;
  public String wuU;
  public int wuV;
  public LinkedList<bdt> wuW;
  public int wuX;
  public String wuY;
  public String wuZ;
  public int wva;
  public String wvb;
  public String wvc;
  public String wvd;
  public int wve;
  public int wvf;
  public bdt wvg;

  public are()
  {
    AppMethodBeat.i(96238);
    this.wuW = new LinkedList();
    AppMethodBeat.o(96238);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(96239);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(96239);
        throw paramArrayOfObject;
      }
      if (this.BaseResponse != null)
      {
        paramArrayOfObject.iy(1, this.BaseResponse.computeSize());
        this.BaseResponse.writeFields(paramArrayOfObject);
      }
      if (this.vXT != null)
      {
        paramArrayOfObject.iy(2, this.vXT.computeSize());
        this.vXT.writeFields(paramArrayOfObject);
      }
      if (this.wuU != null)
        paramArrayOfObject.e(3, this.wuU);
      paramArrayOfObject.iz(4, this.wuV);
      paramArrayOfObject.iz(5, this.jsN);
      if (this.wuS != null)
        paramArrayOfObject.e(6, this.wuS);
      paramArrayOfObject.e(7, 8, this.wuW);
      paramArrayOfObject.iz(8, this.wuX);
      if (this.wuY != null)
        paramArrayOfObject.e(9, this.wuY);
      if (this.wuZ != null)
        paramArrayOfObject.e(10, this.wuZ);
      paramArrayOfObject.iz(11, this.wva);
      if (this.cEh != null)
        paramArrayOfObject.e(12, this.cEh);
      if (this.wvb != null)
        paramArrayOfObject.e(13, this.wvb);
      if (this.wvc != null)
        paramArrayOfObject.e(14, this.wvc);
      if (this.wvd != null)
        paramArrayOfObject.e(15, this.wvd);
      paramArrayOfObject.iz(16, this.wve);
      paramArrayOfObject.iz(17, this.wvf);
      if (this.wvg != null)
      {
        paramArrayOfObject.iy(18, this.wvg.computeSize());
        this.wvg.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(96239);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label1641;
    label1641: for (i = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.vXT != null)
        paramInt = i + e.a.a.a.ix(2, this.vXT.computeSize());
      i = paramInt;
      if (this.wuU != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.wuU);
      i = i + e.a.a.b.b.a.bs(4, this.wuV) + e.a.a.b.b.a.bs(5, this.jsN);
      paramInt = i;
      if (this.wuS != null)
        paramInt = i + e.a.a.b.b.a.f(6, this.wuS);
      i = paramInt + e.a.a.a.c(7, 8, this.wuW) + e.a.a.b.b.a.bs(8, this.wuX);
      paramInt = i;
      if (this.wuY != null)
        paramInt = i + e.a.a.b.b.a.f(9, this.wuY);
      i = paramInt;
      if (this.wuZ != null)
        i = paramInt + e.a.a.b.b.a.f(10, this.wuZ);
      paramInt = i + e.a.a.b.b.a.bs(11, this.wva);
      i = paramInt;
      if (this.cEh != null)
        i = paramInt + e.a.a.b.b.a.f(12, this.cEh);
      paramInt = i;
      if (this.wvb != null)
        paramInt = i + e.a.a.b.b.a.f(13, this.wvb);
      i = paramInt;
      if (this.wvc != null)
        i = paramInt + e.a.a.b.b.a.f(14, this.wvc);
      paramInt = i;
      if (this.wvd != null)
        paramInt = i + e.a.a.b.b.a.f(15, this.wvd);
      i = paramInt + e.a.a.b.b.a.bs(16, this.wve) + e.a.a.b.b.a.bs(17, this.wvf);
      paramInt = i;
      if (this.wvg != null)
        paramInt = i + e.a.a.a.ix(18, this.wvg.computeSize());
      AppMethodBeat.o(96239);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.wuW.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = btd.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = btd.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.BaseResponse == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
          AppMethodBeat.o(96239);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(96239);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        are localare = (are)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(96239);
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
            localare.BaseResponse = ((BaseResponse)localObject1);
          }
          AppMethodBeat.o(96239);
          paramInt = i;
          break;
        case 2:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new cwg();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((cwg)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localare.vXT = ((cwg)localObject1);
          }
          AppMethodBeat.o(96239);
          paramInt = i;
          break;
        case 3:
          localare.wuU = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(96239);
          paramInt = i;
          break;
        case 4:
          localare.wuV = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(96239);
          paramInt = i;
          break;
        case 5:
          localare.jsN = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(96239);
          paramInt = i;
          break;
        case 6:
          localare.wuS = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(96239);
          paramInt = i;
          break;
        case 7:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new bdt();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localare.wuW.add(paramArrayOfObject);
          }
          AppMethodBeat.o(96239);
          paramInt = i;
          break;
        case 8:
          localare.wuX = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(96239);
          paramInt = i;
          break;
        case 9:
          localare.wuY = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(96239);
          paramInt = i;
          break;
        case 10:
          localare.wuZ = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(96239);
          paramInt = i;
          break;
        case 11:
          localare.wva = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(96239);
          paramInt = i;
          break;
        case 12:
          localare.cEh = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(96239);
          paramInt = i;
          break;
        case 13:
          localare.wvb = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(96239);
          paramInt = i;
          break;
        case 14:
          localare.wvc = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(96239);
          paramInt = i;
          break;
        case 15:
          localare.wvd = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(96239);
          paramInt = i;
          break;
        case 16:
          localare.wve = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(96239);
          paramInt = i;
          break;
        case 17:
          localare.wvf = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(96239);
          paramInt = i;
          break;
        case 18:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new bdt();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bdt)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localare.wvg = ((bdt)localObject1);
          }
          AppMethodBeat.o(96239);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(96239);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.are
 * JD-Core Version:    0.6.2
 */