package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class ee extends btd
{
  public int enabled;
  public int kKI;
  public LinkedList<kl> vFR;
  public boolean vFS;
  public int vFT;

  public ee()
  {
    AppMethodBeat.i(14687);
    this.vFR = new LinkedList();
    AppMethodBeat.o(14687);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(14688);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(14688);
        throw paramArrayOfObject;
      }
      if (this.BaseResponse != null)
      {
        paramArrayOfObject.iy(1, this.BaseResponse.computeSize());
        this.BaseResponse.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.e(2, 8, this.vFR);
      paramArrayOfObject.aO(3, this.vFS);
      paramArrayOfObject.iz(4, this.vFT);
      paramArrayOfObject.iz(5, this.enabled);
      paramArrayOfObject.iz(6, this.kKI);
      AppMethodBeat.o(14688);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label712;
    label712: for (paramInt = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; paramInt = 0)
    {
      paramInt = paramInt + e.a.a.a.c(2, 8, this.vFR) + (e.a.a.b.b.a.fv(3) + 1) + e.a.a.b.b.a.bs(4, this.vFT) + e.a.a.b.b.a.bs(5, this.enabled) + e.a.a.b.b.a.bs(6, this.kKI);
      AppMethodBeat.o(14688);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.vFR.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = btd.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = btd.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.BaseResponse == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
          AppMethodBeat.o(14688);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(14688);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        ee localee = (ee)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(14688);
          break;
        case 1:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new BaseResponse();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((BaseResponse)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localee.BaseResponse = ((BaseResponse)localObject1);
          }
          AppMethodBeat.o(14688);
          paramInt = i;
          break;
        case 2:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new kl();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((kl)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localee.vFR.add(localObject1);
          }
          AppMethodBeat.o(14688);
          paramInt = i;
          break;
        case 3:
          localee.vFS = ((e.a.a.a.a)localObject1).BTU.ehX();
          AppMethodBeat.o(14688);
          paramInt = i;
          break;
        case 4:
          localee.vFT = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(14688);
          paramInt = i;
          break;
        case 5:
          localee.enabled = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(14688);
          paramInt = i;
          break;
        case 6:
          localee.kKI = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(14688);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(14688);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.ee
 * JD-Core Version:    0.6.2
 */