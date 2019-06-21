package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class bsx extends com.tencent.mm.bt.a
{
  public int wTu;
  public SKBuiltinBuffer_t wVc;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(28617);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.wVc == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: ResData");
        AppMethodBeat.o(28617);
        throw paramArrayOfObject;
      }
      paramArrayOfObject.iz(1, this.wTu);
      if (this.wVc != null)
      {
        paramArrayOfObject.iy(2, this.wVc.computeSize());
        this.wVc.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(28617);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      int i;
      if (paramInt == 1)
      {
        i = e.a.a.b.b.a.bs(1, this.wTu) + 0;
        paramInt = i;
        if (this.wVc != null)
          paramInt = i + e.a.a.a.ix(2, this.wVc.computeSize());
        AppMethodBeat.o(28617);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.wVc == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: ResData");
          AppMethodBeat.o(28617);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(28617);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        bsx localbsx = (bsx)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          AppMethodBeat.o(28617);
          paramInt = -1;
          break;
        case 1:
          localbsx.wTu = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28617);
          paramInt = 0;
          break;
        case 2:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            Object localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new SKBuiltinBuffer_t();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbsx.wVc = paramArrayOfObject;
          }
          AppMethodBeat.o(28617);
          paramInt = 0;
          break;
        }
      }
      else
      {
        AppMethodBeat.o(28617);
        paramInt = -1;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bsx
 * JD-Core Version:    0.6.2
 */