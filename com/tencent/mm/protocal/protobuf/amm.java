package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class amm extends bsr
{
  public String cuH;
  public String cxb;
  public String mvO;
  public String mvP;
  public String mvQ;
  public String vAN;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(28458);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      if (this.cuH != null)
        paramArrayOfObject.e(2, this.cuH);
      if (this.mvO != null)
        paramArrayOfObject.e(3, this.mvO);
      if (this.mvP != null)
        paramArrayOfObject.e(4, this.mvP);
      if (this.mvQ != null)
        paramArrayOfObject.e(5, this.mvQ);
      if (this.cxb != null)
        paramArrayOfObject.e(6, this.cxb);
      if (this.vAN != null)
        paramArrayOfObject.e(7, this.vAN);
      AppMethodBeat.o(28458);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label727;
    label727: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.cuH != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.cuH);
      paramInt = i;
      if (this.mvO != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.mvO);
      int j = paramInt;
      if (this.mvP != null)
        j = paramInt + e.a.a.b.b.a.f(4, this.mvP);
      i = j;
      if (this.mvQ != null)
        i = j + e.a.a.b.b.a.f(5, this.mvQ);
      paramInt = i;
      if (this.cxb != null)
        paramInt = i + e.a.a.b.b.a.f(6, this.cxb);
      i = paramInt;
      if (this.vAN != null)
        i = paramInt + e.a.a.b.b.a.f(7, this.vAN);
      AppMethodBeat.o(28458);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(28458);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        amm localamm = (amm)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(28458);
          break;
        case 1:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new hl();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((hl)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localamm.BaseRequest = ((hl)localObject1);
          }
          AppMethodBeat.o(28458);
          paramInt = i;
          break;
        case 2:
          localamm.cuH = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28458);
          paramInt = i;
          break;
        case 3:
          localamm.mvO = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28458);
          paramInt = i;
          break;
        case 4:
          localamm.mvP = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28458);
          paramInt = i;
          break;
        case 5:
          localamm.mvQ = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28458);
          paramInt = i;
          break;
        case 6:
          localamm.cxb = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28458);
          paramInt = i;
          break;
        case 7:
          localamm.vAN = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28458);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(28458);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.amm
 * JD-Core Version:    0.6.2
 */