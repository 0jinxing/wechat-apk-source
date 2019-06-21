package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class cob extends com.tencent.mm.bt.a
{
  public int ptx;
  public int xlA;
  public int xlB;
  public SKBuiltinBuffer_t xlC;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(28702);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.xlC == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: PieceData");
        AppMethodBeat.o(28702);
        throw paramArrayOfObject;
      }
      paramArrayOfObject.iz(1, this.ptx);
      paramArrayOfObject.iz(2, this.xlA);
      paramArrayOfObject.iz(3, this.xlB);
      if (this.xlC != null)
      {
        paramArrayOfObject.iy(4, this.xlC.computeSize());
        this.xlC.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(28702);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      int i;
      if (paramInt == 1)
      {
        i = e.a.a.b.b.a.bs(1, this.ptx) + 0 + e.a.a.b.b.a.bs(2, this.xlA) + e.a.a.b.b.a.bs(3, this.xlB);
        paramInt = i;
        if (this.xlC != null)
          paramInt = i + e.a.a.a.ix(4, this.xlC.computeSize());
        AppMethodBeat.o(28702);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.xlC == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: PieceData");
          AppMethodBeat.o(28702);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(28702);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        cob localcob = (cob)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(28702);
          break;
        case 1:
          localcob.ptx = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28702);
          paramInt = 0;
          break;
        case 2:
          localcob.xlA = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28702);
          paramInt = 0;
          break;
        case 3:
          localcob.xlB = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28702);
          paramInt = 0;
          break;
        case 4:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            Object localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new SKBuiltinBuffer_t();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcob.xlC = paramArrayOfObject;
          }
          AppMethodBeat.o(28702);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(28702);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cob
 * JD-Core Version:    0.6.2
 */