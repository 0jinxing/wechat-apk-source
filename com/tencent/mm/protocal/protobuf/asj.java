package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class asj extends com.tencent.mm.bt.a
{
  public String cIY;
  public int iAd;
  public String kdf;
  public String kfM;
  public asi wpr;
  public boolean wvW;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(48864);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.kdf != null)
        paramArrayOfObject.e(1, this.kdf);
      if (this.kfM != null)
        paramArrayOfObject.e(2, this.kfM);
      if (this.cIY != null)
        paramArrayOfObject.e(3, this.cIY);
      paramArrayOfObject.aO(4, this.wvW);
      paramArrayOfObject.iz(5, this.iAd);
      if (this.wpr != null)
      {
        paramArrayOfObject.iy(6, this.wpr.computeSize());
        this.wpr.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(48864);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.kdf == null)
        break label607;
    label607: for (i = e.a.a.b.b.a.f(1, this.kdf) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.kfM != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.kfM);
      i = paramInt;
      if (this.cIY != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.cIY);
      i = i + (e.a.a.b.b.a.fv(4) + 1) + e.a.a.b.b.a.bs(5, this.iAd);
      paramInt = i;
      if (this.wpr != null)
        paramInt = i + e.a.a.a.ix(6, this.wpr.computeSize());
      AppMethodBeat.o(48864);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(48864);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        asj localasj = (asj)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(48864);
          break;
        case 1:
          localasj.kdf = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48864);
          paramInt = i;
          break;
        case 2:
          localasj.kfM = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48864);
          paramInt = i;
          break;
        case 3:
          localasj.cIY = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48864);
          paramInt = i;
          break;
        case 4:
          localasj.wvW = ((e.a.a.a.a)localObject1).BTU.ehX();
          AppMethodBeat.o(48864);
          paramInt = i;
          break;
        case 5:
          localasj.iAd = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(48864);
          paramInt = i;
          break;
        case 6:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new asi();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((asi)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localasj.wpr = ((asi)localObject1);
          }
          AppMethodBeat.o(48864);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(48864);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.asj
 * JD-Core Version:    0.6.2
 */