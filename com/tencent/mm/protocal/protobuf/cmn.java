package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class cmn extends com.tencent.mm.bt.a
{
  public String Desc;
  public int ID;
  public SKBuiltinBuffer_t xkq;
  public SKBuiltinBuffer_t xkr;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(28695);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.xkq == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: Icon");
        AppMethodBeat.o(28695);
        throw paramArrayOfObject;
      }
      if (this.xkr == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: HDIcon");
        AppMethodBeat.o(28695);
        throw paramArrayOfObject;
      }
      paramArrayOfObject.iz(1, this.ID);
      if (this.Desc != null)
        paramArrayOfObject.e(2, this.Desc);
      if (this.xkq != null)
      {
        paramArrayOfObject.iy(3, this.xkq.computeSize());
        this.xkq.writeFields(paramArrayOfObject);
      }
      if (this.xkr != null)
      {
        paramArrayOfObject.iy(4, this.xkr.computeSize());
        this.xkr.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(28695);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      int i;
      if (paramInt == 1)
      {
        i = e.a.a.b.b.a.bs(1, this.ID) + 0;
        paramInt = i;
        if (this.Desc != null)
          paramInt = i + e.a.a.b.b.a.f(2, this.Desc);
        i = paramInt;
        if (this.xkq != null)
          i = paramInt + e.a.a.a.ix(3, this.xkq.computeSize());
        paramInt = i;
        if (this.xkr != null)
          paramInt = i + e.a.a.a.ix(4, this.xkr.computeSize());
        AppMethodBeat.o(28695);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.xkq == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: Icon");
          AppMethodBeat.o(28695);
          throw paramArrayOfObject;
        }
        if (this.xkr == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: HDIcon");
          AppMethodBeat.o(28695);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(28695);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        cmn localcmn = (cmn)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(28695);
          break;
        case 1:
          localcmn.ID = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28695);
          paramInt = 0;
          break;
        case 2:
          localcmn.Desc = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28695);
          paramInt = 0;
          break;
        case 3:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new SKBuiltinBuffer_t();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((SKBuiltinBuffer_t)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcmn.xkq = ((SKBuiltinBuffer_t)localObject1);
          }
          AppMethodBeat.o(28695);
          paramInt = 0;
          break;
        case 4:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new SKBuiltinBuffer_t();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcmn.xkr = paramArrayOfObject;
          }
          AppMethodBeat.o(28695);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(28695);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cmn
 * JD-Core Version:    0.6.2
 */