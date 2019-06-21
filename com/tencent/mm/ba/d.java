package com.tencent.mm.ba;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class d extends com.tencent.mm.bt.a
{
  public int cKB;
  public LinkedList<e> fLY;
  public int fLZ;
  public int fMa;
  public int fMb;
  public String fMc;
  public String fMd;
  public int fMe;
  public int fMf;
  public int fMg;
  public int maxSize;
  public String name;

  public d()
  {
    AppMethodBeat.i(78440);
    this.fLY = new LinkedList();
    AppMethodBeat.o(78440);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(78441);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.e(1, 8, this.fLY);
      if (this.name != null)
        paramArrayOfObject.e(2, this.name);
      paramArrayOfObject.iz(3, this.fLZ);
      paramArrayOfObject.iz(4, this.cKB);
      paramArrayOfObject.iz(5, this.fMa);
      paramArrayOfObject.iz(6, this.fMb);
      if (this.fMc != null)
        paramArrayOfObject.e(7, this.fMc);
      if (this.fMd != null)
        paramArrayOfObject.e(8, this.fMd);
      paramArrayOfObject.iz(9, this.fMe);
      paramArrayOfObject.iz(10, this.fMf);
      paramArrayOfObject.iz(11, this.fMg);
      paramArrayOfObject.iz(12, this.maxSize);
      AppMethodBeat.o(78441);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      int i;
      if (paramInt == 1)
      {
        i = e.a.a.a.c(1, 8, this.fLY) + 0;
        paramInt = i;
        if (this.name != null)
          paramInt = i + e.a.a.b.b.a.f(2, this.name);
        i = paramInt + e.a.a.b.b.a.bs(3, this.fLZ) + e.a.a.b.b.a.bs(4, this.cKB) + e.a.a.b.b.a.bs(5, this.fMa) + e.a.a.b.b.a.bs(6, this.fMb);
        paramInt = i;
        if (this.fMc != null)
          paramInt = i + e.a.a.b.b.a.f(7, this.fMc);
        i = paramInt;
        if (this.fMd != null)
          i = paramInt + e.a.a.b.b.a.f(8, this.fMd);
        paramInt = i + e.a.a.b.b.a.bs(9, this.fMe) + e.a.a.b.b.a.bs(10, this.fMf) + e.a.a.b.b.a.bs(11, this.fMg) + e.a.a.b.b.a.bs(12, this.maxSize);
        AppMethodBeat.o(78441);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.fLY.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(78441);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        d locald = (d)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(78441);
          break;
        case 1:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            Object localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new e();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((e)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            locald.fLY.add(localObject1);
          }
          AppMethodBeat.o(78441);
          paramInt = 0;
          break;
        case 2:
          locald.name = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(78441);
          paramInt = 0;
          break;
        case 3:
          locald.fLZ = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(78441);
          paramInt = 0;
          break;
        case 4:
          locald.cKB = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(78441);
          paramInt = 0;
          break;
        case 5:
          locald.fMa = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(78441);
          paramInt = 0;
          break;
        case 6:
          locald.fMb = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(78441);
          paramInt = 0;
          break;
        case 7:
          locald.fMc = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(78441);
          paramInt = 0;
          break;
        case 8:
          locald.fMd = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(78441);
          paramInt = 0;
          break;
        case 9:
          locald.fMe = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(78441);
          paramInt = 0;
          break;
        case 10:
          locald.fMf = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(78441);
          paramInt = 0;
          break;
        case 11:
          locald.fMg = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(78441);
          paramInt = 0;
          break;
        case 12:
          locald.maxSize = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(78441);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(78441);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ba.d
 * JD-Core Version:    0.6.2
 */