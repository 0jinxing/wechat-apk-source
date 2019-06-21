package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class pv extends btd
{
  public String desc;
  public int kCl;
  public String kCm;
  public String pOy;
  public String vWr;
  public int vWs;
  public LinkedList<Integer> vWt;
  public int vWw;

  public pv()
  {
    AppMethodBeat.i(48808);
    this.vWt = new LinkedList();
    AppMethodBeat.o(48808);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(48809);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(48809);
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
      if (this.pOy != null)
        paramArrayOfObject.e(4, this.pOy);
      if (this.vWr != null)
        paramArrayOfObject.e(5, this.vWr);
      paramArrayOfObject.iz(6, this.vWs);
      paramArrayOfObject.e(7, 2, this.vWt);
      if (this.desc != null)
        paramArrayOfObject.e(8, this.desc);
      paramArrayOfObject.iz(9, this.vWw);
      AppMethodBeat.o(48809);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label839;
    label839: for (paramInt = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.kCl);
      paramInt = i;
      if (this.kCm != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.kCm);
      i = paramInt;
      if (this.pOy != null)
        i = paramInt + e.a.a.b.b.a.f(4, this.pOy);
      paramInt = i;
      if (this.vWr != null)
        paramInt = i + e.a.a.b.b.a.f(5, this.vWr);
      i = paramInt + e.a.a.b.b.a.bs(6, this.vWs) + e.a.a.a.c(7, 2, this.vWt);
      paramInt = i;
      if (this.desc != null)
        paramInt = i + e.a.a.b.b.a.f(8, this.desc);
      paramInt += e.a.a.b.b.a.bs(9, this.vWw);
      AppMethodBeat.o(48809);
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
          AppMethodBeat.o(48809);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(48809);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        pv localpv = (pv)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(48809);
          break;
        case 1:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new BaseResponse();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((BaseResponse)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localpv.BaseResponse = ((BaseResponse)localObject1);
          }
          AppMethodBeat.o(48809);
          paramInt = i;
          break;
        case 2:
          localpv.kCl = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(48809);
          paramInt = i;
          break;
        case 3:
          localpv.kCm = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48809);
          paramInt = i;
          break;
        case 4:
          localpv.pOy = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48809);
          paramInt = i;
          break;
        case 5:
          localpv.vWr = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48809);
          paramInt = i;
          break;
        case 6:
          localpv.vWs = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(48809);
          paramInt = i;
          break;
        case 7:
          localpv.vWt.add(Integer.valueOf(((e.a.a.a.a)localObject1).BTU.vd()));
          AppMethodBeat.o(48809);
          paramInt = i;
          break;
        case 8:
          localpv.desc = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48809);
          paramInt = i;
          break;
        case 9:
          localpv.vWw = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(48809);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(48809);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.pv
 * JD-Core Version:    0.6.2
 */