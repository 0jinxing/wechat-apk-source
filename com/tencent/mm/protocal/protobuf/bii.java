package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class bii extends com.tencent.mm.bt.a
{
  public String wLF;
  public String wLG;
  public String wLH;
  public int wLI;
  public String wLJ;
  public ny wLK;
  public String wLL;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(89116);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.wLF != null)
        paramArrayOfObject.e(1, this.wLF);
      if (this.wLG != null)
        paramArrayOfObject.e(2, this.wLG);
      if (this.wLH != null)
        paramArrayOfObject.e(3, this.wLH);
      paramArrayOfObject.iz(4, this.wLI);
      if (this.wLJ != null)
        paramArrayOfObject.e(5, this.wLJ);
      if (this.wLK != null)
      {
        paramArrayOfObject.iy(6, this.wLK.computeSize());
        this.wLK.writeFields(paramArrayOfObject);
      }
      if (this.wLL != null)
        paramArrayOfObject.e(7, this.wLL);
      AppMethodBeat.o(89116);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.wLF == null)
        break label689;
    label689: for (i = e.a.a.b.b.a.f(1, this.wLF) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.wLG != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.wLG);
      i = paramInt;
      if (this.wLH != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.wLH);
      i += e.a.a.b.b.a.bs(4, this.wLI);
      paramInt = i;
      if (this.wLJ != null)
        paramInt = i + e.a.a.b.b.a.f(5, this.wLJ);
      i = paramInt;
      if (this.wLK != null)
        i = paramInt + e.a.a.a.ix(6, this.wLK.computeSize());
      paramInt = i;
      if (this.wLL != null)
        paramInt = i + e.a.a.b.b.a.f(7, this.wLL);
      AppMethodBeat.o(89116);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(89116);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        bii localbii = (bii)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(89116);
          break;
        case 1:
          localbii.wLF = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(89116);
          paramInt = i;
          break;
        case 2:
          localbii.wLG = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(89116);
          paramInt = i;
          break;
        case 3:
          localbii.wLH = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(89116);
          paramInt = i;
          break;
        case 4:
          localbii.wLI = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(89116);
          paramInt = i;
          break;
        case 5:
          localbii.wLJ = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(89116);
          paramInt = i;
          break;
        case 6:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new ny();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbii.wLK = paramArrayOfObject;
          }
          AppMethodBeat.o(89116);
          paramInt = i;
          break;
        case 7:
          localbii.wLL = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(89116);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(89116);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bii
 * JD-Core Version:    0.6.2
 */