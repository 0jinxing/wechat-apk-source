package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class pm extends bsr
{
  public String cBT;
  public int nUf;
  public String vFc;
  public String vWF;
  public String vWG;
  public String vWI;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(48797);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      if (this.cBT != null)
        paramArrayOfObject.e(2, this.cBT);
      if (this.vWI != null)
        paramArrayOfObject.e(3, this.vWI);
      if (this.vFc != null)
        paramArrayOfObject.e(4, this.vFc);
      paramArrayOfObject.iz(5, this.nUf);
      if (this.vWG != null)
        paramArrayOfObject.e(6, this.vWG);
      if (this.vWF != null)
        paramArrayOfObject.e(7, this.vWF);
      AppMethodBeat.o(48797);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label694;
    label694: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.cBT != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.cBT);
      paramInt = i;
      if (this.vWI != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.vWI);
      i = paramInt;
      if (this.vFc != null)
        i = paramInt + e.a.a.b.b.a.f(4, this.vFc);
      i += e.a.a.b.b.a.bs(5, this.nUf);
      paramInt = i;
      if (this.vWG != null)
        paramInt = i + e.a.a.b.b.a.f(6, this.vWG);
      i = paramInt;
      if (this.vWF != null)
        i = paramInt + e.a.a.b.b.a.f(7, this.vWF);
      AppMethodBeat.o(48797);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(48797);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        pm localpm = (pm)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(48797);
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
            localpm.BaseRequest = ((hl)localObject1);
          }
          AppMethodBeat.o(48797);
          paramInt = i;
          break;
        case 2:
          localpm.cBT = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48797);
          paramInt = i;
          break;
        case 3:
          localpm.vWI = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48797);
          paramInt = i;
          break;
        case 4:
          localpm.vFc = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48797);
          paramInt = i;
          break;
        case 5:
          localpm.nUf = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(48797);
          paramInt = i;
          break;
        case 6:
          localpm.vWG = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48797);
          paramInt = i;
          break;
        case 7:
          localpm.vWF = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48797);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(48797);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.pm
 * JD-Core Version:    0.6.2
 */