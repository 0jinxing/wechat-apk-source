package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class bil extends com.tencent.mm.bt.a
{
  public int uin;
  public int version;
  public SKBuiltinBuffer_t wLO;
  public int wLP;
  public SKBuiltinBuffer_t wLQ;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(51770);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.uin);
      paramArrayOfObject.iz(2, this.version);
      if (this.wLO != null)
      {
        paramArrayOfObject.iy(3, this.wLO.computeSize());
        this.wLO.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(4, this.wLP);
      if (this.wLQ != null)
      {
        paramArrayOfObject.iy(5, this.wLQ.computeSize());
        this.wLQ.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(51770);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      int i;
      if (paramInt == 1)
      {
        i = e.a.a.b.b.a.bs(1, this.uin) + 0 + e.a.a.b.b.a.bs(2, this.version);
        paramInt = i;
        if (this.wLO != null)
          paramInt = i + e.a.a.a.ix(3, this.wLO.computeSize());
        i = paramInt + e.a.a.b.b.a.bs(4, this.wLP);
        paramInt = i;
        if (this.wLQ != null)
          paramInt = i + e.a.a.a.ix(5, this.wLQ.computeSize());
        AppMethodBeat.o(51770);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(51770);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        bil localbil = (bil)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(51770);
          break;
        case 1:
          localbil.uin = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(51770);
          paramInt = 0;
          break;
        case 2:
          localbil.version = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(51770);
          paramInt = 0;
          break;
        case 3:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new SKBuiltinBuffer_t();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbil.wLO = paramArrayOfObject;
          }
          AppMethodBeat.o(51770);
          paramInt = 0;
          break;
        case 4:
          localbil.wLP = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(51770);
          paramInt = 0;
          break;
        case 5:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new SKBuiltinBuffer_t();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbil.wLQ = paramArrayOfObject;
          }
          AppMethodBeat.o(51770);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(51770);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bil
 * JD-Core Version:    0.6.2
 */