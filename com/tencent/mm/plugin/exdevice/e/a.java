package com.tencent.mm.plugin.exdevice.e;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bt.b;
import java.util.LinkedList;

public final class a extends i
{
  public String jBF;
  public b luJ;
  public int luK;
  public int luL;
  public int luM;
  public b luN;
  public b luO;
  public String luP;
  public String luQ;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(19418);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.lvj != null)
      {
        paramArrayOfObject.iy(1, this.lvj.computeSize());
        this.lvj.writeFields(paramArrayOfObject);
      }
      if (this.luJ != null)
        paramArrayOfObject.c(2, this.luJ);
      paramArrayOfObject.iz(3, this.luK);
      paramArrayOfObject.iz(4, this.luL);
      paramArrayOfObject.iz(5, this.luM);
      if (this.luN != null)
        paramArrayOfObject.c(6, this.luN);
      if (this.luO != null)
        paramArrayOfObject.c(7, this.luO);
      if (this.luP != null)
        paramArrayOfObject.e(10, this.luP);
      if (this.luQ != null)
        paramArrayOfObject.e(11, this.luQ);
      if (this.jBF != null)
        paramArrayOfObject.e(12, this.jBF);
      AppMethodBeat.o(19418);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.lvj == null)
        break label875;
    label875: for (paramInt = e.a.a.a.ix(1, this.lvj.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.luJ != null)
        i = paramInt + e.a.a.b.b.a.b(2, this.luJ);
      i = i + e.a.a.b.b.a.bs(3, this.luK) + e.a.a.b.b.a.bs(4, this.luL) + e.a.a.b.b.a.bs(5, this.luM);
      paramInt = i;
      if (this.luN != null)
        paramInt = i + e.a.a.b.b.a.b(6, this.luN);
      i = paramInt;
      if (this.luO != null)
        i = paramInt + e.a.a.b.b.a.b(7, this.luO);
      paramInt = i;
      if (this.luP != null)
        paramInt = i + e.a.a.b.b.a.f(10, this.luP);
      i = paramInt;
      if (this.luQ != null)
        i = paramInt + e.a.a.b.b.a.f(11, this.luQ);
      paramInt = i;
      if (this.jBF != null)
        paramInt = i + e.a.a.b.b.a.f(12, this.jBF);
      AppMethodBeat.o(19418);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = i.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = i.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(19418);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        a locala = (a)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        case 8:
        case 9:
        default:
          paramInt = -1;
          AppMethodBeat.o(19418);
          break;
        case 1:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new d();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((d)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, i.getNextFieldNumber((e.a.a.a.a)localObject2)));
            locala.lvj = ((d)localObject1);
          }
          AppMethodBeat.o(19418);
          paramInt = i;
          break;
        case 2:
          locala.luJ = ((e.a.a.a.a)localObject1).BTU.emu();
          AppMethodBeat.o(19418);
          paramInt = i;
          break;
        case 3:
          locala.luK = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(19418);
          paramInt = i;
          break;
        case 4:
          locala.luL = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(19418);
          paramInt = i;
          break;
        case 5:
          locala.luM = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(19418);
          paramInt = i;
          break;
        case 6:
          locala.luN = ((e.a.a.a.a)localObject1).BTU.emu();
          AppMethodBeat.o(19418);
          paramInt = i;
          break;
        case 7:
          locala.luO = ((e.a.a.a.a)localObject1).BTU.emu();
          AppMethodBeat.o(19418);
          paramInt = i;
          break;
        case 10:
          locala.luP = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(19418);
          paramInt = i;
          break;
        case 11:
          locala.luQ = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(19418);
          paramInt = i;
          break;
        case 12:
          locala.jBF = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(19418);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(19418);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.e.a
 * JD-Core Version:    0.6.2
 */