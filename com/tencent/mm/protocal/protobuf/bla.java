package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class bla extends btd
{
  public int kdT;
  public String kdU;
  public int vES;
  public String wCO;
  public boolean wCP;
  public aum wNW;
  public bls wNX;
  public String wNY;
  public int wNZ;
  public long wOa;
  public LinkedList<oq> wmz;

  public bla()
  {
    AppMethodBeat.i(56923);
    this.wmz = new LinkedList();
    this.wCP = true;
    AppMethodBeat.o(56923);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(56924);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(56924);
        throw paramArrayOfObject;
      }
      if (this.BaseResponse != null)
      {
        paramArrayOfObject.iy(1, this.BaseResponse.computeSize());
        this.BaseResponse.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(2, this.kdT);
      if (this.kdU != null)
        paramArrayOfObject.e(3, this.kdU);
      if (this.wNW != null)
      {
        paramArrayOfObject.iy(4, this.wNW.computeSize());
        this.wNW.writeFields(paramArrayOfObject);
      }
      if (this.wNX != null)
      {
        paramArrayOfObject.iy(5, this.wNX.computeSize());
        this.wNX.writeFields(paramArrayOfObject);
      }
      if (this.wCO != null)
        paramArrayOfObject.e(6, this.wCO);
      paramArrayOfObject.e(7, 8, this.wmz);
      paramArrayOfObject.aO(8, this.wCP);
      paramArrayOfObject.iz(9, this.vES);
      if (this.wNY != null)
        paramArrayOfObject.e(10, this.wNY);
      paramArrayOfObject.iz(11, this.wNZ);
      paramArrayOfObject.ai(12, this.wOa);
      AppMethodBeat.o(56924);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label1263;
    label1263: for (paramInt = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.kdT);
      paramInt = i;
      if (this.kdU != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.kdU);
      i = paramInt;
      if (this.wNW != null)
        i = paramInt + e.a.a.a.ix(4, this.wNW.computeSize());
      paramInt = i;
      if (this.wNX != null)
        paramInt = i + e.a.a.a.ix(5, this.wNX.computeSize());
      i = paramInt;
      if (this.wCO != null)
        i = paramInt + e.a.a.b.b.a.f(6, this.wCO);
      i = i + e.a.a.a.c(7, 8, this.wmz) + (e.a.a.b.b.a.fv(8) + 1) + e.a.a.b.b.a.bs(9, this.vES);
      paramInt = i;
      if (this.wNY != null)
        paramInt = i + e.a.a.b.b.a.f(10, this.wNY);
      paramInt = paramInt + e.a.a.b.b.a.bs(11, this.wNZ) + e.a.a.b.b.a.o(12, this.wOa);
      AppMethodBeat.o(56924);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.wmz.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = btd.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = btd.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.BaseResponse == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
          AppMethodBeat.o(56924);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(56924);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        bla localbla = (bla)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(56924);
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
            localbla.BaseResponse = ((BaseResponse)localObject1);
          }
          AppMethodBeat.o(56924);
          paramInt = i;
          break;
        case 2:
          localbla.kdT = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56924);
          paramInt = i;
          break;
        case 3:
          localbla.kdU = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56924);
          paramInt = i;
          break;
        case 4:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new aum();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((aum)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbla.wNW = ((aum)localObject1);
          }
          AppMethodBeat.o(56924);
          paramInt = i;
          break;
        case 5:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new bls();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bls)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbla.wNX = ((bls)localObject1);
          }
          AppMethodBeat.o(56924);
          paramInt = i;
          break;
        case 6:
          localbla.wCO = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56924);
          paramInt = i;
          break;
        case 7:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new oq();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbla.wmz.add(paramArrayOfObject);
          }
          AppMethodBeat.o(56924);
          paramInt = i;
          break;
        case 8:
          localbla.wCP = ((e.a.a.a.a)localObject1).BTU.ehX();
          AppMethodBeat.o(56924);
          paramInt = i;
          break;
        case 9:
          localbla.vES = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56924);
          paramInt = i;
          break;
        case 10:
          localbla.wNY = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56924);
          paramInt = i;
          break;
        case 11:
          localbla.wNZ = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56924);
          paramInt = i;
          break;
        case 12:
          localbla.wOa = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(56924);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(56924);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bla
 * JD-Core Version:    0.6.2
 */