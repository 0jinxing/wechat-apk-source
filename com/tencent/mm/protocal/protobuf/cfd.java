package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class cfd extends bsr
{
  public String jBB;
  public String vEf;
  public int vFH;
  public String wZT;
  public long wZU;
  public long xbw;
  public int xbx;
  public long xeF;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(56548);
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
      paramArrayOfObject.ai(4, this.wZU);
      paramArrayOfObject.ai(5, this.xbw);
      paramArrayOfObject.iz(6, this.xbx);
      paramArrayOfObject.ai(7, this.xeF);
      paramArrayOfObject.iz(8, this.vFH);
      if (this.vEf != null)
        paramArrayOfObject.e(9, this.vEf);
      AppMethodBeat.o(56548);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label748;
    label748: for (i = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.wZT != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.wZT);
      i = paramInt;
      if (this.jBB != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.jBB);
      i = i + e.a.a.b.b.a.o(4, this.wZU) + e.a.a.b.b.a.o(5, this.xbw) + e.a.a.b.b.a.bs(6, this.xbx) + e.a.a.b.b.a.o(7, this.xeF) + e.a.a.b.b.a.bs(8, this.vFH);
      paramInt = i;
      if (this.vEf != null)
        paramInt = i + e.a.a.b.b.a.f(9, this.vEf);
      AppMethodBeat.o(56548);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(56548);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        cfd localcfd = (cfd)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(56548);
          break;
        case 1:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new hl();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((hl)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcfd.BaseRequest = ((hl)localObject1);
          }
          AppMethodBeat.o(56548);
          paramInt = i;
          break;
        case 2:
          localcfd.wZT = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56548);
          paramInt = i;
          break;
        case 3:
          localcfd.jBB = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56548);
          paramInt = i;
          break;
        case 4:
          localcfd.wZU = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(56548);
          paramInt = i;
          break;
        case 5:
          localcfd.xbw = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(56548);
          paramInt = i;
          break;
        case 6:
          localcfd.xbx = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56548);
          paramInt = i;
          break;
        case 7:
          localcfd.xeF = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(56548);
          paramInt = i;
          break;
        case 8:
          localcfd.vFH = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56548);
          paramInt = i;
          break;
        case 9:
          localcfd.vEf = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56548);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(56548);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cfd
 * JD-Core Version:    0.6.2
 */