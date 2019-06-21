package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bt.b;
import java.util.LinkedList;

public final class anm extends bsr
{
  public float cEB;
  public float cGm;
  public long rUb;
  public int wsn;
  public LinkedList<b> wso;

  public anm()
  {
    AppMethodBeat.i(108894);
    this.wso = new LinkedList();
    AppMethodBeat.o(108894);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(108895);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(2, this.wsn);
      paramArrayOfObject.r(3, this.cEB);
      paramArrayOfObject.r(4, this.cGm);
      paramArrayOfObject.e(5, 6, this.wso);
      paramArrayOfObject.ai(6, this.rUb);
      AppMethodBeat.o(108895);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label573;
    label573: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      paramInt = paramInt + e.a.a.b.b.a.bs(2, this.wsn) + (e.a.a.b.b.a.fv(3) + 4) + (e.a.a.b.b.a.fv(4) + 4) + e.a.a.a.c(5, 6, this.wso) + e.a.a.b.b.a.o(6, this.rUb);
      AppMethodBeat.o(108895);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.wso.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(108895);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        anm localanm = (anm)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(108895);
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
            localanm.BaseRequest = ((hl)localObject1);
          }
          AppMethodBeat.o(108895);
          paramInt = i;
          break;
        case 2:
          localanm.wsn = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(108895);
          paramInt = i;
          break;
        case 3:
          localanm.cEB = Float.intBitsToFloat(((e.a.a.a.a)localObject1).BTU.eia());
          AppMethodBeat.o(108895);
          paramInt = i;
          break;
        case 4:
          localanm.cGm = Float.intBitsToFloat(((e.a.a.a.a)localObject1).BTU.eia());
          AppMethodBeat.o(108895);
          paramInt = i;
          break;
        case 5:
          localanm.wso.add(((e.a.a.a.a)localObject1).BTU.emu());
          AppMethodBeat.o(108895);
          paramInt = i;
          break;
        case 6:
          localanm.rUb = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(108895);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(108895);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.anm
 * JD-Core Version:    0.6.2
 */