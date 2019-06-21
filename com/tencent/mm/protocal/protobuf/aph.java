package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class aph extends btd
{
  public int wti;
  public String wtj;
  public int wtk;
  public String wtl;
  public int wtm;
  public LinkedList<bts> wtn;
  public String wto;
  public int wtp;
  public String wtq;
  public int wtr;
  public SKBuiltinBuffer_t wts;

  public aph()
  {
    AppMethodBeat.i(80102);
    this.wtn = new LinkedList();
    AppMethodBeat.o(80102);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(80103);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(80103);
        throw paramArrayOfObject;
      }
      if (this.BaseResponse != null)
      {
        paramArrayOfObject.iy(1, this.BaseResponse.computeSize());
        this.BaseResponse.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(2, this.wti);
      if (this.wtj != null)
        paramArrayOfObject.e(3, this.wtj);
      paramArrayOfObject.iz(4, this.wtk);
      if (this.wtl != null)
        paramArrayOfObject.e(5, this.wtl);
      paramArrayOfObject.iz(6, this.wtm);
      paramArrayOfObject.e(7, 8, this.wtn);
      if (this.wto != null)
        paramArrayOfObject.e(8, this.wto);
      paramArrayOfObject.iz(9, this.wtp);
      if (this.wtq != null)
        paramArrayOfObject.e(10, this.wtq);
      paramArrayOfObject.iz(11, this.wtr);
      if (this.wts != null)
      {
        paramArrayOfObject.iy(12, this.wts.computeSize());
        this.wts.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(80103);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label1173;
    label1173: for (paramInt = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.wti);
      paramInt = i;
      if (this.wtj != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.wtj);
      i = paramInt + e.a.a.b.b.a.bs(4, this.wtk);
      paramInt = i;
      if (this.wtl != null)
        paramInt = i + e.a.a.b.b.a.f(5, this.wtl);
      i = paramInt + e.a.a.b.b.a.bs(6, this.wtm) + e.a.a.a.c(7, 8, this.wtn);
      paramInt = i;
      if (this.wto != null)
        paramInt = i + e.a.a.b.b.a.f(8, this.wto);
      i = paramInt + e.a.a.b.b.a.bs(9, this.wtp);
      paramInt = i;
      if (this.wtq != null)
        paramInt = i + e.a.a.b.b.a.f(10, this.wtq);
      i = paramInt + e.a.a.b.b.a.bs(11, this.wtr);
      paramInt = i;
      if (this.wts != null)
        paramInt = i + e.a.a.a.ix(12, this.wts.computeSize());
      AppMethodBeat.o(80103);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.wtn.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = btd.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = btd.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.BaseResponse == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
          AppMethodBeat.o(80103);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(80103);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        aph localaph = (aph)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(80103);
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
            localaph.BaseResponse = ((BaseResponse)localObject1);
          }
          AppMethodBeat.o(80103);
          paramInt = i;
          break;
        case 2:
          localaph.wti = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(80103);
          paramInt = i;
          break;
        case 3:
          localaph.wtj = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(80103);
          paramInt = i;
          break;
        case 4:
          localaph.wtk = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(80103);
          paramInt = i;
          break;
        case 5:
          localaph.wtl = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(80103);
          paramInt = i;
          break;
        case 6:
          localaph.wtm = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(80103);
          paramInt = i;
          break;
        case 7:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new bts();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localaph.wtn.add(paramArrayOfObject);
          }
          AppMethodBeat.o(80103);
          paramInt = i;
          break;
        case 8:
          localaph.wto = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(80103);
          paramInt = i;
          break;
        case 9:
          localaph.wtp = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(80103);
          paramInt = i;
          break;
        case 10:
          localaph.wtq = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(80103);
          paramInt = i;
          break;
        case 11:
          localaph.wtr = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(80103);
          paramInt = i;
          break;
        case 12:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new SKBuiltinBuffer_t();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localaph.wts = paramArrayOfObject;
          }
          AppMethodBeat.o(80103);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(80103);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.aph
 * JD-Core Version:    0.6.2
 */