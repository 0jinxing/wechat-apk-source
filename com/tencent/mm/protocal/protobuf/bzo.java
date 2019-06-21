package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class bzo extends btd
{
  public String cxb;
  public String fhH;
  public String title;
  public String wIL;
  public fz wXh;
  public int wYA;
  public fy wYB;
  public String wYC;
  public LinkedList<ga> wYD;
  public String wYE;
  public String wYF;
  public gb wYG;
  public LinkedList<gb> wYH;
  public cno wYI;
  public boolean wYJ;
  public String wYK;

  public bzo()
  {
    AppMethodBeat.i(96292);
    this.wYD = new LinkedList();
    this.wYH = new LinkedList();
    AppMethodBeat.o(96292);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(96293);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(96293);
        throw paramArrayOfObject;
      }
      if (this.BaseResponse != null)
      {
        paramArrayOfObject.iy(1, this.BaseResponse.computeSize());
        this.BaseResponse.writeFields(paramArrayOfObject);
      }
      if (this.wXh != null)
      {
        paramArrayOfObject.iy(2, this.wXh.computeSize());
        this.wXh.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(3, this.wYA);
      if (this.wYB != null)
      {
        paramArrayOfObject.iy(4, this.wYB.computeSize());
        this.wYB.writeFields(paramArrayOfObject);
      }
      if (this.title != null)
        paramArrayOfObject.e(5, this.title);
      if (this.wIL != null)
        paramArrayOfObject.e(6, this.wIL);
      if (this.fhH != null)
        paramArrayOfObject.e(7, this.fhH);
      if (this.wYC != null)
        paramArrayOfObject.e(8, this.wYC);
      paramArrayOfObject.e(9, 8, this.wYD);
      if (this.wYE != null)
        paramArrayOfObject.e(10, this.wYE);
      if (this.wYF != null)
        paramArrayOfObject.e(11, this.wYF);
      if (this.wYG != null)
      {
        paramArrayOfObject.iy(12, this.wYG.computeSize());
        this.wYG.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.e(13, 8, this.wYH);
      if (this.cxb != null)
        paramArrayOfObject.e(14, this.cxb);
      if (this.wYI != null)
      {
        paramArrayOfObject.iy(15, this.wYI.computeSize());
        this.wYI.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.aO(16, this.wYJ);
      if (this.wYK != null)
        paramArrayOfObject.e(17, this.wYK);
      AppMethodBeat.o(96293);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label1908;
    label1908: for (paramInt = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.wXh != null)
        i = paramInt + e.a.a.a.ix(2, this.wXh.computeSize());
      i += e.a.a.b.b.a.bs(3, this.wYA);
      paramInt = i;
      if (this.wYB != null)
        paramInt = i + e.a.a.a.ix(4, this.wYB.computeSize());
      i = paramInt;
      if (this.title != null)
        i = paramInt + e.a.a.b.b.a.f(5, this.title);
      paramInt = i;
      if (this.wIL != null)
        paramInt = i + e.a.a.b.b.a.f(6, this.wIL);
      i = paramInt;
      if (this.fhH != null)
        i = paramInt + e.a.a.b.b.a.f(7, this.fhH);
      paramInt = i;
      if (this.wYC != null)
        paramInt = i + e.a.a.b.b.a.f(8, this.wYC);
      i = paramInt + e.a.a.a.c(9, 8, this.wYD);
      paramInt = i;
      if (this.wYE != null)
        paramInt = i + e.a.a.b.b.a.f(10, this.wYE);
      i = paramInt;
      if (this.wYF != null)
        i = paramInt + e.a.a.b.b.a.f(11, this.wYF);
      paramInt = i;
      if (this.wYG != null)
        paramInt = i + e.a.a.a.ix(12, this.wYG.computeSize());
      i = paramInt + e.a.a.a.c(13, 8, this.wYH);
      paramInt = i;
      if (this.cxb != null)
        paramInt = i + e.a.a.b.b.a.f(14, this.cxb);
      i = paramInt;
      if (this.wYI != null)
        i = paramInt + e.a.a.a.ix(15, this.wYI.computeSize());
      i += e.a.a.b.b.a.fv(16) + 1;
      paramInt = i;
      if (this.wYK != null)
        paramInt = i + e.a.a.b.b.a.f(17, this.wYK);
      AppMethodBeat.o(96293);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.wYD.clear();
        this.wYH.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = btd.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = btd.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.BaseResponse == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
          AppMethodBeat.o(96293);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(96293);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        bzo localbzo = (bzo)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(96293);
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
            localbzo.BaseResponse = paramArrayOfObject;
          }
          AppMethodBeat.o(96293);
          paramInt = i;
          break;
        case 2:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new fz();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbzo.wXh = paramArrayOfObject;
          }
          AppMethodBeat.o(96293);
          paramInt = i;
          break;
        case 3:
          localbzo.wYA = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(96293);
          paramInt = i;
          break;
        case 4:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new fy();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbzo.wYB = paramArrayOfObject;
          }
          AppMethodBeat.o(96293);
          paramInt = i;
          break;
        case 5:
          localbzo.title = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(96293);
          paramInt = i;
          break;
        case 6:
          localbzo.wIL = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(96293);
          paramInt = i;
          break;
        case 7:
          localbzo.fhH = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(96293);
          paramInt = i;
          break;
        case 8:
          localbzo.wYC = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(96293);
          paramInt = i;
          break;
        case 9:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new ga();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbzo.wYD.add(paramArrayOfObject);
          }
          AppMethodBeat.o(96293);
          paramInt = i;
          break;
        case 10:
          localbzo.wYE = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(96293);
          paramInt = i;
          break;
        case 11:
          localbzo.wYF = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(96293);
          paramInt = i;
          break;
        case 12:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new gb();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbzo.wYG = paramArrayOfObject;
          }
          AppMethodBeat.o(96293);
          paramInt = i;
          break;
        case 13:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new gb();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbzo.wYH.add(paramArrayOfObject);
          }
          AppMethodBeat.o(96293);
          paramInt = i;
          break;
        case 14:
          localbzo.cxb = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(96293);
          paramInt = i;
          break;
        case 15:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new cno();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((cno)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbzo.wYI = ((cno)localObject1);
          }
          AppMethodBeat.o(96293);
          paramInt = i;
          break;
        case 16:
          localbzo.wYJ = ((e.a.a.a.a)localObject1).BTU.ehX();
          AppMethodBeat.o(96293);
          paramInt = i;
          break;
        case 17:
          localbzo.wYK = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(96293);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(96293);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bzo
 * JD-Core Version:    0.6.2
 */