package com.tencent.mm.plugin.downloader.c.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class a extends com.tencent.mm.bt.a
{
  public String cIY;
  public p kKL;
  public p kKM;
  public String kKN;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(35525);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.cIY != null)
        paramArrayOfObject.e(1, this.cIY);
      if (this.kKL != null)
      {
        paramArrayOfObject.iy(2, this.kKL.computeSize());
        this.kKL.writeFields(paramArrayOfObject);
      }
      if (this.kKM != null)
      {
        paramArrayOfObject.iy(3, this.kKM.computeSize());
        this.kKM.writeFields(paramArrayOfObject);
      }
      if (this.kKN != null)
        paramArrayOfObject.e(4, this.kKN);
      AppMethodBeat.o(35525);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.cIY == null)
        break label609;
    label609: for (i = e.a.a.b.b.a.f(1, this.cIY) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.kKL != null)
        paramInt = i + e.a.a.a.ix(2, this.kKL.computeSize());
      i = paramInt;
      if (this.kKM != null)
        i = paramInt + e.a.a.a.ix(3, this.kKM.computeSize());
      paramInt = i;
      if (this.kKN != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.kKN);
      AppMethodBeat.o(35525);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(35525);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        a locala = (a)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(35525);
          break;
        case 1:
          locala.cIY = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(35525);
          paramInt = i;
          break;
        case 2:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new p();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            locala.kKL = paramArrayOfObject;
          }
          AppMethodBeat.o(35525);
          paramInt = i;
          break;
        case 3:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new p();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((p)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            locala.kKM = ((p)localObject1);
          }
          AppMethodBeat.o(35525);
          paramInt = i;
          break;
        case 4:
          locala.kKN = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(35525);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(35525);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.downloader.c.b.a
 * JD-Core Version:    0.6.2
 */