package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class bmk extends btd
{
  public int luT;
  public String luU;
  public int nwA;
  public String nwB;
  public int nwP;
  public int wPn;
  public int wPp;
  public int wPq;
  public int wem;
  public long wen;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(28594);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(28594);
        throw paramArrayOfObject;
      }
      if (this.BaseResponse != null)
      {
        paramArrayOfObject.iy(1, this.BaseResponse.computeSize());
        this.BaseResponse.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(3, this.wem);
      paramArrayOfObject.ai(4, this.wen);
      paramArrayOfObject.iz(5, this.wPp);
      paramArrayOfObject.iz(6, this.wPn);
      paramArrayOfObject.iz(7, this.nwP);
      paramArrayOfObject.iz(8, this.wPq);
      paramArrayOfObject.iz(9, this.luT);
      if (this.luU != null)
        paramArrayOfObject.e(10, this.luU);
      paramArrayOfObject.iz(11, this.nwA);
      if (this.nwB != null)
        paramArrayOfObject.e(12, this.nwB);
      AppMethodBeat.o(28594);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label898;
    label898: for (paramInt = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(3, this.wem) + e.a.a.b.b.a.o(4, this.wen) + e.a.a.b.b.a.bs(5, this.wPp) + e.a.a.b.b.a.bs(6, this.wPn) + e.a.a.b.b.a.bs(7, this.nwP) + e.a.a.b.b.a.bs(8, this.wPq) + e.a.a.b.b.a.bs(9, this.luT);
      paramInt = i;
      if (this.luU != null)
        paramInt = i + e.a.a.b.b.a.f(10, this.luU);
      i = paramInt + e.a.a.b.b.a.bs(11, this.nwA);
      paramInt = i;
      if (this.nwB != null)
        paramInt = i + e.a.a.b.b.a.f(12, this.nwB);
      AppMethodBeat.o(28594);
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
          AppMethodBeat.o(28594);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(28594);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        bmk localbmk = (bmk)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        case 2:
        default:
          AppMethodBeat.o(28594);
          paramInt = -1;
          break;
        case 1:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new BaseResponse();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbmk.BaseResponse = paramArrayOfObject;
          }
          AppMethodBeat.o(28594);
          paramInt = i;
          break;
        case 3:
          localbmk.wem = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28594);
          paramInt = i;
          break;
        case 4:
          localbmk.wen = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(28594);
          paramInt = i;
          break;
        case 5:
          localbmk.wPp = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28594);
          paramInt = i;
          break;
        case 6:
          localbmk.wPn = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28594);
          paramInt = i;
          break;
        case 7:
          localbmk.nwP = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28594);
          paramInt = i;
          break;
        case 8:
          localbmk.wPq = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28594);
          paramInt = i;
          break;
        case 9:
          localbmk.luT = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28594);
          paramInt = i;
          break;
        case 10:
          localbmk.luU = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28594);
          paramInt = i;
          break;
        case 11:
          localbmk.nwA = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28594);
          paramInt = i;
          break;
        case 12:
          localbmk.nwB = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28594);
          paramInt = i;
          break;
        }
      }
      AppMethodBeat.o(28594);
      paramInt = -1;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bmk
 * JD-Core Version:    0.6.2
 */