package com.tencent.mm.plugin.game.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class co extends com.tencent.mm.bt.a
{
  public String nap;
  public cp ndf;
  public cp ndg;
  public cp ndh;
  public cp ndi;
  public cp ndj;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(111652);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.ndf != null)
      {
        paramArrayOfObject.iy(1, this.ndf.computeSize());
        this.ndf.writeFields(paramArrayOfObject);
      }
      if (this.ndg != null)
      {
        paramArrayOfObject.iy(2, this.ndg.computeSize());
        this.ndg.writeFields(paramArrayOfObject);
      }
      if (this.ndh != null)
      {
        paramArrayOfObject.iy(3, this.ndh.computeSize());
        this.ndh.writeFields(paramArrayOfObject);
      }
      if (this.ndi != null)
      {
        paramArrayOfObject.iy(4, this.ndi.computeSize());
        this.ndi.writeFields(paramArrayOfObject);
      }
      if (this.ndj != null)
      {
        paramArrayOfObject.iy(6, this.ndj.computeSize());
        this.ndj.writeFields(paramArrayOfObject);
      }
      if (this.nap != null)
        paramArrayOfObject.e(5, this.nap);
      AppMethodBeat.o(111652);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.ndf == null)
        break label1025;
    label1025: for (i = e.a.a.a.ix(1, this.ndf.computeSize()) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.ndg != null)
        paramInt = i + e.a.a.a.ix(2, this.ndg.computeSize());
      i = paramInt;
      if (this.ndh != null)
        i = paramInt + e.a.a.a.ix(3, this.ndh.computeSize());
      int j = i;
      if (this.ndi != null)
        j = i + e.a.a.a.ix(4, this.ndi.computeSize());
      paramInt = j;
      if (this.ndj != null)
        paramInt = j + e.a.a.a.ix(6, this.ndj.computeSize());
      i = paramInt;
      if (this.nap != null)
        i = paramInt + e.a.a.b.b.a.f(5, this.nap);
      AppMethodBeat.o(111652);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(111652);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        co localco = (co)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(111652);
          break;
        case 1:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new cp();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localco.ndf = paramArrayOfObject;
          }
          AppMethodBeat.o(111652);
          paramInt = i;
          break;
        case 2:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new cp();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((cp)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localco.ndg = ((cp)localObject1);
          }
          AppMethodBeat.o(111652);
          paramInt = i;
          break;
        case 3:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new cp();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localco.ndh = paramArrayOfObject;
          }
          AppMethodBeat.o(111652);
          paramInt = i;
          break;
        case 4:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new cp();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((cp)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localco.ndi = ((cp)localObject1);
          }
          AppMethodBeat.o(111652);
          paramInt = i;
          break;
        case 6:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new cp();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((cp)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localco.ndj = ((cp)localObject1);
          }
          AppMethodBeat.o(111652);
          paramInt = i;
          break;
        case 5:
          localco.nap = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(111652);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(111652);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.d.co
 * JD-Core Version:    0.6.2
 */