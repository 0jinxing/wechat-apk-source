package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class cbb extends com.tencent.mm.bt.a
{
  public int pcX;
  public String vHl;
  public SKBuiltinBuffer_t wZK;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(94576);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.wZK == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: HBBuffer");
        AppMethodBeat.o(94576);
        throw paramArrayOfObject;
      }
      if (this.vHl != null)
        paramArrayOfObject.e(1, this.vHl);
      paramArrayOfObject.iz(2, this.pcX);
      if (this.wZK != null)
      {
        paramArrayOfObject.iy(3, this.wZK.computeSize());
        this.wZK.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(94576);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.vHl == null)
        break label482;
    label482: for (paramInt = e.a.a.b.b.a.f(1, this.vHl) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.pcX);
      paramInt = i;
      if (this.wZK != null)
        paramInt = i + e.a.a.a.ix(3, this.wZK.computeSize());
      AppMethodBeat.o(94576);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.wZK == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: HBBuffer");
          AppMethodBeat.o(94576);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(94576);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        cbb localcbb = (cbb)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(94576);
          break;
        case 1:
          localcbb.vHl = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(94576);
          paramInt = i;
          break;
        case 2:
          localcbb.pcX = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(94576);
          paramInt = i;
          break;
        case 3:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new SKBuiltinBuffer_t();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((SKBuiltinBuffer_t)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcbb.wZK = ((SKBuiltinBuffer_t)localObject1);
          }
          AppMethodBeat.o(94576);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(94576);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cbb
 * JD-Core Version:    0.6.2
 */