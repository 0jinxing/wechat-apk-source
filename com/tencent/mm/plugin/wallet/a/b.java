package com.tencent.mm.plugin.wallet.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class b extends com.tencent.mm.bt.a
{
  public m tmC;
  public int tmD;
  public String tmE;
  public String tmF;
  public String tmG;
  public String tmH;
  public String tmI;
  public String tmJ;
  public String tmK;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(56642);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.tmC != null)
      {
        paramArrayOfObject.iy(1, this.tmC.computeSize());
        this.tmC.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(2, this.tmD);
      if (this.tmE != null)
        paramArrayOfObject.e(3, this.tmE);
      if (this.tmF != null)
        paramArrayOfObject.e(4, this.tmF);
      if (this.tmG != null)
        paramArrayOfObject.e(5, this.tmG);
      if (this.tmH != null)
        paramArrayOfObject.e(6, this.tmH);
      if (this.tmI != null)
        paramArrayOfObject.e(7, this.tmI);
      if (this.tmJ != null)
        paramArrayOfObject.e(8, this.tmJ);
      if (this.tmK != null)
        paramArrayOfObject.e(9, this.tmK);
      AppMethodBeat.o(56642);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.tmC == null)
        break label820;
    label820: for (paramInt = e.a.a.a.ix(1, this.tmC.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.tmD);
      paramInt = i;
      if (this.tmE != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.tmE);
      i = paramInt;
      if (this.tmF != null)
        i = paramInt + e.a.a.b.b.a.f(4, this.tmF);
      paramInt = i;
      if (this.tmG != null)
        paramInt = i + e.a.a.b.b.a.f(5, this.tmG);
      i = paramInt;
      if (this.tmH != null)
        i = paramInt + e.a.a.b.b.a.f(6, this.tmH);
      paramInt = i;
      if (this.tmI != null)
        paramInt = i + e.a.a.b.b.a.f(7, this.tmI);
      i = paramInt;
      if (this.tmJ != null)
        i = paramInt + e.a.a.b.b.a.f(8, this.tmJ);
      paramInt = i;
      if (this.tmK != null)
        paramInt = i + e.a.a.b.b.a.f(9, this.tmK);
      AppMethodBeat.o(56642);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(56642);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        b localb = (b)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(56642);
          break;
        case 1:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new m();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((m)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localb.tmC = ((m)localObject1);
          }
          AppMethodBeat.o(56642);
          paramInt = i;
          break;
        case 2:
          localb.tmD = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56642);
          paramInt = i;
          break;
        case 3:
          localb.tmE = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56642);
          paramInt = i;
          break;
        case 4:
          localb.tmF = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56642);
          paramInt = i;
          break;
        case 5:
          localb.tmG = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56642);
          paramInt = i;
          break;
        case 6:
          localb.tmH = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56642);
          paramInt = i;
          break;
        case 7:
          localb.tmI = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56642);
          paramInt = i;
          break;
        case 8:
          localb.tmJ = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56642);
          paramInt = i;
          break;
        case 9:
          localb.tmK = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56642);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(56642);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.a.b
 * JD-Core Version:    0.6.2
 */