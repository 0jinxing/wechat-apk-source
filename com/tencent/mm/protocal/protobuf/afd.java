package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class afd extends com.tencent.mm.bt.a
{
  public aw vRP;
  public String vWV;
  public LinkedList<String> wmD;

  public afd()
  {
    AppMethodBeat.i(56807);
    this.wmD = new LinkedList();
    AppMethodBeat.o(56807);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(56808);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.e(1, 1, this.wmD);
      if (this.vRP != null)
      {
        paramArrayOfObject.iy(2, this.vRP.computeSize());
        this.vRP.writeFields(paramArrayOfObject);
      }
      if (this.vWV != null)
        paramArrayOfObject.e(3, this.vWV);
      AppMethodBeat.o(56808);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      int i;
      if (paramInt == 1)
      {
        i = e.a.a.a.c(1, 1, this.wmD) + 0;
        paramInt = i;
        if (this.vRP != null)
          paramInt = i + e.a.a.a.ix(2, this.vRP.computeSize());
        i = paramInt;
        if (this.vWV != null)
          i = paramInt + e.a.a.b.b.a.f(3, this.vWV);
        AppMethodBeat.o(56808);
        paramInt = i;
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.wmD.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(56808);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        afd localafd = (afd)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(56808);
          break;
        case 1:
          localafd.wmD.add(((e.a.a.a.a)localObject1).BTU.readString());
          AppMethodBeat.o(56808);
          paramInt = 0;
          break;
        case 2:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            Object localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new aw();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((aw)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localafd.vRP = ((aw)localObject1);
          }
          AppMethodBeat.o(56808);
          paramInt = 0;
          break;
        case 3:
          localafd.vWV = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56808);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(56808);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.afd
 * JD-Core Version:    0.6.2
 */