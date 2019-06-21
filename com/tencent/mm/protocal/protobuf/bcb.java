package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class bcb extends bsr
{
  public int Scene;
  public int vEp;
  public LinkedList<bcd> vKB;
  public int wGE;
  public LinkedList<bca> wGF;
  public int wGG;
  public String wGH;

  public bcb()
  {
    AppMethodBeat.i(51429);
    this.wGF = new LinkedList();
    this.vKB = new LinkedList();
    AppMethodBeat.o(51429);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(51430);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(2, this.vEp);
      paramArrayOfObject.iz(3, this.wGE);
      paramArrayOfObject.e(4, 8, this.wGF);
      paramArrayOfObject.iz(5, this.wGG);
      paramArrayOfObject.e(6, 8, this.vKB);
      if (this.wGH != null)
        paramArrayOfObject.e(7, this.wGH);
      paramArrayOfObject.iz(8, this.Scene);
      AppMethodBeat.o(51430);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label860;
    label860: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.vEp) + e.a.a.b.b.a.bs(3, this.wGE) + e.a.a.a.c(4, 8, this.wGF) + e.a.a.b.b.a.bs(5, this.wGG) + e.a.a.a.c(6, 8, this.vKB);
      paramInt = i;
      if (this.wGH != null)
        paramInt = i + e.a.a.b.b.a.f(7, this.wGH);
      paramInt += e.a.a.b.b.a.bs(8, this.Scene);
      AppMethodBeat.o(51430);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.wGF.clear();
        this.vKB.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(51430);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        bcb localbcb = (bcb)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(51430);
          break;
        case 1:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new hl();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbcb.BaseRequest = paramArrayOfObject;
          }
          AppMethodBeat.o(51430);
          paramInt = i;
          break;
        case 2:
          localbcb.vEp = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(51430);
          paramInt = i;
          break;
        case 3:
          localbcb.wGE = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(51430);
          paramInt = i;
          break;
        case 4:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new bca();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbcb.wGF.add(paramArrayOfObject);
          }
          AppMethodBeat.o(51430);
          paramInt = i;
          break;
        case 5:
          localbcb.wGG = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(51430);
          paramInt = i;
          break;
        case 6:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new bcd();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbcb.vKB.add(paramArrayOfObject);
          }
          AppMethodBeat.o(51430);
          paramInt = i;
          break;
        case 7:
          localbcb.wGH = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(51430);
          paramInt = i;
          break;
        case 8:
          localbcb.Scene = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(51430);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(51430);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bcb
 * JD-Core Version:    0.6.2
 */