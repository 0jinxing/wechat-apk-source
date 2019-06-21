package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class bdr extends com.tencent.mm.bt.a
{
  public int type;
  public auj vQK;
  public cgv wbo;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(48899);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.vQK != null)
      {
        paramArrayOfObject.iy(1, this.vQK.computeSize());
        this.vQK.writeFields(paramArrayOfObject);
      }
      if (this.wbo != null)
      {
        paramArrayOfObject.iy(2, this.wbo.computeSize());
        this.wbo.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(3, this.type);
      AppMethodBeat.o(48899);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.vQK == null)
        break label531;
    label531: for (paramInt = e.a.a.a.ix(1, this.vQK.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.wbo != null)
        i = paramInt + e.a.a.a.ix(2, this.wbo.computeSize());
      paramInt = i + e.a.a.b.b.a.bs(3, this.type);
      AppMethodBeat.o(48899);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(48899);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        bdr localbdr = (bdr)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(48899);
          break;
        case 1:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new auj();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((auj)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbdr.vQK = ((auj)localObject1);
          }
          AppMethodBeat.o(48899);
          paramInt = i;
          break;
        case 2:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new cgv();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((cgv)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbdr.wbo = ((cgv)localObject1);
          }
          AppMethodBeat.o(48899);
          paramInt = i;
          break;
        case 3:
          localbdr.type = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(48899);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(48899);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bdr
 * JD-Core Version:    0.6.2
 */