package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class arj extends bsr
{
  public int boZ;
  public int condition;
  public int wvs;
  public int wvt;
  public int wvu;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(96246);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(2, this.boZ);
      paramArrayOfObject.iz(3, this.condition);
      paramArrayOfObject.iz(4, this.wvs);
      paramArrayOfObject.iz(5, this.wvt);
      paramArrayOfObject.iz(6, this.wvu);
      AppMethodBeat.o(96246);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label555;
    label555: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      paramInt = paramInt + e.a.a.b.b.a.bs(2, this.boZ) + e.a.a.b.b.a.bs(3, this.condition) + e.a.a.b.b.a.bs(4, this.wvs) + e.a.a.b.b.a.bs(5, this.wvt) + e.a.a.b.b.a.bs(6, this.wvu);
      AppMethodBeat.o(96246);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(96246);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        arj localarj = (arj)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(96246);
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
            localarj.BaseRequest = ((hl)localObject1);
          }
          AppMethodBeat.o(96246);
          paramInt = i;
          break;
        case 2:
          localarj.boZ = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(96246);
          paramInt = i;
          break;
        case 3:
          localarj.condition = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(96246);
          paramInt = i;
          break;
        case 4:
          localarj.wvs = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(96246);
          paramInt = i;
          break;
        case 5:
          localarj.wvt = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(96246);
          paramInt = i;
          break;
        case 6:
          localarj.wvu = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(96246);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(96246);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.arj
 * JD-Core Version:    0.6.2
 */