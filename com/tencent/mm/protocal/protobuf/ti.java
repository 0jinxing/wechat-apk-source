package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class ti extends com.tencent.mm.bt.a
{
  public String nQB;
  public long timestamp;
  public String vGv;
  public String way;
  public te waz;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(124309);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.ai(1, this.timestamp);
      if (this.way != null)
        paramArrayOfObject.e(2, this.way);
      if (this.vGv != null)
        paramArrayOfObject.e(3, this.vGv);
      if (this.nQB != null)
        paramArrayOfObject.e(4, this.nQB);
      if (this.waz != null)
      {
        paramArrayOfObject.iy(5, this.waz.computeSize());
        this.waz.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(124309);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      int i;
      if (paramInt == 1)
      {
        i = e.a.a.b.b.a.o(1, this.timestamp) + 0;
        paramInt = i;
        if (this.way != null)
          paramInt = i + e.a.a.b.b.a.f(2, this.way);
        i = paramInt;
        if (this.vGv != null)
          i = paramInt + e.a.a.b.b.a.f(3, this.vGv);
        paramInt = i;
        if (this.nQB != null)
          paramInt = i + e.a.a.b.b.a.f(4, this.nQB);
        i = paramInt;
        if (this.waz != null)
          i = paramInt + e.a.a.a.ix(5, this.waz.computeSize());
        AppMethodBeat.o(124309);
        paramInt = i;
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(124309);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        ti localti = (ti)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(124309);
          break;
        case 1:
          localti.timestamp = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(124309);
          paramInt = 0;
          break;
        case 2:
          localti.way = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(124309);
          paramInt = 0;
          break;
        case 3:
          localti.vGv = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(124309);
          paramInt = 0;
          break;
        case 4:
          localti.nQB = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(124309);
          paramInt = 0;
          break;
        case 5:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            Object localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new te();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((te)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localti.waz = ((te)localObject1);
          }
          AppMethodBeat.o(124309);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(124309);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.ti
 * JD-Core Version:    0.6.2
 */