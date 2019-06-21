package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class qi extends bsr
{
  public String nuL;
  public String pbn;
  public String vXt;
  public String vXu;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(48814);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      if (this.vXt != null)
        paramArrayOfObject.e(2, this.vXt);
      if (this.vXu != null)
        paramArrayOfObject.e(3, this.vXu);
      if (this.nuL != null)
        paramArrayOfObject.e(4, this.nuL);
      if (this.pbn != null)
        paramArrayOfObject.e(5, this.pbn);
      AppMethodBeat.o(48814);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label576;
    label576: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.vXt != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.vXt);
      paramInt = i;
      if (this.vXu != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.vXu);
      i = paramInt;
      if (this.nuL != null)
        i = paramInt + e.a.a.b.b.a.f(4, this.nuL);
      paramInt = i;
      if (this.pbn != null)
        paramInt = i + e.a.a.b.b.a.f(5, this.pbn);
      AppMethodBeat.o(48814);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(48814);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        qi localqi = (qi)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(48814);
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
            localqi.BaseRequest = ((hl)localObject1);
          }
          AppMethodBeat.o(48814);
          paramInt = i;
          break;
        case 2:
          localqi.vXt = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48814);
          paramInt = i;
          break;
        case 3:
          localqi.vXu = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48814);
          paramInt = i;
          break;
        case 4:
          localqi.nuL = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48814);
          paramInt = i;
          break;
        case 5:
          localqi.pbn = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48814);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(48814);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.qi
 * JD-Core Version:    0.6.2
 */