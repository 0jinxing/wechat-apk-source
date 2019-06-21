package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class bqn extends com.tencent.mm.bt.a
{
  public int type;
  public cgv wbo;
  public String wpJ;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(48951);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.type);
      if (this.wpJ != null)
        paramArrayOfObject.e(2, this.wpJ);
      if (this.wbo != null)
      {
        paramArrayOfObject.iy(3, this.wbo.computeSize());
        this.wbo.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(48951);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      int i;
      if (paramInt == 1)
      {
        i = e.a.a.b.b.a.bs(1, this.type) + 0;
        paramInt = i;
        if (this.wpJ != null)
          paramInt = i + e.a.a.b.b.a.f(2, this.wpJ);
        i = paramInt;
        if (this.wbo != null)
          i = paramInt + e.a.a.a.ix(3, this.wbo.computeSize());
        AppMethodBeat.o(48951);
        paramInt = i;
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(48951);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        bqn localbqn = (bqn)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(48951);
          break;
        case 1:
          localbqn.type = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(48951);
          paramInt = 0;
          break;
        case 2:
          localbqn.wpJ = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48951);
          paramInt = 0;
          break;
        case 3:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            Object localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new cgv();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((cgv)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbqn.wbo = ((cgv)localObject1);
          }
          AppMethodBeat.o(48951);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(48951);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bqn
 * JD-Core Version:    0.6.2
 */