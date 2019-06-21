package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class ccc extends bsr
{
  public int OpCode;
  public int Scene;
  public int jBv;
  public LinkedList<bts> jBw;
  public String ncF;
  public long xbt;

  public ccc()
  {
    AppMethodBeat.i(94611);
    this.jBw = new LinkedList();
    AppMethodBeat.o(94611);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(94612);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(2, this.OpCode);
      paramArrayOfObject.ai(3, this.xbt);
      if (this.ncF != null)
        paramArrayOfObject.e(4, this.ncF);
      paramArrayOfObject.iz(5, this.jBv);
      paramArrayOfObject.e(6, 8, this.jBw);
      paramArrayOfObject.iz(7, this.Scene);
      AppMethodBeat.o(94612);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label718;
    label718: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.OpCode) + e.a.a.b.b.a.o(3, this.xbt);
      paramInt = i;
      if (this.ncF != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.ncF);
      paramInt = paramInt + e.a.a.b.b.a.bs(5, this.jBv) + e.a.a.a.c(6, 8, this.jBw) + e.a.a.b.b.a.bs(7, this.Scene);
      AppMethodBeat.o(94612);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.jBw.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(94612);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        ccc localccc = (ccc)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(94612);
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
            localccc.BaseRequest = ((hl)localObject1);
          }
          AppMethodBeat.o(94612);
          paramInt = i;
          break;
        case 2:
          localccc.OpCode = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(94612);
          paramInt = i;
          break;
        case 3:
          localccc.xbt = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(94612);
          paramInt = i;
          break;
        case 4:
          localccc.ncF = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(94612);
          paramInt = i;
          break;
        case 5:
          localccc.jBv = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(94612);
          paramInt = i;
          break;
        case 6:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new bts();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localccc.jBw.add(paramArrayOfObject);
          }
          AppMethodBeat.o(94612);
          paramInt = i;
          break;
        case 7:
          localccc.Scene = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(94612);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(94612);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.ccc
 * JD-Core Version:    0.6.2
 */