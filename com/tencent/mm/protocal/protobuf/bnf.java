package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class bnf extends btd
{
  public int kdT;
  public String kdU;
  public String twd;
  public bks vLc;
  public String wQc;
  public LinkedList<hb> wQd;

  public bnf()
  {
    AppMethodBeat.i(48928);
    this.wQd = new LinkedList();
    AppMethodBeat.o(48928);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(48929);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(48929);
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
      if (this.wQc != null)
        paramArrayOfObject.e(4, this.wQc);
      paramArrayOfObject.e(5, 8, this.wQd);
      if (this.vLc != null)
      {
        paramArrayOfObject.iy(6, this.vLc.computeSize());
        this.vLc.writeFields(paramArrayOfObject);
      }
      if (this.twd != null)
        paramArrayOfObject.e(7, this.twd);
      AppMethodBeat.o(48929);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label919;
    label919: for (paramInt = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.kdT);
      paramInt = i;
      if (this.kdU != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.kdU);
      i = paramInt;
      if (this.wQc != null)
        i = paramInt + e.a.a.b.b.a.f(4, this.wQc);
      i += e.a.a.a.c(5, 8, this.wQd);
      paramInt = i;
      if (this.vLc != null)
        paramInt = i + e.a.a.a.ix(6, this.vLc.computeSize());
      i = paramInt;
      if (this.twd != null)
        i = paramInt + e.a.a.b.b.a.f(7, this.twd);
      AppMethodBeat.o(48929);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.wQd.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = btd.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = btd.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.BaseResponse == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
          AppMethodBeat.o(48929);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(48929);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        bnf localbnf = (bnf)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(48929);
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
            localbnf.BaseResponse = ((BaseResponse)localObject1);
          }
          AppMethodBeat.o(48929);
          paramInt = i;
          break;
        case 2:
          localbnf.kdT = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(48929);
          paramInt = i;
          break;
        case 3:
          localbnf.kdU = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48929);
          paramInt = i;
          break;
        case 4:
          localbnf.wQc = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48929);
          paramInt = i;
          break;
        case 5:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new hb();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((hb)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbnf.wQd.add(localObject1);
          }
          AppMethodBeat.o(48929);
          paramInt = i;
          break;
        case 6:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new bks();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbnf.vLc = paramArrayOfObject;
          }
          AppMethodBeat.o(48929);
          paramInt = i;
          break;
        case 7:
          localbnf.twd = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48929);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(48929);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bnf
 * JD-Core Version:    0.6.2
 */