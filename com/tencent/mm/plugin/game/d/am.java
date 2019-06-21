package com.tencent.mm.plugin.game.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class am extends com.tencent.mm.bt.a
{
  public String Title;
  public String mZL;
  public String nbb;
  public LinkedList<ct> nbc;
  public dr nbd;

  public am()
  {
    AppMethodBeat.i(111578);
    this.nbc = new LinkedList();
    AppMethodBeat.o(111578);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(111579);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.nbb != null)
        paramArrayOfObject.e(1, this.nbb);
      if (this.Title != null)
        paramArrayOfObject.e(2, this.Title);
      paramArrayOfObject.e(3, 8, this.nbc);
      if (this.nbd != null)
      {
        paramArrayOfObject.iy(4, this.nbd.computeSize());
        this.nbd.writeFields(paramArrayOfObject);
      }
      if (this.mZL != null)
        paramArrayOfObject.e(5, this.mZL);
      AppMethodBeat.o(111579);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.nbb == null)
        break label660;
    label660: for (paramInt = e.a.a.b.b.a.f(1, this.nbb) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.Title != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.Title);
      i += e.a.a.a.c(3, 8, this.nbc);
      paramInt = i;
      if (this.nbd != null)
        paramInt = i + e.a.a.a.ix(4, this.nbd.computeSize());
      i = paramInt;
      if (this.mZL != null)
        i = paramInt + e.a.a.b.b.a.f(5, this.mZL);
      AppMethodBeat.o(111579);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.nbc.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(111579);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        am localam = (am)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(111579);
          break;
        case 1:
          localam.nbb = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(111579);
          paramInt = i;
          break;
        case 2:
          localam.Title = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(111579);
          paramInt = i;
          break;
        case 3:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new ct();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((ct)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localam.nbc.add(localObject1);
          }
          AppMethodBeat.o(111579);
          paramInt = i;
          break;
        case 4:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new dr();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localam.nbd = paramArrayOfObject;
          }
          AppMethodBeat.o(111579);
          paramInt = i;
          break;
        case 5:
          localam.mZL = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(111579);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(111579);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.d.am
 * JD-Core Version:    0.6.2
 */