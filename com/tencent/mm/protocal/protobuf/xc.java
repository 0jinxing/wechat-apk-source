package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class xc extends com.tencent.mm.bt.a
{
  public String title;
  public int type;
  public btr vCP;
  public ta vQL;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(48839);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.type);
      if (this.title != null)
        paramArrayOfObject.e(2, this.title);
      if (this.vCP != null)
      {
        paramArrayOfObject.iy(3, this.vCP.computeSize());
        this.vCP.writeFields(paramArrayOfObject);
      }
      if (this.vQL != null)
      {
        paramArrayOfObject.iy(4, this.vQL.computeSize());
        this.vQL.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(48839);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      int i;
      if (paramInt == 1)
      {
        paramInt = e.a.a.b.b.a.bs(1, this.type) + 0;
        i = paramInt;
        if (this.title != null)
          i = paramInt + e.a.a.b.b.a.f(2, this.title);
        paramInt = i;
        if (this.vCP != null)
          paramInt = i + e.a.a.a.ix(3, this.vCP.computeSize());
        i = paramInt;
        if (this.vQL != null)
          i = paramInt + e.a.a.a.ix(4, this.vQL.computeSize());
        AppMethodBeat.o(48839);
        paramInt = i;
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(48839);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        xc localxc = (xc)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(48839);
          break;
        case 1:
          localxc.type = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(48839);
          paramInt = 0;
          break;
        case 2:
          localxc.title = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48839);
          paramInt = 0;
          break;
        case 3:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new btr();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((btr)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localxc.vCP = ((btr)localObject1);
          }
          AppMethodBeat.o(48839);
          paramInt = 0;
          break;
        case 4:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new ta();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((ta)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localxc.vQL = ((ta)localObject1);
          }
          AppMethodBeat.o(48839);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(48839);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.xc
 * JD-Core Version:    0.6.2
 */