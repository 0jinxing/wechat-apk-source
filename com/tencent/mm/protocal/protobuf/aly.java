package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class aly extends bsr
{
  public String ndT;
  public String wqY;
  public int wqZ;
  public LinkedList<bts> wra;
  public int wrb;

  public aly()
  {
    AppMethodBeat.i(56819);
    this.wra = new LinkedList();
    AppMethodBeat.o(56819);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(56820);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      if (this.wqY != null)
        paramArrayOfObject.e(2, this.wqY);
      paramArrayOfObject.iz(3, this.wqZ);
      paramArrayOfObject.e(4, 8, this.wra);
      if (this.ndT != null)
        paramArrayOfObject.e(5, this.ndT);
      paramArrayOfObject.iz(6, this.wrb);
      AppMethodBeat.o(56820);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label692;
    label692: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.wqY != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.wqY);
      i = i + e.a.a.b.b.a.bs(3, this.wqZ) + e.a.a.a.c(4, 8, this.wra);
      paramInt = i;
      if (this.ndT != null)
        paramInt = i + e.a.a.b.b.a.f(5, this.ndT);
      paramInt += e.a.a.b.b.a.bs(6, this.wrb);
      AppMethodBeat.o(56820);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.wra.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(56820);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        aly localaly = (aly)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(56820);
          break;
        case 1:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new hl();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((hl)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localaly.BaseRequest = ((hl)localObject1);
          }
          AppMethodBeat.o(56820);
          paramInt = i;
          break;
        case 2:
          localaly.wqY = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56820);
          paramInt = i;
          break;
        case 3:
          localaly.wqZ = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56820);
          paramInt = i;
          break;
        case 4:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new bts();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bts)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localaly.wra.add(localObject1);
          }
          AppMethodBeat.o(56820);
          paramInt = i;
          break;
        case 5:
          localaly.ndT = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56820);
          paramInt = i;
          break;
        case 6:
          localaly.wrb = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56820);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(56820);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.aly
 * JD-Core Version:    0.6.2
 */