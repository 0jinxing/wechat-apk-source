package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class rx extends bsr
{
  public int Scene;
  public String vKt;
  public LinkedList<Integer> vZk;
  public LinkedList<rw> vZl;

  public rx()
  {
    AppMethodBeat.i(14719);
    this.vZk = new LinkedList();
    this.vZl = new LinkedList();
    AppMethodBeat.o(14719);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(14720);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.e(2, 2, this.vZk);
      paramArrayOfObject.iz(3, this.Scene);
      if (this.vKt != null)
        paramArrayOfObject.e(4, this.vKt);
      paramArrayOfObject.e(5, 8, this.vZl);
      AppMethodBeat.o(14720);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label649;
    label649: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.a.c(2, 2, this.vZk) + e.a.a.b.b.a.bs(3, this.Scene);
      paramInt = i;
      if (this.vKt != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.vKt);
      paramInt += e.a.a.a.c(5, 8, this.vZl);
      AppMethodBeat.o(14720);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.vZk.clear();
        this.vZl.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(14720);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        rx localrx = (rx)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(14720);
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
            localrx.BaseRequest = paramArrayOfObject;
          }
          AppMethodBeat.o(14720);
          paramInt = i;
          break;
        case 2:
          localrx.vZk.add(Integer.valueOf(((e.a.a.a.a)localObject1).BTU.vd()));
          AppMethodBeat.o(14720);
          paramInt = i;
          break;
        case 3:
          localrx.Scene = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(14720);
          paramInt = i;
          break;
        case 4:
          localrx.vKt = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(14720);
          paramInt = i;
          break;
        case 5:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new rw();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localrx.vZl.add(paramArrayOfObject);
          }
          AppMethodBeat.o(14720);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(14720);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.rx
 * JD-Core Version:    0.6.2
 */