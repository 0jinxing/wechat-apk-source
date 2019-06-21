package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class css extends bsr
{
  public String cvF;
  public int scene;
  public int tZU;
  public double xpX;
  public double xpY;
  public String xpZ;
  public LinkedList<cml> xqa;

  public css()
  {
    AppMethodBeat.i(93806);
    this.xqa = new LinkedList();
    AppMethodBeat.o(93806);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(93807);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.f(2, this.xpX);
      paramArrayOfObject.f(3, this.xpY);
      if (this.xpZ != null)
        paramArrayOfObject.e(4, this.xpZ);
      paramArrayOfObject.iz(5, this.tZU);
      if (this.cvF != null)
        paramArrayOfObject.e(6, this.cvF);
      paramArrayOfObject.iz(7, this.scene);
      paramArrayOfObject.e(8, 8, this.xqa);
      AppMethodBeat.o(93807);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label792;
    label792: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + (e.a.a.b.b.a.fv(2) + 8) + (e.a.a.b.b.a.fv(3) + 8);
      paramInt = i;
      if (this.xpZ != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.xpZ);
      i = paramInt + e.a.a.b.b.a.bs(5, this.tZU);
      paramInt = i;
      if (this.cvF != null)
        paramInt = i + e.a.a.b.b.a.f(6, this.cvF);
      paramInt = paramInt + e.a.a.b.b.a.bs(7, this.scene) + e.a.a.a.c(8, 8, this.xqa);
      AppMethodBeat.o(93807);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.xqa.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(93807);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        css localcss = (css)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(93807);
          break;
        case 1:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new hl();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((hl)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcss.BaseRequest = ((hl)localObject1);
          }
          AppMethodBeat.o(93807);
          paramInt = i;
          break;
        case 2:
          localcss.xpX = Double.longBitsToDouble(((e.a.a.a.a)localObject1).BTU.eib());
          AppMethodBeat.o(93807);
          paramInt = i;
          break;
        case 3:
          localcss.xpY = Double.longBitsToDouble(((e.a.a.a.a)localObject1).BTU.eib());
          AppMethodBeat.o(93807);
          paramInt = i;
          break;
        case 4:
          localcss.xpZ = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(93807);
          paramInt = i;
          break;
        case 5:
          localcss.tZU = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(93807);
          paramInt = i;
          break;
        case 6:
          localcss.cvF = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(93807);
          paramInt = i;
          break;
        case 7:
          localcss.scene = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(93807);
          paramInt = i;
          break;
        case 8:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new cml();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((cml)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcss.xqa.add(localObject1);
          }
          AppMethodBeat.o(93807);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(93807);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.css
 * JD-Core Version:    0.6.2
 */