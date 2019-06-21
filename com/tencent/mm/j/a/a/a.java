package com.tencent.mm.j.a.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class a extends com.tencent.mm.bt.a
{
  public int bJt;
  public int cGj;
  public int ehD;
  public LinkedList<b> eow;
  public String eox;
  public int eoy;
  public int status;
  public int type;

  public a()
  {
    AppMethodBeat.i(59614);
    this.eow = new LinkedList();
    AppMethodBeat.o(59614);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(59615);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.e(1, 8, this.eow);
      paramArrayOfObject.iz(2, this.bJt);
      paramArrayOfObject.iz(3, this.type);
      paramArrayOfObject.iz(4, this.status);
      paramArrayOfObject.iz(5, this.ehD);
      if (this.eox != null)
        paramArrayOfObject.e(6, this.eox);
      paramArrayOfObject.iz(7, this.cGj);
      paramArrayOfObject.iz(8, this.eoy);
      AppMethodBeat.o(59615);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      int i;
      if (paramInt == 1)
      {
        i = e.a.a.a.c(1, 8, this.eow) + 0 + e.a.a.b.b.a.bs(2, this.bJt) + e.a.a.b.b.a.bs(3, this.type) + e.a.a.b.b.a.bs(4, this.status) + e.a.a.b.b.a.bs(5, this.ehD);
        paramInt = i;
        if (this.eox != null)
          paramInt = i + e.a.a.b.b.a.f(6, this.eox);
        paramInt = paramInt + e.a.a.b.b.a.bs(7, this.cGj) + e.a.a.b.b.a.bs(8, this.eoy);
        AppMethodBeat.o(59615);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.eow.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(59615);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        a locala = (a)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(59615);
          break;
        case 1:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            Object localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new b();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((b)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            locala.eow.add(localObject1);
          }
          AppMethodBeat.o(59615);
          paramInt = 0;
          break;
        case 2:
          locala.bJt = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(59615);
          paramInt = 0;
          break;
        case 3:
          locala.type = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(59615);
          paramInt = 0;
          break;
        case 4:
          locala.status = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(59615);
          paramInt = 0;
          break;
        case 5:
          locala.ehD = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(59615);
          paramInt = 0;
          break;
        case 6:
          locala.eox = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(59615);
          paramInt = 0;
          break;
        case 7:
          locala.cGj = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(59615);
          paramInt = 0;
          break;
        case 8:
          locala.eoy = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(59615);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(59615);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.j.a.a.a
 * JD-Core Version:    0.6.2
 */