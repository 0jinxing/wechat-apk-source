package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class axo extends bsr
{
  public int cvd;
  public String query;
  public String wBx;
  public String wBy;
  public String wBz;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(114976);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      if (this.wBx != null)
        paramArrayOfObject.e(2, this.wBx);
      if (this.query != null)
        paramArrayOfObject.e(3, this.query);
      if (this.wBy != null)
        paramArrayOfObject.e(4, this.wBy);
      if (this.wBz != null)
        paramArrayOfObject.e(5, this.wBz);
      paramArrayOfObject.iz(6, this.cvd);
      AppMethodBeat.o(114976);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label627;
    label627: for (i = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.wBx != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.wBx);
      i = paramInt;
      if (this.query != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.query);
      paramInt = i;
      if (this.wBy != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.wBy);
      i = paramInt;
      if (this.wBz != null)
        i = paramInt + e.a.a.b.b.a.f(5, this.wBz);
      paramInt = i + e.a.a.b.b.a.bs(6, this.cvd);
      AppMethodBeat.o(114976);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(114976);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        axo localaxo = (axo)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(114976);
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
            localaxo.BaseRequest = ((hl)localObject1);
          }
          AppMethodBeat.o(114976);
          paramInt = i;
          break;
        case 2:
          localaxo.wBx = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(114976);
          paramInt = i;
          break;
        case 3:
          localaxo.query = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(114976);
          paramInt = i;
          break;
        case 4:
          localaxo.wBy = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(114976);
          paramInt = i;
          break;
        case 5:
          localaxo.wBz = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(114976);
          paramInt = i;
          break;
        case 6:
          localaxo.cvd = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(114976);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(114976);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.axo
 * JD-Core Version:    0.6.2
 */