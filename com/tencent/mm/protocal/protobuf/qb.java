package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class qb extends bsr
{
  public String vXe;
  public String vXf;
  public boolean vXg;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(94514);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      if (this.vXe != null)
        paramArrayOfObject.e(2, this.vXe);
      if (this.vXf != null)
        paramArrayOfObject.e(3, this.vXf);
      paramArrayOfObject.aO(4, this.vXg);
      AppMethodBeat.o(94514);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label497;
    label497: for (i = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.vXe != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.vXe);
      i = paramInt;
      if (this.vXf != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.vXf);
      paramInt = i + (e.a.a.b.b.a.fv(4) + 1);
      AppMethodBeat.o(94514);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(94514);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        qb localqb = (qb)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(94514);
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
            localqb.BaseRequest = ((hl)localObject1);
          }
          AppMethodBeat.o(94514);
          paramInt = i;
          break;
        case 2:
          localqb.vXe = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(94514);
          paramInt = i;
          break;
        case 3:
          localqb.vXf = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(94514);
          paramInt = i;
          break;
        case 4:
          localqb.vXg = ((e.a.a.a.a)localObject1).BTU.ehX();
          AppMethodBeat.o(94514);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(94514);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.qb
 * JD-Core Version:    0.6.2
 */