package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class bim extends com.tencent.mm.bt.a
{
  public int wLR;
  public SKBuiltinBuffer_t wLS;
  public int wLT;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(123510);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.wLR);
      if (this.wLS != null)
      {
        paramArrayOfObject.iy(2, this.wLS.computeSize());
        this.wLS.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(3, this.wLT);
      AppMethodBeat.o(123510);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      int i;
      if (paramInt == 1)
      {
        i = e.a.a.b.b.a.bs(1, this.wLR) + 0;
        paramInt = i;
        if (this.wLS != null)
          paramInt = i + e.a.a.a.ix(2, this.wLS.computeSize());
        paramInt += e.a.a.b.b.a.bs(3, this.wLT);
        AppMethodBeat.o(123510);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(123510);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        bim localbim = (bim)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(123510);
          break;
        case 1:
          localbim.wLR = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(123510);
          paramInt = 0;
          break;
        case 2:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            Object localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new SKBuiltinBuffer_t();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((SKBuiltinBuffer_t)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbim.wLS = ((SKBuiltinBuffer_t)localObject1);
          }
          AppMethodBeat.o(123510);
          paramInt = 0;
          break;
        case 3:
          localbim.wLT = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(123510);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(123510);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bim
 * JD-Core Version:    0.6.2
 */