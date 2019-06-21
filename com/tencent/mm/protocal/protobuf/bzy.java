package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class bzy extends com.tencent.mm.bt.a
{
  public int type;
  public String vJS;
  public cgv wHp;
  public bto wYU;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(48963);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.wHp != null)
      {
        paramArrayOfObject.iy(1, this.wHp.computeSize());
        this.wHp.writeFields(paramArrayOfObject);
      }
      if (this.wYU != null)
      {
        paramArrayOfObject.iy(2, this.wYU.computeSize());
        this.wYU.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(3, this.type);
      if (this.vJS != null)
        paramArrayOfObject.e(4, this.vJS);
      AppMethodBeat.o(48963);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.wHp == null)
        break label593;
    label593: for (paramInt = e.a.a.a.ix(1, this.wHp.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.wYU != null)
        i = paramInt + e.a.a.a.ix(2, this.wYU.computeSize());
      i += e.a.a.b.b.a.bs(3, this.type);
      paramInt = i;
      if (this.vJS != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.vJS);
      AppMethodBeat.o(48963);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(48963);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        bzy localbzy = (bzy)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(48963);
          break;
        case 1:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new cgv();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((cgv)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbzy.wHp = ((cgv)localObject1);
          }
          AppMethodBeat.o(48963);
          paramInt = i;
          break;
        case 2:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new bto();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbzy.wYU = paramArrayOfObject;
          }
          AppMethodBeat.o(48963);
          paramInt = i;
          break;
        case 3:
          localbzy.type = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(48963);
          paramInt = i;
          break;
        case 4:
          localbzy.vJS = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48963);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(48963);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bzy
 * JD-Core Version:    0.6.2
 */