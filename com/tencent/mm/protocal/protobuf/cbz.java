package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class cbz extends com.tencent.mm.bt.a
{
  public int jBv;
  public LinkedList<bts> jBw;
  public String ncF;
  public long xbt;

  public cbz()
  {
    AppMethodBeat.i(94606);
    this.jBw = new LinkedList();
    AppMethodBeat.o(94606);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(94607);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.ai(1, this.xbt);
      if (this.ncF != null)
        paramArrayOfObject.e(2, this.ncF);
      paramArrayOfObject.iz(3, this.jBv);
      paramArrayOfObject.e(4, 8, this.jBw);
      AppMethodBeat.o(94607);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      int i;
      if (paramInt == 1)
      {
        i = e.a.a.b.b.a.o(1, this.xbt) + 0;
        paramInt = i;
        if (this.ncF != null)
          paramInt = i + e.a.a.b.b.a.f(2, this.ncF);
        paramInt = paramInt + e.a.a.b.b.a.bs(3, this.jBv) + e.a.a.a.c(4, 8, this.jBw);
        AppMethodBeat.o(94607);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.jBw.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(94607);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        cbz localcbz = (cbz)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(94607);
          break;
        case 1:
          localcbz.xbt = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(94607);
          paramInt = 0;
          break;
        case 2:
          localcbz.ncF = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(94607);
          paramInt = 0;
          break;
        case 3:
          localcbz.jBv = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(94607);
          paramInt = 0;
          break;
        case 4:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            Object localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new bts();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((bts)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcbz.jBw.add(localObject1);
          }
          AppMethodBeat.o(94607);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(94607);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cbz
 * JD-Core Version:    0.6.2
 */