package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class ceg extends bsr
{
  public String jBB;
  public int lvg;
  public String wZT;
  public long wZU;
  public long xbw;
  public int xbx;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(56521);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      if (this.wZT != null)
        paramArrayOfObject.e(2, this.wZT);
      if (this.jBB != null)
        paramArrayOfObject.e(3, this.jBB);
      paramArrayOfObject.iz(4, this.lvg);
      paramArrayOfObject.ai(5, this.wZU);
      paramArrayOfObject.ai(6, this.xbw);
      paramArrayOfObject.iz(7, this.xbx);
      AppMethodBeat.o(56521);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label637;
    label637: for (i = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.wZT != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.wZT);
      i = paramInt;
      if (this.jBB != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.jBB);
      paramInt = i + e.a.a.b.b.a.bs(4, this.lvg) + e.a.a.b.b.a.o(5, this.wZU) + e.a.a.b.b.a.o(6, this.xbw) + e.a.a.b.b.a.bs(7, this.xbx);
      AppMethodBeat.o(56521);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(56521);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        ceg localceg = (ceg)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(56521);
          break;
        case 1:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new hl();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localceg.BaseRequest = paramArrayOfObject;
          }
          AppMethodBeat.o(56521);
          paramInt = i;
          break;
        case 2:
          localceg.wZT = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56521);
          paramInt = i;
          break;
        case 3:
          localceg.jBB = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56521);
          paramInt = i;
          break;
        case 4:
          localceg.lvg = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56521);
          paramInt = i;
          break;
        case 5:
          localceg.wZU = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(56521);
          paramInt = i;
          break;
        case 6:
          localceg.xbw = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(56521);
          paramInt = i;
          break;
        case 7:
          localceg.xbx = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56521);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(56521);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.ceg
 * JD-Core Version:    0.6.2
 */