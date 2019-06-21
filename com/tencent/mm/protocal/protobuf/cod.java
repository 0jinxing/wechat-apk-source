package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class cod extends com.tencent.mm.bt.a
{
  public int fJT;
  public String vZx;
  public SKBuiltinBuffer_t xiP;
  public int xlD;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(116817);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.xiP == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: Text");
        AppMethodBeat.o(116817);
        throw paramArrayOfObject;
      }
      if (this.xiP != null)
      {
        paramArrayOfObject.iy(1, this.xiP.computeSize());
        this.xiP.writeFields(paramArrayOfObject);
      }
      if (this.vZx != null)
        paramArrayOfObject.e(2, this.vZx);
      paramArrayOfObject.iz(3, this.fJT);
      paramArrayOfObject.iz(4, this.xlD);
      AppMethodBeat.o(116817);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.xiP == null)
        break label528;
    label528: for (paramInt = e.a.a.a.ix(1, this.xiP.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.vZx != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.vZx);
      paramInt = i + e.a.a.b.b.a.bs(3, this.fJT) + e.a.a.b.b.a.bs(4, this.xlD);
      AppMethodBeat.o(116817);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.xiP == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: Text");
          AppMethodBeat.o(116817);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(116817);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        cod localcod = (cod)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(116817);
          break;
        case 1:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new SKBuiltinBuffer_t();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcod.xiP = paramArrayOfObject;
          }
          AppMethodBeat.o(116817);
          paramInt = i;
          break;
        case 2:
          localcod.vZx = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(116817);
          paramInt = i;
          break;
        case 3:
          localcod.fJT = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(116817);
          paramInt = i;
          break;
        case 4:
          localcod.xlD = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(116817);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(116817);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cod
 * JD-Core Version:    0.6.2
 */