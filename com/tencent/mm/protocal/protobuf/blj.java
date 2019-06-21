package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class blj extends btd
{
  public int vKp;
  public String vKq;
  public String vRN;
  public LinkedList<ze> wOp;
  public LinkedList<au> wOq;
  public int wOr;
  public int wpD;

  public blj()
  {
    AppMethodBeat.i(56929);
    this.wOp = new LinkedList();
    this.wOq = new LinkedList();
    AppMethodBeat.o(56929);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(56930);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse != null)
      {
        paramArrayOfObject.iy(1, this.BaseResponse.computeSize());
        this.BaseResponse.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(2, this.wpD);
      paramArrayOfObject.e(3, 8, this.wOp);
      if (this.vRN != null)
        paramArrayOfObject.e(4, this.vRN);
      paramArrayOfObject.iz(5, this.vKp);
      if (this.vKq != null)
        paramArrayOfObject.e(6, this.vKq);
      paramArrayOfObject.e(7, 8, this.wOq);
      paramArrayOfObject.iz(8, this.wOr);
      AppMethodBeat.o(56930);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label881;
    label881: for (paramInt = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.wpD) + e.a.a.a.c(3, 8, this.wOp);
      paramInt = i;
      if (this.vRN != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.vRN);
      i = paramInt + e.a.a.b.b.a.bs(5, this.vKp);
      paramInt = i;
      if (this.vKq != null)
        paramInt = i + e.a.a.b.b.a.f(6, this.vKq);
      paramInt = paramInt + e.a.a.a.c(7, 8, this.wOq) + e.a.a.b.b.a.bs(8, this.wOr);
      AppMethodBeat.o(56930);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.wOp.clear();
        this.wOq.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = btd.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = btd.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(56930);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        blj localblj = (blj)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(56930);
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
            localblj.BaseResponse = paramArrayOfObject;
          }
          AppMethodBeat.o(56930);
          paramInt = i;
          break;
        case 2:
          localblj.wpD = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56930);
          paramInt = i;
          break;
        case 3:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new ze();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localblj.wOp.add(paramArrayOfObject);
          }
          AppMethodBeat.o(56930);
          paramInt = i;
          break;
        case 4:
          localblj.vRN = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56930);
          paramInt = i;
          break;
        case 5:
          localblj.vKp = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56930);
          paramInt = i;
          break;
        case 6:
          localblj.vKq = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56930);
          paramInt = i;
          break;
        case 7:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new au();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((au)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localblj.wOq.add(localObject1);
          }
          AppMethodBeat.o(56930);
          paramInt = i;
          break;
        case 8:
          localblj.wOr = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56930);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(56930);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.blj
 * JD-Core Version:    0.6.2
 */