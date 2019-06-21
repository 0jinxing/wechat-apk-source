package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class bmb extends btd
{
  public int nwA;
  public String nwB;
  public int nwF;
  public int nwL;
  public int nwM;
  public int nwN;
  public com.tencent.mm.bt.b nwO;
  public int nwQ;
  public int nwT;
  public LinkedList<blt> vIO;
  public long wOS;
  public int wPb;
  public int wPc;
  public LinkedList<blt> wPd;
  public String wPe;
  public com.tencent.mm.bt.b wPf;
  public int wPg;
  public int wem;
  public long wen;

  public bmb()
  {
    AppMethodBeat.i(28582);
    this.vIO = new LinkedList();
    this.wPd = new LinkedList();
    AppMethodBeat.o(28582);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(28583);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new e.a.a.b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(28583);
        throw paramArrayOfObject;
      }
      if (this.BaseResponse != null)
      {
        paramArrayOfObject.iy(1, this.BaseResponse.computeSize());
        this.BaseResponse.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(2, this.wem);
      paramArrayOfObject.ai(3, this.wen);
      paramArrayOfObject.iz(4, this.wPb);
      paramArrayOfObject.e(5, 8, this.vIO);
      paramArrayOfObject.iz(6, this.wPc);
      paramArrayOfObject.iz(7, this.nwL);
      paramArrayOfObject.iz(8, this.nwM);
      paramArrayOfObject.ai(9, this.wOS);
      paramArrayOfObject.iz(10, this.nwN);
      if (this.nwO != null)
        paramArrayOfObject.c(11, this.nwO);
      paramArrayOfObject.iz(12, this.nwF);
      paramArrayOfObject.iz(13, this.nwA);
      if (this.nwB != null)
        paramArrayOfObject.e(14, this.nwB);
      paramArrayOfObject.iz(15, this.nwQ);
      paramArrayOfObject.e(16, 8, this.wPd);
      paramArrayOfObject.iz(17, this.nwT);
      if (this.wPe != null)
        paramArrayOfObject.e(18, this.wPe);
      if (this.wPf != null)
        paramArrayOfObject.c(19, this.wPf);
      paramArrayOfObject.iz(20, this.wPg);
      AppMethodBeat.o(28583);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label1559;
    label1559: for (paramInt = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.wem) + e.a.a.b.b.a.o(3, this.wen) + e.a.a.b.b.a.bs(4, this.wPb) + e.a.a.a.c(5, 8, this.vIO) + e.a.a.b.b.a.bs(6, this.wPc) + e.a.a.b.b.a.bs(7, this.nwL) + e.a.a.b.b.a.bs(8, this.nwM) + e.a.a.b.b.a.o(9, this.wOS) + e.a.a.b.b.a.bs(10, this.nwN);
      paramInt = i;
      if (this.nwO != null)
        paramInt = i + e.a.a.b.b.a.b(11, this.nwO);
      i = paramInt + e.a.a.b.b.a.bs(12, this.nwF) + e.a.a.b.b.a.bs(13, this.nwA);
      paramInt = i;
      if (this.nwB != null)
        paramInt = i + e.a.a.b.b.a.f(14, this.nwB);
      i = paramInt + e.a.a.b.b.a.bs(15, this.nwQ) + e.a.a.a.c(16, 8, this.wPd) + e.a.a.b.b.a.bs(17, this.nwT);
      paramInt = i;
      if (this.wPe != null)
        paramInt = i + e.a.a.b.b.a.f(18, this.wPe);
      i = paramInt;
      if (this.wPf != null)
        i = paramInt + e.a.a.b.b.a.b(19, this.wPf);
      paramInt = i + e.a.a.b.b.a.bs(20, this.wPg);
      AppMethodBeat.o(28583);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.vIO.clear();
        this.wPd.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = btd.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = btd.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.BaseResponse == null)
        {
          paramArrayOfObject = new e.a.a.b("Not all required fields were included: BaseResponse");
          AppMethodBeat.o(28583);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(28583);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        bmb localbmb = (bmb)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(28583);
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
            localbmb.BaseResponse = paramArrayOfObject;
          }
          AppMethodBeat.o(28583);
          paramInt = i;
          break;
        case 2:
          localbmb.wem = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28583);
          paramInt = i;
          break;
        case 3:
          localbmb.wen = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(28583);
          paramInt = i;
          break;
        case 4:
          localbmb.wPb = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28583);
          paramInt = i;
          break;
        case 5:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new blt();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((blt)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbmb.vIO.add(localObject1);
          }
          AppMethodBeat.o(28583);
          paramInt = i;
          break;
        case 6:
          localbmb.wPc = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28583);
          paramInt = i;
          break;
        case 7:
          localbmb.nwL = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28583);
          paramInt = i;
          break;
        case 8:
          localbmb.nwM = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28583);
          paramInt = i;
          break;
        case 9:
          localbmb.wOS = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(28583);
          paramInt = i;
          break;
        case 10:
          localbmb.nwN = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28583);
          paramInt = i;
          break;
        case 11:
          localbmb.nwO = ((e.a.a.a.a)localObject1).BTU.emu();
          AppMethodBeat.o(28583);
          paramInt = i;
          break;
        case 12:
          localbmb.nwF = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28583);
          paramInt = i;
          break;
        case 13:
          localbmb.nwA = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28583);
          paramInt = i;
          break;
        case 14:
          localbmb.nwB = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28583);
          paramInt = i;
          break;
        case 15:
          localbmb.nwQ = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28583);
          paramInt = i;
          break;
        case 16:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new blt();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbmb.wPd.add(paramArrayOfObject);
          }
          AppMethodBeat.o(28583);
          paramInt = i;
          break;
        case 17:
          localbmb.nwT = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28583);
          paramInt = i;
          break;
        case 18:
          localbmb.wPe = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28583);
          paramInt = i;
          break;
        case 19:
          localbmb.wPf = ((e.a.a.a.a)localObject1).BTU.emu();
          AppMethodBeat.o(28583);
          paramInt = i;
          break;
        case 20:
          localbmb.wPg = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28583);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(28583);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bmb
 * JD-Core Version:    0.6.2
 */