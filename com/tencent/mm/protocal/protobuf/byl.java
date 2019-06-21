package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class byl extends btd
{
  public String cMD;
  public String color;
  public String kbU;
  public String kbV;
  public String kbW;
  public String kbX;
  public int kbZ;
  public int kdC;
  public String kdg;
  public int qsn;
  public int qsq;
  public String qsr;
  public String qss;
  public String qst;
  public String qsu;
  public String qsv;
  public boolean qsw;
  public String title;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(28641);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(28641);
        throw paramArrayOfObject;
      }
      if (this.BaseResponse != null)
      {
        paramArrayOfObject.iy(1, this.BaseResponse.computeSize());
        this.BaseResponse.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(2, this.kdC);
      if (this.kbU != null)
        paramArrayOfObject.e(3, this.kbU);
      if (this.cMD != null)
        paramArrayOfObject.e(4, this.cMD);
      if (this.title != null)
        paramArrayOfObject.e(5, this.title);
      if (this.kbW != null)
        paramArrayOfObject.e(6, this.kbW);
      if (this.kbX != null)
        paramArrayOfObject.e(7, this.kbX);
      if (this.kdg != null)
        paramArrayOfObject.e(8, this.kdg);
      if (this.kbV != null)
        paramArrayOfObject.e(9, this.kbV);
      if (this.color != null)
        paramArrayOfObject.e(10, this.color);
      paramArrayOfObject.iz(11, this.qsn);
      paramArrayOfObject.iz(12, this.qsq);
      if (this.qsr != null)
        paramArrayOfObject.e(13, this.qsr);
      if (this.qss != null)
        paramArrayOfObject.e(14, this.qss);
      if (this.qst != null)
        paramArrayOfObject.e(19, this.qst);
      if (this.qsu != null)
        paramArrayOfObject.e(21, this.qsu);
      paramArrayOfObject.iz(22, this.kbZ);
      if (this.qsv != null)
        paramArrayOfObject.e(23, this.qsv);
      paramArrayOfObject.aO(24, this.qsw);
      AppMethodBeat.o(28641);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label1502;
    label1502: for (paramInt = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; paramInt = 0)
    {
      paramInt += e.a.a.b.b.a.bs(2, this.kdC);
      i = paramInt;
      if (this.kbU != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.kbU);
      paramInt = i;
      if (this.cMD != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.cMD);
      int j = paramInt;
      if (this.title != null)
        j = paramInt + e.a.a.b.b.a.f(5, this.title);
      i = j;
      if (this.kbW != null)
        i = j + e.a.a.b.b.a.f(6, this.kbW);
      paramInt = i;
      if (this.kbX != null)
        paramInt = i + e.a.a.b.b.a.f(7, this.kbX);
      i = paramInt;
      if (this.kdg != null)
        i = paramInt + e.a.a.b.b.a.f(8, this.kdg);
      paramInt = i;
      if (this.kbV != null)
        paramInt = i + e.a.a.b.b.a.f(9, this.kbV);
      i = paramInt;
      if (this.color != null)
        i = paramInt + e.a.a.b.b.a.f(10, this.color);
      paramInt = i + e.a.a.b.b.a.bs(11, this.qsn) + e.a.a.b.b.a.bs(12, this.qsq);
      i = paramInt;
      if (this.qsr != null)
        i = paramInt + e.a.a.b.b.a.f(13, this.qsr);
      paramInt = i;
      if (this.qss != null)
        paramInt = i + e.a.a.b.b.a.f(14, this.qss);
      i = paramInt;
      if (this.qst != null)
        i = paramInt + e.a.a.b.b.a.f(19, this.qst);
      paramInt = i;
      if (this.qsu != null)
        paramInt = i + e.a.a.b.b.a.f(21, this.qsu);
      i = paramInt + e.a.a.b.b.a.bs(22, this.kbZ);
      paramInt = i;
      if (this.qsv != null)
        paramInt = i + e.a.a.b.b.a.f(23, this.qsv);
      paramInt += e.a.a.b.b.a.fv(24) + 1;
      AppMethodBeat.o(28641);
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
          AppMethodBeat.o(28641);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(28641);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        byl localbyl = (byl)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        case 15:
        case 16:
        case 17:
        case 18:
        case 20:
        default:
          paramInt = -1;
          AppMethodBeat.o(28641);
          break;
        case 1:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new BaseResponse();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbyl.BaseResponse = paramArrayOfObject;
          }
          AppMethodBeat.o(28641);
          paramInt = i;
          break;
        case 2:
          localbyl.kdC = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28641);
          paramInt = i;
          break;
        case 3:
          localbyl.kbU = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28641);
          paramInt = i;
          break;
        case 4:
          localbyl.cMD = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28641);
          paramInt = i;
          break;
        case 5:
          localbyl.title = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28641);
          paramInt = i;
          break;
        case 6:
          localbyl.kbW = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28641);
          paramInt = i;
          break;
        case 7:
          localbyl.kbX = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28641);
          paramInt = i;
          break;
        case 8:
          localbyl.kdg = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28641);
          paramInt = i;
          break;
        case 9:
          localbyl.kbV = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28641);
          paramInt = i;
          break;
        case 10:
          localbyl.color = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28641);
          paramInt = i;
          break;
        case 11:
          localbyl.qsn = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28641);
          paramInt = i;
          break;
        case 12:
          localbyl.qsq = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28641);
          paramInt = i;
          break;
        case 13:
          localbyl.qsr = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28641);
          paramInt = i;
          break;
        case 14:
          localbyl.qss = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28641);
          paramInt = i;
          break;
        case 19:
          localbyl.qst = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28641);
          paramInt = i;
          break;
        case 21:
          localbyl.qsu = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28641);
          paramInt = i;
          break;
        case 22:
          localbyl.kbZ = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28641);
          paramInt = i;
          break;
        case 23:
          localbyl.qsv = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28641);
          paramInt = i;
          break;
        case 24:
          localbyl.qsw = ((e.a.a.a.a)localObject1).BTU.ehX();
          AppMethodBeat.o(28641);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(28641);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.byl
 * JD-Core Version:    0.6.2
 */