package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class ajq extends com.tencent.mm.bt.a
{
  public int Ret;
  public asq vKM;
  public String wdB;
  public int wpk;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(10181);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.Ret);
      if (this.vKM != null)
      {
        paramArrayOfObject.iy(2, this.vKM.computeSize());
        this.vKM.writeFields(paramArrayOfObject);
      }
      if (this.wdB != null)
        paramArrayOfObject.e(3, this.wdB);
      paramArrayOfObject.iz(4, this.wpk);
      AppMethodBeat.o(10181);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      int i;
      if (paramInt == 1)
      {
        i = e.a.a.b.b.a.bs(1, this.Ret) + 0;
        paramInt = i;
        if (this.vKM != null)
          paramInt = i + e.a.a.a.ix(2, this.vKM.computeSize());
        i = paramInt;
        if (this.wdB != null)
          i = paramInt + e.a.a.b.b.a.f(3, this.wdB);
        paramInt = i + e.a.a.b.b.a.bs(4, this.wpk);
        AppMethodBeat.o(10181);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(10181);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        ajq localajq = (ajq)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(10181);
          break;
        case 1:
          localajq.Ret = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(10181);
          paramInt = 0;
          break;
        case 2:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            Object localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new asq();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((asq)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localajq.vKM = ((asq)localObject1);
          }
          AppMethodBeat.o(10181);
          paramInt = 0;
          break;
        case 3:
          localajq.wdB = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(10181);
          paramInt = 0;
          break;
        case 4:
          localajq.wpk = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(10181);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(10181);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.ajq
 * JD-Core Version:    0.6.2
 */