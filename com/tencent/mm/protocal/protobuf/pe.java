package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class pe extends btd
{
  public String desc;
  public String jMS;
  public int kCl;
  public String kCm;
  public String kdE;
  public String pOy;
  public String twd;
  public bpt vWf;
  public boolean vWq;
  public String vWr;
  public int vWs;
  public LinkedList<Integer> vWt;
  public String vWu;
  public int vWv;
  public int vWw;

  public pe()
  {
    AppMethodBeat.i(48795);
    this.vWt = new LinkedList();
    AppMethodBeat.o(48795);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(48796);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(48796);
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
      paramArrayOfObject.aO(4, this.vWq);
      if (this.pOy != null)
        paramArrayOfObject.e(5, this.pOy);
      if (this.vWr != null)
        paramArrayOfObject.e(6, this.vWr);
      if (this.jMS != null)
        paramArrayOfObject.e(7, this.jMS);
      paramArrayOfObject.iz(8, this.vWs);
      if (this.desc != null)
        paramArrayOfObject.e(9, this.desc);
      if (this.twd != null)
        paramArrayOfObject.e(10, this.twd);
      paramArrayOfObject.e(11, 2, this.vWt);
      if (this.vWu != null)
        paramArrayOfObject.e(12, this.vWu);
      if (this.kdE != null)
        paramArrayOfObject.e(13, this.kdE);
      paramArrayOfObject.iz(14, this.vWv);
      paramArrayOfObject.iz(15, this.vWw);
      if (this.vWf != null)
      {
        paramArrayOfObject.iy(16, this.vWf.computeSize());
        this.vWf.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(48796);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label1353;
    label1353: for (paramInt = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.kCl);
      paramInt = i;
      if (this.kCm != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.kCm);
      paramInt += e.a.a.b.b.a.fv(4) + 1;
      i = paramInt;
      if (this.pOy != null)
        i = paramInt + e.a.a.b.b.a.f(5, this.pOy);
      paramInt = i;
      if (this.vWr != null)
        paramInt = i + e.a.a.b.b.a.f(6, this.vWr);
      i = paramInt;
      if (this.jMS != null)
        i = paramInt + e.a.a.b.b.a.f(7, this.jMS);
      i += e.a.a.b.b.a.bs(8, this.vWs);
      paramInt = i;
      if (this.desc != null)
        paramInt = i + e.a.a.b.b.a.f(9, this.desc);
      i = paramInt;
      if (this.twd != null)
        i = paramInt + e.a.a.b.b.a.f(10, this.twd);
      i += e.a.a.a.c(11, 2, this.vWt);
      paramInt = i;
      if (this.vWu != null)
        paramInt = i + e.a.a.b.b.a.f(12, this.vWu);
      i = paramInt;
      if (this.kdE != null)
        i = paramInt + e.a.a.b.b.a.f(13, this.kdE);
      i = i + e.a.a.b.b.a.bs(14, this.vWv) + e.a.a.b.b.a.bs(15, this.vWw);
      paramInt = i;
      if (this.vWf != null)
        paramInt = i + e.a.a.a.ix(16, this.vWf.computeSize());
      AppMethodBeat.o(48796);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.vWt.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = btd.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = btd.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.BaseResponse == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
          AppMethodBeat.o(48796);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(48796);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        pe localpe = (pe)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(48796);
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
            localpe.BaseResponse = ((BaseResponse)localObject1);
          }
          AppMethodBeat.o(48796);
          paramInt = i;
          break;
        case 2:
          localpe.kCl = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(48796);
          paramInt = i;
          break;
        case 3:
          localpe.kCm = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48796);
          paramInt = i;
          break;
        case 4:
          localpe.vWq = ((e.a.a.a.a)localObject1).BTU.ehX();
          AppMethodBeat.o(48796);
          paramInt = i;
          break;
        case 5:
          localpe.pOy = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48796);
          paramInt = i;
          break;
        case 6:
          localpe.vWr = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48796);
          paramInt = i;
          break;
        case 7:
          localpe.jMS = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48796);
          paramInt = i;
          break;
        case 8:
          localpe.vWs = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(48796);
          paramInt = i;
          break;
        case 9:
          localpe.desc = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48796);
          paramInt = i;
          break;
        case 10:
          localpe.twd = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48796);
          paramInt = i;
          break;
        case 11:
          localpe.vWt.add(Integer.valueOf(((e.a.a.a.a)localObject1).BTU.vd()));
          AppMethodBeat.o(48796);
          paramInt = i;
          break;
        case 12:
          localpe.vWu = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48796);
          paramInt = i;
          break;
        case 13:
          localpe.kdE = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48796);
          paramInt = i;
          break;
        case 14:
          localpe.vWv = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(48796);
          paramInt = i;
          break;
        case 15:
          localpe.vWw = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(48796);
          paramInt = i;
          break;
        case 16:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new bpt();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bpt)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localpe.vWf = ((bpt)localObject1);
          }
          AppMethodBeat.o(48796);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(48796);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.pe
 * JD-Core Version:    0.6.2
 */