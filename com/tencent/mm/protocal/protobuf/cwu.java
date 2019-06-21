package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class cwu extends com.tencent.mm.bt.a
{
  public String wYs;
  public boolean xsf;
  public String xsu;
  public bzj xsv;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(115004);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.xsu != null)
        paramArrayOfObject.e(1, this.xsu);
      if (this.wYs != null)
        paramArrayOfObject.e(2, this.wYs);
      if (this.xsv != null)
      {
        paramArrayOfObject.iy(3, this.xsv.computeSize());
        this.xsv.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.aO(4, this.xsf);
      AppMethodBeat.o(115004);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.xsu == null)
        break label496;
    label496: for (i = e.a.a.b.b.a.f(1, this.xsu) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.wYs != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.wYs);
      i = paramInt;
      if (this.xsv != null)
        i = paramInt + e.a.a.a.ix(3, this.xsv.computeSize());
      paramInt = i + (e.a.a.b.b.a.fv(4) + 1);
      AppMethodBeat.o(115004);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(115004);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        cwu localcwu = (cwu)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(115004);
          break;
        case 1:
          localcwu.xsu = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(115004);
          paramInt = i;
          break;
        case 2:
          localcwu.wYs = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(115004);
          paramInt = i;
          break;
        case 3:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new bzj();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcwu.xsv = paramArrayOfObject;
          }
          AppMethodBeat.o(115004);
          paramInt = i;
          break;
        case 4:
          localcwu.xsf = ((e.a.a.a.a)localObject1).BTU.ehX();
          AppMethodBeat.o(115004);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(115004);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cwu
 * JD-Core Version:    0.6.2
 */