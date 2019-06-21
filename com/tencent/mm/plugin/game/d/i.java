package com.tencent.mm.plugin.game.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class i extends com.tencent.mm.bt.a
{
  public String mZL;
  public String mZM;
  public int mZN;
  public a mZO;
  public db mZP;
  public int mZQ;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(111549);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.mZM != null)
        paramArrayOfObject.e(1, this.mZM);
      paramArrayOfObject.iz(2, this.mZN);
      if (this.mZO != null)
      {
        paramArrayOfObject.iy(3, this.mZO.computeSize());
        this.mZO.writeFields(paramArrayOfObject);
      }
      if (this.mZP != null)
      {
        paramArrayOfObject.iy(4, this.mZP.computeSize());
        this.mZP.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(5, this.mZQ);
      if (this.mZL != null)
        paramArrayOfObject.e(6, this.mZL);
      AppMethodBeat.o(111549);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.mZM == null)
        break label704;
    label704: for (paramInt = e.a.a.b.b.a.f(1, this.mZM) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.mZN);
      paramInt = i;
      if (this.mZO != null)
        paramInt = i + e.a.a.a.ix(3, this.mZO.computeSize());
      i = paramInt;
      if (this.mZP != null)
        i = paramInt + e.a.a.a.ix(4, this.mZP.computeSize());
      i += e.a.a.b.b.a.bs(5, this.mZQ);
      paramInt = i;
      if (this.mZL != null)
        paramInt = i + e.a.a.b.b.a.f(6, this.mZL);
      AppMethodBeat.o(111549);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(111549);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        i locali = (i)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(111549);
          break;
        case 1:
          locali.mZM = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(111549);
          paramInt = i;
          break;
        case 2:
          locali.mZN = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(111549);
          paramInt = i;
          break;
        case 3:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new a();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((a)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            locali.mZO = ((a)localObject1);
          }
          AppMethodBeat.o(111549);
          paramInt = i;
          break;
        case 4:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new db();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((db)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            locali.mZP = ((db)localObject1);
          }
          AppMethodBeat.o(111549);
          paramInt = i;
          break;
        case 5:
          locali.mZQ = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(111549);
          paramInt = i;
          break;
        case 6:
          locali.mZL = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(111549);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(111549);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.d.i
 * JD-Core Version:    0.6.2
 */