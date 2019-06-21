package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class buy extends com.tencent.mm.bt.a
{
  public int ReqType;
  public SKBuiltinBuffer_t wok;
  public String wol;
  public long won;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(62579);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.wol == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: KeyWord");
        AppMethodBeat.o(62579);
        throw paramArrayOfObject;
      }
      paramArrayOfObject.iz(1, this.ReqType);
      if (this.wol != null)
        paramArrayOfObject.e(2, this.wol);
      if (this.wok != null)
      {
        paramArrayOfObject.iy(3, this.wok.computeSize());
        this.wok.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.ai(4, this.won);
      AppMethodBeat.o(62579);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      int i;
      if (paramInt == 1)
      {
        i = e.a.a.b.b.a.bs(1, this.ReqType) + 0;
        paramInt = i;
        if (this.wol != null)
          paramInt = i + e.a.a.b.b.a.f(2, this.wol);
        i = paramInt;
        if (this.wok != null)
          i = paramInt + e.a.a.a.ix(3, this.wok.computeSize());
        paramInt = i + e.a.a.b.b.a.o(4, this.won);
        AppMethodBeat.o(62579);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.wol == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: KeyWord");
          AppMethodBeat.o(62579);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(62579);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        buy localbuy = (buy)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(62579);
          break;
        case 1:
          localbuy.ReqType = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(62579);
          paramInt = 0;
          break;
        case 2:
          localbuy.wol = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(62579);
          paramInt = 0;
          break;
        case 3:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            Object localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new SKBuiltinBuffer_t();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((SKBuiltinBuffer_t)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbuy.wok = ((SKBuiltinBuffer_t)localObject1);
          }
          AppMethodBeat.o(62579);
          paramInt = 0;
          break;
        case 4:
          localbuy.won = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(62579);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(62579);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.buy
 * JD-Core Version:    0.6.2
 */